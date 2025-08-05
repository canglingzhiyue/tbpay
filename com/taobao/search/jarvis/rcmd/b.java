package com.taobao.search.jarvis.rcmd;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.jyb;
import tb.kge;

/* loaded from: classes7.dex */
public class b implements jyb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1273085990);
        kge.a(653307216);
    }

    @Override // tb.jyb
    public Map<String, Object> a(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("2b563fbd", new Object[]{this, jSONObject});
        }
        HashMap hashMap = new HashMap();
        if (jSONObject != null && !jSONObject.isEmpty() && (jSONObject2 = jSONObject.getJSONObject("jarvisData")) != null && !jSONObject2.isEmpty()) {
            hashMap.putAll(jSONObject2.getInnerMap());
        }
        return hashMap;
    }
}
