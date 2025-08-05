package com.taobao.taolive.room.utils;

import android.content.Context;
import android.preference.PreferenceManager;
import android.taobao.mulitenv.EnvironmentSwitcher;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import java.util.Arrays;
import java.util.List;
import org.android.agoo.common.AgooConstants;
import tb.kge;
import tb.oyx;
import tb.plb;
import tb.pmd;
import tb.tfv;

/* loaded from: classes8.dex */
public class aa {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static int A = 0;
    private static int B = 0;
    private static int C = 0;
    private static int D = 0;
    private static int E = 0;
    private static int F = 0;
    private static int G = 0;
    private static int H = 0;
    private static int I = 0;
    private static int J = 0;
    private static int K = 0;
    private static String L = null;
    private static int M = 0;
    private static int N = 0;
    private static int O = 0;
    private static int P = 0;
    private static int Q = 0;
    private static int R = 0;
    private static int S = 0;
    private static int T = 0;
    public static final String TBLIVE_ORANGE_GROUP = "tblive";
    private static int U;
    private static int V;
    private static String W;

    /* renamed from: a  reason: collision with root package name */
    private static int f21753a;
    private static int b;
    private static int c;
    private static int d;
    private static int e;
    private static int f;
    private static int g;
    private static int h;
    private static int i;
    private static int j;
    private static int k;
    private static int l;
    private static int m;
    private static int n;
    private static int o;
    private static int p;
    private static int q;
    private static int r;
    private static int s;
    private static int t;
    private static int u;
    private static int v;
    private static int w;
    private static int x;
    private static int y;
    private static int z;

