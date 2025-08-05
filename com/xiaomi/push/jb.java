package com.xiaomi.push;

import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;
import tb.riy;

/* loaded from: classes9.dex */
public class jb implements jn<jb, Object>, Serializable, Cloneable {

    /* renamed from: a  reason: collision with other field name */
    public long f673a;

    /* renamed from: a  reason: collision with other field name */
    public ir f674a;

    /* renamed from: a  reason: collision with other field name */
    public String f675a;

    /* renamed from: a  reason: collision with other field name */
    public ByteBuffer f676a;

    /* renamed from: a  reason: collision with other field name */
    private BitSet f677a;

    /* renamed from: a  reason: collision with other field name */
    public Map<String, String> f678a;

    /* renamed from: a  reason: collision with other field name */
    public boolean f679a;

    /* renamed from: b  reason: collision with other field name */
    public String f680b;

    /* renamed from: b  reason: collision with other field name */
    public boolean f681b;

    /* renamed from: c  reason: collision with other field name */
    public String f682c;

    /* renamed from: d  reason: collision with other field name */
    public String f683d;

    /* renamed from: e  reason: collision with other field name */
    public String f684e;

    /* renamed from: f  reason: collision with other field name */
    public String f685f;

    /* renamed from: g  reason: collision with other field name */
    public String f686g;

    /* renamed from: h  reason: collision with other field name */
    public String f687h;

    /* renamed from: i  reason: collision with other field name */
    public String f688i;

    /* renamed from: a  reason: collision with other field name */
    private static final kd f672a = new kd("XmPushActionNotification");

    /* renamed from: a  reason: collision with root package name */
    private static final jv f24568a = new jv("", (byte) 11, 1);
    private static final jv b = new jv("", (byte) 12, 2);
    private static final jv c = new jv("", (byte) 11, 3);
    private static final jv d = new jv("", (byte) 11, 4);
    private static final jv e = new jv("", (byte) 11, 5);
    private static final jv f = new jv("", (byte) 2, 6);
    private static final jv g = new jv("", (byte) 11, 7);
    private static final jv h = new jv("", (byte) 13, 8);
    private static final jv i = new jv("", (byte) 11, 9);
    private static final jv j = new jv("", (byte) 11, 10);
    private static final jv k = new jv("", (byte) 11, 12);
    private static final jv l = new jv("", (byte) 11, 13);
    private static final jv m = new jv("", (byte) 11, 14);
    private static final jv n = new jv("", (byte) 10, 15);
    private static final jv o = new jv("", (byte) 2, 20);

    public jb() {
        this.f677a = new BitSet(3);
        this.f679a = true;
        this.f681b = false;
    }

