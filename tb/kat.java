package tb;

import android.app.Application;
import android.os.SystemClock;
import com.alibaba.analytics.AnalyticsMgr;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OConstant;
import java.util.concurrent.ConcurrentLinkedQueue;

/* loaded from: classes6.dex */
public class kat {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f29923a;
    private static final ConcurrentLinkedQueue<a> b;
    private static volatile boolean c;
    private static Long d;

    public static /* synthetic */ ConcurrentLinkedQueue a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ConcurrentLinkedQueue) ipChange.ipc$dispatch("b9de5e34", new Object[0]) : b;
    }

    static {
        kge.a(-1240207442);
        b = new ConcurrentLinkedQueue<>();
        d = null;
        try {
            Class.forName(OConstant.REFLECT_APPMONITOR);
            f29923a = true;
        } catch (Exception unused) {
            f29923a = false;
        }
    }

    public static void a(String str, String str2, String str3, double d2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0bf98b8", new Object[]{str, str2, str3, new Double(d2)});
        } else if (!f29923a) {
        } else {
            try {
                if (!AnalyticsMgr.i()) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    if (d == null) {
                        d = Long.valueOf(elapsedRealtime);
                    }
                    b.offer(a.a(str, str2, str3, d2));
                    if (b.size() < 100 && elapsedRealtime - d.longValue() <= 10000) {
                        return;
                    }
                    AnalyticsMgr.a((Application) kaq.a());
                    return;
                }
                if (!c && !b.isEmpty()) {
                    c = true;
                    kao.a(1, "atools-statistic").execute(new Runnable() { // from class: tb.kat.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            while (true) {
                                a aVar = (a) kat.a().poll();
                                if (aVar == null) {
                                    return;
                                }
                                kat.a(aVar.f29924a, aVar.b, aVar.c, aVar.d);
                            }
                        }
                    });
                }
                AppMonitor.Counter.commit(str, str2, str3, d2);
            } catch (Throwable th) {
                kau.instance.b("Statistic", "commitCount err", th, new Object[0]);
            }
        }
    }

    /* loaded from: classes6.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f29924a;
        public String b;
        public String c;
        public double d;

        static {
            kge.a(1135381401);
        }

        private a() {
        }

        public static a a(String str, String str2, String str3, double d) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("b0d36653", new Object[]{str, str2, str3, new Double(d)});
            }
            a aVar = new a();
            aVar.f29924a = str;
            aVar.b = str2;
            aVar.c = str3;
            aVar.d = d;
            return aVar;
        }
    }
}
