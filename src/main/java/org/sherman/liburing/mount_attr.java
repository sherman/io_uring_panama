// Generated by jextract

package org.sherman.liburing;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct mount_attr {
 *     __u64 attr_set;
 *     __u64 attr_clr;
 *     __u64 propagation;
 *     __u64 userns_fd;
 * };
 * }
 */
public class mount_attr {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG_LONG$LAYOUT.withName("attr_set"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("attr_clr"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("propagation"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("userns_fd")
    ).withName("mount_attr");
    public static MemoryLayout $LAYOUT() {
        return mount_attr.$struct$LAYOUT;
    }
    static final VarHandle attr_set$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("attr_set"));
    public static VarHandle attr_set$VH() {
        return mount_attr.attr_set$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * __u64 attr_set;
     * }
     */
    public static long attr_set$get(MemorySegment seg) {
        return (long)mount_attr.attr_set$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * __u64 attr_set;
     * }
     */
    public static void attr_set$set(MemorySegment seg, long x) {
        mount_attr.attr_set$VH.set(seg, x);
    }
    public static long attr_set$get(MemorySegment seg, long index) {
        return (long)mount_attr.attr_set$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void attr_set$set(MemorySegment seg, long index, long x) {
        mount_attr.attr_set$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle attr_clr$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("attr_clr"));
    public static VarHandle attr_clr$VH() {
        return mount_attr.attr_clr$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * __u64 attr_clr;
     * }
     */
    public static long attr_clr$get(MemorySegment seg) {
        return (long)mount_attr.attr_clr$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * __u64 attr_clr;
     * }
     */
    public static void attr_clr$set(MemorySegment seg, long x) {
        mount_attr.attr_clr$VH.set(seg, x);
    }
    public static long attr_clr$get(MemorySegment seg, long index) {
        return (long)mount_attr.attr_clr$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void attr_clr$set(MemorySegment seg, long index, long x) {
        mount_attr.attr_clr$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle propagation$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("propagation"));
    public static VarHandle propagation$VH() {
        return mount_attr.propagation$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * __u64 propagation;
     * }
     */
    public static long propagation$get(MemorySegment seg) {
        return (long)mount_attr.propagation$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * __u64 propagation;
     * }
     */
    public static void propagation$set(MemorySegment seg, long x) {
        mount_attr.propagation$VH.set(seg, x);
    }
    public static long propagation$get(MemorySegment seg, long index) {
        return (long)mount_attr.propagation$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void propagation$set(MemorySegment seg, long index, long x) {
        mount_attr.propagation$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle userns_fd$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("userns_fd"));
    public static VarHandle userns_fd$VH() {
        return mount_attr.userns_fd$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * __u64 userns_fd;
     * }
     */
    public static long userns_fd$get(MemorySegment seg) {
        return (long)mount_attr.userns_fd$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * __u64 userns_fd;
     * }
     */
    public static void userns_fd$set(MemorySegment seg, long x) {
        mount_attr.userns_fd$VH.set(seg, x);
    }
    public static long userns_fd$get(MemorySegment seg, long index) {
        return (long)mount_attr.userns_fd$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void userns_fd$set(MemorySegment seg, long index, long x) {
        mount_attr.userns_fd$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

