package com.xiaomi.push;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import tb.riy;

/* loaded from: classes9.dex */
public class il implements jn<il, Object>, Serializable, Cloneable {

    /* renamed from: a  reason: collision with other field name */
    public int f533a;

    /* renamed from: a  reason: collision with other field name */
    public ii f534a;

    /* renamed from: a  reason: collision with other field name */
    private BitSet f535a = new BitSet(1);

    /* renamed from: a  reason: collision with other field name */
    public List<in> f536a;

    /* renamed from: a  reason: collision with other field name */
    private static final kd f532a = new kd("NormalConfig");

    /* renamed from: a  reason: collision with root package name */
    private static final jv f24551a = new jv("", (byte) 8, 1);
    private static final jv b = new jv("", (byte) 15, 2);
    private static final jv c = new jv("", (byte) 8, 3);

    public int a() {
        return this.f533a;
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(il ilVar) {
        int a2;
        int a3;
        int a4;
        if (!getClass().equals(ilVar.getClass())) {
            return getClass().getName().compareTo(ilVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m2051a()).compareTo(Boolean.valueOf(ilVar.m2051a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m2051a() && (a4 = jo.a(this.f533a, ilVar.f533a)) != 0) {
            return a4;
        }
        int compareTo2 = Boolean.valueOf(b()).compareTo(Boolean.valueOf(ilVar.b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (b() && (a3 = jo.a(this.f536a, ilVar.f536a)) != 0) {
            return a3;
        }
        int compareTo3 = Boolean.valueOf(c()).compareTo(Boolean.valueOf(ilVar.c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (c() && (a2 = jo.a(this.f534a, ilVar.f534a)) != 0) {
            return a2;
        }
        return 0;
    }

    /* renamed from: a  reason: collision with other method in class */
    public ii m2049a() {
        return this.f534a;
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m2050a() {
        if (this.f536a != null) {
            return;
        }
        throw new jz("Required field 'configItems' was not present! Struct: " + toString());
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
                if (m2194a.f24584a == 8) {
                    this.f533a = jyVar.m2192a();
                    a(true);
                    jyVar.g();
                }
                kb.a(jyVar, m2194a.f24584a);
                jyVar.g();
            } else if (s != 2) {
                if (s == 3 && m2194a.f24584a == 8) {
                    this.f534a = ii.a(jyVar.m2192a());
                    jyVar.g();
                }
                kb.a(jyVar, m2194a.f24584a);
                jyVar.g();
            } else {
                if (m2194a.f24584a == 15) {
                    jw m2195a = jyVar.m2195a();
                    this.f536a = new ArrayList(m2195a.f841a);
                    for (int i = 0; i < m2195a.f841a; i++) {
                        in inVar = new in();
                        inVar.a(jyVar);
                        this.f536a.add(inVar);
                    }
                    jyVar.i();
                    jyVar.g();
                }
                kb.a(jyVar, m2194a.f24584a);
                jyVar.g();
            }
        }
        jyVar.f();
        if (m2051a()) {
            m2050a();
            return;
        }
        throw new jz("Required field 'version' was not found in serialized data! Struct: " + toString());
    }

    public void a(boolean z) {
        this.f535a.set(0, z);
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m2051a() {
        return this.f535a.get(0);
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m2052a(il ilVar) {
        if (ilVar != null && this.f533a == ilVar.f533a) {
            boolean b2 = b();
            boolean b3 = ilVar.b();
            if ((b2 || b3) && (!b2 || !b3 || !this.f536a.equals(ilVar.f536a))) {
                return false;
            }
            boolean c2 = c();
            boolean c3 = ilVar.c();
            if (!c2 && !c3) {
                return true;
            }
            return c2 && c3 && this.f534a.equals(ilVar.f534a);
        }
        return false;
    }

    @Override // com.xiaomi.push.jn
    public void b(jy jyVar) {
        m2050a();
        jyVar.a(f532a);
        jyVar.a(f24551a);
        jyVar.mo2190a(this.f533a);
        jyVar.b();
        if (this.f536a != null) {
            jyVar.a(b);
            jyVar.a(new jw((byte) 12, this.f536a.size()));
            for (in inVar : this.f536a) {
                inVar.b(jyVar);
            }
            jyVar.e();
            jyVar.b();
        }
        if (this.f534a != null && c()) {
            jyVar.a(c);
            jyVar.mo2190a(this.f534a.a());
            jyVar.b();
        }
        jyVar.c();
        jyVar.m2202a();
    }

    public boolean b() {
        return this.f536a != null;
    }

    public boolean c() {
        return this.f534a != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof il)) {
            return m2052a((il) obj);
        }
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("NormalConfig(");
        sb.append("version:");
        sb.append(this.f533a);
        sb.append(", ");
        sb.append("configItems:");
        List<in> list = this.f536a;
        if (list == null) {
            sb.append("null");
        } else {
            sb.append(list);
        }
        if (c()) {
            sb.append(", ");
            sb.append("type:");
            ii iiVar = this.f534a;
            if (iiVar == null) {
                sb.append("null");
            } else {
                sb.append(iiVar);
            }
        }
        sb.append(riy.BRACKET_END_STR);
        return sb.toString();
    }
}
