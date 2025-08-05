package com.alibaba.android.aura;

import com.alibaba.android.aura.datamodel.AURAEmptySerializable;
import com.alibaba.android.aura.nodemodel.workflow.AURAExecuteNodeModel;
import com.alibaba.android.aura.service.aspect.AURAAspectServiceInput;
import com.alibaba.android.umf.constants.UMFConstants;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.List;
import tb.aqq;
import tb.aqs;
import tb.arj;
import tb.baw;
import tb.kge;

/* loaded from: classes2.dex */
public class r implements IAURAFlowDispatcher {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private m b;
    private l c;
    private a e;
    private AURAGlobalData f;
    private com.alibaba.android.aura.nodemodel.workflow.a g;
    private AURAFlowData h;

    /* renamed from: a  reason: collision with root package name */
    private d f2162a = null;
    private boolean d = false;

    static {
        kge.a(-1670670220);
        kge.a(-143148842);
    }

    @Override // com.alibaba.android.aura.IAURAFlowDispatcher
    public String getIdentifier(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ade24426", new Object[]{this, str, str2}) : str2;
    }

    @Override // com.alibaba.android.aura.IAURAFlowDispatcher
    public void setCallback(aqq aqqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ede165d", new Object[]{this, aqqVar});
        }
    }

    public static /* synthetic */ AURAGlobalData a(r rVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AURAGlobalData) ipChange.ipc$dispatch("c6945c86", new Object[]{rVar}) : rVar.f;
    }

    public static /* synthetic */ void a(r rVar, b bVar, com.alibaba.android.aura.nodemodel.workflow.a aVar, String str, AURAFlowData aURAFlowData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37a1031c", new Object[]{rVar, bVar, aVar, str, aURAFlowData});
        } else {
            rVar.a(bVar, aVar, str, aURAFlowData);
        }
    }

    public static /* synthetic */ void a(r rVar, com.alibaba.android.aura.nodemodel.workflow.a aVar, String str, AURAFlowData aURAFlowData, com.alibaba.android.aura.datamodel.c cVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("182923e9", new Object[]{rVar, aVar, str, aURAFlowData, cVar, new Boolean(z)});
        } else {
            rVar.a(aVar, str, aURAFlowData, cVar, z);
        }
    }

    public static /* synthetic */ void a(r rVar, com.alibaba.android.aura.nodemodel.workflow.a aVar, List list, int i, Serializable serializable, AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, aqq aqqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("555dc773", new Object[]{rVar, aVar, list, new Integer(i), serializable, aURAFlowData, aURAGlobalData, aqqVar});
        } else {
            rVar.a(aVar, list, i, serializable, aURAFlowData, aURAGlobalData, aqqVar);
        }
    }

    @Override // com.alibaba.android.aura.IAURAFlowDispatcher
    public void onCreate(q qVar, l lVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b74e50b9", new Object[]{this, qVar, lVar});
            return;
        }
        this.c = lVar;
        this.f2162a = lVar.a();
        this.e = lVar.c();
        this.b = new m(qVar, lVar.g());
        this.b.a(lVar.f());
    }

    @Override // com.alibaba.android.aura.IAURAFlowDispatcher
    public void preload(com.alibaba.android.aura.nodemodel.workflow.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("755b22d", new Object[]{this, aVar});
            return;
        }
        AURAExecuteNodeModel aURAExecuteNodeModel = new AURAExecuteNodeModel();
        aURAExecuteNodeModel.code = com.alibaba.android.aura.service.aspect.a.SERVICE_CODE;
        aURAExecuteNodeModel.type = "service";
        aURAExecuteNodeModel.extensions = aVar.d;
        this.e.a(aURAExecuteNodeModel, this.f2162a);
        List<AURAExecuteNodeModel> a2 = this.c.e().a(aVar);
        if (a2 == null || a2.isEmpty()) {
            return;
        }
        for (AURAExecuteNodeModel aURAExecuteNodeModel2 : a2) {
            a(aURAExecuteNodeModel2);
        }
    }

    private void a(AURAExecuteNodeModel aURAExecuteNodeModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99c41c05", new Object[]{this, aURAExecuteNodeModel});
        } else {
            this.b.a(aURAExecuteNodeModel, this.f2162a, new aqs() { // from class: com.alibaba.android.aura.r.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.aqs
                public void a(b bVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("2c671180", new Object[]{this, bVar});
                    }
                }
            });
        }
    }

    @Override // com.alibaba.android.aura.IAURAFlowDispatcher
    public void registerPluginCenter(IAURAPluginCenter... iAURAPluginCenterArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e345529", new Object[]{this, iAURAPluginCenterArr});
        } else {
            this.b.a(iAURAPluginCenterArr);
        }
    }

    @Override // com.alibaba.android.aura.IAURAFlowDispatcher
    public <DATA extends Serializable> void executeFlow(com.alibaba.android.aura.nodemodel.workflow.a aVar, DATA data, aqq aqqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe0f1516", new Object[]{this, aVar, data, aqqVar});
            return;
        }
        this.g = aVar;
        this.d = false;
        this.h = new AURAFlowData(aVar.f2156a);
        if (a()) {
            this.f = this.c.d().a();
        } else {
            this.f = this.c.d().a().copyOnWrite(null);
        }
        this.e.a(aVar, AURAAspectServiceInput.beforeFlowExecute(aVar.f2156a, new AURAInputData(data, this.h, this.f)), this.h, this.f, this.f2162a);
        a(aVar, this.c.e().a(aVar), 0, data, this.h, this.f, aqqVar);
    }

    private boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.c.f().a(new com.alibaba.android.aura.nodemodel.branch.c("aura.branch.disableGlobalDataCopyOnWrite", false, "default"));
    }

    private <DATA extends Serializable> void a(com.alibaba.android.aura.nodemodel.workflow.a aVar, List<AURAExecuteNodeModel> list, int i, DATA data, AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, aqq aqqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78066a6b", new Object[]{this, aVar, list, new Integer(i), data, aURAFlowData, aURAGlobalData, aqqVar});
            return;
        }
        if (list == null || list.isEmpty() || list.size() <= i) {
            a(aVar, (com.alibaba.android.aura.nodemodel.workflow.a) data, aURAFlowData, aURAGlobalData, aqqVar);
            return;
        }
        AURAExecuteNodeModel aURAExecuteNodeModel = list.get(i);
        if ("service".equals(aURAExecuteNodeModel.type)) {
            a(aVar, aURAExecuteNodeModel, (AURAExecuteNodeModel) data, aURAGlobalData, aURAFlowData, a(aVar, aURAExecuteNodeModel.code == null ? "" : aURAExecuteNodeModel.code, list, i, aURAFlowData, aqqVar));
            return;
        }
        aqqVar.a(new b(0, "AURACoreDomain", "-3000", "流程下的节点的type不是service"));
        a(aVar, aURAFlowData, (com.alibaba.android.aura.datamodel.c) a(aVar.f2156a), true);
    }

    private <DATA extends Serializable> void a(com.alibaba.android.aura.nodemodel.workflow.a aVar, AURAExecuteNodeModel aURAExecuteNodeModel, DATA data, AURAGlobalData aURAGlobalData, AURAFlowData aURAFlowData, aqq aqqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f57956a", new Object[]{this, aVar, aURAExecuteNodeModel, data, aURAGlobalData, aURAFlowData, aqqVar});
        } else if (!this.c.f().a(aURAExecuteNodeModel.branch)) {
            aqqVar.a(com.alibaba.android.aura.datamodel.c.a(data, new AURAInputData(data, aURAFlowData, aURAGlobalData)));
        } else {
            n nVar = null;
            try {
                nVar = this.b.a(aURAExecuteNodeModel, this.f2162a, aqqVar);
            } catch (Throwable th) {
                aqqVar.a(new b(0, "AURACoreDomain", UMFConstants.ErrorCode.SERVICE_NOT_FOUND, th.getMessage()));
                baw.a(th);
            }
            n nVar2 = nVar;
            String str = aURAExecuteNodeModel.code;
            if (!(nVar2 instanceof arj)) {
                aqqVar.a(new b(0, "AURACoreDomain", UMFConstants.ErrorCode.CREATE_SERVICE_EXCEPTION, "serviceCode为【" + str + "】的服务【" + nVar2 + "]不是工作流服务（AURAWorkService）"));
                return;
            }
            AURAInputData aURAInputData = new AURAInputData(data, aURAFlowData, aURAGlobalData);
            e.a(this.b, aURAExecuteNodeModel, aURAFlowData, aURAGlobalData, this.f2162a, aqqVar);
            this.e.a(aVar, AURAAspectServiceInput.beforeServiceExecute(aVar.f2156a, str, aURAInputData), aURAFlowData, aURAGlobalData, this.f2162a);
            ((arj) nVar2).a(aURAInputData, aqqVar);
        }
    }

    private aqq a(final com.alibaba.android.aura.nodemodel.workflow.a aVar, final String str, final List<AURAExecuteNodeModel> list, final int i, final AURAFlowData aURAFlowData, final aqq aqqVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (aqq) ipChange.ipc$dispatch("2b9dace", new Object[]{this, aVar, str, list, new Integer(i), aURAFlowData, aqqVar}) : new aqq() { // from class: com.alibaba.android.aura.r.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.aqq
            public void a(com.alibaba.android.aura.datamodel.c cVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("6b8a7af", new Object[]{this, cVar});
                    return;
                }
                if (cVar.f() != null) {
                    aqqVar.a(new b(1, "AURACoreDomain", "-2005", "工作流不要设置flowPayload"));
                }
                if (cVar.e() != null) {
                    aqqVar.a(new b(1, "AURACoreDomain", "-2006", "工作流不要设置globalPayload"));
                }
                r.a(r.this, aVar, str, aURAFlowData, cVar, false);
                r.a(r.this, aVar, list, i + 1, cVar.b(), aURAFlowData, r.a(r.this), aqqVar);
            }

            @Override // tb.aqq, tb.aqs
            public void a(b bVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("2c671180", new Object[]{this, bVar});
                    return;
                }
                bVar.a(new c(aVar.f2156a, str, aURAFlowData, r.a(r.this)));
                r.a(r.this, bVar, aVar, str, aURAFlowData);
                aqqVar.a(bVar);
            }
        };
    }

    private <DATA extends Serializable> void a(com.alibaba.android.aura.nodemodel.workflow.a aVar, DATA data, AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, aqq aqqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8e32943", new Object[]{this, aVar, data, aURAFlowData, aURAGlobalData, aqqVar});
            return;
        }
        i d = this.c.d();
        if (!a()) {
            d.a(aURAGlobalData.getMap());
        }
        com.alibaba.android.aura.datamodel.c<DATA> a2 = com.alibaba.android.aura.datamodel.c.a(data, new AURAInputData(new AURAEmptySerializable(), aURAFlowData, aURAGlobalData));
        aqqVar.a(a2);
        aqqVar.a();
        a(aVar, aURAFlowData, (com.alibaba.android.aura.datamodel.c) a2, false);
    }

    private void a(com.alibaba.android.aura.nodemodel.workflow.a aVar, AURAFlowData aURAFlowData, com.alibaba.android.aura.datamodel.c cVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2af50ae7", new Object[]{this, aVar, aURAFlowData, cVar, new Boolean(z)});
            return;
        }
        this.d = true;
        this.e.a(aVar, AURAAspectServiceInput.afterFlowExecute(aVar.f2156a, cVar, z), aURAFlowData, this.f, this.f2162a);
    }

    private void a(b bVar, com.alibaba.android.aura.nodemodel.workflow.a aVar, String str, AURAFlowData aURAFlowData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4945c14", new Object[]{this, bVar, aVar, str, aURAFlowData});
        } else if (bVar.d() != 0) {
        } else {
            String str2 = aVar.f2156a;
            a(aVar, str, aURAFlowData, (com.alibaba.android.aura.datamodel.c) a(str2), true);
            a(aVar, aURAFlowData, (com.alibaba.android.aura.datamodel.c) a(str2), true);
        }
    }

    private com.alibaba.android.aura.datamodel.c<AURAEmptySerializable> a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.alibaba.android.aura.datamodel.c) ipChange.ipc$dispatch("72a4caeb", new Object[]{this, str});
        }
        AURAEmptySerializable aURAEmptySerializable = new AURAEmptySerializable();
        return com.alibaba.android.aura.datamodel.c.a(aURAEmptySerializable, new AURAInputData(aURAEmptySerializable, new AURAFlowData(str), this.f));
    }

    private void a(com.alibaba.android.aura.nodemodel.workflow.a aVar, String str, AURAFlowData aURAFlowData, com.alibaba.android.aura.datamodel.c cVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa46fff1", new Object[]{this, aVar, str, aURAFlowData, cVar, new Boolean(z)});
        } else {
            this.e.a(aVar, AURAAspectServiceInput.afterServiceExecute(aVar.f2156a, str, cVar, z), aURAFlowData, this.f, this.f2162a);
        }
    }

    @Override // com.alibaba.android.aura.IAURAFlowDispatcher
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        } else {
            this.b.a();
        }
    }
}
