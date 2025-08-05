package com.xiaomi.push;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import tb.riy;

/* loaded from: classes9.dex */
public class iw implements jn<iw, Object>, Serializable, Cloneable {

    /* renamed from: a  reason: collision with other field name */
    public long f634a;

    /* renamed from: a  reason: collision with other field name */
    public ir f635a;

    /* renamed from: a  reason: collision with other field name */
    public String f636a;

    /* renamed from: a  reason: collision with other field name */
    public List<String> f638a;

    /* renamed from: b  reason: collision with other field name */
    public String f640b;

    /* renamed from: c  reason: collision with other field name */
    public String f642c;

    /* renamed from: d  reason: collision with other field name */
    public String f643d;

    /* renamed from: e  reason: collision with other field name */
    public String f644e;

    /* renamed from: a  reason: collision with other field name */
    private static final kd f633a = new kd("XmPushActionCommand");

    /* renamed from: a  reason: collision with root package name */
    private static final jv f24562a = new jv("", (byte) 12, 2);
    private static final jv b = new jv("", (byte) 11, 3);
    private static final jv c = new jv("", (byte) 11, 4);
    private static final jv d = new jv("", (byte) 11, 5);
    private static final jv e = new jv("", (byte) 15, 6);
    private static final jv f = new jv("", (byte) 11, 7);
    private static final jv g = new jv("", (byte) 11, 9);
    private static final jv h = new jv("", (byte) 2, 10);
    private static final jv i = new jv("", (byte) 2, 11);
    private static final jv j = new jv("", (byte) 10, 12);

    /* renamed from: a  reason: collision with other field name */
    private BitSet f637a = new BitSet(3);

    /* renamed from: a  reason: collision with other field name */
    public boolean f639a = false;