    public jb(String str, boolean z) {
        this();
        this.f680b = str;
        this.f679a = z;
        m2131a(true);
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(jb jbVar) {
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
        if (!getClass().equals(jbVar.getClass())) {
            return getClass().getName().compareTo(jbVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m2132a()).compareTo(Boolean.valueOf(jbVar.m2132a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m2132a() && (a16 = jo.a(this.f675a, jbVar.f675a)) != 0) {
            return a16;
        }
        int compareTo2 = Boolean.valueOf(m2135b()).compareTo(Boolean.valueOf(jbVar.m2135b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (m2135b() && (a15 = jo.a(this.f674a, jbVar.f674a)) != 0) {
            return a15;
        }
        int compareTo3 = Boolean.valueOf(m2136c()).compareTo(Boolean.valueOf(jbVar.m2136c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (m2136c() && (a14 = jo.a(this.f680b, jbVar.f680b)) != 0) {
            return a14;
        }
        int compareTo4 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(jbVar.d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (d() && (a13 = jo.a(this.f682c, jbVar.f682c)) != 0) {
            return a13;
        }
        int compareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(jbVar.e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (e() && (a12 = jo.a(this.f683d, jbVar.f683d)) != 0) {
            return a12;
        }
        int compareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(jbVar.f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (f() && (a11 = jo.a(this.f679a, jbVar.f679a)) != 0) {
            return a11;
        }
        int compareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(jbVar.g()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (g() && (a10 = jo.a(this.f684e, jbVar.f684e)) != 0) {
            return a10;
        }
        int compareTo8 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(jbVar.h()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (h() && (a9 = jo.a(this.f678a, jbVar.f678a)) != 0) {
            return a9;
        }
        int compareTo9 = Boolean.valueOf(i()).compareTo(Boolean.valueOf(jbVar.i()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (i() && (a8 = jo.a(this.f685f, jbVar.f685f)) != 0) {
            return a8;
        }
        int compareTo10 = Boolean.valueOf(j()).compareTo(Boolean.valueOf(jbVar.j()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (j() && (a7 = jo.a(this.f686g, jbVar.f686g)) != 0) {
            return a7;
        }
        int compareTo11 = Boolean.valueOf(k()).compareTo(Boolean.valueOf(jbVar.k()));
        if (compareTo11 != 0) {
            return compareTo11;
        }
        if (k() && (a6 = jo.a(this.f687h, jbVar.f687h)) != 0) {
            return a6;
        }
        int compareTo12 = Boolean.valueOf(l()).compareTo(Boolean.valueOf(jbVar.l()));
        if (compareTo12 != 0) {
            return compareTo12;
        }
        if (l() && (a5 = jo.a(this.f688i, jbVar.f688i)) != 0) {
            return a5;
        }
        int compareTo13 = Boolean.valueOf(m()).compareTo(Boolean.valueOf(jbVar.m()));
        if (compareTo13 != 0) {
            return compareTo13;
        }
        if (m() && (a4 = jo.a(this.f676a, jbVar.f676a)) != 0) {
            return a4;
        }
        int compareTo14 = Boolean.valueOf(n()).compareTo(Boolean.valueOf(jbVar.n()));
        if (compareTo14 != 0) {
            return compareTo14;
        }
        if (n() && (a3 = jo.a(this.f673a, jbVar.f673a)) != 0) {
            return a3;
        }
        int compareTo15 = Boolean.valueOf(o()).compareTo(Boolean.valueOf(jbVar.o()));
        if (compareTo15 != 0) {
            return compareTo15;
        }
        if (o() && (a2 = jo.a(this.f681b, jbVar.f681b)) != 0) {
            return a2;
        }
        return 0;
    }

    public ir a() {
        return this.f674a;
    }

    public jb a(String str) {
        this.f680b = str;
        return this;
    }

    public jb a(ByteBuffer byteBuffer) {
        this.f676a = byteBuffer;
        return this;
    }

    public jb a(Map<String, String> map) {
        this.f678a = map;
        return this;
    }

    public jb a(boolean z) {
        this.f679a = z;
        m2131a(true);
        return this;
    }

    public jb a(byte[] bArr) {
        a(ByteBuffer.wrap(bArr));
        return this;
    }

    /* renamed from: a  reason: collision with other method in class */
    public String m2128a() {
        return this.f680b;
    }

    /* renamed from: a  reason: collision with other method in class */
    public Map<String, String> m2129a() {
        return this.f678a;
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m2130a() {
        if (this.f680b != null) {
            return;
        }
        throw new jz("Required field 'id' was not present! Struct: " + toString());
    }

    @Override // com.xiaomi.push.jn
    public void a(jy jyVar) {
        jyVar.m2198a();
        while (true) {
            jv m2194a = jyVar.m2194a();
            if (m2194a.f24584a == 0) {
                jyVar.f();
                if (f()) {
                    m2130a();
                    return;
                }
                throw new jz("Required field 'requireAck' was not found in serialized data! Struct: " + toString());
            }
            switch (m2194a.f840a) {
                case 1:
                    if (m2194a.f24584a == 11) {
                        this.f675a = jyVar.m2199a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 2:
                    if (m2194a.f24584a == 12) {
                        this.f674a = new ir();
                        this.f674a.a(jyVar);
                        continue;
                        jyVar.g();
                    }
                    break;
                case 3:
                    if (m2194a.f24584a == 11) {
                        this.f680b = jyVar.m2199a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 4:
                    if (m2194a.f24584a == 11) {
                        this.f682c = jyVar.m2199a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 5:
                    if (m2194a.f24584a == 11) {
                        this.f683d = jyVar.m2199a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 6:
                    if (m2194a.f24584a == 2) {
                        this.f679a = jyVar.m2203a();
                        m2131a(true);
                        continue;
                        jyVar.g();
                    }
                    break;
                case 7:
                    if (m2194a.f24584a == 11) {
                        this.f684e = jyVar.m2199a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 8:
                    if (m2194a.f24584a == 13) {
                        jx m2196a = jyVar.m2196a();
                        this.f678a = new HashMap(m2196a.f842a * 2);
                        for (int i2 = 0; i2 < m2196a.f842a; i2++) {
                            this.f678a.put(jyVar.m2199a(), jyVar.m2199a());
                        }
                        jyVar.h();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 9:
                    if (m2194a.f24584a == 11) {
                        this.f685f = jyVar.m2199a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 10:
                    if (m2194a.f24584a == 11) {
                        this.f686g = jyVar.m2199a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 12:
                    if (m2194a.f24584a == 11) {
                        this.f687h = jyVar.m2199a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 13:
                    if (m2194a.f24584a == 11) {
                        this.f688i = jyVar.m2199a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 14:
                    if (m2194a.f24584a == 11) {
                        this.f676a = jyVar.m2200a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 15:
                    if (m2194a.f24584a == 10) {
                        this.f673a = jyVar.m2193a();
                        b(true);
                        continue;
                        jyVar.g();
                    }
                    break;
                case 20:
                    if (m2194a.f24584a == 2) {
                        this.f681b = jyVar.m2203a();
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

    public void a(String str, String str2) {
        if (this.f678a == null) {
            this.f678a = new HashMap();
        }
        this.f678a.put(str, str2);
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m2131a(boolean z) {
        this.f677a.set(0, z);
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m2132a() {
        return this.f675a != null;
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m2133a(jb jbVar) {
        if (jbVar == null) {
            return false;
        }
        boolean m2132a = m2132a();
        boolean m2132a2 = jbVar.m2132a();
        if ((m2132a || m2132a2) && (!m2132a || !m2132a2 || !this.f675a.equals(jbVar.f675a))) {
            return false;
        }
        boolean m2135b = m2135b();
        boolean m2135b2 = jbVar.m2135b();
        if ((m2135b || m2135b2) && (!m2135b || !m2135b2 || !this.f674a.m2080a(jbVar.f674a))) {
            return false;
        }
        boolean m2136c = m2136c();
        boolean m2136c2 = jbVar.m2136c();
        if ((m2136c || m2136c2) && (!m2136c || !m2136c2 || !this.f680b.equals(jbVar.f680b))) {
            return false;
        }
        boolean d2 = d();
        boolean d3 = jbVar.d();
        if ((d2 || d3) && (!d2 || !d3 || !this.f682c.equals(jbVar.f682c))) {
            return false;
        }
        boolean e2 = e();
        boolean e3 = jbVar.e();
        if (((e2 || e3) && (!e2 || !e3 || !this.f683d.equals(jbVar.f683d))) || this.f679a != jbVar.f679a) {
            return false;
        }
        boolean g2 = g();
        boolean g3 = jbVar.g();
        if ((g2 || g3) && (!g2 || !g3 || !this.f684e.equals(jbVar.f684e))) {
            return false;
        }
        boolean h2 = h();
        boolean h3 = jbVar.h();
        if ((h2 || h3) && (!h2 || !h3 || !this.f678a.equals(jbVar.f678a))) {
            return false;
        }
        boolean i2 = i();
        boolean i3 = jbVar.i();
        if ((i2 || i3) && (!i2 || !i3 || !this.f685f.equals(jbVar.f685f))) {
            return false;
        }
        boolean j2 = j();
        boolean j3 = jbVar.j();
        if ((j2 || j3) && (!j2 || !j3 || !this.f686g.equals(jbVar.f686g))) {
            return false;
        }
        boolean k2 = k();
        boolean k3 = jbVar.k();
        if ((k2 || k3) && (!k2 || !k3 || !this.f687h.equals(jbVar.f687h))) {
            return false;
        }
        boolean l2 = l();
        boolean l3 = jbVar.l();
        if ((l2 || l3) && (!l2 || !l3 || !this.f688i.equals(jbVar.f688i))) {
            return false;
        }
        boolean m2 = m();
        boolean m3 = jbVar.m();
        if ((m2 || m3) && (!m2 || !m3 || !this.f676a.equals(jbVar.f676a))) {
            return false;
        }
        boolean n2 = n();
        boolean n3 = jbVar.n();
        if ((n2 || n3) && (!n2 || !n3 || this.f673a != jbVar.f673a)) {
            return false;
        }
        boolean o2 = o();
        boolean o3 = jbVar.o();
        if (!o2 && !o3) {
            return true;
        }
        return o2 && o3 && this.f681b == jbVar.f681b;
    }

    /* renamed from: a  reason: collision with other method in class */
    public byte[] m2134a() {
        a(jo.a(this.f676a));
        return this.f676a.array();
    }

    public jb b(String str) {
        this.f682c = str;
        return this;
    }

    public String b() {
        return this.f682c;
    }

    @Override // com.xiaomi.push.jn
    public void b(jy jyVar) {
        m2130a();
        jyVar.a(f672a);
        if (this.f675a != null && m2132a()) {
            jyVar.a(f24568a);
            jyVar.a(this.f675a);
            jyVar.b();
        }
        if (this.f674a != null && m2135b()) {
            jyVar.a(b);
            this.f674a.b(jyVar);
            jyVar.b();
        }
        if (this.f680b != null) {
            jyVar.a(c);
            jyVar.a(this.f680b);
            jyVar.b();
        }
        if (this.f682c != null && d()) {
            jyVar.a(d);
            jyVar.a(this.f682c);
            jyVar.b();
        }
        if (this.f683d != null && e()) {
            jyVar.a(e);
            jyVar.a(this.f683d);
            jyVar.b();
        }
        jyVar.a(f);
        jyVar.a(this.f679a);
        jyVar.b();
        if (this.f684e != null && g()) {
            jyVar.a(g);
            jyVar.a(this.f684e);
            jyVar.b();
        }
        if (this.f678a != null && h()) {
            jyVar.a(h);
            jyVar.a(new jx((byte) 11, (byte) 11, this.f678a.size()));
            for (Map.Entry<String, String> entry : this.f678a.entrySet()) {
                jyVar.a(entry.getKey());
                jyVar.a(entry.getValue());
            }
            jyVar.d();
            jyVar.b();
        }
        if (this.f685f != null && i()) {
            jyVar.a(i);
            jyVar.a(this.f685f);
            jyVar.b();
        }
        if (this.f686g != null && j()) {
            jyVar.a(j);
            jyVar.a(this.f686g);
            jyVar.b();
        }
        if (this.f687h != null && k()) {
            jyVar.a(k);
            jyVar.a(this.f687h);
            jyVar.b();
        }
        if (this.f688i != null && l()) {
            jyVar.a(l);
            jyVar.a(this.f688i);
            jyVar.b();
        }
        if (this.f676a != null && m()) {
            jyVar.a(m);
            jyVar.a(this.f676a);
            jyVar.b();
        }
        if (n()) {
            jyVar.a(n);
            jyVar.a(this.f673a);
            jyVar.b();
        }
        if (o()) {
            jyVar.a(o);
            jyVar.a(this.f681b);
            jyVar.b();
        }
        jyVar.c();
        jyVar.m2202a();
    }

    public void b(boolean z) {
        this.f677a.set(1, z);
    }

    /* renamed from: b  reason: collision with other method in class */
    public boolean m2135b() {
        return this.f674a != null;
    }

    public jb c(String str) {
        this.f683d = str;
        return this;
    }

    public String c() {
        return this.f685f;
    }

    public void c(boolean z) {
        this.f677a.set(2, z);
    }

    /* renamed from: c  reason: collision with other method in class */
    public boolean m2136c() {
        return this.f680b != null;
    }

    public jb d(String str) {
        this.f685f = str;
        return this;
    }

    public boolean d() {
        return this.f682c != null;
    }

    public boolean e() {
        return this.f683d != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof jb)) {
            return m2133a((jb) obj);
        }
        return false;
    }

    public boolean f() {
        return this.f677a.get(0);
    }

    public boolean g() {
        return this.f684e != null;
    }

    public boolean h() {
        return this.f678a != null;
    }

    public int hashCode() {
        return 0;
    }

    public boolean i() {
        return this.f685f != null;
    }

    public boolean j() {
        return this.f686g != null;
    }

    public boolean k() {
        return this.f687h != null;
    }

    public boolean l() {
        return this.f688i != null;
    }

    public boolean m() {
        return this.f676a != null;
    }

    public boolean n() {
        return this.f677a.get(1);
    }

    public boolean o() {
        return this.f677a.get(2);
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("XmPushActionNotification(");
        if (m2132a()) {
            sb.append("debug:");
            String str = this.f675a;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
            z = false;
        } else {
            z = true;
        }
        if (m2135b()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("target:");
            ir irVar = this.f674a;
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
        String str2 = this.f680b;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(str2);
        }
        if (d()) {
            sb.append(", ");
            sb.append("appId:");
            String str3 = this.f682c;
            if (str3 == null) {
                sb.append("null");
            } else {
                sb.append(str3);
            }
        }
        if (e()) {
            sb.append(", ");
            sb.append("type:");
            String str4 = this.f683d;
            if (str4 == null) {
                sb.append("null");
            } else {
                sb.append(str4);
            }
        }
        sb.append(", ");
        sb.append("requireAck:");
        sb.append(this.f679a);
        if (g()) {
            sb.append(", ");
            sb.append("payload:");
            String str5 = this.f684e;
            if (str5 == null) {
                sb.append("null");
            } else {
                sb.append(str5);
            }
        }
        if (h()) {
            sb.append(", ");
            sb.append("extra:");
            Map<String, String> map = this.f678a;
            if (map == null) {
                sb.append("null");
            } else {
                sb.append(map);
            }
        }
        if (i()) {
            sb.append(", ");
            sb.append("packageName:");
            String str6 = this.f685f;
            if (str6 == null) {
                sb.append("null");
            } else {
                sb.append(str6);
            }
        }
        if (j()) {
            sb.append(", ");
            sb.append("category:");
            String str7 = this.f686g;
            if (str7 == null) {
                sb.append("null");
            } else {
                sb.append(str7);
            }
        }
        if (k()) {
            sb.append(", ");
            sb.append("regId:");
            String str8 = this.f687h;
            if (str8 == null) {
                sb.append("null");
            } else {
                sb.append(str8);
            }
        }
        if (l()) {
            sb.append(", ");
            sb.append("aliasName:");
            String str9 = this.f688i;
            if (str9 == null) {
                sb.append("null");
            } else {
                sb.append(str9);
            }
        }
        if (m()) {
            sb.append(", ");
            sb.append("binaryExtra:");
            ByteBuffer byteBuffer = this.f676a;
            if (byteBuffer == null) {
                sb.append("null");
            } else {
                jo.a(byteBuffer, sb);
            }
        }
        if (n()) {
            sb.append(", ");
            sb.append("createdTs:");
            sb.append(this.f673a);
        }
        if (o()) {
            sb.append(", ");
            sb.append("alreadyLogClickInXmq:");
            sb.append(this.f681b);
        }
        sb.append(riy.BRACKET_END_STR);
        return sb.toString();
    }
}
