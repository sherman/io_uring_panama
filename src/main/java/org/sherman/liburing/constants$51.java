// Generated by jextract

package org.sherman.liburing;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$51 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$51() {}
    static final FunctionDescriptor tee$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle tee$MH = RuntimeHelper.downcallHandle(
        "tee",
        constants$51.tee$FUNC
    );
    static final FunctionDescriptor fallocate$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle fallocate$MH = RuntimeHelper.downcallHandle(
        "fallocate",
        constants$51.fallocate$FUNC
    );
    static final FunctionDescriptor fallocate64$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle fallocate64$MH = RuntimeHelper.downcallHandle(
        "fallocate64",
        constants$51.fallocate64$FUNC
    );
    static final FunctionDescriptor name_to_handle_at$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle name_to_handle_at$MH = RuntimeHelper.downcallHandle(
        "name_to_handle_at",
        constants$51.name_to_handle_at$FUNC
    );
    static final FunctionDescriptor open_by_handle_at$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle open_by_handle_at$MH = RuntimeHelper.downcallHandle(
        "open_by_handle_at",
        constants$51.open_by_handle_at$FUNC
    );
    static final FunctionDescriptor fcntl$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle fcntl$MH = RuntimeHelper.downcallHandleVariadic(
        "fcntl",
        constants$51.fcntl$FUNC
    );
}

