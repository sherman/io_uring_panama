// Generated by jextract

package org.sherman;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$10 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$10() {}
    static final FunctionDescriptor process_vm_readv$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle process_vm_readv$MH = RuntimeHelper.downcallHandle(
        "process_vm_readv",
        constants$10.process_vm_readv$FUNC
    );
    static final FunctionDescriptor process_vm_writev$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle process_vm_writev$MH = RuntimeHelper.downcallHandle(
        "process_vm_writev",
        constants$10.process_vm_writev$FUNC
    );
    static final FunctionDescriptor __errno_location$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle __errno_location$MH = RuntimeHelper.downcallHandle(
        "__errno_location",
        constants$10.__errno_location$FUNC
    );
    static final OfAddress program_invocation_name$LAYOUT = Constants$root.C_POINTER$LAYOUT;
    static final VarHandle program_invocation_name$VH = constants$10.program_invocation_name$LAYOUT.varHandle();
    static final MemorySegment program_invocation_name$SEGMENT = RuntimeHelper.lookupGlobalVariable("program_invocation_name", constants$10.program_invocation_name$LAYOUT);
    static final OfAddress program_invocation_short_name$LAYOUT = Constants$root.C_POINTER$LAYOUT;
    static final VarHandle program_invocation_short_name$VH = constants$10.program_invocation_short_name$LAYOUT.varHandle();
    static final MemorySegment program_invocation_short_name$SEGMENT = RuntimeHelper.lookupGlobalVariable("program_invocation_short_name", constants$10.program_invocation_short_name$LAYOUT);
    static final FunctionDescriptor __sighandler_t$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT
    );
    static final FunctionDescriptor __sighandler_t_UP$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle __sighandler_t_UP$MH = RuntimeHelper.upcallHandle(__sighandler_t.class, "apply", constants$10.__sighandler_t_UP$FUNC);
}


