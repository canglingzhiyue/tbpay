package com.taobao.android.behavir.action;

import android.taobao.windvane.standardmodal.WVStandardEventCenter;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.util.g;
import java.util.Map;
import tb.kge;

/* loaded from: classes4.dex */
public class f implements a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String NAME = "UCPJSNotificationAction";
    public static final String NAME_OLD = "WindvaneMsg";

    static {
        kge.a(1433052114);
        kge.a(988163184);
    }

    @Override // com.taobao.android.behavir.action.a
    public void a(com.taobao.android.behavir.solution.f fVar, JSONObject jSONObject) {
        String str;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5db9bc6", new Object[]{this, fVar, jSONObject});
        } else if (jSONObject != null && fVar != null) {
            jSONObject.put("triggerEvent", (Object) fVar.a());
            jSONObject.put("triggerConfig", (Object) fVar.b());
            String jSONString = jSONObject.toJSONString();
            WVStandardEventCenter.postNotificationToJS("br_msgChannel", jSONString);
            JSONObject jSONObject2 = jSONObject.getJSONObject("schemeMap");
            if (jSONObject2 == null) {
                return;
            }
            if (jSONObject2.size() > 1) {
                z = true;
            }
            if (z) {
                jSONObject = (JSONObject) jSONObject.clone();
            }
            for (Map.Entry<String, Object> entry : jSONObject2.entrySet()) {
                String key = entry.getKey();
                if (z) {
                    jSONObject.put("schemeMap", (Object) g.a(key, entry.getValue()));
                    str = jSONObject.toJSONString();
                } else {
                    str = jSONString;
                }
                WVStandardEventCenter.postNotificationToJS("br_msgChannel." + key, str);
            }
        }
    }
}
