package com.taobao.themis.mix;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.adapter.IBizLaunchAdapter;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.f;
import com.taobao.themis.kernel.launcher.step.c;
import com.taobao.themis.kernel.utils.n;
import com.taobao.themis.web.solution.d;
import tb.kge;
import tb.qpp;
import tb.qpr;
import tb.qpt;
import tb.tlm;

/* loaded from: classes9.dex */
public class a extends qpr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(682817168);
    }

    public a(f fVar) {
        super(fVar);
    }

    @Override // tb.qpq
    public void a(qpp qppVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbc6bf07", new Object[]{this, qppVar});
            return;
        }
        d dVar = null;
        IBizLaunchAdapter iBizLaunchAdapter = (IBizLaunchAdapter) qpt.b(IBizLaunchAdapter.class);
        if (iBizLaunchAdapter != null) {
            dVar = iBizLaunchAdapter.createBizLaunchStep(this.f33024a, this, qppVar);
        }
        tlm tlmVar = new tlm(this.f33024a, this, qppVar);
        if (dVar != null) {
            tlmVar.a(dVar);
        } else {
            dVar = tlmVar;
        }
        boolean bI = n.bI();
        if (bI) {
            d dVar2 = new d(this.f33024a, this, qppVar);
            dVar.a(dVar2);
            dVar = dVar2;
        }
        TMSLogger.a("TMSLauncher", "enableWaitWebReady: " + bI);
        dVar.a(new c(this.f33024a, this, qppVar));
        tlmVar.b();
    }
}
