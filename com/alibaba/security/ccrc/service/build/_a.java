package com.alibaba.security.ccrc.service.build;

import com.alibaba.security.ccrc.common.log.Logging;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public class _a extends ThreadPoolExecutor.DiscardOldestPolicy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final AtomicInteger f3290a = new AtomicInteger(0);
    public final /* synthetic */ C1198bb b;

    public _a(C1198bb c1198bb) {
        this.b = c1198bb;
    }

    public static /* synthetic */ Object ipc$super(_a _aVar, String str, Object... objArr) {
        if (str.hashCode() == -1083873583) {
            super.rejectedExecution((Runnable) objArr[0], (ThreadPoolExecutor) objArr[1]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // java.util.concurrent.ThreadPoolExecutor.DiscardOldestPolicy, java.util.concurrent.RejectedExecutionHandler
    public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf6566d1", new Object[]{this, runnable, threadPoolExecutor});
            return;
        }
        super.rejectedExecution(runnable, threadPoolExecutor);
        StringBuilder a2 = Yb.a("input sample too frequently ,task discard#");
        a2.append(this.f3290a.incrementAndGet());
        Logging.e(C1198bb.f3294a, a2.toString());
    }
}
