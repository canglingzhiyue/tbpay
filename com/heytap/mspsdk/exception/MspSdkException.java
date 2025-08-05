package com.heytap.mspsdk.exception;

import tb.kge;

/* loaded from: classes4.dex */
public class MspSdkException extends RuntimeException {
    public int code;

    static {
        kge.a(-1062453606);
    }

    public MspSdkException(int i, String str) {
        super(str);
        this.code = -1;
        this.code = i;
    }

    public int getCode() {
        return this.code;
    }

    @Override // java.lang.Throwable
    public String toString() {
        return "MspSdkException{code=" + this.code + ",message=" + super.toString() + '}';
    }
}
