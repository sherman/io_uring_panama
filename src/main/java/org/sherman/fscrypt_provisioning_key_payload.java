// Generated by jextract

package org.sherman;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct fscrypt_provisioning_key_payload {
 *     __u32 type;
 *     __u32 __reserved;
 *     __u8 raw[];
 * };
 * }
 */
public class fscrypt_provisioning_key_payload {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_INT$LAYOUT.withName("type"),
        Constants$root.C_INT$LAYOUT.withName("__reserved"),
        MemoryLayout.sequenceLayout(0, Constants$root.C_CHAR$LAYOUT).withName("raw")
    ).withName("fscrypt_provisioning_key_payload");
    public static MemoryLayout $LAYOUT() {
        return fscrypt_provisioning_key_payload.$struct$LAYOUT;
    }
    static final VarHandle type$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("type"));
    public static VarHandle type$VH() {
        return fscrypt_provisioning_key_payload.type$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * __u32 type;
     * }
     */
    public static int type$get(MemorySegment seg) {
        return (int)fscrypt_provisioning_key_payload.type$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * __u32 type;
     * }
     */
    public static void type$set(MemorySegment seg, int x) {
        fscrypt_provisioning_key_payload.type$VH.set(seg, x);
    }
    public static int type$get(MemorySegment seg, long index) {
        return (int)fscrypt_provisioning_key_payload.type$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void type$set(MemorySegment seg, long index, int x) {
        fscrypt_provisioning_key_payload.type$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle __reserved$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("__reserved"));
    public static VarHandle __reserved$VH() {
        return fscrypt_provisioning_key_payload.__reserved$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * __u32 __reserved;
     * }
     */
    public static int __reserved$get(MemorySegment seg) {
        return (int)fscrypt_provisioning_key_payload.__reserved$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * __u32 __reserved;
     * }
     */
    public static void __reserved$set(MemorySegment seg, int x) {
        fscrypt_provisioning_key_payload.__reserved$VH.set(seg, x);
    }
    public static int __reserved$get(MemorySegment seg, long index) {
        return (int)fscrypt_provisioning_key_payload.__reserved$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void __reserved$set(MemorySegment seg, long index, int x) {
        fscrypt_provisioning_key_payload.__reserved$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


