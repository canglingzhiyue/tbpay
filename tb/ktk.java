package tb;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes7.dex */
public class ktk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static kth f30302a;
    private static final ExecutorService b;
    private static Context c;
    private static boolean d;
    private static String e;
    private static volatile Boolean f;

    /* loaded from: classes7.dex */
    public static class a implements ThreadFactory {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private int f30303a = 1;
        private String b;

        static {
            kge.a(-96040028);
            kge.a(-1938806936);
        }

        public a(String str) {
            this.b = str;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
            }
            Thread thread = new Thread(runnable, this.b + "-Thread_" + this.f30303a);
            this.f30303a = this.f30303a + 1;
            if (this.f30303a >= 10) {
                this.f30303a = 1;
            }
            String.format("Created thread %d with name %s on %s \n", Long.valueOf(thread.getId()), thread.getName(), new Date());
            return thread;
        }
    }

    static {
        kge.a(2068360765);
        f30302a = new kti();
        b = new ThreadPoolExecutor(4, 10, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(32), new a("Highway"));
        d = false;
        f = false;
    }

    public static synchronized void a(Context context, String str) {
        synchronized (ktk.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("61b6362a", new Object[]{context, str});
                return;
            }
            String str2 = "sdkInitialize ttid: " + str;
            if (!f.booleanValue() && context != null && !StringUtils.isEmpty(str)) {
                if (rkq.d().e() == null) {
                    rkq.d().a(context);
                }
                c = context.getApplicationContext();
                e = str;
                f = true;
            }
        }
    }

    public static kth a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kth) ipChange.ipc$dispatch("f0708df", new Object[0]);
        }
        if (f.booleanValue()) {
            return f30302a;
        }
        return null;
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : d;
    }

    public static void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{new Boolean(z)});
        } else {
            d = z;
        }
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue() : str != null && str.startsWith("__client_preview__#");
    }

    public static String b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6111438d", new Object[]{str}) : str.substring(19);
    }

    public static ExecutorService c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ExecutorService) ipChange.ipc$dispatch("21dd89f1", new Object[0]) : b;
    }

    public static Context d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("f183c0e3", new Object[0]) : c;
    }

    public static String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[0]) : e;
    }
}
