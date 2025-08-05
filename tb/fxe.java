package tb;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.am;
import com.taobao.android.dinamicx.template.download.d;
import com.taobao.android.dinamicx.template.download.e;
import com.taobao.android.dinamicx.template.download.k;
import com.taobao.android.dinamicx.u;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public class fxe {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static String f;
    private static String i;
    private static final AtomicLong o;
    private static boolean p;

    /* renamed from: a  reason: collision with root package name */
    private Handler f28178a;
    private ThreadPoolExecutor b;
    private ThreadPoolExecutor c;
    private ThreadPoolExecutor d;
    private ScheduledExecutorService e;
    private HandlerThread g;
    private Handler h;
    private ThreadPoolExecutor j;
    private HandlerThread k;
    private ThreadPoolExecutor l;
    private ThreadPoolExecutor m;
    private ThreadPoolExecutor n;
    private ThreadPoolExecutor q;
    private ThreadPoolExecutor r;

    /* loaded from: classes.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final fxe f28185a;

        static {
            kge.a(896211159);
            f28185a = new fxe();
        }

        public static /* synthetic */ fxe a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (fxe) ipChange.ipc$dispatch("f04d1ab", new Object[0]) : f28185a;
        }
    }

    static {
        kge.a(273407146);
        f = "monitor_thread";
        i = "render_thread";
        o = new AtomicLong(0L);
    }

    private fxe() {
        this.f28178a = new Handler(Looper.getMainLooper());
        if (e()) {
            this.b = u.j().a(5, true, "DXVirCommon", 1);
            this.d = u.j().a(5, true, "DXVirDownload", 1);
            this.q = u.j().a(5, true, "DXVirLanguageN", 1);
        } else {
            this.b = new d(5, true, new k("DXCommon", true));
            this.d = new d(5, true, new k("DXDownload", true));
            this.q = new d(5, true, new k("DXLanguageN", true));
        }
        this.e = new ScheduledThreadPoolExecutor(1, new ThreadFactory() { // from class: tb.fxe.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable}) : new Thread(runnable, "scheduled-thread");
            }
        });
        this.g = new HandlerThread(f);
        this.g.start();
        this.h = new Handler(this.g.getLooper());
        this.k = new HandlerThread(i);
        this.k.start();
        int i2 = fqi.aD() ? 8 : 1;
        this.l = new d(i2, true, new ThreadFactory() { // from class: tb.fxe.2
            public static volatile transient /* synthetic */ IpChange $ipChange;
            private final AtomicInteger b = new AtomicInteger(1);

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
                }
                if (!fqi.aV()) {
                    return new Thread(runnable, " asyncPreFetchExecutor#" + this.b.getAndIncrement());
                }
                fxe fxeVar = fxe.this;
                return new b(runnable, " asyncPreFetchNew# " + this.b.getAndIncrement());
            }
        });
        this.n = new d(i2, true, new ThreadFactory() { // from class: tb.fxe.3
            public static volatile transient /* synthetic */ IpChange $ipChange;
            private final AtomicInteger b = new AtomicInteger(1);

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
                }
                if (!fqi.aV()) {
                    return new Thread(runnable, " asyncPreRenderExecutor#" + this.b.getAndIncrement());
                }
                fxe fxeVar = fxe.this;
                return new b(runnable, " asyncPreRenderNew # " + this.b.getAndIncrement());
            }
        });
        if (e()) {
            this.m = u.j().a(6, true, " virtualAsyncRenderExecutorForSimple#", 1);
        } else {
            this.m = new d(6, true, new ThreadFactory() { // from class: tb.fxe.4
                public static volatile transient /* synthetic */ IpChange $ipChange;
                private final AtomicInteger b = new AtomicInteger(1);

                @Override // java.util.concurrent.ThreadFactory
                public Thread newThread(Runnable runnable) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
                    }
                    return new Thread(runnable, " asyncRenderExecutorForSimple#" + this.b.getAndIncrement());
                }
            });
        }
        if (e()) {
            this.c = u.j().a(2, true, " virtualFontExecutor#", 1);
        } else {
            this.c = new d(2, true, new ThreadFactory() { // from class: tb.fxe.5
                public static volatile transient /* synthetic */ IpChange $ipChange;
                private final AtomicInteger b = new AtomicInteger(1);

                @Override // java.util.concurrent.ThreadFactory
                public Thread newThread(Runnable runnable) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
                    }
                    return new Thread(runnable, " fontExecutor#" + this.b.getAndIncrement());
                }
            });
        }
        if (e()) {
            this.r = u.j().a(1, true, "virtualViewExecutor#", 1);
        } else {
            this.r = new d(1, true, new ThreadFactory() { // from class: tb.fxe.6
                public static volatile transient /* synthetic */ IpChange $ipChange;
                private final AtomicInteger b = new AtomicInteger(1);

                @Override // java.util.concurrent.ThreadFactory
                public Thread newThread(Runnable runnable) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
                    }
                    return new Thread(runnable, "viewExecutor#" + this.b.getAndIncrement());
                }
            });
        }
    }

    /* loaded from: classes5.dex */
    public class b extends Thread {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public am f28186a;

        static {
            kge.a(1558620846);
        }

        public am a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (am) ipChange.ipc$dispatch("6a3708be", new Object[]{this}) : this.f28186a;
        }

        public void a(am amVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("155c3378", new Object[]{this, amVar});
            } else {
                this.f28186a = amVar;
            }
        }

        public b(Runnable runnable, String str) {
            super(runnable, str);
        }
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[0])).booleanValue() : fqi.aR() && u.j() != null && !p;
    }

    public static void h(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0e32ded", new Object[]{runnable});
        } else if (!(runnable instanceof e)) {
        } else {
            ((e) runnable).b = o.incrementAndGet();
        }
    }

    public static fxe a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (fxe) ipChange.ipc$dispatch("f04d1ab", new Object[0]) : a.a();
    }

    public static void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39112e6", new Object[]{runnable});
        } else {
            a().f28178a.post(runnable);
        }
    }

    public static void a(Runnable runnable, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e91c09e", new Object[]{runnable, new Long(j)});
        } else {
            a().f28178a.postDelayed(runnable, j);
        }
    }

    public static boolean b(Runnable runnable) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("87c15feb", new Object[]{runnable})).booleanValue() : a().f28178a.post(runnable);
    }

    public static boolean c(Runnable runnable) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("bf1acec", new Object[]{runnable})).booleanValue() : a().f28178a.postAtFrontOfQueue(runnable);
    }

    public static void d(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9021f9e9", new Object[]{runnable});
        } else {
            a().f28178a.removeCallbacks(runnable);
        }
    }

    public static void e(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("145246ea", new Object[]{runnable});
            return;
        }
        h(runnable);
        a().b.execute(runnable);
    }

    public static void f(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("988293eb", new Object[]{runnable});
            return;
        }
        h(runnable);
        a().c.execute(runnable);
    }

    public static void a(fxc fxcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e96c4367", new Object[]{fxcVar});
            return;
        }
        h(fxcVar);
        a().d.execute(fxcVar);
    }

    public static void i(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25137aee", new Object[]{runnable});
            return;
        }
        h(runnable);
        a().r.execute(runnable);
    }

    public static void a(fxd fxdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e96cb7c6", new Object[]{fxdVar});
        } else {
            a().h.post(fxdVar);
        }
    }

    public static void a(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7716c3b9", new Object[]{eVar});
            return;
        }
        h(eVar);
        a().l.execute(eVar);
    }

    public static void b(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91324258", new Object[]{eVar});
            return;
        }
        h(eVar);
        a().m.execute(eVar);
    }

    public static HandlerThread b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HandlerThread) ipChange.ipc$dispatch("3f7029d3", new Object[0]) : a().k;
    }

    public static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[0]);
            return;
        }
        a().l.getQueue().clear();
        a().m.getQueue().clear();
    }

    public static void c(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab4dc0f7", new Object[]{eVar});
            return;
        }
        h(eVar);
        a().n.execute(eVar);
    }

    public static ScheduledExecutorService d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ScheduledExecutorService) ipChange.ipc$dispatch("44ecc5cf", new Object[0]) : a().e;
    }

    public static <Params, Progress, Result> void a(AsyncTask<Params, Progress, Result> asyncTask, Params... paramsArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fca86b0", new Object[]{asyncTask, paramsArr});
        } else if (asyncTask == null) {
        } else {
            asyncTask.executeOnExecutor(a().b, paramsArr);
        }
    }

    public static void g(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cb2e0ec", new Object[]{runnable});
            return;
        }
        h(runnable);
        if (a().j == null) {
            if (e()) {
                a().j = u.j().a(2, true, "DX-Trace-VirtualThread");
            } else {
                a().j = new d(2, true, new ThreadFactory() { // from class: tb.fxe.7
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.util.concurrent.ThreadFactory
                    public Thread newThread(Runnable runnable2) {
                        IpChange ipChange2 = $ipChange;
                        return ipChange2 instanceof IpChange ? (Thread) ipChange2.ipc$dispatch("d8079a58", new Object[]{this, runnable2}) : new Thread(runnable2, "DX-Trace-Thread");
                    }
                });
            }
        }
        a().j.execute(runnable);
    }
}
