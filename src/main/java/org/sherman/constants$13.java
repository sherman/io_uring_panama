// Generated by jextract

package org.sherman;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$13 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$13() {}
    static final FunctionDescriptor sigblock$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle sigblock$MH = RuntimeHelper.downcallHandle(
        "sigblock",
        constants$13.sigblock$FUNC
    );
    static final FunctionDescriptor sigsetmask$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle sigsetmask$MH = RuntimeHelper.downcallHandle(
        "sigsetmask",
        constants$13.sigsetmask$FUNC
    );
    static final FunctionDescriptor siggetmask$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT);
    static final MethodHandle siggetmask$MH = RuntimeHelper.downcallHandle(
        "siggetmask",
        constants$13.siggetmask$FUNC
    );
    static final FunctionDescriptor sighandler_t$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT
    );
    static final FunctionDescriptor sighandler_t_UP$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle sighandler_t_UP$MH = RuntimeHelper.upcallHandle(sighandler_t.class, "apply", constants$13.sighandler_t_UP$FUNC);
    static final FunctionDescriptor sighandler_t_DOWN$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle sighandler_t_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$13.sighandler_t_DOWN$FUNC
    );
    static final FunctionDescriptor sig_t$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT
    );
    static final FunctionDescriptor sig_t_UP$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle sig_t_UP$MH = RuntimeHelper.upcallHandle(sig_t.class, "apply", constants$13.sig_t_UP$FUNC);
}


