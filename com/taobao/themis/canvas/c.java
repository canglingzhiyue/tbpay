package com.taobao.themis.canvas;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.canvas.launch_step.e;
import com.taobao.themis.canvas.launch_step.g;
import com.taobao.themis.kernel.adapter.IBizLaunchAdapter;
import com.taobao.themis.kernel.adapter.IUserTrackerAdapter;
import com.taobao.themis.kernel.f;
import com.taobao.themis.kernel.utils.u;
import tb.kge;
import tb.qpp;
import tb.qpr;
import tb.qpt;
import tb.tlm;
import tb.tln;

/* loaded from: classes9.dex */
public class c extends qpr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1061146709);
    }

    public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public c(f fVar) {
        super(fVar);
    }

    @Override // tb.qpq
    public void a(qpp qppVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbc6bf07", new Object[]{this, qppVar});
            return;
        }
        b();
        tlm tlmVar = null;
        IBizLaunchAdapter iBizLaunchAdapter = (IBizLaunchAdapter) qpt.b(IBizLaunchAdapter.class);
        if (iBizLaunchAdapter != null) {
            tlmVar = iBizLaunchAdapter.createBizLaunchStep(this.f33024a, this, qppVar);
        }
        tlm tlmVar2 = new tlm(this.f33024a, this, qppVar);
        if (tlmVar != null) {
            tlmVar2.a(tlmVar);
        } else {
            tlmVar = tlmVar2;
        }
        tlmVar.a(new com.taobao.themis.canvas.launch_step.b(this.f33024a, this, qppVar)).a(new com.taobao.themis.canvas.launch_step.c(this.f33024a, this, qppVar)).a(new g(this.f33024a, this, qppVar)).a(new tln(this.f33024a, this, qppVar)).a(new e(this.f33024a, this, qppVar)).a(new com.taobao.themis.canvas.launch_step.d(this.f33024a, this, qppVar)).a(new com.taobao.themis.canvas.launch_step.f(this.f33024a, this, qppVar)).a(new com.taobao.themis.canvas.launch_step.a(this.f33024a, this, qppVar)).a(new com.taobao.themis.kernel.launcher.step.c(this.f33024a, this, qppVar));
        tlmVar2.b();
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (this.f33024a == null || this.f33024a.o() == null) {
        } else {
            ((IUserTrackerAdapter) qpt.b(IUserTrackerAdapter.class)).updatePageProperties(this.f33024a.o(), u.a(this.f33024a));
            ((IUserTrackerAdapter) qpt.b(IUserTrackerAdapter.class)).updatePageUtParam(this.f33024a.o(), u.b(this.f33024a));
            ((IUserTrackerAdapter) qpt.b(IUserTrackerAdapter.class)).updatePageName(this.f33024a.o(), u.c(this.f33024a));
            ((IUserTrackerAdapter) qpt.b(IUserTrackerAdapter.class)).updatePageUrl(this.f33024a.o(), this.f33024a.g());
        }
    }
}
