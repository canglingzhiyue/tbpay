package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;
import tb.riy;

/* loaded from: classes9.dex */
public class ik implements jn<ik, Object>, Serializable, Cloneable {

    /* renamed from: a  reason: collision with other field name */
    public long f528a;

    /* renamed from: a  reason: collision with other field name */
    public ie f529a;

    /* renamed from: a  reason: collision with other field name */
    public String f530a;

    /* renamed from: a  reason: collision with other field name */
    private BitSet f531a = new BitSet(1);

    /* renamed from: a  reason: collision with other field name */
    private static final kd f527a = new kd("DataCollectionItem");

    /* renamed from: a  reason: collision with root package name */
    private static final jv f24550a = new jv("", (byte) 10, 1);
    private static final jv b = new jv("", (byte) 8, 2);
    private static final jv c = new jv("", (byte) 11, 3);

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(ik ikVar) {
        int a2;
        int a3;
        int a4;
        if (!getClass().equals(ikVar.getClass())) {
            return getClass().getName().compareTo(ikVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m2047a()).compareTo(Boolean.valueOf(ikVar.m2047a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m2047a() && (a4 = jo.a(this.f528a, ikVar.f528a)) != 0) {
            return a4;
        }
        int compareTo2 = Boolean.valueOf(b()).compareTo(Boolean.valueOf(ikVar.b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (b() && (a3 = jo.a(this.f529a, ikVar.f529a)) != 0) {
            return a3;
        }
        int compareTo3 = Boolean.valueOf(c()).compareTo(Boolean.valueOf(ikVar.c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (c() && (a2 = jo.a(this.f530a, ikVar.f530a)) != 0) {
            return a2;
        }
        return 0;
    }

    public ik a(long j) {
        this.f528a = j;
        a(true);
        return this;
    }

    public ik a(ie ieVar) {
        this.f529a = ieVar;
        return this;
    }

    public ik a(String str) {
        this.f530a = str;
        return this;
    }

    public String a() {
        return this.f530a;
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m2046a() {
        if (this.f529a == null) {
            throw new jz("Required field 'collectionType' was not present! Struct: " + toString());
        } else if (this.f530a != null) {
        } else {
            throw new jz("Required field 'content' was not present! Struct: " + toString());
        }
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
                    this.f528a = jyVar.m2193a();
                    a(true);
                    jyVar.g();
                }
                kb.a(jyVar, m2194a.f24584a);
                jyVar.g();
            } else if (s != 2) {
                if (s == 3 && m2194a.f24584a == 11) {
                    this.f530a = jyVar.m2199a();
                    jyVar.g();
                }
                kb.a(jyVar, m2194a.f24584a);
                jyVar.g();
            } else {
                if (m2194a.f24584a == 8) {
                    this.f529a = ie.a(jyVar.m2192a());
                    jyVar.g();
                }
                kb.a(jyVar, m2194a.f24584a);
                jyVar.g();
            }
        }
        jyVar.f();
        if (m2047a()) {
            m2046a();
            return;
        }
        throw new jz("Required field 'collectedAt' was not found in serialized data! Struct: " + toString());
    }

    public void a(boolean z) {
        this.f531a.set(0, z);
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m2047a() {
        return this.f531a.get(0);
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m2048a(ik ikVar) {
        if (ikVar != null && this.f528a == ikVar.f528a) {
            boolean b2 = b();
            boolean b3 = ikVar.b();
            if ((b2 || b3) && (!b2 || !b3 || !this.f529a.equals(ikVar.f529a))) {
                return false;
            }
            boolean c2 = c();
            boolean c3 = ikVar.c();
            if (!c2 && !c3) {
                return true;
            }
            return c2 && c3 && this.f530a.equals(ikVar.f530a);
        }
        return false;
    }

    @Override // com.xiaomi.push.jn
    public void b(jy jyVar) {
        m2046a();
        jyVar.a(f527a);
        jyVar.a(f24550a);
        jyVar.a(this.f528a);
        jyVar.b();
        if (this.f529a != null) {
            jyVar.a(b);
            jyVar.mo2190a(this.f529a.a());
            jyVar.b();
        }
        if (this.f530a != null) {
            jyVar.a(c);
            jyVar.a(this.f530a);
            jyVar.b();
        }
        jyVar.c();
        jyVar.m2202a();
    }

    public boolean b() {
        return this.f529a != null;
    }

    public boolean c() {
        return this.f530a != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof ik)) {
            return m2048a((ik) obj);
        }
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DataCollectionItem(");
        sb.append("collectedAt:");
        sb.append(this.f528a);
        sb.append(", ");
        sb.append("collectionType:");
        ie ieVar = this.f529a;
        if (ieVar == null) {
            sb.append("null");
        } else {
            sb.append(ieVar);
        }
        sb.append(", ");
        sb.append("content:");
        String str = this.f530a;
        if (str == null) {
            sb.append("null");
        } else {
            sb.append(str);
        }
        sb.append(riy.BRACKET_END_STR);
        return sb.toString();
    }
}
