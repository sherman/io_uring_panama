// Generated by jextract

package org.sherman;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$12 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$12() {}
    static final FunctionDescriptor raise$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle raise$MH = RuntimeHelper.downcallHandle(
        "raise",
        constants$12.raise$FUNC
    );
    static final FunctionDescriptor ssignal$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ssignal$MH = RuntimeHelper.downcallHandle(
        "ssignal",
        constants$12.ssignal$FUNC
    );
    static final FunctionDescriptor gsignal$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gsignal$MH = RuntimeHelper.downcallHandle(
        "gsignal",
        constants$12.gsignal$FUNC
    );
    static final FunctionDescriptor psignal$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle psignal$MH = RuntimeHelper.downcallHandle(
        "psignal",
        constants$12.psignal$FUNC
    );
    static final FunctionDescriptor psiginfo$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle psiginfo$MH = RuntimeHelper.downcallHandle(
        "psiginfo",
        constants$12.psiginfo$FUNC
    );
    static final FunctionDescriptor sigpause$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle sigpause$MH = RuntimeHelper.downcallHandle(
        "sigpause",
        constants$12.sigpause$FUNC
    );
}


