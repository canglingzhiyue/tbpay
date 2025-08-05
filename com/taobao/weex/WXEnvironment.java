package com.taobao.weex;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.system.Os;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.taobao.aop.ANDROID_TELEPHONY_TELEPHONYMANAGER_PROXY;
import com.taobao.taobao.R;
import com.taobao.weex.common.Constants;
import com.taobao.weex.common.WXConfig;
import com.taobao.weex.utils.LogLevel;
import com.taobao.weex.utils.WXLogUtils;
import com.taobao.weex.utils.WXUtils;
import com.taobao.weex.utils.WXViewUtils;
import java.io.File;
import java.io.FileDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.ifq;
import tb.kge;

/* loaded from: classes.dex */
public class WXEnvironment {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ARMEABI = "armeabi";
    public static boolean AUTO_ADJUST_ENV_DEVICE_WIDTH = false;
    public static boolean AUTO_UPDATE_APPLICATION_SCREEN_SIZE = false;
    private static String COPY_SO_DES_DIR = null;
    public static String CORE_JSB_SO_CACHE_PATH = null;
    private static String CORE_JSB_SO_INNER_PATH = null;
    public static final String CORE_JSB_SO_NAME = "weexjsb";
    public static final String CORE_JSC_SO_NAME = "JavaScriptCore";
    private static String CORE_JSC_SO_PATH = null;
    private static String CORE_JSS_ICU_PATH = null;
    public static String CORE_JSS_RUNTIME_SO_PATH = null;
    public static final String CORE_JSS_SO_NAME = "weexcore";
    public static final String CORE_JST_SO_NAME = "weexjst";
    public static final String CORE_QJS_SO_NAME = "weexcoreqjs";
    public static String CORE_SO_COPY_PATH = null;
    public static final String CORE_SO_NAME = "weexcore";
    public static final String DEV_Id;
    public static final String EAGLE = "eagle";
    public static final String ENVIRONMENT = "environment";
    public static String JS_LIB_SDK_VERSION = null;
    public static volatile boolean JsFrameworkInit = false;
    private static String LIB_LD_PATH = null;
    private static final String MIPS = "mips";
    public static final String OS = "android";
    public static final String SETTING_EXCLUDE_X86SUPPORT = "env_exclude_x86";
    public static boolean SETTING_FORCE_VERTICAL_SCREEN = false;
    public static final String SYS_MODEL;
    public static String SYS_VERSION = null;
    public static final String WEEX_CURRENT_KEY = "wx_current_url";
    public static String WXSDK_VERSION = null;
    private static final String X86 = "x86";
    private static boolean isApkDebug = false;
    public static boolean isPerf = false;
    public static volatile boolean isWsFixMode = false;
    private static String mAbi = null;
    private static a mWXDefaultSettings = null;
    private static boolean openDebugLog = false;
    private static Map<String, String> options = null;
    public static Application sApplication = null;
    public static long sComponentsAndModulesReadyTime = 0;
    private static boolean sDebugFlagInit = false;
    public static boolean sDebugMode = false;
    public static boolean sDebugNetworkEventReporterEnable = false;
    public static boolean sDebugServerConnectable = false;
    public static String sDebugWsUrl = null;
    @Deprecated
    public static int sDefaultWidth = 0;
    public static boolean sDynamicMode = false;
    public static String sDynamicUrl = null;
    public static final boolean sForceEnableDevTool = true;
    private static String sGlobalFontFamily;
    public static boolean sInAliWeex;
    public static long sJSFMStartListenerTime;
    public static long sJSLibInitTime;
    public static LogLevel sLogLevel;
    public static long sNEWSDKInitTime;
    public static long sNewSDKInitStart;
    public static boolean sRemoteDebugMode;
    public static String sRemoteDebugProxyUrl;
    public static long sSDKInitExecuteTime;
    public static long sSDKInitInvokeTime;
    public static long sSDKInitStart;
    public static long sSDKInitTaskTime;
    public static long sSDKInitTime;
    public static volatile boolean sUseRunTimeApi;

