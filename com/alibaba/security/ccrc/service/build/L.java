package com.alibaba.security.ccrc.service.build;

import com.alibaba.security.ccrc.enums.InitState;
import com.alibaba.security.ccrc.enums.RunState;
import com.alibaba.security.ccrc.interfaces.OnCcrcCallback;
import com.alibaba.security.ccrc.model.InitResult;
import com.alibaba.security.ccrc.service.CcrcService;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* loaded from: classes3.dex */
public class L implements InterfaceC1257vb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CcrcService.Config f3256a;
    public final /* synthetic */ OnCcrcCallback b;
    public final /* synthetic */ long c;
    public final /* synthetic */ M d;

    public L(M m, CcrcService.Config config, OnCcrcCallback onCcrcCallback, long j) {
        this.d = m;
        this.f3256a = config;
        this.b = onCcrcCallback;
        this.c = j;
    }

    @Override // com.alibaba.security.ccrc.service.build.InterfaceC1257vb
    public void a(boolean z, String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2499ee8f", new Object[]{this, new Boolean(z), str, map});
            return;
        }
        M.a(this.d, z ? RunState.ACTIVE_SUCCESS : RunState.PREPARE_SUCCESS);
        M m = this.d;
        P p = M.$ipChange;
        CcrcService.Config config = this.f3256a;
        InitState initState = z ? InitState.INIT_SUCCESS : InitState.INIT_FAIL;
        InitResult createResult = InitResult.createResult(str, this.f3256a.getPid());
        M m2 = this.d;
        p.a(config, initState, createResult, M.$ipChange, this.b, this.c);
    }
}
