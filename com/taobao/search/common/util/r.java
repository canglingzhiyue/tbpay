package com.taobao.search.common.util;

import android.os.Build;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.address.wrapper.weex.AddressKinshipBridge;
import com.taobao.downgrade.Downgrade;
import com.taobao.orange.OrangeConfig;
import com.taobao.taobao.R;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;
import tb.kge;

/* loaded from: classes7.dex */
public class r {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CLOSE_ACTIVATE_DATA = "closeActivateData2019";
    public static final String ENABLE_CART_SKU_V2 = "enableCartSkuV2";
    public static final String ENABLE_CORRECT_STOP = "enableCorrectStop";
    public static final String ENABLE_INS_SEARCH_RESULT_NAV_BUTTON = "enableInsNavButton";
    public static final String ENABLE_IN_SHOP_HISTORY_ELDER = "enableInShopHistoryElder";
    public static final String ENABLE_IN_SHOP_SEARCH_DOOR_V2 = "enableInShopSearchDoorV2";
    public static final String ENABLE_MAIN_SRP_LIFECYCLE_LOG = "enableMainSrpLifeCycleLog";
    public static final String ENABLE_NEW_SECTION = "enableNewSectionV1";
    public static final String ENABLE_PREPOSE_IMG_FILTER_BUTTON = "enablePreposeImgFilterButton";
    public static final String ENABLE_SEARCH_DOOR_ELDER_VOICE_ASSISTANT = "enableSearchDoorElderVoiceAssistantV2";
    public static final String ENABLE_SEARCH_ELDER = "enableSearchElderV2";
    public static final String ENABLE_SHOP_SEARCH_ELDER = "enableShopSearchElder";
    public static final String ENABLE_SRP_ELDER_VOICE_ASSISTANT = "enableSRPElderVoiceAssistantV2";
    public static final String ENABLE_SRP_FULL_TRACE = "enableSRPFullTrace";
    public static final String ENABLE_SRP_VOICE_FROM_VERIFY = "enableSRPVoiceFromVerify";
    public static final String NLS_SPEECH_TOKEN_EXPIRE_THRESHOLD = "maxNlsSpeechExpire";
    public static final String NLS_SPEECH_TOKEN_MAX_RETRY_COUNT = "maxNlsSpeechTokenRetryCount";
    public static final String SEARCH_BIZ_NAME = "search_biz";
    public static final String SEARCH_GROUP_NAME = "search";

    /* renamed from: a  reason: collision with root package name */
    private static int f19044a;
    private static final Map<String, Set<String>> b;

