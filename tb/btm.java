package tb;

import com.alibaba.analytics.core.model.LogField;
import com.alibaba.appmonitor.event.EventType;
import com.alibaba.appmonitor.event.d;
import com.alibaba.appmonitor.event.g;
import com.alibaba.appmonitor.model.UTDimensionValueSet;
import com.alibaba.appmonitor.pool.ReuseJSONArray;
import com.alibaba.appmonitor.pool.a;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class btm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1760588967);
    }

    public static void a(Map<UTDimensionValueSet, List<d>> map) {
        Integer eventId;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{map});
            return;
        }
        for (Map.Entry<UTDimensionValueSet, List<d>> entry : map.entrySet()) {
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            UTDimensionValueSet key = entry.getKey();
            List<d> value = entry.getValue();
            if (value.size() != 0 && (eventId = key.getEventId()) != null) {
                EventType eventType = EventType.getEventType(eventId.intValue());
                g gVar = (g) a.a().a(g.class, new Object[0]);
                gVar.b = eventId.intValue();
                gVar.f.putAll(bsw.d());
                if (key.getMap() != null) {
                    gVar.f.putAll(key.getMap());
                    gVar.f.remove("commitDay");
                }
                HashMap hashMap = new HashMap();
                hashMap.put("meta", bta.a());
                ReuseJSONArray reuseJSONArray = (ReuseJSONArray) a.a().a(ReuseJSONArray.class, new Object[0]);
                int i = 0;
                for (d dVar : value) {
                    reuseJSONArray.add(dVar.a());
                    if (i == 0) {
                        sb.append(dVar.e);
                        sb2.append(dVar.f);
                    } else {
                        sb.append(",");
                        sb.append(dVar.e);
                        sb2.append(",");
                        sb2.append(dVar.f);
                    }
                    i++;
                    a.a().a((a) dVar);
                }
                hashMap.put("data", reuseJSONArray);
                gVar.f.put(eventType.getAggregateEventArgsKey(), JSON.toJSONString(hashMap));
                String sb3 = sb.toString();
                String sb4 = sb2.toString();
                gVar.f.put(LogField.ARG1.toString(), sb3);
                gVar.f.put(LogField.ARG2.toString(), sb4);
                gVar.c = sb3;
                gVar.d = sb4;
                b(gVar);
                a.a().a((a) reuseJSONArray);
            }
            a.a().a((a) key);
        }
    }

    public static void a(UTDimensionValueSet uTDimensionValueSet, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8e8756f", new Object[]{uTDimensionValueSet, dVar});
            return;
        }
        Integer eventId = uTDimensionValueSet.getEventId();
        if (eventId == null) {
            return;
        }
        EventType eventType = EventType.getEventType(eventId.intValue());
        g gVar = (g) a.a().a(g.class, new Object[0]);
        gVar.b = 6699;
        gVar.c = dVar.e;
        gVar.d = dVar.f;
        gVar.f.putAll(bsw.d());
        if (uTDimensionValueSet.getMap() != null) {
            gVar.f.putAll(uTDimensionValueSet.getMap());
            gVar.f.remove("commitDay");
        }
        HashMap hashMap = new HashMap();
        hashMap.put("meta", bta.a());
        hashMap.put("_event_id", eventId);
        ReuseJSONArray reuseJSONArray = (ReuseJSONArray) a.a().a(ReuseJSONArray.class, new Object[0]);
        reuseJSONArray.add(dVar.a());
        a.a().a((a) dVar);
        hashMap.put("data", reuseJSONArray);
        gVar.f.put(eventType.getAggregateEventArgsKey(), JSON.toJSONString(hashMap));
        gVar.f.put(LogField.EVENTID.toString(), String.valueOf(6699));
        b(gVar);
        a.a().a((a) reuseJSONArray);
    }

    public static void a(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69b504da", new Object[]{gVar});
        } else if (gVar == null) {
        } else {
            apf.a().a(new com.alibaba.analytics.core.model.a(gVar.f2886a, String.valueOf(gVar.b), gVar.c, gVar.d, gVar.e, gVar.f));
            a.a().a((a) gVar);
        }
    }

    public static void b(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d5cd85b", new Object[]{gVar});
            return;
        }
        apf.a().a(new com.alibaba.analytics.core.model.a(gVar.f2886a, String.valueOf(gVar.b), gVar.c, gVar.d, gVar.e, gVar.f));
        a.a().a((a) gVar);
    }
}
