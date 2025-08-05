package com.meizu.cloud.pushsdk.e.c;

import com.meizu.cloud.pushsdk.e.d.k;

/* loaded from: classes4.dex */
public class a extends Exception {

    /* renamed from: a  reason: collision with root package name */
    private String f7908a;
    private int b;
    private String c;
    private k d;

    public a() {
        this.b = 0;
    }

    public a(k kVar) {
        this.b = 0;
        this.d = kVar;
    }

    public a(Throwable th) {
        super(th);
        this.b = 0;
    }

    public String a() {
        return this.f7908a;
    }

    public void a(int i) {
        this.b = i;
    }

    public void a(String str) {
        this.f7908a = str;
    }

    public int b() {
        return this.b;
    }

    public void b(String str) {
        this.c = str;
    }

    public k c() {
        return this.d;
    }
}
