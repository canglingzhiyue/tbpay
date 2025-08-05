package com.taobao.android.dxv4common.exception;

import tb.kge;

/* loaded from: classes5.dex */
public class DXAnimationException extends DXRuntimeException {
    static {
        kge.a(-2072230146);
    }

    public DXAnimationException(String str) {
        super("DXAnimationException: " + str);
    }

    public DXAnimationException(String str, Throwable th) {
        super("DXAnimationException: " + str, th);
    }
}
