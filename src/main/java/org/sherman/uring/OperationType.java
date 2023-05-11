package org.sherman.uring;

public enum OperationType {
    CONNECT,
    ACCEPT,
    MULTI_SHOT_ACCEPT,
    MULTI_SHOT_RECV,
    FILE_READ,
    FILE_SELECTED_READ,
    FILE_WRITE,
    FILE_SYNC,
    SOCKET_READ,
    SOCKET_SELECTED_READ,
    SOCKET_WRITE,
    NO,
    TIMEOUT,
    CANCEL
}
