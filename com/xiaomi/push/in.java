package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;
import tb.riy;

/* loaded from: classes9.dex */
public class in implements jn<in, Object>, Serializable, Cloneable {

    /* renamed from: a  reason: collision with other field name */
    public int f540a;

    /* renamed from: a  reason: collision with other field name */
    public long f541a;

    /* renamed from: a  reason: collision with other field name */
    public String f542a;

    /* renamed from: a  reason: collision with other field name */
    private BitSet f543a = new BitSet(6);

    /* renamed from: a  reason: collision with other field name */
    public boolean f544a;

    /* renamed from: b  reason: collision with other field name */
    public int f545b;

    /* renamed from: b  reason: collision with other field name */
    public boolean f546b;

    /* renamed from: c  reason: collision with other field name */
    public int f547c;

    /* renamed from: a  reason: collision with other field name */
    private static final kd f539a = new kd("OnlineConfigItem");

    /* renamed from: a  reason: collision with root package name */
    private static final jv f24553a = new jv("", (byte) 8, 1);
    private static final jv b = new jv("", (byte) 8, 2);
    private static final jv c = new jv("", (byte) 2, 3);
    private static final jv d = new jv("", (byte) 8, 4);
    private static final jv e = new jv("", (byte) 10, 5);
    private static final jv f = new jv("", (byte) 11, 6);
    private static final jv g = new jv("", (byte) 2, 7);

