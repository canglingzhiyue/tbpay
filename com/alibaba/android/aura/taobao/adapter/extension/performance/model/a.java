package com.alibaba.android.aura.taobao.adapter.extension.performance.model;

import com.alibaba.android.aura.datamodel.parse.AURAParseIO;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.fulltrace.NWFullTracePlugin;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tb.arc;
import tb.ard;
import tb.bau;
import tb.kge;

/* loaded from: classes2.dex */
public final class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private JSONObject f2211a;

    static {
        kge.a(707119754);
    }

    public a(AURAParseIO aURAParseIO) {
        JSONObject a2;
        JSONObject jSONObject;
        List<com.alibaba.android.aura.datamodel.parse.a> data = aURAParseIO.getData();
        if (bau.a(data) || (a2 = data.get(0).a()) == null || (jSONObject = a2.getJSONObject("global")) == null) {
            return;
        }
        this.f2211a = jSONObject.getJSONObject("performanceStage");
    }

    public Map<String, String> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a014a89d", new Object[]{this});
        }
        JSONObject jSONObject = this.f2211a;
        if (jSONObject != null) {
            return a(jSONObject.getJSONObject("commonArgs"));
        }
        return null;
    }

    public List<AURAPerformanceStageModel> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("4a17df3e", new Object[]{this});
        }
        JSONObject jSONObject = this.f2211a;
        if (jSONObject == null) {
            return null;
        }
        JSONArray jSONArray = jSONObject.getJSONArray(NWFullTracePlugin.FullTraceJSParam.STAGES);
        if (bau.a(jSONArray)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<Object> it = jSONArray.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof JSONObject) {
                try {
                    arrayList.add(JSON.toJavaObject((JSONObject) next, AURAPerformanceStageModel.class));
                } catch (Exception e) {
                    ard a2 = arc.a();
                    a2.b("解析服务端透传性能数据结构出错:" + e.getMessage(), arc.a.a().b("AURAServerPerformanceModel").b());
                }
            }
        }
        return arrayList;
    }

    private Map<String, String> a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("2b563fbd", new Object[]{this, jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (String str : jSONObject.keySet()) {
            hashMap.put(str, jSONObject.getString(str));
        }
        return hashMap;
    }
}
