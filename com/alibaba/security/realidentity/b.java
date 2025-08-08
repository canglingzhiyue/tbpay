package com.alibaba.security.realidentity;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;
import org.json.JSONException;

/* loaded from: classes3.dex */
public final class b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static final String f3363a = "JsonUtils";

    public static <T> T a(String str, Type type) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("21a664b1", new Object[]{str, type}) : (T) JSONObject.parseObject(str, type, new Feature[0]);
    }

    public static <T> T b(String str, Class<T> cls) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("47724a48", new Object[]{str, cls}) : (T) a(str, cls, false);
    }

    public static <T> List<T> a(String str, Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("f26a7d9c", new Object[]{str, cls});
        }
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        try {
            return JSON.parseArray(str, cls);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Map<String, Object> b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("d2e5f268", new Object[]{str}) : JSONObject.parseObject(str);
    }

    public static String b(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("154c93a4", new Object[]{map});
        }
        org.json.JSONObject a2 = a(map);
        return a2 == null ? "" : a2.toString();
    }

    public static <T> T a(String str, Class<T> cls, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("2ffdff69", new Object[]{str, cls, new Boolean(z)});
        }
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        if (z) {
            try {
                return (T) JSON.parseObject(str, cls);
            } catch (Throwable unused) {
                return null;
            }
        }
        return (T) JSON.parseObject(str, cls);
    }

    public static String a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8a5b32dc", new Object[]{obj});
        }
        if (obj == null) {
            return "";
        }
        try {
            return JSON.toJSONString(obj);
        } catch (Throwable unused) {
            return "";
        }
    }

    public static org.json.JSONObject a(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (org.json.JSONObject) ipChange.ipc$dispatch("7fc9528b", new Object[]{map});
        }
        if (map == null) {
            return null;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        for (Map.Entry entry : map.entrySet()) {
            try {
                jSONObject.put((String) entry.getKey(), entry.getValue());
            } catch (JSONException unused) {
            }
        }
        return jSONObject;
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue();
        }
        try {
            JSONObject.parseObject(str);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
