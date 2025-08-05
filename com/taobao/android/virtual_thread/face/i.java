package com.taobao.android.virtual_thread.face;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes6.dex */
public interface i {
    ExecutorService a();

    ExecutorService a(int i, int i2, long j, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, h hVar, RejectedExecutionHandler rejectedExecutionHandler);

    ScheduledExecutorService a(int i, h hVar, RejectedExecutionHandler rejectedExecutionHandler);
}
