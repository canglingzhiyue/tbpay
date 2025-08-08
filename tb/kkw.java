package tb;

import android.os.Build;
import android.os.Process;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.virtual_thread.face.VExecutors;
import com.taobao.android.virtual_thread.face.h;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes7.dex */
public class kkw implements klj {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static volatile ScheduledExecutorService b = null;
    private static boolean c = false;

    /* renamed from: a  reason: collision with root package name */
    public Runnable f30128a;

    /* loaded from: classes7.dex */
    public static class a implements ThreadFactory {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f30130a;
        private final AtomicInteger b = new AtomicInteger();
        private String c;

        public a(int i, String str) {
            this.f30130a = i;
            this.c = str;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("DownloadSDK ");
            if (!StringUtils.isEmpty(this.c)) {
                sb.append(this.c);
                str = " ";
            } else {
                str = "DefaultPool ";
            }
            sb.append(str);
            sb.append("Thread:");
            sb.append(this.b.getAndIncrement());
            return new Thread(runnable, sb.toString()) { // from class: tb.kkw.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str2, Object... objArr) {
                    if (str2.hashCode() == 1548812690) {
                        super.run();
                        return null;
                    }
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str2));
                }

                @Override // java.lang.Thread, java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        Process.setThreadPriority(a.this.f30130a);
                    } catch (Throwable th) {
                        kmv.a("DownloadThreadFactory", "[run]Thread set thread priority error ---", th, new Object[0]);
                    }
                    try {
                        super.run();
                    } catch (Throwable th2) {
                        kmv.a("DownloadThreadFactory", "[run]Thread run error ---", th2, new Object[0]);
                    }
                }
            };
        }
    }

    static {
        try {
            Class.forName("com.taobao.android.virtual_thread.face.VExecutors");
            c = true;
        } catch (Throwable unused) {
        }
    }

    @Override // tb.klj
    public void a(Runnable runnable, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e91fcae", new Object[]{this, runnable, new Boolean(z)});
        } else if (runnable == null) {
        } else {
            kmv.d("Download.CustomThreadImpl", "[execute] Custom ThreadPool", new Object[0]);
            try {
                a().execute(runnable);
            } catch (Throwable th) {
                kmv.a("Download.CustomThreadImpl", "[execute] Custom ThreadPool error", th, new Object[0]);
            }
        }
    }

    @Override // tb.klj
    public void a(final Runnable runnable, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e91c09e", new Object[]{this, runnable, new Long(j)});
        } else if (this.f30128a != null || runnable == null) {
        } else {
            this.f30128a = runnable;
            try {
                a().schedule(new Runnable() { // from class: tb.kkw.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        runnable.run();
                        kkw.this.f30128a = null;
                    }
                }, j, TimeUnit.MILLISECONDS);
            } catch (Throwable th) {
                kmv.a("Download.CustomThreadImpl", "[postDelayed] Custom ThreadPool error", th, new Object[0]);
            }
        }
    }

    public static ScheduledExecutorService a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScheduledExecutorService) ipChange.ipc$dispatch("7a4b6c8c", new Object[0]);
        }
        if (b == null) {
            synchronized (kkw.class) {
                if (b == null) {
                    if (c && b()) {
                        b = VExecutors.newScheduledThreadPool(10, new b());
                    } else {
                        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(10, new a(10, "Custom_Pool"));
                        b = scheduledThreadPoolExecutor;
                        if (scheduledThreadPoolExecutor instanceof ScheduledThreadPoolExecutor) {
                            ((ScheduledThreadPoolExecutor) b).setKeepAliveTime(3L, TimeUnit.SECONDS);
                            ((ScheduledThreadPoolExecutor) b).allowCoreThreadTimeOut(true);
                        }
                    }
                }
            }
        }
        return b;
    }

    /* loaded from: classes7.dex */
    public static class b implements h {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final AtomicInteger f30132a;

        private b() {
            this.f30132a = new AtomicInteger();
        }

        @Override // com.taobao.android.virtual_thread.face.h
        public String newThreadName() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("57dab4a4", new Object[]{this});
            }
            return "Download_V_" + this.f30132a.getAndIncrement();
        }
    }

    private static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue();
        }
        if (Build.VERSION.SDK_INT >= 23 && !Process.is64Bit()) {
            return true;
        }
        return (StringUtils.equals(Build.BRAND, "HUAWEI") || StringUtils.equals(Build.BRAND, "HONOR")) && Build.VERSION.SDK_INT >= 23 && Build.VERSION.SDK_INT <= 27;
    }
}
