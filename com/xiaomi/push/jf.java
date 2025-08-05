package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;
import tb.riy;

/* loaded from: classes9.dex */
public class jf implements jn<jf, Object>, Serializable, Cloneable {

    /* renamed from: a  reason: collision with other field name */
    public io f752a;

    /* renamed from: a  reason: collision with other field name */
    public ir f753a;

    /* renamed from: a  reason: collision with other field name */
    public String f754a;

    /* renamed from: a  reason: collision with other field name */
    public Map<String, String> f756a;

    /* renamed from: b  reason: collision with other field name */
    public String f758b;

    /* renamed from: c  reason: collision with other field name */
    public String f759c;

    /* renamed from: d  reason: collision with other field name */
    public String f760d;

    /* renamed from: e  reason: collision with other field name */
    public String f761e;

    /* renamed from: f  reason: collision with other field name */
    public String f762f;

    /* renamed from: g  reason: collision with other field name */
    public String f763g;

    /* renamed from: h  reason: collision with other field name */
    public String f764h;

    /* renamed from: a  reason: collision with other field name */
    private static final kd f751a = new kd("XmPushActionSendMessage");

    /* renamed from: a  reason: collision with root package name */
    private static final jv f24572a = new jv("", (byte) 11, 1);
    private static final jv b = new jv("", (byte) 12, 2);
    private static final jv c = new jv("", (byte) 11, 3);
    private static final jv d = new jv("", (byte) 11, 4);
    private static final jv e = new jv("", (byte) 11, 5);
    private static final jv f = new jv("", (byte) 11, 6);
    private static final jv g = new jv("", (byte) 11, 7);
    private static final jv h = new jv("", (byte) 12, 8);
    private static final jv i = new jv("", (byte) 2, 9);
    private static final jv j = new jv("", (byte) 13, 10);
    private static final jv k = new jv("", (byte) 11, 11);
    private static final jv l = new jv("", (byte) 11, 12);

    /* renamed from: a  reason: collision with other field name */
    private BitSet f755a = new BitSet(1);

