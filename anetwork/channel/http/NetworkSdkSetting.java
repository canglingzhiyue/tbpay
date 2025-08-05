package anetwork.channel.http;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import anet.channel.AwcnConfig;
import anet.channel.DetectorCenter;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.SessionCenter;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.detect.NetworkDetector;
import anet.channel.entity.ENV;
import anet.channel.session.dns.NavigationHelper;
import anet.channel.statist.TurnOnStat;
import anet.channel.status.HandoverSignalMonitor;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.strategy.StrategyTemplate;
import anet.channel.strategy.dispatch.AmdcPriorityHelper;
import anet.channel.thread.ThreadPoolExecutorFactory;
import anet.channel.util.ABSwitchUtils;
import anet.channel.util.ALog;
import anet.channel.util.GlobalAppListener;
import anet.channel.util.Utils;
import anetwork.channel.config.NetworkConfigCenter;
import anetwork.channel.cookie.CookieManager;
import anetwork.channel.monitor.Monitor;
import anetwork.channel.monitor.WifiFgDetector;
import anetwork.channel.unified.QosTaskQueue;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OConstant;
import java.io.Serializable;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.android.spdy.SpdyAgent;
import org.android.spdy.SpdySessionKind;
import org.android.spdy.SpdyVersion;
import tb.kge;

