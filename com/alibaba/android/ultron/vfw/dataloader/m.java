package com.alibaba.android.ultron.vfw.dataloader;

import android.os.Handler;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import tb.bpd;
import tb.jqh;
import tb.kge;

/* loaded from: classes2.dex */
public class m implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static volatile int c;
    private static ExecutorService d;
    private static Handler e;

    /* renamed from: a  reason: collision with root package name */
    public p f2705a;
    public a b;

    /* loaded from: classes2.dex */
    public interface a {
        void a();
    }

    static {
        kge.a(-1154537894);
        kge.a(-1390502639);
        c = -1;
    }

    public m(p pVar) {
        this.f2705a = pVar;
    }

    public m(p pVar, a aVar) {
        this.f2705a = pVar;
        this.b = aVar;
    }

    private static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[0]);
            return;
        }
        synchronized (m.class) {
            if (c != -1) {
                return;
            }
            if (d != null) {
                d();
            }
            if (bpd.e()) {
                d = jqh.a(1, 1, 100L, TimeUnit.MILLISECONDS, "DataRequestTask");
            } else {
                d = Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: com.alibaba.android.ultron.vfw.dataloader.m.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.util.concurrent.ThreadFactory
                    public Thread newThread(Runnable runnable) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return (Thread) ipChange2.ipc$dispatch("d8079a58", new Object[]{this, runnable});
                        }
                        Thread thread = new Thread(runnable);
                        thread.setName("DataRequestTask");
                        return thread;
                    }
                });
            }
            e = new Handler(Looper.getMainLooper());
            c = 0;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        p pVar = this.f2705a;
        if (pVar == null) {
            return;
        }
        pVar.a(this.b);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        if (c == -1) {
            c();
        }
        d.execute(this);
    }

    private static void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[0]);
            return;
        }
        ExecutorService executorService = d;
        if (executorService != null && !executorService.isShutdown()) {
            d.shutdownNow();
        }
        b();
        c = -1;
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
            return;
        }
        Handler handler = e;
        if (handler == null) {
            return;
        }
        handler.removeCallbacksAndMessages(null);
    }
}
