package com.alibaba.android.aura.service.event;

import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.s;
import com.alibaba.android.umf.datamodel.protocol.ultron.base.Event;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes2.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(673186526);
    }

    public static void a(s sVar, AURARenderComponent aURARenderComponent, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47515256", new Object[]{sVar, aURARenderComponent, str});
        } else {
            a(sVar, aURARenderComponent, str, (Map<String, Object>) null);
        }
    }

    public static void a(s sVar, AURARenderComponent aURARenderComponent, String str, Map<String, Object> map) {
        List<Event> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4f2d26f", new Object[]{sVar, aURARenderComponent, str, map});
        } else if (sVar != null && aURARenderComponent != null && aURARenderComponent.data != null && aURARenderComponent.data.events != null && (list = aURARenderComponent.data.events.get(str)) != null) {
            for (Event event : list) {
                if (event != null) {
                    a(sVar, event, aURARenderComponent, map);
                }
            }
        }
    }

    public static void a(s sVar, Event event, AURARenderComponent aURARenderComponent, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84fe5df6", new Object[]{sVar, event, aURARenderComponent, map});
            return;
        }
        d dVar = new d();
        dVar.a(event.getId());
        dVar.a(map);
        dVar.a(aURARenderComponent);
        dVar.a(event.getFields());
        c.a(sVar, event.getType(), dVar);
    }
}
