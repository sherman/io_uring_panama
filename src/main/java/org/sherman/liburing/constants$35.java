// Generated by jextract

package org.sherman.liburing;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$35 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$35() {}
    static final FunctionDescriptor revoke$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle revoke$MH = RuntimeHelper.downcallHandle(
        "revoke",
        constants$35.revoke$FUNC
    );
    static final FunctionDescriptor profil$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle profil$MH = RuntimeHelper.downcallHandle(
        "profil",
        constants$35.profil$FUNC
    );
    static final FunctionDescriptor acct$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle acct$MH = RuntimeHelper.downcallHandle(
        "acct",
        constants$35.acct$FUNC
    );
    static final FunctionDescriptor getusershell$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle getusershell$MH = RuntimeHelper.downcallHandle(
        "getusershell",
        constants$35.getusershell$FUNC
    );
    static final FunctionDescriptor endusershell$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle endusershell$MH = RuntimeHelper.downcallHandle(
        "endusershell",
        constants$35.endusershell$FUNC
    );
    static final FunctionDescriptor setusershell$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle setusershell$MH = RuntimeHelper.downcallHandle(
        "setusershell",
        constants$35.setusershell$FUNC
    );
}


