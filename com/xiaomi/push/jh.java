package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;
import tb.riy;

/* loaded from: classes9.dex */
public class jh implements jn<jh, Object>, Serializable, Cloneable {

    /* renamed from: a  reason: collision with other field name */
    public long f775a;

    /* renamed from: a  reason: collision with other field name */
    public ir f776a;

    /* renamed from: a  reason: collision with other field name */
    public String f777a;

    /* renamed from: a  reason: collision with other field name */
    private BitSet f778a = new BitSet(1);

    /* renamed from: b  reason: collision with other field name */
    public String f779b;

    /* renamed from: c  reason: collision with other field name */
    public String f780c;

    /* renamed from: d  reason: collision with other field name */
    public String f781d;

    /* renamed from: e  reason: collision with other field name */
    public String f782e;

    /* renamed from: f  reason: collision with other field name */
    public String f783f;

    /* renamed from: g  reason: collision with other field name */
    public String f784g;

    /* renamed from: a  reason: collision with other field name */
    private static final kd f774a = new kd("XmPushActionSubscriptionResult");

    /* renamed from: a  reason: collision with root package name */
    private static final jv f24574a = new jv("", (byte) 11, 1);
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
    public int compareTo(jh jhVar) {
        int a2;
        int a3;
        int a4;
        int a5;
        int a6;
        int a7;
        int a8;
        int a9;
        int a10;
        if (!getClass().equals(jhVar.getClass())) {
            return getClass().getName().compareTo(jhVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m2163a()).compareTo(Boolean.valueOf(jhVar.m2163a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m2163a() && (a10 = jo.a(this.f777a, jhVar.f777a)) != 0) {
            return a10;
        }
        int compareTo2 = Boolean.valueOf(m2165b()).compareTo(Boolean.valueOf(jhVar.m2165b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (m2165b() && (a9 = jo.a(this.f776a, jhVar.f776a)) != 0) {
            return a9;
        }
        int compareTo3 = Boolean.valueOf(m2166c()).compareTo(Boolean.valueOf(jhVar.m2166c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (m2166c() && (a8 = jo.a(this.f779b, jhVar.f779b)) != 0) {
            return a8;
        }
        int compareTo4 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(jhVar.d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (d() && (a7 = jo.a(this.f780c, jhVar.f780c)) != 0) {
            return a7;
        }
        int compareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(jhVar.e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (e() && (a6 = jo.a(this.f775a, jhVar.f775a)) != 0) {
            return a6;
        }
        int compareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(jhVar.f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (f() && (a5 = jo.a(this.f781d, jhVar.f781d)) != 0) {
            return a5;
        }
        int compareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(jhVar.g()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (g() && (a4 = jo.a(this.f782e, jhVar.f782e)) != 0) {
            return a4;
        }
        int compareTo8 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(jhVar.h()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (h() && (a3 = jo.a(this.f783f, jhVar.f783f)) != 0) {
            return a3;
        }
        int compareTo9 = Boolean.valueOf(i()).compareTo(Boolean.valueOf(jhVar.i()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (i() && (a2 = jo.a(this.f784g, jhVar.f784g)) != 0) {
            return a2;
        }
        return 0;
    }

    public String a() {
        return this.f779b;
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m2162a() {
        if (this.f779b != null) {
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
                m2162a();
                return;
            }
            switch (m2194a.f840a) {
                case 1:
                    if (m2194a.f24584a == 11) {
                        this.f777a = jyVar.m2199a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 2:
                    if (m2194a.f24584a == 12) {
                        this.f776a = new ir();
                        this.f776a.a(jyVar);
                        continue;
                        jyVar.g();
                    }
                    break;
                case 3:
                    if (m2194a.f24584a == 11) {
                        this.f779b = jyVar.m2199a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 4:
                    if (m2194a.f24584a == 11) {
                        this.f780c = jyVar.m2199a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 6:
                    if (m2194a.f24584a == 10) {
                        this.f775a = jyVar.m2193a();
                        a(true);
                        continue;
                        jyVar.g();
                    }
                    break;
                case 7:
                    if (m2194a.f24584a == 11) {
                        this.f781d = jyVar.m2199a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 8:
                    if (m2194a.f24584a == 11) {
                        this.f782e = jyVar.m2199a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 9:
                    if (m2194a.f24584a == 11) {
                        this.f783f = jyVar.m2199a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 10:
                    if (m2194a.f24584a == 11) {
                        this.f784g = jyVar.m2199a();
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
        this.f778a.set(0, z);
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m2163a() {
        return this.f777a != null;
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m2164a(jh jhVar) {
        if (jhVar == null) {
            return false;
        }
        boolean m2163a = m2163a();
        boolean m2163a2 = jhVar.m2163a();
        if ((m2163a || m2163a2) && (!m2163a || !m2163a2 || !this.f777a.equals(jhVar.f777a))) {
            return false;
        }
        boolean m2165b = m2165b();
        boolean m2165b2 = jhVar.m2165b();
        if ((m2165b || m2165b2) && (!m2165b || !m2165b2 || !this.f776a.m2080a(jhVar.f776a))) {
            return false;
        }
        boolean m2166c = m2166c();
        boolean m2166c2 = jhVar.m2166c();
        if ((m2166c || m2166c2) && (!m2166c || !m2166c2 || !this.f779b.equals(jhVar.f779b))) {
            return false;
        }
        boolean d2 = d();
        boolean d3 = jhVar.d();
        if ((d2 || d3) && (!d2 || !d3 || !this.f780c.equals(jhVar.f780c))) {
            return false;
        }
        boolean e2 = e();
        boolean e3 = jhVar.e();
        if ((e2 || e3) && (!e2 || !e3 || this.f775a != jhVar.f775a)) {
            return false;
        }
        boolean f2 = f();
        boolean f3 = jhVar.f();
        if ((f2 || f3) && (!f2 || !f3 || !this.f781d.equals(jhVar.f781d))) {
            return false;
        }
        boolean g2 = g();
        boolean g3 = jhVar.g();
        if ((g2 || g3) && (!g2 || !g3 || !this.f782e.equals(jhVar.f782e))) {
            return false;
        }
        boolean h2 = h();
        boolean h3 = jhVar.h();
        if ((h2 || h3) && (!h2 || !h3 || !this.f783f.equals(jhVar.f783f))) {
            return false;
        }
        boolean i2 = i();
        boolean i3 = jhVar.i();
        if (!i2 && !i3) {
            return true;
        }
        return i2 && i3 && this.f784g.equals(jhVar.f784g);
    }

    public String b() {
        return this.f782e;
    }

    @Override // com.xiaomi.push.jn
    public void b(jy jyVar) {
        m2162a();
        jyVar.a(f774a);
        if (this.f777a != null && m2163a()) {
            jyVar.a(f24574a);
            jyVar.a(this.f777a);
            jyVar.b();
        }
        if (this.f776a != null && m2165b()) {
            jyVar.a(b);
            this.f776a.b(jyVar);
            jyVar.b();
        }
        if (this.f779b != null) {
            jyVar.a(c);
            jyVar.a(this.f779b);
            jyVar.b();
        }
        if (this.f780c != null && d()) {
            jyVar.a(d);
            jyVar.a(this.f780c);
            jyVar.b();
        }
        if (e()) {
            jyVar.a(e);
            jyVar.a(this.f775a);
            jyVar.b();
        }
        if (this.f781d != null && f()) {
            jyVar.a(f);
            jyVar.a(this.f781d);
            jyVar.b();
        }
        if (this.f782e != null && g()) {
            jyVar.a(g);
            jyVar.a(this.f782e);
            jyVar.b();
        }
        if (this.f783f != null && h()) {
            jyVar.a(h);
            jyVar.a(this.f783f);
            jyVar.b();
        }
        if (this.f784g != null && i()) {
            jyVar.a(i);
            jyVar.a(this.f784g);
            jyVar.b();
        }
        jyVar.c();
        jyVar.m2202a();
    }

    /* renamed from: b  reason: collision with other method in class */
    public boolean m2165b() {
        return this.f776a != null;
    }

    public String c() {
        return this.f784g;
    }

    /* renamed from: c  reason: collision with other method in class */
    public boolean m2166c() {
        return this.f779b != null;
    }

    public boolean d() {
        return this.f780c != null;
    }

    public boolean e() {
        return this.f778a.get(0);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof jh)) {
            return m2164a((jh) obj);
        }
        return false;
    }

    public boolean f() {
        return this.f781d != null;
    }

    public boolean g() {
        return this.f782e != null;
    }

    public boolean h() {
        return this.f783f != null;
    }

    public int hashCode() {
        return 0;
    }

    public boolean i() {
        return this.f784g != null;
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("XmPushActionSubscriptionResult(");
        if (m2163a()) {
            sb.append("debug:");
            String str = this.f777a;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
            z = false;
        } else {
            z = true;
        }
        if (m2165b()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("target:");
            ir irVar = this.f776a;
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
        String str2 = this.f779b;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(str2);
        }
        if (d()) {
            sb.append(", ");
            sb.append("appId:");
            String str3 = this.f780c;
            if (str3 == null) {
                sb.append("null");
            } else {
                sb.append(str3);
            }
        }
        if (e()) {
            sb.append(", ");
            sb.append("errorCode:");
            sb.append(this.f775a);
        }
        if (f()) {
            sb.append(", ");
            sb.append("reason:");
            String str4 = this.f781d;
            if (str4 == null) {
                sb.append("null");
            } else {
                sb.append(str4);
            }
        }
        if (g()) {
            sb.append(", ");
            sb.append("topic:");
            String str5 = this.f782e;
            if (str5 == null) {
                sb.append("null");
            } else {
                sb.append(str5);
            }
        }
        if (h()) {
            sb.append(", ");
            sb.append("packageName:");
            String str6 = this.f783f;
            if (str6 == null) {
                sb.append("null");
            } else {
                sb.append(str6);
            }
        }
        if (i()) {
            sb.append(", ");
            sb.append("category:");
            String str7 = this.f784g;
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
