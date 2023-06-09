package org.sherman.uring;

public class OperationResult {
    private final OperationType operationType;
    private final OperationCallback operationCallback;

    // will be filled after the operation has been completed
    public int flags;
    public long userData;
    public int result;
    public int bufferId;

    public OperationResult(OperationType operationType, OperationCallback operationCallback) {
        this.operationType = operationType;
        this.operationCallback = operationCallback;
    }

    public void run() {
        operationCallback.run(result, bufferId);
    }
}
