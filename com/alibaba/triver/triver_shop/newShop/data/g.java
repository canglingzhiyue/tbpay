package com.alibaba.triver.triver_shop.newShop.data;

import android.content.Context;
import android.net.Uri;
import com.alibaba.ariver.kernel.RVStartParams;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.newShop.NativeShopActivity;
import com.alibaba.triver.triver_shop.newShop.ext.o;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.kge;

/* loaded from: classes3.dex */
public final class g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final JSONObject f3833a;
    private final d b;
    private final int c;
    private final int d;
    private String e;
    private String f;
    private String g;
    private Map<String, ? extends Object> h;
    private String i;
    private JSONArray j;
    private com.alibaba.triver.triver_shop.newShop.view.component.f k;

    static {
        kge.a(1157141578);
    }

    public g(JSONObject jSONObject, d dVar, int i, int i2) {
        this.f3833a = jSONObject;
        this.b = dVar;
        this.c = i;
        this.d = i2;
        r();
    }

    public final int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : this.c;
    }

    public final int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : this.d;
    }

    public final void a(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad9ea590", new Object[]{this, jSONArray});
        } else {
            this.j = jSONArray;
        }
    }

    public final JSONArray c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONArray) ipChange.ipc$dispatch("c49d9194", new Object[]{this}) : this.j;
    }

    public final void a(com.alibaba.triver.triver_shop.newShop.view.component.f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("400fdeee", new Object[]{this, fVar});
        } else {
            this.k = fVar;
        }
    }

    public final com.alibaba.triver.triver_shop.newShop.view.component.f y() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.alibaba.triver.triver_shop.newShop.view.component.f) ipChange.ipc$dispatch("1b4d7186", new Object[]{this}) : this.k;
    }

    private final void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65bfbf9", new Object[]{this});
            return;
        }
        JSONObject jSONObject = this.f3833a;
        if (jSONObject == null) {
            return;
        }
        this.h = jSONObject.getJSONObject("payload").getInnerMap();
        this.j = this.f3833a.getJSONArray("prefetchMtopInfoList");
        this.e = a("type");
        this.f = a("utArg1");
        this.g = a("name");
    }

    private final String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        JSONObject jSONObject = this.f3833a;
        Object obj = jSONObject == null ? null : jSONObject.get(str);
        if (!(obj instanceof String)) {
            return null;
        }
        return (String) obj;
    }

    public final boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
        }
        JSONObject jSONObject = this.f3833a;
        return q.a((Object) com.taobao.android.weex_framework.util.a.ATOM_EXT_black, (Object) (jSONObject == null ? null : jSONObject.getString("backgroundColor")));
    }

    public final boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue();
        }
        JSONObject jSONObject = this.f3833a;
        return q.a((Object) "true", (Object) (jSONObject == null ? null : jSONObject.getString("fullScreen")));
    }

    public final String f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("50938a53", new Object[]{this}) : this.g;
    }

    public final Map<String, Object> s() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("160f882f", new Object[]{this}) : this.h;
    }

    public final d g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("174d9eff", new Object[]{this}) : this.b;
    }

    public final String h() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5d9eff91", new Object[]{this});
        }
        d dVar = this.b;
        Object h = dVar == null ? null : dVar.h(this.g);
        if (h == null && (str = this.i) != null) {
            return str;
        }
        Map<String, ? extends Object> map = this.h;
        Object obj = map == null ? null : map.get("source");
        if (!(obj instanceof JSONObject)) {
            return null;
        }
        String b = b(((JSONObject) obj).getString("url"));
        if (h != null) {
            return b;
        }
        this.i = b;
        return this.i;
    }

    public final JSONObject i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("dde1390", new Object[]{this});
        }
        Map<String, ? extends Object> map = this.h;
        Object obj = map == null ? null : map.get("source");
        if (obj instanceof JSONObject) {
            return (JSONObject) obj;
        }
        return null;
    }

    public final JSONObject j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("2185e711", new Object[]{this});
        }
        Map<String, ? extends Object> map = this.h;
        Object obj = map == null ? null : map.get("source");
        if (obj instanceof JSONObject) {
            return ((JSONObject) obj).getJSONObject("shopLive2023");
        }
        return null;
    }

    public final String k() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f1302f6e", new Object[]{this});
        }
        JSONObject j = j();
        if (j != null && (jSONObject = j.getJSONObject("queryParam")) != null) {
            return jSONObject.getString("accountId");
        }
        return null;
    }

    public final JSONArray t() {
        Object obj;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("7cd04fe3", new Object[]{this});
        }
        Map<String, Object> s = s();
        if (s != null && (obj = s.get("source")) != null && (obj instanceof JSONObject) && (jSONObject = ((JSONObject) obj).getJSONObject("data")) != null) {
            return jSONObject.getJSONArray("categoryList");
        }
        return null;
    }

    public final String x() {
        Object obj;
        JSONObject jSONObject;
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c5faa981", new Object[]{this});
        }
        Map<String, Object> s = s();
        return (s == null || (obj = s.get("source")) == null || !(obj instanceof JSONObject) || (jSONObject = ((JSONObject) obj).getJSONObject("data")) == null || (string = jSONObject.getString("defaultStatus")) == null) ? "open" : string;
    }

    public final JSONObject u() {
        Object obj;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("f9bbfd9c", new Object[]{this});
        }
        Map<String, Object> s = s();
        if (s != null && (obj = s.get("source")) != null && (obj instanceof JSONObject) && (jSONObject = ((JSONObject) obj).getJSONObject("data")) != null) {
            return jSONObject.getJSONObject("openIcon");
        }
        return null;
    }

    public final JSONObject v() {
        Object obj;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("d63d11d", new Object[]{this});
        }
        Map<String, Object> s = s();
        if (s != null && (obj = s.get("source")) != null && (obj instanceof JSONObject) && (jSONObject = ((JSONObject) obj).getJSONObject("data")) != null) {
            return jSONObject.getJSONObject("closeIcon");
        }
        return null;
    }

    public final String l() {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("77b5ea0d", new Object[]{this});
        }
        Map<String, ? extends Object> map = this.h;
        if (map != null && (obj = map.get("source")) != null && (obj instanceof JSONObject)) {
            return ((JSONObject) obj).getString("downgradeUrl");
        }
        return null;
    }

    public final NativeShopRenderContainerType m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (NativeShopRenderContainerType) ipChange.ipc$dispatch("9f2e0b11", new Object[]{this}) : NativeShopRenderContainerType.Companion.a(this.e, h());
    }

    private final String b(String str) {
        Context am;
        JSONObject V;
        JSONObject V2;
        JSONObject V3;
        StringBuilder sb;
        String bool;
        Uri Y;
        String queryParameter;
        Object obj;
        JSONObject jSONObject;
        Object h;
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{this, str});
        }
        Uri c = com.alibaba.triver.triver_shop.newShop.ext.b.c(str);
        if (c == null) {
            return null;
        }
        Map<String, String> a2 = com.alibaba.triver.triver_shop.newShop.ext.b.a(c);
        Uri.Builder builder = c.buildUpon();
        d dVar = this.b;
        int f = o.f(Integer.valueOf(((dVar == null || (am = dVar.am()) == null) ? 0 : o.a(am)) + o.a((Number) 55)));
        d dVar2 = this.b;
        String d = dVar2 == null ? null : dVar2.d("weexShopToken");
        if (d == null) {
            d dVar3 = this.b;
            d = dVar3 == null ? null : dVar3.T();
        }
        a2.put("weexShopToken", d);
        d dVar4 = this.b;
        a2.put("shopId", dVar4 == null ? null : dVar4.T());
        d dVar5 = this.b;
        a2.put("sellerId", dVar5 == null ? null : dVar5.U());
        a2.put("isNewStyle", "true");
        a2.put("isNativeContainer", "true");
        a2.put("inMiniappShop", "true");
        a2.put("inMiniappShopVersion", "2.5");
        d dVar6 = this.b;
        a2.put("abBucket", (dVar6 == null || (V = dVar6.V()) == null) ? null : V.getString("abBucket"));
        d dVar7 = this.b;
        a2.put("bucket", (dVar7 == null || (V2 = dVar7.V()) == null) ? null : V2.getString("abBucket"));
        d dVar8 = this.b;
        a2.put("inshopBuckets", (dVar8 == null || (V3 = dVar8.V()) == null) ? null : V3.getString("inshopBuckets"));
        if (this.c == 1) {
            sb = new StringBuilder();
            sb.append(this.c);
            sb.append(".0.");
            sb.append(this.d);
        } else {
            sb = new StringBuilder();
            sb.append(this.c);
            sb.append('.');
            sb.append(this.d);
            sb.append(".0");
        }
        a2.put("weexShopTabId", sb.toString());
        a2.put("weexShopTransparentBG", "true");
        String str2 = "0,0";
        a2.put("paddingTopAndBottom", str2);
        d dVar9 = this.b;
        if (dVar9 != null && dVar9.s()) {
            a2.put("is2022Style", "true");
            if (e()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.b.w());
                sb2.append(',');
                sb2.append(this.b.v());
                a2.put("paddingTopAndBottom", sb2.toString());
            } else {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(o.f((Number) 12));
                sb3.append(',');
                com.alibaba.triver.triver_shop.newShop.view.component.f fVar = this.k;
                Integer valueOf = fVar == null ? null : Integer.valueOf(fVar.a());
                sb3.append(valueOf == null ? this.b.v() : valueOf.intValue());
                a2.put("paddingTopAndBottom", sb3.toString());
            }
        }
        d dVar10 = this.b;
        if (dVar10 != null && dVar10.t()) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(this.b.w());
            sb4.append(',');
            com.alibaba.triver.triver_shop.newShop.view.component.f fVar2 = this.k;
            Integer valueOf2 = fVar2 == null ? null : Integer.valueOf(fVar2.a());
            sb4.append(valueOf2 == null ? this.b.v() : valueOf2.intValue());
            a2.put("paddingTopAndBottom", sb4.toString());
        }
        d dVar11 = this.b;
        if (dVar11 != null && (h = dVar11.h(this.g)) != null) {
            if (h instanceof JSONObject) {
                jSONObject2 = (JSONObject) h;
            } else if (h instanceof String) {
                jSONObject2 = com.alibaba.triver.triver_shop.newShop.ext.d.a((String) h);
            } else {
                jSONObject2 = null;
            }
            if (jSONObject2 != null) {
                for (Map.Entry<String, Object> entry : jSONObject2.entrySet()) {
                    String key = entry.getKey();
                    Object value = entry.getValue();
                    a2.put(key, value == null ? null : value.toString());
                }
                t tVar = t.INSTANCE;
            }
        }
        String str3 = "false";
        if (n()) {
            a2.put("weexShopTransparentBG", str3);
            a2.put("ignoreShopHeadEvent", "true");
            a2.put("bottomPadding", "100");
        }
        d dVar12 = this.b;
        boolean ao = dVar12 == null ? false : dVar12.ao();
        d dVar13 = this.b;
        boolean ac = dVar13 == null ? false : dVar13.ac();
        d dVar14 = this.b;
        boolean s = dVar14 == null ? false : dVar14.s();
        if (ac && !ao && !s && o()) {
            a2.put("fullScreenStyle", "true");
        }
        d dVar15 = this.b;
        boolean z = dVar15 != null && dVar15.an();
        boolean o = o();
        boolean z2 = o && ac;
        if (NativeShopRenderContainerType.Companion.a(this.e)) {
            Map<String, ? extends Object> map = this.h;
            if (map != null && (obj = map.get("source")) != null) {
                if ((obj instanceof JSONObject) && (jSONObject = ((JSONObject) obj).getJSONObject("query")) != null) {
                    for (Map.Entry<String, Object> entry2 : jSONObject.entrySet()) {
                        String key2 = entry2.getKey();
                        Object value2 = entry2.getValue();
                        a2.put(key2, value2 == null ? null : value2.toString());
                    }
                    t tVar2 = t.INSTANCE;
                    t tVar3 = t.INSTANCE;
                }
                t tVar4 = t.INSTANCE;
            }
            a2.put(RVStartParams.KEY_DISABLE_LOADING_VIEW, "true");
            a2.put("disableAppInfoCache", "true");
            d dVar16 = this.b;
            if (dVar16 != null && dVar16.s()) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(o.c((Number) 12));
                sb5.append(',');
                sb5.append(this.b.v());
                str2 = sb5.toString();
            } else if (z && !z2 && !o) {
                str2 = f + ",0";
            }
            a2.put("paddingTopAndBottom", str2);
        } else if (z) {
            a2.put("paddingTopAndBottom", f + ",0");
        }
        d dVar17 = this.b;
        a2.put("identityCode", dVar17 == null ? null : dVar17.ba());
        d dVar18 = this.b;
        if (dVar18 != null && (Y = dVar18.Y()) != null) {
            for (String str4 : Y.getQueryParameterNames()) {
                if (!q.a((Object) "page", (Object) str4) && !q.a((Object) "templateId", (Object) str4) && (queryParameter = Y.getQueryParameter(str4)) != null) {
                    a2.put(str4, queryParameter);
                }
            }
            t tVar5 = t.INSTANCE;
            t tVar6 = t.INSTANCE;
        }
        d dVar19 = this.b;
        if (dVar19 != null && (bool = Boolean.valueOf(dVar19.bk()).toString()) != null) {
            str3 = bool;
        }
        a2.put("enableShopAsyncBridge", str3);
        q.b(builder, "builder");
        com.alibaba.triver.triver_shop.newShop.ext.b.a(builder, a2);
        return builder.build().toString();
    }

    public final boolean n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6239df9", new Object[]{this})).booleanValue() : q.a((Object) "allitems", (Object) this.g);
    }

    public final boolean o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("631b57a", new Object[]{this})).booleanValue() : q.a((Object) com.alibaba.triver.triver_shop.newShop.ext.g.KEY_SHOP_INDEX, (Object) this.g);
    }

    public final boolean p() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("63fccfb", new Object[]{this})).booleanValue() : q.a((Object) "member", (Object) this.g);
    }

    public final boolean w() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6a27182", new Object[]{this})).booleanValue() : q.a((Object) "category", (Object) this.g);
    }

    public final boolean a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{this, context})).booleanValue();
        }
        q.d(context, "context");
        if (!(context instanceof NativeShopActivity)) {
            return false;
        }
        return q.a((Object) this.g, (Object) ((NativeShopActivity) context).a());
    }

    public final boolean q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("64de47c", new Object[]{this})).booleanValue();
        }
        String queryParameter = Uri.parse(h()).getQueryParameter("shopHeaderNeedScrollMask");
        if (queryParameter != null && !NativeShopRenderContainerType.Companion.a(this.e)) {
            return q.a((Object) "true", (Object) queryParameter);
        }
        return true;
    }
}
