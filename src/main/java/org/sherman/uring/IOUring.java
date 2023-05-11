package org.sherman.uring;


import static org.sherman.liburing.liburing_h.C_POINTER;
import static org.sherman.liburing.liburing_h_1.IORING_CQE_BUFFER_SHIFT;
import static org.sherman.liburing.liburing_h_2.IORING_CQE_F_MORE;
import static org.sherman.liburing.liburing_h_2.IOSQE_IO_LINK;
import static org.sherman.liburing.liburing_h_2.io_uring_cqe_seen_panama;
import static org.sherman.liburing.liburing_h_2.io_uring_get_sqe;
import static org.sherman.liburing.liburing_h_2.io_uring_peek_cqe_panama;
import static org.sherman.liburing.liburing_h_2.io_uring_prep_nop_panama;
import static org.sherman.liburing.liburing_h_2.io_uring_prep_provide_buffers_panama;
import static org.sherman.liburing.liburing_h_2.io_uring_prep_remove_buffers_panama;
import static org.sherman.liburing.liburing_h_2.io_uring_queue_init;
import static org.sherman.liburing.liburing_h_2.io_uring_submit;
import static org.sherman.liburing.liburing_h_2.io_uring_wait_cqe_panama;
import static org.sherman.liburing.liburing_h_2.io_uring_wait_cqe_timeout;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;
import org.sherman.liburing.__kernel_timespec;
import org.sherman.liburing.io_uring;
import org.sherman.liburing.io_uring_cqe;
import org.sherman.liburing.io_uring_sqe;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class IOUring implements AutoCloseable {
    private static final Logger logger = LoggerFactory.getLogger(IOUring.class);
    private static final int NO_SQE = -1;
    private final int size;
    private final byte groupId;
    private MemorySegment[] buffers;

    private MemorySegment ring;

    private final Arena allocator;

    private final AtomicLong sequence = new AtomicLong();
    private final Map<Long, IOOperationResult> context = new HashMap<>();

    public IOUring(int size) {
        this.size = size;
        this.groupId = getRandomGroupId();
        this.allocator = Arena.openShared();

        this.init();
    }

    private static byte getRandomGroupId() {
        return (byte) new Random().nextInt(255);
    }

    private void init() {
        initUring();
        initBuffers();
    }

    private void initBuffers() {
        buffers = new MemorySegment[16];
        for (var i = 0; i < buffers.length; i++) {
            buffers[i] = allocator.allocate(1024);
        }

        for (var i = 0; i < buffers.length; ) {
            if (!provideBuffer(buffers[i], i)) {
                throw new IllegalStateException("Can't provide a shared buffer!");
            }
            i++;
        }

        submit(buffers.length);

        try (Arena session = Arena.openConfined()) {
            for (var i = 0; i < buffers.length; i++) {
                // allocate double pointer to cqe struct
                var cqePointer = session.allocate(C_POINTER);

                var result = io_uring_wait_cqe_panama(ring, cqePointer);
                if (result != 0) {
                    throw new IllegalStateException("Wait cqe is failed:" + result);
                }

                // get pointer to cqe struct
                var cqe = cqePointer.get(C_POINTER, 0);

                var cqeResult = io_uring_cqe.res$get(cqe);
                if (cqeResult < 0) {
                    throw new IllegalStateException("Wrong cqe result:" + cqeResult);
                }

                io_uring_cqe_seen_panama(ring, cqe);
            }
        }

        logger.info("Buffers ({}) are registered!", buffers.length);
    }

    /**
     * Submits operations in the sender queue.
     */
    @SuppressWarnings("UnusedReturnValue")
    public int submit(int expected) {
        var result = io_uring_submit(ring);

        if (result != expected) {
            throw new IllegalStateException(
                String.format("Invalid result is returned by submit operation: %s, expected: %s", result, expected)
            );
        }

        return result;
    }

    /**
     * Provides a shared buffer between user-space and kernel.
     */
    public boolean provideBuffer(MemorySegment buffer, int bid) {
        var sqe = getSqe();
        if (sqe == null) {
            return false;
        }

        io_uring_prep_provide_buffers_panama(sqe, buffer, (int) buffer.byteSize(), 1, groupId, bid);

        return true;
    }

    @SuppressWarnings("UnusedReturnValue")
    public boolean removeBuffer() {
        var sqe = getSqe();
        if (sqe == null) {
            return false;
        }

        var expected = 0;
        var left = buffers.length;
        while (left > 0) {
            int toRemove = left;
            left -= toRemove;
            io_uring_prep_remove_buffers_panama(sqe, toRemove, groupId);
            // use it later to check a number of actions (e.g. sys-calls) actually completed by io_uring
            io_uring_sqe.user_data$set(sqe, toRemove);
            // TODO: update sqe flags
            expected++;
        }

        submit(expected);

        try (Arena session = Arena.openConfined()) {
            for (; expected > 0; expected--) {
                // allocate double pointer to cqe struct
                var cqePointer = session.allocate(C_POINTER);

                var result = io_uring_wait_cqe_panama(ring, cqePointer);
                if (result != 0) {
                    throw new IllegalStateException("Wait cqe is failed:" + result);
                }

                // get pointer to cqe struct
                var cqe = cqePointer.get(C_POINTER, 0);

                var cqeResult = io_uring_cqe.res$get(cqe);
                var cqeUserData = io_uring_cqe.user_data$get(cqe);

                if (cqeResult != cqeUserData) {
                    throw new IllegalStateException("Invalid cqe res:" + cqeResult + ", user data:" + cqeUserData);
                }

                io_uring_cqe_seen_panama(ring, cqe);
            }
        }

        return true;
    }

    /**
     * Prepares no-op request.
     */
    public boolean prepareNoOp(Runnable runnable) {
        return prepareNoOpAndGetUserData(runnable) != NO_SQE;
    }


    public long prepareNoOpAndGetUserData(Runnable runnable) {
        var sqe = getSqe();
        if (sqe == null) {
            return NO_SQE;
        }
        // TODO: why we need cut segment to 64 bytes?
        var sqeSegment = MemorySegment.ofAddress(sqe.address(), io_uring_sqe.sizeof());
        var opsCount = sequence.getAndIncrement();
        io_uring_prep_nop_panama(sqeSegment);
        io_uring_sqe.user_data$set(sqeSegment, opsCount);
        context.put(opsCount, new IOOperationResult(OperationType.NO, (result, bufferId) -> runnable.run()));
        return opsCount;
    }

    private MemorySegment getSqe() {
        var sqe = io_uring_get_sqe(ring);
        io_uring_sqe.flags$set(sqe, ((byte) (io_uring_sqe.flags$get(sqe) | IOSQE_IO_LINK())));
        return sqe;
    }

    private void initUring() {
        ring = io_uring.allocate(allocator);

        // init queues
        var queueInitResult = io_uring_queue_init(size, ring, 0);
        if (queueInitResult < 0) {
            logger.error("Can't init io_uring queue: [{}]", queueInitResult);
            throw new IllegalStateException("IO uring was not initialised!");
        }
    }

    @Override
    public void close() {
        logger.info("Close");
        removeBuffer();
        allocator.close();
    }

    public void waitComplete() {
        waitComplete(-1);
    }

    public void waitComplete(long waitMs) {
        try (Arena session = Arena.openConfined()) {
            var cqePointer = session.allocate(C_POINTER.byteSize());
            if (waitMs == -1) {
                io_uring_wait_cqe_panama(ring, cqePointer);
                return;
            }

            var ts = __kernel_timespec.allocate(session);
            __kernel_timespec.tv_sec$set(ts, waitMs / 1000);
            __kernel_timespec.tv_nsec$set(ts, (waitMs % 1000) * 1000000);
            io_uring_wait_cqe_timeout(ring, cqePointer, ts);
        }
    }

    // FIXME: rewrite it completely
    public List<IOOperationResult> batchGetCqe(int max) {
        try (Arena session = Arena.openConfined()) {
            var cqePointer = session.allocate(C_POINTER.byteSize());
            var count = 0;
            var results = new ArrayList<IOOperationResult>();
            while (count <= max && io_uring_peek_cqe_panama(ring, cqePointer) == 0) {
                // get pointer to cqe struct
                var cqe = cqePointer.get(C_POINTER, 0);
                var opsCount = io_uring_cqe.user_data$get(cqe);
                if (opsCount < 0) {
                    io_uring_cqe_seen_panama(ring, cqe);
                    continue;
                }
                var flags = io_uring_cqe.flags$get(cqe);
                var isMultiOp = (flags & IORING_CQE_F_MORE()) != 0;
                var result = isMultiOp ? context.get(opsCount) : context.remove(opsCount);
                if (result == null) {
                    logger.error("No result for operation:" + opsCount);
                    io_uring_cqe_seen_panama(ring, cqe);
                    continue;
                }
                result.flags = flags;
                result.userData = opsCount;
                result.result = io_uring_cqe.res$get(cqe);
                result.bufferId = flags >> IORING_CQE_BUFFER_SHIFT();
                io_uring_cqe_seen_panama(ring, cqe);
                results.add(result);
            }
            return results;
        }
    }
}
