package tb;

import android.text.TextUtils;
import com.alibaba.android.aura.datamodel.rule.b;
import com.alibaba.android.umf.datamodel.protocol.ultron.base.Component;
import com.alibaba.android.umf.datamodel.protocol.ultron.base.Event;
import com.alibaba.android.umf.datamodel.service.rule.a;
import com.alibaba.android.umf.node.service.data.rule.RuleType;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class avg extends avc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-483103757);
    }

    public static /* synthetic */ Object ipc$super(avg avgVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.avc
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : RuleType.PROPS_WRITE_BACK;
    }

    @Override // tb.avc
    public Map<String, Component> a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("ef66eb32", new Object[]{this, aVar});
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
                    if (baz.a("enableNewActionParams", true)) {
                        a(list2, list);
                    } else {
                        list2.addAll(list);
                    }
                } else {
                    map.put(str, list);
                }
            }
        }
    }

    private void a(List<Event> list, List<Event> list2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78fe44a", new Object[]{this, list, list2});
            return;
        }
        for (Event event : list2) {
            Event a2 = a(list, event.getType());
            if (a2 != null) {
                list.remove(a2);
            }
            list.add(event);
        }
    }

    private Event a(List<Event> list, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Event) ipChange.ipc$dispatch("17916590", new Object[]{this, list, str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        for (Event event : list) {
            if (str.equals(event.getType())) {
                return event;
            }
        }
        return null;
    }
}