/* loaded from: classes.dex */
public class NetworkSdkSetting implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static ENV CURRENT_ENV = null;
    private static final String TAG = "anet.NetworkSdkSetting";
    private static Context context;
    private static HashMap<String, Object> initParams;
    private static AtomicBoolean isInit;
    private static AtomicBoolean isInitAsync;
    private static boolean sInitialized;
    private static final Object sLock;

    public static /* synthetic */ void access$000(Context context2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fe40831", new Object[]{context2});
        } else {
            initAsyncConfig(context2);
        }
    }

    static {
        kge.a(1938958795);
        kge.a(1028243835);
        CURRENT_ENV = ENV.ONLINE;
        isInit = new AtomicBoolean(false);
        isInitAsync = new AtomicBoolean(false);
        initParams = null;
        sLock = new Object();
        sInitialized = false;
    }

    public static void init(final Context context2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{context2});
        } else if (context2 == null) {
        } else {
            try {
                if (!isInit.compareAndSet(false, true)) {
                    return;
                }
                ALog.e(TAG, "[Launcher] NetworkSdkSetting init start!!!", null, new Object[0]);
                context = context2;
                GlobalAppRuntimeInfo.setLaunchTime();
                GlobalAppRuntimeInfo.setInitTime(System.currentTimeMillis());
                GlobalAppRuntimeInfo.setContext(context2);
                AwcnConfig.init(context2);
                if (AwcnConfig.isParamsOpened() && AwcnConfig.isSecondRefreshABEnable()) {
                    StrategyTemplate.getInstance().loadStrategyInit();
                }
                initTaobaoAdapter();
                if (AwcnConfig.isLaunchOptEnable()) {
                    ALog.e(TAG, "[Launcher] NetworkSdkSetting init CookieManager start [1] !!! ", null, "isTbNextLaunch", Boolean.valueOf(AwcnConfig.isTbNextLaunch()), "isLaunchOptV2Opened", Boolean.valueOf(AwcnConfig.isLaunchOptV2Opened()));
                    if (!AwcnConfig.isNotAllowCookieOpened() && !AwcnConfig.isTbNextLaunch()) {
                        CookieManager.setup(context2);
                    }
                    initAsync(context2);
                } else {
                    if (!AwcnConfig.isSecondRefreshABEnable() || !AwcnConfig.isLaunchOptOpened()) {
                        initAsync(context2);
                    }
                    if (NetworkConfigCenter.isInitConfigAsync()) {
                        ThreadPoolExecutorFactory.submitScheduledTask(new Runnable() { // from class: anetwork.channel.http.NetworkSdkSetting.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                    return;
                                }
                                Monitor.init();
                                ALog.e(NetworkSdkSetting.TAG, "[Launcher] NetworkSdkSetting init CookieManager start [2] !!!", null, "isTbNextLaunch", Boolean.valueOf(AwcnConfig.isTbNextLaunch()), "isLaunchOptV2Opened", Boolean.valueOf(AwcnConfig.isLaunchOptV2Opened()));
                                if (!AwcnConfig.isNotAllowCookieOpened() && !AwcnConfig.isTbNextLaunch()) {
                                    CookieManager.setup(context2);
                                }
                                DetectorCenter.init();
                                NetworkSdkSetting.initAsync(context2);
                            }
                        });
                    } else {
                        Monitor.init();
                        ALog.e(TAG, "[Launcher] NetworkSdkSetting init CookieManager start [3] !!!", null, "isTbNextLaunch", Boolean.valueOf(AwcnConfig.isTbNextLaunch()), "isLaunchOptV2Opened", Boolean.valueOf(AwcnConfig.isLaunchOptV2Opened()));
                        if (!AwcnConfig.isNotAllowCookieOpened() && !AwcnConfig.isTbNextLaunch()) {
                            CookieManager.setup(context2);
                        }
                        DetectorCenter.init();
                        initAsync(context2);
                    }
                }
                SessionCenter.init(context2);
                AppMonitor.getInstance().commitStat(new TurnOnStat());
                ALog.e(TAG, "[Launcher] NetworkSdkSetting init end!!!", null, new Object[0]);
            } catch (Throwable th) {
                ALog.e(TAG, "[Launcher] NetworkSdkSetting initial failed!", null, th, new Object[0]);
            }
        }
    }

    public static void initAsync(final Context context2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac695955", new Object[]{context2});
        } else if (!isInitAsync.compareAndSet(false, true)) {
        } else {
            ALog.e(TAG, "[Launcher] NetworkSdkSetting initAsync start!!!", null, new Object[0]);
            ThreadPoolExecutorFactory.submitBackupTask(new Runnable() { // from class: anetwork.channel.http.NetworkSdkSetting.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        AmdcPriorityHelper.init();
                    }
                }
            });
            NetworkConfigCenter.init();
            AwcnConfig.initAsync(context2);
            initTaobaoAdapterAsync();
            ThreadPoolExecutorFactory.submitHRTask(new Runnable() { // from class: anetwork.channel.http.NetworkSdkSetting.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        NetworkSdkSetting.loadTNet(context2);
                    }
                }
            });
            if (NetworkConfigCenter.isInitConfigAsync()) {
                ThreadPoolExecutorFactory.submitScheduledTask(new Runnable() { // from class: anetwork.channel.http.NetworkSdkSetting.4
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            NetworkSdkSetting.access$000(context2);
                        }
                    }
                });
            } else {
                initAsyncConfig(context2);
            }
            ALog.e(TAG, "[Launcher] NetworkSdkSetting initAsync end!!!", null, new Object[0]);
        }
    }

    private static void initAsyncConfig(Context context2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fde00633", new Object[]{context2});
            return;
        }
        if (context2 == null) {
            context2 = GlobalAppRuntimeInfo.getContext();
        }
        if (context2 == null) {
            return;
        }
        Monitor.init();
        if (!AwcnConfig.isNotAllowCookieOpened() && !AwcnConfig.isTbNextLaunch()) {
            CookieManager.setup(context2);
        }
        DetectorCenter.init();
        GlobalAppListener.registerApmGlobalAppEventListener();
        HandoverSignalMonitor.initialize(context2);
        if (GlobalAppRuntimeInfo.getCurrentProcess() != null && "com.taobao.taobao".equals(GlobalAppRuntimeInfo.getCurrentProcess())) {
            WifiFgDetector.registerListener();
        }
        NetworkStatusHelper.startListener(context2);
        if (!GlobalAppRuntimeInfo.isTargetProcess()) {
            return;
        }
        NetworkDetector.registerListener();
    }

    public static void init(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{application, hashMap});
            return;
        }
        synchronized (sLock) {
            if (sInitialized) {
                return;
            }
            if (hashMap == null && application == null) {
                application = GlobalAppRuntimeInfo.getApplication();
                hashMap = GlobalAppRuntimeInfo.getBasicParams();
                ALog.e(TAG, "[Launcher] Launch use basic application or params!", null, new Object[0]);
                if (hashMap == null || hashMap.isEmpty() || application == null) {
                    ALog.e(TAG, "[Launcher] Launch basic application or params is null!", null, new Object[0]);
                    return;
                }
            }
            initInner(application, hashMap);
            sInitialized = true;
            sLock.notifyAll();
        }
    }

    private static void initInner(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa348da1", new Object[]{application, hashMap});
            return;
        }
        if (hashMap != null) {
            try {
                if (!hashMap.isEmpty() && application != null) {
                    ALog.e(TAG, "[Launcher] Network SDK init start", null, new Object[0]);
                    int i = -1;
                    Object obj = hashMap.get(OConstant.LAUNCH_ENVINDEX);
                    if (obj != null) {
                        if (obj instanceof String) {
                            i = Integer.valueOf((String) obj).intValue();
                        } else if (obj instanceof Number) {
                            i = ((Number) obj).intValue();
                        }
                    }
                    if (i == 1 && hashMap.containsKey("isNextLaunch")) {
                        CURRENT_ENV = ENV.PREPARE;
                        GlobalAppRuntimeInfo.setEnv(ENV.PREPARE);
                    }
                    GlobalAppRuntimeInfo.setAppkey((String) hashMap.get(OConstant.LAUNCH_ONLINEAPPKEY));
                    GlobalAppRuntimeInfo.setTtid((String) hashMap.get("ttid"));
                    GlobalAppRuntimeInfo.setUtdid((String) hashMap.get("deviceId"));
                    String str = (String) hashMap.get("process");
                    if (!TextUtils.isEmpty(str)) {
                        GlobalAppRuntimeInfo.setCurrentProcess(str);
                    }
                    initParams = new HashMap<>(hashMap);
                    init(application.getApplicationContext());
                    initParams = null;
                    ALog.e(TAG, "[Launcher] Network SDK init end", null, new Object[0]);
                    return;
                }
            } catch (Exception e) {
                ALog.e(TAG, "[Launcher] Network SDK initial failed!", null, e, new Object[0]);
                return;
            }
        }
        ALog.e(TAG, "[Launcher] Network SDK init failed! params null, application null! ", null, new Object[0]);
    }

    public static void setTtid(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a2801ee", new Object[]{str});
        } else {
            GlobalAppRuntimeInfo.setTtid(str);
        }
    }

    public static Context getContext() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("e1727078", new Object[0]) : context;
    }

    private static void initTaobaoAdapter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8374318", new Object[0]);
            return;
        }
        try {
            Utils.invokeStaticMethodThrowException("anet.channel.TaobaoNetworkAdapter", "init", new Class[]{Context.class, HashMap.class}, context, initParams);
            if (GlobalAppRuntimeInfo.getCurrentProcess() != null && "com.taobao.taobao".equals(GlobalAppRuntimeInfo.getCurrentProcess())) {
                NavigationHelper.setup(QosTaskQueue.getInstance());
            }
            ALog.i(TAG, "init taobao adapter success", null, new Object[0]);
        } catch (Throwable th) {
            ALog.e(TAG, "initTaobaoAdapter failed. maybe not taobao app", null, th, new Object[0]);
        }
    }

    private static void initTaobaoAdapterAsync() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("764abcf2", new Object[0]);
            return;
        }
        try {
            Utils.invokeStaticMethodThrowException("anet.channel.TaobaoNetworkAdapter", "initAsync", new Class[]{Context.class}, context);
            ALog.i(TAG, "init async taobao adapter success", null, new Object[0]);
        } catch (Throwable th) {
            ALog.e(TAG, "initTaobaoAdapterAsync failed. maybe not taobao app", null, th, new Object[0]);
        }
    }

    public static void loadTNet(final Context context2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f0238f2", new Object[]{context2});
        } else if (AwcnConfig.isLaunchOptV2Opened()) {
            Boolean isABGlobalFeatureOpened = ABSwitchUtils.isABGlobalFeatureOpened(context2, "network_use_virtual_thread");
            if (isABGlobalFeatureOpened != null) {
                AwcnConfig.setUseVirtualThread(isABGlobalFeatureOpened.booleanValue());
            }
            ThreadPoolExecutorFactory.submitPriorityTask(new Runnable() { // from class: anetwork.channel.http.NetworkSdkSetting.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        SpdyAgent.getInstance(context2, SpdyVersion.SPDY3, SpdySessionKind.NONE_SESSION);
                    }
                }
            }, ThreadPoolExecutorFactory.Priority.NORMAL);
        } else {
            SpdyAgent.getInstance(context2, SpdyVersion.SPDY3, SpdySessionKind.NONE_SESSION);
        }
    }
}
