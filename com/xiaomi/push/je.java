package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;
import tb.riy;

/* loaded from: classes9.dex */
public class je implements jn<je, Object>, Serializable, Cloneable {

    /* renamed from: a  reason: collision with other field name */
    public long f743a;

    /* renamed from: a  reason: collision with other field name */
    public ir f744a;

    /* renamed from: a  reason: collision with other field name */
    public String f745a;

    /* renamed from: a  reason: collision with other field name */
    private BitSet f746a = new BitSet(1);

    /* renamed from: b  reason: collision with other field name */
    public String f747b;

    /* renamed from: c  reason: collision with other field name */
    public String f748c;

    /* renamed from: d  reason: collision with other field name */
    public String f749d;

    /* renamed from: e  reason: collision with other field name */
    public String f750e;

    /* renamed from: a  reason: collision with other field name */
    private static final kd f742a = new kd("XmPushActionSendFeedbackResult");

    /* renamed from: a  reason: collision with root package name */
    private static final jv f24571a = new jv("", (byte) 11, 1);
    private static final jv b = new jv("", (byte) 12, 2);
    private static final jv c = new jv("", (byte) 11, 3);
    private static final jv d = new jv("", (byte) 11, 4);
    private static final jv e = new jv("", (byte) 10, 6);
    private static final jv f = new jv("", (byte) 11, 7);
    private static final jv g = new jv("", (byte) 11, 8);

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(je jeVar) {
        int a2;
        int a3;
        int a4;
        int a5;
        int a6;
        int a7;
        int a8;
        if (!getClass().equals(jeVar.getClass())) {
            return getClass().getName().compareTo(jeVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m2149a()).compareTo(Boolean.valueOf(jeVar.m2149a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m2149a() && (a8 = jo.a(this.f745a, jeVar.f745a)) != 0) {
            return a8;
        }
        int compareTo2 = Boolean.valueOf(b()).compareTo(Boolean.valueOf(jeVar.b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (b() && (a7 = jo.a(this.f744a, jeVar.f744a)) != 0) {
            return a7;
        }
        int compareTo3 = Boolean.valueOf(c()).compareTo(Boolean.valueOf(jeVar.c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (c() && (a6 = jo.a(this.f747b, jeVar.f747b)) != 0) {
            return a6;
        }
        int compareTo4 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(jeVar.d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (d() && (a5 = jo.a(this.f748c, jeVar.f748c)) != 0) {
            return a5;
        }
        int compareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(jeVar.e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (e() && (a4 = jo.a(this.f743a, jeVar.f743a)) != 0) {
            return a4;
        }
        int compareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(jeVar.f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (f() && (a3 = jo.a(this.f749d, jeVar.f749d)) != 0) {
            return a3;
        }
        int compareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(jeVar.g()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (g() && (a2 = jo.a(this.f750e, jeVar.f750e)) != 0) {
            return a2;
        }
        return 0;
    }

    public void a() {
        if (this.f747b == null) {
            throw new jz("Required field 'id' was not present! Struct: " + toString());
        } else if (this.f748c != null) {
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
                if (e()) {
                    a();
                    return;
                }
                throw new jz("Required field 'errorCode' was not found in serialized data! Struct: " + toString());
            }
            switch (m2194a.f840a) {
                case 1:
                    if (m2194a.f24584a == 11) {
                        this.f745a = jyVar.m2199a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 2:
                    if (m2194a.f24584a == 12) {
                        this.f744a = new ir();
                        this.f744a.a(jyVar);
                        continue;
                        jyVar.g();
                    }
                    break;
                case 3:
                    if (m2194a.f24584a == 11) {
                        this.f747b = jyVar.m2199a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 4:
                    if (m2194a.f24584a == 11) {
                        this.f748c = jyVar.m2199a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 6:
                    if (m2194a.f24584a == 10) {
                        this.f743a = jyVar.m2193a();
                        a(true);
                        continue;
                        jyVar.g();
                    }
                    break;
                case 7:
                    if (m2194a.f24584a == 11) {
                        this.f749d = jyVar.m2199a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 8:
                    if (m2194a.f24584a == 11) {
                        this.f750e = jyVar.m2199a();
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
        this.f746a.set(0, z);
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m2149a() {
        return this.f745a != null;
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m2150a(je jeVar) {
        if (jeVar == null) {
            return false;
        }
        boolean m2149a = m2149a();
        boolean m2149a2 = jeVar.m2149a();
        if ((m2149a || m2149a2) && (!m2149a || !m2149a2 || !this.f745a.equals(jeVar.f745a))) {
            return false;
        }
        boolean b2 = b();
        boolean b3 = jeVar.b();
        if ((b2 || b3) && (!b2 || !b3 || !this.f744a.m2080a(jeVar.f744a))) {
            return false;
        }
        boolean c2 = c();
        boolean c3 = jeVar.c();
        if ((c2 || c3) && (!c2 || !c3 || !this.f747b.equals(jeVar.f747b))) {
            return false;
        }
        boolean d2 = d();
        boolean d3 = jeVar.d();
        if (((d2 || d3) && (!d2 || !d3 || !this.f748c.equals(jeVar.f748c))) || this.f743a != jeVar.f743a) {
            return false;
        }
        boolean f2 = f();
        boolean f3 = jeVar.f();
        if ((f2 || f3) && (!f2 || !f3 || !this.f749d.equals(jeVar.f749d))) {
            return false;
        }
        boolean g2 = g();
        boolean g3 = jeVar.g();
        if (!g2 && !g3) {
            return true;
        }
        return g2 && g3 && this.f750e.equals(jeVar.f750e);
    }

    @Override // com.xiaomi.push.jn
    public void b(jy jyVar) {
        a();
        jyVar.a(f742a);
        if (this.f745a != null && m2149a()) {
            jyVar.a(f24571a);
            jyVar.a(this.f745a);
            jyVar.b();
        }
        if (this.f744a != null && b()) {
            jyVar.a(b);
            this.f744a.b(jyVar);
            jyVar.b();
        }
        if (this.f747b != null) {
            jyVar.a(c);
            jyVar.a(this.f747b);
            jyVar.b();
        }
        if (this.f748c != null) {
            jyVar.a(d);
            jyVar.a(this.f748c);
            jyVar.b();
        }
        jyVar.a(e);
        jyVar.a(this.f743a);
        jyVar.b();
        if (this.f749d != null && f()) {
            jyVar.a(f);
            jyVar.a(this.f749d);
            jyVar.b();
        }
        if (this.f750e != null && g()) {
            jyVar.a(g);
            jyVar.a(this.f750e);
            jyVar.b();
        }
        jyVar.c();
        jyVar.m2202a();
    }

    public boolean b() {
        return this.f744a != null;
    }

    public boolean c() {
        return this.f747b != null;
    }

    public boolean d() {
        return this.f748c != null;
    }

    public boolean e() {
        return this.f746a.get(0);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof je)) {
            return m2150a((je) obj);
        }
        return false;
    }

    public boolean f() {
        return this.f749d != null;
    }

    public boolean g() {
        return this.f750e != null;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("XmPushActionSendFeedbackResult(");
        if (m2149a()) {
            sb.append("debug:");
            String str = this.f745a;
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
            ir irVar = this.f744a;
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
        String str2 = this.f747b;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(str2);
        }
        sb.append(", ");
        sb.append("appId:");
        String str3 = this.f748c;
        if (str3 == null) {
            sb.append("null");
        } else {
            sb.append(str3);
        }
        sb.append(", ");
        sb.append("errorCode:");
        sb.append(this.f743a);
        if (f()) {
            sb.append(", ");
            sb.append("reason:");
            String str4 = this.f749d;
            if (str4 == null) {
                sb.append("null");
            } else {
                sb.append(str4);
            }
        }
        if (g()) {
            sb.append(", ");
            sb.append("category:");
            String str5 = this.f750e;
            if (str5 == null) {
                sb.append("null");
            } else {
                sb.append(str5);
            }
        }
        sb.append(riy.BRACKET_END_STR);
        return sb.toString();
    }
}
