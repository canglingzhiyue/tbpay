package com.xiaomi.push;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import tb.riy;

/* loaded from: classes9.dex */
public class jd implements jn<jd, Object>, Serializable, Cloneable {

    /* renamed from: a  reason: collision with other field name */
    public int f721a;

    /* renamed from: a  reason: collision with other field name */
    public long f722a;

    /* renamed from: a  reason: collision with other field name */
    public ir f723a;

    /* renamed from: a  reason: collision with other field name */
    public String f724a;

    /* renamed from: a  reason: collision with other field name */
    public List<String> f726a;

    /* renamed from: b  reason: collision with other field name */
    public int f728b;

    /* renamed from: b  reason: collision with other field name */
    public long f729b;

    /* renamed from: b  reason: collision with other field name */
    public String f730b;

    /* renamed from: c  reason: collision with other field name */
    public long f731c;

    /* renamed from: c  reason: collision with other field name */
    public String f732c;

    /* renamed from: d  reason: collision with other field name */
    public String f733d;

    /* renamed from: e  reason: collision with other field name */
    public String f734e;

    /* renamed from: f  reason: collision with other field name */
    public String f735f;

    /* renamed from: g  reason: collision with other field name */
    public String f736g;

    /* renamed from: h  reason: collision with other field name */
    public String f737h;

    /* renamed from: i  reason: collision with other field name */
    public String f738i;

    /* renamed from: j  reason: collision with other field name */
    public String f739j;

    /* renamed from: k  reason: collision with other field name */
    public String f740k;

    /* renamed from: l  reason: collision with other field name */
    public String f741l;

    /* renamed from: a  reason: collision with other field name */
    private static final kd f720a = new kd("XmPushActionRegistrationResult");

    /* renamed from: a  reason: collision with root package name */
    private static final jv f24570a = new jv("", (byte) 11, 1);
    private static final jv b = new jv("", (byte) 12, 2);
    private static final jv c = new jv("", (byte) 11, 3);
    private static final jv d = new jv("", (byte) 11, 4);
    private static final jv e = new jv("", (byte) 10, 6);
    private static final jv f = new jv("", (byte) 11, 7);
    private static final jv g = new jv("", (byte) 11, 8);
    private static final jv h = new jv("", (byte) 11, 9);
    private static final jv i = new jv("", (byte) 11, 10);
    private static final jv j = new jv("", (byte) 10, 11);
    private static final jv k = new jv("", (byte) 11, 12);
    private static final jv l = new jv("", (byte) 11, 13);
    private static final jv m = new jv("", (byte) 10, 14);
    private static final jv n = new jv("", (byte) 11, 15);
    private static final jv o = new jv("", (byte) 8, 16);
    private static final jv p = new jv("", (byte) 11, 17);
    private static final jv q = new jv("", (byte) 8, 18);
    private static final jv r = new jv("", (byte) 11, 19);
    private static final jv s = new jv("", (byte) 2, 20);
    private static final jv t = new jv("", (byte) 15, 21);

    /* renamed from: a  reason: collision with other field name */
    private BitSet f725a = new BitSet(6);

