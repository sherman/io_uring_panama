// Generated by jextract

package org.sherman.liburing;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$9 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$9() {}
    static final FunctionDescriptor preadv64$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle preadv64$MH = RuntimeHelper.downcallHandle(
        "preadv64",
        constants$9.preadv64$FUNC
    );
    static final FunctionDescriptor pwritev64$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle pwritev64$MH = RuntimeHelper.downcallHandle(
        "pwritev64",
        constants$9.pwritev64$FUNC
    );
    static final FunctionDescriptor preadv2$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle preadv2$MH = RuntimeHelper.downcallHandle(
        "preadv2",
        constants$9.preadv2$FUNC
    );
    static final FunctionDescriptor pwritev2$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle pwritev2$MH = RuntimeHelper.downcallHandle(
        "pwritev2",
        constants$9.pwritev2$FUNC
    );
    static final FunctionDescriptor preadv64v2$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle preadv64v2$MH = RuntimeHelper.downcallHandle(
        "preadv64v2",
        constants$9.preadv64v2$FUNC
    );
    static final FunctionDescriptor pwritev64v2$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle pwritev64v2$MH = RuntimeHelper.downcallHandle(
        "pwritev64v2",
        constants$9.pwritev64v2$FUNC
    );
}


