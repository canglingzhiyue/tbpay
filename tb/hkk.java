package tb;

import com.alipay.mobile.intelligentdecision.model.IDecisionResult;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.a;
import com.taobao.taolive.room.openarchitecture.opencompontent.ability.OpenAbilityCompontentTypeEnum;
import com.taobao.taolive.room.utils.v;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.utils.ad;
import org.android.agoo.common.AgooConstants;

/* loaded from: classes6.dex */
public class hkk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Boolean f28731a;
    private static Boolean b;
    private static String c;
    private static Boolean d;

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : v.e(pmd.a().d().a("goodlist", "enableHongbaoUrge", "true"));
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : v.e(pmd.a().d().a("tblive", "enableShowGiftWishBanner", "true"));
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue() : v.e(pmd.a().d().a("tblive", "enableShowRightBanner", "true"));
    }

    public static String m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("fe3ba4ac", new Object[0]) : pmd.a().d().a("tblive", "giftBannerShowPriorityConfig", "{\"giftWish\":\"100\",\"giftVote\":\"200\",\"giftGallery\":\"200\"}");
    }

    public static boolean n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6239df9", new Object[0])).booleanValue() : v.e(pmd.a().d().a("tblive", "enableGiftBannerShowPriorityConfig", "true"));
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[0])).booleanValue() : v.e(pmd.a().d().a("tblive", "enableShowGiftVoteBanner", "true"));
    }

    public static boolean F() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3eff1d1", new Object[0])).booleanValue() : v.e(pmd.a().d().a("tblive", "enableShowGiftGalleryBanner", "true"));
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[0])).booleanValue() : v.e(pmd.a().d().a("tblive", "enableShowRankLiveEntrance", "true"));
    }

    public static boolean g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[0])).booleanValue() : v.e(pmd.a().d().a("tblive", "enableImportantHighPriority", "true"));
    }

    public static String h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5d9eff91", new Object[0]) : pmd.a().d().a("tblive", "projectScreenHelpUrl", "https://web.m.taobao.com/app/mtb/screencast-specification/home");
    }

    public static boolean i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[0])).booleanValue() : v.e(pmd.a().d().a("tblive", "enableTaoLiveProjectionAllPlayBackup", "true"));
    }

    public static long k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5f95766", new Object[0])).longValue() : v.c(pmd.a().d().a("tblive", "TrafficCardFatigueTime", "1440"));
    }

    public static boolean j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[0])).booleanValue() : v.e(pmd.a().d().a("tblive", "enableAvatarNewEventCenter", "true"));
    }

    public static boolean l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[0])).booleanValue() : v.e(pmd.a().d().a("tblive", "enableFreeFlow", "true"));
    }

    public static boolean o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("631b57a", new Object[0])).booleanValue() : v.e(pmd.a().d().a("tblive", "enableOfficialLiveEntryV2", "true"));
    }

    public static String r() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9ed849c7", new Object[0]) : pmd.a().d().a("tblive", "avatarFooterIconUrl", "https://gw.alicdn.com/imgextra/i2/O1CN01EwzzbC1gPQIDJ8PSf_!!6000000004134-2-tps-16-26.png");
    }

    public static boolean p() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("63fccfb", new Object[0])).booleanValue() : v.e(pmd.a().d().a("tblive", "enableImportantEventGoodsRecommend", "true"));
    }

    public static long q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("64de46c", new Object[0])).longValue() : v.c(pmd.a().d().a("tblive", "taoliveGoodsRecommendPullInterval", "300"));
    }

    public static long s() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("66a136e", new Object[0])).longValue() : v.c(pmd.a().d().a("tblive", "taoliveGoodsRecommendDelayTime", "30"));
    }

    public static boolean a(VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ead9f969", new Object[]{videoInfo})).booleanValue() : (videoInfo == null || videoInfo.itemConfigInfo == null || videoInfo.itemConfigInfo.getBooleanValue("enableShowImportantEvent")) ? false : true;
    }

    public static long u() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6864270", new Object[0])).longValue() : v.c(pmd.a().d().a("tblive", "taoliveGoodsRecommendPushItemDelayTime", AgooConstants.ACK_PACK_ERROR));
    }

    public static long v() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("69459f1", new Object[0])).longValue() : v.c(pmd.a().d().a("tblive", "taoliveGoodsRecommendPushGroupCount", "3"));
    }

    public static boolean w() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6a27182", new Object[0])).booleanValue() : v.e(pmd.a().t().a("taolive", "enableImportantHiddenForLandscape", "enable", "true"));
    }

    public static boolean x() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6b08903", new Object[0])).booleanValue() : v.e(pmd.a().d().a("tblive", "enableImportantGoodRecommendFilter", "true"));
    }

    public static boolean y() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6bea084", new Object[0])).booleanValue() : v.e(pmd.a().d().a("tblive", "taoliveAiCopilotResp", "false"));
    }

    public static boolean z() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6ccb805", new Object[0])).booleanValue() : v.e(pmd.a().d().a("tblive", "enableShowCommentGiftEffect", "true"));
    }

    public static boolean A() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3a97c4c", new Object[0])).booleanValue() : v.e(pmd.a().t().a("taolive", "fusionComment1", "enabled", "true"));
    }

    public static boolean a(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bd977ce5", new Object[]{tBLiveDataModel})).booleanValue();
        }
        if (tBLiveDataModel != null && tBLiveDataModel.mVideoInfo != null && !"2".equals(tBLiveDataModel.mVideoInfo.roomStatus)) {
            return v.e(pmd.a().d().a("tblive", "enableCommentTopWelcome", "true"));
        }
        return false;
    }

    public static int C() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3c5ab3d", new Object[0])).intValue() : v.b(pmd.a().d().a("tblive", "commentTopWelcomeDuration", IDecisionResult.ENGINE_ERROR));
    }

    public static boolean B() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3b793cd", new Object[0])).booleanValue() : v.e(pmd.a().d().a("tblive", "officialLiveAccountViewEnhance", "true"));
    }

    public static boolean D() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3d3c2cf", new Object[0])).booleanValue() : v.e(pmd.a().d().a("tblive", "hideAliveWhenNewUserPanelShow", "true"));
    }

    public static boolean G() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3fe0952", new Object[0])).booleanValue() : v.e(pmd.a().d().a("tblive", "enableLiveItemPopViewAnimation", "true"));
    }

    public static boolean E() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3e1da50", new Object[0])).booleanValue() : v.e(pmd.a().d().a("tblive", "enableFollowSyncBugfix", "true"));
    }

    public static boolean I() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("41a3854", new Object[0])).booleanValue() : v.e(pmd.a().d().a("tblive", "enableNewAnchorPageCardStyle", "true"));
    }

    public static boolean J() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4284fd5", new Object[0])).booleanValue() : v.e(pmd.a().d().a("tblive", "enableReputationTagClickedCheck", "true"));
    }

    public static boolean K() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4366756", new Object[0])).booleanValue() : v.e(pmd.a().d().a("tblive", "enableAvatarRequestErrorFix", "true"));
    }

    public static boolean H() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("40c20d3", new Object[0])).booleanValue() : v.e(pmd.a().d().a("tblive", "enableToNewMsgMisplacedFix", "true"));
    }

    public static boolean L() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4447ed7", new Object[0])).booleanValue() : v.e(pmd.a().d().a("tblive", "enableLandscapeSeekBarSlideFix", "true"));
    }

    public static boolean N() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("460add9", new Object[0])).booleanValue() : v.e(pmd.a().d().a("tblive", "enablePopClickErrorFix", "true"));
    }

    public static boolean a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("18197561", new Object[]{aVar})).booleanValue() : (aVar == null || aVar.o() == null || aVar.o().abilityCompontent == null || !aVar.o().abilityCompontent.b(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_CustomizedToast)) ? false : true;
    }

    public static boolean O() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("46ec55a", new Object[0])).booleanValue() : v.e(pmd.a().d().a("tblive", "enableChatCommentCommonTLog", "true"));
    }

    public static boolean P() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("47cdcdb", new Object[0])).booleanValue() : v.e(pmd.a().d().a("tblive", "enableSabAtmosphere", "true"));
    }

    public static boolean b(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9c31b80", new Object[]{aVar})).booleanValue() : ad.a(aVar, OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_CustomizedSimpleLive) && hir.ac();
    }

    public static int Q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("48af44b", new Object[0])).intValue() : v.b(pmd.a().d().a("tblive", "sabAtmosphereMaxShowFrequency", "1"));
    }

    public static int as() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("abf027ac", new Object[0])).intValue() : v.b(pmd.a().d().a("tblive", "sabAtmosphereLimitTime", "10"));
    }

    public static boolean R() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4990bdd", new Object[0])).booleanValue();
        }
        if (f28731a == null) {
            if (pmd.a().d() != null && v.e(pmd.a().d().a("tblive", "enableChatHotSale", "false")) && pmd.a().t() != null && v.e(pmd.a().t().a("taolive", "EnableCommentHotSale", "enableCommentHotSale", "true"))) {
                z = true;
            }
            f28731a = Boolean.valueOf(z);
        }
        return f28731a.booleanValue();
    }

    public static boolean S() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4a7235e", new Object[0])).booleanValue();
        }
        if (b == null) {
            if (pmd.a().d() != null && v.e(pmd.a().d().a("tblive", "enableTBLiveComponentDelayShow", "true")) && pmd.a().t() != null && v.e(pmd.a().t().a("taolive", "enableTBLiveComponentDelayShow", "enable", "true"))) {
                z = true;
            }
            b = Boolean.valueOf(z);
        }
        return b.booleanValue();
    }

    public static boolean T() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4b53adf", new Object[0])).booleanValue() : v.e(pmd.a().d().a("tblive", "enableAddHotAtmosphereTcpTrace", "true"));
    }

    static {
        kge.a(255532773);
        c = "https://img.alicdn.com/imgextra/i3/O1CN01Dm6qQK1qIgdTWsuGp_!!6000000005473-2-tps-90-90.png";
    }

    public static String U() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("61b225c4", new Object[0]);
        }
        if (pmd.a().d() == null) {
            return c;
        }
        return pmd.a().d().a("tblive", "widgetIconUrl", c);
    }

    public static boolean V() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4d169e1", new Object[0])).booleanValue() : v.e(tfv.a("tblive", "enableWidgetOpt", "true")) && !phg.d().a();
    }

    public static int X() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4ed98d2", new Object[0])).intValue() : v.a(tfv.a("tblive", "widgetAnimDelayTime", "30"), 30);
    }

    public static int Y() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4fbb053", new Object[0])).intValue() : v.a(tfv.a("tblive", "widgetAnimMaxCount", "5"), 5);
    }

    public static boolean Z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("509c7e5", new Object[0])).booleanValue();
        }
        if (pmd.a().d() == null) {
            return true;
        }
        return v.e(tfv.a("tblive", "enableReadyRecommendFrame", "true"));
    }

    public static boolean af() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab38f630", new Object[0])).booleanValue();
        }
        if (d == null) {
            if (pmd.a().d() != null && v.e(pmd.a().d().a("tblive", "enableEntryLiveRoomSmartLanding", "true")) && pmd.a().t() != null && v.e(pmd.a().t().b("taolive", "LiveRoomSmartLanding", "enableEntrySmartLanding", "true"))) {
                z = true;
            }
            d = Boolean.valueOf(z);
        }
        return d.booleanValue();
    }

    public static boolean ag() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab470db1", new Object[0])).booleanValue() : v.e(tfv.a("tblive", "enableEntryLiveRoomSmartLandingGoods", "true"));
    }

    public static boolean aa() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aaf280ab", new Object[0])).booleanValue();
        }
        if (pmd.a().d() == null) {
            return true;
        }
        return v.e(tfv.a("tblive", "fixUploadCaseFeedList", "true"));
    }

    public static boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[0])).booleanValue() : v.e(tfv.a("tblive", "enableChatRequestLayoutLoopFix", "true"));
    }

    public static boolean W() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4df8162", new Object[0])).booleanValue() : v.e(tfv.a("tblive", "enableMonitorSizeChangeFix", "true"));
    }

    public static boolean ab() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab00982c", new Object[0])).booleanValue() : v.e(tfv.a("tblive", "enableNewUserZoneCard", "true"));
    }

    public static boolean ac() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab0eafad", new Object[0])).booleanValue() : v.e(tfv.a("tblive", "enable88VipEntrance", "true"));
    }

    public static boolean ad() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab1cc72e", new Object[0])).booleanValue() : pmd.a().d() != null && !phg.d().a() && v.e(pmd.a().d().a("tblive", "enableCleanScreenGuideNew", "false"));
    }

    public static int ae() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ab2ade9e", new Object[0])).intValue() : v.a(tfv.a("tblive", "cleanScreenGuideShowDelayTime", "60"), 60);
    }

    public static boolean ah() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab552532", new Object[0])).booleanValue() : v.e(tfv.a("tblive", "enableAvatarViewHeightFix", "true"));
    }

    public static boolean ai() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab633cb3", new Object[0])).booleanValue() : v.e(tfv.a("tblive", "enableLiveAvatarDestroy", "true"));
    }

    public static boolean aj() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab715434", new Object[0])).booleanValue() : v.e(tfv.a("tblive", "enableFollowFrameMemoryLeakFixNew", "true"));
    }

    public static boolean al() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab8d8336", new Object[0])).booleanValue() : v.e(tfv.a("tblive", "enableExplainGoodsBehaviorReport", "true"));
    }

    public static int am() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ab9b9aa6", new Object[0])).intValue() : v.b(tfv.a("tblive", "explainGoodsBehaviorListMaxSize", AgooConstants.ACK_PACK_ERROR));
    }

    public static boolean ak() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab7f6bb5", new Object[0])).booleanValue() : v.e(tfv.a("tblive", "enableOfficialAnchorInfoUIFix", "true"));
    }

    public static boolean an() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aba9b238", new Object[0])).booleanValue();
        }
        if (phg.d().a()) {
            return false;
        }
        if (pmd.a().d() == null) {
            return true;
        }
        return v.e(tfv.a("tblive", "enableAbsStateLeakFix", "true"));
    }

    public static boolean ao() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("abb7c9b9", new Object[0])).booleanValue();
        }
        if (phg.d().a()) {
            return false;
        }
        if (pmd.a().d() == null) {
            return true;
        }
        return v.e(tfv.a("tblive", "officialLiveSwitchCheckAtOnce", "true"));
    }

    public static String ap() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ae97e62a", new Object[0]) : pmd.a().d() != null ? tfv.a("tblive", "officialLiveSwitchTargetUrl", "http://h5.m.taobao.com/taolive/video.html?id=%s&livesource=guanfangtai&productType=live&ignoreSameLive=true&forceRefresh=true") : "http://h5.m.taobao.com/taolive/video.html?id=%s&livesource=guanfangtai&productType=live&ignoreSameLive=true&forceRefresh=true";
    }

    public static boolean aq() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("abd3f8bb", new Object[0])).booleanValue() : v.e(tfv.a("tblive", "enableEntryLiveRoomSmartLandingGoodsBugfix", "true"));
    }

    public static boolean at() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("abfe3f3e", new Object[0])).booleanValue() : v.e(tfv.a("tblive", "enableStayLiveRoomSmartLanding", "true"));
    }

    public static boolean ar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("abe2103c", new Object[0])).booleanValue();
        }
        if (phg.d().a()) {
            return false;
        }
        if (pmd.a().d() == null) {
            return true;
        }
        return v.e(tfv.a("tblive", "enableWidgetStateLeakFix", "true"));
    }

    public static boolean au() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ac0c56bf", new Object[0])).booleanValue() : v.e(tfv.a("tblive", "enableHotItemSubscribe", "true"));
    }

    public static boolean t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6782aff", new Object[0])).booleanValue();
        }
        return v.e(tfv.a("tblive", "NeedCleanScreenForImmersiveExp", "true")) && v.e(pmd.a().t().a("TBLiveCleanScreenExp", "NeedCleanScreenForImmersiveExp", "enabled", "true"));
    }

    public static boolean av() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ac1a6e40", new Object[0])).booleanValue() : v.e(tfv.a("tblive", "enableNTPFrameTime", "true"));
    }

    public static boolean aw() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ac2885c1", new Object[0])).booleanValue() : v.e(tfv.a("tblive", "enableMixProfile", "true"));
    }

    public static boolean ax() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ac369d42", new Object[0])).booleanValue() : v.e(tfv.a("tblive", "enableWidgetFollowStateCheck", "true"));
    }

    public static boolean M() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4529658", new Object[0])).booleanValue() : v.e(tfv.a("tblive", "enableUserTaskNew", "true")) && v.e(pmd.a().t().a("taolive", "enableUserTaskNew", "enable", "false"));
    }

    public static boolean ay() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ac44b4c3", new Object[0])).booleanValue() : v.e(tfv.a("tblive", "enableFavoriteStateCheck", "true"));
    }

    public static boolean az() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ac52cc44", new Object[0])).booleanValue() : v.e(tfv.a("tblive", "enableHotSaleDismissTradeFix", "true"));
    }
}
