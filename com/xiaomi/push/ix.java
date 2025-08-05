package com.xiaomi.push;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import tb.riy;

/* loaded from: classes9.dex */
public class ix implements jn<ix, Object>, Serializable, Cloneable {

    /* renamed from: a  reason: collision with other field name */
    public long f646a;

    /* renamed from: a  reason: collision with other field name */
    public ir f647a;

    /* renamed from: a  reason: collision with other field name */
    public String f648a;

    /* renamed from: a  reason: collision with other field name */
    public List<String> f650a;

    /* renamed from: b  reason: collision with other field name */
    public String f652b;

    /* renamed from: c  reason: collision with other field name */
    public String f653c;

    /* renamed from: d  reason: collision with other field name */
    public String f654d;

    /* renamed from: e  reason: collision with other field name */
    public String f655e;

    /* renamed from: f  reason: collision with other field name */
    public String f656f;

    /* renamed from: a  reason: collision with other field name */
    private static final kd f645a = new kd("XmPushActionCommandResult");

    /* renamed from: a  reason: collision with root package name */
    private static final jv f24563a = new jv("", (byte) 12, 2);
    private static final jv b = new jv("", (byte) 11, 3);
    private static final jv c = new jv("", (byte) 11, 4);
    private static final jv d = new jv("", (byte) 11, 5);
    private static final jv e = new jv("", (byte) 10, 7);
    private static final jv f = new jv("", (byte) 11, 8);
    private static final jv g = new jv("", (byte) 11, 9);
    private static final jv h = new jv("", (byte) 15, 10);
    private static final jv i = new jv("", (byte) 11, 12);
    private static final jv j = new jv("", (byte) 2, 13);

    /* renamed from: a  reason: collision with other field name */
    private BitSet f649a = new BitSet(2);

