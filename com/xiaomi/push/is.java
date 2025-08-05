package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;
import tb.riy;

/* loaded from: classes9.dex */
public class is implements jn<is, Object>, Serializable, Cloneable {

    /* renamed from: a  reason: collision with other field name */
    public int f594a;

    /* renamed from: a  reason: collision with other field name */
    public long f595a;

    /* renamed from: a  reason: collision with other field name */
    public ir f596a;

    /* renamed from: a  reason: collision with other field name */
    public jf f597a;

    /* renamed from: a  reason: collision with other field name */
    public String f598a;

    /* renamed from: a  reason: collision with other field name */
    public Map<String, String> f600a;

    /* renamed from: a  reason: collision with other field name */
    public short f601a;

    /* renamed from: b  reason: collision with other field name */
    public String f603b;

    /* renamed from: b  reason: collision with other field name */
    public short f604b;

    /* renamed from: c  reason: collision with other field name */
    public String f605c;

    /* renamed from: d  reason: collision with other field name */
    public String f606d;

    /* renamed from: e  reason: collision with other field name */
    public String f607e;

    /* renamed from: f  reason: collision with other field name */
    public String f608f;

    /* renamed from: g  reason: collision with other field name */
    public String f609g;

    /* renamed from: h  reason: collision with other field name */
    public String f610h;

    /* renamed from: i  reason: collision with other field name */
    public String f611i;

    /* renamed from: j  reason: collision with other field name */
    public String f612j;

    /* renamed from: k  reason: collision with other field name */
    public String f613k;

    /* renamed from: l  reason: collision with other field name */
    public String f614l;

    /* renamed from: a  reason: collision with other field name */
    private static final kd f593a = new kd("XmPushActionAckMessage");

    /* renamed from: a  reason: collision with root package name */
    private static final jv f24558a = new jv("", (byte) 11, 1);
    private static final jv b = new jv("", (byte) 12, 2);
    private static final jv c = new jv("", (byte) 11, 3);
    private static final jv d = new jv("", (byte) 11, 4);
    private static final jv e = new jv("", (byte) 10, 5);
    private static final jv f = new jv("", (byte) 11, 6);
    private static final jv g = new jv("", (byte) 11, 7);
    private static final jv h = new jv("", (byte) 12, 8);
    private static final jv i = new jv("", (byte) 11, 9);
    private static final jv j = new jv("", (byte) 11, 10);
    private static final jv k = new jv("", (byte) 2, 11);
    private static final jv l = new jv("", (byte) 11, 12);
    private static final jv m = new jv("", (byte) 11, 13);
    private static final jv n = new jv("", (byte) 11, 14);
    private static final jv o = new jv("", (byte) 6, 15);
    private static final jv p = new jv("", (byte) 6, 16);
    private static final jv q = new jv("", (byte) 11, 20);
    private static final jv r = new jv("", (byte) 11, 21);
    private static final jv s = new jv("", (byte) 8, 22);
    private static final jv t = new jv("", (byte) 13, 23);

    /* renamed from: a  reason: collision with other field name */
    private BitSet f599a = new BitSet(5);

