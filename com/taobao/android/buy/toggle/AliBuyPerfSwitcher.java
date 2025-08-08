package com.taobao.android.buy.toggle;

import android.content.Context;
import android.os.SystemClock;
import mtopsdk.common.util.StringUtils;
import com.alibaba.evo.EVO;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import tb.akt;
import tb.arc;
import tb.ard;
import tb.bam;
import tb.baw;
import tb.bbh;
import tb.kge;
import tb.riy;

/* loaded from: classes4.dex */
public class AliBuyPerfSwitcher {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int HOLD_INTERVAL_IN_MILLS = 60000;
    private static final String ORANGE_GROUP_NAME = "aura_purchase_perf";
    private static final String PERF_AB_TEST = "perfABTest";
    private static final String TAG = "AliBuyPerfSwitcher";
    private static volatile String sCacheBucket;
    private static final Map<String, Boolean> sCacheOrange;
    private static boolean sHasInit;
    private static long sLastRefreshTime;
    private static final Map<String, Boolean> sRealResult;

    public static /* synthetic */ void access$000() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcd60777", new Object[0]);
        } else {
            loadBucket();
        }
    }

    static {
        kge.a(-394065007);
        sCacheOrange = new HashMap();
        sRealResult = new HashMap();
        sCacheBucket = null;
        sHasInit = false;
        sRealResult.put("enableTouchDownPerf", false);
        sRealResult.put("enableFragmentPerf", false);
        sRealResult.put("enableAnimPerf", false);
    }

    public static String getString(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7e264abe", new Object[]{str, str2}) : OrangeConfig.getInstance().getConfig(ORANGE_GROUP_NAME, str, str2);
    }

    public static void syncPreloadBucket() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24cd2aff", new Object[0]);
        } else if (sHasInit) {
        } else {
            loadBucket();
            sHasInit = true;
        }
    }

    private static void loadBucket() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("815d02f7", new Object[0]);
            return;
        }
        sCacheBucket = bam.a("AB_BUY", "BUY_PERFORMANCE_EXPERIMENT", "hit", "");
        ard a2 = arc.a();
        a2.a("sCacheBucket " + sCacheBucket);
    }

    private static boolean isSwitchOpened(Context context, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a94046c8", new Object[]{context, str})).booleanValue() : EVO.isSwitchOpened(context, str);
    }

    public static void asyncLoadBucket() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d8cc893", new Object[0]);
        } else {
            bbh.a(new Runnable() { // from class: com.taobao.android.buy.toggle.AliBuyPerfSwitcher.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        AliBuyPerfSwitcher.access$000();
                    }
                }
            });
        }
    }

    private static String getBucket() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b4b88e19", new Object[0]);
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        if (uptimeMillis - sLastRefreshTime > 60000) {
            sLastRefreshTime = uptimeMillis;
            asyncLoadBucket();
        }
        return sCacheBucket;
    }

    private static boolean disableLocalSwitch(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a32c21cc", new Object[]{str})).booleanValue();
        }
        return new File("/data/local/tmp/" + str).exists();
    }

    private static boolean enableLocalSwitch(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("90d91e91", new Object[]{str})).booleanValue();
        }
        return new File("/data/local/tmp/" + str).exists();
    }

    private static boolean isCurrentPerfEnable(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e77d14e", new Object[]{str, str2, str3, str4})).booleanValue();
        }
        String config = OrangeConfig.getInstance().getConfig(ORANGE_GROUP_NAME, "enableAllPerf", "false");
        String config2 = OrangeConfig.getInstance().getConfig(ORANGE_GROUP_NAME, str2, "false");
        String config3 = OrangeConfig.getInstance().getConfig(ORANGE_GROUP_NAME, str3, "false");
        String string = getString(str, str4);
        String bucket = getBucket();
        return Boolean.parseBoolean(string) && ("true".equalsIgnoreCase(config) || (!"0".equalsIgnoreCase(bucket) && (("1".equalsIgnoreCase(bucket) && "true".equalsIgnoreCase(config3)) || str3.equals(bucket) || "true".equalsIgnoreCase(config2))));
    }

    private static boolean isCurrentPerfEnable(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b3417f3a", new Object[]{str, str2})).booleanValue();
        }
        return "true".equals(OrangeConfig.getInstance().getConfig(ORANGE_GROUP_NAME, "enableAllPerf", "false")) || (Boolean.parseBoolean(getString(str, str2)) && !"0".equalsIgnoreCase(getBucket()));
    }

    private static boolean isEnable(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b153486c", new Object[]{str, str2})).booleanValue() : "true".equals(getString(str, str2));
    }

    public static Map<String, Object> getABTestParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("4597facb", new Object[0]);
        }
        final String realBucket = getRealBucket();
        if (StringUtils.isEmpty(realBucket)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(PERF_AB_TEST, (Object) new JSONObject() { // from class: com.taobao.android.buy.toggle.AliBuyPerfSwitcher.2
            {
                put("hit", (Object) realBucket);
            }
        });
        return jSONObject;
    }

    public static String getRealBucket() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2de9949b", new Object[0]);
        }
        String bucket = getBucket();
        if (sRealResult.get(bucket) == null || sRealResult.get(bucket).booleanValue()) {
            return bucket;
        }
        ard a2 = arc.a();
        a2.a("当前设备命中bucket[" + bucket + riy.ARRAY_END_STR + "，真实运行在bucket[0]", arc.a.a().a("AURA/performance").b());
        return "0";
    }

    private static void recordLog(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9210fd0", new Object[]{str, new Boolean(z)});
        } else {
            sCacheOrange.put(str, Boolean.valueOf(z));
        }
    }

    public static void updatePerfSwitch(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b868ee7d", new Object[]{str, new Boolean(z)});
            return;
        }
        try {
            if (sCacheOrange.get(str).booleanValue() == z) {
                return;
            }
            ard a2 = arc.a();
            a2.a("当前开关" + str + ",更新值：" + z, arc.a.a().a("AURA/performance").b());
            sRealResult.put(str, Boolean.valueOf(z));
        } catch (Throwable unused) {
        }
    }

    public static void dumpLog() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da11e937", new Object[0]);
            return;
        }
        ard a2 = arc.a();
        a2.a("一休开关：" + sCacheOrange + "\n 真实开关：" + sRealResult, arc.a.a().a("AURA/performance").a("bucketInfo", sCacheBucket == null ? "null" : sCacheBucket).b());
        sRealResult.clear();
    }

    public static boolean enableNavPerf() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4d9597b4", new Object[0])).booleanValue();
        }
        boolean isEnable = isEnable("enableNavPerf", "true");
        recordLog("enableNavPerf", isEnable);
        return isEnable;
    }

    public static boolean enableInteractionPerf() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("894690a3", new Object[0])).booleanValue();
        }
        boolean isEnable = isEnable("enableInteractionPerf", "true");
        recordLog("enableInteractionPerf", isEnable);
        return isEnable;
    }

    public static boolean enablePrefetch() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("44938025", new Object[0])).booleanValue();
        }
        boolean isEnable = isEnable("enablePrefetchPerf", "true");
        if (baw.a()) {
            isEnable = isEnable && !disableLocalSwitch(".disablePrefetchPerf");
        }
        recordLog("enablePrefetchPerf", isEnable);
        return isEnable;
    }

    public static boolean enablePrefetchV2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b2845e41", new Object[0])).booleanValue();
        }
        boolean isCurrentPerfEnable = isCurrentPerfEnable("enablePrefetchV2", "hitPrefetchV2", "enablePrefetchV2", "true");
        if (baw.a()) {
            isCurrentPerfEnable = isCurrentPerfEnable && !disableLocalSwitch(".disablePrefetchPerf");
        }
        recordLog("enablePrefetchV2", isCurrentPerfEnable);
        return isCurrentPerfEnable;
    }

    public static boolean enableIdlePerf() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7e7a380b", new Object[0])).booleanValue();
        }
        boolean isEnable = isEnable("enableIdlePerf", "true");
        recordLog("enableIdlePerf", isEnable);
        return isEnable;
    }

    public static boolean enableLogPerf() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cfcde0d5", new Object[0])).booleanValue();
        }
        boolean isEnable = isEnable("enableLogPerf", "true");
        recordLog("enableLogPerf", isEnable);
        return isEnable;
    }

    public static boolean isHighDeviceLevel() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e4e8e8cd", new Object[0])).booleanValue() : akt.a() == 0;
    }

    public static boolean enableOtherPerf() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a2e58561", new Object[0])).booleanValue();
        }
        boolean isEnable = isEnable("enableOtherV2Perf", "true");
        recordLog("enableOtherPerf", isEnable);
        return isEnable;
    }

    public static boolean enableThreadPerf() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("80ccb381", new Object[0])).booleanValue();
        }
        boolean z = !isCurrentPerfEnable("enableThreadPerf", "hitThreadPerf", "enableThreadPerf", "true");
        recordLog("enableThreadPerf", z);
        return z;
    }

    public static boolean enableForceMainThreadPerf() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ec63ae7f", new Object[0])).booleanValue();
        }
        boolean isCurrentPerfEnable = isCurrentPerfEnable("enableForceMainThreadPerf", "true");
        recordLog("enableForceMainThreadPerf", isCurrentPerfEnable);
        return isCurrentPerfEnable;
    }

    public static boolean enableLogicPerf() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3d22c7af", new Object[0])).booleanValue();
        }
        boolean isEnable = isEnable("enableLogicV2Perf", "true");
        recordLog("enableLogicV2Perf", isEnable);
        return isEnable;
    }

    public static boolean enableAsyncUT() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("380c5fa3", new Object[0])).booleanValue();
        }
        boolean isEnable = isEnable("enableAsyncUT", "true");
        recordLog("enableAsyncUT", isEnable);
        return isEnable;
    }

    public static boolean enablePreloadView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a4119d6", new Object[0])).booleanValue();
        }
        boolean isEnable = isEnable("enablePreloadView", "true");
        recordLog("enablePreloadView", isEnable);
        return isEnable;
    }

    public static boolean enableNavResolve() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("504fbbb7", new Object[0])).booleanValue();
        }
        boolean isEnable = isEnable("enableNavResolve", "true");
        recordLog("enableNavResolve", isEnable);
        return isEnable;
    }

    public static boolean enableIdleRender() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9fcfe78", new Object[0])).booleanValue();
        }
        boolean isEnable = isEnable("enableIdleRender", "true");
        recordLog("enableIdleRender", isEnable);
        return isEnable;
    }

    public static boolean enableParsePerf() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a4b2ce04", new Object[0])).booleanValue();
        }
        boolean isEnable = isEnable("enableParsePerf", "true");
        recordLog("enableParsePerf", isEnable);
        return isEnable;
    }

    public static boolean enableStreamJson() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("741d8176", new Object[0])).booleanValue();
        }
        boolean isEnable = isEnable("enableStreamJson", "true");
        recordLog("enableStreamJson", isEnable);
        return isEnable;
    }

    public static boolean enableAuraPreload() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1c57e0ae", new Object[0])).booleanValue();
        }
        boolean isCurrentPerfEnable = isCurrentPerfEnable("enableAuraPreload", "hitThirdStagePerf", "enableThirdStagePerf", "true");
        recordLog("enableAuraPreload", isCurrentPerfEnable);
        return isCurrentPerfEnable;
    }

    public static boolean enableAsyncPreloadMainPage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("615db1a3", new Object[0])).booleanValue();
        }
        boolean isCurrentPerfEnable = isCurrentPerfEnable("enableAsyncPreloadMainPage", "true");
        recordLog("enableAsyncPreloadMainPage", isCurrentPerfEnable);
        return isCurrentPerfEnable;
    }

    public static boolean enableFragmentPerf() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("42ce5507", new Object[0])).booleanValue();
        }
        boolean isCurrentPerfEnable = isCurrentPerfEnable("enableFragmentPerf", "hitFragmentPerf", "enableFragmentPerf", "true");
        recordLog("enableFragmentPerf", isCurrentPerfEnable);
        return isCurrentPerfEnable;
    }

    public static boolean enableTouchDownPerf() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("66f6df52", new Object[0])).booleanValue();
        }
        boolean isEnable = isEnable("enableTouchDownPerf", "true");
        if (!isEnable) {
            isEnable = isEnable("enableJSBridgePreRequest", "true");
        }
        recordLog("enableTouchDownPerf", isEnable);
        return isEnable;
    }

    public static boolean enableJSBridgePreRequest() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a149350c", new Object[0])).booleanValue();
        }
        boolean isEnable = isEnable("enableJSBridgePreRequest", "true");
        if (!isEnable) {
            isEnable = isEnable("enableTouchDownPerf", "true");
        }
        recordLog("enableJSBridgePreRequest", isEnable);
        return isEnable;
    }

    public static boolean enableStreamResponse() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a6c59acf", new Object[0])).booleanValue();
        }
        boolean isCurrentPerfEnable = isCurrentPerfEnable("enableStreamResponse", "hitStreamResponse", "enableStreamResponse", "true");
        if (baw.a()) {
            isCurrentPerfEnable = isCurrentPerfEnable && !disableLocalSwitch(".disableStreamResponse");
        }
        recordLog("enableStreamResponse", isCurrentPerfEnable);
        return isCurrentPerfEnable;
    }

    public static boolean enableCombineRender() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("18a1127d", new Object[0])).booleanValue();
        }
        boolean isCurrentPerfEnable = isCurrentPerfEnable("enableCombineRender", "hitCombineRender", "enableCombineRender", "true");
        recordLog("enableCombineRender", isCurrentPerfEnable);
        return isCurrentPerfEnable;
    }

    public static boolean enableAnimPerf() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d7232d48", new Object[0])).booleanValue();
        }
        if (isCurrentPerfEnable("enableAnimPerf", "hitFourStagePerf", "enableAnimPerf", "true") && isHighDeviceLevel()) {
            z = true;
        }
        recordLog("enableAnimPerf", z);
        return z;
    }

    public static boolean enableParsePerfV2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8807b060", new Object[0])).booleanValue();
        }
        boolean isCurrentPerfEnable = isCurrentPerfEnable("enableParsePerfV3", "hitParsePerfV3", "enableParsePerfV3", "true");
        recordLog("enableParsePerfV3", isCurrentPerfEnable);
        return isCurrentPerfEnable;
    }

    public static boolean enablePreRender() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fc614161", new Object[0])).booleanValue();
        }
        boolean isCurrentPerfEnable = isCurrentPerfEnable("enablePreRender", "hitPreRender", "enablePreRender", "true");
        recordLog("enablePreRender", isCurrentPerfEnable);
        return isCurrentPerfEnable;
    }

    public static boolean enablePopupWindowStreamResponse() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("59cefe05", new Object[0])).booleanValue();
        }
        boolean isCurrentPerfEnable = isCurrentPerfEnable("enablePopupWindowStreamResponse", "hitPopupWindowStreamResponse", "enablePopupWindowStreamResponse", "true");
        if (baw.a()) {
            isCurrentPerfEnable = isCurrentPerfEnable && !disableLocalSwitch(".disablePopupWindowStreamResponse");
        }
        recordLog("enablePopupWindowStreamResponse", isCurrentPerfEnable);
        return isCurrentPerfEnable;
    }
}
