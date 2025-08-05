package com.meizu.flyme.openidsdk;

import tb.kge;

/* loaded from: classes4.dex */
class b {

    /* renamed from: a  reason: collision with root package name */
    long f8019a;
    String b;
    String c;
    int d;

    static {
        kge.a(-2716172);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(String str) {
        this.c = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(int i) {
        this.d = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(long j) {
        this.f8019a = j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(String str) {
        this.b = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a() {
        return this.f8019a > System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        this.f8019a = 0L;
    }
}