    static {
        kge.a(22921815);
        String str = Build.VERSION.RELEASE;
        SYS_VERSION = str;
        if (str != null && SYS_VERSION.toUpperCase(Locale.ROOT).equals("P")) {
            SYS_VERSION = "9.0.0";
        }
        String str2 = SYS_VERSION;
        if (str2 != null && str2.toUpperCase(Locale.ROOT).equals("Q")) {
            SYS_VERSION = "10.0.0";
        }
        mAbi = null;
        SYS_MODEL = Build.MODEL;
        JS_LIB_SDK_VERSION = "";
        WXSDK_VERSION = "0.31.5.37";
        DEV_Id = getDevId();
        sDefaultWidth = 750;
        JsFrameworkInit = false;
        SETTING_FORCE_VERTICAL_SCREEN = false;
        AUTO_ADJUST_ENV_DEVICE_WIDTH = true;
        AUTO_UPDATE_APPLICATION_SCREEN_SIZE = true;
        sUseRunTimeApi = false;
        sDebugMode = false;
        sDebugWsUrl = "";
        sDebugServerConnectable = false;
        sRemoteDebugMode = false;
        sRemoteDebugProxyUrl = "";
        sDebugNetworkEventReporterEnable = false;
        sJSLibInitTime = 0L;
        sSDKInitStart = 0L;
        sNewSDKInitStart = 0L;
        sSDKInitTaskTime = 0L;
        sSDKInitInvokeTime = 0L;
        sSDKInitExecuteTime = 0L;
        sSDKInitTime = 0L;
        sNEWSDKInitTime = 0L;
        sJSFMStartListenerTime = 0L;
        isWsFixMode = true;
        sComponentsAndModulesReadyTime = 0L;
        sInAliWeex = false;
        sLogLevel = LogLevel.DEBUG;
        isApkDebug = true;
        isPerf = false;
        sDebugFlagInit = false;
        openDebugLog = true;
        CORE_SO_COPY_PATH = null;
        CORE_JSB_SO_INNER_PATH = null;
        CORE_JSS_RUNTIME_SO_PATH = null;
        CORE_JSS_ICU_PATH = null;
        CORE_JSC_SO_PATH = null;
        CORE_JSB_SO_CACHE_PATH = null;
        COPY_SO_DES_DIR = null;
        LIB_LD_PATH = null;
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        options = concurrentHashMap;
        concurrentHashMap.put("os", "android");
        options.put("osName", "android");
        sDynamicMode = false;
        sDynamicUrl = "";
    }

