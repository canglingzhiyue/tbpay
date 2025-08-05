package com.taobao.android.virtual_thread.face;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.virtual_thread.face.g;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import tb.kge;

/* loaded from: classes6.dex */
public class VExecutors {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static a currentThreadGetter;
    private static g threadLocalFactory;
    private static i threadPoolFactory;

    static {
        kge.a(159129214);
        threadPoolFactory = new DefaultThreadPoolFactory();
        threadLocalFactory = new b();
        currentThreadGetter = $$Lambda$subkBL4iFxiJiOZdNNtCUAkLiI.INSTANCE;
    }

    public static void setThreadPoolFactory(i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28c0103", new Object[]{iVar});
        } else {
            threadPoolFactory = (i) Objects.requireNonNull(iVar);
        }
    }

    public static void setCurrentThreadGetter(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2390ebf5", new Object[]{aVar});
        } else {
            currentThreadGetter = (a) Objects.requireNonNull(aVar);
        }
    }

    public static void setThreadLocalFactory(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("273dee2e", new Object[]{gVar});
        } else {
            threadLocalFactory = (g) Objects.requireNonNull(gVar);
        }
    }

    public static boolean isVirtualEnv() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2635dd37", new Object[0])).booleanValue() : threadPoolFactory instanceof DefaultThreadPoolFactory;
    }

    public static i getThreadPoolFactory() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (i) ipChange.ipc$dispatch("f1bbcbdb", new Object[0]) : threadPoolFactory;
    }

    public static Thread currentThread() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Thread) ipChange.ipc$dispatch("98f2c31d", new Object[0]) : currentThreadGetter.currentThread();
    }

    public static ExecutorService defaultSharedThreadPool() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ExecutorService) ipChange.ipc$dispatch("f32acc88", new Object[0]) : threadPoolFactory.a();
    }

    public static <T> ThreadLocal<T> newThreadLocalWithInitial(g.a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ThreadLocal) ipChange.ipc$dispatch("bcebcba7", new Object[]{aVar}) : threadLocalFactory.a(aVar);
    }

    public static boolean isWorkingOn(Thread thread) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e5f63c62", new Object[]{thread})).booleanValue() : currentThreadGetter.currentThread() == thread || Thread.currentThread() == thread;
    }

    public static ExecutorService newFixedThreadPool(int i, h hVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ExecutorService) ipChange.ipc$dispatch("75afc27e", new Object[]{new Integer(i), hVar}) : threadPoolFactory.a(i, i, 10L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), hVar, new ThreadPoolExecutor.AbortPolicy());
    }

    public static ExecutorService newFixedThreadPool(int i, h hVar, RejectedExecutionHandler rejectedExecutionHandler) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ExecutorService) ipChange.ipc$dispatch("af540edf", new Object[]{new Integer(i), hVar, rejectedExecutionHandler}) : threadPoolFactory.a(i, i, 10L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), hVar, rejectedExecutionHandler);
    }

    public static ExecutorService newSingleThreadExecutor(h hVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ExecutorService) ipChange.ipc$dispatch("6387bb94", new Object[]{hVar}) : threadPoolFactory.a(1, 1, 10L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), hVar, new ThreadPoolExecutor.AbortPolicy());
    }

    public static ExecutorService newSingleThreadExecutor(h hVar, RejectedExecutionHandler rejectedExecutionHandler) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ExecutorService) ipChange.ipc$dispatch("2378df09", new Object[]{hVar, rejectedExecutionHandler}) : threadPoolFactory.a(1, 1, 10L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), hVar, rejectedExecutionHandler);
    }

    public static ExecutorService newCachedThreadPool(h hVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ExecutorService) ipChange.ipc$dispatch("d427c611", new Object[]{hVar}) : threadPoolFactory.a(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), hVar, new ThreadPoolExecutor.AbortPolicy());
    }

    public static ExecutorService newCachedThreadPool(h hVar, RejectedExecutionHandler rejectedExecutionHandler) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ExecutorService) ipChange.ipc$dispatch("11c9eec", new Object[]{hVar, rejectedExecutionHandler}) : threadPoolFactory.a(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), hVar, rejectedExecutionHandler);
    }

    public static ScheduledExecutorService newSingleThreadScheduledExecutor(h hVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ScheduledExecutorService) ipChange.ipc$dispatch("e0e1b4", new Object[]{hVar}) : threadPoolFactory.a(1, hVar, new ThreadPoolExecutor.AbortPolicy());
    }

    public static ScheduledExecutorService newSingleThreadScheduledExecutor(h hVar, RejectedExecutionHandler rejectedExecutionHandler) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ScheduledExecutorService) ipChange.ipc$dispatch("6f043eed", new Object[]{hVar, rejectedExecutionHandler}) : threadPoolFactory.a(1, hVar, rejectedExecutionHandler);
    }

    public static ScheduledExecutorService newScheduledThreadPool(int i, h hVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ScheduledExecutorService) ipChange.ipc$dispatch("36e7cec8", new Object[]{new Integer(i), hVar}) : threadPoolFactory.a(i, hVar, new ThreadPoolExecutor.AbortPolicy());
    }

    public static ScheduledExecutorService newScheduledThreadPool(int i, h hVar, RejectedExecutionHandler rejectedExecutionHandler) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ScheduledExecutorService) ipChange.ipc$dispatch("5fee5759", new Object[]{new Integer(i), hVar, rejectedExecutionHandler}) : threadPoolFactory.a(i, hVar, rejectedExecutionHandler);
    }
}
