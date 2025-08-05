package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;
import tb.riy;

/* loaded from: classes9.dex */
public class jj implements jn<jj, Object>, Serializable, Cloneable {

    /* renamed from: a  reason: collision with other field name */
    public long f800a;

    /* renamed from: a  reason: collision with other field name */
    public ir f801a;

    /* renamed from: a  reason: collision with other field name */
    public String f802a;

    /* renamed from: a  reason: collision with other field name */
    private BitSet f803a = new BitSet(3);

    /* renamed from: b  reason: collision with other field name */
    public long f804b;

    /* renamed from: b  reason: collision with other field name */
    public String f805b;

    /* renamed from: c  reason: collision with other field name */
    public long f806c;

    /* renamed from: c  reason: collision with other field name */
    public String f807c;

    /* renamed from: d  reason: collision with other field name */
    public String f808d;

    /* renamed from: e  reason: collision with other field name */
    public String f809e;

    /* renamed from: a  reason: collision with other field name */
    private static final kd f799a = new kd("XmPushActionUnRegistrationResult");

    /* renamed from: a  reason: collision with root package name */
    private static final jv f24576a = new jv("", (byte) 11, 1);
    private static final jv b = new jv("", (byte) 12, 2);
    private static final jv c = new jv("", (byte) 11, 3);
    private static final jv d = new jv("", (byte) 11, 4);
    private static final jv e = new jv("", (byte) 10, 6);
    private static final jv f = new jv("", (byte) 11, 7);
    private static final jv g = new jv("", (byte) 11, 8);
    private static final jv h = new jv("", (byte) 10, 9);
    private static final jv i = new jv("", (byte) 10, 10);

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(jj jjVar) {
        int a2;
        int a3;
        int a4;
        int a5;
        int a6;
        int a7;
        int a8;
        int a9;
        int a10;
        if (!getClass().equals(jjVar.getClass())) {
            return getClass().getName().compareTo(jjVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m2170a()).compareTo(Boolean.valueOf(jjVar.m2170a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m2170a() && (a10 = jo.a(this.f802a, jjVar.f802a)) != 0) {
            return a10;
        }
        int compareTo2 = Boolean.valueOf(b()).compareTo(Boolean.valueOf(jjVar.b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (b() && (a9 = jo.a(this.f801a, jjVar.f801a)) != 0) {
            return a9;
        }
        int compareTo3 = Boolean.valueOf(c()).compareTo(Boolean.valueOf(jjVar.c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (c() && (a8 = jo.a(this.f805b, jjVar.f805b)) != 0) {
            return a8;
        }
        int compareTo4 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(jjVar.d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (d() && (a7 = jo.a(this.f807c, jjVar.f807c)) != 0) {
            return a7;
        }
        int compareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(jjVar.e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (e() && (a6 = jo.a(this.f800a, jjVar.f800a)) != 0) {
            return a6;
        }
        int compareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(jjVar.f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (f() && (a5 = jo.a(this.f808d, jjVar.f808d)) != 0) {
            return a5;
        }
        int compareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(jjVar.g()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (g() && (a4 = jo.a(this.f809e, jjVar.f809e)) != 0) {
            return a4;
        }
        int compareTo8 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(jjVar.h()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (h() && (a3 = jo.a(this.f804b, jjVar.f804b)) != 0) {
            return a3;
        }
        int compareTo9 = Boolean.valueOf(i()).compareTo(Boolean.valueOf(jjVar.i()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (i() && (a2 = jo.a(this.f806c, jjVar.f806c)) != 0) {
            return a2;
        }
        return 0;
    }

    public String a() {
        return this.f809e;
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m2169a() {
        if (this.f805b == null) {
            throw new jz("Required field 'id' was not present! Struct: " + toString());
        } else if (this.f807c != null) {
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
                    m2169a();
                    return;
                }
                throw new jz("Required field 'errorCode' was not found in serialized data! Struct: " + toString());
            }
            switch (m2194a.f840a) {
                case 1:
                    if (m2194a.f24584a == 11) {
                        this.f802a = jyVar.m2199a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 2:
                    if (m2194a.f24584a == 12) {
                        this.f801a = new ir();
                        this.f801a.a(jyVar);
                        continue;
                        jyVar.g();
                    }
                    break;
                case 3:
                    if (m2194a.f24584a == 11) {
                        this.f805b = jyVar.m2199a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 4:
                    if (m2194a.f24584a == 11) {
                        this.f807c = jyVar.m2199a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 6:
                    if (m2194a.f24584a == 10) {
                        this.f800a = jyVar.m2193a();
                        a(true);
                        continue;
                        jyVar.g();
                    }
                    break;
                case 7:
                    if (m2194a.f24584a == 11) {
                        this.f808d = jyVar.m2199a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 8:
                    if (m2194a.f24584a == 11) {
                        this.f809e = jyVar.m2199a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 9:
                    if (m2194a.f24584a == 10) {
                        this.f804b = jyVar.m2193a();
                        b(true);
                        continue;
                        jyVar.g();
                    }
                    break;
                case 10:
                    if (m2194a.f24584a == 10) {
                        this.f806c = jyVar.m2193a();
                        c(true);
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
        this.f803a.set(0, z);
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m2170a() {
        return this.f802a != null;
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m2171a(jj jjVar) {
        if (jjVar == null) {
            return false;
        }
        boolean m2170a = m2170a();
        boolean m2170a2 = jjVar.m2170a();
        if ((m2170a || m2170a2) && (!m2170a || !m2170a2 || !this.f802a.equals(jjVar.f802a))) {
            return false;
        }
        boolean b2 = b();
        boolean b3 = jjVar.b();
        if ((b2 || b3) && (!b2 || !b3 || !this.f801a.m2080a(jjVar.f801a))) {
            return false;
        }
        boolean c2 = c();
        boolean c3 = jjVar.c();
        if ((c2 || c3) && (!c2 || !c3 || !this.f805b.equals(jjVar.f805b))) {
            return false;
        }
        boolean d2 = d();
        boolean d3 = jjVar.d();
        if (((d2 || d3) && (!d2 || !d3 || !this.f807c.equals(jjVar.f807c))) || this.f800a != jjVar.f800a) {
            return false;
        }
        boolean f2 = f();
        boolean f3 = jjVar.f();
        if ((f2 || f3) && (!f2 || !f3 || !this.f808d.equals(jjVar.f808d))) {
            return false;
        }
        boolean g2 = g();
        boolean g3 = jjVar.g();
        if ((g2 || g3) && (!g2 || !g3 || !this.f809e.equals(jjVar.f809e))) {
            return false;
        }
        boolean h2 = h();
        boolean h3 = jjVar.h();
        if ((h2 || h3) && (!h2 || !h3 || this.f804b != jjVar.f804b)) {
            return false;
        }
        boolean i2 = i();
        boolean i3 = jjVar.i();
        if (!i2 && !i3) {
            return true;
        }
        return i2 && i3 && this.f806c == jjVar.f806c;
    }

    @Override // com.xiaomi.push.jn
    public void b(jy jyVar) {
        m2169a();
        jyVar.a(f799a);
        if (this.f802a != null && m2170a()) {
            jyVar.a(f24576a);
            jyVar.a(this.f802a);
            jyVar.b();
        }
        if (this.f801a != null && b()) {
            jyVar.a(b);
            this.f801a.b(jyVar);
            jyVar.b();
        }
        if (this.f805b != null) {
            jyVar.a(c);
            jyVar.a(this.f805b);
            jyVar.b();
        }
        if (this.f807c != null) {
            jyVar.a(d);
            jyVar.a(this.f807c);
            jyVar.b();
        }
        jyVar.a(e);
        jyVar.a(this.f800a);
        jyVar.b();
        if (this.f808d != null && f()) {
            jyVar.a(f);
            jyVar.a(this.f808d);
            jyVar.b();
        }
        if (this.f809e != null && g()) {
            jyVar.a(g);
            jyVar.a(this.f809e);
            jyVar.b();
        }
        if (h()) {
            jyVar.a(h);
            jyVar.a(this.f804b);
            jyVar.b();
        }
        if (i()) {
            jyVar.a(i);
            jyVar.a(this.f806c);
            jyVar.b();
        }
        jyVar.c();
        jyVar.m2202a();
    }

    public void b(boolean z) {
        this.f803a.set(1, z);
    }

    public boolean b() {
        return this.f801a != null;
    }

    public void c(boolean z) {
        this.f803a.set(2, z);
    }

    public boolean c() {
        return this.f805b != null;
    }

    public boolean d() {
        return this.f807c != null;
    }

    public boolean e() {
        return this.f803a.get(0);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof jj)) {
            return m2171a((jj) obj);
        }
        return false;
    }

    public boolean f() {
        return this.f808d != null;
    }

    public boolean g() {
        return this.f809e != null;
    }

    public boolean h() {
        return this.f803a.get(1);
    }

    public int hashCode() {
        return 0;
    }

    public boolean i() {
        return this.f803a.get(2);
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("XmPushActionUnRegistrationResult(");
        if (m2170a()) {
            sb.append("debug:");
            String str = this.f802a;
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
            ir irVar = this.f801a;
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
        String str2 = this.f805b;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(str2);
        }
        sb.append(", ");
        sb.append("appId:");
        String str3 = this.f807c;
        if (str3 == null) {
            sb.append("null");
        } else {
            sb.append(str3);
        }
        sb.append(", ");
        sb.append("errorCode:");
        sb.append(this.f800a);
        if (f()) {
            sb.append(", ");
            sb.append("reason:");
            String str4 = this.f808d;
            if (str4 == null) {
                sb.append("null");
            } else {
                sb.append(str4);
            }
        }
        if (g()) {
            sb.append(", ");
            sb.append("packageName:");
            String str5 = this.f809e;
            if (str5 == null) {
                sb.append("null");
            } else {
                sb.append(str5);
            }
        }
        if (h()) {
            sb.append(", ");
            sb.append("unRegisteredAt:");
            sb.append(this.f804b);
        }
        if (i()) {
            sb.append(", ");
            sb.append("costTime:");
            sb.append(this.f806c);
        }
        sb.append(riy.BRACKET_END_STR);
        return sb.toString();
    }
}
