package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentData;
import com.alibaba.android.aura.f;
import com.alibaba.android.aura.q;
import com.alibaba.android.aura.service.event.AURAEventIO;
import com.alibaba.android.aura.service.event.d;
import com.alibaba.android.umf.datamodel.service.rule.UMFRuleIO;
import com.alibaba.android.umf.datamodel.service.rule.a;
import com.alibaba.android.umf.node.service.data.rule.b;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@AURAExtensionImpl(code = "aura.impl.event.adjustRules")
/* loaded from: classes2.dex */
public final class ary extends arv {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "adjustRules";

    /* renamed from: a  reason: collision with root package name */
    private final String f25543a = "actionType";
    private final String b = "actionParams";
    private final String c = "params";
    private final String e = "newActionParams";
    private final Map<Class<? extends DXEvent>, brd> d = new HashMap();

    static {
        kge.a(-259165542);
    }

    public static /* synthetic */ Object ipc$super(ary aryVar, String str, Object... objArr) {
        if (str.hashCode() == -1219783041) {
            super.onCreate((q) objArr[0], (f) objArr[1]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.arw
    public String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : "adjustRules";
    }

    @Override // tb.arv, tb.arl
    public void onCreate(q qVar, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b74b967f", new Object[]{this, qVar, fVar});
            return;
        }
        super.onCreate(qVar, fVar);
        f();
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        brf brfVar = new brf("aura.workflow.adjustRules");
        this.d.put(brfVar.b(), brfVar);
        brg brgVar = new brg("aura.workflow.syncState");
        this.d.put(brgVar.b(), brgVar);
        bre breVar = new bre("aura.workflow.adjustRules");
        this.d.put(breVar.b(), breVar);
        ixo ixoVar = new ixo(b().e(), "aura.workflow.syncState");
        this.d.put(ixoVar.b(), ixoVar);
    }

    @Override // tb.arv
    public void b(AURAEventIO aURAEventIO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("186833d5", new Object[]{this, aURAEventIO});
        } else {
            a(aURAEventIO.getEventModel());
        }
    }

    private void a(d dVar) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb347aad", new Object[]{this, dVar});
            return;
        }
        AURARenderComponent d = dVar.d();
        DXEvent g = dVar.g();
        if (d == null) {
            arc.a().c(getClass().getSimpleName(), "executeAdjustRulesWorkFlow", "renderComponent is null");
            return;
        }
        AURARenderComponentData aURARenderComponentData = d.data;
        String b = b(dVar);
        if (b == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        a(hashMap, dVar.c());
        if (g == null) {
            str = "aura.workflow.adjustRules";
        } else {
            brd brdVar = this.d.get(g.getClass());
            if (brdVar == null) {
                brdVar = this.d.get(bre.EventType);
            }
            String a2 = brdVar.a();
            brdVar.a(d, g, dVar.e(), hashMap);
            str = a2;
        }
        a aVar = new a();
        aVar.f2839a = b;
        if (aURARenderComponentData != null) {
            aVar.d.f2137a = aURARenderComponentData.fields;
            aVar.d.b = aURARenderComponentData.events;
        }
        if ("true".equals(hashMap.get("newActionParams"))) {
            Object obj = hashMap.get("events");
            if (obj instanceof JSONObject) {
                aVar.c.b = ifv.a((JSONObject) obj);
            }
            Object obj2 = hashMap.get("fields");
            if (obj2 instanceof JSONObject) {
                aVar.c.f2137a = (JSONObject) obj2;
            }
            Object obj3 = hashMap.get("localFields");
            if (obj3 instanceof JSONObject) {
                aVar.c.c = (JSONObject) obj3;
            }
        } else {
            aVar.c.f2137a = hashMap;
        }
        aVar.b = d.key;
        b().b().a(str, new UMFRuleIO(Arrays.asList(aVar)), null);
    }

    private String b(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b73f8d72", new Object[]{this, dVar});
        }
        String a2 = a(dVar.c());
        return StringUtils.isEmpty(a2) ? a(dVar.e()) : a2;
    }

    private String a(Object[] objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2583e9f7", new Object[]{this, objArr});
        }
        if (objArr == null || objArr.length < 2) {
            arc.a().c(getClass().getSimpleName(), "executeAdjustRulesWorkFlow", "args length is less than 2");
            return null;
        }
        Object b = b(objArr);
        if (!(b instanceof String)) {
            arc.a().c(getClass().getSimpleName(), "executeAdjustRulesWorkFlow", "args[1] is not string type");
            return null;
        }
        return (String) b;
    }

    private String a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("15c87a18", new Object[]{this, jSONObject});
        }
        if (jSONObject != null) {
            return jSONObject.getString("actionType");
        }
        return null;
    }

    private Object b(Object[] objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("bf61378a", new Object[]{this, objArr});
        }
        List<String> a2 = b.a();
        for (Object obj : objArr) {
            if (a2.contains(obj)) {
                return obj;
            }
        }
        return null;
    }

    private void a(Map<String, Object> map, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0fa073", new Object[]{this, map, jSONObject});
        } else if (jSONObject == null) {
        } else {
            JSONObject jSONObject2 = jSONObject.getJSONObject("actionParams");
            if (jSONObject2 != null) {
                map.putAll(jSONObject2);
            }
            JSONObject jSONObject3 = jSONObject.getJSONObject("params");
            if (jSONObject3 == null) {
                return;
            }
            map.put("params", jSONObject3);
        }
    }
}