    /* renamed from: a  reason: collision with other field name */
    public boolean f727a = false;

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(jd jdVar) {
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
        int a20;
        int a21;
        if (!getClass().equals(jdVar.getClass())) {
            return getClass().getName().compareTo(jdVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m2145a()).compareTo(Boolean.valueOf(jdVar.m2145a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m2145a() && (a21 = jo.a(this.f724a, jdVar.f724a)) != 0) {
            return a21;
        }
        int compareTo2 = Boolean.valueOf(m2147b()).compareTo(Boolean.valueOf(jdVar.m2147b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (m2147b() && (a20 = jo.a(this.f723a, jdVar.f723a)) != 0) {
            return a20;
        }
        int compareTo3 = Boolean.valueOf(m2148c()).compareTo(Boolean.valueOf(jdVar.m2148c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (m2148c() && (a19 = jo.a(this.f730b, jdVar.f730b)) != 0) {
            return a19;
        }
        int compareTo4 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(jdVar.d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (d() && (a18 = jo.a(this.f732c, jdVar.f732c)) != 0) {
            return a18;
        }
        int compareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(jdVar.e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (e() && (a17 = jo.a(this.f722a, jdVar.f722a)) != 0) {
            return a17;
        }
        int compareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(jdVar.f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (f() && (a16 = jo.a(this.f733d, jdVar.f733d)) != 0) {
            return a16;
        }
        int compareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(jdVar.g()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (g() && (a15 = jo.a(this.f734e, jdVar.f734e)) != 0) {
            return a15;
        }
        int compareTo8 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(jdVar.h()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (h() && (a14 = jo.a(this.f735f, jdVar.f735f)) != 0) {
            return a14;
        }
        int compareTo9 = Boolean.valueOf(i()).compareTo(Boolean.valueOf(jdVar.i()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (i() && (a13 = jo.a(this.f736g, jdVar.f736g)) != 0) {
            return a13;
        }
        int compareTo10 = Boolean.valueOf(j()).compareTo(Boolean.valueOf(jdVar.j()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (j() && (a12 = jo.a(this.f729b, jdVar.f729b)) != 0) {
            return a12;
        }
        int compareTo11 = Boolean.valueOf(k()).compareTo(Boolean.valueOf(jdVar.k()));
        if (compareTo11 != 0) {
            return compareTo11;
        }
        if (k() && (a11 = jo.a(this.f737h, jdVar.f737h)) != 0) {
            return a11;
        }
        int compareTo12 = Boolean.valueOf(l()).compareTo(Boolean.valueOf(jdVar.l()));
        if (compareTo12 != 0) {
            return compareTo12;
        }
        if (l() && (a10 = jo.a(this.f738i, jdVar.f738i)) != 0) {
            return a10;
        }
        int compareTo13 = Boolean.valueOf(m()).compareTo(Boolean.valueOf(jdVar.m()));
        if (compareTo13 != 0) {
            return compareTo13;
        }
        if (m() && (a9 = jo.a(this.f731c, jdVar.f731c)) != 0) {
            return a9;
        }
        int compareTo14 = Boolean.valueOf(n()).compareTo(Boolean.valueOf(jdVar.n()));
        if (compareTo14 != 0) {
            return compareTo14;
        }
        if (n() && (a8 = jo.a(this.f739j, jdVar.f739j)) != 0) {
            return a8;
        }
        int compareTo15 = Boolean.valueOf(o()).compareTo(Boolean.valueOf(jdVar.o()));
        if (compareTo15 != 0) {
            return compareTo15;
        }
        if (o() && (a7 = jo.a(this.f721a, jdVar.f721a)) != 0) {
            return a7;
        }
        int compareTo16 = Boolean.valueOf(p()).compareTo(Boolean.valueOf(jdVar.p()));
        if (compareTo16 != 0) {
            return compareTo16;
        }
        if (p() && (a6 = jo.a(this.f740k, jdVar.f740k)) != 0) {
            return a6;
        }
        int compareTo17 = Boolean.valueOf(q()).compareTo(Boolean.valueOf(jdVar.q()));
        if (compareTo17 != 0) {
            return compareTo17;
        }
        if (q() && (a5 = jo.a(this.f728b, jdVar.f728b)) != 0) {
            return a5;
        }
        int compareTo18 = Boolean.valueOf(r()).compareTo(Boolean.valueOf(jdVar.r()));
        if (compareTo18 != 0) {
            return compareTo18;
        }
        if (r() && (a4 = jo.a(this.f741l, jdVar.f741l)) != 0) {
            return a4;
        }
        int compareTo19 = Boolean.valueOf(s()).compareTo(Boolean.valueOf(jdVar.s()));
        if (compareTo19 != 0) {
            return compareTo19;
        }
        if (s() && (a3 = jo.a(this.f727a, jdVar.f727a)) != 0) {
            return a3;
        }
        int compareTo20 = Boolean.valueOf(t()).compareTo(Boolean.valueOf(jdVar.t()));
        if (compareTo20 != 0) {
            return compareTo20;
        }
        if (t() && (a2 = jo.a(this.f726a, jdVar.f726a)) != 0) {
            return a2;
        }
        return 0;
    }

    public long a() {
        return this.f722a;
    }

    /* renamed from: a  reason: collision with other method in class */
    public String m2142a() {
        return this.f730b;
    }

    /* renamed from: a  reason: collision with other method in class */
    public List<String> m2143a() {
        return this.f726a;
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m2144a() {
        if (this.f730b == null) {
            throw new jz("Required field 'id' was not present! Struct: " + toString());
        } else if (this.f732c != null) {
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
                    m2144a();
                    return;
                }
                throw new jz("Required field 'errorCode' was not found in serialized data! Struct: " + toString());
            }
            switch (m2194a.f840a) {
                case 1:
                    if (m2194a.f24584a == 11) {
                        this.f724a = jyVar.m2199a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 2:
                    if (m2194a.f24584a == 12) {
                        this.f723a = new ir();
                        this.f723a.a(jyVar);
                        continue;
                        jyVar.g();
                    }
                    break;
                case 3:
                    if (m2194a.f24584a == 11) {
                        this.f730b = jyVar.m2199a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 4:
                    if (m2194a.f24584a == 11) {
                        this.f732c = jyVar.m2199a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 6:
                    if (m2194a.f24584a == 10) {
                        this.f722a = jyVar.m2193a();
                        a(true);
                        continue;
                        jyVar.g();
                    }
                    break;
                case 7:
                    if (m2194a.f24584a == 11) {
                        this.f733d = jyVar.m2199a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 8:
                    if (m2194a.f24584a == 11) {
                        this.f734e = jyVar.m2199a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 9:
                    if (m2194a.f24584a == 11) {
                        this.f735f = jyVar.m2199a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 10:
                    if (m2194a.f24584a == 11) {
                        this.f736g = jyVar.m2199a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 11:
                    if (m2194a.f24584a == 10) {
                        this.f729b = jyVar.m2193a();
                        b(true);
                        continue;
                        jyVar.g();
                    }
                    break;
                case 12:
                    if (m2194a.f24584a == 11) {
                        this.f737h = jyVar.m2199a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 13:
                    if (m2194a.f24584a == 11) {
                        this.f738i = jyVar.m2199a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 14:
                    if (m2194a.f24584a == 10) {
                        this.f731c = jyVar.m2193a();
                        c(true);
                        continue;
                        jyVar.g();
                    }
                    break;
                case 15:
                    if (m2194a.f24584a == 11) {
                        this.f739j = jyVar.m2199a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 16:
                    if (m2194a.f24584a == 8) {
                        this.f721a = jyVar.m2192a();
                        d(true);
                        continue;
                        jyVar.g();
                    }
                    break;
                case 17:
                    if (m2194a.f24584a == 11) {
                        this.f740k = jyVar.m2199a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 18:
                    if (m2194a.f24584a == 8) {
                        this.f728b = jyVar.m2192a();
                        e(true);
                        continue;
                        jyVar.g();
                    }
                    break;
                case 19:
                    if (m2194a.f24584a == 11) {
                        this.f741l = jyVar.m2199a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 20:
                    if (m2194a.f24584a == 2) {
                        this.f727a = jyVar.m2203a();
                        f(true);
                        continue;
                        jyVar.g();
                    }
                    break;
                case 21:
                    if (m2194a.f24584a == 15) {
                        jw m2195a = jyVar.m2195a();
                        this.f726a = new ArrayList(m2195a.f841a);
                        for (int i2 = 0; i2 < m2195a.f841a; i2++) {
                            this.f726a.add(jyVar.m2199a());
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

    public void a(boolean z) {
        this.f725a.set(0, z);
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m2145a() {
        return this.f724a != null;
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m2146a(jd jdVar) {
        if (jdVar == null) {
            return false;
        }
        boolean m2145a = m2145a();
        boolean m2145a2 = jdVar.m2145a();
        if ((m2145a || m2145a2) && (!m2145a || !m2145a2 || !this.f724a.equals(jdVar.f724a))) {
            return false;
        }
        boolean m2147b = m2147b();
        boolean m2147b2 = jdVar.m2147b();
        if ((m2147b || m2147b2) && (!m2147b || !m2147b2 || !this.f723a.m2080a(jdVar.f723a))) {
            return false;
        }
        boolean m2148c = m2148c();
        boolean m2148c2 = jdVar.m2148c();
        if ((m2148c || m2148c2) && (!m2148c || !m2148c2 || !this.f730b.equals(jdVar.f730b))) {
            return false;
        }
        boolean d2 = d();
        boolean d3 = jdVar.d();
        if (((d2 || d3) && (!d2 || !d3 || !this.f732c.equals(jdVar.f732c))) || this.f722a != jdVar.f722a) {
            return false;
        }
        boolean f2 = f();
        boolean f3 = jdVar.f();
        if ((f2 || f3) && (!f2 || !f3 || !this.f733d.equals(jdVar.f733d))) {
            return false;
        }
        boolean g2 = g();
        boolean g3 = jdVar.g();
        if ((g2 || g3) && (!g2 || !g3 || !this.f734e.equals(jdVar.f734e))) {
            return false;
        }
        boolean h2 = h();
        boolean h3 = jdVar.h();
        if ((h2 || h3) && (!h2 || !h3 || !this.f735f.equals(jdVar.f735f))) {
            return false;
        }
        boolean i2 = i();
        boolean i3 = jdVar.i();
        if ((i2 || i3) && (!i2 || !i3 || !this.f736g.equals(jdVar.f736g))) {
            return false;
        }
        boolean j2 = j();
        boolean j3 = jdVar.j();
        if ((j2 || j3) && (!j2 || !j3 || this.f729b != jdVar.f729b)) {
            return false;
        }
        boolean k2 = k();
        boolean k3 = jdVar.k();
        if ((k2 || k3) && (!k2 || !k3 || !this.f737h.equals(jdVar.f737h))) {
            return false;
        }
        boolean l2 = l();
        boolean l3 = jdVar.l();
        if ((l2 || l3) && (!l2 || !l3 || !this.f738i.equals(jdVar.f738i))) {
            return false;
        }
        boolean m2 = m();
        boolean m3 = jdVar.m();
        if ((m2 || m3) && (!m2 || !m3 || this.f731c != jdVar.f731c)) {
            return false;
        }
        boolean n2 = n();
        boolean n3 = jdVar.n();
        if ((n2 || n3) && (!n2 || !n3 || !this.f739j.equals(jdVar.f739j))) {
            return false;
        }
        boolean o2 = o();
        boolean o3 = jdVar.o();
        if ((o2 || o3) && (!o2 || !o3 || this.f721a != jdVar.f721a)) {
            return false;
        }
        boolean p2 = p();
        boolean p3 = jdVar.p();
        if ((p2 || p3) && (!p2 || !p3 || !this.f740k.equals(jdVar.f740k))) {
            return false;
        }
        boolean q2 = q();
        boolean q3 = jdVar.q();
        if ((q2 || q3) && (!q2 || !q3 || this.f728b != jdVar.f728b)) {
            return false;
        }
        boolean r2 = r();
        boolean r3 = jdVar.r();
        if ((r2 || r3) && (!r2 || !r3 || !this.f741l.equals(jdVar.f741l))) {
            return false;
        }
        boolean s2 = s();
        boolean s3 = jdVar.s();
        if ((s2 || s3) && (!s2 || !s3 || this.f727a != jdVar.f727a)) {
            return false;
        }
        boolean t2 = t();
        boolean t3 = jdVar.t();
        if (!t2 && !t3) {
            return true;
        }
        return t2 && t3 && this.f726a.equals(jdVar.f726a);
    }

    public String b() {
        return this.f735f;
    }

    @Override // com.xiaomi.push.jn
    public void b(jy jyVar) {
        m2144a();
        jyVar.a(f720a);
        if (this.f724a != null && m2145a()) {
            jyVar.a(f24570a);
            jyVar.a(this.f724a);
            jyVar.b();
        }
        if (this.f723a != null && m2147b()) {
            jyVar.a(b);
            this.f723a.b(jyVar);
            jyVar.b();
        }
        if (this.f730b != null) {
            jyVar.a(c);
            jyVar.a(this.f730b);
            jyVar.b();
        }
        if (this.f732c != null) {
            jyVar.a(d);
            jyVar.a(this.f732c);
            jyVar.b();
        }
        jyVar.a(e);
        jyVar.a(this.f722a);
        jyVar.b();
        if (this.f733d != null && f()) {
            jyVar.a(f);
            jyVar.a(this.f733d);
            jyVar.b();
        }
        if (this.f734e != null && g()) {
            jyVar.a(g);
            jyVar.a(this.f734e);
            jyVar.b();
        }
        if (this.f735f != null && h()) {
            jyVar.a(h);
            jyVar.a(this.f735f);
            jyVar.b();
        }
        if (this.f736g != null && i()) {
            jyVar.a(i);
            jyVar.a(this.f736g);
            jyVar.b();
        }
        if (j()) {
            jyVar.a(j);
            jyVar.a(this.f729b);
            jyVar.b();
        }
        if (this.f737h != null && k()) {
            jyVar.a(k);
            jyVar.a(this.f737h);
            jyVar.b();
        }
        if (this.f738i != null && l()) {
            jyVar.a(l);
            jyVar.a(this.f738i);
            jyVar.b();
        }
        if (m()) {
            jyVar.a(m);
            jyVar.a(this.f731c);
            jyVar.b();
        }
        if (this.f739j != null && n()) {
            jyVar.a(n);
            jyVar.a(this.f739j);
            jyVar.b();
        }
        if (o()) {
            jyVar.a(o);
            jyVar.mo2190a(this.f721a);
            jyVar.b();
        }
        if (this.f740k != null && p()) {
            jyVar.a(p);
            jyVar.a(this.f740k);
            jyVar.b();
        }
        if (q()) {
            jyVar.a(q);
            jyVar.mo2190a(this.f728b);
            jyVar.b();
        }
        if (this.f741l != null && r()) {
            jyVar.a(r);
            jyVar.a(this.f741l);
            jyVar.b();
        }
        if (s()) {
            jyVar.a(s);
            jyVar.a(this.f727a);
            jyVar.b();
        }
        if (this.f726a != null && t()) {
            jyVar.a(t);
            jyVar.a(new jw((byte) 11, this.f726a.size()));
            for (String str : this.f726a) {
                jyVar.a(str);
            }
            jyVar.e();
            jyVar.b();
        }
        jyVar.c();
        jyVar.m2202a();
    }

    public void b(boolean z) {
        this.f725a.set(1, z);
    }

    /* renamed from: b  reason: collision with other method in class */
    public boolean m2147b() {
        return this.f723a != null;
    }

    public String c() {
        return this.f736g;
    }

    public void c(boolean z) {
        this.f725a.set(2, z);
    }

    /* renamed from: c  reason: collision with other method in class */
    public boolean m2148c() {
        return this.f730b != null;
    }

    public void d(boolean z) {
        this.f725a.set(3, z);
    }

    public boolean d() {
        return this.f732c != null;
    }

    public void e(boolean z) {
        this.f725a.set(4, z);
    }

    public boolean e() {
        return this.f725a.get(0);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof jd)) {
            return m2146a((jd) obj);
        }
        return false;
    }

    public void f(boolean z) {
        this.f725a.set(5, z);
    }

    public boolean f() {
        return this.f733d != null;
    }

    public boolean g() {
        return this.f734e != null;
    }

    public boolean h() {
        return this.f735f != null;
    }

    public int hashCode() {
        return 0;
    }

    public boolean i() {
        return this.f736g != null;
    }

    public boolean j() {
        return this.f725a.get(1);
    }

    public boolean k() {
        return this.f737h != null;
    }

    public boolean l() {
        return this.f738i != null;
    }

    public boolean m() {
        return this.f725a.get(2);
    }

    public boolean n() {
        return this.f739j != null;
    }

    public boolean o() {
        return this.f725a.get(3);
    }

    public boolean p() {
        return this.f740k != null;
    }

    public boolean q() {
        return this.f725a.get(4);
    }

    public boolean r() {
        return this.f741l != null;
    }

    public boolean s() {
        return this.f725a.get(5);
    }

    public boolean t() {
        return this.f726a != null;
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("XmPushActionRegistrationResult(");
        if (m2145a()) {
            sb.append("debug:");
            String str = this.f724a;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
            z = false;
        } else {
            z = true;
        }
        if (m2147b()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("target:");
            ir irVar = this.f723a;
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
        String str2 = this.f730b;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(com.xiaomi.push.service.bc.a(str2));
        }
        sb.append(", ");
        sb.append("appId:");
        String str3 = this.f732c;
        if (str3 == null) {
            sb.append("null");
        } else {
            sb.append(str3);
        }
        sb.append(", ");
        sb.append("errorCode:");
        sb.append(this.f722a);
        if (f()) {
            sb.append(", ");
            sb.append("reason:");
            String str4 = this.f733d;
            if (str4 == null) {
                sb.append("null");
            } else {
                sb.append(str4);
            }
        }
        if (g()) {
            sb.append(", ");
            sb.append("regId:");
            String str5 = this.f734e;
            if (str5 == null) {
                sb.append("null");
            } else {
                sb.append(str5);
            }
        }
        if (i()) {
            sb.append(", ");
            sb.append("packageName:");
            String str6 = this.f736g;
            if (str6 == null) {
                sb.append("null");
            } else {
                sb.append(str6);
            }
        }
        if (j()) {
            sb.append(", ");
            sb.append("registeredAt:");
            sb.append(this.f729b);
        }
        if (k()) {
            sb.append(", ");
            sb.append("aliasName:");
            String str7 = this.f737h;
            if (str7 == null) {
                sb.append("null");
            } else {
                sb.append(str7);
            }
        }
        if (l()) {
            sb.append(", ");
            sb.append("clientId:");
            String str8 = this.f738i;
            if (str8 == null) {
                sb.append("null");
            } else {
                sb.append(str8);
            }
        }
        if (m()) {
            sb.append(", ");
            sb.append("costTime:");
            sb.append(this.f731c);
        }
        if (n()) {
            sb.append(", ");
            sb.append("appVersion:");
            String str9 = this.f739j;
            if (str9 == null) {
                sb.append("null");
            } else {
                sb.append(str9);
            }
        }
        if (o()) {
            sb.append(", ");
            sb.append("pushSdkVersionCode:");
            sb.append(this.f721a);
        }
        if (p()) {
            sb.append(", ");
            sb.append("hybridPushEndpoint:");
            String str10 = this.f740k;
            if (str10 == null) {
                sb.append("null");
            } else {
                sb.append(str10);
            }
        }
        if (q()) {
            sb.append(", ");
            sb.append("appVersionCode:");
            sb.append(this.f728b);
        }
        if (r()) {
            sb.append(", ");
            sb.append("region:");
            String str11 = this.f741l;
            if (str11 == null) {
                sb.append("null");
            } else {
                sb.append(str11);
            }
        }
        if (s()) {
            sb.append(", ");
            sb.append("isHybridFrame:");
            sb.append(this.f727a);
        }
        if (t()) {
            sb.append(", ");
            sb.append("autoMarkPkgs:");
            List<String> list = this.f726a;
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
