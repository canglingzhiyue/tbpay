package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;
import tb.riy;

/* loaded from: classes9.dex */
public class iu implements jn<iu, Object>, Serializable, Cloneable {

    /* renamed from: a  reason: collision with other field name */
    public int f628a;

    /* renamed from: a  reason: collision with other field name */
    private BitSet f629a = new BitSet(2);

    /* renamed from: b  reason: collision with other field name */
    public int f630b;

    /* renamed from: a  reason: collision with other field name */
    private static final kd f627a = new kd("XmPushActionCheckClientInfo");

    /* renamed from: a  reason: collision with root package name */
    private static final jv f24560a = new jv("", (byte) 8, 1);
    private static final jv b = new jv("", (byte) 8, 2);

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(iu iuVar) {
        int a2;
        int a3;
        if (!getClass().equals(iuVar.getClass())) {
            return getClass().getName().compareTo(iuVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m2088a()).compareTo(Boolean.valueOf(iuVar.m2088a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m2088a() && (a3 = jo.a(this.f628a, iuVar.f628a)) != 0) {
            return a3;
        }
        int compareTo2 = Boolean.valueOf(b()).compareTo(Boolean.valueOf(iuVar.b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (b() && (a2 = jo.a(this.f630b, iuVar.f630b)) != 0) {
            return a2;
        }
        return 0;
    }

    public iu a(int i) {
        this.f628a = i;
        a(true);
        return this;
    }

    public void a() {
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
            if (s != 1) {
                if (s == 2 && m2194a.f24584a == 8) {
                    this.f630b = jyVar.m2192a();
                    b(true);
                    jyVar.g();
                }
                kb.a(jyVar, m2194a.f24584a);
                jyVar.g();
            } else {
                if (m2194a.f24584a == 8) {
                    this.f628a = jyVar.m2192a();
                    a(true);
                    jyVar.g();
                }
                kb.a(jyVar, m2194a.f24584a);
                jyVar.g();
            }
        }
        jyVar.f();
        if (!m2088a()) {
            throw new jz("Required field 'miscConfigVersion' was not found in serialized data! Struct: " + toString());
        } else if (b()) {
            a();
        } else {
            throw new jz("Required field 'pluginConfigVersion' was not found in serialized data! Struct: " + toString());
        }
    }

    public void a(boolean z) {
        this.f629a.set(0, z);
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m2088a() {
        return this.f629a.get(0);
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m2089a(iu iuVar) {
        return iuVar != null && this.f628a == iuVar.f628a && this.f630b == iuVar.f630b;
    }

    public iu b(int i) {
        this.f630b = i;
        b(true);
        return this;
    }

    @Override // com.xiaomi.push.jn
    public void b(jy jyVar) {
        a();
        jyVar.a(f627a);
        jyVar.a(f24560a);
        jyVar.mo2190a(this.f628a);
        jyVar.b();
        jyVar.a(b);
        jyVar.mo2190a(this.f630b);
        jyVar.b();
        jyVar.c();
        jyVar.m2202a();
    }

    public void b(boolean z) {
        this.f629a.set(1, z);
    }

    public boolean b() {
        return this.f629a.get(1);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof iu)) {
            return m2089a((iu) obj);
        }
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        return "XmPushActionCheckClientInfo(miscConfigVersion:" + this.f628a + ", pluginConfigVersion:" + this.f630b + riy.BRACKET_END_STR;
    }
}
