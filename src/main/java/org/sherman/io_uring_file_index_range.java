// Generated by jextract

package org.sherman;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct io_uring_file_index_range {
 *     __u32 off;
 *     __u32 len;
 *     __u64 resv;
 * };
 * }
 */
public class io_uring_file_index_range {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_INT$LAYOUT.withName("off"),
        Constants$root.C_INT$LAYOUT.withName("len"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("resv")
    ).withName("io_uring_file_index_range");
    public static MemoryLayout $LAYOUT() {
        return io_uring_file_index_range.$struct$LAYOUT;
    }
    static final VarHandle off$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("off"));
    public static VarHandle off$VH() {
        return io_uring_file_index_range.off$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * __u32 off;
     * }
     */
    public static int off$get(MemorySegment seg) {
        return (int)io_uring_file_index_range.off$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * __u32 off;
     * }
     */
    public static void off$set(MemorySegment seg, int x) {
        io_uring_file_index_range.off$VH.set(seg, x);
    }
    public static int off$get(MemorySegment seg, long index) {
        return (int)io_uring_file_index_range.off$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void off$set(MemorySegment seg, long index, int x) {
        io_uring_file_index_range.off$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle len$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("len"));
    public static VarHandle len$VH() {
        return io_uring_file_index_range.len$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * __u32 len;
     * }
     */
    public static int len$get(MemorySegment seg) {
        return (int)io_uring_file_index_range.len$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * __u32 len;
     * }
     */
    public static void len$set(MemorySegment seg, int x) {
        io_uring_file_index_range.len$VH.set(seg, x);
    }
    public static int len$get(MemorySegment seg, long index) {
        return (int)io_uring_file_index_range.len$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void len$set(MemorySegment seg, long index, int x) {
        io_uring_file_index_range.len$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle resv$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("resv"));
    public static VarHandle resv$VH() {
        return io_uring_file_index_range.resv$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * __u64 resv;
     * }
     */
    public static long resv$get(MemorySegment seg) {
        return (long)io_uring_file_index_range.resv$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * __u64 resv;
     * }
     */
    public static void resv$set(MemorySegment seg, long x) {
        io_uring_file_index_range.resv$VH.set(seg, x);
    }
    public static long resv$get(MemorySegment seg, long index) {
        return (long)io_uring_file_index_range.resv$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void resv$set(MemorySegment seg, long index, long x) {
        io_uring_file_index_range.resv$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


