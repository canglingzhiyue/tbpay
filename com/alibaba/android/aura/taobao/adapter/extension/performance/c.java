package com.alibaba.android.aura.taobao.adapter.extension.performance;

import com.alibaba.android.aura.AURAInputData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.taobao.adapter.extension.performance.model.AURAPerformanceStageModel;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Iterator;
import java.util.List;
import tb.arn;
import tb.azi;
import tb.azl;
import tb.bau;
import tb.kge;

@AURAExtensionImpl(code = "aura.impl.performance.customStage")
/* loaded from: classes2.dex */
public final class c extends arn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1725945702);
    }

    public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
        if (str.hashCode() == 1123044641) {
            super.beforeFlowExecute((AURAInputData) objArr[0], (com.alibaba.android.aura.datamodel.a) objArr[1]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.arn, tb.arp
    public void beforeFlowExecute(AURAInputData aURAInputData, com.alibaba.android.aura.datamodel.a aVar) {
        List<AURAPerformanceStageModel> d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42f04d21", new Object[]{this, aURAInputData, aVar});
            return;
        }
        super.beforeFlowExecute(aURAInputData, aVar);
        Iterator it = b().b(azi.class).iterator();
        while (it.hasNext() && (d = ((azi) it.next()).d()) != null) {
            a(d);
        }
    }

    private void a(List<AURAPerformanceStageModel> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
            return;
        }
        List<azl> b = b().b(azl.class);
        if (bau.a(b)) {
            return;
        }
        for (AURAPerformanceStageModel aURAPerformanceStageModel : list) {
            for (azl azlVar : b) {
                azlVar.a(aURAPerformanceStageModel, (String) null, false);
            }
        }
    }
}
