package com.xiaomi.push;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import tb.riy;

/* loaded from: classes9.dex */
public class iz implements jn<iz, Object>, Serializable, Cloneable {

    /* renamed from: a  reason: collision with other field name */
    public List<in> f668a;

    /* renamed from: a  reason: collision with other field name */
    private static final kd f667a = new kd("XmPushActionCustomConfig");

    /* renamed from: a  reason: collision with root package name */
    private static final jv f24565a = new jv("", (byte) 15, 1);

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(iz izVar) {
        int a2;
        if (!getClass().equals(izVar.getClass())) {
            return getClass().getName().compareTo(izVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m2112a()).compareTo(Boolean.valueOf(izVar.m2112a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m2112a() && (a2 = jo.a(this.f668a, izVar.f668a)) != 0) {
            return a2;
        }
        return 0;
    }

    public List<in> a() {
        return this.f668a;
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m2111a() {
        if (this.f668a != null) {
            return;
        }
        throw new jz("Required field 'customConfigs' was not present! Struct: " + toString());
    }

    @Override // com.xiaomi.push.jn
    public void a(jy jyVar) {
        jyVar.m2198a();
        while (true) {
            jv m2194a = jyVar.m2194a();
            if (m2194a.f24584a == 0) {
                jyVar.f();
                m2111a();
                return;
            }
            if (m2194a.f840a == 1 && m2194a.f24584a == 15) {
                jw m2195a = jyVar.m2195a();
                this.f668a = new ArrayList(m2195a.f841a);
                for (int i = 0; i < m2195a.f841a; i++) {
                    in inVar = new in();
                    inVar.a(jyVar);
                    this.f668a.add(inVar);
                }
                jyVar.i();
            } else {
                kb.a(jyVar, m2194a.f24584a);
            }
            jyVar.g();
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m2112a() {
        return this.f668a != null;
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m2113a(iz izVar) {
        if (izVar == null) {
            return false;
        }
        boolean m2112a = m2112a();
        boolean m2112a2 = izVar.m2112a();
        if (!m2112a && !m2112a2) {
            return true;
        }
        return m2112a && m2112a2 && this.f668a.equals(izVar.f668a);
    }

    @Override // com.xiaomi.push.jn
    public void b(jy jyVar) {
        m2111a();
        jyVar.a(f667a);
        if (this.f668a != null) {
            jyVar.a(f24565a);
            jyVar.a(new jw((byte) 12, this.f668a.size()));
            for (in inVar : this.f668a) {
                inVar.b(jyVar);
            }
            jyVar.e();
            jyVar.b();
        }
        jyVar.c();
        jyVar.m2202a();
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof iz)) {
            return m2113a((iz) obj);
        }
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("XmPushActionCustomConfig(");
        sb.append("customConfigs:");
        List<in> list = this.f668a;
        if (list == null) {
            sb.append("null");
        } else {
            sb.append(list);
        }
        sb.append(riy.BRACKET_END_STR);
        return sb.toString();
    }
}
