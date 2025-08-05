package com.taobao.android.detail.ttdetail.utils;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import tb.kge;

/* loaded from: classes5.dex */
public class z {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes5.dex */
    public interface a<T> {
        T convert(Object obj);
    }

    static {
        kge.a(973551823);
    }

    public static <V> Map<String, V> a(JSONObject jSONObject, a<V> aVar) {
        V v;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("9b3ed06", new Object[]{jSONObject, aVar});
        }
        if (jSONObject == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
            String key = entry.getKey();
            try {
                v = aVar.convert(entry.getValue());
            } catch (Throwable unused) {
                v = null;
            }
            if (v != null) {
                hashMap.put(key, v);
            }
        }
        return hashMap;
    }

    public static <T> ArrayList<T> a(JSONArray jSONArray, a<T> aVar) {
        T t;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("d748a5f3", new Object[]{jSONArray, aVar});
        }
        if (jSONArray == null) {
            return null;
        }
        ArrayList<T> arrayList = new ArrayList<>(jSONArray.size());
        Iterator<Object> it = jSONArray.iterator();
        while (it.hasNext()) {
            try {
                t = aVar.convert(it.next());
            } catch (Throwable unused) {
                t = null;
            }
            if (t != null) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }
}
