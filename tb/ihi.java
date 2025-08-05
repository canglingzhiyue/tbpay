package tb;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import android.view.Display;
import android.view.WindowManager;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.taobao.android.fluid.framework.performance.c;
import com.taobao.android.fluid.framework.performance.config.PerfConst;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import tb.mto;

/* loaded from: classes5.dex */
public class ihi implements Choreographer.FrameCallback {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static ihi f29026a;
    private static boolean c;
    private static Double d;
    private static Double e;
    private static double f;
    private static float g;
    private static Boolean h;
    private static boolean i;
    private static int j;
    private static int k;
    private static boolean l;
    private static List<hnb> m;
    private static Queue<ifx> n;
    private Handler b = new Handler(Looper.getMainLooper());
    private long o;

    public static /* synthetic */ int a(ihi ihiVar, long j2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c7d65509", new Object[]{ihiVar, new Long(j2)})).intValue() : ihiVar.c(j2);
    }

    public static /* synthetic */ boolean b(int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a9d66c3e", new Object[]{new Integer(i2)})).booleanValue() : d(i2);
    }

    public static /* synthetic */ boolean b(ihi ihiVar, long j2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a9b41eb9", new Object[]{ihiVar, new Long(j2)})).booleanValue() : ihiVar.e(j2);
    }

