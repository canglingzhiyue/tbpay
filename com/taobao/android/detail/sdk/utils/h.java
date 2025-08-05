package com.taobao.android.detail.sdk.utils;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import tb.jjv;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(953502203);
        tpc.a("com.taobao.android.detail.sdk.utils.ExpressionUtils");
    }

    public static Object a(JSONObject jSONObject, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("c2724e", new Object[]{jSONObject, obj});
        }
        if (obj == null) {
            return null;
        }
        if (obj instanceof String) {
            return jjv.a((Object) jSONObject, (String) obj);
        }
        if (obj instanceof JSONObject) {
            JSONObject jSONObject2 = (JSONObject) obj;
            for (Map.Entry<String, Object> entry : jSONObject2.entrySet()) {
                entry.setValue(a(jSONObject, entry.getValue()));
            }
            return jSONObject2;
        } else if (!(obj instanceof JSONArray)) {
            return null;
        } else {
            JSONArray jSONArray = (JSONArray) obj;
            ArrayList arrayList = new ArrayList();
            Iterator<Object> it = jSONArray.iterator();
            while (it.hasNext()) {
                Object a2 = a(jSONObject, it.next());
                if (a2 != null) {
                    arrayList.add(a2);
                }
            }
            jSONArray.clear();
            jSONArray.addAll(arrayList);
            return jSONArray;
        }
    }
}
