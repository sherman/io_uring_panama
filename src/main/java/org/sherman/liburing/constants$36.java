// Generated by jextract

package org.sherman.liburing;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$36 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$36() {}
    static final FunctionDescriptor daemon$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle daemon$MH = RuntimeHelper.downcallHandle(
        "daemon",
        constants$36.daemon$FUNC
    );
    static final FunctionDescriptor chroot$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle chroot$MH = RuntimeHelper.downcallHandle(
        "chroot",
        constants$36.chroot$FUNC
    );
    static final FunctionDescriptor getpass$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle getpass$MH = RuntimeHelper.downcallHandle(
        "getpass",
        constants$36.getpass$FUNC
    );
    static final FunctionDescriptor fsync$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle fsync$MH = RuntimeHelper.downcallHandle(
        "fsync",
        constants$36.fsync$FUNC
    );
    static final FunctionDescriptor syncfs$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle syncfs$MH = RuntimeHelper.downcallHandle(
        "syncfs",
        constants$36.syncfs$FUNC
    );
    static final FunctionDescriptor gethostid$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gethostid$MH = RuntimeHelper.downcallHandle(
        "gethostid",
        constants$36.gethostid$FUNC
    );
}

