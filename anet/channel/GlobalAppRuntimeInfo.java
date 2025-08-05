package anet.channel;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.widget.Toast;
import anet.channel.Config;
import anet.channel.entity.ENV;
import anet.channel.fulltrace.AnalysisFactory;
import anet.channel.fulltrace.SceneInfo;
import anet.channel.strategy.StrategyCenter;
import anet.channel.strategy.dispatch.AmdcRuntimeInfo;
import anet.channel.strategy.dispatch.DispatchConstants;
import anet.channel.util.ABSwitchUtils;
import anet.channel.util.ALog;
import anet.channel.util.HttpConstant;
import anet.channel.util.Utils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.adaemon.g;
import com.taobao.android.launcher.common.LauncherRuntime;
import com.taobao.android.launcher.common.c;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.gvk;
import tb.kge;

/* loaded from: classes.dex */
public class GlobalAppRuntimeInfo {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String DEFAULT_TOAST_TEXT = "使用移动数据改善浏览体验，可在设置-通用里关闭";
    private static final String SP_KEY_TOAST_TIRE_TIME = "network_toast_tire_time";
    private static final String TAG = "awcn.GlobalAppRuntimeInfo";
    private static final String USER_ID = "UserId";
    private static String appVersion;
    private static String appkey;
    private static volatile CopyOnWriteArrayList<String> bucketInfos;
    private static Context context;
    private static String currentProcess;
    private static ENV env;
    private static volatile int globalNetworkQuality;
    private static volatile long initTime;
    private static volatile boolean isBackground;
    public static AtomicBoolean isThreadCountInited;
    private static volatile String launchTime;
    private static HashMap<String, Object> launcherParam;
    private static long networkStatusChangedTime;
    private static Map<String, Integer> requestIndexMap;
    public static Map<String, Integer> sessionIndexMap;
    private static SharedPreferences sp;
    private static long statusChangedTime;
    private static String targetProcess;
    private static AtomicBoolean toastStatus;
    private static String ttid;
    private static Handler uiHandler;
    private static String userId;
    private static String utdid;

    /* loaded from: classes2.dex */
    public enum NetworkChangeRequestStatus {
        NONE,
        YES_SUCCESS,
        YES_FAIL,
        NO
    }

    static {
        kge.a(-9178233);
        env = ENV.ONLINE;
        targetProcess = "";
        currentProcess = "";
        isBackground = true;
        globalNetworkQuality = 2;
        sp = null;
        bucketInfos = null;
        networkStatusChangedTime = 0L;
        statusChangedTime = -1L;
        requestIndexMap = null;
        sessionIndexMap = null;
        isThreadCountInited = new AtomicBoolean();
        launcherParam = null;
        toastStatus = new AtomicBoolean(false);
        uiHandler = new Handler(Looper.getMainLooper());
    }

