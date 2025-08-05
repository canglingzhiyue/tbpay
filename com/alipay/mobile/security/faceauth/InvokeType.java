package com.alipay.mobile.security.faceauth;

/* loaded from: classes3.dex */
public enum InvokeType {
    NETWORK("network"),
    SERVER_FAIL("server_fail"),
    INTERRUPT("interrupt"),
    TIMEOUT("timeout"),
    NORMAL("normal"),
    FAIL("fail"),
    MONITOR("monitor"),
    LIVENESS_FAILED("liveness_failed"),
    ASYNC_UPLOAD("async_upload"),
    VIDEO("video"),
    CANCEL("cancel");
    
    public String value;

    InvokeType(String str) {
        this.value = str;
    }
}
