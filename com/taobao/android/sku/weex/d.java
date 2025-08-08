package com.taobao.android.sku.weex;

import android.content.Intent;
import android.graphics.Rect;
import android.net.Uri;
import android.support.v4.content.LocalBroadcastManager;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.intelligentdecision.model.IDecisionResult;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.AliNavServiceInterface;
import com.taobao.android.sku.WeexCore;
import com.taobao.android.sku.performance.model.PerformanceFlowModel;
import com.taobao.android.sku.utils.m;
import com.taobao.android.sku.utils.o;
import com.taobao.android.sku.utils.q;
import com.taobao.android.t;
import java.util.AbstractMap;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.global.SDKUtils;
import tb.fgl;
import tb.ixt;
import tb.iyf;
import tb.iyh;
import tb.kge;
import tb.mrm;
import tb.pqe;

/* loaded from: classes6.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    private com.taobao.android.sku.c f15230a;
    private WeexCore b;
    private WeexWrapper c;
    private volatile boolean e;
    private int j;
    private a d = new a();
    private List<Integer> f = new ArrayList();
    private Map<String, com.taobao.android.sku.weex.a> g = new HashMap();
    private Map<String, com.taobao.android.sku.weex.a> h = new HashMap();
    private Map<String, Map.Entry<com.taobao.android.sku.weex.a, com.taobao.android.sku.weex.a>> i = new HashMap();

    static {
        kge.a(-1633590547);
    }

    public static /* synthetic */ void a(com.taobao.android.sku.weex.a aVar, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ee995e4", new Object[]{aVar, map});
        } else {
            b(aVar, map);
        }
    }

    public static /* synthetic */ WeexWrapper c(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WeexWrapper) ipChange.ipc$dispatch("8cb9684", new Object[]{dVar}) : dVar.c;
    }

    public static /* synthetic */ boolean d(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("154bb9bf", new Object[]{dVar})).booleanValue() : dVar.e;
    }

    public d(com.taobao.android.sku.c cVar, WeexCore weexCore, WeexWrapper weexWrapper, int i) {
        this.f15230a = cVar;
        this.b = weexCore;
        this.c = weexWrapper;
        this.j = i;
    }

    private Map<String, Object> h(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("fba60a6b", new Object[]{this, map});
        }
        if (map == null) {
            return new HashMap<String, Object>() { // from class: com.taobao.android.sku.weex.WeexMessageHandler$1
                {
                    d dVar = d.this;
                    put("_sku_token_", d.$ipChange.p());
                }
            };
        }
        map.put("_sku_token_", this.f15230a.p());
        return map;
    }

    private Map<String, Object> b(Map<String, Object> map, final String str, final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("ef202203", new Object[]{this, map, str, new Boolean(z)});
        }
        if (map == null) {
            return new HashMap<String, Object>() { // from class: com.taobao.android.sku.weex.WeexMessageHandler$2
                {
                    d.this = this;
                    put("bottom_mode", str);
                    put("nativeShowSku", Boolean.valueOf(z));
                }
            };
        }
        map.put("bottom_mode", str);
        map.put("nativeShowSku", Boolean.valueOf(z));
        return map;
    }

    private Map<String, Object> b(Map<String, Object> map, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("b3a04afb", new Object[]{this, map, str});
        }
        if (map == null) {
            return new HashMap<String, Object>() { // from class: com.taobao.android.sku.weex.WeexMessageHandler$3
                {
                    d.this = this;
                    put("bottom_mode", str);
                }
            };
        }
        map.put("bottom_mode", str);
        return map;
    }

    public boolean a(Map<String, Object> map, String str, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1ec6b911", new Object[]{this, map, str, new Boolean(z)})).booleanValue() : a("onSkuShow", b(h(map), str, z));
    }

    public boolean a(Map<String, Object> map, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d7b3ceab", new Object[]{this, map, str})).booleanValue() : a("onPreSkuShow", b(h(map), str));
    }

    public boolean b(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("41e3e880", new Object[]{this, map})).booleanValue() : a("onSkuClose", h(map));
    }

    public boolean c(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2985bedf", new Object[]{this, map})).booleanValue() : a("onSelectSku", h(map));
    }

    public boolean d(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1127953e", new Object[]{this, map})).booleanValue() : a("onDarkCurtainClosed", h(map));
    }

    public boolean e(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f8c96b9d", new Object[]{this, map})).booleanValue() : a("onSelectPVs", h(map));
    }

    public boolean f(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e06b41fc", new Object[]{this, map})).booleanValue() : a("onSelectSkuId", h(map));
    }

    public boolean g(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c80d185b", new Object[]{this, map})).booleanValue() : a("onSKUAction", h(map));
    }

    public boolean a(String str, Map<String, Object> map, com.taobao.android.sku.weex.a aVar, com.taobao.android.sku.weex.a aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("423018b7", new Object[]{this, str, map, aVar, aVar2})).booleanValue();
        }
        if ("onCloseSku".equals(str)) {
            return a(aVar, aVar2);
        }
        if ("getDetail".equals(str)) {
            return b(aVar, aVar2);
        }
        if ("getNodeData".equals(str)) {
            return b(map, aVar, aVar2);
        }
        if ("updateDetail".equals(str)) {
            return c(map, aVar, aVar2);
        }
        if ("downgrade2Native".equals(str)) {
            return f(map, aVar, aVar2);
        }
        if ("openServicePage".equals(str)) {
            return g(map, aVar, aVar2);
        }
        if ("openSizeChartPage".equals(str)) {
            return h(map, aVar, aVar2);
        }
        if ("openDarkCurtain".equals(str)) {
            return i(map, aVar, aVar2);
        }
        if ("onNewBuyUMAlarm".equals(str)) {
            return l(map, aVar, aVar2);
        }
        if ("onNewBuyTlog".equals(str)) {
            return m(map, aVar, aVar2);
        }
        if ("onSkuV3UMAlarm".equals(str)) {
            return j(map, aVar, aVar2);
        }
        if ("onSkuV3Tlog".equals(str)) {
            return k(map, aVar, aVar2);
        }
        if ("getInputData".equals(str)) {
            return n(map, aVar, aVar2);
        }
        if ("refreshDetail".equals(str)) {
            return o(map, aVar, aVar2);
        }
        if ("syncSelectedProps".equals(str)) {
            return p(map, aVar, aVar2);
        }
        if ("getBottomMode".equals(str)) {
            return q(map, aVar, aVar2);
        }
        if ("skuCallback".equals(str)) {
            return r(map, aVar, aVar2);
        }
        if ("getClientUTParams".equals(str)) {
            return s(map, aVar, aVar2);
        }
        if ("changeDialogHeight".equals(str)) {
            return t(map, aVar, aVar2);
        }
        if ("getTimeStamp".equals(str)) {
            return u(map, aVar, aVar2);
        }
        if ("dismissLoading".equals(str)) {
            return v(map, aVar, aVar2);
        }
        if ("getExtInputForAddbag".equals(str)) {
            return w(map, aVar, aVar2);
        }
        if ("saveData".equals(str)) {
            return x(map, aVar, aVar2);
        }
        if ("getData".equals(str)) {
            return y(map, aVar, aVar2);
        }
        if ("registerObserver".equals(str)) {
            return z(map, aVar, aVar2);
        }
        if ("unregisterObserver".equals(str)) {
            return A(map, aVar, aVar2);
        }
        if ("onSKUActionCallback".equals(str)) {
            return a(map, aVar, aVar2);
        }
        if ("setPageVisible".equals(str)) {
            return B(map, aVar, aVar2);
        }
        a(aVar2, "errorMsg", "not found " + str + " handler");
        return false;
    }

    private boolean B(Map<String, Object> map, com.taobao.android.sku.weex.a aVar, com.taobao.android.sku.weex.a aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bb295680", new Object[]{this, map, aVar, aVar2})).booleanValue();
        }
        if (this.b.k()) {
            b(aVar2, new HashMap<String, Object>() { // from class: com.taobao.android.sku.weex.WeexMessageHandler$4
                {
                    d.this = this;
                    put("errorMsg", "weex already downgrade");
                }
            });
            return false;
        }
        this.b.u();
        a(aVar, "visible", "true");
        o.d(o.UM_SKU_SILENT_WEEX_RESET);
        this.f15230a.a(-700006, "");
        return true;
    }

    private boolean a(Map<String, Object> map, com.taobao.android.sku.weex.a aVar, com.taobao.android.sku.weex.a aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("62a53041", new Object[]{this, map, aVar, aVar2})).booleanValue();
        }
        if (this.b.k()) {
            b(aVar2, new HashMap<String, Object>() { // from class: com.taobao.android.sku.weex.WeexMessageHandler$5
                {
                    d.this = this;
                    put("errorMsg", "weex already downgrade");
                }
            });
            return false;
        }
        final JSONObject jSONObject = new JSONObject();
        if (map != null && !map.isEmpty()) {
            jSONObject.putAll(map);
        }
        this.f15230a.c(new JSONObject() { // from class: com.taobao.android.sku.weex.WeexMessageHandler$6
            {
                put("action", "dark_curtain_on_action_callback");
                put("params", (Object) jSONObject);
            }
        });
        a(aVar, "send", "true");
        return true;
    }

    private static void b(com.taobao.android.sku.weex.a aVar, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c274b3a5", new Object[]{aVar, map});
        } else if (map == null || aVar == null) {
        } else {
            aVar.a(map);
        }
    }

    private static void a(com.taobao.android.sku.weex.a aVar, final String str, final String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f363fc15", new Object[]{aVar, str, str2});
        } else if (str == null || aVar == null) {
        } else {
            aVar.a(new HashMap<String, Object>() { // from class: com.taobao.android.sku.weex.WeexMessageHandler$7
                {
                    put(str, str2);
                }
            });
        }
    }

    private static void b(com.taobao.android.sku.weex.a aVar, final String str, final String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75aeb0f4", new Object[]{aVar, str, str2});
        } else if (str == null || aVar == null) {
        } else {
            aVar.b(new HashMap<String, Object>() { // from class: com.taobao.android.sku.weex.WeexMessageHandler$8
                {
                    put(str, str2);
                }
            });
        }
    }

    private boolean a(com.taobao.android.sku.weex.a aVar, com.taobao.android.sku.weex.a aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4fd9c94c", new Object[]{this, aVar, aVar2})).booleanValue();
        }
        this.b.l();
        a(aVar, IDecisionResult.STATE_CLOSED, "true");
        return true;
    }

    private boolean b(com.taobao.android.sku.weex.a aVar, com.taobao.android.sku.weex.a aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2b9b450d", new Object[]{this, aVar, aVar2})).booleanValue();
        }
        JSONObject h = this.f15230a.g().h();
        if (h == null || h.isEmpty()) {
            a(aVar2, "errorMsg", "mtop data is empty");
            return false;
        }
        a(aVar, "mtopStr", h.toJSONString());
        return true;
    }

    private boolean b(Map<String, Object> map, com.taobao.android.sku.weex.a aVar, com.taobao.android.sku.weex.a aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("91569a60", new Object[]{this, map, aVar, aVar2})).booleanValue();
        }
        JSONObject h = this.f15230a.g().h();
        if (h == null || h.isEmpty()) {
            a(aVar2, "errorMsg", "mtop data is empty");
            return false;
        }
        String valueOf = String.valueOf(map.get("nodePath"));
        if (StringUtils.isEmpty(valueOf)) {
            o.d("getNodeData", "nodePath is empty");
            a(aVar, "nodeStr", h.toJSONString());
        } else {
            String[] split = valueOf.split("\\.");
            if (split.length == 0) {
                o.d("getNodeData", "nodePath split result length is 0");
                a(aVar, "nodeStr", h.toJSONString());
                return true;
            }
            int length = split.length;
            JSONObject jSONObject = h;
            for (int i = 0; i < length; i++) {
                String str = split[i];
                if (StringUtils.isEmpty(str)) {
                    String str2 = "nodePath: " + valueOf + " split with an empty node at index: " + i;
                    o.d("getNodeData", str2);
                    a(aVar2, "errorMsg", str2);
                    return false;
                }
                if (i == length - 1) {
                    try {
                        a(aVar, "nodeStr", String.valueOf(jSONObject.get(str)));
                    } catch (Throwable th) {
                        String th2 = th.toString();
                        o.d("getNodeData", "nodePath: " + valueOf + " exception: " + th2);
                        StringBuilder sb = new StringBuilder();
                        sb.append("exception: ");
                        sb.append(th2);
                        a(aVar2, "errorMsg", sb.toString());
                    }
                } else {
                    jSONObject = jSONObject.getJSONObject(str);
                }
            }
        }
        return true;
    }

    public void a(JSONObject jSONObject, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a79284c", new Object[]{this, jSONObject, new Boolean(z)});
            return;
        }
        Map.Entry<com.taobao.android.sku.weex.a, com.taobao.android.sku.weex.a> remove = z ? this.i.get(this.f15230a.p()) : this.i.remove(this.f15230a.p());
        if (remove == null) {
            return;
        }
        o.a("onUpdateDetailCallbackData keepAlive:" + z);
        if (z) {
            b(remove.getKey(), "mtopStr", jSONObject.toJSONString());
        } else {
            a(remove.getKey(), "mtopStr", jSONObject.toJSONString());
        }
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        Map.Entry<com.taobao.android.sku.weex.a, com.taobao.android.sku.weex.a> remove = this.i.remove(this.f15230a.p());
        if (remove == null) {
            return;
        }
        o.a("onUpdateDetailFailureData errorMsg:" + str);
        a(remove.getValue(), "errorMsg", str);
    }

    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue() : !StringUtils.isEmpty(str) && this.i.get(str) != null;
    }

    private boolean c(Map<String, Object> map, com.taobao.android.sku.weex.a aVar, com.taobao.android.sku.weex.a aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c008047f", new Object[]{this, map, aVar, aVar2})).booleanValue();
        }
        if ("customApi".equals(String.valueOf(map.get("type")))) {
            return e(map, aVar, aVar2);
        }
        return d(map, aVar, aVar2);
    }

    private boolean d(Map<String, Object> map, com.taobao.android.sku.weex.a aVar, com.taobao.android.sku.weex.a aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eeb96e9e", new Object[]{this, map, aVar, aVar2})).booleanValue();
        }
        String valueOf = String.valueOf(map.get(fgl.ORIGINALITEMID));
        String valueOf2 = String.valueOf(map.get(fgl.TARGETITEMID));
        String valueOf3 = String.valueOf(map.get(mrm.KEY_AREA_ID));
        String valueOf4 = String.valueOf(map.get("addressId"));
        String valueOf5 = String.valueOf(map.get("params"));
        String valueOf6 = String.valueOf(map.get("forbidLoading"));
        if (StringUtils.isEmpty(valueOf) || StringUtils.isEmpty(valueOf2)) {
            a(aVar2, "errorMsg", "originalItemId or targetItemId is empty");
            return false;
        }
        Intent intent = new Intent();
        intent.setAction(com.taobao.android.detail.ttdetail.constant.a.SKU_ACTION_UPDATE_DATA);
        intent.putExtra("skuToken", this.f15230a.p());
        intent.putExtra(fgl.ORIGINALITEMID, valueOf);
        intent.putExtra(fgl.TARGETITEMID, valueOf2);
        intent.putExtra(mrm.KEY_AREA_ID, valueOf3);
        intent.putExtra("addressId", valueOf4);
        intent.putExtra("params", valueOf5);
        intent.putExtra("forbidLoading", valueOf6);
        intent.addCategory("android.intent.category.DEFAULT");
        LocalBroadcastManager.getInstance(this.f15230a.o()).sendBroadcast(intent);
        return true;
    }

    private boolean e(Map<String, Object> map, com.taobao.android.sku.weex.a aVar, com.taobao.android.sku.weex.a aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1d6ad8bd", new Object[]{this, map, aVar, aVar2})).booleanValue();
        }
        boolean parseBoolean = Boolean.parseBoolean(String.valueOf(map.get("reload")));
        String valueOf = String.valueOf(map.get("apiInfo"));
        JSONObject parseObject = JSONObject.parseObject(valueOf);
        String string = parseObject.getString("apiName");
        String string2 = parseObject.getString("apiVersion");
        if (StringUtils.isEmpty(string) || StringUtils.isEmpty(string2)) {
            a(aVar2, "errorMsg", "apiName or apiVersion is empty");
            return false;
        }
        String valueOf2 = String.valueOf(map.get("headerInfo"));
        String valueOf3 = String.valueOf(map.get("data"));
        String valueOf4 = String.valueOf(map.get("forbidLoading"));
        String valueOf5 = String.valueOf(map.get("streamMode"));
        Intent intent = new Intent();
        intent.setAction(com.taobao.android.detail.ttdetail.constant.a.SKU_ACTION_UPDATE_DATA);
        intent.putExtra("skuToken", this.f15230a.p());
        intent.putExtra("updateWithCustomApi", "true");
        intent.putExtra("apiInfo", valueOf);
        intent.putExtra("headerInfo", valueOf2);
        intent.putExtra("data", valueOf3);
        intent.putExtra("forbidLoading", valueOf4);
        intent.putExtra("streamMode", valueOf5);
        intent.addCategory("android.intent.category.DEFAULT");
        LocalBroadcastManager.getInstance(this.f15230a.o()).sendBroadcast(intent);
        if (parseBoolean) {
            return true;
        }
        this.i.put(this.f15230a.p(), new AbstractMap.SimpleEntry(aVar, aVar2));
        return true;
    }

    private boolean f(Map<String, Object> map, com.taobao.android.sku.weex.a aVar, com.taobao.android.sku.weex.a aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4c1c42dc", new Object[]{this, map, aVar, aVar2})).booleanValue();
        }
        String valueOf = String.valueOf(map.get("errorCode"));
        String valueOf2 = String.valueOf(map.get("errorMsg"));
        if (!this.b.k()) {
            WeexCore weexCore = this.b;
            weexCore.a("Passive=" + valueOf, valueOf2);
            a(aVar, "downgrade", "true");
            this.f15230a.a("BUYNOW".equals(this.b.g()) ? -700003 : -700004, "sku前端主动降级");
            return true;
        }
        a(aVar2, "errorMsg", "already downgrade");
        return false;
    }

    private boolean g(Map<String, Object> map, com.taobao.android.sku.weex.a aVar, com.taobao.android.sku.weex.a aVar2) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7acdacfb", new Object[]{this, map, aVar, aVar2})).booleanValue();
        }
        String valueOf = String.valueOf(map.get("serviceLink"));
        String valueOf2 = String.valueOf(map.get("serviceId"));
        String valueOf3 = String.valueOf(map.get("serviceUniqueId"));
        String valueOf4 = String.valueOf(map.get("itemId"));
        String valueOf5 = String.valueOf(map.get("skuId"));
        if (StringUtils.isEmpty(valueOf)) {
            str = "serviceLink is empty";
        } else if (StringUtils.isEmpty(valueOf2)) {
            str = "serviceId is empty";
        } else {
            str = StringUtils.isEmpty(valueOf4) ? "itemId is empty" : "";
        }
        if (!StringUtils.isEmpty(str)) {
            a(aVar2, "errorMsg", str);
            return false;
        }
        Uri.Builder buildUpon = Uri.parse(valueOf).buildUpon();
        buildUpon.appendQueryParameter("serviceItemId", valueOf2);
        buildUpon.appendQueryParameter("serviceItemSkuId", valueOf3);
        buildUpon.appendQueryParameter("itemId", valueOf4);
        buildUpon.appendQueryParameter("itemSkuId", valueOf5);
        buildUpon.appendQueryParameter("sku_token", this.f15230a.p());
        buildUpon.appendQueryParameter("selectedUniqueId", valueOf3);
        AliNavServiceInterface a2 = t.a();
        if (a2 == null) {
            return false;
        }
        this.g.put(valueOf2, aVar);
        return a2.a(this.f15230a.o()).a(buildUpon.build().toString());
    }

    public void b(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b99827", new Object[]{this, jSONObject});
        } else if (jSONObject == null || jSONObject.isEmpty() || (jSONObject2 = jSONObject.getJSONObject("params")) == null || jSONObject2.isEmpty()) {
        } else {
            String string = jSONObject2.getString("serviceId");
            if (StringUtils.isEmpty(string)) {
                return;
            }
            a(this.g.remove(string), "serviceStrData", jSONObject.toJSONString());
        }
    }

    private boolean h(Map<String, Object> map, com.taobao.android.sku.weex.a aVar, com.taobao.android.sku.weex.a aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a97f171a", new Object[]{this, map, aVar, aVar2})).booleanValue();
        }
        String valueOf = String.valueOf(map.get("chartLink"));
        String valueOf2 = String.valueOf(map.get("itemId"));
        String valueOf3 = String.valueOf(map.get(fgl.TARGETITEMID));
        String valueOf4 = String.valueOf(map.get(fgl.ORIGINALITEMID));
        String valueOf5 = String.valueOf(map.get("sellerId"));
        boolean parseBoolean = Boolean.parseBoolean(String.valueOf(map.get("needCallback")));
        String str = StringUtils.isEmpty(valueOf) ? "chartLink is empty" : "";
        if (!StringUtils.isEmpty(str)) {
            a(aVar2, "errorMsg", str);
            return false;
        }
        Uri.Builder buildUpon = Uri.parse(valueOf).buildUpon();
        buildUpon.appendQueryParameter("itemId", valueOf2);
        buildUpon.appendQueryParameter(fgl.TARGETITEMID, valueOf3);
        buildUpon.appendQueryParameter(fgl.ORIGINALITEMID, valueOf4);
        buildUpon.appendQueryParameter("sellerId", valueOf5);
        buildUpon.appendQueryParameter("sku_token", this.f15230a.p());
        buildUpon.appendQueryParameter("needCallback", String.valueOf(parseBoolean));
        AliNavServiceInterface a2 = t.a();
        if (a2 != null) {
            if (parseBoolean) {
                this.h.put(this.f15230a.p(), aVar);
            }
            return a2.a(this.f15230a.o()).a(buildUpon.build().toString());
        }
        a(aVar2, "errorMsg", "can not open size chart page");
        return false;
    }

    public void c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c50c34c6", new Object[]{this, jSONObject});
        } else {
            a(this.h.remove(this.f15230a.p()), "changed", "true");
        }
    }

    private boolean i(Map<String, Object> map, com.taobao.android.sku.weex.a aVar, com.taobao.android.sku.weex.a aVar2) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d8308139", new Object[]{this, map, aVar, aVar2})).booleanValue();
        }
        final JSONArray parseArray = JSONArray.parseArray(String.valueOf(map.get("imageInfoList")));
        final JSONObject parseObject = JSONObject.parseObject(String.valueOf(map.get("currentImage")));
        final String valueOf = String.valueOf(map.get("skuBaseNotDisplayed"));
        final JSONArray parseArray2 = JSONArray.parseArray(String.valueOf(map.get("clickImgRect")));
        final String valueOf2 = String.valueOf(map.get("from"));
        final String valueOf3 = String.valueOf(map.get("bottomMode"));
        final String valueOf4 = String.valueOf(map.get("skuLightoffDowngrade"));
        if (parseArray == null || parseArray.isEmpty()) {
            str = "imageInfoList is empty";
        } else {
            str = (parseObject == null || parseObject.isEmpty()) ? "currentImage is empty" : "";
        }
        if (!StringUtils.isEmpty(str)) {
            a(aVar2, "errorMsg", str);
            return false;
        }
        this.f15230a.c(new JSONObject() { // from class: com.taobao.android.sku.weex.WeexMessageHandler$9
            {
                put("action", "next_page_dark_curtain");
                put("params", (Object) new JSONObject() { // from class: com.taobao.android.sku.weex.WeexMessageHandler$9.1
                    {
                        put("imageInfoList", (Object) parseArray);
                        put("currentImage", (Object) parseObject);
                        put("skuBaseNotDisplayed", (Object) valueOf);
                        put("clickImgRect", (Object) parseArray2);
                        put("from", (Object) valueOf2);
                        put("bottomMode", (Object) valueOf3);
                        put("skuLightoffDowngrade", (Object) valueOf4);
                    }
                });
            }
        });
        a(aVar, "opened", "true");
        return true;
    }

    private boolean j(Map<String, Object> map, com.taobao.android.sku.weex.a aVar, com.taobao.android.sku.weex.a aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6e1eb58", new Object[]{this, map, aVar, aVar2})).booleanValue();
        }
        String valueOf = String.valueOf(map.get("errorCode"));
        String valueOf2 = String.valueOf(map.get("errorMsg"));
        String u = this.f15230a.u();
        o.c(u, o.UM_SKU_V3_E_PREFIX + valueOf, valueOf2, o.UM_WEEX_E_SERVICE_ID);
        a(aVar, "alarm", "true");
        return true;
    }

    private boolean k(Map<String, Object> map, com.taobao.android.sku.weex.a aVar, com.taobao.android.sku.weex.a aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("35935577", new Object[]{this, map, aVar, aVar2})).booleanValue();
        }
        o.b(o.LOG_TRACE_MODULE_SKU_V3, String.valueOf(map.get("step")), String.valueOf(map.get("stepMsg")), String.valueOf(map.get("logContent")));
        a(aVar, com.taobao.android.weex_framework.util.a.ATOM_EXT_print, "true");
        return true;
    }

    private boolean l(Map<String, Object> map, com.taobao.android.sku.weex.a aVar, com.taobao.android.sku.weex.a aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6444bf96", new Object[]{this, map, aVar, aVar2})).booleanValue();
        }
        String valueOf = String.valueOf(map.get("errorCode"));
        String valueOf2 = String.valueOf(map.get("errorMsg"));
        String u = this.f15230a.u();
        o.c(u, o.UM_NEWBUY_E_PREFIX + valueOf, valueOf2, o.UM_WEEX_E_SERVICE_ID);
        a(aVar, "alarm", "true");
        return true;
    }

    private boolean m(Map<String, Object> map, com.taobao.android.sku.weex.a aVar, com.taobao.android.sku.weex.a aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("92f629b5", new Object[]{this, map, aVar, aVar2})).booleanValue();
        }
        o.b(o.LOG_TRACE_MODULE, String.valueOf(map.get("step")), String.valueOf(map.get("stepMsg")), String.valueOf(map.get("logContent")));
        a(aVar, com.taobao.android.weex_framework.util.a.ATOM_EXT_print, "true");
        return true;
    }

    private boolean n(Map<String, Object> map, com.taobao.android.sku.weex.a aVar, com.taobao.android.sku.weex.a aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c1a793d4", new Object[]{this, map, aVar, aVar2})).booleanValue();
        }
        i(map);
        final JSONObject g = this.f15230a.g().g();
        final JSONObject a2 = q.a(this.f15230a.o());
        b(aVar, new HashMap<String, Object>() { // from class: com.taobao.android.sku.weex.WeexMessageHandler$10
            {
                put("extInputStr", g.toJSONString());
                put("tradeParamStr", a2.toJSONString());
                put("mtopTimeStamp", String.valueOf(SDKUtils.getCorrectionTimeMillis()));
            }
        });
        return true;
    }

    private void i(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9750c515", new Object[]{this, map});
            return;
        }
        if (map != null) {
            Object obj = map.get("JSBRIDGE_START_UPTIME");
            Object obj2 = map.get("WXMODEL_START_UPTIME");
            HashMap hashMap = new HashMap();
            hashMap.put("from", "getInputData");
            if (obj instanceof Long) {
                iyf.a().a("jsBridge", pqe.STAGE_INTERACTIVE, ((Long) map.get("JSBRIDGE_START_UPTIME")).longValue(), System.currentTimeMillis(), hashMap);
            }
            if (obj2 instanceof Long) {
                iyf.a().a("WXModule", pqe.STAGE_INTERACTIVE, ((Long) map.get("WXMODEL_START_UPTIME")).longValue(), System.currentTimeMillis(), hashMap);
            }
        }
        iyf.a().d();
        PerformanceFlowModel b = iyf.a().b();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("performanceRecord", (Object) JSONObject.parseObject(JSONObject.toJSONString(b)));
            JSONObject jSONObject2 = this.f15230a.g().g().getJSONObject("skuTimeStamp");
            if (jSONObject2 == null) {
                this.f15230a.g().g().put("skuTimeStamp", (Object) jSONObject);
            } else {
                jSONObject2.putAll(jSONObject);
            }
        } catch (Throwable unused) {
        }
        iyf.a().c();
    }

    private boolean o(Map<String, Object> map, com.taobao.android.sku.weex.a aVar, com.taobao.android.sku.weex.a aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f058fdf3", new Object[]{this, map, aVar, aVar2})).booleanValue();
        }
        if (this.b.k()) {
            b(aVar2, new HashMap<String, Object>() { // from class: com.taobao.android.sku.weex.WeexMessageHandler$11
                {
                    d.this = this;
                    put("errorMsg", "already downgrade");
                }
            });
            return false;
        }
        this.b.i();
        return true;
    }

    private boolean p(Map<String, Object> map, com.taobao.android.sku.weex.a aVar, com.taobao.android.sku.weex.a aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1f0a6812", new Object[]{this, map, aVar, aVar2})).booleanValue();
        }
        if (this.b.k()) {
            b(aVar2, new HashMap<String, Object>() { // from class: com.taobao.android.sku.weex.WeexMessageHandler$12
                {
                    d.this = this;
                    put("errorMsg", "core is broken");
                }
            });
            return false;
        }
        b(aVar, new HashMap<String, Object>() { // from class: com.taobao.android.sku.weex.WeexMessageHandler$13
            {
                d.this = this;
                put("sync", "true");
            }
        });
        Intent intent = new Intent();
        intent.setAction("com.taobao.sku.intent.action.syncData");
        intent.putExtra("selectedTextMap", String.valueOf(map.get("selectedTextMap")));
        intent.putExtra("uniqueId", this.f15230a.p());
        intent.addCategory("android.intent.category.DEFAULT");
        LocalBroadcastManager.getInstance(this.f15230a.o()).sendBroadcast(intent);
        return true;
    }

    private boolean q(Map<String, Object> map, com.taobao.android.sku.weex.a aVar, com.taobao.android.sku.weex.a aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4dbbd231", new Object[]{this, map, aVar, aVar2})).booleanValue();
        }
        if (this.b.k()) {
            b(aVar2, new HashMap<String, Object>() { // from class: com.taobao.android.sku.weex.WeexMessageHandler$14
                {
                    d.this = this;
                    put("errorMsg", "core is broken");
                }
            });
            return false;
        }
        b(aVar, new HashMap<String, Object>() { // from class: com.taobao.android.sku.weex.WeexMessageHandler$15
            {
                d dVar = d.this;
                put("bottomMode", d.$ipChange.g());
            }
        });
        return true;
    }

    private boolean r(Map<String, Object> map, com.taobao.android.sku.weex.a aVar, com.taobao.android.sku.weex.a aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7c6d3c50", new Object[]{this, map, aVar, aVar2})).booleanValue();
        }
        if (this.b.k()) {
            b(aVar2, new HashMap<String, Object>() { // from class: com.taobao.android.sku.weex.WeexMessageHandler$16
                {
                    d.this = this;
                    put("errorMsg", "core is broken");
                }
            });
            return false;
        }
        ixt q = this.f15230a.q();
        if (q != null) {
            Object obj = map.get("fields");
            JSONObject parseObject = JSONObject.parseObject(String.valueOf(obj));
            if (obj == null || parseObject == null || parseObject.isEmpty()) {
                b(aVar2, new HashMap<String, Object>() { // from class: com.taobao.android.sku.weex.WeexMessageHandler$17
                    {
                        d.this = this;
                        put("errorMsg", "parse fields to json can not be empty");
                    }
                });
                return false;
            }
            b(aVar, new HashMap<String, Object>() { // from class: com.taobao.android.sku.weex.WeexMessageHandler$18
                {
                    d.this = this;
                    put("callback", "true");
                }
            });
            q.a(parseObject);
            return true;
        }
        b(aVar2, new HashMap<String, Object>() { // from class: com.taobao.android.sku.weex.WeexMessageHandler$19
            {
                d.this = this;
                put("errorMsg", "native callback is broken");
            }
        });
        return false;
    }

    private boolean s(Map<String, Object> map, com.taobao.android.sku.weex.a aVar, com.taobao.android.sku.weex.a aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab1ea66f", new Object[]{this, map, aVar, aVar2})).booleanValue();
        }
        if (this.b.k()) {
            b(aVar2, new HashMap<String, Object>() { // from class: com.taobao.android.sku.weex.WeexMessageHandler$20
                {
                    d.this = this;
                    put("errorMsg", "core is broken");
                }
            });
            return false;
        }
        b(aVar, new HashMap<String, Object>() { // from class: com.taobao.android.sku.weex.WeexMessageHandler$21
            {
                d dVar = d.this;
                put("utParams", d.$ipChange.s());
            }
        });
        return true;
    }

    private boolean t(Map<String, Object> map, com.taobao.android.sku.weex.a aVar, com.taobao.android.sku.weex.a aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9d0108e", new Object[]{this, map, aVar, aVar2})).booleanValue();
        }
        if (this.b.k()) {
            b(aVar2, new HashMap<String, Object>() { // from class: com.taobao.android.sku.weex.WeexMessageHandler$22
                {
                    d.this = this;
                    put("errorMsg", "core is broken");
                }
            });
            return false;
        }
        try {
            float parseFloat = Float.parseFloat(String.valueOf(map.get("height")));
            if (parseFloat <= 1.0E-5f) {
                parseFloat = 0.9f;
            } else if (parseFloat >= 1.00001f) {
                parseFloat = 1.0f;
            }
            ((com.taobao.android.sku.presenter.b) this.f15230a.h().a()).a(parseFloat, false);
            b(aVar, new HashMap<String, Object>() { // from class: com.taobao.android.sku.weex.WeexMessageHandler$23
                {
                    d.this = this;
                    put("changed", "true");
                }
            });
            return true;
        } catch (Throwable unused) {
            b(aVar2, new HashMap<String, Object>() { // from class: com.taobao.android.sku.weex.WeexMessageHandler$24
                {
                    d.this = this;
                    put("errorMsg", "height is not a float value or dialog do not support adjust height");
                }
            });
            return false;
        }
    }

    private boolean u(Map<String, Object> map, com.taobao.android.sku.weex.a aVar, com.taobao.android.sku.weex.a aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8817aad", new Object[]{this, map, aVar, aVar2})).booleanValue();
        }
        if (this.b.k()) {
            b(aVar2, new HashMap<String, Object>() { // from class: com.taobao.android.sku.weex.WeexMessageHandler$25
                {
                    d.this = this;
                    put("errorMsg", "core is broken");
                }
            });
            return false;
        }
        try {
            final JSONObject jSONObject = this.f15230a.g().g().getJSONObject("skuTimeStamp");
            if (jSONObject != null) {
                b(aVar, new HashMap<String, Object>() { // from class: com.taobao.android.sku.weex.WeexMessageHandler$26
                    {
                        put("timeStamp", jSONObject.toJSONString());
                    }
                });
            }
            return true;
        } catch (Throwable unused) {
            b(aVar2, new HashMap<String, Object>() { // from class: com.taobao.android.sku.weex.WeexMessageHandler$27
                {
                    d.this = this;
                    put("errorMsg", "timeStamp to string error");
                }
            });
            return false;
        }
    }

    private boolean v(Map<String, Object> map, com.taobao.android.sku.weex.a aVar, com.taobao.android.sku.weex.a aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3732e4cc", new Object[]{this, map, aVar, aVar2})).booleanValue();
        }
        if (this.b.k()) {
            b(aVar2, new HashMap<String, Object>() { // from class: com.taobao.android.sku.weex.WeexMessageHandler$28
                {
                    d.this = this;
                    put("errorMsg", "core is broken");
                }
            });
            return false;
        }
        b(aVar, new HashMap<String, Object>() { // from class: com.taobao.android.sku.weex.WeexMessageHandler$29
            {
                d.this = this;
                put("dismiss", "true");
            }
        });
        this.f15230a.x();
        return true;
    }

    private boolean w(Map<String, Object> map, com.taobao.android.sku.weex.a aVar, com.taobao.android.sku.weex.a aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("65e44eeb", new Object[]{this, map, aVar, aVar2})).booleanValue();
        }
        if (this.b.k()) {
            b(aVar2, new HashMap<String, Object>() { // from class: com.taobao.android.sku.weex.WeexMessageHandler$30
                {
                    d.this = this;
                    put("errorMsg", "core is broken");
                }
            });
            return false;
        }
        final Rect a2 = this.f15230a.a();
        if (a2 == null) {
            b(aVar2, new HashMap<String, Object>() { // from class: com.taobao.android.sku.weex.WeexMessageHandler$31
                {
                    d.this = this;
                    put("errorMsg", "cart position is empty");
                }
            });
            return false;
        }
        View d = this.c.d();
        if (d == null) {
            b(aVar2, new HashMap<String, Object>() { // from class: com.taobao.android.sku.weex.WeexMessageHandler$32
                {
                    d.this = this;
                    put("errorMsg", "weex container is empty");
                }
            });
            return false;
        }
        final int[] iArr = new int[2];
        d.getLocationOnScreen(iArr);
        b(aVar, new HashMap<String, Object>() { // from class: com.taobao.android.sku.weex.WeexMessageHandler$33
            {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("x", (Object) Integer.valueOf(a2.left));
                jSONObject.put("y", (Object) Integer.valueOf(a2.top));
                jSONObject.put("width", (Object) Integer.valueOf(a2.right - a2.left));
                jSONObject.put("height", (Object) Integer.valueOf(a2.bottom - a2.top));
                put("cartIconRect", jSONObject);
                JSONObject jSONObject2 = new JSONObject();
                d dVar = d.this;
                jSONObject2.put("x", (Object) Integer.valueOf(m.b(d.$ipChange.o(), iArr[0])));
                d dVar2 = d.this;
                jSONObject2.put("y", (Object) Integer.valueOf(m.b(d.$ipChange.o(), iArr[1])));
                put("wxOffset", jSONObject2);
            }
        });
        return true;
    }

    private boolean x(Map<String, Object> map, com.taobao.android.sku.weex.a aVar, com.taobao.android.sku.weex.a aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9495b90a", new Object[]{this, map, aVar, aVar2})).booleanValue();
        }
        if (this.b.k()) {
            b(aVar2, new HashMap<String, Object>() { // from class: com.taobao.android.sku.weex.WeexMessageHandler$34
                {
                    d.this = this;
                    put("errorMsg", "core is broken");
                }
            });
            return false;
        }
        Object obj = map.get("key");
        Object obj2 = map.get("value");
        if (obj == null || obj2 == null) {
            b(aVar2, new HashMap<String, Object>() { // from class: com.taobao.android.sku.weex.WeexMessageHandler$35
                {
                    d.this = this;
                    put("errorMsg", "key and value must not be empty");
                }
            });
            return false;
        }
        this.f15230a.j().a(String.valueOf(obj), String.valueOf(obj2));
        b(aVar, new HashMap<String, Object>() { // from class: com.taobao.android.sku.weex.WeexMessageHandler$36
            {
                d.this = this;
                put("saved", "true");
            }
        });
        return true;
    }

    private boolean y(Map<String, Object> map, com.taobao.android.sku.weex.a aVar, com.taobao.android.sku.weex.a aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c3472329", new Object[]{this, map, aVar, aVar2})).booleanValue();
        }
        if (this.b.k()) {
            b(aVar2, new HashMap<String, Object>() { // from class: com.taobao.android.sku.weex.WeexMessageHandler$37
                {
                    d.this = this;
                    put("errorMsg", "core is broken");
                }
            });
            return false;
        }
        final String a2 = this.f15230a.j().a(String.valueOf(map.get("key")));
        b(aVar, new HashMap<String, Object>() { // from class: com.taobao.android.sku.weex.WeexMessageHandler$38
            {
                d.this = this;
                put("value", a2);
            }
        });
        return true;
    }

    private boolean z(Map<String, Object> map, final com.taobao.android.sku.weex.a aVar, com.taobao.android.sku.weex.a aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f1f88d48", new Object[]{this, map, aVar, aVar2})).booleanValue();
        }
        if (this.b.k()) {
            b(aVar2, new HashMap<String, Object>() { // from class: com.taobao.android.sku.weex.WeexMessageHandler$39
                {
                    d.this = this;
                    put("errorMsg", "core is broken");
                }
            });
            return false;
        }
        Object obj = map.get("key");
        if (obj == null) {
            b(aVar2, new HashMap<String, Object>() { // from class: com.taobao.android.sku.weex.WeexMessageHandler$40
                {
                    d.this = this;
                    put("errorMsg", "key must not be empty");
                }
            });
            return false;
        }
        final int a2 = this.f15230a.j().a(String.valueOf(obj), new iyh.a() { // from class: com.taobao.android.sku.weex.WeexMessageHandler$41
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.iyh.a
            public void a(final String str, final String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
                } else {
                    d.a(aVar, new HashMap<String, Object>() { // from class: com.taobao.android.sku.weex.WeexMessageHandler$41.1
                        {
                            put("oldValue", str);
                            put("newValue", str2);
                        }
                    });
                }
            }
        });
        if (a2 == -1) {
            b(aVar2, new HashMap<String, Object>() { // from class: com.taobao.android.sku.weex.WeexMessageHandler$42
                {
                    d.this = this;
                    put("errorMsg", "register failed with unknown error");
                }
            });
            return false;
        }
        this.f.add(Integer.valueOf(a2));
        b(aVar, new HashMap<String, Object>() { // from class: com.taobao.android.sku.weex.WeexMessageHandler$43
            {
                d.this = this;
                put("observerId", Integer.valueOf(a2));
            }
        });
        return true;
    }

    private boolean A(Map<String, Object> map, com.taobao.android.sku.weex.a aVar, com.taobao.android.sku.weex.a aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8c77ec61", new Object[]{this, map, aVar, aVar2})).booleanValue();
        }
        if (this.b.k()) {
            b(aVar2, new HashMap<String, Object>() { // from class: com.taobao.android.sku.weex.WeexMessageHandler$44
                {
                    d.this = this;
                    put("errorMsg", "core is broken");
                }
            });
            return false;
        }
        try {
            int parseInt = Integer.parseInt(String.valueOf(map.get("observerId")));
            if (this.f15230a.j().a(parseInt)) {
                b(aVar, new HashMap<String, Object>() { // from class: com.taobao.android.sku.weex.WeexMessageHandler$46
                    {
                        d.this = this;
                        put("removed", "true");
                    }
                });
                return true;
            }
            final String str = "not found observerId : " + parseInt;
            b(aVar2, new HashMap<String, Object>() { // from class: com.taobao.android.sku.weex.WeexMessageHandler$47
                {
                    d.this = this;
                    put("errorMsg", str);
                }
            });
            return false;
        } catch (Throwable th) {
            final String th2 = th.toString();
            b(aVar2, new HashMap<String, Object>() { // from class: com.taobao.android.sku.weex.WeexMessageHandler$45
                {
                    d.this = this;
                    put("errorMsg", "observerId is not a number : " + th2);
                }
            });
            return false;
        }
    }

    public boolean a(final String str, final Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("20476517", new Object[]{this, str, map})).booleanValue();
        }
        this.d.a(new Runnable() { // from class: com.taobao.android.sku.weex.d.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                d.this = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    d.c(d.this).a(str, map);
                }
            }
        });
        return true;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.e = true;
        this.d.a();
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.d.b();
        this.g.clear();
        this.h.clear();
        this.i.clear();
        for (Integer num : this.f) {
            this.f15230a.j().a(num.intValue());
        }
    }

    /* loaded from: classes6.dex */
    public class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private ArrayDeque<Runnable> b;
        private Runnable c;

        static {
            kge.a(-420894306);
        }

        private a() {
            d.this = r1;
            this.b = new ArrayDeque<>();
        }

        public synchronized void a(final Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("39112e6", new Object[]{this, runnable});
                return;
            }
            this.b.offer(new Runnable() { // from class: com.taobao.android.sku.weex.d.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    a.this = this;
                }

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        runnable.run();
                    } finally {
                        a.this.a();
                    }
                }
            });
            if (this.c == null) {
                a();
            }
        }

        public synchronized void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else if (!d.d(d.this)) {
            } else {
                Runnable poll = this.b.poll();
                this.c = poll;
                if (poll != null) {
                    this.c.run();
                }
            }
        }

        public synchronized void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            } else {
                this.b.clear();
            }
        }
    }
}