    /* renamed from: a  reason: collision with other field name */
    public boolean f602a = false;

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(is isVar) {
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
        if (!getClass().equals(isVar.getClass())) {
            return getClass().getName().compareTo(isVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m2081a()).compareTo(Boolean.valueOf(isVar.m2081a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m2081a() && (a21 = jo.a(this.f598a, isVar.f598a)) != 0) {
            return a21;
        }
        int compareTo2 = Boolean.valueOf(b()).compareTo(Boolean.valueOf(isVar.b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (b() && (a20 = jo.a(this.f596a, isVar.f596a)) != 0) {
            return a20;
        }
        int compareTo3 = Boolean.valueOf(c()).compareTo(Boolean.valueOf(isVar.c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (c() && (a19 = jo.a(this.f603b, isVar.f603b)) != 0) {
            return a19;
        }
        int compareTo4 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(isVar.d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (d() && (a18 = jo.a(this.f605c, isVar.f605c)) != 0) {
            return a18;
        }
        int compareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(isVar.e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (e() && (a17 = jo.a(this.f595a, isVar.f595a)) != 0) {
            return a17;
        }
        int compareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(isVar.f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (f() && (a16 = jo.a(this.f606d, isVar.f606d)) != 0) {
            return a16;
        }
        int compareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(isVar.g()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (g() && (a15 = jo.a(this.f607e, isVar.f607e)) != 0) {
            return a15;
        }
        int compareTo8 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(isVar.h()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (h() && (a14 = jo.a(this.f597a, isVar.f597a)) != 0) {
            return a14;
        }
        int compareTo9 = Boolean.valueOf(i()).compareTo(Boolean.valueOf(isVar.i()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (i() && (a13 = jo.a(this.f608f, isVar.f608f)) != 0) {
            return a13;
        }
        int compareTo10 = Boolean.valueOf(j()).compareTo(Boolean.valueOf(isVar.j()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (j() && (a12 = jo.a(this.f609g, isVar.f609g)) != 0) {
            return a12;
        }
        int compareTo11 = Boolean.valueOf(k()).compareTo(Boolean.valueOf(isVar.k()));
        if (compareTo11 != 0) {
            return compareTo11;
        }
        if (k() && (a11 = jo.a(this.f602a, isVar.f602a)) != 0) {
            return a11;
        }
        int compareTo12 = Boolean.valueOf(l()).compareTo(Boolean.valueOf(isVar.l()));
        if (compareTo12 != 0) {
            return compareTo12;
        }
        if (l() && (a10 = jo.a(this.f610h, isVar.f610h)) != 0) {
            return a10;
        }
        int compareTo13 = Boolean.valueOf(m()).compareTo(Boolean.valueOf(isVar.m()));
        if (compareTo13 != 0) {
            return compareTo13;
        }
        if (m() && (a9 = jo.a(this.f611i, isVar.f611i)) != 0) {
            return a9;
        }
        int compareTo14 = Boolean.valueOf(n()).compareTo(Boolean.valueOf(isVar.n()));
        if (compareTo14 != 0) {
            return compareTo14;
        }
        if (n() && (a8 = jo.a(this.f612j, isVar.f612j)) != 0) {
            return a8;
        }
        int compareTo15 = Boolean.valueOf(o()).compareTo(Boolean.valueOf(isVar.o()));
        if (compareTo15 != 0) {
            return compareTo15;
        }
        if (o() && (a7 = jo.a(this.f601a, isVar.f601a)) != 0) {
            return a7;
        }
        int compareTo16 = Boolean.valueOf(p()).compareTo(Boolean.valueOf(isVar.p()));
        if (compareTo16 != 0) {
            return compareTo16;
        }
        if (p() && (a6 = jo.a(this.f604b, isVar.f604b)) != 0) {
            return a6;
        }
        int compareTo17 = Boolean.valueOf(q()).compareTo(Boolean.valueOf(isVar.q()));
        if (compareTo17 != 0) {
            return compareTo17;
        }
        if (q() && (a5 = jo.a(this.f613k, isVar.f613k)) != 0) {
            return a5;
        }
        int compareTo18 = Boolean.valueOf(r()).compareTo(Boolean.valueOf(isVar.r()));
        if (compareTo18 != 0) {
            return compareTo18;
        }
        if (r() && (a4 = jo.a(this.f614l, isVar.f614l)) != 0) {
            return a4;
        }
        int compareTo19 = Boolean.valueOf(s()).compareTo(Boolean.valueOf(isVar.s()));
        if (compareTo19 != 0) {
            return compareTo19;
        }
        if (s() && (a3 = jo.a(this.f594a, isVar.f594a)) != 0) {
            return a3;
        }
        int compareTo20 = Boolean.valueOf(t()).compareTo(Boolean.valueOf(isVar.t()));
        if (compareTo20 != 0) {
            return compareTo20;
        }
        if (t() && (a2 = jo.a(this.f600a, isVar.f600a)) != 0) {
            return a2;
        }
        return 0;
    }

    public is a(long j2) {
        this.f595a = j2;
        a(true);
        return this;
    }

    public is a(String str) {
        this.f603b = str;
        return this;
    }

    public is a(short s2) {
        this.f601a = s2;
        c(true);
        return this;
    }

    public void a() {
        if (this.f603b == null) {
            throw new jz("Required field 'id' was not present! Struct: " + toString());
        } else if (this.f605c != null) {
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
                throw new jz("Required field 'messageTs' was not found in serialized data! Struct: " + toString());
            }
            switch (m2194a.f840a) {
                case 1:
                    if (m2194a.f24584a == 11) {
                        this.f598a = jyVar.m2199a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 2:
                    if (m2194a.f24584a == 12) {
                        this.f596a = new ir();
                        this.f596a.a(jyVar);
                        continue;
                        jyVar.g();
                    }
                    break;
                case 3:
                    if (m2194a.f24584a == 11) {
                        this.f603b = jyVar.m2199a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 4:
                    if (m2194a.f24584a == 11) {
                        this.f605c = jyVar.m2199a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 5:
                    if (m2194a.f24584a == 10) {
                        this.f595a = jyVar.m2193a();
                        a(true);
                        continue;
                        jyVar.g();
                    }
                    break;
                case 6:
                    if (m2194a.f24584a == 11) {
                        this.f606d = jyVar.m2199a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 7:
                    if (m2194a.f24584a == 11) {
                        this.f607e = jyVar.m2199a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 8:
                    if (m2194a.f24584a == 12) {
                        this.f597a = new jf();
                        this.f597a.a(jyVar);
                        continue;
                        jyVar.g();
                    }
                    break;
                case 9:
                    if (m2194a.f24584a == 11) {
                        this.f608f = jyVar.m2199a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 10:
                    if (m2194a.f24584a == 11) {
                        this.f609g = jyVar.m2199a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 11:
                    if (m2194a.f24584a == 2) {
                        this.f602a = jyVar.m2203a();
                        b(true);
                        continue;
                        jyVar.g();
                    }
                    break;
                case 12:
                    if (m2194a.f24584a == 11) {
                        this.f610h = jyVar.m2199a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 13:
                    if (m2194a.f24584a == 11) {
                        this.f611i = jyVar.m2199a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 14:
                    if (m2194a.f24584a == 11) {
                        this.f612j = jyVar.m2199a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 15:
                    if (m2194a.f24584a == 6) {
                        this.f601a = jyVar.m2201a();
                        c(true);
                        continue;
                        jyVar.g();
                    }
                    break;
                case 16:
                    if (m2194a.f24584a == 6) {
                        this.f604b = jyVar.m2201a();
                        d(true);
                        continue;
                        jyVar.g();
                    }
                    break;
                case 20:
                    if (m2194a.f24584a == 11) {
                        this.f613k = jyVar.m2199a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 21:
                    if (m2194a.f24584a == 11) {
                        this.f614l = jyVar.m2199a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 22:
                    if (m2194a.f24584a == 8) {
                        this.f594a = jyVar.m2192a();
                        e(true);
                        continue;
                        jyVar.g();
                    }
                    break;
                case 23:
                    if (m2194a.f24584a == 13) {
                        jx m2196a = jyVar.m2196a();
                        this.f600a = new HashMap(m2196a.f842a * 2);
                        for (int i2 = 0; i2 < m2196a.f842a; i2++) {
                            this.f600a.put(jyVar.m2199a(), jyVar.m2199a());
                        }
                        jyVar.h();
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
        this.f599a.set(0, z);
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m2081a() {
        return this.f598a != null;
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m2082a(is isVar) {
        if (isVar == null) {
            return false;
        }
        boolean m2081a = m2081a();
        boolean m2081a2 = isVar.m2081a();
        if ((m2081a || m2081a2) && (!m2081a || !m2081a2 || !this.f598a.equals(isVar.f598a))) {
            return false;
        }
        boolean b2 = b();
        boolean b3 = isVar.b();
        if ((b2 || b3) && (!b2 || !b3 || !this.f596a.m2080a(isVar.f596a))) {
            return false;
        }
        boolean c2 = c();
        boolean c3 = isVar.c();
        if ((c2 || c3) && (!c2 || !c3 || !this.f603b.equals(isVar.f603b))) {
            return false;
        }
        boolean d2 = d();
        boolean d3 = isVar.d();
        if (((d2 || d3) && (!d2 || !d3 || !this.f605c.equals(isVar.f605c))) || this.f595a != isVar.f595a) {
            return false;
        }
        boolean f2 = f();
        boolean f3 = isVar.f();
        if ((f2 || f3) && (!f2 || !f3 || !this.f606d.equals(isVar.f606d))) {
            return false;
        }
        boolean g2 = g();
        boolean g3 = isVar.g();
        if ((g2 || g3) && (!g2 || !g3 || !this.f607e.equals(isVar.f607e))) {
            return false;
        }
        boolean h2 = h();
        boolean h3 = isVar.h();
        if ((h2 || h3) && (!h2 || !h3 || !this.f597a.m2154a(isVar.f597a))) {
            return false;
        }
        boolean i2 = i();
        boolean i3 = isVar.i();
        if ((i2 || i3) && (!i2 || !i3 || !this.f608f.equals(isVar.f608f))) {
            return false;
        }
        boolean j2 = j();
        boolean j3 = isVar.j();
        if ((j2 || j3) && (!j2 || !j3 || !this.f609g.equals(isVar.f609g))) {
            return false;
        }
        boolean k2 = k();
        boolean k3 = isVar.k();
        if ((k2 || k3) && (!k2 || !k3 || this.f602a != isVar.f602a)) {
            return false;
        }
        boolean l2 = l();
        boolean l3 = isVar.l();
        if ((l2 || l3) && (!l2 || !l3 || !this.f610h.equals(isVar.f610h))) {
            return false;
        }
        boolean m2 = m();
        boolean m3 = isVar.m();
        if ((m2 || m3) && (!m2 || !m3 || !this.f611i.equals(isVar.f611i))) {
            return false;
        }
        boolean n2 = n();
        boolean n3 = isVar.n();
        if ((n2 || n3) && (!n2 || !n3 || !this.f612j.equals(isVar.f612j))) {
            return false;
        }
        boolean o2 = o();
        boolean o3 = isVar.o();
        if ((o2 || o3) && (!o2 || !o3 || this.f601a != isVar.f601a)) {
            return false;
        }
        boolean p2 = p();
        boolean p3 = isVar.p();
        if ((p2 || p3) && (!p2 || !p3 || this.f604b != isVar.f604b)) {
            return false;
        }
        boolean q2 = q();
        boolean q3 = isVar.q();
        if ((q2 || q3) && (!q2 || !q3 || !this.f613k.equals(isVar.f613k))) {
            return false;
        }
        boolean r2 = r();
        boolean r3 = isVar.r();
        if ((r2 || r3) && (!r2 || !r3 || !this.f614l.equals(isVar.f614l))) {
            return false;
        }
        boolean s2 = s();
        boolean s3 = isVar.s();
        if ((s2 || s3) && (!s2 || !s3 || this.f594a != isVar.f594a)) {
            return false;
        }
        boolean t2 = t();
        boolean t3 = isVar.t();
        if (!t2 && !t3) {
            return true;
        }
        return t2 && t3 && this.f600a.equals(isVar.f600a);
    }

    public is b(String str) {
        this.f605c = str;
        return this;
    }

    @Override // com.xiaomi.push.jn
    public void b(jy jyVar) {
        a();
        jyVar.a(f593a);
        if (this.f598a != null && m2081a()) {
            jyVar.a(f24558a);
            jyVar.a(this.f598a);
            jyVar.b();
        }
        if (this.f596a != null && b()) {
            jyVar.a(b);
            this.f596a.b(jyVar);
            jyVar.b();
        }
        if (this.f603b != null) {
            jyVar.a(c);
            jyVar.a(this.f603b);
            jyVar.b();
        }
        if (this.f605c != null) {
            jyVar.a(d);
            jyVar.a(this.f605c);
            jyVar.b();
        }
        jyVar.a(e);
        jyVar.a(this.f595a);
        jyVar.b();
        if (this.f606d != null && f()) {
            jyVar.a(f);
            jyVar.a(this.f606d);
            jyVar.b();
        }
        if (this.f607e != null && g()) {
            jyVar.a(g);
            jyVar.a(this.f607e);
            jyVar.b();
        }
        if (this.f597a != null && h()) {
            jyVar.a(h);
            this.f597a.b(jyVar);
            jyVar.b();
        }
        if (this.f608f != null && i()) {
            jyVar.a(i);
            jyVar.a(this.f608f);
            jyVar.b();
        }
        if (this.f609g != null && j()) {
            jyVar.a(j);
            jyVar.a(this.f609g);
            jyVar.b();
        }
        if (k()) {
            jyVar.a(k);
            jyVar.a(this.f602a);
            jyVar.b();
        }
        if (this.f610h != null && l()) {
            jyVar.a(l);
            jyVar.a(this.f610h);
            jyVar.b();
        }
        if (this.f611i != null && m()) {
            jyVar.a(m);
            jyVar.a(this.f611i);
            jyVar.b();
        }
        if (this.f612j != null && n()) {
            jyVar.a(n);
            jyVar.a(this.f612j);
            jyVar.b();
        }
        if (o()) {
            jyVar.a(o);
            jyVar.a(this.f601a);
            jyVar.b();
        }
        if (p()) {
            jyVar.a(p);
            jyVar.a(this.f604b);
            jyVar.b();
        }
        if (this.f613k != null && q()) {
            jyVar.a(q);
            jyVar.a(this.f613k);
            jyVar.b();
        }
        if (this.f614l != null && r()) {
            jyVar.a(r);
            jyVar.a(this.f614l);
            jyVar.b();
        }
        if (s()) {
            jyVar.a(s);
            jyVar.mo2190a(this.f594a);
            jyVar.b();
        }
        if (this.f600a != null && t()) {
            jyVar.a(t);
            jyVar.a(new jx((byte) 11, (byte) 11, this.f600a.size()));
            for (Map.Entry<String, String> entry : this.f600a.entrySet()) {
                jyVar.a(entry.getKey());
                jyVar.a(entry.getValue());
            }
            jyVar.d();
            jyVar.b();
        }
        jyVar.c();
        jyVar.m2202a();
    }

    public void b(boolean z) {
        this.f599a.set(1, z);
    }

    public boolean b() {
        return this.f596a != null;
    }

    public is c(String str) {
        this.f606d = str;
        return this;
    }

    public void c(boolean z) {
        this.f599a.set(2, z);
    }

    public boolean c() {
        return this.f603b != null;
    }

    public is d(String str) {
        this.f607e = str;
        return this;
    }

    public void d(boolean z) {
        this.f599a.set(3, z);
    }

    public boolean d() {
        return this.f605c != null;
    }

    public void e(boolean z) {
        this.f599a.set(4, z);
    }

    public boolean e() {
        return this.f599a.get(0);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof is)) {
            return m2082a((is) obj);
        }
        return false;
    }

    public boolean f() {
        return this.f606d != null;
    }

    public boolean g() {
        return this.f607e != null;
    }

    public boolean h() {
        return this.f597a != null;
    }

    public int hashCode() {
        return 0;
    }

    public boolean i() {
        return this.f608f != null;
    }

    public boolean j() {
        return this.f609g != null;
    }

    public boolean k() {
        return this.f599a.get(1);
    }

    public boolean l() {
        return this.f610h != null;
    }

    public boolean m() {
        return this.f611i != null;
    }

    public boolean n() {
        return this.f612j != null;
    }

    public boolean o() {
        return this.f599a.get(2);
    }

    public boolean p() {
        return this.f599a.get(3);
    }

    public boolean q() {
        return this.f613k != null;
    }

    public boolean r() {
        return this.f614l != null;
    }

    public boolean s() {
        return this.f599a.get(4);
    }

    public boolean t() {
        return this.f600a != null;
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("XmPushActionAckMessage(");
        if (m2081a()) {
            sb.append("debug:");
            String str = this.f598a;
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
            ir irVar = this.f596a;
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
        String str2 = this.f603b;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(str2);
        }
        sb.append(", ");
        sb.append("appId:");
        String str3 = this.f605c;
        if (str3 == null) {
            sb.append("null");
        } else {
            sb.append(str3);
        }
        sb.append(", ");
        sb.append("messageTs:");
        sb.append(this.f595a);
        if (f()) {
            sb.append(", ");
            sb.append("topic:");
            String str4 = this.f606d;
            if (str4 == null) {
                sb.append("null");
            } else {
                sb.append(str4);
            }
        }
        if (g()) {
            sb.append(", ");
            sb.append("aliasName:");
            String str5 = this.f607e;
            if (str5 == null) {
                sb.append("null");
            } else {
                sb.append(str5);
            }
        }
        if (h()) {
            sb.append(", ");
            sb.append("request:");
            jf jfVar = this.f597a;
            if (jfVar == null) {
                sb.append("null");
            } else {
                sb.append(jfVar);
            }
        }
        if (i()) {
            sb.append(", ");
            sb.append("packageName:");
            String str6 = this.f608f;
            if (str6 == null) {
                sb.append("null");
            } else {
                sb.append(str6);
            }
        }
        if (j()) {
            sb.append(", ");
            sb.append("category:");
            String str7 = this.f609g;
            if (str7 == null) {
                sb.append("null");
            } else {
                sb.append(str7);
            }
        }
        if (k()) {
            sb.append(", ");
            sb.append("isOnline:");
            sb.append(this.f602a);
        }
        if (l()) {
            sb.append(", ");
            sb.append("regId:");
            String str8 = this.f610h;
            if (str8 == null) {
                sb.append("null");
            } else {
                sb.append(str8);
            }
        }
        if (m()) {
            sb.append(", ");
            sb.append("callbackUrl:");
            String str9 = this.f611i;
            if (str9 == null) {
                sb.append("null");
            } else {
                sb.append(str9);
            }
        }
        if (n()) {
            sb.append(", ");
            sb.append("userAccount:");
            String str10 = this.f612j;
            if (str10 == null) {
                sb.append("null");
            } else {
                sb.append(str10);
            }
        }
        if (o()) {
            sb.append(", ");
            sb.append("deviceStatus:");
            sb.append((int) this.f601a);
        }
        if (p()) {
            sb.append(", ");
            sb.append("geoMsgStatus:");
            sb.append((int) this.f604b);
        }
        if (q()) {
            sb.append(", ");
            sb.append("imeiMd5:");
            String str11 = this.f613k;
            if (str11 == null) {
                sb.append("null");
            } else {
                sb.append(str11);
            }
        }
        if (r()) {
            sb.append(", ");
            sb.append("deviceId:");
            String str12 = this.f614l;
            if (str12 == null) {
                sb.append("null");
            } else {
                sb.append(str12);
            }
        }
        if (s()) {
            sb.append(", ");
            sb.append("passThrough:");
            sb.append(this.f594a);
        }
        if (t()) {
            sb.append(", ");
            sb.append("extra:");
            Map<String, String> map = this.f600a;
            if (map == null) {
                sb.append("null");
            } else {
                sb.append(map);
            }
        }
        sb.append(riy.BRACKET_END_STR);
        return sb.toString();
    }
}
