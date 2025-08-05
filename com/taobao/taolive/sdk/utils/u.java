package com.taobao.taolive.sdk.utils;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.widget.Toast;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.model.common.LiveItem;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import tb.kge;
import tb.nom;
import tb.pmd;
import tb.pmf;
import tb.pnj;
import tb.tfv;

/* loaded from: classes8.dex */
public class u {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static long A = 0;
    private static int B = 0;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f21971a = false;
    public static boolean b = false;
    public static boolean c = false;
    public static boolean d = false;
    private static Set<Integer> e = null;
    private static boolean f = false;
    private static boolean g = false;
    private static boolean h = false;
    private static boolean i = false;
    private static String j = null;
    private static boolean k = false;
    private static boolean l = false;
    private static boolean m = false;
    private static boolean n = false;
    public static final String newKandian = "newKandian";
    public static final String newKandian_guakao_liyidian = "newKandian_guakao_liyidian";
    public static final String newKandian_guakao_liyidian_jiegouhua = "newKandian_guakao_liyidian_jiegouhua";
    private static boolean o = false;
    public static final String oldKandian = "oldKandian";
    private static boolean p;
    private static boolean q;
    private static boolean r;
    private static long s;
    private static long t;
    private static long u;
    private static int v;
    private static int w;
    private static int x;
    private static long y;
    private static int z;

