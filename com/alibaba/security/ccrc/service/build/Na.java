package com.alibaba.security.ccrc.service.build;

import com.alibaba.security.ccrc.enums.InitState;
import com.alibaba.security.ccrc.model.InitResult;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class Na implements InterfaceC1267z {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Oa f3262a;

    public Na(Oa oa) {
        this.f3262a = oa;
    }

    @Override // com.alibaba.security.ccrc.service.build.InterfaceC1267z
    public void a(InitState initState, InitResult initResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f285eb51", new Object[]{this, initState, initResult});
            return;
        }
        Oa oa = this.f3262a;
        if (Oa.$ipChange) {
            return;
        }
        if (initState != InitState.INIT_SUCCESS && initState != InitState.INITED) {
            Oa oa2 = this.f3262a;
            StringBuilder a2 = Yb.a("CCRC activate fail: ");
            a2.append(initResult.getErrorMsg());
            Oa.a(oa2, W.a(a2.toString()));
            Oa.b(this.f3262a);
            return;
        }
        Oa.c(this.f3262a);
    }

    @Override // com.alibaba.security.ccrc.interfaces.OnCcrcCallback
    public void onInit(InitState initState, InitResult initResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe7d6f63", new Object[]{this, initState, initResult});
        }
    }
}
