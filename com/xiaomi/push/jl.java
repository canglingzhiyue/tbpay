package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;
import tb.riy;

/* loaded from: classes9.dex */
public class jl implements jn<jl, Object>, Serializable, Cloneable {

    /* renamed from: a  reason: collision with other field name */
    public long f820a;

    /* renamed from: a  reason: collision with other field name */
    public ir f821a;

    /* renamed from: a  reason: collision with other field name */
    public String f822a;

    /* renamed from: a  reason: collision with other field name */
    private BitSet f823a = new BitSet(1);

    /* renamed from: b  reason: collision with other field name */
    public String f824b;

    /* renamed from: c  reason: collision with other field name */
    public String f825c;

    /* renamed from: d  reason: collision with other field name */
    public String f826d;

    /* renamed from: e  reason: collision with other field name */
    public String f827e;

    /* renamed from: f  reason: collision with other field name */
    public String f828f;

    /* renamed from: g  reason: collision with other field name */
    public String f829g;

    /* renamed from: a  reason: collision with other field name */
    private static final kd f819a = new kd("XmPushActionUnSubscriptionResult");

    /* renamed from: a  reason: collision with root package name */
    private static final jv f24578a = new jv("", (byte) 11, 1);
    private static final jv b = new jv("", (byte) 12, 2);
    private static final jv c = new jv("", (byte) 11, 3);
    private static final jv d = new jv("", (byte) 11, 4);
    private static final jv e = new jv("", (byte) 10, 6);
    private static final jv f = new jv("", (byte) 11, 7);
    private static final jv g = new jv("", (byte) 11, 8);
    private static final jv h = new jv("", (byte) 11, 9);
    private static final jv i = new jv("", (byte) 11, 10);

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(jl jlVar) {
        int a2;
        int a3;
        int a4;
        int a5;
        int a6;
        int a7;
        int a8;
        int a9;
        int a10;
        if (!getClass().equals(jlVar.getClass())) {
            return getClass().getName().compareTo(jlVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m2175a()).compareTo(Boolean.valueOf(jlVar.m2175a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m2175a() && (a10 = jo.a(this.f822a, jlVar.f822a)) != 0) {
            return a10;
        }
        int compareTo2 = Boolean.valueOf(m2177b()).compareTo(Boolean.valueOf(jlVar.m2177b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (m2177b() && (a9 = jo.a(this.f821a, jlVar.f821a)) != 0) {
            return a9;
        }
        int compareTo3 = Boolean.valueOf(m2178c()).compareTo(Boolean.valueOf(jlVar.m2178c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (m2178c() && (a8 = jo.a(this.f824b, jlVar.f824b)) != 0) {
            return a8;
        }
        int compareTo4 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(jlVar.d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (d() && (a7 = jo.a(this.f825c, jlVar.f825c)) != 0) {
            return a7;
        }
        int compareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(jlVar.e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (e() && (a6 = jo.a(this.f820a, jlVar.f820a)) != 0) {
            return a6;
        }
        int compareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(jlVar.f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (f() && (a5 = jo.a(this.f826d, jlVar.f826d)) != 0) {
            return a5;
        }
        int compareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(jlVar.g()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (g() && (a4 = jo.a(this.f827e, jlVar.f827e)) != 0) {
            return a4;
        }
        int compareTo8 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(jlVar.h()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (h() && (a3 = jo.a(this.f828f, jlVar.f828f)) != 0) {
            return a3;
        }
        int compareTo9 = Boolean.valueOf(i()).compareTo(Boolean.valueOf(jlVar.i()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (i() && (a2 = jo.a(this.f829g, jlVar.f829g)) != 0) {
            return a2;
        }
        return 0;
    }

    public String a() {
        return this.f824b;
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m2174a() {
        if (this.f824b != null) {
            return;
        }
        throw new jz("Required field 'id' was not present! Struct: " + toString());
    }

    @Override // com.xiaomi.push.jn
    public void a(jy jyVar) {
        jyVar.m2198a();
        while (true) {
            jv m2194a = jyVar.m2194a();
            if (m2194a.f24584a == 0) {
                jyVar.f();
                m2174a();
                return;
            }
            switch (m2194a.f840a) {
                case 1:
                    if (m2194a.f24584a == 11) {
                        this.f822a = jyVar.m2199a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 2:
                    if (m2194a.f24584a == 12) {
                        this.f821a = new ir();
                        this.f821a.a(jyVar);
                        continue;
                        jyVar.g();
                    }
                    break;
                case 3:
                    if (m2194a.f24584a == 11) {
                        this.f824b = jyVar.m2199a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 4:
                    if (m2194a.f24584a == 11) {
                        this.f825c = jyVar.m2199a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 6:
                    if (m2194a.f24584a == 10) {
                        this.f820a = jyVar.m2193a();
                        a(true);
                        continue;
                        jyVar.g();
                    }
                    break;
                case 7:
                    if (m2194a.f24584a == 11) {
                        this.f826d = jyVar.m2199a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 8:
                    if (m2194a.f24584a == 11) {
                        this.f827e = jyVar.m2199a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 9:
                    if (m2194a.f24584a == 11) {
                        this.f828f = jyVar.m2199a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 10:
                    if (m2194a.f24584a == 11) {
                        this.f829g = jyVar.m2199a();
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
        this.f823a.set(0, z);
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m2175a() {
        return this.f822a != null;
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m2176a(jl jlVar) {
        if (jlVar == null) {
            return false;
        }
        boolean m2175a = m2175a();
        boolean m2175a2 = jlVar.m2175a();
        if ((m2175a || m2175a2) && (!m2175a || !m2175a2 || !this.f822a.equals(jlVar.f822a))) {
            return false;
        }
        boolean m2177b = m2177b();
        boolean m2177b2 = jlVar.m2177b();
        if ((m2177b || m2177b2) && (!m2177b || !m2177b2 || !this.f821a.m2080a(jlVar.f821a))) {
            return false;
        }
        boolean m2178c = m2178c();
        boolean m2178c2 = jlVar.m2178c();
        if ((m2178c || m2178c2) && (!m2178c || !m2178c2 || !this.f824b.equals(jlVar.f824b))) {
            return false;
        }
        boolean d2 = d();
        boolean d3 = jlVar.d();
        if ((d2 || d3) && (!d2 || !d3 || !this.f825c.equals(jlVar.f825c))) {
            return false;
        }
        boolean e2 = e();
        boolean e3 = jlVar.e();
        if ((e2 || e3) && (!e2 || !e3 || this.f820a != jlVar.f820a)) {
            return false;
        }
        boolean f2 = f();
        boolean f3 = jlVar.f();
        if ((f2 || f3) && (!f2 || !f3 || !this.f826d.equals(jlVar.f826d))) {
            return false;
        }
        boolean g2 = g();
        boolean g3 = jlVar.g();
        if ((g2 || g3) && (!g2 || !g3 || !this.f827e.equals(jlVar.f827e))) {
            return false;
        }
        boolean h2 = h();
        boolean h3 = jlVar.h();
        if ((h2 || h3) && (!h2 || !h3 || !this.f828f.equals(jlVar.f828f))) {
            return false;
        }
        boolean i2 = i();
        boolean i3 = jlVar.i();
        if (!i2 && !i3) {
            return true;
        }
        return i2 && i3 && this.f829g.equals(jlVar.f829g);
    }

    public String b() {
        return this.f827e;
    }

    @Override // com.xiaomi.push.jn
    public void b(jy jyVar) {
        m2174a();
        jyVar.a(f819a);
        if (this.f822a != null && m2175a()) {
            jyVar.a(f24578a);
            jyVar.a(this.f822a);
            jyVar.b();
        }
        if (this.f821a != null && m2177b()) {
            jyVar.a(b);
            this.f821a.b(jyVar);
            jyVar.b();
        }
        if (this.f824b != null) {
            jyVar.a(c);
            jyVar.a(this.f824b);
            jyVar.b();
        }
        if (this.f825c != null && d()) {
            jyVar.a(d);
            jyVar.a(this.f825c);
            jyVar.b();
        }
        if (e()) {
            jyVar.a(e);
            jyVar.a(this.f820a);
            jyVar.b();
        }
        if (this.f826d != null && f()) {
            jyVar.a(f);
            jyVar.a(this.f826d);
            jyVar.b();
        }
        if (this.f827e != null && g()) {
            jyVar.a(g);
            jyVar.a(this.f827e);
            jyVar.b();
        }
        if (this.f828f != null && h()) {
            jyVar.a(h);
            jyVar.a(this.f828f);
            jyVar.b();
        }
        if (this.f829g != null && i()) {
            jyVar.a(i);
            jyVar.a(this.f829g);
            jyVar.b();
        }
        jyVar.c();
        jyVar.m2202a();
    }

    /* renamed from: b  reason: collision with other method in class */
    public boolean m2177b() {
        return this.f821a != null;
    }

    public String c() {
        return this.f829g;
    }

    /* renamed from: c  reason: collision with other method in class */
    public boolean m2178c() {
        return this.f824b != null;
    }

    public boolean d() {
        return this.f825c != null;
    }

    public boolean e() {
        return this.f823a.get(0);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof jl)) {
            return m2176a((jl) obj);
        }
        return false;
    }

    public boolean f() {
        return this.f826d != null;
    }

    public boolean g() {
        return this.f827e != null;
    }

    public boolean h() {
        return this.f828f != null;
    }

    public int hashCode() {
        return 0;
    }

    public boolean i() {
        return this.f829g != null;
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("XmPushActionUnSubscriptionResult(");
        if (m2175a()) {
            sb.append("debug:");
            String str = this.f822a;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
            z = false;
        } else {
            z = true;
        }
        if (m2177b()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("target:");
            ir irVar = this.f821a;
            if (irVar == null) {
                sb.append("null");
            } else {
                sb.append(irVar);
            }
            z = false;
        }
        if (!z) {
            sb.append(", ");
        }
        sb.append("id:");
        String str2 = this.f824b;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(str2);
        }
        if (d()) {
            sb.append(", ");
            sb.append("appId:");
            String str3 = this.f825c;
            if (str3 == null) {
                sb.append("null");
            } else {
                sb.append(str3);
            }
        }
        if (e()) {
            sb.append(", ");
            sb.append("errorCode:");
            sb.append(this.f820a);
        }
        if (f()) {
            sb.append(", ");
            sb.append("reason:");
            String str4 = this.f826d;
            if (str4 == null) {
                sb.append("null");
            } else {
                sb.append(str4);
            }
        }
        if (g()) {
            sb.append(", ");
            sb.append("topic:");
            String str5 = this.f827e;
            if (str5 == null) {
                sb.append("null");
            } else {
                sb.append(str5);
            }
        }
        if (h()) {
            sb.append(", ");
            sb.append("packageName:");
            String str6 = this.f828f;
            if (str6 == null) {
                sb.append("null");
            } else {
                sb.append(str6);
            }
        }
        if (i()) {
            sb.append(", ");
            sb.append("category:");
            String str7 = this.f829g;
            if (str7 == null) {
                sb.append("null");
            } else {
                sb.append(str7);
            }
        }
        sb.append(riy.BRACKET_END_STR);
        return sb.toString();
    }
}
