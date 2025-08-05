package com.alibaba.security.ccrc.service.build;

import com.alibaba.security.ccrc.service.CcrcService;
import com.alibaba.security.wukong.model.CCRCRiskSample;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class Za implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CCRCRiskSample f3289a;
    public final /* synthetic */ CcrcService.Config b;
    public final /* synthetic */ C1198bb c;

    public Za(C1198bb c1198bb, CCRCRiskSample cCRCRiskSample, CcrcService.Config config) {
        this.c = c1198bb;
        this.f3289a = cCRCRiskSample;
        this.b = config;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        C1198bb c1198bb = this.c;
        if (!C1198bb.$ipChange.a()) {
            return;
        }
        C1198bb.a(this.c, this.f3289a, this.b);
    }
}
