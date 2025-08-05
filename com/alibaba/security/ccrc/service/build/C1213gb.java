package com.alibaba.security.ccrc.service.build;

import com.alibaba.security.ccrc.common.log.Logging;
import com.alibaba.security.ccrc.enums.InitState;
import com.alibaba.security.ccrc.interfaces.OnCcrcCallback;
import com.alibaba.security.ccrc.model.InitResult;
import com.alibaba.security.wukong.bx.CcrcBHService;
import com.android.alibaba.ip.runtime.IpChange;

/* renamed from: com.alibaba.security.ccrc.service.build.gb  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1213gb implements OnCcrcCallback {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CcrcBHService f3306a;

    public C1213gb(CcrcBHService ccrcBHService) {
        this.f3306a = ccrcBHService;
    }

    @Override // com.alibaba.security.ccrc.interfaces.OnCcrcCallback
    public void onInit(InitState initState, InitResult initResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe7d6f63", new Object[]{this, initState, initResult});
            return;
        }
        StringBuilder a2 = Yb.a("active callback: ");
        a2.append(initState.toString());
        a2.append(" result: ");
        a2.append(initResult.getErrorMsg());
        Logging.d(CcrcBHService.TAG, a2.toString());
        CcrcBHService ccrcBHService = this.f3306a;
        if (CcrcBHService.$ipChange.isEmpty()) {
            return;
        }
        CcrcBHService.access$400(this.f3306a);
    }
}
