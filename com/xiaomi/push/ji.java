package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;
import tb.riy;

/* loaded from: classes9.dex */
public class ji implements jn<ji, Object>, Serializable, Cloneable {

    /* renamed from: a  reason: collision with other field name */
    public long f786a;

    /* renamed from: a  reason: collision with other field name */
    public ir f787a;

    /* renamed from: a  reason: collision with other field name */
    public String f788a;

    /* renamed from: a  reason: collision with other field name */
    private BitSet f789a = new BitSet(2);

    /* renamed from: a  reason: collision with other field name */
    public boolean f790a = true;

    /* renamed from: b  reason: collision with other field name */
    public String f791b;

    /* renamed from: c  reason: collision with other field name */
    public String f792c;

    /* renamed from: d  reason: collision with other field name */
    public String f793d;

    /* renamed from: e  reason: collision with other field name */
    public String f794e;

    /* renamed from: f  reason: collision with other field name */
    public String f795f;

    /* renamed from: g  reason: collision with other field name */
    public String f796g;

    /* renamed from: h  reason: collision with other field name */
    public String f797h;

    /* renamed from: i  reason: collision with other field name */
    public String f798i;

    /* renamed from: a  reason: collision with other field name */
    private static final kd f785a = new kd("XmPushActionUnRegistration");

