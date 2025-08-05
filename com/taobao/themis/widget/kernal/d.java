package com.taobao.themis.widget.kernal;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.qpp;
import tb.qpr;
import tb.tlm;
import tb.tln;

/* loaded from: classes9.dex */
public class d extends qpr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-462490011);
    }

    public d(com.taobao.themis.kernel.f fVar) {
        super(fVar);
    }

    @Override // tb.qpq
    public void a(qpp qppVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbc6bf07", new Object[]{this, qppVar});
            return;
        }
        tlm tlmVar = new tlm(this.f33024a, this, qppVar);
        tlmVar.a(new tln(this.f33024a, this, qppVar)).a(new f(this.f33024a, this, qppVar)).a(new com.taobao.themis.kernel.launcher.step.c(this.f33024a, this, qppVar));
        tlmVar.b();
    }
}
