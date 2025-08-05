package tb;

import com.alibaba.android.aura.AURAInputData;
import com.alibaba.android.aura.datamodel.nextrpc.AURANextRPCEndpoint;
import com.alibaba.android.aura.datamodel.nextrpc.AURANextRPCIO;
import com.alibaba.android.aura.datamodel.nextrpc.c;
import com.alibaba.android.aura.datamodel.nextrpc.d;
import com.alibaba.android.aura.datamodel.parse.AURAParseIO;
import com.alibaba.android.aura.f;
import com.alibaba.android.aura.q;
import com.alibaba.android.aura.s;
import com.alibaba.android.aura.service.nextrpc.extension.IAURANextRPCPrefetchExtension;
import com.alibaba.android.aura.util.AURATraceUtil;
import com.alibaba.android.umf.datamodel.protocol.ultron.ProtocolType;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.arc;
import tb.ase;

/* loaded from: classes2.dex */
public final class asc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ase f25557a;

    static {
        kge.a(261691845);
    }

    public void a(f fVar, q qVar, AURAInputData<AURANextRPCIO> aURAInputData, aqq<AURAParseIO> aqqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46bf10dd", new Object[]{this, fVar, qVar, aURAInputData, aqqVar});
            return;
        }
        AURANextRPCIO data = aURAInputData.getData();
        s b2 = qVar.b();
        List<asg> b3 = fVar.b(asg.class);
        AURANextRPCEndpoint aURANextRPCEndpoint = data.nextRPCEndpoint;
        if (aURANextRPCEndpoint == null) {
            aqqVar.a(new com.alibaba.android.aura.b(0, "AURANextRPCServiceDomain", "-1000_INVALID_ENDPOINT", "NextRPC服务输入数据的NextRPCEndpoint为空"));
            return;
        }
        if (!bau.a(b3)) {
            a(aURANextRPCEndpoint, b3);
            b(aURANextRPCEndpoint, b3);
        }
        this.f25557a = asb.a(qVar.e(), data.serviceName, aURANextRPCEndpoint.getStreamModel(), Boolean.TRUE.equals(qVar.a("enableStreamJson", Boolean.class, false)), Boolean.TRUE.equals(qVar.a("enableForceMainThread", Boolean.class, false)));
        b bVar = new b(b2, aURAInputData, aqqVar, fVar);
        if (Boolean.TRUE.equals(qVar.a("enableCombineRender", Boolean.class, false)) || aURANextRPCEndpoint.getStreamModel()) {
            bVar.a();
        }
        this.f25557a.a(aURANextRPCEndpoint, bVar, new a(fVar));
        if (bau.a(b3)) {
            return;
        }
        c(aURANextRPCEndpoint, b3);
    }

    /* loaded from: classes2.dex */
    public static class a implements ase.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public IAURANextRPCPrefetchExtension f25558a;

        static {
            kge.a(-1522293637);
            kge.a(-1360675848);
        }

        public a(f fVar) {
            this.f25558a = (IAURANextRPCPrefetchExtension) fVar.a(IAURANextRPCPrefetchExtension.class);
        }

        @Override // tb.ase.b
        public void a(String str, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("20476513", new Object[]{this, str, map});
                return;
            }
            IAURANextRPCPrefetchExtension iAURANextRPCPrefetchExtension = this.f25558a;
            if (iAURANextRPCPrefetchExtension == null) {
                return;
            }
            iAURANextRPCPrefetchExtension.a(str, map);
        }

        @Override // tb.ase.b
        public asj a(AURANextRPCEndpoint aURANextRPCEndpoint, AURANextRPCEndpoint aURANextRPCEndpoint2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (asj) ipChange.ipc$dispatch("1c2e2220", new Object[]{this, aURANextRPCEndpoint, aURANextRPCEndpoint2});
            }
            IAURANextRPCPrefetchExtension iAURANextRPCPrefetchExtension = this.f25558a;
            if (iAURANextRPCPrefetchExtension == null) {
                return new asj();
            }
            return iAURANextRPCPrefetchExtension.a(aURANextRPCEndpoint, aURANextRPCEndpoint2);
        }
    }

    private void a(AURANextRPCEndpoint aURANextRPCEndpoint, List<asg> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d6815bc", new Object[]{this, aURANextRPCEndpoint, list});
            return;
        }
        for (asg asgVar : list) {
            aURANextRPCEndpoint.appendHeaders(asgVar.b());
            aURANextRPCEndpoint.appendParams(asgVar.a());
        }
    }

    private void b(AURANextRPCEndpoint aURANextRPCEndpoint, List<asg> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d554833d", new Object[]{this, aURANextRPCEndpoint, list});
            return;
        }
        for (asg asgVar : list) {
            asgVar.a(aURANextRPCEndpoint);
        }
    }

    private void c(AURANextRPCEndpoint aURANextRPCEndpoint, List<asg> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d40f0be", new Object[]{this, aURANextRPCEndpoint, list});
            return;
        }
        for (asg asgVar : list) {
            asgVar.b(aURANextRPCEndpoint);
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        ase aseVar = this.f25557a;
        if (aseVar == null) {
            return;
        }
        aseVar.a();
    }

    /* loaded from: classes2.dex */
    public static class b implements Runnable, ase.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public aqq<AURAParseIO> f25559a;
        private final s b;
        private final AURAInputData<AURANextRPCIO> c;
        private final List<asg> d;
        private final List<ash> e;
        private final List<com.alibaba.android.aura.service.nextrpc.extension.a> g;
        private boolean h = false;
        private volatile boolean j = false;
        private final List<com.alibaba.android.aura.datamodel.parse.a> i = new CopyOnWriteArrayList();
        private final arz f = new arz();

        static {
            kge.a(-828180636);
            kge.a(-1482680038);
            kge.a(-1390502639);
        }

        public static /* synthetic */ AURAInputData a(b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (AURAInputData) ipChange.ipc$dispatch("e983d056", new Object[]{bVar}) : bVar.c;
        }

        public static /* synthetic */ void a(b bVar, com.alibaba.android.aura.datamodel.nextrpc.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("adec062f", new Object[]{bVar, aVar});
            } else {
                bVar.c(aVar);
            }
        }

        public static /* synthetic */ void a(b bVar, c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("adeceeed", new Object[]{bVar, cVar});
            } else {
                bVar.a(cVar);
            }
        }

        public static /* synthetic */ void a(b bVar, c cVar, List list, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b5beecb6", new Object[]{bVar, cVar, list, new Boolean(z)});
            } else {
                bVar.a(cVar, list, z);
            }
        }

        public static /* synthetic */ arz b(b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (arz) ipChange.ipc$dispatch("b87b5e33", new Object[]{bVar}) : bVar.f;
        }

        public b(s sVar, AURAInputData<AURANextRPCIO> aURAInputData, aqq<AURAParseIO> aqqVar, f fVar) {
            this.c = aURAInputData;
            this.f25559a = aqqVar;
            this.b = sVar;
            this.d = fVar.b(asg.class);
            this.e = fVar.b(ash.class);
            this.g = fVar.b(com.alibaba.android.aura.service.nextrpc.extension.a.class);
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else {
                this.h = true;
            }
        }

        @Override // tb.ase.a
        public <T extends com.alibaba.android.aura.datamodel.nextrpc.a> void a(final T t) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6572dace", new Object[]{this, t});
            } else {
                bbh.a(new Runnable() { // from class: tb.asc.b.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        com.alibaba.android.aura.datamodel.nextrpc.a aVar = t;
                        if (aVar instanceof c) {
                            b.a(b.this, (c) aVar);
                            return;
                        }
                        b.a(b.this, aVar);
                        b.b(b.this).a(b.this.f25559a, (AURANextRPCIO) b.a(b.this).getData(), t);
                    }
                }, 0L);
            }
        }

        private void a(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6573c38c", new Object[]{this, cVar});
            } else if (c(cVar)) {
            } else {
                this.f.a(this.f25559a, this.c.getData(), cVar);
            }
        }

        @Override // tb.ase.a
        public void b(com.alibaba.android.aura.datamodel.nextrpc.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a8fdf88f", new Object[]{this, aVar});
                return;
            }
            c(aVar);
            if (this.f25559a == null || aVar == null || aVar.f() == null) {
                return;
            }
            this.f25559a.a(com.alibaba.android.aura.datamodel.c.a(new AURAParseIO(Arrays.asList(new com.alibaba.android.aura.datamodel.parse.a(aVar.f().getJSONObject("data")))), this.c));
        }

        @Override // tb.ase.a
        public <T extends com.alibaba.android.aura.datamodel.nextrpc.a> void a(T t, List<com.alibaba.android.aura.datamodel.nextrpc.a> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7c1e0bbf", new Object[]{this, t, list});
            } else if (t == null || t.f() == null) {
            } else {
                if (t instanceof c) {
                    c cVar = (c) t;
                    b(cVar);
                    if (cVar.h() == 1) {
                        a(cVar, list);
                        return;
                    } else {
                        a(cVar, list, false);
                        return;
                    }
                }
                b(t, list);
            }
        }

        private void a(final c cVar, final List<com.alibaba.android.aura.datamodel.nextrpc.a> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4b61b87d", new Object[]{this, cVar, list});
            } else if (bbl.a()) {
                a(cVar, list, true);
            } else {
                final long currentTimeMillis = System.currentTimeMillis();
                AURATraceUtil.b(2, "aura-request-thread-switch-start[" + currentTimeMillis + riy.ARRAY_END_STR);
                bbh.a(new Runnable() { // from class: tb.asc.b.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        long currentTimeMillis2 = System.currentTimeMillis();
                        d i = cVar.i();
                        xhz.a(i, 0, i.a(), currentTimeMillis2);
                        xhz.a(i, 2, currentTimeMillis, currentTimeMillis2);
                        AURATraceUtil.b(2, "aura-request-thread-switch-end[" + currentTimeMillis + riy.ARRAY_END_STR);
                        b.a(b.this, cVar, list, true);
                    }
                }, 0L);
            }
        }

        private void a(c cVar, List<com.alibaba.android.aura.datamodel.nextrpc.a> list, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("20d609f7", new Object[]{this, cVar, list, new Boolean(z)});
            } else if (z) {
                b(cVar, list);
            } else {
                d(cVar);
            }
        }

        private void d(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("30151ccf", new Object[]{this, cVar});
                return;
            }
            JSONObject jSONObject = cVar.f().getJSONObject("data");
            com.alibaba.android.aura.datamodel.parse.a aVar = new com.alibaba.android.aura.datamodel.parse.a(jSONObject);
            aVar.a(ProtocolType.STREAM);
            if (baw.a()) {
                ard a2 = arc.a();
                a2.a("接收到流式数据：" + jSONObject.toString(), arc.a.a().a("AURA/core").b());
            }
            if (this.h) {
                this.i.add(aVar);
                a(true);
            } else if (a(jSONObject)) {
                b(aVar);
            } else {
                a(aVar);
            }
        }

        private void b(com.alibaba.android.aura.datamodel.nextrpc.a aVar, List<com.alibaba.android.aura.datamodel.nextrpc.a> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57df8780", new Object[]{this, aVar, list});
                return;
            }
            xhz.a("收到首段包数据", aVar.i());
            d(aVar);
            c(aVar);
            ArrayList arrayList = new ArrayList();
            JSONObject jSONObject = aVar.f().getJSONObject("data");
            com.alibaba.android.aura.datamodel.parse.a aVar2 = new com.alibaba.android.aura.datamodel.parse.a(jSONObject);
            aVar2.a(ProtocolType.COMPLETE);
            arrayList.add(aVar2);
            if (baw.a()) {
                ard a2 = arc.a();
                a2.a("接收到主数据：" + jSONObject.toString(), arc.a.a().a("AURA/core").b());
            }
            if (list != null) {
                arrayList.addAll(b(list));
            }
            this.f25559a.a(com.alibaba.android.aura.datamodel.c.a(new AURAParseIO(arrayList), this.c));
            arc.a().a("执行主数据渲染流程", arc.a.a().a("AURA/core").b());
            this.j = true;
            a(false);
        }

        @Override // tb.ase.a
        public void a(List<com.alibaba.android.aura.datamodel.nextrpc.a> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
            } else if (this.b == null || list == null) {
                arc.a().b("attachedResponses is null!");
            } else {
                List<com.alibaba.android.aura.datamodel.parse.a> b = b(list);
                AURAParseIO aURAParseIO = new AURAParseIO(b);
                if (a(aURAParseIO)) {
                    return;
                }
                if (this.h) {
                    this.i.addAll(b);
                    a(false);
                    return;
                }
                b(aURAParseIO);
            }
        }

        private synchronized void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            } else if (this.i.isEmpty()) {
                arc.a().a("Pending列表为空", arc.a.a().a("AURA/performance").b());
            } else if (!this.j) {
                arc.a().a("主数据还没有返回，异步数据先hold", arc.a.a().a("AURA/performance").b());
            } else {
                bbh.b().postDelayed(this, 150L);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (this.i.isEmpty()) {
                arc.a().a("Pending列表为空", arc.a.a().a("AURA/other").b());
            } else {
                arc.a().a("差量和异步数据合并渲染", arc.a.a().a("size", this.i.size()).a("AURA/performance").b());
                d(this.i);
            }
        }

        private void d(List<com.alibaba.android.aura.datamodel.parse.a> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ecd009dc", new Object[]{this, list});
                return;
            }
            com.alibaba.android.aura.datamodel.parse.a aVar = list.get(0);
            if (list.size() == 1 && ProtocolType.STREAM.equals(aVar.c())) {
                if (a(aVar.a())) {
                    b(aVar);
                    return;
                } else {
                    a(aVar);
                    return;
                }
            }
            ArrayList arrayList = new ArrayList();
            for (com.alibaba.android.aura.datamodel.parse.a aVar2 : list) {
                if (!a(new AURAParseIO(Collections.singletonList(aVar2)))) {
                    arrayList.add(aVar2);
                }
            }
            list.clear();
            if (arrayList.isEmpty()) {
                return;
            }
            b(new AURAParseIO(arrayList));
        }

        private void c(com.alibaba.android.aura.datamodel.nextrpc.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ec891650", new Object[]{this, aVar});
                return;
            }
            List<asg> list = this.d;
            if (list == null || aVar == null) {
                return;
            }
            for (asg asgVar : list) {
                asgVar.a(aVar);
            }
        }

        private boolean a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("266fb8c", new Object[]{this, jSONObject})).booleanValue();
            }
            if (jSONObject == null) {
                return false;
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject("hierarchy");
            JSONObject jSONObject3 = jSONObject.getJSONObject("data");
            return (jSONObject2 != null && !jSONObject2.isEmpty()) || (jSONObject3 != null && !jSONObject3.isEmpty());
        }

        private void d(com.alibaba.android.aura.datamodel.nextrpc.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("30143411", new Object[]{this, aVar});
            } else if (aVar == null) {
            } else {
                this.c.getGlobalData().update("aura_data_response", aVar);
            }
        }

        private boolean a(AURAParseIO aURAParseIO) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("8eb929dc", new Object[]{this, aURAParseIO})).booleanValue();
            }
            List<ash> list = this.e;
            if (list == null) {
                return false;
            }
            for (ash ashVar : list) {
                if (ashVar.a(aURAParseIO, null)) {
                    return true;
                }
            }
            return false;
        }

        private boolean b(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("a8fee151", new Object[]{this, cVar})).booleanValue();
            }
            if (this.e == null) {
                return false;
            }
            for (com.alibaba.android.aura.service.nextrpc.extension.a aVar : this.g) {
                if (aVar.a(cVar)) {
                    return true;
                }
            }
            return false;
        }

        private boolean c(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("ec89ff12", new Object[]{this, cVar})).booleanValue();
            }
            if (this.e == null) {
                return false;
            }
            for (com.alibaba.android.aura.service.nextrpc.extension.a aVar : this.g) {
                if (aVar.b(cVar)) {
                    return true;
                }
            }
            return false;
        }

        private List<com.alibaba.android.aura.datamodel.parse.a> b(List<com.alibaba.android.aura.datamodel.nextrpc.a> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("2b5ee42d", new Object[]{this, list});
            }
            ArrayList arrayList = new ArrayList();
            if (list == null) {
                return arrayList;
            }
            for (com.alibaba.android.aura.datamodel.nextrpc.a aVar : list) {
                JSONObject f = aVar.f();
                if (f != null) {
                    if (baw.a()) {
                        ard a2 = arc.a();
                        a2.a("接收到异步数据：" + f.toString(), arc.a.a().a("AURA/core").b());
                    }
                    com.alibaba.android.aura.datamodel.parse.a aVar2 = new com.alibaba.android.aura.datamodel.parse.a(f);
                    aVar2.a("DELTA");
                    arrayList.add(aVar2);
                }
            }
            return arrayList;
        }

        private void b(AURAParseIO aURAParseIO) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9f6ef699", new Object[]{this, aURAParseIO});
                return;
            }
            s sVar = this.b;
            if (sVar == null) {
                return;
            }
            sVar.a("aura.workflow.update", aURAParseIO, null);
        }

        private void a(com.alibaba.android.aura.datamodel.parse.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2d0c654d", new Object[]{this, aVar});
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(aVar);
            this.b.a("aura.workflow.parse", new AURAParseIO(arrayList), null);
        }

        private void b(com.alibaba.android.aura.datamodel.parse.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2c95ff4e", new Object[]{this, aVar});
                return;
            }
            ArrayList arrayList = new ArrayList();
            if (aVar != null) {
                arrayList.add(aVar);
            }
            b(new AURAParseIO(arrayList));
        }
    }
}
