// Generated by jextract

package org.sherman.liburing;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * union {
 *     struct __pthread_cond_s __data;
 *     char __size[48];
 *     long long __align;
 * };
 * }
 */
public class pthread_cond_t {

    static final UnionLayout $union$LAYOUT = MemoryLayout.unionLayout(
        MemoryLayout.structLayout(
            MemoryLayout.unionLayout(
                Constants$root.C_LONG_LONG$LAYOUT.withName("__value64"),
                MemoryLayout.structLayout(
                    Constants$root.C_INT$LAYOUT.withName("__low"),
                    Constants$root.C_INT$LAYOUT.withName("__high")
                ).withName("__value32")
            ).withName("__wseq"),
            MemoryLayout.unionLayout(
                Constants$root.C_LONG_LONG$LAYOUT.withName("__value64"),
                MemoryLayout.structLayout(
                    Constants$root.C_INT$LAYOUT.withName("__low"),
                    Constants$root.C_INT$LAYOUT.withName("__high")
                ).withName("__value32")
            ).withName("__g1_start"),
            MemoryLayout.sequenceLayout(2, Constants$root.C_INT$LAYOUT).withName("__g_refs"),
            MemoryLayout.sequenceLayout(2, Constants$root.C_INT$LAYOUT).withName("__g_size"),
            Constants$root.C_INT$LAYOUT.withName("__g1_orig_size"),
            Constants$root.C_INT$LAYOUT.withName("__wrefs"),
            MemoryLayout.sequenceLayout(2, Constants$root.C_INT$LAYOUT).withName("__g_signals")
        ).withName("__data"),
        MemoryLayout.sequenceLayout(48, Constants$root.C_CHAR$LAYOUT).withName("__size"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("__align")
    );
    public static MemoryLayout $LAYOUT() {
        return pthread_cond_t.$union$LAYOUT;
    }
    public static MemorySegment __data$slice(MemorySegment seg) {
        return seg.asSlice(0, 48);
    }
    public static MemorySegment __size$slice(MemorySegment seg) {
        return seg.asSlice(0, 48);
    }
    static final VarHandle __align$VH = $union$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("__align"));
    public static VarHandle __align$VH() {
        return pthread_cond_t.__align$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * long long __align;
     * }
     */
    public static long __align$get(MemorySegment seg) {
        return (long)pthread_cond_t.__align$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * long long __align;
     * }
     */
    public static void __align$set(MemorySegment seg, long x) {
        pthread_cond_t.__align$VH.set(seg, x);
    }
    public static long __align$get(MemorySegment seg, long index) {
        return (long)pthread_cond_t.__align$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void __align$set(MemorySegment seg, long index, long x) {
        pthread_cond_t.__align$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


