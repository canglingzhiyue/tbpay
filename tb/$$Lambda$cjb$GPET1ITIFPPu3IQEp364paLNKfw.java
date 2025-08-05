package tb;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

/* compiled from: lambda */
/* renamed from: tb.-$$Lambda$cjb$GPET1ITIFPPu3IQEp364paLNKfw  reason: invalid class name */
/* loaded from: classes9.dex */
public final /* synthetic */ class $$Lambda$cjb$GPET1ITIFPPu3IQEp364paLNKfw implements RejectedExecutionHandler {
    public static final /* synthetic */ $$Lambda$cjb$GPET1ITIFPPu3IQEp364paLNKfw INSTANCE = new $$Lambda$cjb$GPET1ITIFPPu3IQEp364paLNKfw();

    private /* synthetic */ $$Lambda$cjb$GPET1ITIFPPu3IQEp364paLNKfw() {
    }

    @Override // java.util.concurrent.RejectedExecutionHandler
    public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        cjb.a(runnable, threadPoolExecutor);
    }
}
