package com.alipay.android.msp.utils;

import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.app.safepaylogv2.api.StatisticCollector;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorType;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
public class JsonUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static JSONObject map2Json(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("a4f46e20", new Object[]{map});
        }
        try {
            return JSON.parseObject(JSON.toJSONString(map));
        } catch (Exception e) {
            LogUtil.printExceptionStackTrace(e);
            return new JSONObject();
        }
    }

    public static void addExtInfo(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf124c31", new Object[]{str, jSONObject});
        } else if (str != null) {
            try {
                JSONObject parseObject = JSON.parseObject(str);
                for (String str2 : parseObject.keySet()) {
                    jSONObject.put(str2, parseObject.get(str2));
                }
            } catch (Exception e) {
                LogUtil.printExceptionStackTrace(e);
            }
        }
    }

    public static void addExtInfo(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8c06b06", new Object[]{str, map});
        } else if (str == null) {
        } else {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(str);
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    map.put(next, jSONObject.get(next).toString());
                }
            } catch (Exception e) {
                LogUtil.printExceptionStackTrace(e);
            }
        }
    }

    public static void addUniqueItem(JSONObject jSONObject, String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a2ea18a", new Object[]{jSONObject, str, obj});
        } else if (jSONObject == null) {
        } else {
            try {
                if (jSONObject.containsKey(str)) {
                    jSONObject.remove(str);
                }
                jSONObject.put(str, obj);
            } catch (Exception e) {
                StatisticCollector.addError(StatisticCollector.GLOBAL_AGENT, ErrorType.DEFAULT, e.getClass().getName(), e);
            }
        }
    }

    public static JSONObject merge(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("4ea2ae1f", new Object[]{jSONObject, jSONObject2});
        }
        JSONObject jSONObject3 = new JSONObject();
        try {
            JSONObject[] jSONObjectArr = {jSONObject, jSONObject2};
            for (int i = 0; i < 2; i++) {
                JSONObject jSONObject4 = jSONObjectArr[i];
                if (jSONObject4 != null) {
                    for (String str : jSONObject4.keySet()) {
                        jSONObject3.put(str, jSONObject4.get(str));
                    }
                }
            }
        } catch (JSONException e) {
            LogUtil.printExceptionStackTrace(e);
        }
        return jSONObject3;
    }

    public static boolean isJsonObjectString(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4e49b397", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            LogUtil.record(1, "JsonUtil:isJsonObjectString", "jsonObject=".concat(String.valueOf(JSON.parseObject(str))));
            return true;
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
            return false;
        }
    }

    public static boolean isJsonArrayString(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("adbbe3cd", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            LogUtil.record(1, "JsonUtil:isJsonArrayString", "jsonArray=".concat(String.valueOf(JSON.parseArray(str))));
            return true;
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
            return false;
        }
    }

    public static Map<String, String> strJson2StringMap(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("fe71f4f8", new Object[]{str});
        }
        JSONObject parseObject = JSONObject.parseObject(str);
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, Object> entry : parseObject.entrySet()) {
            if (entry.getValue() != null && !TextUtils.isEmpty(String.valueOf(entry.getValue()))) {
                hashMap.put(entry.getKey(), String.valueOf(entry.getValue()));
            }
        }
        return hashMap;
    }

    public static JSONObject pickAsNew(String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("95646041", new Object[]{str, strArr});
        }
        try {
            if (!TextUtils.isEmpty(str) && isJsonObjectString(str)) {
                return pickAsNew(JSONObject.parseObject(str), strArr);
            }
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
        return new JSONObject();
    }

    public static JSONObject pickAsNew(JSONObject jSONObject, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("f81ef3c3", new Object[]{jSONObject, strArr});
        }
        JSONObject jSONObject2 = new JSONObject();
        if (jSONObject != null && jSONObject.size() != 0 && strArr != null && strArr.length != 0) {
            try {
                for (String str : strArr) {
                    jSONObject2.put(str, jSONObject.get(str));
                }
            } catch (Throwable th) {
                LogUtil.printExceptionStackTrace(th);
            }
        }
        return jSONObject2;
    }

    public static JSONObject bundle2Json(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("2a9da415", new Object[]{bundle});
        }
        JSONObject jSONObject = new JSONObject();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                try {
                    jSONObject.put(str, bundle.get(str));
                } catch (Exception e) {
                    LogUtil.printExceptionStackTrace(e);
                }
            }
        }
        return jSONObject;
    }
}
