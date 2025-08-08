package tb;

import android.os.Build;
import mtopsdk.common.util.StringUtils;
import com.alipay.mobile.intelligentdecision.model.IDecisionResult;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.proxy.comments.CommentsProxy;
import com.taobao.android.live.plugin.proxy.f;
import com.taobao.taolive.room.utils.v;
import com.taobao.taolive.sdk.utils.l;
import com.taobao.taolive.sdk.utils.q;
import org.android.agoo.common.AgooConstants;

/* loaded from: classes8.dex */
public class ply {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String LIVEROOM_AB_GROUP = "taobaolive";
    public static final String LIVEROOM_ORANGE_GROUP = "tblive";
    public static final String TAG = "SwitchConfig";
    public static final String TBLIVE_ORANGE_GROUP = "tblive";

    /* renamed from: a  reason: collision with root package name */
    private static boolean f32755a;
    private static boolean b;

    static {
        kge.a(-79133640);
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[0]) : pmd.a().d().a("tblive", "commentReportUrl", "https://market.m.taobao.com/app/msd/buyer-aqcenter/report.html#/poplayer?reportType=COMMENT");
    }

    public static String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[0]) : pmd.a().d().a("tblive", "directOpenPoplayerUrl", "poplayer://202008AQtbLiveReport?openType=directly&uuid=202008AQtbLiveReport&type=webview");
    }

    public static String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[0]) : pmd.a().d().a("tblive", "interceptMessageCode", "");
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[0])).booleanValue() : l.d(pmd.a().d().a("tblive", "enableNegativeFeedback", "true"));
    }

    public static int e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a4ca5f", new Object[0])).intValue() : l.a(pmd.a().d().a("tblive", "ShowNickMaxLength", "5"));
    }

    public static boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[0])).booleanValue() : l.d(pmd.a().d().a("tblive", "EnableBelovedFansEnterEffectV2", "true"));
    }

    public static int g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5c0f961", new Object[0])).intValue() : l.a(pmd.a().d().a("tblive", "BelovedFansMinLevel", AgooConstants.ACK_FLAG_NULL));
    }

    public static String h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5d9eff91", new Object[0]) : pmd.a().d().a("tblive", "belovedFansEnterBgImage", "https://gw.alicdn.com/imgextra/i3/O1CN012XgIrC1wVrZInwtkT_!!6000000006314-54-tps-630-66.apng");
    }

    public static boolean i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[0])).booleanValue() : l.d(pmd.a().d().a("tblive", "enableSuperedFansEnterEffect", "true"));
    }

    public static int j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5eb3fe4", new Object[0])).intValue() : l.a(pmd.a().d().a("tblive", "superedFansMinLevel", "19"));
    }

    public static String k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f1302f6e", new Object[0]) : pmd.a().d().a("tblive", "superedFansEnterBgImage", "https://gw.alicdn.com/imgextra/i3/O1CN01nBDioM21jfaZPRj75_!!6000000007021-54-tps-630-66.apng");
    }

    public static boolean l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[0])).booleanValue() : l.d(pmd.a().d().a("tblive", "enableHolderPM", "true"));
    }

    public static boolean m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6158678", new Object[0])).booleanValue() : v.e(pmd.a().d().a("tblive", "enableCommentOff", "true"));
    }

    public static boolean n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6239df9", new Object[0])).booleanValue() : l.d(pmd.a().d().a("tblive", "enableCommentComboAtmos", "true"));
    }

    public static final long o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("631b56a", new Object[0])).longValue() : v.c(pmd.a().d().a("tblive", "TBLVCommentCritDelayTime", "2000"));
    }

    public static boolean p() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("63fccfb", new Object[0])).booleanValue() : v.e(pmd.a().d().a("tblive", "commentReportEnable2", "true"));
    }

    public static boolean q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("64de47c", new Object[0])).booleanValue() : l.d(pmd.a().d().a("tblive", "bottomShowChatIsOpen", "true"));
    }

    public static int r() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("65bfbec", new Object[0])).intValue() : l.a(pmd.a().d().a("tblive", "bottomShowChatCacheSize", "50"));
    }

    public static boolean s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("66a137e", new Object[0])).booleanValue();
        }
        if (!f32755a) {
            f32755a = true;
            b = l.d(pmd.a().d().a("tblive", "enableImportantEvent2", "true"));
        }
        return b;
    }

    public static boolean a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("929ad04a", new Object[]{str, str2, str3})).booleanValue() : l.d(pmd.a().t().a(str, str2, str3, "false"));
    }

    public static Long t() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Long) ipChange.ipc$dispatch("fab918ba", new Object[0]) : Long.valueOf(l.b(pmd.a().d().a("tblive", "importantEventTimeoutTime", String.valueOf(((CommentsProxy) f.e()).getImportantMessageTimeoutTime()))));
    }

    public static boolean v() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6945a01", new Object[0])).booleanValue() : l.d(pmd.a().d().a("tblive", "enableImportantTemplate", "true"));
    }

    public static boolean w() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6a27182", new Object[0])).booleanValue() : l.d(pmd.a().d().a("tblive", "importantNoticeEnableFatigueControl", "true"));
    }

    public static Long x() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Long) ipChange.ipc$dispatch("99407236", new Object[0]) : Long.valueOf(l.b(pmd.a().d().a("tblive", "importantEventIntervalTime", String.valueOf(((CommentsProxy) f.e()).getImportantMessageIntervalTime()))));
    }

    public static boolean y() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6bea084", new Object[0])).booleanValue() : l.d(pmd.a().d().a("tblive", "enableClearImportantAnim", "true"));
    }

    public static boolean z() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6ccb805", new Object[0])).booleanValue() : l.d(pmd.a().d().a("tblive", "enableImageLoadOptimize", "true"));
    }

    public static boolean A() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3a97c4c", new Object[0])).booleanValue() : l.d(pmd.a().d().a("tblive", "HideFakeFavor", "false"));
    }

    public static final int B() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3b793bc", new Object[0])).intValue() : l.a(pmd.a().d().a("tblive", "LikeDelayTime", "6"));
    }

    public static boolean C() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3c5ab4e", new Object[0])).booleanValue() : l.d(pmd.a().d().a("tblive", "DisablePublishComment", "false"));
    }

    public static boolean D() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3d3c2cf", new Object[0])).booleanValue() : l.d(pmd.a().d().a("tblive", "enableSendCommentJSEvent", "true"));
    }

    public static long E() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3e1da40", new Object[0])).longValue() : l.b(pmd.a().d().a("tblive", "commentRestoreScrollDuration", IDecisionResult.ENGINE_ERROR));
    }

    public static boolean G() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3fe0952", new Object[0])).booleanValue() : l.d(pmd.a().d().a("tblive", "enableTaoLiveQABiz", "true"));
    }

    public static boolean I() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("41a3854", new Object[0])).booleanValue() : l.d(pmd.a().d().a("tblive", "enableQuestionExplain", "true"));
    }

    public static boolean J() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4284fd5", new Object[0])).booleanValue() : l.d(pmd.a().d().a("tblive", "hideExitClearScreen", "true"));
    }

    public static boolean K() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4366756", new Object[0])).booleanValue() : l.d(pmd.a().d().a("tblive", "cleanScreenGoodListOpen", "true"));
    }

    public static boolean L() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4447ed7", new Object[0])).booleanValue() : l.d(pmd.a().d().a("tblive", "enableQuestionAnswerOpt", "true"));
    }

    public static long M() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4529648", new Object[0])).longValue() : l.a(pmd.a().d().a("tblive", "taoliveLinkCallCountDown", AgooConstants.ACK_PACK_ERROR));
    }

    public static boolean N() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("460add9", new Object[0])).booleanValue() : l.d(pmd.a().d().a("tblive", "enableTaoLiveBCLinkEntrance", "true"));
    }

    public static boolean O() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("46ec55a", new Object[0])).booleanValue() : l.d(pmd.a().d().a("tblive", "enableTaoLiveTreasureLinkEntrance", "true"));
    }

    public static boolean P() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("47cdcdb", new Object[0])).booleanValue() : l.d(pmd.a().d().a("tblive", "defaultLinkArtcBackCamera", "true"));
    }

    public static boolean Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("48af45c", new Object[0])).booleanValue();
        }
        String a2 = pmd.a().d().a("tblive", "LinkLiveUnsupportDevice", "");
        if (StringUtils.isEmpty(a2)) {
            return false;
        }
        String str = Build.MODEL;
        String[] split = a2.split(";");
        if (split != null && split.length > 0 && !StringUtils.isEmpty(str)) {
            for (String str2 : split) {
                if (!StringUtils.isEmpty(str2) && str.equalsIgnoreCase(str2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static String R() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ce20f5e7", new Object[0]) : pmd.a().d().a("tblive", "FavoriteAnimUrl", "https://gw.alicdn.com/imgextra/i1/O1CN01MdHOrX24kzZYqNXtf_!!6000000007430-54-tps-162-78.apng");
    }

    public static String S() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("54a6b086", new Object[0]) : pmd.a().d().a("tblive", "UnFavoriteUrl", "https://gw.alicdn.com/imgextra/i4/O1CN01Lid3WP1xc6ZsLARgw_!!6000000006463-2-tps-162-78.png");
    }

    public static boolean T() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4b53adf", new Object[0])).booleanValue() : l.d(pmd.a().d().a("tblive", "enableNewUIRenderCalibre", "true"));
    }

    public static boolean U() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4c35260", new Object[0])).booleanValue() : l.d(pmd.a().d().a("tblive", "itemNoBeautyDegree", "false"));
    }

    public static long V() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4d169d1", new Object[0])).longValue() : l.a(pmd.a().d().a("tblive", "itemNoBeautyLoop", AgooConstants.ACK_PACK_ERROR)) * 1000;
    }

    public static boolean W() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4df8162", new Object[0])).booleanValue();
        }
        if (!phg.d().a()) {
            return l.d(pmd.a().d().a("tblive", "enableFavoriteFunction", "false"));
        }
        return true;
    }

    public static boolean X() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4ed98e3", new Object[0])).booleanValue() : l.d(pmd.a().d().a("tblive", "enableRemoteOnlineLimitNumberFormat", "true"));
    }

    public static boolean Y() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4fbb064", new Object[0])).booleanValue() : l.d(pmd.a().d().a("tblive", "enableNoBreakLink", "true"));
    }

    public static boolean Z() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("509c7e5", new Object[0])).booleanValue() : l.d(pmd.a().d().a("tblive", "EnableLinkLiveSEIDetect", "true"));
    }

    public static boolean aa() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("aaf280ab", new Object[0])).booleanValue() : l.d(pmd.a().d().a("tblive", "enableStatusBarAdaptive", "true"));
    }

    public static long ab() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ab00981c", new Object[0])).longValue() : l.b(pmd.a().d().a("tblive", "taoliveNoticeDelayTime", "3")) * 1000;
    }

    public static int ac() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ab0eaf9c", new Object[0])).intValue() : l.a(pmd.a().d().a("tblive", "taoliveNoticeAfterCommentCount", "3"));
    }

    public static boolean ad() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab1cc72e", new Object[0])).booleanValue() : l.d(pmd.a().d().a("tblive", "taoliveNoticeAfterShowEnable", "true"));
    }

    public static boolean ae() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab2adeaf", new Object[0])).booleanValue() : l.d(pmd.a().d().a("tblive", "isLiveNoticeNative", "true"));
    }

    public static boolean af() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab38f630", new Object[0])).booleanValue() : l.d(pmd.a().d().a("tblive", "enableTaoLiveTopNotice", "true"));
    }

    public static long ag() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ab470da1", new Object[0])).longValue() : l.b(pmd.a().d().a("tblive", "shortNoticeDuration", "8")) * 1000;
    }

    public static int ah() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ab552521", new Object[0])).intValue() : l.a(pmd.a().d().a("tblive", "longNoticeRepeatCount", "3"));
    }

    public static boolean ai() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab633cb3", new Object[0])).booleanValue() : l.d(pmd.a().d().a("tblive", "enableHideWatchNums", "true"));
    }

    public static String aj() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("87758670", new Object[0]) : pmd.a().d().a("tblive", "screenLikePositionInfoPortrait", "44-44-218-0.13");
    }

    public static String ak() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("dfb410f", new Object[0]) : pmd.a().d().a("tblive", "screenLikePositionInfoLandscape", "254-364-73-0.25");
    }

    public static boolean al() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab8d8336", new Object[0])).booleanValue() : l.d(pmd.a().d().a("tblive", "enablePopScreenLikeFeedback", "true"));
    }

    public static boolean am() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab9b9ab7", new Object[0])).booleanValue() : l.d(pmd.a().d().a("tblive", "TBLiveBBPKMaskISAvailable", "true"));
    }

    public static boolean an() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("aba9b238", new Object[0])).booleanValue() : l.d(pmd.a().d().a("tblive", "enablePopRightBottomLikeFeedback", "false"));
    }

    public static boolean ao() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("abb7c9b9", new Object[0])).booleanValue() : l.d(pmd.a().d().a("tblive", "forbiddenRemoteLikeAtmosWhenBottomLikeClicked", "true"));
    }

    public static Long ap() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Long) ipChange.ipc$dispatch("2226c51f", new Object[0]) : Long.valueOf(l.b(pmd.a().d().a("tblive", "linkSeiTimeOutDuration", String.valueOf((long) orq.FRAME_CHECK_TIMEOUT))));
    }

    public static boolean aq() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("abd3f8bb", new Object[0])).booleanValue() : l.d(pmd.a().d().a("tblive", "enableCommentInputBarEmojiQuickShow", "true"));
    }

    public static int ar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("abe2102b", new Object[0])).intValue();
        }
        try {
            return l.a(pmd.a().d().a("tblive", "InputMaxLimitNumber", "50"));
        } catch (Exception e) {
            q.a(TAG, "exception:" + e.getMessage());
            return 50;
        }
    }

    public static boolean as() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("abf027bd", new Object[0])).booleanValue() : l.d(pmd.a().d().a("tblive", "enableUploadLiveMuteParams", "true"));
    }

    public static String at() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c8aed0a6", new Object[0]) : pmd.a().d().a("tblive", "liveRoomCommentInputPlaceholder", "平台提倡文明用语，请温柔发言哦～");
    }

    public static boolean au() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ac0c56bf", new Object[0])).booleanValue() : l.d(pmd.a().d().a("tblive", "enableFixMultiLinkDynamicLayout", "true"));
    }

    public static boolean av() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ac1a6e40", new Object[0])).booleanValue();
        }
        try {
            return l.d(pmd.a().d().a("tblive", "enableNewDynamicSticker", "true"));
        } catch (Exception e) {
            q.b(TAG, "enableNewDynamicSticker catch exception:" + e.getMessage());
            return false;
        }
    }

    public static boolean aw() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ac2885c1", new Object[0])).booleanValue();
        }
        try {
            return l.d(pmd.a().d().a("tblive", "enableStickerCommentCombine", "true"));
        } catch (Exception e) {
            q.b(TAG, "enableStickerCommentCombine catch exception:" + e.getMessage());
            return false;
        }
    }

    public static boolean ax() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ac369d42", new Object[0])).booleanValue() : v.e(pmd.a().d().a("tblive", "enableLiveLinkBackgroundImageMask", "true"));
    }

    public static boolean ay() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ac44b4c3", new Object[0])).booleanValue() : v.e(pmd.a().d().a("tblive", "enableHandleSEIErrorDataShowView", "true"));
    }

    public static boolean az() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ac52cc44", new Object[0])).booleanValue() : v.e(pmd.a().d().a("tblive", "enableSetBackgroundHoleAreaInErrorData", "true"));
    }

    public static long aE() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a967ee7f", new Object[0])).longValue() : v.c(pmd.a().d().a("tblive", "anchorTopResponseDisplayTime", AgooConstants.ACK_PACK_ERROR));
    }

    public static long aF() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a9760600", new Object[0])).longValue() : v.c(pmd.a().d().a("tblive", "anchorResponseMeTipBarDisplayTime", "10"));
    }

    public static long aG() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a9841d81", new Object[0])).longValue() : v.c(pmd.a().d().a("tblive", "anchorResponseMeDisplayTime", "10"));
    }

    public static boolean aI() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a9a04c93", new Object[0])).booleanValue() : v.e(pmd.a().d().a("tblive", "enableMasterAnchorResponse", "false"));
    }

    public static boolean aJ() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a9ae6414", new Object[0])).booleanValue() : v.e(pmd.a().d().a("tblive", "enableUserRecExpFrame", "true"));
    }
}
