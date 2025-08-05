package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;
import tb.riy;

/* loaded from: classes9.dex */
public class ir implements jn<ir, Object>, Serializable, Cloneable {

    /* renamed from: a  reason: collision with other field name */
    public String f587a;

    /* renamed from: d  reason: collision with other field name */
    public String f592d;

    /* renamed from: a  reason: collision with other field name */
    private static final kd f585a = new kd("Target");

    /* renamed from: a  reason: collision with root package name */
    private static final jv f24557a = new jv("", (byte) 10, 1);
    private static final jv b = new jv("", (byte) 11, 2);
    private static final jv c = new jv("", (byte) 11, 3);
    private static final jv d = new jv("", (byte) 11, 4);
    private static final jv e = new jv("", (byte) 2, 5);
    private static final jv f = new jv("", (byte) 11, 7);

    /* renamed from: a  reason: collision with other field name */
    private BitSet f588a = new BitSet(2);

    /* renamed from: a  reason: collision with other field name */
    public long f586a = 5;

    /* renamed from: b  reason: collision with other field name */
    public String f590b = "xiaomi.com";

    /* renamed from: c  reason: collision with other field name */
    public String f591c = "";

    /* renamed from: a  reason: collision with other field name */
    public boolean f589a = false;

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(ir irVar) {
        int a2;
        int a3;
        int a4;
        int a5;
        int a6;
        int a7;
        if (!getClass().equals(irVar.getClass())) {
            return getClass().getName().compareTo(irVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m2079a()).compareTo(Boolean.valueOf(irVar.m2079a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m2079a() && (a7 = jo.a(this.f586a, irVar.f586a)) != 0) {
            return a7;
        }
        int compareTo2 = Boolean.valueOf(b()).compareTo(Boolean.valueOf(irVar.b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (b() && (a6 = jo.a(this.f587a, irVar.f587a)) != 0) {
            return a6;
        }
        int compareTo3 = Boolean.valueOf(c()).compareTo(Boolean.valueOf(irVar.c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (c() && (a5 = jo.a(this.f590b, irVar.f590b)) != 0) {
            return a5;
        }
        int compareTo4 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(irVar.d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (d() && (a4 = jo.a(this.f591c, irVar.f591c)) != 0) {
            return a4;
        }
        int compareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(irVar.e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (e() && (a3 = jo.a(this.f589a, irVar.f589a)) != 0) {
            return a3;
        }
        int compareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(irVar.f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (f() && (a2 = jo.a(this.f592d, irVar.f592d)) != 0) {
            return a2;
        }
        return 0;
    }

    public void a() {
        if (this.f587a != null) {
            return;
        }
        throw new jz("Required field 'userId' was not present! Struct: " + toString());
    }

    @Override // com.xiaomi.push.jn
    public void a(jy jyVar) {
        jyVar.m2198a();
        while (true) {
            jv m2194a = jyVar.m2194a();
            if (m2194a.f24584a == 0) {
                break;
            }
            short s = m2194a.f840a;
            if (s == 1) {
                if (m2194a.f24584a == 10) {
                    this.f586a = jyVar.m2193a();
                    a(true);
                    jyVar.g();
                }
                kb.a(jyVar, m2194a.f24584a);
                jyVar.g();
            } else if (s == 2) {
                if (m2194a.f24584a == 11) {
                    this.f587a = jyVar.m2199a();
                    jyVar.g();
                }
                kb.a(jyVar, m2194a.f24584a);
                jyVar.g();
            } else if (s == 3) {
                if (m2194a.f24584a == 11) {
                    this.f590b = jyVar.m2199a();
                    jyVar.g();
                }
                kb.a(jyVar, m2194a.f24584a);
                jyVar.g();
            } else if (s == 4) {
                if (m2194a.f24584a == 11) {
                    this.f591c = jyVar.m2199a();
                    jyVar.g();
                }
                kb.a(jyVar, m2194a.f24584a);
                jyVar.g();
            } else if (s != 5) {
                if (s == 7 && m2194a.f24584a == 11) {
                    this.f592d = jyVar.m2199a();
                    jyVar.g();
                }
                kb.a(jyVar, m2194a.f24584a);
                jyVar.g();
            } else {
                if (m2194a.f24584a == 2) {
                    this.f589a = jyVar.m2203a();
                    b(true);
                    jyVar.g();
                }
                kb.a(jyVar, m2194a.f24584a);
                jyVar.g();
            }
        }
        jyVar.f();
        if (m2079a()) {
            a();
            return;
        }
        throw new jz("Required field 'channelId' was not found in serialized data! Struct: " + toString());
    }

    public void a(boolean z) {
        this.f588a.set(0, z);
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m2079a() {
        return this.f588a.get(0);
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m2080a(ir irVar) {
        if (irVar != null && this.f586a == irVar.f586a) {
            boolean b2 = b();
            boolean b3 = irVar.b();
            if ((b2 || b3) && (!b2 || !b3 || !this.f587a.equals(irVar.f587a))) {
                return false;
            }
            boolean c2 = c();
            boolean c3 = irVar.c();
            if ((c2 || c3) && (!c2 || !c3 || !this.f590b.equals(irVar.f590b))) {
                return false;
            }
            boolean d2 = d();
            boolean d3 = irVar.d();
            if ((d2 || d3) && (!d2 || !d3 || !this.f591c.equals(irVar.f591c))) {
                return false;
            }
            boolean e2 = e();
            boolean e3 = irVar.e();
            if ((e2 || e3) && (!e2 || !e3 || this.f589a != irVar.f589a)) {
                return false;
            }
            boolean f2 = f();
            boolean f3 = irVar.f();
            if (!f2 && !f3) {
                return true;
            }
            return f2 && f3 && this.f592d.equals(irVar.f592d);
        }
        return false;
    }

    @Override // com.xiaomi.push.jn
    public void b(jy jyVar) {
        a();
        jyVar.a(f585a);
        jyVar.a(f24557a);
        jyVar.a(this.f586a);
        jyVar.b();
        if (this.f587a != null) {
            jyVar.a(b);
            jyVar.a(this.f587a);
            jyVar.b();
        }
        if (this.f590b != null && c()) {
            jyVar.a(c);
            jyVar.a(this.f590b);
            jyVar.b();
        }
        if (this.f591c != null && d()) {
            jyVar.a(d);
            jyVar.a(this.f591c);
            jyVar.b();
        }
        if (e()) {
            jyVar.a(e);
            jyVar.a(this.f589a);
            jyVar.b();
        }
        if (this.f592d != null && f()) {
            jyVar.a(f);
            jyVar.a(this.f592d);
            jyVar.b();
        }
        jyVar.c();
        jyVar.m2202a();
    }

    public void b(boolean z) {
        this.f588a.set(1, z);
    }

    public boolean b() {
        return this.f587a != null;
    }

    public boolean c() {
        return this.f590b != null;
    }

    public boolean d() {
        return this.f591c != null;
    }

    public boolean e() {
        return this.f588a.get(1);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof ir)) {
            return m2080a((ir) obj);
        }
        return false;
    }

    public boolean f() {
        return this.f592d != null;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Target(");
        sb.append("channelId:");
        sb.append(this.f586a);
        sb.append(", ");
        sb.append("userId:");
        String str = this.f587a;
        if (str == null) {
            sb.append("null");
        } else {
            sb.append(str);
        }
        if (c()) {
            sb.append(", ");
            sb.append("server:");
            String str2 = this.f590b;
            if (str2 == null) {
                sb.append("null");
            } else {
                sb.append(str2);
            }
        }
        if (d()) {
            sb.append(", ");
            sb.append("resource:");
            String str3 = this.f591c;
            if (str3 == null) {
                sb.append("null");
            } else {
                sb.append(str3);
            }
        }
        if (e()) {
            sb.append(", ");
            sb.append("isPreview:");
            sb.append(this.f589a);
        }
        if (f()) {
            sb.append(", ");
            sb.append("token:");
            String str4 = this.f592d;
            if (str4 == null) {
                sb.append("null");
            } else {
                sb.append(str4);
            }
        }
        sb.append(riy.BRACKET_END_STR);
        return sb.toString();
    }
}
