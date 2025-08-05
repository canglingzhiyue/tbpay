package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;
import tb.riy;

/* loaded from: classes9.dex */
public class jc implements jn<jc, Object>, Serializable, Cloneable {

    /* renamed from: a  reason: collision with other field name */
    public int f690a;

    /* renamed from: a  reason: collision with other field name */
    public long f691a;

    /* renamed from: a  reason: collision with other field name */
    public iq f692a;

    /* renamed from: a  reason: collision with other field name */
    public ir f693a;

    /* renamed from: a  reason: collision with other field name */
    public String f694a;

    /* renamed from: a  reason: collision with other field name */
    public Map<String, String> f696a;

    /* renamed from: b  reason: collision with other field name */
    public int f698b;

    /* renamed from: b  reason: collision with other field name */
    public long f699b;

    /* renamed from: b  reason: collision with other field name */
    public String f700b;

    /* renamed from: c  reason: collision with other field name */
    public int f702c;

    /* renamed from: c  reason: collision with other field name */
    public String f703c;

    /* renamed from: d  reason: collision with other field name */
    public String f705d;

    /* renamed from: e  reason: collision with other field name */
    public String f706e;

    /* renamed from: f  reason: collision with other field name */
    public String f707f;

    /* renamed from: g  reason: collision with other field name */
    public String f708g;

    /* renamed from: h  reason: collision with other field name */
    public String f709h;

    /* renamed from: i  reason: collision with other field name */
    public String f710i;

    /* renamed from: j  reason: collision with other field name */
    public String f711j;

    /* renamed from: k  reason: collision with other field name */
    public String f712k;

    /* renamed from: l  reason: collision with other field name */
    public String f713l;

    /* renamed from: m  reason: collision with other field name */
    public String f714m;

    /* renamed from: n  reason: collision with other field name */
    public String f715n;

    /* renamed from: o  reason: collision with other field name */
    public String f716o;

    /* renamed from: p  reason: collision with other field name */
    public String f717p;

    /* renamed from: q  reason: collision with other field name */
    public String f718q;

    /* renamed from: r  reason: collision with other field name */
    public String f719r;

    /* renamed from: a  reason: collision with other field name */
    private static final kd f689a = new kd("XmPushActionRegistration");

    /* renamed from: a  reason: collision with root package name */
    private static final jv f24569a = new jv("", (byte) 11, 1);
    private static final jv b = new jv("", (byte) 12, 2);
    private static final jv c = new jv("", (byte) 11, 3);
    private static final jv d = new jv("", (byte) 11, 4);
    private static final jv e = new jv("", (byte) 11, 5);
    private static final jv f = new jv("", (byte) 11, 6);
    private static final jv g = new jv("", (byte) 11, 7);
    private static final jv h = new jv("", (byte) 11, 8);
    private static final jv i = new jv("", (byte) 11, 9);
    private static final jv j = new jv("", (byte) 11, 10);
    private static final jv k = new jv("", (byte) 11, 11);
    private static final jv l = new jv("", (byte) 11, 12);
    private static final jv m = new jv("", (byte) 8, 13);
    private static final jv n = new jv("", (byte) 8, 14);
    private static final jv o = new jv("", (byte) 11, 15);
    private static final jv p = new jv("", (byte) 11, 16);
    private static final jv q = new jv("", (byte) 11, 17);
    private static final jv r = new jv("", (byte) 11, 18);
    private static final jv s = new jv("", (byte) 8, 19);
    private static final jv t = new jv("", (byte) 8, 20);
    private static final jv u = new jv("", (byte) 2, 21);
    private static final jv v = new jv("", (byte) 10, 22);
    private static final jv w = new jv("", (byte) 10, 23);
    private static final jv x = new jv("", (byte) 11, 24);
    private static final jv y = new jv("", (byte) 11, 25);
    private static final jv z = new jv("", (byte) 2, 26);
    private static final jv A = new jv("", (byte) 13, 100);
    private static final jv B = new jv("", (byte) 2, 101);
    private static final jv C = new jv("", (byte) 11, 102);

    /* renamed from: a  reason: collision with other field name */
    private BitSet f695a = new BitSet(8);

    /* renamed from: a  reason: collision with other field name */
    public boolean f697a = true;

    /* renamed from: c  reason: collision with other field name */
    public boolean f704c = false;

    /* renamed from: b  reason: collision with other field name */
    public boolean f701b = false;

    public boolean A() {
        return this.f696a != null;
    }

    public boolean B() {
        return this.f695a.get(7);
    }

