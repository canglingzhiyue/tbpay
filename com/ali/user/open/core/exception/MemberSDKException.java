package com.ali.user.open.core.exception;

import tb.kge;

/* loaded from: classes2.dex */
public class MemberSDKException extends RuntimeException {
    private static final long serialVersionUID = 1357689949294215654L;
    public int code;
    public String message;
    public Throwable throwable;

    static {
        kge.a(829047807);
    }

    public MemberSDKException(int i, String str, Throwable th) {
        super(str == null ? "" : str, th);
        this.code = i;
        this.message = str;
        this.throwable = th;
    }

    public MemberSDKException(int i, String str) {
        super(str == null ? "" : str);
        this.message = str;
    }
}
