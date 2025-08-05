package com.taobao.android.ultron.performence.model;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.fulltrace.NWFullTracePlugin;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes6.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private JSONObject f15788a;
    private List<c> b;

    static {
        kge.a(-470205265);
    }

    public a(JSONObject jSONObject) {
        this.f15788a = jSONObject;
        this.b = a(jSONObject);
    }

    private List<c> a(JSONObject jSONObject) {
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("3f6755bf", new Object[]{this, jSONObject});
        }
        JSONObject b = b(jSONObject);
        if (b != null && (jSONArray = b.getJSONArray(NWFullTracePlugin.FullTraceJSParam.STAGES)) != null && !jSONArray.isEmpty()) {
            try {
                ArrayList arrayList = new ArrayList();
                Iterator<Object> it = jSONArray.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (next instanceof JSONObject) {
                        JSONObject jSONObject2 = (JSONObject) next;
                        c cVar = new c(jSONObject2.getString("stageName"), jSONObject2.getLongValue("startTimeMills"), jSONObject2.getLongValue("endTimeMills"));
                        cVar.a(c(jSONObject2.getJSONObject("args")));
                        arrayList.add(cVar);
                    }
                }
                return arrayList;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    private JSONObject b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("7b75e747", new Object[]{this, jSONObject});
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("global");
        if (jSONObject2 != null) {
            return jSONObject2.getJSONObject("performanceStage");
        }
        return null;
    }

    public List<c> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("627608df", new Object[]{this}) : this.b;
    }

    public Map<String, String> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("6dbf0a5e", new Object[]{this});
        }
        JSONObject b = b(this.f15788a);
        if (b != null) {
            return c(b.getJSONObject("commonArgs"));
        }
        return null;
    }

    private HashMap<String, String> c(JSONObject jSONObject) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("154a04a9", new Object[]{this, jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        HashMap<String, String> hashMap = new HashMap<>();
        for (String str : jSONObject.keySet()) {
            if (str != null && (obj = jSONObject.get(str)) != null) {
                if (obj instanceof String) {
                    hashMap.put(str, (String) obj);
                } else {
                    hashMap.put(str, String.valueOf(obj));
                }
            }
        }
        return hashMap;
    }
}
