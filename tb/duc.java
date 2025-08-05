package tb;

import android.support.v7.widget.RecyclerView;
import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.f;
import com.alibaba.android.aura.q;
import com.alibaba.android.aura.s;
import com.alibaba.android.umf.datamodel.service.rule.UMFRuleIO;
import com.alibaba.android.umf.datamodel.service.rule.a;
import com.alibaba.android.umf.node.service.data.rule.RuleType;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@AURAExtensionImpl(code = "alibuy.impl.render.scroll")
/* loaded from: classes4.dex */
public final class duc implements atg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private s f26984a;
    private AURAGlobalData b;

    static {
        kge.a(889741236);
        kge.a(836884500);
    }

    @Override // tb.atg
    public void a(RecyclerView recyclerView, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2febb876", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
        }
    }

    @Override // tb.arl
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        }
    }

    @Override // tb.atg
    public void a(RecyclerView recyclerView, int i) {
        AURAGlobalData aURAGlobalData;
        List list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85acc02d", new Object[]{this, recyclerView, new Integer(i)});
        } else if (i == 1 && this.f26984a != null && (aURAGlobalData = this.b) != null && (list = (List) aURAGlobalData.get("render_view_item_models", List.class)) != null) {
            for (Object obj : new ArrayList(list)) {
                if (obj instanceof AURARenderComponent) {
                    AURARenderComponent aURARenderComponent = (AURARenderComponent) obj;
                    if (aURARenderComponent.data != null && aURARenderComponent.data.fields != null) {
                        Map<String, Object> map = aURARenderComponent.data.fields;
                        if (map.get("showQuantity") != null && map.get("showQuantity").equals("true")) {
                            a(this.f26984a, aURARenderComponent);
                        }
                    }
                }
            }
        }
    }

    @Override // tb.ark
    public void onDataChanged(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, aqs aqsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21929b2a", new Object[]{this, aURAFlowData, aURAGlobalData, aqsVar});
        } else {
            this.b = aURAGlobalData;
        }
    }

    @Override // tb.arl
    public void onCreate(q qVar, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b74b967f", new Object[]{this, qVar, fVar});
        } else {
            this.f26984a = qVar.b();
        }
    }

    private void a(s sVar, AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4b5738c", new Object[]{this, sVar, aURARenderComponent});
            return;
        }
        a aVar = new a();
        aVar.f2839a = RuleType.PROPS_WRITE_BACK;
        aVar.d.f2137a = new HashMap();
        aVar.d.c = new HashMap();
        aVar.d.b = new HashMap();
        aVar.b = aURARenderComponent.key;
        if (aURARenderComponent.data != null) {
            if (aURARenderComponent.data.fields != null) {
                aVar.d.f2137a.putAll(aURARenderComponent.data.fields);
            }
            if (aURARenderComponent.data.localFields != null) {
                aVar.d.c.putAll(aURARenderComponent.data.localFields);
            }
            if (aURARenderComponent.data.events != null) {
                aVar.d.b.putAll(aURARenderComponent.data.events);
            }
        }
        HashMap hashMap = new HashMap();
        hashMap.put("showQuantity", "false");
        aVar.c.f2137a = hashMap;
        aVar.c.c = hashMap;
        aVar.c.b = new HashMap();
        sVar.a("aura.workflow.adjustRules", new UMFRuleIO(Arrays.asList(aVar)), null);
    }
}
