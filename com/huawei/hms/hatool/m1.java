package com.huawei.hms.hatool;

import tb.cyh;

/* loaded from: classes4.dex */
public class m1 {
    private static m1 b = new m1();

    /* renamed from: a  reason: collision with root package name */
    private a f7474a = new a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a {

        /* renamed from: a  reason: collision with root package name */
        String f7475a;
        String b;
        long c = 0;

        a() {
        }

        void a(long j) {
            m1.this.f7474a.c = j;
        }

        void a(String str) {
            m1.this.f7474a.b = str;
        }

        void b(String str) {
            m1.this.f7474a.f7475a = str;
        }
    }

    public static m1 d() {
        return b;
    }

    public String a() {
        return this.f7474a.b;
    }

    public void a(String str, String str2) {
        long b2 = b();
        String b3 = w0.b(str, str2);
        if (b3 == null || b3.isEmpty()) {
            v.e("WorkKeyHandler", "get rsa pubkey config error");
        } else if (b2 == 0) {
            long currentTimeMillis = System.currentTimeMillis();
            String b4 = cyh.b(16);
            String a2 = h0.a(b3, b4);
            this.f7474a.a(currentTimeMillis);
            this.f7474a.b(b4);
            this.f7474a.a(a2);
        } else if (System.currentTimeMillis() - b2 <= 43200000) {
        } else {
            String b5 = cyh.b(16);
            String a3 = h0.a(b3, b5);
            this.f7474a.a(b2);
            this.f7474a.b(b5);
            this.f7474a.a(a3);
        }
    }

    public long b() {
        return this.f7474a.c;
    }

    public String c() {
        return this.f7474a.f7475a;
    }
}
