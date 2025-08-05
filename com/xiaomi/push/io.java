package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;
import tb.riy;

/* loaded from: classes9.dex */
public class io implements jn<io, Object>, Serializable, Cloneable {

    /* renamed from: a  reason: collision with other field name */
    public long f549a;

    /* renamed from: a  reason: collision with other field name */
    public ip f550a;

    /* renamed from: a  reason: collision with other field name */
    public ir f551a;

    /* renamed from: a  reason: collision with other field name */
    public String f552a;

    /* renamed from: a  reason: collision with other field name */
    private BitSet f553a = new BitSet(4);

    /* renamed from: a  reason: collision with other field name */
    public boolean f554a = false;

    /* renamed from: b  reason: collision with other field name */
    public long f555b;

    /* renamed from: b  reason: collision with other field name */
    public String f556b;

    /* renamed from: c  reason: collision with other field name */
    public long f557c;

    /* renamed from: c  reason: collision with other field name */
    public String f558c;

    /* renamed from: d  reason: collision with other field name */
    public String f559d;

    /* renamed from: e  reason: collision with other field name */
    public String f560e;

    /* renamed from: f  reason: collision with other field name */
    public String f561f;

    /* renamed from: g  reason: collision with other field name */
    public String f562g;

    /* renamed from: h  reason: collision with other field name */
    public String f563h;

    /* renamed from: i  reason: collision with other field name */
    public String f564i;

    /* renamed from: j  reason: collision with other field name */
    public String f565j;

    /* renamed from: k  reason: collision with other field name */
    public String f566k;

    /* renamed from: l  reason: collision with other field name */
    public String f567l;

    /* renamed from: a  reason: collision with other field name */
    private static final kd f548a = new kd("PushMessage");

