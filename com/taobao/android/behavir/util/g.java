package com.taobao.android.behavir.util;

import android.support.v4.util.ArrayMap;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.util.TypeUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import tb.kge;

/* loaded from: classes.dex */
public class g {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final JSONObject EMPTY_JSON;

    static {
        kge.a(1991410395);
        EMPTY_JSON = new JSONObject(Collections.emptyMap());
    }

    public static JSONObject a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("eb9346ae", new Object[]{str, obj});
        }
        JSONObject jSONObject = new JSONObject(a(1));
        jSONObject.put(str, obj);
        return jSONObject;
    }

    public static JSONObject b(String str, Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("b29f2daf", new Object[]{str, obj}) : new JSONObject(Collections.singletonMap(str, obj));
    }

    public static JSONObject a(String str, Object obj, String str2, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("c7f4fad4", new Object[]{str, obj, str2, obj2});
        }
        JSONObject jSONObject = new JSONObject(a(2));
        jSONObject.put(str, obj);
        jSONObject.put(str2, obj2);
        return jSONObject;
    }

    public static JSONObject a(Map<String, ?> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("3729093d", new Object[]{map});
        }
        if (map == null) {
            return EMPTY_JSON;
        }
        if (map instanceof JSONObject) {
            return (JSONObject) map;
        }
        return new JSONObject(new HashMap(map));
    }

    public static JSONObject a(String str, Object obj, String str2, Object obj2, String str3, Object obj3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b37613fa", new Object[]{str, obj, str2, obj2, str3, obj3});
        }
        JSONObject jSONObject = new JSONObject(a(3));
        jSONObject.put(str, obj);
        jSONObject.put(str2, obj2);
        jSONObject.put(str3, obj3);
        return jSONObject;
    }

    public static <K, V> Map<K, V> a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("35efba90", new Object[]{new Integer(i)}) : new ArrayMap(i);
    }

    public static int b(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a9d66c2d", new Object[]{new Integer(i)})).intValue() : (int) Math.ceil(i / 0.75d);
    }

    /* loaded from: classes4.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final JSONObject f9156a = new JSONObject(g.a(16));

        static {
            kge.a(-1162665654);
        }

        public a a(String str, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("6f3a3969", new Object[]{this, str, obj});
            }
            this.f9156a.put(str, obj);
            return this;
        }

        public JSONObject a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("709f7788", new Object[]{this}) : this.f9156a;
        }
    }

    public static a a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("3eae6d43", new Object[0]) : new a();
    }

    public static JSONObject a(JSON json, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("3bc99658", new Object[]{json, strArr});
        }
        if (json == null) {
            return EMPTY_JSON;
        }
        JSONObject jSONObject = new JSONObject(b(strArr.length));
        a(json, jSONObject, new HashSet(Arrays.asList(strArr)));
        return jSONObject;
    }

    private static void a(JSON json, JSONObject jSONObject, Set<String> set) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbfba256", new Object[]{json, jSONObject, set});
        } else if (jSONObject.size() < set.size()) {
            if (json instanceof JSONObject) {
                for (Map.Entry<String, Object> entry : ((JSONObject) json).entrySet()) {
                    String key = entry.getKey();
                    Object value = entry.getValue();
                    if (set.contains(key) && !jSONObject.containsKey(key)) {
                        jSONObject.put(key, value);
                    }
                    if (value instanceof JSON) {
                        a((JSON) value, jSONObject, set);
                    }
                }
            } else if (json instanceof JSONArray) {
                Iterator<Object> it = ((JSONArray) json).iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (next instanceof JSON) {
                        a((JSON) next, jSONObject, set);
                    }
                }
            }
        }
    }

    public static <T> List<T> a(JSONArray jSONArray, Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("1f5defa", new Object[]{jSONArray, cls});
        }
        if (jSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(jSONArray.size());
        ParserConfig globalInstance = ParserConfig.getGlobalInstance();
        Iterator<Object> it = jSONArray.iterator();
        while (it.hasNext()) {
            arrayList.add(TypeUtils.cast(it.next(), (Class<Object>) cls, globalInstance));
        }
        return arrayList;
    }
}
