package com.taobao.android.detail.ttdetail.handler.bizhandlers;

import android.content.Context;
import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.data.meta.Delivery;
import com.taobao.android.detail.ttdetail.data.meta.Item;
import com.taobao.android.detail.ttdetail.data.meta.Seller;
import com.taobao.android.detail.ttdetail.data.meta.SkuCore;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import java.util.HashMap;
import java.util.Map;
import tb.eyx;
import tb.ezm;
import tb.fgl;
import tb.kge;
import tb.mrm;

/* loaded from: classes5.dex */
public class k implements ezm {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "openAddress";
    public static final String EVENT_TYPE_ALTERNATIVE = "open_area_chooser";
    public static final String EVENT_TYPE_ALTERNATIVE_BACK_UP = "show_address";

    /* renamed from: a  reason: collision with root package name */
    private Context f10713a;
    private eyx b;

    static {
        kge.a(1266599399);
        kge.a(1967244270);
    }

    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : "https://arealocation.taobao.com/home.htm";
    }

    public k(Context context, eyx eyxVar) {
        this.f10713a = context;
        this.b = eyxVar;
    }

    @Override // tb.ezm
    public boolean a(com.taobao.android.detail.ttdetail.handler.event.a aVar, RuntimeAbilityParam... runtimeAbilityParamArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bbeca8d7", new Object[]{this, aVar, runtimeAbilityParamArr})).booleanValue();
        }
        if (aVar == null) {
            return false;
        }
        if (!com.taobao.android.detail.ttdetail.utils.ao.c()) {
            com.taobao.android.detail.ttdetail.utils.ao.a(true);
            return true;
        }
        if (StringUtils.equals("openAddress", aVar.a())) {
            final JSONObject b = a(aVar) ? b(aVar) : c(aVar);
            this.b.c().a(new com.taobao.android.detail.ttdetail.handler.event.a(new JSONObject() { // from class: com.taobao.android.detail.ttdetail.handler.bizhandlers.OpenAddressImplementor$1
                {
                    put("type", "openUrl");
                    put("fields", (Object) b);
                }
            }), runtimeAbilityParamArr);
        } else if (StringUtils.equals(EVENT_TYPE_ALTERNATIVE_BACK_UP, aVar.a())) {
            final JSONObject c = c(aVar);
            this.b.c().a(new com.taobao.android.detail.ttdetail.handler.event.a(new JSONObject() { // from class: com.taobao.android.detail.ttdetail.handler.bizhandlers.OpenAddressImplementor$2
                {
                    put("type", "openUrl");
                    put("fields", (Object) c);
                }
            }), runtimeAbilityParamArr);
        } else {
            String encode = Uri.encode(com.taobao.android.detail.ttdetail.utils.d.a((Delivery) this.b.a().a(Delivery.class), ""));
            String a2 = a();
            if (StringUtils.isEmpty(a2)) {
                a2 = "//market.m.taobao.com/apps/market/detailrax/address-picker.html?spm=a2116h.app.0.0.16d957e9nDYOzv&wh_weex=true";
            }
            final String a3 = a(b(), a(a2, encode));
            this.b.c().a(new com.taobao.android.detail.ttdetail.handler.event.a(new JSONObject() { // from class: com.taobao.android.detail.ttdetail.handler.bizhandlers.OpenAddressImplementor$3
                {
                    put("type", "openUrl");
                    put("fields", (Object) new JSONObject() { // from class: com.taobao.android.detail.ttdetail.handler.bizhandlers.OpenAddressImplementor$3.1
                        {
                            put("url", (Object) a3);
                        }
                    });
                }
            }), runtimeAbilityParamArr);
        }
        return true;
    }

    private Map<String, String> a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("c27656b1", new Object[]{this, str, str2});
        }
        HashMap hashMap = new HashMap();
        if (StringUtils.isEmpty(str2)) {
            str2 = "";
        }
        hashMap.put("currentAddress", str2);
        HashMap hashMap2 = new HashMap();
        String b = com.taobao.android.detail.ttdetail.utils.d.b((Item) this.b.a().a(Item.class), "");
        hashMap.put("item_id", b);
        hashMap2.put("itemId", b);
        String a2 = com.taobao.android.detail.ttdetail.utils.d.a((Seller) this.b.a().a(Seller.class), "");
        hashMap.put("seller_id", a2);
        hashMap2.put("sellerId", a2);
        hashMap2.put(mrm.KEY_AREA_ID, com.taobao.android.detail.ttdetail.utils.d.b((Delivery) this.b.a().a(Delivery.class), ""));
        if (com.taobao.android.detail.ttdetail.utils.d.a((SkuCore) this.b.a().a(SkuCore.class))) {
            hashMap2.put("itemType", "taobao");
        } else {
            hashMap2.put("itemType", com.taobao.linkmanager.flowout.c.TMALL);
        }
        hashMap2.put("loadUrl", a(str, hashMap));
        hashMap2.put("sku_token", this.b.e().a());
        return hashMap2;
    }

    private String a(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4dcf7ed", new Object[]{this, str, map});
        }
        if (StringUtils.isEmpty(str) || map == null || map.isEmpty()) {
            return str;
        }
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            buildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
        }
        return buildUpon.build().toString();
    }

    private boolean a(com.taobao.android.detail.ttdetail.handler.event.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6be74927", new Object[]{this, aVar})).booleanValue();
        }
        JSONObject b = aVar.b();
        return b != null && !StringUtils.isEmpty(b.getString("url"));
    }

    private JSONObject b(com.taobao.android.detail.ttdetail.handler.event.a aVar) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("aa486d44", new Object[]{this, aVar});
        }
        String b = com.taobao.android.detail.ttdetail.utils.d.b((Item) this.b.a().a(Item.class), "");
        String b2 = com.taobao.android.detail.ttdetail.utils.d.b((Delivery) this.b.a().a(Delivery.class), "");
        JSONObject b3 = aVar.b();
        if (b3 != null) {
            jSONObject = JSONObject.parseObject(b3.toJSONString());
        } else {
            jSONObject = new JSONObject();
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(fgl.TARGETITEMID, (Object) b);
        jSONObject2.put(fgl.ORIGINALITEMID, (Object) b);
        jSONObject2.put(mrm.KEY_AREA_ID, (Object) b2);
        jSONObject2.put("token", (Object) this.b.e().a());
        jSONObject.put("queryParams", (Object) jSONObject2);
        return jSONObject;
    }

    private JSONObject c(com.taobao.android.detail.ttdetail.handler.event.a aVar) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("93503245", new Object[]{this, aVar});
        }
        String encode = Uri.encode(com.taobao.android.detail.ttdetail.utils.d.a((Delivery) this.b.a().a(Delivery.class), ""));
        Seller seller = (Seller) this.b.a().a(Seller.class);
        String b = com.taobao.android.detail.ttdetail.utils.d.b((Item) this.b.a().a(Item.class), "");
        String str = com.taobao.android.detail.ttdetail.utils.d.a(seller) ? com.taobao.linkmanager.flowout.c.TMALL : "taobao";
        String a2 = com.taobao.android.detail.ttdetail.utils.d.a(seller, "");
        String b2 = com.taobao.android.detail.ttdetail.utils.d.b((Delivery) this.b.a().a(Delivery.class), "");
        JSONObject b3 = aVar.b();
        if (b3 != null) {
            jSONObject = JSONObject.parseObject(b3.toJSONString());
        } else {
            jSONObject = new JSONObject();
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("itemId", (Object) b);
        jSONObject2.put("itemType", (Object) str);
        jSONObject2.put("sellerId", (Object) a2);
        jSONObject2.put(mrm.KEY_AREA_ID, (Object) b2);
        jSONObject2.put("sku_token", (Object) this.b.e().a());
        jSONObject2.put("loadUrl", (Object) Uri.encode(b("//market.m.taobao.com/apps/market/detailrax/address-picker.html?spm=a2116h.app.0.0.16d957e9nDYOzv&wh_weex=true", encode)));
        jSONObject.put("queryParams", (Object) jSONObject2);
        jSONObject.put("pageType", (Object) "Native");
        jSONObject.put("url", (Object) b());
        return jSONObject;
    }

    private String b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4204a5c3", new Object[]{this, str, str2});
        }
        if (StringUtils.isEmpty(str)) {
            return str;
        }
        String a2 = a();
        if (StringUtils.isEmpty(a2)) {
            a2 = str;
        }
        if (StringUtils.isEmpty(str2)) {
            return str;
        }
        return (a2 + "&currentAddress=" + str2) + "&item_id=" + com.taobao.android.detail.ttdetail.utils.d.b((Item) this.b.a().a(Item.class), "") + "&seller_id=" + com.taobao.android.detail.ttdetail.utils.d.a((Seller) this.b.a().a(Seller.class), "");
    }

    private String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        Delivery delivery = (Delivery) this.b.a().a(Delivery.class);
        if (delivery == null) {
            return null;
        }
        return delivery.getAddressWeexUrl();
    }
}
