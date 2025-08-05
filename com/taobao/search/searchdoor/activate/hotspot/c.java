package com.taobao.search.searchdoor.activate.hotspot;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.kge;
import tb.riy;

/* loaded from: classes7.dex */
public final class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f19349a;
    private final String b;
    private final String c;
    private final String d;
    private final Integer e;
    private final Integer f;
    private final List<a> g;
    private final int h;
    private JSONObject i;
    private boolean j;
    private boolean k;
    private boolean l;
    private boolean m;

    static {
        kge.a(618708154);
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof c) {
                c cVar = (c) obj;
                if (!q.a((Object) this.f19349a, (Object) cVar.f19349a) || !q.a((Object) this.b, (Object) cVar.b) || !q.a((Object) this.c, (Object) cVar.c) || !q.a((Object) this.d, (Object) cVar.d) || !q.a(this.e, cVar.e) || !q.a(this.f, cVar.f) || !q.a(this.g, cVar.g) || this.h != cVar.h || !q.a(this.i, cVar.i) || this.j != cVar.j || this.k != cVar.k || this.l != cVar.l || this.m != cVar.m) {
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
        String str = this.f19349a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        Integer num = this.e;
        int hashCode5 = (hashCode4 + (num != null ? num.hashCode() : 0)) * 31;
        Integer num2 = this.f;
        int hashCode6 = (hashCode5 + (num2 != null ? num2.hashCode() : 0)) * 31;
        List<a> list = this.g;
        int hashCode7 = (((hashCode6 + (list != null ? list.hashCode() : 0)) * 31) + this.h) * 31;
        JSONObject jSONObject = this.i;
        if (jSONObject != null) {
            i = jSONObject.hashCode();
        }
        int i2 = (hashCode7 + i) * 31;
        boolean z = this.j;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = (i2 + i3) * 31;
        boolean z2 = this.k;
        if (z2) {
            z2 = true;
        }
        int i6 = z2 ? 1 : 0;
        int i7 = z2 ? 1 : 0;
        int i8 = (i5 + i6) * 31;
        boolean z3 = this.l;
        if (z3) {
            z3 = true;
        }
        int i9 = z3 ? 1 : 0;
        int i10 = z3 ? 1 : 0;
        int i11 = (i8 + i9) * 31;
        boolean z4 = this.m;
        if (z4) {
            z4 = true;
        }
        int i12 = z4 ? 1 : 0;
        int i13 = z4 ? 1 : 0;
        return i11 + i12;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "HotSpotsTab(tabName=" + this.f19349a + ", tabTitle=" + this.b + ", tabImage=" + this.c + ", tabSelectedImage=" + this.d + ", imageWidth=" + this.e + ", imageHeight=" + this.f + ", itemList=" + this.g + ", deepColorSize=" + this.h + ", tabTrace=" + this.i + ", selected=" + this.j + ", animate=" + this.k + ", exposed=" + this.l + ", tabExposed=" + this.m + riy.BRACKET_END_STR;
    }

    public c(String tabName, String tabTitle, String str, String str2, Integer num, Integer num2, List<a> itemList, int i, JSONObject jSONObject, boolean z, boolean z2, boolean z3, boolean z4) {
        q.c(tabName, "tabName");
        q.c(tabTitle, "tabTitle");
        q.c(itemList, "itemList");
        this.f19349a = tabName;
        this.b = tabTitle;
        this.c = str;
        this.d = str2;
        this.e = num;
        this.f = num2;
        this.g = itemList;
        this.h = i;
        this.i = jSONObject;
        this.j = z;
        this.k = z2;
        this.l = z3;
        this.m = z4;
    }

    public final String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f19349a;
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

    public final Integer f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Integer) ipChange.ipc$dispatch("78dabfd4", new Object[]{this}) : this.f;
    }

    public final List<a> g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("d0410f19", new Object[]{this}) : this.g;
    }

    public final int h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5cf10e2", new Object[]{this})).intValue() : this.h;
    }

    public final JSONObject i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("dde1390", new Object[]{this}) : this.i;
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

    public final void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else {
            this.k = z;
        }
    }

    public final boolean k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[]{this})).booleanValue() : this.k;
    }

    public final void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
        } else {
            this.l = z;
        }
    }

    public final boolean l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[]{this})).booleanValue() : this.l;
    }

    public /* synthetic */ c(String str, String str2, String str3, String str4, Integer num, Integer num2, List list, int i, JSONObject jSONObject, boolean z, boolean z2, boolean z3, boolean z4, int i2, o oVar) {
        this(str, str2, str3, str4, num, num2, list, i, jSONObject, (i2 & 512) != 0 ? false : z, (i2 & 1024) != 0 ? false : z2, (i2 & 2048) != 0 ? false : z3, (i2 & 4096) != 0 ? false : z4);
    }

    public final void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad405d49", new Object[]{this, new Boolean(z)});
        } else {
            this.m = z;
        }
    }

    public final boolean m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6158678", new Object[]{this})).booleanValue() : this.m;
    }
}