    private static float cG() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("acedcebb", new Object[0])).floatValue();
        }
        return 2.0f;
    }

    static {
        kge.a(1280884853);
        b = new HashMap();
        HashSet hashSet = new HashSet();
        hashSet.add("pltNewUserGuideText");
        hashSet.add("mtopErrorTitleConfig");
        b.put(SEARCH_BIZ_NAME, hashSet);
        f19044a = 3;
    }

    public static String a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("457cf91a", new Object[]{str, str2, str3}) : OrangeConfig.getInstance().getConfig(a(str, str2), str2, str3);
    }

    private static String a(String str, String str2) {
        Set<String> set;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{str, str2});
        }
        if (com.alibaba.ability.localization.b.b() || (set = b.get(str)) == null || !set.contains(str2)) {
            return str;
        }
        return str + "_en";
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : StringUtils.equals("true", a("search", "disableForceSetTheme", "false"));
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : StringUtils.equals("true", a("search", "closeOtherTabSearchHint2019", "false"));
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue() : StringUtils.equals("true", a("search", CLOSE_ACTIVATE_DATA, "false"));
    }

    public static void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[0]);
            return;
        }
        a("image_search", "adv_banner", "");
        a("image_search", "flp_config", "");
        a("image_search", "find_config", "");
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[0])).booleanValue() : StringUtils.equals("true", a("search", "searchDoorInitiativeLocate", "true"));
    }

    public static boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[0])).booleanValue() : StringUtils.equals("true", a("search", "disableCunTao", "false"));
    }

    public static boolean g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[0])).booleanValue() : StringUtils.equals("true", a("search", "disableChitu", "false"));
    }

    public static int a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a821938e", new Object[]{new Integer(i)})).intValue();
        }
        String a2 = a("search", "locationCacheTime", "");
        return StringUtils.isEmpty(a2) ? i : com.taobao.search.mmd.util.d.b(a2, i);
    }

    public static int b(int i) {
        int b2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a9d66c2d", new Object[]{new Integer(i)})).intValue();
        }
        String a2 = a("search", "preloadPageValue2019", "");
        return (!StringUtils.isEmpty(a2) && (b2 = com.taobao.search.mmd.util.d.b(a2, i)) >= -1) ? b2 : i;
    }

    public static boolean h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[0])).booleanValue() : StringUtils.equals("true", a("search", "disableRecyclerToolbar", "false"));
    }

    public static boolean i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[0])).booleanValue() : StringUtils.equals("true", a("search", "disableShareSearch", "false"));
    }

    public static boolean j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[0])).booleanValue() : StringUtils.equals("true", a("search", "disableClearState", "false"));
    }

    public static boolean k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[0])).booleanValue() : StringUtils.equals("true", a("search", "disableActivityResult", "false"));
    }

    public static boolean l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[0])).booleanValue() : StringUtils.equals("true", a("search", "disableImageSearchGuideV2", "false"));
    }

    public static int c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ab8b44cc", new Object[]{new Integer(i)})).intValue();
        }
        String a2 = a(SEARCH_BIZ_NAME, "maxHistoryCount", "");
        return StringUtils.isEmpty(a2) ? i : Math.min(40, com.taobao.search.mmd.util.d.b(a2, i));
    }

    public static int d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ad401d6b", new Object[]{new Integer(i)})).intValue();
        }
        String a2 = a(SEARCH_BIZ_NAME, "maxDisplayHistoryCount", "");
        return StringUtils.isEmpty(a2) ? i : Math.min(40, com.taobao.search.mmd.util.d.b(a2, i));
    }

    public static boolean m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6158678", new Object[0])).booleanValue() : d("disableSearchDoorRealTab");
    }

    public static boolean n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6239df9", new Object[0])).booleanValue() : StringUtils.equals("true", a("search", "disableSearchHistory", "false"));
    }

    private static boolean d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d23b17f9", new Object[]{str})).booleanValue();
        }
        if (!StringUtils.isEmpty(str)) {
            return StringUtils.equals("true", a("search", str, "false"));
        }
        return false;
    }

    public static String o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b4719ea", new Object[0]) : a(SEARCH_BIZ_NAME, "limitErrorMainTitle", com.alibaba.ability.localization.b.a(R.string.taobao_app_1005_1_16644));
    }

    public static String p() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("91ccd489", new Object[0]) : a(SEARCH_BIZ_NAME, "limitErrorSubTitle", com.alibaba.ability.localization.b.a(R.string.taobao_app_1005_1_16675));
    }

    public static String q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("18528f28", new Object[0]) : a(SEARCH_BIZ_NAME, "searchDoorVoiceHint", "");
    }

    public static JSONObject a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("2f58b020", new Object[]{str});
        }
        String a2 = a(SEARCH_BIZ_NAME, "mtopErrorTitleConfig", "");
        if (StringUtils.isEmpty(a2)) {
            return null;
        }
        try {
            return new JSONObject(a2).optJSONObject(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public static boolean r() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("65bfbfd", new Object[0])).booleanValue() : "true".equals(a(SEARCH_BIZ_NAME, "disableUserBehaviorRecord", ""));
    }

    public static boolean s() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("66a137e", new Object[0])).booleanValue() : "true".equals(a(SEARCH_BIZ_NAME, "disableInshopOverScroll", ""));
    }

    public static boolean t() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6782aff", new Object[0])).booleanValue() : "true".equals(a(SEARCH_BIZ_NAME, "disableInshopPvFeature", ""));
    }

    public static boolean u() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6864280", new Object[0])).booleanValue() : "true".equals(a(SEARCH_BIZ_NAME, "disableXslPreload", ""));
    }

    public static long v() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("69459f1", new Object[0])).longValue() : Math.max(Math.min(com.taobao.search.mmd.util.d.a(a(SEARCH_BIZ_NAME, "searchDoorKeyboardPresentDelay", ""), 0.3f), 2.0f), 0.3f) * 1000.0f;
    }

    public static boolean w() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6a27182", new Object[0])).booleanValue() : "true".equals(a(SEARCH_BIZ_NAME, "disablePythonPvFeature", ""));
    }

    public static boolean x() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6b08903", new Object[0])).booleanValue() : "true".equals(a(SEARCH_BIZ_NAME, "disableNativePvFeature", ""));
    }

    public static boolean y() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6bea084", new Object[0])).booleanValue() : "true".equals(a(SEARCH_BIZ_NAME, "disableInshopDynamicCard", ""));
    }

    public static String z() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d3061ebf", new Object[0]) : a(SEARCH_BIZ_NAME, "searchDoorQueryIntercept", "");
    }

    public static String B() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("65c54bf7", new Object[0]) : a(SEARCH_BIZ_NAME, "searchParamsBlackList", "utparam&URL_REFERER_ORIGIN&_navigation_params");
    }

    public static void C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c5ab4a", new Object[0]);
        } else {
            f19044a = com.taobao.search.mmd.util.d.b(a(SEARCH_BIZ_NAME, "videoPlaySampleRate", "3"), 1);
        }
    }

    public static int D() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3d3c2be", new Object[0])).intValue() : f19044a;
    }

    public static boolean F() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3eff1d1", new Object[0])).booleanValue() : StringUtils.equals(a(SEARCH_BIZ_NAME, "disableInshopComponentInit", ""), "true");
    }

    public static long G() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3fe0942", new Object[0])).longValue() : com.taobao.search.mmd.util.d.a(a(SEARCH_BIZ_NAME, "jarvisFeatureTimeout", "1000"), 1000L);
    }

    public static boolean H() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("40c20d3", new Object[0])).booleanValue() : StringUtils.equals(a(SEARCH_BIZ_NAME, "disableJstPrefetch", ""), "true");
    }

    public static boolean I() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("41a3854", new Object[0])).booleanValue() : "true".equals(a(SEARCH_BIZ_NAME, "enableAutoPlay", "true"));
    }

    public static boolean J() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4284fd5", new Object[0])).booleanValue() : StringUtils.equals(a(SEARCH_BIZ_NAME, "enableListAnimator", "true"), "true");
    }

    public static boolean K() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4366756", new Object[0])).booleanValue() : StringUtils.equals(a(SEARCH_BIZ_NAME, "disableInshopPassAllParams", ""), "true");
    }

    public static boolean L() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4447ed7", new Object[0])).booleanValue() : StringUtils.equals(a(SEARCH_BIZ_NAME, "disableDiffCityTips", ""), "true");
    }

    public static boolean Q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("48af45c", new Object[0])).booleanValue() : StringUtils.equals(a(SEARCH_BIZ_NAME, "disableSimilarSameVibrate", ""), "true");
    }

    public static boolean R() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4990bdd", new Object[0])).booleanValue() : StringUtils.equals(a(SEARCH_BIZ_NAME, "enableForceBreakLine", "true"), "true");
    }

    public static boolean S() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4a7235e", new Object[0])).booleanValue() : StringUtils.equals(a(SEARCH_BIZ_NAME, "disableSearchDoorIconHint", ""), "true");
    }

    public static boolean T() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4b53adf", new Object[0])).booleanValue() : StringUtils.equals(a(SEARCH_BIZ_NAME, "disablePltNewUserGuide", ""), "true");
    }

    public static long U() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4c35250", new Object[0])).longValue() : com.taobao.search.mmd.util.d.a(a(SEARCH_BIZ_NAME, "pltNewUserGuideInterval", String.valueOf((long) android.taobao.windvane.cache.d.DEFAULT_MAX_AGE)), (long) android.taobao.windvane.cache.d.DEFAULT_MAX_AGE);
    }

    public static String V() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e837e063", new Object[0]) : a(SEARCH_BIZ_NAME, "pltNewUserGuideText", "");
    }

    public static boolean X() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4ed98e3", new Object[0])).booleanValue() : "true".equals(a(SEARCH_BIZ_NAME, "disableJarvisLastPageExpose", ""));
    }

    public static String[] Y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("75e42c2f", new Object[0]);
        }
        String a2 = a(SEARCH_BIZ_NAME, "pageInfoWhiteParams", "from/channelSrp/filterTag");
        if (StringUtils.isEmpty(a2)) {
            return new String[0];
        }
        return a2.split("/");
    }

    public static boolean Z() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("509c7e5", new Object[0])).booleanValue() : "true".equals(a(SEARCH_BIZ_NAME, "isFireVisibleEventToWeex", "true"));
    }

    public static boolean aa() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("aaf280ab", new Object[0])).booleanValue() : "true".equals(a(SEARCH_BIZ_NAME, "disableMusPageChange", "false"));
    }

    public static String ab() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5347b178", new Object[0]) : a(SEARCH_BIZ_NAME, "inshopPltUrl", k.PAILITAO_URL);
    }

    public static boolean ad() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab1cc72e", new Object[0])).booleanValue() : "true".equals(a(SEARCH_BIZ_NAME, "recordSrpResult", "true"));
    }

    public static boolean ae() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab2adeaf", new Object[0])).booleanValue() : "true".equals(a(SEARCH_BIZ_NAME, "trackP4pExpose", "true"));
    }

    public static boolean af() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab38f630", new Object[0])).booleanValue() : "true".equals(a(SEARCH_BIZ_NAME, "mainTabUseWua", "true"));
    }

    public static boolean ag() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab470db1", new Object[0])).booleanValue() : "true".equals(a(SEARCH_BIZ_NAME, "standaloneChannelSrpAppId", "true"));
    }

    public static boolean ah() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab552532", new Object[0])).booleanValue() : "true".equals(a(SEARCH_BIZ_NAME, ENABLE_SEARCH_ELDER, "true"));
    }

    public static boolean ai() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab633cb3", new Object[0])).booleanValue() : "true".equals(a(SEARCH_BIZ_NAME, ENABLE_SHOP_SEARCH_ELDER, "true"));
    }

    public static boolean aj() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab715434", new Object[0])).booleanValue() : "true".equals(a(SEARCH_BIZ_NAME, ENABLE_SEARCH_DOOR_ELDER_VOICE_ASSISTANT, "true"));
    }

    public static boolean ak() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab7f6bb5", new Object[0])).booleanValue() : "true".equals(a(SEARCH_BIZ_NAME, ENABLE_SRP_ELDER_VOICE_ASSISTANT, "true"));
    }

    public static boolean al() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab8d8336", new Object[0])).booleanValue() : "true".equals(a(SEARCH_BIZ_NAME, ENABLE_SRP_VOICE_FROM_VERIFY, "true"));
    }

    public static boolean am() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab9b9ab7", new Object[0])).booleanValue() : "true".equals(a(SEARCH_BIZ_NAME, "filterEagleCard", "true"));
    }

    public static boolean an() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("aba9b238", new Object[0])).booleanValue() : "true".equals(a(SEARCH_BIZ_NAME, "disableNewSearchParse", "false"));
    }

    public static boolean ap() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("abc5e13a", new Object[0])).booleanValue() : "true".equals(a(SEARCH_BIZ_NAME, "downgradeSceneAlpha", "true"));
    }

    public static boolean aq() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("abd3f8bb", new Object[0])).booleanValue() : "true".equals(a(SEARCH_BIZ_NAME, ENABLE_SRP_FULL_TRACE, "true"));
    }

    public static boolean ar() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("abe2103c", new Object[0])).booleanValue() : StringUtils.equals(a(SEARCH_BIZ_NAME, "negativeFeedbackEnable", "true"), "true");
    }

    public static boolean as() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("abf027bd", new Object[0])).booleanValue() : StringUtils.equals(a(SEARCH_BIZ_NAME, "enableBxFeature", "true"), "true");
    }

    public static String[] au() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("fe811ca", new Object[0]);
        }
        String a2 = a(SEARCH_BIZ_NAME, "elderVoiceSRPFromWhiteParams", "active_grayHair");
        if (StringUtils.isEmpty(a2)) {
            return new String[0];
        }
        return a2.split("/");
    }

    public static String[] av() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("5a19ab0b", new Object[0]);
        }
        String a2 = a(SEARCH_BIZ_NAME, "elderVoiceSearchDoorFromWhiteParams", "active_grayHair");
        if (StringUtils.isEmpty(a2)) {
            return new String[0];
        }
        return a2.split("/");
    }

    public static boolean c(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("88097eb8", new Object[]{str})).booleanValue() : StringUtils.equals(a(SEARCH_BIZ_NAME, str, "false"), "true");
    }

    public static boolean aw() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ac2885c1", new Object[0])).booleanValue() : StringUtils.equals(a(SEARCH_BIZ_NAME, "enableNewInstanceTagSearch", "true"), "true");
    }

    public static String[] ax() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("ee7cdd8d", new Object[0]);
        }
        String a2 = a(SEARCH_BIZ_NAME, "newSearchJumpBlackParams", "");
        if (StringUtils.isEmpty(a2)) {
            return new String[0];
        }
        return a2.split("/");
    }

    public static String ay() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("694b75c1", new Object[0]) : a(SEARCH_BIZ_NAME, "gallerySrpBgUrl", "https://gw.alicdn.com/imgextra/i4/O1CN01f6x5nt1rLGDjKUGlS_!!6000000005614-2-tps-750-1624.png");
    }

    public static boolean az() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ac52cc44", new Object[0])).booleanValue() : StringUtils.equals(a(SEARCH_BIZ_NAME, "nsCellHeightFallback", "false"), "true");
    }

    public static boolean aA() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a92f908b", new Object[0])).booleanValue() : StringUtils.equals(a(SEARCH_BIZ_NAME, "enableTagBack", "true"), "true");
    }

    public static String[] aC() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("92382318", new Object[0]);
        }
        String a2 = a(SEARCH_BIZ_NAME, "mainSearchEnable2021DecoTab", "all/ifashion");
        if (StringUtils.isEmpty(a2)) {
            return new String[0];
        }
        return a2.split("/");
    }

    public static boolean aD() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a959d70e", new Object[0])).booleanValue() : StringUtils.equals(a(SEARCH_BIZ_NAME, ENABLE_CART_SKU_V2, "true"), "true");
    }

    public static String[] aE() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("269b559a", new Object[0]);
        }
        String a2 = a(SEARCH_BIZ_NAME, "mainSearchShareUnEnableChannel", "hongbaosrp");
        if (StringUtils.isEmpty(a2)) {
            return new String[0];
        }
        return a2.split("/");
    }

    public static boolean aF() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a9760610", new Object[0])).booleanValue() : StringUtils.equals(a(SEARCH_BIZ_NAME, "enableSRPPopHack", "true"), "true");
    }

    public static boolean aH() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a9923512", new Object[0])).booleanValue() : StringUtils.equals(a(SEARCH_BIZ_NAME, "refreshLocationUsingCache", "true"), "true");
    }

    public static boolean aI() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a9a04c93", new Object[0])).booleanValue() : StringUtils.equals("true", a("search", "disableLocalImageGuideV1", "false"));
    }

    public static boolean aJ() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a9ae6414", new Object[0])).booleanValue() : StringUtils.equals(a(SEARCH_BIZ_NAME, "enableSearchDoorMainPageBXFeature", "true"), "true");
    }

    public static boolean aK() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a9bc7b95", new Object[0])).booleanValue() : StringUtils.equals(a(SEARCH_BIZ_NAME, "enableSearchDoorSuggestBXFeature", "true"), "true");
    }

    public static boolean aL() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a9ca9316", new Object[0])).booleanValue() : StringUtils.equals(a(SEARCH_BIZ_NAME, "enableSearchDoorBGWordsBXFeature", "true"), "true");
    }

    public static int aM() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a9d8aa86", new Object[0])).intValue();
        }
        String a2 = a(SEARCH_BIZ_NAME, "searchDoorBXFeatureLengthMaxValue", "1024");
        if (!StringUtils.isEmpty(a2)) {
            return com.taobao.search.mmd.util.d.b(a2, 1024);
        }
        return 1024;
    }

    public static boolean aN() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a9e6c218", new Object[0])).booleanValue() : StringUtils.equals(a(SEARCH_BIZ_NAME, "enableSearchDoorBGWordsRefresh", "true"), "true");
    }

    public static boolean aP() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("aa02f11a", new Object[0])).booleanValue() : StringUtils.equals(a(SEARCH_BIZ_NAME, "enableCrashReporter", "true"), "true");
    }

    public static boolean aQ() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("aa11089b", new Object[0])).booleanValue() : StringUtils.equals(a(SEARCH_BIZ_NAME, "enableRequestFallback", "true"), "true");
    }

    public static String aR() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("eaec0788", new Object[0]) : a(SEARCH_BIZ_NAME, "requestFallbackBlackCodeList", "");
    }

    public static String aS() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7171c227", new Object[0]) : a(SEARCH_BIZ_NAME, "requestFallbackBlackParams", "");
    }

    public static boolean aT() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("aa3b4f1e", new Object[0])).booleanValue() : StringUtils.equals(a(SEARCH_BIZ_NAME, "enableSearchDoorSuggestTrack", "true"), "true");
    }

    public static String[] aU() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("c9b4e9aa", new Object[0]);
        }
        String a2 = a(SEARCH_BIZ_NAME, "searchDoorPhotoSearchChannelBlackList", "localSearch/Uxianshiyong/baiyibutie");
        if (StringUtils.isEmpty(a2)) {
            return new String[0];
        }
        return a2.split("/");
    }

    public static String[] aV() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("13e682eb", new Object[0]);
        }
        String a2 = a(SEARCH_BIZ_NAME, "searchDoorPhotoSearchChannelBlackList", "localSearch/Uxianshiyong/baiyibutie");
        if (StringUtils.isEmpty(a2)) {
            return new String[0];
        }
        return a2.split("/");
    }

    public static final String aW() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8b88aca3", new Object[0]) : a(SEARCH_BIZ_NAME, "searchCoudanRedirectUrl", "https://pages.tmall.com/wow/a/act/tmall/dailygroup/2883/wupr?wh_pid=daily-257100&disableNav=YES");
    }

    public static boolean aX() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("aa73ad22", new Object[0])).booleanValue() : StringUtils.equals(a(SEARCH_BIZ_NAME, "enableNonItemClickTrace", "true"), "true");
    }

    public static final boolean aY() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("aa81c4a3", new Object[0])).booleanValue() : StringUtils.equals(a(SEARCH_BIZ_NAME, "enableInShopNDParamsTransfer", "true"), "true");
    }

    public static boolean aZ() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("aa8fdc24", new Object[0])).booleanValue() : StringUtils.equals(a(SEARCH_BIZ_NAME, "enableLoadNextPageModule", "true"), "true");
    }

    @Deprecated
    public static boolean ba() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("aca7594a", new Object[0])).booleanValue() : StringUtils.equals(a(SEARCH_BIZ_NAME, "enableSubscribeSRPOptimize", "true"), "true");
    }

    public static boolean bb() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("acb570cb", new Object[0])).booleanValue() : StringUtils.equals(a(SEARCH_BIZ_NAME, "enableSRPSystemRebuildTrack", "true"), "true");
    }

    public static boolean bc() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("acc3884c", new Object[0])).booleanValue() : StringUtils.equals(a(SEARCH_BIZ_NAME, ENABLE_PREPOSE_IMG_FILTER_BUTTON, "true"), "true");
    }

    public static boolean bd() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("acd19fcd", new Object[0])).booleanValue() : StringUtils.equals(a(SEARCH_BIZ_NAME, "markGrayTemplatesV2", "true"), "true");
    }

    public static boolean be() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("acdfb74e", new Object[0])).booleanValue() : StringUtils.equals(a(SEARCH_BIZ_NAME, ENABLE_IN_SHOP_SEARCH_DOOR_V2, "true"), "true");
    }

    public static boolean bf() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("acedcecf", new Object[0])).booleanValue() : StringUtils.equals(a(SEARCH_BIZ_NAME, ENABLE_NEW_SECTION, "true"), "true");
    }

    public static boolean bg() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("acfbe650", new Object[0])).booleanValue() : StringUtils.equals(a(SEARCH_BIZ_NAME, ENABLE_NEW_SECTION, "true"), "true");
    }

    public static boolean bh() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ad09fdd1", new Object[0])).booleanValue() : StringUtils.equals(a(SEARCH_BIZ_NAME, "enableMuiseGSensorAbility", "true"), "true");
    }

    public static boolean bj() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ad262cd3", new Object[0])).booleanValue() : StringUtils.equals(a(SEARCH_BIZ_NAME, ENABLE_IN_SHOP_HISTORY_ELDER, "true"), "true");
    }

    public static boolean bk() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ad344454", new Object[0])).booleanValue() : StringUtils.equals(a(SEARCH_BIZ_NAME, "enableSearchTLogTrack", "true"), "true");
    }

    public static long a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a8219750", new Object[]{new Long(j)})).longValue();
        }
        String a2 = a(SEARCH_BIZ_NAME, NLS_SPEECH_TOKEN_EXPIRE_THRESHOLD, "");
        return StringUtils.isEmpty(a2) ? j : com.taobao.search.mmd.util.d.a(a2, j);
    }

    public static int e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("aef4f60a", new Object[]{new Integer(i)})).intValue();
        }
        String a2 = a(SEARCH_BIZ_NAME, NLS_SPEECH_TOKEN_MAX_RETRY_COUNT, "");
        return StringUtils.isEmpty(a2) ? i : com.taobao.search.mmd.util.d.b(a2, i);
    }

    public static boolean bl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ad425bd5", new Object[0])).booleanValue() : StringUtils.equals(a(SEARCH_BIZ_NAME, "enableMUSFixedParamsGot", "true"), "true");
    }

    public static boolean bm() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ad507356", new Object[0])).booleanValue() : StringUtils.equals(a(SEARCH_BIZ_NAME, "forceDisabledNativeFilter", "true"), "true");
    }

    @Deprecated
    public static boolean bn() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ad5e8ad7", new Object[0])).booleanValue() : StringUtils.equals(a(SEARCH_BIZ_NAME, "enableSceneHeaderTopLogicSameWithIOS", "true"), "true");
    }

    public static boolean bo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ad6ca258", new Object[0])).booleanValue() : StringUtils.equals(a(SEARCH_BIZ_NAME, "newSearchPblEnabled", "true"), "true");
    }

    @Deprecated
    public static boolean bp() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ad7ab9d9", new Object[0])).booleanValue() : StringUtils.equals(a(SEARCH_BIZ_NAME, "enableNativeFilterFix", "true"), "true");
    }

    public static boolean bq() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ad88d15a", new Object[0])).booleanValue() : StringUtils.equals(a(SEARCH_BIZ_NAME, ENABLE_MAIN_SRP_LIFECYCLE_LOG, "true"), "true");
    }

    public static boolean br() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ad96e8db", new Object[0])).booleanValue() : StringUtils.equals(a(SEARCH_BIZ_NAME, "enableTaoThemeUnderDarkMode", "false"), "true");
    }

    public static float at() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("abfe3f2a", new Object[0])).floatValue();
        }
        String a2 = a(SEARCH_BIZ_NAME, "lowDeviceImageDivideConfig", "");
        if (StringUtils.isEmpty(a2)) {
            return cG();
        }
        try {
            return com.taobao.search.mmd.util.d.a(new JSONObject(a2).getString(String.valueOf(Build.VERSION.SDK_INT)), cG());
        } catch (Exception unused) {
            return cG();
        }
    }

    public static boolean bt() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("adb317dd", new Object[0])).booleanValue() : StringUtils.equals(a(SEARCH_BIZ_NAME, "enableDetailPreRequest", "true"), "true");
    }

    public static boolean bu() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("adc12f5e", new Object[0])).booleanValue() : StringUtils.equals(a(SEARCH_BIZ_NAME, "outerBeanJsonType", "true"), "true");
    }

    public static boolean bv() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("adcf46df", new Object[0])).booleanValue() : StringUtils.equals(a(SEARCH_BIZ_NAME, "enableSRPPageRebuild", "true"), "true");
    }

    public static boolean E() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3e1da50", new Object[0])).booleanValue() : StringUtils.equals(a(SEARCH_BIZ_NAME, "lowDevicePerfOn", "true"), "true");
    }

    public static boolean bx() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("adeb75e1", new Object[0])).booleanValue() : StringUtils.equals(a(SEARCH_BIZ_NAME, "enableSRPJumpKeywordFixed", "true"), "true");
    }

    public static boolean bz() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ae07a4e3", new Object[0])).booleanValue() : StringUtils.equals(a(SEARCH_BIZ_NAME, "enableAddressWidgetBGWhite", "true"), "true");
    }

    public static boolean bA() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("aae4692a", new Object[0])).booleanValue() : StringUtils.equals(a(SEARCH_BIZ_NAME, "enableMusFilterRefreshList", "true"), "true");
    }

    public static boolean bB() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("aaf280ab", new Object[0])).booleanValue() : StringUtils.equals(a(SEARCH_BIZ_NAME, "enableCommonDynamicCardInsert", "true"), "true");
    }

    public static boolean bC() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab00982c", new Object[0])).booleanValue() : StringUtils.equals(a(SEARCH_BIZ_NAME, "enableCommonDynamicCardInsertJarvis", "true"), "true");
    }

    public static String bD() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d9cd6c17", new Object[0]);
        }
        String a2 = a(SEARCH_BIZ_NAME, "mainSrpShareUrl", "");
        return StringUtils.isEmpty(a2) ? k.SEARCHLIST_H5 : a2;
    }

    @Deprecated
    public static boolean bE() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab1cc72e", new Object[0])).booleanValue() : StringUtils.equals(a(SEARCH_BIZ_NAME, "enableFilterBtnNewDefaultSelectedLogicV2", "true"), "true");
    }

    @Deprecated
    public static boolean bF() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab2adeaf", new Object[0])).booleanValue() : StringUtils.equals(a(SEARCH_BIZ_NAME, "enableInShopTopBarWidthFixV2", "true"), "true");
    }

    public static boolean bG() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab38f630", new Object[0])).booleanValue() : StringUtils.equals(a(SEARCH_BIZ_NAME, "enableSrpPerformance", "true"), "true");
    }

    public static boolean bH() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab470db1", new Object[0])).booleanValue() : StringUtils.equals(a(SEARCH_BIZ_NAME, "enableFilterPopupDecorView", "true"), "true");
    }

    public static boolean bI() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab552532", new Object[0])).booleanValue() : StringUtils.equals(a(SEARCH_BIZ_NAME, "enableMiniSearch", "true"), "true");
    }

    public static boolean bJ() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab633cb3", new Object[0])).booleanValue() : StringUtils.equals(a(SEARCH_BIZ_NAME, "enableWeexPZSpm", "true"), "true");
    }

    public static boolean bK() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab715434", new Object[0])).booleanValue() : StringUtils.equals(a(SEARCH_BIZ_NAME, "enableH5PZSpm", "true"), "true");
    }

    public static boolean bL() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab7f6bb5", new Object[0])).booleanValue() : StringUtils.equals(a(SEARCH_BIZ_NAME, "keyboardViewTreeObserver", "true"), "true");
    }

    public static boolean bM() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab8d8336", new Object[0])).booleanValue() : StringUtils.equals(a(SEARCH_BIZ_NAME, "metaNotifyEnabledV1", "false"), "true");
    }

    public static boolean bN() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab9b9ab7", new Object[0])).booleanValue() : StringUtils.equals(a(SEARCH_BIZ_NAME, "searchDoorRecyclPool", "true"), "true");
    }

    public static boolean bO() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("aba9b238", new Object[0])).booleanValue() : StringUtils.equals(a(SEARCH_BIZ_NAME, "sceneHeaderWrapContent", "true"), "true");
    }

    public static boolean bP() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("abb7c9b9", new Object[0])).booleanValue() : StringUtils.equals(a(SEARCH_BIZ_NAME, "sceneHeaderNestedScroll", "true"), "true");
    }

    public static boolean bQ() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("abc5e13a", new Object[0])).booleanValue() : StringUtils.equals(a(SEARCH_BIZ_NAME, "miniSearch2021", "true"), "true");
    }

    public static boolean bR() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("abd3f8bb", new Object[0])).booleanValue() : StringUtils.equals(a(SEARCH_BIZ_NAME, "updateOtherTabParams", "true"), "true");
    }

    public static boolean bS() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("abe2103c", new Object[0])).booleanValue() : StringUtils.equals(a(SEARCH_BIZ_NAME, "musLeakEnabled", "true"), "true");
    }

    public static boolean bT() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("abf027bd", new Object[0])).booleanValue() : StringUtils.equals(a(SEARCH_BIZ_NAME, "metaCheckGap", "true"), "true");
    }

    public static boolean bU() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("abfe3f3e", new Object[0])).booleanValue() : StringUtils.equals(a(SEARCH_BIZ_NAME, "abortRenderWhenDestroy", "true"), "true");
    }

    public static boolean bV() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ac0c56bf", new Object[0])).booleanValue() : StringUtils.equals(a(SEARCH_BIZ_NAME, "fixConnectivityManagerLeaks", "true"), "true");
    }

    public static int bW() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ac1a6e2f", new Object[0])).intValue() : com.taobao.search.mmd.util.d.b(a(SEARCH_BIZ_NAME, "blurImageRadius", "200"), 25);
    }

    public static boolean bX() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ac2885c1", new Object[0])).booleanValue() : StringUtils.equals(a(SEARCH_BIZ_NAME, AddressKinshipBridge.ACTION_CHECK_LOCATION_PERMISSION, "true"), "true");
    }

    public static boolean bY() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ac369d42", new Object[0])).booleanValue() : StringUtils.equals(a(SEARCH_BIZ_NAME, AddressKinshipBridge.ACTION_REQUEST_LOCATION_PERMISSION, "true"), "true");
    }

    public static Set<String> bZ() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("ac62d66e", new Object[0]);
        }
        String a2 = a(SEARCH_BIZ_NAME, "headerReuseWhiteList", "");
        if (StringUtils.isEmpty(a2)) {
            return Collections.emptySet();
        }
        try {
            HashSet hashSet = new HashSet();
            for (String str : a2.split(",")) {
                hashSet.add(str);
            }
            return hashSet;
        } catch (Exception unused) {
            return Collections.emptySet();
        }
    }

    public static String ca() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6125295b", new Object[0]) : a(SEARCH_BIZ_NAME, "searchButtonPromotionGifConfig", "");
    }

    public static boolean cb() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ae6a496a", new Object[0])).booleanValue() : StringUtils.equals(a(SEARCH_BIZ_NAME, "metaBlockFocus", "false"), "true");
    }

    public static boolean cc() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ae7860eb", new Object[0])).booleanValue() : StringUtils.equals(a(SEARCH_BIZ_NAME, "enableTemplatePreload", "true"), "true");
    }

    public static boolean cg() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("aeb0beef", new Object[0])).booleanValue() : StringUtils.equals(a(SEARCH_BIZ_NAME, "enableDefaultPageFix", "true"), "true");
    }

    public static boolean ch() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("aebed670", new Object[0])).booleanValue() : StringUtils.equals(a(SEARCH_BIZ_NAME, "enableSlidePreciseExpose", "true"), "true");
    }

    public static boolean ci() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("aeccedf1", new Object[0])).booleanValue() : StringUtils.equals(a(SEARCH_BIZ_NAME, "dynamicSortBar", "true"), "true");
    }

    public static boolean cj() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("aedb0572", new Object[0])).booleanValue() : StringUtils.equals(a(SEARCH_BIZ_NAME, "imageWrapper", "true"), "true");
    }

    public static boolean ck() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("aee91cf3", new Object[0])).booleanValue() : StringUtils.equals(a(SEARCH_BIZ_NAME, "musRouteFallback", "false"), "true");
    }

    public static boolean cl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("aef73474", new Object[0])).booleanValue() : StringUtils.equals(a(SEARCH_BIZ_NAME, "fixSceneHeaderScroll", "true"), "true");
    }

    public static boolean cm() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("af054bf5", new Object[0])).booleanValue() : StringUtils.equals(a(SEARCH_BIZ_NAME, "luBanImageEnabled", "true"), "true");
    }

    public static String cn() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("35efa36e", new Object[0]) : a(SEARCH_BIZ_NAME, "luBanHost", "picasso.alicdn.com");
    }

    public static boolean co() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("af217af7", new Object[0])).booleanValue() : StringUtils.equals(a(SEARCH_BIZ_NAME, "osRedirectPerf", "true"), "true");
    }

    public static boolean cp() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("af2f9278", new Object[0])).booleanValue() : StringUtils.equals(a(SEARCH_BIZ_NAME, "loadLibraryBeforeCheckBundle", "true"), "true");
    }

    public static boolean cq() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("af3da9f9", new Object[0])).booleanValue() : StringUtils.equals(a(SEARCH_BIZ_NAME, "enableNeedTabsFix", "true"), "true");
    }

    public static boolean cs() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("af59d8fb", new Object[0])).booleanValue() : StringUtils.equals(a(SEARCH_BIZ_NAME, "fixZhiboTab", "true"), "true");
    }

    public static boolean ct() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("af67f07c", new Object[0])).booleanValue() : StringUtils.equals(a(SEARCH_BIZ_NAME, "closeGoodPrice", "true"), "false");
    }

    public static boolean cu() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("af7607fd", new Object[0])).booleanValue() : StringUtils.equals(a(SEARCH_BIZ_NAME, "miniTopHeader", "true"), "true");
    }

    public static boolean cv() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("af841f7e", new Object[0])).booleanValue() : StringUtils.equals(a(SEARCH_BIZ_NAME, "zhiboNative", "true"), "true");
    }

    public static boolean cw() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("af9236ff", new Object[0])).booleanValue() : StringUtils.equals(a(SEARCH_BIZ_NAME, "ipGuideNative", "true"), "true");
    }

    public static boolean cy() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("afae6601", new Object[0])).booleanValue() : StringUtils.equals(a(SEARCH_BIZ_NAME, "uniErrorView", "true"), "true");
    }

    public static boolean cz() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("afbc7d82", new Object[0])).booleanValue() : StringUtils.equals(a(SEARCH_BIZ_NAME, "darkModeFix", "true"), "true");
    }

    public static int cA() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ac9941b8", new Object[0])).intValue() : com.taobao.search.mmd.util.d.b(OrangeConfig.getInstance().getConfig(SEARCH_BIZ_NAME, "ipTopHeaderBottom", "142"), 142);
    }

    public static boolean cB() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("aca7594a", new Object[0])).booleanValue() : StringUtils.equals(a(SEARCH_BIZ_NAME, "muiseDarkMode", "true"), "true");
    }

    public static boolean cC() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("acb570cb", new Object[0])).booleanValue() : StringUtils.equals(a(SEARCH_BIZ_NAME, "pageReturnMax", "true"), "true");
    }

    public static String cD() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("23ff0558", new Object[0]) : a(SEARCH_BIZ_NAME, "addWidgetUrl", "https://web.m.taobao.com/app/starlink/widget-web/guide?id=124");
    }

    public static boolean cE() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("acd19fcd", new Object[0])).booleanValue() : StringUtils.equals(a(SEARCH_BIZ_NAME, "inShopLoadNextPage", "false"), "true");
    }

    public static boolean cF() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("acdfb74e", new Object[0])).booleanValue() : StringUtils.equals(a(SEARCH_BIZ_NAME, "ipGuideSearchBar", "true"), "true");
    }

    public static boolean aB() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a93da80c", new Object[0])).booleanValue() : StringUtils.equals(a(SEARCH_BIZ_NAME, "ipErrorRedirect", "true"), "true");
    }

    public static String aO() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("575ad7ab", new Object[0]) : a(SEARCH_BIZ_NAME, "inshopRequestParamsWhiteList", "");
    }

    public static boolean M() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4529658", new Object[0])).booleanValue() : StringUtils.equals("true", a(SEARCH_BIZ_NAME, "musWebTransparent", "true"));
    }

    public static boolean ac() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab0eafad", new Object[0])).booleanValue() : StringUtils.equals("true", a(SEARCH_BIZ_NAME, "preloadImageWhenParse", "true"));
    }

    public static float ao() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("abb7c9a5", new Object[0])).floatValue();
        }
        if (!cr()) {
            return 1.0f;
        }
        return com.taobao.search.mmd.util.d.a(a(SEARCH_BIZ_NAME, "imageRatio", "0.75"), 0.75f);
    }

    public static boolean O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("46ec55a", new Object[0])).booleanValue();
        }
        boolean equals = StringUtils.equals("degrade", Downgrade.getInstance().getDowngradeStrategy("search").getTacticsPerformance());
        if (bw() && equals && e("lowDisableSkeleton")) {
            return false;
        }
        return StringUtils.equals("true", a(SEARCH_BIZ_NAME, "skeletonLoading", "true"));
    }

    public static boolean W() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4df8162", new Object[0])).booleanValue() : StringUtils.equals("true", a(SEARCH_BIZ_NAME, "coverLoadingView", "true"));
    }

    public static boolean e(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1c6cb13a", new Object[]{str})).booleanValue() : StringUtils.equals("true", a(SEARCH_BIZ_NAME, str, "true"));
    }

    public static boolean ce() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ae948fed", new Object[0])).booleanValue() : StringUtils.equals("true", a(SEARCH_BIZ_NAME, "tabPageState", "true"));
    }

    public static boolean cf() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("aea2a76e", new Object[0])).booleanValue() : StringUtils.equals("true", a(SEARCH_BIZ_NAME, "preposeFallback", "false"));
    }

    public static boolean bs() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ada5005c", new Object[0])).booleanValue() : StringUtils.equals("true", a(SEARCH_BIZ_NAME, "needActionBar", "false"));
    }

    public static boolean bw() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("addd5e60", new Object[0])).booleanValue() : StringUtils.equals("true", a(SEARCH_BIZ_NAME, "srpPerf", "true"));
    }

    public static boolean cr() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("af4bc17a", new Object[0])).booleanValue() : StringUtils.equals("true", a(SEARCH_BIZ_NAME, "imageResize", "true"));
    }

    public static boolean cx() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("afa04e80", new Object[0])).booleanValue() : StringUtils.equals("true", a(SEARCH_BIZ_NAME, "searchDoorPreloadV1", "true"));
    }

    public static String cH() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3e15efd4", new Object[0]) : a(SEARCH_BIZ_NAME, "sortBarTemplate", "ms_tb-webb-widget_search_weexv2_topbar_sort");
    }

    public static boolean bi() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ad181552", new Object[0])).booleanValue() : StringUtils.equals("true", a(SEARCH_BIZ_NAME, "darkModeRender", "true"));
    }

    public static int cI() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ad09fdc0", new Object[0])).intValue() : com.taobao.search.mmd.util.d.b(a(SEARCH_BIZ_NAME, "coverLoadingDelay", "200"), 200);
    }

    public static boolean cJ() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ad181552", new Object[0])).booleanValue() : StringUtils.equals("true", a(SEARCH_BIZ_NAME, "clearExternalFrom", "true"));
    }

    public static boolean cK() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ad262cd3", new Object[0])).booleanValue() : StringUtils.equals("true", a(SEARCH_BIZ_NAME, "auctionExposeAsync", "true"));
    }

    public static boolean cL() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ad344454", new Object[0])).booleanValue() : StringUtils.equals("true", a(SEARCH_BIZ_NAME, "fixColdLaunchPv", "true"));
    }

    public static boolean cM() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ad425bd5", new Object[0])).booleanValue() : StringUtils.equals("true", a(SEARCH_BIZ_NAME, "addTaoPPParmas", "true"));
    }

    public static boolean N() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("460add9", new Object[0])).booleanValue() : StringUtils.equals("true", a(SEARCH_BIZ_NAME, "cartTrackP4p", "true"));
    }

    public static boolean P() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("47cdcdb", new Object[0])).booleanValue() : StringUtils.equals("true", a(SEARCH_BIZ_NAME, "speechSwitch", "true"));
    }

    public static boolean by() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("adf98d62", new Object[0])).booleanValue() : StringUtils.equals("true", a(SEARCH_BIZ_NAME, "reportClipboardPasteV2", "true"));
    }
}
