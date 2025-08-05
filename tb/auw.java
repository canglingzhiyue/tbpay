package tb;

import com.alibaba.android.aura.b;
import com.alibaba.android.aura.datamodel.parse.AURAParseIO;
import com.alibaba.android.umf.datamodel.protocol.ultron.UltronDeltaProtocol;
import com.alibaba.android.umf.datamodel.service.rule.a;
import com.alibaba.android.umf.node.service.data.rule.RuleType;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class auw {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final JSONObject c;

    /* renamed from: a  reason: collision with root package name */
    private final String f25623a = "AURARuleFactory";
    private final Map<String, avc> b = new HashMap();
    private final avf d = new avf();

    static {
        kge.a(666082461);
    }

    public auw(JSONObject jSONObject) {
        this.c = jSONObject;
        a();
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.b.put(RuleType.LOCAL_ADJUST, this.d);
        this.b.put(RuleType.GROUP_SELECT, new avd());
        this.b.put(RuleType.PROPS_WRITE_BACK, new avg());
        this.b.put(RuleType.SWITCH_SELECT, new avh());
        this.b.put("kvmap", new ave());
    }

    public void a(String str, avb avbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20b1dab5", new Object[]{this, str, avbVar});
        } else {
            this.d.a(str, avbVar);
        }
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.d.a(str);
        }
    }

    public UltronDeltaProtocol a(a aVar, aqq<AURAParseIO> aqqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UltronDeltaProtocol) ipChange.ipc$dispatch("56ca237", new Object[]{this, aVar, aqqVar});
        }
        avc avcVar = this.b.get(aVar.f2839a);
        if (avcVar != null) {
            return avcVar.a(aVar, this.c, aqqVar);
        }
        if (aqqVar == null) {
            return null;
        }
        b bVar = new b(1, "AURARulesServiceDomain", "-2000_UNRECOGNIZED_NAME", "不识别的规则" + avcVar.a());
        HashMap hashMap = new HashMap();
        hashMap.put("name", aVar.f2839a);
        bVar.a(hashMap);
        aqqVar.a(bVar);
        return null;
    }
}
