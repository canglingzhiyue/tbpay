package com.xiaomi.push;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import tb.riy;

/* loaded from: classes9.dex */
public class ja implements jn<ja, Object>, Serializable, Cloneable {

    /* renamed from: a  reason: collision with other field name */
    public List<il> f671a;

    /* renamed from: a  reason: collision with other field name */
    private static final kd f670a = new kd("XmPushActionNormalConfig");

    /* renamed from: a  reason: collision with root package name */
    private static final jv f24567a = new jv("", (byte) 15, 1);

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(ja jaVar) {
        int a2;
        if (!getClass().equals(jaVar.getClass())) {
            return getClass().getName().compareTo(jaVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m2126a()).compareTo(Boolean.valueOf(jaVar.m2126a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m2126a() && (a2 = jo.a(this.f671a, jaVar.f671a)) != 0) {
            return a2;
        }
        return 0;
    }

    public List<il> a() {
        return this.f671a;
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m2125a() {
        if (this.f671a != null) {
            return;
        }
        throw new jz("Required field 'normalConfigs' was not present! Struct: " + toString());
    }

    @Override // com.xiaomi.push.jn
    public void a(jy jyVar) {
        jyVar.m2198a();
        while (true) {
            jv m2194a = jyVar.m2194a();
            if (m2194a.f24584a == 0) {
                jyVar.f();
                m2125a();
                return;
            }
            if (m2194a.f840a == 1 && m2194a.f24584a == 15) {
                jw m2195a = jyVar.m2195a();
                this.f671a = new ArrayList(m2195a.f841a);
                for (int i = 0; i < m2195a.f841a; i++) {
                    il ilVar = new il();
                    ilVar.a(jyVar);
                    this.f671a.add(ilVar);
                }
                jyVar.i();
            } else {
                kb.a(jyVar, m2194a.f24584a);
            }
            jyVar.g();
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m2126a() {
        return this.f671a != null;
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m2127a(ja jaVar) {
        if (jaVar == null) {
            return false;
        }
        boolean m2126a = m2126a();
        boolean m2126a2 = jaVar.m2126a();
        if (!m2126a && !m2126a2) {
            return true;
        }
        return m2126a && m2126a2 && this.f671a.equals(jaVar.f671a);
    }

    @Override // com.xiaomi.push.jn
    public void b(jy jyVar) {
        m2125a();
        jyVar.a(f670a);
        if (this.f671a != null) {
            jyVar.a(f24567a);
            jyVar.a(new jw((byte) 12, this.f671a.size()));
            for (il ilVar : this.f671a) {
                ilVar.b(jyVar);
            }
            jyVar.e();
            jyVar.b();
        }
        jyVar.c();
        jyVar.m2202a();
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof ja)) {
            return m2127a((ja) obj);
        }
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("XmPushActionNormalConfig(");
        sb.append("normalConfigs:");
        List<il> list = this.f671a;
        if (list == null) {
            sb.append("null");
        } else {
            sb.append(list);
        }
        sb.append(riy.BRACKET_END_STR);
        return sb.toString();
    }
}
