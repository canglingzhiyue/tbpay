package com.alibaba.security.ccrc.service.build;

import com.alibaba.security.wukong.bx.CcrcBHService;
import com.android.alibaba.ip.runtime.IpChange;

/* renamed from: com.alibaba.security.ccrc.service.build.hb  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class RunnableC1216hb implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CcrcBHService f3309a;

    public RunnableC1216hb(CcrcBHService ccrcBHService) {
        this.f3309a = ccrcBHService;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        CcrcBHService ccrcBHService = this.f3309a;
        if (CcrcBHService.$ipChange == null) {
            return;
        }
        CcrcBHService ccrcBHService2 = this.f3309a;
        CcrcBHService.$ipChange.deActivate();
    }
}
