// Generated by jextract

package org.sherman;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct statx_timestamp {
 *     __s64 tv_sec;
 *     __u32 tv_nsec;
 *     __s32 __reserved;
 * };
 * }
 */
public class statx_timestamp {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG_LONG$LAYOUT.withName("tv_sec"),
        Constants$root.C_INT$LAYOUT.withName("tv_nsec"),
        Constants$root.C_INT$LAYOUT.withName("__reserved")
    ).withName("statx_timestamp");
    public static MemoryLayout $LAYOUT() {
        return statx_timestamp.$struct$LAYOUT;
    }
    static final VarHandle tv_sec$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("tv_sec"));
    public static VarHandle tv_sec$VH() {
        return statx_timestamp.tv_sec$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * __s64 tv_sec;
     * }
     */
    public static long tv_sec$get(MemorySegment seg) {
        return (long)statx_timestamp.tv_sec$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * __s64 tv_sec;
     * }
     */
    public static void tv_sec$set(MemorySegment seg, long x) {
        statx_timestamp.tv_sec$VH.set(seg, x);
    }
    public static long tv_sec$get(MemorySegment seg, long index) {
        return (long)statx_timestamp.tv_sec$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void tv_sec$set(MemorySegment seg, long index, long x) {
        statx_timestamp.tv_sec$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle tv_nsec$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("tv_nsec"));
    public static VarHandle tv_nsec$VH() {
        return statx_timestamp.tv_nsec$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * __u32 tv_nsec;
     * }
     */
    public static int tv_nsec$get(MemorySegment seg) {
        return (int)statx_timestamp.tv_nsec$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * __u32 tv_nsec;
     * }
     */
    public static void tv_nsec$set(MemorySegment seg, int x) {
        statx_timestamp.tv_nsec$VH.set(seg, x);
    }
    public static int tv_nsec$get(MemorySegment seg, long index) {
        return (int)statx_timestamp.tv_nsec$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void tv_nsec$set(MemorySegment seg, long index, int x) {
        statx_timestamp.tv_nsec$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle __reserved$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("__reserved"));
    public static VarHandle __reserved$VH() {
        return statx_timestamp.__reserved$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * __s32 __reserved;
     * }
     */
    public static int __reserved$get(MemorySegment seg) {
        return (int)statx_timestamp.__reserved$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * __s32 __reserved;
     * }
     */
    public static void __reserved$set(MemorySegment seg, int x) {
        statx_timestamp.__reserved$VH.set(seg, x);
    }
    public static int __reserved$get(MemorySegment seg, long index) {
        return (int)statx_timestamp.__reserved$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void __reserved$set(MemorySegment seg, long index, int x) {
        statx_timestamp.__reserved$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


