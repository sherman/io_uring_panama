package org.sherman;

import java.lang.foreign.Linker;
import java.lang.foreign.SymbolLookup;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import org.junit.jupiter.api.Test;
import org.sherman.uring.IOUring;
import org.sherman.uring.NativeLibrary;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class IOUringTest {
    private static final Logger logger = LoggerFactory.getLogger(IOUringTest.class);

    private static final SymbolLookup SYMBOL_LOOKUP;
    private static final Linker LINKER = Linker.nativeLinker();

    static {
        if (!NativeLibrary.IS_SUPPORTED) {
            throw new IllegalArgumentException("Native lib is not supported!");
        }

        SymbolLookup loaderLookup = SymbolLookup.loaderLookup();
        SYMBOL_LOOKUP = name -> loaderLookup.find(name).or(() -> LINKER.defaultLookup().find(name));
    }

    @Test
    public void createIOUring() throws Exception {
        try (var uring = new IOUring(10)) {
            var barrier = new AtomicBoolean(false);
            // set up cqe queue handler (for completion of operations)
            var thread = new Thread(() -> {
                try {
                    while (!barrier.get()) {
                        uring.waitComplete(1000);
                        for (var ioOperationResult : uring.batchGetCqe(1024)) {
                            ioOperationResult.run();
                        }
                    }
                } catch (Exception e) {
                    logger.error("Loop is failed", e);
                }
            });
            thread.start();

            // create two futures
            var future1 = new CompletableFuture<Void>();
            var future2 = new CompletableFuture<Void>();

            // prepare two operation (put it to the queue)
            var result1 = uring.prepareNoOp(() -> future1.complete(null));
            var result2 = uring.prepareNoOp(() -> future2.complete(null));

            // submit two operations
            uring.submit(2);

            // check futures are done
            future1.thenAccept(v -> logger.info("no_op 1 end"))
                .get();
            future2.thenAccept(v -> logger.info("no_op 2 end"))
                .get();

            barrier.set(true);
            thread.join();
        }
    }
}
