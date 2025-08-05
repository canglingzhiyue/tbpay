package com.taobao.themis.weex.solution;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.f;
import com.taobao.themis.kernel.launcher.step.c;
import tb.kge;
import tb.qpp;
import tb.qpr;

/* loaded from: classes9.dex */
public class a extends qpr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1729211226);
    }

    public a(f fVar) {
        super(fVar);
    }

    @Override // tb.qpq
    public void a(qpp qppVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbc6bf07", new Object[]{this, qppVar});
        } else {
            new c(this.f33024a, this, qppVar).b();
        }
    }
}
