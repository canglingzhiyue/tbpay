package com.taobao.android.detail.ttdetail.utils;

import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.kge;

/* loaded from: classes5.dex */
public class g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(15277447);
    }

    public static JSONObject a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("429586a8", new Object[]{jSONObject});
        }
        if (jSONObject != null) {
            return b(jSONObject);
        }
        return null;
    }

    public static JSONObject b(JSONObject jSONObject) {
        JSONObject g;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("7b75e747", new Object[]{jSONObject});
        }
        JSONObject e = e(jSONObject);
        if (e != null && (g = g(e)) != null) {
            return g;
        }
        return null;
    }

    private static JSONObject g(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("97d7ca62", new Object[]{jSONObject});
        }
        final JSONObject jSONObject2 = jSONObject.getJSONObject("components");
        final JSONObject jSONObject3 = jSONObject.getJSONObject("layoutInfo");
        final JSONObject jSONObject4 = jSONObject.getJSONObject("model");
        final JSONObject jSONObject5 = jSONObject.getJSONObject("meta");
        if (jSONObject2 != null && jSONObject4 != null) {
            return new JSONObject() { // from class: com.taobao.android.detail.ttdetail.utils.DynamicMergeUtils$1
                {
                    put("components", (Object) JSONObject.this);
                    put("layoutInfo", (Object) jSONObject3);
                    put("model", (Object) jSONObject4);
                    put("meta", (Object) jSONObject5);
                }
            };
        }
        return null;
    }

    public static JSONObject a(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("87d5db88", new Object[]{jSONObject, jSONObject2});
        }
        if (jSONObject == null) {
            return null;
        }
        JSONObject b = b(jSONObject);
        if (b != null && jSONObject2 != null) {
            jSONObject2.putAll(b);
        }
        return jSONObject;
    }

    public static JSONObject c(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b45647e6", new Object[]{jSONObject});
        }
        if (jSONObject != null && (jSONObject2 = jSONObject.getJSONObject("data")) != null) {
            return b(jSONObject2, d(jSONObject2));
        }
        return null;
    }

    public static JSONObject d(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("ed36a885", new Object[]{jSONObject}) : h(jSONObject);
    }

    private static JSONObject h(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("d0b82b01", new Object[]{jSONObject}) : i(e(jSONObject));
    }

    public static JSONObject i(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("9988ba0", new Object[]{jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        try {
            String string = jSONObject.getString("version");
            if ("v7-".equals(string) || "v7".equals(string)) {
                return jSONObject.getJSONObject("bizData");
            }
        } catch (Throwable th) {
            i.a("v7-|v7协议数据解析异常： " + Log.getStackTraceString(th));
        }
        try {
            return jSONObject.getJSONObject("global").getJSONObject("data");
        } catch (Throwable th2) {
            i.a("新奥创动态数据解析异常： " + Log.getStackTraceString(th2));
            i.a("extractApiStackData 命中 tcloud 数据");
            return jSONObject;
        }
    }

    private static JSONObject b(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("cb3c4ac9", new Object[]{jSONObject, jSONObject2});
        }
        if (!StringUtils.isEmpty(jSONObject.getString("_mergedFlag_"))) {
            return jSONObject;
        }
        jSONObject.put("_mergedFlag_", (Object) Long.valueOf(System.currentTimeMillis()));
        return c(jSONObject, jSONObject2);
    }

    private static JSONObject c(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("ea2ba0a", new Object[]{jSONObject, jSONObject2});
        }
        if (jSONObject2 == null) {
            return jSONObject;
        }
        for (Map.Entry<String, Object> entry : jSONObject2.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof JSONObject) {
                JSONObject jSONObject3 = jSONObject.getJSONObject(key);
                if (jSONObject3 != null) {
                    jSONObject.put(key, (Object) c(jSONObject3, (JSONObject) value));
                } else {
                    jSONObject.put(key, value);
                }
            } else {
                jSONObject.put(key, value);
            }
        }
        return jSONObject;
    }

    public static JSONObject e(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("26170924", new Object[]{jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        JSONArray jSONArray = jSONObject.getJSONArray("apiStack");
        if (jSONArray != null) {
            try {
                JSONObject jSONObject2 = jSONArray.getJSONObject(0);
                JSONObject jSONObject3 = jSONObject2.getJSONObject("value");
                if (jSONObject3 != null) {
                    jSONObject2.remove("value");
                    jSONObject2.put("value", (Object) jSONObject3);
                    return jSONObject3;
                }
            } catch (Throwable th) {
                i.a("新奥创协议esi解析异常： " + Log.getStackTraceString(th));
            }
        }
        if (jSONArray != null) {
            try {
                JSONObject jSONObject4 = jSONArray.getJSONObject(0);
                JSONObject jSONObject5 = jSONObject4.getJSONObject("data");
                if (jSONObject5 != null) {
                    jSONObject4.remove("data");
                    jSONObject4.put("data", (Object) jSONObject5);
                    return jSONObject5;
                }
            } catch (Throwable th2) {
                i.a("Aura协议esi解析异常： " + Log.getStackTraceString(th2));
            }
        }
        return null;
    }

    public static JSONObject f(JSONObject jSONObject) {
        JSONArray jSONArray;
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("5ef769c3", new Object[]{jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        JSONObject jSONObject4 = jSONObject.getJSONObject("data");
        if (jSONObject4 != null && (jSONArray = jSONObject4.getJSONArray("apiStack")) != null && !jSONArray.isEmpty() && (jSONObject2 = jSONArray.getJSONObject(0)) != null && (jSONObject3 = jSONObject2.getJSONObject("value")) != null) {
            jSONObject2.remove("value");
            jSONObject2.put("value", (Object) jSONObject3);
        }
        return jSONObject;
    }
}
