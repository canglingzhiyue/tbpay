package android.taobao.windvane.config;

import android.os.Build;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.media.MediaConstant;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import tb.aem;
import tb.kge;
import tb.riy;

/* loaded from: classes.dex */
public class j implements b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static volatile j f1562a;
    public static final k commonConfig;
    private AtomicBoolean b = new AtomicBoolean(false);

    static {
        kge.a(1269740213);
        kge.a(638153698);
        commonConfig = new k();
        f1562a = null;
    }

    public static j a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j) ipChange.ipc$dispatch("f825471c", new Object[0]);
        }
        if (f1562a == null) {
            synchronized (j.class) {
                if (f1562a == null) {
                    f1562a = new j();
                }
            }
        }
        return f1562a;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (!this.b.compareAndSet(false, true)) {
        } else {
            b(android.taobao.windvane.util.b.b(WVConfigManager.SPNAME_CONFIG, "commonwv-data"));
        }
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.b.get();
    }

    private int b(String str) {
        JSONObject jSONObject;
        String[] strArr;
        String[] strArr2;
        String[] strArr3;
        String[] strArr4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3dd7e566", new Object[]{this, str})).intValue();
        }
        if (StringUtils.isEmpty(str)) {
            return 0;
        }
        String[] strArr5 = null;
        try {
            jSONObject = new JSONObject(str);
        } catch (JSONException e) {
            android.taobao.windvane.util.m.e("WVCommonConfig", android.taobao.windvane.util.a.a(e));
            jSONObject = null;
        }
        if (jSONObject == null) {
            return 0;
        }
        if (!jSONObject.has("v") && !StringUtils.equals(a.a().i(), jSONObject.optString("appVersion"))) {
            return 0;
        }
        android.taobao.windvane.util.m.c("WVConfig", "当前更新orange配置，是否有v=[" + jSONObject.has("v") + riy.ARRAY_END_STR);
        long optLong = jSONObject.optLong("configUpdateInterval", 0L);
        if (optLong >= 0) {
            commonConfig.c = optLong;
        }
        commonConfig.b = jSONObject.optDouble("packagePriorityWeight", 0.1d);
        commonConfig.d = jSONObject.optInt("monitorStatus", 2);
        commonConfig.e = jSONObject.optInt("urlRuleStatus", 2);
        commonConfig.I = jSONObject.optInt("packageMaxAppCount", 100);
        commonConfig.f = jSONObject.optString("urlScheme", "http").replace(":", "");
        JSONObject optJSONObject = jSONObject.optJSONObject("verifySampleRate");
        if (optJSONObject != null) {
            commonConfig.g = optJSONObject.toString();
        }
        try {
            strArr = a(jSONObject, "monitoredApps");
        } catch (Throwable unused) {
            strArr = null;
        }
        if (strArr != null) {
            commonConfig.h = strArr;
        }
        try {
            strArr2 = a(jSONObject, "systemBlacks");
        } catch (Throwable unused2) {
            strArr2 = null;
        }
        if (strArr2 != null) {
            commonConfig.V = strArr2;
        }
        try {
            strArr3 = a(jSONObject, "brandBlacks");
        } catch (Throwable unused3) {
            strArr3 = null;
        }
        if (strArr2 != null) {
            commonConfig.W = strArr3;
        }
        try {
            strArr4 = a(jSONObject, "modelBlacks");
        } catch (Throwable unused4) {
            strArr4 = null;
        }
        if (strArr2 != null) {
            commonConfig.X = strArr4;
        }
        try {
            strArr5 = a(jSONObject, "aliNetworkDegradeDomains");
        } catch (Throwable unused5) {
        }
        if (strArr5 != null) {
            commonConfig.i = strArr5;
        }
        try {
            commonConfig.j = a(jSONObject, "disableMixViews");
        } catch (Throwable unused6) {
        }
        String optString = jSONObject.optString("disableInstallPeriod");
        if (!StringUtils.isEmpty(optString)) {
            String[] split = optString.trim().split("-");
            if (split.length == 2) {
                if (split[0].matches("^[0-9]*$")) {
                    commonConfig.k = Long.parseLong(split[0]);
                }
                if (split[1].matches("^[0-9]*$")) {
                    commonConfig.l = Long.parseLong(split[1]);
                }
            }
        }
        String optString2 = jSONObject.optString("ucParam", "");
        if (!StringUtils.isEmpty(optString2) && commonConfig.u != null) {
            commonConfig.u.a(optString2);
        }
        commonConfig.v = jSONObject.optBoolean("enableUCShareCore", true);
        commonConfig.o = jSONObject.optBoolean("useSystemWebView", false);
        commonConfig.p = jSONObject.optBoolean("ucInitOpt", true);
        commonConfig.m = jSONObject.optDouble("ucsdk_alinetwork_rate", 1.0d);
        commonConfig.bp = jSONObject.optBoolean("reduceCameraPermissionOfStorage", true);
        commonConfig.bq = jSONObject.optBoolean("reduceGalleryPermissionOfStorageWrite", true);
        commonConfig.n = jSONObject.optDouble("ucsdk_image_strategy_rate", 1.0d);
        commonConfig.q = jSONObject.optString("cookieUrlRule", "");
        commonConfig.r = jSONObject.optString("ucCoreUrl", "");
        commonConfig.w = jSONObject.optString("shareBlankList", "");
        commonConfig.s = jSONObject.optBoolean("isOpenCombo", false);
        commonConfig.t = jSONObject.optBoolean("isCheckCleanup", true);
        commonConfig.F = jSONObject.optBoolean("isAutoRegisterApp", false);
        commonConfig.G = jSONObject.optBoolean("isUseTBDownloader", true);
        commonConfig.H = jSONObject.optBoolean("isUseAliNetworkDelegate", true);
        commonConfig.x = jSONObject.optInt("packageDownloadLimit", 30);
        commonConfig.y = jSONObject.optInt("packageAccessInterval", 3000);
        commonConfig.z = jSONObject.optInt("packageRemoveInterval", 432000000);
        commonConfig.A = jSONObject.optInt("recoveryInterval", 432000000);
        commonConfig.C = jSONObject.optInt("customsComboLimit", 1);
        commonConfig.B = jSONObject.optInt("customsDirectQueryLimit", 10);
        commonConfig.D = jSONObject.optString("packageZipPrefix", "");
        commonConfig.E = jSONObject.optString("packageZipPreviewPrefix", "");
        commonConfig.M = jSONObject.optBoolean("ucSkipOldKernel", true);
        commonConfig.N = jSONObject.optBoolean("ucKernelReuse", true);
        commonConfig.L = jSONObject.optBoolean("useUCPlayer", false);
        commonConfig.O = jSONObject.optBoolean("enableUCPrecache", false);
        commonConfig.P = jSONObject.optString("precachePackageName", "");
        commonConfig.Q = jSONObject.optBoolean("enableUCPrecacheDoc", false);
        commonConfig.S = jSONObject.optInt("initWebPolicy", 48);
        k kVar = commonConfig;
        kVar.ai = jSONObject.optBoolean("openExperiment", kVar.ai);
        k kVar2 = commonConfig;
        kVar2.aj = jSONObject.optBoolean("openUCImageExperiment", kVar2.aj);
        k kVar3 = commonConfig;
        kVar3.an = jSONObject.optBoolean("discardableFreeIfHasGpuDecode", kVar3.an);
        k kVar4 = commonConfig;
        kVar4.ak = jSONObject.optInt("ucMultiRetryTimes", kVar4.ak);
        k kVar5 = commonConfig;
        kVar5.T = jSONObject.optInt("ucMultiTimeOut", kVar5.T);
        k kVar6 = commonConfig;
        kVar6.U = jSONObject.optInt("ucMultiStartTime", kVar6.U);
        k kVar7 = commonConfig;
        kVar7.Y = jSONObject.optInt("recoverMultiInterval", kVar7.Y);
        commonConfig.Z = jSONObject.optBoolean("ucMultiServiceSpeedUp", false);
        k kVar8 = commonConfig;
        kVar8.aa = jSONObject.optInt("downloadCoreType", kVar8.aa);
        commonConfig.ab = jSONObject.optBoolean("openLog", false);
        commonConfig.ae = jSONObject.optBoolean("openTLog", true);
        commonConfig.af = jSONObject.optBoolean("useOldBridge", false);
        k kVar9 = commonConfig;
        kVar9.ag = jSONObject.optString("ffmegSoPath", kVar9.ag);
        k kVar10 = commonConfig;
        kVar10.ao = jSONObject.optBoolean("enableSgRequestCheck", kVar10.ao);
        k kVar11 = commonConfig;
        kVar11.ap = jSONObject.optBoolean("filterSgRequestCheck", kVar11.ap);
        commonConfig.al = jSONObject.optBoolean("enableExtImgDecoder", true);
        commonConfig.am = jSONObject.optBoolean("enableExchangeImgUrl", true);
        commonConfig.aq = jSONObject.optBoolean("skipPreRenderBackgroundWhitePage", true);
        commonConfig.ar = jSONObject.optBoolean("fixWhitePageBug", false);
        commonConfig.as = jSONObject.optBoolean("enablePreStartup", true);
        k kVar12 = commonConfig;
        kVar12.ac = jSONObject.optBoolean("useURLConfig", kVar12.ac);
        k kVar13 = commonConfig;
        kVar13.ad = jSONObject.optBoolean("useURLConfigInServerConfig", kVar13.ad);
        commonConfig.at = jSONObject.optBoolean("useNewWindvaneCoreJs", true);
        commonConfig.au = jSONObject.optBoolean("fixCoreEventCallback", true);
        k kVar14 = commonConfig;
        kVar14.av = jSONObject.optBoolean("enableGpuGoneReload", kVar14.av);
        commonConfig.aw = jSONObject.optBoolean("open5GAdapter", true);
        k kVar15 = commonConfig;
        kVar15.ax = jSONObject.optBoolean("fixAddUrlParam", kVar15.ax);
        k kVar16 = commonConfig;
        kVar16.aC = jSONObject.optBoolean("targetSdkAdapte", kVar16.aC);
        k kVar17 = commonConfig;
        kVar17.ay = jSONObject.optBoolean("enableZCacheAdpter", kVar17.ay);
        k kVar18 = commonConfig;
        kVar18.az = jSONObject.optLong("zcacheResponseTimeOut", kVar18.az);
        k kVar19 = commonConfig;
        kVar19.aD = jSONObject.optBoolean("authContact", kVar19.aD);
        commonConfig.aB = jSONObject.optBoolean("enableMimeTypeSet", true);
        commonConfig.aE = jSONObject.optBoolean("enablePreinit", true);
        commonConfig.aF = jSONObject.optBoolean("enableMultiExecutor", true);
        k kVar20 = commonConfig;
        kVar20.aG = jSONObject.optInt("preloadMainHtmlRequestTimeout", kVar20.aG);
        k kVar21 = commonConfig;
        kVar21.aH = jSONObject.optInt("defaultPreloadMainHtmlTimeout", kVar21.aH);
        k kVar22 = commonConfig;
        kVar22.aI = jSONObject.optInt("goToMainTimeout", kVar22.aI);
        k kVar23 = commonConfig;
        kVar23.aJ = jSONObject.optString("additionMockHeader", kVar23.aJ);
        commonConfig.aL = jSONObject.optBoolean("loadUrlDealUrlScheme", true);
        commonConfig.aK = jSONObject.optBoolean("needAutoFlushCookie", true);
        k kVar24 = commonConfig;
        kVar24.aM = jSONObject.optInt("UCCookieType", kVar24.aM);
        commonConfig.aN = jSONObject.optBoolean("useNewJSerror", true);
        k kVar25 = commonConfig;
        kVar25.aA = jSONObject.optLong("sysZcacheResponseTimeOut", kVar25.aA);
        commonConfig.aO = jSONObject.optBoolean("fixwvSysWebView", false);
        k kVar26 = commonConfig;
        kVar26.aP = jSONObject.optInt("splashHideTimeout", kVar26.aP);
        k kVar27 = commonConfig;
        kVar27.aQ = jSONObject.optString("alwaysAllowJSAPIPermission", kVar27.aQ);
        k kVar28 = commonConfig;
        kVar28.aS = jSONObject.optDouble("hscJsErrorSampleRate", kVar28.aS);
        k kVar29 = commonConfig;
        kVar29.aV = jSONObject.optDouble("hscMtopPluginSampleRate", kVar29.aV);
        k kVar30 = commonConfig;
        kVar30.aU = jSONObject.optDouble("hscNetworkSampleRate", kVar30.aU);
        k kVar31 = commonConfig;
        kVar31.aT = jSONObject.optDouble("hscWhitePageSampleRate", kVar31.aT);
        k kVar32 = commonConfig;
        kVar32.aY = jSONObject.optDouble("hscPerformanceSampleRate", kVar32.aY);
        k kVar33 = commonConfig;
        kVar33.aW = jSONObject.optDouble("hscZcacheResponseSampleRate", kVar33.aW);
        k kVar34 = commonConfig;
        kVar34.aR = jSONObject.optBoolean("hscEnable", kVar34.aR);
        k kVar35 = commonConfig;
        kVar35.aX = jSONObject.optBoolean("jsBridgeMonitorEnable", kVar35.aX);
        k kVar36 = commonConfig;
        kVar36.aZ = jSONObject.optBoolean("fixCameraPermission", kVar36.aZ);
        commonConfig.ba = jSONObject.optString("jstFspScript");
        k kVar37 = commonConfig;
        kVar37.bb = jSONObject.optBoolean("fixNotificationSetting", kVar37.bb);
        k kVar38 = commonConfig;
        kVar38.bc = jSONObject.optBoolean("disallowCallAfterDestroy", kVar38.bc);
        k kVar39 = commonConfig;
        kVar39.bd = jSONObject.optBoolean("fixGetLocation", kVar39.bd);
        k kVar40 = commonConfig;
        kVar40.be = jSONObject.optString("meetingPattern", kVar40.be);
        k kVar41 = commonConfig;
        kVar41.bf = jSONObject.optBoolean("enableOverrideBizCode", kVar41.bf);
        k kVar42 = commonConfig;
        kVar42.bg = jSONObject.optBoolean("fixConfigStorageBug", kVar42.bg);
        k kVar43 = commonConfig;
        kVar43.bk = jSONObject.optBoolean("enableReportWhitePage", kVar43.bk);
        k kVar44 = commonConfig;
        kVar44.bh = jSONObject.optBoolean("enableThreadWatchdog", kVar44.bh);
        k kVar45 = commonConfig;
        kVar45.bi = jSONObject.optBoolean("enableOpenCheck", kVar45.bi);
        k kVar46 = commonConfig;
        kVar46.bj = jSONObject.optBoolean("enableApiCheck", kVar46.bj);
        commonConfig.bl = c(jSONObject.optString("hscResponseCodeSampleRate"));
        k kVar47 = commonConfig;
        kVar47.bm = jSONObject.optBoolean("enableContactPermissionExplain", kVar47.bm);
        k kVar48 = commonConfig;
        kVar48.bn = jSONObject.optBoolean("enableOnFinishedReported", kVar48.bn);
        k kVar49 = commonConfig;
        kVar49.bo = jSONObject.optBoolean("enableWVFullTrace", kVar49.bo);
        k kVar50 = commonConfig;
        kVar50.br = jSONObject.optBoolean("storeCachedDir", kVar50.br);
        k kVar51 = commonConfig;
        kVar51.bs = jSONObject.optBoolean("enableUCUploadToTlog", kVar51.bs);
        k kVar52 = commonConfig;
        kVar52.bt = jSONObject.optBoolean("enableUCUploadStartupToTlog", kVar52.bt);
        k kVar53 = commonConfig;
        kVar53.bu = jSONObject.optBoolean("enableSafeControl", kVar53.bu);
        k kVar54 = commonConfig;
        kVar54.bv = jSONObject.optBoolean("disallowFileAccess", kVar54.bv);
        k kVar55 = commonConfig;
        kVar55.bw = jSONObject.optBoolean("newMultiPictReturn", kVar55.bw);
        k kVar56 = commonConfig;
        kVar56.bx = jSONObject.optBoolean("allowResendRequest", kVar56.bx);
        k kVar57 = commonConfig;
        kVar57.by = jSONObject.optBoolean("uploadPPAfterJs", kVar57.by);
        k kVar58 = commonConfig;
        kVar58.bz = jSONObject.optBoolean("enableBizCodeLimit", kVar58.bz);
        k kVar59 = commonConfig;
        kVar59.bA = jSONObject.optBoolean("enableNewHEIC", kVar59.bA);
        k kVar60 = commonConfig;
        kVar60.bB = jSONObject.optBoolean("fixTouchActionIndexOutRange", kVar60.bB);
        k kVar61 = commonConfig;
        kVar61.bD = jSONObject.optBoolean("__temp_enable_filter_response_report__", kVar61.bD);
        k kVar62 = commonConfig;
        kVar62.bE = jSONObject.optString("__http_request_url_filter_pattern__", kVar62.bE);
        commonConfig.bF = jSONObject.optBoolean("enableNativeLogApi", true);
        k kVar63 = commonConfig;
        kVar63.bG = jSONObject.optBoolean("__fix_native_call_verification1__", kVar63.bG);
        commonConfig.bH = jSONObject.optBoolean("__enable_mark_api__", true);
        commonConfig.bI = jSONObject.optBoolean("__enable_init_widget_component__", true);
        k kVar64 = commonConfig;
        kVar64.bJ = jSONObject.optBoolean("__enable_fix_npe__", kVar64.bJ);
        k kVar65 = commonConfig;
        kVar65.bK = jSONObject.optBoolean("__enable_fix_wrong_apm_data1__", kVar65.bK);
        k kVar66 = commonConfig;
        kVar66.bL = jSONObject.optBoolean("__enable_add_riverlogger__", kVar66.bL);
        k kVar67 = commonConfig;
        kVar67.bM = jSONObject.optBoolean("__enable_riverlogger_bridge_info__", kVar67.bM);
        k kVar68 = commonConfig;
        kVar68.bN = jSONObject.optBoolean("enableOpenBrowserApi", kVar68.bN);
        k kVar69 = commonConfig;
        kVar69.bQ = jSONObject.optInt("tlogMaxSizeKB", kVar69.bQ);
        k kVar70 = commonConfig;
        kVar70.bR = jSONObject.optBoolean("enable_mega_bridge", kVar70.bR);
        k kVar71 = commonConfig;
        kVar71.bS = jSONObject.optBoolean("enable_report_expire_timeout", kVar71.bS);
        k kVar72 = commonConfig;
        kVar72.bT = jSONObject.optBoolean("enable_uc_max_cache_size_v2", kVar72.bT);
        k kVar73 = commonConfig;
        kVar73.bU = jSONObject.optInt("ucMaxCacheSizeByte", kVar73.bU);
        k kVar74 = commonConfig;
        kVar74.bV = jSONObject.optBoolean("__enable_create_ev_withContainer_v2__", kVar74.bV);
        k kVar75 = commonConfig;
        kVar75.bW = jSONObject.optBoolean("__enable_fix_api_authentication__", kVar75.bW);
        k kVar76 = commonConfig;
        kVar76.bX = jSONObject.optBoolean("__enable_add_custom_property__", kVar76.bX);
        k kVar77 = commonConfig;
        kVar77.bY = jSONObject.optBoolean("__enable_mtop_ssr_request__", kVar77.bY);
        k kVar78 = commonConfig;
        kVar78.bZ = jSONObject.optBoolean("__enable_use_new_on_event__", kVar78.bZ);
        k kVar79 = commonConfig;
        kVar79.ca = jSONObject.optBoolean("__enable_skip_verification__", kVar79.ca);
        k kVar80 = commonConfig;
        kVar80.cb = jSONObject.optBoolean("enable_document_preload", kVar80.cb);
        k kVar81 = commonConfig;
        kVar81.cc = jSONObject.optBoolean("enableHeicAccept", kVar81.cc);
        k kVar82 = commonConfig;
        kVar82.cd = jSONObject.optBoolean("enableHeicWithTransparency", kVar82.cd);
        k kVar83 = commonConfig;
        kVar83.ce = jSONObject.optBoolean("enableReportHttpSchemaUrl", kVar83.ce);
        k kVar84 = commonConfig;
        kVar84.cg = jSONObject.optBoolean("enableChangeImageAccept", kVar84.cg);
        k kVar85 = commonConfig;
        kVar85.cj = jSONObject.optBoolean("enableFontResourceIntercept", kVar85.cj);
        k kVar86 = commonConfig;
        kVar86.ch = jSONObject.optBoolean("enableAddClientContextHeader", kVar86.ch);
        k kVar87 = commonConfig;
        kVar87.ci = jSONObject.optBoolean("enableSystemWebView", kVar87.ci);
        k kVar88 = commonConfig;
        kVar88.ck = jSONObject.optBoolean("enableSsrRequestInSystemWebView", kVar88.ck);
        k kVar89 = commonConfig;
        kVar89.cl = jSONObject.optString("httpUrlWhiteList", kVar89.cl);
        k kVar90 = commonConfig;
        kVar90.cm = jSONObject.optBoolean("enableWebviewLoadUrlSchema", kVar90.cm);
        k kVar91 = commonConfig;
        kVar91.f1564cn = jSONObject.optBoolean("enableUCSettingBeforeUCInit", kVar91.f1564cn);
        k kVar92 = commonConfig;
        kVar92.co = jSONObject.optInt("ucInitWebViewMaxWaitMills", kVar92.co);
        k kVar93 = commonConfig;
        kVar93.cp = jSONObject.optBoolean("enableAddUcCoreInfoToCrash", kVar93.cp);
        k kVar94 = commonConfig;
        kVar94.cq = jSONObject.optBoolean("enableFixMonitorNpe", kVar94.cq);
        k kVar95 = commonConfig;
        kVar95.cr = jSONObject.optBoolean("enableCommitSystemWebViewInfo", kVar95.cr);
        k kVar96 = commonConfig;
        kVar96.cf = jSONObject.optBoolean("enableReportLoadUrl", kVar96.cf);
        k kVar97 = commonConfig;
        kVar97.cs = jSONObject.optBoolean("enable_wvmega_pass", kVar97.cs);
        k kVar98 = commonConfig;
        kVar98.ct = jSONObject.optBoolean("enableDestroyAbilityHubV2", kVar98.ct);
        k kVar99 = commonConfig;
        kVar99.cu = jSONObject.optBoolean("enableWebpResourceLoadMonitor", kVar99.cu);
        k kVar100 = commonConfig;
        kVar100.cv = jSONObject.optDouble("webpResourceLoadMonitorSample", kVar100.cv);
        k kVar101 = commonConfig;
        kVar101.cw = jSONObject.optBoolean("enableUseLoadUrlForRefer", kVar101.cw);
        k kVar102 = commonConfig;
        kVar102.cx = jSONObject.optBoolean("enableFixNetworkForWebView", kVar102.cx);
        k kVar103 = commonConfig;
        kVar103.cy = jSONObject.optBoolean("enableReportBaseAPIParams", kVar103.cy);
        k kVar104 = commonConfig;
        kVar104.cz = jSONObject.optBoolean("enableFixTakePhotoApi", kVar104.cz);
        k kVar105 = commonConfig;
        kVar105.cA = jSONObject.optBoolean("enableChunkCacheV2", kVar105.cA);
        k kVar106 = commonConfig;
        kVar106.cB = jSONObject.optBoolean("enableAndroid14Adaptation", kVar106.cB);
        k kVar107 = commonConfig;
        kVar107.cC = jSONObject.optBoolean("enableCloseMultiPhoto", kVar107.cC);
        k kVar108 = commonConfig;
        kVar108.cD = jSONObject.optInt("wvPrefetchPoolSize", kVar108.cD);
        k kVar109 = commonConfig;
        kVar109.cE = jSONObject.optInt("wvPrerenderResourceLimit", kVar109.cE);
        k kVar110 = commonConfig;
        kVar110.cF = jSONObject.optBoolean("enableSSRPrerender", kVar110.cF);
        k kVar111 = commonConfig;
        kVar111.cH = jSONObject.optBoolean("enablePreCreateWebViewV2", kVar111.cH);
        k kVar112 = commonConfig;
        kVar112.cG = jSONObject.optBoolean("enableAddBrowserUserAgent", kVar112.cG);
        k kVar113 = commonConfig;
        kVar113.cL = jSONObject.optBoolean("enableEncodeAPIInfo", kVar113.cL);
        k kVar114 = commonConfig;
        kVar114.cM = jSONObject.optBoolean("enableAppDevTools", kVar114.cM);
        k kVar115 = commonConfig;
        kVar115.cP = jSONObject.optBoolean("enableUseProtoDB", kVar115.cP);
        k kVar116 = commonConfig;
        kVar116.cQ = jSONObject.optLong("webViewCreateDelayTimeMs", kVar116.cQ);
        k kVar117 = commonConfig;
        kVar117.cR = jSONObject.optInt("webViewPoolSizeLimit", kVar117.cR);
        k kVar118 = commonConfig;
        kVar118.cS = jSONObject.optString("asyncApiWhiteList", kVar118.cS);
        k kVar119 = commonConfig;
        kVar119.cU = jSONObject.optBoolean("enableFixMegaBridgeContext", kVar119.cU);
        k kVar120 = commonConfig;
        kVar120.cI = jSONObject.optBoolean("enableFixMegaBridgeJS", kVar120.cI);
        k kVar121 = commonConfig;
        kVar121.cJ = jSONObject.optBoolean("enableUseQueryAsCacheKey", kVar121.cJ);
        k kVar122 = commonConfig;
        kVar122.cK = jSONObject.optBoolean("enableFixSSRDowngradeError", kVar122.cK);
        k kVar123 = commonConfig;
        kVar123.cN = jSONObject.optBoolean("enableUCTlog", kVar123.cN);
        k kVar124 = commonConfig;
        kVar124.cO = jSONObject.optBoolean("enableFlushCookieAsync", kVar124.cO);
        k kVar125 = commonConfig;
        kVar125.cV = jSONObject.optBoolean("enableReloadInForeground", kVar125.cV);
        k kVar126 = commonConfig;
        kVar126.cW = jSONObject.optBoolean("enableSkipAPMReport", kVar126.cW);
        k kVar127 = commonConfig;
        kVar127.cX = jSONObject.optBoolean("enableInjectFCPScript", kVar127.cX);
        k kVar128 = commonConfig;
        kVar128.cY = jSONObject.optBoolean("enableSharedResourcePrefetch", kVar128.cY);
        k kVar129 = commonConfig;
        kVar129.cZ = jSONObject.optBoolean("enableLoadRemoteQKingLib", kVar129.cZ);
        k kVar130 = commonConfig;
        kVar130.da = jSONObject.optBoolean("enableChangeBizId", kVar130.da);
        k kVar131 = commonConfig;
        kVar131.db = jSONObject.optBoolean("enableFirstChunkPriority", kVar131.db);
        k kVar132 = commonConfig;
        kVar132.dc = jSONObject.optInt("firstChunkMaxAgeDays", kVar132.dc);
        k kVar133 = commonConfig;
        kVar133.cT = jSONObject.optBoolean("enableFixAPMDataLost", kVar133.cT);
        k kVar134 = commonConfig;
        kVar134.dd = jSONObject.optBoolean("enablePrefetchWithZCache", kVar134.dd);
        k kVar135 = commonConfig;
        kVar135.bO = jSONObject.optBoolean("enableFixStoragePermission", kVar135.bO);
        k kVar136 = commonConfig;
        kVar136.f1565de = jSONObject.optInt("preRenderPoolSizeLimit", kVar136.f1565de);
        k kVar137 = commonConfig;
        kVar137.df = jSONObject.optBoolean("enableReportWormhole302", kVar137.df);
        k kVar138 = commonConfig;
        kVar138.dg = jSONObject.optBoolean("enableOptimizeChunkStorage", kVar138.dg);
        k kVar139 = commonConfig;
        kVar139.dh = jSONObject.optBoolean("enableAudioOutputUseAAudio", kVar139.dh);
        a(jSONObject);
        aem.a().a(6012);
        android.taobao.windvane.util.m.e("WVCommonConfig", "config:" + jSONObject.toString());
        return jSONObject.length();
    }

    private Map<String, String> c(String str) {
        JSONObject jSONObject;
        Iterator<String> keys;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("e68dc5e9", new Object[]{this, str});
        }
        if (str == null) {
            return null;
        }
        try {
            jSONObject = new JSONObject(str);
        } catch (JSONException e) {
            e.printStackTrace();
            jSONObject = null;
        }
        if (jSONObject == null || (keys = jSONObject.keys()) == null) {
            return null;
        }
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                concurrentHashMap.put(next, jSONObject.get(next).toString());
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
        return concurrentHashMap;
    }

    private String[] a(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("1242026f", new Object[]{this, jSONObject, str});
        }
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray == null) {
            String optString = jSONObject.optString(str, MediaConstant.DEFALUT_H265_HW_BLACK_LIST_FOR_DEGRADE_H264);
            if (!StringUtils.isEmpty(optString) && optString.length() >= 2) {
                return optString.substring(1, optString.length() - 1).split(",");
            }
            return null;
        }
        String[] strArr = new String[optJSONArray.length()];
        for (int i = 0; i < optJSONArray.length(); i++) {
            try {
                strArr[i] = optJSONArray.getString(i);
            } catch (JSONException e) {
                android.taobao.windvane.util.m.b("WVCommonConfig", "obtain array error ==>", e.getMessage());
            }
        }
        return strArr;
    }

    private void a(JSONObject jSONObject) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32861656", new Object[]{this, jSONObject});
            return;
        }
        try {
            commonConfig.J = jSONObject.optInt("zipDegradeMode", 0);
            commonConfig.K = jSONObject.optString("zipDegradeList", "");
            String str = Build.BRAND + "@" + Build.VERSION.RELEASE;
            String str2 = commonConfig.K;
            if (StringUtils.isEmpty(str2) || (split = str2.split(",")) == null) {
                return;
            }
            for (String str3 : split) {
                if (str.equalsIgnoreCase(str3)) {
                    android.taobao.windvane.util.m.e("WVCommonConfig", "Degrade unzip: " + str);
                    commonConfig.ah = true;
                    if (commonConfig.J != 2) {
                        return;
                    }
                    android.taobao.windvane.util.m.d("WVCommonConfig", "Disable package app");
                    return;
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // android.taobao.windvane.config.b
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        b(str);
        android.taobao.windvane.util.b.a(WVConfigManager.SPNAME_CONFIG, "commonwv-data", str);
    }
}
