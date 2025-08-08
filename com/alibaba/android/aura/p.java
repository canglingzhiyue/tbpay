package com.alibaba.android.aura;

import mtopsdk.common.util.StringUtils;
import com.alibaba.android.aura.nodemodel.workflow.AURAExecuteNodeModel;
import com.alibaba.android.aura.service.aspect.AURAAspectServiceInput;
import com.alibaba.android.aura.u;
import com.alibaba.android.aura.util.AURATraceUtil;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.aqq;
import tb.aqs;
import tb.arh;
import tb.ari;
import tb.arj;
import tb.kge;

/* loaded from: classes2.dex */
public class p implements IAURAFlowDispatcher {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private com.alibaba.android.aura.nodemodel.a f2157a;
    private i b;
    private u c;
    private aqq d;
    private com.alibaba.android.aura.a e;
    private d f;
    private List<arh> g;
    private Map<String, arh> h;
    private Map<arh, String> i;
    private List<u.a> j;
    private boolean k;
    private l l;
    private m m;

    static {
        kge.a(-839696751);
        kge.a(-143148842);
    }

    @Override // com.alibaba.android.aura.IAURAFlowDispatcher
    public String getIdentifier(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ade24426", new Object[]{this, str, str2}) : str2;
    }

    @Override // com.alibaba.android.aura.IAURAFlowDispatcher
    public void preload(com.alibaba.android.aura.nodemodel.workflow.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("755b22d", new Object[]{this, aVar});
        }
    }

    public static /* synthetic */ l a(p pVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (l) ipChange.ipc$dispatch("fb188af2", new Object[]{pVar}) : pVar.l;
    }

    public static /* synthetic */ Map b(p pVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("171107a8", new Object[]{pVar}) : pVar.i;
    }

    public static /* synthetic */ d c(p pVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("72020b8", new Object[]{pVar}) : pVar.f;
    }

    public static /* synthetic */ com.alibaba.android.aura.a d(p pVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.alibaba.android.aura.a) ipChange.ipc$dispatch("d23ebba", new Object[]{pVar}) : pVar.e;
    }

    @Override // com.alibaba.android.aura.IAURAFlowDispatcher
    public void onCreate(q qVar, l lVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b74e50b9", new Object[]{this, qVar, lVar});
            return;
        }
        this.l = lVar;
        this.e = lVar.c();
        this.f = lVar.a();
        this.m = new m(qVar, lVar.g());
        this.m.a(lVar.f());
        this.b = lVar.d();
        this.f2157a = lVar.e();
        this.c = lVar.b();
    }

    @Override // com.alibaba.android.aura.IAURAFlowDispatcher
    public void setCallback(aqq aqqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ede165d", new Object[]{this, aqqVar});
        } else {
            this.d = aqqVar;
        }
    }

    @Override // com.alibaba.android.aura.IAURAFlowDispatcher
    public void registerPluginCenter(IAURAPluginCenter... iAURAPluginCenterArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e345529", new Object[]{this, iAURAPluginCenterArr});
        } else {
            this.m.a(iAURAPluginCenterArr);
        }
    }

    @Override // com.alibaba.android.aura.IAURAFlowDispatcher
    public <DATA extends Serializable> void executeFlow(com.alibaba.android.aura.nodemodel.workflow.a aVar, DATA data, aqq aqqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe0f1516", new Object[]{this, aVar, data, aqqVar});
            return;
        }
        synchronized (this) {
            String str = aVar.f2156a;
            if (this.k) {
                if (this.g != null && !this.g.isEmpty()) {
                    a(str, aVar, this.g.get(0), data, false);
                }
                return;
            }
            a(aVar);
            a(str, aVar);
            this.k = true;
            if (this.g != null && !this.g.isEmpty()) {
                a(str, aVar, this.g.get(0), data, true);
            }
        }
    }

    private List<AURAExecuteNodeModel> a(List<AURAExecuteNodeModel> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("b71fabce", new Object[]{this, list});
        }
        if (list == null || list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (AURAExecuteNodeModel aURAExecuteNodeModel : list) {
            String str = aURAExecuteNodeModel.type;
            if ("service".equals(str)) {
                arrayList.add(aURAExecuteNodeModel);
            } else {
                throw new RuntimeException("NotSupport|" + str + "|" + aURAExecuteNodeModel.code);
            }
        }
        return arrayList;
    }

    private void a(com.alibaba.android.aura.nodemodel.workflow.a aVar) {
        arh ariVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5af9f0d5", new Object[]{this, aVar});
            return;
        }
        List<AURAExecuteNodeModel> a2 = a(this.f2157a.a(aVar));
        ArrayList arrayList = new ArrayList(a2.size());
        this.h = new HashMap();
        this.i = new HashMap();
        for (AURAExecuteNodeModel aURAExecuteNodeModel : a2) {
            if (!StringUtils.isEmpty(aURAExecuteNodeModel.code)) {
                n nVar = null;
                try {
                    nVar = this.m.a(aURAExecuteNodeModel, this.l.a(), new aqs() { // from class: com.alibaba.android.aura.p.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // tb.aqs
                        public void a(b bVar) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("2c671180", new Object[]{this, bVar});
                            }
                        }
                    });
                } catch (Throwable th) {
                    th.printStackTrace();
                }
                if (nVar == null) {
                    throw new RuntimeException("getOrCreateService|ERROR|" + JSON.toJSONString(aURAExecuteNodeModel));
                }
                if (nVar instanceof t) {
                    a2.get(a2.size() - 1);
                }
                if (nVar instanceof arh) {
                    ariVar = (arh) nVar;
                } else if (nVar instanceof arj) {
                    ariVar = new ari((arj) nVar);
                } else {
                    throw new RuntimeException("NotSupportService|" + nVar.getClass().getName());
                }
                arrayList.add(ariVar);
                this.h.put(aURAExecuteNodeModel.code, ariVar);
                this.i.put(ariVar, aURAExecuteNodeModel.code);
            }
        }
        this.g = arrayList;
    }

    private void a(final String str, final com.alibaba.android.aura.nodemodel.workflow.a aVar) {
        Object obj;
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d485ebcb", new Object[]{this, str, aVar});
            return;
        }
        List<arh> list = this.g;
        while (i < list.size()) {
            arh arhVar = list.get(i);
            arh arhVar2 = null;
            i++;
            if (i < list.size()) {
                arhVar2 = list.get(i);
            }
            arh arhVar3 = arhVar2;
            if (arhVar3 != null) {
                obj = new a(str, aVar, arhVar, arhVar3);
            } else {
                obj = this.d;
            }
            arhVar.setCallback(obj);
        }
        this.j = new ArrayList();
        for (final Map.Entry<String, arh> entry : this.h.entrySet()) {
            this.c.a(u.ACTION_TYPE_FORWARD, entry.getKey(), new u.a() { // from class: com.alibaba.android.aura.p.2
            });
        }
    }

    private void a(String str, com.alibaba.android.aura.nodemodel.workflow.a aVar, arh arhVar, Serializable serializable, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ecf1b3c", new Object[]{this, str, aVar, arhVar, serializable, new Boolean(z)});
            return;
        }
        AURAFlowData aURAFlowData = new AURAFlowData(str);
        String a2 = AURATraceUtil.a();
        HashMap hashMap = new HashMap();
        hashMap.put("__traceId", a2);
        AURAInputData aURAInputData = new AURAInputData(serializable, aURAFlowData.copyOnWrite(hashMap), this.b.a());
        String str2 = this.i.get(arhVar);
        if (z) {
            this.e.a(aVar, AURAAspectServiceInput.beforeFlowExecute(aVar.f2156a, aURAInputData), aURAInputData.getFlowData(), aURAInputData.getGlobalData(), this.f);
        }
        this.e.a(aVar, AURAAspectServiceInput.beforeServiceExecute(aVar.f2156a, str2, aURAInputData), aURAFlowData, aURAInputData.getGlobalData(), this.f);
        arhVar.onExecute(aURAInputData);
    }

    @Override // com.alibaba.android.aura.IAURAFlowDispatcher
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        for (u.a aVar : this.j) {
            this.c.a(aVar);
        }
        this.m.a();
    }

    /* loaded from: classes2.dex */
    public class a extends aqq {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final String b;
        private final com.alibaba.android.aura.nodemodel.workflow.a c;
        private final arh d;
        private final arh e;

        static {
            kge.a(-577499378);
        }

        @Override // tb.aqq
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            }
        }

        @Override // tb.aqq, tb.aqs
        public void a(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2c671180", new Object[]{this, bVar});
            }
        }

        public a(String str, com.alibaba.android.aura.nodemodel.workflow.a aVar, arh arhVar, arh arhVar2) {
            this.b = str;
            this.c = aVar;
            this.d = arhVar;
            this.e = arhVar2;
        }

        @Override // tb.aqq
        public void a(com.alibaba.android.aura.datamodel.c cVar) {
            AURAFlowData d;
            AURAGlobalData a2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6b8a7af", new Object[]{this, cVar});
                return;
            }
            if (cVar.a()) {
                String a3 = AURATraceUtil.a();
                HashMap hashMap = new HashMap();
                hashMap.put("__traceId", a3);
                d = new AURAFlowData(this.b).copyOnWrite(hashMap);
            } else {
                d = cVar.d();
            }
            if (cVar.f() != null) {
                d = d.copyOnWrite(cVar.f());
            }
            Map<String, Object> e = cVar.e();
            i d2 = p.a(p.this).d();
            if (e != null) {
                a2 = d2.a(e);
            } else {
                a2 = d2.a();
            }
            AURAFlowData aURAFlowData = d == null ? new AURAFlowData(this.b) : d;
            String str = (String) p.b(p.this).get(this.d);
            com.alibaba.android.aura.a d3 = p.d(p.this);
            com.alibaba.android.aura.nodemodel.workflow.a aVar = this.c;
            d3.a(aVar, AURAAspectServiceInput.afterServiceExecute(aVar.f2156a, str, cVar, false), aURAFlowData, a2, p.c(p.this));
            AURAInputData aURAInputData = new AURAInputData(cVar.b(), d, a2);
            com.alibaba.android.aura.a d4 = p.d(p.this);
            com.alibaba.android.aura.nodemodel.workflow.a aVar2 = this.c;
            d4.a(aVar2, AURAAspectServiceInput.beforeServiceExecute(aVar2.f2156a, str, aURAInputData), aURAFlowData, aURAInputData.getGlobalData(), p.c(p.this));
            this.e.onExecute(aURAInputData);
        }
    }
}
