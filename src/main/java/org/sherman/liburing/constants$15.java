// Generated by jextract

package org.sherman.liburing;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$15 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$15() {}
    static final FunctionDescriptor sigisemptyset$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle sigisemptyset$MH = RuntimeHelper.downcallHandle(
        "sigisemptyset",
        constants$15.sigisemptyset$FUNC
    );
    static final FunctionDescriptor sigandset$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle sigandset$MH = RuntimeHelper.downcallHandle(
        "sigandset",
        constants$15.sigandset$FUNC
    );
    static final FunctionDescriptor sigorset$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle sigorset$MH = RuntimeHelper.downcallHandle(
        "sigorset",
        constants$15.sigorset$FUNC
    );
    static final FunctionDescriptor sigprocmask$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle sigprocmask$MH = RuntimeHelper.downcallHandle(
        "sigprocmask",
        constants$15.sigprocmask$FUNC
    );
    static final FunctionDescriptor sigsuspend$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle sigsuspend$MH = RuntimeHelper.downcallHandle(
        "sigsuspend",
        constants$15.sigsuspend$FUNC
    );
    static final FunctionDescriptor sigaction$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle sigaction$MH = RuntimeHelper.downcallHandle(
        "sigaction",
        constants$15.sigaction$FUNC
    );
}


