package com.alibaba.android.ultron.ext.event.util;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.datamodel.imp.DMEvent;
import tb.kge;

/* loaded from: classes2.dex */
public final class i {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1357490422);
    }

    public static com.taobao.android.ultron.common.model.b a(com.taobao.android.ultron.common.model.b bVar, com.alibaba.android.ultron.vfw.instance.b bVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.ultron.common.model.b) ipChange.ipc$dispatch("7bbcadc5", new Object[]{bVar, bVar2});
        }
        if (bVar2.b() != null && bVar2.b().c() != null && (bVar2.b().c().get("events") instanceof JSONObject)) {
            JSONObject jSONObject = bVar2.b().c().getJSONObject("events");
            if (bVar.getType() != null && jSONObject != null && bVar.getType().startsWith("@") && (jSONObject.get(bVar.getType().substring(1)) instanceof JSONObject) && (jSONObject.getJSONObject(bVar.getType().substring(1)).get("type") instanceof String) && (jSONObject.getJSONObject(bVar.getType().substring(1)).get("fields") instanceof JSONObject)) {
                JSONObject jSONObject2 = new JSONObject();
                h.a(jSONObject2, jSONObject.getJSONObject(bVar.getType().substring(1)).getJSONObject("fields"));
                h.a(jSONObject2, bVar.getFields());
                return new DMEvent(jSONObject.getJSONObject(bVar.getType().substring(1)).getString("type"), jSONObject2, bVar.getComponents());
            }
        }
        return bVar;
    }
}
