// Generated by jextract

package org.sherman;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _fpstate {
 *     __uint16_t cwd;
 *     __uint16_t swd;
 *     __uint16_t ftw;
 *     __uint16_t fop;
 *     __uint64_t rip;
 *     __uint64_t rdp;
 *     __uint32_t mxcsr;
 *     __uint32_t mxcr_mask;
 *     struct _fpxreg _st[8];
 *     struct _xmmreg _xmm[16];
 *     __uint32_t __glibc_reserved1[24];
 * };
 * }
 */
public class _fpstate {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_SHORT$LAYOUT.withName("cwd"),
        Constants$root.C_SHORT$LAYOUT.withName("swd"),
        Constants$root.C_SHORT$LAYOUT.withName("ftw"),
        Constants$root.C_SHORT$LAYOUT.withName("fop"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("rip"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("rdp"),
        Constants$root.C_INT$LAYOUT.withName("mxcsr"),
        Constants$root.C_INT$LAYOUT.withName("mxcr_mask"),
        MemoryLayout.sequenceLayout(8, MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(4, Constants$root.C_SHORT$LAYOUT).withName("significand"),
            Constants$root.C_SHORT$LAYOUT.withName("exponent"),
            MemoryLayout.sequenceLayout(3, Constants$root.C_SHORT$LAYOUT).withName("__glibc_reserved1")
        ).withName("_fpxreg")).withName("_st"),
        MemoryLayout.sequenceLayout(16, MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(4, Constants$root.C_INT$LAYOUT).withName("element")
        ).withName("_xmmreg")).withName("_xmm"),
        MemoryLayout.sequenceLayout(24, Constants$root.C_INT$LAYOUT).withName("__glibc_reserved1")
    ).withName("_fpstate");
    public static MemoryLayout $LAYOUT() {
        return _fpstate.$struct$LAYOUT;
    }
    static final VarHandle cwd$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cwd"));
    public static VarHandle cwd$VH() {
        return _fpstate.cwd$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * __uint16_t cwd;
     * }
     */
    public static short cwd$get(MemorySegment seg) {
        return (short)_fpstate.cwd$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * __uint16_t cwd;
     * }
     */
    public static void cwd$set(MemorySegment seg, short x) {
        _fpstate.cwd$VH.set(seg, x);
    }
    public static short cwd$get(MemorySegment seg, long index) {
        return (short)_fpstate.cwd$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cwd$set(MemorySegment seg, long index, short x) {
        _fpstate.cwd$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle swd$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("swd"));
    public static VarHandle swd$VH() {
        return _fpstate.swd$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * __uint16_t swd;
     * }
     */
    public static short swd$get(MemorySegment seg) {
        return (short)_fpstate.swd$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * __uint16_t swd;
     * }
     */
    public static void swd$set(MemorySegment seg, short x) {
        _fpstate.swd$VH.set(seg, x);
    }
    public static short swd$get(MemorySegment seg, long index) {
        return (short)_fpstate.swd$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void swd$set(MemorySegment seg, long index, short x) {
        _fpstate.swd$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ftw$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ftw"));
    public static VarHandle ftw$VH() {
        return _fpstate.ftw$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * __uint16_t ftw;
     * }
     */
    public static short ftw$get(MemorySegment seg) {
        return (short)_fpstate.ftw$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * __uint16_t ftw;
     * }
     */
    public static void ftw$set(MemorySegment seg, short x) {
        _fpstate.ftw$VH.set(seg, x);
    }
    public static short ftw$get(MemorySegment seg, long index) {
        return (short)_fpstate.ftw$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ftw$set(MemorySegment seg, long index, short x) {
        _fpstate.ftw$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle fop$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("fop"));
    public static VarHandle fop$VH() {
        return _fpstate.fop$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * __uint16_t fop;
     * }
     */
    public static short fop$get(MemorySegment seg) {
        return (short)_fpstate.fop$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * __uint16_t fop;
     * }
     */
    public static void fop$set(MemorySegment seg, short x) {
        _fpstate.fop$VH.set(seg, x);
    }
    public static short fop$get(MemorySegment seg, long index) {
        return (short)_fpstate.fop$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void fop$set(MemorySegment seg, long index, short x) {
        _fpstate.fop$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle rip$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("rip"));
    public static VarHandle rip$VH() {
        return _fpstate.rip$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * __uint64_t rip;
     * }
     */
    public static long rip$get(MemorySegment seg) {
        return (long)_fpstate.rip$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * __uint64_t rip;
     * }
     */
    public static void rip$set(MemorySegment seg, long x) {
        _fpstate.rip$VH.set(seg, x);
    }
    public static long rip$get(MemorySegment seg, long index) {
        return (long)_fpstate.rip$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void rip$set(MemorySegment seg, long index, long x) {
        _fpstate.rip$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle rdp$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("rdp"));
    public static VarHandle rdp$VH() {
        return _fpstate.rdp$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * __uint64_t rdp;
     * }
     */
    public static long rdp$get(MemorySegment seg) {
        return (long)_fpstate.rdp$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * __uint64_t rdp;
     * }
     */
    public static void rdp$set(MemorySegment seg, long x) {
        _fpstate.rdp$VH.set(seg, x);
    }
    public static long rdp$get(MemorySegment seg, long index) {
        return (long)_fpstate.rdp$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void rdp$set(MemorySegment seg, long index, long x) {
        _fpstate.rdp$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle mxcsr$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("mxcsr"));
    public static VarHandle mxcsr$VH() {
        return _fpstate.mxcsr$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * __uint32_t mxcsr;
     * }
     */
    public static int mxcsr$get(MemorySegment seg) {
        return (int)_fpstate.mxcsr$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * __uint32_t mxcsr;
     * }
     */
    public static void mxcsr$set(MemorySegment seg, int x) {
        _fpstate.mxcsr$VH.set(seg, x);
    }
    public static int mxcsr$get(MemorySegment seg, long index) {
        return (int)_fpstate.mxcsr$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void mxcsr$set(MemorySegment seg, long index, int x) {
        _fpstate.mxcsr$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle mxcr_mask$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("mxcr_mask"));
    public static VarHandle mxcr_mask$VH() {
        return _fpstate.mxcr_mask$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * __uint32_t mxcr_mask;
     * }
     */
    public static int mxcr_mask$get(MemorySegment seg) {
        return (int)_fpstate.mxcr_mask$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * __uint32_t mxcr_mask;
     * }
     */
    public static void mxcr_mask$set(MemorySegment seg, int x) {
        _fpstate.mxcr_mask$VH.set(seg, x);
    }
    public static int mxcr_mask$get(MemorySegment seg, long index) {
        return (int)_fpstate.mxcr_mask$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void mxcr_mask$set(MemorySegment seg, long index, int x) {
        _fpstate.mxcr_mask$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment _st$slice(MemorySegment seg) {
        return seg.asSlice(32, 128);
    }
    public static MemorySegment _xmm$slice(MemorySegment seg) {
        return seg.asSlice(160, 256);
    }
    public static MemorySegment __glibc_reserved1$slice(MemorySegment seg) {
        return seg.asSlice(416, 96);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


