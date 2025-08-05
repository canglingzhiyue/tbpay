package com.alibaba.security.ccrc.service.build;

import com.alibaba.security.client.smart.core.track.easy.EasyTracker;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.common.Constants;

/* loaded from: classes3.dex */
public class Ca implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ EasyTracker f3234a;

    public Ca(EasyTracker easyTracker) {
        this.f3234a = easyTracker;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        EasyTracker easyTracker = this.f3234a;
        if (!EasyTracker.$ipChange.b()) {
            EasyTracker easyTracker2 = this.f3234a;
            if (!EasyTracker.$ipChange.a(Kb.b().o())) {
                return;
            }
        }
        EasyTracker.access$200(this.f3234a, EasyTracker.$ipChange, Constants.Name.INTERVAL);
    }
}
