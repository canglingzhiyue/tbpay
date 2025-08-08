package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes5.dex */
public class son {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Boolean f33773a;
    private static Integer b;
    private static Integer c;
    private static Integer d;
    private static Integer e;
    private static Integer f;

    static {
        kge.a(1666440432);
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : e() && oeb.a("ShortVideoPerfConfig.enableOptFilterMessage", true);
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[0])).booleanValue() : e() && oeb.a("ShortVideoPerfConfig.enableReduceParseJsonForVideoElement", true);
    }

    private static boolean s() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("66a137e", new Object[0])).booleanValue() : oeb.a("ShortVideoPerfConfig.enablePerfSmoothAll", true);
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[0])).booleanValue() : s() && oeb.a("ShortVideoPerfConfig.enablePerfSmoothPart1", true);
    }

    public static boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[0])).booleanValue() : s() && oeb.a("ShortVideoPerfConfig.enablePerfSmoothPart3", true);
    }

    public static boolean g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[0])).booleanValue() : e() && oeb.a("ShortVideoPerfConfig.enableGlobalH5Opt", true);
    }

    public static int h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5cf10e2", new Object[0])).intValue() : oeb.a("ShortVideoPerfConfig.cardMissDelayDestroyPlayerTime", 32);
    }

    public static boolean i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[0])).booleanValue() : f() && oeb.a("ShortVideoPerfConfig.enableUTOpt", true);
    }

    public static boolean j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[0])).booleanValue() : f() && oeb.a("ShortVideoPerfConfig.isEnableReduceDataToJSON", true);
    }

    public static boolean k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[0])).booleanValue() : f() && oeb.a("ShortVideoPerfConfig.enableCardMissDelayDestroyPlayer", true) && obx.b();
    }

    public static boolean l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[0])).booleanValue() : oeb.a("ShortVideoPerfConfig.enableTBVideoExcutor", true);
    }

    public static boolean m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6158678", new Object[0])).booleanValue() : oeb.a("ShortVideoPerfConfig.enablePreDownInThread", true) && a("enablePreDownInThread", r());
    }

    public static boolean n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6239df9", new Object[0])).booleanValue() : oeb.a("ShortVideoPerfConfig.enableTrackThread", true) && a("enableTrackThread", r());
    }

    public static boolean o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("631b57a", new Object[0])).booleanValue() : oeb.a("ShortVideoPerfConfig.enableOptWeexViewRender", true) && a("enableOptWeexViewRender", "0");
    }

    public static boolean q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("64de47c", new Object[0])).booleanValue() : oeb.a("ShortVideoPerfConfig.enableOptPrefetch", true) && a("enableOptPrefetch", r()) && obx.a(D());
    }

    public static boolean p() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("63fccfb", new Object[0])).booleanValue() : a("enableHitchNormalOpt", r());
    }

    public static boolean t() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6782aff", new Object[0])).booleanValue() : oeb.a("ShortVideoPerfConfig.enableOptFastTrack", true) && p();
    }

    public static boolean u() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6864280", new Object[0])).booleanValue() : oeb.a("ShortVideoPerfConfig.enableFingerPlay", true) && a("enableFingerPlay", r());
    }

    public static boolean v() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6945a01", new Object[0])).booleanValue() : oeb.a("ShortVideoPerfConfig.enableFrameSchedule", true) && a("enableFrameSchedule", r());
    }

    public static boolean w() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6a27182", new Object[0])).booleanValue() : oeb.a("ShortVideoPerfConfig.enableFrameScheduleV2", true) && a("enableFrameScheduleV2", r());
    }

    public static boolean x() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6b08903", new Object[0])).booleanValue() : oeb.a("ShortVideoPerfConfig.enableFastScrollFrameSchedule", true);
    }

    private static boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{str, str2})).booleanValue();
        }
        try {
            return StringUtils.equals("1", oeb.b("AB_fullscreenpage_android.perfsmooth_hitch." + str, str2));
        } catch (Exception e2) {
            spz.a("PerfConfig", "enableInHitchOptAB exception", e2);
            return false;
        }
    }

    private static String b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4204a5c3", new Object[]{str, str2});
        }
        return oeb.b("AB_fullscreenpage_android.perfsmooth_hitch." + str, str2);
    }

    public static int y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6bea073", new Object[0])).intValue();
        }
        if (b == null) {
            int i = 2000;
            try {
                i = Integer.parseInt(b("getMediaCardLoadFinishTimeoutDurationTime", String.valueOf(2000)));
            } catch (Exception e2) {
                spz.c("PerfConfig", "getMediaCardLoadFinishTimeoutDurationTime error " + e2.getMessage());
            }
            b = Integer.valueOf(i);
        }
        return b.intValue();
    }

    public static int z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6ccb7f4", new Object[0])).intValue();
        }
        if (c == null) {
            int i = 800;
            try {
                i = Integer.parseInt(b("getNormalCardLoadFinishTimeoutDurationTime", String.valueOf(800)));
            } catch (Exception e2) {
                spz.c("PerfConfig", "getNormalCardLoadFinishTimeoutDurationTime error " + e2.getMessage());
            }
            c = Integer.valueOf(i);
        }
        return c.intValue();
    }

    public static int A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3a97c3b", new Object[0])).intValue();
        }
        if (d == null) {
            int i = 32;
            try {
                i = Integer.parseInt(b("getFastScrollLoadFinishTimeoutDurationTime", String.valueOf(32)));
            } catch (Exception e2) {
                spz.c("PerfConfig", "getFastScrollLoadFinishTimeoutDurationTime error " + e2.getMessage());
            }
            d = Integer.valueOf(i);
        }
        return d.intValue();
    }

    public static int B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3b793bc", new Object[0])).intValue();
        }
        if (e == null) {
            int i = 900;
            try {
                i = Integer.parseInt(b("getMediaCardNotifyDelayTime", String.valueOf(900)));
            } catch (Exception e2) {
                spz.c("PerfConfig", "getMediaCardNotifyDelayTime error " + e2.getMessage());
            }
            e = Integer.valueOf(i);
        }
        return e.intValue();
    }

    public static int C() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3c5ab3d", new Object[0])).intValue() : oeb.a("ShortVideoPerfConfig.getHitchReportLimit", 2);
    }

    public static int D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3d3c2be", new Object[0])).intValue();
        }
        if (f == null) {
            int i = 100;
            try {
                i = Integer.parseInt(b("getOptScoreLimit", String.valueOf(100)));
            } catch (Exception e2) {
                spz.c("PerfConfig", "getOptScoreLimit error " + e2.getMessage());
            }
            f = Integer.valueOf(i);
        }
        return f.intValue();
    }

    public static String r() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9ed849c7", new Object[0]) : oeb.a("ShortVideoPerfConfig.getDefaultHitchABValue", "0");
    }

    public static int E() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3e1da3f", new Object[0])).intValue() : oeb.a("ShortVideoPerfConfig.getPrefetchRetryTime", 500);
    }

    public static boolean F() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3eff1d1", new Object[0])).booleanValue() : oeb.a("ShortVideoPerfConfig.enableH5MessageFrameSchedule", true);
    }

    public static boolean N() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("460add9", new Object[0])).booleanValue() : oeb.a("ShortVideoPerfConfig.enableDefaultMessageFrameSchedule", true);
    }

    public static boolean H() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("40c20d3", new Object[0])).booleanValue() : oeb.a("ShortVideoPerfConfig.enableTrackUpdateFrameSchedule", true);
    }

    public static boolean I() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("41a3854", new Object[0])).booleanValue() : oeb.a("ShortVideoPerfConfig.enablePlayerPauseFrameSchedule", true);
    }

    public static boolean J() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4284fd5", new Object[0])).booleanValue() : oeb.a("ShortVideoPerfConfig.enablePlayerDestroyFrameSchedule", true);
    }

    public static boolean K() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4366756", new Object[0])).booleanValue() : oeb.a("ShortVideoPerfConfig.enableSmartFrameSchedule", true);
    }

    public static boolean L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4447ed7", new Object[0])).booleanValue();
        }
        if (f33773a == null) {
            boolean z = true;
            Boolean valueOf = Boolean.valueOf(oeb.a("enableFrameMetric", true) && v());
            f33773a = valueOf;
            if (valueOf.booleanValue()) {
                if (Math.random() * 100000.0d > M()) {
                    z = false;
                }
                f33773a = Boolean.valueOf(z);
            }
        }
        return f33773a.booleanValue();
    }

    private static int M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4529647", new Object[0])).intValue();
        }
        int a2 = oeb.a("ShortVideoPerfConfig.frame_metric_sample", 1);
        String str = mnd.l;
        return (StringUtils.isEmpty(str) || str.split("\\.").length < 4) ? a2 : a2 * oeb.a("ShortVideoPerfConfig.beta_version_scale", 1000);
    }

    public static boolean a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8123ece6", new Object[]{str, new Boolean(z)})).booleanValue();
        }
        if (!z || obu.i()) {
            if (!oeb.h("enable" + str)) {
                if (b("AB_fullscreenpage_android.lowdeviceopt." + str, false)) {
                }
            }
            return true;
        }
        return false;
    }

    private static boolean b(String str, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7d257bc5", new Object[]{str, new Boolean(z)})).booleanValue() : oec.a(oeb.b(str, Boolean.toString(z)), z);
    }
}
