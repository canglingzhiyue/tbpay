package com.taobao.android.searchbaseframe.util;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes6.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1405272530);
    }

    public static long a(JSONObject jSONObject, String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b8e38da6", new Object[]{jSONObject, str, new Long(j)})).longValue();
        }
        if (jSONObject == null || TextUtils.isEmpty(str)) {
            return j;
        }
        try {
            return jSONObject.getLongValue(str);
        } catch (Exception unused) {
            return j;
        }
    }

    public static int a(JSONObject jSONObject, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b8e389e4", new Object[]{jSONObject, str, new Integer(i)})).intValue();
        }
        if (jSONObject == null || TextUtils.isEmpty(str)) {
            return i;
        }
        try {
            return jSONObject.getIntValue(str);
        } catch (Exception unused) {
            return i;
        }
    }

    public static float a(JSONObject jSONObject, String str, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b8e37e9e", new Object[]{jSONObject, str, new Float(f)})).floatValue();
        }
        if (jSONObject == null || TextUtils.isEmpty(str)) {
            return f;
        }
        try {
            return jSONObject.getFloatValue(str);
        } catch (Exception unused) {
            return f;
        }
    }

    public static boolean a(JSONObject jSONObject, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b8e3c9c6", new Object[]{jSONObject, str, new Boolean(z)})).booleanValue();
        }
        if (jSONObject == null || TextUtils.isEmpty(str)) {
            return z;
        }
        try {
            return jSONObject.getBoolean(str).booleanValue();
        } catch (Exception unused) {
            return z;
        }
    }

    public static Boolean a(JSONObject jSONObject, String str, Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("a6d93f78", new Object[]{jSONObject, str, bool});
        }
        if (jSONObject == null || TextUtils.isEmpty(str)) {
            return bool;
        }
        try {
            return Boolean.valueOf(jSONObject.getBoolean(str).booleanValue());
        } catch (Exception unused) {
            return bool;
        }
    }

    public static String a(JSONObject jSONObject, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7f883384", new Object[]{jSONObject, str, str2});
        }
        if (jSONObject == null || TextUtils.isEmpty(str)) {
            return str2;
        }
        try {
            String string = jSONObject.getString(str);
            return TextUtils.isEmpty(string) ? str2 : string;
        } catch (Exception unused) {
            return str2;
        }
    }

    public static JSONArray a(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("9bc1dcac", new Object[]{jSONObject, str});
        }
        if (jSONObject != null && !TextUtils.isEmpty(str)) {
            Object obj = jSONObject.get(str);
            if (obj instanceof JSONArray) {
                return (JSONArray) obj;
            }
        }
        return null;
    }

    public static JSONObject b(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("7af4d51", new Object[]{jSONObject, str});
        }
        if (jSONObject != null && !TextUtils.isEmpty(str)) {
            Object obj = jSONObject.get(str);
            if (obj instanceof JSONObject) {
                return (JSONObject) obj;
            }
        }
        return null;
    }

    public static Map<String, String> a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("2b563fbd", new Object[]{jSONObject});
        }
        HashMap hashMap = new HashMap();
        if (jSONObject != null) {
            for (Map.Entry<String, Object> entry : jSONObject.getInnerMap().entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (!TextUtils.isEmpty(key) && value != null) {
                    hashMap.put(key, value.toString());
                }
            }
        }
        return hashMap;
    }

    public static Map<String, Object> b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("592eda1c", new Object[]{jSONObject});
        }
        HashMap hashMap = new HashMap();
        if (jSONObject != null) {
            for (Map.Entry<String, Object> entry : jSONObject.getInnerMap().entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (!TextUtils.isEmpty(key) && value != null) {
                    hashMap.put(key, value);
                }
            }
        }
        return hashMap;
    }
}
