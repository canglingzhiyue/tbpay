package com.xiaomi.push;

import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.BitSet;
import tb.riy;

/* loaded from: classes9.dex */
public class iy implements jn<iy, Object>, Serializable, Cloneable {

    /* renamed from: a  reason: collision with other field name */
    public ic f658a;

    /* renamed from: a  reason: collision with other field name */
    public ip f659a;

    /* renamed from: a  reason: collision with other field name */
    public ir f660a;

    /* renamed from: a  reason: collision with other field name */
    public String f661a;

    /* renamed from: a  reason: collision with other field name */
    public ByteBuffer f662a;

    /* renamed from: b  reason: collision with other field name */
    public String f665b;

    /* renamed from: a  reason: collision with other field name */
    private static final kd f657a = new kd("XmPushActionContainer");

    /* renamed from: a  reason: collision with root package name */
    private static final jv f24564a = new jv("", (byte) 8, 1);
    private static final jv b = new jv("", (byte) 2, 2);
    private static final jv c = new jv("", (byte) 2, 3);
    private static final jv d = new jv("", (byte) 11, 4);
    private static final jv e = new jv("", (byte) 11, 5);
    private static final jv f = new jv("", (byte) 11, 6);
    private static final jv g = new jv("", (byte) 12, 7);
    private static final jv h = new jv("", (byte) 12, 8);

    /* renamed from: a  reason: collision with other field name */
    private BitSet f663a = new BitSet(2);

    /* renamed from: a  reason: collision with other field name */
    public boolean f664a = true;

