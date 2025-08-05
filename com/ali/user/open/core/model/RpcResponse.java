package com.ali.user.open.core.model;

import tb.kge;

/* loaded from: classes2.dex */
public class RpcResponse<T> {
    public String actionType;
    public int code;
    public String codeGroup;
    public String message;
    public String msgCode;
    public String msgInfo;
    public T returnValue;
    public boolean success;

    static {
        kge.a(-721762288);
    }
}
