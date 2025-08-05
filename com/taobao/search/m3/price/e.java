package com.taobao.search.m3.price;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.q;
import tb.kge;
import tb.riy;

/* loaded from: classes7.dex */
public final class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final d f19128a;
    private final String b;
    private final String c;
    private final String d;
    private final Integer e;
    private final String f;
    private final Integer g;
    private final String h;
    private final boolean i;
    private final String j;
    private final String k;
    private final String l;
    private final String m;
    private final String n;
    private final Integer o;

    static {
        kge.a(-645307780);
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof e) {
                e eVar = (e) obj;
                if (!q.a(this.f19128a, eVar.f19128a) || !q.a((Object) this.b, (Object) eVar.b) || !q.a((Object) this.c, (Object) eVar.c) || !q.a((Object) this.d, (Object) eVar.d) || !q.a(this.e, eVar.e) || !q.a((Object) this.f, (Object) eVar.f) || !q.a(this.g, eVar.g) || !q.a((Object) this.h, (Object) eVar.h) || this.i != eVar.i || !q.a((Object) this.j, (Object) eVar.j) || !q.a((Object) this.k, (Object) eVar.k) || !q.a((Object) this.l, (Object) eVar.l) || !q.a((Object) this.m, (Object) eVar.m) || !q.a((Object) this.n, (Object) eVar.n) || !q.a(this.o, eVar.o)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        d dVar = this.f19128a;
        int hashCode = (dVar != null ? dVar.hashCode() : 0) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.d;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Integer num = this.e;
        int hashCode5 = (hashCode4 + (num != null ? num.hashCode() : 0)) * 31;
        String str4 = this.f;
        int hashCode6 = (hashCode5 + (str4 != null ? str4.hashCode() : 0)) * 31;
        Integer num2 = this.g;
        int hashCode7 = (hashCode6 + (num2 != null ? num2.hashCode() : 0)) * 31;
        String str5 = this.h;
        int hashCode8 = (hashCode7 + (str5 != null ? str5.hashCode() : 0)) * 31;
        boolean z = this.i;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = (hashCode8 + i2) * 31;
        String str6 = this.j;
        int hashCode9 = (i4 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.k;
        int hashCode10 = (hashCode9 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.l;
        int hashCode11 = (hashCode10 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.m;
        int hashCode12 = (hashCode11 + (str9 != null ? str9.hashCode() : 0)) * 31;
        String str10 = this.n;
        int hashCode13 = (hashCode12 + (str10 != null ? str10.hashCode() : 0)) * 31;
        Integer num3 = this.o;
        if (num3 != null) {
            i = num3.hashCode();
        }
        return hashCode13 + i;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "PriceInfo(icon=" + this.f19128a + ", preText=" + this.b + ", price=" + this.c + ", suffixText=" + this.d + ", suffixColor=" + this.e + ", subText=" + this.f + ", subTextColor=" + this.g + ", originPrice=" + this.h + ", originPriceStrikeThrough=" + this.i + ", sold=" + this.j + ", comment=" + this.k + ", location=" + this.l + ", desc=" + this.m + ", priceBottomText=" + this.n + ", priceBottomColor=" + this.o + riy.BRACKET_END_STR;
    }

    public e(d dVar, String str, String str2, String str3, Integer num, String str4, Integer num2, String str5, boolean z, String str6, String str7, String str8, String desc, String str9, Integer num3) {
        q.c(desc, "desc");
        this.f19128a = dVar;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = num;
        this.f = str4;
        this.g = num2;
        this.h = str5;
        this.i = z;
        this.j = str6;
        this.k = str7;
        this.l = str8;
        this.m = desc;
        this.n = str9;
        this.o = num3;
    }

    public final d a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("7f90b54", new Object[]{this}) : this.f19128a;
    }

    public final String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.b;
    }

    public final String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : this.c;
    }

    public final String d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[]{this}) : this.d;
    }

    public final Integer e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Integer) ipChange.ipc$dispatch("2ea92693", new Object[]{this}) : this.e;
    }

    public final String f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("50938a53", new Object[]{this}) : this.f;
    }

    public final Integer g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Integer) ipChange.ipc$dispatch("c30c5915", new Object[]{this}) : this.g;
    }

    public final String h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5d9eff91", new Object[]{this}) : this.h;
    }

    public final boolean i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[]{this})).booleanValue() : this.i;
    }

    public final String j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6aaa74cf", new Object[]{this}) : this.j;
    }

    public final String k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f1302f6e", new Object[]{this}) : this.k;
    }

    public final String l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("77b5ea0d", new Object[]{this}) : this.l;
    }

    public final String m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("fe3ba4ac", new Object[]{this}) : this.m;
    }

    public final String n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("84c15f4b", new Object[]{this}) : this.n;
    }

    public final Integer o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Integer) ipChange.ipc$dispatch("1499231d", new Object[]{this}) : this.o;
    }
}
