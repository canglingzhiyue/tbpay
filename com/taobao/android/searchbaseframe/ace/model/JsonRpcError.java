package com.taobao.android.searchbaseframe.ace.model;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
/* loaded from: classes6.dex */
public @interface JsonRpcError {
    public static final int ERROR_INTERNAL = -32603;
    public static final int ERROR_INVALID_PARAMS = -32602;
    public static final int ERROR_INVALID_REQUEST = -32600;
    public static final int ERROR_METHOD_NOT_FOUND = -32601;
    public static final int ERROR_PARSE = -32700;
}
