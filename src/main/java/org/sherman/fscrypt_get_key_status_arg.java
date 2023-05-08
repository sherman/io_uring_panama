// Generated by jextract

package org.sherman;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct fscrypt_get_key_status_arg {
 *     struct fscrypt_key_specifier key_spec;
 *     __u32 __reserved[6];
 *     __u32 status;
 *     __u32 status_flags;
 *     __u32 user_count;
 *     __u32 __out_reserved[13];
 * };
 * }
 */
public class fscrypt_get_key_status_arg {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_INT$LAYOUT.withName("type"),
            Constants$root.C_INT$LAYOUT.withName("__reserved"),
            MemoryLayout.unionLayout(
                MemoryLayout.sequenceLayout(32, Constants$root.C_CHAR$LAYOUT).withName("__reserved"),
                MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("descriptor"),
                MemoryLayout.sequenceLayout(16, Constants$root.C_CHAR$LAYOUT).withName("identifier")
            ).withName("u")
        ).withName("key_spec"),
        MemoryLayout.sequenceLayout(6, Constants$root.C_INT$LAYOUT).withName("__reserved"),
        Constants$root.C_INT$LAYOUT.withName("status"),
        Constants$root.C_INT$LAYOUT.withName("status_flags"),
        Constants$root.C_INT$LAYOUT.withName("user_count"),
        MemoryLayout.sequenceLayout(13, Constants$root.C_INT$LAYOUT).withName("__out_reserved")
    ).withName("fscrypt_get_key_status_arg");
    public static MemoryLayout $LAYOUT() {
        return fscrypt_get_key_status_arg.$struct$LAYOUT;
    }
    public static MemorySegment key_spec$slice(MemorySegment seg) {
        return seg.asSlice(0, 40);
    }
    public static MemorySegment __reserved$slice(MemorySegment seg) {
        return seg.asSlice(40, 24);
    }
    static final VarHandle status$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("status"));
    public static VarHandle status$VH() {
        return fscrypt_get_key_status_arg.status$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * __u32 status;
     * }
     */
    public static int status$get(MemorySegment seg) {
        return (int)fscrypt_get_key_status_arg.status$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * __u32 status;
     * }
     */
    public static void status$set(MemorySegment seg, int x) {
        fscrypt_get_key_status_arg.status$VH.set(seg, x);
    }
    public static int status$get(MemorySegment seg, long index) {
        return (int)fscrypt_get_key_status_arg.status$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void status$set(MemorySegment seg, long index, int x) {
        fscrypt_get_key_status_arg.status$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle status_flags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("status_flags"));
    public static VarHandle status_flags$VH() {
        return fscrypt_get_key_status_arg.status_flags$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * __u32 status_flags;
     * }
     */
    public static int status_flags$get(MemorySegment seg) {
        return (int)fscrypt_get_key_status_arg.status_flags$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * __u32 status_flags;
     * }
     */
    public static void status_flags$set(MemorySegment seg, int x) {
        fscrypt_get_key_status_arg.status_flags$VH.set(seg, x);
    }
    public static int status_flags$get(MemorySegment seg, long index) {
        return (int)fscrypt_get_key_status_arg.status_flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void status_flags$set(MemorySegment seg, long index, int x) {
        fscrypt_get_key_status_arg.status_flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle user_count$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("user_count"));
    public static VarHandle user_count$VH() {
        return fscrypt_get_key_status_arg.user_count$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * __u32 user_count;
     * }
     */
    public static int user_count$get(MemorySegment seg) {
        return (int)fscrypt_get_key_status_arg.user_count$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * __u32 user_count;
     * }
     */
    public static void user_count$set(MemorySegment seg, int x) {
        fscrypt_get_key_status_arg.user_count$VH.set(seg, x);
    }
    public static int user_count$get(MemorySegment seg, long index) {
        return (int)fscrypt_get_key_status_arg.user_count$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void user_count$set(MemorySegment seg, long index, int x) {
        fscrypt_get_key_status_arg.user_count$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment __out_reserved$slice(MemorySegment seg) {
        return seg.asSlice(76, 52);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


