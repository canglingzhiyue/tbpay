package tb;

import com.alibaba.android.aura.datamodel.rule.b;
import com.alibaba.android.umf.datamodel.protocol.ultron.base.Component;
import com.alibaba.android.umf.datamodel.protocol.ultron.base.Event;
import com.alibaba.android.umf.datamodel.service.rule.a;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class bqm extends bqj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1744989390);
    }

    public static /* synthetic */ Object ipc$super(bqm bqmVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.bqj
    public Map<String, Component> a(a aVar, bqi bqiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("3134f9e8", new Object[]{this, aVar, bqiVar});
        }
        b bVar = aVar.d;
        b bVar2 = aVar.c;
        if (bVar2 == null || bVar == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        Component component = new Component();
        if (bVar2.f2137a != null) {
            component.fields = bVar.f2137a != null ? new HashMap(bVar.f2137a) : new HashMap();
            component.getFields().putAll(bVar2.f2137a);
        }
        if (bVar2.b != null) {
            component.events = bVar.b != null ? new HashMap(bVar.b) : new HashMap();
            a(component.getEvents(), bVar2.b);
        }
        if (bVar2.c != null) {
            component.localFields = bVar.c != null ? new HashMap(bVar.c) : new HashMap();
            component.getLocalFields().putAll(bVar2.c);
        }
        hashMap.put(aVar.b, component);
        return hashMap;
    }

    private void a(Map<String, List<Event>> map, Map<String, List<Event>> map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0efabc8", new Object[]{this, map, map2});
            return;
        }
        for (String str : map2.keySet()) {
            List<Event> list = map2.get(str);
            if (list != null) {
                List<Event> list2 = map.get(str);
                if (list2 != null) {
                    list2.addAll(list);
                } else {
                    map.put(str, list);
                }
            }
        }
    }
}
