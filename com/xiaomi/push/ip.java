package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;
import tb.riy;

/* loaded from: classes9.dex */
public class ip implements jn<ip, Object>, Serializable, Cloneable {

    /* renamed from: a  reason: collision with other field name */
    public int f569a;

    /* renamed from: a  reason: collision with other field name */
    public long f570a;

    /* renamed from: a  reason: collision with other field name */
    public String f571a;

    /* renamed from: a  reason: collision with other field name */
    private BitSet f572a;

    /* renamed from: a  reason: collision with other field name */
    public Map<String, String> f573a;

    /* renamed from: a  reason: collision with other field name */
    public boolean f574a;

    /* renamed from: b  reason: collision with other field name */
    public int f575b;

    /* renamed from: b  reason: collision with other field name */
    public String f576b;

    /* renamed from: b  reason: collision with other field name */
    public Map<String, String> f577b;

    /* renamed from: c  reason: collision with other field name */
    public int f578c;

    /* renamed from: c  reason: collision with other field name */
    public String f579c;

    /* renamed from: c  reason: collision with other field name */
    public Map<String, String> f580c;

    /* renamed from: d  reason: collision with other field name */
    public String f581d;

    /* renamed from: e  reason: collision with other field name */
    public String f582e;

    /* renamed from: a  reason: collision with other field name */
    private static final kd f568a = new kd("PushMetaInfo");

    /* renamed from: a  reason: collision with root package name */
    private static final jv f24555a = new jv("", (byte) 11, 1);
    private static final jv b = new jv("", (byte) 10, 2);
    private static final jv c = new jv("", (byte) 11, 3);
    private static final jv d = new jv("", (byte) 11, 4);
    private static final jv e = new jv("", (byte) 11, 5);
    private static final jv f = new jv("", (byte) 8, 6);
    private static final jv g = new jv("", (byte) 11, 7);
    private static final jv h = new jv("", (byte) 8, 8);
    private static final jv i = new jv("", (byte) 8, 9);
    private static final jv j = new jv("", (byte) 13, 10);
    private static final jv k = new jv("", (byte) 13, 11);
    private static final jv l = new jv("", (byte) 2, 12);
    private static final jv m = new jv("", (byte) 13, 13);

    public ip() {
        this.f572a = new BitSet(5);
        this.f574a = false;
    }

    public ip(ip ipVar) {
        this.f572a = new BitSet(5);
        this.f572a.clear();
        this.f572a.or(ipVar.f572a);
        if (ipVar.m2071a()) {
            this.f571a = ipVar.f571a;
        }
        this.f570a = ipVar.f570a;
        if (ipVar.m2077c()) {
            this.f576b = ipVar.f576b;
        }
        if (ipVar.m2078d()) {
            this.f579c = ipVar.f579c;
        }
        if (ipVar.e()) {
            this.f581d = ipVar.f581d;
        }
        this.f569a = ipVar.f569a;
        if (ipVar.g()) {
            this.f582e = ipVar.f582e;
        }
        this.f575b = ipVar.f575b;
        this.f578c = ipVar.f578c;
        if (ipVar.j()) {
            HashMap hashMap = new HashMap();
            for (Map.Entry<String, String> entry : ipVar.f573a.entrySet()) {
                hashMap.put(entry.getKey(), entry.getValue());
            }
            this.f573a = hashMap;
        }
        if (ipVar.k()) {
            HashMap hashMap2 = new HashMap();
            for (Map.Entry<String, String> entry2 : ipVar.f577b.entrySet()) {
                hashMap2.put(entry2.getKey(), entry2.getValue());
            }
            this.f577b = hashMap2;
        }
        this.f574a = ipVar.f574a;
        if (ipVar.n()) {
            HashMap hashMap3 = new HashMap();
            for (Map.Entry<String, String> entry3 : ipVar.f580c.entrySet()) {
                hashMap3.put(entry3.getKey(), entry3.getValue());
            }
            this.f580c = hashMap3;
        }
    }