    /* renamed from: a  reason: collision with root package name */
    private static final jv f24554a = new jv("", (byte) 12, 1);
    private static final jv b = new jv("", (byte) 11, 2);
    private static final jv c = new jv("", (byte) 11, 3);
    private static final jv d = new jv("", (byte) 11, 4);
    private static final jv e = new jv("", (byte) 10, 5);
    private static final jv f = new jv("", (byte) 10, 6);
    private static final jv g = new jv("", (byte) 11, 7);
    private static final jv h = new jv("", (byte) 11, 8);
    private static final jv i = new jv("", (byte) 11, 9);
    private static final jv j = new jv("", (byte) 11, 10);
    private static final jv k = new jv("", (byte) 11, 11);
    private static final jv l = new jv("", (byte) 12, 12);
    private static final jv m = new jv("", (byte) 11, 13);
    private static final jv n = new jv("", (byte) 2, 14);
    private static final jv o = new jv("", (byte) 11, 15);
    private static final jv p = new jv("", (byte) 10, 16);
    private static final jv q = new jv("", (byte) 11, 20);
    private static final jv r = new jv("", (byte) 11, 21);

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(io ioVar) {
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
        int a14;
        int a15;
        int a16;
        int a17;
        int a18;
        int a19;
        if (!getClass().equals(ioVar.getClass())) {
            return getClass().getName().compareTo(ioVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m2062a()).compareTo(Boolean.valueOf(ioVar.m2062a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m2062a() && (a19 = jo.a(this.f551a, ioVar.f551a)) != 0) {
            return a19;
        }
        int compareTo2 = Boolean.valueOf(m2064b()).compareTo(Boolean.valueOf(ioVar.m2064b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (m2064b() && (a18 = jo.a(this.f552a, ioVar.f552a)) != 0) {
            return a18;
        }
        int compareTo3 = Boolean.valueOf(m2065c()).compareTo(Boolean.valueOf(ioVar.m2065c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (m2065c() && (a17 = jo.a(this.f556b, ioVar.f556b)) != 0) {
            return a17;
        }
        int compareTo4 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(ioVar.d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (d() && (a16 = jo.a(this.f558c, ioVar.f558c)) != 0) {
            return a16;
        }
        int compareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(ioVar.e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (e() && (a15 = jo.a(this.f549a, ioVar.f549a)) != 0) {
            return a15;
        }
        int compareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(ioVar.f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (f() && (a14 = jo.a(this.f555b, ioVar.f555b)) != 0) {
            return a14;
        }
        int compareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(ioVar.g()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (g() && (a13 = jo.a(this.f559d, ioVar.f559d)) != 0) {
            return a13;
        }
        int compareTo8 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(ioVar.h()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (h() && (a12 = jo.a(this.f560e, ioVar.f560e)) != 0) {
            return a12;
        }
        int compareTo9 = Boolean.valueOf(i()).compareTo(Boolean.valueOf(ioVar.i()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (i() && (a11 = jo.a(this.f561f, ioVar.f561f)) != 0) {
            return a11;
        }
        int compareTo10 = Boolean.valueOf(j()).compareTo(Boolean.valueOf(ioVar.j()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (j() && (a10 = jo.a(this.f562g, ioVar.f562g)) != 0) {
            return a10;
        }
        int compareTo11 = Boolean.valueOf(k()).compareTo(Boolean.valueOf(ioVar.k()));
        if (compareTo11 != 0) {
            return compareTo11;
        }
        if (k() && (a9 = jo.a(this.f563h, ioVar.f563h)) != 0) {
            return a9;
        }
        int compareTo12 = Boolean.valueOf(l()).compareTo(Boolean.valueOf(ioVar.l()));
        if (compareTo12 != 0) {
            return compareTo12;
        }
        if (l() && (a8 = jo.a(this.f550a, ioVar.f550a)) != 0) {
            return a8;
        }
        int compareTo13 = Boolean.valueOf(m()).compareTo(Boolean.valueOf(ioVar.m()));
        if (compareTo13 != 0) {
            return compareTo13;
        }
        if (m() && (a7 = jo.a(this.f564i, ioVar.f564i)) != 0) {
            return a7;
        }
        int compareTo14 = Boolean.valueOf(n()).compareTo(Boolean.valueOf(ioVar.n()));
        if (compareTo14 != 0) {
            return compareTo14;
        }
        if (n() && (a6 = jo.a(this.f554a, ioVar.f554a)) != 0) {
            return a6;
        }
        int compareTo15 = Boolean.valueOf(o()).compareTo(Boolean.valueOf(ioVar.o()));
        if (compareTo15 != 0) {
            return compareTo15;
        }
        if (o() && (a5 = jo.a(this.f565j, ioVar.f565j)) != 0) {
            return a5;
        }
        int compareTo16 = Boolean.valueOf(p()).compareTo(Boolean.valueOf(ioVar.p()));
        if (compareTo16 != 0) {
            return compareTo16;
        }
        if (p() && (a4 = jo.a(this.f557c, ioVar.f557c)) != 0) {
            return a4;
        }
        int compareTo17 = Boolean.valueOf(q()).compareTo(Boolean.valueOf(ioVar.q()));
        if (compareTo17 != 0) {
            return compareTo17;
        }
        if (q() && (a3 = jo.a(this.f566k, ioVar.f566k)) != 0) {
            return a3;
        }
        int compareTo18 = Boolean.valueOf(r()).compareTo(Boolean.valueOf(ioVar.r()));
        if (compareTo18 != 0) {
            return compareTo18;
        }
        if (r() && (a2 = jo.a(this.f567l, ioVar.f567l)) != 0) {
            return a2;
        }
        return 0;
    }

    public long a() {
        return this.f549a;
    }

    /* renamed from: a  reason: collision with other method in class */
    public String m2060a() {
        return this.f552a;
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m2061a() {
        if (this.f552a == null) {
            throw new jz("Required field 'id' was not present! Struct: " + toString());
        } else if (this.f556b == null) {
            throw new jz("Required field 'appId' was not present! Struct: " + toString());
        } else if (this.f558c != null) {
        } else {
            throw new jz("Required field 'payload' was not present! Struct: " + toString());
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.xiaomi.push.jn
    public void a(jy jyVar) {
        jyVar.m2198a();
        while (true) {
            jv m2194a = jyVar.m2194a();
            if (m2194a.f24584a == 0) {
                jyVar.f();
                m2061a();
                return;
            }
            short s = m2194a.f840a;
            if (s == 20) {
                if (m2194a.f24584a == 11) {
                    this.f566k = jyVar.m2199a();
                    jyVar.g();
                }
                kb.a(jyVar, m2194a.f24584a);
                jyVar.g();
            } else if (s != 21) {
                switch (s) {
                    case 1:
                        if (m2194a.f24584a == 12) {
                            this.f551a = new ir();
                            this.f551a.a(jyVar);
                            break;
                        }
                        kb.a(jyVar, m2194a.f24584a);
                        break;
                    case 2:
                        if (m2194a.f24584a == 11) {
                            this.f552a = jyVar.m2199a();
                            break;
                        }
                        kb.a(jyVar, m2194a.f24584a);
                        break;
                    case 3:
                        if (m2194a.f24584a == 11) {
                            this.f556b = jyVar.m2199a();
                            break;
                        }
                        kb.a(jyVar, m2194a.f24584a);
                        break;
                    case 4:
                        if (m2194a.f24584a == 11) {
                            this.f558c = jyVar.m2199a();
                            break;
                        }
                        kb.a(jyVar, m2194a.f24584a);
                        break;
                    case 5:
                        if (m2194a.f24584a == 10) {
                            this.f549a = jyVar.m2193a();
                            a(true);
                            break;
                        }
                        kb.a(jyVar, m2194a.f24584a);
                        break;
                    case 6:
                        if (m2194a.f24584a == 10) {
                            this.f555b = jyVar.m2193a();
                            b(true);
                            break;
                        }
                        kb.a(jyVar, m2194a.f24584a);
                        break;
                    case 7:
                        if (m2194a.f24584a == 11) {
                            this.f559d = jyVar.m2199a();
                            break;
                        }
                        kb.a(jyVar, m2194a.f24584a);
                        break;
                    case 8:
                        if (m2194a.f24584a == 11) {
                            this.f560e = jyVar.m2199a();
                            break;
                        }
                        kb.a(jyVar, m2194a.f24584a);
                        break;
                    case 9:
                        if (m2194a.f24584a == 11) {
                            this.f561f = jyVar.m2199a();
                            break;
                        }
                        kb.a(jyVar, m2194a.f24584a);
                        break;
                    case 10:
                        if (m2194a.f24584a == 11) {
                            this.f562g = jyVar.m2199a();
                            break;
                        }
                        kb.a(jyVar, m2194a.f24584a);
                        break;
                    case 11:
                        if (m2194a.f24584a == 11) {
                            this.f563h = jyVar.m2199a();
                            break;
                        }
                        kb.a(jyVar, m2194a.f24584a);
                        break;
                    case 12:
                        if (m2194a.f24584a == 12) {
                            this.f550a = new ip();
                            this.f550a.a(jyVar);
                            break;
                        }
                        kb.a(jyVar, m2194a.f24584a);
                        break;
                    case 13:
                        if (m2194a.f24584a == 11) {
                            this.f564i = jyVar.m2199a();
                            break;
                        }
                        kb.a(jyVar, m2194a.f24584a);
                        break;
                    case 14:
                        if (m2194a.f24584a == 2) {
                            this.f554a = jyVar.m2203a();
                            c(true);
                            break;
                        }
                        kb.a(jyVar, m2194a.f24584a);
                        break;
                    case 15:
                        if (m2194a.f24584a == 11) {
                            this.f565j = jyVar.m2199a();
                            break;
                        }
                        kb.a(jyVar, m2194a.f24584a);
                        break;
                    case 16:
                        if (m2194a.f24584a == 10) {
                            this.f557c = jyVar.m2193a();
                            d(true);
                            break;
                        }
                        kb.a(jyVar, m2194a.f24584a);
                        break;
                    default:
                        kb.a(jyVar, m2194a.f24584a);
                        break;
                }
                jyVar.g();
            } else {
                if (m2194a.f24584a == 11) {
                    this.f567l = jyVar.m2199a();
                    jyVar.g();
                }
                kb.a(jyVar, m2194a.f24584a);
                jyVar.g();
            }
        }
    }

    public void a(boolean z) {
        this.f553a.set(0, z);
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m2062a() {
        return this.f551a != null;
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m2063a(io ioVar) {
        if (ioVar == null) {
            return false;
        }
        boolean m2062a = m2062a();
        boolean m2062a2 = ioVar.m2062a();
        if ((m2062a || m2062a2) && (!m2062a || !m2062a2 || !this.f551a.m2080a(ioVar.f551a))) {
            return false;
        }
        boolean m2064b = m2064b();
        boolean m2064b2 = ioVar.m2064b();
        if ((m2064b || m2064b2) && (!m2064b || !m2064b2 || !this.f552a.equals(ioVar.f552a))) {
            return false;
        }
        boolean m2065c = m2065c();
        boolean m2065c2 = ioVar.m2065c();
        if ((m2065c || m2065c2) && (!m2065c || !m2065c2 || !this.f556b.equals(ioVar.f556b))) {
            return false;
        }
        boolean d2 = d();
        boolean d3 = ioVar.d();
        if ((d2 || d3) && (!d2 || !d3 || !this.f558c.equals(ioVar.f558c))) {
            return false;
        }
        boolean e2 = e();
        boolean e3 = ioVar.e();
        if ((e2 || e3) && (!e2 || !e3 || this.f549a != ioVar.f549a)) {
            return false;
        }
        boolean f2 = f();
        boolean f3 = ioVar.f();
        if ((f2 || f3) && (!f2 || !f3 || this.f555b != ioVar.f555b)) {
            return false;
        }
        boolean g2 = g();
        boolean g3 = ioVar.g();
        if ((g2 || g3) && (!g2 || !g3 || !this.f559d.equals(ioVar.f559d))) {
            return false;
        }
        boolean h2 = h();
        boolean h3 = ioVar.h();
        if ((h2 || h3) && (!h2 || !h3 || !this.f560e.equals(ioVar.f560e))) {
            return false;
        }
        boolean i2 = i();
        boolean i3 = ioVar.i();
        if ((i2 || i3) && (!i2 || !i3 || !this.f561f.equals(ioVar.f561f))) {
            return false;
        }
        boolean j2 = j();
        boolean j3 = ioVar.j();
        if ((j2 || j3) && (!j2 || !j3 || !this.f562g.equals(ioVar.f562g))) {
            return false;
        }
        boolean k2 = k();
        boolean k3 = ioVar.k();
        if ((k2 || k3) && (!k2 || !k3 || !this.f563h.equals(ioVar.f563h))) {
            return false;
        }
        boolean l2 = l();
        boolean l3 = ioVar.l();
        if ((l2 || l3) && (!l2 || !l3 || !this.f550a.m2072a(ioVar.f550a))) {
            return false;
        }
        boolean m2 = m();
        boolean m3 = ioVar.m();
        if ((m2 || m3) && (!m2 || !m3 || !this.f564i.equals(ioVar.f564i))) {
            return false;
        }
        boolean n2 = n();
        boolean n3 = ioVar.n();
        if ((n2 || n3) && (!n2 || !n3 || this.f554a != ioVar.f554a)) {
            return false;
        }
        boolean o2 = o();
        boolean o3 = ioVar.o();
        if ((o2 || o3) && (!o2 || !o3 || !this.f565j.equals(ioVar.f565j))) {
            return false;
        }
        boolean p2 = p();
        boolean p3 = ioVar.p();
        if ((p2 || p3) && (!p2 || !p3 || this.f557c != ioVar.f557c)) {
            return false;
        }
        boolean q2 = q();
        boolean q3 = ioVar.q();
        if ((q2 || q3) && (!q2 || !q3 || !this.f566k.equals(ioVar.f566k))) {
            return false;
        }
        boolean r2 = r();
        boolean r3 = ioVar.r();
        if (!r2 && !r3) {
            return true;
        }
        return r2 && r3 && this.f567l.equals(ioVar.f567l);
    }

    public String b() {
        return this.f556b;
    }

    @Override // com.xiaomi.push.jn
    public void b(jy jyVar) {
        m2061a();
        jyVar.a(f548a);
        if (this.f551a != null && m2062a()) {
            jyVar.a(f24554a);
            this.f551a.b(jyVar);
            jyVar.b();
        }
        if (this.f552a != null) {
            jyVar.a(b);
            jyVar.a(this.f552a);
            jyVar.b();
        }
        if (this.f556b != null) {
            jyVar.a(c);
            jyVar.a(this.f556b);
            jyVar.b();
        }
        if (this.f558c != null) {
            jyVar.a(d);
            jyVar.a(this.f558c);
            jyVar.b();
        }
        if (e()) {
            jyVar.a(e);
            jyVar.a(this.f549a);
            jyVar.b();
        }
        if (f()) {
            jyVar.a(f);
            jyVar.a(this.f555b);
            jyVar.b();
        }
        if (this.f559d != null && g()) {
            jyVar.a(g);
            jyVar.a(this.f559d);
            jyVar.b();
        }
        if (this.f560e != null && h()) {
            jyVar.a(h);
            jyVar.a(this.f560e);
            jyVar.b();
        }
        if (this.f561f != null && i()) {
            jyVar.a(i);
            jyVar.a(this.f561f);
            jyVar.b();
        }
        if (this.f562g != null && j()) {
            jyVar.a(j);
            jyVar.a(this.f562g);
            jyVar.b();
        }
        if (this.f563h != null && k()) {
            jyVar.a(k);
            jyVar.a(this.f563h);
            jyVar.b();
        }
        if (this.f550a != null && l()) {
            jyVar.a(l);
            this.f550a.b(jyVar);
            jyVar.b();
        }
        if (this.f564i != null && m()) {
            jyVar.a(m);
            jyVar.a(this.f564i);
            jyVar.b();
        }
        if (n()) {
            jyVar.a(n);
            jyVar.a(this.f554a);
            jyVar.b();
        }
        if (this.f565j != null && o()) {
            jyVar.a(o);
            jyVar.a(this.f565j);
            jyVar.b();
        }
        if (p()) {
            jyVar.a(p);
            jyVar.a(this.f557c);
            jyVar.b();
        }
        if (this.f566k != null && q()) {
            jyVar.a(q);
            jyVar.a(this.f566k);
            jyVar.b();
        }
        if (this.f567l != null && r()) {
            jyVar.a(r);
            jyVar.a(this.f567l);
            jyVar.b();
        }
        jyVar.c();
        jyVar.m2202a();
    }

    public void b(boolean z) {
        this.f553a.set(1, z);
    }

    /* renamed from: b  reason: collision with other method in class */
    public boolean m2064b() {
        return this.f552a != null;
    }

    public String c() {
        return this.f558c;
    }

    public void c(boolean z) {
        this.f553a.set(2, z);
    }

    /* renamed from: c  reason: collision with other method in class */
    public boolean m2065c() {
        return this.f556b != null;
    }

    public void d(boolean z) {
        this.f553a.set(3, z);
    }

    public boolean d() {
        return this.f558c != null;
    }

    public boolean e() {
        return this.f553a.get(0);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof io)) {
            return m2063a((io) obj);
        }
        return false;
    }

    public boolean f() {
        return this.f553a.get(1);
    }

    public boolean g() {
        return this.f559d != null;
    }

    public boolean h() {
        return this.f560e != null;
    }

    public int hashCode() {
        return 0;
    }

    public boolean i() {
        return this.f561f != null;
    }

    public boolean j() {
        return this.f562g != null;
    }

    public boolean k() {
        return this.f563h != null;
    }

    public boolean l() {
        return this.f550a != null;
    }

    public boolean m() {
        return this.f564i != null;
    }

    public boolean n() {
        return this.f553a.get(2);
    }

    public boolean o() {
        return this.f565j != null;
    }

    public boolean p() {
        return this.f553a.get(3);
    }

    public boolean q() {
        return this.f566k != null;
    }

    public boolean r() {
        return this.f567l != null;
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("PushMessage(");
        if (m2062a()) {
            sb.append("to:");
            ir irVar = this.f551a;
            if (irVar == null) {
                sb.append("null");
            } else {
                sb.append(irVar);
            }
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            sb.append(", ");
        }
        sb.append("id:");
        String str = this.f552a;
        if (str == null) {
            sb.append("null");
        } else {
            sb.append(str);
        }
        sb.append(", ");
        sb.append("appId:");
        String str2 = this.f556b;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(str2);
        }
        sb.append(", ");
        sb.append("payload:");
        String str3 = this.f558c;
        if (str3 == null) {
            sb.append("null");
        } else {
            sb.append(str3);
        }
        if (e()) {
            sb.append(", ");
            sb.append("createAt:");
            sb.append(this.f549a);
        }
        if (f()) {
            sb.append(", ");
            sb.append("ttl:");
            sb.append(this.f555b);
        }
        if (g()) {
            sb.append(", ");
            sb.append("collapseKey:");
            String str4 = this.f559d;
            if (str4 == null) {
                sb.append("null");
            } else {
                sb.append(str4);
            }
        }
        if (h()) {
            sb.append(", ");
            sb.append("packageName:");
            String str5 = this.f560e;
            if (str5 == null) {
                sb.append("null");
            } else {
                sb.append(str5);
            }
        }
        if (i()) {
            sb.append(", ");
            sb.append("regId:");
            String str6 = this.f561f;
            if (str6 == null) {
                sb.append("null");
            } else {
                sb.append(str6);
            }
        }
        if (j()) {
            sb.append(", ");
            sb.append("category:");
            String str7 = this.f562g;
            if (str7 == null) {
                sb.append("null");
            } else {
                sb.append(str7);
            }
        }
        if (k()) {
            sb.append(", ");
            sb.append("topic:");
            String str8 = this.f563h;
            if (str8 == null) {
                sb.append("null");
            } else {
                sb.append(str8);
            }
        }
        if (l()) {
            sb.append(", ");
            sb.append("metaInfo:");
            ip ipVar = this.f550a;
            if (ipVar == null) {
                sb.append("null");
            } else {
                sb.append(ipVar);
            }
        }
        if (m()) {
            sb.append(", ");
            sb.append("aliasName:");
            String str9 = this.f564i;
            if (str9 == null) {
                sb.append("null");
            } else {
                sb.append(str9);
            }
        }
        if (n()) {
            sb.append(", ");
            sb.append("isOnline:");
            sb.append(this.f554a);
        }
        if (o()) {
            sb.append(", ");
            sb.append("userAccount:");
            String str10 = this.f565j;
            if (str10 == null) {
                sb.append("null");
            } else {
                sb.append(str10);
            }
        }
        if (p()) {
            sb.append(", ");
            sb.append("miid:");
            sb.append(this.f557c);
        }
        if (q()) {
            sb.append(", ");
            sb.append("imeiMd5:");
            String str11 = this.f566k;
            if (str11 == null) {
                sb.append("null");
            } else {
                sb.append(str11);
            }
        }
        if (r()) {
            sb.append(", ");
            sb.append("deviceId:");
            String str12 = this.f567l;
            if (str12 == null) {
                sb.append("null");
            } else {
                sb.append(str12);
            }
        }
        sb.append(riy.BRACKET_END_STR);
        return sb.toString();
    }
}
