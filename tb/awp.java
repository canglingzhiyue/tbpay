package tb;

import android.support.v7.widget.RecyclerView;
import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentData;
import com.alibaba.android.aura.f;
import com.alibaba.android.aura.q;
import com.alibaba.android.aura.service.event.AURAEventKey;
import com.alibaba.android.aura.service.event.c;
import com.alibaba.android.aura.service.event.d;
import com.alibaba.android.umf.datamodel.protocol.ultron.base.Event;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;

@AURAExtensionImpl(code = "aura.impl.component.lifeCycle.exposureItem")
/* loaded from: classes2.dex */
public final class awp implements atd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private q f25655a;
    private awr b;
    private awq c;
    private Boolean d;

    static {
        kge.a(-1487021052);
        kge.a(1021924628);
    }

    @Override // tb.atd
    public void b(RecyclerView.ViewHolder viewHolder, int i, AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a6cf7dc", new Object[]{this, viewHolder, new Integer(i), aURARenderComponent});
        }
    }

    @Override // tb.arl
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        }
    }

    public static /* synthetic */ List a(awp awpVar, AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("c4da94ca", new Object[]{awpVar, aURARenderComponent}) : awpVar.c(aURARenderComponent);
    }

    public static /* synthetic */ void a(awp awpVar, List list, AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d27bfccc", new Object[]{awpVar, list, aURARenderComponent});
        } else {
            awpVar.a(list, aURARenderComponent);
        }
    }

    @Override // tb.arl
    public void onCreate(q qVar, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b74b967f", new Object[]{this, qVar, fVar});
            return;
        }
        this.f25655a = qVar;
        this.b = (awr) fVar.a(awr.class);
    }

    private boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        if (this.d == null) {
            this.d = (Boolean) this.f25655a.a("enableAsyncUT", Boolean.class, false);
        }
        Boolean bool = this.d;
        return bool != null && bool.booleanValue();
    }

    @Override // tb.ark
    public void onDataChanged(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, aqs aqsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21929b2a", new Object[]{this, aURAFlowData, aURAGlobalData, aqsVar});
            return;
        }
        awq awqVar = (awq) aURAGlobalData.get("exposureItemRecorder", awq.class);
        if (awqVar == null) {
            awqVar = new awq();
            aURAGlobalData.update("exposureItemRecorder", awqVar);
        }
        this.c = awqVar;
    }

    @Override // tb.atd
    public void a(RecyclerView.ViewHolder viewHolder, int i, AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1afd1cfd", new Object[]{this, viewHolder, new Integer(i), aURARenderComponent});
        } else if (aURARenderComponent.isAsync()) {
            if (!aURARenderComponent.asyncStatus().equals("success")) {
                return;
            }
            a(aURARenderComponent);
        } else {
            a(aURARenderComponent);
        }
    }

    private void a(final AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca7f23d3", new Object[]{this, aURARenderComponent});
        } else if (!b(aURARenderComponent)) {
        } else {
            if (a()) {
                bbh.a(new Runnable() { // from class: tb.awp.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        try {
                            awp.a(awp.this, awp.a(awp.this, aURARenderComponent), aURARenderComponent);
                        } catch (Throwable th) {
                            ard a2 = arc.a();
                            a2.b("checkAndExecuteComponentEvent exception " + th.toString());
                        }
                    }
                });
            } else {
                a(c(aURARenderComponent), aURARenderComponent);
            }
            awq awqVar = this.c;
            if (awqVar == null || aURARenderComponent == null) {
                return;
            }
            awqVar.a(aURARenderComponent.key);
        }
    }

    private boolean b(AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("66ed2036", new Object[]{this, aURARenderComponent})).booleanValue();
        }
        awr awrVar = this.b;
        if ((awrVar != null ? awrVar.a() : 0) == 0) {
            return true;
        }
        awq awqVar = this.c;
        return !((awqVar == null || aURARenderComponent == null) ? false : awqVar.b(aURARenderComponent.key));
    }

    private void a(List<Event> list, AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e138cc2", new Object[]{this, list, aURARenderComponent});
        } else if (list != null) {
            for (Event event : list) {
                d dVar = new d();
                dVar.a(event.getFields());
                dVar.a(aURARenderComponent);
                dVar.b(event.getTag());
                c.a(this.f25655a.b(), event.getType(), dVar);
            }
        }
    }

    private List<Event> c(AURARenderComponent aURARenderComponent) {
        AURARenderComponentData aURARenderComponentData;
        Map<String, List<Event>> map;
        List<Event> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("73ade196", new Object[]{this, aURARenderComponent});
        }
        if (aURARenderComponent != null && (aURARenderComponentData = aURARenderComponent.data) != null && (map = aURARenderComponentData.events) != null && !map.isEmpty() && (list = map.get(AURAEventKey.exposureItem)) != null && !list.isEmpty()) {
            return list;
        }
        return null;
    }
}
