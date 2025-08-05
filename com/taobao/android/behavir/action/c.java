package com.taobao.android.behavir.action;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.util.g;
import java.util.Map;
import tb.dqq;
import tb.kge;

/* loaded from: classes4.dex */
public class c implements a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String NAME = "NotificationAction";

    static {
        kge.a(976387643);
        kge.a(988163184);
    }

    @Override // com.taobao.android.behavir.action.a
    public void a(com.taobao.android.behavir.solution.f fVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5db9bc6", new Object[]{this, fVar, jSONObject});
        } else if (jSONObject != null) {
            dqq.a(jSONObject.getInnerMap());
            JSONObject jSONObject2 = jSONObject.getJSONObject("schemeMap");
            if (jSONObject2 == null) {
                return;
            }
            if (jSONObject2.size() > 1) {
                z = true;
            }
            for (Map.Entry<String, Object> entry : jSONObject2.entrySet()) {
                String key = entry.getKey();
                if (z) {
                    jSONObject = (JSONObject) jSONObject.clone();
                    jSONObject.put("schemeMap", (Object) g.a(key, entry.getValue()));
                }
                Map<String, Object> innerMap = jSONObject.getInnerMap();
                dqq.a(innerMap, "BHRNotificationName." + key);
            }
        }
    }
}
