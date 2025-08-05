package tb;

import android.text.TextUtils;
import com.alibaba.android.aura.datamodel.rule.b;
import com.alibaba.android.umf.datamodel.protocol.ultron.base.Component;
import com.alibaba.android.umf.datamodel.service.rule.a;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class bqn extends bqj {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    private static final String f26044a = "sel";
    private static final String b = "unsel";

    static {
        kge.a(462293576);
    }

    @Override // tb.bqj
    public Map<String, Component> a(a aVar, bqi bqiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("3134f9e8", new Object[]{this, aVar, bqiVar});
        }
        b bVar = aVar.d;
        if (bVar == null || bVar.f2137a == null) {
            a(1, "-4000_EMPTY_ORIGIN_FIELD", "SwitchSelectRule规则originData.fields为空");
            return null;
        }
        Component component = new Component();
        component.fields = new HashMap(bVar.f2137a);
        String str = (String) bbc.a(component.getFields(), "state", String.class, null);
        if (TextUtils.isEmpty(str)) {
            a(1, "-4001_EMPTY_STATE", "SwitchSelectRule规则state为空");
            return null;
        }
        component.getFields().put("state", f26044a.equals(str) ? b : f26044a);
        HashMap hashMap = new HashMap();
        hashMap.put(aVar.b, component);
        return hashMap;
    }
}