    /* renamed from: b  reason: collision with other field name */
    public boolean f666b = true;

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(iy iyVar) {
        int a2;
        int a3;
        int a4;
        int a5;
        int a6;
        int a7;
        int a8;
        int a9;
        if (!getClass().equals(iyVar.getClass())) {
            return getClass().getName().compareTo(iyVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m2106a()).compareTo(Boolean.valueOf(iyVar.m2106a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m2106a() && (a9 = jo.a(this.f658a, iyVar.f658a)) != 0) {
            return a9;
        }
        int compareTo2 = Boolean.valueOf(c()).compareTo(Boolean.valueOf(iyVar.c()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (c() && (a8 = jo.a(this.f664a, iyVar.f664a)) != 0) {
            return a8;
        }
        int compareTo3 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(iyVar.d()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (d() && (a7 = jo.a(this.f666b, iyVar.f666b)) != 0) {
            return a7;
        }
        int compareTo4 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(iyVar.e()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (e() && (a6 = jo.a(this.f662a, iyVar.f662a)) != 0) {
            return a6;
        }
        int compareTo5 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(iyVar.f()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (f() && (a5 = jo.a(this.f661a, iyVar.f661a)) != 0) {
            return a5;
        }
        int compareTo6 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(iyVar.g()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (g() && (a4 = jo.a(this.f665b, iyVar.f665b)) != 0) {
            return a4;
        }
        int compareTo7 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(iyVar.h()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (h() && (a3 = jo.a(this.f660a, iyVar.f660a)) != 0) {
            return a3;
        }
        int compareTo8 = Boolean.valueOf(i()).compareTo(Boolean.valueOf(iyVar.i()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (i() && (a2 = jo.a(this.f659a, iyVar.f659a)) != 0) {
            return a2;
        }
        return 0;
    }

    public ic a() {
        return this.f658a;
    }

    /* renamed from: a  reason: collision with other method in class */
    public ip m2102a() {
        return this.f659a;
    }

    public iy a(ic icVar) {
        this.f658a = icVar;
        return this;
    }

    public iy a(ip ipVar) {
        this.f659a = ipVar;
        return this;
    }

    public iy a(ir irVar) {
        this.f660a = irVar;
        return this;
    }

    public iy a(String str) {
        this.f661a = str;
        return this;
    }

    public iy a(ByteBuffer byteBuffer) {
        this.f662a = byteBuffer;
        return this;
    }

    public iy a(boolean z) {
        this.f664a = z;
        m2105a(true);
        return this;
    }

    /* renamed from: a  reason: collision with other method in class */
    public String m2103a() {
        return this.f661a;
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m2104a() {
        if (this.f658a == null) {
            throw new jz("Required field 'action' was not present! Struct: " + toString());
        } else if (this.f662a == null) {
            throw new jz("Required field 'pushAction' was not present! Struct: " + toString());
        } else if (this.f660a != null) {
        } else {
            throw new jz("Required field 'target' was not present! Struct: " + toString());
        }
    }

    @Override // com.xiaomi.push.jn
    public void a(jy jyVar) {
        jyVar.m2198a();
        while (true) {
            jv m2194a = jyVar.m2194a();
            if (m2194a.f24584a == 0) {
                jyVar.f();
                if (!c()) {
                    throw new jz("Required field 'encryptAction' was not found in serialized data! Struct: " + toString());
                } else if (d()) {
                    m2104a();
                    return;
                } else {
                    throw new jz("Required field 'isRequest' was not found in serialized data! Struct: " + toString());
                }
            }
            switch (m2194a.f840a) {
                case 1:
                    if (m2194a.f24584a == 8) {
                        this.f658a = ic.a(jyVar.m2192a());
                        continue;
                        jyVar.g();
                    }
                    break;
                case 2:
                    if (m2194a.f24584a == 2) {
                        this.f664a = jyVar.m2203a();
                        m2105a(true);
                        continue;
                        jyVar.g();
                    }
                    break;
                case 3:
                    if (m2194a.f24584a == 2) {
                        this.f666b = jyVar.m2203a();
                        m2109b(true);
                        continue;
                        jyVar.g();
                    }
                    break;
                case 4:
                    if (m2194a.f24584a == 11) {
                        this.f662a = jyVar.m2200a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 5:
                    if (m2194a.f24584a == 11) {
                        this.f661a = jyVar.m2199a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 6:
                    if (m2194a.f24584a == 11) {
                        this.f665b = jyVar.m2199a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 7:
                    if (m2194a.f24584a == 12) {
                        this.f660a = new ir();
                        this.f660a.a(jyVar);
                        continue;
                        jyVar.g();
                    }
                    break;
                case 8:
                    if (m2194a.f24584a == 12) {
                        this.f659a = new ip();
                        this.f659a.a(jyVar);
                        continue;
                        jyVar.g();
                    }
                    break;
            }
            kb.a(jyVar, m2194a.f24584a);
            jyVar.g();
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m2105a(boolean z) {
        this.f663a.set(0, z);
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m2106a() {
        return this.f658a != null;
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m2107a(iy iyVar) {
        if (iyVar == null) {
            return false;
        }
        boolean m2106a = m2106a();
        boolean m2106a2 = iyVar.m2106a();
        if (((m2106a || m2106a2) && (!m2106a || !m2106a2 || !this.f658a.equals(iyVar.f658a))) || this.f664a != iyVar.f664a || this.f666b != iyVar.f666b) {
            return false;
        }
        boolean e2 = e();
        boolean e3 = iyVar.e();
        if ((e2 || e3) && (!e2 || !e3 || !this.f662a.equals(iyVar.f662a))) {
            return false;
        }
        boolean f2 = f();
        boolean f3 = iyVar.f();
        if ((f2 || f3) && (!f2 || !f3 || !this.f661a.equals(iyVar.f661a))) {
            return false;
        }
        boolean g2 = g();
        boolean g3 = iyVar.g();
        if ((g2 || g3) && (!g2 || !g3 || !this.f665b.equals(iyVar.f665b))) {
            return false;
        }
        boolean h2 = h();
        boolean h3 = iyVar.h();
        if ((h2 || h3) && (!h2 || !h3 || !this.f660a.m2080a(iyVar.f660a))) {
            return false;
        }
        boolean i = i();
        boolean i2 = iyVar.i();
        if (!i && !i2) {
            return true;
        }
        return i && i2 && this.f659a.m2072a(iyVar.f659a);
    }

    /* renamed from: a  reason: collision with other method in class */
    public byte[] m2108a() {
        a(jo.a(this.f662a));
        return this.f662a.array();
    }

    public iy b(String str) {
        this.f665b = str;
        return this;
    }

    public iy b(boolean z) {
        this.f666b = z;
        m2109b(true);
        return this;
    }

    public String b() {
        return this.f665b;
    }

    @Override // com.xiaomi.push.jn
    public void b(jy jyVar) {
        m2104a();
        jyVar.a(f657a);
        if (this.f658a != null) {
            jyVar.a(f24564a);
            jyVar.mo2190a(this.f658a.a());
            jyVar.b();
        }
        jyVar.a(b);
        jyVar.a(this.f664a);
        jyVar.b();
        jyVar.a(c);
        jyVar.a(this.f666b);
        jyVar.b();
        if (this.f662a != null) {
            jyVar.a(d);
            jyVar.a(this.f662a);
            jyVar.b();
        }
        if (this.f661a != null && f()) {
            jyVar.a(e);
            jyVar.a(this.f661a);
            jyVar.b();
        }
        if (this.f665b != null && g()) {
            jyVar.a(f);
            jyVar.a(this.f665b);
            jyVar.b();
        }
        if (this.f660a != null) {
            jyVar.a(g);
            this.f660a.b(jyVar);
            jyVar.b();
        }
        if (this.f659a != null && i()) {
            jyVar.a(h);
            this.f659a.b(jyVar);
            jyVar.b();
        }
        jyVar.c();
        jyVar.m2202a();
    }

    /* renamed from: b  reason: collision with other method in class */
    public void m2109b(boolean z) {
        this.f663a.set(1, z);
    }

    /* renamed from: b  reason: collision with other method in class */
    public boolean m2110b() {
        return this.f664a;
    }

    public boolean c() {
        return this.f663a.get(0);
    }

    public boolean d() {
        return this.f663a.get(1);
    }

    public boolean e() {
        return this.f662a != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof iy)) {
            return m2107a((iy) obj);
        }
        return false;
    }

    public boolean f() {
        return this.f661a != null;
    }

    public boolean g() {
        return this.f665b != null;
    }

    public boolean h() {
        return this.f660a != null;
    }

    public int hashCode() {
        return 0;
    }

    public boolean i() {
        return this.f659a != null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("XmPushActionContainer(");
        sb.append("action:");
        ic icVar = this.f658a;
        if (icVar == null) {
            sb.append("null");
        } else {
            sb.append(icVar);
        }
        sb.append(", ");
        sb.append("encryptAction:");
        sb.append(this.f664a);
        sb.append(", ");
        sb.append("isRequest:");
        sb.append(this.f666b);
        if (f()) {
            sb.append(", ");
            sb.append("appid:");
            String str = this.f661a;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
        }
        if (g()) {
            sb.append(", ");
            sb.append("packageName:");
            String str2 = this.f665b;
            if (str2 == null) {
                sb.append("null");
            } else {
                sb.append(str2);
            }
        }
        sb.append(", ");
        sb.append("target:");
        ir irVar = this.f660a;
        if (irVar == null) {
            sb.append("null");
        } else {
            sb.append(irVar);
        }
        if (i()) {
            sb.append(", ");
            sb.append("metaInfo:");
            ip ipVar = this.f659a;
            if (ipVar == null) {
                sb.append("null");
            } else {
                sb.append(ipVar);
            }
        }
        sb.append(riy.BRACKET_END_STR);
        return sb.toString();
    }
}
