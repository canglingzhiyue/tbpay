package com.alibaba.security.ccrc.service.build;

import com.alibaba.security.ccrc.common.log.Logging;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class Tb implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Runnable f3277a;
    public final /* synthetic */ Ub b;

    public Tb(Ub ub, Runnable runnable) {
        this.b = ub;
        this.f3277a = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        try {
            this.f3277a.run();
        } catch (Throwable th) {
            th.printStackTrace();
            Logging.e(Ub.c, "file process error", th);
        }
    }
}
