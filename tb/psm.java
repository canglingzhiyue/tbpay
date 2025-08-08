package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.taolive.room.utils.d;
import com.taobao.taolive.room.utils.v;
import com.taobao.taolive.sdk.utils.u;

/* loaded from: classes8.dex */
public class psm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static String f32865a;
    private static int b;

    static {
        kge.a(320473132);
        f32865a = null;
        b = -1;
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : v.e(OrangeConfig.getInstance().getConfig("tblive", "TBLiveReplaceItemUrlParam", "true"));
    }

    public static String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[0]) : OrangeConfig.getInstance().getConfig("tblive", "ShareWeexWidth", "420");
    }

    public static String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[0]) : OrangeConfig.getInstance().getConfig("tblive", "ShareWeexHeight", "520");
    }

    public static boolean B() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3b793cd", new Object[0])).booleanValue() : u.as() && v.e(OrangeConfig.getInstance().getConfig("tblive", "enabledFadeAnimationTime", "false"));
    }

    public static boolean k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[0])).booleanValue() : v.e(OrangeConfig.getInstance().getConfig("tblive", "isNewFollowEnable", "false"));
    }

    public static boolean l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[0])).booleanValue() : v.e(OrangeConfig.getInstance().getConfig("tblive", "enableH5EmbedLiveRoom", "false"));
    }

    public static long o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("631b56a", new Object[0])).longValue() : v.c(OrangeConfig.getInstance().getConfig("tblive", "cacheLimitSize", "300000000"));
    }

    public static boolean p() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("63fccfb", new Object[0])).booleanValue() : v.e(OrangeConfig.getInstance().getConfig("tblive", "checkControllerDestroy", "true"));
    }

    public static String q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("18528f28", new Object[0]) : OrangeConfig.getInstance().getConfig("tblive", "goodsDefaultCpsTcpInfo", "{\"taobao\":{\"businessScenceId4Activity\":\"61\",\"tcpBid\":\"19\",\"context\":{\"lightShopStoreId\":\"\"},\"businessScenceId\":\"59\"},\"tmall\":{\"businessScenceId4Activity\":\"61\",\"tcpBid\":\"19\",\"context\":{\"lightShopStoreId\":\"\"},\"businessScenceId\":\"59\"}}");
    }

    public static boolean r() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("65bfbfd", new Object[0])).booleanValue() : v.e(OrangeConfig.getInstance().getConfig("tblive", "checkGoodsDefaultCpsTcpInfo", "true"));
    }

    public static String s() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("255e0466", new Object[0]) : OrangeConfig.getInstance().getConfig("tblive", "needReplaceInsideUrls", "h5.m.taobao.com/awp/core/detail.htm");
    }

    public static boolean t() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6782aff", new Object[0])).booleanValue() : v.e(pmd.a().d().a("tblive", fho.KEY_FEATURE_ENABLE_INSIDE_DETAIL, "true"));
    }

    public static boolean u() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6864280", new Object[0])).booleanValue() : v.e(pmd.a().d().a("tblive", "enable_live_insidedetail", "true"));
    }

    public static boolean v() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6945a01", new Object[0])).booleanValue() : v.e(pmd.a().d().a("tblive", "enable_insidedetail_low", "true"));
    }

    public static boolean w() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6a27182", new Object[0])).booleanValue() : v.e(OrangeConfig.getInstance().getConfig("tblive", "enableNewBitmapLoadType", "true"));
    }

    public static boolean C() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3c5ab4e", new Object[0])).booleanValue() : v.e(OrangeConfig.getInstance().getConfig("tblive", "enableModifyNewtonsParams", "true"));
    }

    public static String D() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("72d0c135", new Object[0]) : OrangeConfig.getInstance().getConfig("tblive", "liveRoomExtraSaltParam", "581BEC0C930BF1AFEB40B4A08C8FB142");
    }

    public static boolean E() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3e1da50", new Object[0])).booleanValue() : v.e(OrangeConfig.getInstance().getConfig("tblive", "enableAddNewtonsEncryptionParams", "true"));
    }

    public static boolean F() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3eff1d1", new Object[0])).booleanValue() : v.e(OrangeConfig.getInstance().getConfig("tblive", "enableAppendNewtonsParams", "true"));
    }

    public static boolean x() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6b08903", new Object[0])).booleanValue() : v.e(OrangeConfig.getInstance().getConfig("tblive", "enableOfficialBusinessParams", "true"));
    }

    public static String y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4c806420", new Object[0]);
        }
        if (StringUtils.isEmpty(f32865a)) {
            f32865a = OrangeConfig.getInstance().getConfig("tblive", "liveShareDescriptionImage", "https://gw.alicdn.com/imgextra/i4/O1CN01znUC2I26JdBCZ2PIh_!!6000000007641-2-tps-384-88.png");
        }
        return f32865a;
    }

    public static boolean z() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6ccb805", new Object[0])).booleanValue() : v.e(OrangeConfig.getInstance().getConfig("tblive", "enablePadAdapter", "true"));
    }

    public static boolean n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6239df9", new Object[0])).booleanValue() : v.e(pmd.a().d().a("tblive", "enableHighlightTcp", "true"));
    }

    public static boolean A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3a97c4c", new Object[0])).booleanValue();
        }
        if (b == -1 && pmd.a().d() != null) {
            b = v.e(pmd.a().d().a("tblive", "enableUseNewPreloadMark", "true")) ? 1 : 0;
        }
        return b == 1;
    }

    public static boolean G() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3fe0952", new Object[0])).booleanValue() : v.e(pmd.a().d().a("tblive", "enableABTestWhiteList", "true")) || d.a();
    }

    public static boolean H() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("40c20d3", new Object[0])).booleanValue() : v.e(OrangeConfig.getInstance().getConfig("tblive", "enableOrangeMock", "true")) || d.a();
    }

    public static boolean I() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("41a3854", new Object[0])).booleanValue() : pmd.a().d() != null && v.e(pmd.a().d().a("tblive", "enableWidgetNativeApi", "true"));
    }

    public static String m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("fe3ba4ac", new Object[0]) : pmd.a().d().a("tblive", "tcpAddSabAtmosphereKeyList", "showPriority,isStressShow,reasonRightType,reasonSubRightType,sabItemLevel,smallCardItemType,realtimeBoostType,millionGroupBuy,tmcFlashDrop,selfFlashDrop,tmcFlashDrop_ordinary,tmcFlashDrop_Official,itemType");
    }

    public static String J() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("99f320ef", new Object[0]) : pmd.a().d().a("tblive", "bgStreamingLeakDelaySeconds", "10");
    }

    public static boolean K() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4366756", new Object[0])).booleanValue() : pmd.a().d() != null && v.e(pmd.a().d().a("tblive", "enableGlobalReportLive", "true"));
    }
}
