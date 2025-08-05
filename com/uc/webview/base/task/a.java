package com.uc.webview.base.task;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* loaded from: classes9.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private ScheduledThreadPoolExecutor f23794a;

    /* renamed from: com.uc.webview.base.task.a$a  reason: collision with other inner class name */
    /* loaded from: classes9.dex */
    static class ThreadFactoryC1035a implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        String f23795a;
        int b;

        ThreadFactoryC1035a(String str, int i) {
            this.f23795a = str;
            i = i <= 0 ? 1 : i;
            this.b = i <= 10 ? i : 10;
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, this.f23795a);
            thread.setPriority(this.b);
            return thread;
        }
    }

    public a(String str) {
        this(str, Thread.currentThread().getPriority());
    }

    private a(String str, int i) {
        this.f23794a = new ScheduledThreadPoolExecutor(1, new ThreadFactoryC1035a(str, i));
        this.f23794a.setKeepAliveTime(35000L, TimeUnit.MILLISECONDS);
        this.f23794a.allowCoreThreadTimeOut(true);
    }

    public final void a(Runnable runnable) {
        this.f23794a.execute(runnable);
    }
}
