// Generated by jextract

package org.sherman.liburing;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$3 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$3() {}
    static final FunctionDescriptor recvmmsg$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle recvmmsg$MH = RuntimeHelper.downcallHandle(
        "recvmmsg",
        constants$3.recvmmsg$FUNC
    );
    static final FunctionDescriptor getsockopt$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle getsockopt$MH = RuntimeHelper.downcallHandle(
        "getsockopt",
        constants$3.getsockopt$FUNC
    );
    static final FunctionDescriptor setsockopt$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle setsockopt$MH = RuntimeHelper.downcallHandle(
        "setsockopt",
        constants$3.setsockopt$FUNC
    );
    static final FunctionDescriptor listen$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle listen$MH = RuntimeHelper.downcallHandle(
        "listen",
        constants$3.listen$FUNC
    );
    static final FunctionDescriptor accept$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        MemoryLayout.unionLayout(
            Constants$root.C_POINTER$LAYOUT.withName("__sockaddr__"),
            Constants$root.C_POINTER$LAYOUT.withName("__sockaddr_at__"),
            Constants$root.C_POINTER$LAYOUT.withName("__sockaddr_ax25__"),
            Constants$root.C_POINTER$LAYOUT.withName("__sockaddr_dl__"),
            Constants$root.C_POINTER$LAYOUT.withName("__sockaddr_eon__"),
            Constants$root.C_POINTER$LAYOUT.withName("__sockaddr_in__"),
            Constants$root.C_POINTER$LAYOUT.withName("__sockaddr_in6__"),
            Constants$root.C_POINTER$LAYOUT.withName("__sockaddr_inarp__"),
            Constants$root.C_POINTER$LAYOUT.withName("__sockaddr_ipx__"),
            Constants$root.C_POINTER$LAYOUT.withName("__sockaddr_iso__"),
            Constants$root.C_POINTER$LAYOUT.withName("__sockaddr_ns__"),
            Constants$root.C_POINTER$LAYOUT.withName("__sockaddr_un__"),
            Constants$root.C_POINTER$LAYOUT.withName("__sockaddr_x25__")
        ),
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle accept$MH = RuntimeHelper.downcallHandle(
        "accept",
        constants$3.accept$FUNC
    );
    static final FunctionDescriptor accept4$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        MemoryLayout.unionLayout(
            Constants$root.C_POINTER$LAYOUT.withName("__sockaddr__"),
            Constants$root.C_POINTER$LAYOUT.withName("__sockaddr_at__"),
            Constants$root.C_POINTER$LAYOUT.withName("__sockaddr_ax25__"),
            Constants$root.C_POINTER$LAYOUT.withName("__sockaddr_dl__"),
            Constants$root.C_POINTER$LAYOUT.withName("__sockaddr_eon__"),
            Constants$root.C_POINTER$LAYOUT.withName("__sockaddr_in__"),
            Constants$root.C_POINTER$LAYOUT.withName("__sockaddr_in6__"),
            Constants$root.C_POINTER$LAYOUT.withName("__sockaddr_inarp__"),
            Constants$root.C_POINTER$LAYOUT.withName("__sockaddr_ipx__"),
            Constants$root.C_POINTER$LAYOUT.withName("__sockaddr_iso__"),
            Constants$root.C_POINTER$LAYOUT.withName("__sockaddr_ns__"),
            Constants$root.C_POINTER$LAYOUT.withName("__sockaddr_un__"),
            Constants$root.C_POINTER$LAYOUT.withName("__sockaddr_x25__")
        ),
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle accept4$MH = RuntimeHelper.downcallHandle(
        "accept4",
        constants$3.accept4$FUNC
    );
}

