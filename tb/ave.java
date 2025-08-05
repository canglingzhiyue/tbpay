package tb;

import android.text.TextUtils;
import com.alibaba.android.aura.datamodel.rule.b;
import com.alibaba.android.umf.datamodel.protocol.ultron.base.Component;
import com.alibaba.android.umf.datamodel.protocol.ultron.base.Event;
import com.alibaba.android.umf.datamodel.service.rule.a;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.arc;
import tb.bbd;

/* loaded from: classes2.dex */
public class ave extends avc {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_KV_MAPPINGS = "kvmap";
    public static final String KEY_SOURCE_DATA = "data";
    public static final String KEY_SOURCE_PATH = "source";
    public static final String KEY_TARGET_PATH = "target";

    static {
        kge.a(-1129381890);
    }

    public static /* synthetic */ Object ipc$super(ave aveVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.avc
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "kvmap";
    }

    @Override // tb.avc
    public Map<String, Component> a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("ef66eb32", new Object[]{this, aVar});
        }
        b bVar = aVar.c;
        if (bVar == null) {
            arc.a a2 = arc.a.a();
            a2.b("KVMappingRule").a("AURARulesServiceDomain");
            arc.a().b("无效的KVMappingRule输入:ruleInput", a2.b());
            return null;
        }
        List a3 = bbd.b.a(bVar.f2137a, "kvmap");
        if (a3 == null) {
            arc.a a4 = arc.a.a();
            a4.b("KVMappingRule").a("AURARulesServiceDomain");
            arc.a().b("无效的KVMappingRule输入:kvMappings", a4.b());
            return null;
        }
        Map<String, Object> b = bbd.b.b(bVar.f2137a, "data");
        if (b == null) {
            arc.a a5 = arc.a.a();
            a5.b("KVMappingRule").a("AURARulesServiceDomain");
            arc.a().b("无效的KVMappingRule输入:sourceData", a5.b());
            return null;
        }
        b bVar2 = aVar.d;
        if (bVar2 == null) {
            arc.a a6 = arc.a.a();
            a6.b("KVMappingRule").a("AURARulesServiceDomain");
            arc.a().b("无效的KVMappingRule输入:ruleOrigin", a6.b());
            return null;
        }
        Component a7 = a(bVar2);
        HashMap hashMap = new HashMap();
        hashMap.put(aVar.b, a7);
        a(a3, b, a7);
        a(a7);
        return hashMap;
    }

    private Component a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Component) ipChange.ipc$dispatch("9de1cc01", new Object[]{this, bVar});
        }
        Component component = new Component();
        if (bVar.f2137a != null) {
            if (component.getFields() == null) {
                component.fields = new HashMap();
            }
            component.getFields().putAll(bVar.f2137a);
        }
        if (bVar.b != null) {
            if (component.getEvents() == null) {
                component.events = new HashMap();
            }
            component.getEvents().putAll(bVar.b);
        }
        if (bVar.c != null) {
            if (component.getLocalFields() == null) {
                component.localFields = new HashMap();
            }
            component.getLocalFields().putAll(bVar.c);
        }
        return component;
    }

    private boolean a(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a421221", new Object[]{this, map})).booleanValue();
        }
        if (bbd.b.c(map, "source") == null) {
            return false;
        }
        String c = bbd.b.c(map, "target");
        if (TextUtils.isEmpty(c)) {
            return false;
        }
        return bbd.b.a(c) || bbd.b.b(c);
    }

    private void a(List list, Map<String, Object> map, Component component) {
        String string;
        Map a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbe45fc6", new Object[]{this, list, map, component});
            return;
        }
        for (Object obj : list) {
            if (obj instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) obj;
                if (a(jSONObject)) {
                    String string2 = jSONObject.getString("source");
                    Object a3 = (TextUtils.isEmpty(string2) || TextUtils.equals(string2, "*")) ? map : bbd.b.a(string2.split("\\."), map);
                    if (a3 != null && (a2 = bbd.b.a((string = jSONObject.getString("target")), component)) != null) {
                        String[] f = bbd.b.f(string);
                        if (f == null) {
                            if (a3 instanceof Map) {
                                a2.putAll((Map) a3);
                            }
                        } else {
                            bbd.b.a(f, a2, a3);
                        }
                    }
                }
            }
        }
    }

    private void a(Component component) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb63d022", new Object[]{this, component});
            return;
        }
        bbd.a.a(component.getFields(), component.getFields());
        if (component.getEvents() == null) {
            return;
        }
        for (List<Event> list : component.getEvents().values()) {
            if (list != null) {
                for (Event event : list) {
                    if (event != null) {
                        bbd.a.a(event.getFields(), component.getFields());
                    }
                }
            }
        }
    }
}
