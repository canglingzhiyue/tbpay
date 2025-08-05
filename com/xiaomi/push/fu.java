package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;
import tb.riy;

/* loaded from: classes9.dex */
public class fu implements jn<fu, Object>, Serializable, Cloneable {

    /* renamed from: a  reason: collision with other field name */
    public byte f367a;

    /* renamed from: a  reason: collision with other field name */
    public int f368a;

    /* renamed from: a  reason: collision with other field name */
    public String f369a;

    /* renamed from: a  reason: collision with other field name */
    private BitSet f370a = new BitSet(6);

    /* renamed from: b  reason: collision with other field name */
    public int f371b;

    /* renamed from: b  reason: collision with other field name */
    public String f372b;

    /* renamed from: c  reason: collision with other field name */
    public int f373c;

    /* renamed from: c  reason: collision with other field name */
    public String f374c;

    /* renamed from: d  reason: collision with other field name */
    public int f375d;

    /* renamed from: d  reason: collision with other field name */
    public String f376d;

    /* renamed from: e  reason: collision with other field name */
    public int f377e;

    /* renamed from: a  reason: collision with other field name */
    private static final kd f366a = new kd("StatsEvent");

    /* renamed from: a  reason: collision with root package name */
    private static final jv f24482a = new jv("", (byte) 3, 1);
    private static final jv b = new jv("", (byte) 8, 2);
    private static final jv c = new jv("", (byte) 8, 3);
    private static final jv d = new jv("", (byte) 11, 4);
    private static final jv e = new jv("", (byte) 11, 5);
    private static final jv f = new jv("", (byte) 8, 6);
    private static final jv g = new jv("", (byte) 11, 7);
    private static final jv h = new jv("", (byte) 11, 8);
    private static final jv i = new jv("", (byte) 8, 9);
    private static final jv j = new jv("", (byte) 8, 10);

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(fu fuVar) {
        int a2;
        int a3;
        int a4;
        int a5;
        int a6;
        int a7;
        int a8;
        int a9;
        int a10;
        int a11;
        if (!getClass().equals(fuVar.getClass())) {
            return getClass().getName().compareTo(fuVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m1938a()).compareTo(Boolean.valueOf(fuVar.m1938a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m1938a() && (a11 = jo.a(this.f367a, fuVar.f367a)) != 0) {
            return a11;
        }
        int compareTo2 = Boolean.valueOf(b()).compareTo(Boolean.valueOf(fuVar.b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (b() && (a10 = jo.a(this.f368a, fuVar.f368a)) != 0) {
            return a10;
        }
        int compareTo3 = Boolean.valueOf(c()).compareTo(Boolean.valueOf(fuVar.c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (c() && (a9 = jo.a(this.f371b, fuVar.f371b)) != 0) {
            return a9;
        }
        int compareTo4 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(fuVar.d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (d() && (a8 = jo.a(this.f369a, fuVar.f369a)) != 0) {
            return a8;
        }
        int compareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(fuVar.e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (e() && (a7 = jo.a(this.f372b, fuVar.f372b)) != 0) {
            return a7;
        }
        int compareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(fuVar.f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (f() && (a6 = jo.a(this.f373c, fuVar.f373c)) != 0) {
            return a6;
        }
        int compareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(fuVar.g()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (g() && (a5 = jo.a(this.f374c, fuVar.f374c)) != 0) {
            return a5;
        }
        int compareTo8 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(fuVar.h()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (h() && (a4 = jo.a(this.f376d, fuVar.f376d)) != 0) {
            return a4;
        }
        int compareTo9 = Boolean.valueOf(i()).compareTo(Boolean.valueOf(fuVar.i()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (i() && (a3 = jo.a(this.f375d, fuVar.f375d)) != 0) {
            return a3;
        }
        int compareTo10 = Boolean.valueOf(j()).compareTo(Boolean.valueOf(fuVar.j()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (j() && (a2 = jo.a(this.f377e, fuVar.f377e)) != 0) {
            return a2;
        }
        return 0;
    }

    public fu a(byte b2) {
        this.f367a = b2;
        a(true);
        return this;
    }

    public fu a(int i2) {
        this.f368a = i2;
        b(true);
        return this;
    }

    public fu a(String str) {
        this.f369a = str;
        return this;
    }

    public void a() {
        if (this.f369a != null) {
            return;
        }
        throw new jz("Required field 'connpt' was not present! Struct: " + toString());
    }

    @Override // com.xiaomi.push.jn
    public void a(jy jyVar) {
        jyVar.m2198a();
        while (true) {
            jv m2194a = jyVar.m2194a();
            if (m2194a.f24584a == 0) {
                jyVar.f();
                if (!m1938a()) {
                    throw new jz("Required field 'chid' was not found in serialized data! Struct: " + toString());
                } else if (!b()) {
                    throw new jz("Required field 'type' was not found in serialized data! Struct: " + toString());
                } else if (c()) {
                    a();
                    return;
                } else {
                    throw new jz("Required field 'value' was not found in serialized data! Struct: " + toString());
                }
            }
            switch (m2194a.f840a) {
                case 1:
                    if (m2194a.f24584a == 3) {
                        this.f367a = jyVar.mo2206a();
                        a(true);
                        continue;
                        jyVar.g();
                    }
                    break;
                case 2:
                    if (m2194a.f24584a == 8) {
                        this.f368a = jyVar.m2192a();
                        b(true);
                        continue;
                        jyVar.g();
                    }
                    break;
                case 3:
                    if (m2194a.f24584a == 8) {
                        this.f371b = jyVar.m2192a();
                        c(true);
                        continue;
                        jyVar.g();
                    }
                    break;
                case 4:
                    if (m2194a.f24584a == 11) {
                        this.f369a = jyVar.m2199a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 5:
                    if (m2194a.f24584a == 11) {
                        this.f372b = jyVar.m2199a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 6:
                    if (m2194a.f24584a == 8) {
                        this.f373c = jyVar.m2192a();
                        d(true);
                        continue;
                        jyVar.g();
                    }
                    break;
                case 7:
                    if (m2194a.f24584a == 11) {
                        this.f374c = jyVar.m2199a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 8:
                    if (m2194a.f24584a == 11) {
                        this.f376d = jyVar.m2199a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 9:
                    if (m2194a.f24584a == 8) {
                        this.f375d = jyVar.m2192a();
                        e(true);
                        continue;
                        jyVar.g();
                    }
                    break;
                case 10:
                    if (m2194a.f24584a == 8) {
                        this.f377e = jyVar.m2192a();
                        f(true);
                        continue;
                        jyVar.g();
                    }
                    break;
            }
            kb.a(jyVar, m2194a.f24584a);
            jyVar.g();
        }
    }

    public void a(boolean z) {
        this.f370a.set(0, z);
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m1938a() {
        return this.f370a.get(0);
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m1939a(fu fuVar) {
        if (fuVar != null && this.f367a == fuVar.f367a && this.f368a == fuVar.f368a && this.f371b == fuVar.f371b) {
            boolean d2 = d();
            boolean d3 = fuVar.d();
            if ((d2 || d3) && (!d2 || !d3 || !this.f369a.equals(fuVar.f369a))) {
                return false;
            }
            boolean e2 = e();
            boolean e3 = fuVar.e();
            if ((e2 || e3) && (!e2 || !e3 || !this.f372b.equals(fuVar.f372b))) {
                return false;
            }
            boolean f2 = f();
            boolean f3 = fuVar.f();
            if ((f2 || f3) && (!f2 || !f3 || this.f373c != fuVar.f373c)) {
                return false;
            }
            boolean g2 = g();
            boolean g3 = fuVar.g();
            if ((g2 || g3) && (!g2 || !g3 || !this.f374c.equals(fuVar.f374c))) {
                return false;
            }
            boolean h2 = h();
            boolean h3 = fuVar.h();
            if ((h2 || h3) && (!h2 || !h3 || !this.f376d.equals(fuVar.f376d))) {
                return false;
            }
            boolean i2 = i();
            boolean i3 = fuVar.i();
            if ((i2 || i3) && (!i2 || !i3 || this.f375d != fuVar.f375d)) {
                return false;
            }
            boolean j2 = j();
            boolean j3 = fuVar.j();
            if (!j2 && !j3) {
                return true;
            }
            return j2 && j3 && this.f377e == fuVar.f377e;
        }
        return false;
    }

    public fu b(int i2) {
        this.f371b = i2;
        c(true);
        return this;
    }

    public fu b(String str) {
        this.f372b = str;
        return this;
    }

    @Override // com.xiaomi.push.jn
    public void b(jy jyVar) {
        a();
        jyVar.a(f366a);
        jyVar.a(f24482a);
        jyVar.a(this.f367a);
        jyVar.b();
        jyVar.a(b);
        jyVar.mo2190a(this.f368a);
        jyVar.b();
        jyVar.a(c);
        jyVar.mo2190a(this.f371b);
        jyVar.b();
        if (this.f369a != null) {
            jyVar.a(d);
            jyVar.a(this.f369a);
            jyVar.b();
        }
        if (this.f372b != null && e()) {
            jyVar.a(e);
            jyVar.a(this.f372b);
            jyVar.b();
        }
        if (f()) {
            jyVar.a(f);
            jyVar.mo2190a(this.f373c);
            jyVar.b();
        }
        if (this.f374c != null && g()) {
            jyVar.a(g);
            jyVar.a(this.f374c);
            jyVar.b();
        }
        if (this.f376d != null && h()) {
            jyVar.a(h);
            jyVar.a(this.f376d);
            jyVar.b();
        }
        if (i()) {
            jyVar.a(i);
            jyVar.mo2190a(this.f375d);
            jyVar.b();
        }
        if (j()) {
            jyVar.a(j);
            jyVar.mo2190a(this.f377e);
            jyVar.b();
        }
        jyVar.c();
        jyVar.m2202a();
    }

    public void b(boolean z) {
        this.f370a.set(1, z);
    }

    public boolean b() {
        return this.f370a.get(1);
    }

    public fu c(int i2) {
        this.f373c = i2;
        d(true);
        return this;
    }

    public fu c(String str) {
        this.f374c = str;
        return this;
    }

    public void c(boolean z) {
        this.f370a.set(2, z);
    }

    public boolean c() {
        return this.f370a.get(2);
    }

    public fu d(int i2) {
        this.f375d = i2;
        e(true);
        return this;
    }

    public fu d(String str) {
        this.f376d = str;
        return this;
    }

    public void d(boolean z) {
        this.f370a.set(3, z);
    }

    public boolean d() {
        return this.f369a != null;
    }

    public void e(boolean z) {
        this.f370a.set(4, z);
    }

    public boolean e() {
        return this.f372b != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof fu)) {
            return m1939a((fu) obj);
        }
        return false;
    }

    public void f(boolean z) {
        this.f370a.set(5, z);
    }

    public boolean f() {
        return this.f370a.get(3);
    }

    public boolean g() {
        return this.f374c != null;
    }

    public boolean h() {
        return this.f376d != null;
    }

    public int hashCode() {
        return 0;
    }

    public boolean i() {
        return this.f370a.get(4);
    }

    public boolean j() {
        return this.f370a.get(5);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("StatsEvent(");
        sb.append("chid:");
        sb.append((int) this.f367a);
        sb.append(", ");
        sb.append("type:");
        sb.append(this.f368a);
        sb.append(", ");
        sb.append("value:");
        sb.append(this.f371b);
        sb.append(", ");
        sb.append("connpt:");
        String str = this.f369a;
        if (str == null) {
            sb.append("null");
        } else {
            sb.append(str);
        }
        if (e()) {
            sb.append(", ");
            sb.append("host:");
            String str2 = this.f372b;
            if (str2 == null) {
                sb.append("null");
            } else {
                sb.append(str2);
            }
        }
        if (f()) {
            sb.append(", ");
            sb.append("subvalue:");
            sb.append(this.f373c);
        }
        if (g()) {
            sb.append(", ");
            sb.append("annotation:");
            String str3 = this.f374c;
            if (str3 == null) {
                sb.append("null");
            } else {
                sb.append(str3);
            }
        }
        if (h()) {
            sb.append(", ");
            sb.append("user:");
            String str4 = this.f376d;
            if (str4 == null) {
                sb.append("null");
            } else {
                sb.append(str4);
            }
        }
        if (i()) {
            sb.append(", ");
            sb.append("time:");
            sb.append(this.f375d);
        }
        if (j()) {
            sb.append(", ");
            sb.append("clientIp:");
            sb.append(this.f377e);
        }
        sb.append(riy.BRACKET_END_STR);
        return sb.toString();
    }
}
