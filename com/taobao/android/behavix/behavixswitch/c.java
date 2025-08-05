package com.taobao.android.behavix.behavixswitch;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTAnalytics;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.dsp;
import tb.kge;

/* loaded from: classes.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private List<f> f9173a;
    private List<f> b;
    private List<f> c;
    private List<f> d;
    private List<f> e;
    private List<f> f;
    private Map<String, List<f>> g;
    private Map<String, List<f>> h;
    private Map<String, List<f>> i;
    private JSONArray j;
    private JSONArray k;

    static {
        kge.a(168979356);
    }

    public c(JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.size() <= 0) {
            return;
        }
        this.b = d.a(jSONObject.getJSONArray("sceneNIn"));
        this.c = d.a(jSONObject.getJSONArray("sceneIn"));
        this.f9173a = d.a(jSONObject.getJSONArray("actionTypeIn"));
        this.d = d.a(jSONObject.getJSONArray("actionNameIn"));
        this.e = d.a(jSONObject.getJSONArray("arg2in"));
        this.f = d.a(jSONObject.getJSONArray("arg3in"));
        this.g = d.a(jSONObject.getJSONObject("bizArgsIn"));
        this.h = d.a(jSONObject.getJSONObject("bizArgsNIn"));
        this.j = jSONObject.getJSONArray("taskType");
        this.k = jSONObject.getJSONArray("taskArray");
    }

    public c(JSONArray jSONArray, JSONArray jSONArray2, JSONArray jSONArray3, JSONArray jSONArray4, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        this.b = d.a(jSONArray2);
        this.c = d.a(jSONArray);
        this.f9173a = d.a(jSONArray3);
        this.d = d.a(jSONArray4);
        this.g = d.a(jSONObject);
        this.h = d.a(jSONObject2);
        this.i = d.a(jSONObject3);
    }

    public JSONArray a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONArray) ipChange.ipc$dispatch("dc1f20d6", new Object[]{this}) : this.k;
    }

    public boolean a(dsp dspVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e5c2057b", new Object[]{this, dspVar})).booleanValue();
        }
        if (!d.a(this.b) && d.a(this.b, dspVar.f26946a)) {
            return false;
        }
        if (!d.a(this.c) && !d.a(this.c, dspVar.f26946a)) {
            return false;
        }
        if (!d.a(this.d) && !d.a(this.d, dspVar.c)) {
            return false;
        }
        if (!d.a(this.f9173a) && !d.a(this.f9173a, dspVar.b)) {
            return false;
        }
        if (!d.a(this.e) && !d.a(this.e, dspVar.d)) {
            return false;
        }
        if (!d.a(this.f) && !d.a(this.f, dspVar.e)) {
            return false;
        }
        if (!d.a(this.g) && !a(this.g, dspVar.f())) {
            return false;
        }
        if (!d.a(this.h) && a(this.h, dspVar.f())) {
            return false;
        }
        return d.a(this.i) || a(this.i, dspVar.h());
    }

    private static boolean a(Map<String, List<f>> map, Map map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a0efabcc", new Object[]{map, map2})).booleanValue();
        }
        if (map.containsKey("_afc_id")) {
            if (map2 == null) {
                map2 = new HashMap();
            }
            map2.put("_afc_id", UTAnalytics.getInstance().getDefaultTracker().getGlobalProperty("_afc_id"));
        }
        if (a(map2)) {
            return false;
        }
        if (map2 != null) {
            if (map.size() > map2.size()) {
                return false;
            }
            for (Map.Entry<String, List<f>> entry : map.entrySet()) {
                List<f> value = entry.getValue();
                if (!d.a(value) && !d.a(value, (String) map2.get(entry.getKey()))) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean a(Map<?, ?> map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a421221", new Object[]{map})).booleanValue() : map == null || map.isEmpty();
    }
}
