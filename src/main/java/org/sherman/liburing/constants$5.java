// Generated by jextract

package org.sherman.liburing;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$5 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$5() {}
    static final FunctionDescriptor fstat64$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle fstat64$MH = RuntimeHelper.downcallHandle(
        "fstat64",
        constants$5.fstat64$FUNC
    );
    static final FunctionDescriptor fstatat$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle fstatat$MH = RuntimeHelper.downcallHandle(
        "fstatat",
        constants$5.fstatat$FUNC
    );
    static final FunctionDescriptor fstatat64$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle fstatat64$MH = RuntimeHelper.downcallHandle(
        "fstatat64",
        constants$5.fstatat64$FUNC
    );
    static final FunctionDescriptor lstat$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle lstat$MH = RuntimeHelper.downcallHandle(
        "lstat",
        constants$5.lstat$FUNC
    );
    static final FunctionDescriptor lstat64$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle lstat64$MH = RuntimeHelper.downcallHandle(
        "lstat64",
        constants$5.lstat64$FUNC
    );
    static final FunctionDescriptor chmod$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle chmod$MH = RuntimeHelper.downcallHandle(
        "chmod",
        constants$5.chmod$FUNC
    );
}


