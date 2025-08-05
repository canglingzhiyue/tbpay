package com.xiaomi.push;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import tb.riy;

/* loaded from: classes9.dex */
public class jk implements jn<jk, Object>, Serializable, Cloneable {

    /* renamed from: a  reason: collision with other field name */
    public ir f811a;

    /* renamed from: a  reason: collision with other field name */
    public String f812a;

    /* renamed from: a  reason: collision with other field name */
    public List<String> f813a;

    /* renamed from: b  reason: collision with other field name */
    public String f814b;

    /* renamed from: c  reason: collision with other field name */
    public String f815c;

    /* renamed from: d  reason: collision with other field name */
    public String f816d;

    /* renamed from: e  reason: collision with other field name */
    public String f817e;

    /* renamed from: f  reason: collision with other field name */
    public String f818f;

    /* renamed from: a  reason: collision with other field name */
    private static final kd f810a = new kd("XmPushActionUnSubscription");

    /* renamed from: a  reason: collision with root package name */
    private static final jv f24577a = new jv("", (byte) 11, 1);
    private static final jv b = new jv("", (byte) 12, 2);
    private static final jv c = new jv("", (byte) 11, 3);
    private static final jv d = new jv("", (byte) 11, 4);
    private static final jv e = new jv("", (byte) 11, 5);
    private static final jv f = new jv("", (byte) 11, 6);
    private static final jv g = new jv("", (byte) 11, 7);
    private static final jv h = new jv("", (byte) 15, 8);

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(jk jkVar) {
        int a2;
        int a3;
        int a4;
        int a5;
        int a6;
        int a7;
        int a8;
        int a9;
        if (!getClass().equals(jkVar.getClass())) {
            return getClass().getName().compareTo(jkVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m2172a()).compareTo(Boolean.valueOf(jkVar.m2172a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m2172a() && (a9 = jo.a(this.f812a, jkVar.f812a)) != 0) {
            return a9;
        }
        int compareTo2 = Boolean.valueOf(b()).compareTo(Boolean.valueOf(jkVar.b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (b() && (a8 = jo.a(this.f811a, jkVar.f811a)) != 0) {
            return a8;
        }
        int compareTo3 = Boolean.valueOf(c()).compareTo(Boolean.valueOf(jkVar.c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (c() && (a7 = jo.a(this.f814b, jkVar.f814b)) != 0) {
            return a7;
        }
        int compareTo4 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(jkVar.d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (d() && (a6 = jo.a(this.f815c, jkVar.f815c)) != 0) {
            return a6;
        }
        int compareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(jkVar.e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (e() && (a5 = jo.a(this.f816d, jkVar.f816d)) != 0) {
            return a5;
        }
        int compareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(jkVar.f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (f() && (a4 = jo.a(this.f817e, jkVar.f817e)) != 0) {
            return a4;
        }
        int compareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(jkVar.g()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (g() && (a3 = jo.a(this.f818f, jkVar.f818f)) != 0) {
            return a3;
        }
        int compareTo8 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(jkVar.h()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (h() && (a2 = jo.a(this.f813a, jkVar.f813a)) != 0) {
            return a2;
        }
        return 0;
    }

    public jk a(String str) {
        this.f814b = str;
        return this;
    }

    public void a() {
        if (this.f814b == null) {
            throw new jz("Required field 'id' was not present! Struct: " + toString());
        } else if (this.f815c == null) {
            throw new jz("Required field 'appId' was not present! Struct: " + toString());
        } else if (this.f816d != null) {
        } else {
            throw new jz("Required field 'topic' was not present! Struct: " + toString());
        }
    }

    @Override // com.xiaomi.push.jn
    public void a(jy jyVar) {
        jyVar.m2198a();
        while (true) {
            jv m2194a = jyVar.m2194a();
            if (m2194a.f24584a == 0) {
                jyVar.f();
                a();
                return;
            }
            switch (m2194a.f840a) {
                case 1:
                    if (m2194a.f24584a == 11) {
                        this.f812a = jyVar.m2199a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 2:
                    if (m2194a.f24584a == 12) {
                        this.f811a = new ir();
                        this.f811a.a(jyVar);
                        continue;
                        jyVar.g();
                    }
                    break;
                case 3:
                    if (m2194a.f24584a == 11) {
                        this.f814b = jyVar.m2199a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 4:
                    if (m2194a.f24584a == 11) {
                        this.f815c = jyVar.m2199a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 5:
                    if (m2194a.f24584a == 11) {
                        this.f816d = jyVar.m2199a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 6:
                    if (m2194a.f24584a == 11) {
                        this.f817e = jyVar.m2199a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 7:
                    if (m2194a.f24584a == 11) {
                        this.f818f = jyVar.m2199a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 8:
                    if (m2194a.f24584a == 15) {
                        jw m2195a = jyVar.m2195a();
                        this.f813a = new ArrayList(m2195a.f841a);
                        for (int i = 0; i < m2195a.f841a; i++) {
                            this.f813a.add(jyVar.m2199a());
                        }
                        jyVar.i();
                        continue;
                        jyVar.g();
                    }
                    break;
            }
            kb.a(jyVar, m2194a.f24584a);
            jyVar.g();
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m2172a() {
        return this.f812a != null;
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m2173a(jk jkVar) {
        if (jkVar == null) {
            return false;
        }
        boolean m2172a = m2172a();
        boolean m2172a2 = jkVar.m2172a();
        if ((m2172a || m2172a2) && (!m2172a || !m2172a2 || !this.f812a.equals(jkVar.f812a))) {
            return false;
        }
        boolean b2 = b();
        boolean b3 = jkVar.b();
        if ((b2 || b3) && (!b2 || !b3 || !this.f811a.m2080a(jkVar.f811a))) {
            return false;
        }
        boolean c2 = c();
        boolean c3 = jkVar.c();
        if ((c2 || c3) && (!c2 || !c3 || !this.f814b.equals(jkVar.f814b))) {
            return false;
        }
        boolean d2 = d();
        boolean d3 = jkVar.d();
        if ((d2 || d3) && (!d2 || !d3 || !this.f815c.equals(jkVar.f815c))) {
            return false;
        }
        boolean e2 = e();
        boolean e3 = jkVar.e();
        if ((e2 || e3) && (!e2 || !e3 || !this.f816d.equals(jkVar.f816d))) {
            return false;
        }
        boolean f2 = f();
        boolean f3 = jkVar.f();
        if ((f2 || f3) && (!f2 || !f3 || !this.f817e.equals(jkVar.f817e))) {
            return false;
        }
        boolean g2 = g();
        boolean g3 = jkVar.g();
        if ((g2 || g3) && (!g2 || !g3 || !this.f818f.equals(jkVar.f818f))) {
            return false;
        }
        boolean h2 = h();
        boolean h3 = jkVar.h();
        if (!h2 && !h3) {
            return true;
        }
        return h2 && h3 && this.f813a.equals(jkVar.f813a);
    }

    public jk b(String str) {
        this.f815c = str;
        return this;
    }

    @Override // com.xiaomi.push.jn
    public void b(jy jyVar) {
        a();
        jyVar.a(f810a);
        if (this.f812a != null && m2172a()) {
            jyVar.a(f24577a);
            jyVar.a(this.f812a);
            jyVar.b();
        }
        if (this.f811a != null && b()) {
            jyVar.a(b);
            this.f811a.b(jyVar);
            jyVar.b();
        }
        if (this.f814b != null) {
            jyVar.a(c);
            jyVar.a(this.f814b);
            jyVar.b();
        }
        if (this.f815c != null) {
            jyVar.a(d);
            jyVar.a(this.f815c);
            jyVar.b();
        }
        if (this.f816d != null) {
            jyVar.a(e);
            jyVar.a(this.f816d);
            jyVar.b();
        }
        if (this.f817e != null && f()) {
            jyVar.a(f);
            jyVar.a(this.f817e);
            jyVar.b();
        }
        if (this.f818f != null && g()) {
            jyVar.a(g);
            jyVar.a(this.f818f);
            jyVar.b();
        }
        if (this.f813a != null && h()) {
            jyVar.a(h);
            jyVar.a(new jw((byte) 11, this.f813a.size()));
            for (String str : this.f813a) {
                jyVar.a(str);
            }
            jyVar.e();
            jyVar.b();
        }
        jyVar.c();
        jyVar.m2202a();
    }

    public boolean b() {
        return this.f811a != null;
    }

    public jk c(String str) {
        this.f816d = str;
        return this;
    }

    public boolean c() {
        return this.f814b != null;
    }

    public jk d(String str) {
        this.f817e = str;
        return this;
    }

    public boolean d() {
        return this.f815c != null;
    }

    public jk e(String str) {
        this.f818f = str;
        return this;
    }

    public boolean e() {
        return this.f816d != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof jk)) {
            return m2173a((jk) obj);
        }
        return false;
    }

    public boolean f() {
        return this.f817e != null;
    }

    public boolean g() {
        return this.f818f != null;
    }

    public boolean h() {
        return this.f813a != null;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("XmPushActionUnSubscription(");
        if (m2172a()) {
            sb.append("debug:");
            String str = this.f812a;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
            z = false;
        } else {
            z = true;
        }
        if (b()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("target:");
            ir irVar = this.f811a;
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
        String str2 = this.f814b;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(str2);
        }
        sb.append(", ");
        sb.append("appId:");
        String str3 = this.f815c;
        if (str3 == null) {
            sb.append("null");
        } else {
            sb.append(str3);
        }
        sb.append(", ");
        sb.append("topic:");
        String str4 = this.f816d;
        if (str4 == null) {
            sb.append("null");
        } else {
            sb.append(str4);
        }
        if (f()) {
            sb.append(", ");
            sb.append("packageName:");
            String str5 = this.f817e;
            if (str5 == null) {
                sb.append("null");
            } else {
                sb.append(str5);
            }
        }
        if (g()) {
            sb.append(", ");
            sb.append("category:");
            String str6 = this.f818f;
            if (str6 == null) {
                sb.append("null");
            } else {
                sb.append(str6);
            }
        }
        if (h()) {
            sb.append(", ");
            sb.append("aliases:");
            List<String> list = this.f813a;
            if (list == null) {
                sb.append("null");
            } else {
                sb.append(list);
            }
        }
        sb.append(riy.BRACKET_END_STR);
        return sb.toString();
    }
}
