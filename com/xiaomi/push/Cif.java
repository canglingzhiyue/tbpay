package com.xiaomi.push;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import tb.riy;

/* renamed from: com.xiaomi.push.if  reason: invalid class name */
/* loaded from: classes9.dex */
public class Cif implements jn<Cif, Object>, Serializable, Cloneable {

    /* renamed from: a  reason: collision with other field name */
    public List<ig> f507a;

    /* renamed from: a  reason: collision with other field name */
    private static final kd f506a = new kd("ClientUploadData");

    /* renamed from: a  reason: collision with root package name */
    private static final jv f24545a = new jv("", (byte) 15, 1);

    public int a() {
        List<ig> list = this.f507a;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(Cif cif) {
        int a2;
        if (!getClass().equals(cif.getClass())) {
            return getClass().getName().compareTo(cif.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m2034a()).compareTo(Boolean.valueOf(cif.m2034a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m2034a() && (a2 = jo.a(this.f507a, cif.f507a)) != 0) {
            return a2;
        }
        return 0;
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m2033a() {
        if (this.f507a != null) {
            return;
        }
        throw new jz("Required field 'uploadDataItems' was not present! Struct: " + toString());
    }

    public void a(ig igVar) {
        if (this.f507a == null) {
            this.f507a = new ArrayList();
        }
        this.f507a.add(igVar);
    }

    @Override // com.xiaomi.push.jn
    public void a(jy jyVar) {
        jyVar.m2198a();
        while (true) {
            jv m2194a = jyVar.m2194a();
            if (m2194a.f24584a == 0) {
                jyVar.f();
                m2033a();
                return;
            }
            if (m2194a.f840a == 1 && m2194a.f24584a == 15) {
                jw m2195a = jyVar.m2195a();
                this.f507a = new ArrayList(m2195a.f841a);
                for (int i = 0; i < m2195a.f841a; i++) {
                    ig igVar = new ig();
                    igVar.a(jyVar);
                    this.f507a.add(igVar);
                }
                jyVar.i();
            } else {
                kb.a(jyVar, m2194a.f24584a);
            }
            jyVar.g();
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m2034a() {
        return this.f507a != null;
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m2035a(Cif cif) {
        if (cif == null) {
            return false;
        }
        boolean m2034a = m2034a();
        boolean m2034a2 = cif.m2034a();
        if (!m2034a && !m2034a2) {
            return true;
        }
        return m2034a && m2034a2 && this.f507a.equals(cif.f507a);
    }

    @Override // com.xiaomi.push.jn
    public void b(jy jyVar) {
        m2033a();
        jyVar.a(f506a);
        if (this.f507a != null) {
            jyVar.a(f24545a);
            jyVar.a(new jw((byte) 12, this.f507a.size()));
            for (ig igVar : this.f507a) {
                igVar.b(jyVar);
            }
            jyVar.e();
            jyVar.b();
        }
        jyVar.c();
        jyVar.m2202a();
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof Cif)) {
            return m2035a((Cif) obj);
        }
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ClientUploadData(");
        sb.append("uploadDataItems:");
        List<ig> list = this.f507a;
        if (list == null) {
            sb.append("null");
        } else {
            sb.append(list);
        }
        sb.append(riy.BRACKET_END_STR);
        return sb.toString();
    }
}
