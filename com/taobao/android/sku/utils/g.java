package com.taobao.android.sku.utils;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.kge;

/* loaded from: classes6.dex */
public class g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-671383211);
    }

    public static JSONObject a(String str) {
        JSONObject parseObject;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("73d7af52", new Object[]{str});
        }
        if (StringUtils.isEmpty(str) || (parseObject = JSONObject.parseObject(str)) == null || (jSONObject = parseObject.getJSONObject("data")) == null || jSONObject.isEmpty()) {
            return null;
        }
        return a(a(jSONObject, b(jSONObject)));
    }

    public static JSONObject e(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("26170924", new Object[]{jSONObject});
        }
        if (jSONObject != null && (jSONObject2 = jSONObject.getJSONObject("data")) != null && !jSONObject2.isEmpty()) {
            return a(a(jSONObject2, b(jSONObject2)));
        }
        return null;
    }

    private static JSONObject b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("7b75e747", new Object[]{jSONObject});
        }
        JSONObject c = c(jSONObject);
        return (c == null || c.isEmpty()) ? d(jSONObject) : c;
    }

    private static JSONObject c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b45647e6", new Object[]{jSONObject});
        }
        JSONArray jSONArray = jSONObject.getJSONArray("apiStack");
        if (jSONArray != null) {
            try {
                if (!jSONArray.isEmpty()) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(0).getJSONObject("value");
                    String string = jSONObject2.getString("version");
                    if ("v7-".equals(string) || "v7".equals(string)) {
                        JSONObject jSONObject3 = jSONObject2.getJSONObject("bizData");
                        jSONObject2.remove("bizData");
                        return jSONObject3;
                    }
                }
            } catch (Throwable th) {
                o.b("v7-|v7协议数据解析异常： " + th.toString());
            }
        }
        if (jSONArray != null) {
            try {
                if (!jSONArray.isEmpty()) {
                    JSONObject jSONObject4 = jSONArray.getJSONObject(0).getJSONObject("value");
                    JSONObject jSONObject5 = jSONObject4.getJSONObject("global").getJSONObject("data");
                    jSONObject4.getJSONObject("global").remove("data");
                    return jSONObject5;
                }
            } catch (Throwable th2) {
                o.b("新奥创动态数据解析异常： " + th2.toString());
            }
        }
        if (jSONArray != null) {
            try {
                if (!jSONArray.isEmpty()) {
                    JSONObject jSONObject6 = jSONArray.getJSONObject(0).getJSONObject("data");
                    JSONObject jSONObject7 = jSONObject6.getJSONObject("global").getJSONObject("data");
                    jSONObject6.getJSONObject("global").remove("data");
                    return jSONObject7;
                }
            } catch (Throwable th3) {
                o.b("Aura动态数据解析异常： " + th3.toString());
            }
        }
        if (jSONArray == null) {
            return null;
        }
        try {
            if (jSONArray.isEmpty()) {
                return null;
            }
            JSONObject jSONObject8 = jSONArray.getJSONObject(0).getJSONObject("value");
            jSONArray.getJSONObject(0).remove("value");
            return jSONObject8;
        } catch (Throwable th4) {
            o.b("tCould动态数据解析异常： " + th4.toString());
            return null;
        }
    }

    private static JSONObject d(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("ed36a885", new Object[]{jSONObject});
        }
        try {
            return JSON.parseObject(jSONObject.getString("mockData"));
        } catch (Throwable unused) {
            return null;
        }
    }

    private static JSONObject a(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("87d5db88", new Object[]{jSONObject, jSONObject2});
        }
        if (jSONObject2 != null && !jSONObject2.isEmpty()) {
            for (Map.Entry<String, Object> entry : jSONObject2.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (value instanceof JSONObject) {
                    JSONObject jSONObject3 = jSONObject.getJSONObject(key);
                    if (jSONObject3 != null) {
                        jSONObject.put(key, (Object) a(jSONObject3, (JSONObject) value));
                    } else {
                        jSONObject.put(key, value);
                    }
                } else {
                    jSONObject.put(key, value);
                }
            }
        }
        return jSONObject;
    }

    public static JSONObject a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("429586a8", new Object[]{jSONObject});
        }
        if (jSONObject != null && !jSONObject.isEmpty()) {
            try {
                jSONObject.remove("apiStack");
            } catch (Throwable unused) {
            }
            try {
                jSONObject.remove("mockData");
            } catch (Throwable unused2) {
            }
        }
        return jSONObject;
    }
}
