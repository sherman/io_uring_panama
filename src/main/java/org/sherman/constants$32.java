// Generated by jextract

package org.sherman;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$32 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$32() {}
    static final FunctionDescriptor unlinkat$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle unlinkat$MH = RuntimeHelper.downcallHandle(
        "unlinkat",
        constants$32.unlinkat$FUNC
    );
    static final FunctionDescriptor rmdir$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle rmdir$MH = RuntimeHelper.downcallHandle(
        "rmdir",
        constants$32.rmdir$FUNC
    );
    static final FunctionDescriptor tcgetpgrp$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle tcgetpgrp$MH = RuntimeHelper.downcallHandle(
        "tcgetpgrp",
        constants$32.tcgetpgrp$FUNC
    );
    static final FunctionDescriptor tcsetpgrp$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle tcsetpgrp$MH = RuntimeHelper.downcallHandle(
        "tcsetpgrp",
        constants$32.tcsetpgrp$FUNC
    );
    static final FunctionDescriptor getlogin$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle getlogin$MH = RuntimeHelper.downcallHandle(
        "getlogin",
        constants$32.getlogin$FUNC
    );
    static final FunctionDescriptor getlogin_r$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle getlogin_r$MH = RuntimeHelper.downcallHandle(
        "getlogin_r",
        constants$32.getlogin_r$FUNC
    );
}


