// Generated by jextract

package org.sherman;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct {
 *     void* ss_sp;
 *     int ss_flags;
 *     size_t ss_size;
 * };
 * }
 */
public class stack_t {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("ss_sp"),
        Constants$root.C_INT$LAYOUT.withName("ss_flags"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_LONG_LONG$LAYOUT.withName("ss_size")
    );
    public static MemoryLayout $LAYOUT() {
        return stack_t.$struct$LAYOUT;
    }
    static final VarHandle ss_sp$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ss_sp"));
    public static VarHandle ss_sp$VH() {
        return stack_t.ss_sp$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void* ss_sp;
     * }
     */
    public static MemorySegment ss_sp$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)stack_t.ss_sp$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void* ss_sp;
     * }
     */
    public static void ss_sp$set(MemorySegment seg, MemorySegment x) {
        stack_t.ss_sp$VH.set(seg, x);
    }
    public static MemorySegment ss_sp$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)stack_t.ss_sp$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ss_sp$set(MemorySegment seg, long index, MemorySegment x) {
        stack_t.ss_sp$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ss_flags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ss_flags"));
    public static VarHandle ss_flags$VH() {
        return stack_t.ss_flags$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int ss_flags;
     * }
     */
    public static int ss_flags$get(MemorySegment seg) {
        return (int)stack_t.ss_flags$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int ss_flags;
     * }
     */
    public static void ss_flags$set(MemorySegment seg, int x) {
        stack_t.ss_flags$VH.set(seg, x);
    }
    public static int ss_flags$get(MemorySegment seg, long index) {
        return (int)stack_t.ss_flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ss_flags$set(MemorySegment seg, long index, int x) {
        stack_t.ss_flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ss_size$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ss_size"));
    public static VarHandle ss_size$VH() {
        return stack_t.ss_size$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * size_t ss_size;
     * }
     */
    public static long ss_size$get(MemorySegment seg) {
        return (long)stack_t.ss_size$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * size_t ss_size;
     * }
     */
    public static void ss_size$set(MemorySegment seg, long x) {
        stack_t.ss_size$VH.set(seg, x);
    }
    public static long ss_size$get(MemorySegment seg, long index) {
        return (long)stack_t.ss_size$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ss_size$set(MemorySegment seg, long index, long x) {
        stack_t.ss_size$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


