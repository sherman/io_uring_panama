// Generated by jextract

package org.sherman.liburing;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$71 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$71() {}
    static final FunctionDescriptor io_uring_prep_rename_panama$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle io_uring_prep_rename_panama$MH = RuntimeHelper.downcallHandle(
        "io_uring_prep_rename_panama",
        constants$71.io_uring_prep_rename_panama$FUNC
    );
    static final FunctionDescriptor io_uring_prep_mkdir_panama$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle io_uring_prep_mkdir_panama$MH = RuntimeHelper.downcallHandle(
        "io_uring_prep_mkdir_panama",
        constants$71.io_uring_prep_mkdir_panama$FUNC
    );
    static final FunctionDescriptor io_uring_prep_symlink_panama$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle io_uring_prep_symlink_panama$MH = RuntimeHelper.downcallHandle(
        "io_uring_prep_symlink_panama",
        constants$71.io_uring_prep_symlink_panama$FUNC
    );
    static final FunctionDescriptor io_uring_prep_link_panama$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle io_uring_prep_link_panama$MH = RuntimeHelper.downcallHandle(
        "io_uring_prep_link_panama",
        constants$71.io_uring_prep_link_panama$FUNC
    );
    static final FunctionDescriptor io_uring_sq_ready_panama$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle io_uring_sq_ready_panama$MH = RuntimeHelper.downcallHandle(
        "io_uring_sq_ready_panama",
        constants$71.io_uring_sq_ready_panama$FUNC
    );
    static final FunctionDescriptor io_uring_sq_space_left_panama$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle io_uring_sq_space_left_panama$MH = RuntimeHelper.downcallHandle(
        "io_uring_sq_space_left_panama",
        constants$71.io_uring_sq_space_left_panama$FUNC
    );
}


