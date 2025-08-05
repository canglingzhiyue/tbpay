package com.taobao.android.dxv4common.exception;

import tb.kge;

/* loaded from: classes5.dex */
public class DXParserException extends DXRuntimeException {
    static {
        kge.a(77869565);
    }

    public DXParserException(String str) {
        super("DXParserException: " + str);
    }

    public DXParserException(String str, Throwable th) {
        super("DXParserException: " + str, th);
    }
}
