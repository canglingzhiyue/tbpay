package mtopsdk.ssrcore;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.v3.k;
import mtopsdk.common.util.TBSdkLog;

/* loaded from: classes9.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MODULE_SSR = "mtop_ssr";

    /* renamed from: a  reason: collision with root package name */
    private static boolean f25037a;

    static {
        try {
            Class.forName("com.taobao.analysis.v3.FalcoGlobalTracer");
            Class.forName("com.network.diagnosis.b");
            f25037a = true;
        } catch (Throwable unused) {
            f25037a = false;
            TBSdkLog.e("ssr.SsrFullTraceHelper", "FullTraceAnalysis is not fount.");
        }
    }

    public static void a(MtopSsrStatistics mtopSsrStatistics, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5830d951", new Object[]{mtopSsrStatistics, str});
            return;
        }
        mtopSsrStatistics.A = System.currentTimeMillis();
        if (!f25037a) {
            return;
        }
        Object obj = mtopSsrStatistics.M;
        a(obj, "bizReqStart", "api=" + str);
    }

    public static void a(MtopSsrStatistics mtopSsrStatistics) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29b95347", new Object[]{mtopSsrStatistics});
            return;
        }
        mtopSsrStatistics.B = System.currentTimeMillis();
        if (!f25037a) {
            return;
        }
        b(mtopSsrStatistics.M, "bizReqProcessStart");
    }

    public static void g(MtopSsrStatistics mtopSsrStatistics) {
        com.network.diagnosis.b a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("346cf881", new Object[]{mtopSsrStatistics});
        } else if (!f25037a || (a2 = com.network.diagnosis.e.a()) == null) {
        } else {
            a2.a().a(mtopSsrStatistics.N);
        }
    }

    public static void b(MtopSsrStatistics mtopSsrStatistics) {
        com.network.diagnosis.b a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80d74426", new Object[]{mtopSsrStatistics});
        } else if (!f25037a || (a2 = com.network.diagnosis.e.a()) == null) {
        } else {
            a2.a().b(mtopSsrStatistics.N);
        }
    }

    public static void c(MtopSsrStatistics mtopSsrStatistics) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7f53505", new Object[]{mtopSsrStatistics});
            return;
        }
        mtopSsrStatistics.C = System.currentTimeMillis();
        if (!f25037a) {
            return;
        }
        b(mtopSsrStatistics.M, "bizRspProcessStart");
    }

    public static void d(MtopSsrStatistics mtopSsrStatistics) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f1325e4", new Object[]{mtopSsrStatistics});
            return;
        }
        mtopSsrStatistics.D = System.currentTimeMillis();
        if (!f25037a) {
            return;
        }
        b(mtopSsrStatistics.M, "bizRspCbDispatch");
    }

    public static void e(MtopSsrStatistics mtopSsrStatistics) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("863116c3", new Object[]{mtopSsrStatistics});
            return;
        }
        mtopSsrStatistics.E = System.currentTimeMillis();
        if (!f25037a) {
            return;
        }
        b(mtopSsrStatistics.M, "bizRspCbStart");
    }

    public static void f(MtopSsrStatistics mtopSsrStatistics) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd4f07a2", new Object[]{mtopSsrStatistics});
            return;
        }
        mtopSsrStatistics.F = System.currentTimeMillis();
        if (!f25037a) {
            return;
        }
        b(mtopSsrStatistics.M, "bizRspCbEnd");
    }

    public static void a(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65cbb30e", new Object[]{obj, str});
        } else if (!f25037a) {
        } else {
            a(obj, "bizFinish", str);
        }
    }

    private static void b(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f26bde0f", new Object[]{obj, str});
        } else {
            a(obj, str, "");
        }
    }

    private static void a(Object obj, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d7b7558", new Object[]{obj, str, str2});
            return;
        }
        if (obj != null && (obj instanceof k)) {
            try {
                ((k) obj).a("module=mtop_ssr,stage=" + str + ",content=" + str2);
            } catch (Throwable unused) {
            }
        }
    }
}
