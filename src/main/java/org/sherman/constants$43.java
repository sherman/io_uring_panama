// Generated by jextract

package org.sherman;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$43 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$43() {}
    static final FunctionDescriptor wcstoumax$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle wcstoumax$MH = RuntimeHelper.downcallHandle(
        "wcstoumax",
        constants$43.wcstoumax$FUNC
    );
    static final FunctionDescriptor clock_adjtime$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle clock_adjtime$MH = RuntimeHelper.downcallHandle(
        "clock_adjtime",
        constants$43.clock_adjtime$FUNC
    );
    static final FunctionDescriptor clock$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle clock$MH = RuntimeHelper.downcallHandle(
        "clock",
        constants$43.clock$FUNC
    );
    static final FunctionDescriptor time$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle time$MH = RuntimeHelper.downcallHandle(
        "time",
        constants$43.time$FUNC
    );
    static final FunctionDescriptor difftime$FUNC = FunctionDescriptor.of(Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle difftime$MH = RuntimeHelper.downcallHandle(
        "difftime",
        constants$43.difftime$FUNC
    );
    static final FunctionDescriptor mktime$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle mktime$MH = RuntimeHelper.downcallHandle(
        "mktime",
        constants$43.mktime$FUNC
    );
}


