package com.huawei.secure.android.common.util;

/* loaded from: classes4.dex */
public class SecurityCommonException extends Exception {
    private static final long c = 1;

    /* renamed from: a  reason: collision with root package name */
    private String f7614a;
    private String b;

    public SecurityCommonException() {
    }

    public SecurityCommonException(String str) {
        super(str);
        this.b = str;
    }

    public SecurityCommonException(String str, String str2) {
        this.f7614a = str;
        this.b = str2;
    }

    public SecurityCommonException(String str, Throwable th) {
        super(str, th);
    }

    public SecurityCommonException(Throwable th) {
        super(th);
    }

    public String getMsgDes() {
        return this.b;
    }

    public String getRetCd() {
        return this.f7614a;
    }
}
