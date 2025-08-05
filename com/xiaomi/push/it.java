package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;
import tb.riy;

/* loaded from: classes9.dex */
public class it implements jn<it, Object>, Serializable, Cloneable {

    /* renamed from: a  reason: collision with other field name */
    public ir f617a;

    /* renamed from: a  reason: collision with other field name */
    public String f618a;

    /* renamed from: a  reason: collision with other field name */
    public Map<String, String> f620a;

    /* renamed from: b  reason: collision with other field name */
    public String f621b;

    /* renamed from: c  reason: collision with other field name */
    public String f622c;

    /* renamed from: d  reason: collision with other field name */
    public String f623d;

    /* renamed from: e  reason: collision with other field name */
    public String f624e;

    /* renamed from: f  reason: collision with other field name */
    public String f625f;

    /* renamed from: g  reason: collision with other field name */
    public String f626g;

    /* renamed from: a  reason: collision with other field name */
    private static final kd f615a = new kd("XmPushActionAckNotification");

    /* renamed from: a  reason: collision with root package name */
    private static final jv f24559a = new jv("", (byte) 11, 1);
    private static final jv b = new jv("", (byte) 12, 2);
    private static final jv c = new jv("", (byte) 11, 3);
    private static final jv d = new jv("", (byte) 11, 4);
    private static final jv e = new jv("", (byte) 11, 5);
    private static final jv f = new jv("", (byte) 10, 7);
    private static final jv g = new jv("", (byte) 11, 8);
    private static final jv h = new jv("", (byte) 13, 9);
    private static final jv i = new jv("", (byte) 11, 10);
    private static final jv j = new jv("", (byte) 11, 11);

    /* renamed from: a  reason: collision with other field name */
    private BitSet f619a = new BitSet(1);

