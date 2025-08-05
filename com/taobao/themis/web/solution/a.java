package com.taobao.themis.web.solution;

import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.f;
import tb.kge;
import tb.qpp;
import tb.qpr;

/* loaded from: classes9.dex */
public class a extends qpr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-630416714);
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
        d dVar = new d(this.f33024a, this, qppVar);
        dVar.a(new com.taobao.themis.kernel.launcher.step.c(this.f33024a, this, qppVar));
        dVar.b();
        ViewGroup a2 = c.INSTANCE.a(this.f33024a);
        if (a2 == null || this.f33024a == null) {
            return;
        }
        this.f33024a.A().createSplashView(a2);
    }
}