    /* renamed from: a  reason: collision with other field name */
    public boolean f757a = true;

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(jf jfVar) {
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
        if (!getClass().equals(jfVar.getClass())) {
            return getClass().getName().compareTo(jfVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m2153a()).compareTo(Boolean.valueOf(jfVar.m2153a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m2153a() && (a13 = jo.a(this.f754a, jfVar.f754a)) != 0) {
            return a13;
        }
        int compareTo2 = Boolean.valueOf(m2155b()).compareTo(Boolean.valueOf(jfVar.m2155b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (m2155b() && (a12 = jo.a(this.f753a, jfVar.f753a)) != 0) {
            return a12;
        }
        int compareTo3 = Boolean.valueOf(m2156c()).compareTo(Boolean.valueOf(jfVar.m2156c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (m2156c() && (a11 = jo.a(this.f758b, jfVar.f758b)) != 0) {
            return a11;
        }
        int compareTo4 = Boolean.valueOf(m2157d()).compareTo(Boolean.valueOf(jfVar.m2157d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (m2157d() && (a10 = jo.a(this.f759c, jfVar.f759c)) != 0) {
            return a10;
        }
        int compareTo5 = Boolean.valueOf(m2158e()).compareTo(Boolean.valueOf(jfVar.m2158e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (m2158e() && (a9 = jo.a(this.f760d, jfVar.f760d)) != 0) {
            return a9;
        }
        int compareTo6 = Boolean.valueOf(m2159f()).compareTo(Boolean.valueOf(jfVar.m2159f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (m2159f() && (a8 = jo.a(this.f761e, jfVar.f761e)) != 0) {
            return a8;
        }
        int compareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(jfVar.g()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (g() && (a7 = jo.a(this.f762f, jfVar.f762f)) != 0) {
            return a7;
        }
        int compareTo8 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(jfVar.h()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (h() && (a6 = jo.a(this.f752a, jfVar.f752a)) != 0) {
            return a6;
        }
        int compareTo9 = Boolean.valueOf(i()).compareTo(Boolean.valueOf(jfVar.i()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (i() && (a5 = jo.a(this.f757a, jfVar.f757a)) != 0) {
            return a5;
        }
        int compareTo10 = Boolean.valueOf(j()).compareTo(Boolean.valueOf(jfVar.j()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (j() && (a4 = jo.a(this.f756a, jfVar.f756a)) != 0) {
            return a4;
        }
        int compareTo11 = Boolean.valueOf(k()).compareTo(Boolean.valueOf(jfVar.k()));
        if (compareTo11 != 0) {
            return compareTo11;
        }
        if (k() && (a3 = jo.a(this.f763g, jfVar.f763g)) != 0) {
            return a3;
        }
        int compareTo12 = Boolean.valueOf(l()).compareTo(Boolean.valueOf(jfVar.l()));
        if (compareTo12 != 0) {
            return compareTo12;
        }
        if (l() && (a2 = jo.a(this.f764h, jfVar.f764h)) != 0) {
            return a2;
        }
        return 0;
    }

    public io a() {
        return this.f752a;
    }

    /* renamed from: a  reason: collision with other method in class */
    public String m2151a() {
        return this.f758b;
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m2152a() {
        if (this.f758b == null) {
            throw new jz("Required field 'id' was not present! Struct: " + toString());
        } else if (this.f759c != null) {
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
                m2152a();
                return;
            }
            switch (m2194a.f840a) {
                case 1:
                    if (m2194a.f24584a == 11) {
                        this.f754a = jyVar.m2199a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 2:
                    if (m2194a.f24584a == 12) {
                        this.f753a = new ir();
                        this.f753a.a(jyVar);
                        continue;
                        jyVar.g();
                    }
                    break;
                case 3:
                    if (m2194a.f24584a == 11) {
                        this.f758b = jyVar.m2199a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 4:
                    if (m2194a.f24584a == 11) {
                        this.f759c = jyVar.m2199a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 5:
                    if (m2194a.f24584a == 11) {
                        this.f760d = jyVar.m2199a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 6:
                    if (m2194a.f24584a == 11) {
                        this.f761e = jyVar.m2199a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 7:
                    if (m2194a.f24584a == 11) {
                        this.f762f = jyVar.m2199a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 8:
                    if (m2194a.f24584a == 12) {
                        this.f752a = new io();
                        this.f752a.a(jyVar);
                        continue;
                        jyVar.g();
                    }
                    break;
                case 9:
                    if (m2194a.f24584a == 2) {
                        this.f757a = jyVar.m2203a();
                        a(true);
                        continue;
                        jyVar.g();
                    }
                    break;
                case 10:
                    if (m2194a.f24584a == 13) {
                        jx m2196a = jyVar.m2196a();
                        this.f756a = new HashMap(m2196a.f842a * 2);
                        for (int i2 = 0; i2 < m2196a.f842a; i2++) {
                            this.f756a.put(jyVar.m2199a(), jyVar.m2199a());
                        }
                        jyVar.h();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 11:
                    if (m2194a.f24584a == 11) {
                        this.f763g = jyVar.m2199a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 12:
                    if (m2194a.f24584a == 11) {
                        this.f764h = jyVar.m2199a();
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
        this.f755a.set(0, z);
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m2153a() {
        return this.f754a != null;
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m2154a(jf jfVar) {
        if (jfVar == null) {
            return false;
        }
        boolean m2153a = m2153a();
        boolean m2153a2 = jfVar.m2153a();
        if ((m2153a || m2153a2) && (!m2153a || !m2153a2 || !this.f754a.equals(jfVar.f754a))) {
            return false;
        }
        boolean m2155b = m2155b();
        boolean m2155b2 = jfVar.m2155b();
        if ((m2155b || m2155b2) && (!m2155b || !m2155b2 || !this.f753a.m2080a(jfVar.f753a))) {
            return false;
        }
        boolean m2156c = m2156c();
        boolean m2156c2 = jfVar.m2156c();
        if ((m2156c || m2156c2) && (!m2156c || !m2156c2 || !this.f758b.equals(jfVar.f758b))) {
            return false;
        }
        boolean m2157d = m2157d();
        boolean m2157d2 = jfVar.m2157d();
        if ((m2157d || m2157d2) && (!m2157d || !m2157d2 || !this.f759c.equals(jfVar.f759c))) {
            return false;
        }
        boolean m2158e = m2158e();
        boolean m2158e2 = jfVar.m2158e();
        if ((m2158e || m2158e2) && (!m2158e || !m2158e2 || !this.f760d.equals(jfVar.f760d))) {
            return false;
        }
        boolean m2159f = m2159f();
        boolean m2159f2 = jfVar.m2159f();
        if ((m2159f || m2159f2) && (!m2159f || !m2159f2 || !this.f761e.equals(jfVar.f761e))) {
            return false;
        }
        boolean g2 = g();
        boolean g3 = jfVar.g();
        if ((g2 || g3) && (!g2 || !g3 || !this.f762f.equals(jfVar.f762f))) {
            return false;
        }
        boolean h2 = h();
        boolean h3 = jfVar.h();
        if ((h2 || h3) && (!h2 || !h3 || !this.f752a.m2063a(jfVar.f752a))) {
            return false;
        }
        boolean i2 = i();
        boolean i3 = jfVar.i();
        if ((i2 || i3) && (!i2 || !i3 || this.f757a != jfVar.f757a)) {
            return false;
        }
        boolean j2 = j();
        boolean j3 = jfVar.j();
        if ((j2 || j3) && (!j2 || !j3 || !this.f756a.equals(jfVar.f756a))) {
            return false;
        }
        boolean k2 = k();
        boolean k3 = jfVar.k();
        if ((k2 || k3) && (!k2 || !k3 || !this.f763g.equals(jfVar.f763g))) {
            return false;
        }
        boolean l2 = l();
        boolean l3 = jfVar.l();
        if (!l2 && !l3) {
            return true;
        }
        return l2 && l3 && this.f764h.equals(jfVar.f764h);
    }

    public String b() {
        return this.f759c;
    }

    @Override // com.xiaomi.push.jn
    public void b(jy jyVar) {
        m2152a();
        jyVar.a(f751a);
        if (this.f754a != null && m2153a()) {
            jyVar.a(f24572a);
            jyVar.a(this.f754a);
            jyVar.b();
        }
        if (this.f753a != null && m2155b()) {
            jyVar.a(b);
            this.f753a.b(jyVar);
            jyVar.b();
        }
        if (this.f758b != null) {
            jyVar.a(c);
            jyVar.a(this.f758b);
            jyVar.b();
        }
        if (this.f759c != null) {
            jyVar.a(d);
            jyVar.a(this.f759c);
            jyVar.b();
        }
        if (this.f760d != null && m2158e()) {
            jyVar.a(e);
            jyVar.a(this.f760d);
            jyVar.b();
        }
        if (this.f761e != null && m2159f()) {
            jyVar.a(f);
            jyVar.a(this.f761e);
            jyVar.b();
        }
        if (this.f762f != null && g()) {
            jyVar.a(g);
            jyVar.a(this.f762f);
            jyVar.b();
        }
        if (this.f752a != null && h()) {
            jyVar.a(h);
            this.f752a.b(jyVar);
            jyVar.b();
        }
        if (i()) {
            jyVar.a(i);
            jyVar.a(this.f757a);
            jyVar.b();
        }
        if (this.f756a != null && j()) {
            jyVar.a(j);
            jyVar.a(new jx((byte) 11, (byte) 11, this.f756a.size()));
            for (Map.Entry<String, String> entry : this.f756a.entrySet()) {
                jyVar.a(entry.getKey());
                jyVar.a(entry.getValue());
            }
            jyVar.d();
            jyVar.b();
        }
        if (this.f763g != null && k()) {
            jyVar.a(k);
            jyVar.a(this.f763g);
            jyVar.b();
        }
        if (this.f764h != null && l()) {
            jyVar.a(l);
            jyVar.a(this.f764h);
            jyVar.b();
        }
        jyVar.c();
        jyVar.m2202a();
    }

    /* renamed from: b  reason: collision with other method in class */
    public boolean m2155b() {
        return this.f753a != null;
    }

    public String c() {
        return this.f761e;
    }

    /* renamed from: c  reason: collision with other method in class */
    public boolean m2156c() {
        return this.f758b != null;
    }

    public String d() {
        return this.f762f;
    }

    /* renamed from: d  reason: collision with other method in class */
    public boolean m2157d() {
        return this.f759c != null;
    }

    public String e() {
        return this.f763g;
    }

    /* renamed from: e  reason: collision with other method in class */
    public boolean m2158e() {
        return this.f760d != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof jf)) {
            return m2154a((jf) obj);
        }
        return false;
    }

    public String f() {
        return this.f764h;
    }

    /* renamed from: f  reason: collision with other method in class */
    public boolean m2159f() {
        return this.f761e != null;
    }

    public boolean g() {
        return this.f762f != null;
    }

    public boolean h() {
        return this.f752a != null;
    }

    public int hashCode() {
        return 0;
    }

    public boolean i() {
        return this.f755a.get(0);
    }

    public boolean j() {
        return this.f756a != null;
    }

    public boolean k() {
        return this.f763g != null;
    }

    public boolean l() {
        return this.f764h != null;
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("XmPushActionSendMessage(");
        if (m2153a()) {
            sb.append("debug:");
            String str = this.f754a;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
            z = false;
        } else {
            z = true;
        }
        if (m2155b()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("target:");
            ir irVar = this.f753a;
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
        String str2 = this.f758b;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(str2);
        }
        sb.append(", ");
        sb.append("appId:");
        String str3 = this.f759c;
        if (str3 == null) {
            sb.append("null");
        } else {
            sb.append(str3);
        }
        if (m2158e()) {
            sb.append(", ");
            sb.append("packageName:");
            String str4 = this.f760d;
            if (str4 == null) {
                sb.append("null");
            } else {
                sb.append(str4);
            }
        }
        if (m2159f()) {
            sb.append(", ");
            sb.append("topic:");
            String str5 = this.f761e;
            if (str5 == null) {
                sb.append("null");
            } else {
                sb.append(str5);
            }
        }
        if (g()) {
            sb.append(", ");
            sb.append("aliasName:");
            String str6 = this.f762f;
            if (str6 == null) {
                sb.append("null");
            } else {
                sb.append(str6);
            }
        }
        if (h()) {
            sb.append(", ");
            sb.append("message:");
            io ioVar = this.f752a;
            if (ioVar == null) {
                sb.append("null");
            } else {
                sb.append(ioVar);
            }
        }
        if (i()) {
            sb.append(", ");
            sb.append("needAck:");
            sb.append(this.f757a);
        }
        if (j()) {
            sb.append(", ");
            sb.append("params:");
            Map<String, String> map = this.f756a;
            if (map == null) {
                sb.append("null");
            } else {
                sb.append(map);
            }
        }
        if (k()) {
            sb.append(", ");
            sb.append("category:");
            String str7 = this.f763g;
            if (str7 == null) {
                sb.append("null");
            } else {
                sb.append(str7);
            }
        }
        if (l()) {
            sb.append(", ");
            sb.append("userAccount:");
            String str8 = this.f764h;
            if (str8 == null) {
                sb.append("null");
            } else {
                sb.append(str8);
            }
        }
        sb.append(riy.BRACKET_END_STR);
        return sb.toString();
    }
}
