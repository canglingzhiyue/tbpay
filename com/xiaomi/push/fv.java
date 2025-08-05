package com.xiaomi.push;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import tb.riy;

/* loaded from: classes9.dex */
public class fv implements jn<fv, Object>, Serializable, Cloneable {

    /* renamed from: a  reason: collision with other field name */
    public String f379a;

    /* renamed from: a  reason: collision with other field name */
    public List<fu> f380a;

    /* renamed from: b  reason: collision with other field name */
    public String f381b;

    /* renamed from: a  reason: collision with other field name */
    private static final kd f378a = new kd("StatsEvents");

    /* renamed from: a  reason: collision with root package name */
    private static final jv f24483a = new jv("", (byte) 11, 1);
    private static final jv b = new jv("", (byte) 11, 2);
    private static final jv c = new jv("", (byte) 15, 3);

    public fv() {
    }

    public fv(String str, List<fu> list) {
        this();
        this.f379a = str;
        this.f380a = list;
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(fv fvVar) {
        int a2;
        int a3;
        int a4;
        if (!getClass().equals(fvVar.getClass())) {
            return getClass().getName().compareTo(fvVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m1940a()).compareTo(Boolean.valueOf(fvVar.m1940a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m1940a() && (a4 = jo.a(this.f379a, fvVar.f379a)) != 0) {
            return a4;
        }
        int compareTo2 = Boolean.valueOf(b()).compareTo(Boolean.valueOf(fvVar.b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (b() && (a3 = jo.a(this.f381b, fvVar.f381b)) != 0) {
            return a3;
        }
        int compareTo3 = Boolean.valueOf(c()).compareTo(Boolean.valueOf(fvVar.c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (c() && (a2 = jo.a(this.f380a, fvVar.f380a)) != 0) {
            return a2;
        }
        return 0;
    }

    public fv a(String str) {
        this.f381b = str;
        return this;
    }

    public void a() {
        if (this.f379a == null) {
            throw new jz("Required field 'uuid' was not present! Struct: " + toString());
        } else if (this.f380a != null) {
        } else {
            throw new jz("Required field 'events' was not present! Struct: " + toString());
        }
    }

    @Override // com.xiaomi.push.jn
    public void a(jy jyVar) {
        jyVar.m2198a();
        while (true) {
            jv m2194a = jyVar.m2194a();
            if (m2194a.f24584a == 0) {
                jyVar.f();
                a();
                return;
            }
            short s = m2194a.f840a;
            if (s == 1) {
                if (m2194a.f24584a == 11) {
                    this.f379a = jyVar.m2199a();
                    jyVar.g();
                }
                kb.a(jyVar, m2194a.f24584a);
                jyVar.g();
            } else if (s != 2) {
                if (s == 3 && m2194a.f24584a == 15) {
                    jw m2195a = jyVar.m2195a();
                    this.f380a = new ArrayList(m2195a.f841a);
                    for (int i = 0; i < m2195a.f841a; i++) {
                        fu fuVar = new fu();
                        fuVar.a(jyVar);
                        this.f380a.add(fuVar);
                    }
                    jyVar.i();
                    jyVar.g();
                }
                kb.a(jyVar, m2194a.f24584a);
                jyVar.g();
            } else {
                if (m2194a.f24584a == 11) {
                    this.f381b = jyVar.m2199a();
                    jyVar.g();
                }
                kb.a(jyVar, m2194a.f24584a);
                jyVar.g();
            }
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m1940a() {
        return this.f379a != null;
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m1941a(fv fvVar) {
        if (fvVar == null) {
            return false;
        }
        boolean m1940a = m1940a();
        boolean m1940a2 = fvVar.m1940a();
        if ((m1940a || m1940a2) && (!m1940a || !m1940a2 || !this.f379a.equals(fvVar.f379a))) {
            return false;
        }
        boolean b2 = b();
        boolean b3 = fvVar.b();
        if ((b2 || b3) && (!b2 || !b3 || !this.f381b.equals(fvVar.f381b))) {
            return false;
        }
        boolean c2 = c();
        boolean c3 = fvVar.c();
        if (!c2 && !c3) {
            return true;
        }
        return c2 && c3 && this.f380a.equals(fvVar.f380a);
    }

    @Override // com.xiaomi.push.jn
    public void b(jy jyVar) {
        a();
        jyVar.a(f378a);
        if (this.f379a != null) {
            jyVar.a(f24483a);
            jyVar.a(this.f379a);
            jyVar.b();
        }
        if (this.f381b != null && b()) {
            jyVar.a(b);
            jyVar.a(this.f381b);
            jyVar.b();
        }
        if (this.f380a != null) {
            jyVar.a(c);
            jyVar.a(new jw((byte) 12, this.f380a.size()));
            for (fu fuVar : this.f380a) {
                fuVar.b(jyVar);
            }
            jyVar.e();
            jyVar.b();
        }
        jyVar.c();
        jyVar.m2202a();
    }

    public boolean b() {
        return this.f381b != null;
    }

    public boolean c() {
        return this.f380a != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof fv)) {
            return m1941a((fv) obj);
        }
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("StatsEvents(");
        sb.append("uuid:");
        String str = this.f379a;
        if (str == null) {
            sb.append("null");
        } else {
            sb.append(str);
        }
        if (b()) {
            sb.append(", ");
            sb.append("operator:");
            String str2 = this.f381b;
            if (str2 == null) {
                sb.append("null");
            } else {
                sb.append(str2);
            }
        }
        sb.append(", ");
        sb.append("events:");
        List<fu> list = this.f380a;
        if (list == null) {
            sb.append("null");
        } else {
            sb.append(list);
        }
        sb.append(riy.BRACKET_END_STR);
        return sb.toString();
    }
}
