package com.alibaba.android.aura.taobao.adapter.extension.performance;

import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.AURAInputData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.parse.AURAParseIO;
import com.alibaba.android.aura.f;
import com.alibaba.android.aura.q;
import com.alibaba.android.aura.service.event.AURAEventIO;
import com.alibaba.android.aura.taobao.adapter.extension.performance.model.AURAPerformanceStageModel;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.aqs;
import tb.arn;
import tb.asd;
import tb.azl;
import tb.bau;
import tb.kge;

@AURAExtensionImpl(code = "aura.impl.performance")
/* loaded from: classes2.dex */
public final class d extends arn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1669641897);
    }

    public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1504501726:
                super.onDestroy();
                return null;
            case -1435706478:
                super.afterFlowExecute((com.alibaba.android.aura.datamodel.c) objArr[0], (com.alibaba.android.aura.datamodel.a) objArr[1], ((Boolean) objArr[2]).booleanValue());
                return null;
            case -1372880223:
                super.afterServiceExecute((com.alibaba.android.aura.datamodel.c) objArr[0], (com.alibaba.android.aura.datamodel.a) objArr[1], ((Boolean) objArr[2]).booleanValue());
                return null;
            case -1219783041:
                super.onCreate((q) objArr[0], (f) objArr[1]);
                return null;
            case -362309544:
                super.beforeServiceExecute((AURAInputData) objArr[0], (com.alibaba.android.aura.datamodel.a) objArr[1]);
                return null;
            case 563256106:
                super.onDataChanged((AURAFlowData) objArr[0], (AURAGlobalData) objArr[1], (aqs) objArr[2]);
                return null;
            case 1123044641:
                super.beforeFlowExecute((AURAInputData) objArr[0], (com.alibaba.android.aura.datamodel.a) objArr[1]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // tb.arn, tb.arl
    public void onCreate(q qVar, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b74b967f", new Object[]{this, qVar, fVar});
        } else {
            super.onCreate(qVar, fVar);
        }
    }

    @Override // tb.arn, tb.ark
    public void onDataChanged(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, aqs aqsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21929b2a", new Object[]{this, aURAFlowData, aURAGlobalData, aqsVar});
        } else {
            super.onDataChanged(aURAFlowData, aURAGlobalData, aqsVar);
        }
    }

    @Override // tb.arn, tb.arp
    public void beforeFlowExecute(AURAInputData aURAInputData, com.alibaba.android.aura.datamodel.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42f04d21", new Object[]{this, aURAInputData, aVar});
            return;
        }
        super.beforeFlowExecute(aURAInputData, aVar);
        for (azl azlVar : b().b(azl.class)) {
            azlVar.b(aVar.d(), "流程耗时");
        }
    }

    @Override // tb.arn, tb.arp
    public void afterFlowExecute(com.alibaba.android.aura.datamodel.c cVar, com.alibaba.android.aura.datamodel.a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa6cdb92", new Object[]{this, cVar, aVar, new Boolean(z)});
            return;
        }
        super.afterFlowExecute(cVar, aVar, z);
        for (azl azlVar : b().b(azl.class)) {
            azlVar.b(aVar.d(), z, null);
        }
    }

    private boolean a(com.alibaba.android.aura.datamodel.a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6b7bef5", new Object[]{this, aVar})).booleanValue() : com.alibaba.android.aura.service.event.e.CODE.equals(aVar.c());
    }

    @Override // tb.arn, tb.arp
    public void beforeServiceExecute(AURAInputData aURAInputData, com.alibaba.android.aura.datamodel.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea679858", new Object[]{this, aURAInputData, aVar});
            return;
        }
        super.beforeServiceExecute(aURAInputData, aVar);
        for (azl azlVar : b().b(azl.class)) {
            azlVar.a(aVar.c(), "服务耗时");
        }
    }

    @Override // tb.arn, tb.arp
    public void afterServiceExecute(com.alibaba.android.aura.datamodel.c cVar, com.alibaba.android.aura.datamodel.a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae2b82a1", new Object[]{this, cVar, aVar, new Boolean(z)});
            return;
        }
        super.afterServiceExecute(cVar, aVar, z);
        List<azl> b = b().b(azl.class);
        Map<String, String> a2 = a(cVar, aVar);
        for (azl azlVar : b) {
            azlVar.a(aVar.c(), z, a2);
        }
        a(cVar, aVar, z);
    }

    private void a(com.alibaba.android.aura.datamodel.c cVar, com.alibaba.android.aura.datamodel.a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("414604dc", new Object[]{this, cVar, aVar, new Boolean(z)});
        } else if (asd.NEXT_RPC_SERVICE_CODE.equals(aVar.c())) {
            Serializable b = cVar.b();
            if (!(b instanceof AURAParseIO)) {
                return;
            }
            com.alibaba.android.aura.taobao.adapter.extension.performance.model.a aVar2 = new com.alibaba.android.aura.taobao.adapter.extension.performance.model.a((AURAParseIO) b);
            Map<String, String> a2 = aVar2.a();
            List<AURAPerformanceStageModel> b2 = aVar2.b();
            if (a2 == null && bau.a(b2)) {
                return;
            }
            for (azl azlVar : b().b(azl.class)) {
                if (a2 != null) {
                    azlVar.a(a2);
                }
                if (b2 != null) {
                    for (AURAPerformanceStageModel aURAPerformanceStageModel : b2) {
                        azlVar.a(aURAPerformanceStageModel, asd.NEXT_RPC_SERVICE_CODE, false);
                    }
                }
            }
        }
    }

    private Map<String, String> a(com.alibaba.android.aura.datamodel.c cVar, com.alibaba.android.aura.datamodel.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("46104d2d", new Object[]{this, cVar, aVar});
        }
        if (!a(aVar)) {
            return null;
        }
        HashMap hashMap = new HashMap();
        Serializable b = cVar.b();
        if (!(b instanceof AURAEventIO)) {
            return null;
        }
        hashMap.put("eventType", ((AURAEventIO) b).getEventType());
        return hashMap;
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
}
