package com.alibaba.analytics.core.config;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import tb.aqc;
import tb.kge;

/* loaded from: classes.dex */
public class j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-730440503);
    }

    public static final Map<String, String> a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d08f5a0b", new Object[]{jSONObject});
        }
        HashMap hashMap = new HashMap();
        try {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                String string = jSONObject.getString(next);
                if (next != null && string != null) {
                    hashMap.put(next, string);
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return hashMap;
    }

    public static List<k> b(JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("cdf1b032", new Object[]{jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                jSONObject2 = jSONObject.getJSONObject(next);
            } catch (JSONException e) {
                e.printStackTrace();
                jSONObject2 = null;
            }
            if (jSONObject2 != null) {
                try {
                    jSONObject3 = jSONObject2.getJSONObject("content");
                } catch (JSONException e2) {
                    e2.printStackTrace();
                    jSONObject3 = null;
                }
                if (jSONObject3 != null) {
                    linkedList.add(a(next, a(jSONObject3), 1L));
                }
            }
        }
        return linkedList;
    }

    public static k a(String str, Map<String, String> map, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (k) ipChange.ipc$dispatch("afef94fe", new Object[]{str, map, new Long(j)});
        }
        k kVar = new k();
        kVar.a(aqc.c(map));
        kVar.b(str);
        kVar.a(j);
        return kVar;
    }
}
