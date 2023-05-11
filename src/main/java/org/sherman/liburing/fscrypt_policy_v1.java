// Generated by jextract

package org.sherman.liburing;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct fscrypt_policy_v1 {
 *     __u8 version;
 *     __u8 contents_encryption_mode;
 *     __u8 filenames_encryption_mode;
 *     __u8 flags;
 *     __u8 master_key_descriptor[8];
 * };
 * }
 */
public class fscrypt_policy_v1 {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_CHAR$LAYOUT.withName("version"),
        Constants$root.C_CHAR$LAYOUT.withName("contents_encryption_mode"),
        Constants$root.C_CHAR$LAYOUT.withName("filenames_encryption_mode"),
        Constants$root.C_CHAR$LAYOUT.withName("flags"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("master_key_descriptor")
    ).withName("fscrypt_policy_v1");
    public static MemoryLayout $LAYOUT() {
        return fscrypt_policy_v1.$struct$LAYOUT;
    }
    static final VarHandle version$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("version"));
    public static VarHandle version$VH() {
        return fscrypt_policy_v1.version$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * __u8 version;
     * }
     */
    public static byte version$get(MemorySegment seg) {
        return (byte)fscrypt_policy_v1.version$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * __u8 version;
     * }
     */
    public static void version$set(MemorySegment seg, byte x) {
        fscrypt_policy_v1.version$VH.set(seg, x);
    }
    public static byte version$get(MemorySegment seg, long index) {
        return (byte)fscrypt_policy_v1.version$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void version$set(MemorySegment seg, long index, byte x) {
        fscrypt_policy_v1.version$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle contents_encryption_mode$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("contents_encryption_mode"));
    public static VarHandle contents_encryption_mode$VH() {
        return fscrypt_policy_v1.contents_encryption_mode$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * __u8 contents_encryption_mode;
     * }
     */
    public static byte contents_encryption_mode$get(MemorySegment seg) {
        return (byte)fscrypt_policy_v1.contents_encryption_mode$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * __u8 contents_encryption_mode;
     * }
     */
    public static void contents_encryption_mode$set(MemorySegment seg, byte x) {
        fscrypt_policy_v1.contents_encryption_mode$VH.set(seg, x);
    }
    public static byte contents_encryption_mode$get(MemorySegment seg, long index) {
        return (byte)fscrypt_policy_v1.contents_encryption_mode$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void contents_encryption_mode$set(MemorySegment seg, long index, byte x) {
        fscrypt_policy_v1.contents_encryption_mode$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle filenames_encryption_mode$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("filenames_encryption_mode"));
    public static VarHandle filenames_encryption_mode$VH() {
        return fscrypt_policy_v1.filenames_encryption_mode$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * __u8 filenames_encryption_mode;
     * }
     */
    public static byte filenames_encryption_mode$get(MemorySegment seg) {
        return (byte)fscrypt_policy_v1.filenames_encryption_mode$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * __u8 filenames_encryption_mode;
     * }
     */
    public static void filenames_encryption_mode$set(MemorySegment seg, byte x) {
        fscrypt_policy_v1.filenames_encryption_mode$VH.set(seg, x);
    }
    public static byte filenames_encryption_mode$get(MemorySegment seg, long index) {
        return (byte)fscrypt_policy_v1.filenames_encryption_mode$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void filenames_encryption_mode$set(MemorySegment seg, long index, byte x) {
        fscrypt_policy_v1.filenames_encryption_mode$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle flags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("flags"));
    public static VarHandle flags$VH() {
        return fscrypt_policy_v1.flags$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * __u8 flags;
     * }
     */
    public static byte flags$get(MemorySegment seg) {
        return (byte)fscrypt_policy_v1.flags$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * __u8 flags;
     * }
     */
    public static void flags$set(MemorySegment seg, byte x) {
        fscrypt_policy_v1.flags$VH.set(seg, x);
    }
    public static byte flags$get(MemorySegment seg, long index) {
        return (byte)fscrypt_policy_v1.flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void flags$set(MemorySegment seg, long index, byte x) {
        fscrypt_policy_v1.flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment master_key_descriptor$slice(MemorySegment seg) {
        return seg.asSlice(4, 8);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


