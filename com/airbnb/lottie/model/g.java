package com.airbnb.lottie.model;

/* loaded from: classes2.dex */
public class g {

    /* renamed from: a  reason: collision with root package name */
    public final float f1772a;
    public final float b;
    private final String c;

    public g(String str, float f, float f2) {
        this.c = str;
        this.b = f2;
        this.f1772a = f;
    }

    public boolean a(String str) {
        if (this.c.equalsIgnoreCase(str)) {
            return true;
        }
        if (this.c.endsWith("\r")) {
            String str2 = this.c;
            if (str2.substring(0, str2.length() - 1).equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }
}
