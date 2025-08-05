package com.alibaba.android.ultron.common.page;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.bkt;
import tb.kge;

/* loaded from: classes2.dex */
public class f extends bkt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1335847417);
    }

    @Override // tb.bkt
    public JSONObject a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("429586a8", new Object[]{this, jSONObject});
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("type", "mtopV3");
        jSONObject2.put("fields", (Object) com.alibaba.android.ultron.ext.event.util.h.a(jSONObject));
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("type", "success");
        a(jSONObject2, "success", "loadData", jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        jSONObject4.put("type", "fail");
        a(jSONObject2, "fail", "loadData", jSONObject4);
        return jSONObject2;
    }
}
