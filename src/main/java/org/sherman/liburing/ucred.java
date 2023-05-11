// Generated by jextract

package org.sherman.liburing;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct ucred {
 *     pid_t pid;
 *     uid_t uid;
 *     gid_t gid;
 * };
 * }
 */
public class ucred {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_INT$LAYOUT.withName("pid"),
        Constants$root.C_INT$LAYOUT.withName("uid"),
        Constants$root.C_INT$LAYOUT.withName("gid")
    ).withName("ucred");
    public static MemoryLayout $LAYOUT() {
        return ucred.$struct$LAYOUT;
    }
    static final VarHandle pid$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pid"));
    public static VarHandle pid$VH() {
        return ucred.pid$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * pid_t pid;
     * }
     */
    public static int pid$get(MemorySegment seg) {
        return (int)ucred.pid$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * pid_t pid;
     * }
     */
    public static void pid$set(MemorySegment seg, int x) {
        ucred.pid$VH.set(seg, x);
    }
    public static int pid$get(MemorySegment seg, long index) {
        return (int)ucred.pid$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pid$set(MemorySegment seg, long index, int x) {
        ucred.pid$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle uid$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("uid"));
    public static VarHandle uid$VH() {
        return ucred.uid$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uid_t uid;
     * }
     */
    public static int uid$get(MemorySegment seg) {
        return (int)ucred.uid$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uid_t uid;
     * }
     */
    public static void uid$set(MemorySegment seg, int x) {
        ucred.uid$VH.set(seg, x);
    }
    public static int uid$get(MemorySegment seg, long index) {
        return (int)ucred.uid$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void uid$set(MemorySegment seg, long index, int x) {
        ucred.uid$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle gid$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("gid"));
    public static VarHandle gid$VH() {
        return ucred.gid$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * gid_t gid;
     * }
     */
    public static int gid$get(MemorySegment seg) {
        return (int)ucred.gid$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * gid_t gid;
     * }
     */
    public static void gid$set(MemorySegment seg, int x) {
        ucred.gid$VH.set(seg, x);
    }
    public static int gid$get(MemorySegment seg, long index) {
        return (int)ucred.gid$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void gid$set(MemorySegment seg, long index, int x) {
        ucred.gid$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

