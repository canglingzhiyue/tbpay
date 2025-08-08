package android.taobao.windvane.extra.uc;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.taobao.windvane.config.j;
import android.taobao.windvane.config.k;
import android.taobao.windvane.config.q;
import android.taobao.windvane.config.r;
import android.taobao.windvane.extra.core.WVCore;
import android.taobao.windvane.extra.uc.WVUCWebView;
import android.taobao.windvane.startup.UCInitializerInfo;
import android.taobao.windvane.thread.WVThreadPool;
import android.taobao.windvane.util.a;
import android.taobao.windvane.util.m;
import android.taobao.windvane.webview.c;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.uc.webview.base.UCKnownException;
import com.uc.webview.export.extension.GlobalSettings;
import com.uc.webview.export.extension.IRunningCoreInfo;
import com.uc.webview.export.extension.IStatsHandler;
import com.uc.webview.export.extension.SettingKeys;
import com.uc.webview.export.extension.U4Engine;
import com.uc.webview.export.extension.UCPlayer;
import java.io.File;
import java.util.ArrayList;
import tb.kge;
import tb.riy;

/* loaded from: classes2.dex */
public final class UCSetupService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "UCSetupService";

    static {
        kge.a(-963011516);
    }

    public static void configUCSettingsBeforeInit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa393aa9", new Object[0]);
            return;
        }
        try {
            if (j.commonConfig.f1564cn) {
                GlobalSettings.set(SettingKeys.SdkInitWebViewMaxWaitMillis, j.commonConfig.co);
                GlobalSettings.set(SettingKeys.SdkInitFailedAndFallbackSystem, true);
            }
            UCLog.getInstance().init(true);
        } catch (Throwable th) {
            m.b(TAG, "configUCSettings fail", th, new Object[0]);
        }
    }

    public static boolean isU4MultiProcess(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c34c16c6", new Object[]{context})).booleanValue();
        }
        String c = a.c(context);
        String packageName = context.getPackageName();
        if (!StringUtils.equals(c, packageName + ":sandboxed_privilege_process0")) {
            if (!StringUtils.equals(c, packageName + ":sandboxed_process0")) {
                if (!StringUtils.equals(c, packageName + ":gpu_process")) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void configInitSettings(Context context) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c85ddb8c", new Object[]{context});
            return;
        }
        Context applicationContext = context.getApplicationContext();
        boolean isMainProcess = isMainProcess();
        preInit(context);
        IStatsHandler.Instance.set(new IStatsHandler() { // from class: android.taobao.windvane.extra.uc.UCSetupService.1
            public static volatile transient /* synthetic */ IpChange $ipChange;
            private final WVUCWebView.WVValueCallback mValueCallback = new WVUCWebView.WVValueCallback();

            @Override // com.uc.webview.export.extension.IStatsHandler
            public boolean stat(String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("ac6f09e9", new Object[]{this, str})).booleanValue();
                }
                this.mValueCallback.onReceiveValue(str);
                return true;
            }
        });
        android.taobao.windvane.config.a a2 = android.taobao.windvane.config.a.a();
        k kVar = j.commonConfig;
        GlobalSettings.set(SettingKeys.IsInternationalVersion, a2.l());
        GlobalSettings.set(SettingKeys.UBISiVersion, a2.i());
        GlobalSettings.set(SettingKeys.IsHardwareAC, true);
        GlobalSettings.set(SettingKeys.VideoUseStandardMode, true);
        GlobalSettings.set(SettingKeys.SdkInitFailedAndFallbackSystem, true);
        GlobalSettings.set(SettingKeys.SdkInitWebViewMaxWaitMillis, j.commonConfig.co);
        GlobalSettings.set(SettingKeys.SdkUseUCPlayer, kVar.L);
        GlobalSettings.set(SettingKeys.SdkEnableReuseLastCore, kVar.N);
        GlobalSettings.set(SettingKeys.PrivateDataDirSuffix, getMultiProcessPrivateDataDirectorySuffix());
        GlobalSettings.set(SettingKeys.SdkEnableCorruptionDetector, isMainProcess);
        GlobalSettings.set(SettingKeys.NetworkHostingRetry, String.format("|%d|", Integer.valueOf((int) AliNetworkHostingService.NET_ERROR_FALLBACK)));
        r rVar = q.configData;
        int i2 = isMainProcess ? rVar.f1570a : 0;
        if (isMainProcess) {
            i = rVar.b;
        }
        m.e(TAG, "UC多进程模式：webMultiPolicy=[" + i2 + "], gpuMultiPolicy=[" + i + riy.ARRAY_END_STR);
        WVCore.getInstance().setUsedWebMulti(i2).setUsedGpuMulti(i);
        GlobalSettings.set(SettingKeys.RenderProcMode, i2);
        GlobalSettings.set(SettingKeys.GpuProcMode, i);
        ExtImgDecoder.getInstance().initDecoderSwitch(applicationContext);
    }

    public static void configGlobalSettings() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51b2254f", new Object[0]);
            return;
        }
        k kVar = j.commonConfig;
        GlobalSettings.set(SettingKeys.UCCookieType, kVar.aM);
        GlobalSettings.set(SettingKeys.FFMpegAudioDecoderSoPaths, kVar.ag);
        GlobalSettings.set(SettingKeys.CachePageNumber, kVar.u.o);
        GlobalSettings.set(SettingKeys.JsEvalVerboseBacktrace, true);
        GlobalSettings.set(SettingKeys.EmbedViewReattachList, Build.VERSION.SDK_INT >= 29 ? kVar.u.j : "map");
        GlobalSettings.set(SettingKeys.EmbedViewEmbedSurfaceEnableList, kVar.u.i);
        GlobalSettings.set(SettingKeys.FocusAutoPopupInputWhitelist, kVar.u.h);
        GlobalSettings.set(SettingKeys.DiscardableLimitBytes, kVar.u.p);
        GlobalSettings.set(SettingKeys.DiscardableReleaseFreeAfterTimeSwitch, kVar.u.q);
        GlobalSettings.set(SettingKeys.DiscardableReleaseFreeAfterSecond, kVar.u.r);
        GlobalSettings.set(SettingKeys.DiscardableReleaseFreeUntilByte, kVar.u.s);
        GlobalSettings.set(SettingKeys.GrDiscardableLimitByte, kVar.u.u);
        GlobalSettings.set(SettingKeys.GrResourceCacheLimitByte, kVar.u.v);
        if (kVar.dh) {
            GlobalSettings.set(SettingKeys.AudioOutputUseAAudio, true);
        }
        try {
            m.c(TAG, "set audio output use aaudio: " + kVar.dh);
            String str = android.taobao.windvane.config.m.a().f1566a;
            if (StringUtils.isEmpty(str)) {
                return;
            }
            m.c(TAG, "set cookie black list = " + str + " to uc");
            GlobalSettings.set(SettingKeys.CookiesBlacklistForJs, str);
        } catch (Throwable unused) {
        }
    }

    public static void initU4ByExtractedDir(Context context, String[] strArr, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bcf6adb", new Object[]{context, strArr, str});
        } else {
            initU4(context, strArr, str, null, null);
        }
    }

    public static void initU4ByCompressedLib(Context context, String[] strArr, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3ce25c6", new Object[]{context, strArr, str});
        } else {
            initU4(context, strArr, null, str, null);
        }
    }

    public static void initU4ByDownload(Context context, String[] strArr, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("822ed816", new Object[]{context, strArr, str});
        } else {
            initU4(context, strArr, null, null, str);
        }
    }

    public static void initU4(Context context, String[] strArr, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ed94a0b", new Object[]{context, strArr, str, str2, str3});
            return;
        }
        final long currentTimeMillis = System.currentTimeMillis();
        m.e(TAG, "initU4 specifiedDir: " + str + ", lib:" + str2 + ", url:" + str3);
        try {
            U4Engine.Initializer authKey = U4Engine.createInitializer().setContext(context.getApplicationContext()).setAuthKey(strArr);
            if (!StringUtils.isEmpty(str)) {
                authKey.setDecompressedDir(new File(str));
            } else if (!StringUtils.isEmpty(str2)) {
                authKey.setCompressedFile(new File(str2));
            } else if (!StringUtils.isEmpty(str3)) {
                authKey.setUrl(str3);
            }
            authKey.setClient(new U4Engine.InitializerClient() { // from class: android.taobao.windvane.extra.uc.UCSetupService.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.uc.webview.export.extension.U4Engine.InitializerClient
                public void onDownloadProgress(int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("49af8908", new Object[]{this, new Integer(i)});
                    }
                }

                @Override // com.uc.webview.export.extension.U4Engine.InitializerClient
                public void onInitStart(IRunningCoreInfo iRunningCoreInfo) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("69438924", new Object[]{this, iRunningCoreInfo});
                        return;
                    }
                    m.e(UCSetupService.TAG, "initU4 onInitStart");
                    UCInitializerInfo.a().a(0);
                }

                @Override // com.uc.webview.export.extension.U4Engine.InitializerClient
                public boolean onDownloadStart(String str4, U4Engine.IDownloadHandle iDownloadHandle) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("92f77ae7", new Object[]{this, str4, iDownloadHandle})).booleanValue();
                    }
                    m.e(UCSetupService.TAG, "onDownloadStart:" + str4);
                    UCInitializerInfo.a().a(1);
                    if (!DownloadController.getInstance().shouldDelay()) {
                        return true;
                    }
                    WVUCWebView.onUCMCoreDownloadIntercepted();
                    DownloadController.getInstance().delay(iDownloadHandle);
                    return false;
                }

                @Override // com.uc.webview.export.extension.U4Engine.InitializerClient
                public void onDownloadFinish(String str4, File file) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("6e75e042", new Object[]{this, str4, file});
                        return;
                    }
                    m.e(UCSetupService.TAG, "onDownloadFinish:" + str4 + ", savedFile:" + file.getAbsolutePath());
                    UCInitializerInfo.a().a(2);
                }

                @Override // com.uc.webview.export.extension.U4Engine.InitializerClient
                public boolean onExtractStart(File file, File file2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("e3a86699", new Object[]{this, file, file2})).booleanValue();
                    }
                    m.e(UCSetupService.TAG, "initU4 onExtractStart dir:" + file2.getAbsolutePath());
                    m.e(UCSetupService.TAG, "initU4 onExtractStart:true");
                    UCInitializerInfo.a().a(3);
                    return true;
                }

                @Override // com.uc.webview.export.extension.U4Engine.InitializerClient
                public void onExtractFinish(File file) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d9cdff53", new Object[]{this, file});
                        return;
                    }
                    m.e(UCSetupService.TAG, "initU4 onExtractFinish dir:" + file.getAbsolutePath());
                    UCInitializerInfo.a().a(4);
                }

                @Override // com.uc.webview.export.extension.U4Engine.InitializerClient
                public void onDexReady(ClassLoader classLoader) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ce93ec58", new Object[]{this, classLoader});
                        return;
                    }
                    m.e(UCSetupService.TAG, "initU4 onDexReady loader:" + classLoader);
                    UCInitializerInfo.a().a(5);
                }

                @Override // com.uc.webview.export.extension.U4Engine.InitializerClient
                public void onNativeReady(File file) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("30cecceb", new Object[]{this, file});
                        return;
                    }
                    m.e(UCSetupService.TAG, "initU4 onNativeReady libDir:" + file.getAbsolutePath());
                    UCInitializerInfo.a().a(6);
                }

                @Override // com.uc.webview.export.extension.U4Engine.InitializerClient
                public void onSuccess(IRunningCoreInfo iRunningCoreInfo) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("aa94dd75", new Object[]{this, iRunningCoreInfo});
                        return;
                    }
                    m.e(UCSetupService.TAG, "initU4 onSuccess info:" + iRunningCoreInfo + ", cost:" + (System.currentTimeMillis() - currentTimeMillis));
                    UCInitializerInfo.a().a(7);
                    UCSetupService.configGlobalSettings();
                    if (android.taobao.windvane.config.a.f == null) {
                        return;
                    }
                    WVUCWebView.onUCMCoreSwitched(android.taobao.windvane.config.a.f, currentTimeMillis, iRunningCoreInfo);
                }

                @Override // com.uc.webview.export.extension.U4Engine.InitializerClient
                public void onFailed(IRunningCoreInfo iRunningCoreInfo) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("e994354d", new Object[]{this, iRunningCoreInfo});
                        return;
                    }
                    m.e(UCSetupService.TAG, "initU4 onFailed UC ExceptionValueCallback : " + iRunningCoreInfo);
                    UCInitializerInfo.a().a(8);
                    WVUCWebView.onUCMCoreInitFailed(iRunningCoreInfo.failedInfo() != null ? iRunningCoreInfo.failedInfo().exception() : null);
                }
            }).start();
            m.e(TAG, "initU4 started");
            WVCore.getInstance().setUCStartInit(true);
        } catch (Throwable th) {
            m.b(TAG, "initU4 start failed: ", th, new Object[0]);
            WVCoreSettings.getInstance().notifyCoreEventCallback2Fail(c.a(7, th.getMessage()));
        }
    }

    public static void initUCPlayerByInner(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d947d5b1", new Object[]{str});
            return;
        }
        m.b(TAG, "initUCPlayerByInner libPath:" + str);
        UCPlayer.setLibPath(str);
    }

    public static void initUCPlayerByDownload(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e66bf56d", new Object[]{context, str});
            return;
        }
        try {
            UCPlayer.createUpdater().setContext(context.getApplicationContext()).setUrl(str).setClient(new UCPlayer.UpdaterClient() { // from class: android.taobao.windvane.extra.uc.UCSetupService.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.uc.webview.export.extension.UCPlayer.UpdaterClient
                public void onDownloadFinish(String str2, File file) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("6e75e042", new Object[]{this, str2, file});
                    }
                }

                @Override // com.uc.webview.export.extension.UCPlayer.UpdaterClient
                public void onDownloadProgress(int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("49af8908", new Object[]{this, new Integer(i)});
                    }
                }

                @Override // com.uc.webview.export.extension.UCPlayer.UpdaterClient
                public void onFailed(UCKnownException uCKnownException) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("cc3b7ee3", new Object[]{this, uCKnownException});
                    }
                }

                @Override // com.uc.webview.export.extension.UCPlayer.UpdaterClient
                public void onSuccess(String str2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("37d948b5", new Object[]{this, str2});
                    }
                }

                @Override // com.uc.webview.export.extension.UCPlayer.UpdaterClient
                public boolean onDownloadStart(String str2, U4Engine.IDownloadHandle iDownloadHandle) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("92f77ae7", new Object[]{this, str2, iDownloadHandle})).booleanValue();
                    }
                    if (!DownloadController.getInstance().shouldDelay()) {
                        return true;
                    }
                    DownloadController.getInstance().delay(iDownloadHandle);
                    return false;
                }
            }).start();
        } catch (Throwable th) {
            m.b(TAG, "initUCPlayerByDownload start failed: ", th, new Object[0]);
        }
    }

    private static void preInit(final Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b5ebfae", new Object[]{context});
            return;
        }
        U4Engine.createInitializer();
        WVThreadPool.getInstance().execute(new Runnable() { // from class: android.taobao.windvane.extra.uc.UCSetupService.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    U4Engine.getRunningDir(context, false);
                } catch (Throwable unused) {
                }
            }
        });
    }

    /* loaded from: classes2.dex */
    public static final class DownloadController {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        private static final boolean ENABLE_RESUME = false;
        private static DownloadController sInstance;
        private final ArrayList<U4Engine.IDownloadHandle> mDelayedTasks = null;

        static {
            kge.a(-1230025020);
        }

        public void resume() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("deb96e34", new Object[]{this});
            }
        }

        public static DownloadController getInstance() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DownloadController) ipChange.ipc$dispatch("417f73ef", new Object[0]);
            }
            if (sInstance == null) {
                synchronized (DownloadController.class) {
                    if (sInstance == null) {
                        sInstance = new DownloadController();
                    }
                }
            }
            return sInstance;
        }

        public void delay(U4Engine.IDownloadHandle iDownloadHandle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("88b4d481", new Object[]{this, iDownloadHandle});
            } else if (iDownloadHandle == null) {
            } else {
                iDownloadHandle.cancel();
            }
        }

        public boolean shouldDelay() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("a740881b", new Object[]{this})).booleanValue();
            }
            int currentNetworkType = NetworkHelper.getInstance().getCurrentNetworkType(android.taobao.windvane.config.a.f);
            boolean z = 1 == currentNetworkType;
            if (android.taobao.windvane.config.a.a().t()) {
                z |= 4 == currentNetworkType;
            }
            j.a();
            if (j.commonConfig.aw && android.taobao.windvane.config.a.a().v()) {
                z |= 5 == currentNetworkType;
            }
            if (!z) {
                m.e(UCSetupService.TAG, "current env cannot download u4 core");
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("start download u4 core,is4G=[");
                sb.append(4 == currentNetworkType);
                sb.append(riy.ARRAY_END_STR);
                m.c(UCSetupService.TAG, sb.toString());
            }
            return !z;
        }
    }

    /* loaded from: classes2.dex */
    public static final class NetworkHelper {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final int NETWORK_TYPE_2G = 2;
        public static final int NETWORK_TYPE_3G = 3;
        public static final int NETWORK_TYPE_4G = 4;
        public static final int NETWORK_TYPE_5G = 5;
        public static final int NETWORK_TYPE_UNKNOWN = 0;
        public static final int NETWORK_TYPE_WIFI = 1;
        private static NetworkHelper sInstance;
        private int mNetworkType = 0;

        static {
            kge.a(10738428);
        }

        private NetworkHelper() {
        }

        public static NetworkHelper getInstance() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (NetworkHelper) ipChange.ipc$dispatch("a4363fc7", new Object[0]);
            }
            if (sInstance == null) {
                synchronized (NetworkHelper.class) {
                    if (sInstance == null) {
                        sInstance = new NetworkHelper();
                    }
                }
            }
            return sInstance;
        }

        public int getCurrentNetworkType(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("61fd1ef", new Object[]{this, context})).intValue();
            }
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                return 0;
            }
            int type = activeNetworkInfo.getType();
            if (1 == type || 9 == type) {
                return 1;
            }
            if (type == 0) {
                int subtype = activeNetworkInfo.getSubtype();
                if (4 == subtype || 1 == subtype || 2 == subtype) {
                    return 2;
                }
                if (3 == subtype || 8 == subtype || 6 == subtype || 5 == subtype || 12 == subtype) {
                    return 3;
                }
                if (13 == subtype) {
                    return 4;
                }
                j.a();
                if (j.commonConfig.aw && 20 == subtype) {
                    return 5;
                }
            }
            return 0;
        }
    }

    private static boolean isMainProcess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("97b74977", new Object[0])).booleanValue();
        }
        boolean b = a.b(android.taobao.windvane.config.a.f);
        m.c(TAG, "是否在主进程:" + b);
        return b;
    }

    private static String getMultiProcessPrivateDataDirectorySuffix() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("47cc43fc", new Object[0]);
        }
        if (isMainProcess()) {
            return "";
        }
        String substring = a.c(android.taobao.windvane.config.a.f).substring(android.taobao.windvane.config.a.f.getPackageName().length() + 1);
        if (StringUtils.isEmpty(substring)) {
            throw new RuntimeException(String.format("%s getMultiProcessPrivateDataDirectorySuffix failure! Subprocess name: %s illegal.", TAG, a.c(android.taobao.windvane.config.a.f)));
        }
        return substring;
    }
}
