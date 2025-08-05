package com.taobao.android.detail.ttdetail.utils;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.alo;
import tb.alq;
import tb.alr;
import tb.alu;
import tb.eyx;
import tb.kge;

/* loaded from: classes5.dex */
public class ar {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PARAMS_ITEM_ID = "itemId";
    public static final String PARAMS_POP_ID = "popId";
    public static final String PARAMS_URL = "url";

    static {
        kge.a(1492551406);
    }

    public static JSONObject a(eyx eyxVar, String str, String str2, String str3, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("612edb5e", new Object[]{eyxVar, str, str2, str3, jSONObject});
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("popId", (Object) str2);
        jSONObject2.put("bizId", (Object) "tbDetail");
        if (!TextUtils.isEmpty(str3)) {
            JSONObject parseObject = JSON.parseObject(str3);
            if (e.a(eyxVar.g())) {
                parseObject.put("maxHeight", (Object) "1.0");
                parseObject.put("maxWidth", (Object) "0.5");
            }
            jSONObject2.put(com.taobao.android.abilitykit.ability.pop.model.c.KEY_POP_CONFIG, (Object) parseObject);
        }
        jSONObject2.put("url", (Object) str);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("token", (Object) eyxVar.e().a());
        jSONObject3.put("bizId", (Object) "tbDetail");
        jSONObject3.put("popId", (Object) str2);
        jSONObject3.put("itemId", eyxVar.e().a("requestItemId"));
        jSONObject2.put("queryParams", (Object) jSONObject3);
        if (jSONObject != null) {
            jSONObject2.putAll(jSONObject);
        }
        return jSONObject2;
    }

    public static ExecuteResult a(Context context, View view, String str, String str2, JSONObject jSONObject, alo aloVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ExecuteResult) ipChange.ipc$dispatch("517b4449", new Object[]{context, view, str, str2, jSONObject, aloVar}) : new alu(new alr("detail", "detail").a(context)).a(str, str2, new alq().a(view), jSONObject, aloVar);
    }
}
