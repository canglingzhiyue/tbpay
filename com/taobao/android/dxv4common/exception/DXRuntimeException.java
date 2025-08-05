package com.taobao.android.dxv4common.exception;

import tb.kge;

/* loaded from: classes5.dex */
public class DXRuntimeException extends RuntimeException {
    static {
        kge.a(-37451286);
    }

    public DXRuntimeException() {
    }

    public DXRuntimeException(String str) {
        super(str);
    }

    public DXRuntimeException(String str, Throwable th) {
        super(str, th);
    }

    public DXRuntimeException(Throwable th) {
        super(th);
    }
}