    /* renamed from: a  reason: collision with root package name */
    private static final jv f24575a = new jv("", (byte) 11, 1);
    private static final jv b = new jv("", (byte) 12, 2);
    private static final jv c = new jv("", (byte) 11, 3);
    private static final jv d = new jv("", (byte) 11, 4);
    private static final jv e = new jv("", (byte) 11, 5);
    private static final jv f = new jv("", (byte) 11, 6);
    private static final jv g = new jv("", (byte) 11, 7);
    private static final jv h = new jv("", (byte) 11, 8);
    private static final jv i = new jv("", (byte) 11, 9);
    private static final jv j = new jv("", (byte) 11, 10);
    private static final jv k = new jv("", (byte) 2, 11);
    private static final jv l = new jv("", (byte) 10, 12);

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(ji jiVar) {
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
        int a12;
        int a13;
        if (!getClass().equals(jiVar.getClass())) {
            return getClass().getName().compareTo(jiVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m2167a()).compareTo(Boolean.valueOf(jiVar.m2167a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m2167a() && (a13 = jo.a(this.f788a, jiVar.f788a)) != 0) {
            return a13;
        }
        int compareTo2 = Boolean.valueOf(b()).compareTo(Boolean.valueOf(jiVar.b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (b() && (a12 = jo.a(this.f787a, jiVar.f787a)) != 0) {
            return a12;
        }
        int compareTo3 = Boolean.valueOf(c()).compareTo(Boolean.valueOf(jiVar.c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (c() && (a11 = jo.a(this.f791b, jiVar.f791b)) != 0) {
            return a11;
        }
        int compareTo4 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(jiVar.d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (d() && (a10 = jo.a(this.f792c, jiVar.f792c)) != 0) {
            return a10;
        }
        int compareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(jiVar.e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (e() && (a9 = jo.a(this.f793d, jiVar.f793d)) != 0) {
            return a9;
        }
        int compareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(jiVar.f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (f() && (a8 = jo.a(this.f794e, jiVar.f794e)) != 0) {
            return a8;
        }
        int compareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(jiVar.g()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (g() && (a7 = jo.a(this.f795f, jiVar.f795f)) != 0) {
            return a7;
        }
        int compareTo8 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(jiVar.h()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (h() && (a6 = jo.a(this.f796g, jiVar.f796g)) != 0) {
            return a6;
        }
        int compareTo9 = Boolean.valueOf(i()).compareTo(Boolean.valueOf(jiVar.i()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (i() && (a5 = jo.a(this.f797h, jiVar.f797h)) != 0) {
            return a5;
        }
        int compareTo10 = Boolean.valueOf(j()).compareTo(Boolean.valueOf(jiVar.j()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (j() && (a4 = jo.a(this.f798i, jiVar.f798i)) != 0) {
            return a4;
        }
        int compareTo11 = Boolean.valueOf(k()).compareTo(Boolean.valueOf(jiVar.k()));
        if (compareTo11 != 0) {
            return compareTo11;
        }
        if (k() && (a3 = jo.a(this.f790a, jiVar.f790a)) != 0) {
            return a3;
        }
        int compareTo12 = Boolean.valueOf(l()).compareTo(Boolean.valueOf(jiVar.l()));
        if (compareTo12 != 0) {
            return compareTo12;
        }
        if (l() && (a2 = jo.a(this.f786a, jiVar.f786a)) != 0) {
            return a2;
        }
        return 0;
    }

    public ji a(String str) {
        this.f791b = str;
        return this;
    }

    public void a() {
        if (this.f791b == null) {
            throw new jz("Required field 'id' was not present! Struct: " + toString());
        } else if (this.f792c != null) {
        } else {
            throw new jz("Required field 'appId' was not present! Struct: " + toString());
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
                        this.f788a = jyVar.m2199a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 2:
                    if (m2194a.f24584a == 12) {
                        this.f787a = new ir();
                        this.f787a.a(jyVar);
                        continue;
                        jyVar.g();
                    }
                    break;
                case 3:
                    if (m2194a.f24584a == 11) {
                        this.f791b = jyVar.m2199a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 4:
                    if (m2194a.f24584a == 11) {
                        this.f792c = jyVar.m2199a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 5:
                    if (m2194a.f24584a == 11) {
                        this.f793d = jyVar.m2199a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 6:
                    if (m2194a.f24584a == 11) {
                        this.f794e = jyVar.m2199a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 7:
                    if (m2194a.f24584a == 11) {
                        this.f795f = jyVar.m2199a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 8:
                    if (m2194a.f24584a == 11) {
                        this.f796g = jyVar.m2199a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 9:
                    if (m2194a.f24584a == 11) {
                        this.f797h = jyVar.m2199a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 10:
                    if (m2194a.f24584a == 11) {
                        this.f798i = jyVar.m2199a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 11:
                    if (m2194a.f24584a == 2) {
                        this.f790a = jyVar.m2203a();
                        a(true);
                        continue;
                        jyVar.g();
                    }
                    break;
                case 12:
                    if (m2194a.f24584a == 10) {
                        this.f786a = jyVar.m2193a();
                        b(true);
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
        this.f789a.set(0, z);
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m2167a() {
        return this.f788a != null;
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m2168a(ji jiVar) {
        if (jiVar == null) {
            return false;
        }
        boolean m2167a = m2167a();
        boolean m2167a2 = jiVar.m2167a();
        if ((m2167a || m2167a2) && (!m2167a || !m2167a2 || !this.f788a.equals(jiVar.f788a))) {
            return false;
        }
        boolean b2 = b();
        boolean b3 = jiVar.b();
        if ((b2 || b3) && (!b2 || !b3 || !this.f787a.m2080a(jiVar.f787a))) {
            return false;
        }
        boolean c2 = c();
        boolean c3 = jiVar.c();
        if ((c2 || c3) && (!c2 || !c3 || !this.f791b.equals(jiVar.f791b))) {
            return false;
        }
        boolean d2 = d();
        boolean d3 = jiVar.d();
        if ((d2 || d3) && (!d2 || !d3 || !this.f792c.equals(jiVar.f792c))) {
            return false;
        }
        boolean e2 = e();
        boolean e3 = jiVar.e();
        if ((e2 || e3) && (!e2 || !e3 || !this.f793d.equals(jiVar.f793d))) {
            return false;
        }
        boolean f2 = f();
        boolean f3 = jiVar.f();
        if ((f2 || f3) && (!f2 || !f3 || !this.f794e.equals(jiVar.f794e))) {
            return false;
        }
        boolean g2 = g();
        boolean g3 = jiVar.g();
        if ((g2 || g3) && (!g2 || !g3 || !this.f795f.equals(jiVar.f795f))) {
            return false;
        }
        boolean h2 = h();
        boolean h3 = jiVar.h();
        if ((h2 || h3) && (!h2 || !h3 || !this.f796g.equals(jiVar.f796g))) {
            return false;
        }
        boolean i2 = i();
        boolean i3 = jiVar.i();
        if ((i2 || i3) && (!i2 || !i3 || !this.f797h.equals(jiVar.f797h))) {
            return false;
        }
        boolean j2 = j();
        boolean j3 = jiVar.j();
        if ((j2 || j3) && (!j2 || !j3 || !this.f798i.equals(jiVar.f798i))) {
            return false;
        }
        boolean k2 = k();
        boolean k3 = jiVar.k();
        if ((k2 || k3) && (!k2 || !k3 || this.f790a != jiVar.f790a)) {
            return false;
        }
        boolean l2 = l();
        boolean l3 = jiVar.l();
        if (!l2 && !l3) {
            return true;
        }
        return l2 && l3 && this.f786a == jiVar.f786a;
    }

    public ji b(String str) {
        this.f792c = str;
        return this;
    }

    @Override // com.xiaomi.push.jn
    public void b(jy jyVar) {
        a();
        jyVar.a(f785a);
        if (this.f788a != null && m2167a()) {
            jyVar.a(f24575a);
            jyVar.a(this.f788a);
            jyVar.b();
        }
        if (this.f787a != null && b()) {
            jyVar.a(b);
            this.f787a.b(jyVar);
            jyVar.b();
        }
        if (this.f791b != null) {
            jyVar.a(c);
            jyVar.a(this.f791b);
            jyVar.b();
        }
        if (this.f792c != null) {
            jyVar.a(d);
            jyVar.a(this.f792c);
            jyVar.b();
        }
        if (this.f793d != null && e()) {
            jyVar.a(e);
            jyVar.a(this.f793d);
            jyVar.b();
        }
        if (this.f794e != null && f()) {
            jyVar.a(f);
            jyVar.a(this.f794e);
            jyVar.b();
        }
        if (this.f795f != null && g()) {
            jyVar.a(g);
            jyVar.a(this.f795f);
            jyVar.b();
        }
        if (this.f796g != null && h()) {
            jyVar.a(h);
            jyVar.a(this.f796g);
            jyVar.b();
        }
        if (this.f797h != null && i()) {
            jyVar.a(i);
            jyVar.a(this.f797h);
            jyVar.b();
        }
        if (this.f798i != null && j()) {
            jyVar.a(j);
            jyVar.a(this.f798i);
            jyVar.b();
        }
        if (k()) {
            jyVar.a(k);
            jyVar.a(this.f790a);
            jyVar.b();
        }
        if (l()) {
            jyVar.a(l);
            jyVar.a(this.f786a);
            jyVar.b();
        }
        jyVar.c();
        jyVar.m2202a();
    }

    public void b(boolean z) {
        this.f789a.set(1, z);
    }

    public boolean b() {
        return this.f787a != null;
    }

    public ji c(String str) {
        this.f793d = str;
        return this;
    }

    public boolean c() {
        return this.f791b != null;
    }

    public ji d(String str) {
        this.f795f = str;
        return this;
    }

    public boolean d() {
        return this.f792c != null;
    }

    public ji e(String str) {
        this.f796g = str;
        return this;
    }

    public boolean e() {
        return this.f793d != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof ji)) {
            return m2168a((ji) obj);
        }
        return false;
    }

    public boolean f() {
        return this.f794e != null;
    }

    public boolean g() {
        return this.f795f != null;
    }

    public boolean h() {
        return this.f796g != null;
    }

    public int hashCode() {
        return 0;
    }

    public boolean i() {
        return this.f797h != null;
    }

    public boolean j() {
        return this.f798i != null;
    }

    public boolean k() {
        return this.f789a.get(0);
    }

    public boolean l() {
        return this.f789a.get(1);
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("XmPushActionUnRegistration(");
        if (m2167a()) {
            sb.append("debug:");
            String str = this.f788a;
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
            ir irVar = this.f787a;
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
        String str2 = this.f791b;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(str2);
        }
        sb.append(", ");
        sb.append("appId:");
        String str3 = this.f792c;
        if (str3 == null) {
            sb.append("null");
        } else {
            sb.append(str3);
        }
        if (e()) {
            sb.append(", ");
            sb.append("regId:");
            String str4 = this.f793d;
            if (str4 == null) {
                sb.append("null");
            } else {
                sb.append(str4);
            }
        }
        if (f()) {
            sb.append(", ");
            sb.append("appVersion:");
            String str5 = this.f794e;
            if (str5 == null) {
                sb.append("null");
            } else {
                sb.append(str5);
            }
        }
        if (g()) {
            sb.append(", ");
            sb.append("packageName:");
            String str6 = this.f795f;
            if (str6 == null) {
                sb.append("null");
            } else {
                sb.append(str6);
            }
        }
        if (h()) {
            sb.append(", ");
            sb.append("token:");
            String str7 = this.f796g;
            if (str7 == null) {
                sb.append("null");
            } else {
                sb.append(str7);
            }
        }
        if (i()) {
            sb.append(", ");
            sb.append("deviceId:");
            String str8 = this.f797h;
            if (str8 == null) {
                sb.append("null");
            } else {
                sb.append(str8);
            }
        }
        if (j()) {
            sb.append(", ");
            sb.append("aliasName:");
            String str9 = this.f798i;
            if (str9 == null) {
                sb.append("null");
            } else {
                sb.append(str9);
            }
        }
        if (k()) {
            sb.append(", ");
            sb.append("needAck:");
            sb.append(this.f790a);
        }
        if (l()) {
            sb.append(", ");
            sb.append("createdTs:");
            sb.append(this.f786a);
        }
        sb.append(riy.BRACKET_END_STR);
        return sb.toString();
    }
}
