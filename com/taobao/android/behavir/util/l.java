package com.taobao.android.behavir.util;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.kge;

/* loaded from: classes4.dex */
public class l {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_CODE = "code";
    public static final String KEY_ERROR = "error";
    public static final String KEY_ERROR_MSG = "msg";
    public static final String KEY_RESULT = "result";

    static {
        kge.a(-198093372);
    }

    public static boolean a(Map<String, Object> map) {
        Boolean bool;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a421221", new Object[]{map})).booleanValue() : map != null && (map.get("success") instanceof Boolean) && (bool = (Boolean) map.get("success")) != null && bool.booleanValue();
    }

    public static int b(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("41e3e86f", new Object[]{map})).intValue();
        }
        if (map != null && (map.get("error") instanceof Map)) {
            return new JSONObject((Map) map.get("error")).getIntValue("code");
        }
        return -1;
    }

    public static String c(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("28f46725", new Object[]{map}) : (map == null || !(map.get("error") instanceof Map)) ? "" : new JSONObject((Map) map.get("error")).getString("msg");
    }

    public static void a(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{jSONObject});
        } else if (jSONObject == null || (jSONObject2 = jSONObject.getJSONObject("result")) == null) {
        } else {
            jSONObject.put("result", (Object) jSONObject2.getJSONObject("result"));
        }
    }
}
