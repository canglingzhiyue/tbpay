package com.taobao.android.dxv4common.exception;

import tb.kge;

/* loaded from: classes5.dex */
public class DXEventException extends DXRuntimeException {
    static {
        kge.a(-178755032);
    }

    public DXEventException(String str) {
        super("DXParserException: " + str);
    }

    public DXEventException(String str, Throwable th) {
        super("DXParserException: " + str, th);
    }
}
