// Generated by jextract

package org.sherman.liburing;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$50 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$50() {}
    static final FunctionDescriptor getdate$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle getdate$MH = RuntimeHelper.downcallHandle(
        "getdate",
        constants$50.getdate$FUNC
    );
    static final FunctionDescriptor getdate_r$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle getdate_r$MH = RuntimeHelper.downcallHandle(
        "getdate_r",
        constants$50.getdate_r$FUNC
    );
    static final FunctionDescriptor readahead$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle readahead$MH = RuntimeHelper.downcallHandle(
        "readahead",
        constants$50.readahead$FUNC
    );
    static final FunctionDescriptor sync_file_range$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle sync_file_range$MH = RuntimeHelper.downcallHandle(
        "sync_file_range",
        constants$50.sync_file_range$FUNC
    );
    static final FunctionDescriptor vmsplice$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle vmsplice$MH = RuntimeHelper.downcallHandle(
        "vmsplice",
        constants$50.vmsplice$FUNC
    );
    static final FunctionDescriptor splice$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle splice$MH = RuntimeHelper.downcallHandle(
        "splice",
        constants$50.splice$FUNC
    );
}


