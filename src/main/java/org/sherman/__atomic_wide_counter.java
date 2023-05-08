// Generated by jextract

package org.sherman;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * union {
 *     unsigned long long __value64;
 *     struct  __value32;
 * };
 * }
 */
public class __atomic_wide_counter {

    static final UnionLayout $union$LAYOUT = MemoryLayout.unionLayout(
        Constants$root.C_LONG_LONG$LAYOUT.withName("__value64"),
        MemoryLayout.structLayout(
            Constants$root.C_INT$LAYOUT.withName("__low"),
            Constants$root.C_INT$LAYOUT.withName("__high")
        ).withName("__value32")
    );
    public static MemoryLayout $LAYOUT() {
        return __atomic_wide_counter.$union$LAYOUT;
    }
    static final VarHandle __value64$VH = $union$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("__value64"));
    public static VarHandle __value64$VH() {
        return __atomic_wide_counter.__value64$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned long long __value64;
     * }
     */
    public static long __value64$get(MemorySegment seg) {
        return (long)__atomic_wide_counter.__value64$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned long long __value64;
     * }
     */
    public static void __value64$set(MemorySegment seg, long x) {
        __atomic_wide_counter.__value64$VH.set(seg, x);
    }
    public static long __value64$get(MemorySegment seg, long index) {
        return (long)__atomic_wide_counter.__value64$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void __value64$set(MemorySegment seg, long index, long x) {
        __atomic_wide_counter.__value64$VH.set(seg.asSlice(index*sizeof()), x);
    }
    /**
     * {@snippet :
     * struct {
     *     unsigned int __low;
     *     unsigned int __high;
     * };
     * }
     */
    public static final class __value32 {

        // Suppresses default constructor, ensuring non-instantiability.
        private __value32() {}
        static final StructLayout __value32$struct$LAYOUT = MemoryLayout.structLayout(
            Constants$root.C_INT$LAYOUT.withName("__low"),
            Constants$root.C_INT$LAYOUT.withName("__high")
        );
        public static MemoryLayout $LAYOUT() {
            return __value32.__value32$struct$LAYOUT;
        }
        static final VarHandle __low$VH = __value32$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("__low"));
        public static VarHandle __low$VH() {
            return __value32.__low$VH;
        }
        /**
         * Getter for field:
         * {@snippet :
         * unsigned int __low;
         * }
         */
        public static int __low$get(MemorySegment seg) {
            return (int)__value32.__low$VH.get(seg);
        }
        /**
         * Setter for field:
         * {@snippet :
         * unsigned int __low;
         * }
         */
        public static void __low$set(MemorySegment seg, int x) {
            __value32.__low$VH.set(seg, x);
        }
        public static int __low$get(MemorySegment seg, long index) {
            return (int)__value32.__low$VH.get(seg.asSlice(index*sizeof()));
        }
        public static void __low$set(MemorySegment seg, long index, int x) {
            __value32.__low$VH.set(seg.asSlice(index*sizeof()), x);
        }
        static final VarHandle __high$VH = __value32$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("__high"));
        public static VarHandle __high$VH() {
            return __value32.__high$VH;
        }
        /**
         * Getter for field:
         * {@snippet :
         * unsigned int __high;
         * }
         */
        public static int __high$get(MemorySegment seg) {
            return (int)__value32.__high$VH.get(seg);
        }
        /**
         * Setter for field:
         * {@snippet :
         * unsigned int __high;
         * }
         */
        public static void __high$set(MemorySegment seg, int x) {
            __value32.__high$VH.set(seg, x);
        }
        public static int __high$get(MemorySegment seg, long index) {
            return (int)__value32.__high$VH.get(seg.asSlice(index*sizeof()));
        }
        public static void __high$set(MemorySegment seg, long index, int x) {
            __value32.__high$VH.set(seg.asSlice(index*sizeof()), x);
        }
        public static long sizeof() { return $LAYOUT().byteSize(); }
        public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
        public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
            return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
        }
        public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
    }

    public static MemorySegment __value32$slice(MemorySegment seg) {
        return seg.asSlice(0, 8);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


