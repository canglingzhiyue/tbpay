package tb;

import android.util.Log;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.triver.triver_shop.newShop.ext.d;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.text.n;

/* loaded from: classes3.dex */
public final class cen {
    public static final a Companion;

    static {
        kge.a(1500769529);
        Companion = new a(null);
    }

    /* loaded from: classes3.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1971407615);
        }

        public /* synthetic */ a(o oVar) {
            this();
        }

        private a() {
        }

        public final boolean h() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue() : a("enableShopActivityOnConfigurationChangedRestart", true);
        }

        public final boolean ay() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ac44b4c3", new Object[]{this})).booleanValue() : a("enablePopDelayToPageFinish", true);
        }

        public final boolean az() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ac52cc44", new Object[]{this})).booleanValue() : a("enableHeaderDataAppendToPop", true);
        }

        public final boolean aB() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a93da80c", new Object[]{this})).booleanValue() : a("enableAllItemsPrefetch", true);
        }

        public final boolean aA() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a92f908b", new Object[]{this})).booleanValue() : a("enablePreloadBeforeComponentInit", true);
        }

        public final boolean ag() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab470db1", new Object[]{this})).booleanValue() : a("enableShopClassPreload", true);
        }

        public final boolean aw() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ac2885c1", new Object[]{this})).booleanValue() : a("enableInterceptAllEventByDownEventIntercept", true);
        }

        public final boolean ax() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ac369d42", new Object[]{this})).booleanValue() : a("shopShareLinkWithoutM", true);
        }

        public final boolean au() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ac0c56bf", new Object[]{this})).booleanValue() : a("enableShopIndexRuleBlackListCheck", true);
        }

        public final boolean av() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ac1a6e40", new Object[]{this})).booleanValue() : a("enableDowngradeTo2021Shop", true);
        }

        public final boolean at() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("abfe3f3e", new Object[]{this})).booleanValue() : a("enableAllItemsPreload", true);
        }

        public final boolean as() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("abf027bd", new Object[]{this})).booleanValue() : a("enableXSDWeexPreloadV3", true);
        }

        public final boolean ar() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("abe2103c", new Object[]{this})).booleanValue() : a("enableForceRunMainThreadWithRouteBack", true);
        }

        public final boolean aq() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("abd3f8bb", new Object[]{this})).booleanValue() : a("enableShopIndexPreloadInNewRoute", true);
        }

        public final boolean ap() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("abc5e13a", new Object[]{this})).booleanValue() : a("enableWebViewDestroyAndRemoveSelfFromViewTree", true);
        }

        public final boolean ao() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("abb7c9b9", new Object[]{this})).booleanValue() : a("enableShopNewRoute", true);
        }

        public final boolean e() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue() : a("enableAudioAutoRecoveryLogical", true);
        }

        public final boolean am() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab9b9ab7", new Object[]{this})).booleanValue() : a("enableNewLivingStatusFromShopInfo", true);
        }

        public final boolean an() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("aba9b238", new Object[]{this})).booleanValue() : a("enableShopIndexPreSetPreloadStatus", true);
        }

        public final boolean al() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab8d8336", new Object[]{this})).booleanValue() : a("disableShopOptLayoutUpAndCancelEventReturn", true);
        }

        public final boolean aj() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab715434", new Object[]{this})).booleanValue() : a("forceDisableShopH5PageLongPressSaveImage", true);
        }

        public final boolean af() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab38f630", new Object[]{this})).booleanValue() : a("enableBottomBarAutoHide2023", true);
        }

        public final boolean ak() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab7f6bb5", new Object[]{this})).booleanValue() : a("enableBottomBarChangedVibrate", true);
        }

        public final boolean a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : a("enableLiveToHomePageAnimation", false);
        }

        public final boolean b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : a("enableShopH5ContentRenderWhiteBackground", true);
        }

        public final boolean c() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : a("enableShowMiniLive", true);
        }

        public final boolean d() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : a("enableTabMTopPrefetch", true);
        }

        public final boolean f() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue() : a("enableAllItemsRefreshOnce", true);
        }

        public final boolean g() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue() : a("enableViewPagerAllowDoNotDispatchToChild", true);
        }

        public final boolean i() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[]{this})).booleanValue() : a("enableShopPreloadWhenManifestInitV2", false);
        }

        public final boolean j() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[]{this})).booleanValue() : a("enableShopUCP", true);
        }

        public final boolean k() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[]{this})).booleanValue() : a("enableDWVideoInShopLoft", true);
        }

        public final boolean l() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[]{this})).booleanValue() : a("enableZuoPinTabRedDot", true);
        }

        public final boolean m() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6158678", new Object[]{this})).booleanValue() : a("enableUseShopRouteFollowStatus", true);
        }

        public final boolean n() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6239df9", new Object[]{this})).booleanValue() : a("enableExitShopSendLivePauseEvent", true);
        }

        public final boolean o() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("631b57a", new Object[]{this})).booleanValue() : a("enablePostEventToWebShopIndex", true);
        }

        public final JSONArray p() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONArray) ipChange.ipc$dispatch("abd36e67", new Object[]{this});
            }
            JSONArray a2 = a("shopRouteWhiteSpmList");
            if (a2.size() == 0) {
                a2.add("*");
            }
            return a2;
        }

        public final JSONArray q() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (JSONArray) ipChange.ipc$dispatch("2012a6c6", new Object[]{this}) : a("shopRouteBlackSpmList");
        }

        public final boolean r() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("65bfbfd", new Object[]{this})).booleanValue() : a("enableNewRouteLogic", true);
        }

        public final boolean s() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("66a137e", new Object[]{this})).booleanValue() : a("enableAutoScrollText", true);
        }

        public final boolean t() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6782aff", new Object[]{this})).booleanValue() : a("enableShopLoftGraphicBGScale", true);
        }

        public final boolean u() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6864280", new Object[]{this})).booleanValue() : a("enableShopLoftSwipeLimit", true);
        }

        public final boolean v() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6945a01", new Object[]{this})).booleanValue() : a("enableFullScreenPageCanPullDownHeader", true);
        }

        public final boolean w() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6a27182", new Object[]{this})).booleanValue() : a("hideShop2022BottomBar", true);
        }

        public final boolean x() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6b08903", new Object[]{this})).booleanValue() : a("enableContentShop1190BigCard", true);
        }

        public final boolean y() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6bea084", new Object[]{this})).booleanValue() : a("shopLoftEnableFollowButton", false);
        }

        public final boolean z() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6ccb805", new Object[]{this})).booleanValue() : a("enablePreloadShopIndexInActivityOnCreateV2", true);
        }

        public final boolean A() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3a97c4c", new Object[]{this})).booleanValue() : a("enableRemoveSaveInstanceFragments", true);
        }

        public final boolean B() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3b793cd", new Object[]{this})).booleanValue() : a("enableActivityRecycleFix", true);
        }

        public final boolean C() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3c5ab4e", new Object[]{this})).booleanValue() : a("enableRecycleMemWhenUIBackground", true);
        }

        public final boolean D() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3d3c2cf", new Object[]{this})).booleanValue() : a("enableRecycleMemWhenMemWarning", false);
        }

        public final boolean E() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3e1da50", new Object[]{this})).booleanValue() : a("enableTab3UseTextureMode", true);
        }

        public final boolean F() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3eff1d1", new Object[]{this})).booleanValue() : a("enableTab3MemoryRecycle", true);
        }

        public final boolean G() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3fe0952", new Object[]{this})).booleanValue() : a("enable2022ShopFrameworkBigCardPullDownStyle", true);
        }

        public final boolean H() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("40c20d3", new Object[]{this})).booleanValue() : a("enableShopUrlSpmKeyDelete", true);
        }

        public final boolean I() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("41a3854", new Object[]{this})).booleanValue() : a("enableMiniDataRouterPreload", false);
        }

        public final int J() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4284fc4", new Object[]{this})).intValue() : a("newDetailSwipeThreshold", 20);
        }

        public final boolean K() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4366756", new Object[]{this})).booleanValue() : a("enableAllItemRedDot", true);
        }

        public final int L() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4447ec6", new Object[]{this})).intValue() : a("shopRedDotIntervalTimeByHours", 720);
        }

        public final int M() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4529647", new Object[]{this})).intValue() : a("redDotMaxShopSize", 1);
        }

        public final int N() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("460adc8", new Object[]{this})).intValue() : a("subscribeTipsInvokeTimer", 10);
        }

        public final boolean O() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("46ec55a", new Object[]{this})).booleanValue() : a("enableFlagShipFullScreenSupport", true);
        }

        public final boolean P() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("47cdcdb", new Object[]{this})).booleanValue() : a("enableSuperBigCardSize", true);
        }

        public final boolean Q() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("48af45c", new Object[]{this})).booleanValue() : a("enableShopIndexWebPreload", true);
        }

        public final boolean R() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4990bdd", new Object[]{this})).booleanValue() : a("enableShopInsidePageDowngradeToH5", true);
        }

        public final boolean S() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4a7235e", new Object[]{this})).booleanValue() : a("enableShopLoftLiveCardDisableSwipe", true);
        }

        public final boolean T() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4b53adf", new Object[]{this})).booleanValue() : a("disableShopLoftFirstIsLiveCloseGuid", true);
        }

        public final boolean U() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4c35260", new Object[]{this})).booleanValue() : a("enableNewShopLoftOneDataShowGuid", true);
        }

        public final boolean V() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4d169e1", new Object[]{this})).booleanValue() : a("enableSwipeUpAutoCloseShopLoft", true);
        }

        public final boolean W() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4df8162", new Object[]{this})).booleanValue() : a("enableNativeShopSmsIcon", false);
        }

        public final boolean X() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4ed98e3", new Object[]{this})).booleanValue() : a("enableTriverInitCheck", true);
        }

        public final boolean Y() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4fbb064", new Object[]{this})).booleanValue() : a("enableANRFIX", true);
        }

        public final JSONArray Z() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (JSONArray) ipChange.ipc$dispatch("ae64963d", new Object[]{this}) : a("enableNewShopLoftGuidConfig");
        }

        public final boolean aa() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("aaf280ab", new Object[]{this})).booleanValue() : a("enableNewGuidTimeLogic", true);
        }

        public final boolean ab() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab00982c", new Object[]{this})).booleanValue() : a("enbaleShopLoftVideoCustom2001", false);
        }

        public final boolean ac() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab0eafad", new Object[]{this})).booleanValue() : a("enableNewFragmentCreateView", true);
        }

        public final boolean ad() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("ab1cc72e", new Object[]{this})).booleanValue();
            }
            try {
                return a("downgradeConfig", false);
            } catch (Exception e) {
                RVLogger.w(Log.getStackTraceString(e));
                return false;
            }
        }

        public final boolean ae() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("ab2adeaf", new Object[]{this})).booleanValue();
            }
            try {
                return a("isComponentJsPreRelease", false);
            } catch (Exception e) {
                RVLogger.w(Log.getStackTraceString(e));
                return false;
            }
        }

        public final int a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("a821938e", new Object[]{this, new Integer(i)})).intValue();
            }
            try {
                return a("liveTabBottomExtraPadding", i);
            } catch (Exception e) {
                RVLogger.w(Log.getStackTraceString(e));
                return i;
            }
        }

        public final int b(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("a9d66c2d", new Object[]{this, new Integer(i)})).intValue();
            }
            try {
                return a("liveTabTopExtraPadding", i);
            } catch (Exception e) {
                RVLogger.w(Log.getStackTraceString(e));
                return i;
            }
        }

        private final int a(String str, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("8123ad04", new Object[]{this, str, new Integer(i)})).intValue();
            }
            Integer a2 = n.a(a(str, String.valueOf(i)), 10);
            return a2 == null ? i : a2.intValue();
        }

        private final boolean a(String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("8123ece6", new Object[]{this, str, new Boolean(z)})).booleanValue();
            }
            try {
                return Boolean.parseBoolean(a(str, String.valueOf(z)));
            } catch (Exception e) {
                e.printStackTrace();
                return z;
            }
        }

        private final String a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{this, str, str2});
            }
            String config = OrangeConfig.getInstance().getConfig("shop_triver_common_config", str, str2);
            q.b(config, "getInstance().getConfig(NAME_SPACE, configName, defaultValue)");
            return config;
        }

        private final JSONArray a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONArray) ipChange.ipc$dispatch("e47bc7cc", new Object[]{this, str});
            }
            JSONArray b = d.b(a(str, ""));
            return b == null ? new JSONArray() : b;
        }

        public final boolean ah() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab552532", new Object[]{this})).booleanValue() : a("enableShopAsyncJSBridge", true);
        }

        public final boolean ai() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab633cb3", new Object[]{this})).booleanValue() : a("enableInjectShopFetchUseMainThread", false);
        }
    }
}
