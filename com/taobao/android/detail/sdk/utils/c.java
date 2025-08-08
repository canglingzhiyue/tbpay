package com.taobao.android.detail.sdk.utils;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import tb.kge;

/* loaded from: classes4.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(465632631);
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str}) : str == null ? "" : str;
    }

    public static String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{str, str2}) : StringUtils.isEmpty(str) ? str2 : str;
    }

    public static <T> ArrayList<T> a(JSONArray jSONArray, g<T> gVar) {
        T t;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("dbacfa2", new Object[]{jSONArray, gVar});
        }
        if (jSONArray == null) {
            return new ArrayList<>();
        }
        ArrayList<T> arrayList = new ArrayList<>(jSONArray.size());
        Iterator<Object> it = jSONArray.iterator();
        while (it.hasNext()) {
            try {
                t = gVar.b(it.next());
            } catch (Throwable unused) {
                t = null;
            }
            if (t != null) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    public static <V> HashMap<String, V> a(JSONObject jSONObject, g<V> gVar) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("81172433", new Object[]{jSONObject, gVar});
        }
        if (jSONObject == null) {
            return new HashMap<>();
        }
        HashMap<String, V> hashMap = new HashMap<>();
        for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
            V v = null;
            try {
                str = entry.getKey();
                v = gVar.b(entry.getValue());
            } catch (Throwable unused) {
                str = null;
            }
            if (v != null) {
                hashMap.put(str, v);
            }
        }
        return hashMap;
    }

    /* loaded from: classes4.dex */
    public static class a implements g<String> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(828037356);
            kge.a(-1792902132);
        }

        /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.lang.String] */
        @Override // com.taobao.android.detail.sdk.utils.g
        public /* synthetic */ String b(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("eeb6464d", new Object[]{this, obj}) : a(obj);
        }

        public String a(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8a5b32dc", new Object[]{this, obj});
            }
            if (!(obj instanceof String)) {
                return null;
            }
            return (String) obj;
        }
    }
}
