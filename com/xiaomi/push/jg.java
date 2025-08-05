package com.xiaomi.push;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import tb.riy;

/* loaded from: classes9.dex */
public class jg implements jn<jg, Object>, Serializable, Cloneable {

    /* renamed from: a  reason: collision with other field name */
    public ir f766a;

    /* renamed from: a  reason: collision with other field name */
    public String f767a;

    /* renamed from: a  reason: collision with other field name */
    public List<String> f768a;

    /* renamed from: b  reason: collision with other field name */
    public String f769b;

    /* renamed from: c  reason: collision with other field name */
    public String f770c;

    /* renamed from: d  reason: collision with other field name */
    public String f771d;

    /* renamed from: e  reason: collision with other field name */
    public String f772e;

    /* renamed from: f  reason: collision with other field name */
    public String f773f;

    /* renamed from: a  reason: collision with other field name */
    private static final kd f765a = new kd("XmPushActionSubscription");

    /* renamed from: a  reason: collision with root package name */
    private static final jv f24573a = new jv("", (byte) 11, 1);
    private static final jv b = new jv("", (byte) 12, 2);
    private static final jv c = new jv("", (byte) 11, 3);
    private static final jv d = new jv("", (byte) 11, 4);
    private static final jv e = new jv("", (byte) 11, 5);
    private static final jv f = new jv("", (byte) 11, 6);
    private static final jv g = new jv("", (byte) 11, 7);
    private static final jv h = new jv("", (byte) 15, 8);

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(jg jgVar) {
        int a2;
        int a3;
        int a4;
        int a5;
        int a6;
        int a7;
        int a8;
        int a9;
        if (!getClass().equals(jgVar.getClass())) {
            return getClass().getName().compareTo(jgVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m2160a()).compareTo(Boolean.valueOf(jgVar.m2160a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m2160a() && (a9 = jo.a(this.f767a, jgVar.f767a)) != 0) {
            return a9;
        }
        int compareTo2 = Boolean.valueOf(b()).compareTo(Boolean.valueOf(jgVar.b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (b() && (a8 = jo.a(this.f766a, jgVar.f766a)) != 0) {
            return a8;
        }
        int compareTo3 = Boolean.valueOf(c()).compareTo(Boolean.valueOf(jgVar.c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (c() && (a7 = jo.a(this.f769b, jgVar.f769b)) != 0) {
            return a7;
        }
        int compareTo4 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(jgVar.d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (d() && (a6 = jo.a(this.f770c, jgVar.f770c)) != 0) {
            return a6;
        }
        int compareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(jgVar.e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (e() && (a5 = jo.a(this.f771d, jgVar.f771d)) != 0) {
            return a5;
        }
        int compareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(jgVar.f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (f() && (a4 = jo.a(this.f772e, jgVar.f772e)) != 0) {
            return a4;
        }
        int compareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(jgVar.g()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (g() && (a3 = jo.a(this.f773f, jgVar.f773f)) != 0) {
            return a3;
        }
        int compareTo8 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(jgVar.h()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (h() && (a2 = jo.a(this.f768a, jgVar.f768a)) != 0) {
            return a2;
        }
        return 0;
    }

    public jg a(String str) {
        this.f769b = str;
        return this;
    }

    public void a() {
        if (this.f769b == null) {
            throw new jz("Required field 'id' was not present! Struct: " + toString());
        } else if (this.f770c == null) {
            throw new jz("Required field 'appId' was not present! Struct: " + toString());
        } else if (this.f771d != null) {
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
                        this.f767a = jyVar.m2199a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 2:
                    if (m2194a.f24584a == 12) {
                        this.f766a = new ir();
                        this.f766a.a(jyVar);
                        continue;
                        jyVar.g();
                    }
                    break;
                case 3:
                    if (m2194a.f24584a == 11) {
                        this.f769b = jyVar.m2199a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 4:
                    if (m2194a.f24584a == 11) {
                        this.f770c = jyVar.m2199a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 5:
                    if (m2194a.f24584a == 11) {
                        this.f771d = jyVar.m2199a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 6:
                    if (m2194a.f24584a == 11) {
                        this.f772e = jyVar.m2199a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 7:
                    if (m2194a.f24584a == 11) {
                        this.f773f = jyVar.m2199a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 8:
                    if (m2194a.f24584a == 15) {
                        jw m2195a = jyVar.m2195a();
                        this.f768a = new ArrayList(m2195a.f841a);
                        for (int i = 0; i < m2195a.f841a; i++) {
                            this.f768a.add(jyVar.m2199a());
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
    public boolean m2160a() {
        return this.f767a != null;
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m2161a(jg jgVar) {
        if (jgVar == null) {
            return false;
        }
        boolean m2160a = m2160a();
        boolean m2160a2 = jgVar.m2160a();
        if ((m2160a || m2160a2) && (!m2160a || !m2160a2 || !this.f767a.equals(jgVar.f767a))) {
            return false;
        }
        boolean b2 = b();
        boolean b3 = jgVar.b();
        if ((b2 || b3) && (!b2 || !b3 || !this.f766a.m2080a(jgVar.f766a))) {
            return false;
        }
        boolean c2 = c();
        boolean c3 = jgVar.c();
        if ((c2 || c3) && (!c2 || !c3 || !this.f769b.equals(jgVar.f769b))) {
            return false;
        }
        boolean d2 = d();
        boolean d3 = jgVar.d();
        if ((d2 || d3) && (!d2 || !d3 || !this.f770c.equals(jgVar.f770c))) {
            return false;
        }
        boolean e2 = e();
        boolean e3 = jgVar.e();
        if ((e2 || e3) && (!e2 || !e3 || !this.f771d.equals(jgVar.f771d))) {
            return false;
        }
        boolean f2 = f();
        boolean f3 = jgVar.f();
        if ((f2 || f3) && (!f2 || !f3 || !this.f772e.equals(jgVar.f772e))) {
            return false;
        }
        boolean g2 = g();
        boolean g3 = jgVar.g();
        if ((g2 || g3) && (!g2 || !g3 || !this.f773f.equals(jgVar.f773f))) {
            return false;
        }
        boolean h2 = h();
        boolean h3 = jgVar.h();
        if (!h2 && !h3) {
            return true;
        }
        return h2 && h3 && this.f768a.equals(jgVar.f768a);
    }

    public jg b(String str) {
        this.f770c = str;
        return this;
    }

    @Override // com.xiaomi.push.jn
    public void b(jy jyVar) {
        a();
        jyVar.a(f765a);
        if (this.f767a != null && m2160a()) {
            jyVar.a(f24573a);
            jyVar.a(this.f767a);
            jyVar.b();
        }
        if (this.f766a != null && b()) {
            jyVar.a(b);
            this.f766a.b(jyVar);
            jyVar.b();
        }
        if (this.f769b != null) {
            jyVar.a(c);
            jyVar.a(this.f769b);
            jyVar.b();
        }
        if (this.f770c != null) {
            jyVar.a(d);
            jyVar.a(this.f770c);
            jyVar.b();
        }
        if (this.f771d != null) {
            jyVar.a(e);
            jyVar.a(this.f771d);
            jyVar.b();
        }
        if (this.f772e != null && f()) {
            jyVar.a(f);
            jyVar.a(this.f772e);
            jyVar.b();
        }
        if (this.f773f != null && g()) {
            jyVar.a(g);
            jyVar.a(this.f773f);
            jyVar.b();
        }
        if (this.f768a != null && h()) {
            jyVar.a(h);
            jyVar.a(new jw((byte) 11, this.f768a.size()));
            for (String str : this.f768a) {
                jyVar.a(str);
            }
            jyVar.e();
            jyVar.b();
        }
        jyVar.c();
        jyVar.m2202a();
    }

    public boolean b() {
        return this.f766a != null;
    }

    public jg c(String str) {
        this.f771d = str;
        return this;
    }

    public boolean c() {
        return this.f769b != null;
    }

    public jg d(String str) {
        this.f772e = str;
        return this;
    }

    public boolean d() {
        return this.f770c != null;
    }

    public jg e(String str) {
        this.f773f = str;
        return this;
    }

    public boolean e() {
        return this.f771d != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof jg)) {
            return m2161a((jg) obj);
        }
        return false;
    }

    public boolean f() {
        return this.f772e != null;
    }

    public boolean g() {
        return this.f773f != null;
    }

    public boolean h() {
        return this.f768a != null;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("XmPushActionSubscription(");
        if (m2160a()) {
            sb.append("debug:");
            String str = this.f767a;
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
            ir irVar = this.f766a;
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
        String str2 = this.f769b;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(str2);
        }
        sb.append(", ");
        sb.append("appId:");
        String str3 = this.f770c;
        if (str3 == null) {
            sb.append("null");
        } else {
            sb.append(str3);
        }
        sb.append(", ");
        sb.append("topic:");
        String str4 = this.f771d;
        if (str4 == null) {
            sb.append("null");
        } else {
            sb.append(str4);
        }
        if (f()) {
            sb.append(", ");
            sb.append("packageName:");
            String str5 = this.f772e;
            if (str5 == null) {
                sb.append("null");
            } else {
                sb.append(str5);
            }
        }
        if (g()) {
            sb.append(", ");
            sb.append("category:");
            String str6 = this.f773f;
            if (str6 == null) {
                sb.append("null");
            } else {
                sb.append(str6);
            }
        }
        if (h()) {
            sb.append(", ");
            sb.append("aliases:");
            List<String> list = this.f768a;
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
