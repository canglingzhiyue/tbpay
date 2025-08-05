package com.taobao.appbundle.scheduler.internal;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.appbundle.scheduler.Priority;
import com.taobao.appbundle.scheduler.internal.g;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import tb.kge;

/* loaded from: classes6.dex */
public final class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final int f16304a;
    private final PriorityBlockingQueue<e> e = new PriorityBlockingQueue<>();
    private final AtomicInteger c = new AtomicInteger();
    private final AtomicInteger b = new AtomicInteger();
    private final ThreadPoolExecutor d = new ThreadPoolExecutor(1, 1, 60, TimeUnit.SECONDS, new PriorityBlockingQueue(), new ThreadFactoryC0629b("feaureInstaller"));

    public static /* synthetic */ PriorityBlockingQueue a(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PriorityBlockingQueue) ipChange.ipc$dispatch("8797a12f", new Object[]{bVar}) : bVar.e;
    }

    public static /* synthetic */ int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[0])).intValue() : f16304a;
    }

    public static /* synthetic */ AtomicInteger b(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicInteger) ipChange.ipc$dispatch("7af6e7bf", new Object[]{bVar}) : bVar.c;
    }

    static {
        kge.a(-1777622073);
        f16304a = (Runtime.getRuntime().availableProcessors() * 2) + 1;
    }

    private b() {
        this.d.allowCoreThreadTimeOut(true);
        this.d.submit(new Runnable() { // from class: com.taobao.appbundle.scheduler.internal.b.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                while (true) {
                    try {
                        e eVar = (e) b.a(b.this).poll(120L, TimeUnit.SECONDS);
                        if (eVar == null) {
                            return;
                        }
                        eVar.run();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                }
            }
        });
    }

    /* renamed from: com.taobao.appbundle.scheduler.internal.b$b  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public static class ThreadFactoryC0629b implements ThreadFactory {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private AtomicInteger f16307a = new AtomicInteger();
        private String b;

        static {
            kge.a(1304538659);
            kge.a(-1938806936);
        }

        private String a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
            }
            StringBuilder sb = new StringBuilder();
            sb.append(this.b);
            sb.append("-Thread-#");
            sb.append(this.f16307a.incrementAndGet());
            return sb.toString();
        }

        public ThreadFactoryC0629b(String str) {
            this.b = str;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable}) : new Thread(runnable, a());
        }
    }

    public static b a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("a66af076", new Object[0]) : new b();
    }

    public g a(Priority priority) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (g) ipChange.ipc$dispatch("8d9d102b", new Object[]{this, priority}) : new a(priority, this.b.incrementAndGet());
    }

    /* loaded from: classes6.dex */
    public final class a extends g {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final Priority b;
        private final int c;

        static {
            kge.a(358991181);
        }

        private a(Priority priority, int i) {
            this.b = priority;
            this.c = i;
        }

        @Override // com.taobao.appbundle.scheduler.internal.g
        public g.a a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (g.a) ipChange.ipc$dispatch("b772a674", new Object[]{this});
            }
            synchronized (b.b(b.this)) {
                if (b.b(b.this).get() < b.b()) {
                    b.b(b.this).incrementAndGet();
                }
            }
            return new f(b.a(b.this), this.b, this.c);
        }
    }
}
