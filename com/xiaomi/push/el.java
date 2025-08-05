package com.xiaomi.push;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes9.dex */
public final class el {

    /* loaded from: classes9.dex */
    public static final class a extends e {

        /* renamed from: a  reason: collision with other field name */
        private boolean f260a;

        /* renamed from: b  reason: collision with other field name */
        private boolean f261b;
        private boolean d;
        private boolean e;

        /* renamed from: a  reason: collision with root package name */
        private int f24448a = 0;

        /* renamed from: c  reason: collision with other field name */
        private boolean f262c = false;
        private int b = 0;
        private boolean f = false;

        /* renamed from: a  reason: collision with other field name */
        private List<String> f259a = Collections.emptyList();
        private int c = -1;

        public static a a(byte[] bArr) {
            return (a) new a().a(bArr);
        }

        public static a b(b bVar) {
            return new a().mo1909a(bVar);
        }

        @Override // com.xiaomi.push.e
        /* renamed from: a */
        public int mo1910a() {
            if (this.c < 0) {
                mo1912b();
            }
            return this.c;
        }

        public a a(int i) {
            this.f260a = true;
            this.f24448a = i;
            return this;
        }

        @Override // com.xiaomi.push.e
        /* renamed from: a  reason: collision with other method in class */
        public a mo1909a(b bVar) {
            while (true) {
                int m1715a = bVar.m1715a();
                if (m1715a != 0) {
                    if (m1715a == 8) {
                        a(bVar.c());
                    } else if (m1715a == 16) {
                        a(bVar.m1721a());
                    } else if (m1715a == 24) {
                        b(bVar.m1724b());
                    } else if (m1715a == 32) {
                        b(bVar.m1721a());
                    } else if (m1715a == 42) {
                        a(bVar.m1718a());
                    } else if (!a(bVar, m1715a)) {
                        return this;
                    }
                } else {
                    return this;
                }
            }
        }

        public a a(String str) {
            if (str != null) {
                if (this.f259a.isEmpty()) {
                    this.f259a = new ArrayList();
                }
                this.f259a.add(str);
                return this;
            }
            throw new NullPointerException();
        }

        public a a(boolean z) {
            this.f261b = true;
            this.f262c = z;
            return this;
        }

        @Override // com.xiaomi.push.e
        /* renamed from: a  reason: collision with other method in class */
        public List<String> mo1910a() {
            return this.f259a;
        }

        @Override // com.xiaomi.push.e
        public void a(c cVar) {
            if (mo1910a()) {
                cVar.m1768b(1, c());
            }
            if (m1844c()) {
                cVar.m1760a(2, mo1912b());
            }
            if (m1845d()) {
                cVar.m1755a(3, d());
            }
            if (f()) {
                cVar.m1760a(4, m1846e());
            }
            for (String str : mo1910a()) {
                cVar.m1759a(5, str);
            }
        }

        @Override // com.xiaomi.push.e
        /* renamed from: a */
        public boolean mo1910a() {
            return this.f260a;
        }

        @Override // com.xiaomi.push.e
        /* renamed from: b */
        public int mo1912b() {
            int i = 0;
            int b = mo1910a() ? c.b(1, c()) + 0 : 0;
            if (m1844c()) {
                b += c.a(2, mo1912b());
            }
            if (m1845d()) {
                b += c.a(3, d());
            }
            if (f()) {
                b += c.a(4, m1846e());
            }
            for (String str : mo1910a()) {
                i += c.a(str);
            }
            int size = b + i + (mo1910a().size() * 1);
            this.c = size;
            return size;
        }

        public a b(int i) {
            this.d = true;
            this.b = i;
            return this;
        }

        public a b(boolean z) {
            this.e = true;
            this.f = z;
            return this;
        }

        @Override // com.xiaomi.push.e
        /* renamed from: b  reason: collision with other method in class */
        public boolean mo1912b() {
            return this.f262c;
        }

        public int c() {
            return this.f24448a;
        }

        /* renamed from: c  reason: collision with other method in class */
        public boolean m1844c() {
            return this.f261b;
        }

        public int d() {
            return this.b;
        }

        /* renamed from: d  reason: collision with other method in class */
        public boolean m1845d() {
            return this.d;
        }

        public int e() {
            return this.f259a.size();
        }

        /* renamed from: e  reason: collision with other method in class */
        public boolean m1846e() {
            return this.f;
        }

        public boolean f() {
            return this.e;
        }
    }
}