    public static void setNetworkStatusChangedTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66b356ba", new Object[]{new Long(j)});
        } else {
            networkStatusChangedTime = j;
        }
    }

    public static synchronized void setStatusChangedTime(long j) {
        synchronized (GlobalAppRuntimeInfo.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1dcc7330", new Object[]{new Long(j)});
            } else {
                statusChangedTime = j;
            }
        }
    }

    public static synchronized boolean isStatusChangedRequest(String str) {
        synchronized (GlobalAppRuntimeInfo.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("66f7c96c", new Object[]{str})).booleanValue();
            }
            if (statusChangedTime > 0) {
                long currentTimeMillis = System.currentTimeMillis() - statusChangedTime;
                if (currentTimeMillis <= AwcnConfig.getVpnFastDegradTime()) {
                    ALog.e(TAG, "[ap] isStatusChangedRequest, time=" + currentTimeMillis, str, new Object[0]);
                    return true;
                }
            }
            return false;
        }
    }

    public static long getNetworkStatusChangedTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("212ce632", new Object[0])).longValue() : networkStatusChangedTime;
    }

    public static void setContext(Context context2) {
        HashMap<String, Object> basicParams;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a164154", new Object[]{context2});
            return;
        }
        context = context2;
        if (context2 == null) {
            return;
        }
        if (AwcnConfig.isCurrentProcessOpt() && TextUtils.isEmpty(currentProcess) && (basicParams = getBasicParams()) != null && !basicParams.isEmpty()) {
            String str = (String) basicParams.get("process");
            if (!TextUtils.isEmpty(str)) {
                ALog.e(TAG, "[Launcher] setContext, currentProcess=" + str, null, new Object[0]);
                currentProcess = str;
            }
        }
        if (TextUtils.isEmpty(currentProcess)) {
            currentProcess = Utils.getProcessName(context2, Process.myPid());
            ALog.e(TAG, "[Launcher] setContext, getProcessName=" + currentProcess, null, new Object[0]);
        }
        if (TextUtils.isEmpty(targetProcess)) {
            targetProcess = Utils.getMainProcessName(context2);
        }
        if (sp == null) {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context2);
            sp = defaultSharedPreferences;
            userId = defaultSharedPreferences.getString(USER_ID, null);
        }
        ALog.e(TAG, "", null, "CurrentProcess", currentProcess, "TargetProcess", targetProcess);
    }

    public static Context getContext() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("e1727078", new Object[0]) : context;
    }

    public static void setTargetProcess(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afd37fed", new Object[]{str});
        } else {
            targetProcess = str;
        }
    }

    public static boolean isTargetProcess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("81f8011f", new Object[0])).booleanValue();
        }
        if (!TextUtils.isEmpty(targetProcess) && !TextUtils.isEmpty(currentProcess)) {
            return targetProcess.equalsIgnoreCase(currentProcess);
        }
        return true;
    }

    public static boolean isChannelProcess(Context context2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d915192f", new Object[]{context2})).booleanValue();
        }
        if (TextUtils.isEmpty(currentProcess)) {
            currentProcess = Utils.getProcessName(context2, Process.myPid());
        }
        return "com.taobao.taobao:channel".equalsIgnoreCase(currentProcess);
    }

    public static boolean isChannelProcess() {
        Context context2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("86016141", new Object[0])).booleanValue();
        }
        if (TextUtils.isEmpty(currentProcess) && (context2 = context) != null) {
            currentProcess = Utils.getProcessName(context2, Process.myPid());
        }
        return "com.taobao.taobao:channel".equalsIgnoreCase(currentProcess);
    }

    public static boolean isTargetProcess(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d2173a29", new Object[]{str})).booleanValue();
        }
        if (!TextUtils.isEmpty(targetProcess) && !TextUtils.isEmpty(str)) {
            return targetProcess.equalsIgnoreCase(str);
        }
        return true;
    }

    public static boolean isLightMainProcess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("33ced455", new Object[0])).booleanValue();
        }
        try {
            if (gvk.a(gvk.a()) == -2) {
                if (!g.a()) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            ALog.e(TAG, "[Launcher] get isLightMainProcess fail, error=" + th.toString(), null, new Object[0]);
            return false;
        }
    }

    public static String getCurrentProcess() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("fbba16cd", new Object[0]) : currentProcess;
    }

    public static void setCurrentProcess(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c54e449", new Object[]{str});
        } else {
            currentProcess = str;
        }
    }

    public static void setAppkey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd9dfe31", new Object[]{str});
            return;
        }
        ALog.e(TAG, "[isAllowLightAmdcRequest] key = " + str, null, new Object[0]);
        appkey = str;
    }

    public static String getAppkey() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c9396be5", new Object[0]) : appkey;
    }

    public static void setEnv(ENV env2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95bdd84f", new Object[]{env2});
        } else {
            env = env2;
        }
    }

    public static ENV getEnv() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ENV) ipChange.ipc$dispatch("491cc26f", new Object[0]) : env;
    }

    public static HashMap<String, Object> getBasicParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("e14961c8", new Object[0]);
        }
        try {
            if (launcherParam == null || launcherParam.isEmpty()) {
                launcherParam = c.a();
                ALog.e(TAG, "[Launcher] TaobaoNetworkAdapter getBasicParams!!!", null, new Object[0]);
            }
        } catch (Throwable th) {
            ALog.e(TAG, "[Launcher] getBasicParams fail, error=" + th.toString(), null, new Object[0]);
        }
        return launcherParam;
    }

    public static Application getApplication() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Application) ipChange.ipc$dispatch("5749e470", new Object[0]);
        }
        try {
            return LauncherRuntime.h;
        } catch (Throwable th) {
            ALog.e(TAG, "[Launcher] getApplication fail, error=" + th.toString(), null, new Object[0]);
            return null;
        }
    }

    public static void setTtid(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a2801ee", new Object[]{str});
            return;
        }
        ttid = str;
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            int indexOf = str.indexOf("@");
            String str2 = null;
            String substring = indexOf != -1 ? str.substring(0, indexOf) : null;
            String substring2 = str.substring(indexOf + 1);
            int lastIndexOf = substring2.lastIndexOf("_");
            if (lastIndexOf != -1) {
                String substring3 = substring2.substring(0, lastIndexOf);
                str2 = substring2.substring(lastIndexOf + 1);
                substring2 = substring3;
            }
            appVersion = str2;
            AmdcRuntimeInfo.setAppInfo(substring2, str2, substring);
        } catch (Exception unused) {
        }
    }

    public static String getTtid() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("99fd2f88", new Object[0]) : ttid;
    }

    public static void setUserId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ca419d9", new Object[]{str});
            return;
        }
        String str2 = userId;
        if (str2 != null && str2.equals(str)) {
            return;
        }
        userId = str;
        StrategyCenter.getInstance().forceRefreshStrategy(DispatchConstants.getAmdcServerDomain());
        SharedPreferences sharedPreferences = sp;
        if (sharedPreferences == null) {
            return;
        }
        sharedPreferences.edit().putString(USER_ID, str).apply();
    }

    public static String getUserId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("58ad3b3d", new Object[0]) : userId;
    }

    public static void setUtdid(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68ee964f", new Object[]{str});
            return;
        }
        String str2 = utdid;
        if (str2 != null && str2.equals(str)) {
            return;
        }
        utdid = str;
    }

    public static String getUtdid() {
        Context context2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3fdfad6f", new Object[0]);
        }
        if (utdid == null && (context2 = context) != null) {
            utdid = Utils.getDeviceId(context2);
        }
        return utdid;
    }

    public static void setBackground(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66a7e1fd", new Object[]{new Boolean(z)});
        } else {
            isBackground = z;
        }
    }

    public static boolean isAppBackground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3ca5f730", new Object[0])).booleanValue();
        }
        if (context != null) {
            return isBackground;
        }
        return true;
    }

    public static int getGlobalNetworkQuality() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e1a24164", new Object[0])).intValue() : globalNetworkQuality;
    }

    public static int setGlobalNetworkQuality(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9c72b819", new Object[]{new Integer(i)})).intValue();
        }
        globalNetworkQuality = i;
        return i;
    }

    public static void addBucketInfo(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a13b254", new Object[]{str, str2});
        } else if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || str.length() > 32 || str2.length() > 32) {
        } else {
            synchronized (GlobalAppRuntimeInfo.class) {
                if (bucketInfos == null) {
                    bucketInfos = new CopyOnWriteArrayList<>();
                }
                bucketInfos.add(str);
                bucketInfos.add(str2);
            }
        }
    }

    public static CopyOnWriteArrayList<String> getBucketInfo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CopyOnWriteArrayList) ipChange.ipc$dispatch("62ba422", new Object[0]) : bucketInfos;
    }

    public static void setLaunchTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a6402a9", new Object[0]);
        } else {
            launchTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        }
    }

    public static String getLaunchTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("cdeb47a3", new Object[0]) : launchTime;
    }

    @Deprecated
    public static void setInitTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac2977fe", new Object[]{new Long(j)});
        } else {
            initTime = j;
        }
    }

    @Deprecated
    public static long getInitTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6c2bf46e", new Object[0])).longValue() : initTime;
    }

    @Deprecated
    public static int getStartType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9c914980", new Object[0])).intValue();
        }
        SceneInfo sceneInfo = AnalysisFactory.getInstance().getSceneInfo();
        if (sceneInfo == null) {
            return -1;
        }
        return sceneInfo.startType;
    }

    public static String getAppVersion() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("65f009ac", new Object[0]) : appVersion;
    }

    public static boolean is32Bit() {
        Object invoke;
        Object invoke2;
        try {
            if (Build.VERSION.SDK_INT >= 23) {
                return !Process.is64Bit();
            }
            Class<?> cls = Class.forName("dalvik.system.VMRuntime");
            Method declaredMethod = cls.getDeclaredMethod("is64Bit", new Class[0]);
            declaredMethod.setAccessible(true);
            Method declaredMethod2 = cls.getDeclaredMethod("getRuntime", new Class[0]);
            declaredMethod2.setAccessible(true);
            if (declaredMethod != null && declaredMethod2 != null && (invoke = declaredMethod2.invoke(null, new Object[0])) != null && (invoke2 = declaredMethod.invoke(invoke, new Object[0])) != null) {
                return !((Boolean) invoke2).booleanValue();
            }
            return false;
        } catch (Exception e) {
            ALog.e(TAG, "[is32Bit] bitRet=false, error=" + e.toString(), null, new Object[0]);
            return false;
        }
    }

    public static SessionCenter getSessionCenter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SessionCenter) ipChange.ipc$dispatch("8c52c77d", new Object[0]);
        }
        String appkey2 = getAppkey();
        if (TextUtils.isEmpty(appkey2)) {
            return SessionCenter.getInstance();
        }
        ENV env2 = getEnv();
        Config config = Config.getConfig(appkey2, env2);
        if (config == null) {
            config = new Config.Builder().setAppkey(appkey2).setEnv(env2).build();
        }
        return SessionCenter.getInstance(config);
    }

    public static synchronized void setRequestIndex(String str) {
        synchronized (GlobalAppRuntimeInfo.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f4568dd6", new Object[]{str});
                return;
            }
            if (AwcnConfig.isMultiConnectOpened() && AwcnConfig.isHostInMultiConnectWhiteList(str)) {
                if (requestIndexMap == null) {
                    requestIndexMap = new HashMap();
                }
                if (requestIndexMap.containsKey(str)) {
                    requestIndexMap.put(str, Integer.valueOf(requestIndexMap.get(str).intValue() ^ 1));
                    return;
                }
                requestIndexMap.put(str, 0);
            }
        }
    }

    public static int getRequestIndex(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("878a3bd", new Object[]{str})).intValue();
        }
        Map<String, Integer> map = requestIndexMap;
        if (map == null || map.isEmpty() || (str != null && !requestIndexMap.containsKey(str))) {
            ALog.e(TAG, "[multiConnect] getRequestIndex requestIndexMap null or not this host=" + str, null, new Object[0]);
            return 0;
        }
        return requestIndexMap.get(str).intValue();
    }

    public static synchronized void updateSessionIndex(String str, String str2) {
        synchronized (GlobalAppRuntimeInfo.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("88036460", new Object[]{str, str2});
                return;
            }
            if (sessionIndexMap == null) {
                sessionIndexMap = new HashMap();
            }
            if (sessionIndexMap.containsKey(str2)) {
                sessionIndexMap.put(str2, Integer.valueOf(sessionIndexMap.get(str2).intValue() + 1));
            } else {
                sessionIndexMap.put(str2, 0);
            }
            ALog.e(TAG, "[multiConnect] updateConnectIndex", str, HttpConstant.HOST, str2, "sessionIndexMap", sessionIndexMap.get(str2));
        }
    }

    public static int getSessionIndex(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e4b44756", new Object[]{str})).intValue();
        }
        Map<String, Integer> map = sessionIndexMap;
        if (map == null || map.isEmpty() || (str != null && !sessionIndexMap.containsKey(str))) {
            ALog.e(TAG, "[multiConnect] getSessionIndex sessionIndexMap null or not this host = " + str, null, new Object[0]);
            return 0;
        }
        return sessionIndexMap.get(str).intValue();
    }

    public static void initThreadCountABOpen() {
        Boolean isABGlobalFeatureOpened;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("518e04c7", new Object[0]);
        } else if (!isThreadCountInited.compareAndSet(false, true) || (isABGlobalFeatureOpened = ABSwitchUtils.isABGlobalFeatureOpened(context, "wait_thread_count_open")) == null) {
        } else {
            AwcnConfig.setWaitThreadCountABEnable(isABGlobalFeatureOpened.booleanValue());
        }
    }

    public static void showUserToast() {
        Context context2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8812cfa6", new Object[0]);
        } else if (!toastStatus.compareAndSet(false, true) || (context2 = getContext()) == null) {
        } else {
            final SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context2);
            if (System.currentTimeMillis() - defaultSharedPreferences.getLong(SP_KEY_TOAST_TIRE_TIME, 0L) <= AwcnConfig.getMultiPathToastTireTime() * 60 * 60 * 1000) {
                return;
            }
            uiHandler.post(new Runnable() { // from class: anet.channel.GlobalAppRuntimeInfo.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    String multiPathUserToastText = AwcnConfig.getMultiPathUserToastText();
                    Context context3 = GlobalAppRuntimeInfo.getContext();
                    if (TextUtils.isEmpty(multiPathUserToastText)) {
                        multiPathUserToastText = GlobalAppRuntimeInfo.DEFAULT_TOAST_TEXT;
                    }
                    Toast.makeText(context3, multiPathUserToastText, 0).show();
                    defaultSharedPreferences.edit().putLong(GlobalAppRuntimeInfo.SP_KEY_TOAST_TIRE_TIME, System.currentTimeMillis()).apply();
                }
            });
        }
    }
}
