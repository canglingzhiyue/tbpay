package com.taobao.android.detail.ttdetail.utils;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.datasdk.model.datamodel.node.SkuCoreNode;
import com.taobao.android.detail.ttdetail.data.meta.Feature;
import com.taobao.android.detail.ttdetail.data.meta.Item;
import com.taobao.android.detail.ttdetail.request.callback.MainRequestCallback;
import com.taobao.android.detail.ttdetail.request.params.MainRequestParams;
import java.util.HashMap;
import java.util.Map;
import tb.kge;
import tb.pir;
import tb.smx;
import tb.soa;

/* loaded from: classes5.dex */
public class at {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1417316279);
    }

    public static boolean a(pir pirVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f9b02aa3", new Object[]{pirVar})).booleanValue();
        }
        Feature d = d(pirVar);
        return d != null && d.isOneProductMM();
    }

    public static boolean b(pir pirVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e8333124", new Object[]{pirVar})).booleanValue();
        }
        Feature d = d(pirVar);
        return d != null && d.isOneProductMMDegrade();
    }

    private static Feature d(pir pirVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Feature) ipChange.ipc$dispatch("75b7ed85", new Object[]{pirVar});
        }
        if (pirVar != null) {
            return (Feature) pirVar.a(Feature.class);
        }
        return null;
    }

    public static String c(pir pirVar) {
        Item item;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ec97d31f", new Object[]{pirVar});
        }
        if (pirVar != null && (item = (Item) pirVar.a(Item.class)) != null) {
            return item.getPlatformItemId();
        }
        return null;
    }

    public static boolean a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("266fb8c", new Object[]{jSONObject})).booleanValue();
        }
        if (jSONObject == null) {
            return false;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("feature");
        JSONObject jSONObject3 = jSONObject.getJSONObject("item");
        if (jSONObject2 != null && jSONObject3 != null) {
            String string = jSONObject3.getString("itemId");
            if (jSONObject2.getBooleanValue("oneProductMM") && jSONObject2.getBooleanValue("oneProductMMDegrade") && !TextUtils.isEmpty(string)) {
                return true;
            }
        }
        return false;
    }

    public static Map<String, String> b(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("592eda1c", new Object[]{jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        String string = jSONObject.getJSONObject("item").getString("itemId");
        JSONObject jSONObject3 = jSONObject.getJSONObject(SkuCoreNode.TAG);
        String string2 = (jSONObject3 == null || (jSONObject2 = jSONObject3.getJSONObject("skuItem")) == null) ? "" : jSONObject2.getString("skuId");
        HashMap hashMap = new HashMap();
        hashMap.put("item_id", string);
        hashMap.put("id", string);
        hashMap.put(DetailCoreActivity.DETAIL_ITEM_ID, string);
        if (string2 == null) {
            string2 = "";
        }
        hashMap.put("skuId", string2);
        return hashMap;
    }

    public static void a(JSONObject jSONObject, MainRequestParams mainRequestParams, soa soaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21584bde", new Object[]{jSONObject, mainRequestParams, soaVar});
        } else if (mainRequestParams == null || soaVar == null) {
        } else {
            String itemId = mainRequestParams.getItemId();
            Map<String, String> b = b(jSONObject);
            mainRequestParams.updateRefreshParams(b);
            new smx(mainRequestParams).a(new MainRequestCallback(mainRequestParams, soaVar)).k();
            a(itemId, b);
        }
    }

    public static void a(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{str, map});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("platformItemId", str);
        if (map != null && !map.isEmpty()) {
            hashMap.putAll(map);
        }
        ae.a(hashMap, -300015, "一品多商降级");
    }
}
