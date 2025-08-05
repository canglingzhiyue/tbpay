package com.taobao.taolive.sdk.utils;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import tb.kge;
import tb.pmd;
import tb.pmf;
import tb.pmi;
import tb.tfv;

/* loaded from: classes8.dex */
public class o {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static int A;
    private static int B;
    private static int C;
    private static HashMap<String, Boolean> D;
    private static HashMap<String, String> E;
    private static int F;

    /* renamed from: a  reason: collision with root package name */
    private static int f21968a;
    private static int b;
    private static long c;
    private static long d;
    private static int e;
    private static int f;
    private static List<String> g;
    private static List<String> h;
    private static int j;
    private static int l;
    private static int m;
    private static int o;
    private static int p;
    private static int r;
    private static int s;
    private static int t;
    private static int u;
    private static int v;
    private static int w;
    private static int x;
    private static int y;
    private static int z;

    public static boolean Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("48af45c", new Object[0])).booleanValue();
        }
        if (pmd.a().d() != null) {
            return com.taobao.taolive.room.utils.v.e(pmd.a().d().a("tblive", "enableFixPerformanceUt", "true"));
        }
        return false;
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : l.d(pmd.a().d().a("tblive", "enableM3u8Cache", "true"));
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : l.d(pmd.a().d().a("tblive", "enablePlatformTask3", "true"));
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue() : l.d(pmd.a().d().a("tblive", "enableNewUserTaskMtop", "true"));
    }

    public static String d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[0]) : pmd.a().d().a("tblive", "userTaskPopupFedName", "@ali/alivemodx-platform-task-popup");
    }

    public static boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[0])).booleanValue() : l.d(pmd.a().d().a("tblive", "enableRemoveDelayTask", "true"));
    }

    public static boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[0])).booleanValue();
        }
        if (!l.d(pmd.a().d().a("tblive", "enableSetStartPosNew", "true"))) {
            return false;
        }
        return l.d(pmd.a().t().a("taolive", "enableSetStartPosNew", "enable", "false"));
    }

    public static boolean h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[0])).booleanValue() : com.taobao.taolive.room.utils.v.e(pmd.a().d().b("tblive", "enableNewPlayReporterLiveStartSuccess", "true"));
    }

    static {
        kge.a(-2076668080);
        c = -1L;
        d = -1L;
        e = -1;
        f = -1;
        j = -1;
        l = -1;
        m = -1;
        o = -1;
        b = -1;
        F = -1;
        x = -1;
        C = -1;
        y = -1;
        w = -1;
        p = -1;
        r = -1;
        u = -1;
        f21968a = -1;
        t = -1;
        v = -1;
        s = -1;
        D = new HashMap<>();
        E = new HashMap<>();
        z = -1;
        B = -1;
        A = -1;
        g = null;
        h = null;
    }

    public static long k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5f95766", new Object[0])).longValue();
        }
        if (c == -1 && pmd.a().d() != null) {
            c = l.b(pmd.a().d().a("tblive", "delayDestroyTimeMs", "1000"));
        }
        return c;
    }

    public static boolean l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[0])).booleanValue() : l.d(pmd.a().d().a("tblive", "enableNewFromShop2FCheck", "true"));
    }

    public static boolean m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6158678", new Object[0])).booleanValue() : l.d(pmd.a().d().a("tblive", "enableHalfDetailMiniPlayerCloseMute", "true"));
    }

    public static boolean o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("631b57a", new Object[0])).booleanValue() : l.d(pmd.a().d().a("tblive", "skipPauseConditionsSwitch", "true"));
    }

    public static boolean p() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("63fccfb", new Object[0])).booleanValue() : l.d(pmd.a().d().a("tblive", "enableAutoPlayForBackgroundMp4", "true"));
    }

    public static boolean q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("64de47c", new Object[0])).booleanValue() : l.d(pmd.a().d().a("tblive", "enableSkipResumePlaySwitch", "false"));
    }

    public static long u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6864270", new Object[0])).longValue();
        }
        if (d == -1 && pmd.a().d() != null) {
            d = l.b(pmd.a().d().a("tblive", "getCheckGlobalMuteToastTimeMs", "14400000"));
        }
        return d;
    }

    public static boolean v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6945a01", new Object[0])).booleanValue();
        }
        if (pmd.a().d() == null) {
            return false;
        }
        return com.taobao.taolive.room.utils.v.e(pmd.a().d().a("tblive", "enableRoomPlayerObserver2", "true"));
    }

    public static boolean w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6a27182", new Object[0])).booleanValue();
        }
        if (e == -1 && pmd.a().d() != null) {
            e = l.d(pmd.a().d().a("tblive", "enableNotBreakMsgDispatch", "true")) ? 1 : 0;
        }
        return e == 1;
    }

    public static boolean x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6b08903", new Object[0])).booleanValue();
        }
        if (f == -1 && pmd.a().d() != null) {
            f = l.d(pmd.a().d().a("tblive", "enableOpenOuterTraceLogic", "true")) ? 1 : 0;
        }
        return f == 1;
    }

    public static boolean B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3b793cd", new Object[0])).booleanValue();
        }
        if (j == -1) {
            if (l.d(pmd.a().d().a("tblive", "enableMultiCaseOpt2", "true"))) {
                j = 1;
            } else {
                j = 0;
            }
        }
        return j == 1;
    }

    public static boolean D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3d3c2cf", new Object[0])).booleanValue();
        }
        if (l == -1 && pmd.a().d() != null) {
            if (l.d(pmd.a().d().a("tblive", "enableBlackScreenOpt0409", "true"))) {
                l = 1;
            } else {
                l = 0;
            }
        }
        return l == 1;
    }

    public static String F() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7fdc3673", new Object[0]) : pmd.a().d() != null ? pmd.a().d().a("tblive", "getPlayerErrorNetWorkUrl", "https://gw.alicdn.com/imgextra/i4/O1CN011zu0aX1JkH9VJmDRW_!!6000000001066-2-tps-450-450.png") : "https://gw.alicdn.com/imgextra/i4/O1CN011zu0aX1JkH9VJmDRW_!!6000000001066-2-tps-450-450.png";
    }

    public static String G() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("661f112", new Object[0]) : pmd.a().d() != null ? pmd.a().d().a("tblive", "getPlayerErrorAnchorLeaveUrl", "https://gw.alicdn.com/imgextra/i3/O1CN01Xpv5Vd23DGw8GiyuX_!!6000000007221-2-tps-450-450.png") : "https://gw.alicdn.com/imgextra/i3/O1CN01Xpv5Vd23DGw8GiyuX_!!6000000007221-2-tps-450-450.png";
    }

    public static String H() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8ce7abb1", new Object[0]) : pmd.a().d() != null ? pmd.a().d().a("tblive", "getPlayerLiveEndLeaveUrl", "https://gw.alicdn.com/imgextra/i2/O1CN01frWh5y28JkcOkOUYc_!!6000000007912-2-tps-450-450.png") : "https://gw.alicdn.com/imgextra/i2/O1CN01frWh5y28JkcOkOUYc_!!6000000007912-2-tps-450-450.png";
    }

    public static boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6239df9", new Object[0])).booleanValue();
        }
        if (pmd.a().d() == null) {
            return false;
        }
        return com.taobao.taolive.room.utils.v.e(pmd.a().d().a("tblive", "enableInterceptPlayerProcess", "true"));
    }

    public static boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[0])).booleanValue();
        }
        if (pmd.a().d() == null) {
            return false;
        }
        return com.taobao.taolive.room.utils.v.e(pmd.a().d().a("tblive", "enableLiveWeakNet", "true"));
    }

    public static boolean J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4284fd5", new Object[0])).booleanValue();
        }
        if (o == -1) {
            o = l.d(OrangeConfig.getInstance().getConfig("tblive", "enableRefactorMute", "true")) ? 1 : 0;
        }
        return o == 1;
    }

    public static int K() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4366745", new Object[0])).intValue() : Math.min(Math.max(1, l.a(OrangeConfig.getInstance().getConfig("tblive", "maxMediaNumV2", "1"))), 1);
    }

    public static boolean t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6782aff", new Object[0])).booleanValue();
        }
        if (b == -1 && pmd.a().d() != null) {
            b = com.taobao.taolive.room.utils.v.e(pmd.a().d().a("tblive", "enableFixBlackFrame", "true")) ? 1 : 0;
        }
        return b == 1;
    }

    public static boolean T() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4b53adf", new Object[0])).booleanValue();
        }
        if (F == -1 && pmd.a().d() != null) {
            F = com.taobao.taolive.room.utils.v.e(pmd.a().d().a("tblive", "enableFixDestroyPlayer", "true")) ? 1 : 0;
        }
        return F == 1;
    }

    public static boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[0])).booleanValue();
        }
        if (x == -1 && pmd.a().d() != null) {
            x = com.taobao.taolive.room.utils.v.e(pmd.a().d().a("tblive", "enableOpenPermissionLive", "true")) ? 1 : 0;
        }
        return x == 1;
    }

    public static boolean S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4a7235e", new Object[0])).booleanValue();
        }
        if (C == -1 && pmd.a().d() != null) {
            C = com.taobao.taolive.room.utils.v.e(pmd.a().d().a("tblive", "enableOptDelayDestroyPlayer", "true")) ? 1 : 0;
        }
        return C == 1;
    }

    public static boolean a(com.taobao.taolive.sdk.controller.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("24a98202", new Object[]{eVar})).booleanValue();
        }
        if (eVar == null) {
            return false;
        }
        if (eVar.A == -1) {
            if (P() && pmd.a().t() != null) {
                eVar.A = com.taobao.taolive.room.utils.v.e(pmd.a().t().a("taolive", "enableUseSurfaceViewFormal", "enableUseSurfaceView", "false")) ? 1 : 0;
            } else {
                eVar.A = 0;
            }
        }
        return eVar.A == 1;
    }

    private static boolean P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("47cdcdb", new Object[0])).booleanValue();
        }
        if (pmd.a().d() == null) {
            return false;
        }
        return com.taobao.taolive.room.utils.v.e(pmd.a().d().a("tblive", "enableUseSurfaceViewABTest", "true"));
    }

    public static boolean I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("41a3854", new Object[0])).booleanValue();
        }
        if (y == -1 && pmd.a().d() != null) {
            y = com.taobao.taolive.room.utils.v.e(pmd.a().d().a("tblive", "enableUseRoomPlayer", "true")) ? 1 : 0;
        }
        return y == 1;
    }

    public static boolean E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3e1da50", new Object[0])).booleanValue();
        }
        if (w == -1 && pmd.a().d() != null) {
            w = com.taobao.taolive.room.utils.v.e(pmd.a().d().a("tblive", "enableRevertShowDialogWhenBuffering", "false")) ? 1 : 0;
        }
        return w == 1;
    }

    public static boolean L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4447ed7", new Object[0])).booleanValue();
        }
        if (p == -1 && pmd.a().d() != null) {
            p = com.taobao.taolive.room.utils.v.e(pmd.a().d().a("tblive", "enableAddLiveToken", "true")) ? 1 : 0;
        }
        return p == 1;
    }

    public static boolean s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("66a137e", new Object[0])).booleanValue();
        }
        if (r == -1 && pmd.a().d() != null) {
            r = com.taobao.taolive.room.utils.v.e(pmd.a().d().a("tblive", "enablePreAddVideoView", "true")) ? 1 : 0;
        }
        return r == 1;
    }

    public static boolean A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3a97c4c", new Object[0])).booleanValue();
        }
        if (u == -1 && pmd.a().d() != null) {
            u = com.taobao.taolive.room.utils.v.e(pmd.a().d().a("tblive", "enableTBCommonKeepOpenCardLastFrame", "true")) ? 1 : 0;
        }
        return u == 1;
    }

    public static boolean r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("65bfbfd", new Object[0])).booleanValue();
        }
        if (f21968a == -1 && pmd.a().d() != null) {
            f21968a = com.taobao.taolive.room.utils.v.e(pmd.a().d().a("tblive", "enableKeepLastFrame", "true")) ? 1 : 0;
        }
        return f21968a == 1;
    }

    public static boolean z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6ccb805", new Object[0])).booleanValue();
        }
        if (t == -1 && pmd.a().d() != null) {
            t = com.taobao.taolive.room.utils.v.e(pmd.a().d().a("tblive", "enableNotSetMuteWhenPreload", "true")) ? 1 : 0;
        }
        return t == 1;
    }

    public static boolean C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3c5ab4e", new Object[0])).booleanValue();
        }
        if (v == -1 && pmd.a().d() != null) {
            v = com.taobao.taolive.room.utils.v.e(pmd.a().d().a("tblive", "enableFixMuteChangeNotSmallWindowDismiss", "true")) ? 1 : 0;
        }
        return v == 1;
    }

    public static boolean y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6bea084", new Object[0])).booleanValue();
        }
        if (s == -1 && pmd.a().d() != null) {
            s = com.taobao.taolive.room.utils.v.e(pmd.a().d().a("tblive", "enableFixStayReport", "true")) ? 1 : 0;
        }
        return s == 1;
    }

    private static String a(String str, String str2, String str3, String str4) {
        pmf t2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bfa4f210", new Object[]{str, str2, str3, str4});
        }
        String str5 = E.get(str3);
        if (str5 == null && (t2 = pmd.a().t()) != null) {
            str5 = t2.a(str, str2, str3, str4);
            E.put(str3, str5);
        }
        return str5 != null ? str5 : str4;
    }

    public static int a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a821938e", new Object[]{new Integer(i)})).intValue();
        }
        if (!a("getSurfaceViewSDKVersion", true)) {
            return i;
        }
        String a2 = a("taolive", "SurfaceViewSDKVersion", "surfaceViewSDKVersion", "" + i);
        return !TextUtils.isEmpty(a2) ? com.taobao.taolive.room.utils.v.a(a2, i) : i;
    }

    public static boolean a(String str, boolean z2) {
        pmi d2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8123ece6", new Object[]{str, new Boolean(z2)})).booleanValue();
        }
        Boolean bool = D.get(str);
        if (bool == null && (d2 = pmd.a().d()) != null) {
            bool = Boolean.valueOf(com.taobao.taolive.room.utils.v.e(d2.a("tblive", str, String.valueOf(z2))));
            D.put(str, bool);
        }
        return bool != null ? bool.booleanValue() : z2;
    }

    public static boolean N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("460add9", new Object[0])).booleanValue();
        }
        if (z == -1 && pmd.a().d() != null) {
            z = com.taobao.taolive.room.utils.v.e(pmd.a().d().a("tblive", "enableOnlyHalfScreenToSmallWindow", "true")) ? 1 : 0;
        }
        return z == 1;
    }

    public static boolean R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4990bdd", new Object[0])).booleanValue();
        }
        if (B == -1 && pmd.a().d() != null) {
            B = com.taobao.taolive.room.utils.v.e(pmd.a().d().a("tblive", "enableDetailToSmallWindowWithFlag", "true")) ? 1 : 0;
        }
        return B == 1;
    }

    public static boolean O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("46ec55a", new Object[0])).booleanValue();
        }
        if (A == -1 && pmd.a().d() != null) {
            A = com.taobao.taolive.room.utils.v.e(pmd.a().d().a("tblive", "enableExtCustomPageParams", "true")) ? 1 : 0;
        }
        return A == 1;
    }

    public static boolean M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4529658", new Object[0])).booleanValue();
        }
        try {
            return l.d(pmd.a().d().a("tblive", "enableSupportPlayLiveVideo", "true"));
        } catch (Exception e2) {
            q.b("TBLiveCommonSDKConfig", "enableSupportPlayLiveVideo:" + e2.getMessage());
            return false;
        }
    }

    public static boolean U() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4c35260", new Object[0])).booleanValue() : l.d(pmd.a().t().a("RtcNewBuffer_component", "RtcNewBuffer_module", "enableRtcNewBufferStrategy", "false"));
    }

    public static int e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a4ca5f", new Object[0])).intValue() : l.a(tfv.a("tblive", "VideoImmersiveConfig", "100"), 0);
    }

    public static boolean V() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4d169e1", new Object[0])).booleanValue();
        }
        return l.d(tfv.a("tblive", "enableImmersiveExperience", "true")) && l.d(pmd.a().t().a("taolive", "ImmersiveExperience", "enabled", "true"));
    }

    public static boolean W() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4df8162", new Object[0])).booleanValue() : l.d(tfv.a("tblive", "enableDefaultImmersiveExperience", "false"));
    }

    public static List<String> X() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("3dc57f88", new Object[0]);
        }
        if (g == null && pmd.a().d() != null) {
            g = a(pmd.a().d().a("tblive", "immersiveExcludeSceneList", ""));
        }
        return g;
    }

    public static List<String> Y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("256755e7", new Object[0]);
        }
        if (h == null && pmd.a().d() != null) {
            h = a(pmd.a().d().a("tblive", "immersiveExcludeBizCodeList", ""));
        }
        return h;
    }

    private static List<String> a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("287b5bd5", new Object[]{str}) : Arrays.asList(str.split(";"));
    }
}
