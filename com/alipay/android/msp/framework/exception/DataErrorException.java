package com.alipay.android.msp.framework.exception;

/* loaded from: classes3.dex */
public class DataErrorException extends Exception {
    public DataErrorException(String str) {
        this(str, null);
    }

    public DataErrorException(String str, Throwable th) {
        super(str, th);
    }
}
