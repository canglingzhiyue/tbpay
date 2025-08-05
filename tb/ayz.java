package tb;

import com.alibaba.android.aura.AURAInputData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.a;
import com.alibaba.android.aura.datamodel.c;
import com.alibaba.android.aura.f;
import com.alibaba.android.aura.q;
import com.alibaba.android.aura.service.event.e;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.arc;

@AURAExtensionImpl(code = "aura.impl.aspect.lifecycle.logger")
/* loaded from: classes2.dex */
public final class ayz extends arn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1799879353);
    }

    public static /* synthetic */ Object ipc$super(ayz ayzVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1504501726:
                super.onDestroy();
                return null;
            case -1435706478:
                super.afterFlowExecute((c) objArr[0], (a) objArr[1], ((Boolean) objArr[2]).booleanValue());
                return null;
            case -1372880223:
                super.afterServiceExecute((c) objArr[0], (a) objArr[1], ((Boolean) objArr[2]).booleanValue());
                return null;
            case -1219783041:
                super.onCreate((q) objArr[0], (f) objArr[1]);
                return null;
            case -362309544:
                super.beforeServiceExecute((AURAInputData) objArr[0], (a) objArr[1]);
                return null;
            case 1123044641:
                super.beforeFlowExecute((AURAInputData) objArr[0], (a) objArr[1]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public static /* synthetic */ void a(ayz ayzVar, AURAInputData aURAInputData, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4cfa4748", new Object[]{ayzVar, aURAInputData, aVar});
        } else {
            ayzVar.a(aURAInputData, aVar);
        }
    }

    public static /* synthetic */ void a(ayz ayzVar, c cVar, a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a25f1fae", new Object[]{ayzVar, cVar, aVar, new Boolean(z)});
        } else {
            ayzVar.a(cVar, aVar, z);
        }
    }

    public static /* synthetic */ void b(ayz ayzVar, AURAInputData aURAInputData, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1324d009", new Object[]{ayzVar, aURAInputData, aVar});
        } else {
            ayzVar.b(aURAInputData, aVar);
        }
    }

    public static /* synthetic */ void b(ayz ayzVar, c cVar, a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da4ffacd", new Object[]{ayzVar, cVar, aVar, new Boolean(z)});
        } else {
            ayzVar.b(cVar, aVar, z);
        }
    }

    @Override // tb.arn, tb.arl
    public void onCreate(q qVar, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b74b967f", new Object[]{this, qVar, fVar});
            return;
        }
        super.onCreate(qVar, fVar);
        arc.a(aza.a());
    }

    private boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue();
        }
        Boolean bool = (Boolean) a().a("enableLogAsyncThread", Boolean.class, false);
        return bool != null && bool.booleanValue();
    }

    @Override // tb.arn, tb.arl
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        } else {
            super.onDestroy();
        }
    }

    @Override // tb.arn, tb.arp
    public void beforeFlowExecute(final AURAInputData aURAInputData, final a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42f04d21", new Object[]{this, aURAInputData, aVar});
            return;
        }
        super.beforeFlowExecute(aURAInputData, aVar);
        if (e()) {
            bbh.a(new Runnable() { // from class: tb.ayz.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        ayz.a(ayz.this, aURAInputData, aVar);
                    }
                }
            });
        } else {
            bbh.a(new Runnable() { // from class: tb.ayz.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        ayz.a(ayz.this, aURAInputData, aVar);
                    }
                }
            }, 0L);
        }
    }

    private void a(AURAInputData aURAInputData, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8af007da", new Object[]{this, aURAInputData, aVar});
            return;
        }
        try {
            arc.a a2 = arc.a.a();
            a2.b("AURAAspectLifecycleLoggerExtension").a("AURA/workflow").c(aVar.d()).a("bizName", a().c()).a("event", "BEFORE_FLOW_EXECUTE");
            if (baw.a()) {
                a2.a("traceId", (String) aURAInputData.getFlowData().get("aura_trace_id", String.class)).a("inputData", bba.a(aURAInputData.getData()));
            }
            if (aVar.c().equals(e.CODE)) {
                a2.a("eventType", ((JSONObject) JSONObject.toJSON(aURAInputData.getData())).getString("eventType"));
            }
            arc.a().a("beforeFlowExecute", a2.b());
        } catch (Throwable unused) {
        }
    }

    @Override // tb.arn, tb.arp
    public void afterFlowExecute(final c cVar, final a aVar, final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa6cdb92", new Object[]{this, cVar, aVar, new Boolean(z)});
            return;
        }
        super.afterFlowExecute(cVar, aVar, z);
        if (e()) {
            bbh.a(new Runnable() { // from class: tb.ayz.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        ayz.a(ayz.this, cVar, aVar, z);
                    }
                }
            });
        } else {
            bbh.a(new Runnable() { // from class: tb.ayz.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        ayz.a(ayz.this, cVar, aVar, z);
                    }
                }
            }, 0L);
        }
    }

    private void a(c cVar, a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("414604dc", new Object[]{this, cVar, aVar, new Boolean(z)});
            return;
        }
        try {
            arc.a a2 = arc.a.a();
            a2.b("AURAAspectLifecycleLoggerExtension").a("AURA/workflow").c(aVar.d()).a("bizName", a().c()).a("event", "AFTER_FLOW_EXECUTE").a("traceId", (String) cVar.d().get("aura_trace_id", String.class));
            arc.a().a("beforeFlowExecute", a2.b());
        } catch (Throwable unused) {
        }
    }

    @Override // tb.arn, tb.arp
    public void beforeServiceExecute(final AURAInputData aURAInputData, final a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea679858", new Object[]{this, aURAInputData, aVar});
            return;
        }
        super.beforeServiceExecute(aURAInputData, aVar);
        if (e()) {
            bbh.a(new Runnable() { // from class: tb.ayz.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        ayz.b(ayz.this, aURAInputData, aVar);
                    }
                }
            });
        } else {
            bbh.a(new Runnable() { // from class: tb.ayz.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        ayz.b(ayz.this, aURAInputData, aVar);
                    }
                }
            }, 0L);
        }
    }

    private void b(AURAInputData aURAInputData, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("326be19b", new Object[]{this, aURAInputData, aVar});
            return;
        }
        try {
            arc.a a2 = arc.a.a();
            a2.b("AURAAspectLifecycleLoggerExtension").a("AURA/workflow").a("bizName", a().c()).c(aVar.d()).d(aVar.c()).a("event", "BEFORE_SERVICE_EXECUTE");
            if (baw.a()) {
                a2.a("traceId", (String) aURAInputData.getFlowData().get("aura_trace_id", String.class)).a("inputData", bba.a(aURAInputData.getData()));
            }
            if (aVar.c().equals(e.CODE)) {
                a2.a("eventType", ((JSONObject) JSONObject.toJSON(aURAInputData.getData())).getString("eventType")).a("inputData", bba.a(aURAInputData.getData()));
            }
            arc.a().a("beforeFlowExecute", a2.b());
        } catch (Throwable unused) {
        }
    }

    @Override // tb.arn, tb.arp
    public void afterServiceExecute(final c cVar, final a aVar, final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae2b82a1", new Object[]{this, cVar, aVar, new Boolean(z)});
            return;
        }
        super.afterServiceExecute(cVar, aVar, z);
        if (e()) {
            bbh.a(new Runnable() { // from class: tb.ayz.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        ayz.b(ayz.this, cVar, aVar, z);
                    }
                }
            });
        } else {
            bbh.a(new Runnable() { // from class: tb.ayz.8
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        ayz.b(ayz.this, cVar, aVar, z);
                    }
                }
            }, 0L);
        }
    }

    private void b(c cVar, a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ff76efb", new Object[]{this, cVar, aVar, new Boolean(z)});
            return;
        }
        try {
            arc.a a2 = arc.a.a();
            a2.b("AURAAspectLifecycleLoggerExtension").a("AURA/workflow").a("bizName", a().c()).c(aVar.d()).d(aVar.c()).a("event", "AFTER_SERVICE_EXECUTE");
            if (baw.a()) {
                a2.a("traceId", (String) cVar.d().get("aura_trace_id", String.class)).a("outputData", bba.a(cVar.b()));
            }
            arc.a().a("beforeFlowExecute", a2.b());
        } catch (Throwable unused) {
        }
    }
}
