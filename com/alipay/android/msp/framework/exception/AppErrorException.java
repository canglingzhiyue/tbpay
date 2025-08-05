package com.alipay.android.msp.framework.exception;

/* loaded from: classes3.dex */
public final class AppErrorException extends Exception {
    private static final long serialVersionUID = 4918321648798599467L;

    public AppErrorException(String str) {
        this(str, null);
    }

    public AppErrorException(String str, Throwable th) {
        super(str, th);
    }
}
