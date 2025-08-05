package com.taobao.weex.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.WXEnvironment;
import com.taobao.weex.common.WXRuntimeException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes9.dex */
public class WXJsonUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(823726543);
    }

    public static <T> List<T> getList(String str, Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("c662320f", new Object[]{str, cls});
        }
        try {
            return JSONObject.parseArray(str, cls);
        } catch (Exception e) {
            e.printStackTrace();
            return new ArrayList();
        }
    }

    public static String fromObjectToJSONString(Object obj, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("272de32c", new Object[]{obj, new Boolean(z)});
        }
        try {
            return z ? JSON.toJSONString(obj, SerializerFeature.WriteNonStringKeyAsString) : JSON.toJSONString(obj);
        } catch (Exception e) {
            if (WXEnvironment.isApkDebugable()) {
                throw new WXRuntimeException("fromObjectToJSONString parse error!");
            }
            WXLogUtils.e("fromObjectToJSONString error:", e);
            return "{}";
        }
    }

    public static String fromObjectToJSONString(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("fbff79c0", new Object[]{obj}) : fromObjectToJSONString(obj, false);
    }

    public static void putAll(Map<String, Object> map, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19819a4", new Object[]{map, jSONObject});
            return;
        }
        for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (key != null && value != null) {
                map.put(key, value);
            }
        }
    }
}
