package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.android.aura.datamodel.rule.b;
import com.alibaba.android.umf.datamodel.protocol.ultron.base.Component;
import com.alibaba.android.umf.datamodel.service.rule.a;
import com.alibaba.android.umf.node.service.data.rule.RuleType;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.arc;

/* loaded from: classes2.dex */
public class avh extends avc {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    private static final String f25629a = "sel";
    private static final String b = "unsel";

    static {
        kge.a(-250638675);
    }

    @Override // tb.avc
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : RuleType.SWITCH_SELECT;
    }

    @Override // tb.avc
    public Map<String, Component> a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("ef66eb32", new Object[]{this, aVar});
        }
        b bVar = aVar.d;
        if (bVar == null || bVar.f2137a == null) {
            arc.a a2 = arc.a.a();
            a2.b("SwitchSelectRule").a("AURARulesServiceDomain").a("errorCode", "-4000_EMPTY_ORIGIN_FIELD");
            arc.a().b("SwitchSelectRule规则originData.fields为空", a2.b());
            return null;
        }
        Component component = new Component();
        component.fields = new HashMap(bVar.f2137a);
        String str = (String) bbc.a(component.getFields(), "state", String.class, null);
        if (StringUtils.isEmpty(str)) {
            arc.a a3 = arc.a.a();
            a3.b("SwitchSelectRule").a("AURARulesServiceDomain").a("errorCode", "-4001_EMPTY_STATE");
            arc.a().b("SwitchSelectRule规则state为空", a3.b());
            return null;
        }
        component.getFields().put("state", f25629a.equals(str) ? b : f25629a);
        HashMap hashMap = new HashMap();
        hashMap.put(aVar.b, component);
        return hashMap;
    }
}
