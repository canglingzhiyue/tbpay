package com.facebook.jni;

import tb.kge;

/* loaded from: classes4.dex */
public class CppSystemErrorException extends CppException {
    int errorCode;

    static {
        kge.a(1367837940);
    }

    public CppSystemErrorException(String str, int i) {
        super(str);
        this.errorCode = i;
    }

    public int getErrorCode() {
        return this.errorCode;
    }
}
