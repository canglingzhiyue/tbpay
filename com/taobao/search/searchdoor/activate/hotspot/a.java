package com.taobao.search.searchdoor.activate.hotspot;

import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.kge;
import tb.riy;

/* loaded from: classes7.dex */
public final class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f19346a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;
    private final JSONArray h;
    private final String i;
    private final int j;
    private final int k;
    private boolean l;

    static {
        kge.a(1999774350);
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (!q.a((Object) this.f19346a, (Object) aVar.f19346a) || !q.a((Object) this.b, (Object) aVar.b) || !q.a((Object) this.c, (Object) aVar.c) || !q.a((Object) this.d, (Object) aVar.d) || !q.a((Object) this.e, (Object) aVar.e) || !q.a((Object) this.f, (Object) aVar.f) || !q.a((Object) this.g, (Object) aVar.g) || !q.a(this.h, aVar.h) || !q.a((Object) this.i, (Object) aVar.i) || this.j != aVar.j || this.k != aVar.k || this.l != aVar.l) {
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
        String str = this.f19346a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.e;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.f;
        int hashCode6 = (hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.g;
        int hashCode7 = (hashCode6 + (str7 != null ? str7.hashCode() : 0)) * 31;
        JSONArray jSONArray = this.h;
        int hashCode8 = (hashCode7 + (jSONArray != null ? jSONArray.hashCode() : 0)) * 31;
        String str8 = this.i;
        if (str8 != null) {
            i = str8.hashCode();
        }
        int i2 = (((((hashCode8 + i) * 31) + this.j) * 31) + this.k) * 31;
        boolean z = this.l;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        return i2 + i3;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "HotSpotsItem(title=" + this.f19346a + ", tagIcon=" + this.b + ", searchNum=" + this.c + ", indexIcon=" + this.d + ", markIcon=" + this.e + ", arrowIcon=" + this.f + ", itemJumpUrl=" + this.g + ", searchParams=" + this.h + ", searchText=" + this.i + ", tagWidth=" + this.j + ", tagHeight=" + this.k + ", exposed=" + this.l + riy.BRACKET_END_STR;
    }

    public a(String title, String str, String searchNum, String str2, String str3, String str4, String str5, JSONArray jSONArray, String str6, int i, int i2, boolean z) {
        q.c(title, "title");
        q.c(searchNum, "searchNum");
        this.f19346a = title;
        this.b = str;
        this.c = searchNum;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = jSONArray;
        this.i = str6;
        this.j = i;
        this.k = i2;
        this.l = z;
    }

    public final String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f19346a;
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

    public final String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : this.f;
    }

    public final String f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("50938a53", new Object[]{this}) : this.g;
    }

    public final JSONArray g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONArray) ipChange.ipc$dispatch("959a7310", new Object[]{this}) : this.h;
    }

    public final String h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5d9eff91", new Object[]{this}) : this.i;
    }

    public final int i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5dd2863", new Object[]{this})).intValue() : this.j;
    }

    public final int j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5eb3fe4", new Object[]{this})).intValue() : this.k;
    }

    public /* synthetic */ a(String str, String str2, String str3, String str4, String str5, String str6, String str7, JSONArray jSONArray, String str8, int i, int i2, boolean z, int i3, o oVar) {
        this(str, str2, str3, str4, str5, str6, str7, jSONArray, str8, i, i2, (i3 & 2048) != 0 ? false : z);
    }

    public final void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.l = z;
        }
    }

    public final boolean k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[]{this})).booleanValue() : this.l;
    }
}
