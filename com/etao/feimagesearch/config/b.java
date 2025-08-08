package com.etao.feimagesearch.config;

import android.app.Activity;
import android.os.Build;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.security.realidentity.f3;
import com.alipay.mobile.common.logging.util.perf.Constants;
import com.alipay.mobile.common.rpc.util.RpcInvokerUtil;
import com.alipay.mobile.intelligentdecision.model.IDecisionResult;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.config.bean.ImageRule;
import com.etao.feimagesearch.config.bean.YuvDiffCheckerConfig;
import com.etao.feimagesearch.util.k;
import com.taobao.android.searchbaseframe.util.g;
import com.taobao.artc.internal.ArtcParams;
import com.taobao.downgrade.Downgrade;
import com.taobao.downgrade.DowngradeStrategy;
import com.taobao.orange.OrangeConfig;
import com.taobao.search.mmd.util.j;
import com.taobao.search.sf.util.tlog.TLogTracker;
import com.taobao.taobao.R;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import tb.cof;
import tb.com;
import tb.cpr;
import tb.imo;
import tb.kge;
import tb.qtd;

/* loaded from: classes3.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ADVANCE_AUTODETECT_EXPERIMENT = "tbAndroidPltAdvanceAutodetectV4";
    public static final String MA_DETECT_EXPERIMENT = "tbAndroidPltEnablePltAlbumAIPreDetectV3";
    public static final String REALTIME_SEARCH_EXPERIMENT = "tbAndroidPltEnableRealtimeSearchEntrance";
    public static final String SMART_LENS = "tbAndroidPltEnableSmartAutoDetectV2";

    /* renamed from: a  reason: collision with root package name */
    private static Map<String, ImageRule> f6660a;
    private static String b;

    public static boolean cW() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("adcf46df", new Object[0])).booleanValue();
        }
        return false;
    }

    static {
        kge.a(-1256729207);
        f6660a = null;
        b = "image_search";
    }

    public static String bB() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ccc1f6d9", new Object[0]);
        }
        if (c.c()) {
            return com.taobao.search.rainbow.a.a(Collections.singletonList(SMART_LENS));
        }
        return com.taobao.search.rainbow.a.c();
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str}) : a(str, "");
    }

    public static String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{str, str2}) : cof.a(str, str2);
    }

    public static String e(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("666b162a", new Object[]{str}) : c(str, "");
    }

    public static String c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cef1bce2", new Object[]{str, str2});
        }
        String a2 = cof.a(str, str2);
        qtd qtdVar = new qtd();
        qtdVar.a("testName", str);
        qtdVar.a("testConfigValue", a2);
        TLogTracker.a("RainbowConfig", qtdVar);
        return a2;
    }

    public static String a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("457cf91a", new Object[]{str, str2, str3}) : OrangeConfig.getInstance().getConfig(str, str2, str3);
    }

    public static String b(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4204a5c3", new Object[]{str, str2}) : a(b, str, str2);
    }

    public static ImageRule b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageRule) ipChange.ipc$dispatch("350bd8dc", new Object[]{str});
        }
        if (f6660a == null) {
            HashMap hashMap = new HashMap();
            f6660a = hashMap;
            hashMap.put(ImageRule.NET_TYPE_WIFI, new ImageRule(ImageRule.NET_TYPE_WIFI));
            f6660a.put(ImageRule.NET_TYPE_4G, new ImageRule(ImageRule.NET_TYPE_4G));
            f6660a.put(ImageRule.NET_TYPE_3G, new ImageRule(ImageRule.NET_TYPE_3G));
            f6660a.put(ImageRule.NET_TYPE_2G, new ImageRule(ImageRule.NET_TYPE_2G));
            f6660a.put(ImageRule.NET_TYPE_OTHER, new ImageRule(ImageRule.NET_TYPE_OTHER));
        }
        ImageRule imageRule = f6660a.get(str);
        return imageRule == null ? new ImageRule(str) : imageRule;
    }

    public static String c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b82f346c", new Object[]{str});
        }
        String b2 = b("irpWebUrl", str);
        return StringUtils.isEmpty(b2) ? str : b2;
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : "true".equals(b("irpForceDegree", "false"));
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : StringUtils.equals("true", b("sessionReleaseClose", ""));
    }

    public static String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[0]) : b("screenShotConfig", "1200_1200_70");
    }

    public static YuvDiffCheckerConfig d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (YuvDiffCheckerConfig) ipChange.ipc$dispatch("76f29b63", new Object[0]);
        }
        String b2 = b("yuvDiffCheckerConfig", "{}");
        if (StringUtils.isEmpty(b2)) {
            return new YuvDiffCheckerConfig();
        }
        try {
            return (YuvDiffCheckerConfig) JSON.parseObject(b2).toJavaObject(YuvDiffCheckerConfig.class);
        } catch (Exception unused) {
            return new YuvDiffCheckerConfig();
        }
    }

    public static String g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d71944f2", new Object[0]) : b("newAppId", "24695");
    }

    public static boolean d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d23b17f9", new Object[]{str})).booleanValue();
        }
        String b2 = b("new_scene_source", "");
        if (!StringUtils.isEmpty(b2) && !StringUtils.isEmpty(str)) {
            return b2.contains(str);
        }
        return false;
    }

    public static String h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5d9eff91", new Object[0]) : b("mus_page_version", "0.1.7");
    }

    public static JSONObject i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("8a95015e", new Object[0]);
        }
        try {
            return new JSONObject(b("videoTrackModel", ""));
        } catch (Exception unused) {
            return null;
        }
    }

    public static int j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5eb3fe4", new Object[0])).intValue() : g.b(b("videoMaxObjectCount", "20"), 20);
    }

    public static int k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5f95765", new Object[0])).intValue() : g.b(b("videoFramePerSecond", "2"), 2);
    }

    public static int l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6076ee6", new Object[0])).intValue() : g.b(b("videoMaxDuration", "30"), 30);
    }

    public static int m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6158667", new Object[0])).intValue() : g.b(b("objectDetectMinCnt", "2"), 2);
    }

    public static boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6239df9", new Object[0])).booleanValue();
        }
        if (M() || aM()) {
            return false;
        }
        String a2 = a("tbAndroidPltVideoSearch2");
        return StringUtils.isEmpty(a2) || StringUtils.equals("enable", a2);
    }

    public static boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("631b57a", new Object[0])).booleanValue();
        }
        if (!StringUtils.isEmpty(bd())) {
            return d("tbAndroidPltMarketingTab", "baseline");
        }
        return false;
    }

    public static boolean p() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("63fccfb", new Object[0])).booleanValue() : StringUtils.equals(a("tbAndroidVideoSearchOnlinePic"), "baseline");
    }

    public static String q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("18528f28", new Object[0]) : b("videoOssNameSpace", "videosearch");
    }

    public static boolean s() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("66a137e", new Object[0])).booleanValue() : "true".equals(b("disableBoxPreParse", ""));
    }

    public static String u() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("326979a4", new Object[0]) : a("tbAndroidPltVideoYolo");
    }

    public static String a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f223e6b4", new Object[]{new Boolean(z)});
        }
        if (z) {
            return a("tbAndroidSysCameraYolo");
        }
        return a("tbAndroidPltCameraYolo");
    }

    public static boolean v() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6945a01", new Object[0])).booleanValue() : "true".equals(b("disableQuickSetting", ""));
    }

    public static int w() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6a27171", new Object[0])).intValue() : g.b(b("detectFinishPopDelay", "2000"), 2000);
    }

    public static boolean x() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6b08903", new Object[0])).booleanValue() : StringUtils.equals(a("tbAndroidVideoSearchAutoPop"), "baseline");
    }

    public static boolean y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6bea084", new Object[0])).booleanValue();
        }
        Boolean j = j("enableHardwareDecode");
        if (j != null) {
            return j.booleanValue();
        }
        return StringUtils.equals("enable", a("tbAndroidPltHardwareDecodeV2"));
    }

    public static boolean z() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6ccb805", new Object[0])).booleanValue() : !StringUtils.equals("false", b("watermarkDetect", ""));
    }

    public static boolean A() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3a97c4c", new Object[0])).booleanValue() : !StringUtils.equals("false", b("watermarkAlbumDetect", "true"));
    }

    public static float B() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3b793b9", new Object[0])).floatValue() : g.a(b("autoDetectRegionThreshold", "0.5"), 0.5f);
    }

    public static boolean C() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3c5ab4e", new Object[0])).booleanValue() : StringUtils.equals(b("disableCenterCheck", "false"), "true");
    }

    public static int D() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3d3c2be", new Object[0])).intValue() : g.b(b("recentImageDiff", "120"), 120);
    }

    public static int E() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3e1da3f", new Object[0])).intValue() : g.b(b("recentImageDuration", "5500"), 5500);
    }

    public static String I() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("136d6650", new Object[0]) : b("tppApiBackup", "mtop.relationrecommend.PailitaoRecommend.recommend");
    }

    public static String ay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("694b75c1", new Object[0]);
        }
        if (com.alibaba.ability.localization.b.c()) {
            return b("barcodeApiNameI18n", "mtop.relationrecommend.PailitaoRecommend.recommend");
        }
        return b("barcodeApiName", "mtop.relationrecommend.PailitaoRecommend.recommend");
    }

    public static String bA() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("463c3c3a", new Object[0]);
        }
        if (com.alibaba.ability.localization.b.c()) {
            return b("barcodeApiVersionI18n", "1.0");
        }
        return b("barcodeApiVersion", "1.0");
    }

    public static String J() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("99f320ef", new Object[0]) : b("tppApiVerBackup", "1.0");
    }

    public static String f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd890709", new Object[]{str});
        }
        if (com.alibaba.ability.localization.b.c()) {
            return b("cameraRejectHintI18N", str);
        }
        return b("cameraRejectHint", str);
    }

    public static boolean K() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4366756", new Object[0])).booleanValue() : StringUtils.equals(b("irpBackPopDisabled", "false"), "true");
    }

    public static boolean M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4529658", new Object[0])).booleanValue();
        }
        DowngradeStrategy downgradeStrategy = Downgrade.getInstance().getDowngradeStrategy("search");
        return downgradeStrategy != null && StringUtils.equals("degrade", downgradeStrategy.getTacticsPerformance());
    }

    public static boolean N() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("460add9", new Object[0])).booleanValue() : c.a().equalsIgnoreCase("low");
    }

    public static boolean O() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("46ec55a", new Object[0])).booleanValue() : c.a().equalsIgnoreCase("high");
    }

    public static boolean P() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("47cdcdb", new Object[0])).booleanValue() : c.a().equalsIgnoreCase("medium");
    }

    public static boolean R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4990bdd", new Object[0])).booleanValue();
        }
        if (!N()) {
            return StringUtils.equals(a("tbAndroidPltFaceDetect"), "enable");
        }
        return false;
    }

    public static int S() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4a7234d", new Object[0])).intValue() : g.b(b("faceDetectSize", "320"), 320);
    }

    public static float T() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4b53acb", new Object[0])).floatValue() : g.a(b("faceDetectThreshold", "0.85"), 0.85f);
    }

    public static boolean U() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4c35260", new Object[0])).booleanValue() : StringUtils.equals("true", b("disableOneCapture", "false"));
    }

    public static boolean V() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4d169e1", new Object[0])).booleanValue() : StringUtils.equals(b("restrainRegionDisable", "false"), "true");
    }

    public static boolean W() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4df8162", new Object[0])).booleanValue();
        }
        if (!com.a()) {
            return StringUtils.equals(a("tbAndroidPltElderVersion"), "enable");
        }
        return true;
    }

    public static boolean X() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4ed98e3", new Object[0])).booleanValue();
        }
        if (!com.a()) {
            return StringUtils.equals(a("tbAndroidSearchDoorGuessSearch"), "enable");
        }
        return true;
    }

    public static long aa() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("aaf2809b", new Object[0])).longValue() : g.a(b("sameFrameThreshold", "200"), 200L);
    }

    public static boolean ab() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab00982c", new Object[0])).booleanValue();
        }
        if (!com.a()) {
            return StringUtils.equals(a("tbAndroidAutoDetectDiffThreshold"), "enable");
        }
        return true;
    }

    public static boolean ac() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab0eafad", new Object[0])).booleanValue() : StringUtils.equals("true", b("pltImageCacheOn", "true"));
    }

    public static int ae() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ab2ade9e", new Object[0])).intValue() : g.b(b("recheckMaxCnt", "3"), 3);
    }

    public static boolean af() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab38f630", new Object[0])).booleanValue() : StringUtils.equals("true", b("localImageDisabled", "false"));
    }

    public static String ah() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7a6a1132", new Object[0]) : b("qrNotFoundHint", com.alibaba.ability.localization.b.a(R.string.taobao_app_1007_1_19023));
    }

    public static boolean aj() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab715434", new Object[0])).booleanValue();
        }
        String b2 = b("permission_req_opt_enable", "");
        return StringUtils.isEmpty(b2) || "true".equals(b2);
    }

    public static boolean ak() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab7f6bb5", new Object[0])).booleanValue() : d("tbAndroidIrpUseCache", "baseline");
    }

    private static boolean d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7f180e83", new Object[]{str, str2})).booleanValue();
        }
        String a2 = a(str);
        if (StringUtils.isEmpty(a2)) {
            a2 = str2;
        }
        return StringUtils.equals(a2, "enable");
    }

    public static boolean al() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab8d8336", new Object[0])).booleanValue() : StringUtils.equals(b("disableAlbumAnimation", "true"), "true");
    }

    public static boolean am() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab9b9ab7", new Object[0])).booleanValue() : StringUtils.equals(b("shopMuiseEnable", "true"), "true");
    }

    public static int ao() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("abb7c9a8", new Object[0])).intValue() : g.b(b("maxWatermarkSize", "307200"), f3.e);
    }

    public static boolean as() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("abf027bd", new Object[0])).booleanValue() : StringUtils.equals("true", b("remoteImageFallback", "false"));
    }

    public static boolean at() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("abfe3f3e", new Object[0])).booleanValue();
        }
        String a2 = a("tbAndroidPltVideoSearchEnableNewIrp");
        return StringUtils.isEmpty(a2) || "enable".equals(a2);
    }

    public static boolean au() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ac0c56bf", new Object[0])).booleanValue() : d("tbAndroidPltEnableScanLongAlbumImage", "enable");
    }

    public static int ax() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ac369d31", new Object[0])).intValue() : g.b(b("videoHighLightStep", IDecisionResult.ENGINE_ERROR), 5000);
    }

    public static boolean az() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ac52cc44", new Object[0])).booleanValue();
        }
        String a2 = a("tbAndroidPltEnableScanAlbumConfigConvertV2");
        return StringUtils.isEmpty(a2) || "enable".equals(a2);
    }

    public static boolean aB() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a93da80c", new Object[0])).booleanValue() : g.a(b("tbAndroidPltEnableScaleAlbumAnchor", "true"), true);
    }

    public static long aC() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a94bbf7d", new Object[0])).longValue() : g.b(b("realtimeGoIrpDelayTime", "3"), 3);
    }

    public static String aD() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8f9bd2d6", new Object[0]);
        }
        long aC = aC();
        try {
            return String.format(b("realtimeGoIrpTipFormat", com.alibaba.ability.localization.b.a(R.string.taobao_app_1007_1_19015)), Long.valueOf(aC));
        } catch (Exception unused) {
            return aC + com.alibaba.ability.localization.b.a(R.string.taobao_app_1007_1_19010);
        }
    }

    public static boolean aE() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a967ee8f", new Object[0])).booleanValue();
        }
        if (aM()) {
            return false;
        }
        Boolean j = j("enableRealTime");
        if (j != null && j.booleanValue()) {
            return true;
        }
        return O() && d(REALTIME_SEARCH_EXPERIMENT, "");
    }

    public static long aF() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a9760600", new Object[0])).longValue() : g.b(b("realtimeCardExpireDate", "1000"), 1000);
    }

    public static int aG() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a9841d80", new Object[0])).intValue() : g.b(b("realtimeCardCacheNumber", "10"), 10);
    }

    public static int aH() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a9923501", new Object[0])).intValue() : g.b(a("tbAndroidPltRtObjectBitmapScaleWidth"), ArtcParams.SD244pVideoParams.WIDTH);
    }

    public static int aI() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a9a04c82", new Object[0])).intValue() : g.b(a("tbAndroidPltRtObjectBitmapScaleHeight"), 512);
    }

    public static float aJ() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a9ae6400", new Object[0])).floatValue() : g.a(b("rtAreaRateStep", "0.06f"), 0.06f);
    }

    public static float aK() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a9bc7b81", new Object[0])).floatValue() : g.a(b("rtSmallCardAreaRateThreshold", "0.2"), 0.2f);
    }

    public static float aL() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a9ca9302", new Object[0])).floatValue() : g.a(b("rtBigCardAreaRateThreshold", "0.4"), 0.4f);
    }

    public static boolean aN() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a9e6c218", new Object[0])).booleanValue() : !N() && d(MA_DETECT_EXPERIMENT, "baseline");
    }

    public static boolean aO() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9f4d999", new Object[0])).booleanValue();
        }
        if (N()) {
            return false;
        }
        int b2 = g.b(a(ADVANCE_AUTODETECT_EXPERIMENT, "3"), -1);
        return (b2 >= 0 && (b2 & 2) > 0) && !N();
    }

    public static int aP() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("aa02f109", new Object[0])).intValue() : g.b(a("tbAndroidPltMnnExtraInfoMaxLength", "1000"), 1000);
    }

    public static boolean aR() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("aa1f201c", new Object[0])).booleanValue() : !N() && g.a(b("tbAndroidPltEnableAdvanceObjectDetectPreload", "true"), true);
    }

    public static boolean an() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("aba9b238", new Object[0])).booleanValue() : !N() && g.a(b("tbAndroidPltEnableChannelDetectPreload", "true"), true);
    }

    public static long aT() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("aa3b4f0e", new Object[0])).longValue() : g.a(a("tbAndroidPltAdvanceObjectDetectSilenceTimeV4", "1000"), 1000L);
    }

    public static boolean aU() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("aa49669f", new Object[0])).booleanValue() : StringUtils.equals(b("cropGuideEnabled", "true"), "true");
    }

    public static boolean aV() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("aa577e20", new Object[0])).booleanValue() : StringUtils.equals(b("convertArgbEnabled", "true"), "true");
    }

    public static boolean aW() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("aa6595a1", new Object[0])).booleanValue() : !StringUtils.isEmpty(b("tbAndroidPltEnableUploadLocationOnMtop", ""));
    }

    public static boolean aX() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("aa73ad22", new Object[0])).booleanValue() : d("tbAndroidPltEnableRtCardCollision", "enable");
    }

    public static boolean aZ() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("aa8fdc24", new Object[0])).booleanValue() : d("tbAndroidPltEnableMnnExecutorCacheV2", "baseline");
    }

    public static boolean bc() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("acc3884c", new Object[0])).booleanValue() : StringUtils.equals(b("appendPageSpm", "true"), "true");
    }

    public static String bd() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aa84bff7", new Object[0]) : b("marketingTabTemplateUrl", "");
    }

    public static String[] bf() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("b301a5da", new Object[0]);
        }
        String b2 = b("tbAndroidPltIrpOuterTrafficValidKeys", "item_id");
        if (StringUtils.isEmpty(b2)) {
            return new String[0];
        }
        return b2.split("/");
    }

    public static String[] bg() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("fd333f1b", new Object[0]);
        }
        String b2 = b("tbAndroidPltIrpOuterTrafficValidKeys", "picurl/tfskey");
        if (StringUtils.isEmpty(b2)) {
            return new String[0];
        }
        return b2.split("/");
    }

    public static boolean bh() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ad09fdd1", new Object[0])).booleanValue() : d("tbAndroidPltEnableIrpOuterTrafficEmptyKey", "");
    }

    public static boolean bi() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ad181552", new Object[0])).booleanValue() : d("tbAndroidPltEnableIrpOuterTraffic", "enable");
    }

    public static boolean bj() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ad262cd3", new Object[0])).booleanValue() : StringUtils.equals(b("tbAndroidPltIrpPageUTFixedParamsEnabled", "true"), "true");
    }

    public static boolean bk() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ad344454", new Object[0])).booleanValue() : d("tbAndroidPltEnablePltAlbumDecodeCondition", "enable");
    }

    public static boolean bl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ad425bd5", new Object[0])).booleanValue() : d("tbAndroidPltEnableAdjustAlbumOrientation", "enable");
    }

    public static boolean bm() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ad507356", new Object[0])).booleanValue() : d("tbAndroidPltEnableOnNewIntent", "enable");
    }

    public static long bn() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ad5e8ac7", new Object[0])).longValue() : g.a(a("tbAndroidPltImageFlowMinChangeHintInterval", "500"), 500L);
    }

    public static boolean bo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ad6ca258", new Object[0])).booleanValue() : d("tbAndroidPltEnableMnnExecutorCounters_v2", "enable");
    }

    public static String[] bt() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("c1b80768", new Object[0]);
        }
        String b2 = b("tbAndroidPltIrpOuterTrafficPSSourceKeysV2", "");
        if (StringUtils.isEmpty(b2)) {
            return new String[0];
        }
        return b2.split("/");
    }

    public static String[] bG() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("b70016fb", new Object[0]);
        }
        String b2 = b("tbAndroidPltIrpCompatibleModePSSourceKeys", "order_invaliditem");
        if (StringUtils.isEmpty(b2)) {
            return new String[0];
        }
        return b2.split("/");
    }

    public static boolean bv() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("adcf46df", new Object[0])).booleanValue() : !N() && d("tbAndroidPltEnableExtraInfoWhenTakePhoto", "enable");
    }

    public static String dX() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f0a33305", new Object[0]) : b("albumOuterPsSourceBlackList", "");
    }

    public static boolean bx() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("adeb75e1", new Object[0])).booleanValue() : "true".equals(b("IrpRequestExtraParamsPassNewLogicEnabled", "true"));
    }

    public static String[] by() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("34b005ad", new Object[0]);
        }
        String b2 = b("tbAndroidPltIrpRequestExtraParamsPassPSSourceKeys", "pplActivity");
        if (StringUtils.isEmpty(b2)) {
            return new String[0];
        }
        return b2.split("/");
    }

    public static String b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3c557ff5", new Object[]{new Boolean(z)});
        }
        if (z) {
            return com.alibaba.ability.localization.b.a(R.string.taobao_app_1007_1_33711);
        }
        if (com.alibaba.ability.localization.b.c()) {
            return b("scanHintI18N", com.alibaba.ability.localization.b.a(R.string.taobao_app_1007_1_19839));
        }
        return b("scanHint", com.alibaba.ability.localization.b.a(R.string.taobao_app_1007_1_18932));
    }

    public static boolean bC() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab00982c", new Object[0])).booleanValue() : d("tbAndroidPltEnableRtCardInCenterAreaJudge", "enable");
    }

    public static boolean bD() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab0eafad", new Object[0])).booleanValue() : d("tbAndroidPltEnableRtCardScreenEdge", "enable");
    }

    public static float bE() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ab1cc71a", new Object[0])).floatValue() : g.a(b("RtCardScreenEdgeDetectThreshold", "0.45f"), 0.45f);
    }

    public static float bF() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ab2ade9b", new Object[0])).floatValue() : g.a(b("RtCardInCenterStepThreshold", "0.1f"), 0.1f);
    }

    public static boolean bH() {
        int b2;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab470db1", new Object[0])).booleanValue() : !N() && (b2 = g.b(a(ADVANCE_AUTODETECT_EXPERIMENT, "3"), -1)) >= 0 && (b2 & 1) > 0;
    }

    public static boolean bI() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab552532", new Object[0])).booleanValue() : d("tbAndroidPltEnableAbstractThrowableMsg", "enable");
    }

    public static String[] bJ() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("9594e2be", new Object[0]);
        }
        String b2 = b("irpServerPassParamKeys", "busiKey/n/maxn/vm/m/biz_type/setSpApp/closepict/page/client/utd_id/newPhotoSearch/subSearchType/sversion/musPageVersion/extraParams/rainbow/plt_autodetect_extraInfo/faceCount/face/debug/watermark/videoWatermark/full_region_size/cameraMode/barCode/pssource/photofrom/passThroughParams/regionChanged/pltSession/seller_id/hasCropedImage/sellid/shopId/sellerId/sellerid/shopid/itemid/item_id/shop_id/originalRegion/region/picurl/cmt/screenshotsAppSrc/imgClientChannel/imgClientDetectExtraInfo");
        if (StringUtils.isEmpty(b2)) {
            return new String[0];
        }
        return b2.split("/");
    }

    public static String bK() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("87758670", new Object[0]) : b("irpServerPicUrlPrefix", "https://img.alicdn.com/imgextra/");
    }

    public static String[] bL() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("29f81540", new Object[0]);
        }
        String b2 = b("irpRegionEditImgRequestSizeConfig", "224/224");
        if (StringUtils.isEmpty(b2)) {
            return new String[0];
        }
        return b2.split("/");
    }

    public static boolean bM() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab8d8336", new Object[0])).booleanValue() : d("tbAndroidPltEnableKillRealtimeSearchOnTrimMemory", "enable");
    }

    public static int bN() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ab9b9aa6", new Object[0])).intValue() : g.b(b("memoryLevelValueOfDestroyRealtime", "20"), 20);
    }

    public static boolean bO() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aba9b238", new Object[0])).booleanValue();
        }
        if (!aM()) {
            return d("tbAndroidPltEnableCamera2_v3", "disable");
        }
        return false;
    }

    public static boolean bQ() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("abc5e13a", new Object[0])).booleanValue() : d("tbAndroidPltMetaSearchV1", "baseline");
    }

    public static boolean bS() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("abe2103c", new Object[0])).booleanValue() : g.a(b("tbAndroidPltEnableGapDeviceUseDefaultDetector", "true"), true);
    }

    public static boolean bT() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("abf027bd", new Object[0])).booleanValue() : !N() && d("tbAndroidPltEnableFaceDetectV2", "enable");
    }

    public static boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[0])).booleanValue() : d("tbAndroidPltEnableOldFaceDetect", "enable");
    }

    public static long bV() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ac0c56af", new Object[0])).longValue() : g.a(b("faceDetectV2TimeoutConfig", "500"), 500L);
    }

    public static String i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c2e2d9a6", new Object[]{str});
        }
        String g = d(str) ? g() : "21834";
        if (StringUtils.isEmpty(str)) {
            return g;
        }
        String str2 = "";
        String b2 = b("appIdConfig", str2);
        if (StringUtils.isEmpty(b2)) {
            return g;
        }
        String[] split = b2.split(";");
        if (split.length <= 0) {
            return g;
        }
        int length = split.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            String[] split2 = split[i].split(":");
            if (split2.length >= 2) {
                String str3 = split2[0];
                String str4 = split2[1];
                if (str.equals(str3) && !StringUtils.isEmpty(str4)) {
                    str2 = str4;
                    break;
                }
            }
            i++;
        }
        return StringUtils.isEmpty(str2) ? g : str2;
    }

    private static String cN() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("65384f8e", new Object[0]);
        }
        if (com.alibaba.ability.localization.b.c()) {
            return k("orangeNewMuiseSrpUrl2023I18n");
        }
        return k("orangeNewMuiseSrpUrl2023");
    }

    public static String bW() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d5ba45e4", new Object[0]);
        }
        String cN = cN();
        if (!StringUtils.isEmpty(cN)) {
            return cN;
        }
        String a2 = com.etao.feimagesearch.capture.dynamic.templates.b.a(com.etao.feimagesearch.capture.dynamic.templates.b.c());
        if (!StringUtils.isEmpty(a2)) {
            return a2;
        }
        if (com.alibaba.ability.localization.b.c()) {
            return b("irpI18NMuiseUrl2023Default", "https://g.alicdn.com/tmall-ovs-rax/i18n-image-search-2022/1.0.42/weex/home.v20.wlm");
        }
        return b("irpMuiseUrl2023Default", "https://g.alicdn.com/imagesearch-page/image-search-2022/1.0.50/weex/home.v20.wlm");
    }

    public static boolean bZ() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ac44b4c3", new Object[0])).booleanValue();
        }
        Boolean j = j("regionCache");
        if (j != null && j.booleanValue()) {
            return true;
        }
        return d("tbAndroidPltEnableRegionPageCachedData", "");
    }

    public static String ag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f3e45693", new Object[0]);
        }
        if (com.alibaba.ability.localization.b.c()) {
            return k("orangeCameraI18nFallbackUrl");
        }
        return k("orangeCameraNewUrl");
    }

    public static boolean cc() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ae7860eb", new Object[0])).booleanValue() : "true".equals(b("irpScreenShotListenEnabled", "true"));
    }

    public static int cd() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ae86785b", new Object[0])).intValue() : g.b(a("tbAndroidPltIrpImgCompressRate", "70"), 70);
    }

    public static Long ce() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Long) ipChange.ipc$dispatch("47647a0c", new Object[0]);
        }
        if (N()) {
            return Long.valueOf(g.a(b("dynamicCaptureLoadTimeLimitOnLowDevice", "4000"), (long) Constants.STARTUP_TIME_LEVEL_1));
        }
        return Long.valueOf(g.a(b("dynamicCaptureLoadTimeLimit", "3000"), 3000L));
    }

    public static Boolean j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("32acf838", new Object[]{str});
        }
        if (!com.taobao.search.common.util.c.a()) {
            return null;
        }
        try {
            String a2 = com.taobao.android.searchbaseframe.chitu.c.a(str, imo.b());
            if (!StringUtils.isEmpty(a2)) {
                return Boolean.valueOf("true".equals(a2));
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public static String k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("711ebb64", new Object[]{str});
        }
        if (!com.taobao.search.common.util.c.a()) {
            return null;
        }
        try {
            return com.taobao.android.searchbaseframe.chitu.c.a(str, imo.b());
        } catch (Exception unused) {
            return null;
        }
    }

    public static String ch() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ecd43b4", new Object[0]) : !aO() ? "" : a("tbAndroidPltEnableTrustTerminalAlgorithm", "");
    }

    public static boolean ci() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("aeccedf1", new Object[0])).booleanValue() : "true".equals(b("irpPopModeEnabled", "true"));
    }

    public static String l(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c83cac43", new Object[]{str});
        }
        if (StringUtils.isEmpty(str)) {
            return "";
        }
        String b2 = b("componentConfig", "huichang_618fushi:plt_more_clothing_api");
        if (StringUtils.isEmpty(b2)) {
            return "";
        }
        String[] split = b2.split(";");
        if (split.length <= 0) {
            return "";
        }
        int length = split.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                str2 = "";
                break;
            }
            String[] split2 = split[i].split(":");
            if (split2.length >= 2) {
                String str3 = split2[0];
                str2 = split2[1];
                if (str.equals(str3) && !StringUtils.isEmpty(str2)) {
                    break;
                }
            }
            i++;
        }
        return StringUtils.isEmpty(str2) ? "" : str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m(java.lang.String r6) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.etao.feimagesearch.config.b.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L19
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r1[r2] = r6
            java.lang.String r6 = "6df97b42"
            java.lang.Object r6 = r0.ipc$dispatch(r6, r1)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            return r6
        L19:
            java.lang.String r0 = "pltLoading"
            java.lang.Boolean r0 = j(r0)
            if (r0 == 0) goto L29
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L29
            return r3
        L29:
            boolean r0 = android.text.StringUtils.isEmpty(r6)
            if (r0 != 0) goto L80
            java.lang.String r0 = "push;1111xianshang;haiguan;dhhdpa;"
            java.lang.String r1 = "irpLoadingOptimizeWhiteList"
            java.lang.String r1 = b(r1, r0)
            boolean r4 = android.text.StringUtils.isEmpty(r1)
            java.lang.String r5 = ";"
            if (r4 != 0) goto L58
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r6)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            boolean r1 = r1.contains(r4)
            if (r1 == 0) goto L58
            r1 = 1
            goto L59
        L58:
            r1 = 0
        L59:
            if (r1 != 0) goto L7f
            java.lang.String r1 = "irpLoadingOptimizeWhiteListV2"
            java.lang.String r0 = b(r1, r0)
            boolean r1 = android.text.StringUtils.isEmpty(r0)
            if (r1 != 0) goto L80
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r6)
            r1.append(r5)
            java.lang.String r6 = r1.toString()
            boolean r6 = r0.contains(r6)
            if (r6 == 0) goto L80
            r2 = 1
            goto L80
        L7f:
            r2 = r1
        L80:
            if (r2 == 0) goto L83
            return r3
        L83:
            java.lang.String r6 = "tbAndroidPltIrpLoadingOptimize"
            java.lang.String r0 = ""
            boolean r6 = d(r6, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etao.feimagesearch.config.b.m(java.lang.String):boolean");
    }

    public static String bz() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3a02c9a1", new Object[0]);
        }
        String k = k("metasightARUrl");
        return StringUtils.isEmpty(k) ? b("xrPageMusTemplateUrl", "https://g.alicdn.com/tb-webb-widget/plt_scene_ar_activity_widget/0.0.2/weex/home.v20.wlm") : k;
    }

    public static boolean n(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b82b1483", new Object[]{str})).booleanValue();
        }
        if (StringUtils.isEmpty(str)) {
            return false;
        }
        String b2 = b("watermarkDetectWhiteList", "anma1;anma2;");
        if (!StringUtils.isEmpty(b2)) {
            if (b2.contains(str + ";")) {
                return true;
            }
        }
        return false;
    }

    public static boolean co() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("af217af7", new Object[0])).booleanValue() : "true".equals(b("enableCaptureDegradeToast", "true"));
    }

    public static boolean cp() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("af2f9278", new Object[0])).booleanValue() : "true".equals(b("enableUpdateUtLogMapProperties", "true"));
    }

    public static boolean cq() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("af3da9f9", new Object[0])).booleanValue() : "true".equals(b("enableCaptureTemplatePreload", "true"));
    }

    public static boolean cs() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("af59d8fb", new Object[0])).booleanValue() : d("tbAndroidPltMnnUseLocalAlgoModelCacheV6", "enable");
    }

    public static String ct() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5d120328", new Object[0]) : b("mnnCidBlackList", "");
    }

    public static boolean cu() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("af7607fd", new Object[0])).booleanValue();
        }
        if (!com.a()) {
            return d("tbAndroidPltSaveMnnAlgoModel_v2", "enable");
        }
        return true;
    }

    public static boolean cz() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("afbc7d82", new Object[0])).booleanValue() : d("tbAndroidPltEnableOldMnnExecutorSaveAlgoModel", "enable");
    }

    public static boolean cv() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("af841f7e", new Object[0])).booleanValue() : d("tbAndroidPltClearMnnAlgoModel_v3", "disable");
    }

    public static boolean cw() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("af9236ff", new Object[0])).booleanValue() : d("tbAndroidPltEnableScanCodeDetect", "enable");
    }

    public static boolean cx() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("afa04e80", new Object[0])).booleanValue() : d("tbAndroidPltEnablePltCodeDirectNav", "enable");
    }

    public static boolean cy() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("afae6601", new Object[0])).booleanValue() : d("tbAndroidPltTurnOffFlashWhenFlipCamera", "enable");
    }

    public static YuvDiffCheckerConfig cA() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (YuvDiffCheckerConfig) ipChange.ipc$dispatch("4d02d43d", new Object[0]);
        }
        String b2 = b("newYuvDiffCheckerConfig", "{}");
        if (StringUtils.isEmpty(b2)) {
            return new YuvDiffCheckerConfig();
        }
        try {
            return (YuvDiffCheckerConfig) JSON.parseObject(b2).toJavaObject(YuvDiffCheckerConfig.class);
        } catch (Exception unused) {
            return new YuvDiffCheckerConfig();
        }
    }

    public static boolean cB() {
        Boolean j;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("aca7594a", new Object[0])).booleanValue() : com.a() && (j = j("mockDisableAdvanceDetector")) != null && j.booleanValue();
    }

    public static boolean cC() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("acb570cb", new Object[0])).booleanValue();
        }
        Boolean j = j("stop_frame_input");
        return j == null || !j.booleanValue();
    }

    public static float cD() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("acc38838", new Object[0])).floatValue() : g.a(a("tbAndroidPltNewDarkFrameThreshold", "0.2f"), 0.2f);
    }

    public static long cE() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("acd19fbd", new Object[0])).longValue() : g.a(a("tbAndroidPltNewDeviceStableThreshold", "1000L"), 1000L);
    }

    public static int cF() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("acdfb73d", new Object[0])).intValue() : g.b(a("tbAndroidPltNewFrameDiffThreshold", "10"), 10);
    }

    public static int cG() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("acedcebe", new Object[0])).intValue() : g.b(a("tbAndroidPltNewFrameUpdateTimeThreshold", "25"), 25);
    }

    public static com.alibaba.fastjson.JSONObject cI() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.alibaba.fastjson.JSONObject) ipChange.ipc$dispatch("3bd634ed", new Object[0]) : o(b("captureTips", "{}"));
    }

    private static com.alibaba.fastjson.JSONObject o(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.alibaba.fastjson.JSONObject) ipChange.ipc$dispatch("b67458e0", new Object[]{str});
        }
        try {
            return JSON.parseObject(str);
        } catch (Exception unused) {
            return new com.alibaba.fastjson.JSONObject();
        }
    }

    public static boolean cJ() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ad181552", new Object[0])).booleanValue() : d("tbAndroidPltInsertTaskCidToAlgo", "enable");
    }

    public static boolean cL() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ad344454", new Object[0])).booleanValue() : d("tbUniversalPssourceNotnull", "enable");
    }

    public static int aA() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a92f907a", new Object[0])).intValue();
        }
        String a2 = a("tbAndroidPltCaptureNewStyleConfigV2");
        if (StringUtils.isEmpty(a2)) {
            a2 = "0";
        }
        return g.b(a2, 0);
    }

    public static long bY() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ac369d32", new Object[0])).longValue() : g.a(b("captureNewStyleSilenceTime", "1000"), 1000L);
    }

    public static boolean cb() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ae6a496a", new Object[0])).booleanValue();
        }
        if (O()) {
            return d("tbAndroidPltEnableScanCodeInPaiTab_new_High", "baseline");
        }
        if (P()) {
            return d("tbAndroidPltEnableScanCodeInPaiTab_new_Medium", "baseline");
        }
        return d("tbAndroidPltEnableScanCodeInPaiTab_new_Low", "baseline");
    }

    public static long cO() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ad5e8ac7", new Object[0])).longValue() : g.a(a("tbAndroidPltSilentTimeInPermissionScene"), 1500L);
    }

    public static boolean cQ() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ad7ab9d9", new Object[0])).booleanValue() : d("tbAndroidPltEnableSilenceTimeDynamicConfig", "enable");
    }

    public static boolean cS() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ad96e8db", new Object[0])).booleanValue();
        }
        Boolean j = j("disableAutoDetect");
        if (j == null) {
            return false;
        }
        return j.booleanValue();
    }

    public static boolean cT() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ada5005c", new Object[0])).booleanValue() : d("tbAndroidAlbumUpdateOptimize", "");
    }

    public static long cV() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("adc12f4e", new Object[0])).longValue() : g.a(b("tbAndroidPltCodeDetectTimeoutConfig", "1000"), 1000L);
    }

    public static long cZ() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("adf98d52", new Object[0])).longValue() : g.a(b("pltRuntimePermTipSilenceInterval", "3"), 3L);
    }

    public static String dc() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b86237da", new Object[0]) : b("pltScanCodeAnchorAddress", "https://gw.alicdn.com/imgextra/i4/O1CN01Fl3q1p1xNuMFlq21s_!!6000000006432-54-tps-100-100.apng");
    }

    public static String dd() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3ee7f279", new Object[0]) : b("pltIrpScanLineAddress", "https://gw.alicdn.com/imgextra/i1/O1CN01fuqmVY1w25sVp4FP0_!!6000000006249-2-tps-750-196.png");
    }

    public static boolean df() {
        Boolean j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b057800d", new Object[0])).booleanValue();
        }
        if (k.a() && (j = j("mockAlinnBuildFailed")) != null) {
            return j.booleanValue();
        }
        return false;
    }

    public static boolean dg() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b065978e", new Object[0])).booleanValue();
        }
        Boolean j = j("alinnStorageOpt");
        if (j != null) {
            return j.booleanValue();
        }
        return d("tbAndroidPltEnableModelStorageOpt_V2", "baseline");
    }

    public static boolean dh() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b073af0f", new Object[0])).booleanValue() : d("tbAndroidPltEnableModelStorageOpt", "enable");
    }

    public static String dj() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("660a5233", new Object[0]);
        }
        String k = k("AutoDetectAlgoConfig");
        return !StringUtils.isEmpty(k) ? k : a("tbAndroidPltAutoDetectAlgoConfig", "");
    }

    public static String ef() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("962500f8", new Object[0]);
        }
        String k = k("SmartDetectAlgoConfig");
        return !StringUtils.isEmpty(k) ? k : a("tbAndroidPltSmartDetectAlgoConfig", "");
    }

    public static boolean dk() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b09df592", new Object[0])).booleanValue();
        }
        if (!k.a()) {
            return d("tbAndroidPltEnableHistoryStorageOpt", "baseline");
        }
        return true;
    }

    public static boolean dl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b0ac0d13", new Object[0])).booleanValue();
        }
        if (!k.a()) {
            return d("tbAndroidPltEnableDeleteUnusedHistoryImage", "baseline");
        }
        return true;
    }

    public static long dm() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b0ba2484", new Object[0])).longValue();
        }
        Boolean j = j("useTestHistoryPeriod");
        if (j != null && j.booleanValue()) {
            return 3600000L;
        }
        return g.a(b("historyValidPeriod", "15724800000L"), 15724800000L);
    }

    public static boolean dn() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b0c83c15", new Object[0])).booleanValue();
        }
        if (!k.a()) {
            return d("tbAndroidPltEnableOutCleanUnusedHistoryImage", "baseline");
        }
        return true;
    }

    /* renamed from: do  reason: not valid java name */
    public static boolean m623do() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b0d65396", new Object[0])).booleanValue();
        }
        if (!k.a()) {
            return d("tbAndroidPltEnableCamera1ExposureCompensation", "baseline");
        }
        return true;
    }

    public static boolean dq() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b0f28298", new Object[0])).booleanValue() : "true".equals(b("irpUserDataCheckEnable", "true"));
    }

    public static boolean ds() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b10eb19a", new Object[0])).booleanValue() : d("tbAndroidPltEnableDeleteCachedImageFile", "enable");
    }

    public static boolean dt() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b11cc91b", new Object[0])).booleanValue() : StringUtils.isEmpty(b("useNewIrpNotSafeDialog", ""));
    }

    public static String du() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2dc95708", new Object[0]) : b("IrpNotSafeDialogTip", com.alibaba.ability.localization.b.a(R.string.taobao_app_1007_1_19013));
    }

    public static boolean dv() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b138f81d", new Object[0])).booleanValue() : g.a(b("tbAndroidPltDestroyCaptureHybridViewWhenTimeout", "false"), false);
    }

    public static boolean dw() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b1470f9e", new Object[0])).booleanValue() : d("tbAndroidPltEnableAlbumVExcutorLoadThumbnail", "");
    }

    public static boolean dy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b1633ea0", new Object[0])).booleanValue();
        }
        Boolean j = j("capturePreloadV5");
        if (j != null) {
            return j.booleanValue();
        }
        return d("tbAndroidPltEnableDynamicCaptureTemplatePreload_V6", "enable");
    }

    public static String dB() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6125295b", new Object[0]);
        }
        if (com.alibaba.ability.localization.b.c()) {
            return b("captureI18NTemplateUrlInCdn", "https://g.alicdn.com/tmall-ovs-rax/i18n-camera-page-2023/0.0.55/weex/home.v20.wlm");
        }
        return b("captureTemplateUrlInCdn", "https://g.alicdn.com/asr-pages/camera-page-2023/0.0.49/weex/home.v20.wlm");
    }

    public static boolean dG() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("aea2a76e", new Object[0])).booleanValue() : d("tbAndroidPltEnableCapturePerformanceMonitor", "enable");
    }

    public static int a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("68a25ad", new Object[]{activity})).intValue();
        }
        if (!com.s() && !com.r()) {
            return 4;
        }
        return cpr.a(activity);
    }

    public static boolean dI() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("aebed670", new Object[0])).booleanValue() : d("tbAndroidPltEnableIrpDarkModeOptimize", "enable");
    }

    public static boolean dJ() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("aeccedf1", new Object[0])).booleanValue() : StringUtils.equals("true", b("albumCrashFixed", "true"));
    }

    public static long dK() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("aedb0562", new Object[0])).longValue() : g.a(b("captureTemplatePreloadInterval", "120000"), 120000L);
    }

    public static boolean dN() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("af054bf5", new Object[0])).booleanValue();
        }
        if (!k.a()) {
            return d("tbAndroidPltEnableScanCodeFrameMonitor", "enable");
        }
        return true;
    }

    public static boolean aM() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a9d8aa97", new Object[0])).booleanValue() : com.s() || com.r();
    }

    public static boolean dR() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("af3da9f9", new Object[0])).booleanValue() : d("tbAndroidPltEnableLoadXSearchInScreenRecordActivity", "baseline");
    }

    public static boolean cP() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ad6ca258", new Object[0])).booleanValue() : d("tbAndroidPltEnableTakePhotoIrpScanCaptureMergeV2", "enable");
    }

    public static long dT() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("af59d8eb", new Object[0])).longValue();
        }
        String k = k("ScanTimeout");
        if (!StringUtils.isEmpty(k)) {
            return g.a(k, 1500L);
        }
        return g.a(b("ScanCodeTimeConfigOnTakePhoto", "1500"), 1500L);
    }

    public static long G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3fe0942", new Object[0])).longValue();
        }
        String k = k("ScanTimeout");
        if (!StringUtils.isEmpty(k)) {
            return g.a(k, 1500L);
        }
        return g.a(b("albumIrpScanCaptureMergeTimeoutConfigV2", "1500"), 1500L);
    }

    public static boolean av() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ac1a6e40", new Object[0])).booleanValue() : d("tbAndroidPltEnableAutoDetectIrpScanCaptureMerge", "enable");
    }

    public static boolean cg() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aeb0beef", new Object[0])).booleanValue();
        }
        Boolean j = j("forbid_frame_scan_code");
        if (j != null) {
            return j.booleanValue();
        }
        return false;
    }

    public static boolean aq() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("abd3f8bb", new Object[0])).booleanValue() : d("tbAndroidPltEnableOpenCameraOnCreate", "enable");
    }

    public static boolean ar() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("abe2103c", new Object[0])).booleanValue() : "enable".equalsIgnoreCase(b("enableCaptureMuisePerformanceMonitor", "enable"));
    }

    public static boolean dC() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ae6a496a", new Object[0])).booleanValue() : StringUtils.isEmpty(b("enableCaptureNewImageLoader", ""));
    }

    public static boolean cY() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("adeb75e1", new Object[0])).booleanValue();
        }
        if (dH() || bs()) {
            return false;
        }
        if (com.s() && !dZ()) {
            return false;
        }
        if (com.r() && !dY()) {
            return false;
        }
        return d("tbAndroidPltEnableScreenshotFloatBtnV2", "");
    }

    public static boolean dE() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ae86786c", new Object[0])).booleanValue() : StringUtils.equals("true", b("irpTitleBarGuideDisabled", ""));
    }

    public static boolean bs() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ada5005c", new Object[0])).booleanValue();
        }
        String b2 = b("irpScreenshotFloatOSVersionBlackList", "31;");
        return b2.contains(Build.VERSION.SDK_INT + ";");
    }

    public static boolean dH() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aeb0beef", new Object[0])).booleanValue();
        }
        String b2 = b("irpScreenshotFloatBrandBlackList", "xiaomi;");
        return b2.contains(Build.BRAND + ";");
    }

    public static boolean dY() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("afa04e80", new Object[0])).booleanValue() : StringUtils.equals(b("irpScreenshotFloatInPadEnable", ""), "true");
    }

    public static boolean dZ() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("afae6601", new Object[0])).booleanValue() : StringUtils.equals(b("irpScreenshotFloatInFoldEnable", ""), "true");
    }

    public static boolean dS() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("af4bc17a", new Object[0])).booleanValue() : g.a(b("tbAndroidPltEnableScanAlbumMaDetect", "false"), false);
    }

    public static boolean dV() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("af7607fd", new Object[0])).booleanValue() : "true".equals(b("irpAlbumPreLoadoptimizeDisabled", ""));
    }

    public static boolean ea() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b1c5e327", new Object[0])).booleanValue() : d("tbAndroidPltEnableCaptureAlbumAndHistoryNewStyle_V3", "baseline");
    }

    public static boolean eb() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b1d3faa8", new Object[0])).booleanValue() : d("tbAndroidPltEnableCapturePreloadOnDestroy", "enable");
    }

    public static long ec() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b1e21219", new Object[0])).longValue() : g.b(a("tbAndroidPltLatestAlbumImageTimeInterval"), 1) * 60;
    }

    public static int dW() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("af841f6d", new Object[0])).intValue() : g.b(b("screenshotsAbandonFrameCount", "1"), 1);
    }

    public static int ee() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b1fe411a", new Object[0])).intValue() : g.b(b("captureLoadAlbumRecursionCount", "5"), 5);
    }

    public static boolean cH() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("acfbe650", new Object[0])).booleanValue() : d("tbAndroidPltEnableAsyncChannelDetect", "enable");
    }

    public static boolean cR() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ad88d15a", new Object[0])).booleanValue();
        }
        if (!N()) {
            return d("tbAndroidPltEnableMnnBlackFrameDetect", "enable");
        }
        return false;
    }

    public static String da() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ab56c29c", new Object[0]) : a("tbAndroidPltIrpImgCompressConfigVersion", RpcInvokerUtil.RPC_V1);
    }

    public static boolean bp() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ad7ab9d9", new Object[0])).booleanValue() : d("tbAndroidPltEnableNewExecutorOnLoadImage", "enable");
    }

    public static boolean r() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("65bfbfd", new Object[0])).booleanValue() : g.a(b("tbAndroidPltEnableAsyncUt", "true"), true);
    }

    public static boolean H() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("40c20d3", new Object[0])).booleanValue() : Boolean.TRUE.equals(j("forceCaptureDegrade"));
    }

    public static boolean cK() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ad262cd3", new Object[0])).booleanValue() : "enable".equals(b("disableCaptureNewImageLoader", ""));
    }

    public static boolean db() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b01f2209", new Object[0])).booleanValue();
        }
        Boolean j = j("IrpSearchAllowance");
        return j != null && j.booleanValue();
    }

    public static boolean di() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b081c690", new Object[0])).booleanValue() : d("tbAndroidPltStopInputFrameWhenPaused", "enable");
    }

    public static boolean dL() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("aee91cf3", new Object[0])).booleanValue() : d("tbAndroidPltEnableCallHasTmplCacheInMainThreadV2", "disable");
    }

    public static boolean t() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6782aff", new Object[0])).booleanValue() : d("tbAndroidPltEnableBaseMnnUnitThreadOpt", "enable");
    }

    public static boolean F() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3eff1d1", new Object[0])).booleanValue() : g.a(b("tbAndroidPltEnableAlbumPreprocess", "true"), true);
    }

    public static boolean aw() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ac2885c1", new Object[0])).booleanValue() : g.a(b("tbAndroidPltEnableStartPreviewOpt", "true"), true);
    }

    public static boolean bb() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("acb570cb", new Object[0])).booleanValue() : d("tbAndroidPltEnableReleaseCroServiceOnWorkerThread", "enable");
    }

    public static boolean be() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("acdfb74e", new Object[0])).booleanValue() : d("tbAndroidPltEnableSetAlbumAdapterOptV2", "baseline");
    }

    public static boolean bq() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ad88d15a", new Object[0])).booleanValue() : d("tbAndroidPltEnableDestoryThreadDispatcherOpt", "enable");
    }

    public static String aQ() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("64664ce9", new Object[0]) : b("captureTab3TemplateUrlInCdn", "https://g.alicdn.com/asr-pages/plt_camera_page_tab3/0.0.1/weex/home.v20.wlm");
    }

    public static boolean bP() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("abb7c9b9", new Object[0])).booleanValue();
        }
        if (!com.alibaba.ability.localization.b.c()) {
            return d("tbAndroidPltEnableCaptureTab3V2", "baseline");
        }
        return false;
    }

    public static boolean bR() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("abd3f8bb", new Object[0])).booleanValue() : d("tbAndroidPltEnableLoadLocalImgWithCache", "enable");
    }

    public static boolean cf() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("aea2a76e", new Object[0])).booleanValue() : g.a(b("tbAndroidPltEnableMnnInitInMainSearchImmediatelyV2", "true"), true);
    }

    public static boolean cM() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ad425bd5", new Object[0])).booleanValue() : g.a(b("disableCaptureUTFix", ""), false);
    }

    public static boolean cU() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("adb317dd", new Object[0])).booleanValue() : g.a(b("autodetectPerfRecord", "true"), true);
    }

    public static boolean ca() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ae5c31e9", new Object[0])).booleanValue();
        }
        Boolean j = j("smartLens");
        if (j != null && j.booleanValue()) {
            return true;
        }
        if (!com.alibaba.ability.localization.b.c()) {
            return d(SMART_LENS, "");
        }
        return false;
    }

    public static float Y() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4fbb050", new Object[0])).floatValue() : g.a(a("tbAndroidPltDarkFrameThreshold", "0.1"), 0.1f);
    }

    public static float cl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("aef73460", new Object[0])).floatValue() : g.a(b("smartLensZoomTargetRatio", "0.25"), 0.25f);
    }

    public static boolean cm() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("af054bf5", new Object[0])).booleanValue() : d("tbAndroidPltEnableBottomAreaVisibleOpt", "enable");
    }

    public static boolean cr() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("af4bc17a", new Object[0])).booleanValue() : g.a(b("tbAndroidPltEnableBottomAreaAnimationOpt", "true"), true);
    }

    public static boolean de() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b049688c", new Object[0])).booleanValue();
        }
        Boolean j = j("lockJump");
        return j != null && j.booleanValue();
    }

    public static String dp() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8d2cb1ed", new Object[0]) : b("SmartLensTipConfig", "");
    }

    public static int dA() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ae4e1a57", new Object[0])).intValue() : g.b(b("pltInitDelayTime", "0"), 0);
    }

    public static String dM() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("28e42e30", new Object[0]) : a("tbAndroidPltSmartLensBackTipConfigV2", "baseline");
    }

    public static boolean dO() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("af136376", new Object[0])).booleanValue() : d("tbAndroidPltIrpHeaderHide", "");
    }

    public static boolean ap() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("abc5e13a", new Object[0])).booleanValue() : d("tbAndroidPltEnableScanLoadingOpt", "enable");
    }

    public static boolean ba() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aca7594a", new Object[0])).booleanValue();
        }
        if (N() || com.alibaba.ability.localization.b.c()) {
            return false;
        }
        return d("tbAndroidPltIrpDRSV3", "");
    }

    public static boolean g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b0cfe3bc", new Object[]{str})).booleanValue();
        }
        if (StringUtils.isEmpty(str)) {
            return false;
        }
        String b2 = b("irpDRSPSSourceBlackList", "");
        return b2.contains(str + "/");
    }

    public static String bu() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("99662486", new Object[0]) : b("irpDRSAppId", "31730");
    }

    public static boolean ck() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aee91cf3", new Object[0])).booleanValue();
        }
        if (!ea() || com.alibaba.ability.localization.b.c()) {
            return false;
        }
        return d("tbAndroidPltCaptureAlbumPopIntens", "");
    }

    public static String cn() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("35efa36e", new Object[0]) : b("captureAlbumPopIntensHint", "你可能想搜的截图商品");
    }

    public static boolean dP() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("af217af7", new Object[0])).booleanValue() : d("tbAndroidPltEnableFaceDetect", "enable");
    }

    public static boolean dQ() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("af2f9278", new Object[0])).booleanValue() : g.a(b("tbAndroidPltEnableLoadCaptureTemplateMainThread", "false"), false);
    }

    public static boolean L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4447ed7", new Object[0])).booleanValue();
        }
        String e = e("tbAndroidPltElderAdaptV2");
        if (StringUtils.isEmpty(e)) {
            return false;
        }
        boolean b2 = j.INSTANCE.b();
        boolean z = com.b().getResources().getConfiguration().fontScale >= e();
        if (RpcInvokerUtil.RPC_V1.equals(e)) {
            return b2 || z;
        } else if (!RpcInvokerUtil.RPC_V2.equals(e)) {
            return false;
        } else {
            return b2;
        }
    }

    public static float e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a4ca5c", new Object[0])).floatValue() : g.a(b("elderTriggerSysFontSize", "1.4"), 1.4f);
    }

    public static boolean Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("48af45c", new Object[0])).booleanValue();
        }
        if (!com.alibaba.ability.localization.b.c()) {
            return d("tbAndroidPltEnableCapturePerformOptV4", "enable");
        }
        return false;
    }

    public static boolean br() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ad96e8db", new Object[0])).booleanValue() : g.a(b("enableSetSurfaceLayoutParamsAgain", "false"), false);
    }

    public static boolean Z() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("509c7e5", new Object[0])).booleanValue() : g.a(b("enableActivityInitOpt", "true"), true);
    }

    public static boolean dU() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("af67f07c", new Object[0])).booleanValue() : d("tbAndroidPltCaptureMusRequestDelay", "");
    }

    public static long ad() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ab1cc71e", new Object[0])).longValue() : g.a(b("waterInitDelayTime", "0"), 0L);
    }

    public static boolean ai() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab633cb3", new Object[0])).booleanValue() : g.a(b("enableScanModeOpt", "true"), true);
    }

    public static int aS() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("aa2d378c", new Object[0])).intValue() : g.b(b("irpQuickSearchIntervalTime", "60000"), 60000);
    }

    public static boolean aY() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aa81c4a3", new Object[0])).booleanValue();
        }
        if (!com.alibaba.ability.localization.b.c()) {
            return d("tbAndroidPltIrpQuickSearch", "");
        }
        return false;
    }

    public static boolean bw() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("addd5e60", new Object[0])).booleanValue() : g.a(b("tbAndroidPltEnableScanBizInitOptV2", "true"), true);
    }

    public static boolean bU() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("abfe3f3e", new Object[0])).booleanValue() : d("tbAndroidPltCaptureJumpHint", "");
    }

    public static boolean bX() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ac2885c1", new Object[0])).booleanValue() : g.a(b("enableIrpZxsAppendQueryText", "true"), true);
    }

    public static boolean cj() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aedb0572", new Object[0])).booleanValue();
        }
        Boolean j = j("testIrpCustomBgHeader");
        if (j == null) {
            return false;
        }
        return j.booleanValue();
    }

    public static boolean cX() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("addd5e60", new Object[0])).booleanValue() : g.a(b("enableIrpSaveHistoryNewLogic", "true"), true);
    }

    public static boolean dr() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b1009a19", new Object[0])).booleanValue() : g.a(b("ScanAnchorBitmapOpt", "true"), true);
    }

    public static boolean dx() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b155271f", new Object[0])).booleanValue() : g.a(b("enableAlbumDecodeBitmapCopyOpt", "true"), true);
    }

    public static boolean dz() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b1715621", new Object[0])).booleanValue();
        }
        Boolean j = j("CaptureAddBottomViewOpt");
        if (j != null) {
            return j.booleanValue();
        }
        return g.a(b("enableCaptureAddBottomViewOpt", "true"), true);
    }
}