    /* renamed from: b  reason: collision with other field name */
    public boolean f641b = true;

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(iw iwVar) {
        int a2;
        int a3;
        int a4;
        int a5;
        int a6;
        int a7;
        int a8;
        int a9;
        int a10;
        int a11;
        if (!getClass().equals(iwVar.getClass())) {
            return getClass().getName().compareTo(iwVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m2094a()).compareTo(Boolean.valueOf(iwVar.m2094a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m2094a() && (a11 = jo.a(this.f635a, iwVar.f635a)) != 0) {
            return a11;
        }
        int compareTo2 = Boolean.valueOf(b()).compareTo(Boolean.valueOf(iwVar.b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (b() && (a10 = jo.a(this.f636a, iwVar.f636a)) != 0) {
            return a10;
        }
        int compareTo3 = Boolean.valueOf(c()).compareTo(Boolean.valueOf(iwVar.c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (c() && (a9 = jo.a(this.f640b, iwVar.f640b)) != 0) {
            return a9;
        }
        int compareTo4 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(iwVar.d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (d() && (a8 = jo.a(this.f642c, iwVar.f642c)) != 0) {
            return a8;
        }
        int compareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(iwVar.e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (e() && (a7 = jo.a(this.f638a, iwVar.f638a)) != 0) {
            return a7;
        }
        int compareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(iwVar.f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (f() && (a6 = jo.a(this.f643d, iwVar.f643d)) != 0) {
            return a6;
        }
        int compareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(iwVar.g()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (g() && (a5 = jo.a(this.f644e, iwVar.f644e)) != 0) {
            return a5;
        }
        int compareTo8 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(iwVar.h()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (h() && (a4 = jo.a(this.f639a, iwVar.f639a)) != 0) {
            return a4;
        }
        int compareTo9 = Boolean.valueOf(i()).compareTo(Boolean.valueOf(iwVar.i()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (i() && (a3 = jo.a(this.f641b, iwVar.f641b)) != 0) {
            return a3;
        }
        int compareTo10 = Boolean.valueOf(j()).compareTo(Boolean.valueOf(iwVar.j()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (j() && (a2 = jo.a(this.f634a, iwVar.f634a)) != 0) {
            return a2;
        }
        return 0;
    }

    public iw a(String str) {
        this.f636a = str;
        return this;
    }

    public String a() {
        return this.f642c;
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m2092a() {
        if (this.f636a == null) {
            throw new jz("Required field 'id' was not present! Struct: " + toString());
        } else if (this.f640b == null) {
            throw new jz("Required field 'appId' was not present! Struct: " + toString());
        } else if (this.f642c != null) {
        } else {
            throw new jz("Required field 'cmdName' was not present! Struct: " + toString());
        }
    }

    @Override // com.xiaomi.push.jn
    public void a(jy jyVar) {
        jyVar.m2198a();
        while (true) {
            jv m2194a = jyVar.m2194a();
            if (m2194a.f24584a == 0) {
                jyVar.f();
                m2092a();
                return;
            }
            switch (m2194a.f840a) {
                case 2:
                    if (m2194a.f24584a == 12) {
                        this.f635a = new ir();
                        this.f635a.a(jyVar);
                        continue;
                        jyVar.g();
                    }
                    break;
                case 3:
                    if (m2194a.f24584a == 11) {
                        this.f636a = jyVar.m2199a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 4:
                    if (m2194a.f24584a == 11) {
                        this.f640b = jyVar.m2199a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 5:
                    if (m2194a.f24584a == 11) {
                        this.f642c = jyVar.m2199a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 6:
                    if (m2194a.f24584a == 15) {
                        jw m2195a = jyVar.m2195a();
                        this.f638a = new ArrayList(m2195a.f841a);
                        for (int i2 = 0; i2 < m2195a.f841a; i2++) {
                            this.f638a.add(jyVar.m2199a());
                        }
                        jyVar.i();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 7:
                    if (m2194a.f24584a == 11) {
                        this.f643d = jyVar.m2199a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 9:
                    if (m2194a.f24584a == 11) {
                        this.f644e = jyVar.m2199a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 10:
                    if (m2194a.f24584a == 2) {
                        this.f639a = jyVar.m2203a();
                        a(true);
                        continue;
                        jyVar.g();
                    }
                    break;
                case 11:
                    if (m2194a.f24584a == 2) {
                        this.f641b = jyVar.m2203a();
                        b(true);
                        continue;
                        jyVar.g();
                    }
                    break;
                case 12:
                    if (m2194a.f24584a == 10) {
                        this.f634a = jyVar.m2193a();
                        c(true);
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
    public void m2093a(String str) {
        if (this.f638a == null) {
            this.f638a = new ArrayList();
        }
        this.f638a.add(str);
    }

    public void a(boolean z) {
        this.f637a.set(0, z);
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m2094a() {
        return this.f635a != null;
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m2095a(iw iwVar) {
        if (iwVar == null) {
            return false;
        }
        boolean m2094a = m2094a();
        boolean m2094a2 = iwVar.m2094a();
        if ((m2094a || m2094a2) && (!m2094a || !m2094a2 || !this.f635a.m2080a(iwVar.f635a))) {
            return false;
        }
        boolean b2 = b();
        boolean b3 = iwVar.b();
        if ((b2 || b3) && (!b2 || !b3 || !this.f636a.equals(iwVar.f636a))) {
            return false;
        }
        boolean c2 = c();
        boolean c3 = iwVar.c();
        if ((c2 || c3) && (!c2 || !c3 || !this.f640b.equals(iwVar.f640b))) {
            return false;
        }
        boolean d2 = d();
        boolean d3 = iwVar.d();
        if ((d2 || d3) && (!d2 || !d3 || !this.f642c.equals(iwVar.f642c))) {
            return false;
        }
        boolean e2 = e();
        boolean e3 = iwVar.e();
        if ((e2 || e3) && (!e2 || !e3 || !this.f638a.equals(iwVar.f638a))) {
            return false;
        }
        boolean f2 = f();
        boolean f3 = iwVar.f();
        if ((f2 || f3) && (!f2 || !f3 || !this.f643d.equals(iwVar.f643d))) {
            return false;
        }
        boolean g2 = g();
        boolean g3 = iwVar.g();
        if ((g2 || g3) && (!g2 || !g3 || !this.f644e.equals(iwVar.f644e))) {
            return false;
        }
        boolean h2 = h();
        boolean h3 = iwVar.h();
        if ((h2 || h3) && (!h2 || !h3 || this.f639a != iwVar.f639a)) {
            return false;
        }
        boolean i2 = i();
        boolean i3 = iwVar.i();
        if ((i2 || i3) && (!i2 || !i3 || this.f641b != iwVar.f641b)) {
            return false;
        }
        boolean j2 = j();
        boolean j3 = iwVar.j();
        if (!j2 && !j3) {
            return true;
        }
        return j2 && j3 && this.f634a == iwVar.f634a;
    }

    public iw b(String str) {
        this.f640b = str;
        return this;
    }

    @Override // com.xiaomi.push.jn
    public void b(jy jyVar) {
        m2092a();
        jyVar.a(f633a);
        if (this.f635a != null && m2094a()) {
            jyVar.a(f24562a);
            this.f635a.b(jyVar);
            jyVar.b();
        }
        if (this.f636a != null) {
            jyVar.a(b);
            jyVar.a(this.f636a);
            jyVar.b();
        }
        if (this.f640b != null) {
            jyVar.a(c);
            jyVar.a(this.f640b);
            jyVar.b();
        }
        if (this.f642c != null) {
            jyVar.a(d);
            jyVar.a(this.f642c);
            jyVar.b();
        }
        if (this.f638a != null && e()) {
            jyVar.a(e);
            jyVar.a(new jw((byte) 11, this.f638a.size()));
            for (String str : this.f638a) {
                jyVar.a(str);
            }
            jyVar.e();
            jyVar.b();
        }
        if (this.f643d != null && f()) {
            jyVar.a(f);
            jyVar.a(this.f643d);
            jyVar.b();
        }
        if (this.f644e != null && g()) {
            jyVar.a(g);
            jyVar.a(this.f644e);
            jyVar.b();
        }
        if (h()) {
            jyVar.a(h);
            jyVar.a(this.f639a);
            jyVar.b();
        }
        if (i()) {
            jyVar.a(i);
            jyVar.a(this.f641b);
            jyVar.b();
        }
        if (j()) {
            jyVar.a(j);
            jyVar.a(this.f634a);
            jyVar.b();
        }
        jyVar.c();
        jyVar.m2202a();
    }

    public void b(boolean z) {
        this.f637a.set(1, z);
    }

    public boolean b() {
        return this.f636a != null;
    }

    public iw c(String str) {
        this.f642c = str;
        return this;
    }

    public void c(boolean z) {
        this.f637a.set(2, z);
    }

    public boolean c() {
        return this.f640b != null;
    }

    public iw d(String str) {
        this.f643d = str;
        return this;
    }

    public boolean d() {
        return this.f642c != null;
    }

    public iw e(String str) {
        this.f644e = str;
        return this;
    }

    public boolean e() {
        return this.f638a != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof iw)) {
            return m2095a((iw) obj);
        }
        return false;
    }

    public boolean f() {
        return this.f643d != null;
    }

    public boolean g() {
        return this.f644e != null;
    }

    public boolean h() {
        return this.f637a.get(0);
    }

    public int hashCode() {
        return 0;
    }

    public boolean i() {
        return this.f637a.get(1);
    }

    public boolean j() {
        return this.f637a.get(2);
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("XmPushActionCommand(");
        if (m2094a()) {
            sb.append("target:");
            ir irVar = this.f635a;
            if (irVar == null) {
                sb.append("null");
            } else {
                sb.append(irVar);
            }
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            sb.append(", ");
        }
        sb.append("id:");
        String str = this.f636a;
        if (str == null) {
            sb.append("null");
        } else {
            sb.append(str);
        }
        sb.append(", ");
        sb.append("appId:");
        String str2 = this.f640b;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(str2);
        }
        sb.append(", ");
        sb.append("cmdName:");
        String str3 = this.f642c;
        if (str3 == null) {
            sb.append("null");
        } else {
            sb.append(str3);
        }
        if (e()) {
            sb.append(", ");
            sb.append("cmdArgs:");
            List<String> list = this.f638a;
            if (list == null) {
                sb.append("null");
            } else {
                sb.append(list);
            }
        }
        if (f()) {
            sb.append(", ");
            sb.append("packageName:");
            String str4 = this.f643d;
            if (str4 == null) {
                sb.append("null");
            } else {
                sb.append(str4);
            }
        }
        if (g()) {
            sb.append(", ");
            sb.append("category:");
            String str5 = this.f644e;
            if (str5 == null) {
                sb.append("null");
            } else {
                sb.append(str5);
            }
        }
        if (h()) {
            sb.append(", ");
            sb.append("updateCache:");
            sb.append(this.f639a);
        }
        if (i()) {
            sb.append(", ");
            sb.append("response2Client:");
            sb.append(this.f641b);
        }
        if (j()) {
            sb.append(", ");
            sb.append("createdTs:");
            sb.append(this.f634a);
        }
        sb.append(riy.BRACKET_END_STR);
        return sb.toString();
    }
}
