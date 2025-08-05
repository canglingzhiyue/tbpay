package tb;

import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.utils.k;
import com.taobao.taolive.room.utils.v;
import com.taobao.taolive.sdk.utils.u;
import com.taobao.taolive.sdk.utils.v;

/* loaded from: classes5.dex */
public class hgs {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Boolean f28638a;

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : v.e(pmd.a().d().a("tblive", "enableNewCleanScreen", "true"));
    }

    static {
        kge.a(-786788341);
        f28638a = null;
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue();
        }
        Boolean bool = f28638a;
        if (bool == null) {
            return v.b.a("tblive", "findViewBugFix", true);
        }
        return bool.booleanValue();
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue() : u.aq();
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[0])).booleanValue() : com.taobao.taolive.room.utils.v.e(pmd.a().d().a("tblive", "enableTaoLiveMultiBBLink2", "true"));
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[0])).booleanValue() : com.taobao.taolive.room.utils.v.e(pmd.a().d().a("tblive", "TBLiveBBPKModuleISAvailable", "true"));
    }

    public static boolean z() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6ccb805", new Object[0])).booleanValue() : com.taobao.taolive.room.utils.v.e(pmd.a().d().a("tblive", "enableLandscapePKLink", "true"));
    }

    public static boolean j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[0])).booleanValue() : com.taobao.taolive.room.utils.v.e(pmd.a().d().a("tblive", "enableMultiLinkChatroom", "true"));
    }

    public static boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[0])).booleanValue() : com.taobao.taolive.room.utils.v.e(pmd.a().d().a("tblive", "showPrivateVip", "true"));
    }

    public static boolean g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[0])).booleanValue() : com.taobao.taolive.room.utils.v.e(pmd.a().d().a("tblive", "enableLiveRoomBackward", "true"));
    }

    public static boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[0])).booleanValue();
        }
        boolean e = com.taobao.taolive.room.utils.v.e(pmd.a().d().a("tblive", "enableLikeAtmos", "false"));
        if (e && pmd.a().t() != null) {
            e = com.taobao.taolive.room.utils.v.e(pmd.a().t().a("taolive", "enableLikeAtmos", "enable", "true"));
        }
        if (e) {
            e = k.a() != 2;
        }
        return e ? !com.taobao.taolive.room.utils.v.a(Build.MODEL, pmd.a().d().a("tblive", "likeAtmosBlacklist", "")) : e;
    }

    public static boolean i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[0])).booleanValue() : com.taobao.taolive.room.utils.v.e(pmd.a().d().a("tblive", "enableShowLeftTopBanner", "true"));
    }

    public static boolean k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[0])).booleanValue() : com.taobao.taolive.room.utils.v.e(pmd.a().d().a("tblive", "EnablePkAnim", "true"));
    }

    public static boolean l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[0])).booleanValue() : u.af();
    }

    public static boolean m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6158678", new Object[0])).booleanValue() : com.taobao.taolive.room.utils.v.e(pmd.a().d().a("tblive", "enableTaoLiveRank", "true"));
    }

    public static boolean o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("631b57a", new Object[0])).booleanValue() : com.taobao.taolive.room.utils.v.e(pmd.a().d().a("tblive", "enableBottomGuideSwitch", "true"));
    }

    public static float n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6239de5", new Object[0])).floatValue() : com.taobao.taolive.room.utils.v.d(pmd.a().d().a("tblive", "openQAWebViewLayerHeight", "0.6666"));
    }

    public static Long p() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Long) ipChange.ipc$dispatch("5c31bf3e", new Object[0]) : Long.valueOf(com.taobao.taolive.room.utils.v.c(pmd.a().d().a("tblive", "muteVisiableTime", "10")));
    }

    public static boolean q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("64de47c", new Object[0])).booleanValue();
        }
        if (pmd.a().d() == null) {
            return false;
        }
        return com.taobao.taolive.room.utils.v.e(pmd.a().d().a("tblive", "enableJumpGuangGuangPage", "true"));
    }

    public static boolean r() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("65bfbfd", new Object[0])).booleanValue() : com.taobao.taolive.room.utils.v.e(pmd.a().d().a("tblive", "enableShowClubFans", "true"));
    }

    public static String w() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3f74eee2", new Object[0]) : pmd.a().d().a("tblive", "fansClubPanelUrl", "https://pages-fast.m.taobao.com/wow/z/app/mtb/fans-group/home?x-ssr=true");
    }

    public static String s() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("255e0466", new Object[0]) : pmd.a().d().a("tblive", "fansClubAnimUrl", "https://gw.alicdn.com/imgextra/i2/O1CN01pYqKOI1XfbkJofo1k_!!6000000002951-54-tps-126-78.apng");
    }

    public static String t() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("abe3bf05", new Object[0]) : pmd.a().d().a("tblive", "FFCAnimUrl", "https://gw.alicdn.com/imgextra/i4/O1CN01AHxXSs1ISaFKKnoL1_!!6000000000892-54-tps-222-78.apng");
    }

    public static String u() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("326979a4", new Object[0]) : pmd.a().d().a("tblive", "unJoinFansClubFavoriteUrl", "https://gw.alicdn.com/imgextra/i4/O1CN01yGDUl11gFnySPNW6G_!!6000000004113-2-tps-114-78.png");
    }

    public static String v() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b8ef3443", new Object[0]) : pmd.a().d().a("tblive", "joinFansClubFavoriteUrl", "https://gw.alicdn.com/imgextra/i4/O1CN019iY2dR1Dcap4OCd2T_!!6000000000237-2-tps-114-78.png");
    }

    public static boolean x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6b08903", new Object[0])).booleanValue();
        }
        if (pmd.a().d() != null) {
            return com.taobao.taolive.room.utils.v.e(pmd.a().d().a("tblive", "enableAnchorInfoUIFix", "true"));
        }
        return false;
    }

    public static boolean y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6bea084", new Object[0])).booleanValue();
        }
        if (pmd.a().d() != null) {
            return com.taobao.taolive.room.utils.v.e(pmd.a().d().a("tblive", "enableChatIconFix", "true"));
        }
        return false;
    }
}
