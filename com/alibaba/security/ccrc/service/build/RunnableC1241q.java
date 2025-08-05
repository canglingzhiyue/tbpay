package com.alibaba.security.ccrc.service.build;

import android.os.Process;
import com.android.alibaba.ip.runtime.IpChange;

/* renamed from: com.alibaba.security.ccrc.service.build.q  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class RunnableC1241q implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Runnable f3320a;

    public RunnableC1241q(Runnable runnable) {
        this.f3320a = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        Process.setThreadPriority(10);
        this.f3320a.run();
    }
}
