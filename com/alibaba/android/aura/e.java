package com.alibaba.android.aura;

import com.alibaba.android.aura.nodemodel.workflow.AURAExecuteNodeModel;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;
import tb.aqq;
import tb.ark;
import tb.kge;

/* loaded from: classes2.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(57134331);
    }

    public static void a(m mVar, AURAExecuteNodeModel aURAExecuteNodeModel, AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, d dVar, aqq aqqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cf84362", new Object[]{mVar, aURAExecuteNodeModel, aURAFlowData, aURAGlobalData, dVar, aqqVar});
            return;
        }
        List<ark> a2 = mVar.a(aURAExecuteNodeModel.code, dVar).a();
        if (a2.isEmpty()) {
            return;
        }
        for (ark arkVar : a2) {
            arkVar.onDataChanged(aURAFlowData, aURAGlobalData, aqqVar);
        }
        Map<String, List<AURAExecuteNodeModel>> map = aURAExecuteNodeModel.extensions;
        if (map == null || map.isEmpty()) {
            return;
        }
        for (Map.Entry<String, List<AURAExecuteNodeModel>> entry : map.entrySet()) {
            List<AURAExecuteNodeModel> value = entry.getValue();
            if (value != null && !value.isEmpty()) {
                for (AURAExecuteNodeModel aURAExecuteNodeModel2 : value) {
                    if (!mVar.a(aURAExecuteNodeModel2.code, dVar).a().isEmpty()) {
                        a(mVar, aURAExecuteNodeModel2, aURAFlowData, aURAGlobalData, dVar, aqqVar);
                    }
                }
            }
        }
    }
}
