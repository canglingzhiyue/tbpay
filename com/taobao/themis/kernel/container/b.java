package com.taobao.themis.kernel.container;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.falco.FalcoLoadActionPageType;
import com.taobao.themis.kernel.metaInfo.manifest.QueryPass;
import com.taobao.themis.utils.r;
import java.util.List;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.kge;
import tb.riy;

/* loaded from: classes9.dex */
public final class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f22507a;
    private final String b;
    private final String c;
    private final String d;
    private final boolean e;
    private Window f;
    private final QueryPass g;
    private boolean h;
    private String i;
    private List<String> j;
    private JSONObject k;

    static {
        kge.a(493299824);
    }

    public b() {
        this(null, null, null, null, false, null, null, false, null, null, null, 2047, null);
    }

    public static /* synthetic */ b a(b bVar, String str, String str2, String str3, String str4, boolean z, Window window, QueryPass queryPass, boolean z2, String str5, List list, JSONObject jSONObject, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("f4b416ff", new Object[]{bVar, str, str2, str3, str4, new Boolean(z), window, queryPass, new Boolean(z2), str5, list, jSONObject, new Integer(i), obj});
        }
        boolean z3 = z;
        boolean z4 = z2;
        String str6 = (i & 1) != 0 ? bVar.f22507a : str;
        String str7 = (i & 2) != 0 ? bVar.b : str2;
        String str8 = (i & 4) != 0 ? bVar.c : str3;
        String str9 = (i & 8) != 0 ? bVar.d : str4;
        if ((i & 16) != 0) {
            z3 = bVar.e;
        }
        Window window2 = (i & 32) != 0 ? bVar.f : window;
        QueryPass queryPass2 = (i & 64) != 0 ? bVar.g : queryPass;
        if ((i & 128) != 0) {
            z4 = bVar.h;
        }
        return bVar.a(str6, str7, str8, str9, z3, window2, queryPass2, z4, (i & 256) != 0 ? bVar.i : str5, (i & 512) != 0 ? bVar.j : list, (i & 1024) != 0 ? bVar.k : jSONObject);
    }

    public final b a(String str, String str2, String str3, String str4, boolean z, Window window, QueryPass queryPass, boolean z2, String str5, List<String> list, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("3e191c73", new Object[]{this, str, str2, str3, str4, new Boolean(z), window, queryPass, new Boolean(z2), str5, list, jSONObject}) : new b(str, str2, str3, str4, z, window, queryPass, z2, str5, list, jSONObject);
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (!q.a((Object) this.f22507a, (Object) bVar.f22507a) || !q.a((Object) this.b, (Object) bVar.b) || !q.a((Object) this.c, (Object) bVar.c) || !q.a((Object) this.d, (Object) bVar.d) || this.e != bVar.e || !q.a(this.f, bVar.f) || !q.a(this.g, bVar.g) || this.h != bVar.h || !q.a((Object) this.i, (Object) bVar.i) || !q.a(this.j, bVar.j) || !q.a(this.k, bVar.k)) {
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
        String str = this.f22507a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        boolean z = this.e;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = (hashCode4 + i2) * 31;
        Window window = this.f;
        int hashCode5 = (i4 + (window != null ? window.hashCode() : 0)) * 31;
        QueryPass queryPass = this.g;
        int hashCode6 = (hashCode5 + (queryPass != null ? queryPass.hashCode() : 0)) * 31;
        boolean z2 = this.h;
        if (z2) {
            z2 = true;
        }
        int i5 = z2 ? 1 : 0;
        int i6 = z2 ? 1 : 0;
        int i7 = (hashCode6 + i5) * 31;
        String str5 = this.i;
        int hashCode7 = (i7 + (str5 != null ? str5.hashCode() : 0)) * 31;
        List<String> list = this.j;
        int hashCode8 = (hashCode7 + (list != null ? list.hashCode() : 0)) * 31;
        JSONObject jSONObject = this.k;
        if (jSONObject != null) {
            i = jSONObject.hashCode();
        }
        return hashCode8 + i;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "PageModel(id=" + this.f22507a + ", url=" + this.b + ", version=" + this.c + ", renderer=" + this.d + ", external=" + this.e + ", window=" + this.f + ", queryPass=" + this.g + ", autofocus=" + this.h + ", pageType=" + this.i + ", children=" + this.j + ", groupConfig=" + this.k + riy.BRACKET_END_STR;
    }

    public b(String str, String str2, String str3, String str4, boolean z, Window window, QueryPass queryPass, boolean z2, String str5, List<String> list, JSONObject jSONObject) {
        this.f22507a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
        this.f = window;
        this.g = queryPass;
        this.h = z2;
        this.i = str5;
        this.j = list;
        this.k = jSONObject;
    }

    public /* synthetic */ b(String str, String str2, String str3, String str4, boolean z, Window window, QueryPass queryPass, boolean z2, String str5, List list, JSONObject jSONObject, int i, o oVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? false : z, (i & 32) != 0 ? null : window, (i & 64) != 0 ? null : queryPass, (i & 128) == 0 ? z2 : false, (i & 256) != 0 ? null : str5, (i & 512) != 0 ? null : list, (i & 1024) != 0 ? null : jSONObject);
    }

    public final String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f22507a;
    }

    public final String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.b;
    }

    public final String d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[]{this}) : this.c;
    }

    public final String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : this.d;
    }

    public final void a(Window window) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0ea93bf", new Object[]{this, window});
        } else {
            this.f = window;
        }
    }

    public final Window c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Window) ipChange.ipc$dispatch("1152f1c1", new Object[]{this}) : this.f;
    }

    public final QueryPass j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (QueryPass) ipChange.ipc$dispatch("57350adb", new Object[]{this}) : this.g;
    }

    public final boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue() : this.h;
    }

    public final List<String> k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("6ec86895", new Object[]{this}) : this.j;
    }

    public final boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue();
        }
        JSONObject jSONObject = this.k;
        if (jSONObject == null) {
            return false;
        }
        return r.a(jSONObject, "swiperEnable", false);
    }

    public final boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue();
        }
        if (q.a((Object) this.i, (Object) FalcoLoadActionPageType.SWIPER)) {
            List<String> list = this.j;
            if (!(list == null || list.isEmpty())) {
                return true;
            }
        }
        return false;
    }

    public final int i() {
        int i;
        List<String> list;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5dd2863", new Object[]{this})).intValue();
        }
        try {
            jSONObject = this.k;
        } catch (Exception unused) {
        }
        if (jSONObject != null) {
            i = jSONObject.getIntValue("defaultIndex");
            list = this.j;
            if (list == null && i >= 0 && i < list.size()) {
                return i;
            }
            return 0;
        }
        i = 0;
        list = this.j;
        if (list == null) {
        }
        return 0;
    }
}
