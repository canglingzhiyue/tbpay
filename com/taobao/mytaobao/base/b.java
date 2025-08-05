package com.taobao.mytaobao.base;

import android.os.HandlerThread;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.virtual_thread.VirtualThread;
import com.taobao.android.virtual_thread.face.VExecutors;
import com.taobao.message.lab.comfrm.inner.Schedules;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import tb.kge;
import tb.mtz;

/* loaded from: classes7.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static ScheduledExecutorService f18299a;
    private static ScheduledExecutorService b;
    private static volatile HandlerThread c;

    static {
        kge.a(198992882);
        ScheduledExecutorService newScheduledThreadPool = VExecutors.newScheduledThreadPool(1, new Schedules.MyThreadNameFactory("MtbMonitor"));
        f18299a = newScheduledThreadPool;
        ((ThreadPoolExecutor) newScheduledThreadPool).setKeepAliveTime(10000L, TimeUnit.MILLISECONDS);
        ((ThreadPoolExecutor) f18299a).allowCoreThreadTimeOut(true);
        ScheduledExecutorService newScheduledThreadPool2 = VExecutors.newScheduledThreadPool(8, new Schedules.MyThreadNameFactory("MtbIO"));
        b = newScheduledThreadPool2;
        ((ThreadPoolExecutor) newScheduledThreadPool2).setKeepAliveTime(3000L, TimeUnit.MILLISECONDS);
        ((ThreadPoolExecutor) b).allowCoreThreadTimeOut(true);
    }

    public static void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39112e6", new Object[]{runnable});
        } else {
            f18299a.execute(runnable);
        }
    }

    public static void b(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87c15fe7", new Object[]{runnable});
        } else {
            b.execute(runnable);
        }
    }

    public static ScheduledFuture a(Runnable runnable, long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ScheduledFuture) ipChange.ipc$dispatch("3a56c08f", new Object[]{runnable, new Long(j)}) : b.schedule(runnable, j, TimeUnit.MILLISECONDS);
    }

    public static void c(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf1ace8", new Object[]{runnable});
        } else {
            new VirtualThread(runnable, "mtbLogic").ofVirtual().start();
        }
    }

    public static void d(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9021f9e9", new Object[]{runnable});
        } else {
            mtz.a(runnable);
        }
    }

    public static HandlerThread a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HandlerThread) ipChange.ipc$dispatch("3ec37e34", new Object[0]);
        }
        if (c != null) {
            return c;
        }
        synchronized (b.class) {
            if (c == null) {
                HandlerThread handlerThread = new HandlerThread("mtbMtop");
                c = handlerThread;
                handlerThread.start();
            }
        }
        return c;
    }
}
