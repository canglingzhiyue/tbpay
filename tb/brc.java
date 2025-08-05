package tb;

import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.umf.datamodel.b;
import com.alibaba.android.umf.datamodel.service.rule.UMFRuleIO;
import com.alibaba.android.umf.datamodel.service.rule.a;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class brc extends brb {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "adjustRules";

    /* renamed from: a  reason: collision with root package name */
    private final String f26056a = "UMFAdjustRulesEventAbility";
    private final Map<Class<? extends DXEvent>, brd> b = new HashMap();

    static {
        kge.a(1425647288);
    }

    @Override // tb.bri
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "adjustRules";
    }

    public brc() {
        b();
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        brf brfVar = new brf("umf.workflow.rules");
        this.b.put(brfVar.b(), brfVar);
        brg brgVar = new brg("umf.workflow.adjustRuleInput");
        this.b.put(brgVar.b(), brgVar);
        bre breVar = new bre("umf.workflow.rules");
        this.b.put(breVar.b(), breVar);
    }

    @Override // tb.brb
    public void a(brh brhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e24699c0", new Object[]{this, brhVar});
        } else {
            a(brhVar.c(), brhVar.d(), brhVar.e(), brhVar.f());
        }
    }

    public void a(b bVar, AURARenderComponent aURARenderComponent, Object[] objArr, DXEvent dXEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1351c4c1", new Object[]{this, bVar, aURARenderComponent, objArr, dXEvent});
        } else if (objArr.length < 2) {
            bqe.a().c("UMFAdjustRulesEventAbility", "testDeltaRenderService#args length is less than 3");
        } else {
            Object obj = objArr[1];
            if (!(obj instanceof String)) {
                bqe.a().c("UMFAdjustRulesEventAbility", "testDeltaRenderService#args[1] or args[2] is not string type");
                return;
            }
            a aVar = new a();
            aVar.f2839a = (String) obj;
            aVar.d.f2137a = aURARenderComponent.data.fields;
            HashMap hashMap = new HashMap();
            if (dXEvent != null) {
                brd brdVar = this.b.get(dXEvent.getClass());
                if (brdVar == null) {
                    brdVar = this.b.get(bre.EventType);
                }
                brdVar.a();
                brdVar.a(aURARenderComponent, dXEvent, objArr, hashMap);
            }
            aVar.c.f2137a = hashMap;
            aVar.b = aURARenderComponent.key;
            new UMFRuleIO(Arrays.asList(aVar));
            bVar.b();
        }
    }
}
