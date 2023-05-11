// Generated by jextract

package org.sherman.liburing;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * union sigval {
 *     int sival_int;
 *     void* sival_ptr;
 * };
 * }
 */
public class sigval {

    static final UnionLayout $union$LAYOUT = MemoryLayout.unionLayout(
        Constants$root.C_INT$LAYOUT.withName("sival_int"),
        Constants$root.C_POINTER$LAYOUT.withName("sival_ptr")
    ).withName("sigval");
    public static MemoryLayout $LAYOUT() {
        return sigval.$union$LAYOUT;
    }
    static final VarHandle sival_int$VH = $union$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("sival_int"));
    public static VarHandle sival_int$VH() {
        return sigval.sival_int$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int sival_int;
     * }
     */
    public static int sival_int$get(MemorySegment seg) {
        return (int)sigval.sival_int$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int sival_int;
     * }
     */
    public static void sival_int$set(MemorySegment seg, int x) {
        sigval.sival_int$VH.set(seg, x);
    }
    public static int sival_int$get(MemorySegment seg, long index) {
        return (int)sigval.sival_int$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void sival_int$set(MemorySegment seg, long index, int x) {
        sigval.sival_int$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle sival_ptr$VH = $union$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("sival_ptr"));
    public static VarHandle sival_ptr$VH() {
        return sigval.sival_ptr$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void* sival_ptr;
     * }
     */
    public static MemorySegment sival_ptr$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)sigval.sival_ptr$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void* sival_ptr;
     * }
     */
    public static void sival_ptr$set(MemorySegment seg, MemorySegment x) {
        sigval.sival_ptr$VH.set(seg, x);
    }
    public static MemorySegment sival_ptr$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)sigval.sival_ptr$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void sival_ptr$set(MemorySegment seg, long index, MemorySegment x) {
        sigval.sival_ptr$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