    public static boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[0])).booleanValue();
        }
        return false;
    }

    public static boolean u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6864280", new Object[0])).booleanValue();
        }
        return true;
    }

    public static boolean aU() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("aa49669f", new Object[0])).booleanValue() : p.a("enableOpenWarmMock", false);
    }

    static {
        kge.a(35033641);
        B = -1;
        v = -1;
        w = -1;
        x = -1;
        y = -1L;
        z = -1;
        A = -1L;
    }

    public static int bb() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("acb570ba", new Object[0])).intValue();
        }
        if (!aU()) {
            return 0;
        }
        if (B == -1 && pmd.a().d() != null) {
            B = com.taobao.taolive.room.utils.v.b(pmd.a().d().a("tblive", "getWarmMockMode", "0"));
        }
        return B;
    }

    public static int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[0])).intValue() : com.taobao.taolive.room.utils.v.b(pmd.a().d().a("tblive", "fetchItemInterval", "5")) * 1000;
    }

    public static int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[0])).intValue() : com.taobao.taolive.room.utils.v.b(pmd.a().d().a("tblive", "cdnQueueSize", "100"));
    }

    public static String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[0]) : pmd.a().d().a("tblive", "fetchCdnMSG", "10015,10101");
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[0])).booleanValue() : com.taobao.taolive.room.utils.v.e(pmd.a().d().a("tblive", "enableTrackPmGoodItem", "true"));
    }

    public static String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[0]) : pmd.a().d().a("tblive", "commentCdnUrl", "https://alive-interact.alicdn.com/comment/barrage/");
    }

    public static boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[0])).booleanValue() : com.taobao.taolive.room.utils.v.e(pmd.a().d().a("tblive", "newCommentSecretary", "true"));
    }

    public static boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[0])).booleanValue();
        }
        try {
            if (com.taobao.taolive.room.utils.v.e(pmd.a().d().a("TLLiveRoom", "enableSwitchPreload", "true"))) {
                int i2 = pmd.a().v().c().f32806a;
                int b2 = com.taobao.taolive.room.utils.v.b(pmd.a().d().a("TLLiveRoom", "supportDeviceOfSwitchPreload", "1"));
                if (b2 == 0) {
                    return true;
                }
                return b2 == 1 ? i2 == 0 || i2 == 1 : b2 == 2 && i2 == 0;
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return false;
    }

    public static boolean h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[0])).booleanValue() : com.taobao.taolive.room.utils.v.e(pmd.a().d().a("tblive", "EnableRegisterPM1", "false"));
    }

    public static boolean i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[0])).booleanValue() : com.taobao.taolive.room.utils.v.e(pmd.a().d().a("tblive", "small_window_switch", "true"));
    }

    public static int k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5f95765", new Object[0])).intValue();
        }
        return new Random(System.currentTimeMillis()).nextInt(com.taobao.taolive.room.utils.v.b(pmd.a().d().a("tblive", "SwitchStreamRandomInterval", "5")) * 1000);
    }

    public static boolean m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6158678", new Object[0])).booleanValue() : com.taobao.taolive.room.utils.v.e(pmd.a().d().a("tblive", "needLiveDetailDegrade", "false"));
    }

    public static boolean n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6239df9", new Object[0])).booleanValue() : com.taobao.taolive.room.utils.v.e(pmd.a().d().a("tblive", "needOpenCDNRetry", "true"));
    }

    public static String o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b4719ea", new Object[0]) : pmd.a().d().a("tblive", "CDNDomainUrl", "http://live-spare.alicdn.com/mediaplatform/");
    }

    public static boolean p() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("63fccfb", new Object[0])).booleanValue() : com.taobao.taolive.room.utils.v.e(pmd.a().d().a("tblive", "trackPMsg", "true"));
    }

    public static boolean q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("64de47c", new Object[0])).booleanValue() : com.taobao.taolive.room.utils.v.e(pmd.a().d().a("tblive", "unregisterPowerDispatch", "true"));
    }

    public static boolean r() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("65bfbfd", new Object[0])).booleanValue() : com.taobao.taolive.room.utils.v.e(pmd.a().d().a("tblive", "fetchCdnItem", "true"));
    }

    public static boolean s() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("66a137e", new Object[0])).booleanValue() : com.taobao.taolive.room.utils.v.e(pmd.a().d().a("tblive", "fetchCdnMSG", "true"));
    }

    public static boolean t() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6782aff", new Object[0])).booleanValue() : com.taobao.taolive.room.utils.v.e(pmd.a().d().a("tblive", "miniLiveShouldSubPMMsg", "true"));
    }

    public static boolean v() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6945a01", new Object[0])).booleanValue() : pmd.a().d() != null && com.taobao.taolive.room.utils.v.e(pmd.a().d().a("tblive", "defaultEnableBackgroundPlay", "true"));
    }

    public static boolean y() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6bea084", new Object[0])).booleanValue() : com.taobao.taolive.room.utils.v.e(pmd.a().d().a("tblive", "enableChatRoom", "true"));
    }

    public static boolean z() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6ccb805", new Object[0])).booleanValue() : com.taobao.taolive.room.utils.v.e(pmd.a().d().a("tblive", "enablePMEXTParams", "true"));
    }

    public static boolean A() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3a97c4c", new Object[0])).booleanValue() : com.taobao.taolive.room.utils.v.e(pmd.a().d().a("tblive", "enableSendUserAtmosphere2", "false"));
    }

    public static Set<Integer> B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("b8759bf8", new Object[0]);
        }
        if (e == null) {
            e = new HashSet();
            for (String str : pmd.a().d().a("tblive", "enableSendUserAtmosphereMap", "10010;10055;10031;10033;10058").split(";")) {
                e.add(Integer.valueOf(str));
            }
        }
        return e;
    }

    public static boolean C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3c5ab4e", new Object[0])).booleanValue();
        }
        String a2 = pmd.a().d().a("tblive", "ARTPDeviceBlackist", "");
        if (TextUtils.isEmpty(a2)) {
            return false;
        }
        String str = Build.MODEL;
        String[] split = a2.split(";");
        if (split != null && split.length > 0 && !TextUtils.isEmpty(str)) {
            for (String str2 : split) {
                if (!TextUtils.isEmpty(str2) && str.equalsIgnoreCase(str2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3d3c2cf", new Object[0])).booleanValue();
        }
        boolean e2 = com.taobao.taolive.room.utils.v.e(pmd.a().d().a("tblive", "TBLIVE_ORANGE_ARTP_Enable_NewV2", "false"));
        if (e2 && C()) {
            return false;
        }
        return e2;
    }

    public static boolean E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3e1da50", new Object[0])).booleanValue();
        }
        if (b.d(pmd.a().u().c()) && !TextUtils.isEmpty(b.a("enableBfrtc"))) {
            return true;
        }
        boolean d2 = l.d(pmd.a().d().a("tblive", "TBLIVE_ORANGE_BFRTC_Enable_V1", "false"));
        if (d2 && aS()) {
            return false;
        }
        return d2;
    }

    private static boolean aS() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aa2d379d", new Object[0])).booleanValue();
        }
        String a2 = pmd.a().d().a("tblive", "BFRTCDeviceBlackist", "");
        if (TextUtils.isEmpty(a2)) {
            return false;
        }
        String str = Build.MODEL;
        String[] split = a2.split(";");
        if (split != null && split.length > 0 && !TextUtils.isEmpty(str)) {
            for (String str2 : split) {
                if (!TextUtils.isEmpty(str2) && str.equalsIgnoreCase(str2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3eff1d1", new Object[0])).booleanValue();
        }
        if (b.d(pmd.a().u().c()) && !TextUtils.isEmpty(b.a("enableRtcLive"))) {
            return true;
        }
        boolean e2 = com.taobao.taolive.room.utils.v.e(pmd.a().d().a("tblive", "TBLIVE_ORANGE_RTCLIVE_Enable_V3", "true"));
        if (e2 && aT()) {
            return false;
        }
        return e2;
    }

    private static boolean aT() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aa3b4f1e", new Object[0])).booleanValue();
        }
        String a2 = pmd.a().d().a("tblive", "RTCLIVEDeviceBlackist", "");
        if (TextUtils.isEmpty(a2)) {
            return false;
        }
        String str = Build.MODEL;
        String[] split = a2.split(";");
        if (split != null && split.length > 0 && !TextUtils.isEmpty(str)) {
            for (String str2 : split) {
                if (!TextUtils.isEmpty(str2) && str.equalsIgnoreCase(str2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean G() {
        IpChange ipChange = $ipChange;
        boolean z2 = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fe0952", new Object[0])).booleanValue();
        }
        if (!g) {
            if (Build.VERSION.SDK_INT >= 21 && com.taobao.taolive.room.utils.v.e(pmd.a().d().a("tblive", "enableStickerChat", "true"))) {
                z2 = true;
            }
            f = z2;
            g = true;
        }
        return f;
    }

    public static boolean H() {
        IpChange ipChange = $ipChange;
        boolean z2 = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("40c20d3", new Object[0])).booleanValue();
        }
        if (!i) {
            if (Build.VERSION.SDK_INT >= 21 && com.taobao.taolive.room.utils.v.e(pmd.a().d().a("tblive", "enableFansLight", "true"))) {
                z2 = true;
            }
            h = z2;
            i = true;
        }
        return h;
    }

    public static boolean I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("41a3854", new Object[0])).booleanValue();
        }
        if (!com.taobao.taolive.room.utils.v.e(pmd.a().d().a("tblive", "enableCommentUseLMSDK2", "true"))) {
            return false;
        }
        return com.taobao.taolive.room.utils.v.e(pmd.a().t().a("taolive", "enableCommentUseLMSDK", "enable", "true"));
    }

    public static long J() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4284fc5", new Object[0])).longValue() : com.taobao.taolive.room.utils.v.c(pmd.a().d().a("tblive", "checkFloatWindowPermissonInterval", "360"));
    }

    public static boolean K() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4366756", new Object[0])).booleanValue() : com.taobao.taolive.room.utils.v.e(pmd.a().d().a("tblive", "needHeartFandom", "true"));
    }

    public static boolean a(LiveItem liveItem) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f1232887", new Object[]{liveItem})).booleanValue() : (liveItem == null || liveItem.extendVal == null || TextUtils.isEmpty(liveItem.extendVal.timeMovingPlayInfo) || ((LiveItem.TimeMovingPlayInfo) JSONObject.parseObject(liveItem.extendVal.timeMovingPlayInfo, LiveItem.TimeMovingPlayInfo.class)) == null) ? false : true;
    }

    public static long L() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4447ec7", new Object[0])).longValue() : com.taobao.taolive.room.utils.v.c(pmd.a().d().a("tblive", "enableCommentReceiveUT", "0"));
    }

    public static void M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4529654", new Object[0]);
            return;
        }
        pmf t2 = pmd.a().t();
        if (t2 == null) {
            return;
        }
        j = t2.a("taolive", "TimeShiftFlattenAB", "ABType", oldKandian);
        d = com.taobao.taolive.room.utils.v.e(t2.a("taolive", "TimeShiftFlattenAB", "UseOldPlayer", "false"));
    }

    public static int N() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("460adc8", new Object[0])).intValue() : com.taobao.taolive.room.utils.v.b(pmd.a().d().a("tblive", "chatMessageBufferSize", "100"));
    }

    public static boolean O() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("46ec55a", new Object[0])).booleanValue() : com.taobao.taolive.room.utils.v.e(pmd.a().d().a("tblive", "deleteTBTVRoomType13", "true"));
    }

    public static boolean P() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("47cdcdb", new Object[0])).booleanValue() : com.taobao.taolive.room.utils.v.e(pmd.a().d().a("tblive", "enableMoreLiveRightFrame", "true"));
    }

    public static boolean Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("48af45c", new Object[0])).booleanValue();
        }
        if (P()) {
            return com.taobao.taolive.room.utils.v.e(pmd.a().d().a("tblive", "moreLiveEntryEnable", "true"));
        }
        return false;
    }

    public static String R() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ce20f5e7", new Object[0]) : pmd.a().d().a("tblive", "ShopEmbedLiveSource", "shop_card2021");
    }

    public static boolean S() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4a7235e", new Object[0])).booleanValue() : com.taobao.taolive.room.utils.v.e(pmd.a().d().a("tblive", "enableSlidingClosePage", "false"));
    }

    public static String V() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e837e063", new Object[0]) : pmd.a().d().a("tblive", "BlackListRoomType", "[67108864,517,4096]");
    }

    public static boolean W() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4df8162", new Object[0])).booleanValue() : com.taobao.taolive.room.utils.v.e(pmd.a().d().a("tblive", "enableDoubleClickFav2", "true"));
    }

    public static boolean X() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4ed98e3", new Object[0])).booleanValue() : com.taobao.taolive.room.utils.v.e(pmd.a().d().a("tblive", "enableLiveRoomZoomFunc2", "true"));
    }

    public static boolean Y() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4fbb064", new Object[0])).booleanValue() : com.taobao.taolive.room.utils.v.e(pmd.a().d().a("tblive", "displayMessageCard", "true"));
    }

    public static boolean Z() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("509c7e5", new Object[0])).booleanValue() : com.taobao.taolive.room.utils.v.e(pmd.a().d().a("tblive", "isPopLayerReport", "false"));
    }

    public static boolean ab() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab00982c", new Object[0])).booleanValue() : com.taobao.taolive.room.utils.v.e(pmd.a().d().a("tblive", "PerformanceLiveRoomStart", "true"));
    }

    public static boolean an() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("aba9b238", new Object[0])).booleanValue() : com.taobao.taolive.room.utils.v.e(pmd.a().d().a("tblive", "enableUpDownSwipeTrack", "true"));
    }

    public static boolean ao() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("abb7c9b9", new Object[0])).booleanValue() : com.taobao.taolive.room.utils.v.e(pmd.a().d().a("tblive", "enableTBLivePlayerErrorCodeReport", nom.VALUE_YES));
    }

    public static boolean ac() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab0eafad", new Object[0])).booleanValue() : com.taobao.taolive.room.utils.v.e(pmd.a().d().a("tblive", "EnableBlur", "true"));
    }

    public static boolean ad() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab1cc72e", new Object[0])).booleanValue() : com.taobao.taolive.room.utils.v.e(pmd.a().d().a("tblive", "TBLiveDisableChangeLandscapeBtn", "false"));
    }

    public static boolean ae() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab2adeaf", new Object[0])).booleanValue() : com.taobao.taolive.room.utils.v.e(pmd.a().d().a("tblive", "showNewBrandLive", "true"));
    }

    public static boolean af() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab38f630", new Object[0])).booleanValue() : com.taobao.taolive.room.utils.v.e(pmd.a().d().a("tblive", "EnablePlayRate", "true"));
    }

    public static boolean ag() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab470db1", new Object[0])).booleanValue() : com.taobao.taolive.room.utils.v.e(pmd.a().d().a("tblive", "cleanScreenOptimize", "false"));
    }

    public static int ah() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ab552521", new Object[0])).intValue() : com.taobao.taolive.room.utils.v.b(pmd.a().d().a("tblive", "slidingValue", "200"));
    }

    public static boolean ai() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab633cb3", new Object[0])).booleanValue() : com.taobao.taolive.room.utils.v.e(pmd.a().d().a("tblive", "enableNewSpm4Shop", "true"));
    }

    public static boolean aj() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab715434", new Object[0])).booleanValue() : com.taobao.taolive.room.utils.v.e(pmd.a().d().a("tblive", "enableUtparamUrl", "true"));
    }

    public static boolean ak() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab7f6bb5", new Object[0])).booleanValue();
        }
        if (!com.taobao.taolive.room.utils.v.e(pmd.a().d().a("tblive", "enableUpdateNextPageRealProperties4Detail", "true"))) {
            return false;
        }
        return al();
    }

    public static boolean al() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab8d8336", new Object[0])).booleanValue();
        }
        if (pmd.a().t() == null) {
            return false;
        }
        return com.taobao.taolive.room.utils.v.e(pmd.a().t().a("taolive", "enableUpdateNextPageRealProperties4Detail", "enable", "true"));
    }

    public static boolean am() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab9b9ab7", new Object[0])).booleanValue() : com.taobao.taolive.room.utils.v.e(pmd.a().d().a("tblive", "enableUpdateNextPageClickId", "false"));
    }

    public static String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{str, str2}) : pmd.a().d().a("tblive", str, str2);
    }

    public static boolean aq() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("abd3f8bb", new Object[0])).booleanValue() : com.taobao.taolive.room.utils.v.e(pmd.a().d().a("tblive", "PlaybackRequestMessInfo", "true"));
    }

    public static boolean ar() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("abe2103c", new Object[0])).booleanValue() : com.taobao.taolive.room.utils.v.e(pmd.a().d().a("tblive", "goodListAnchorEnabled", "true"));
    }

    public static String at() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c8aed0a6", new Object[0]) : pmd.a().d().a("tblive", "liveShareTips", "");
    }

    public static int au() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ac0c56ae", new Object[0])).intValue() : com.taobao.taolive.room.utils.v.b(pmd.a().d().a("tblive", "likeAtmosThreshold", "10"));
    }

    public static boolean av() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ac1a6e40", new Object[0])).booleanValue();
        }
        if (pmd.a().d() == null) {
            return true;
        }
        return com.taobao.taolive.room.utils.v.e(pmd.a().d().a("tblive", "enableShopCardPMunified", "true"));
    }

    public static String aw() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5c400083", new Object[0]) : pmd.a().d().a("tblive", "needRecommendDetailServerApi", "mtop.tblive.live.recommend.home");
    }

    public static boolean ax() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ac369d42", new Object[0])).booleanValue();
        }
        long j2 = 300000;
        if (pmd.a().d() != null) {
            j2 = com.taobao.taolive.room.utils.v.c(pmd.a().d().a("tblive", "enableAskSwitchStreamLimit", "300000"));
        }
        if (System.currentTimeMillis() - s <= j2) {
            return false;
        }
        s = System.currentTimeMillis();
        return true;
    }

    public static boolean ay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ac44b4c3", new Object[0])).booleanValue();
        }
        long j2 = 60000;
        if (pmd.a().d() != null) {
            j2 = com.taobao.taolive.room.utils.v.c(pmd.a().d().a("tblive", "enableAutoSwitchStreamLimit", "60000"));
        }
        if (System.currentTimeMillis() - t <= j2) {
            return false;
        }
        t = System.currentTimeMillis();
        return true;
    }

    public static boolean az() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ac52cc44", new Object[0])).booleanValue();
        }
        if (pmd.a().d() == null) {
            return false;
        }
        return com.taobao.taolive.room.utils.v.e(pmd.a().d().a("tblive", "enableOpenStreamSwitch", "true"));
    }

    public static boolean aA() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a92f908b", new Object[0])).booleanValue();
        }
        long j2 = 86400000;
        if (pmd.a().d() != null) {
            j2 = com.taobao.taolive.room.utils.v.c(pmd.a().d().a("tblive", "enableShowQualitySwitchTipsLimit", "86400000"));
        }
        if (System.currentTimeMillis() - u <= j2) {
            return false;
        }
        u = System.currentTimeMillis();
        return true;
    }

    public static long aB() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a93da7fc", new Object[0])).longValue();
        }
        if (pmd.a().d() == null) {
            return 10000L;
        }
        return com.taobao.taolive.room.utils.v.c(pmd.a().d().a("tblive", "getStreamSwitchDurationMs", "10000"));
    }

    public static boolean aC() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a94bbf8d", new Object[0])).booleanValue();
        }
        if (pmd.a().d() == null) {
            return false;
        }
        return com.taobao.taolive.room.utils.v.e(pmd.a().d().a("tblive", "enableTrackQualitySwitch", "true"));
    }

    public static boolean aD() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a959d70e", new Object[0])).booleanValue();
        }
        if (!k && pmd.a() != null && pmd.a().d() != null) {
            l = com.taobao.taolive.room.utils.v.e(pmd.a().d().a("tblive", "enableLiveAPMMonitor2", "true"));
            k = true;
        }
        pnj m2 = pmd.a().m();
        m2.b("TaoLiveConfig", "sIsEnableAPMMonitor2:" + l);
        return l;
    }

    public static boolean aE() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a967ee8f", new Object[0])).booleanValue();
        }
        if (!m) {
            n = com.taobao.taolive.room.utils.v.e(pmd.a().d().a("tblive", "enablePerformanceData", "true"));
            m = true;
        }
        pnj m2 = pmd.a().m();
        m2.b("TaoLiveConfig", "sIsEnableAPMMonitor:" + l);
        return n;
    }

    public static boolean aF() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9760610", new Object[0])).booleanValue();
        }
        if (!o) {
            p = com.taobao.taolive.room.utils.v.e(pmd.a().d().a("tblive", "enableOptimizeLiveMonitor", "true"));
            o = true;
        }
        pnj m2 = pmd.a().m();
        m2.b("TaoLiveConfig", "enableOptimizeLiveMonitor:" + p);
        return p;
    }

    public static boolean aG() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9841d91", new Object[0])).booleanValue();
        }
        if (q) {
            pnj m2 = pmd.a().m();
            m2.b("TaoLiveConfig", "has read enableDetailRequestPre:" + r);
            return r;
        }
        q = true;
        if (com.taobao.taolive.room.utils.v.e(pmd.a().d().a("tblive", "enableDetailRequestPre2", "true")) && pmd.a().t() != null) {
            q = true;
            boolean e2 = com.taobao.taolive.room.utils.v.e(pmd.a().t().a("taolive", "enableDetailRequestAhead", "enable", "true"));
            pnj m3 = pmd.a().m();
            m3.b("TaoLiveConfig", "enableOptFirstFrame: " + e2);
            r = e2;
            return e2;
        }
        pmd.a().m().b("TaoLiveConfig", "enableDetailRequestPre: false");
        return false;
    }

    public static boolean aH() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9923512", new Object[0])).booleanValue();
        }
        if (!com.taobao.taolive.room.utils.v.e(pmd.a().d().a("tblive", "componentDelayLoad", "true"))) {
            return false;
        }
        return com.taobao.taolive.room.utils.v.e(pmd.a().t().a("tblive", "componentDelayLoad", "enable", "true"));
    }

    public static boolean aI() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a9a04c93", new Object[0])).booleanValue() : com.taobao.taolive.room.utils.v.e(pmd.a().d().a("tblive", "enableFixFpsBug", "true"));
    }

    public static boolean aK() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9bc7b95", new Object[0])).booleanValue();
        }
        if (pmd.a() != null && pmd.a().d() != null) {
            return com.taobao.taolive.room.utils.v.e(pmd.a().d().a("tblive", "enableAdd150MsData", "true"));
        }
        return false;
    }

    public static boolean aL() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9ca9316", new Object[0])).booleanValue();
        }
        if (pmd.a() != null && pmd.a().d() != null) {
            return com.taobao.taolive.room.utils.v.e(pmd.a().d().a("tblive", "enableUploadOtherData", "true"));
        }
        return false;
    }

    public static long aM() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a9d8aa87", new Object[0])).longValue();
        }
        if (pmd.a() != null && pmd.a().d() != null) {
            return com.taobao.taolive.room.utils.v.c(pmd.a().d().a("tblive", "liveFrameT1Number", "100"));
        }
        return 100L;
    }

    public static long aN() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a9e6c208", new Object[0])).longValue();
        }
        if (pmd.a() != null && pmd.a().d() != null) {
            return com.taobao.taolive.room.utils.v.c(pmd.a().d().a("tblive", "liveFrameT2Number", "150"));
        }
        return 150L;
    }

    public static boolean aP() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aa02f11a", new Object[0])).booleanValue();
        }
        if (pmd.a() != null && pmd.a().d() != null) {
            return com.taobao.taolive.room.utils.v.e(pmd.a().d().a("tblive", "enableOfficeLive", "false"));
        }
        return false;
    }

    public static List<String> aJ() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("58e0cc37", new Object[0]);
        }
        if (pmd.a() == null || pmd.a().d() == null) {
            return null;
        }
        String a2 = pmd.a().d().a("tblive", "eventCenterWhitelist", "TaoLiveController2,TaoLiveDXHomePage");
        if (TextUtils.isEmpty(a2)) {
            return null;
        }
        return Arrays.asList(a2.split(","));
    }

    public static boolean aO() {
        boolean z2;
        boolean z3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9f4d999", new Object[0])).booleanValue();
        }
        if (v == -1) {
            if (pmd.a() == null || pmd.a().d() == null) {
                z2 = false;
                z3 = true;
            } else {
                z2 = com.taobao.taolive.room.utils.v.e(pmd.a().d().a("tblive", "enableEventCenterOpt", "false"));
                z3 = com.taobao.taolive.room.utils.v.e(pmd.a().t().a("tblive", "enableEventCenterOpt", "enable", "true"));
            }
            if (!z2 && z3) {
                v = 1;
            } else {
                v = 0;
            }
            if (pmd.a() != null && pmd.a().u() != null && pmd.a().u().c() != null && pmd.a().u().c().getApplicationContext() != null) {
                Context applicationContext = pmd.a().u().c().getApplicationContext();
                if (b.d(applicationContext)) {
                    if (v == 1) {
                        Toast.makeText(applicationContext, "命中EventCenter多实例", 1);
                        q.b("FrameContext", "命中EventCenter多实例");
                    } else {
                        Toast.makeText(applicationContext, "未命中EventCenter多实例", 1);
                        q.b("FrameContext", "未命中EventCenter多实例");
                    }
                }
            }
        }
        return v == 1;
    }

    public static boolean aQ() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aa11089b", new Object[0])).booleanValue();
        }
        if (pmd.a() != null && pmd.a().d() != null) {
            return com.taobao.taolive.room.utils.v.e(pmd.a().d().a("tblive", "enableOfficialLiveSubscribeAndHeartBeat", "true"));
        }
        return true;
    }

    public static boolean aW() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aa6595a1", new Object[0])).booleanValue();
        }
        if (x == -1) {
            boolean e2 = com.taobao.taolive.room.utils.v.e(pmd.a().d().a("tblive", "enableLiveDetailMessInfoMultiCaseOpt", "true"));
            boolean e3 = (pmd.a() == null || pmd.a().d() == null) ? true : com.taobao.taolive.room.utils.v.e(pmd.a().t().a("tblive", "enableLiveDetailMessInfoMultiCaseOpt", "enable", "true"));
            if (e2 && e3) {
                x = 1;
            } else {
                x = 0;
            }
            if (pmd.a() != null && pmd.a().u() != null && pmd.a().u().c() != null && pmd.a().u().c().getApplicationContext() != null) {
                Context applicationContext = pmd.a().u().c().getApplicationContext();
                if (b.d(applicationContext)) {
                    if (x == 1) {
                        Toast.makeText(applicationContext, "命中表情多实例", 1);
                        q.b("FrameContext", "命中直播间额外接口多实例");
                    } else {
                        Toast.makeText(applicationContext, "未命中表情多实例", 1);
                        q.b("FrameContext", "未命中直播间额外接口多实例");
                    }
                }
            }
        }
        return x == 1;
    }

    public static boolean aR() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aa1f201c", new Object[0])).booleanValue();
        }
        if (pmd.a() != null && pmd.a().d() != null) {
            return com.taobao.taolive.room.utils.v.e(pmd.a().d().a("tblive", "enableProjectScreen", "true"));
        }
        return true;
    }

    public static boolean l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[0])).booleanValue() : com.taobao.taolive.room.utils.v.e(pmd.a().d().a("tblive", "enableNewFromShop2FCheck", "true"));
    }

    public static String aV() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("502f204", new Object[0]) : pmd.a().d().a("tblive", "interactiveParamsKey", "liveTest1,LiveTest2");
    }

    public static long aX() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("aa73ad12", new Object[0])).longValue();
        }
        if (y == -1) {
            y = com.taobao.taolive.room.utils.v.c(pmd.a().d().a("tblive", "getEnterAnimationDelayTimeMs", "500"));
        }
        return y;
    }

    public static boolean T() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4b53adf", new Object[0])).booleanValue();
        }
        if (z == -1 && pmd.a().d() != null) {
            z = com.taobao.taolive.room.utils.v.e(pmd.a().d().a("tblive", "enableIndependentLiveMuteSwitch", "true")) ? 1 : 0;
        }
        return z == 1;
    }

    public static long U() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4c35250", new Object[0])).longValue();
        }
        if (A == -1) {
            A = com.taobao.taolive.room.utils.v.c(pmd.a().d().a("tblive", "getStrongMuteMarkLimit", "43200"));
        }
        return A;
    }

    public static boolean ap() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("abc5e13a", new Object[0])).booleanValue() : as() && com.taobao.taolive.room.utils.v.e(pmd.a().d().a("tblive", "enableAsyncTaskSwitch", "true"));
    }

    public static boolean as() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("abf027bd", new Object[0])).booleanValue();
        }
        boolean e2 = pmd.a().d() != null ? com.taobao.taolive.room.utils.v.e(pmd.a().d().a("tblive", "enableTaoliveUpDownSwitchOpt", "true")) : false;
        boolean e3 = pmd.a().t() != null ? com.taobao.taolive.room.utils.v.e(pmd.a().t().a("taolive", "enableTaoliveUpDownSwitchOptAB", "enableTaoliveUpDownSwitchOpt", "true")) : false;
        if (pmd.a().m() != null) {
            pnj m2 = pmd.a().m();
            m2.a("TaoliveUpDownSwitchOpt", "orangeSwitch:" + e2 + "enableTaoliveUpDownSwitchOptAB:" + e3);
        }
        return e2 && aY() && e3;
    }

    public static boolean aY() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aa81c4a3", new Object[0])).booleanValue();
        }
        return (pmd.a().d() != null ? com.taobao.taolive.room.utils.v.e(pmd.a().d().a("tblive", "wholeDeviceLevelSwitchOpt", "true")) : false) || com.taobao.taolive.room.utils.k.a() == 2;
    }

    public static boolean aZ() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("aa8fdc24", new Object[0])).booleanValue() : com.taobao.taolive.room.utils.v.e(pmd.a().d().a("tblive", "enableAlimamaQztGoodClick", "true"));
    }

    public static boolean ba() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("aca7594a", new Object[0])).booleanValue() : com.taobao.taolive.room.utils.v.e(tfv.a("tblive", "enableLiveIsAD", "true"));
    }

    public static boolean aa() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("aaf280ab", new Object[0])).booleanValue() : com.taobao.taolive.room.utils.v.e(tfv.a("tblive", "enableDuplicationCommentFix", "true"));
    }

    public static boolean bc() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("acc3884c", new Object[0])).booleanValue();
        }
        if (pmd.a().d() != null) {
            return com.taobao.taolive.room.utils.v.e(pmd.a().d().a("tblive", "enableH5ContainerScrollFix", "true"));
        }
        return true;
    }

    public static boolean w() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6a27182", new Object[0])).booleanValue() : com.taobao.taolive.room.utils.v.e(tfv.a("tblive", "enableFirstFrameOpt", "true"));
    }
}