    /* renamed from: a  reason: collision with other field name */
    public boolean f651a = true;

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(ix ixVar) {
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
        if (!getClass().equals(ixVar.getClass())) {
            return getClass().getName().compareTo(ixVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m2098a()).compareTo(Boolean.valueOf(ixVar.m2098a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m2098a() && (a11 = jo.a(this.f647a, ixVar.f647a)) != 0) {
            return a11;
        }
        int compareTo2 = Boolean.valueOf(m2100b()).compareTo(Boolean.valueOf(ixVar.m2100b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (m2100b() && (a10 = jo.a(this.f648a, ixVar.f648a)) != 0) {
            return a10;
        }
        int compareTo3 = Boolean.valueOf(m2101c()).compareTo(Boolean.valueOf(ixVar.m2101c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (m2101c() && (a9 = jo.a(this.f652b, ixVar.f652b)) != 0) {
            return a9;
        }
        int compareTo4 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(ixVar.d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (d() && (a8 = jo.a(this.f653c, ixVar.f653c)) != 0) {
            return a8;
        }
        int compareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(ixVar.e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (e() && (a7 = jo.a(this.f646a, ixVar.f646a)) != 0) {
            return a7;
        }
        int compareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(ixVar.f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (f() && (a6 = jo.a(this.f654d, ixVar.f654d)) != 0) {
            return a6;
        }
        int compareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(ixVar.g()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (g() && (a5 = jo.a(this.f655e, ixVar.f655e)) != 0) {
            return a5;
        }
        int compareTo8 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(ixVar.h()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (h() && (a4 = jo.a(this.f650a, ixVar.f650a)) != 0) {
            return a4;
        }
        int compareTo9 = Boolean.valueOf(i()).compareTo(Boolean.valueOf(ixVar.i()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (i() && (a3 = jo.a(this.f656f, ixVar.f656f)) != 0) {
            return a3;
        }
        int compareTo10 = Boolean.valueOf(j()).compareTo(Boolean.valueOf(ixVar.j()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (j() && (a2 = jo.a(this.f651a, ixVar.f651a)) != 0) {
            return a2;
        }
        return 0;
    }

    public String a() {
        return this.f648a;
    }

    /* renamed from: a  reason: collision with other method in class */
    public List<String> m2096a() {
        return this.f650a;
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m2097a() {
        if (this.f648a == null) {
            throw new jz("Required field 'id' was not present! Struct: " + toString());
        } else if (this.f652b == null) {
            throw new jz("Required field 'appId' was not present! Struct: " + toString());
        } else if (this.f653c != null) {
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
                if (e()) {
                    m2097a();
                    return;
                }
                throw new jz("Required field 'errorCode' was not found in serialized data! Struct: " + toString());
            }
            switch (m2194a.f840a) {
                case 2:
                    if (m2194a.f24584a == 12) {
                        this.f647a = new ir();
                        this.f647a.a(jyVar);
                        continue;
                        jyVar.g();
                    }
                    break;
                case 3:
                    if (m2194a.f24584a == 11) {
                        this.f648a = jyVar.m2199a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 4:
                    if (m2194a.f24584a == 11) {
                        this.f652b = jyVar.m2199a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 5:
                    if (m2194a.f24584a == 11) {
                        this.f653c = jyVar.m2199a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 7:
                    if (m2194a.f24584a == 10) {
                        this.f646a = jyVar.m2193a();
                        a(true);
                        continue;
                        jyVar.g();
                    }
                    break;
                case 8:
                    if (m2194a.f24584a == 11) {
                        this.f654d = jyVar.m2199a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 9:
                    if (m2194a.f24584a == 11) {
                        this.f655e = jyVar.m2199a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 10:
                    if (m2194a.f24584a == 15) {
                        jw m2195a = jyVar.m2195a();
                        this.f650a = new ArrayList(m2195a.f841a);
                        for (int i2 = 0; i2 < m2195a.f841a; i2++) {
                            this.f650a.add(jyVar.m2199a());
                        }
                        jyVar.i();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 12:
                    if (m2194a.f24584a == 11) {
                        this.f656f = jyVar.m2199a();
                        continue;
                        jyVar.g();
                    }
                    break;
                case 13:
                    if (m2194a.f24584a == 2) {
                        this.f651a = jyVar.m2203a();
                        b(true);
                        continue;
                        jyVar.g();
                    }
                    break;
            }
            kb.a(jyVar, m2194a.f24584a);
            jyVar.g();
        }
    }

    public void a(boolean z) {
        this.f649a.set(0, z);
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m2098a() {
        return this.f647a != null;
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m2099a(ix ixVar) {
        if (ixVar == null) {
            return false;
        }
        boolean m2098a = m2098a();
        boolean m2098a2 = ixVar.m2098a();
        if ((m2098a || m2098a2) && (!m2098a || !m2098a2 || !this.f647a.m2080a(ixVar.f647a))) {
            return false;
        }
        boolean m2100b = m2100b();
        boolean m2100b2 = ixVar.m2100b();
        if ((m2100b || m2100b2) && (!m2100b || !m2100b2 || !this.f648a.equals(ixVar.f648a))) {
            return false;
        }
        boolean m2101c = m2101c();
        boolean m2101c2 = ixVar.m2101c();
        if ((m2101c || m2101c2) && (!m2101c || !m2101c2 || !this.f652b.equals(ixVar.f652b))) {
            return false;
        }
        boolean d2 = d();
        boolean d3 = ixVar.d();
        if (((d2 || d3) && (!d2 || !d3 || !this.f653c.equals(ixVar.f653c))) || this.f646a != ixVar.f646a) {
            return false;
        }
        boolean f2 = f();
        boolean f3 = ixVar.f();
        if ((f2 || f3) && (!f2 || !f3 || !this.f654d.equals(ixVar.f654d))) {
            return false;
        }
        boolean g2 = g();
        boolean g3 = ixVar.g();
        if ((g2 || g3) && (!g2 || !g3 || !this.f655e.equals(ixVar.f655e))) {
            return false;
        }
        boolean h2 = h();
        boolean h3 = ixVar.h();
        if ((h2 || h3) && (!h2 || !h3 || !this.f650a.equals(ixVar.f650a))) {
            return false;
        }
        boolean i2 = i();
        boolean i3 = ixVar.i();
        if ((i2 || i3) && (!i2 || !i3 || !this.f656f.equals(ixVar.f656f))) {
            return false;
        }
        boolean j2 = j();
        boolean j3 = ixVar.j();
        if (!j2 && !j3) {
            return true;
        }
        return j2 && j3 && this.f651a == ixVar.f651a;
    }

    public String b() {
        return this.f653c;
    }

    @Override // com.xiaomi.push.jn
    public void b(jy jyVar) {
        m2097a();
        jyVar.a(f645a);
        if (this.f647a != null && m2098a()) {
            jyVar.a(f24563a);
            this.f647a.b(jyVar);
            jyVar.b();
        }
        if (this.f648a != null) {
            jyVar.a(b);
            jyVar.a(this.f648a);
            jyVar.b();
        }
        if (this.f652b != null) {
            jyVar.a(c);
            jyVar.a(this.f652b);
            jyVar.b();
        }
        if (this.f653c != null) {
            jyVar.a(d);
            jyVar.a(this.f653c);
            jyVar.b();
        }
        jyVar.a(e);
        jyVar.a(this.f646a);
        jyVar.b();
        if (this.f654d != null && f()) {
            jyVar.a(f);
            jyVar.a(this.f654d);
            jyVar.b();
        }
        if (this.f655e != null && g()) {
            jyVar.a(g);
            jyVar.a(this.f655e);
            jyVar.b();
        }
        if (this.f650a != null && h()) {
            jyVar.a(h);
            jyVar.a(new jw((byte) 11, this.f650a.size()));
            for (String str : this.f650a) {
                jyVar.a(str);
            }
            jyVar.e();
            jyVar.b();
        }
        if (this.f656f != null && i()) {
            jyVar.a(i);
            jyVar.a(this.f656f);
            jyVar.b();
        }
        if (j()) {
            jyVar.a(j);
            jyVar.a(this.f651a);
            jyVar.b();
        }
        jyVar.c();
        jyVar.m2202a();
    }

    public void b(boolean z) {
        this.f649a.set(1, z);
    }

    /* renamed from: b  reason: collision with other method in class */
    public boolean m2100b() {
        return this.f648a != null;
    }

    public String c() {
        return this.f656f;
    }

    /* renamed from: c  reason: collision with other method in class */
    public boolean m2101c() {
        return this.f652b != null;
    }

    public boolean d() {
        return this.f653c != null;
    }

    public boolean e() {
        return this.f649a.get(0);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof ix)) {
            return m2099a((ix) obj);
        }
        return false;
    }

    public boolean f() {
        return this.f654d != null;
    }

    public boolean g() {
        return this.f655e != null;
    }

    public boolean h() {
        return this.f650a != null;
    }

    public int hashCode() {
        return 0;
    }

    public boolean i() {
        return this.f656f != null;
    }

    public boolean j() {
        return this.f649a.get(1);
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("XmPushActionCommandResult(");
        if (m2098a()) {
            sb.append("target:");
            ir irVar = this.f647a;
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
        String str = this.f648a;
        if (str == null) {
            sb.append("null");
        } else {
            sb.append(str);
        }
        sb.append(", ");
        sb.append("appId:");
        String str2 = this.f652b;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(str2);
        }
        sb.append(", ");
        sb.append("cmdName:");
        String str3 = this.f653c;
        if (str3 == null) {
            sb.append("null");
        } else {
            sb.append(str3);
        }
        sb.append(", ");
        sb.append("errorCode:");
        sb.append(this.f646a);
        if (f()) {
            sb.append(", ");
            sb.append("reason:");
            String str4 = this.f654d;
            if (str4 == null) {
                sb.append("null");
            } else {
                sb.append(str4);
            }
        }
        if (g()) {
            sb.append(", ");
            sb.append("packageName:");
            String str5 = this.f655e;
            if (str5 == null) {
                sb.append("null");
            } else {
                sb.append(str5);
            }
        }
        if (h()) {
            sb.append(", ");
            sb.append("cmdArgs:");
            List<String> list = this.f650a;
            if (list == null) {
                sb.append("null");
            } else {
                sb.append(list);
            }
        }
        if (i()) {
            sb.append(", ");
            sb.append("category:");
            String str6 = this.f656f;
            if (str6 == null) {
                sb.append("null");
            } else {
                sb.append(str6);
            }
        }
        if (j()) {
            sb.append(", ");
            sb.append("response2Client:");
            sb.append(this.f651a);
        }
        sb.append(riy.BRACKET_END_STR);
        return sb.toString();
    }
}
