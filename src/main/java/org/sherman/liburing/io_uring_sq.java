// Generated by jextract

package org.sherman.liburing;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct io_uring_sq {
 *     unsigned int* khead;
 *     unsigned int* ktail;
 *     unsigned int* kring_mask;
 *     unsigned int* kring_entries;
 *     unsigned int* kflags;
 *     unsigned int* kdropped;
 *     unsigned int* array;
 *     struct io_uring_sqe* sqes;
 *     unsigned int sqe_head;
 *     unsigned int sqe_tail;
 *     size_t ring_sz;
 *     void* ring_ptr;
 *     unsigned int ring_mask;
 *     unsigned int ring_entries;
 *     unsigned int pad[2];
 * };
 * }
 */
public class io_uring_sq {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("khead"),
        Constants$root.C_POINTER$LAYOUT.withName("ktail"),
        Constants$root.C_POINTER$LAYOUT.withName("kring_mask"),
        Constants$root.C_POINTER$LAYOUT.withName("kring_entries"),
        Constants$root.C_POINTER$LAYOUT.withName("kflags"),
        Constants$root.C_POINTER$LAYOUT.withName("kdropped"),
        Constants$root.C_POINTER$LAYOUT.withName("array"),
        Constants$root.C_POINTER$LAYOUT.withName("sqes"),
        Constants$root.C_INT$LAYOUT.withName("sqe_head"),
        Constants$root.C_INT$LAYOUT.withName("sqe_tail"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("ring_sz"),
        Constants$root.C_POINTER$LAYOUT.withName("ring_ptr"),
        Constants$root.C_INT$LAYOUT.withName("ring_mask"),
        Constants$root.C_INT$LAYOUT.withName("ring_entries"),
        MemoryLayout.sequenceLayout(2, Constants$root.C_INT$LAYOUT).withName("pad")
    ).withName("io_uring_sq");
    public static MemoryLayout $LAYOUT() {
        return io_uring_sq.$struct$LAYOUT;
    }
    static final VarHandle khead$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("khead"));
    public static VarHandle khead$VH() {
        return io_uring_sq.khead$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned int* khead;
     * }
     */
    public static MemorySegment khead$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)io_uring_sq.khead$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned int* khead;
     * }
     */
    public static void khead$set(MemorySegment seg, MemorySegment x) {
        io_uring_sq.khead$VH.set(seg, x);
    }
    public static MemorySegment khead$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)io_uring_sq.khead$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void khead$set(MemorySegment seg, long index, MemorySegment x) {
        io_uring_sq.khead$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ktail$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ktail"));
    public static VarHandle ktail$VH() {
        return io_uring_sq.ktail$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned int* ktail;
     * }
     */
    public static MemorySegment ktail$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)io_uring_sq.ktail$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned int* ktail;
     * }
     */
    public static void ktail$set(MemorySegment seg, MemorySegment x) {
        io_uring_sq.ktail$VH.set(seg, x);
    }
    public static MemorySegment ktail$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)io_uring_sq.ktail$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ktail$set(MemorySegment seg, long index, MemorySegment x) {
        io_uring_sq.ktail$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle kring_mask$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("kring_mask"));
    public static VarHandle kring_mask$VH() {
        return io_uring_sq.kring_mask$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned int* kring_mask;
     * }
     */
    public static MemorySegment kring_mask$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)io_uring_sq.kring_mask$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned int* kring_mask;
     * }
     */
    public static void kring_mask$set(MemorySegment seg, MemorySegment x) {
        io_uring_sq.kring_mask$VH.set(seg, x);
    }
    public static MemorySegment kring_mask$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)io_uring_sq.kring_mask$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void kring_mask$set(MemorySegment seg, long index, MemorySegment x) {
        io_uring_sq.kring_mask$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle kring_entries$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("kring_entries"));
    public static VarHandle kring_entries$VH() {
        return io_uring_sq.kring_entries$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned int* kring_entries;
     * }
     */
    public static MemorySegment kring_entries$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)io_uring_sq.kring_entries$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned int* kring_entries;
     * }
     */
    public static void kring_entries$set(MemorySegment seg, MemorySegment x) {
        io_uring_sq.kring_entries$VH.set(seg, x);
    }
    public static MemorySegment kring_entries$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)io_uring_sq.kring_entries$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void kring_entries$set(MemorySegment seg, long index, MemorySegment x) {
        io_uring_sq.kring_entries$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle kflags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("kflags"));
    public static VarHandle kflags$VH() {
        return io_uring_sq.kflags$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned int* kflags;
     * }
     */
    public static MemorySegment kflags$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)io_uring_sq.kflags$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned int* kflags;
     * }
     */
    public static void kflags$set(MemorySegment seg, MemorySegment x) {
        io_uring_sq.kflags$VH.set(seg, x);
    }
    public static MemorySegment kflags$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)io_uring_sq.kflags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void kflags$set(MemorySegment seg, long index, MemorySegment x) {
        io_uring_sq.kflags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle kdropped$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("kdropped"));
    public static VarHandle kdropped$VH() {
        return io_uring_sq.kdropped$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned int* kdropped;
     * }
     */
    public static MemorySegment kdropped$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)io_uring_sq.kdropped$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned int* kdropped;
     * }
     */
    public static void kdropped$set(MemorySegment seg, MemorySegment x) {
        io_uring_sq.kdropped$VH.set(seg, x);
    }
    public static MemorySegment kdropped$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)io_uring_sq.kdropped$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void kdropped$set(MemorySegment seg, long index, MemorySegment x) {
        io_uring_sq.kdropped$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle array$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("array"));
    public static VarHandle array$VH() {
        return io_uring_sq.array$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned int* array;
     * }
     */
    public static MemorySegment array$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)io_uring_sq.array$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned int* array;
     * }
     */
    public static void array$set(MemorySegment seg, MemorySegment x) {
        io_uring_sq.array$VH.set(seg, x);
    }
    public static MemorySegment array$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)io_uring_sq.array$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void array$set(MemorySegment seg, long index, MemorySegment x) {
        io_uring_sq.array$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle sqes$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("sqes"));
    public static VarHandle sqes$VH() {
        return io_uring_sq.sqes$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * struct io_uring_sqe* sqes;
     * }
     */
    public static MemorySegment sqes$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)io_uring_sq.sqes$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * struct io_uring_sqe* sqes;
     * }
     */
    public static void sqes$set(MemorySegment seg, MemorySegment x) {
        io_uring_sq.sqes$VH.set(seg, x);
    }
    public static MemorySegment sqes$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)io_uring_sq.sqes$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void sqes$set(MemorySegment seg, long index, MemorySegment x) {
        io_uring_sq.sqes$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle sqe_head$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("sqe_head"));
    public static VarHandle sqe_head$VH() {
        return io_uring_sq.sqe_head$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned int sqe_head;
     * }
     */
    public static int sqe_head$get(MemorySegment seg) {
        return (int)io_uring_sq.sqe_head$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned int sqe_head;
     * }
     */
    public static void sqe_head$set(MemorySegment seg, int x) {
        io_uring_sq.sqe_head$VH.set(seg, x);
    }
    public static int sqe_head$get(MemorySegment seg, long index) {
        return (int)io_uring_sq.sqe_head$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void sqe_head$set(MemorySegment seg, long index, int x) {
        io_uring_sq.sqe_head$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle sqe_tail$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("sqe_tail"));
    public static VarHandle sqe_tail$VH() {
        return io_uring_sq.sqe_tail$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned int sqe_tail;
     * }
     */
    public static int sqe_tail$get(MemorySegment seg) {
        return (int)io_uring_sq.sqe_tail$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned int sqe_tail;
     * }
     */
    public static void sqe_tail$set(MemorySegment seg, int x) {
        io_uring_sq.sqe_tail$VH.set(seg, x);
    }
    public static int sqe_tail$get(MemorySegment seg, long index) {
        return (int)io_uring_sq.sqe_tail$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void sqe_tail$set(MemorySegment seg, long index, int x) {
        io_uring_sq.sqe_tail$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ring_sz$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ring_sz"));
    public static VarHandle ring_sz$VH() {
        return io_uring_sq.ring_sz$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * size_t ring_sz;
     * }
     */
    public static long ring_sz$get(MemorySegment seg) {
        return (long)io_uring_sq.ring_sz$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * size_t ring_sz;
     * }
     */
    public static void ring_sz$set(MemorySegment seg, long x) {
        io_uring_sq.ring_sz$VH.set(seg, x);
    }
    public static long ring_sz$get(MemorySegment seg, long index) {
        return (long)io_uring_sq.ring_sz$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ring_sz$set(MemorySegment seg, long index, long x) {
        io_uring_sq.ring_sz$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ring_ptr$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ring_ptr"));
    public static VarHandle ring_ptr$VH() {
        return io_uring_sq.ring_ptr$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void* ring_ptr;
     * }
     */
    public static MemorySegment ring_ptr$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)io_uring_sq.ring_ptr$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void* ring_ptr;
     * }
     */
    public static void ring_ptr$set(MemorySegment seg, MemorySegment x) {
        io_uring_sq.ring_ptr$VH.set(seg, x);
    }
    public static MemorySegment ring_ptr$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)io_uring_sq.ring_ptr$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ring_ptr$set(MemorySegment seg, long index, MemorySegment x) {
        io_uring_sq.ring_ptr$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ring_mask$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ring_mask"));
    public static VarHandle ring_mask$VH() {
        return io_uring_sq.ring_mask$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned int ring_mask;
     * }
     */
    public static int ring_mask$get(MemorySegment seg) {
        return (int)io_uring_sq.ring_mask$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned int ring_mask;
     * }
     */
    public static void ring_mask$set(MemorySegment seg, int x) {
        io_uring_sq.ring_mask$VH.set(seg, x);
    }
    public static int ring_mask$get(MemorySegment seg, long index) {
        return (int)io_uring_sq.ring_mask$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ring_mask$set(MemorySegment seg, long index, int x) {
        io_uring_sq.ring_mask$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ring_entries$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ring_entries"));
    public static VarHandle ring_entries$VH() {
        return io_uring_sq.ring_entries$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned int ring_entries;
     * }
     */
    public static int ring_entries$get(MemorySegment seg) {
        return (int)io_uring_sq.ring_entries$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned int ring_entries;
     * }
     */
    public static void ring_entries$set(MemorySegment seg, int x) {
        io_uring_sq.ring_entries$VH.set(seg, x);
    }
    public static int ring_entries$get(MemorySegment seg, long index) {
        return (int)io_uring_sq.ring_entries$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ring_entries$set(MemorySegment seg, long index, int x) {
        io_uring_sq.ring_entries$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment pad$slice(MemorySegment seg) {
        return seg.asSlice(96, 8);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

