// Generated by jextract

package org.sherman;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$26 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$26() {}
    static final FunctionDescriptor __getpgid$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle __getpgid$MH = RuntimeHelper.downcallHandle(
        "__getpgid",
        constants$26.__getpgid$FUNC
    );
    static final FunctionDescriptor getpgid$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle getpgid$MH = RuntimeHelper.downcallHandle(
        "getpgid",
        constants$26.getpgid$FUNC
    );
    static final FunctionDescriptor setpgid$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle setpgid$MH = RuntimeHelper.downcallHandle(
        "setpgid",
        constants$26.setpgid$FUNC
    );
    static final FunctionDescriptor setpgrp$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT);
    static final MethodHandle setpgrp$MH = RuntimeHelper.downcallHandle(
        "setpgrp",
        constants$26.setpgrp$FUNC
    );
    static final FunctionDescriptor setsid$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT);
    static final MethodHandle setsid$MH = RuntimeHelper.downcallHandle(
        "setsid",
        constants$26.setsid$FUNC
    );
    static final FunctionDescriptor getsid$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle getsid$MH = RuntimeHelper.downcallHandle(
        "getsid",
        constants$26.getsid$FUNC
    );
}


