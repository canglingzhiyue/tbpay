package com.taobao.tao.log.utils;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.virtual_thread.face.VExecutors;
import com.taobao.android.virtual_thread.face.h;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import tb.kge;

/* loaded from: classes.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final ThreadPoolExecutor f20705a;
    private final ScheduledThreadPoolExecutor b;
    private final ThreadPoolExecutor c;

    /* loaded from: classes.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final d f20710a;

        static {
            kge.a(1166791442);
            f20710a = new d();
        }

        public static /* synthetic */ d a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("40078b42", new Object[0]) : f20710a;
        }
    }

    static {
        kge.a(-1623816129);
    }

    private d() {
        boolean b = b();
        this.b = a(b, "tlog-inner-thread");
        ThreadPoolExecutor.AbortPolicy abortPolicy = new ThreadPoolExecutor.AbortPolicy();
        this.f20705a = a(b, 3L, "tlog-write-thread", abortPolicy);
        this.c = a(b, 5L, "tlog-main-thread", abortPolicy);
        this.b.setKeepAliveTime(1L, TimeUnit.SECONDS);
        this.b.allowCoreThreadTimeOut(true);
        this.f20705a.allowCoreThreadTimeOut(true);
        this.c.allowCoreThreadTimeOut(true);
        Log.e("TLog.TLogThreadPool", "TLogThreadPool constructor done.");
    }

    public static d a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("40078b42", new Object[0]) : a.a();
    }

    public void b(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87c15fe7", new Object[]{this, runnable});
        } else {
            this.f20705a.execute(runnable);
        }
    }

    public void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39112e6", new Object[]{this, runnable});
        } else {
            this.b.execute(runnable);
        }
    }

    public void a(Runnable runnable, long j, TimeUnit timeUnit) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9aab07da", new Object[]{this, runnable, new Long(j), timeUnit});
        } else {
            this.b.schedule(runnable, j, timeUnit);
        }
    }

    public void c(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf1ace8", new Object[]{this, runnable});
        } else {
            this.c.execute(runnable);
        }
    }

    private boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        try {
            Class.forName("com.taobao.android.virtual_thread.face.VExecutors");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    private ScheduledThreadPoolExecutor a(boolean z, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScheduledThreadPoolExecutor) ipChange.ipc$dispatch("7ce58fc1", new Object[]{this, new Boolean(z), str});
        }
        if (z) {
            return (ScheduledThreadPoolExecutor) VExecutors.newScheduledThreadPool(1, new h() { // from class: com.taobao.tao.log.utils.d.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.virtual_thread.face.h
                public String newThreadName() {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("57dab4a4", new Object[]{this}) : str;
                }
            });
        }
        return new ScheduledThreadPoolExecutor(1, new ThreadFactory() { // from class: com.taobao.tao.log.utils.d.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (Thread) ipChange2.ipc$dispatch("d8079a58", new Object[]{this, runnable}) : new Thread(runnable, str);
            }
        });
    }

    private ThreadPoolExecutor a(boolean z, long j, final String str, ThreadPoolExecutor.AbortPolicy abortPolicy) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThreadPoolExecutor) ipChange.ipc$dispatch("d8fa98b0", new Object[]{this, new Boolean(z), new Long(j), str, abortPolicy});
        }
        if (z) {
            return (ThreadPoolExecutor) VExecutors.getThreadPoolFactory().a(1, 1, j, TimeUnit.SECONDS, new LinkedBlockingQueue(), new h() { // from class: com.taobao.tao.log.utils.d.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.virtual_thread.face.h
                public String newThreadName() {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("57dab4a4", new Object[]{this}) : str;
                }
            }, abortPolicy);
        }
        return new ThreadPoolExecutor(1, 1, j, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactory() { // from class: com.taobao.tao.log.utils.d.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (Thread) ipChange2.ipc$dispatch("d8079a58", new Object[]{this, runnable}) : new Thread(runnable, "tlog-main-thread");
            }
        });
    }
}
