package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.job.core.j;

/* loaded from: classes.dex */
public final class gue implements gub<String> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // tb.gub
    public void v(j<String> jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9aa8465", new Object[]{this, jVar});
            return;
        }
        jVar.d("InitBasicParam").a((j.a<String>) "InitUt", (j.a<String>[]) new String[]{"InitMotuCrash"});
        jVar.c("InitEnv");
        jVar.c("InitAtlasServiceFinder");
        jVar.a("InitSecurityManager", "InitLogin");
        jVar.a("InitLogin", "InitBasicParam");
        jVar.c("InitNetworkStrategy");
        jVar.d("InitUt").a((j.a<String>) "InitTurboBootChannel", (j.a<String>[]) new String[]{"InitDesktopTaskTrigger"});
        jVar.c("InitLinkSmart");
        jVar.a((j<String>) "InitLauncher");
    }

    @Override // tb.gub
    public void E(j<String> jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b990ba36", new Object[]{this, jVar});
            return;
        }
        jVar.c("InitAgooLifeCycle");
        jVar.a("InitOrangeConfig", "InitOrangeAfterLogin");
        jVar.a("InitChannelCookieManager", "InitOrangeConfig");
        jVar.a("InitNetwork", "InitOrangeConfig");
        jVar.a("InitChannelCookieManager", "InitAccsInAppConnection");
        jVar.a("InitNetwork", "InitAccsInAppConnection");
        jVar.a("InitAccsInAppConnection", "InitMsgKeepAlive");
        jVar.a("InitAUS", "InitTaoLog");
        jVar.a("InitTaoLog", "InitTaoLogForAccs");
        jVar.a("InitAccsInAppConnection", "InitTaoLogForAccs");
    }

    @Override // tb.gub
    public void d(j<String> jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd388db7", new Object[]{this, jVar});
            return;
        }
        jVar.c("InitEnv");
        jVar.c("InitBundleDebugSetting");
    }

    @Override // tb.gub
    public void b(j<String> jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4ba1cf9", new Object[]{this, jVar});
            return;
        }
        jVar.c("InitLogin");
        jVar.c("InitNetwork");
        jVar.c("InitCookieManager");
        jVar.c("InitHomeLauncher");
        jVar.c("InitDXV2");
        jVar.a("InitLogin", "InitLoginParam");
        jVar.a("InitLogin", "InitLinkLogin");
        jVar.a("InitLogin", "InitHomePreParamsLauncher");
        jVar.a("InitMtop", "InitHomePreRequestLauncher");
        jVar.a("InitNetwork", "InitHomePreRequestLauncher");
        jVar.a("InitCookieManager", "InitHomePreRequestLauncher");
        jVar.a("InitHomePreParamsLauncher", "InitHomePreRequestLauncher");
        jVar.a("InitDXV3", "InitHomePreRequestLauncher");
        jVar.a("InitMtop", "InitLinkManagerC");
        jVar.a("InitNetwork", "InitXState");
        jVar.a("InitCookieManager", "InitXState");
        jVar.a("InitNetwork", "InitH5Request");
        jVar.a("InitCookieManager", "InitH5Request");
        jVar.a("InitXState", "InitMtop");
        jVar.a("InitLoginSessionCheck", "InitMtop");
        jVar.a("InitMtop", "InitTab2ColdLaunchTask");
        jVar.a("InitMtop", "InitTaoLiveColdLaunchTask");
        jVar.a("InitMtop", "InitMtopSSRLink");
        jVar.a("InitMtopSSRLink", "InitTriverLightWeight");
        jVar.a("InitMtop", "InitSearchColdLaunchTask");
        jVar.c("InitLinkMessageBundle");
        jVar.a("InitUCParamB", "InitUCWebView");
        jVar.c("InitRsoLink");
        jVar.c("InitPhenix");
    }

    @Override // tb.gub
    public void c(j<String> jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58f95558", new Object[]{this, jVar});
            return;
        }
        jVar.c("InitMotuCrash");
        jVar.c("InitTaoLog");
        jVar.a("InitToastHook", "InitArrayMap");
        jVar.a("InitArrayMap", "InitProcessInfos");
        jVar.a("InitProcessInfos", "InitScreenConfig");
        jVar.a("InitScreenConfig", "InitAtlasServiceFinder");
        jVar.a("InitAtlasServiceFinder", "InitLifeCycle");
        jVar.a("InitLifeCycle", "InitLoginLifeCycle");
        jVar.a("InitLoginLifeCycle", "InitMtopLifeCycle");
        jVar.a("InitMtopLifeCycle", "InitLinkLifeCycle");
        jVar.a("InitLinkLifeCycle", "InitAgooLifeCycle");
        jVar.a("InitAgooLifeCycle", "InitUt");
        jVar.c("InitDeviceScore");
        jVar.c("InitHomePreAdvLauncher");
        jVar.c("InitHomeDinamicX2Launcher");
        jVar.a("InitHomeDinamicX3Launcher", "InitHomePreCreateViewLauncher");
        jVar.c("InitOrangeConfig");
        jVar.a("InitOrangeConfig", "InitOrangeAfterLogin");
        jVar.a("InitOrangeConfig", "InitSafeModeOrange");
        jVar.a("InitManufacturer", "InitUt");
        jVar.a("InitUt", "InitRevisionTrack");
        jVar.c("InitMtopDelay");
        jVar.a("InitUt", "InitLinkUtCheck");
        jVar.a((j<String>) "InitAPM");
    }

    @Override // tb.gub
    public void g(j<String> jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29f636d4", new Object[]{this, jVar});
            return;
        }
        jVar.a("InitAccsOnBackground", "InitTimeStampManagerStop");
        jVar.c("InitTBWidget");
        jVar.c("InitAPMRest");
        jVar.c("InitTurboBootBackground");
        jVar.b("InitStatisticsSubmit");
    }

    @Override // tb.gub
    public void h(j<String> jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e356f33", new Object[]{this, jVar});
            return;
        }
        jVar.a("InitNegativeMonitor", "InitNegativeProblems");
        jVar.a("InitNegativeProblems", "InitUCDecompress");
        jVar.a("InitUCDecompress", "InitTurboBootBackground");
    }

    @Override // tb.gub
    public void y(j<String> jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56682d82", new Object[]{this, jVar});
            return;
        }
        jVar.c("InitPhenixApngDelay");
        jVar.c("InitPhenixHeifDelay");
        jVar.c("InitWeexSmoothDelay");
        jVar.c("InitHomePreAdvLauncherDelay");
        jVar.a("InitPhenixSchedulerDelay", "InitPhenixBuildDelay");
        jVar.a("InitHomeSwitchLauncherDelay", "InitHomeLauncherDelay");
        jVar.a("InitHomeGatewayLauncherDelay", "InitHomeLauncherDelay");
        jVar.c("InitHomePreParamsLauncherDelay");
        jVar.a("InitDXV2Delay", "InitHomeDinamicX2LauncherDelay");
        jVar.a("InitDXV3Delay", "InitHomeDinamicX3LauncherDelay");
        jVar.a((j<String>) "InitPhenixDelay");
    }

    @Override // tb.gub
    public void j(j<String> jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86b3dff1", new Object[]{this, jVar});
            return;
        }
        jVar.c("InitClipUrlWatcherLifeCycle");
        jVar.c("InitWeexNoSucks");
        jVar.c("InitLoginSessionValid");
        jVar.c("InitBootImageIdle");
        jVar.c("InitWindvane");
        jVar.c("InitWeexNoSucks");
        jVar.c("InitAtlasClean");
        jVar.c("InitDAIColdStartupB");
        jVar.c("BoradcastAllSpark");
        jVar.c("InitLivePopup");
        jVar.c("InitDWBase");
        jVar.c("InitAVSDK");
        jVar.c("InitARCameraView");
        jVar.c("InitWeexNoSucks");
        jVar.a("InitWindvane", "InitPreloadIdle");
        jVar.a("InitRemoteSo", "InitWindvane");
        jVar.c("InitHomeTaskCompleted");
        jVar.c("InitMemKeeper");
        jVar.c("InitVirtualThreadIdleLauncher");
        jVar.a((j<String>) "InitStatisticsDump");
    }

    @Override // tb.gub
    public void k(j<String> jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("faf31850", new Object[]{this, jVar});
        } else {
            jVar.c("InitMessage");
        }
    }

    @Override // tb.gub
    public void e(j<String> jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4177c616", new Object[]{this, jVar});
            return;
        }
        jVar.c("InitPhenixHeif");
        jVar.c("InitPhenixApng");
        jVar.a("InitPhenixScheduler", "InitPhenixBuild");
        jVar.c("InitAndroidMonkey");
        jVar.c("InitGalileo");
        jVar.c("InitWelcome");
        jVar.c("InitBootImage");
        jVar.c("InitBehaviX");
        jVar.c("InitUpdateLightweight");
        jVar.c("InitPopPre");
        jVar.c("InitMetricKit");
    }

    @Override // tb.gub
    public void f(j<String> jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5b6fe75", new Object[]{this, jVar});
            return;
        }
        jVar.a("InitABTest", "InitNav");
        jVar.d("InitNav").a((j.a<String>) "InitLinkManager", (j.a<String>[]) new String[]{"InitJTrack", "InitConfigCenterLifecycle", "InitPHAIdle"});
        jVar.c("InitTriverNav");
        jVar.c("InitPopPost");
        jVar.c("InitWeexSmoothOpt");
        jVar.c("InitUt4Aplus");
        jVar.c("InitUCSoInject");
        jVar.c("InitAUS");
        jVar.c("InitTMSEarly");
        jVar.c("InitPermissionBridge");
        jVar.c("InitNewDetail");
        jVar.c("InitFontSetting");
        jVar.c("InitUCParam");
        jVar.c("InitLocalization");
    }

    @Override // tb.gub
    public void l(j<String> jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f3250af", new Object[]{this, jVar});
            return;
        }
        jVar.c("InitHuDongIdle");
        jVar.c("BroadcastLogin");
        jVar.a("InitAccsInAppConnectionB", "InitAccsOnForeground");
        jVar.a("InitAccsOnForeground", "InitTimeStampManagerStart");
        jVar.c("InitDowngrade");
        jVar.c("InitNextRpc");
        jVar.c("InitPassiveLocation");
        jVar.a("InitAUE", "InitUpdate");
        jVar.c("InitAppBundleTrigger");
        jVar.c("InitLinkRewriter");
        jVar.c("InitPhenixHeifOpt");
        jVar.c("InitPhenixApngOpt");
        jVar.c("InitPhenixGif");
        jVar.c("InitPhenixWebp");
        jVar.c("InitTMSForeground");
        jVar.a((j<String>) "InitComponentState");
    }

    @Override // tb.gub
    public void m(j<String> jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e371890e", new Object[]{this, jVar});
        } else {
            jVar.c("InitProtodbDaemon");
        }
    }

    @Override // tb.gub
    public void n(j<String> jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57b0c16d", new Object[]{this, jVar});
        } else {
            jVar.c("InitDAIFirstInstall");
        }
    }

    @Override // tb.gub
    public void o(j<String> jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbeff9cc", new Object[]{this, jVar});
        } else {
            jVar.c("InitZCacheFirstInstall");
        }
    }

    @Override // tb.gub
    public void p(j<String> jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("402f322b", new Object[]{this, jVar});
            return;
        }
        jVar.c("InitDAGPointsReport");
        jVar.c("InitZCacheColdStartup");
        jVar.c("InitTBExecutor");
        jVar.c("InitAUEIdle");
        jVar.c("InitCacheCleanerIdle");
        jVar.c("InitNegativeProblems");
        jVar.c("InitPermissionIdle");
        jVar.c("InitTucaobarIdle");
    }

    @Override // tb.gub
    public void q(j<String> jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b46e6a8a", new Object[]{this, jVar});
            return;
        }
        jVar.a("InitLaunchdogAlarm", "InitEditionSwitcher");
        jVar.a("InitEditionSwitcher", "InitTaoLiveIdle");
        jVar.a("InitTaoLiveIdle", "InitPGInitTask");
        jVar.a("InitPGInitTask", "InitTurboBootIdle");
        jVar.a("InitTurboBootIdle", "InitPhenixAvif");
        jVar.a("InitPhenixAvif", "InitAppBundleIdle");
        jVar.a("InitAppBundleIdle", "InitRestOrandleIdle");
        jVar.a("InitRestOrandleIdle", "InitLoginParam");
        jVar.a("InitLoginParam", "InitElder");
        jVar.a("InitElder", "InitColdLogin");
        jVar.a("InitDetailLauncher", "InitVoiceAssistantIdle");
        jVar.a("InitVoiceAssistantIdle", "InitNDIdle");
        jVar.a("InitNDIdle", "InitPush");
        jVar.a("InitPush", "InitCrashSDKOrange");
        jVar.a("InitCrashSDKOrange", "InitAPMSecondary");
        jVar.a("InitAPMSecondary", "InitPowerMessage");
        jVar.a("InitPowerMessage", "InitTriver");
        jVar.a("InitTriver", "InitAppRemoteOrangeInitializer");
        jVar.a("InitAppRemoteOrangeInitializer", "InitDWIdle");
        jVar.a("InitDWIdle", "InitOvsHomeIdle");
        jVar.a("InitOvsHomeIdle", "InitAbtestAdapter");
        jVar.a("InitAbtestAdapter", "InitDAIColdStartup");
        jVar.a("InitDAIColdStartup", "InitNavSharePreProcess");
        jVar.a("InitNavSharePreProcess", "InitFontSettingIdle");
        jVar.a("InitFontSettingIdle", "InitMetricKitIdle");
        jVar.a("InitMetricKitIdle", "InitAutoSizeIdle");
        jVar.a("InitAutoSizeIdle", "InitAlimama");
        jVar.a("InitAlimama", "InitFamily");
        jVar.a("InitFamily", "InitHomeIdleLauncher");
        jVar.a("InitHomeIdleLauncher", "InitBrowserProcess");
        jVar.a("InitBrowserProcess", "InitTMQOlympic");
        jVar.a("InitTMQOlympic", "InitMTBPreload");
        jVar.a("InitMTBPreload", "InitAliSports");
        jVar.a("InitAliSports", "InitPurchaseIdle");
        jVar.a("InitPurchaseIdle", "InitShop");
        jVar.a("InitShop", "InitRemoteSoIdle");
        jVar.a("InitRemoteSoIdle", "InitDownloader");
        jVar.a("InitWindvaneSecondary", "InitFeedbackJsBridge");
        jVar.a("InitFeedbackJsBridge", "InitAliPrivacy");
        jVar.a("InitAliPrivacy", "InitOrangeIdle");
        jVar.a("InitOrangeIdle", "InitCodeTrack");
        jVar.a("InitCodeTrack", "InitTaoLogForAccs");
        jVar.a("InitColdLogin", "InitWeexIdle");
        jVar.a("InitDownloader", "InitWeexIdle");
        jVar.a("InitMiniPay", "InitWeexIdle");
        jVar.c("InitTMSIdle");
        jVar.c("InitBizErrorReporterOrange");
        jVar.c("InitMemKeeper");
        jVar.a("InitResourceGuardian", "InitQuality");
        jVar.a((j<String>) "InitAccsInAppConnection");
    }

    @Override // tb.gub
    public void a(j<String> jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707ae49a", new Object[]{this, jVar});
            return;
        }
        jVar.a("InitBasicParam", "InitOrangeFetch");
        jVar.a("InitVirtualThreadLauncher", "InitTNet");
        jVar.a("InitVirtualThreadLauncher", "InitNetworkStrategy");
        jVar.a("InitSecIO", "InitStatistics");
        jVar.a("InitRevisionSwitch", "InitHomeSwitchLauncher");
        jVar.a("InitRevisionSwitch", "InitHomeGatewayLauncher");
        jVar.a("InitHomeGatewayLauncher", "InitHomeCache");
        jVar.c("InitSGJpgProcess");
        jVar.c("InitSecurityManager");
        jVar.c("InitUCSoInjectB");
        jVar.c("InitURLRewrite");
        jVar.c("InitRecPrivacy");
        jVar.c("InitComponents");
        jVar.c("InitTurboBootEarly");
        jVar.c("InitLauncher");
        jVar.c("InitAppRemoteOlympicInitializer");
        jVar.a((j<String>) "InitLaunchStart");
    }

    @Override // tb.gub
    public void D(j<String> jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("455181d7", new Object[]{this, jVar});
            return;
        }
        jVar.a("InitAUE", "InitHomeResumed");
        jVar.a("InitPopConfigLoadTask", "InitHomeResumed");
        jVar.c("InitPhenixNotifyLaunchFinish");
        jVar.c("InitBehavirXStashes");
        jVar.c("InitDXOpt");
        jVar.c("InitLinkManagerHomeFinish");
        jVar.c("InitLinkInAction");
        jVar.c("InitTMSResume");
    }

    @Override // tb.gub
    public void i(j<String> jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1274a792", new Object[]{this, jVar});
            return;
        }
        jVar.c("InitUCParam");
        jVar.c("InitWeexSmoothLaunched");
        jVar.c("InitPreloadNav");
        jVar.c("InitOrangeConfigLaunched");
        jVar.c("InitOrangeDelay");
        jVar.c("InitDiagnose");
        jVar.c("InitShopRuleOpt");
        jVar.a("InitTab2Preload", "InitMessagePreload");
        jVar.a("InitMessagePreload", "InitCartBadge");
        jVar.a("InitAppBundleIdle", "InitRsoLinkFinish");
        jVar.c("InitNavigationIdle");
        jVar.c("InitABGlobal");
        jVar.a("InitAppBundleTrigger", "InitVoiceAssistant");
        jVar.c("InitHomeVisible");
        jVar.c("InitTMSNecessary");
        jVar.c("InitUtNotify");
        jVar.c("InitThemeKit");
        jVar.c("InitChangeAppIcon");
        jVar.c("InitDXOpt");
        jVar.c("InitShareFeedbackLaunched");
        jVar.c("InitPhenixNotifyLaunchFinish");
        jVar.c("InitNavProcessorPreloadIdle");
    }

    @Override // tb.gub
    public void r(j<String> jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28ada2e9", new Object[]{this, jVar});
        } else {
            jVar.d("InitLoginParam").a((j.a<String>) "InitOrangeAfterLogin", (j.a<String>[]) new String[]{"InitAccsAfterLogin"});
        }
    }

    @Override // tb.gub
    public void s(j<String> jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cecdb48", new Object[]{this, jVar});
        } else {
            jVar.d("InitLoginParam").a((j.a<String>) "InitOrangeAfterLogout", (j.a<String>[]) new String[]{"InitAccsAfterLogout"});
        }
    }

    @Override // tb.gub
    public void B(j<String> jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cd31119", new Object[]{this, jVar});
            return;
        }
        jVar.c("InitHomePreParamsLauncher");
        jVar.a("InitHomeGatewayLauncher", "InitHomeCache");
        jVar.c("InitRevisionSwitch");
        jVar.a("InitAPM", "InitDeviceScore");
        jVar.d("InitBasicParam").a((j.a<String>) "InitDXV3", (j.a<String>[]) new String[]{"InitNav", "InitUt"});
        jVar.a("InitDXV3", "InitHomeDinamicX3Launcher");
        jVar.d("InitBasicParam").a((j.a<String>) "InitPhenix", (j.a<String>[]) new String[]{"InitPhenixHeif", "InitPhenixScheduler"});
        jVar.a("InitPhenix", "InitPhenixBuild");
        jVar.a("InitPhenixHeif", "InitPhenixBuild");
        jVar.a("InitPhenixScheduler", "InitPhenixBuild");
        jVar.a("InitPhenixApngOpt", "InitPhenixBuild");
        jVar.a((j<String>) "InitBasicParam");
    }

    @Override // tb.gub
    public void C(j<String> jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1124978", new Object[]{this, jVar});
        } else {
            jVar.a("InitAPMMin", "InitMtopMultiLang");
        }
    }

    @Override // tb.gub
    public void t(j<String> jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("112c13a7", new Object[]{this, jVar});
            return;
        }
        jVar.c("InitWeex");
        jVar.c("InitLinkManagerB");
        jVar.c("BroadcastLogin");
        jVar.c("InitPopCenter");
        jVar.c("InitLivePopup");
        jVar.c("InitRemoteSo");
        jVar.c("InitDWBase");
        jVar.c("InitElder");
        jVar.c("InitAbilityKit");
        jVar.c("InitShopRuleOpt");
        jVar.c("InitUCParam");
    }

    @Override // tb.gub
    public void A(j<String> jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e893d8ba", new Object[]{this, jVar});
            return;
        }
        jVar.c("InitWeexSmoothBootFinish");
        jVar.c("InitOrangeConfigLaunched");
        jVar.c("InitShopRuleOpt");
        jVar.c("InitAppRemoteGodEyeInitializer");
        jVar.c("InitHomeTaskCompleted");
    }

    @Override // tb.gub
    public void u(j<String> jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("856b4c06", new Object[]{this, jVar});
            return;
        }
        jVar.d("InitSafeMode").a((j.a<String>) "InitClearSpeedFlag", (j.a<String>[]) new String[]{"InitChangeAppIcon"});
        jVar.b("InitUpdate");
    }

    @Override // tb.gub
    public void w(j<String> jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6de9bcc4", new Object[]{this, jVar});
            return;
        }
        jVar.a("InitKeepAlive", "InitTaoLog");
        jVar.a((j<String>) "InitBasicParam");
    }

    @Override // tb.gub
    public void x(j<String> jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e228f523", new Object[]{this, jVar});
        } else {
            jVar.a("InitBasicParam", "InitWindvane");
        }
    }

    @Override // tb.gub
    public void z(j<String> jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("caa765e1", new Object[]{this, jVar});
            return;
        }
        jVar.d("InitBasicParam").a((j.a<String>) "InitUt", (j.a<String>[]) new String[]{"InitMotuCrash"});
        jVar.c("InitEnv");
        jVar.c("InitAtlasServiceFinder");
        jVar.a("InitPhenix", "InitPhenixBuild");
    }

    @Override // tb.gub
    public void F(j<String> jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2dcff295", new Object[]{this, jVar});
            return;
        }
        jVar.c("InitDesktopWidget");
        jVar.c("InitTaoLog");
        jVar.c("InitNetwork");
    }
}
