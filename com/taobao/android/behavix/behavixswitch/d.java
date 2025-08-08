package com.taobao.android.behavix.behavixswitch;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1534838843);
    }

    public static List<f> a(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("c9355ab7", new Object[]{jSONArray});
        }
        if (jSONArray == null || jSONArray.size() <= 0) {
            return null;
        }
        if (jSONArray.size() == 1) {
            return Collections.singletonList(i.a(jSONArray.getString(0)));
        }
        ArrayList arrayList = new ArrayList(jSONArray.size());
        Iterator<Object> it = jSONArray.iterator();
        while (it.hasNext()) {
            arrayList.add(i.a((String) it.next()));
        }
        return arrayList;
    }

    public static Map<String, List<f>> a(JSONObject jSONObject) {
        JSONArray jSONArray;
        List<f> a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("2b563fbd", new Object[]{jSONObject});
        }
        if (jSONObject == null || jSONObject.size() <= 0) {
            return null;
        }
        if (jSONObject.size() == 1) {
            String next = jSONObject.keySet().iterator().next();
            return Collections.singletonMap(next, a(jSONObject.getJSONArray(next)));
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
            if (!StringUtils.isEmpty(entry.getKey()) && (jSONArray = (JSONArray) entry.getValue()) != null && jSONArray.size() > 0 && (a2 = a(jSONArray)) != null && a2.size() > 0) {
                hashMap.put(entry.getKey(), a2);
            }
        }
        return hashMap;
    }

    public static boolean a(List<f> list) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c705295d", new Object[]{list})).booleanValue() : list == null || list.size() <= 0;
    }

    public static boolean a(List<f> list, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3c6e0ee7", new Object[]{list, str})).booleanValue();
        }
        for (f fVar : list) {
            if (fVar != null && fVar.a(str)) {
                return true;
            }
        }
        return false;
    }

    public static boolean a(Map<String, List<f>> map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a421221", new Object[]{map})).booleanValue() : map == null || map.size() <= 0;
    }
}