    public int a() {
        return this.f540a;
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(in inVar) {
        int a2;
        int a3;
        int a4;
        int a5;
        int a6;
        int a7;
        int a8;
        if (!getClass().equals(inVar.getClass())) {
            return getClass().getName().compareTo(inVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m2056a()).compareTo(Boolean.valueOf(inVar.m2056a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m2056a() && (a8 = jo.a(this.f540a, inVar.f540a)) != 0) {
            return a8;
        }
        int compareTo2 = Boolean.valueOf(m2058b()).compareTo(Boolean.valueOf(inVar.m2058b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (m2058b() && (a7 = jo.a(this.f545b, inVar.f545b)) != 0) {
            return a7;
        }
        int compareTo3 = Boolean.valueOf(m2059c()).compareTo(Boolean.valueOf(inVar.m2059c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (m2059c() && (a6 = jo.a(this.f544a, inVar.f544a)) != 0) {
            return a6;
        }
        int compareTo4 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(inVar.d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (d() && (a5 = jo.a(this.f547c, inVar.f547c)) != 0) {
            return a5;
        }
        int compareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(inVar.e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (e() && (a4 = jo.a(this.f541a, inVar.f541a)) != 0) {
            return a4;
        }
        int compareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(inVar.f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (f() && (a3 = jo.a(this.f542a, inVar.f542a)) != 0) {
            return a3;
        }
        int compareTo7 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(inVar.h()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (h() && (a2 = jo.a(this.f546b, inVar.f546b)) != 0) {
            return a2;
        }
        return 0;
    }

    /* renamed from: a  reason: collision with other method in class */
    public long m2053a() {
        return this.f541a;
    }

    /* renamed from: a  reason: collision with other method in class */
    public String m2054a() {
        return this.f542a;
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m2055a() {
    }

    @Override // com.xiaomi.push.jn
    public void a(jy jyVar) {
        jyVar.m2198a();
        while (true) {
            jv m2194a = jyVar.m2194a();
            if (m2194a.f24584a == 0) {
                jyVar.f();
                m2055a();
                return;
            }
            switch (m2194a.f840a) {
                case 1:
                    if (m2194a.f24584a == 8) {
                        this.f540a = jyVar.m2192a();
                        a(true);
                        continue;
                        jyVar.g();
                    }
                    break;
                case 2:
                    if (m2194a.f24584a == 8) {
                        this.f545b = jyVar.m2192a();
                        b(true);
                        continue;
                        jyVar.g();
                    }
                    break;
                case 3:
                    if (m2194a.f24584a == 2) {
                        this.f544a = jyVar.m2203a();
                        c(true);
                        continue;
                        jyVar.g();
                    }
                    break;
                case 4:
                    if (m2194a.f24584a == 8) {
                        this.f547c = jyVar.m2192a();
                        d(true);
                        continue;
                        jyVar.g();
                    }
                    break;
                case 5:
                    if (m2194a.f24584a == 10) {
                        this.f541a = jyVar.m2193a();
                        e(true);
                        continue;
                        jyVar.g();
                    }
                    break;
                case 6:
                    if (m2194a.f24584a == 11) {
                        this.f542a = jyVar.m2199a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 7:
                    if (m2194a.f24584a == 2) {
                        this.f546b = jyVar.m2203a();
                        f(true);
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
        this.f543a.set(0, z);
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m2056a() {
        return this.f543a.get(0);
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m2057a(in inVar) {
        if (inVar == null) {
            return false;
        }
        boolean m2056a = m2056a();
        boolean m2056a2 = inVar.m2056a();
        if ((m2056a || m2056a2) && (!m2056a || !m2056a2 || this.f540a != inVar.f540a)) {
            return false;
        }
        boolean m2058b = m2058b();
        boolean m2058b2 = inVar.m2058b();
        if ((m2058b || m2058b2) && (!m2058b || !m2058b2 || this.f545b != inVar.f545b)) {
            return false;
        }
        boolean m2059c = m2059c();
        boolean m2059c2 = inVar.m2059c();
        if ((m2059c || m2059c2) && (!m2059c || !m2059c2 || this.f544a != inVar.f544a)) {
            return false;
        }
        boolean d2 = d();
        boolean d3 = inVar.d();
        if ((d2 || d3) && (!d2 || !d3 || this.f547c != inVar.f547c)) {
            return false;
        }
        boolean e2 = e();
        boolean e3 = inVar.e();
        if ((e2 || e3) && (!e2 || !e3 || this.f541a != inVar.f541a)) {
            return false;
        }
        boolean f2 = f();
        boolean f3 = inVar.f();
        if ((f2 || f3) && (!f2 || !f3 || !this.f542a.equals(inVar.f542a))) {
            return false;
        }
        boolean h = h();
        boolean h2 = inVar.h();
        if (!h && !h2) {
            return true;
        }
        return h && h2 && this.f546b == inVar.f546b;
    }

    public int b() {
        return this.f545b;
    }

    @Override // com.xiaomi.push.jn
    public void b(jy jyVar) {
        m2055a();
        jyVar.a(f539a);
        if (m2056a()) {
            jyVar.a(f24553a);
            jyVar.mo2190a(this.f540a);
            jyVar.b();
        }
        if (m2058b()) {
            jyVar.a(b);
            jyVar.mo2190a(this.f545b);
            jyVar.b();
        }
        if (m2059c()) {
            jyVar.a(c);
            jyVar.a(this.f544a);
            jyVar.b();
        }
        if (d()) {
            jyVar.a(d);
            jyVar.mo2190a(this.f547c);
            jyVar.b();
        }
        if (e()) {
            jyVar.a(e);
            jyVar.a(this.f541a);
            jyVar.b();
        }
        if (this.f542a != null && f()) {
            jyVar.a(f);
            jyVar.a(this.f542a);
            jyVar.b();
        }
        if (h()) {
            jyVar.a(g);
            jyVar.a(this.f546b);
            jyVar.b();
        }
        jyVar.c();
        jyVar.m2202a();
    }

    public void b(boolean z) {
        this.f543a.set(1, z);
    }

    /* renamed from: b  reason: collision with other method in class */
    public boolean m2058b() {
        return this.f543a.get(1);
    }

    public int c() {
        return this.f547c;
    }

    public void c(boolean z) {
        this.f543a.set(2, z);
    }

    /* renamed from: c  reason: collision with other method in class */
    public boolean m2059c() {
        return this.f543a.get(2);
    }

    public void d(boolean z) {
        this.f543a.set(3, z);
    }

    public boolean d() {
        return this.f543a.get(3);
    }

    public void e(boolean z) {
        this.f543a.set(4, z);
    }

    public boolean e() {
        return this.f543a.get(4);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof in)) {
            return m2057a((in) obj);
        }
        return false;
    }

    public void f(boolean z) {
        this.f543a.set(5, z);
    }

    public boolean f() {
        return this.f542a != null;
    }

    public boolean g() {
        return this.f546b;
    }

    public boolean h() {
        return this.f543a.get(5);
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("OnlineConfigItem(");
        if (m2056a()) {
            sb.append("key:");
            sb.append(this.f540a);
            z = false;
        } else {
            z = true;
        }
        if (m2058b()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("type:");
            sb.append(this.f545b);
            z = false;
        }
        if (m2059c()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("clear:");
            sb.append(this.f544a);
            z = false;
        }
        if (d()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("intValue:");
            sb.append(this.f547c);
            z = false;
        }
        if (e()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("longValue:");
            sb.append(this.f541a);
            z = false;
        }
        if (f()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("stringValue:");
            String str = this.f542a;
            if (str == null) {
                str = "null";
            }
            sb.append(str);
            z = false;
        }
        if (h()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("boolValue:");
            sb.append(this.f546b);
        }
        sb.append(riy.BRACKET_END_STR);
        return sb.toString();
    }
}
