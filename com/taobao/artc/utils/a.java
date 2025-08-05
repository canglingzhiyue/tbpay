package com.taobao.artc.utils;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.virtual_thread.face.VExecutors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.webrtc.Logging;
import tb.kge;

/* loaded from: classes6.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static volatile ScheduledThreadPoolExecutor f16382a;
    private static volatile ScheduledThreadPoolExecutor b;
    private static volatile ScheduledThreadPoolExecutor c;
    private static volatile ScheduledThreadPoolExecutor d;
    private static volatile ScheduledThreadPoolExecutor e;

    static {
        kge.a(768444429);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("50938a53", new Object[0]) : "artc-httpdns";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d71944f2", new Object[0]) : "artc-gl";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5d9eff91", new Object[0]) : "artc-sig";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e424ba30", new Object[0]) : "artc-evt";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6aaa74cf", new Object[0]) : "artc-default";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f1302f6e", new Object[0]) : "artc-event";
    }

    /* renamed from: com.taobao.artc.utils.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public static class C0631a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private volatile ExecutorService f16383a = VExecutors.newSingleThreadExecutor($$Lambda$a$a$_2px40C05Bci_KdY1fBUs9u_sCs.INSTANCE);

        static {
            kge.a(-1279845431);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[0]) : "artc-single";
        }

        public C0631a(String str) {
            ArtcLog.i("AThreadPool", "new signal thread: " + str, new Object[0]);
        }

        public void a(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("39112e6", new Object[]{this, runnable});
            } else {
                this.f16383a.execute(runnable);
            }
        }

        public boolean a(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("a8219760", new Object[]{this, new Long(j)})).booleanValue();
            }
            Logging.d("AThreadPool", "stopThread");
            this.f16383a.shutdown();
            if (j <= 0) {
                return true;
            }
            try {
                return this.f16383a.awaitTermination(j, TimeUnit.MILLISECONDS);
            } catch (Exception e) {
                ArtcLog.i("AThreadPool", "awaitTermination exception: " + e.getMessage(), new Object[0]);
                return false;
            }
        }
    }

    public static ScheduledExecutorService a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScheduledExecutorService) ipChange.ipc$dispatch("7a4b6c8c", new Object[0]);
        }
        if (c == null) {
            c = (ScheduledThreadPoolExecutor) VExecutors.newSingleThreadScheduledExecutor($$Lambda$a$agarM749L3OcPDZxXxxjzQgpQ90.INSTANCE);
        }
        return c;
    }

    private static void a(ScheduledThreadPoolExecutor scheduledThreadPoolExecutor, Runnable runnable, long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c00e2f27", new Object[]{scheduledThreadPoolExecutor, runnable, new Long(j), str});
            return;
        }
        scheduledThreadPoolExecutor.schedule(runnable, j, TimeUnit.MILLISECONDS);
        int size = scheduledThreadPoolExecutor.getQueue().size();
        if (size <= 5) {
            return;
        }
        b.b("AThreadPool", str + " executor size:" + size);
    }

    public static void a(Runnable runnable, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e91c09e", new Object[]{runnable, new Long(j)});
            return;
        }
        if (f16382a == null) {
            f16382a = (ScheduledThreadPoolExecutor) VExecutors.newSingleThreadScheduledExecutor($$Lambda$a$z1hxp1869411PTwHCJPz20EpIMM.INSTANCE);
        }
        a(f16382a, runnable, j, "core");
    }

    public static void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39112e6", new Object[]{runnable});
            return;
        }
        if (c == null) {
            c = (ScheduledThreadPoolExecutor) VExecutors.newSingleThreadScheduledExecutor($$Lambda$a$fOZKQgvhY13pBev_Gkv8UvQRg3s.INSTANCE);
        }
        a(c, runnable, 0L, "event");
    }

    public static void b(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87c15fe7", new Object[]{runnable});
            return;
        }
        if (b == null) {
            b = (ScheduledThreadPoolExecutor) VExecutors.newSingleThreadScheduledExecutor($$Lambda$a$hZek4tNk382qJXJp8czFAmFCAAY.INSTANCE);
        }
        a(b, runnable, 0L, "signal");
    }

    public static void c(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf1ace8", new Object[]{runnable});
            return;
        }
        if (d == null) {
            d = (ScheduledThreadPoolExecutor) VExecutors.newSingleThreadScheduledExecutor($$Lambda$a$tnowJriooiqgEKEu0RbEWMoNYnM.INSTANCE);
        }
        a(d, runnable, 0L, com.taobao.android.diagnose.model.b.GL_MEM);
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
            return;
        }
        try {
            if (f16382a != null) {
                f16382a.shutdown();
                f16382a = null;
            }
            if (b != null) {
                b.shutdown();
                b = null;
            }
            if (c != null) {
                c.shutdown();
                c = null;
            }
            if (d != null) {
                d.shutdown();
                d = null;
            }
            if (e != null) {
                e.shutdownNow();
                e = null;
            }
            ArtcLog.i("AThreadPool", "shutdown", new Object[0]);
        } catch (Throwable th) {
            b.b("AThreadPool", "thread poll shut down error: " + th.getMessage());
        }
    }

    public static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[0]);
            return;
        }
        try {
            if (f16382a != null) {
                f16382a.shutdownNow();
                f16382a = null;
            }
            if (b != null) {
                b.shutdownNow();
                b = null;
            }
            if (c != null) {
                c.shutdownNow();
                c = null;
            }
            if (d != null) {
                d.shutdownNow();
                d = null;
            }
            if (e != null) {
                e.shutdownNow();
                e = null;
            }
            ArtcLog.i("AThreadPool", "shutdownNow", new Object[0]);
        } catch (Throwable th) {
            b.b("AThreadPool", "thread poll shut down now error: " + th.getMessage());
        }
    }

    private static ScheduledThreadPoolExecutor e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScheduledThreadPoolExecutor) ipChange.ipc$dispatch("5f6d4a4b", new Object[0]);
        }
        if (e == null) {
            e = (ScheduledThreadPoolExecutor) VExecutors.newSingleThreadScheduledExecutor($$Lambda$a$4AD_yb37StzA3oAXBAFElQ1_u6I.INSTANCE);
        }
        return e;
    }

    public static void d(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9021f9e9", new Object[]{runnable});
            return;
        }
        try {
            a(e(), runnable, 0L, "dns");
        } catch (Throwable unused) {
            ArtcLog.e("AThreadPool", "executeHttpdns", new Object[0]);
        }
    }

    public static void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[0]);
            return;
        }
        try {
            if (e == null) {
                return;
            }
            e.shutdownNow();
            e = null;
        } catch (Throwable th) {
            ArtcLog.e("AThreadPool", "shutdownNowHttpdns, ", th, new Object[0]);
        }
    }
}
