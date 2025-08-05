package com.alibaba.android.umbrella.trace;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.orange.g;
import java.util.HashMap;
import java.util.List;
import tb.bpv;
import tb.bpw;

/* loaded from: classes.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final double DEFAULT_FAIL_SAMPLE_RATING = 1.0d;
    public static final double DEFAULT_PERFORMANCE_SAMPLE_RATING = 0.001d;
    public static final double DEFAULT_SUCCESS_SAMPLE_RATING = 5.0E-5d;
    public static final String FORCE_CLOSE_FAILURE_KEY = "ForceCloseFailure";
    public static final String FORCE_CLOSE_PERFORMANCE_PAGE_KEY = "ForceClosePerformancePage";
    public static final String FORCE_CLOSE_PERFORMANCE_POINT_KEY = "ForceClosePerformancePoint";
    public static final String FORCE_CLOSE_SUCCESS_KEY = "ForceCloseSuccess";
    public static final String KEY_FORCE_CLOSE_MTOP_INTERCEPTOR = "ForceCloseMtopInterceptor";
    public static final String KEY_FORCE_CLOSE_TRACE_TLOG = "ForceCloseTraceTlog";
    public static final String OPEN_CRASH_REPORT_KEY = "isPointReportToCrash";
    public static final String OPEN_GRAY_REPORT_KEY = "isGrayReport";
    private static HashMap<String, Double> b = new HashMap<>();
    private static HashMap<String, Double> c = new HashMap<>();
    private static HashMap<String, Double> d = new HashMap<>();
    private static boolean e = false;
    private static boolean f = false;
    private static boolean g = false;
    private static boolean h = false;
    private static boolean i = false;
    private static boolean j = true;
    private static boolean k = true;
    private static boolean l = true;
    private static boolean m = false;
    public static final String ORANGE_GROUP_NAME = "umbrella_trace";

    /* renamed from: a  reason: collision with root package name */
    public static final bpv<List<String>> f2836a = new bpv<>(ORANGE_GROUP_NAME, "UMUniformErrorReport", "taobao.buy,buy", new bpw());

    private static boolean p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("63fccfb", new Object[0])).booleanValue();
        }
        return false;
    }

    public static /* synthetic */ boolean a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821d370", new Object[]{new Boolean(z)})).booleanValue();
        }
        e = z;
        return z;
    }

    public static /* synthetic */ boolean b(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("65d7b881", new Object[]{str, str2})).booleanValue() : c(str, str2);
    }

    public static /* synthetic */ boolean b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9d6ac0f", new Object[]{new Boolean(z)})).booleanValue();
        }
        f = z;
        return z;
    }

    public static /* synthetic */ boolean c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab8b84ae", new Object[]{new Boolean(z)})).booleanValue();
        }
        g = z;
        return z;
    }

    public static /* synthetic */ boolean d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ad405d4d", new Object[]{new Boolean(z)})).booleanValue();
        }
        h = z;
        return z;
    }

    public static /* synthetic */ boolean e(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1c6cb13a", new Object[]{str})).booleanValue() : f(str);
    }

    public static /* synthetic */ boolean e(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aef535ec", new Object[]{new Boolean(z)})).booleanValue();
        }
        i = z;
        return z;
    }

    public static /* synthetic */ boolean f(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b0aa0e8b", new Object[]{new Boolean(z)})).booleanValue();
        }
        j = z;
        return z;
    }

    public static /* synthetic */ boolean g(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b25ee72a", new Object[]{new Boolean(z)})).booleanValue();
        }
        k = z;
        return z;
    }

    public static /* synthetic */ boolean h(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b413bfc9", new Object[]{new Boolean(z)})).booleanValue();
        }
        l = z;
        return z;
    }

    public static /* synthetic */ HashMap i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashMap) ipChange.ipc$dispatch("100921d3", new Object[0]) : b;
    }

    public static /* synthetic */ HashMap j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashMap) ipChange.ipc$dispatch("5a3abb14", new Object[0]) : c;
    }

    public static /* synthetic */ HashMap k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashMap) ipChange.ipc$dispatch("a46c5455", new Object[0]) : d;
    }

    public static /* synthetic */ boolean l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[0])).booleanValue() : n();
    }

    public static /* synthetic */ boolean m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6158678", new Object[0])).booleanValue() : o();
    }

    static {
        h();
    }

    public static boolean a(UmbrellaInfo umbrellaInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ed534d97", new Object[]{umbrellaInfo})).booleanValue();
        }
        if (umbrellaInfo != null && !TextUtils.isEmpty(umbrellaInfo.mainBizName) && !TextUtils.isEmpty(umbrellaInfo.tagId)) {
            if (b(umbrellaInfo.mainBizName + '_' + umbrellaInfo.tagId) > Math.random()) {
                return true;
            }
        }
        return false;
    }

    public static boolean a(UmbrellaInfo umbrellaInfo, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("399558a1", new Object[]{umbrellaInfo, str})).booleanValue();
        }
        if (umbrellaInfo != null && !TextUtils.isEmpty(umbrellaInfo.mainBizName) && !TextUtils.isEmpty(str)) {
            if (c(umbrellaInfo.mainBizName + '_' + str) > Math.random()) {
                return true;
            }
        }
        return false;
    }

    public static boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{str, str2})).booleanValue();
        }
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            if (d("Performance_" + str + "_" + str2) > Math.random()) {
                return true;
            }
        }
        return false;
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Performance_Page_Load_");
        sb.append(str);
        return d(sb.toString()) > Math.random();
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : e;
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : f;
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue() : l;
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[0])).booleanValue() : m;
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[0])).booleanValue() : g;
    }

    public static boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[0])).booleanValue() : h;
    }

    public static boolean g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[0])).booleanValue() : i;
    }

    private static boolean f(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("669e4a7b", new Object[]{str})).booleanValue() : !TextUtils.isEmpty(str) && "true".equals(OrangeConfig.getInstance().getConfig(ORANGE_GROUP_NAME, str, "false"));
    }

    private static boolean c(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f277e382", new Object[]{str, str2})).booleanValue() : !TextUtils.isEmpty(str) && "true".equals(OrangeConfig.getInstance().getConfig(ORANGE_GROUP_NAME, str, str2));
    }

    private static boolean n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6239df9", new Object[0])).booleanValue() : "true".equals(OrangeConfig.getInstance().getConfig(ORANGE_GROUP_NAME, OPEN_CRASH_REPORT_KEY, "true"));
    }

    private static boolean o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("631b57a", new Object[0])).booleanValue() : "true".equals(OrangeConfig.getInstance().getConfig(ORANGE_GROUP_NAME, OPEN_GRAY_REPORT_KEY, "true"));
    }

    public static double b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3dd7e561", new Object[]{str})).doubleValue();
        }
        if (TextUtils.isEmpty(str)) {
            return 5.0E-5d;
        }
        Double d2 = b.get(str);
        if (d2 != null) {
            return d2.doubleValue();
        }
        try {
            double parseDouble = Double.parseDouble(OrangeConfig.getInstance().getConfig(ORANGE_GROUP_NAME, str, String.valueOf(5.0E-5d)));
            b.put(str, Double.valueOf(parseDouble));
            return parseDouble;
        } catch (NumberFormatException unused) {
            b.put(str, Double.valueOf(5.0E-5d));
            return 5.0E-5d;
        }
    }

    public static double c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("88097ea2", new Object[]{str})).doubleValue();
        }
        if (TextUtils.isEmpty(str)) {
            return 1.0d;
        }
        Double d2 = c.get(str);
        if (d2 != null) {
            return d2.doubleValue();
        }
        try {
            double parseDouble = Double.parseDouble(OrangeConfig.getInstance().getConfig(ORANGE_GROUP_NAME, str, String.valueOf(1.0d)));
            c.put(str, Double.valueOf(parseDouble));
            return parseDouble;
        } catch (NumberFormatException unused) {
            c.put(str, Double.valueOf(1.0d));
            return 1.0d;
        }
    }

    public static double d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d23b17e3", new Object[]{str})).doubleValue();
        }
        if (TextUtils.isEmpty(str)) {
            return 0.001d;
        }
        Double d2 = d.get(str);
        if (d2 != null) {
            return d2.doubleValue();
        }
        try {
            double parseDouble = Double.parseDouble(OrangeConfig.getInstance().getConfig(ORANGE_GROUP_NAME, str, String.valueOf(0.001d)));
            d.put(str, Double.valueOf(parseDouble));
            return parseDouble;
        } catch (NumberFormatException unused) {
            d.put(str, Double.valueOf(0.001d));
            return 0.001d;
        }
    }

    public static void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[0]);
            return;
        }
        e = f(FORCE_CLOSE_SUCCESS_KEY);
        f = f(FORCE_CLOSE_FAILURE_KEY);
        k = n();
        g = f(FORCE_CLOSE_PERFORMANCE_POINT_KEY);
        h = f(FORCE_CLOSE_PERFORMANCE_PAGE_KEY);
        i = f(KEY_FORCE_CLOSE_TRACE_TLOG);
        j = c(KEY_FORCE_CLOSE_MTOP_INTERCEPTOR, "true");
        l = o();
        m = p();
        f2836a.a();
        OrangeConfig.getInstance().registerListener(new String[]{ORANGE_GROUP_NAME}, new g() { // from class: com.alibaba.android.umbrella.trace.b.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.orange.g
            public void onConfigUpdate(String str, boolean z) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("9458c0f9", new Object[]{this, str, new Boolean(z)});
                } else if (b.ORANGE_GROUP_NAME.equals(str)) {
                    for (String str2 : b.i().keySet()) {
                        try {
                            b.i().put(str2, Double.valueOf(Double.parseDouble(OrangeConfig.getInstance().getConfig(b.ORANGE_GROUP_NAME, str2, String.valueOf(5.0E-5d)))));
                        } catch (NumberFormatException unused) {
                            b.i().put(str2, Double.valueOf(5.0E-5d));
                        }
                    }
                    for (String str3 : b.j().keySet()) {
                        try {
                            b.j().put(str3, Double.valueOf(Double.parseDouble(OrangeConfig.getInstance().getConfig(b.ORANGE_GROUP_NAME, str3, String.valueOf(1.0d)))));
                        } catch (NumberFormatException unused2) {
                            b.j().put(str3, Double.valueOf(1.0d));
                        }
                    }
                    for (String str4 : b.k().keySet()) {
                        try {
                            b.j().put(str4, Double.valueOf(Double.parseDouble(OrangeConfig.getInstance().getConfig(b.ORANGE_GROUP_NAME, str4, String.valueOf(0.001d)))));
                        } catch (NumberFormatException unused3) {
                            b.j().put(str4, Double.valueOf(0.001d));
                        }
                    }
                    b.a(b.e(b.FORCE_CLOSE_SUCCESS_KEY));
                    b.b(b.e(b.FORCE_CLOSE_FAILURE_KEY));
                    b.c(b.e(b.FORCE_CLOSE_PERFORMANCE_POINT_KEY));
                    b.d(b.e(b.FORCE_CLOSE_PERFORMANCE_PAGE_KEY));
                    b.e(b.e(b.KEY_FORCE_CLOSE_TRACE_TLOG));
                    b.f(b.b(b.KEY_FORCE_CLOSE_MTOP_INTERCEPTOR, "true"));
                    b.g(b.l());
                    b.h(b.m());
                    b.f2836a.a();
                }
            }
        });
    }
}
