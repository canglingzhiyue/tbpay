package com.alibaba.security.ccrc.service.build;

import com.alibaba.security.wukong.bx.CcrcBHService;
import com.android.alibaba.ip.runtime.IpChange;

/* renamed from: com.alibaba.security.ccrc.service.build.fb  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class RunnableC1210fb implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CcrcBHService f3303a;

    public RunnableC1210fb(CcrcBHService ccrcBHService) {
        this.f3303a = ccrcBHService;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        CcrcBHService ccrcBHService = this.f3303a;
        if (CcrcBHService.$ipChange == null) {
            return;
        }
        CcrcBHService.access$200(this.f3303a);
    }
}
