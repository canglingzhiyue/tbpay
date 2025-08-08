package com.taobao.tbpoplayer.util;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.StringTokenizer;
import tb.dmp;
import tb.kge;

/* loaded from: classes8.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(419076197);
    }

    public static String a(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("731d6f8e", new Object[]{jSONObject, str});
        }
        Object c = c(jSONObject, str);
        return c != null ? String.valueOf(c) : "";
    }

    public static JSONObject b(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("7af4d51", new Object[]{jSONObject, str});
        }
        Object c = c(jSONObject, str);
        if (!(c instanceof JSONObject)) {
            return null;
        }
        return (JSONObject) c;
    }

    public static Object c(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("e726022", new Object[]{jSONObject, str});
        }
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        try {
            StringTokenizer stringTokenizer = new StringTokenizer(str, dmp.DELIMITER, false);
            Object obj = jSONObject;
            while (stringTokenizer.hasMoreTokens()) {
                obj = a(obj, stringTokenizer.nextToken());
            }
            return obj;
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("JsonPathUtils.parseDataExpression.error.", th);
            return null;
        }
    }

    private static Object a(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("a12221e4", new Object[]{obj, str});
        }
        if (obj != null && str != null) {
            if (obj instanceof JSONObject) {
                return ((JSONObject) obj).get(str);
            }
            if (obj instanceof JSONArray) {
                try {
                    return ((JSONArray) obj).get(Integer.parseInt(str));
                } catch (Exception unused) {
                    return null;
                }
            } else if (obj instanceof String) {
                try {
                    try {
                        return JSONObject.parseObject((String) obj).get(str);
                    } catch (Throwable unused2) {
                        return JSONArray.parseArray((String) obj).get(Integer.parseInt(str));
                    }
                } catch (Exception unused3) {
                }
            }
        }
        return null;
    }
}
