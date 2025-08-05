package com.taobao.android.lightvane.jsbridge;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.gwj;
import tb.gwk;
import tb.ruk;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ljava/util/concurrent/ThreadPoolExecutor;", "invoke"}, k = 3, mv = {1, 4, 1})
/* loaded from: classes5.dex */
public final class LVBridgeEngine$Companion$sExecutors$2 extends Lambda implements ruk<ThreadPoolExecutor> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final LVBridgeEngine$Companion$sExecutors$2 INSTANCE = new LVBridgeEngine$Companion$sExecutors$2();

    public LVBridgeEngine$Companion$sExecutors$2() {
        super(0);
    }

    @Override // tb.ruk
    /* renamed from: invoke  reason: collision with other method in class */
    public final ThreadPoolExecutor mo2427invoke() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThreadPoolExecutor) ipChange.ipc$dispatch("94d634df", new Object[]{this});
        }
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 3, 5L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new gwk("GVBridgeEngine"));
        gwj.a(null, null, new LVBridgeEngine$Companion$sExecutors$2$1$1(threadPoolExecutor), 3, null);
        return threadPoolExecutor;
    }
}
