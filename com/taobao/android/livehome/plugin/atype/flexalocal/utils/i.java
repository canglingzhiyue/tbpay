package com.taobao.android.livehome.plugin.atype.flexalocal.utils;

import android.content.Context;
import android.taobao.mulitenv.EnvironmentSwitcher;
import com.alipay.mobile.intelligentdecision.model.IDecisionResult;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import mtopsdk.mtop.domain.EnvModeEnum;
import tb.kge;
import tb.pro;

/* loaded from: classes6.dex */
public class i {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-53072315);
    }

    public static boolean D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3d3c2cf", new Object[0])).booleanValue();
        }
        if (!c.d()) {
            return true;
        }
        return pro.d(OrangeConfig.getInstance().getConfig("tblive", "EnableLowDeviceAutoJellyMarquee", "false"));
    }

    public static boolean E() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3e1da50", new Object[0])).booleanValue() : pro.d(OrangeConfig.getInstance().getConfig("tblive", "enableWhenNullClearImgJellyMarquee", "false"));
    }

    public static boolean F() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3eff1d1", new Object[0])).booleanValue() : pro.d(OrangeConfig.getInstance().getConfig("tblive", "enableFlexibleLayoutInflater", "false"));
    }

    public static boolean k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[0])).booleanValue() : pro.d(OrangeConfig.getInstance().getConfig("tblive", "enableSingleLiveTab", "true"));
    }

    public static String l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("77b5ea0d", new Object[0]) : OrangeConfig.getInstance().getConfig("tblive", "enableAddH5Tab", "true");
    }

    public static boolean t() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6782aff", new Object[0])).booleanValue() : pro.d(OrangeConfig.getInstance().getConfig("tblive", "enableMixNavInterceptor", "true"));
    }

    public static boolean u() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6864280", new Object[0])).booleanValue() : pro.d(OrangeConfig.getInstance().getConfig("tblive", "enableMixPreLoad", "true"));
    }

    public static boolean v() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6945a01", new Object[0])).booleanValue() : pro.d(OrangeConfig.getInstance().getConfig("tblive", "enableAliveChanel", "false"));
    }

    public static boolean w() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6a27182", new Object[0])).booleanValue() : pro.d(OrangeConfig.getInstance().getConfig("tblive", "enableKandianRecover", "true"));
    }

    public static boolean x() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6b08903", new Object[0])).booleanValue() : pro.d(OrangeConfig.getInstance().getConfig("tblive", "enableFixMixNotStart", "true"));
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : pro.d(OrangeConfig.getInstance().getConfig("tblive", "enableAddEntryLiveSource", "true"));
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[0])).booleanValue() : pro.d(OrangeConfig.getInstance().getConfig("tblive", "enableMarkingTab", "true"));
    }

    public static String f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("50938a53", new Object[0]) : OrangeConfig.getInstance().getConfig("tblive", "homeSearchEntryTips", "输入要寻找的内容");
    }

    public static boolean z() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6ccb805", new Object[0])).booleanValue() : pro.d(OrangeConfig.getInstance().getConfig("tblive", "enableMixLiveHorizontalScrollDisable", "true"));
    }

    public static boolean C() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3c5ab4e", new Object[0])).booleanValue() : pro.d(OrangeConfig.getInstance().getConfig("tblive", "enableFistPageOffsetReset", "true"));
    }

    public static boolean G() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3fe0952", new Object[0])).booleanValue() : pro.d(OrangeConfig.getInstance().getConfig("tblive", "bugfixUpdateFollowStatus", "true"));
    }

    public static boolean H() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("40c20d3", new Object[0])).booleanValue() : pro.d(OrangeConfig.getInstance().getConfig("tblive", "channelHomeTabClickedToRefreshData", "true"));
    }

    public static float I() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("41a3840", new Object[0])).floatValue() : pro.c(OrangeConfig.getInstance().getConfig("tblive", "channelRefreshIntervalWhenHomeTabClicked", "0.5"));
    }

    public static long A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3a97c3c", new Object[0])).longValue();
        }
        long b = pro.b(OrangeConfig.getInstance().getConfig("tblive", "channelJellyMarqueeScrollInterval", IDecisionResult.ENGINE_ERROR));
        if (b > 0) {
            return b;
        }
        return 5000L;
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue() : pro.d(OrangeConfig.getInstance().getConfig("tblive", "enableScrollUpdateAlpha", "false"));
    }

    public static boolean J() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4284fd5", new Object[0])).booleanValue() : pro.d(OrangeConfig.getInstance().getConfig("tblive", "enableHncccRefreshUpdateAlpha", "false"));
    }

    public static boolean B() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3b793cd", new Object[0])).booleanValue() : pro.d(OrangeConfig.getInstance().getConfig("tblive", "enableRefreshBottomTab", "true"));
    }

    public static boolean M() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4529658", new Object[0])).booleanValue() : pro.d(OrangeConfig.getInstance().getConfig("tblive", "enableSystemGesturesBottom", "true"));
    }

    public static boolean N() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("460add9", new Object[0])).booleanValue() : pro.d(OrangeConfig.getInstance().getConfig("tblive", "enableBottomTabSubscript", "true"));
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : pro.d(OrangeConfig.getInstance().getConfig("tblive", "enableSmartLandingEntryFix", "true"));
    }

    public static boolean o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("631b57a", new Object[0])).booleanValue() : pro.d(OrangeConfig.getInstance().getConfig("tblive", "enableFollowRefreshToTop", "false"));
    }

    public static boolean O() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("46ec55a", new Object[0])).booleanValue() : pro.d(OrangeConfig.getInstance().getConfig("tblive", "enableSelectRefreshToTop", "false"));
    }

    public static boolean P() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("47cdcdb", new Object[0])).booleanValue() : pro.d(OrangeConfig.getInstance().getConfig("tblive", "enableLiveBackInsertCardNew", "true"));
    }

    public static boolean Q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("48af45c", new Object[0])).booleanValue() : pro.d(OrangeConfig.getInstance().getConfig("tblive", "enableDXEngineConfigImageQuality", "true"));
    }

    public static boolean R() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4990bdd", new Object[0])).booleanValue() : pro.d(OrangeConfig.getInstance().getConfig("tblive", "closeDXEngineConfigFullTrace", "true"));
    }

    public static boolean S() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4a7235e", new Object[0])).booleanValue() : pro.d(OrangeConfig.getInstance().getConfig("tblive", "enableTvCardLoadDefaultImg0808", "true"));
    }

    public static String p() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("91ccd489", new Object[0]) : OrangeConfig.getInstance().getConfig("tblive", "tblHomeImageViewUserIds", "tblivevideoimageview,tbliveimageview_normal,tbliveimageview_pad,tblHomePageItemPicImg_normal,tblHomePageItemPicImg_atmosphere");
    }

    public static boolean q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("64de47c", new Object[0])).booleanValue() : pro.d(OrangeConfig.getInstance().getConfig("tblive", "enableDelayWriteImageCache", "true"));
    }

    public static boolean s() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("66a137e", new Object[0])).booleanValue() : pro.d(OrangeConfig.getInstance().getConfig("tblive", "enableDXContainerPreLoad", "true"));
    }

    public static boolean a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{context})).booleanValue();
        }
        if (!pro.d(OrangeConfig.getInstance().getConfig("tblive", "enableH5Search1", "true"))) {
            return false;
        }
        return a.a();
    }

    public static String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d71944f2", new Object[0]);
        }
        if (EnvironmentSwitcher.a() == EnvModeEnum.PREPARE.getEnvMode()) {
            return OrangeConfig.getInstance().getConfig("tblive", "H5SearchPreUrl", "https://pre-pages-fast.m.taobao.com/wow/z/app/mtb/live-search-pages/home?x-ssr=true&forceThemis=true&disableNav=YES&disableProgress=true&status_bar_transparent=true&largescreenstyle=fullscreen&nativeKeyboard=true");
        }
        return OrangeConfig.getInstance().getConfig("tblive", "H5SearchUrl", "https://pages-fast.m.taobao.com/wow/z/app/mtb/live-search-pages/home?x-ssr=true&forceThemis=true&disableNav=YES&disableProgress=true&status_bar_transparent=true&largescreenstyle=fullscreen&nativeKeyboard=true");
    }

    public static boolean h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[0])).booleanValue() : pro.d(OrangeConfig.getInstance().getConfig("tblive", "enableABTestWhiteList", "true")) || c.j();
    }

    public static boolean i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[0])).booleanValue() : pro.d(OrangeConfig.getInstance().getConfig("tblive", "enableChannelPlayABType", "true"));
    }

    public static boolean j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[0])).booleanValue() : pro.d(OrangeConfig.getInstance().getConfig("tblive", "enableChannelMiddleDevicePlay", "true"));
    }

    public static int m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6158667", new Object[0])).intValue() : pro.a(OrangeConfig.getInstance().getConfig("tblive", "channelPlayScrollSpeedRatio", "300"));
    }

    public static String n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("84c15f4b", new Object[0]) : OrangeConfig.getInstance().getConfig("tblive", "padOrFoldDevicePlayABValue", "scroll");
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[0])).booleanValue() : !c.d() && pro.d(OrangeConfig.getInstance().getConfig("tblive", "enableWalle4Back", "true")) && a.c();
    }

    public static int L() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4447ec6", new Object[0])).intValue() : pro.a(OrangeConfig.getInstance().getConfig("tblive", "walle4BackTime", "300"));
    }

    public static boolean y() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6bea084", new Object[0])).booleanValue() : pro.d(OrangeConfig.getInstance().getConfig("tblive", "enableWriteCacheHeadAreaCutData", "true"));
    }

    public static boolean K() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4366756", new Object[0])).booleanValue() : pro.d(OrangeConfig.getInstance().getConfig("tblive", "enableImagePreload", "true"));
    }

    public static boolean T() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4b53adf", new Object[0])).booleanValue() : pro.d(OrangeConfig.getInstance().getConfig("tblive", "enableCheckAppCompatActivity", "false"));
    }

    public static boolean U() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4c35260", new Object[0])).booleanValue() : pro.d(OrangeConfig.getInstance().getConfig("tblive", "enableWriteCacheDeleteHeadArea", "true"));
    }

    public static boolean V() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4d169e1", new Object[0])).booleanValue() : pro.d(OrangeConfig.getInstance().getConfig("tblive", "enableOptimizeWriteCache0717", "true"));
    }

    public static int W() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4df8151", new Object[0])).intValue() : pro.a(OrangeConfig.getInstance().getConfig("tblive", "enableWriteCacheFeedMaxCount", "12"));
    }

    public static boolean X() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4ed98e3", new Object[0])).booleanValue() : pro.d(OrangeConfig.getInstance().getConfig("tblive", "enableOptimize0731", "true"));
    }

    public static boolean r() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("65bfbfd", new Object[0])).booleanValue() : pro.d(OrangeConfig.getInstance().getConfig("tblive", "enableGetTabsSyncLowLevelDevice0918", "false"));
    }

    public static boolean Y() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4fbb064", new Object[0])).booleanValue() : pro.d(OrangeConfig.getInstance().getConfig("tblive", "enableGetTabsMiddleLevelDevice", "true"));
    }

    public static boolean Z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("509c7e5", new Object[0])).booleanValue();
        }
        if (!c.d()) {
            return false;
        }
        return pro.d(OrangeConfig.getInstance().getConfig("tblive", "enableClickResponseTimeOptimize", "false"));
    }

    public static boolean aa() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("aaf280ab", new Object[0])).booleanValue() : pro.d(OrangeConfig.getInstance().getConfig("tblive", "enableNewSearchBar", "true")) && a.e();
    }

    public static boolean ab() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab00982c", new Object[0])).booleanValue() : pro.d(OrangeConfig.getInstance().getConfig("tblive", "enableChannelFollowSearchBgUpdate", "true"));
    }
}
