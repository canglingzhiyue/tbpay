package com.unionpay.utils;

import java.util.Locale;

/* loaded from: classes9.dex */
public class k {
    private static k f;

    /* renamed from: a  reason: collision with root package name */
    public String f24050a = "";
    public String b = "";
    public String c = "";
    public String d = "";
    public String e = "";

    public static k a() {
        if (f == null) {
            f = Locale.getDefault().toString().startsWith("zh") ? new l() : new m();
        }
        return f;
    }
}
