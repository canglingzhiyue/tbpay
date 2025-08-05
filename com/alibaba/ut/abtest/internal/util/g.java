package com.alibaba.ut.abtest.internal.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import tb.kge;

/* loaded from: classes.dex */
public class g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1656908754);
    }

    public static <T> String a(T t) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8a5b32dc", new Object[]{t}) : JSON.toJSONString(t);
    }

    public static String a(Map<String, ?> map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1a4c023", new Object[]{map}) : JSON.toJSONString(map);
    }

    public static <T> String a(List<T> list) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("80c38867", new Object[]{list}) : JSON.toJSONString(list);
    }

    public static <T> T a(String str, Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("21de4147", new Object[]{str, cls});
        }
        try {
            return (T) JSON.parseObject(str, cls);
        } catch (Exception e) {
            h.c("JsonUtil", "json can not convert to " + cls.getName(), e);
            return null;
        }
    }

    public static <T> T a(String str, Type type) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("21a664b1", new Object[]{str, type});
        }
        try {
            return (T) JSON.parseObject(str, type, new Feature[0]);
        } catch (Exception e) {
            h.c("JsonUtil", "json can not convert to " + type.getClass().getName(), e);
            return null;
        }
    }

    public static Map<String, Object> a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("bf3e1ee7", new Object[]{str});
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            HashMap hashMap = new HashMap();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.get(next));
            }
            return hashMap;
        } catch (Exception e) {
            h.c("JsonUtil", "json can not convert to map", e);
            return new HashMap();
        }
    }
}
