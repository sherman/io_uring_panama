// Generated by jextract

package org.sherman.liburing;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$23 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$23() {}
    static final OfAddress environ$LAYOUT = Constants$root.C_POINTER$LAYOUT;
    static final VarHandle environ$VH = constants$23.environ$LAYOUT.varHandle();
    static final MemorySegment environ$SEGMENT = RuntimeHelper.lookupGlobalVariable("environ", constants$23.environ$LAYOUT);
    static final FunctionDescriptor execve$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle execve$MH = RuntimeHelper.downcallHandle(
        "execve",
        constants$23.execve$FUNC
    );
    static final FunctionDescriptor fexecve$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle fexecve$MH = RuntimeHelper.downcallHandle(
        "fexecve",
        constants$23.fexecve$FUNC
    );
    static final FunctionDescriptor execv$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle execv$MH = RuntimeHelper.downcallHandle(
        "execv",
        constants$23.execv$FUNC
    );
    static final FunctionDescriptor execle$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle execle$MH = RuntimeHelper.downcallHandleVariadic(
        "execle",
        constants$23.execle$FUNC
    );
    static final FunctionDescriptor execl$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle execl$MH = RuntimeHelper.downcallHandleVariadic(
        "execl",
        constants$23.execl$FUNC
    );
}


