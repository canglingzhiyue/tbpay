package com.taobao.message.kit.threadpool;

/* loaded from: classes7.dex */
public interface CoordinatorThreadSubscriber {
    void beforeExecute(BaseRunnable baseRunnable);

    void runnableInit(BaseRunnable baseRunnable);
}
