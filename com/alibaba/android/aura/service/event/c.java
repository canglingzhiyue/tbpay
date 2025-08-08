package com.alibaba.android.aura.service.event;

import mtopsdk.common.util.StringUtils;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.s;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.arc;
import tb.ard;
import tb.kge;

/* loaded from: classes2.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-74145660);
    }

    public static void a(s sVar, String str, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b2e70de", new Object[]{sVar, str, dVar});
        } else if (sVar == null || StringUtils.isEmpty(str)) {
            ard a2 = arc.a();
            a2.c("AURAEventDispatcher", "dispatch", "dispatch error, eventType=" + str);
        } else {
            sVar.a("aura.workflow.event", new AURAEventIO(str, dVar), null);
        }
    }

    public static void a(s sVar, AURARenderComponent aURARenderComponent, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81621cb4", new Object[]{sVar, aURARenderComponent, jSONArray});
            return;
        }
        for (int i = 0; i < jSONArray.size(); i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            d dVar = new d();
            dVar.a(jSONObject.getJSONObject("fields"));
            dVar.a(aURARenderComponent);
            a(sVar, jSONObject.getString("type"), dVar);
        }
    }
}
