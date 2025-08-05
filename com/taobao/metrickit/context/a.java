package com.taobao.metrickit.context;

import android.os.HandlerThread;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final a f18071a = new a();
    private volatile HandlerThread b;
    private volatile HandlerThread d;
    private volatile Executor f;
    private final Object c = new Object();
    private final Object e = new Object();
    private final Object g = new Object();

    public static a a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("334c2978", new Object[0]) : f18071a;
    }

    public HandlerThread b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HandlerThread) ipChange.ipc$dispatch("3f7029d3", new Object[]{this});
        }
        if (this.b == null) {
            synchronized (this.c) {
                if (this.b == null) {
                    this.b = new HandlerThread("Metric-Kit");
                    this.b.start();
                }
            }
        }
        return this.b;
    }

    public HandlerThread c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HandlerThread) ipChange.ipc$dispatch("401cd572", new Object[]{this});
        }
        if (this.d == null) {
            synchronized (this.e) {
                if (this.d == null) {
                    HandlerThread handlerThread = new HandlerThread("Metric-Kit-Callback");
                    handlerThread.start();
                    this.d = handlerThread;
                }
            }
        }
        return this.d;
    }

    public Executor d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Executor) ipChange.ipc$dispatch("f6cee4b1", new Object[]{this});
        }
        if (this.f == null) {
            synchronized (this.g) {
                if (this.f == null) {
                    final AtomicInteger atomicInteger = new AtomicInteger(0);
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(3, 3, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new ThreadFactory() { // from class: com.taobao.metrickit.context.a.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.util.concurrent.ThreadFactory
                        public Thread newThread(Runnable runnable) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                return (Thread) ipChange2.ipc$dispatch("d8079a58", new Object[]{this, runnable});
                            }
                            return new Thread(runnable, "Metric-common-" + atomicInteger.getAndIncrement());
                        }
                    }, new ThreadPoolExecutor.AbortPolicy());
                    threadPoolExecutor.setKeepAliveTime(3000L, TimeUnit.MILLISECONDS);
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.f = threadPoolExecutor;
                }
            }
        }
        return this.f;
    }
}