    /* renamed from: a  reason: collision with other field name */
    public long f616a = 0;

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(it itVar) {
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
        if (!getClass().equals(itVar.getClass())) {
            return getClass().getName().compareTo(itVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m2085a()).compareTo(Boolean.valueOf(itVar.m2085a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m2085a() && (a11 = jo.a(this.f618a, itVar.f618a)) != 0) {
            return a11;
        }
        int compareTo2 = Boolean.valueOf(m2087b()).compareTo(Boolean.valueOf(itVar.m2087b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (m2087b() && (a10 = jo.a(this.f617a, itVar.f617a)) != 0) {
            return a10;
        }
        int compareTo3 = Boolean.valueOf(c()).compareTo(Boolean.valueOf(itVar.c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (c() && (a9 = jo.a(this.f621b, itVar.f621b)) != 0) {
            return a9;
        }
        int compareTo4 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(itVar.d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (d() && (a8 = jo.a(this.f622c, itVar.f622c)) != 0) {
            return a8;
        }
        int compareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(itVar.e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (e() && (a7 = jo.a(this.f623d, itVar.f623d)) != 0) {
            return a7;
        }
        int compareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(itVar.f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (f() && (a6 = jo.a(this.f616a, itVar.f616a)) != 0) {
            return a6;
        }
        int compareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(itVar.g()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (g() && (a5 = jo.a(this.f624e, itVar.f624e)) != 0) {
            return a5;
        }
        int compareTo8 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(itVar.h()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (h() && (a4 = jo.a(this.f620a, itVar.f620a)) != 0) {
            return a4;
        }
        int compareTo9 = Boolean.valueOf(i()).compareTo(Boolean.valueOf(itVar.i()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (i() && (a3 = jo.a(this.f625f, itVar.f625f)) != 0) {
            return a3;
        }
        int compareTo10 = Boolean.valueOf(j()).compareTo(Boolean.valueOf(itVar.j()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (j() && (a2 = jo.a(this.f626g, itVar.f626g)) != 0) {
            return a2;
        }
        return 0;
    }

    public it a(long j2) {
        this.f616a = j2;
        a(true);
        return this;
    }

    public it a(ir irVar) {
        this.f617a = irVar;
        return this;
    }

    public it a(String str) {
        this.f621b = str;
        return this;
    }

    public String a() {
        return this.f621b;
    }

    /* renamed from: a  reason: collision with other method in class */
    public Map<String, String> m2083a() {
        return this.f620a;
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m2084a() {
        if (this.f621b != null) {
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
                m2084a();
                return;
            }
            switch (m2194a.f840a) {
                case 1:
                    if (m2194a.f24584a == 11) {
                        this.f618a = jyVar.m2199a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 2:
                    if (m2194a.f24584a == 12) {
                        this.f617a = new ir();
                        this.f617a.a(jyVar);
                        continue;
                        jyVar.g();
                    }
                    break;
                case 3:
                    if (m2194a.f24584a == 11) {
                        this.f621b = jyVar.m2199a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 4:
                    if (m2194a.f24584a == 11) {
                        this.f622c = jyVar.m2199a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 5:
                    if (m2194a.f24584a == 11) {
                        this.f623d = jyVar.m2199a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 7:
                    if (m2194a.f24584a == 10) {
                        this.f616a = jyVar.m2193a();
                        a(true);
                        continue;
                        jyVar.g();
                    }
                    break;
                case 8:
                    if (m2194a.f24584a == 11) {
                        this.f624e = jyVar.m2199a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 9:
                    if (m2194a.f24584a == 13) {
                        jx m2196a = jyVar.m2196a();
                        this.f620a = new HashMap(m2196a.f842a * 2);
                        for (int i2 = 0; i2 < m2196a.f842a; i2++) {
                            this.f620a.put(jyVar.m2199a(), jyVar.m2199a());
                        }
                        jyVar.h();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 10:
                    if (m2194a.f24584a == 11) {
                        this.f625f = jyVar.m2199a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 11:
                    if (m2194a.f24584a == 11) {
                        this.f626g = jyVar.m2199a();
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
        this.f619a.set(0, z);
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m2085a() {
        return this.f618a != null;
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m2086a(it itVar) {
        if (itVar == null) {
            return false;
        }
        boolean m2085a = m2085a();
        boolean m2085a2 = itVar.m2085a();
        if ((m2085a || m2085a2) && (!m2085a || !m2085a2 || !this.f618a.equals(itVar.f618a))) {
            return false;
        }
        boolean m2087b = m2087b();
        boolean m2087b2 = itVar.m2087b();
        if ((m2087b || m2087b2) && (!m2087b || !m2087b2 || !this.f617a.m2080a(itVar.f617a))) {
            return false;
        }
        boolean c2 = c();
        boolean c3 = itVar.c();
        if ((c2 || c3) && (!c2 || !c3 || !this.f621b.equals(itVar.f621b))) {
            return false;
        }
        boolean d2 = d();
        boolean d3 = itVar.d();
        if ((d2 || d3) && (!d2 || !d3 || !this.f622c.equals(itVar.f622c))) {
            return false;
        }
        boolean e2 = e();
        boolean e3 = itVar.e();
        if ((e2 || e3) && (!e2 || !e3 || !this.f623d.equals(itVar.f623d))) {
            return false;
        }
        boolean f2 = f();
        boolean f3 = itVar.f();
        if ((f2 || f3) && (!f2 || !f3 || this.f616a != itVar.f616a)) {
            return false;
        }
        boolean g2 = g();
        boolean g3 = itVar.g();
        if ((g2 || g3) && (!g2 || !g3 || !this.f624e.equals(itVar.f624e))) {
            return false;
        }
        boolean h2 = h();
        boolean h3 = itVar.h();
        if ((h2 || h3) && (!h2 || !h3 || !this.f620a.equals(itVar.f620a))) {
            return false;
        }
        boolean i2 = i();
        boolean i3 = itVar.i();
        if ((i2 || i3) && (!i2 || !i3 || !this.f625f.equals(itVar.f625f))) {
            return false;
        }
        boolean j2 = j();
        boolean j3 = itVar.j();
        if (!j2 && !j3) {
            return true;
        }
        return j2 && j3 && this.f626g.equals(itVar.f626g);
    }

    public it b(String str) {
        this.f622c = str;
        return this;
    }

    public String b() {
        return this.f623d;
    }

    @Override // com.xiaomi.push.jn
    public void b(jy jyVar) {
        m2084a();
        jyVar.a(f615a);
        if (this.f618a != null && m2085a()) {
            jyVar.a(f24559a);
            jyVar.a(this.f618a);
            jyVar.b();
        }
        if (this.f617a != null && m2087b()) {
            jyVar.a(b);
            this.f617a.b(jyVar);
            jyVar.b();
        }
        if (this.f621b != null) {
            jyVar.a(c);
            jyVar.a(this.f621b);
            jyVar.b();
        }
        if (this.f622c != null && d()) {
            jyVar.a(d);
            jyVar.a(this.f622c);
            jyVar.b();
        }
        if (this.f623d != null && e()) {
            jyVar.a(e);
            jyVar.a(this.f623d);
            jyVar.b();
        }
        if (f()) {
            jyVar.a(f);
            jyVar.a(this.f616a);
            jyVar.b();
        }
        if (this.f624e != null && g()) {
            jyVar.a(g);
            jyVar.a(this.f624e);
            jyVar.b();
        }
        if (this.f620a != null && h()) {
            jyVar.a(h);
            jyVar.a(new jx((byte) 11, (byte) 11, this.f620a.size()));
            for (Map.Entry<String, String> entry : this.f620a.entrySet()) {
                jyVar.a(entry.getKey());
                jyVar.a(entry.getValue());
            }
            jyVar.d();
            jyVar.b();
        }
        if (this.f625f != null && i()) {
            jyVar.a(i);
            jyVar.a(this.f625f);
            jyVar.b();
        }
        if (this.f626g != null && j()) {
            jyVar.a(j);
            jyVar.a(this.f626g);
            jyVar.b();
        }
        jyVar.c();
        jyVar.m2202a();
    }

    /* renamed from: b  reason: collision with other method in class */
    public boolean m2087b() {
        return this.f617a != null;
    }

    public it c(String str) {
        this.f623d = str;
        return this;
    }

    public boolean c() {
        return this.f621b != null;
    }

    public it d(String str) {
        this.f624e = str;
        return this;
    }

    public boolean d() {
        return this.f622c != null;
    }

    public it e(String str) {
        this.f625f = str;
        return this;
    }

    public boolean e() {
        return this.f623d != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof it)) {
            return m2086a((it) obj);
        }
        return false;
    }

    public boolean f() {
        return this.f619a.get(0);
    }

    public boolean g() {
        return this.f624e != null;
    }

    public boolean h() {
        return this.f620a != null;
    }

    public int hashCode() {
        return 0;
    }

    public boolean i() {
        return this.f625f != null;
    }

    public boolean j() {
        return this.f626g != null;
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("XmPushActionAckNotification(");
        if (m2085a()) {
            sb.append("debug:");
            String str = this.f618a;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
            z = false;
        } else {
            z = true;
        }
        if (m2087b()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("target:");
            ir irVar = this.f617a;
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
        String str2 = this.f621b;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(str2);
        }
        if (d()) {
            sb.append(", ");
            sb.append("appId:");
            String str3 = this.f622c;
            if (str3 == null) {
                sb.append("null");
            } else {
                sb.append(str3);
            }
        }
        if (e()) {
            sb.append(", ");
            sb.append("type:");
            String str4 = this.f623d;
            if (str4 == null) {
                sb.append("null");
            } else {
                sb.append(str4);
            }
        }
        if (f()) {
            sb.append(", ");
            sb.append("errorCode:");
            sb.append(this.f616a);
        }
        if (g()) {
            sb.append(", ");
            sb.append("reason:");
            String str5 = this.f624e;
            if (str5 == null) {
                sb.append("null");
            } else {
                sb.append(str5);
            }
        }
        if (h()) {
            sb.append(", ");
            sb.append("extra:");
            Map<String, String> map = this.f620a;
            if (map == null) {
                sb.append("null");
            } else {
                sb.append(map);
            }
        }
        if (i()) {
            sb.append(", ");
            sb.append("packageName:");
            String str6 = this.f625f;
            if (str6 == null) {
                sb.append("null");
            } else {
                sb.append(str6);
            }
        }
        if (j()) {
            sb.append(", ");
            sb.append("category:");
            String str7 = this.f626g;
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
