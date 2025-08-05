package com.taobao.android.detail.core.aura.widget;

import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentData;
import com.alibaba.android.aura.s;
import com.alibaba.android.aura.service.event.d;
import com.alibaba.android.umf.datamodel.protocol.ultron.base.Event;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;
import tb.axe;
import tb.emu;
import tb.jph;
import tb.kge;

/* loaded from: classes4.dex */
public class b extends axe {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_HASH = -3981136684558627541L;

    static {
        kge.a(408567004);
    }

    public b() {
        emu.a("com.taobao.android.detail.core.aura.widget.AliDetailHandleDinamicXEventWithIndexHandler");
    }

    @Override // tb.axe, tb.aru
    public boolean a(d dVar, s sVar) {
        AURARenderComponentData aURARenderComponentData;
        Map<String, List<Event>> map;
        Object[] e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("673e7098", new Object[]{this, dVar, sVar})).booleanValue();
        }
        AURARenderComponent d = dVar.d();
        if (d != null && (aURARenderComponentData = d.data) != null && (map = aURARenderComponentData.events) != null && (e = dVar.e()) != null && e.length >= 2 && (e[0] instanceof String) && (e[1] instanceof String)) {
            String str = (String) e[1];
            List<Event> list = map.get((String) e[0]);
            if (list != null && !list.isEmpty()) {
                for (Event event : list) {
                    if (event != null) {
                        JSONObject jSONObject = new JSONObject();
                        if (aURARenderComponentData.fields != null) {
                            jSONObject.putAll(aURARenderComponentData.fields);
                        }
                        JSONObject jSONObject2 = null;
                        if (event.fields != null) {
                            jSONObject2 = JSON.parseObject(event.fields.toJSONString());
                        }
                        Object a2 = jph.a(jSONObject, jSONObject2, str);
                        JSONObject jSONObject3 = new JSONObject();
                        if (a2 instanceof JSONObject) {
                            jSONObject3.putAll((Map) a2);
                        }
                        d dVar2 = new d(dVar);
                        dVar2.a(jSONObject3);
                        a(event.type, dVar2, sVar);
                    }
                }
                return true;
            }
        }
        return false;
    }
}
