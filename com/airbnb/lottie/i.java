package com.airbnb.lottie;

import android.graphics.Bitmap;

/* loaded from: classes2.dex */
public class i {

    /* renamed from: a  reason: collision with root package name */
    private final int f1747a;
    private final int b;
    private final String c;
    private final String d;
    private final String e;
    private Bitmap f;

    public i(int i, int i2, String str, String str2, String str3) {
        this.f1747a = i;
        this.b = i2;
        this.c = str;
        this.d = str2;
        this.e = str3;
    }

    public int a() {
        return this.f1747a;
    }

    public void a(Bitmap bitmap) {
        this.f = bitmap;
    }

    public int b() {
        return this.b;
    }

    public String c() {
        return this.c;
    }

    public String d() {
        return this.d;
    }

    public Bitmap e() {
        return this.f;
    }

    public boolean f() {
        if (this.f == null) {
            return this.d.startsWith("data:") && this.d.indexOf(com.taobao.search.musie.n.BASE_64) > 0;
        }
        return true;
    }
}
