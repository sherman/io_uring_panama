// Generated by jextract

package org.sherman.liburing;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$42 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$42() {}
    static final FunctionDescriptor tgkill$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle tgkill$MH = RuntimeHelper.downcallHandle(
        "tgkill",
        constants$42.tgkill$FUNC
    );
    static final FunctionDescriptor imaxabs$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle imaxabs$MH = RuntimeHelper.downcallHandle(
        "imaxabs",
        constants$42.imaxabs$FUNC
    );
    static final FunctionDescriptor imaxdiv$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_LONG_LONG$LAYOUT.withName("quot"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("rem")
    ),
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle imaxdiv$MH = RuntimeHelper.downcallHandle(
        "imaxdiv",
        constants$42.imaxdiv$FUNC
    );
    static final FunctionDescriptor strtoimax$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle strtoimax$MH = RuntimeHelper.downcallHandle(
        "strtoimax",
        constants$42.strtoimax$FUNC
    );
    static final FunctionDescriptor strtoumax$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle strtoumax$MH = RuntimeHelper.downcallHandle(
        "strtoumax",
        constants$42.strtoumax$FUNC
    );
    static final FunctionDescriptor wcstoimax$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle wcstoimax$MH = RuntimeHelper.downcallHandle(
        "wcstoimax",
        constants$42.wcstoimax$FUNC
    );
}

