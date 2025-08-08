package com.taobao.android.litecreator.util;

import android.content.Intent;
import android.graphics.Color;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes5.dex */
public class m {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-324889485);
    }

    public static int a(JSONObject jSONObject, String str, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b8e389e4", new Object[]{jSONObject, str, new Integer(i)})).intValue() : ac.a((Map) jSONObject, str, i);
    }

    public static long a(JSONObject jSONObject, String str, long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b8e38da6", new Object[]{jSONObject, str, new Long(j)})).longValue() : ac.a(jSONObject, str, j);
    }

    public static float a(JSONObject jSONObject, String str, float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b8e37e9e", new Object[]{jSONObject, str, new Float(f)})).floatValue() : ac.a((Map) jSONObject, str, f);
    }

    public static boolean a(JSONObject jSONObject, String str, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b8e3c9c6", new Object[]{jSONObject, str, new Boolean(z)})).booleanValue() : ac.a(jSONObject, str, z);
    }

    public static String a(JSONObject jSONObject, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7f883384", new Object[]{jSONObject, str, str2});
        }
        if (jSONObject == null) {
            return str2;
        }
        String string = jSONObject.getString(str);
        return StringUtils.isEmpty(string) ? str2 : string;
    }

    public static int b(JSONObject jSONObject, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("de7792e5", new Object[]{jSONObject, str, new Integer(i)})).intValue();
        }
        try {
            return Color.parseColor(jSONObject.getString(str));
        } catch (Throwable unused) {
            return i;
        }
    }

    public static JSONObject a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("73d7af52", new Object[]{str});
        }
        try {
            return JSON.parseObject(str);
        } catch (Exception unused) {
            return null;
        }
    }

    private static JSONObject a(JSONObject jSONObject, int i, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("5cf9f7e4", new Object[]{jSONObject, new Integer(i), strArr});
        }
        if (strArr == null || i == 0) {
            return jSONObject;
        }
        if (jSONObject == null || strArr.length == 0 || strArr.length < i) {
            return null;
        }
        for (int i2 = 0; i2 < i; i2++) {
            try {
                jSONObject = jSONObject.getJSONObject(strArr[i2]);
                if (jSONObject == null) {
                    return null;
                }
            } catch (Exception unused) {
                return null;
            }
        }
        return jSONObject;
    }

    public static String a(String str, JSONObject jSONObject, String... strArr) {
        JSONObject a2;
        String string;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd3475f", new Object[]{str, jSONObject, strArr}) : (strArr == null || strArr.length == 0 || (a2 = a(jSONObject, strArr.length - 1, strArr)) == null || (string = a2.getString(strArr[strArr.length - 1])) == null) ? str : string;
    }

    public static int b(int i, JSONObject jSONObject, String... strArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("fe50675c", new Object[]{new Integer(i), jSONObject, strArr})).intValue() : at.a(a(String.valueOf(i), jSONObject, strArr), i);
    }

    public static long a(long j, JSONObject jSONObject, String... strArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("9ab7a57f", new Object[]{new Long(j), jSONObject, strArr})).longValue() : at.a(a(String.valueOf(j), jSONObject, strArr), j);
    }

    public static boolean a(boolean z, JSONObject jSONObject, String... strArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2ffcf99f", new Object[]{new Boolean(z), jSONObject, strArr})).booleanValue() : at.b(a(String.valueOf(z), jSONObject, strArr), z);
    }

    public static int a(int i, JSONObject jSONObject, String... strArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7163503d", new Object[]{new Integer(i), jSONObject, strArr})).intValue() : at.b(a(String.valueOf(i), jSONObject, strArr), i);
    }

    public static JSONArray a(JSONObject jSONObject, String... strArr) {
        JSONObject a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("5e38fac7", new Object[]{jSONObject, strArr});
        }
        if (strArr != null && (a2 = a(jSONObject, strArr.length - 1, strArr)) != null) {
            return a2.getJSONArray(strArr[strArr.length - 1]);
        }
        return null;
    }

    public static JSONObject b(JSONObject jSONObject, String... strArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("1ac8a0b8", new Object[]{jSONObject, strArr}) : strArr == null ? jSONObject : a(jSONObject, strArr.length, strArr);
    }

    public static Map<String, String> a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("2b563fbd", new Object[]{jSONObject});
        }
        HashMap hashMap = new HashMap();
        if (jSONObject == null) {
            return hashMap;
        }
        for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
            if (entry != null && entry.getKey() != null && entry.getValue() != null) {
                hashMap.put(entry.getKey(), entry.getValue().toString());
            }
        }
        return hashMap;
    }

    public static JSONObject a(org.json.JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("6365e976", new Object[]{jSONObject});
        }
        if (jSONObject != null) {
            return JSONObject.parseObject(jSONObject.toString());
        }
        return null;
    }

    public static JSONObject a(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("c4801345", new Object[]{intent});
        }
        JSONObject jSONObject = new JSONObject();
        if (intent != null && intent.getExtras() != null) {
            for (String str : intent.getExtras().keySet()) {
                jSONObject.put(str, JSON.toJSON(intent.getExtras().get(str)));
            }
        }
        return jSONObject;
    }
}
