// Generated by jextract

package org.sherman.liburing;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$66 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$66() {}
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
        constants$66.io_uring_enter2$FUNC
    );
    static final FunctionDescriptor io_uring_setup$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle io_uring_setup$MH = RuntimeHelper.downcallHandle(
        "io_uring_setup",
        constants$66.io_uring_setup$FUNC
    );
    static final FunctionDescriptor io_uring_register$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle io_uring_register$MH = RuntimeHelper.downcallHandle(
        "io_uring_register",
        constants$66.io_uring_register$FUNC
    );
    static final FunctionDescriptor __io_uring_get_cqe$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle __io_uring_get_cqe$MH = RuntimeHelper.downcallHandle(
        "__io_uring_get_cqe",
        constants$66.__io_uring_get_cqe$FUNC
    );
    static final FunctionDescriptor io_uring_cq_advance_panama$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle io_uring_cq_advance_panama$MH = RuntimeHelper.downcallHandle(
        "io_uring_cq_advance_panama",
        constants$66.io_uring_cq_advance_panama$FUNC
    );
    static final FunctionDescriptor io_uring_cqe_seen_panama$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle io_uring_cqe_seen_panama$MH = RuntimeHelper.downcallHandle(
        "io_uring_cqe_seen_panama",
        constants$66.io_uring_cqe_seen_panama$FUNC
    );
}


