// Generated by jextract

package org.sherman;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$65 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$65() {}
    static final FunctionDescriptor io_uring_register_sync_cancel$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle io_uring_register_sync_cancel$MH = RuntimeHelper.downcallHandle(
        "io_uring_register_sync_cancel",
        constants$65.io_uring_register_sync_cancel$FUNC
    );
    static final FunctionDescriptor io_uring_register_file_alloc_range$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle io_uring_register_file_alloc_range$MH = RuntimeHelper.downcallHandle(
        "io_uring_register_file_alloc_range",
        constants$65.io_uring_register_file_alloc_range$FUNC
    );
    static final FunctionDescriptor io_uring_get_events$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle io_uring_get_events$MH = RuntimeHelper.downcallHandle(
        "io_uring_get_events",
        constants$65.io_uring_get_events$FUNC
    );
    static final FunctionDescriptor io_uring_submit_and_get_events$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle io_uring_submit_and_get_events$MH = RuntimeHelper.downcallHandle(
        "io_uring_submit_and_get_events",
        constants$65.io_uring_submit_and_get_events$FUNC
    );
    static final FunctionDescriptor io_uring_enter$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle io_uring_enter$MH = RuntimeHelper.downcallHandle(
        "io_uring_enter",
        constants$65.io_uring_enter$FUNC
    );
    static final FunctionDescriptor io_uring_enter2$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle io_uring_enter2$MH = RuntimeHelper.downcallHandle(
        "io_uring_enter2",
        constants$65.io_uring_enter2$FUNC
    );
}