    public int a() {
        return this.f569a;
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(ip ipVar) {
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
        if (!getClass().equals(ipVar.getClass())) {
            return getClass().getName().compareTo(ipVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m2071a()).compareTo(Boolean.valueOf(ipVar.m2071a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m2071a() && (a14 = jo.a(this.f571a, ipVar.f571a)) != 0) {
            return a14;
        }
        int compareTo2 = Boolean.valueOf(m2075b()).compareTo(Boolean.valueOf(ipVar.m2075b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (m2075b() && (a13 = jo.a(this.f570a, ipVar.f570a)) != 0) {
            return a13;
        }
        int compareTo3 = Boolean.valueOf(m2077c()).compareTo(Boolean.valueOf(ipVar.m2077c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (m2077c() && (a12 = jo.a(this.f576b, ipVar.f576b)) != 0) {
            return a12;
        }
        int compareTo4 = Boolean.valueOf(m2078d()).compareTo(Boolean.valueOf(ipVar.m2078d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (m2078d() && (a11 = jo.a(this.f579c, ipVar.f579c)) != 0) {
            return a11;
        }
        int compareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(ipVar.e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (e() && (a10 = jo.a(this.f581d, ipVar.f581d)) != 0) {
            return a10;
        }
        int compareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(ipVar.f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (f() && (a9 = jo.a(this.f569a, ipVar.f569a)) != 0) {
            return a9;
        }
        int compareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(ipVar.g()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (g() && (a8 = jo.a(this.f582e, ipVar.f582e)) != 0) {
            return a8;
        }
        int compareTo8 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(ipVar.h()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (h() && (a7 = jo.a(this.f575b, ipVar.f575b)) != 0) {
            return a7;
        }
        int compareTo9 = Boolean.valueOf(i()).compareTo(Boolean.valueOf(ipVar.i()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (i() && (a6 = jo.a(this.f578c, ipVar.f578c)) != 0) {
            return a6;
        }
        int compareTo10 = Boolean.valueOf(j()).compareTo(Boolean.valueOf(ipVar.j()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (j() && (a5 = jo.a(this.f573a, ipVar.f573a)) != 0) {
            return a5;
        }
        int compareTo11 = Boolean.valueOf(k()).compareTo(Boolean.valueOf(ipVar.k()));
        if (compareTo11 != 0) {
            return compareTo11;
        }
        if (k() && (a4 = jo.a(this.f577b, ipVar.f577b)) != 0) {
            return a4;
        }
        int compareTo12 = Boolean.valueOf(m()).compareTo(Boolean.valueOf(ipVar.m()));
        if (compareTo12 != 0) {
            return compareTo12;
        }
        if (m() && (a3 = jo.a(this.f574a, ipVar.f574a)) != 0) {
            return a3;
        }
        int compareTo13 = Boolean.valueOf(n()).compareTo(Boolean.valueOf(ipVar.n()));
        if (compareTo13 != 0) {
            return compareTo13;
        }
        if (n() && (a2 = jo.a(this.f580c, ipVar.f580c)) != 0) {
            return a2;
        }
        return 0;
    }

    /* renamed from: a  reason: collision with other method in class */
    public long m2066a() {
        return this.f570a;
    }

    /* renamed from: a  reason: collision with other method in class */
    public ip m2067a() {
        return new ip(this);
    }

    public ip a(int i2) {
        this.f569a = i2;
        b(true);
        return this;
    }

    public ip a(String str) {
        this.f571a = str;
        return this;
    }

    public ip a(Map<String, String> map) {
        this.f573a = map;
        return this;
    }

    /* renamed from: a  reason: collision with other method in class */
    public String m2068a() {
        return this.f571a;
    }

    /* renamed from: a  reason: collision with other method in class */
    public Map<String, String> m2069a() {
        return this.f573a;
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m2070a() {
        if (this.f571a != null) {
            return;
        }
        throw new jz("Required field 'id' was not present! Struct: " + toString());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.xiaomi.push.jn
    public void a(jy jyVar) {
        jyVar.m2198a();
        while (true) {
            jv m2194a = jyVar.m2194a();
            if (m2194a.f24584a == 0) {
                jyVar.f();
                if (m2075b()) {
                    m2070a();
                    return;
                }
                throw new jz("Required field 'messageTs' was not found in serialized data! Struct: " + toString());
            }
            int i2 = 0;
            switch (m2194a.f840a) {
                case 1:
                    if (m2194a.f24584a == 11) {
                        this.f571a = jyVar.m2199a();
                        break;
                    }
                    kb.a(jyVar, m2194a.f24584a);
                    break;
                case 2:
                    if (m2194a.f24584a == 10) {
                        this.f570a = jyVar.m2193a();
                        a(true);
                        break;
                    }
                    kb.a(jyVar, m2194a.f24584a);
                    break;
                case 3:
                    if (m2194a.f24584a == 11) {
                        this.f576b = jyVar.m2199a();
                        break;
                    }
                    kb.a(jyVar, m2194a.f24584a);
                    break;
                case 4:
                    if (m2194a.f24584a == 11) {
                        this.f579c = jyVar.m2199a();
                        break;
                    }
                    kb.a(jyVar, m2194a.f24584a);
                    break;
                case 5:
                    if (m2194a.f24584a == 11) {
                        this.f581d = jyVar.m2199a();
                        break;
                    }
                    kb.a(jyVar, m2194a.f24584a);
                    break;
                case 6:
                    if (m2194a.f24584a == 8) {
                        this.f569a = jyVar.m2192a();
                        b(true);
                        break;
                    }
                    kb.a(jyVar, m2194a.f24584a);
                    break;
                case 7:
                    if (m2194a.f24584a == 11) {
                        this.f582e = jyVar.m2199a();
                        break;
                    }
                    kb.a(jyVar, m2194a.f24584a);
                    break;
                case 8:
                    if (m2194a.f24584a == 8) {
                        this.f575b = jyVar.m2192a();
                        c(true);
                        break;
                    }
                    kb.a(jyVar, m2194a.f24584a);
                    break;
                case 9:
                    if (m2194a.f24584a == 8) {
                        this.f578c = jyVar.m2192a();
                        d(true);
                        break;
                    }
                    kb.a(jyVar, m2194a.f24584a);
                    break;
                case 10:
                    if (m2194a.f24584a == 13) {
                        jx m2196a = jyVar.m2196a();
                        this.f573a = new HashMap(m2196a.f842a * 2);
                        while (i2 < m2196a.f842a) {
                            this.f573a.put(jyVar.m2199a(), jyVar.m2199a());
                            i2++;
                        }
                        jyVar.h();
                        break;
                    }
                    kb.a(jyVar, m2194a.f24584a);
                    break;
                case 11:
                    if (m2194a.f24584a == 13) {
                        jx m2196a2 = jyVar.m2196a();
                        this.f577b = new HashMap(m2196a2.f842a * 2);
                        while (i2 < m2196a2.f842a) {
                            this.f577b.put(jyVar.m2199a(), jyVar.m2199a());
                            i2++;
                        }
                        jyVar.h();
                        break;
                    }
                    kb.a(jyVar, m2194a.f24584a);
                    break;
                case 12:
                    if (m2194a.f24584a == 2) {
                        this.f574a = jyVar.m2203a();
                        e(true);
                        break;
                    }
                    kb.a(jyVar, m2194a.f24584a);
                    break;
                case 13:
                    if (m2194a.f24584a == 13) {
                        jx m2196a3 = jyVar.m2196a();
                        this.f580c = new HashMap(m2196a3.f842a * 2);
                        while (i2 < m2196a3.f842a) {
                            this.f580c.put(jyVar.m2199a(), jyVar.m2199a());
                            i2++;
                        }
                        jyVar.h();
                        break;
                    }
                    kb.a(jyVar, m2194a.f24584a);
                    break;
                default:
                    kb.a(jyVar, m2194a.f24584a);
                    break;
            }
            jyVar.g();
        }
    }

    public void a(String str, String str2) {
        if (this.f573a == null) {
            this.f573a = new HashMap();
        }
        this.f573a.put(str, str2);
    }

    public void a(boolean z) {
        this.f572a.set(0, z);
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m2071a() {
        return this.f571a != null;
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m2072a(ip ipVar) {
        if (ipVar == null) {
            return false;
        }
        boolean m2071a = m2071a();
        boolean m2071a2 = ipVar.m2071a();
        if (((m2071a || m2071a2) && (!m2071a || !m2071a2 || !this.f571a.equals(ipVar.f571a))) || this.f570a != ipVar.f570a) {
            return false;
        }
        boolean m2077c = m2077c();
        boolean m2077c2 = ipVar.m2077c();
        if ((m2077c || m2077c2) && (!m2077c || !m2077c2 || !this.f576b.equals(ipVar.f576b))) {
            return false;
        }
        boolean m2078d = m2078d();
        boolean m2078d2 = ipVar.m2078d();
        if ((m2078d || m2078d2) && (!m2078d || !m2078d2 || !this.f579c.equals(ipVar.f579c))) {
            return false;
        }
        boolean e2 = e();
        boolean e3 = ipVar.e();
        if ((e2 || e3) && (!e2 || !e3 || !this.f581d.equals(ipVar.f581d))) {
            return false;
        }
        boolean f2 = f();
        boolean f3 = ipVar.f();
        if ((f2 || f3) && (!f2 || !f3 || this.f569a != ipVar.f569a)) {
            return false;
        }
        boolean g2 = g();
        boolean g3 = ipVar.g();
        if ((g2 || g3) && (!g2 || !g3 || !this.f582e.equals(ipVar.f582e))) {
            return false;
        }
        boolean h2 = h();
        boolean h3 = ipVar.h();
        if ((h2 || h3) && (!h2 || !h3 || this.f575b != ipVar.f575b)) {
            return false;
        }
        boolean i2 = i();
        boolean i3 = ipVar.i();
        if ((i2 || i3) && (!i2 || !i3 || this.f578c != ipVar.f578c)) {
            return false;
        }
        boolean j2 = j();
        boolean j3 = ipVar.j();
        if ((j2 || j3) && (!j2 || !j3 || !this.f573a.equals(ipVar.f573a))) {
            return false;
        }
        boolean k2 = k();
        boolean k3 = ipVar.k();
        if ((k2 || k3) && (!k2 || !k3 || !this.f577b.equals(ipVar.f577b))) {
            return false;
        }
        boolean m2 = m();
        boolean m3 = ipVar.m();
        if ((m2 || m3) && (!m2 || !m3 || this.f574a != ipVar.f574a)) {
            return false;
        }
        boolean n = n();
        boolean n2 = ipVar.n();
        if (!n && !n2) {
            return true;
        }
        return n && n2 && this.f580c.equals(ipVar.f580c);
    }

    public int b() {
        return this.f575b;
    }

    public ip b(int i2) {
        this.f575b = i2;
        c(true);
        return this;
    }

    public ip b(String str) {
        this.f576b = str;
        return this;
    }

    /* renamed from: b  reason: collision with other method in class */
    public String m2073b() {
        return this.f576b;
    }

    /* renamed from: b  reason: collision with other method in class */
    public Map<String, String> m2074b() {
        return this.f577b;
    }

    @Override // com.xiaomi.push.jn
    public void b(jy jyVar) {
        m2070a();
        jyVar.a(f568a);
        if (this.f571a != null) {
            jyVar.a(f24555a);
            jyVar.a(this.f571a);
            jyVar.b();
        }
        jyVar.a(b);
        jyVar.a(this.f570a);
        jyVar.b();
        if (this.f576b != null && m2077c()) {
            jyVar.a(c);
            jyVar.a(this.f576b);
            jyVar.b();
        }
        if (this.f579c != null && m2078d()) {
            jyVar.a(d);
            jyVar.a(this.f579c);
            jyVar.b();
        }
        if (this.f581d != null && e()) {
            jyVar.a(e);
            jyVar.a(this.f581d);
            jyVar.b();
        }
        if (f()) {
            jyVar.a(f);
            jyVar.mo2190a(this.f569a);
            jyVar.b();
        }
        if (this.f582e != null && g()) {
            jyVar.a(g);
            jyVar.a(this.f582e);
            jyVar.b();
        }
        if (h()) {
            jyVar.a(h);
            jyVar.mo2190a(this.f575b);
            jyVar.b();
        }
        if (i()) {
            jyVar.a(i);
            jyVar.mo2190a(this.f578c);
            jyVar.b();
        }
        if (this.f573a != null && j()) {
            jyVar.a(j);
            jyVar.a(new jx((byte) 11, (byte) 11, this.f573a.size()));
            for (Map.Entry<String, String> entry : this.f573a.entrySet()) {
                jyVar.a(entry.getKey());
                jyVar.a(entry.getValue());
            }
            jyVar.d();
            jyVar.b();
        }
        if (this.f577b != null && k()) {
            jyVar.a(k);
            jyVar.a(new jx((byte) 11, (byte) 11, this.f577b.size()));
            for (Map.Entry<String, String> entry2 : this.f577b.entrySet()) {
                jyVar.a(entry2.getKey());
                jyVar.a(entry2.getValue());
            }
            jyVar.d();
            jyVar.b();
        }
        if (m()) {
            jyVar.a(l);
            jyVar.a(this.f574a);
            jyVar.b();
        }
        if (this.f580c != null && n()) {
            jyVar.a(m);
            jyVar.a(new jx((byte) 11, (byte) 11, this.f580c.size()));
            for (Map.Entry<String, String> entry3 : this.f580c.entrySet()) {
                jyVar.a(entry3.getKey());
                jyVar.a(entry3.getValue());
            }
            jyVar.d();
            jyVar.b();
        }
        jyVar.c();
        jyVar.m2202a();
    }

    public void b(String str, String str2) {
        if (this.f577b == null) {
            this.f577b = new HashMap();
        }
        this.f577b.put(str, str2);
    }

    public void b(boolean z) {
        this.f572a.set(1, z);
    }

    /* renamed from: b  reason: collision with other method in class */
    public boolean m2075b() {
        return this.f572a.get(0);
    }

    public int c() {
        return this.f578c;
    }

    public ip c(int i2) {
        this.f578c = i2;
        d(true);
        return this;
    }

    public ip c(String str) {
        this.f579c = str;
        return this;
    }

    /* renamed from: c  reason: collision with other method in class */
    public String m2076c() {
        return this.f579c;
    }

    public void c(boolean z) {
        this.f572a.set(2, z);
    }

    /* renamed from: c  reason: collision with other method in class */
    public boolean m2077c() {
        return this.f576b != null;
    }

    public ip d(String str) {
        this.f581d = str;
        return this;
    }

    public String d() {
        return this.f581d;
    }

    public void d(boolean z) {
        this.f572a.set(3, z);
    }

    /* renamed from: d  reason: collision with other method in class */
    public boolean m2078d() {
        return this.f579c != null;
    }

    public void e(boolean z) {
        this.f572a.set(4, z);
    }

    public boolean e() {
        return this.f581d != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof ip)) {
            return m2072a((ip) obj);
        }
        return false;
    }

    public boolean f() {
        return this.f572a.get(1);
    }

    public boolean g() {
        return this.f582e != null;
    }

    public boolean h() {
        return this.f572a.get(2);
    }

    public int hashCode() {
        return 0;
    }

    public boolean i() {
        return this.f572a.get(3);
    }

    public boolean j() {
        return this.f573a != null;
    }

    public boolean k() {
        return this.f577b != null;
    }

    public boolean l() {
        return this.f574a;
    }

    public boolean m() {
        return this.f572a.get(4);
    }

    public boolean n() {
        return this.f580c != null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PushMetaInfo(");
        sb.append("id:");
        String str = this.f571a;
        if (str == null) {
            sb.append("null");
        } else {
            sb.append(com.xiaomi.push.service.bc.a(str));
        }
        sb.append(", ");
        sb.append("messageTs:");
        sb.append(this.f570a);
        if (m2077c()) {
            sb.append(", ");
            sb.append("topic:");
            String str2 = this.f576b;
            if (str2 == null) {
                sb.append("null");
            } else {
                sb.append(str2);
            }
        }
        if (m2078d()) {
            sb.append(", ");
            sb.append("title:");
            String str3 = this.f579c;
            if (str3 == null) {
                sb.append("null");
            } else {
                sb.append(str3);
            }
        }
        if (e()) {
            sb.append(", ");
            sb.append("description:");
            String str4 = this.f581d;
            if (str4 == null) {
                sb.append("null");
            } else {
                sb.append(str4);
            }
        }
        if (f()) {
            sb.append(", ");
            sb.append("notifyType:");
            sb.append(this.f569a);
        }
        if (g()) {
            sb.append(", ");
            sb.append("url:");
            String str5 = this.f582e;
            if (str5 == null) {
                sb.append("null");
            } else {
                sb.append(str5);
            }
        }
        if (h()) {
            sb.append(", ");
            sb.append("passThrough:");
            sb.append(this.f575b);
        }
        if (i()) {
            sb.append(", ");
            sb.append("notifyId:");
            sb.append(this.f578c);
        }
        if (j()) {
            sb.append(", ");
            sb.append("extra:");
            Map<String, String> map = this.f573a;
            if (map == null) {
                sb.append("null");
            } else {
                sb.append(map);
            }
        }
        if (k()) {
            sb.append(", ");
            sb.append("internal:");
            Map<String, String> map2 = this.f577b;
            if (map2 == null) {
                sb.append("null");
            } else {
                sb.append(map2);
            }
        }
        if (m()) {
            sb.append(", ");
            sb.append("ignoreRegInfo:");
            sb.append(this.f574a);
        }
        if (n()) {
            sb.append(", ");
            sb.append("apsProperFields:");
            Map<String, String> map3 = this.f580c;
            if (map3 == null) {
                sb.append("null");
            } else {
                sb.append(map3);
            }
        }
        sb.append(riy.BRACKET_END_STR);
        return sb.toString();
    }
}
