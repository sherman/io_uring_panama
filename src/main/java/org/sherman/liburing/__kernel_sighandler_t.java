// Generated by jextract

package org.sherman.liburing;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * void (*__kernel_sighandler_t)(int);
 * }
 */
public interface __kernel_sighandler_t {

    void apply(int _x0);
    static MemorySegment allocate(__kernel_sighandler_t fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(constants$0.__kernel_sighandler_t_UP$MH, fi, constants$0.__kernel_sighandler_t$FUNC, scope);
    }
    static __kernel_sighandler_t ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return (int __x0) -> {
            try {
                constants$0.__kernel_sighandler_t_DOWN$MH.invokeExact(symbol, __x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

