// Generated by jextract

package org.sherman.liburing;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct io_uring_buf_ring {
 *     union {
 *         struct {
 *             __u64 resv1;
 *             __u32 resv2;
 *             __u16 resv3;
 *             __u16 tail;
 *         };
 *         struct io_uring_buf bufs[0];
 *     };
 * };
 * }
 */
public class io_uring_buf_ring {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                Constants$root.C_LONG_LONG$LAYOUT.withName("resv1"),
                Constants$root.C_INT$LAYOUT.withName("resv2"),
                Constants$root.C_SHORT$LAYOUT.withName("resv3"),
                Constants$root.C_SHORT$LAYOUT.withName("tail")
            ).withName("$anon$0"),
            MemoryLayout.sequenceLayout(0, MemoryLayout.structLayout(
                Constants$root.C_LONG_LONG$LAYOUT.withName("addr"),
                Constants$root.C_INT$LAYOUT.withName("len"),
                Constants$root.C_SHORT$LAYOUT.withName("bid"),
                Constants$root.C_SHORT$LAYOUT.withName("resv")
            ).withName("io_uring_buf")).withName("bufs")
        ).withName("$anon$0")
    ).withName("io_uring_buf_ring");
    public static MemoryLayout $LAYOUT() {
        return io_uring_buf_ring.$struct$LAYOUT;
    }
    static final VarHandle resv1$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("resv1"));
    public static VarHandle resv1$VH() {
        return io_uring_buf_ring.resv1$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * __u64 resv1;
     * }
     */
    public static long resv1$get(MemorySegment seg) {
        return (long)io_uring_buf_ring.resv1$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * __u64 resv1;
     * }
     */
    public static void resv1$set(MemorySegment seg, long x) {
        io_uring_buf_ring.resv1$VH.set(seg, x);
    }
    public static long resv1$get(MemorySegment seg, long index) {
        return (long)io_uring_buf_ring.resv1$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void resv1$set(MemorySegment seg, long index, long x) {
        io_uring_buf_ring.resv1$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle resv2$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("resv2"));
    public static VarHandle resv2$VH() {
        return io_uring_buf_ring.resv2$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * __u32 resv2;
     * }
     */
    public static int resv2$get(MemorySegment seg) {
        return (int)io_uring_buf_ring.resv2$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * __u32 resv2;
     * }
     */
    public static void resv2$set(MemorySegment seg, int x) {
        io_uring_buf_ring.resv2$VH.set(seg, x);
    }
    public static int resv2$get(MemorySegment seg, long index) {
        return (int)io_uring_buf_ring.resv2$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void resv2$set(MemorySegment seg, long index, int x) {
        io_uring_buf_ring.resv2$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle resv3$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("resv3"));
    public static VarHandle resv3$VH() {
        return io_uring_buf_ring.resv3$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * __u16 resv3;
     * }
     */
    public static short resv3$get(MemorySegment seg) {
        return (short)io_uring_buf_ring.resv3$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * __u16 resv3;
     * }
     */
    public static void resv3$set(MemorySegment seg, short x) {
        io_uring_buf_ring.resv3$VH.set(seg, x);
    }
    public static short resv3$get(MemorySegment seg, long index) {
        return (short)io_uring_buf_ring.resv3$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void resv3$set(MemorySegment seg, long index, short x) {
        io_uring_buf_ring.resv3$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle tail$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("tail"));
    public static VarHandle tail$VH() {
        return io_uring_buf_ring.tail$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * __u16 tail;
     * }
     */
    public static short tail$get(MemorySegment seg) {
        return (short)io_uring_buf_ring.tail$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * __u16 tail;
     * }
     */
    public static void tail$set(MemorySegment seg, short x) {
        io_uring_buf_ring.tail$VH.set(seg, x);
    }
    public static short tail$get(MemorySegment seg, long index) {
        return (short)io_uring_buf_ring.tail$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void tail$set(MemorySegment seg, long index, short x) {
        io_uring_buf_ring.tail$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


