package com.taobao.themis.kernel.utils;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.taobao.android.festival.jsbridge.AliFestivalWVPlugin;
import com.taobao.media.MediaConstant;
import com.taobao.themis.kernel.adapter.IConfigAdapter;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.db.TMSDBAdapter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.collections.p;
import kotlin.jvm.JvmStatic;
import kotlin.text.Regex;
import tb.kge;
import tb.qpt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0003\bÂ\u0001\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b%\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\b\u0010\u0005\u001a\u00020\u0004H\u0007J\u0006\u0010\u0006\u001a\u00020\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u0007J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0004H\u0007J\b\u0010\f\u001a\u00020\bH\u0007J\b\u0010\r\u001a\u00020\bH\u0007J\u0012\u0010\u000e\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0007J\u0006\u0010\u000f\u001a\u00020\bJ\b\u0010\u0010\u001a\u00020\bH\u0007J\b\u0010\u0011\u001a\u00020\bH\u0007J\b\u0010\u0012\u001a\u00020\bH\u0007J\b\u0010\u0013\u001a\u00020\bH\u0007J\b\u0010\u0014\u001a\u00020\bH\u0007J\u0006\u0010\u0015\u001a\u00020\bJ\b\u0010\u0016\u001a\u00020\bH\u0007J\b\u0010\u0017\u001a\u00020\bH\u0007J\b\u0010\u0018\u001a\u00020\bH\u0007J\b\u0010\u0019\u001a\u00020\bH\u0007J\b\u0010\u001a\u001a\u00020\bH\u0007J\b\u0010\u001b\u001a\u00020\bH\u0007J\b\u0010\u001c\u001a\u00020\bH\u0007J\b\u0010\u001d\u001a\u00020\bH\u0007J\b\u0010\u001e\u001a\u00020\bH\u0007J\b\u0010\u001f\u001a\u00020\bH\u0007J\b\u0010 \u001a\u00020\bH\u0007J\b\u0010!\u001a\u00020\bH\u0007J\b\u0010\"\u001a\u00020\bH\u0007J\u0006\u0010#\u001a\u00020\bJ\u000e\u0010$\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004J\b\u0010%\u001a\u00020\bH\u0007J\b\u0010&\u001a\u00020\bH\u0007J\b\u0010'\u001a\u00020\bH\u0007J\b\u0010(\u001a\u00020\bH\u0007J\b\u0010)\u001a\u00020\bH\u0007J\b\u0010*\u001a\u00020\bH\u0007J\b\u0010+\u001a\u00020\bH\u0007J\b\u0010,\u001a\u00020\bH\u0007J\b\u0010-\u001a\u00020\bH\u0007J\b\u0010.\u001a\u00020\bH\u0007J\b\u0010/\u001a\u00020\bH\u0007J\b\u00100\u001a\u00020\bH\u0007J\b\u00101\u001a\u00020\bH\u0007J\b\u00102\u001a\u00020\bH\u0007J\u0006\u00103\u001a\u00020\bJ\b\u00104\u001a\u00020\bH\u0007J\b\u00105\u001a\u00020\bH\u0007J\b\u00106\u001a\u00020\bH\u0007J\b\u00107\u001a\u00020\bH\u0007J\b\u00108\u001a\u00020\bH\u0007J\b\u00109\u001a\u00020\bH\u0007J\b\u0010:\u001a\u00020\bH\u0007J\b\u0010;\u001a\u00020\bH\u0007J\b\u0010<\u001a\u00020\bH\u0007J\b\u0010=\u001a\u00020\bH\u0007J\b\u0010>\u001a\u00020\bH\u0007J\b\u0010?\u001a\u00020\bH\u0007J\b\u0010@\u001a\u00020\bH\u0007J\u0006\u0010A\u001a\u00020\bJ\b\u0010B\u001a\u00020\bH\u0007J\b\u0010C\u001a\u00020\bH\u0007J\u0006\u0010D\u001a\u00020\bJ\b\u0010E\u001a\u00020\bH\u0007J\b\u0010F\u001a\u00020\bH\u0007J\b\u0010G\u001a\u00020\bH\u0007J\b\u0010H\u001a\u00020\bH\u0007J\b\u0010I\u001a\u00020\bH\u0007J\u0010\u0010J\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u0007J\b\u0010K\u001a\u00020\bH\u0007J\b\u0010L\u001a\u00020\bH\u0007J\u0006\u0010M\u001a\u00020\bJ\b\u0010N\u001a\u00020\u0004H\u0007J\b\u0010O\u001a\u00020\bH\u0007J\b\u0010P\u001a\u00020\bH\u0007J\u0012\u0010Q\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0007J\b\u0010R\u001a\u00020\bH\u0007J\b\u0010S\u001a\u00020\bH\u0007J\u0006\u0010T\u001a\u00020\bJ\u0006\u0010U\u001a\u00020\bJ\u0006\u0010V\u001a\u00020\bJ\b\u0010W\u001a\u00020\bH\u0007J\b\u0010X\u001a\u00020\bH\u0007J\b\u0010Y\u001a\u00020\bH\u0007J\b\u0010Z\u001a\u00020\bH\u0007J\b\u0010[\u001a\u00020\bH\u0007J\b\u0010\\\u001a\u00020\bH\u0007J\b\u0010]\u001a\u00020\bH\u0007J\b\u0010^\u001a\u00020\bH\u0007J\b\u0010_\u001a\u00020\bH\u0007J\b\u0010`\u001a\u00020\bH\u0007J\b\u0010a\u001a\u00020\bH\u0007J\b\u0010b\u001a\u00020\bH\u0007J\b\u0010c\u001a\u00020\bH\u0007J\b\u0010d\u001a\u00020\bH\u0007J\b\u0010e\u001a\u00020\bH\u0007J\b\u0010f\u001a\u00020\bH\u0007J\b\u0010g\u001a\u00020\bH\u0007J\b\u0010h\u001a\u00020\bH\u0007J\b\u0010i\u001a\u00020\bH\u0007J\b\u0010j\u001a\u00020\bH\u0007J\b\u0010k\u001a\u00020\bH\u0007J\b\u0010l\u001a\u00020\bH\u0007J\b\u0010m\u001a\u00020\bH\u0007J\b\u0010n\u001a\u00020\bH\u0007J\b\u0010o\u001a\u00020\bH\u0007J\b\u0010p\u001a\u00020\bH\u0007J\b\u0010q\u001a\u00020\bH\u0007J\b\u0010r\u001a\u00020\bH\u0007J\b\u0010s\u001a\u00020\bH\u0007J\b\u0010t\u001a\u00020\bH\u0007J\b\u0010u\u001a\u00020\bH\u0007J\b\u0010v\u001a\u00020\bH\u0007J\b\u0010w\u001a\u00020\bH\u0007J\b\u0010x\u001a\u00020\bH\u0007J\b\u0010y\u001a\u00020\bH\u0007J\u0006\u0010z\u001a\u00020\bJ\b\u0010{\u001a\u00020\bH\u0007J\b\u0010|\u001a\u00020\bH\u0007J\u0006\u0010}\u001a\u00020\bJ\b\u0010~\u001a\u00020\bH\u0007J\b\u0010\u007f\u001a\u00020\bH\u0007J\t\u0010\u0080\u0001\u001a\u00020\bH\u0007J\t\u0010\u0081\u0001\u001a\u00020\bH\u0007J\t\u0010\u0082\u0001\u001a\u00020\bH\u0007J\u0007\u0010\u0083\u0001\u001a\u00020\bJ\u0011\u0010\u0084\u0001\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u0007J\t\u0010\u0085\u0001\u001a\u00020\bH\u0007J\t\u0010\u0086\u0001\u001a\u00020\bH\u0007J\t\u0010\u0087\u0001\u001a\u00020\bH\u0007J\t\u0010\u0088\u0001\u001a\u00020\bH\u0007J\t\u0010\u0089\u0001\u001a\u00020\bH\u0007J\t\u0010\u008a\u0001\u001a\u00020\bH\u0007J\t\u0010\u008b\u0001\u001a\u00020\bH\u0007J\t\u0010\u008c\u0001\u001a\u00020\bH\u0007J\t\u0010\u008d\u0001\u001a\u00020\bH\u0007J\t\u0010\u008e\u0001\u001a\u00020\bH\u0007J\t\u0010\u008f\u0001\u001a\u00020\bH\u0007J\t\u0010\u0090\u0001\u001a\u00020\bH\u0007J\t\u0010\u0091\u0001\u001a\u00020\bH\u0007J\t\u0010\u0092\u0001\u001a\u00020\bH\u0007J\t\u0010\u0093\u0001\u001a\u00020\bH\u0007J\t\u0010\u0094\u0001\u001a\u00020\bH\u0007J\t\u0010\u0095\u0001\u001a\u00020\bH\u0007J\t\u0010\u0096\u0001\u001a\u00020\bH\u0007J\t\u0010\u0097\u0001\u001a\u00020\bH\u0007J\t\u0010\u0098\u0001\u001a\u00020\bH\u0007J\t\u0010\u0099\u0001\u001a\u00020\bH\u0007J\t\u0010\u009a\u0001\u001a\u00020\bH\u0007J\t\u0010\u009b\u0001\u001a\u00020\bH\u0007J\u0007\u0010\u009c\u0001\u001a\u00020\bJ\t\u0010\u009d\u0001\u001a\u00020\bH\u0007J\t\u0010\u009e\u0001\u001a\u00020\bH\u0007J\t\u0010\u009f\u0001\u001a\u00020\bH\u0007J\t\u0010 \u0001\u001a\u00020\bH\u0007J\t\u0010¡\u0001\u001a\u00020\bH\u0007J\u0007\u0010¢\u0001\u001a\u00020\bJ\u0007\u0010£\u0001\u001a\u00020\bJ\t\u0010¤\u0001\u001a\u00020\bH\u0007J\t\u0010¥\u0001\u001a\u00020\bH\u0007J\t\u0010¦\u0001\u001a\u00020\bH\u0007J\t\u0010§\u0001\u001a\u00020\bH\u0007J\t\u0010¨\u0001\u001a\u00020\bH\u0007J\t\u0010©\u0001\u001a\u00020\bH\u0007J\t\u0010ª\u0001\u001a\u00020\bH\u0007J\t\u0010«\u0001\u001a\u00020\bH\u0007J\t\u0010¬\u0001\u001a\u00020\bH\u0007J\t\u0010\u00ad\u0001\u001a\u00020\bH\u0007J\t\u0010®\u0001\u001a\u00020\bH\u0007J\t\u0010¯\u0001\u001a\u00020\bH\u0007J\t\u0010°\u0001\u001a\u00020\bH\u0007J\t\u0010±\u0001\u001a\u00020\bH\u0007J\t\u0010²\u0001\u001a\u00020\bH\u0007J\t\u0010³\u0001\u001a\u00020\bH\u0007J\t\u0010´\u0001\u001a\u00020\bH\u0007J\t\u0010µ\u0001\u001a\u00020\bH\u0007J\t\u0010¶\u0001\u001a\u00020\u0004H\u0007J\t\u0010·\u0001\u001a\u00020\u0004H\u0007J\t\u0010¸\u0001\u001a\u00020\u0004H\u0007J\t\u0010¹\u0001\u001a\u00020\u0004H\u0007J\t\u0010º\u0001\u001a\u00020\u0004H\u0007J\t\u0010»\u0001\u001a\u00020\u0004H\u0007J\t\u0010¼\u0001\u001a\u00020\u0004H\u0007J,\u0010½\u0001\u001a\u00020\b2\u0007\u0010¾\u0001\u001a\u00020\u00042\u0007\u0010¿\u0001\u001a\u00020\u00042\t\u0010À\u0001\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0003\u0010Á\u0001J,\u0010Â\u0001\u001a\u00020\b2\u0007\u0010¾\u0001\u001a\u00020\u00042\u0007\u0010¿\u0001\u001a\u00020\u00042\t\u0010À\u0001\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0003\u0010Á\u0001J\t\u0010Ã\u0001\u001a\u00020\u0004H\u0007J\t\u0010Ä\u0001\u001a\u00020\u0004H\u0007J\t\u0010Å\u0001\u001a\u00020\u0004H\u0007J\t\u0010Æ\u0001\u001a\u00020\u0004H\u0007J\t\u0010Ç\u0001\u001a\u00020\u0004H\u0007J\t\u0010È\u0001\u001a\u00020\u0004H\u0007J\t\u0010É\u0001\u001a\u00020\u0004H\u0007J&\u0010Ê\u0001\u001a\u00030Ë\u00012\u0007\u0010¾\u0001\u001a\u00020\u00042\u0007\u0010¿\u0001\u001a\u00020\u00042\b\u0010À\u0001\u001a\u00030Ë\u0001H\u0007J&\u0010Ì\u0001\u001a\u00030Ë\u00012\u0007\u0010¾\u0001\u001a\u00020\u00042\u0007\u0010¿\u0001\u001a\u00020\u00042\b\u0010À\u0001\u001a\u00030Ë\u0001H\u0007J\n\u0010Í\u0001\u001a\u00030Ë\u0001H\u0007J\n\u0010Î\u0001\u001a\u00030Ë\u0001H\u0007J&\u0010Ï\u0001\u001a\u00030Ð\u00012\u0007\u0010¾\u0001\u001a\u00020\u00042\u0007\u0010¿\u0001\u001a\u00020\u00042\b\u0010À\u0001\u001a\u00030Ð\u0001H\u0007J\b\u0010Ñ\u0001\u001a\u00030Ë\u0001J\u0007\u0010Ò\u0001\u001a\u00020\u0004J\b\u0010Ó\u0001\u001a\u00030Ë\u0001J\n\u0010Ô\u0001\u001a\u00030Ð\u0001H\u0007J\u0010\u0010Õ\u0001\u001a\t\u0012\u0004\u0012\u00020\u00040Ö\u0001H\u0007J\t\u0010×\u0001\u001a\u00020\u0004H\u0007J\u0011\u0010Ø\u0001\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0007J\t\u0010Ù\u0001\u001a\u00020\u0004H\u0007J\t\u0010Ú\u0001\u001a\u00020\u0004H\u0007J\t\u0010Û\u0001\u001a\u00020\u0004H\u0007J\t\u0010Ü\u0001\u001a\u00020\u0004H\u0007J\t\u0010Ý\u0001\u001a\u00020\u0004H\u0007J\t\u0010Þ\u0001\u001a\u00020\bH\u0007J$\u0010ß\u0001\u001a\u00020\u00042\u0007\u0010¾\u0001\u001a\u00020\u00042\u0007\u0010¿\u0001\u001a\u00020\u00042\u0007\u0010À\u0001\u001a\u00020\u0004H\u0007J$\u0010à\u0001\u001a\u00020\u00042\u0007\u0010¾\u0001\u001a\u00020\u00042\u0007\u0010¿\u0001\u001a\u00020\u00042\u0007\u0010À\u0001\u001a\u00020\u0004H\u0007J\n\u0010á\u0001\u001a\u00030Ð\u0001H\u0007J\n\u0010â\u0001\u001a\u00030Ë\u0001H\u0007J\t\u0010ã\u0001\u001a\u00020\u0004H\u0007J\t\u0010ä\u0001\u001a\u00020\u0004H\u0007J\u0007\u0010å\u0001\u001a\u00020\u0004J\t\u0010æ\u0001\u001a\u00020\bH\u0007J\u0012\u0010ç\u0001\u001a\u00020\b2\u0007\u0010è\u0001\u001a\u00020\u0004H\u0007J\t\u0010é\u0001\u001a\u00020\bH\u0007J\n\u0010ê\u0001\u001a\u00030Ë\u0001H\u0007J\t\u0010ë\u0001\u001a\u0004\u0018\u00010\u0004J\n\u0010ì\u0001\u001a\u00030Ë\u0001H\u0007J\t\u0010í\u0001\u001a\u0004\u0018\u00010\u0004J\t\u0010î\u0001\u001a\u0004\u0018\u00010\u0004J\u0012\u0010ï\u0001\u001a\u00020\b2\u0007\u0010ð\u0001\u001a\u00020\u0004H\u0007J\u0012\u0010ñ\u0001\u001a\u00020\b2\u0007\u0010ò\u0001\u001a\u00020\u0004H\u0007J\t\u0010ó\u0001\u001a\u00020\u0004H\u0007J\t\u0010ô\u0001\u001a\u00020\bH\u0007J\t\u0010õ\u0001\u001a\u00020\u0004H\u0007J\t\u0010ö\u0001\u001a\u00020\u0004H\u0007J\t\u0010÷\u0001\u001a\u00020\u0004H\u0007J\u0012\u0010ø\u0001\u001a\u00020\b2\u0007\u0010ð\u0001\u001a\u00020\u0004H\u0007J\n\u0010ù\u0001\u001a\u00030Ð\u0001H\u0007J\t\u0010ú\u0001\u001a\u00020\bH\u0007¨\u0006û\u0001"}, d2 = {"Lcom/taobao/themis/kernel/utils/TMSConfigUtils;", "", "()V", "afcEnterTMSBlackList", "", "appinfoPreloadList", "cardCouponUrl", "checkCloseWindowAccessList", "", "appId", "checkInTinyAppPermissionList", "apiName", "closeDetailRecentApp", "closeSystemShare", "disableBackHome", "disableBringFavorActionToCenter", "disableDowngradeOriginUrlMisMatchManifestUrl", "disableSinglePageModifyWindowOnResume", "disableSubPageUseAppWindowInfo", "downgradeRecentAppRequest", "enableAbilityHubNameSpaceUseCanvas", "enableActivityFixRecycle", "enableActivityResult", "enableAddIgnoreQueries", "enableAddToDesktop", "enableAddUniAppPoints", "enableAdjustTitlePosEnv", "enableAppInfoDefaultCache", "enableAppInfoForceUpdate", "enableAspectFixRatio", "enableAudioSingleTimer", "enableAutoSPM", "enableAutoUpdateNextPageUTParams", "enableCanvasInitStep", "enableChangeUA", "enableCheckPageVersion", "enableCheckPermission", "enableCustomPHAAPMProcedure", "enableDiskMonitor", "enableDowngradeUniAppWhenMainfestHasError", "enableFixActivityRebuild", "enableFixBgColor", "enableFixCanvasProviderWasCovered", "enableFixFragmentLifecycle", "enableFixH5OpenNewWindow", "enableFixImageProviderLeak", "enableFixJumpingBack", "enableFixLifeCycle", "enableFixManifestDefaultTitle", "enableFixMixUrlRepeat", "enableFixMixUrlRepeatV2", "enableFixQueryEncodeV2", "enableFixRenderOrder", "enableFixRunScene", "enableFixScopeAuthDiffs", "enableFixSwiperPagePreload", "enableFixSwiperTitleBar", "enableFixUniAppDocumentNotHit", "enableFixUniAppImmersive", "enableFoldOrPadAutoRotation", "enableFoldRelaunch", "enableForbidMuteApi", "enableFragmentBearThemis", "enableFragmentDestroyView", "enableGameAPIDomainWhiteListController", "enableGameForceUpdate", "enableGameFullScreen", "enableGameLandScapeTitleBarHeight", "enableGameReset", "enableGameSendMtopCustomHeader", "enableGameStopService", "enableGlobalSecondFloor", "enableH5UseDefaultTitleBar", "enableHideStatusBar", "enableIgnore2006", "enableInheritDocumentTitle", "enableInjectBuiltinVariable", "enableInstanceStartAndStop", "enableInterceptJavascriptInPushWindow", "enableInterceptorPageClosePermissionControl", "enableJumpToTBHomeWithAnim", "enableLandScape", "enableLightPubContainer", "enableLinkInitHomePage", "enableManifestAsyncTaskOpt", "enableManifestPreload", "enableManifestPreloadUrl", "enableManifestPreset", "enableManifestVariable", "enableMegaAudio", "enableMegaStorage", "enableMixFullScreen", "enableMixHideHomeIndicator", "enableMixPlayer", "enableModifyAbilityHubCallback", "enableMtopEnv", "enableNavNonHttpUrl", "enableNavigateSpm", "enableNewAPPInfoDB", "enableNewDefaultTitleBarStyle", "enableNewICONChange", "enableNewLauncherLocalSwitch", "enableNewMiniAppApi", "enableNewPageContainer", "enableNewPopWindow", "enableNewReportData", "enableOptGMAPISerialize", "enableOptGMAsyncAPI", "enableOptGMSyncAPI", "enableOptLifeCycleSticky", "enableOptimizedStartup", "enablePageDestroyDelay", "enablePageOrientation", "enableParseTemplate", "enablePhaDocumentPrefetch", "enablePopPageExitContainer", "enablePubMenuNewInterface", "enablePubSubPage", "enablePubTitleBarSetImmersive", "enableRUMExtension", "enableRecheckH5Url", "enableRefactorSystemBar", "enableReloadButton", "enableRemovePrefetchDelay", "enableRemoveSplashViewBackIntercept", "enableReplaceCompatWithDowngradeWhenUrlInvalid", "enableReportCacheHitRate", "enableReportFileSize", "enableReportMemoryInfo", "enableReportRum", "enableSafeAreaTop", "enableSaveDeprecatedVersion", "enableShouldOverrideUrlLoading", "enableShowDowngradeTips", "enableShowError", "enableShowErrorWidget", "enableShowPubOperateGuide", "enableShowUpgradeTips", "enableSinglePageWebMetaGet", "enableSkipAPMReport", "enableSourceMap", "enableSpecifyWebViewCore", "enableSupportEmbedPageError", "enableSupportTinyError", "enableSwiperSubPageQuery", "enableSwiperTitleBar", "enableSwitchWebEngineExp", "enableTabBarNumberChange", "enableThemisH5LegacyErrorView", "enableTimeOutError", "enableTinyAppPermissionCheck", "enableTinyAppWebPreRender", "enableTipsTimesExceeded", "enableTopAppPreload", "enableUTSubPageUrlFix", "enableUniApp", "enableUniAppForceReload", "enableUniAppNavPrefetch", "enableUniAppOfflineResource", "enableUniAppPrefetch", "enableUniAppPrefetchV2", "enableUniAppPubShareUrl", "enableUniAppReloadButton", "enableUpdateManifestFromZCache", "enableUseActivityAsUTParam", "enableUseGetRealPage", "enableUseNavAdapter", "enableV8JSRuntime", "enableWaitUCCore", "enableWaitWebReady", "enableWebAsyncApiChannel", "enableWebSocketLog", "enableWebViewAsyncLoad", "enableWeex2GetCurrentPageSnapshot", "enableWidgetLazyInit", "enableWidgetReportMonitor", "fixMixTinyAppPreFetch", "fixSwiperDocumentPreload", "fixUniAppPubTitleColor", "fixWeexBuiltinCssEnv", "forbidHideTinyAppTitleBar", "forceLayoutNG", "getAboutUrl", "getAppInfoCacheTimeBizList", "getAppInfoCacheTimeGlobal", "getAppInfoCacheTimeIdList", "getAppInfoKeyExpireList", "getAppInfoTable", "getAuthDefaultMap", "getBooleanConfig", "groupName", "key", AliFestivalWVPlugin.PARAMS_DEFAULT_VALUE, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Z", "getBooleanConfigLocal", "getDefaultRevisitResUrl", "getGameStopServiceGuideUrl", "getGameV8BlackList", "getGameV8WhiteList", "getGlobalMenuCommentUrl", "getGlobalSecondFloorUrl", "getIconChangeGuideUrl", "getIntConfig", "", "getIntConfigLocal", "getJumpToHomeAnimDeviceScore", "getJumpToHomeAnimDuration", "getLongConfig", "", "getManifestPreloadShuffleTime", "getManifestPreloadUrl", "getMaxEngineInstance", "getMaxPluginSyncSeconds", "getMixAPIBlackList", "", "getPermissionCheckWhiteList", "getPhaAppConvertUrl", "getPubOperateGuideUrl", "getPubRecommendIconChangeGuideUrl", "getPubShareWeexUrl", "getPubUserActiveIconChangeGuideUrl", "getRecentAppMoreUrl", "getShopAuthSwitch", "getStringConfig", "getStringConfigLocal", "getTopAppPreloadCheckTime", "getTotalAddTimes", "getUniAppLayoutNGWhiteList", "getUniAppRequireModuleWhiteList", "getZCacheManifestMockUrl", "homePageTaskAddWeex", "isInThemisLaunchBlackList", "name", "isPubDownGradeFeedBack", "lastVisitManifestDuration", "liveRoomUrl", "manifestMaxAsyncTime", "orderDetailUrl", "orderListUrl", "pageCloseInterceptorWhiteListWithSinglePage", "url", "pageCloseInterceptorWhiteListWithUniApp", "uniAppId", "preloadAPIWhiteList", "skipICONChangeTBHomeControl", "systemWebViewUrlList", "themisDomainWhiteList", "uniAppBlackList", "useSystemWebView", "waitUCReadyTimeout", "weexRenderUseFragment", "themis_kernel_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class n {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final n INSTANCE;

    static {
        kge.a(456060943);
        INSTANCE = new n();
    }

    private n() {
    }

    @JvmStatic
    public static final String a(String groupName, String key, String defaultValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("457cf91a", new Object[]{groupName, key, defaultValue});
        }
        kotlin.jvm.internal.q.d(groupName, "groupName");
        kotlin.jvm.internal.q.d(key, "key");
        kotlin.jvm.internal.q.d(defaultValue, "defaultValue");
        String configByGroupAndName = ((IConfigAdapter) qpt.a(IConfigAdapter.class)).getConfigByGroupAndName(groupName, key, defaultValue);
        kotlin.jvm.internal.q.b(configByGroupAndName, "TMSAdapterManager.getNot…   defaultValue\n        )");
        return configByGroupAndName;
    }

    @JvmStatic
    public static final String b(String groupName, String key, String defaultValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("87942679", new Object[]{groupName, key, defaultValue});
        }
        kotlin.jvm.internal.q.d(groupName, "groupName");
        kotlin.jvm.internal.q.d(key, "key");
        kotlin.jvm.internal.q.d(defaultValue, "defaultValue");
        String configByGroupAndNameFromLocal = ((IConfigAdapter) qpt.a(IConfigAdapter.class)).getConfigByGroupAndNameFromLocal(groupName, key, defaultValue);
        kotlin.jvm.internal.q.b(configByGroupAndNameFromLocal, "TMSAdapterManager.getNot…efaultValue\n            )");
        return configByGroupAndNameFromLocal;
    }

    @JvmStatic
    public static final boolean a(String groupName, String key, Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f9fef855", new Object[]{groupName, key, bool})).booleanValue();
        }
        kotlin.jvm.internal.q.d(groupName, "groupName");
        kotlin.jvm.internal.q.d(key, "key");
        return kotlin.jvm.internal.q.a((Object) ((IConfigAdapter) qpt.a(IConfigAdapter.class)).getConfigByGroupAndName(groupName, key, bool != null ? String.valueOf(bool.booleanValue()) : null), (Object) "true");
    }

    @JvmStatic
    public static final boolean b(String groupName, String key, Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2c3b4", new Object[]{groupName, key, bool})).booleanValue();
        }
        kotlin.jvm.internal.q.d(groupName, "groupName");
        kotlin.jvm.internal.q.d(key, "key");
        return kotlin.jvm.internal.q.a((Object) "true", (Object) ((IConfigAdapter) qpt.a(IConfigAdapter.class)).getConfigByGroupAndNameFromLocal(groupName, key, bool != null ? String.valueOf(bool.booleanValue()) : null));
    }

    @JvmStatic
    public static final long a(String groupName, String key, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4dba98bc", new Object[]{groupName, key, new Long(j)})).longValue();
        }
        kotlin.jvm.internal.q.d(groupName, "groupName");
        kotlin.jvm.internal.q.d(key, "key");
        try {
            String configByGroupAndName = ((IConfigAdapter) qpt.a(IConfigAdapter.class)).getConfigByGroupAndName(groupName, key, String.valueOf(j));
            kotlin.jvm.internal.q.b(configByGroupAndName, "TMSAdapterManager.getNot….toString()\n            )");
            return Long.parseLong(configByGroupAndName);
        } catch (Throwable th) {
            TMSLogger.b("TMSConfigUtils", "getLongConfig has error", th);
            return j;
        }
    }

    @JvmStatic
    public static final int a(String groupName, String key, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4dba94fa", new Object[]{groupName, key, new Integer(i)})).intValue();
        }
        kotlin.jvm.internal.q.d(groupName, "groupName");
        kotlin.jvm.internal.q.d(key, "key");
        try {
            String configByGroupAndName = ((IConfigAdapter) qpt.a(IConfigAdapter.class)).getConfigByGroupAndName(groupName, key, String.valueOf(i));
            kotlin.jvm.internal.q.b(configByGroupAndName, "TMSAdapterManager.getNot….toString()\n            )");
            return Integer.parseInt(configByGroupAndName);
        } catch (Throwable th) {
            TMSLogger.b("TMSConfigUtils", "getIntConfig has error", th);
            return i;
        }
    }

    @JvmStatic
    public static final int b(String groupName, String key, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("551fca19", new Object[]{groupName, key, new Integer(i)})).intValue();
        }
        kotlin.jvm.internal.q.d(groupName, "groupName");
        kotlin.jvm.internal.q.d(key, "key");
        try {
            String configByGroupAndNameFromLocal = ((IConfigAdapter) qpt.a(IConfigAdapter.class)).getConfigByGroupAndNameFromLocal(groupName, key, String.valueOf(i));
            kotlin.jvm.internal.q.b(configByGroupAndNameFromLocal, "TMSAdapterManager.getNot…tring()\n                )");
            return Integer.parseInt(configByGroupAndNameFromLocal);
        } catch (Throwable th) {
            TMSLogger.b("TMSConfigUtils", "getIntConfig has error", th);
            return i;
        }
    }

    @JvmStatic
    public static final boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : a(com.taobao.themis.kernel.i.GROUP_ARIVER_COMMON_CONFIG, "enableTipsTimesExceeded", (Boolean) true);
    }

    @JvmStatic
    public static final boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : a(com.taobao.themis.kernel.i.GROUP_ARIVER_COMMON_CONFIG, "ICONChangeSkipTBHomeControl", (Boolean) false);
    }

    @JvmStatic
    public static final String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[0]) : a(com.taobao.themis.kernel.i.GROUP_ARIVER_COMMON_CONFIG, "TBHomeIconChangeGuideUrl", "https://meta.m.taobao.com/app/tbhome/iconpop/iconreplace?wh_weex=true&weex_mode=dom&wx_navbar_hidden=true&wx_navbar_transparent=true&_wx_statusbar_hidden=true&renderType=2&wx_opaque=0&is_loading=0");
    }

    @JvmStatic
    public static final String d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[0]) : a(com.taobao.themis.kernel.i.GROUP_TRIVER_COMMON_CONFIG, "addGifResUrl", "https://gw.alicdn.com/imgextra/i3/O1CN01N4uheO1C79kCibG68_!!6000000000033-54-tps-590-400.apng");
    }

    @JvmStatic
    public static final String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[0]) : a(com.taobao.themis.kernel.i.ORANGE_GROUP_WINDMILL_COMMON, "aboutUrlForWeb", "http://market.m.taobao.com/app/mtb/taobao-app-more/pages/about");
    }

    @JvmStatic
    public static final boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[0])).booleanValue() : a(com.taobao.themis.kernel.i.GROUP_ARIVER_COMMON_CONFIG, "enableGlobalSecondFloor", (Boolean) false);
    }

    @JvmStatic
    public static final boolean g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[0])).booleanValue() : a(com.taobao.themis.kernel.i.GROUP_ARIVER_COMMON_CONFIG, "enableAddToDesktop", (Boolean) false);
    }

    @JvmStatic
    public static final String h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5d9eff91", new Object[0]) : a(com.taobao.themis.kernel.i.GROUP_ARIVER_COMMON_CONFIG, "globalSecondFloorUrl", "https://market.m.taobao.com/app/tbhome/secondfloor/home?wh_weex=true&wx_navbar_hidden=true&wx_navbar_transparent=true&_wx_statusbar_hidden=true&bgContainerColor=%2300ffffff");
    }

    @JvmStatic
    public static final String i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e424ba30", new Object[0]) : a(com.taobao.themis.kernel.i.GROUP_ARIVER_COMMON_CONFIG, "globalMenuCommentUrl", "https://m.duanqu.com?_ariver_appid=3000000002007701&enableKeepAlive=NO&page=pages/experience/experience");
    }

    @JvmStatic
    public static final String j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6aaa74cf", new Object[0]) : a(com.taobao.themis.kernel.metaInfo.appinfo.cacheConfig.b.GROUP_TMS_APP_INFO_CONFIG, com.taobao.themis.kernel.metaInfo.appinfo.cacheConfig.b.KEY_EXPIRE_LIST, "");
    }

    @JvmStatic
    public static final String k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f1302f6e", new Object[0]) : a(com.taobao.themis.kernel.metaInfo.appinfo.cacheConfig.b.GROUP_TMS_APP_INFO_CONFIG, com.taobao.themis.kernel.metaInfo.appinfo.cacheConfig.b.KEY_CACHE_TIME_GLOBAL, "");
    }

    @JvmStatic
    public static final String m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("fe3ba4ac", new Object[0]) : a(com.taobao.themis.kernel.i.ORANGE_GROUP_WINDMILL_COMMON, "pubShareWeexUrl", "");
    }

    @JvmStatic
    public static final long n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6239de9", new Object[0])).longValue() : a(com.taobao.themis.kernel.i.GROUP_THEMIS_COMMON_CONFIG, "topAppPreloadCheckInterval", 86400L);
    }

    @JvmStatic
    public static final boolean o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("631b57a", new Object[0])).booleanValue() : a(com.taobao.themis.kernel.i.GROUP_THEMIS_COMMON_CONFIG, "enableTopAppPreload", (Boolean) true);
    }

    @JvmStatic
    public static final boolean q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("64de47c", new Object[0])).booleanValue() : a(com.taobao.themis.kernel.i.GROUP_THEMIS_COMMON_CONFIG, "enableAutoUpdateNextPageUTParams", (Boolean) true);
    }

    @JvmStatic
    public static final boolean t() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6782aff", new Object[0])).booleanValue() : a(com.taobao.themis.kernel.i.GROUP_THEMIS_COMMON_CONFIG, "enableWeex2GetCurrentPageSnapshot", (Boolean) false);
    }

    @JvmStatic
    public static final boolean u() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6864280", new Object[0])).booleanValue() : a(com.taobao.themis.kernel.i.GROUP_THEMIS_COMMON_CONFIG, "enableJumpToTBHomeWithAnim", (Boolean) true);
    }

    @JvmStatic
    public static final boolean v() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6945a01", new Object[0])).booleanValue() : a(com.taobao.themis.kernel.i.GROUP_THEMIS_COMMON_CONFIG, "enableNewPopWindow", (Boolean) false);
    }

    @JvmStatic
    public static final boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue();
        }
        if (StringUtils.isEmpty(str)) {
            return false;
        }
        JSONArray jSONArray = null;
        try {
            String b = b(com.taobao.themis.kernel.i.GROUP_ARIVER_COMMON_CONFIG, "enableLandScapeAppIdList", "");
            if (!StringUtils.isEmpty(b)) {
                jSONArray = JSON.parseArray(b);
            }
            if (jSONArray != null) {
                if (jSONArray.contains(str)) {
                    return true;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @JvmStatic
    public static final String w() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3f74eee2", new Object[0]) : a(com.taobao.themis.kernel.i.GROUP_THEMIS_COMMON_CONFIG, "getPubUserActiveIconChangeGuideUrl", "https://meta.m.taobao.com/app/tbhome/iconpop/homeiconreplace?wh_weex=true&weex_mode=dom&wx_navbar_hidden=true&wx_navbar_transparent=true&_wx_statusbar_hidden=true&renderType=2&wx_opaque=0&is_loading=0");
    }

    @JvmStatic
    public static final int x() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6b088f2", new Object[0])).intValue() : a(com.taobao.themis.kernel.i.GROUP_THEMIS_COMMON_CONFIG, "getJumpToHomeAnimDuration", 500);
    }

    @JvmStatic
    public static final int y() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6bea073", new Object[0])).intValue() : a(com.taobao.themis.kernel.i.GROUP_THEMIS_COMMON_CONFIG, "getJumpToHomeAnimDeviceScore", 5);
    }

    @JvmStatic
    public static final String z() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d3061ebf", new Object[0]) : a(com.taobao.themis.kernel.i.GROUP_THEMIS_COMMON_CONFIG, "getPubOperateGuideUrl", "https://meta.m.taobao.com/app/tbhome/iconpop/iconguide?wh_weex=true&weex_mode=dom&wx_navbar_hidden=true&wx_navbar_transparent=true&_wx_statusbar_hidden=true&renderType=2&wx_opaque=0&is_loading=0");
    }

    @JvmStatic
    public static final boolean A() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3a97c4c", new Object[0])).booleanValue() : a(com.taobao.themis.kernel.i.GROUP_THEMIS_COMMON_CONFIG, "enableShowPubOperateGuide", (Boolean) false);
    }

    @JvmStatic
    public static final String B() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("65c54bf7", new Object[0]) : a(com.taobao.themis.kernel.i.GROUP_THEMIS_COMMON_CONFIG, "auth_device_local_map", "");
    }

    @JvmStatic
    public static final boolean C() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3c5ab4e", new Object[0])).booleanValue() : kotlin.jvm.internal.q.a((Object) b(com.taobao.themis.kernel.i.GROUP_THEMIS_COMMON_CONFIG, "enableLinkInitHomePage", "true"), (Object) "true");
    }

    public final boolean b(String appId) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{this, appId})).booleanValue();
        }
        kotlin.jvm.internal.q.d(appId, "appId");
        return !kotlin.text.n.b((CharSequence) a(com.taobao.themis.kernel.i.GROUP_THEMIS_COMMON_CONFIG, "disableCheckPermissionList", ""), (CharSequence) appId, false, 2, (Object) null);
    }

    @JvmStatic
    public static final boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88097eb8", new Object[]{str})).booleanValue();
        }
        if (StringUtils.isEmpty(str)) {
            return false;
        }
        JSONArray jSONArray = null;
        try {
            String b = b(com.taobao.themis.kernel.i.GROUP_ARIVER_COMMON_CONFIG, "disableBackHomeAppIdList", "");
            if (!StringUtils.isEmpty(b)) {
                jSONArray = JSON.parseArray(b);
            }
            if (jSONArray != null) {
                if (jSONArray.contains(str)) {
                    return true;
                }
            }
        } catch (Exception e) {
            TMSLogger.b("TMSConfigUtils", "disableBackHome, " + e.getMessage(), e);
        }
        return false;
    }

    @JvmStatic
    public static final String D() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("72d0c135", new Object[0]) : b(com.taobao.themis.kernel.i.GROUP_THEMIS_COMMON_CONFIG, "appinfoPreloadList", "");
    }

    @JvmStatic
    public static final String E() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f9567bd4", new Object[0]) : b(com.taobao.themis.kernel.i.GROUP_THEMIS_COMMON_CONFIG, "afcEnterTMSBlackList", "");
    }

    @JvmStatic
    public static final boolean d(String apiName) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d23b17f9", new Object[]{apiName})).booleanValue();
        }
        kotlin.jvm.internal.q.d(apiName, "apiName");
        if (apiName.length() == 0) {
            return false;
        }
        JSONArray jSONArray = null;
        try {
            String b = b(com.taobao.themis.kernel.i.GROUP_THEMIS_COMMON_CONFIG, "tinyAppPermissionCheckList", "");
            if (!StringUtils.isEmpty(b)) {
                jSONArray = JSON.parseArray(b);
            }
            if (jSONArray != null) {
                if (jSONArray.contains(apiName)) {
                    return true;
                }
            }
        } catch (Exception e) {
            TMSLogger.b("TMSConfigUtils", "enableTinyAppPermissionCheck, " + e.getMessage(), e);
        }
        return false;
    }

    @JvmStatic
    public static final boolean F() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3eff1d1", new Object[0])).booleanValue() : a(com.taobao.themis.kernel.i.GROUP_THEMIS_COMMON_CONFIG, "enableTinyAppPermissionCheck", (Boolean) true);
    }

    @JvmStatic
    public static final boolean G() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3fe0952", new Object[0])).booleanValue() : a(com.taobao.themis.kernel.i.GROUP_THEMIS_COMMON_CONFIG, "enableGameFullScreen", (Boolean) true);
    }

    @JvmStatic
    public static final boolean H() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("40c20d3", new Object[0])).booleanValue() : a(com.taobao.themis.kernel.i.GROUP_THEMIS_COMMON_CONFIG, "enableMixFullScreen", (Boolean) true);
    }

    @JvmStatic
    public static final boolean J() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4284fd5", new Object[0])).booleanValue() : a(com.taobao.themis.kernel.i.GROUP_THEMIS_COMMON_CONFIG, "enablePubSubPage", (Boolean) true);
    }

    @JvmStatic
    public static final boolean K() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4366756", new Object[0])).booleanValue() : b(com.taobao.themis.kernel.i.GROUP_THEMIS_COMMON_CONFIG, "enableOptimizedStartupV1", (Boolean) true);
    }

    @JvmStatic
    public static final boolean af() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab38f630", new Object[0])).booleanValue() : b(com.taobao.themis.kernel.i.GROUP_THEMIS_COMMON_CONFIG, "enableShowDowngradeTips", (Boolean) false);
    }

    @JvmStatic
    public static final boolean ax() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ac369d42", new Object[0])).booleanValue() : b(com.taobao.themis.kernel.i.GROUP_THEMIS_COMMON_CONFIG, "enableShowUpgradeTips", (Boolean) true);
    }

    public final String L() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a6fe962d", new Object[]{this}) : a(com.taobao.themis.kernel.i.GROUP_TRIVER_COMMON_CONFIG, "cardCouponUrl", "https://pages.tmall.com/wow/a/act/tmall/dailygroup/1318/upr?wh_pid=daily-186059&wh_weex=false&");
    }

    public final String M() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2d8450cc", new Object[]{this}) : a(com.taobao.themis.kernel.i.GROUP_TRIVER_COMMON_CONFIG, "cardCouponUrl", "http://tm.m.taobao.com/order/order_detail.htm?");
    }

    public final String N() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b40a0b6b", new Object[]{this}) : a(com.taobao.themis.kernel.i.GROUP_TRIVER_COMMON_CONFIG, "cardCouponUrl", "http://tm.m.taobao.com/list.htm?");
    }

    public final String O() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3a8fc60a", new Object[]{this}) : a(com.taobao.themis.kernel.i.GROUP_TRIVER_COMMON_CONFIG, "cardCouponUrl", "https://huodong.m.taobao.com/act/talent/live.html?screenOrientation=landscape&");
    }

    @JvmStatic
    public static final boolean P() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("47cdcdb", new Object[0])).booleanValue() : a(com.taobao.themis.kernel.i.GROUP_THEMIS_COMMON_CONFIG, "enableParseTemplate", (Boolean) true);
    }

    @JvmStatic
    public static final boolean Q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("48af45c", new Object[0])).booleanValue() : a(com.taobao.themis.kernel.i.GROUP_THEMIS_COMMON_CONFIG, "enableFixJumpingBack", (Boolean) true);
    }

    @JvmStatic
    public static final boolean R() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4990bdd", new Object[0])).booleanValue() : a(com.taobao.themis.kernel.i.GROUP_THEMIS_COMMON_CONFIG, "enableCanvasInitStep", (Boolean) true);
    }

    @JvmStatic
    public static final boolean S() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4a7235e", new Object[0])).booleanValue() : a(com.taobao.themis.kernel.i.GROUP_THEMIS_COMMON_CONFIG, "enableAudioSingleTimer", (Boolean) true);
    }

    @JvmStatic
    public static final String V() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e837e063", new Object[0]) : a(com.taobao.themis.kernel.i.GROUP_THEMIS_COMMON_CONFIG, "getPubRecommendIconChangeGuideUrl", "https://meta.m.taobao.com/app/tbhome/iconpop/newhomeiconreplace?wh_weex=true&weex_mode=dom&wx_navbar_hidden=true&wx_navbar_transparent=true&_wx_statusbar_hidden=true&renderType=2&wx_opaque=0&is_loading=0");
    }

    @JvmStatic
    public static final boolean W() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4df8162", new Object[0])).booleanValue() : a(com.taobao.themis.kernel.i.GROUP_THEMIS_COMMON_CONFIG, "enableInheritDocumentTitle", (Boolean) true);
    }

    @JvmStatic
    public static final boolean e(String appId) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1c6cb13a", new Object[]{appId})).booleanValue();
        }
        kotlin.jvm.internal.q.d(appId, "appId");
        if (!a(com.taobao.themis.kernel.i.GROUP_ARIVER_COMMON_CONFIG, "enableShouldOverrideUrlLoading", (Boolean) true)) {
            return false;
        }
        String b = b(com.taobao.themis.kernel.i.GROUP_ARIVER_COMMON_CONFIG, "enableShouldOverrideUrlLoadingBlackList", "");
        return (b == null || b.length() == 0) || !kotlin.text.n.b((CharSequence) b, (CharSequence) appId, false, 2, (Object) null);
    }

    public final boolean s() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("66a137e", new Object[]{this})).booleanValue() : a(com.taobao.themis.kernel.i.GROUP_THEMIS_COMMON_CONFIG, "enableManifestPreloadV2", (Boolean) false);
    }

    public final int bY() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ac369d31", new Object[]{this})).intValue() : a(com.taobao.themis.kernel.i.GROUP_THEMIS_COMMON_CONFIG, "getManifestPreloadShuffleTime", 600);
    }

    public final String bZ() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("694b75c1", new Object[]{this}) : a(com.taobao.themis.kernel.i.GROUP_THEMIS_COMMON_CONFIG, "manifestPreloadUrl", "https://app-manifest.m.taobao.com/wow/z/uniapp/");
    }

    public final boolean am() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab9b9ab7", new Object[]{this})).booleanValue() : a(com.taobao.themis.kernel.i.GROUP_THEMIS_COMMON_CONFIG, "enableUpdateManifestFromZCache", (Boolean) false);
    }

    public final String bC() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5347b178", new Object[]{this}) : a(com.taobao.themis.kernel.i.GROUP_THEMIS_COMMON_CONFIG, "ZCacheManifestMockUrl", "");
    }

    @JvmStatic
    public static final int al() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ab8d8325", new Object[0])).intValue() : a(com.taobao.themis.kernel.i.GROUP_THEMIS_COMMON_CONFIG, "lastVisitManifestDuration", (int) RemoteMessageConst.MAX_TTL);
    }

    public final boolean bD() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab0eafad", new Object[]{this})).booleanValue() : a(com.taobao.themis.kernel.i.GROUP_THEMIS_COMMON_CONFIG, "enableSaveDeprecatedVersion", (Boolean) true);
    }

    public final boolean X() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4ed98e3", new Object[]{this})).booleanValue() : a(com.taobao.themis.kernel.i.GROUP_THEMIS_COMMON_CONFIG, "disableBringFavorActionToCenter", (Boolean) true);
    }

    @JvmStatic
    public static final boolean I() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("41a3854", new Object[0])).booleanValue() : a(com.taobao.themis.kernel.i.GROUP_THEMIS_COMMON_CONFIG, "enableRecheckH5Url", (Boolean) true);
    }

    @JvmStatic
    public static final boolean bE() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab1cc72e", new Object[0])).booleanValue() : a(com.taobao.themis.kernel.i.GROUP_THEMIS_COMMON_CONFIG, "enableUniAppPrefetchV2", (Boolean) true);
    }

    @JvmStatic
    public static final String aj() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("87758670", new Object[0]) : a(com.taobao.themis.kernel.metaInfo.appinfo.cacheConfig.b.GROUP_UNI_APP_WEEX_THEMIS_CONFIG, com.taobao.themis.kernel.metaInfo.appinfo.cacheConfig.b.KEY_UNI_APP_WEEX_MODULE_WHITE_LIST, "windvane,weexdebug,stream");
    }

    @JvmStatic
    public static final String au() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4f348b45", new Object[0]) : a(com.taobao.themis.kernel.metaInfo.appinfo.cacheConfig.b.GROUP_UNI_APP_WEEX_THEMIS_CONFIG, com.taobao.themis.kernel.metaInfo.appinfo.cacheConfig.b.KEY_UNI_APP_WEEX_LAYOUT_NG_WHITE_LIST, "tb-trade/supercart/chaoshi_cart");
    }

    @JvmStatic
    public static final boolean Z() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("509c7e5", new Object[0])).booleanValue() : a(com.taobao.themis.kernel.i.GROUP_THEMIS_COMMON_CONFIG, "enableAutoSPM", (Boolean) true);
    }

    @JvmStatic
    public static final boolean U() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4c35260", new Object[0])).booleanValue() : a(com.taobao.themis.kernel.i.GROUP_THEMIS_COMMON_CONFIG, "useMegaAudio", (Boolean) false);
    }

    @JvmStatic
    public static final boolean g(String appId) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b0cfe3bc", new Object[]{appId})).booleanValue();
        }
        kotlin.jvm.internal.q.d(appId, "appId");
        String b = b(com.taobao.themis.kernel.i.GROUP_THEMIS_COMMON_CONFIG, "enableIgnore2006List", "");
        return !(b == null || b.length() == 0) && kotlin.text.n.b((CharSequence) b, (CharSequence) appId, false, 2, (Object) null);
    }

    @JvmStatic
    public static final boolean f(String appId) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("669e4a7b", new Object[]{appId})).booleanValue();
        }
        kotlin.jvm.internal.q.d(appId, "appId");
        if (appId.length() == 0) {
            return false;
        }
        JSONArray jSONArray = null;
        try {
            String b = b(com.taobao.themis.kernel.i.ORANGE_GROUP_TRIVER_WHITE_LIST_CONFIG, "closeWindowAccessList", "");
            if (!StringUtils.isEmpty(b)) {
                jSONArray = JSON.parseArray(b);
                jSONArray.add("3000000083541514");
                jSONArray.add("22129413");
            }
            if (jSONArray != null) {
                if (jSONArray.contains(appId)) {
                    return true;
                }
            }
        } catch (Exception e) {
            TMSLogger.b("TMSConfigUtils", "checkCloseWindowAccessList, " + e.getMessage(), e);
        }
        return false;
    }

    @JvmStatic
    public static final boolean ag() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab470db1", new Object[0])).booleanValue() : a(com.taobao.themis.kernel.i.GROUP_THEMIS_COMMON_CONFIG, "enableForbidMuteApi", (Boolean) false);
    }

    @JvmStatic
    public static final boolean ah() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab552532", new Object[0])).booleanValue() : a(com.taobao.themis.kernel.i.GROUP_THEMIS_COMMON_CONFIG, "enablePhaDocumentPrefetch", (Boolean) true);
    }

    @JvmStatic
    public static final boolean ai() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab633cb3", new Object[0])).booleanValue() : a(com.taobao.themis.kernel.i.GROUP_THEMIS_COMMON_CONFIG, "enableTinyAppWebPreRender", (Boolean) true);
    }

    @JvmStatic
    public static final boolean an() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("aba9b238", new Object[0])).booleanValue() : a(com.taobao.themis.kernel.i.GROUP_THEMIS_COMMON_CONFIG, "enableAspectFixRatio", (Boolean) true);
    }

    @JvmStatic
    public static final boolean ao() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("abb7c9b9", new Object[0])).booleanValue() : a(com.taobao.themis.kernel.i.GROUP_THEMIS_COMMON_CONFIG, "enableFoldRelaunch", (Boolean) true);
    }

    @JvmStatic
    public static final boolean ac() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab0eafad", new Object[0])).booleanValue() : a(com.taobao.themis.kernel.i.GROUP_THEMIS_COMMON_CONFIG, "enableMegaStorage", (Boolean) true);
    }

    @JvmStatic
    public static final boolean aB() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a93da80c", new Object[0])).booleanValue() : a(com.taobao.themis.kernel.i.GROUP_THEMIS_COMMON_CONFIG, "enableReportRum", (Boolean) true);
    }

    @JvmStatic
    public static final boolean aq() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("abd3f8bb", new Object[0])).booleanValue() : a(com.taobao.themis.kernel.i.GROUP_THEMIS_COMMON_CONFIG, "enableSafeAreaTop", (Boolean) true);
    }

    @JvmStatic
    public static final boolean ar() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("abe2103c", new Object[0])).booleanValue() : a(com.taobao.themis.kernel.i.GROUP_THEMIS_COMMON_CONFIG, "enableAbilityHubNameSpaceUseCanvas", (Boolean) true);
    }

    @JvmStatic
    public static final boolean av() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ac1a6e40", new Object[0])).booleanValue() : a(com.taobao.themis.kernel.i.ORANGE_GROUP_THEMIS_WHITE_LIST_CONFIG, "enableFragmentBearThemis", (Boolean) true);
    }

    @JvmStatic
    public static final boolean aw() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ac2885c1", new Object[0])).booleanValue() : a(com.taobao.themis.kernel.i.GROUP_THEMIS_COMMON_CONFIG, "enableChangeUA", (Boolean) true);
    }

    @JvmStatic
    public static final boolean at() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("abfe3f3e", new Object[0])).booleanValue() : a(com.taobao.themis.kernel.i.GROUP_THEMIS_COMMON_CONFIG, "enablePageOrientation", (Boolean) true);
    }

    @JvmStatic
    public static final boolean ay() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ac44b4c3", new Object[0])).booleanValue() : a(com.taobao.themis.kernel.i.GROUP_THEMIS_COMMON_CONFIG, "enableModifyAbilityHubCallback", (Boolean) true);
    }

    @JvmStatic
    public static final boolean az() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ac52cc44", new Object[0])).booleanValue() : a(com.taobao.themis.kernel.i.GROUP_THEMIS_COMMON_CONFIG, "enableInjectBuiltinVariable", (Boolean) true);
    }

    @JvmStatic
    public static final boolean aA() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a92f908b", new Object[0])).booleanValue() : a(com.taobao.themis.kernel.i.GROUP_THEMIS_COMMON_CONFIG, "enableUniApp", (Boolean) true);
    }

    @JvmStatic
    public static final boolean ab() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab00982c", new Object[0])).booleanValue() : a(com.taobao.themis.kernel.i.GROUP_THEMIS_COMMON_CONFIG, "enableAdjustTitlePosEnv", (Boolean) true);
    }

    @JvmStatic
    public static final boolean h(String name) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fb017cfd", new Object[]{name})).booleanValue();
        }
        kotlin.jvm.internal.q.d(name, "name");
        return kotlin.text.n.b((CharSequence) b(com.taobao.themis.kernel.i.GROUP_THEMIS_COMMON_CONFIG, "themis_launch_black_list", "null"), (CharSequence) name, false, 2, (Object) null);
    }

    @JvmStatic
    public static final String aE() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("16218d75", new Object[0]) : b(com.taobao.themis.kernel.i.GROUP_THEMIS_COMMON_CONFIG, "uniAppBlackListV2", "null");
    }

    public final int aC() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a94bbf7c", new Object[]{this})).intValue() : a(com.taobao.themis.kernel.i.GROUP_WIDGET_COMMOM_CONFIG, "getMaxEngineInstance", 5);
    }

    @JvmStatic
    public static final String aa() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ccc1f6d9", new Object[0]) : a(com.taobao.themis.kernel.i.GROUP_THEMIS_COMMON_CONFIG, "themis_domain_white_list", "");
    }

    @JvmStatic
    public static final boolean as() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("abf027bd", new Object[0])).booleanValue() : a(com.taobao.themis.kernel.i.GROUP_THEMIS_COMMON_CONFIG, "enableFoldOrPadAutoRotation", (Boolean) true);
    }

    @JvmStatic
    public static final boolean Y() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4fbb064", new Object[0])).booleanValue() : a(com.taobao.themis.kernel.i.GROUP_THEMIS_COMMON_CONFIG, "enableThemisH5LegacyErrorView", (Boolean) true);
    }

    public final boolean aF() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a9760610", new Object[]{this})).booleanValue() : a(com.taobao.themis.kernel.i.GROUP_THEMIS_COMMON_CONFIG, "enableReloadButton", (Boolean) true);
    }

    public final boolean r() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("65bfbfd", new Object[]{this})).booleanValue() : a(com.taobao.themis.kernel.i.GROUP_THEMIS_COMMON_CONFIG, "enableUniAppReloadButton", (Boolean) true);
    }

    public final boolean aG() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a9841d91", new Object[]{this})).booleanValue() : a(com.taobao.themis.kernel.i.GROUP_THEMIS_COMMON_CONFIG, "enableUniAppForceReloadV2", (Boolean) true);
    }

    @JvmStatic
    public static final boolean aH() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a9923512", new Object[0])).booleanValue() : a(com.taobao.themis.kernel.i.GROUP_THEMIS_COMMON_CONFIG, "enableNewAPPInfoDB", (Boolean) true);
    }

    @JvmStatic
    public static final boolean aN() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a9e6c218", new Object[0])).booleanValue() : a(com.taobao.themis.kernel.i.GROUP_THEMIS_COMMON_CONFIG, "enableMtopEnv", (Boolean) true);
    }

    @JvmStatic
    public static final boolean aI() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a9a04c93", new Object[0])).booleanValue() : a(com.taobao.themis.kernel.i.GROUP_THEMIS_COMMON_CONFIG, "fixMixTinyAppPreFetch", (Boolean) true);
    }

    @JvmStatic
    public static final boolean aJ() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a9ae6414", new Object[0])).booleanValue() : a(com.taobao.themis.kernel.i.GROUP_THEMIS_COMMON_CONFIG, "fixWeexBuiltinCssEnv", (Boolean) true);
    }

    @JvmStatic
    public static final boolean aK() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a9bc7b95", new Object[0])).booleanValue() : a(com.taobao.themis.kernel.i.GROUP_THEMIS_COMMON_CONFIG, "disableSinglePageModifyWindowOnResume", (Boolean) true);
    }

    @JvmStatic
    public static final boolean aL() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a9ca9316", new Object[0])).booleanValue() : a(com.taobao.themis.kernel.i.GROUP_THEMIS_COMMON_CONFIG, "enableGameLandScapeTitleBarHeight", (Boolean) true);
    }

    @JvmStatic
    public static final boolean aO() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a9f4d999", new Object[0])).booleanValue() : a(com.taobao.themis.kernel.i.GROUP_THEMIS_COMMON_CONFIG, "fixUniAppPubTitleColor", (Boolean) true);
    }

    @JvmStatic
    public static final boolean aQ() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("aa11089b", new Object[0])).booleanValue() : a(com.taobao.themis.kernel.i.GROUP_THEMIS_COMMON_CONFIG, "fixSwiperDocumentPreload", (Boolean) true);
    }

    @JvmStatic
    public static final boolean aR() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("aa1f201c", new Object[0])).booleanValue() : a(com.taobao.themis.kernel.i.GROUP_THEMIS_COMMON_CONFIG, "enableSkipAPMReport", (Boolean) true);
    }

    @JvmStatic
    public static final boolean aS() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("aa2d379d", new Object[0])).booleanValue() : b(com.taobao.themis.kernel.i.GROUP_THEMIS_COMMON_CONFIG, "enableWebViewAsyncLoad", (Boolean) true);
    }

    @JvmStatic
    public static final long aT() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("aa3b4f0e", new Object[0])).longValue() : a(com.taobao.themis.kernel.i.GROUP_THEMIS_COMMON_CONFIG, "waitUCReadyTimeout", 3000L);
    }

    @JvmStatic
    public static final boolean aU() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("aa49669f", new Object[0])).booleanValue() : a(com.taobao.themis.kernel.i.GROUP_THEMIS_COMMON_CONFIG, "enableAddUniAppPoints", (Boolean) true);
    }

    @JvmStatic
    public static final boolean aM() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a9d8aa97", new Object[0])).booleanValue() : a(com.taobao.themis.kernel.i.GROUP_THEMIS_COMMON_CONFIG, "enableFixBgColor", (Boolean) true);
    }

    @JvmStatic
    public static final boolean aV() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("aa577e20", new Object[0])).booleanValue() : a(com.taobao.themis.kernel.i.GROUP_THEMIS_COMMON_CONFIG, "enableFragmentDestroyView", (Boolean) true);
    }

    @JvmStatic
    public static final boolean aW() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("aa6595a1", new Object[0])).booleanValue() : a(com.taobao.themis.kernel.i.GROUP_THEMIS_COMMON_CONFIG, "forbidHideTinyAppTitleBar", (Boolean) false);
    }

    @JvmStatic
    public static final String T() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("db2c6b25", new Object[0]) : aH() ? TMSDBAdapter.APPINFO_TABLE : TMSDBAdapter.APPINFO_TABLE_OLD;
    }

    @JvmStatic
    public static final boolean aX() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("aa73ad22", new Object[0])).booleanValue() : a(com.taobao.themis.kernel.i.GROUP_THEMIS_COMMON_CONFIG, "enablePopPageExitContainer", (Boolean) true);
    }

    @JvmStatic
    public static final boolean aZ() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("aa8fdc24", new Object[0])).booleanValue() : a(com.taobao.themis.kernel.i.GROUP_THEMIS_COMMON_CONFIG, "enableFixManifestDefaultTitle", (Boolean) true);
    }

    @JvmStatic
    public static final boolean bc() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("acc3884c", new Object[0])).booleanValue() : a("homepage_switch", "enableNewMiniAppApi", (Boolean) false);
    }

    @JvmStatic
    public static final boolean bd() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("acd19fcd", new Object[0])).booleanValue() : a(com.taobao.themis.kernel.i.GROUP_THEMIS_COMMON_CONFIG, "enableUniAppPubShareUrl", (Boolean) true);
    }

    @JvmStatic
    public static final String ba() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("16f3901a", new Object[0]) : a(com.taobao.themis.kernel.i.GROUP_THEMIS_COMMON_CONFIG, "getPermissionCheckWhiteList", MediaConstant.DEFALUT_H265_HW_BLACK_LIST_FOR_DEGRADE_H264);
    }

    @JvmStatic
    public static final boolean bb() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("acb570cb", new Object[0])).booleanValue() : a(com.taobao.themis.kernel.i.GROUP_THEMIS_COMMON_CONFIG, "enableNavigateSpm", (Boolean) true);
    }

    @JvmStatic
    public static final String i(String appId) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c2e2d9a6", new Object[]{appId});
        }
        kotlin.jvm.internal.q.d(appId, "appId");
        return a(com.taobao.themis.kernel.i.GROUP_PHA_SWITCH_THEMIS_CONFIG, "appId_" + appId, "");
    }

    @JvmStatic
    public static final boolean be() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("acdfb74e", new Object[0])).booleanValue() : a(com.taobao.themis.kernel.i.GROUP_THEMIS_COMMON_CONFIG, "enableTabBarNumberChange", (Boolean) true);
    }

    @JvmStatic
    public static final boolean bf() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("acedcecf", new Object[0])).booleanValue() : a(com.taobao.themis.kernel.i.GROUP_WIDGET_COMMOM_CONFIG, "forceLayoutNGV2", (Boolean) true);
    }

    @JvmStatic
    public static final boolean bg() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("acfbe650", new Object[0])).booleanValue() : a(com.taobao.themis.kernel.i.GROUP_THEMIS_COMMON_CONFIG, "enableManifestVariable", (Boolean) true);
    }

    @JvmStatic
    public static final boolean bh() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ad09fdd1", new Object[0])).booleanValue() : b(com.taobao.themis.kernel.i.GROUP_THEMIS_COMMON_CONFIG, "enableReportCacheHitRate", (Boolean) true);
    }

    public final boolean l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[]{this})).booleanValue() : a(com.taobao.themis.kernel.i.GROUP_THEMIS_COMMON_CONFIG, "enableFixQueryEncodeV2", (Boolean) true);
    }

    @JvmStatic
    public static final boolean bj() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ad262cd3", new Object[0])).booleanValue() : a(com.taobao.themis.kernel.i.GROUP_THEMIS_COMMON_CONFIG, "enableMixPlayer", (Boolean) true);
    }

    @JvmStatic
    public static final String bk() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("582cda50", new Object[0]) : a(com.taobao.themis.kernel.i.GROUP_THEMIS_COMMON_CONFIG, "getGameStopServiceGuideUrl", "https://web.m.taobao.com/app/miniapp-biz/stop-service-announcement/announcement?wh_weex=true&weex_mode=dom&wx_navbar_hidden=true&wx_navbar_transparent=true&_wx_statusbar_hidden=true&renderType=2&wx_opaque=0&is_loading=0");
    }

    @JvmStatic
    public static final boolean bl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ad425bd5", new Object[0])).booleanValue() : a(com.taobao.themis.kernel.i.GROUP_THEMIS_COMMON_CONFIG, "enableH5UseDefaultTitleBar", (Boolean) true);
    }

    @JvmStatic
    public static final boolean cg() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("aeb0beef", new Object[0])).booleanValue() : a(com.taobao.themis.kernel.i.GROUP_THEMIS_COMMON_CONFIG, "enableSupportEmbedPageError", (Boolean) false);
    }

    @JvmStatic
    public static final boolean ch() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("aebed670", new Object[0])).booleanValue() : a(com.taobao.themis.kernel.i.GROUP_THEMIS_COMMON_CONFIG, "enableSupportTinyError", (Boolean) false);
    }

    @JvmStatic
    public static final boolean ci() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("aeccedf1", new Object[0])).booleanValue() : a(com.taobao.themis.kernel.i.GROUP_THEMIS_COMMON_CONFIG, "enableShowError", (Boolean) false);
    }

    @JvmStatic
    public static final boolean cj() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("aedb0572", new Object[0])).booleanValue() : a(com.taobao.themis.kernel.i.GROUP_THEMIS_COMMON_CONFIG, "enableShowErrorWidget", (Boolean) false);
    }

    @JvmStatic
    public static final boolean bm() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ad507356", new Object[0])).booleanValue() : a(com.taobao.themis.kernel.i.GROUP_THEMIS_COMMON_CONFIG, "enableSourceMap", (Boolean) true);
    }

    @JvmStatic
    public static final boolean bn() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ad5e8ad7", new Object[0])).booleanValue() : a(com.taobao.themis.kernel.i.GROUP_THEMIS_COMMON_CONFIG, "enablePubMenuNewInterface", (Boolean) false);
    }

    @JvmStatic
    public static final boolean bo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ad6ca258", new Object[0])).booleanValue() : a(com.taobao.themis.kernel.i.GROUP_THEMIS_COMMON_CONFIG, "enableSinglePageWebMetaGet", (Boolean) true);
    }

    @JvmStatic
    public static final boolean bp() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ad7ab9d9", new Object[0])).booleanValue() : a(com.taobao.themis.kernel.i.GROUP_THEMIS_COMMON_CONFIG, "enable_appinfo_force_update", (Boolean) true);
    }

    @JvmStatic
    public static final boolean bq() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ad88d15a", new Object[0])).booleanValue() : a(com.taobao.themis.kernel.i.GROUP_THEMIS_COMMON_CONFIG, "enableGameStopService", (Boolean) true);
    }

    @JvmStatic
    public static final boolean br() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ad96e8db", new Object[0])).booleanValue() : a(com.taobao.themis.kernel.i.GROUP_THEMIS_COMMON_CONFIG, "enableUniAppNavPrefetch", (Boolean) true);
    }

    @JvmStatic
    public static final boolean bs() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ada5005c", new Object[0])).booleanValue() : a(com.taobao.themis.kernel.i.GROUP_THEMIS_COMMON_CONFIG, "enableFixSwiperPagePreload", (Boolean) true);
    }

    @JvmStatic
    public static final String bt() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("12e069e7", new Object[0]) : a(com.taobao.themis.kernel.i.GROUP_THEMIS_COMMON_CONFIG, "preloadAPIWhiteList", "");
    }

    @JvmStatic
    public static final boolean bu() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("adc12f5e", new Object[0])).booleanValue() : a(com.taobao.themis.kernel.i.GROUP_THEMIS_COMMON_CONFIG, "enableSpecifyWebViewCoreV1", (Boolean) true);
    }

    @JvmStatic
    public static final String bv() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1febdf25", new Object[0]) : b(com.taobao.themis.kernel.i.GROUP_THEMIS_COMMON_CONFIG, "systemWebViewUrlListV1", "");
    }

    @JvmStatic
    public static final boolean bi() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ad181552", new Object[0])).booleanValue() : b(com.taobao.themis.kernel.i.GROUP_THEMIS_COMMON_CONFIG, "home_page_task_add_weex", (Boolean) true);
    }

    @JvmStatic
    public static final boolean j(String url) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8f64af7f", new Object[]{url})).booleanValue();
        }
        kotlin.jvm.internal.q.d(url, "url");
        ArrayList arrayList = new ArrayList();
        for (Object obj : kotlin.text.n.b((CharSequence) bv(), new String[]{","}, false, 0, 6, (Object) null)) {
            if (((String) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        ArrayList<String> arrayList2 = arrayList;
        if ((arrayList2 instanceof Collection) && arrayList2.isEmpty()) {
            return false;
        }
        for (String str : arrayList2) {
            if (kotlin.text.n.b((CharSequence) url, (CharSequence) str, false, 2, (Object) null)) {
                return true;
            }
        }
        return false;
    }

    @JvmStatic
    public static final boolean bw() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("addd5e60", new Object[0])).booleanValue() : a(com.taobao.themis.kernel.i.GROUP_THEMIS_COMMON_CONFIG, "enableFixMixUrlRepeatV2", (Boolean) true);
    }

    @JvmStatic
    public static final boolean bx() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("adeb75e1", new Object[0])).booleanValue() : b(com.taobao.themis.kernel.i.GROUP_THEMIS_COMMON_CONFIG, "enableManifestPreset", (Boolean) true);
    }

    @JvmStatic
    public static final boolean bz() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ae07a4e3", new Object[0])).booleanValue() : b(com.taobao.themis.kernel.i.GROUP_THEMIS_COMMON_CONFIG, "enableNewDefaultTitleBarStyle", (Boolean) true);
    }

    @JvmStatic
    public static final boolean bF() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab2adeaf", new Object[0])).booleanValue() : b(com.taobao.themis.kernel.i.GROUP_THEMIS_COMMON_CONFIG, "enableUseNavAdapter", (Boolean) true);
    }

    @JvmStatic
    public static final boolean bG() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab38f630", new Object[0])).booleanValue() : b(com.taobao.themis.kernel.i.GROUP_THEMIS_COMMON_CONFIG, "enableDowngradeUniAppWhenMainfestHasError", (Boolean) false);
    }

    @JvmStatic
    public static final boolean ak() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab7f6bb5", new Object[0])).booleanValue() : b(com.taobao.themis.kernel.i.GROUP_WIDGET_COMMOM_CONFIG, "enableWidgetReportMonitor", (Boolean) true);
    }

    @JvmStatic
    public static final boolean bB() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("aaf280ab", new Object[0])).booleanValue() : b(com.taobao.themis.kernel.i.GROUP_THEMIS_COMMON_CONFIG, "enableFixScopeAuthDiffs", (Boolean) true);
    }

    @JvmStatic
    public static final String p() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("91ccd489", new Object[0]) : b(com.taobao.themis.kernel.i.ORANGE_GROUP_THEMIS_GRAPHICS_COMMON, "gameV8BlackList", "");
    }

    @JvmStatic
    public static final boolean ad() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab1cc72e", new Object[0])).booleanValue() : b(com.taobao.themis.kernel.i.ORANGE_GROUP_THEMIS_GRAPHICS_COMMON, "enableV8JSRuntime", (Boolean) false);
    }

    @JvmStatic
    public static final String ae() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e6d8e155", new Object[0]) : b(com.taobao.themis.kernel.i.ORANGE_GROUP_THEMIS_GRAPHICS_COMMON, "gameV8WhiteList", "");
    }

    @JvmStatic
    public static final boolean bH() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab470db1", new Object[0])).booleanValue() : b(com.taobao.themis.kernel.i.GROUP_THEMIS_COMMON_CONFIG, "enableAppInfoDefaultCache", (Boolean) true);
    }

    @JvmStatic
    public static final boolean bI() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab552532", new Object[0])).booleanValue() : b(com.taobao.themis.kernel.i.GROUP_THEMIS_COMMON_CONFIG, "enableWaitWebReady", (Boolean) true);
    }

    public final boolean bJ() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab633cb3", new Object[]{this})).booleanValue() : b(com.taobao.themis.kernel.i.GROUP_THEMIS_COMMON_CONFIG, "enableReplaceCompatWithDowngradeWhenUrlInvalid", (Boolean) true);
    }

    @JvmStatic
    public static final boolean bK() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab715434", new Object[0])).booleanValue() : b(com.taobao.themis.kernel.i.GROUP_THEMIS_COMMON_CONFIG, "disableDowngradeOriginUrlMisMatchManifestUrl", (Boolean) true);
    }

    public final boolean bL() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab7f6bb5", new Object[]{this})).booleanValue() : a(com.taobao.themis.kernel.i.GROUP_THEMIS_COMMON_CONFIG, "enableCheckPageVersion", (Boolean) true);
    }

    @JvmStatic
    public static final boolean bN() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab9b9ab7", new Object[0])).booleanValue() : b(com.taobao.themis.kernel.i.ORANGE_GROUP_THEMIS_WHITE_LIST_CONFIG, "enableInterceptorPageClosePermissionControl", (Boolean) false);
    }

    @JvmStatic
    public static final boolean k(String uniAppId) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d99648c0", new Object[]{uniAppId})).booleanValue();
        }
        kotlin.jvm.internal.q.d(uniAppId, "uniAppId");
        for (String str : kotlin.text.n.b((CharSequence) b(com.taobao.themis.kernel.i.ORANGE_GROUP_THEMIS_WHITE_LIST_CONFIG, "pageCloseInterceptorWhiteListWithUniApp", ""), new String[]{","}, false, 0, 6, (Object) null)) {
            if (kotlin.text.n.b((CharSequence) str, (CharSequence) uniAppId, false, 2, (Object) null)) {
                return true;
            }
        }
        return false;
    }

    @JvmStatic
    public static final boolean l(String url) {
        List a2;
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("23c7e201", new Object[]{url})).booleanValue();
        }
        kotlin.jvm.internal.q.d(url, "url");
        try {
            String b = b(com.taobao.themis.kernel.i.ORANGE_GROUP_THEMIS_WHITE_LIST_CONFIG, "pageCloseInterceptorWhiteListWithSinglePage", "");
            if (b.length() == 0) {
                return false;
            }
            if (kotlin.jvm.internal.q.a((Object) b, (Object) "*")) {
                return true;
            }
            List<String> split = new Regex(",").split(b, 0);
            if (!split.isEmpty()) {
                ListIterator<String> listIterator = split.listIterator(split.size());
                while (listIterator.hasPrevious()) {
                    if (listIterator.previous().length() == 0) {
                        z = true;
                        continue;
                    } else {
                        z = false;
                        continue;
                    }
                    if (!z) {
                        a2 = p.c(split, listIterator.nextIndex() + 1);
                        break;
                    }
                }
            }
            a2 = p.a();
            Object[] array = a2.toArray(new String[0]);
            if (array != null) {
                for (String str : (String[]) array) {
                    if (kotlin.text.n.b((CharSequence) url, (CharSequence) str, false, 2, (Object) null)) {
                        return true;
                    }
                }
                return false;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        } catch (Throwable unused) {
            return false;
        }
    }

    @JvmStatic
    public static final boolean aD() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a959d70e", new Object[0])).booleanValue() : b(com.taobao.themis.kernel.i.GROUP_THEMIS_COMMON_CONFIG, "enableGameAPIDomainWhiteListController", (Boolean) false);
    }

    @JvmStatic
    public static final boolean bA() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("aae4692a", new Object[0])).booleanValue() : b(com.taobao.themis.kernel.i.GROUP_THEMIS_COMMON_CONFIG, "enableGameSendMtopCustomHeader", (Boolean) true);
    }

    @JvmStatic
    public static final boolean bO() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("aba9b238", new Object[0])).booleanValue() : b(com.taobao.themis.kernel.i.GROUP_THEMIS_COMMON_CONFIG, "enableWidgetLazyInit", (Boolean) true);
    }

    @JvmStatic
    public static final boolean bP() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("abb7c9b9", new Object[0])).booleanValue() : b(com.taobao.themis.kernel.i.GROUP_THEMIS_COMMON_CONFIG, "enableAddIgnoreQueries", (Boolean) true);
    }

    @JvmStatic
    public static final boolean bQ() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("abc5e13a", new Object[0])).booleanValue() : b(com.taobao.themis.kernel.i.GROUP_THEMIS_COMMON_CONFIG, "enableSwitchWebEngineExp", (Boolean) true);
    }

    public final boolean ap() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("abc5e13a", new Object[]{this})).booleanValue() : b(com.taobao.themis.kernel.i.GROUP_THEMIS_COMMON_CONFIG, "enableManifestAsyncTaskOpt", (Boolean) true);
    }

    public final boolean ca() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ae5c31e9", new Object[]{this})).booleanValue() : b(com.taobao.themis.kernel.i.GROUP_THEMIS_COMMON_CONFIG, "enableGameForceUpdate", (Boolean) false);
    }

    @JvmStatic
    public static final boolean aP() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("aa02f11a", new Object[0])).booleanValue() : b(com.taobao.themis.kernel.i.GROUP_THEMIS_COMMON_CONFIG, "enableOptGMAsyncAPI", (Boolean) true);
    }

    @JvmStatic
    public static final boolean aY() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("aa81c4a3", new Object[0])).booleanValue() : b(com.taobao.themis.kernel.i.GROUP_THEMIS_COMMON_CONFIG, "enableOptGMSyncAPI", (Boolean) true);
    }

    @JvmStatic
    public static final boolean by() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("adf98d62", new Object[0])).booleanValue() : b(com.taobao.themis.kernel.i.GROUP_THEMIS_COMMON_CONFIG, "enableFixUniAppImmersive", (Boolean) true);
    }

    @JvmStatic
    public static final boolean bM() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab8d8336", new Object[0])).booleanValue() : b(com.taobao.themis.kernel.i.GROUP_THEMIS_COMMON_CONFIG, "enableSwiperSubPageQuery", (Boolean) true);
    }

    @JvmStatic
    public static final boolean bR() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("abd3f8bb", new Object[0])).booleanValue() : b(com.taobao.themis.kernel.i.GROUP_THEMIS_COMMON_CONFIG, "enableNavNonHttpUrl", (Boolean) false);
    }

    @JvmStatic
    public static final boolean bS() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("abe2103c", new Object[0])).booleanValue() : b(com.taobao.themis.kernel.i.GROUP_THEMIS_COMMON_CONFIG, "enableFixSwiperTitleBar", (Boolean) false);
    }

    @JvmStatic
    public static final boolean bT() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("abf027bd", new Object[0])).booleanValue() : b(com.taobao.themis.kernel.i.GROUP_THEMIS_COMMON_CONFIG, "enableUseGetRealPage", (Boolean) true);
    }

    @JvmStatic
    public static final boolean bU() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("abfe3f3e", new Object[0])).booleanValue() : b(com.taobao.themis.kernel.i.GROUP_THEMIS_COMMON_CONFIG, "enableFixLifeCycle", (Boolean) true);
    }

    @JvmStatic
    public static final boolean bV() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ac0c56bf", new Object[0])).booleanValue() : b(com.taobao.themis.kernel.i.GROUP_THEMIS_COMMON_CONFIG, "enableOptLifeCycleSticky", (Boolean) true);
    }

    @JvmStatic
    public static final boolean bW() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ac1a6e40", new Object[0])).booleanValue() : b(com.taobao.themis.kernel.i.GROUP_THEMIS_COMMON_CONFIG, "enableOptGMAPISerialize", (Boolean) true);
    }

    @JvmStatic
    public static final boolean bX() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ac2885c1", new Object[0])).booleanValue() : b(com.taobao.themis.kernel.i.GROUP_THEMIS_COMMON_CONFIG, "enableRUMExtension", (Boolean) true);
    }

    @JvmStatic
    public static final boolean cb() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ae6a496a", new Object[0])).booleanValue() : b(com.taobao.themis.kernel.i.GROUP_THEMIS_COMMON_CONFIG, "enableFixRunScene", (Boolean) true);
    }

    @JvmStatic
    public static final boolean cc() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ae7860eb", new Object[0])).booleanValue() : a(com.taobao.themis.kernel.i.GROUP_THEMIS_COMMON_CONFIG, "enableFixCanvasProviderWasCovered", (Boolean) true);
    }

    public final boolean cd() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ae86786c", new Object[]{this})).booleanValue() : a(com.taobao.themis.kernel.i.GROUP_THEMIS_COMMON_CONFIG, "enableManifestPreloadUrl", (Boolean) false);
    }

    @JvmStatic
    public static final boolean ce() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ae948fed", new Object[0])).booleanValue() : a(com.taobao.themis.kernel.i.GROUP_THEMIS_COMMON_CONFIG, "enableUTSubPageUrlFix", (Boolean) true);
    }

    @JvmStatic
    public static final boolean cf() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("aea2a76e", new Object[0])).booleanValue() : a(com.taobao.themis.kernel.i.GROUP_THEMIS_COMMON_CONFIG, "enableFixUniAppDocumentNotHit", (Boolean) true);
    }
}
