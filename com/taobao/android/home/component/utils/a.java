package com.taobao.android.home.component.utils;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.kge;

/* loaded from: classes5.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-873946930);
    }

    public static JSONObject a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("429586a8", new Object[]{jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("trackParam");
        if (jSONObject2 != null && !jSONObject2.isEmpty() && jSONObject2.getJSONObject("clickParam") != null && !jSONObject2.getJSONObject("clickParam").isEmpty()) {
            return a(jSONObject2.getJSONObject("clickParam"), jSONObject2.getJSONObject("args"));
        }
        return jSONObject.getJSONObject("clickParam");
    }

    private static JSONObject a(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("87d5db88", new Object[]{jSONObject, jSONObject2});
        }
        if (jSONObject2 != null && !jSONObject2.isEmpty() && jSONObject != null) {
            try {
                JSONObject jSONObject3 = jSONObject.getJSONObject("args");
                if (jSONObject3 == null) {
                    jSONObject3 = new JSONObject();
                    jSONObject.put("args", (Object) jSONObject3);
                }
                for (Map.Entry<String, Object> entry : jSONObject2.entrySet()) {
                    jSONObject3.put(entry.getKey(), entry.getValue());
                }
            } catch (Throwable th) {
                e.b("AutoExposureUtils", th, new String[0]);
            }
        }
        return jSONObject;
    }
}
