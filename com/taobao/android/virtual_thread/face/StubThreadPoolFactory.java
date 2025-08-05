package com.taobao.android.virtual_thread.face;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.virtual_thread.stub.StubScheduledThreadPoolExecutor;
import com.taobao.android.virtual_thread.stub.StubThreadPoolExecutor;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import tb.kge;

/* loaded from: classes6.dex */
public class StubThreadPoolFactory implements i {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final ExecutorService f15809a;

    static {
        kge.a(1766907138);
        kge.a(1875274256);
        f15809a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 3L, TimeUnit.SECONDS, new SynchronousQueue(), $$Lambda$StubThreadPoolFactory$ATBeRPC2zsus_J6X4_8s2fHydLU.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Thread a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Thread) ipChange.ipc$dispatch("b72a5ba1", new Object[]{runnable}) : new Thread(runnable, "shared-pool");
    }

    @Override // com.taobao.android.virtual_thread.face.i
    public ExecutorService a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ExecutorService) ipChange.ipc$dispatch("13131fb3", new Object[]{this}) : f15809a;
    }

    @Override // com.taobao.android.virtual_thread.face.i
    public ExecutorService a(int i, int i2, long j, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, h hVar, RejectedExecutionHandler rejectedExecutionHandler) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ExecutorService) ipChange.ipc$dispatch("57ee6b64", new Object[]{this, new Integer(i), new Integer(i2), new Long(j), timeUnit, blockingQueue, hVar, rejectedExecutionHandler}) : new StubThreadPoolExecutor(i, i2, j, timeUnit, blockingQueue, new e$a(hVar), rejectedExecutionHandler);
    }

    @Override // com.taobao.android.virtual_thread.face.i
    public ScheduledExecutorService a(int i, h hVar, RejectedExecutionHandler rejectedExecutionHandler) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ScheduledExecutorService) ipChange.ipc$dispatch("1dbe8aa7", new Object[]{this, new Integer(i), hVar, rejectedExecutionHandler}) : new StubScheduledThreadPoolExecutor(i, new e$a(hVar), rejectedExecutionHandler);
    }
}
