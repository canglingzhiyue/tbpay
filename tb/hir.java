package tb;

import android.taobao.mulitenv.EnvironmentSwitcher;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.taolive.sdk.utils.l;
import com.taobao.taolive.sdk.utils.v;
import mtopsdk.mtop.domain.EnvModeEnum;

/* loaded from: classes6.dex */
public class hir {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TBLIVE_AB_GROUP = "taolive";
    public static final String TBLIVE_ORANGE_GL = "goodlist";

    static {
        kge.a(1187861970);
    }

    public static int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[0])).intValue();
        }
        try {
            l.a(pmd.a().d().a("tblive", "nativeShopVipTryTimes", "1"));
        } catch (Exception unused) {
        }
        return 1;
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : l.d(pmd.a().d().a("tblive", "enableSimpleRight", "true"));
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[0])).booleanValue() : l.d(pmd.a().d().a("tblive", "enableTimingUp", "true"));
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[0])).booleanValue() : l.d(pmd.a().d().a("tblive", "templateOutSet", "true"));
    }

    public static boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[0])).booleanValue() : l.d(pmd.a().d().a("tblive", "enablePreSale", "true"));
    }

    public static boolean g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[0])).booleanValue() : l.d(pmd.a().d().a("tblive", "enableTwoButton", "true"));
    }

    public static boolean j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[0])).booleanValue() : l.d(pmd.a().d().a("tblive", "enableAggregationComponent", "true"));
    }

    public static boolean k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[0])).booleanValue() : l.d(pmd.a().d().a("tblive", "goodLiveIdCheck", "true"));
    }

    public static boolean l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[0])).booleanValue() : l.d(pmd.a().d().a("tblive", "searchGoodsEntranceEnabled", "true"));
    }

    public static boolean m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6158678", new Object[0])).booleanValue() : l.d(pmd.a().d().a("tblive", "searchHistoryEnabled", "true"));
    }

    public static boolean n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6239df9", new Object[0])).booleanValue() : l.d(pmd.a().d().a("tblive", "couponUseServerToast", "true"));
    }

    public static String q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("18528f28", new Object[0]) : pmd.a().d().a("tblive", "showcaseTime", "");
    }

    private static String a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("457cf91a", new Object[]{str, str2, str3}) : pmd.a().t() != null ? pmd.a().t().a("taolive", str, str2, str3) : str3;
    }

    public static boolean a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("266fb8c", new Object[]{jSONObject})).booleanValue();
        }
        boolean d = l.d(pmd.a().d().a("tblive", "goodAutoUpdate", "true"));
        boolean z = jSONObject != null && jSONObject.getBooleanValue("useItemCacheExpire");
        his.a("GoodsListConfig", "enableListAutoUpdate | orange=" + d + "  serverValue=" + z);
        return d && z;
    }

    public static boolean s() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("66a137e", new Object[0])).booleanValue() : l.d(pmd.a().d().a("tblive", "enableGoodsNumberBrokenCompensate", "true"));
    }

    public static int t() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6782aee", new Object[0])).intValue() : l.a(pmd.a().d().a("tblive", "triggerClickDuration", "1000"), 1000);
    }

    public static int u() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("686426f", new Object[0])).intValue() : l.a(pmd.a().d().a("tblive", "triggerScrollDuration", "1000"), 1000);
    }

    public static int v() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("69459f0", new Object[0])).intValue() : l.a(pmd.a().d().a("tblive", "triggerMayClickMaxIndex", "1000"), 1000);
    }

    public static boolean x() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6b08903", new Object[0])).booleanValue() : l.d(pmd.a().d().a("goodlist", "showcaseAuctionExclude", "true"));
    }

    public static boolean y() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6bea084", new Object[0])).booleanValue() : l.d(pmd.a().d().a("goodlist", "enablePreheatButton", "true"));
    }

    public static boolean z() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6ccb805", new Object[0])).booleanValue() : l.d(pmd.a().d().a("goodlist", "enableSpeakingGoodsAfterShowcase", "true"));
    }

    public static boolean A() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3a97c4c", new Object[0])).booleanValue() : l.d(pmd.a().d().a("goodlist", "enableGLPcgRec", "true"));
    }

    public static boolean B() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3b793cd", new Object[0])).booleanValue() : l.d(pmd.a().d().a("tblive", "enableGoodsMultiTabContainerV2", "true"));
    }

    public static boolean D() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3d3c2cf", new Object[0])).booleanValue() : l.d(pmd.a().d().a("goodlist", "enableFirstDetailStash", "true"));
    }

    public static boolean E() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3e1da50", new Object[0])).booleanValue() : l.d(pmd.a().d().a("goodlist", "enablePcgShowCase", "true"));
    }

    public static boolean F() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3eff1d1", new Object[0])).booleanValue() : l.d(pmd.a().d().a("goodlist", "enablePcgRecCarouselShow", "true"));
    }

    public static boolean M() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4529658", new Object[0])).booleanValue() : v.b.a("goodlist", "enableShowGoodTopOperateView", true);
    }

    public static boolean U() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4c35260", new Object[0])).booleanValue() : v.b.a("goodlist", "enableRefreshTopOperateViewStatus", true);
    }

    public static boolean N() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("460add9", new Object[0])).booleanValue() : v.b.a("goodlist", "enableLandScopeShowGoodTopOperateView", true);
    }

    public static boolean i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[0])).booleanValue() : v.b.a("goodlist", "enableTryRequestTopOperate", true);
    }

    public static boolean h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[0])).booleanValue() : v.b.a("goodlist", "enableTryRequestCategory", true);
    }

    public static boolean w() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6a27182", new Object[0])).booleanValue() : v.b.a("goodlist", "enableAppearTryRequestRight", true);
    }

    public static boolean C() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3c5ab4e", new Object[0])).booleanValue() : v.b.a("goodlist", "enableAppearTryRequestGoodsList", true);
    }

    public static boolean R() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4990bdd", new Object[0])).booleanValue() : l.d(pmd.a().d().a("tblive", "enableHiglightInsideDetail1", "true"));
    }

    public static boolean S() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4a7235e", new Object[0])).booleanValue() : l.d(pmd.a().d().a("goodlist", "enableShowGoodsSearchItem", "true"));
    }

    public static String T() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("db2c6b25", new Object[0]);
        }
        if (Q()) {
            return P();
        }
        return pmd.a().d().a("goodlist", "goodsListSearchMoreURLPrefixNew", "https://h5.m.taobao.com/taolive/search.html?source=home&keyword=%s&type=word&tabType=item&searchSpm=a2141.28506510&spm=a2141.8001249&spmPre=a2141.8001249&search_entry=koudai");
    }

    public static String P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c11580a9", new Object[0]);
        }
        if (EnvironmentSwitcher.a() == EnvModeEnum.PREPARE.getEnvMode()) {
            return OrangeConfig.getInstance().getConfig("tblive", "H5SearchPreUrl", "https://pre-pages-fast.m.taobao.com/wow/z/app/mtb/live-search-pages/home?x-ssr=true&disableNav=YES");
        }
        return OrangeConfig.getInstance().getConfig("tblive", "H5SearchUrl", "https://pages-fast.m.taobao.com/wow/z/app/mtb/live-search-pages/home?x-ssr=true&forceThemis=true&disableNav=YES&disableProgress=true");
    }

    public static boolean Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("48af45c", new Object[0])).booleanValue();
        }
        if (!l.d(OrangeConfig.getInstance().getConfig("tblive", "enableH5Search1", "true"))) {
            return false;
        }
        return Y();
    }

    public static boolean Y() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4fbb064", new Object[0])).booleanValue() : l.d(a("enableH5Search1", "value", "false"));
    }

    public static int W() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4df8151", new Object[0])).intValue() : l.a(pmd.a().d().a("goodlist", "enableMultiGiftActivity", "1"), 1);
    }

    public static boolean r() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("65bfbfd", new Object[0])).booleanValue() : l.d(pmd.a().d().a("goodlist", "enableItemGroupTake", "true"));
    }

    public static boolean p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("63fccfb", new Object[0])).booleanValue();
        }
        if (v.b.a("goodlist", "supportClientDefaultCategoryIds", true)) {
            String a2 = a("supportClientDefaultCategoryIds", "enable", "false");
            his.b("GoodsListConfig", "supportClientDefaultCategoryIds | orange=true ab=" + a2);
            return l.a(a2, false);
        }
        his.b("GoodsListConfig", "supportClientDefaultCategoryIds | result=false");
        return false;
    }

    public static boolean I() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("41a3854", new Object[0])).booleanValue() : v.b.a("goodlist", "supportDefaultCategoryId", true);
    }

    public static long a(long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a8219750", new Object[]{new Long(j)})).longValue() : v.b.a("goodlist", "xinrenTabTimeLimit", j);
    }

    public static Boolean o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Boolean) ipChange.ipc$dispatch("6a309573", new Object[0]) : Boolean.valueOf(l.d(pmd.a().d().a("tblive", "enableNewHotAtmosphere", "true")));
    }

    public static String H() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8ce7abb1", new Object[0]) : pmd.a().d().a("tblive", "hotAtmosphereLottieUrl", "https://g.alicdn.com/ani-assets/4e567184a6ffee05bf46b0a79583a9ac/0.0.1/lottie.json");
    }

    public static String J() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("99f320ef", new Object[0]) : pmd.a().d().a("tblive", "lowAtmosphereBgUrl", "https://gw.alicdn.com/imgextra/i4/O1CN01FihN3c1lT9azsqg2W_!!6000000004819-54-tps-350-64.apng");
    }

    public static String K() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2078db8e", new Object[0]) : pmd.a().d().a("tblive", "lowAtmosphereIconUrl", "https://gw.alicdn.com/imgextra/i4/O1CN01qEjFgd1TEo6YAQWoD_!!6000000002351-2-tps-95-49.png");
    }

    public static String L() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a6fe962d", new Object[0]) : pmd.a().d().a("tblive", "highAtmosphereBgUrl", "https://gw.alicdn.com/imgextra/i1/O1CN01w7663f1N9s8uTgTYT_!!6000000001528-2-tps-280-160.png");
    }

    public static String O() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3a8fc60a", new Object[0]) : pmd.a().d().a("tblive", "highAtmosphereIconUrl", "https://gw.alicdn.com/imgextra/i4/O1CN0130TbN31tk7Bl63g4W_!!6000000005939-2-tps-198-114.png");
    }

    public static boolean G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fe0952", new Object[0])).booleanValue();
        }
        if (v.b.a("goodlist", "showGoodsItemCardQueryData", true)) {
            String a2 = a("showGoodsItemCardQueryDataV2", "enable", "false");
            his.b("GoodsListConfig", "showGoodsItemCardQueryData | orange=true ab=" + a2);
            return l.a(a2, false);
        }
        his.b("GoodsListConfig", "showGoodsItemCardQueryData | result=false");
        return false;
    }

    public static boolean X() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4ed98e3", new Object[0])).booleanValue();
        }
        return l.d(trg.a("taolive", "EnableKMPShowcase", "enable", "false")) && l.d(tfv.a("tblive", "enableKMPShowcase", "true")) && l.d(tfv.a("tblive", "enableKMPShowcase0918", "true"));
    }

    public static boolean Z() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("509c7e5", new Object[0])).booleanValue() : l.d(tfv.a("goodlist", "enableSabAtmosphereThreshold", "true"));
    }

    public static boolean aa() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("aaf280ab", new Object[0])).booleanValue() : v.b.a("goodlist", "enableRecCardShowWhenIdle", true);
    }

    public static boolean ab() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab00982c", new Object[0])).booleanValue() : v.b.a("taolive", "enableInterceptGoodsCardClick", true);
    }

    public static boolean ac() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab0eafad", new Object[0])).booleanValue() : v.b.a("taolive", "enableForbidGoodsCardAtmosphere", true);
    }

    public static String ad() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("605326b6", new Object[0]) : tfv.a("goodlist", "goodslistPromptAnimationUrls", "{\"normal\":\"https://gw.alicdn.com/imgextra/i4/O1CN01p9RQWd1VtEKTU8dQ4_!!6000000002710-54-tps-159-150.apng\",\"show\":\"https://gw.alicdn.com/imgextra/i4/O1CN01srX6dm1CjAvw0AspV_!!6000000000116-54-tps-159-150.apng\",\"hide\":\"https://gw.alicdn.com/imgextra/i3/O1CN01yHqQ3R1IXcdTm4LJx_!!6000000000903-54-tps-159-150.apng\"}");
    }

    public static int ae() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ab2ade9e", new Object[0])).intValue() : l.a(tfv.a("goodlist", "goodsIconAnimLoopInterval", "10"));
    }

    public static int af() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ab38f61f", new Object[0])).intValue() : l.a(tfv.a("goodlist", "goodsIconAnimDaysLimit", "7"));
    }

    public static int c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5d", new Object[0])).intValue() : l.a(tfv.a("goodlist", "zhuahongbaoDelay", "300"), 300);
    }

    public static String V() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e837e063", new Object[0]) : v.b.a("goodlist", "goodslistRedPacketToastInfo", "{\"leftIconImageViewUrl\": \"https://gw.alicdn.com/imgextra/i4/O1CN015pshdw1bMbobMIfOY_!!6000000003451-2-tps-108-114.png\",\"rightArrowImageViewUrl\":\"https://gw.alicdn.com/imgextra/i1/O1CN01WvKjy61h0410OPOAo_!!6000000004214-2-tps-42-38.png\",\"tieleText\":\"下滑找红包 最多3个\",\"showTime\": \"3\"}");
    }
}
