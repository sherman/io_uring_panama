// Generated by jextract

package org.sherman.liburing;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$29 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$29() {}
    static final FunctionDescriptor getresuid$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle getresuid$MH = RuntimeHelper.downcallHandle(
        "getresuid",
        constants$29.getresuid$FUNC
    );
    static final FunctionDescriptor getresgid$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle getresgid$MH = RuntimeHelper.downcallHandle(
        "getresgid",
        constants$29.getresgid$FUNC
    );
    static final FunctionDescriptor setresuid$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle setresuid$MH = RuntimeHelper.downcallHandle(
        "setresuid",
        constants$29.setresuid$FUNC
    );
    static final FunctionDescriptor setresgid$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle setresgid$MH = RuntimeHelper.downcallHandle(
        "setresgid",
        constants$29.setresgid$FUNC
    );
    static final FunctionDescriptor fork$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT);
    static final MethodHandle fork$MH = RuntimeHelper.downcallHandle(
        "fork",
        constants$29.fork$FUNC
    );
    static final FunctionDescriptor vfork$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT);
    static final MethodHandle vfork$MH = RuntimeHelper.downcallHandle(
        "vfork",
        constants$29.vfork$FUNC
    );
}