    public static boolean bd() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("acd19fcd", new Object[0])).booleanValue();
        }
        return false;
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : com.taobao.taolive.sdk.utils.u.aj();
    }

    public static boolean dk() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b09df592", new Object[0])).booleanValue() : com.taobao.taolive.sdk.utils.p.a("enablePreReleasePlayerWhenUpdown", true);
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : v.e(pmd.a().d().a("tblive", "enableLiveItemRefresh", "true"));
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue() : com.taobao.taolive.sdk.utils.u.ai();
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[0])).booleanValue();
        }
        if (!v.e(pmd.a().d().a("tblive", "isCloseLiveAutoPlayOfBigCardForShopLive", "false"))) {
            return false;
        }
        return av();
    }

    public static boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[0])).booleanValue() : v.e(pmd.a().d().a("tblive", "enableADPayFromUrl", "false"));
    }

    public static boolean g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[0])).booleanValue() : com.taobao.taolive.sdk.utils.u.am();
    }

    public static boolean h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[0])).booleanValue() : v.e(pmd.a().d().a("tblive", "enableUpDownSwitch4RecV2", "false"));
    }

    public static boolean i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[0])).booleanValue() : v.e(pmd.a().d().a("tblive", "enableTaoLiveBugfix", "true"));
    }

    public static boolean j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[0])).booleanValue() : v.e(pmd.a().d().a("tblive", "enableH5EmbedViewUT", "true"));
    }

    public static boolean k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[0])).booleanValue() : v.e(pmd.a().d().a("tblive", "enableH5EmbedViewH5UT", "false"));
    }

    public static boolean l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[0])).booleanValue() : v.e(pmd.a().d().a("tblive", "useRefreshForH5EmbedView", "true"));
    }

    public static boolean n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6239df9", new Object[0])).booleanValue() : v.e(pmd.a().d().a("tblive", "enableNewAPIForUpDownSwitch", "true"));
    }

    public static boolean o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("631b57a", new Object[0])).booleanValue() : v.e(pmd.a().d().a("tblive", "enableUpDownSwitchADCheck", "false"));
    }

    public static int p() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("63fccea", new Object[0])).intValue() : v.b(pmd.a().d().a("tblive", "UpDownSwitchADCheckInterval", "20"));
    }

    public static boolean r() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("65bfbfd", new Object[0])).booleanValue() : v.e(pmd.a().d().a("tblive", "checkSameId", "false"));
    }

    public static boolean s() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("66a137e", new Object[0])).booleanValue() : v.e(pmd.a().d().a("tblive", "EnableLiveRoomAlimama", "false"));
    }

    public static boolean t() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6782aff", new Object[0])).booleanValue() : v.e(pmd.a().d().a("tblive", "EnableLiveRoomAlimamaAdTransParams", "true"));
    }

    public static int u() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("686426f", new Object[0])).intValue() : v.b(pmd.a().d().a("tblive", "LiveRoomAlimamaExpTime", "0"));
    }

    public static boolean v() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6945a01", new Object[0])).booleanValue() : v.e(pmd.a().d().a("tblive", "EnableBackToLiveForTimeShift1", "true"));
    }

    public static int x() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6b088f2", new Object[0])).intValue() : v.b(pmd.a().d().a("tblive", "TBTVSwitchIdDelay", "10"));
    }

    public static boolean y() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6bea084", new Object[0])).booleanValue() : v.e(pmd.a().d().a("tblive", "enableItemQueryParams", "false"));
    }

    public static boolean z() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6ccb805", new Object[0])).booleanValue() : v.e(pmd.a().d().a("tblive", "enableAdjustBBConnectionVideoSize", "true"));
    }

    public static boolean A() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3a97c4c", new Object[0])).booleanValue() : com.taobao.taolive.sdk.utils.u.af();
    }

    public static boolean B() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3b793cd", new Object[0])).booleanValue() : v.e(pmd.a().d().a("tblive", "EnableTaoLiveSwitch", "true"));
    }

    public static String C() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ec4b0696", new Object[0]) : pmd.a().d().a("tblive", "TaoLiveIDV2", "221082344881");
    }

    public static boolean D() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3d3c2cf", new Object[0])).booleanValue() : v.e(pmd.a().d().a("tblive", "enableHolderPM", "true"));
    }

    public static final boolean F() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3eff1d1", new Object[0])).booleanValue() : v.e(pmd.a().d().a("tblive", "useNewNativeGoodList2", "true")) && !H();
    }

    public static boolean G() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3fe0952", new Object[0])).booleanValue() : F();
    }

    public static boolean H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("40c20d3", new Object[0])).booleanValue();
        }
        if (plb.a() == null) {
            return false;
        }
        String str = plb.a().accountId;
        try {
            for (String str2 : pmd.a().d().a("tblive", "topAnchors", "null").split(";")) {
                if (str2.equals(str)) {
                    return true;
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return false;
    }

    public static final boolean J() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4284fd5", new Object[0])).booleanValue() : v.e(pmd.a().d().a("tblive", "SendGoDetailMessage", "true"));
    }

    public static final int K() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4366745", new Object[0])).intValue() : v.b(pmd.a().d().a("tblive", "AutoHideMiniLiveShowcase", "10"));
    }

    public static int L() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4447ec6", new Object[0])).intValue() : v.b(pmd.a().d().a("tblive", "NewSwitchRequestPageSize", "5"));
    }

    public static int M() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4529647", new Object[0])).intValue() : v.b(pmd.a().d().a("tblive", "SwitchRoomTppFeedCount", "50"));
    }

    public static int N() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("460adc8", new Object[0])).intValue() : v.b(pmd.a().d().a("tblive", "UpDownSwitchFeedListSizeForHomepage", "30"));
    }

    public static int O() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("46ec549", new Object[0])).intValue() : v.b(pmd.a().d().a("tblive", "UpDownRequestInterval", "2"));
    }

    public static String P() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c11580a9", new Object[0]) : pmd.a().d().a("tblive", "LiveDegradeInfoH5Url", "http://huodong.m.taobao.com/act/9rumcu.html");
    }

    public static boolean Q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("48af45c", new Object[0])).booleanValue() : v.e(pmd.a().d().a("tblive", "EnableBelovedFansEnterEffectV2", "true"));
    }

    public static int R() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4990bcc", new Object[0])).intValue() : v.b(pmd.a().d().a("tblive", "BelovedFansMinLevel", AgooConstants.ACK_FLAG_NULL));
    }

    public static boolean S() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4a7235e", new Object[0])).booleanValue() : v.e(pmd.a().d().a("tblive", "EnableLinkLiveSEIDetect", "true"));
    }

    public static String T() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("db2c6b25", new Object[0]) : pmd.a().d().a("tblive", "LiveHomePageUrl", "");
    }

    public static boolean X() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4ed98e3", new Object[0])).booleanValue() : com.taobao.taolive.sdk.utils.u.ae();
    }

    public static boolean Y() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4fbb064", new Object[0])).booleanValue() : com.taobao.taolive.sdk.utils.u.ad();
    }

    public static boolean ab() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab00982c", new Object[0])).booleanValue() : v.e(pmd.a().d().a("tblive", "UseShareItemIdForGoodsList", "true"));
    }

    public static boolean ac() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab0eafad", new Object[0])).booleanValue() : v.e(pmd.a().d().a("tblive", "shareShowGoodList", "false"));
    }

    public static int ad() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ab1cc71d", new Object[0])).intValue() : v.b(pmd.a().d().a("tblive", "preLoadRecCountForNewController", "2"));
    }

    public static String ae() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e6d8e155", new Object[0]) : com.taobao.taolive.sdk.utils.u.at();
    }

    public static String af() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6d5e9bf4", new Object[0]) : pmd.a().d().a("tblive", "fandomLiveShareTips", "蹲点%s的宝宝圈，主播宠粉互动，还有精彩福利剧透等你来！");
    }

    public static boolean ai() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab633cb3", new Object[0])).booleanValue() : v.e(pmd.a().d().a("tblive", "anchorReply", "true"));
    }

    public static boolean aj() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab715434", new Object[0])).booleanValue() : v.e(pmd.a().d().a("tblive", "enableLiveRoomDrawDelayed", "false"));
    }

    public static String a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bbc5dc40", new Object[]{context});
        }
        return pmd.a().d().a("tblive", "TobeCastUrl", PreferenceManager.getDefaultSharedPreferences(context.getApplicationContext()).getInt(EnvironmentSwitcher.SPKEY_ENV, 0) == 1 ? "https://market.wapa.taobao.com/app/mtb/app-live-anchor-growth/pages/PullList" : "https://market.m.taobao.com/app/mtb/app-live-anchor-growth/pages/PullList");
    }

    public static boolean ar() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("abe2103c", new Object[0])).booleanValue() : v.e(pmd.a().d().a("tblive", "enableBackToLivePageTrack", "true"));
    }

    public static int as() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("abf027ac", new Object[0])).intValue() : v.b(pmd.a().d().a("tblive", "chatMessageUpdateDelay", "400"));
    }

    public static int at() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("abfe3f2d", new Object[0])).intValue() : v.b(pmd.a().d().a("tblive", "getChatMessageUpdateSize", "1"));
    }

    public static boolean au() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ac0c56bf", new Object[0])).booleanValue() : com.taobao.taolive.sdk.utils.u.ak();
    }

    public static boolean av() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ac1a6e40", new Object[0])).booleanValue();
        }
        if (pmd.a().t() == null) {
            return false;
        }
        return v.e(pmd.a().t().a("taolive", "LiveAutoPlayOfBigCardForShopLive", "enable", "true"));
    }

    public static boolean aw() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ac2885c1", new Object[0])).booleanValue() : v.e(pmd.a().d().a("tblive", "shareLivePlayUrl", "true"));
    }

    public static boolean ax() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ac369d42", new Object[0])).booleanValue();
        }
        if (v.e(pmd.a().d().a("tblive", "fetchCDNLiveInfo", "true")) && pmd.a().t() != null) {
            return v.e(pmd.a().t().a("taolive", "fetchCDNLiveInfo", "enable", "true"));
        }
        return false;
    }

    public static boolean ay() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ac44b4c3", new Object[0])).booleanValue() : v.e(pmd.a().d().a("tblive", "enableCommentOff", "true"));
    }

    public static boolean az() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ac52cc44", new Object[0])).booleanValue() : v.e(pmd.a().d().a("tblive", "tpp88TrackInfo", "true"));
    }

    public static boolean aB() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a93da80c", new Object[0])).booleanValue() : v.e(pmd.a().d().a("tblive", "enableAddSpmUrlInGetLiveRoomInfo", "true"));
    }

    public static boolean aC() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a94bbf8d", new Object[0])).booleanValue() : v.e(pmd.a().d().a("tblive", "enableShoptimeMovingItemIdDown", "true"));
    }

    public static boolean aD() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a959d70e", new Object[0])).booleanValue() : v.e(pmd.a().d().a("tblive", "enableCleanLivelistForShop", "true"));
    }

    public static boolean aE() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a967ee8f", new Object[0])).booleanValue() : v.e(pmd.a().d().a("tblive", "enableHighlightReplaceTimeMovingId", "true"));
    }

    public static boolean aa() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("aaf280ab", new Object[0])).booleanValue() : v.e(pmd.a().d().a("tblive", "huanduanParamsLivedetail", "true"));
    }

    public static boolean aF() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a9760610", new Object[0])).booleanValue() : v.e(pmd.a().d().a("tblive", "enableHighlightKeyPointId", "true"));
    }

    public static boolean aG() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9841d91", new Object[0])).booleanValue();
        }
        if (pmd.a().d() == null) {
            return false;
        }
        return v.e(pmd.a().d().a("tblive", "enableKandianUpdownABTestNew", "true"));
    }

    public static boolean aI() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9a04c93", new Object[0])).booleanValue();
        }
        if (pmd.a().d() == null) {
            return false;
        }
        return v.e(pmd.a().d().a("tblive", "isUseNewTrackInfoUrl", "true"));
    }

    public static boolean aJ() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9ae6414", new Object[0])).booleanValue();
        }
        if (pmd.a().d() == null) {
            return true;
        }
        return v.e(pmd.a().d().a("tblive", "goodsDXMangeDestroy", "true"));
    }

    public static boolean aK() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a9bc7b95", new Object[0])).booleanValue() : v.e(pmd.a().d().a("tblive", "enableMoreLiveOnKeyDownIntercept", "true"));
    }

    public static double aL() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a9ca9300", new Object[0])).doubleValue() : v.a(pmd.a().d().a("tblive", "shopCardAspectRatio", "1.77"), 1.77f);
    }

    static {
        kge.a(-494212622);
        f21753a = -1;
        C = -1;
        b = -1;
        c = -1;
        d = -1;
        e = -1;
        f = -1;
        g = -1;
        h = -1;
        i = -1;
        j = -1;
        k = -1;
        m = -1;
        I = -1;
        J = -1;
        n = -1;
        o = -1;
        O = -1;
        P = -1;
        K = -1;
        H = -1;
        p = -1;
        q = -1;
        r = -1;
        s = -1;
        t = -1;
        l = -1;
        u = -1;
        v = -1;
        W = null;
        w = -1;
        x = -1;
        y = -1;
        z = -1;
        A = -1;
        B = -1;
        D = -1;
        E = -1;
        F = -1;
        G = -1;
        L = null;
        M = -1;
        Q = -1;
        N = -1;
        R = -1;
        U = -1;
        S = -1;
        V = -1;
        T = -1;
    }

    public static boolean aM() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9d8aa97", new Object[0])).booleanValue();
        }
        if (C == -1 && pmd.a().d() != null) {
            C = v.e(pmd.a().d().a("tblive", "isAddCoverGauss", "true")) ? 1 : 0;
        }
        return C == 1;
    }

    public static boolean aN() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a9e6c218", new Object[0])).booleanValue() : v.e(pmd.a().d().a("tblive", "fixTBLiveDataModelNotUpdate", "true"));
    }

    public static boolean aO() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a9f4d999", new Object[0])).booleanValue() : v.e(OrangeConfig.getInstance().getConfig("tblive", "enableParseNeedRecommend", "true"));
    }

    public static boolean aP() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aa02f11a", new Object[0])).booleanValue();
        }
        if (pmd.a().d() != null) {
            return v.e(pmd.a().d().a("tblive", "enableClearMediaInfoWhenUpdownSwitch", "true"));
        }
        return false;
    }

    public static boolean aQ() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aa11089b", new Object[0])).booleanValue();
        }
        if (pmd.a().d() != null) {
            return v.e(pmd.a().d().a("tblive", "playerLoadingAnimationEnable20230208", "false"));
        }
        return false;
    }

    public static int aR() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("aa1f200b", new Object[0])).intValue();
        }
        if (pmd.a().d() != null) {
            return v.b(pmd.a().d().a("tblive", "playerLoadingStartTime", "3"));
        }
        return 3;
    }

    public static int ci() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("aeccede0", new Object[0])).intValue();
        }
        if (pmd.a().d() != null) {
            return v.b(pmd.a().d().a("tblive", "getSwitchTipTimeS", "5"));
        }
        return 3;
    }

    public static int e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5a4ca5f", new Object[0])).intValue();
        }
        if (pmd.a().d() != null) {
            return v.b(pmd.a().d().a("tblive", "getLiveRoomWarmDelayTimeMS", "1500"));
        }
        return 5;
    }

    public static int aS() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("aa2d378c", new Object[0])).intValue();
        }
        if (pmd.a().d() != null) {
            return v.b(pmd.a().d().a("tblive", "playerLoadingTipsTime", "8"));
        }
        return 8;
    }

    public static boolean aT() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aa3b4f1e", new Object[0])).booleanValue();
        }
        if (pmd.a().d() == null) {
            return true;
        }
        return v.e(pmd.a().d().a("tblive", "enableUseQuickUrl2", "true"));
    }

    public static boolean aq() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("abd3f8bb", new Object[0])).booleanValue();
        }
        if (pmd.a().d() == null) {
            return true;
        }
        return com.taobao.taolive.sdk.utils.u.as() && v.e(pmd.a().d().a("tblive", "enablePlayerCoverImg", "true"));
    }

    public static boolean aU() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("aa49669f", new Object[0])).booleanValue() : v.e(pmd.a().d().a("tblive", "enableTransTrackInfo", "false"));
    }

    public static boolean aV() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aa577e20", new Object[0])).booleanValue();
        }
        if (b == -1 && pmd.a().d() != null) {
            b = v.e(pmd.a().d().a("tblive", "enableLpmOpt20230301", "true")) ? 1 : 0;
        }
        return b == 1;
    }

    public static boolean aW() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aa6595a1", new Object[0])).booleanValue();
        }
        if (c == -1 && pmd.a().d() != null) {
            c = v.e(pmd.a().d().a("tblive", oyx.ORANGE_ENABLE_PRELOAD_OPT, "true")) ? 1 : 0;
        }
        return c == 1;
    }

    public static boolean aX() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aa73ad22", new Object[0])).booleanValue();
        }
        if (e == -1 && pmd.a().d() != null) {
            e = v.e(pmd.a().d().a("tblive", "enableOnWillDisAppearDestroy", "true")) ? 1 : 0;
        }
        return e == 1;
    }

    public static boolean aY() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aa81c4a3", new Object[0])).booleanValue();
        }
        if (f == -1 && pmd.a().d() != null) {
            f = v.e(pmd.a().d().a("tblive", "enableCheckUrl", "true")) ? 1 : 0;
        }
        return f == 1;
    }

    public static boolean aZ() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aa8fdc24", new Object[0])).booleanValue();
        }
        if (g == -1 && pmd.a().d() != null) {
            g = v.e(pmd.a().d().a("tblive", "enableShopPlayerTokenRecycleBugfix", "true")) ? 1 : 0;
        }
        return g == 1;
    }

    public static boolean ba() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aca7594a", new Object[0])).booleanValue();
        }
        if (h == -1 && pmd.a().d() != null) {
            h = v.e(pmd.a().d().a("tblive", "enableJumpCheckLiveID", "true")) ? 1 : 0;
        }
        return h == 1;
    }

    public static boolean bb() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("acb570cb", new Object[0])).booleanValue();
        }
        if (i == -1 && pmd.a().d() != null) {
            i = v.e(pmd.a().d().a("tblive", "enableShopFullReleaseBugfix", "true")) ? 1 : 0;
        }
        return i == 1;
    }

    public static boolean bc() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("acc3884c", new Object[0])).booleanValue();
        }
        if (j == -1 && pmd.a().d() != null) {
            j = v.e(pmd.a().d().a("tblive", "enableCutoutBugfix", "true")) ? 1 : 0;
        }
        return j == 1;
    }

    public static boolean aA() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a92f908b", new Object[0])).booleanValue() : com.taobao.taolive.sdk.utils.u.as() && v.e(pmd.a().d().a("tblive", "enableHandleDetailData618", "true"));
    }

    public static boolean be() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("acdfb74e", new Object[0])).booleanValue() : com.taobao.taolive.sdk.utils.u.as() && v.e(pmd.a().d().a("tblive", "enableCPUAdeMonBootsCpu", "false"));
    }

    public static boolean bp() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ad7ab9d9", new Object[0])).booleanValue() : com.taobao.taolive.sdk.utils.u.as() && v.e(pmd.a().d().a("tblive", "enableDataDestorySwitch", "true"));
    }

    public static boolean bf() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("acedcecf", new Object[0])).booleanValue() : v.e(pmd.a().d().a("tblive", "enableSpmInExposureEvent", "false"));
    }

    public static boolean bg() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("acfbe650", new Object[0])).booleanValue() : v.e(pmd.a().d().a("tblive", "enableSpmInClickEvent", "false"));
    }

    public static boolean bh() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ad09fdd1", new Object[0])).booleanValue() : v.e(pmd.a().d().a("tblive", "enableUpdateDisPatchTrackInfo", "true"));
    }

    public static boolean bk() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ad344454", new Object[0])).booleanValue() : v.e(pmd.a().d().a("tblive", "smallWindowClickBugfix", "true"));
    }

    public static boolean bl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ad425bd5", new Object[0])).booleanValue();
        }
        if (pmd.a().d() == null) {
            return false;
        }
        return v.e(pmd.a().d().a("tblive", "enableSetVideoCoverDelay", "true"));
    }

    public static boolean bm() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ad507356", new Object[0])).booleanValue() : v.e(pmd.a().d().a("tblive", "enableFixIsDestroyedForShop", "true"));
    }

    public static boolean bn() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ad5e8ad7", new Object[0])).booleanValue() : v.e(pmd.a().d().a("tblive", "enableFixIsVideoFrameForShop", "true"));
    }

    public static boolean bo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ad6ca258", new Object[0])).booleanValue() : v.e(pmd.a().d().a("tblive", "enableFixSmallClickNewForShop", "false"));
    }

    public static boolean bq() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ad88d15a", new Object[0])).booleanValue();
        }
        if (m == -1 && pmd.a().d() != null) {
            m = v.e(pmd.a().d().a("tblive", "enableResetUri2", "true")) ? 1 : 0;
        }
        return m == 1;
    }

    public static boolean q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("64de47c", new Object[0])).booleanValue();
        }
        if (I == -1 && pmd.a().d() != null) {
            I = v.e(pmd.a().d().a("tblive", "enableEnterUseExternalImage", "true")) ? 1 : 0;
        }
        return I == 1;
    }

    public static boolean w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6a27182", new Object[0])).booleanValue();
        }
        if (J == -1 && pmd.a().d() != null) {
            J = v.e(pmd.a().d().a("tblive", "enableEnterDelayDidAppear", "true")) ? 1 : 0;
        }
        return J == 1;
    }

    public static boolean bs() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ada5005c", new Object[0])).booleanValue();
        }
        if (n == -1 && pmd.a().d() != null) {
            n = v.e(pmd.a().d().a("tblive", "enableRemoveDoubleDisappear", "true")) ? 1 : 0;
        }
        return n == 1;
    }

    public static boolean bt() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("adb317dd", new Object[0])).booleanValue();
        }
        if (pmd.a().d() == null) {
            return true;
        }
        return v.e(pmd.a().d().a("tblive", "enableRequestDoubleBugfix", "true"));
    }

    public static boolean bu() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("adc12f5e", new Object[0])).booleanValue();
        }
        if (pmd.a().d() == null) {
            return true;
        }
        return v.e(pmd.a().d().a("tblive", "enableShopSpmBugfix", "true"));
    }

    public static boolean bv() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("adcf46df", new Object[0])).booleanValue() : v.e(pmd.a().d().a("tblive", "enableRefund", "true"));
    }

    public static boolean bw() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("addd5e60", new Object[0])).booleanValue() : v.e(pmd.a().d().a("tblive", "enableTaoLiveShopfixHighlightReplay", "true"));
    }

    public static boolean bx() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("adeb75e1", new Object[0])).booleanValue() : v.e(pmd.a().d().a("tblive", "enableTaoLiveShopSkipResume", "false"));
    }

    public static boolean cH() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("acfbe650", new Object[0])).booleanValue() : v.e(pmd.a().d().a("tblive", "enableTaoLiveFixHalfInit", "false"));
    }

    public static boolean by() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("adf98d62", new Object[0])).booleanValue();
        }
        if (pmd.a().d() == null) {
            return false;
        }
        return v.e(pmd.a().d().a("tblive", "enableShopNotSupportPreLoad", "true"));
    }

    public static boolean bz() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ae07a4e3", new Object[0])).booleanValue();
        }
        if (pmd.a().d() == null) {
            return false;
        }
        return v.e(pmd.a().d().a("tblive", "enableTaoLiveShopSkipPlayNew", "true"));
    }

    public static boolean bA() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aae4692a", new Object[0])).booleanValue();
        }
        if (pmd.a().d() == null) {
            return false;
        }
        return v.e(pmd.a().d().a("tblive", "enableFixShopAnchorCard", "true"));
    }

    public static boolean bB() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aaf280ab", new Object[0])).booleanValue();
        }
        if (pmd.a().d() == null) {
            return false;
        }
        return v.e(pmd.a().d().a("tblive", "enableAutoDown", "false"));
    }

    public static boolean bC() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab00982c", new Object[0])).booleanValue();
        }
        if (pmd.a().d() == null) {
            return false;
        }
        return v.e(pmd.a().d().a("tblive", "enableHighlightPerformanceFix", "true"));
    }

    public static boolean bD() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab0eafad", new Object[0])).booleanValue();
        }
        if (pmd.a().d() == null) {
            return false;
        }
        return v.e(pmd.a().d().a("tblive", "enablePageTrackAddExtendJson", "true"));
    }

    public static boolean bE() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab1cc72e", new Object[0])).booleanValue();
        }
        if (pmd.a().d() == null) {
            return false;
        }
        return v.e(pmd.a().d().b("tblive", "enableSimpleTrackPageFeedId", "true"));
    }

    public static boolean bF() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab2adeaf", new Object[0])).booleanValue();
        }
        if (pmd.a().d() == null) {
            return false;
        }
        return v.e(pmd.a().d().a("tblive", "enableSupportShopGlobalMute", "true"));
    }

    public static boolean bG() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab38f630", new Object[0])).booleanValue();
        }
        if (pmd.a().d() == null) {
            return false;
        }
        return v.e(pmd.a().d().b("tblive", "enableLiveAndHomeMixOrange", "true"));
    }

    public static boolean bH() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab470db1", new Object[0])).booleanValue();
        }
        if (pmd.a().d() == null) {
            return false;
        }
        return v.e(pmd.a().d().b("tblive", "switchToPortraitOrLandscapeDelayBugfix", "true"));
    }

    public static boolean cV() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("adc12f5e", new Object[0])).booleanValue();
        }
        if (pmd.a().d() == null) {
            return false;
        }
        return v.e(pmd.a().d().b("tblive", "enableFoldDeviceForcePortraitFix", "true"));
    }

    public static String bI() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7a6a1132", new Object[0]) : pmd.a().d() != null ? pmd.a().d().b("tblive", "liveAndHomeMixTemplate", "taolive_home_and_live_tab") : "";
    }

    public static int bJ() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ab633ca2", new Object[0])).intValue();
        }
        if (pmd.a().d() == null) {
            return 40;
        }
        return v.b(pmd.a().d().b("tblive", "liveAndHomeMixTemplateHeight", "40"));
    }

    public static boolean bK() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab715434", new Object[0])).booleanValue();
        }
        if (o == -1 && pmd.a().d() != null) {
            o = v.e(pmd.a().d().a("tblive", "enableFixShopCardBlack", "true")) ? 1 : 0;
        }
        return o == 1;
    }

    public static boolean br() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ad96e8db", new Object[0])).booleanValue();
        }
        if (O == -1 && pmd.a().d() != null) {
            O = v.e(pmd.a().d().a("tblive", "enableUpdateAllDataWhenRefresh", "true")) ? 1 : 0;
        }
        return O == 1;
    }

    public static boolean I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("41a3854", new Object[0])).booleanValue();
        }
        if (K == -1 && pmd.a().d() != null) {
            K = v.e(pmd.a().d().a("tblive", "enableFixKeepMute0315", "true")) ? 1 : 0;
        }
        return K == 1;
    }

    public static boolean bL() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab7f6bb5", new Object[0])).booleanValue();
        }
        if (p == -1 && pmd.a().d() != null) {
            p = v.e(pmd.a().d().a("tblive", "enableRoomEngineCheckLegal", "true")) ? 1 : 0;
        }
        return p == 1;
    }

    public static boolean bM() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab8d8336", new Object[0])).booleanValue();
        }
        if (pmd.a().d() == null) {
            return false;
        }
        return v.e(pmd.a().d().b("tblive", "shopTopHeightBugfix", "true"));
    }

    public static boolean bN() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab9b9ab7", new Object[0])).booleanValue();
        }
        if (pmd.a().d() == null) {
            return false;
        }
        return v.e(pmd.a().d().a("tblive", "enableEurl", "false"));
    }

    public static boolean bO() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("aba9b238", new Object[0])).booleanValue() : v.e(OrangeConfig.getInstance().getConfig("tblive", "enableOuterParam", "true"));
    }

    public static boolean bP() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("abb7c9b9", new Object[0])).booleanValue();
        }
        if (q == -1 && pmd.a().d() != null) {
            q = v.e(pmd.a().d().a("tblive", "enableFixShopPause", "true")) ? 1 : 0;
        }
        return q == 1;
    }

    public static boolean bQ() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("abc5e13a", new Object[0])).booleanValue();
        }
        if (r == -1 && pmd.a().d() != null) {
            r = v.e(pmd.a().d().a("tblive", "enableRecommendGoodCard", "true")) ? 1 : 0;
        }
        return r == 1;
    }

    public static boolean bR() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("abd3f8bb", new Object[0])).booleanValue();
        }
        if (s == -1 && pmd.a().d() != null) {
            s = v.e(pmd.a().d().a("tblive", "enableFixLandscapeGesture", "true")) ? 1 : 0;
        }
        return s == 1;
    }

    public static boolean bS() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("abe2103c", new Object[0])).booleanValue();
        }
        if (pmd.a().d() == null) {
            return false;
        }
        return v.e(pmd.a().d().a("tblive", "enable302", "true"));
    }

    public static boolean bT() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("abf027bd", new Object[0])).booleanValue() : v.e(pmd.a().d().b("tblive", "enableCheckDisplayCutoutBugfix", "true"));
    }

    public static String cJ() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4b216512", new Object[0]) : pmd.a().d() != null ? pmd.a().d().a("tblive", "getNetWorkCoverImageSize", "_600x600q75b40.jpg") : "_600x600q75b40.jpg";
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str}) : pmd.a().d() != null ? pmd.a().d().a("tblive", "officialLiveUTList", str) : str;
    }

    public static boolean bU() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("abfe3f3e", new Object[0])).booleanValue();
        }
        if (t == -1 && pmd.a().d() != null) {
            t = v.e(pmd.a().d().a("tblive", "enableOpenKeepMute", "true")) ? 1 : 0;
        }
        return t == 1;
    }

    public static boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6158678", new Object[0])).booleanValue();
        }
        if (l == -1 && pmd.a().d() != null) {
            l = v.e(pmd.a().d().a("tblive", "enableTaoHomeOpenKeepMute", "true")) ? 1 : 0;
        }
        return l == 1;
    }

    public static int bV() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ac0c56ae", new Object[0])).intValue();
        }
        if (u == -1 && pmd.a().d() != null) {
            u = v.a(pmd.a().d().a("tblive", "getKeepMuteTimeS", AgooConstants.ACK_PACK_ERROR), 15);
        }
        return u;
    }

    public static int bW() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ac1a6e2f", new Object[0])).intValue();
        }
        if (v == -1 && pmd.a().d() != null) {
            v = v.a(pmd.a().d().a("tblive", "getKeepRTimeS", "3"), 3);
        }
        return v;
    }

    public static boolean bZ() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ac44b4c3", new Object[0])).booleanValue() : v.e(pmd.a().d().b("tblive", "enableCompatCheckOfficialLive", "true"));
    }

    public static boolean ca() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ae5c31e9", new Object[0])).booleanValue() : v.e(pmd.a().d().b("tblive", "enableOfficialLiveHeartParams", "true"));
    }

    public static boolean cb() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ae6a496a", new Object[0])).booleanValue() : v.e(OrangeConfig.getInstance().getConfig("tblive", "enableAdaptLivePlayMode", "true"));
    }

    public static String cc() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6e309e99", new Object[0]) : OrangeConfig.getInstance().getConfig("tblive", "playModeForLandscapeRoom", "1");
    }

    public static String cd() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f4b65938", new Object[0]) : OrangeConfig.getInstance().getConfig("tblive", "playModeForPortraitRoom", "2");
    }

    public static boolean cf() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aea2a76e", new Object[0])).booleanValue();
        }
        if (OrangeConfig.getInstance() == null) {
            return true;
        }
        return v.e(OrangeConfig.getInstance().getConfig("tblive", "enableBugFixTab3Good", "true"));
    }

    public static boolean cg() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aeb0beef", new Object[0])).booleanValue();
        }
        if (OrangeConfig.getInstance() == null) {
            return true;
        }
        return v.e(OrangeConfig.getInstance().getConfig("tblive", "enableHighlightInTab3", "true"));
    }

    public static List<String> am() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("4011b34", new Object[0]);
        }
        if (W == null && pmd.a().d() != null) {
            W = pmd.a().d().a("tblive", "interactiveExperimentList", "taolive_HotStrategy_turnOn");
        }
        return b(W);
    }

    public static boolean ch() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aebed670", new Object[0])).booleanValue();
        }
        if (w == -1 && pmd.a().d() != null) {
            w = v.e(pmd.a().d().a("tblive", "enableFixShopCardLiveSource", "true")) ? 1 : 0;
        }
        return w == 1;
    }

    public static boolean cj() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aedb0572", new Object[0])).booleanValue();
        }
        if (y == -1 && pmd.a().d() != null) {
            y = v.e(pmd.a().d().a("tblive", "enableTab3FixSmallWindowBug", "true")) ? 1 : 0;
        }
        return y == 1;
    }

    public static boolean ck() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aee91cf3", new Object[0])).booleanValue();
        }
        if (OrangeConfig.getInstance() == null) {
            return true;
        }
        return v.e(OrangeConfig.getInstance().getConfig("tblive", "enableRecommendPopDXManagerBugfix", "true"));
    }

    public static boolean cl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aef73474", new Object[0])).booleanValue();
        }
        if (OrangeConfig.getInstance() == null) {
            return true;
        }
        return v.e(OrangeConfig.getInstance().getConfig("tblive", "fixClickIdVoluation", "true"));
    }

    public static boolean cn() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("af136376", new Object[0])).booleanValue();
        }
        if (OrangeConfig.getInstance() == null) {
            return true;
        }
        return v.e(OrangeConfig.getInstance().getConfig("tblive", "enableSpmUrl", "true"));
    }

    public static boolean co() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("af217af7", new Object[0])).booleanValue();
        }
        if (OrangeConfig.getInstance() == null) {
            return true;
        }
        return v.e(OrangeConfig.getInstance().getConfig("tblive", "fixFollowServerLeak", "true"));
    }

    public static boolean cp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("af2f9278", new Object[0])).booleanValue();
        }
        if (z == -1 && pmd.a().d() != null) {
            z = v.e(pmd.a().d().a("tblive", "enableFixUtPageFromCall", "true")) ? 1 : 0;
        }
        return z == 1;
    }

    public static boolean cq() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("af3da9f9", new Object[0])).booleanValue();
        }
        if (A == -1 && pmd.a().d() != null) {
            A = v.e(pmd.a().d().a("tblive", "enableFixTrackInfoAndPvid", "true")) ? 1 : 0;
        }
        return A == 1;
    }

    public static boolean cr() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("af4bc17a", new Object[0])).booleanValue();
        }
        if (B == -1 && pmd.a().d() != null) {
            B = v.e(pmd.a().d().a("tblive", "enableOpenSlideSmallWindow", "true")) ? 1 : 0;
        }
        return B == 1;
    }

    public static boolean bi() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ad181552", new Object[0])).booleanValue();
        }
        if (OrangeConfig.getInstance() == null) {
            return true;
        }
        return v.e(OrangeConfig.getInstance().getConfig("tblive", "enableTaoliveStackManager", "true"));
    }

    public static boolean bj() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ad262cd3", new Object[0])).booleanValue();
        }
        if (OrangeConfig.getInstance() == null) {
            return true;
        }
        return v.e(OrangeConfig.getInstance().getConfig("tblive", "enablePlayReportFeedType", "true"));
    }

    public static boolean cs() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("af59d8fb", new Object[0])).booleanValue();
        }
        if (OrangeConfig.getInstance() == null) {
            return true;
        }
        return v.e(OrangeConfig.getInstance().getConfig("tblive", "enablePlayBackToLive", "true"));
    }

    public static boolean ct() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("af67f07c", new Object[0])).booleanValue();
        }
        if (D == -1 && pmd.a().d() != null && v.e(pmd.a().d().a("tblive", "enablePublicUseOpenLive", "true"))) {
            D = cu() ? 1 : 0;
        }
        return D == 1;
    }

    public static boolean cu() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("af7607fd", new Object[0])).booleanValue();
        }
        if (pmd.a().t() == null) {
            return false;
        }
        return v.e(pmd.a().t().a("taolive", "EnablePublicUseOpenLiveAB", "enable", "true"));
    }

    public static boolean cv() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("af841f7e", new Object[0])).booleanValue();
        }
        if (pmd.a().t() == null) {
            return true;
        }
        return v.e(pmd.a().t().a("taolive", "enableKandianJump4Mix", "enable", "true"));
    }

    public static boolean cw() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("af9236ff", new Object[0])).booleanValue();
        }
        if (E == -1 && pmd.a().d() != null) {
            E = v.e(pmd.a().d().a("tblive", "enableFixGiftScrollProblem", "true")) ? 1 : 0;
        }
        return E == 1;
    }

    public static boolean cx() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("afa04e80", new Object[0])).booleanValue();
        }
        if (OrangeConfig.getInstance() == null) {
            return true;
        }
        return v.e(OrangeConfig.getInstance().getConfig("tblive", "bugFixAddUriParamsIntoInitparams", "true"));
    }

    public static boolean U() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4c35260", new Object[0])).booleanValue();
        }
        if (OrangeConfig.getInstance() == null) {
            return false;
        }
        return v.e(OrangeConfig.getInstance().getConfig("tblive", "enableMultiLinkChatroomEnterV2", "true"));
    }

    public static boolean cA() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ac9941c9", new Object[0])).booleanValue();
        }
        if (OrangeConfig.getInstance() == null) {
            return false;
        }
        return v.e(OrangeConfig.getInstance().getConfig("tblive", "enableFixShop2FScroll", "true"));
    }

    public static boolean aH() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9923512", new Object[0])).booleanValue();
        }
        if (F == -1 && pmd.a().d() != null) {
            F = v.e(pmd.a().d().a("tblive", "enableFixOnStart", "true")) ? 1 : 0;
        }
        return F == 1;
    }

    public static boolean cB() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aca7594a", new Object[0])).booleanValue();
        }
        if (OrangeConfig.getInstance() == null) {
            return true;
        }
        return v.e(OrangeConfig.getInstance().getConfig("tblive", "enableMixLiveReturn", "true"));
    }

    public static boolean cC() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("acb570cb", new Object[0])).booleanValue();
        }
        if (pmd.a().d() == null) {
            return false;
        }
        return v.e(pmd.a().d().a("tblive", "enableInsideDetail2", "false"));
    }

    public static boolean cD() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("acc3884c", new Object[0])).booleanValue();
        }
        if (pmd.a().d() == null) {
            return false;
        }
        return v.e(pmd.a().d().a("tblive", "enableDisableVerticalScroll", "true"));
    }

    public static boolean E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3e1da50", new Object[0])).booleanValue();
        }
        if (G == -1 && pmd.a().d() != null) {
            G = v.e(pmd.a().d().a("tblive", "enableFixFollowLeak", "true")) ? 1 : 0;
        }
        return G == 1;
    }

    public static boolean Z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("509c7e5", new Object[0])).booleanValue();
        }
        if (pmd.a().d() == null) {
            return false;
        }
        return v.e(pmd.a().d().a("tblive", "修复店铺相关方法", "true"));
    }

    public static boolean V() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4d169e1", new Object[0])).booleanValue();
        }
        if (pmd.a().d() == null) {
            return false;
        }
        return v.e(pmd.a().d().a("tblive", "enablefixHighlightErrorVideo", "true"));
    }

    public static boolean W() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4df8162", new Object[0])).booleanValue();
        }
        if (pmd.a().d() == null) {
            return false;
        }
        return v.e(pmd.a().d().a("tblive", "enableUpDownSwitchTimer", "true"));
    }

    public static boolean ag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab470db1", new Object[0])).booleanValue();
        }
        if (pmd.a().d() == null) {
            return false;
        }
        return v.e(pmd.a().d().a("tblive", "enableUpDownMonitoringLog", "true"));
    }

    public static List<String> ah() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("7dd7eb59", new Object[0]);
        }
        if (L == null && pmd.a().d() != null) {
            L = pmd.a().d().a("tblive", "mainSearchLiveSourceList", "mainsearchlive;livegiraffe;livecloudtheme;ad_timemove");
        }
        return b(L);
    }

    private static List<String> b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("89cdf874", new Object[]{str}) : Arrays.asList(str.split(";"));
    }

    public static boolean ak() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab7f6bb5", new Object[0])).booleanValue();
        }
        if (M == -1 && pmd.a().d() != null) {
            M = v.e(pmd.a().d().a("tblive", "enableTransPmParams", "true")) ? 1 : 0;
        }
        return M == 1;
    }

    public static boolean bX() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ac2885c1", new Object[0])).booleanValue();
        }
        if (Q == -1 && pmd.a().d() != null) {
            Q = v.e(pmd.a().d().a("tblive", "enableGetTrackInfoFromExtraBundle", "true")) ? 1 : 0;
        }
        return Q == 1;
    }

    public static boolean al() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab8d8336", new Object[0])).booleanValue();
        }
        if (N == -1 && pmd.a().d() != null) {
            if (v.e(pmd.a().d().a("tblive", "enableLiveRoomWarmOpen", "true"))) {
                N = an() ? 1 : 0;
            } else {
                N = 0;
            }
        }
        return N == 1;
    }

    public static boolean an() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aba9b238", new Object[0])).booleanValue();
        }
        if (pmd.a().t() == null) {
            return false;
        }
        return v.e(pmd.a().t().a("taolive", "EnableLiveRoomWarmOpenAB", "enableEnableLiveRoomWarmOpenAB", "true"));
    }

    public static boolean bY() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ac369d42", new Object[0])).booleanValue();
        }
        if (pmd.a().d() == null) {
            return false;
        }
        return v.e(pmd.a().d().a("tblive", "enableAlimamaQzt", "true"));
    }

    public static boolean ap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("abc5e13a", new Object[0])).booleanValue();
        }
        if (pmd.a().d() == null) {
            return true;
        }
        return v.e(pmd.a().d().a("tblive", "initRecommendPopBugfix", "true"));
    }

    public static boolean dl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b0ac0d13", new Object[0])).booleanValue();
        }
        if (pmd.a().d() == null) {
            return true;
        }
        return v.e(pmd.a().d().a("tblive", "initStartLiveBizRequestFix", "true"));
    }

    public static boolean ce() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ae948fed", new Object[0])).booleanValue() : v.e(pmd.a().d().a("tblive", "enableLifecycleTrack", "true"));
    }

    public static boolean cK() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ad262cd3", new Object[0])).booleanValue();
        }
        if (pmd.a().d() == null) {
            return false;
        }
        return v.e(pmd.a().d().a("tblive", "enableSpecialLive", "true"));
    }

    public static boolean cL() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ad344454", new Object[0])).booleanValue();
        }
        if (pmd.a().d() == null) {
            return false;
        }
        return v.e(pmd.a().d().a("tblive", "enableSpecialLive4TimeMove", "true"));
    }

    public static boolean cm() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("af054bf5", new Object[0])).booleanValue();
        }
        if (R == -1 && pmd.a().d() != null) {
            R = v.e(pmd.a().d().a("tblive", "enableUpdwonSwitchEvent", "true")) ? 1 : 0;
        }
        return R == 1;
    }

    public static boolean cE() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("acd19fcd", new Object[0])).booleanValue();
        }
        if (U == -1 && pmd.a().d() != null) {
            U = v.e(pmd.a().d().a("tblive", "enableFixOriginUrl0597", "true")) ? 1 : 0;
        }
        return U == 1;
    }

    public static boolean cy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("afae6601", new Object[0])).booleanValue();
        }
        if (S == -1 && pmd.a().d() != null) {
            S = v.e(pmd.a().d().a("tblive", "enableNotPlayWhenStop", "true")) ? 1 : 0;
        }
        return S == 1;
    }

    public static boolean cF() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("acdfb74e", new Object[0])).booleanValue();
        }
        if (V == -1 && pmd.a().d() != null) {
            V = v.e(pmd.a().d().a("tblive", "enableReturnWhenRefreshDestroy", "true")) ? 1 : 0;
        }
        return V == 1;
    }

    public static boolean cz() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("afbc7d82", new Object[0])).booleanValue();
        }
        if (T == -1 && pmd.a().d() != null) {
            T = v.e(pmd.a().d().a("tblive", "enableLeftRightSwitchEvent", "true")) ? 1 : 0;
        }
        return T == 1;
    }

    public static boolean cG() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("acedcecf", new Object[0])).booleanValue() : v.e(pmd.a().d().a("tblive", "enableUpDownSwitchMonitor", "true"));
    }

    public static boolean cM() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ad425bd5", new Object[0])).booleanValue() : v.e(pmd.a().d().a("tblive", "enableOpenGetOriginUrl", "true"));
    }

    public static boolean cI() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ad09fdd1", new Object[0])).booleanValue() : v.e(pmd.a().d().a("tblive", "enableLandscapeInputFrameFix", "true"));
    }

    public static boolean cN() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ad507356", new Object[0])).booleanValue() : v.e(pmd.a().d().a("goodlist", "enableGoodsTakeOpt", "true"));
    }

    public static boolean cP() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ad6ca258", new Object[0])).booleanValue() : v.e(pmd.a().d().b("tblive", "enablePreLoadVideoSimpleData", "true")) && v.e(pmd.a().t().b("taolive", "enablePreStartSimpleRequestDetailNew", "enablePreSimpleVideo", "true"));
    }

    public static boolean cQ() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ad7ab9d9", new Object[0])).booleanValue() : v.e(pmd.a().d().a("tblive", "enableH5ScrollStateChanged", "true"));
    }

    public static boolean cO() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ad5e8ad7", new Object[0])).booleanValue() : v.e(pmd.a().d().a("tblive", "enableLifeCycleTrackFix", "true"));
    }

    public static boolean cR() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ad88d15a", new Object[0])).booleanValue() : v.e(pmd.a().d().a("tblive", "enableNewReportEntrance", "true"));
    }

    public static boolean cS() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ad96e8db", new Object[0])).booleanValue();
        }
        if (pmd.a().t() == null) {
            return false;
        }
        return v.e(pmd.a().d().a("tblive", "enableSyncLiveSourcePre", "true"));
    }

    public static String cT() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8c5aaf48", new Object[0]) : pmd.a().d().a("tblive", "OpenDetailIconUrl", "https://img.alicdn.com/imgextra/i1/O1CN01VMlQ7m1vNKj6xUWCA_!!6000000006160-54-tps-64-64.apng");
    }

    public static boolean cU() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("adb317dd", new Object[0])).booleanValue() : v.e(pmd.a().d().a("tblive", "enableAPMCustomData", "true"));
    }

    public static boolean ao() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("abb7c9b9", new Object[0])).booleanValue() : v.e(pmd.a().d().a("tblive", "enableLiveIsdestroyStopCDNPlay", "true"));
    }

    public static boolean cW() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("adcf46df", new Object[0])).booleanValue() : v.e(tfv.a("tblive", "defaultRefreshAllData", "true"));
    }

    public static boolean cX() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("addd5e60", new Object[0])).booleanValue();
        }
        if (pmd.a().t() == null) {
            return true;
        }
        return v.e(pmd.a().d().a("tblive", "enableEntryLiveRoomSmartLandingGoods", "true"));
    }

    public static boolean cY() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("adeb75e1", new Object[0])).booleanValue() : v.e(pmd.a().d().a("tblive", "enableLockFrameForbidden", "true"));
    }

    public static boolean dd() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b03b510b", new Object[0])).booleanValue() : v.e(pmd.a().d().a("tblive", "enableLockFrame", "true"));
    }

    public static boolean cZ() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("adf98d62", new Object[0])).booleanValue();
        }
        if (pmd.a().t() == null) {
            return true;
        }
        return v.e(pmd.a().d().a("tblive", "enableMoreClickFix", "true"));
    }

    public static boolean da() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b0110a88", new Object[0])).booleanValue() : v.e(pmd.a().d().b("tblive", "enableLiveRoomSmartLanding2", "true"));
    }

    public static boolean db() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b01f2209", new Object[0])).booleanValue() : v.e(pmd.a().d().a("tblive", "enableRefreshOfficialUrlList", "true"));
    }

    public static boolean dc() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b02d398a", new Object[0])).booleanValue() : v.e(pmd.a().d().a("tblive", "enableRefreshImageUrl", "true"));
    }

    public static final int de() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b049687b", new Object[0])).intValue() : v.b(pmd.a().d().a("tblive", "scrollDownHidePxToHideBottomGuide", "20"));
    }

    public static final int df() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b0577ffc", new Object[0])).intValue() : v.b(pmd.a().d().a("tblive", "ScrollUpHidePxToHideBottomGuide", "1"));
    }

    public static boolean dg() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b065978e", new Object[0])).booleanValue() : v.e(pmd.a().d().b("tblive", "enableSmartLandingGetSwitchIndex", "false"));
    }

    public static boolean dh() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b073af0f", new Object[0])).booleanValue() : v.e(pmd.a().d().a("tblive", "enableFullScreenIconFix", "true"));
    }

    public static boolean di() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b081c690", new Object[0])).booleanValue() : v.e(pmd.a().d().b("tblive", "disableOnKeyDownWhenMoreLiveShow", "true"));
    }

    public static boolean dm() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b0ba2494", new Object[0])).booleanValue() : v.e(pmd.a().d().a("tblive", "enableAutoRecommend2", "true"));
    }

    public static boolean dj() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b08fde11", new Object[0])).booleanValue() : v.e(pmd.a().d().b("tblive", "disableRealControllerOnKeyDownWhenBackLive", "true"));
    }

    public static boolean dn() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b0c83c15", new Object[0])).booleanValue();
        }
        if (pmd.a().t() == null) {
            return true;
        }
        return v.e(pmd.a().d().a("tblive", "enableFirstLoginLiveCloseUIFix", "true"));
    }

    /* renamed from: do  reason: not valid java name */
    public static boolean m1383do() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b0d65396", new Object[0])).booleanValue() : v.e(pmd.a().d().a("tblive", "enableBottomSlideNewGuide", "true"));
    }

    public static boolean dp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b0e46b17", new Object[0])).booleanValue();
        }
        if (pmd.a().t() == null) {
            return true;
        }
        return v.e(pmd.a().d().a("tblive", "enableLiveNewErrorPage", "true"));
    }

    public static boolean dq() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b0f28298", new Object[0])).booleanValue();
        }
        if (pmd.a().t() == null) {
            return true;
        }
        return v.e(pmd.a().d().a("tblive", "enableRightTopCloseClickFix", "true"));
    }
}
