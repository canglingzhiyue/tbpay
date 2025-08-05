package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;
import tb.riy;

/* loaded from: classes9.dex */
public class ig implements jn<ig, Object>, Serializable, Cloneable {

    /* renamed from: a  reason: collision with other field name */
    public long f509a;

    /* renamed from: a  reason: collision with other field name */
    public String f510a;

    /* renamed from: a  reason: collision with other field name */
    private BitSet f511a = new BitSet(3);

    /* renamed from: a  reason: collision with other field name */
    public Map<String, String> f512a;

    /* renamed from: a  reason: collision with other field name */
    public boolean f513a;

    /* renamed from: b  reason: collision with other field name */
    public long f514b;

    /* renamed from: b  reason: collision with other field name */
    public String f515b;

    /* renamed from: c  reason: collision with other field name */
    public String f516c;

    /* renamed from: d  reason: collision with other field name */
    public String f517d;

    /* renamed from: e  reason: collision with other field name */
    public String f518e;

    /* renamed from: f  reason: collision with other field name */
    public String f519f;

    /* renamed from: g  reason: collision with other field name */
    public String f520g;

    /* renamed from: a  reason: collision with other field name */
    private static final kd f508a = new kd("ClientUploadDataItem");

    /* renamed from: a  reason: collision with root package name */
    private static final jv f24546a = new jv("", (byte) 11, 1);
    private static final jv b = new jv("", (byte) 11, 2);
    private static final jv c = new jv("", (byte) 11, 3);
    private static final jv d = new jv("", (byte) 10, 4);
    private static final jv e = new jv("", (byte) 10, 5);
    private static final jv f = new jv("", (byte) 2, 6);
    private static final jv g = new jv("", (byte) 11, 7);
    private static final jv h = new jv("", (byte) 11, 8);
    private static final jv i = new jv("", (byte) 11, 9);
    private static final jv j = new jv("", (byte) 13, 10);
    private static final jv k = new jv("", (byte) 11, 11);

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(ig igVar) {
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
        if (!getClass().equals(igVar.getClass())) {
            return getClass().getName().compareTo(igVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m2040a()).compareTo(Boolean.valueOf(igVar.m2040a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m2040a() && (a12 = jo.a(this.f510a, igVar.f510a)) != 0) {
            return a12;
        }
        int compareTo2 = Boolean.valueOf(m2042b()).compareTo(Boolean.valueOf(igVar.m2042b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (m2042b() && (a11 = jo.a(this.f515b, igVar.f515b)) != 0) {
            return a11;
        }
        int compareTo3 = Boolean.valueOf(m2043c()).compareTo(Boolean.valueOf(igVar.m2043c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (m2043c() && (a10 = jo.a(this.f516c, igVar.f516c)) != 0) {
            return a10;
        }
        int compareTo4 = Boolean.valueOf(m2044d()).compareTo(Boolean.valueOf(igVar.m2044d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (m2044d() && (a9 = jo.a(this.f509a, igVar.f509a)) != 0) {
            return a9;
        }
        int compareTo5 = Boolean.valueOf(m2045e()).compareTo(Boolean.valueOf(igVar.m2045e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (m2045e() && (a8 = jo.a(this.f514b, igVar.f514b)) != 0) {
            return a8;
        }
        int compareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(igVar.f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (f() && (a7 = jo.a(this.f513a, igVar.f513a)) != 0) {
            return a7;
        }
        int compareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(igVar.g()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (g() && (a6 = jo.a(this.f517d, igVar.f517d)) != 0) {
            return a6;
        }
        int compareTo8 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(igVar.h()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (h() && (a5 = jo.a(this.f518e, igVar.f518e)) != 0) {
            return a5;
        }
        int compareTo9 = Boolean.valueOf(i()).compareTo(Boolean.valueOf(igVar.i()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (i() && (a4 = jo.a(this.f519f, igVar.f519f)) != 0) {
            return a4;
        }
        int compareTo10 = Boolean.valueOf(j()).compareTo(Boolean.valueOf(igVar.j()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (j() && (a3 = jo.a(this.f512a, igVar.f512a)) != 0) {
            return a3;
        }
        int compareTo11 = Boolean.valueOf(k()).compareTo(Boolean.valueOf(igVar.k()));
        if (compareTo11 != 0) {
            return compareTo11;
        }
        if (k() && (a2 = jo.a(this.f520g, igVar.f520g)) != 0) {
            return a2;
        }
        return 0;
    }

    public long a() {
        return this.f514b;
    }

    public ig a(long j2) {
        this.f509a = j2;
        m2039a(true);
        return this;
    }

    public ig a(String str) {
        this.f510a = str;
        return this;
    }

    public ig a(Map<String, String> map) {
        this.f512a = map;
        return this;
    }

    public ig a(boolean z) {
        this.f513a = z;
        c(true);
        return this;
    }

    /* renamed from: a  reason: collision with other method in class */
    public String m2036a() {
        return this.f510a;
    }

    /* renamed from: a  reason: collision with other method in class */
    public Map<String, String> m2037a() {
        return this.f512a;
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m2038a() {
    }

    @Override // com.xiaomi.push.jn
    public void a(jy jyVar) {
        jyVar.m2198a();
        while (true) {
            jv m2194a = jyVar.m2194a();
            if (m2194a.f24584a == 0) {
                jyVar.f();
                m2038a();
                return;
            }
            switch (m2194a.f840a) {
                case 1:
                    if (m2194a.f24584a == 11) {
                        this.f510a = jyVar.m2199a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 2:
                    if (m2194a.f24584a == 11) {
                        this.f515b = jyVar.m2199a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 3:
                    if (m2194a.f24584a == 11) {
                        this.f516c = jyVar.m2199a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 4:
                    if (m2194a.f24584a == 10) {
                        this.f509a = jyVar.m2193a();
                        m2039a(true);
                        continue;
                        jyVar.g();
                    }
                    break;
                case 5:
                    if (m2194a.f24584a == 10) {
                        this.f514b = jyVar.m2193a();
                        b(true);
                        continue;
                        jyVar.g();
                    }
                    break;
                case 6:
                    if (m2194a.f24584a == 2) {
                        this.f513a = jyVar.m2203a();
                        c(true);
                        continue;
                        jyVar.g();
                    }
                    break;
                case 7:
                    if (m2194a.f24584a == 11) {
                        this.f517d = jyVar.m2199a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 8:
                    if (m2194a.f24584a == 11) {
                        this.f518e = jyVar.m2199a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 9:
                    if (m2194a.f24584a == 11) {
                        this.f519f = jyVar.m2199a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 10:
                    if (m2194a.f24584a == 13) {
                        jx m2196a = jyVar.m2196a();
                        this.f512a = new HashMap(m2196a.f842a * 2);
                        for (int i2 = 0; i2 < m2196a.f842a; i2++) {
                            this.f512a.put(jyVar.m2199a(), jyVar.m2199a());
                        }
                        jyVar.h();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 11:
                    if (m2194a.f24584a == 11) {
                        this.f520g = jyVar.m2199a();
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
        if (this.f512a == null) {
            this.f512a = new HashMap();
        }
        this.f512a.put(str, str2);
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m2039a(boolean z) {
        this.f511a.set(0, z);
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m2040a() {
        return this.f510a != null;
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m2041a(ig igVar) {
        if (igVar == null) {
            return false;
        }
        boolean m2040a = m2040a();
        boolean m2040a2 = igVar.m2040a();
        if ((m2040a || m2040a2) && (!m2040a || !m2040a2 || !this.f510a.equals(igVar.f510a))) {
            return false;
        }
        boolean m2042b = m2042b();
        boolean m2042b2 = igVar.m2042b();
        if ((m2042b || m2042b2) && (!m2042b || !m2042b2 || !this.f515b.equals(igVar.f515b))) {
            return false;
        }
        boolean m2043c = m2043c();
        boolean m2043c2 = igVar.m2043c();
        if ((m2043c || m2043c2) && (!m2043c || !m2043c2 || !this.f516c.equals(igVar.f516c))) {
            return false;
        }
        boolean m2044d = m2044d();
        boolean m2044d2 = igVar.m2044d();
        if ((m2044d || m2044d2) && (!m2044d || !m2044d2 || this.f509a != igVar.f509a)) {
            return false;
        }
        boolean m2045e = m2045e();
        boolean m2045e2 = igVar.m2045e();
        if ((m2045e || m2045e2) && (!m2045e || !m2045e2 || this.f514b != igVar.f514b)) {
            return false;
        }
        boolean f2 = f();
        boolean f3 = igVar.f();
        if ((f2 || f3) && (!f2 || !f3 || this.f513a != igVar.f513a)) {
            return false;
        }
        boolean g2 = g();
        boolean g3 = igVar.g();
        if ((g2 || g3) && (!g2 || !g3 || !this.f517d.equals(igVar.f517d))) {
            return false;
        }
        boolean h2 = h();
        boolean h3 = igVar.h();
        if ((h2 || h3) && (!h2 || !h3 || !this.f518e.equals(igVar.f518e))) {
            return false;
        }
        boolean i2 = i();
        boolean i3 = igVar.i();
        if ((i2 || i3) && (!i2 || !i3 || !this.f519f.equals(igVar.f519f))) {
            return false;
        }
        boolean j2 = j();
        boolean j3 = igVar.j();
        if ((j2 || j3) && (!j2 || !j3 || !this.f512a.equals(igVar.f512a))) {
            return false;
        }
        boolean k2 = k();
        boolean k3 = igVar.k();
        if (!k2 && !k3) {
            return true;
        }
        return k2 && k3 && this.f520g.equals(igVar.f520g);
    }

    public ig b(long j2) {
        this.f514b = j2;
        b(true);
        return this;
    }

    public ig b(String str) {
        this.f515b = str;
        return this;
    }

    public String b() {
        return this.f516c;
    }

    @Override // com.xiaomi.push.jn
    public void b(jy jyVar) {
        m2038a();
        jyVar.a(f508a);
        if (this.f510a != null && m2040a()) {
            jyVar.a(f24546a);
            jyVar.a(this.f510a);
            jyVar.b();
        }
        if (this.f515b != null && m2042b()) {
            jyVar.a(b);
            jyVar.a(this.f515b);
            jyVar.b();
        }
        if (this.f516c != null && m2043c()) {
            jyVar.a(c);
            jyVar.a(this.f516c);
            jyVar.b();
        }
        if (m2044d()) {
            jyVar.a(d);
            jyVar.a(this.f509a);
            jyVar.b();
        }
        if (m2045e()) {
            jyVar.a(e);
            jyVar.a(this.f514b);
            jyVar.b();
        }
        if (f()) {
            jyVar.a(f);
            jyVar.a(this.f513a);
            jyVar.b();
        }
        if (this.f517d != null && g()) {
            jyVar.a(g);
            jyVar.a(this.f517d);
            jyVar.b();
        }
        if (this.f518e != null && h()) {
            jyVar.a(h);
            jyVar.a(this.f518e);
            jyVar.b();
        }
        if (this.f519f != null && i()) {
            jyVar.a(i);
            jyVar.a(this.f519f);
            jyVar.b();
        }
        if (this.f512a != null && j()) {
            jyVar.a(j);
            jyVar.a(new jx((byte) 11, (byte) 11, this.f512a.size()));
            for (Map.Entry<String, String> entry : this.f512a.entrySet()) {
                jyVar.a(entry.getKey());
                jyVar.a(entry.getValue());
            }
            jyVar.d();
            jyVar.b();
        }
        if (this.f520g != null && k()) {
            jyVar.a(k);
            jyVar.a(this.f520g);
            jyVar.b();
        }
        jyVar.c();
        jyVar.m2202a();
    }

    public void b(boolean z) {
        this.f511a.set(1, z);
    }

    /* renamed from: b  reason: collision with other method in class */
    public boolean m2042b() {
        return this.f515b != null;
    }

    public ig c(String str) {
        this.f516c = str;
        return this;
    }

    public String c() {
        return this.f518e;
    }

    public void c(boolean z) {
        this.f511a.set(2, z);
    }

    /* renamed from: c  reason: collision with other method in class */
    public boolean m2043c() {
        return this.f516c != null;
    }

    public ig d(String str) {
        this.f517d = str;
        return this;
    }

    public String d() {
        return this.f519f;
    }

    /* renamed from: d  reason: collision with other method in class */
    public boolean m2044d() {
        return this.f511a.get(0);
    }

    public ig e(String str) {
        this.f518e = str;
        return this;
    }

    public String e() {
        return this.f520g;
    }

    /* renamed from: e  reason: collision with other method in class */
    public boolean m2045e() {
        return this.f511a.get(1);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof ig)) {
            return m2041a((ig) obj);
        }
        return false;
    }

    public ig f(String str) {
        this.f519f = str;
        return this;
    }

    public boolean f() {
        return this.f511a.get(2);
    }

    public ig g(String str) {
        this.f520g = str;
        return this;
    }

    public boolean g() {
        return this.f517d != null;
    }

    public boolean h() {
        return this.f518e != null;
    }

    public int hashCode() {
        return 0;
    }

    public boolean i() {
        return this.f519f != null;
    }

    public boolean j() {
        return this.f512a != null;
    }

    public boolean k() {
        return this.f520g != null;
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("ClientUploadDataItem(");
        if (m2040a()) {
            sb.append("channel:");
            String str = this.f510a;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
            z = false;
        } else {
            z = true;
        }
        if (m2042b()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("data:");
            String str2 = this.f515b;
            if (str2 == null) {
                sb.append("null");
            } else {
                sb.append(str2);
            }
            z = false;
        }
        if (m2043c()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("name:");
            String str3 = this.f516c;
            if (str3 == null) {
                sb.append("null");
            } else {
                sb.append(str3);
            }
            z = false;
        }
        if (m2044d()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("counter:");
            sb.append(this.f509a);
            z = false;
        }
        if (m2045e()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("timestamp:");
            sb.append(this.f514b);
            z = false;
        }
        if (f()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("fromSdk:");
            sb.append(this.f513a);
            z = false;
        }
        if (g()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("category:");
            String str4 = this.f517d;
            if (str4 == null) {
                sb.append("null");
            } else {
                sb.append(str4);
            }
            z = false;
        }
        if (h()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("sourcePackage:");
            String str5 = this.f518e;
            if (str5 == null) {
                sb.append("null");
            } else {
                sb.append(str5);
            }
            z = false;
        }
        if (i()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("id:");
            String str6 = this.f519f;
            if (str6 == null) {
                sb.append("null");
            } else {
                sb.append(str6);
            }
            z = false;
        }
        if (j()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("extra:");
            Map<String, String> map = this.f512a;
            if (map == null) {
                sb.append("null");
            } else {
                sb.append(map);
            }
            z = false;
        }
        if (k()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("pkgName:");
            String str7 = this.f520g;
            if (str7 == null) {
                sb.append("null");
            } else {
                sb.append(str7);
            }
        }
        sb.append(riy.BRACKET_END_STR);
        return sb.toString();
    }
}
