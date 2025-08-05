package com.alibaba.security.ccrc.service.build;

import com.alibaba.security.ccrc.common.log.Logging;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class r implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ InterfaceC1232n f3323a;
    public final /* synthetic */ CountDownLatch b;
    public final /* synthetic */ Runnable c;

    public r(InterfaceC1232n interfaceC1232n, CountDownLatch countDownLatch, Runnable runnable) {
        this.f3323a = interfaceC1232n;
        this.b = countDownLatch;
        this.c = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        while (!this.f3323a.a()) {
            try {
                this.b.await(1L, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e) {
                StringBuilder a2 = Yb.a("future task has been canceled ");
                a2.append(e.getMessage());
                Logging.w(C1249t.f3327a, a2.toString());
            }
        }
        this.c.run();
    }
}
