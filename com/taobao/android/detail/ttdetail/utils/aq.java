package com.taobao.android.detail.ttdetail.utils;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes5.dex */
public class aq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-2007448762);
    }

    public static Map<String, Object> a(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("4fc7ad92", new Object[]{map});
        }
        if (map == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (String str : map.keySet()) {
            if (str != null) {
                Object obj = map.get(str);
                hashMap.put(str, obj != null ? obj.toString() : null);
            }
        }
        return hashMap;
    }

    public static JSONObject a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("429586a8", new Object[]{jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        JSONObject jSONObject2 = new JSONObject();
        for (String str : jSONObject.keySet()) {
            if (str != null) {
                Object obj = jSONObject.get(str);
                jSONObject2.put(str, (Object) (obj != null ? obj.toString() : null));
            }
        }
        return jSONObject2;
    }

    public static Map<String, String> b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("592eda1c", new Object[]{jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (String str : jSONObject.keySet()) {
            if (str != null) {
                Object obj = jSONObject.get(str);
                hashMap.put(str, obj != null ? obj.toString() : null);
            }
        }
        return hashMap;
    }
}
