package com.taobao.android.sku.utils;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes6.dex */
public class j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1835172058);
    }

    public static Object a(JSONObject jSONObject, List list, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("89fe87bd", new Object[]{jSONObject, list, obj});
        }
        if ((jSONObject == null && list == null) || obj == null) {
            return obj;
        }
        if (jSONObject == null && list.size() <= 0) {
            return obj;
        }
        if (obj instanceof String) {
            return i.a(jSONObject, list, (String) obj);
        }
        if (obj instanceof JSONObject) {
            JSONObject jSONObject2 = (JSONObject) obj;
            for (Map.Entry<String, Object> entry : jSONObject2.entrySet()) {
                entry.setValue(a(jSONObject, list, entry.getValue()));
            }
            return jSONObject2;
        }
        boolean z = obj instanceof JSONArray;
        JSONArray jSONArray = obj;
        if (z) {
            JSONArray jSONArray2 = (JSONArray) obj;
            ArrayList arrayList = new ArrayList();
            Iterator<Object> it = jSONArray2.iterator();
            while (it.hasNext()) {
                Object a2 = a(jSONObject, list, it.next());
                if (a2 != null) {
                    arrayList.add(a2);
                }
            }
            jSONArray2.clear();
            jSONArray2.addAll(arrayList);
            jSONArray = jSONArray2;
        }
        return jSONArray;
    }
}
