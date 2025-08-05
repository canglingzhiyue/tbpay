package com.taobao.search.m3.discount;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Set;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.kge;
import tb.riy;

/* loaded from: classes7.dex */
public final class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final int f19078a;
    private final int b;
    private final String c;
    private final String d;
    private final Integer e;
    private final Set<String> f;
    private String g;
    private String h;
    private String i;
    private boolean j;

    static {
        kge.a(-1262069304);
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f19078a != aVar.f19078a || this.b != aVar.b || !q.a((Object) this.c, (Object) aVar.c) || !q.a((Object) this.d, (Object) aVar.d) || !q.a(this.e, aVar.e) || !q.a(this.f, aVar.f) || !q.a((Object) this.g, (Object) aVar.g) || !q.a((Object) this.h, (Object) aVar.h) || !q.a((Object) this.i, (Object) aVar.i) || this.j != aVar.j) {
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
        int i2 = ((this.f19078a * 31) + this.b) * 31;
        String str = this.c;
        int hashCode = (i2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.d;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Integer num = this.e;
        int hashCode3 = (hashCode2 + (num != null ? num.hashCode() : 0)) * 31;
        Set<String> set = this.f;
        int hashCode4 = (hashCode3 + (set != null ? set.hashCode() : 0)) * 31;
        String str3 = this.g;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.h;
        int hashCode6 = (hashCode5 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.i;
        if (str5 != null) {
            i = str5.hashCode();
        }
        int i3 = (hashCode6 + i) * 31;
        boolean z = this.j;
        if (z) {
            z = true;
        }
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        return i3 + i4;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "DiscountInfo(width=" + this.f19078a + ", height=" + this.b + ", iconUrl=" + this.c + ", text=" + this.d + ", textColor=" + this.e + ", prizeIdSet=" + this.f + ", receivedText=" + this.g + ", receivedDefaultText=" + this.h + ", showText=" + this.i + ", refresh=" + this.j + riy.BRACKET_END_STR;
    }

    public a(int i, int i2, String str, String str2, Integer num, Set<String> set, String str3, String str4, String str5, boolean z) {
        this.f19078a = i;
        this.b = i2;
        this.c = str;
        this.d = str2;
        this.e = num;
        this.f = set;
        this.g = str3;
        this.h = str4;
        this.i = str5;
        this.j = z;
    }

    public final int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : this.f19078a;
    }

    public final int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : this.b;
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

    public final Set<String> f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Set) ipChange.ipc$dispatch("a46b5b1c", new Object[]{this}) : this.f;
    }

    public final String g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d71944f2", new Object[]{this}) : this.g;
    }

    public final String h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5d9eff91", new Object[]{this}) : this.h;
    }

    public final void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.i = str;
        }
    }

    public final String i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e424ba30", new Object[]{this}) : this.i;
    }

    public /* synthetic */ a(int i, int i2, String str, String str2, Integer num, Set set, String str3, String str4, String str5, boolean z, int i3, o oVar) {
        this(i, i2, str, str2, num, set, str3, str4, (i3 & 256) != 0 ? str2 : str5, (i3 & 512) != 0 ? true : z);
    }

    public final void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.j = z;
        }
    }

    public final boolean j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[]{this})).booleanValue() : this.j;
    }
}
