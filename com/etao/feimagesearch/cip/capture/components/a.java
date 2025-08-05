package com.etao.feimagesearch.cip.capture.components;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.q;
import org.json.JSONArray;
import org.json.JSONObject;
import tb.ctd;
import tb.kge;

/* loaded from: classes3.dex */
public final class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-542007414);
    }

    public static final ctd a(JSONObject jSONObject) throws Exception {
        JSONArray jSONArray;
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ctd) ipChange.ipc$dispatch("ddc153bd", new Object[]{jSONObject});
        }
        String str = null;
        if (jSONObject != null && (jSONArray = jSONObject.getJSONArray("result")) != null && (jSONObject2 = jSONArray.getJSONObject(0)) != null) {
            JSONArray optJSONArray = jSONObject2.optJSONArray("listItems");
            boolean a2 = q.a((Object) jSONObject2.optString("openRedPoint"), (Object) "true");
            int optInt = jSONObject2.optInt("count");
            ctd ctdVar = new ctd();
            ctdVar.d = a2;
            ctdVar.e = optInt;
            if (optJSONArray != null && optJSONArray.length() > 0 && (jSONObject3 = optJSONArray.getJSONObject(0)) != null) {
                JSONObject jSONObject4 = jSONObject3.getJSONObject("info");
                ctdVar.f26508a = jSONObject4 != null ? jSONObject4.getString("pict_url") : null;
                if (jSONObject4 != null) {
                    str = jSONObject4.getString("nid");
                }
                ctdVar.c = str;
                JSONObject jSONObject5 = jSONObject3.getJSONObject("trace");
                if (jSONObject5 != null) {
                    ctdVar.b = jSONObject5.getJSONObject("all");
                }
                return ctdVar;
            }
        }
        return null;
    }

    public static final List<ctd> b(JSONObject jSONObject) throws Exception {
        JSONArray jSONArray;
        JSONArray optJSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("cdf1b032", new Object[]{jSONObject});
        }
        if (jSONObject == null || (jSONArray = jSONObject.getJSONArray("result")) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObject2 = jSONArray.getJSONObject(0);
        if (jSONObject2 != null && (optJSONArray = jSONObject2.optJSONArray("listItems")) != null && optJSONArray.length() > 0) {
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                ctd ctdVar = new ctd();
                JSONObject jSONObject3 = optJSONArray.getJSONObject(i);
                if (jSONObject3 != null) {
                    JSONObject jSONObject4 = jSONObject3.getJSONObject("info");
                    ctdVar.f26508a = jSONObject4 != null ? jSONObject4.getString("pict_url") : null;
                    ctdVar.c = jSONObject4 != null ? jSONObject4.getString("nid") : null;
                    JSONObject jSONObject5 = jSONObject3.getJSONObject("trace");
                    if (jSONObject5 != null) {
                        ctdVar.b = jSONObject5.getJSONObject("all");
                    }
                    arrayList.add(ctdVar);
                }
            }
        }
        return arrayList;
    }
}