    public static synchronized a getWXDefaultSettings() {
        synchronized (WXEnvironment.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("48072731", new Object[0]);
            }
            if (mWXDefaultSettings == null && getApplication() != null) {
                mWXDefaultSettings = new a(getApplication());
            }
            return mWXDefaultSettings;
        }
    }

    public static synchronized String getDefaultSettingValue(String str, String str2) {
        synchronized (WXEnvironment.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8a37e2b9", new Object[]{str, str2});
            }
            a wXDefaultSettings = getWXDefaultSettings();
            if (wXDefaultSettings != null && !TextUtils.isEmpty(str)) {
                return wXDefaultSettings.a(str, str2);
            }
            return str2;
        }
    }

    public static synchronized void writeDefaultSettingsValue(String str, String str2) {
        synchronized (WXEnvironment.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9bd6bae7", new Object[]{str, str2});
                return;
            }
            a wXDefaultSettings = getWXDefaultSettings();
            if (wXDefaultSettings != null && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                wXDefaultSettings.b(str, str2);
            }
        }
    }

    public static Map<String, String> getConfig() {
        Application application;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("160426b4", new Object[0]);
        }
        HashMap hashMap = new HashMap();
        hashMap.put("os", "android");
        hashMap.put("appVersion", getAppVersionName());
        hashMap.put(WXConfig.cacheDir, getAppCacheFile());
        hashMap.put(WXConfig.devId, DEV_Id);
        hashMap.put("sysVersion", SYS_VERSION);
        if (ifq.c()) {
            hashMap.put("sysModel", "APad_" + SYS_MODEL);
        } else if (ifq.d()) {
            hashMap.put("sysModel", "Fold_" + SYS_MODEL);
        } else {
            hashMap.put("sysModel", SYS_MODEL);
        }
        if (WXUtils.disableBuildVersionFix()) {
            hashMap.put(WXConfig.weexVersion, "");
        } else {
            hashMap.put(WXConfig.weexVersion, String.valueOf(WXSDK_VERSION));
        }
        try {
            hashMap.put(WXConfig.layoutDirection, isLayoutDirectionRTL() ? Constants.Name.RTL : "ltr");
        } catch (Exception unused) {
            hashMap.put(WXConfig.layoutDirection, "ltr");
        }
        try {
            if (isApkDebugable()) {
                addCustomOptions(WXConfig.debugMode, "true");
            }
            addCustomOptions("scale", Float.toString(sApplication.getResources().getDisplayMetrics().density));
            addCustomOptions(WXConfig.androidStatusBarHeight, Float.toString(ifq.a(sApplication)));
            addCustomOptions(WXConfig.fullScreenHeight, Integer.toString(WXViewUtils.getFullScreenHeight(sApplication)));
        } catch (NullPointerException e) {
            WXLogUtils.e("WXEnvironment scale Exception: ", e);
        }
        hashMap.putAll(getCustomOptions());
        if (hashMap.get("appName") == null && (application = sApplication) != null) {
            hashMap.put("appName", application.getPackageName());
        }
        return hashMap;
    }

    public static String getAppVersionName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("eafcf261", new Object[0]);
        }
        try {
            return sApplication.getPackageManager().getPackageInfo(sApplication.getPackageName(), 0).versionName;
        } catch (Exception e) {
            WXLogUtils.e("WXEnvironment getAppVersionName Exception: ", e);
            return "";
        }
    }

    private static String getAppCacheFile() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4bde8f66", new Object[0]);
        }
        try {
            return sApplication.getApplicationContext().getCacheDir().getPath();
        } catch (Exception e) {
            WXLogUtils.e("WXEnvironment getAppCacheFile Exception: ", e);
            return "";
        }
    }

    @Deprecated
    public static Map<String, String> getCustomOptions() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("f7b7dcf3", new Object[0]) : options;
    }

    public static void addCustomOptions(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2130ce7", new Object[]{str, str2});
        } else {
            options.put(str, str2);
        }
    }

    public static String getCustomOptions(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("41055018", new Object[]{str}) : options.get(str);
    }

    public static String copySoDesDir() {
        File file;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("51ea574d", new Object[0]);
        }
        try {
            if (TextUtils.isEmpty(COPY_SO_DES_DIR)) {
                if (sApplication == null) {
                    WXLogUtils.e("sApplication is null, so copy path will be null");
                    return null;
                }
                String path = getApplication().getApplicationContext().getCacheDir().getPath();
                if (!TextUtils.isEmpty(path)) {
                    file = new File(path, "/cache/weex/libs");
                } else {
                    String packageName = sApplication.getPackageName();
                    file = new File("/data/data/" + packageName + "/cache/weex/libs");
                }
                if (!file.exists()) {
                    file.mkdirs();
                }
                COPY_SO_DES_DIR = file.getAbsolutePath();
            }
        } catch (Throwable th) {
            WXLogUtils.e(WXLogUtils.getStackTrace(th));
        }
        return COPY_SO_DES_DIR;
    }

    @Deprecated
    public static boolean isSupport() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3d8a2150", new Object[0])).booleanValue() : isCPUSupport();
    }

    public static boolean isLayoutDirectionRTL() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fc05b28a", new Object[0])).booleanValue();
        }
        if (Build.VERSION.SDK_INT < 17) {
            return false;
        }
        return sApplication.getApplicationContext().getResources().getBoolean(R.bool.weex_is_right_to_left);
    }

    @Deprecated
    public static boolean isHardwareSupport() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("22b7cc48", new Object[0])).booleanValue() : isCPUSupport();
    }

    public static boolean isCPUSupport() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b5d9ddc", new Object[0])).booleanValue();
        }
        try {
            return isCPUSupports() && !(isX86() && "true".equals(getCustomOptions().get(SETTING_EXCLUDE_X86SUPPORT)));
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean isX86() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("bfaea77", new Object[0])).booleanValue() : _cpuType().equalsIgnoreCase(X86);
    }

    public static boolean isCPUSupports() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6425244d", new Object[0])).booleanValue() : !_cpuType().equalsIgnoreCase(MIPS);
    }

    public static String _cpuType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1d9c9f16", new Object[0]);
        }
        if (TextUtils.isEmpty(mAbi)) {
            try {
                mAbi = Build.CPU_ABI;
            } catch (Throwable th) {
                th.printStackTrace();
                mAbi = ARMEABI;
            }
            if (TextUtils.isEmpty(mAbi)) {
                mAbi = ARMEABI;
            }
            mAbi = mAbi.toLowerCase(Locale.ROOT);
        }
        return mAbi;
    }

    public static boolean isApkDebugable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e4ce30c6", new Object[0])).booleanValue() : isApkDebugable(sApplication);
    }

    public static boolean isApkDebugable(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ff8f6461", new Object[]{application})).booleanValue();
        }
        if (application == null || isPerf) {
            return false;
        }
        if (sDebugFlagInit) {
            return isApkDebug;
        }
        try {
            String str = getCustomOptions().get(WXConfig.debugMode);
            if (TextUtils.isEmpty(str)) {
                isApkDebug = (application.getApplicationInfo().flags & 2) != 0;
            } else {
                isApkDebug = Boolean.valueOf(str).booleanValue();
            }
        } catch (Exception e) {
            e.printStackTrace();
            isApkDebug = false;
        }
        sDebugFlagInit = true;
        return isApkDebug;
    }

    public static boolean isPerf() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ea4c023e", new Object[0])).booleanValue() : isPerf;
    }

    private static String getDevId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d38588df", new Object[0]);
        }
        Application application = sApplication;
        if (application != null) {
            try {
                return ANDROID_TELEPHONY_TELEPHONYMANAGER_PROXY.proxy_getDeviceId((TelephonyManager) application.getSystemService("phone"));
            } catch (NullPointerException | SecurityException e) {
                WXLogUtils.e(WXLogUtils.getStackTrace(e));
            }
        }
        return "";
    }

    public static Application getApplication() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Application) ipChange.ipc$dispatch("5749e470", new Object[0]) : sApplication;
    }

    public static String getCrashFilePath(Context context) {
        File dir;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2b1a5af1", new Object[]{context}) : (context == null || (dir = context.getDir("crash", 0)) == null) ? "" : dir.getAbsolutePath();
    }

    public static boolean isOpenDebugLog() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b4dfccb0", new Object[0])).booleanValue() : openDebugLog;
    }

    public static void setOpenDebugLog(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82b62370", new Object[]{new Boolean(z)});
        } else {
            openDebugLog = z;
        }
    }

    public static void setApkDebugable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5094421a", new Object[]{new Boolean(z)});
            return;
        }
        isApkDebug = z;
        if (z) {
            return;
        }
        openDebugLog = false;
    }

    public static int memfd_create(String str, int i) {
        if (Build.VERSION.SDK_INT < 28) {
            return 0;
        }
        try {
            Object invoke = Os.class.getMethod("memfd_create", String.class, Integer.TYPE).invoke(null, str, 0);
            if (!(invoke instanceof FileDescriptor)) {
                return 0;
            }
            Field declaredField = FileDescriptor.class.getDeclaredField("descriptor");
            declaredField.setAccessible(true);
            int parseInt = Integer.parseInt(String.valueOf(declaredField.get(invoke)));
            try {
                declaredField.setAccessible(false);
                Os.ftruncate((FileDescriptor) invoke, i);
            } catch (Throwable unused) {
            }
            return parseInt;
        } catch (Throwable unused2) {
            return 0;
        }
    }

    public static String getLibJScRealPath() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4a7e412b", new Object[0]);
        }
        if (TextUtils.isEmpty(CORE_JSC_SO_PATH)) {
            CORE_JSC_SO_PATH = ifq.a(CORE_JSC_SO_NAME);
            WXLogUtils.e("findLibJscRealPath " + CORE_JSC_SO_PATH);
        }
        return CORE_JSC_SO_PATH;
    }

    public static String getLibJssRealPath() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f262033b", new Object[0]);
        }
        if (TextUtils.isEmpty(CORE_JSB_SO_INNER_PATH)) {
            CORE_JSB_SO_INNER_PATH = ifq.a(Build.VERSION.SDK_INT < 16 ? CORE_JST_SO_NAME : CORE_JSB_SO_NAME);
            WXLogUtils.d("test-> findLibJssRealPath " + CORE_JSB_SO_INNER_PATH);
        }
        return CORE_JSB_SO_INNER_PATH;
    }

    public static String getLibJssIcuPath() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a2ded9b4", new Object[0]);
        }
        if (TextUtils.isEmpty(CORE_JSS_ICU_PATH)) {
            CORE_JSS_ICU_PATH = ifq.a();
        }
        return CORE_JSS_ICU_PATH;
    }

    public static String getLibLdPath() {
        if (!TextUtils.isEmpty(LIB_LD_PATH)) {
            return LIB_LD_PATH;
        }
        ClassLoader classLoader = WXEnvironment.class.getClassLoader();
        try {
            LIB_LD_PATH = (String) classLoader.getClass().getMethod("getLdLibraryPath", new Class[0]).invoke(classLoader, new Object[0]);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e2) {
            e2.printStackTrace();
        } catch (InvocationTargetException e3) {
            e3.printStackTrace();
        }
        if (TextUtils.isEmpty(LIB_LD_PATH)) {
            try {
                String property = System.getProperty("java.library.path");
                String libJScRealPath = getLibJScRealPath();
                if (!TextUtils.isEmpty(libJScRealPath)) {
                    LIB_LD_PATH = new File(libJScRealPath).getParent() + ":" + property;
                }
            } catch (Exception e4) {
                e4.printStackTrace();
            }
        }
        if (!TextUtils.isEmpty(CORE_SO_COPY_PATH) && !LIB_LD_PATH.contains(CORE_SO_COPY_PATH)) {
            LIB_LD_PATH = CORE_SO_COPY_PATH + ":" + LIB_LD_PATH;
        }
        WXLogUtils.d("getLibLdPath is " + LIB_LD_PATH);
        return LIB_LD_PATH;
    }

    /* loaded from: classes9.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private String f23477a = "weex_default_settings";
        private SharedPreferences b;

        static {
            kge.a(1890114390);
        }

        public a(Application application) {
            this.b = null;
            if (application != null) {
                this.b = application.getSharedPreferences(this.f23477a, 0);
            }
        }

        public synchronized String a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{this, str, str2});
            }
            if (this.b != null && !TextUtils.isEmpty(str)) {
                String string = this.b.getString(str, str2);
                WXLogUtils.i("get default settings " + str + " : " + string);
                return string;
            }
            WXLogUtils.i("get default settings " + str + " return default value :" + str2);
            return str2;
        }

        public synchronized void b(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("65d7b87d", new Object[]{this, str, str2});
                return;
            }
            if (this.b != null && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                WXLogUtils.i("save default settings " + str + ":" + str2);
                SharedPreferences.Editor edit = this.b.edit();
                edit.putString(str, str2);
                edit.apply();
            }
        }
    }
}
