package com.alipay.android.msp.drivers.dipatchers;

import com.alipay.android.msp.core.context.MspContext;
import com.alipay.android.msp.drivers.actions.ActionTypes;
import com.alipay.android.msp.drivers.dipatchers.RealCall;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class MspDispatcher {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private ThreadPoolExecutor b;
    private final MspContext e;

    /* renamed from: a  reason: collision with root package name */
    private final int f4576a = 1;
    private final Deque<RealCall.AsyncCall> d = new ArrayDeque();
    private final Deque<RealCall.AsyncCall> c = new ArrayDeque();
    private boolean f = false;

    public static /* synthetic */ MspContext a(MspDispatcher mspDispatcher) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MspContext) ipChange.ipc$dispatch("10ee6278", new Object[]{mspDispatcher}) : mspDispatcher.e;
    }

    public MspDispatcher(MspContext mspContext) {
        this.e = mspContext;
    }

    private ExecutorService b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecutorService) ipChange.ipc$dispatch("1a7854d2", new Object[]{this});
        }
        if (this.b == null) {
            synchronized (this) {
                if (this.b == null) {
                    this.b = new ThreadPoolExecutor(2, 16, 2L, TimeUnit.SECONDS, new SynchronousQueue(), new ThreadFactory() { // from class: com.alipay.android.msp.drivers.dipatchers.MspDispatcher.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.util.concurrent.ThreadFactory
                        public Thread newThread(Runnable runnable) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                return (Thread) ipChange2.ipc$dispatch("d8079a58", new Object[]{this, runnable});
                            }
                            Thread thread = new Thread(runnable, "MspDispatcherThread-" + System.currentTimeMillis());
                            thread.setDaemon(false);
                            return thread;
                        }
                    }, new RejectedExecutionHandler() { // from class: com.alipay.android.msp.drivers.dipatchers.MspDispatcher.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.util.concurrent.RejectedExecutionHandler
                        public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("bf6566d1", new Object[]{this, runnable, threadPoolExecutor});
                                return;
                            }
                            LogUtil.record(8, "MspDispatcher:rejectedExecution", "coreSize=" + threadPoolExecutor.getCorePoolSize() + " activeCnt=" + threadPoolExecutor.getActiveCount() + " poolSize=" + threadPoolExecutor.getPoolSize());
                            throw new RejectedExecutionException("MspDispatcher:Task " + runnable.toString() + " rejected from " + MspDispatcher.a(MspDispatcher.this));
                        }
                    });
                    this.b.allowCoreThreadTimeOut(true);
                }
            }
        }
        return this.b;
    }

    public void onExit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2681a1a4", new Object[]{this});
            return;
        }
        LogUtil.record(2, "MspDispatcher:onExit", "onExit, ctx=" + this.e);
        ThreadPoolExecutor threadPoolExecutor = this.b;
        if (threadPoolExecutor != null) {
            this.f = true;
            threadPoolExecutor.shutdown();
        }
        try {
            if (this.e == null || this.e.getStoreCenter() == null) {
                return;
            }
            this.e.getStoreCenter().cleanJsPlugin();
        } catch (Exception e) {
            LogUtil.printExceptionStackTrace(e);
        }
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.f;
    }

    public synchronized void a(RealCall.AsyncCall asyncCall) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87526e99", new Object[]{this, asyncCall});
            return;
        }
        LogUtil.i("MspDispatcher", "enqueue", asyncCall.a().hashCode() + " " + asyncCall.a().getType().toString() + " runningAsyncCalls: " + this.c.size());
        if (asyncCall.a().getType() != ActionTypes.NET_REQUEST && asyncCall.a().getType() != ActionTypes.NET_RESPONSE && asyncCall.a().getType() != ActionTypes.NET_RETRY) {
            if (this.c.size() <= 0) {
                this.c.add(asyncCall);
                b().execute(asyncCall);
                return;
            }
            this.d.add(asyncCall);
            return;
        }
        b().execute(asyncCall);
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        LogUtil.i("MspDispatcher", "promoteCalls", "runningAsyncCalls.size=" + this.c.size() + " readyAsyncCalls.size=" + this.d.size() + ", ctx=" + this.e);
        if (this.c.size() > 0 || this.d.isEmpty()) {
            return;
        }
        try {
            Iterator<RealCall.AsyncCall> it = this.d.iterator();
            while (it.hasNext()) {
                RealCall.AsyncCall next = it.next();
                if (this.c.size() <= 0) {
                    it.remove();
                    this.c.add(next);
                    b().execute(next);
                }
                if (this.c.size() > 0) {
                    return;
                }
            }
        } catch (Exception e) {
            LogUtil.printExceptionStackTrace(e);
        }
    }

    public void b(RealCall.AsyncCall asyncCall) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6313ea5a", new Object[]{this, asyncCall});
            return;
        }
        Deque<RealCall.AsyncCall> deque = this.c;
        if (asyncCall.a().getType() == ActionTypes.NET_REQUEST || asyncCall.a().getType() == ActionTypes.NET_RESPONSE || asyncCall.a().getType() == ActionTypes.NET_RETRY) {
            return;
        }
        synchronized (this) {
            if (!deque.remove(asyncCall)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
            c();
        }
    }
}
