package com.taobao.android.weex;

/* loaded from: classes6.dex */
public enum WeexErrorType {
    ERR_BIN_DECODE,
    ERR_RENDER,
    FATAL_RENDER,
    ERR_REFRESH,
    FATAL_REFRESH,
    ERR_INVOKE_CALLBACK,
    FATAL_INVOKE_CALLBACK,
    ERR_FIRE_EVENT,
    FATAL_FIRE_EVENT,
    ERR_WINDOW_MSG,
    FATAL_WINDOW_MSG,
    JS_ERR,
    FATAL_ERR,
    ERR_DESTROY,
    HTTP_ERROR,
    ERR_EXECUTE,
    FATAL_EXECUTE,
    ERR_DISPATCH_EVENT,
    FATAL_DISPATCH_EVENT,
    UNKNOWN;

    public static WeexErrorType transformErrorType(int i) {
        WeexErrorType[] values = values();
        return (i < 0 || i >= values.length) ? UNKNOWN : values[i];
    }
}
