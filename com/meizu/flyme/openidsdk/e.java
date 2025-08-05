package com.meizu.flyme.openidsdk;

import tb.kge;

/* loaded from: classes4.dex */
class e {

    /* renamed from: a  reason: collision with root package name */
    public String f8022a;
    public int b;
    public long c = System.currentTimeMillis() + 86400000;

    static {
        kge.a(-1604734612);
    }

    public e(String str, int i) {
        this.f8022a = str;
        this.b = i;
    }

    public String toString() {
        return "ValueData{value='" + this.f8022a + "', code=" + this.b + ", expired=" + this.c + '}';
    }
}
