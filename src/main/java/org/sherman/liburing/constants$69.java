// Generated by jextract

package org.sherman.liburing;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$69 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$69() {}
    static final FunctionDescriptor io_uring_prep_writev_panama$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle io_uring_prep_writev_panama$MH = RuntimeHelper.downcallHandle(
        "io_uring_prep_writev_panama",
        constants$69.io_uring_prep_writev_panama$FUNC
    );
    static final FunctionDescriptor io_uring_prep_writev2_panama$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle io_uring_prep_writev2_panama$MH = RuntimeHelper.downcallHandle(
        "io_uring_prep_writev2_panama",
        constants$69.io_uring_prep_writev2_panama$FUNC
    );
    static final FunctionDescriptor io_uring_prep_write_fixed_panama$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle io_uring_prep_write_fixed_panama$MH = RuntimeHelper.downcallHandle(
        "io_uring_prep_write_fixed_panama",
        constants$69.io_uring_prep_write_fixed_panama$FUNC
    );
    static final FunctionDescriptor io_uring_prep_nop_panama$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle io_uring_prep_nop_panama$MH = RuntimeHelper.downcallHandle(
        "io_uring_prep_nop_panama",
        constants$69.io_uring_prep_nop_panama$FUNC
    );
    static final FunctionDescriptor io_uring_prep_close_panama$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle io_uring_prep_close_panama$MH = RuntimeHelper.downcallHandle(
        "io_uring_prep_close_panama",
        constants$69.io_uring_prep_close_panama$FUNC
    );
    static final FunctionDescriptor io_uring_prep_close_direct_panama$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle io_uring_prep_close_direct_panama$MH = RuntimeHelper.downcallHandle(
        "io_uring_prep_close_direct_panama",
        constants$69.io_uring_prep_close_direct_panama$FUNC
    );
}


