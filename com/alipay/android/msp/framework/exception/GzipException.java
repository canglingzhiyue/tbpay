package com.alipay.android.msp.framework.exception;

/* loaded from: classes3.dex */
public final class GzipException extends Exception {
    private static final long serialVersionUID = 7405333891987087563L;

    public GzipException() {
        this(null, null);
    }

    public GzipException(String str) {
        this(str, null);
    }

    public GzipException(Throwable th) {
        this(null, th);
    }

    private GzipException(String str, Throwable th) {
        super(str, th);
    }
}
