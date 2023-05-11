// Generated by jextract

package org.sherman.liburing;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct fscrypt_get_policy_ex_arg {
 *     __u64 policy_size;
 *     union  policy;
 * };
 * }
 */
public class fscrypt_get_policy_ex_arg {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG_LONG$LAYOUT.withName("policy_size"),
        MemoryLayout.unionLayout(
            Constants$root.C_CHAR$LAYOUT.withName("version"),
            MemoryLayout.structLayout(
                Constants$root.C_CHAR$LAYOUT.withName("version"),
                Constants$root.C_CHAR$LAYOUT.withName("contents_encryption_mode"),
                Constants$root.C_CHAR$LAYOUT.withName("filenames_encryption_mode"),
                Constants$root.C_CHAR$LAYOUT.withName("flags"),
                MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("master_key_descriptor")
            ).withName("v1"),
            MemoryLayout.structLayout(
                Constants$root.C_CHAR$LAYOUT.withName("version"),
                Constants$root.C_CHAR$LAYOUT.withName("contents_encryption_mode"),
                Constants$root.C_CHAR$LAYOUT.withName("filenames_encryption_mode"),
                Constants$root.C_CHAR$LAYOUT.withName("flags"),
                MemoryLayout.sequenceLayout(4, Constants$root.C_CHAR$LAYOUT).withName("__reserved"),
                MemoryLayout.sequenceLayout(16, Constants$root.C_CHAR$LAYOUT).withName("master_key_identifier")
            ).withName("v2")
        ).withName("policy")
    ).withName("fscrypt_get_policy_ex_arg");
    public static MemoryLayout $LAYOUT() {
        return fscrypt_get_policy_ex_arg.$struct$LAYOUT;
    }
    static final VarHandle policy_size$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("policy_size"));
    public static VarHandle policy_size$VH() {
        return fscrypt_get_policy_ex_arg.policy_size$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * __u64 policy_size;
     * }
     */
    public static long policy_size$get(MemorySegment seg) {
        return (long)fscrypt_get_policy_ex_arg.policy_size$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * __u64 policy_size;
     * }
     */
    public static void policy_size$set(MemorySegment seg, long x) {
        fscrypt_get_policy_ex_arg.policy_size$VH.set(seg, x);
    }
    public static long policy_size$get(MemorySegment seg, long index) {
        return (long)fscrypt_get_policy_ex_arg.policy_size$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void policy_size$set(MemorySegment seg, long index, long x) {
        fscrypt_get_policy_ex_arg.policy_size$VH.set(seg.asSlice(index*sizeof()), x);
    }
    /**
     * {@snippet :
     * union {
     *     __u8 version;
     *     struct fscrypt_policy_v1 v1;
     *     struct fscrypt_policy_v2 v2;
     * };
     * }
     */
    public static final class policy {

        // Suppresses default constructor, ensuring non-instantiability.
        private policy() {}
        static final UnionLayout policy$union$LAYOUT = MemoryLayout.unionLayout(
            Constants$root.C_CHAR$LAYOUT.withName("version"),
            MemoryLayout.structLayout(
                Constants$root.C_CHAR$LAYOUT.withName("version"),
                Constants$root.C_CHAR$LAYOUT.withName("contents_encryption_mode"),
                Constants$root.C_CHAR$LAYOUT.withName("filenames_encryption_mode"),
                Constants$root.C_CHAR$LAYOUT.withName("flags"),
                MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("master_key_descriptor")
            ).withName("v1"),
            MemoryLayout.structLayout(
                Constants$root.C_CHAR$LAYOUT.withName("version"),
                Constants$root.C_CHAR$LAYOUT.withName("contents_encryption_mode"),
                Constants$root.C_CHAR$LAYOUT.withName("filenames_encryption_mode"),
                Constants$root.C_CHAR$LAYOUT.withName("flags"),
                MemoryLayout.sequenceLayout(4, Constants$root.C_CHAR$LAYOUT).withName("__reserved"),
                MemoryLayout.sequenceLayout(16, Constants$root.C_CHAR$LAYOUT).withName("master_key_identifier")
            ).withName("v2")
        );
        public static MemoryLayout $LAYOUT() {
            return policy.policy$union$LAYOUT;
        }
        static final VarHandle version$VH = policy$union$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("version"));
        public static VarHandle version$VH() {
            return policy.version$VH;
        }
        /**
         * Getter for field:
         * {@snippet :
         * __u8 version;
         * }
         */
        public static byte version$get(MemorySegment seg) {
            return (byte)policy.version$VH.get(seg);
        }
        /**
         * Setter for field:
         * {@snippet :
         * __u8 version;
         * }
         */
        public static void version$set(MemorySegment seg, byte x) {
            policy.version$VH.set(seg, x);
        }
        public static byte version$get(MemorySegment seg, long index) {
            return (byte)policy.version$VH.get(seg.asSlice(index*sizeof()));
        }
        public static void version$set(MemorySegment seg, long index, byte x) {
            policy.version$VH.set(seg.asSlice(index*sizeof()), x);
        }
        public static MemorySegment v1$slice(MemorySegment seg) {
            return seg.asSlice(0, 12);
        }
        public static MemorySegment v2$slice(MemorySegment seg) {
            return seg.asSlice(0, 24);
        }
        public static long sizeof() { return $LAYOUT().byteSize(); }
        public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
        public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
            return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
        }
        public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
    }

    public static MemorySegment policy$slice(MemorySegment seg) {
        return seg.asSlice(8, 24);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

