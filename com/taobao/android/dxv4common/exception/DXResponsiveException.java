package com.taobao.android.dxv4common.exception;

import tb.kge;

/* loaded from: classes5.dex */
public class DXResponsiveException extends DXRuntimeException {
    static {
        kge.a(112914824);
    }

    public DXResponsiveException(String str) {
        super("DXResponsiveException: " + str);
    }

    public DXResponsiveException(String str, Throwable th) {
        super("DXResponsiveException: " + str, th);
    }
}
