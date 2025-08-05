package com.taobao.themis.kernel.executor;

import com.taobao.themis.kernel.basic.DefaultAdapterImpl;
import com.taobao.themis.kernel.basic.a;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

@DefaultAdapterImpl("com.taobao.themis.inside.adapter.TMSExecutorImpl")
/* loaded from: classes9.dex */
public interface IExecutorService extends a {
    Executor getExecutor(ExecutorType executorType);

    ScheduledExecutorService getScheduledExecutor();
}