    public boolean C() {
        return this.f719r != null;
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(jc jcVar) {
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
        int a22;
        int a23;
        int a24;
        int a25;
        int a26;
        int a27;
        int a28;
        int a29;
        int a30;
        if (!getClass().equals(jcVar.getClass())) {
            return getClass().getName().compareTo(jcVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m2138a()).compareTo(Boolean.valueOf(jcVar.m2138a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m2138a() && (a30 = jo.a(this.f694a, jcVar.f694a)) != 0) {
            return a30;
        }
        int compareTo2 = Boolean.valueOf(m2140b()).compareTo(Boolean.valueOf(jcVar.m2140b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (m2140b() && (a29 = jo.a(this.f693a, jcVar.f693a)) != 0) {
            return a29;
        }
        int compareTo3 = Boolean.valueOf(m2141c()).compareTo(Boolean.valueOf(jcVar.m2141c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (m2141c() && (a28 = jo.a(this.f700b, jcVar.f700b)) != 0) {
            return a28;
        }
        int compareTo4 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(jcVar.d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (d() && (a27 = jo.a(this.f703c, jcVar.f703c)) != 0) {
            return a27;
        }
        int compareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(jcVar.e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (e() && (a26 = jo.a(this.f705d, jcVar.f705d)) != 0) {
            return a26;
        }
        int compareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(jcVar.f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (f() && (a25 = jo.a(this.f706e, jcVar.f706e)) != 0) {
            return a25;
        }
        int compareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(jcVar.g()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (g() && (a24 = jo.a(this.f707f, jcVar.f707f)) != 0) {
            return a24;
        }
        int compareTo8 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(jcVar.h()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (h() && (a23 = jo.a(this.f708g, jcVar.f708g)) != 0) {
            return a23;
        }
        int compareTo9 = Boolean.valueOf(i()).compareTo(Boolean.valueOf(jcVar.i()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (i() && (a22 = jo.a(this.f709h, jcVar.f709h)) != 0) {
            return a22;
        }
        int compareTo10 = Boolean.valueOf(j()).compareTo(Boolean.valueOf(jcVar.j()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (j() && (a21 = jo.a(this.f710i, jcVar.f710i)) != 0) {
            return a21;
        }
        int compareTo11 = Boolean.valueOf(k()).compareTo(Boolean.valueOf(jcVar.k()));
        if (compareTo11 != 0) {
            return compareTo11;
        }
        if (k() && (a20 = jo.a(this.f711j, jcVar.f711j)) != 0) {
            return a20;
        }
        int compareTo12 = Boolean.valueOf(l()).compareTo(Boolean.valueOf(jcVar.l()));
        if (compareTo12 != 0) {
            return compareTo12;
        }
        if (l() && (a19 = jo.a(this.f712k, jcVar.f712k)) != 0) {
            return a19;
        }
        int compareTo13 = Boolean.valueOf(m()).compareTo(Boolean.valueOf(jcVar.m()));
        if (compareTo13 != 0) {
            return compareTo13;
        }
        if (m() && (a18 = jo.a(this.f690a, jcVar.f690a)) != 0) {
            return a18;
        }
        int compareTo14 = Boolean.valueOf(n()).compareTo(Boolean.valueOf(jcVar.n()));
        if (compareTo14 != 0) {
            return compareTo14;
        }
        if (n() && (a17 = jo.a(this.f698b, jcVar.f698b)) != 0) {
            return a17;
        }
        int compareTo15 = Boolean.valueOf(o()).compareTo(Boolean.valueOf(jcVar.o()));
        if (compareTo15 != 0) {
            return compareTo15;
        }
        if (o() && (a16 = jo.a(this.f713l, jcVar.f713l)) != 0) {
            return a16;
        }
        int compareTo16 = Boolean.valueOf(p()).compareTo(Boolean.valueOf(jcVar.p()));
        if (compareTo16 != 0) {
            return compareTo16;
        }
        if (p() && (a15 = jo.a(this.f714m, jcVar.f714m)) != 0) {
            return a15;
        }
        int compareTo17 = Boolean.valueOf(q()).compareTo(Boolean.valueOf(jcVar.q()));
        if (compareTo17 != 0) {
            return compareTo17;
        }
        if (q() && (a14 = jo.a(this.f715n, jcVar.f715n)) != 0) {
            return a14;
        }
        int compareTo18 = Boolean.valueOf(r()).compareTo(Boolean.valueOf(jcVar.r()));
        if (compareTo18 != 0) {
            return compareTo18;
        }
        if (r() && (a13 = jo.a(this.f716o, jcVar.f716o)) != 0) {
            return a13;
        }
        int compareTo19 = Boolean.valueOf(s()).compareTo(Boolean.valueOf(jcVar.s()));
        if (compareTo19 != 0) {
            return compareTo19;
        }
        if (s() && (a12 = jo.a(this.f702c, jcVar.f702c)) != 0) {
            return a12;
        }
        int compareTo20 = Boolean.valueOf(t()).compareTo(Boolean.valueOf(jcVar.t()));
        if (compareTo20 != 0) {
            return compareTo20;
        }
        if (t() && (a11 = jo.a(this.f692a, jcVar.f692a)) != 0) {
            return a11;
        }
        int compareTo21 = Boolean.valueOf(u()).compareTo(Boolean.valueOf(jcVar.u()));
        if (compareTo21 != 0) {
            return compareTo21;
        }
        if (u() && (a10 = jo.a(this.f697a, jcVar.f697a)) != 0) {
            return a10;
        }
        int compareTo22 = Boolean.valueOf(v()).compareTo(Boolean.valueOf(jcVar.v()));
        if (compareTo22 != 0) {
            return compareTo22;
        }
        if (v() && (a9 = jo.a(this.f691a, jcVar.f691a)) != 0) {
            return a9;
        }
        int compareTo23 = Boolean.valueOf(w()).compareTo(Boolean.valueOf(jcVar.w()));
        if (compareTo23 != 0) {
            return compareTo23;
        }
        if (w() && (a8 = jo.a(this.f699b, jcVar.f699b)) != 0) {
            return a8;
        }
        int compareTo24 = Boolean.valueOf(x()).compareTo(Boolean.valueOf(jcVar.x()));
        if (compareTo24 != 0) {
            return compareTo24;
        }
        if (x() && (a7 = jo.a(this.f717p, jcVar.f717p)) != 0) {
            return a7;
        }
        int compareTo25 = Boolean.valueOf(y()).compareTo(Boolean.valueOf(jcVar.y()));
        if (compareTo25 != 0) {
            return compareTo25;
        }
        if (y() && (a6 = jo.a(this.f718q, jcVar.f718q)) != 0) {
            return a6;
        }
        int compareTo26 = Boolean.valueOf(z()).compareTo(Boolean.valueOf(jcVar.z()));
        if (compareTo26 != 0) {
            return compareTo26;
        }
        if (z() && (a5 = jo.a(this.f701b, jcVar.f701b)) != 0) {
            return a5;
        }
        int compareTo27 = Boolean.valueOf(A()).compareTo(Boolean.valueOf(jcVar.A()));
        if (compareTo27 != 0) {
            return compareTo27;
        }
        if (A() && (a4 = jo.a(this.f696a, jcVar.f696a)) != 0) {
            return a4;
        }
        int compareTo28 = Boolean.valueOf(B()).compareTo(Boolean.valueOf(jcVar.B()));
        if (compareTo28 != 0) {
            return compareTo28;
        }
        if (B() && (a3 = jo.a(this.f704c, jcVar.f704c)) != 0) {
            return a3;
        }
        int compareTo29 = Boolean.valueOf(C()).compareTo(Boolean.valueOf(jcVar.C()));
        if (compareTo29 != 0) {
            return compareTo29;
        }
        if (C() && (a2 = jo.a(this.f719r, jcVar.f719r)) != 0) {
            return a2;
        }
        return 0;
    }

    public jc a(int i2) {
        this.f690a = i2;
        a(true);
        return this;
    }

    public jc a(iq iqVar) {
        this.f692a = iqVar;
        return this;
    }

    public jc a(String str) {
        this.f700b = str;
        return this;
    }

    public String a() {
        return this.f700b;
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m2137a() {
        if (this.f700b == null) {
            throw new jz("Required field 'id' was not present! Struct: " + toString());
        } else if (this.f703c == null) {
            throw new jz("Required field 'appId' was not present! Struct: " + toString());
        } else if (this.f707f != null) {
        } else {
            throw new jz("Required field 'token' was not present! Struct: " + toString());
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
                m2137a();
                return;
            }
            short s2 = m2194a.f840a;
            switch (s2) {
                case 1:
                    if (m2194a.f24584a == 11) {
                        this.f694a = jyVar.m2199a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 2:
                    if (m2194a.f24584a == 12) {
                        this.f693a = new ir();
                        this.f693a.a(jyVar);
                        continue;
                        jyVar.g();
                    }
                    break;
                case 3:
                    if (m2194a.f24584a == 11) {
                        this.f700b = jyVar.m2199a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 4:
                    if (m2194a.f24584a == 11) {
                        this.f703c = jyVar.m2199a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 5:
                    if (m2194a.f24584a == 11) {
                        this.f705d = jyVar.m2199a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 6:
                    if (m2194a.f24584a == 11) {
                        this.f706e = jyVar.m2199a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 7:
                    if (m2194a.f24584a == 11) {
                        this.f707f = jyVar.m2199a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 8:
                    if (m2194a.f24584a == 11) {
                        this.f708g = jyVar.m2199a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 9:
                    if (m2194a.f24584a == 11) {
                        this.f709h = jyVar.m2199a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 10:
                    if (m2194a.f24584a == 11) {
                        this.f710i = jyVar.m2199a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 11:
                    if (m2194a.f24584a == 11) {
                        this.f711j = jyVar.m2199a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 12:
                    if (m2194a.f24584a == 11) {
                        this.f712k = jyVar.m2199a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 13:
                    if (m2194a.f24584a == 8) {
                        this.f690a = jyVar.m2192a();
                        a(true);
                        continue;
                        jyVar.g();
                    }
                    break;
                case 14:
                    if (m2194a.f24584a == 8) {
                        this.f698b = jyVar.m2192a();
                        b(true);
                        continue;
                        jyVar.g();
                    }
                    break;
                case 15:
                    if (m2194a.f24584a == 11) {
                        this.f713l = jyVar.m2199a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 16:
                    if (m2194a.f24584a == 11) {
                        this.f714m = jyVar.m2199a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 17:
                    if (m2194a.f24584a == 11) {
                        this.f715n = jyVar.m2199a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 18:
                    if (m2194a.f24584a == 11) {
                        this.f716o = jyVar.m2199a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 19:
                    if (m2194a.f24584a == 8) {
                        this.f702c = jyVar.m2192a();
                        c(true);
                        continue;
                        jyVar.g();
                    }
                    break;
                case 20:
                    if (m2194a.f24584a == 8) {
                        this.f692a = iq.a(jyVar.m2192a());
                        continue;
                        jyVar.g();
                    }
                    break;
                case 21:
                    if (m2194a.f24584a == 2) {
                        this.f697a = jyVar.m2203a();
                        d(true);
                        continue;
                        jyVar.g();
                    }
                    break;
                case 22:
                    if (m2194a.f24584a == 10) {
                        this.f691a = jyVar.m2193a();
                        e(true);
                        continue;
                        jyVar.g();
                    }
                    break;
                case 23:
                    if (m2194a.f24584a == 10) {
                        this.f699b = jyVar.m2193a();
                        f(true);
                        continue;
                        jyVar.g();
                    }
                    break;
                case 24:
                    if (m2194a.f24584a == 11) {
                        this.f717p = jyVar.m2199a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 25:
                    if (m2194a.f24584a == 11) {
                        this.f718q = jyVar.m2199a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 26:
                    if (m2194a.f24584a == 2) {
                        this.f701b = jyVar.m2203a();
                        g(true);
                        continue;
                        jyVar.g();
                    }
                    break;
                default:
                    switch (s2) {
                        case 100:
                            if (m2194a.f24584a == 13) {
                                jx m2196a = jyVar.m2196a();
                                this.f696a = new HashMap(m2196a.f842a * 2);
                                for (int i2 = 0; i2 < m2196a.f842a; i2++) {
                                    this.f696a.put(jyVar.m2199a(), jyVar.m2199a());
                                }
                                jyVar.h();
                                break;
                            }
                            break;
                        case 101:
                            if (m2194a.f24584a == 2) {
                                this.f704c = jyVar.m2203a();
                                h(true);
                                break;
                            }
                            break;
                        case 102:
                            if (m2194a.f24584a == 11) {
                                this.f719r = jyVar.m2199a();
                                continue;
                            }
                            break;
                    }
                    jyVar.g();
                    break;
            }
            kb.a(jyVar, m2194a.f24584a);
            jyVar.g();
        }
    }

    public void a(boolean z2) {
        this.f695a.set(0, z2);
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m2138a() {
        return this.f694a != null;
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m2139a(jc jcVar) {
        if (jcVar == null) {
            return false;
        }
        boolean m2138a = m2138a();
        boolean m2138a2 = jcVar.m2138a();
        if ((m2138a || m2138a2) && (!m2138a || !m2138a2 || !this.f694a.equals(jcVar.f694a))) {
            return false;
        }
        boolean m2140b = m2140b();
        boolean m2140b2 = jcVar.m2140b();
        if ((m2140b || m2140b2) && (!m2140b || !m2140b2 || !this.f693a.m2080a(jcVar.f693a))) {
            return false;
        }
        boolean m2141c = m2141c();
        boolean m2141c2 = jcVar.m2141c();
        if ((m2141c || m2141c2) && (!m2141c || !m2141c2 || !this.f700b.equals(jcVar.f700b))) {
            return false;
        }
        boolean d2 = d();
        boolean d3 = jcVar.d();
        if ((d2 || d3) && (!d2 || !d3 || !this.f703c.equals(jcVar.f703c))) {
            return false;
        }
        boolean e2 = e();
        boolean e3 = jcVar.e();
        if ((e2 || e3) && (!e2 || !e3 || !this.f705d.equals(jcVar.f705d))) {
            return false;
        }
        boolean f2 = f();
        boolean f3 = jcVar.f();
        if ((f2 || f3) && (!f2 || !f3 || !this.f706e.equals(jcVar.f706e))) {
            return false;
        }
        boolean g2 = g();
        boolean g3 = jcVar.g();
        if ((g2 || g3) && (!g2 || !g3 || !this.f707f.equals(jcVar.f707f))) {
            return false;
        }
        boolean h2 = h();
        boolean h3 = jcVar.h();
        if ((h2 || h3) && (!h2 || !h3 || !this.f708g.equals(jcVar.f708g))) {
            return false;
        }
        boolean i2 = i();
        boolean i3 = jcVar.i();
        if ((i2 || i3) && (!i2 || !i3 || !this.f709h.equals(jcVar.f709h))) {
            return false;
        }
        boolean j2 = j();
        boolean j3 = jcVar.j();
        if ((j2 || j3) && (!j2 || !j3 || !this.f710i.equals(jcVar.f710i))) {
            return false;
        }
        boolean k2 = k();
        boolean k3 = jcVar.k();
        if ((k2 || k3) && (!k2 || !k3 || !this.f711j.equals(jcVar.f711j))) {
            return false;
        }
        boolean l2 = l();
        boolean l3 = jcVar.l();
        if ((l2 || l3) && (!l2 || !l3 || !this.f712k.equals(jcVar.f712k))) {
            return false;
        }
        boolean m2 = m();
        boolean m3 = jcVar.m();
        if ((m2 || m3) && (!m2 || !m3 || this.f690a != jcVar.f690a)) {
            return false;
        }
        boolean n2 = n();
        boolean n3 = jcVar.n();
        if ((n2 || n3) && (!n2 || !n3 || this.f698b != jcVar.f698b)) {
            return false;
        }
        boolean o2 = o();
        boolean o3 = jcVar.o();
        if ((o2 || o3) && (!o2 || !o3 || !this.f713l.equals(jcVar.f713l))) {
            return false;
        }
        boolean p2 = p();
        boolean p3 = jcVar.p();
        if ((p2 || p3) && (!p2 || !p3 || !this.f714m.equals(jcVar.f714m))) {
            return false;
        }
        boolean q2 = q();
        boolean q3 = jcVar.q();
        if ((q2 || q3) && (!q2 || !q3 || !this.f715n.equals(jcVar.f715n))) {
            return false;
        }
        boolean r2 = r();
        boolean r3 = jcVar.r();
        if ((r2 || r3) && (!r2 || !r3 || !this.f716o.equals(jcVar.f716o))) {
            return false;
        }
        boolean s2 = s();
        boolean s3 = jcVar.s();
        if ((s2 || s3) && (!s2 || !s3 || this.f702c != jcVar.f702c)) {
            return false;
        }
        boolean t2 = t();
        boolean t3 = jcVar.t();
        if ((t2 || t3) && (!t2 || !t3 || !this.f692a.equals(jcVar.f692a))) {
            return false;
        }
        boolean u2 = u();
        boolean u3 = jcVar.u();
        if ((u2 || u3) && (!u2 || !u3 || this.f697a != jcVar.f697a)) {
            return false;
        }
        boolean v2 = v();
        boolean v3 = jcVar.v();
        if ((v2 || v3) && (!v2 || !v3 || this.f691a != jcVar.f691a)) {
            return false;
        }
        boolean w2 = w();
        boolean w3 = jcVar.w();
        if ((w2 || w3) && (!w2 || !w3 || this.f699b != jcVar.f699b)) {
            return false;
        }
        boolean x2 = x();
        boolean x3 = jcVar.x();
        if ((x2 || x3) && (!x2 || !x3 || !this.f717p.equals(jcVar.f717p))) {
            return false;
        }
        boolean y2 = y();
        boolean y3 = jcVar.y();
        if ((y2 || y3) && (!y2 || !y3 || !this.f718q.equals(jcVar.f718q))) {
            return false;
        }
        boolean z2 = z();
        boolean z3 = jcVar.z();
        if ((z2 || z3) && (!z2 || !z3 || this.f701b != jcVar.f701b)) {
            return false;
        }
        boolean A2 = A();
        boolean A3 = jcVar.A();
        if ((A2 || A3) && (!A2 || !A3 || !this.f696a.equals(jcVar.f696a))) {
            return false;
        }
        boolean B2 = B();
        boolean B3 = jcVar.B();
        if ((B2 || B3) && (!B2 || !B3 || this.f704c != jcVar.f704c)) {
            return false;
        }
        boolean C2 = C();
        boolean C3 = jcVar.C();
        if (!C2 && !C3) {
            return true;
        }
        return C2 && C3 && this.f719r.equals(jcVar.f719r);
    }

    public jc b(int i2) {
        this.f698b = i2;
        b(true);
        return this;
    }

    public jc b(String str) {
        this.f703c = str;
        return this;
    }

    public String b() {
        return this.f703c;
    }

    @Override // com.xiaomi.push.jn
    public void b(jy jyVar) {
        m2137a();
        jyVar.a(f689a);
        if (this.f694a != null && m2138a()) {
            jyVar.a(f24569a);
            jyVar.a(this.f694a);
            jyVar.b();
        }
        if (this.f693a != null && m2140b()) {
            jyVar.a(b);
            this.f693a.b(jyVar);
            jyVar.b();
        }
        if (this.f700b != null) {
            jyVar.a(c);
            jyVar.a(this.f700b);
            jyVar.b();
        }
        if (this.f703c != null) {
            jyVar.a(d);
            jyVar.a(this.f703c);
            jyVar.b();
        }
        if (this.f705d != null && e()) {
            jyVar.a(e);
            jyVar.a(this.f705d);
            jyVar.b();
        }
        if (this.f706e != null && f()) {
            jyVar.a(f);
            jyVar.a(this.f706e);
            jyVar.b();
        }
        if (this.f707f != null) {
            jyVar.a(g);
            jyVar.a(this.f707f);
            jyVar.b();
        }
        if (this.f708g != null && h()) {
            jyVar.a(h);
            jyVar.a(this.f708g);
            jyVar.b();
        }
        if (this.f709h != null && i()) {
            jyVar.a(i);
            jyVar.a(this.f709h);
            jyVar.b();
        }
        if (this.f710i != null && j()) {
            jyVar.a(j);
            jyVar.a(this.f710i);
            jyVar.b();
        }
        if (this.f711j != null && k()) {
            jyVar.a(k);
            jyVar.a(this.f711j);
            jyVar.b();
        }
        if (this.f712k != null && l()) {
            jyVar.a(l);
            jyVar.a(this.f712k);
            jyVar.b();
        }
        if (m()) {
            jyVar.a(m);
            jyVar.mo2190a(this.f690a);
            jyVar.b();
        }
        if (n()) {
            jyVar.a(n);
            jyVar.mo2190a(this.f698b);
            jyVar.b();
        }
        if (this.f713l != null && o()) {
            jyVar.a(o);
            jyVar.a(this.f713l);
            jyVar.b();
        }
        if (this.f714m != null && p()) {
            jyVar.a(p);
            jyVar.a(this.f714m);
            jyVar.b();
        }
        if (this.f715n != null && q()) {
            jyVar.a(q);
            jyVar.a(this.f715n);
            jyVar.b();
        }
        if (this.f716o != null && r()) {
            jyVar.a(r);
            jyVar.a(this.f716o);
            jyVar.b();
        }
        if (s()) {
            jyVar.a(s);
            jyVar.mo2190a(this.f702c);
            jyVar.b();
        }
        if (this.f692a != null && t()) {
            jyVar.a(t);
            jyVar.mo2190a(this.f692a.a());
            jyVar.b();
        }
        if (u()) {
            jyVar.a(u);
            jyVar.a(this.f697a);
            jyVar.b();
        }
        if (v()) {
            jyVar.a(v);
            jyVar.a(this.f691a);
            jyVar.b();
        }
        if (w()) {
            jyVar.a(w);
            jyVar.a(this.f699b);
            jyVar.b();
        }
        if (this.f717p != null && x()) {
            jyVar.a(x);
            jyVar.a(this.f717p);
            jyVar.b();
        }
        if (this.f718q != null && y()) {
            jyVar.a(y);
            jyVar.a(this.f718q);
            jyVar.b();
        }
        if (z()) {
            jyVar.a(z);
            jyVar.a(this.f701b);
            jyVar.b();
        }
        if (this.f696a != null && A()) {
            jyVar.a(A);
            jyVar.a(new jx((byte) 11, (byte) 11, this.f696a.size()));
            for (Map.Entry<String, String> entry : this.f696a.entrySet()) {
                jyVar.a(entry.getKey());
                jyVar.a(entry.getValue());
            }
            jyVar.d();
            jyVar.b();
        }
        if (B()) {
            jyVar.a(B);
            jyVar.a(this.f704c);
            jyVar.b();
        }
        if (this.f719r != null && C()) {
            jyVar.a(C);
            jyVar.a(this.f719r);
            jyVar.b();
        }
        jyVar.c();
        jyVar.m2202a();
    }

    public void b(boolean z2) {
        this.f695a.set(1, z2);
    }

    /* renamed from: b  reason: collision with other method in class */
    public boolean m2140b() {
        return this.f693a != null;
    }

    public jc c(int i2) {
        this.f702c = i2;
        c(true);
        return this;
    }

    public jc c(String str) {
        this.f705d = str;
        return this;
    }

    public String c() {
        return this.f707f;
    }

    public void c(boolean z2) {
        this.f695a.set(2, z2);
    }

    /* renamed from: c  reason: collision with other method in class */
    public boolean m2141c() {
        return this.f700b != null;
    }

    public jc d(String str) {
        this.f706e = str;
        return this;
    }

    public void d(boolean z2) {
        this.f695a.set(3, z2);
    }

    public boolean d() {
        return this.f703c != null;
    }

    public jc e(String str) {
        this.f707f = str;
        return this;
    }

    public void e(boolean z2) {
        this.f695a.set(4, z2);
    }

    public boolean e() {
        return this.f705d != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof jc)) {
            return m2139a((jc) obj);
        }
        return false;
    }

    public jc f(String str) {
        this.f708g = str;
        return this;
    }

    public void f(boolean z2) {
        this.f695a.set(5, z2);
    }

    public boolean f() {
        return this.f706e != null;
    }

    public jc g(String str) {
        this.f709h = str;
        return this;
    }

    public void g(boolean z2) {
        this.f695a.set(6, z2);
    }

    public boolean g() {
        return this.f707f != null;
    }

    public jc h(String str) {
        this.f712k = str;
        return this;
    }

    public void h(boolean z2) {
        this.f695a.set(7, z2);
    }

    public boolean h() {
        return this.f708g != null;
    }

    public int hashCode() {
        return 0;
    }

    public jc i(String str) {
        this.f716o = str;
        return this;
    }

    public boolean i() {
        return this.f709h != null;
    }

    public boolean j() {
        return this.f710i != null;
    }

    public boolean k() {
        return this.f711j != null;
    }

    public boolean l() {
        return this.f712k != null;
    }

    public boolean m() {
        return this.f695a.get(0);
    }

    public boolean n() {
        return this.f695a.get(1);
    }

    public boolean o() {
        return this.f713l != null;
    }

    public boolean p() {
        return this.f714m != null;
    }

    public boolean q() {
        return this.f715n != null;
    }

    public boolean r() {
        return this.f716o != null;
    }

    public boolean s() {
        return this.f695a.get(2);
    }

    public boolean t() {
        return this.f692a != null;
    }

    public String toString() {
        boolean z2;
        StringBuilder sb = new StringBuilder("XmPushActionRegistration(");
        if (m2138a()) {
            sb.append("debug:");
            String str = this.f694a;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
            z2 = false;
        } else {
            z2 = true;
        }
        if (m2140b()) {
            if (!z2) {
                sb.append(", ");
            }
            sb.append("target:");
            ir irVar = this.f693a;
            if (irVar == null) {
                sb.append("null");
            } else {
                sb.append(irVar);
            }
            z2 = false;
        }
        if (!z2) {
            sb.append(", ");
        }
        sb.append("id:");
        String str2 = this.f700b;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(com.xiaomi.push.service.bc.a(str2));
        }
        sb.append(", ");
        sb.append("appId:");
        String str3 = this.f703c;
        if (str3 == null) {
            sb.append("null");
        } else {
            sb.append(str3);
        }
        if (e()) {
            sb.append(", ");
            sb.append("appVersion:");
            String str4 = this.f705d;
            if (str4 == null) {
                sb.append("null");
            } else {
                sb.append(str4);
            }
        }
        if (f()) {
            sb.append(", ");
            sb.append("packageName:");
            String str5 = this.f706e;
            if (str5 == null) {
                sb.append("null");
            } else {
                sb.append(str5);
            }
        }
        sb.append(", ");
        sb.append("token:");
        String str6 = this.f707f;
        if (str6 == null) {
            sb.append("null");
        } else {
            sb.append(str6);
        }
        if (h()) {
            sb.append(", ");
            sb.append("deviceId:");
            String str7 = this.f708g;
            if (str7 == null) {
                sb.append("null");
            } else {
                sb.append(str7);
            }
        }
        if (i()) {
            sb.append(", ");
            sb.append("aliasName:");
            String str8 = this.f709h;
            if (str8 == null) {
                sb.append("null");
            } else {
                sb.append(str8);
            }
        }
        if (j()) {
            sb.append(", ");
            sb.append("sdkVersion:");
            String str9 = this.f710i;
            if (str9 == null) {
                sb.append("null");
            } else {
                sb.append(str9);
            }
        }
        if (k()) {
            sb.append(", ");
            sb.append("regId:");
            String str10 = this.f711j;
            if (str10 == null) {
                sb.append("null");
            } else {
                sb.append(str10);
            }
        }
        if (l()) {
            sb.append(", ");
            sb.append("pushSdkVersionName:");
            String str11 = this.f712k;
            if (str11 == null) {
                sb.append("null");
            } else {
                sb.append(str11);
            }
        }
        if (m()) {
            sb.append(", ");
            sb.append("pushSdkVersionCode:");
            sb.append(this.f690a);
        }
        if (n()) {
            sb.append(", ");
            sb.append("appVersionCode:");
            sb.append(this.f698b);
        }
        if (o()) {
            sb.append(", ");
            sb.append("androidId:");
            String str12 = this.f713l;
            if (str12 == null) {
                sb.append("null");
            } else {
                sb.append(str12);
            }
        }
        if (p()) {
            sb.append(", ");
            sb.append("imei:");
            String str13 = this.f714m;
            if (str13 == null) {
                sb.append("null");
            } else {
                sb.append(str13);
            }
        }
        if (q()) {
            sb.append(", ");
            sb.append("serial:");
            String str14 = this.f715n;
            if (str14 == null) {
                sb.append("null");
            } else {
                sb.append(str14);
            }
        }
        if (r()) {
            sb.append(", ");
            sb.append("imeiMd5:");
            String str15 = this.f716o;
            if (str15 == null) {
                sb.append("null");
            } else {
                sb.append(str15);
            }
        }
        if (s()) {
            sb.append(", ");
            sb.append("spaceId:");
            sb.append(this.f702c);
        }
        if (t()) {
            sb.append(", ");
            sb.append("reason:");
            iq iqVar = this.f692a;
            if (iqVar == null) {
                sb.append("null");
            } else {
                sb.append(iqVar);
            }
        }
        if (u()) {
            sb.append(", ");
            sb.append("validateToken:");
            sb.append(this.f697a);
        }
        if (v()) {
            sb.append(", ");
            sb.append("miid:");
            sb.append(this.f691a);
        }
        if (w()) {
            sb.append(", ");
            sb.append("createdTs:");
            sb.append(this.f699b);
        }
        if (x()) {
            sb.append(", ");
            sb.append("subImei:");
            String str16 = this.f717p;
            if (str16 == null) {
                sb.append("null");
            } else {
                sb.append(str16);
            }
        }
        if (y()) {
            sb.append(", ");
            sb.append("subImeiMd5:");
            String str17 = this.f718q;
            if (str17 == null) {
                sb.append("null");
            } else {
                sb.append(str17);
            }
        }
        if (z()) {
            sb.append(", ");
            sb.append("isHybridFrame:");
            sb.append(this.f701b);
        }
        if (A()) {
            sb.append(", ");
            sb.append("connectionAttrs:");
            Map<String, String> map = this.f696a;
            if (map == null) {
                sb.append("null");
            } else {
                sb.append(map);
            }
        }
        if (B()) {
            sb.append(", ");
            sb.append("cleanOldRegInfo:");
            sb.append(this.f704c);
        }
        if (C()) {
            sb.append(", ");
            sb.append("oldRegId:");
            String str18 = this.f719r;
            if (str18 == null) {
                sb.append("null");
            } else {
                sb.append(str18);
            }
        }
        sb.append(riy.BRACKET_END_STR);
        return sb.toString();
    }

    public boolean u() {
        return this.f695a.get(3);
    }

    public boolean v() {
        return this.f695a.get(4);
    }

    public boolean w() {
        return this.f695a.get(5);
    }

    public boolean x() {
        return this.f717p != null;
    }

    public boolean y() {
        return this.f718q != null;
    }

    public boolean z() {
        return this.f695a.get(6);
    }
}
