package com.alibaba.android.aura;

import com.alibaba.android.aura.nodemodel.workflow.AURAExecuteNodeModel;
import com.alibaba.android.aura.service.aspect.AURAAspectServiceInput;
import com.android.alibaba.ip.runtime.IpChange;
import tb.aql;
import tb.aqq;
import tb.aqs;
import tb.arc;
import tb.ard;
import tb.arj;
import tb.kge;

/* loaded from: classes2.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f2118a = "AURAAspectManager";
    private final String b = com.alibaba.android.aura.service.aspect.a.SERVICE_CODE;
    private m c;

    static {
        kge.a(1865187047);
    }

    public static /* synthetic */ void a(a aVar, b bVar, AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, int i, com.alibaba.android.aura.nodemodel.workflow.a aVar2, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("782dcdf4", new Object[]{aVar, bVar, aURAFlowData, aURAGlobalData, new Integer(i), aVar2, dVar});
        } else {
            aVar.a(bVar, aURAFlowData, aURAGlobalData, i, aVar2, dVar);
        }
    }

    private a() {
    }

    public a(q qVar, j jVar) {
        this.c = new m(qVar, jVar);
    }

    public void a(aql aqlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0857b1c", new Object[]{this, aqlVar});
        } else {
            this.c.a(aqlVar);
        }
    }

    public void a(IAURAPluginCenter... iAURAPluginCenterArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a26a4b33", new Object[]{this, iAURAPluginCenterArr});
        } else {
            this.c.a(iAURAPluginCenterArr);
        }
    }

    public void a(AURAExecuteNodeModel aURAExecuteNodeModel, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b724c5b", new Object[]{this, aURAExecuteNodeModel, dVar});
        } else {
            this.c.a(aURAExecuteNodeModel, dVar, new aqs() { // from class: com.alibaba.android.aura.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.aqs
                public void a(b bVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("2c671180", new Object[]{this, bVar});
                        return;
                    }
                    ard a2 = arc.a();
                    a2.b("preload error," + bVar.b(), arc.a.a().a("AURA/performance").b());
                }
            });
        }
    }

    public void a(final com.alibaba.android.aura.nodemodel.workflow.a aVar, final AURAAspectServiceInput aURAAspectServiceInput, final AURAFlowData aURAFlowData, final AURAGlobalData aURAGlobalData, final d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62b98e43", new Object[]{this, aVar, aURAAspectServiceInput, aURAFlowData, aURAGlobalData, dVar});
        } else if (this.c == null) {
        } else {
            try {
                AURAExecuteNodeModel aURAExecuteNodeModel = new AURAExecuteNodeModel();
                aURAExecuteNodeModel.code = com.alibaba.android.aura.service.aspect.a.SERVICE_CODE;
                aURAExecuteNodeModel.type = "service";
                aURAExecuteNodeModel.extensions = aVar.d;
                aqq aqqVar = new aqq() { // from class: com.alibaba.android.aura.a.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // tb.aqq, tb.aqs
                    public void a(b bVar) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("2c671180", new Object[]{this, bVar});
                        } else {
                            a.a(a.this, bVar, aURAFlowData, aURAGlobalData, aURAAspectServiceInput.getType(), aVar, dVar);
                        }
                    }
                };
                n a2 = this.c.a(aURAExecuteNodeModel, dVar, aqqVar);
                if (!(a2 instanceof arj)) {
                    ard a3 = arc.a();
                    a3.c("AURAAspectManager", "executeAspectService", "serviceCode为【" + aURAExecuteNodeModel.code + "】的服务不存在或者他不是继承AURAWorkService,service=" + a2);
                    return;
                }
                e.a(this.c, aURAExecuteNodeModel, aURAFlowData, aURAGlobalData, dVar, aqqVar);
                ((arj) a2).a(new AURAInputData(aURAAspectServiceInput, aURAFlowData, aURAGlobalData), aqqVar);
            } catch (Throwable th) {
                a(new b(1, "AURACoreDomain", "-5000", th.getMessage()), aURAFlowData, aURAGlobalData, aURAAspectServiceInput.getType(), aVar, dVar);
            }
        }
    }

    private void a(b bVar, AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, int i, com.alibaba.android.aura.nodemodel.workflow.a aVar, d dVar) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("449dac3b", new Object[]{this, bVar, aURAFlowData, aURAGlobalData, new Integer(i), aVar, dVar});
            return;
        }
        if (4 != i) {
            z = false;
        }
        if (z) {
            return;
        }
        bVar.a(new c("", com.alibaba.android.aura.service.aspect.a.SERVICE_CODE, aURAFlowData, aURAGlobalData));
        a(aVar, AURAAspectServiceInput.error(bVar, z), aURAFlowData, aURAGlobalData, dVar);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.c.a();
        this.c = null;
    }
}
