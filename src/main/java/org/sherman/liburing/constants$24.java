// Generated by jextract

package org.sherman.liburing;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$24 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$24() {}
    static final FunctionDescriptor execvp$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle execvp$MH = RuntimeHelper.downcallHandle(
        "execvp",
        constants$24.execvp$FUNC
    );
    static final FunctionDescriptor execlp$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle execlp$MH = RuntimeHelper.downcallHandleVariadic(
        "execlp",
        constants$24.execlp$FUNC
    );
    static final FunctionDescriptor execvpe$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle execvpe$MH = RuntimeHelper.downcallHandle(
        "execvpe",
        constants$24.execvpe$FUNC
    );
    static final FunctionDescriptor nice$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle nice$MH = RuntimeHelper.downcallHandle(
        "nice",
        constants$24.nice$FUNC
    );
    static final FunctionDescriptor _exit$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle _exit$MH = RuntimeHelper.downcallHandle(
        "_exit",
        constants$24._exit$FUNC
    );
    static final FunctionDescriptor pathconf$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle pathconf$MH = RuntimeHelper.downcallHandle(
        "pathconf",
        constants$24.pathconf$FUNC
    );
}


