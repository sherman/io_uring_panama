// Generated by jextract

package org.sherman.liburing;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$7 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$7() {}
    static final FunctionDescriptor mkdirat$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle mkdirat$MH = RuntimeHelper.downcallHandle(
        "mkdirat",
        constants$7.mkdirat$FUNC
    );
    static final FunctionDescriptor mknod$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle mknod$MH = RuntimeHelper.downcallHandle(
        "mknod",
        constants$7.mknod$FUNC
    );
    static final FunctionDescriptor mknodat$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle mknodat$MH = RuntimeHelper.downcallHandle(
        "mknodat",
        constants$7.mknodat$FUNC
    );
    static final FunctionDescriptor mkfifo$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle mkfifo$MH = RuntimeHelper.downcallHandle(
        "mkfifo",
        constants$7.mkfifo$FUNC
    );
    static final FunctionDescriptor mkfifoat$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle mkfifoat$MH = RuntimeHelper.downcallHandle(
        "mkfifoat",
        constants$7.mkfifoat$FUNC
    );
    static final FunctionDescriptor utimensat$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle utimensat$MH = RuntimeHelper.downcallHandle(
        "utimensat",
        constants$7.utimensat$FUNC
    );
}


