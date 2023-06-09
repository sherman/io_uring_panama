// Generated by jextract

package org.sherman.liburing;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct io_uring_rsrc_update2 {
 *     __u32 offset;
 *     __u32 resv;
 *     __u64 data;
 *     __u64 tags;
 *     __u32 nr;
 *     __u32 resv2;
 * };
 * }
 */
public class io_uring_rsrc_update2 {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_INT$LAYOUT.withName("offset"),
        Constants$root.C_INT$LAYOUT.withName("resv"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("data"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("tags"),
        Constants$root.C_INT$LAYOUT.withName("nr"),
        Constants$root.C_INT$LAYOUT.withName("resv2")
    ).withName("io_uring_rsrc_update2");
    public static MemoryLayout $LAYOUT() {
        return io_uring_rsrc_update2.$struct$LAYOUT;
    }
    static final VarHandle offset$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("offset"));
    public static VarHandle offset$VH() {
        return io_uring_rsrc_update2.offset$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * __u32 offset;
     * }
     */
    public static int offset$get(MemorySegment seg) {
        return (int)io_uring_rsrc_update2.offset$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * __u32 offset;
     * }
     */
    public static void offset$set(MemorySegment seg, int x) {
        io_uring_rsrc_update2.offset$VH.set(seg, x);
    }
    public static int offset$get(MemorySegment seg, long index) {
        return (int)io_uring_rsrc_update2.offset$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void offset$set(MemorySegment seg, long index, int x) {
        io_uring_rsrc_update2.offset$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle resv$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("resv"));
    public static VarHandle resv$VH() {
        return io_uring_rsrc_update2.resv$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * __u32 resv;
     * }
     */
    public static int resv$get(MemorySegment seg) {
        return (int)io_uring_rsrc_update2.resv$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * __u32 resv;
     * }
     */
    public static void resv$set(MemorySegment seg, int x) {
        io_uring_rsrc_update2.resv$VH.set(seg, x);
    }
    public static int resv$get(MemorySegment seg, long index) {
        return (int)io_uring_rsrc_update2.resv$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void resv$set(MemorySegment seg, long index, int x) {
        io_uring_rsrc_update2.resv$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle data$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("data"));
    public static VarHandle data$VH() {
        return io_uring_rsrc_update2.data$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * __u64 data;
     * }
     */
    public static long data$get(MemorySegment seg) {
        return (long)io_uring_rsrc_update2.data$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * __u64 data;
     * }
     */
    public static void data$set(MemorySegment seg, long x) {
        io_uring_rsrc_update2.data$VH.set(seg, x);
    }
    public static long data$get(MemorySegment seg, long index) {
        return (long)io_uring_rsrc_update2.data$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void data$set(MemorySegment seg, long index, long x) {
        io_uring_rsrc_update2.data$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle tags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("tags"));
    public static VarHandle tags$VH() {
        return io_uring_rsrc_update2.tags$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * __u64 tags;
     * }
     */
    public static long tags$get(MemorySegment seg) {
        return (long)io_uring_rsrc_update2.tags$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * __u64 tags;
     * }
     */
    public static void tags$set(MemorySegment seg, long x) {
        io_uring_rsrc_update2.tags$VH.set(seg, x);
    }
    public static long tags$get(MemorySegment seg, long index) {
        return (long)io_uring_rsrc_update2.tags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void tags$set(MemorySegment seg, long index, long x) {
        io_uring_rsrc_update2.tags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle nr$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("nr"));
    public static VarHandle nr$VH() {
        return io_uring_rsrc_update2.nr$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * __u32 nr;
     * }
     */
    public static int nr$get(MemorySegment seg) {
        return (int)io_uring_rsrc_update2.nr$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * __u32 nr;
     * }
     */
    public static void nr$set(MemorySegment seg, int x) {
        io_uring_rsrc_update2.nr$VH.set(seg, x);
    }
    public static int nr$get(MemorySegment seg, long index) {
        return (int)io_uring_rsrc_update2.nr$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void nr$set(MemorySegment seg, long index, int x) {
        io_uring_rsrc_update2.nr$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle resv2$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("resv2"));
    public static VarHandle resv2$VH() {
        return io_uring_rsrc_update2.resv2$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * __u32 resv2;
     * }
     */
    public static int resv2$get(MemorySegment seg) {
        return (int)io_uring_rsrc_update2.resv2$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * __u32 resv2;
     * }
     */
    public static void resv2$set(MemorySegment seg, int x) {
        io_uring_rsrc_update2.resv2$VH.set(seg, x);
    }
    public static int resv2$get(MemorySegment seg, long index) {
        return (int)io_uring_rsrc_update2.resv2$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void resv2$set(MemorySegment seg, long index, int x) {
        io_uring_rsrc_update2.resv2$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


