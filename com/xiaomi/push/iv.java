package com.xiaomi.push;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import tb.riy;

/* loaded from: classes9.dex */
public class iv implements jn<iv, Object>, Serializable, Cloneable {

    /* renamed from: a  reason: collision with other field name */
    public List<ik> f632a;

    /* renamed from: a  reason: collision with other field name */
    private static final kd f631a = new kd("XmPushActionCollectData");

    /* renamed from: a  reason: collision with root package name */
    private static final jv f24561a = new jv("", (byte) 15, 1);

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(iv ivVar) {
        int a2;
        if (!getClass().equals(ivVar.getClass())) {
            return getClass().getName().compareTo(ivVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m2090a()).compareTo(Boolean.valueOf(ivVar.m2090a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m2090a() && (a2 = jo.a(this.f632a, ivVar.f632a)) != 0) {
            return a2;
        }
        return 0;
    }

    public iv a(List<ik> list) {
        this.f632a = list;
        return this;
    }

    public void a() {
        if (this.f632a != null) {
            return;
        }
        throw new jz("Required field 'dataCollectionItems' was not present! Struct: " + toString());
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
            if (m2194a.f840a == 1 && m2194a.f24584a == 15) {
                jw m2195a = jyVar.m2195a();
                this.f632a = new ArrayList(m2195a.f841a);
                for (int i = 0; i < m2195a.f841a; i++) {
                    ik ikVar = new ik();
                    ikVar.a(jyVar);
                    this.f632a.add(ikVar);
                }
                jyVar.i();
            } else {
                kb.a(jyVar, m2194a.f24584a);
            }
            jyVar.g();
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m2090a() {
        return this.f632a != null;
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m2091a(iv ivVar) {
        if (ivVar == null) {
            return false;
        }
        boolean m2090a = m2090a();
        boolean m2090a2 = ivVar.m2090a();
        if (!m2090a && !m2090a2) {
            return true;
        }
        return m2090a && m2090a2 && this.f632a.equals(ivVar.f632a);
    }

    @Override // com.xiaomi.push.jn
    public void b(jy jyVar) {
        a();
        jyVar.a(f631a);
        if (this.f632a != null) {
            jyVar.a(f24561a);
            jyVar.a(new jw((byte) 12, this.f632a.size()));
            for (ik ikVar : this.f632a) {
                ikVar.b(jyVar);
            }
            jyVar.e();
            jyVar.b();
        }
        jyVar.c();
        jyVar.m2202a();
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof iv)) {
            return m2091a((iv) obj);
        }
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("XmPushActionCollectData(");
        sb.append("dataCollectionItems:");
        List<ik> list = this.f632a;
        if (list == null) {
            sb.append("null");
        } else {
            sb.append(list);
        }
        sb.append(riy.BRACKET_END_STR);
        return sb.toString();
    }
}