    public static /* synthetic */ int c(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ab8b44cc", new Object[]{new Integer(i2)})).intValue();
        }
        k = i2;
        return i2;
    }

    public static /* synthetic */ void c(ihi ihiVar, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b91e854", new Object[]{ihiVar, new Long(j2)});
        } else {
            ihiVar.d(j2);
        }
    }

    public static /* synthetic */ Double e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Double) ipChange.ipc$dispatch("a82f2bf4", new Object[0]) : d;
    }

    public static /* synthetic */ int f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5b2e1e0", new Object[0])).intValue();
        }
        int i2 = k;
        k = i2 + 1;
        return i2;
    }

    static {
        kge.a(247998375);
        kge.a(-569788179);
        c = false;
        j = 3;
        m = new ArrayList();
        n = new LinkedList();
    }

    private ihi() {
    }

    public static void a(Activity activity) {
        float f2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68a25ba", new Object[]{activity});
            return;
        }
        if (h == null) {
            f29026a = new ihi();
            Choreographer.getInstance().postFrameCallback(f29026a);
            h = true;
        }
        g = b(activity);
        Double valueOf = Double.valueOf(1000.0f / g);
        d = valueOf;
        e = Double.valueOf(valueOf.doubleValue() * son.C());
        f = d.doubleValue() * 0.5d;
        if (g < 110.0f) {
            f2 = 1.0f;
        } else {
            f2 = 0.5f;
            j = 2;
        }
        ifx.f29003a *= f2;
        ifx.b *= f2;
        ifx.c *= f2;
        i = son.L();
        spz.c(PerfConst.TAG_PERF_SMOOTH, "frameStandCost " + d);
    }

    public static void a(hnb hnbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec48953c", new Object[]{hnbVar});
        } else if (hnbVar.b <= 5) {
        } else {
            m.add(hnbVar);
        }
    }

    public static void a(Runnable runnable, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6098f30", new Object[]{runnable, str});
        } else if (runnable == null) {
        } else {
            if (son.v()) {
                c(new ifx(runnable, str));
            } else {
                runnable.run();
            }
        }
    }

    public static void a(Runnable runnable, int i2, long j2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9039cb91", new Object[]{runnable, new Integer(i2), new Long(j2), str});
        } else if (runnable == null) {
        } else {
            if (son.v()) {
                c(new ifx(runnable, i2, j2, str));
            } else {
                runnable.run();
            }
        }
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else if (!son.v()) {
        } else {
            spz.c("FrameTaskScheduler", "flushTask " + n.size());
            while (n.peek() != null) {
                ifx poll = n.poll();
                poll.a();
                i2++;
                a(poll, PerfConst.RUN_TYPE_FLUSH, i2, 0L);
            }
        }
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
            return;
        }
        c = false;
        a();
    }

    public static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[0]);
        } else if (!son.v()) {
        } else {
            spz.c("FrameTaskScheduler", "startSchduler");
            c = true;
        }
    }

    public static int a(int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a821938e", new Object[]{new Integer(i2)})).intValue() : obx.a() >= 80 ? i2 / 2 : i2;
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f46aacbb", new Object[]{this, new Long(j2)});
            return;
        }
        long j3 = j2 / 1000000;
        a(j3);
        if (n.peek() != null) {
            b(j3);
        }
        if (!son.v()) {
            return;
        }
        try {
            Choreographer.getInstance().postFrameCallback(this);
        } catch (Exception e2) {
            spz.a("FrameTaskScheduler", "doFrame exception", e2);
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    private void a(long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j2)});
        } else if (!i) {
        } else {
            long doubleValue = (long) ((j2 - this.o) - d.doubleValue());
            if (this.o > 0 && doubleValue > e.doubleValue() && !m.isEmpty()) {
                String jSONString = JSON.toJSONString(m);
                HashMap hashMap = new HashMap();
                hashMap.put("hitchBizRecord", jSONString);
                hashMap.put("fastScroll", String.valueOf(d()));
                hashMap.put("busy_count", String.valueOf(k));
                hashMap.put("canSchedule", String.valueOf(c));
                if (c) {
                    spz.c("xiewei", "hitch: " + doubleValue + ", record:" + jSONString);
                }
                c.a("PerfSmooth/FrameTaskScheduler/hitchreport", String.valueOf(doubleValue), String.valueOf(obx.a()), hashMap);
            }
            m.clear();
            this.o = j2;
        }
    }

    private void b(final long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66ffb", new Object[]{this, new Long(j2)});
        } else {
            this.b.postDelayed(new Runnable() { // from class: tb.ihi.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Code restructure failed: missing block: B:15:0x004e, code lost:
                    if (tb.ihi.b(r8.b, r3) != false) goto L11;
                 */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public void run() {
                    /*
                        r8 = this;
                        com.android.alibaba.ip.runtime.IpChange r0 = tb.ihi.AnonymousClass1.$ipChange
                        boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
                        r2 = 0
                        if (r1 == 0) goto L12
                        r1 = 1
                        java.lang.Object[] r1 = new java.lang.Object[r1]
                        r1[r2] = r8
                        java.lang.String r2 = "5c510192"
                        r0.ipc$dispatch(r2, r1)
                        return
                    L12:
                        long r0 = java.lang.System.nanoTime()
                        r3 = 1000000(0xf4240, double:4.940656E-318)
                        long r0 = r0 / r3
                        long r3 = r2
                        long r0 = r0 - r3
                        java.lang.Double r3 = tb.ihi.e()
                        double r3 = r3.doubleValue()
                        double r5 = (double) r0
                        double r3 = r3 - r5
                        long r3 = (long) r3
                        boolean r5 = tb.son.w()
                        r6 = 0
                        if (r5 == 0) goto L48
                        tb.ihi r5 = tb.ihi.this
                        int r0 = tb.ihi.a(r5, r0)
                        boolean r1 = tb.ihi.b(r0)
                        if (r1 == 0) goto L40
                        tb.ihi.f()
                        goto L52
                    L40:
                        r1 = 1003(0x3eb, float:1.406E-42)
                        if (r0 == r1) goto L51
                        tb.ihi.c(r2)
                        goto L51
                    L48:
                        tb.ihi r0 = tb.ihi.this
                        boolean r0 = tb.ihi.b(r0, r3)
                        if (r0 == 0) goto L51
                        goto L52
                    L51:
                        r6 = r3
                    L52:
                        tb.ihi r0 = tb.ihi.this
                        tb.ihi.c(r0, r6)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: tb.ihi.AnonymousClass1.run():void");
                }
            }, 0L);
        }
    }

    private static boolean d(int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ad401d7c", new Object[]{new Integer(i2)})).booleanValue() : (i2 == 1003 && g()) || i2 == 1004;
    }

    private static boolean g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[0])).booleanValue() : ((float) k) < g / 12.0f;
    }

    private int c(long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ab8b488d", new Object[]{this, new Long(j2)})).intValue();
        }
        double doubleValue = ((long) (d.doubleValue() - j2)) / d.doubleValue();
        if (doubleValue >= 0.75d) {
            return 1001;
        }
        if (doubleValue >= 0.5d) {
            return 1002;
        }
        return doubleValue > mto.a.GEO_NOT_SUPPORT ? 1003 : 1004;
    }

    private void d(long j2) {
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad402139", new Object[]{this, new Long(j2)});
            return;
        }
        ifx peek = n.peek();
        if (peek == null) {
            return;
        }
        boolean a2 = a(peek);
        do {
            ifx peek2 = n.peek();
            j2 = (long) Math.floor(((float) j2) - b(peek2));
            if ((j2 > 0 || a2) && (peek2 = n.poll()) != null && peek2.d != null) {
                peek2.a();
                i2++;
                a(peek2, a2 ? PerfConst.RUN_TYPE_DEADLIINE : "default", i2, j2);
            }
            if (peek2 != null && peek2.i == 3003) {
                j2 = 0;
            }
            a2 = a(n.peek());
        } while (a(j2, a2, i2));
    }

    private static boolean a(long j2, boolean z, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("262f4b0f", new Object[]{new Long(j2), new Boolean(z), new Integer(i2)})).booleanValue() : !n.isEmpty() && ((j2 > 0 && i2 < j) || z);
    }

    private static void a(ifx ifxVar, String str, int i2, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61af14e8", new Object[]{ifxVar, str, new Integer(i2), new Long(j2)});
        } else if (!i || ifxVar == null) {
        } else {
            spz.c("FrameTaskScheduler", "handleTaskMetric: " + ifxVar.j + "/" + str + "/count:" + i2 + "/remain:" + j2);
            ifxVar.a("runType", str);
            ifxVar.a(HiAnalyticsConstant.HaKey.BI_KEY_WAITTIME, String.valueOf(ifxVar.h));
            ifxVar.a("spendTime", String.valueOf(ifxVar.g));
            c.a("PerfSmooth/FrameTaskScheduler/handleTaskMetric", String.valueOf(ifxVar.j), String.valueOf(ifxVar.g), ifxVar.k);
        }
    }

    private boolean e(long j2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("aef4f9dc", new Object[]{this, new Long(j2)})).booleanValue() : ((double) j2) < f;
    }

    private boolean a(ifx ifxVar) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ed96b201", new Object[]{this, ifxVar})).booleanValue();
        }
        if (ifxVar == null) {
            return false;
        }
        long nanoTime = (System.nanoTime() - ifxVar.e) / 1000000;
        if (nanoTime <= 0) {
            z = false;
        }
        if (z) {
            spz.c("FrameTaskScheduler", "checkDeadline/true/gap:" + nanoTime);
            c.a("PerfSmooth/FrameTaskScheduler/checkDeadline", String.valueOf(ifxVar.j), String.valueOf(nanoTime), null);
        }
        return z;
    }

    private float b(ifx ifxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dc19b86e", new Object[]{this, ifxVar})).floatValue();
        }
        if (ifxVar == null) {
            return 0.0f;
        }
        int i2 = ifxVar.i;
        if (i2 == 3002) {
            return ifx.b;
        }
        if (i2 == 3003) {
            return ifx.c;
        }
        return ifx.f29003a;
    }

    private static float b(Activity activity) {
        WindowManager windowManager;
        Display defaultDisplay;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3fdb366b", new Object[]{activity})).floatValue();
        }
        if (activity != null && (windowManager = activity.getWindowManager()) != null && (defaultDisplay = windowManager.getDefaultDisplay()) != null) {
            return defaultDisplay.getRefreshRate();
        }
        return 60.0f;
    }

    private static void c(ifx ifxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca9cbeff", new Object[]{ifxVar});
        } else if (ifxVar == null) {
        } else {
            if (c && son.v()) {
                spz.c("FrameTaskScheduler", "doAdd " + ifxVar.j);
                n.add(ifxVar);
                return;
            }
            spz.c("FrameTaskScheduler", "doRun " + ifxVar.j);
            ifxVar.d.run();
        }
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[0])).booleanValue() : l;
    }

    public static void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{new Boolean(z)});
        } else {
            l = z;
        }
    }
}
