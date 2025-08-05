package com.ut.mini;

import android.app.Application;
import android.os.Build;
import android.os.RemoteException;
import com.alibaba.analytics.AnalyticsMgr;
import com.alibaba.analytics.core.config.UTClientConfigMgr;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.any;
import tb.apg;
import tb.apr;
import tb.aqb;
import tb.aqc;
import tb.aqj;
import tb.kge;
import tb.rpi;
import tb.rpk;
import tb.rpw;
import tb.rpy;
import tb.rqa;
import tb.rqc;
import tb.rqd;
import tb.rqe;
import tb.rqf;
import tb.rqh;
import tb.rql;
import tb.rqm;
import tb.rqn;
import tb.rqp;
import tb.rqq;

/* loaded from: classes.dex */
public class UTAnalytics {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "UTAnalytics";
    private static volatile boolean mInit;
    private static volatile boolean mInit4app;
    private static UTAnalytics mInstance;
    private static boolean mIsMainProcess;
    private UTTracker mDefaultTracker;
    private rqq mUTSceneTracker;
    private Map<String, UTTracker> mTrackerMap = new HashMap();
    private HashMap<String, UTTracker> mAppKeyTrackMap = new HashMap<>();

    static {
        kge.a(-1535319599);
        mInstance = new UTAnalytics();
        mInit = false;
        mInit4app = false;
        mIsMainProcess = true;
    }

    private UTAnalytics() {
    }

    public static UTAnalytics getInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (UTAnalytics) ipChange.ipc$dispatch("d44f1992", new Object[0]) : mInstance;
    }

    public boolean isInit() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e0a588e5", new Object[]{this})).booleanValue() : mInit;
    }

    /* JADX WARN: Type inference failed for: r7v2, types: [com.ut.mini.UTAnalytics$1] */
    public synchronized void setAppApplicationInstance(final Application application, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1234a04", new Object[]{this, application, aVar});
        } else if (mInit4app) {
        } else {
            if (application != null && aVar != null && application.getBaseContext() != null) {
                any.d().a(application.getBaseContext());
                f.a(application);
                UTClientConfigMgr.a().b();
                rqc.registerTLog();
                AnalyticsMgr.a(application);
                initialize(application, aVar, true);
                new Thread("InitSecurity") { // from class: com.ut.mini.UTAnalytics.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Thread, java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        try {
                            Thread.sleep(2000L);
                        } catch (InterruptedException unused) {
                        }
                        try {
                            apr.b(UTAnalytics.TAG, "initSecurity");
                            com.alibaba.analytics.core.sync.m.a().a(application.getBaseContext());
                        } catch (Throwable th) {
                            apr.b(null, th, new Object[0]);
                        }
                    }
                }.start();
                registerWindvane();
                mInit = true;
                mInit4app = true;
                p.a(application);
                return;
            }
            throw new IllegalArgumentException("application and callback must not be null");
        }
    }

    public synchronized void setAppApplicationInstance4sdk(Application application, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b3f758a", new Object[]{this, application, aVar});
        } else if (mInit) {
        } else {
            if (application != null && aVar != null && application.getBaseContext() != null) {
                any.d().a(application.getBaseContext());
                f.a(application);
                UTClientConfigMgr.a().b();
                rqc.registerTLog();
                AnalyticsMgr.a(application);
                initialize(application, aVar, false);
                registerWindvane();
                mInit = true;
                p.a(application);
                return;
            }
            throw new IllegalArgumentException("application and callback must not be null");
        }
    }

    @Deprecated
    public void updateUserAccount(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("782de874", new Object[]{this, str, str2});
        } else {
            updateUserAccount(str, str2, null);
        }
    }

    public void updateUserAccount(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c37d5d3e", new Object[]{this, str, str2, str3});
            return;
        }
        AnalyticsMgr.a(str, str2, str3);
        if (aqc.e(str)) {
            return;
        }
        UTOriginalCustomHitBuilder uTOriginalCustomHitBuilder = new UTOriginalCustomHitBuilder("UT", 1007, str, str2, null, null);
        uTOriginalCustomHitBuilder.setProperty("_priority", "5");
        getInstance().getDefaultTracker().send(uTOriginalCustomHitBuilder.build());
    }

    public void updateUserAccount(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5c8f388", new Object[]{this, str, str2, str3, str4});
            return;
        }
        AnalyticsMgr.a(str, str2, str3, str4);
        if (aqc.e(str)) {
            return;
        }
        UTOriginalCustomHitBuilder uTOriginalCustomHitBuilder = new UTOriginalCustomHitBuilder("UT", 1007, str, str2, null, null);
        uTOriginalCustomHitBuilder.setProperty("_priority", "5");
        getInstance().getDefaultTracker().send(uTOriginalCustomHitBuilder.build());
    }

    public void userRegister(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74607f9f", new Object[]{this, str});
        } else if (!aqc.e(str)) {
            getDefaultTracker().send(new UTOriginalCustomHitBuilder("UT", 1006, str, null, null, null).build());
        } else {
            throw new IllegalArgumentException("Usernick can not be null or empty!");
        }
    }

    public void updateSessionProperties(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17bd97e", new Object[]{this, map});
        } else {
            AnalyticsMgr.b(map);
        }
    }

    public void registerPlugin(com.ut.mini.module.plugin.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("781a54f2", new Object[]{this, aVar});
        } else {
            com.ut.mini.module.plugin.d.getInstance().registerPlugin(aVar);
        }
    }

    public void registerPlugin(com.ut.mini.module.plugin.a aVar, boolean z, List<String> list, List<String> list2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e170c04", new Object[]{this, aVar, new Boolean(z), list, list2});
        } else {
            com.ut.mini.module.plugin.d.getInstance().registerPlugin(aVar, z, list, list2);
        }
    }

    public void unregisterPlugin(com.ut.mini.module.plugin.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("170f4539", new Object[]{this, aVar});
        } else {
            com.ut.mini.module.plugin.d.getInstance().unregisterPlugin(aVar);
        }
    }

    @Deprecated
    public static void setDisableWindvane(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f61fa13d", new Object[]{new Boolean(z)});
        } else {
            rqd.bWindvaneExtend = !z;
        }
    }

    public static void setDelaySecond(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98f4ce67", new Object[]{new Integer(i)});
        } else {
            AnalyticsMgr.a(i);
        }
    }

    public void turnOffAutoPageTrack() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c21c1f82", new Object[]{this});
        } else {
            l.getInstance().turnOffAutoPageTrack();
        }
    }

    public void setToAliyunOsPlatform() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa53712f", new Object[]{this});
        } else {
            any.d().a();
        }
    }

    public synchronized UTTracker getDefaultTracker() {
        Class<? extends UTTracker> cls;
        UTTracker uTTracker;
        aqc.e(any.d().c());
        if (this.mDefaultTracker == null) {
            rqm multiProcessAdapter = rqn.getMultiProcessAdapter();
            if (multiProcessAdapter == null) {
                cls = null;
            } else if (multiProcessAdapter.isUiSubProcess()) {
                cls = multiProcessAdapter.getSubProcessUTTrackerClass();
            } else {
                cls = UTTracker.class;
            }
            if (cls == null) {
                cls = UTTracker.class;
            }
            try {
                uTTracker = cls.newInstance();
            } catch (Exception e) {
                e.printStackTrace();
                uTTracker = null;
            }
            if (uTTracker == null) {
                this.mDefaultTracker = new UTTracker();
            } else {
                this.mDefaultTracker = uTTracker;
            }
        }
        return this.mDefaultTracker;
    }

    public synchronized rqq getUTSceneTracker() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rqq) ipChange.ipc$dispatch("5ae04b8c", new Object[]{this});
        }
        if (this.mUTSceneTracker == null) {
            rqm multiProcessAdapter = rqn.getMultiProcessAdapter();
            if (multiProcessAdapter != null && multiProcessAdapter.isUiSubProcess()) {
                this.mUTSceneTracker = multiProcessAdapter.getSubProcessUTSceneTracker();
            }
            if (this.mUTSceneTracker == null) {
                this.mUTSceneTracker = new rqq();
            }
        }
        return this.mUTSceneTracker;
    }

    public synchronized com.ut.mini.behavior.b getUTScrollTracker() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.ut.mini.behavior.b) ipChange.ipc$dispatch("18fafb0d", new Object[]{this});
        }
        return com.ut.mini.behavior.b.getInstance();
    }

    public synchronized UTTracker getTracker(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UTTracker) ipChange.ipc$dispatch("80f6f7a1", new Object[]{this, str});
        } else if (!aqc.e(str)) {
            if (this.mTrackerMap.containsKey(str)) {
                return this.mTrackerMap.get(str);
            }
            UTTracker uTTracker = new UTTracker();
            uTTracker.setTrackId(str);
            this.mTrackerMap.put(str, uTTracker);
            return uTTracker;
        } else {
            throw new IllegalArgumentException("TrackId is null");
        }
    }

    public synchronized UTTracker getTrackerByAppkey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UTTracker) ipChange.ipc$dispatch("50a2de16", new Object[]{this, str});
        } else if (!aqc.e(str)) {
            if (this.mAppKeyTrackMap.containsKey(str)) {
                return this.mAppKeyTrackMap.get(str);
            }
            UTTracker uTTracker = new UTTracker();
            uTTracker.setAppKey(str);
            this.mAppKeyTrackMap.put(str, uTTracker);
            return uTTracker;
        } else {
            throw new IllegalArgumentException("appKey is null");
        }
    }

    public void sessionTimeout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17d804f2", new Object[]{this});
            return;
        }
        com.ut.mini.module.trackerlistener.b.getInstance().sessionTimeout();
        com.alibaba.analytics.core.config.r.a().b();
        AnalyticsMgr.c(new HashMap());
        AnalyticsMgr.e();
    }

    public void turnOnRealTimeDebug(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ee88af2", new Object[]{this, map});
        } else {
            AnalyticsMgr.a(map);
        }
    }

    public void turnOffRealTimeDebug() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f108167d", new Object[]{this});
        } else {
            AnalyticsMgr.c();
        }
    }

    @Deprecated
    public String getOperationHistory(int i, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4e5198dd", new Object[]{this, new Integer(i), str}) : rqf.getInstance().getOperationHistory(i, str);
    }

    public void dispatchLocalHits() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2516edf8", new Object[]{this});
        } else if (!checkInit()) {
        } else {
            AnalyticsMgr.g.a(new Runnable() { // from class: com.ut.mini.UTAnalytics.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        AnalyticsMgr.f2031a.dispatchLocalHits();
                    } catch (RemoteException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }

    @Deprecated
    public void saveCacheDataToLocal() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cb3568", new Object[]{this});
        } else if (!checkInit()) {
        } else {
            AnalyticsMgr.g.a(new Runnable() { // from class: com.ut.mini.UTAnalytics.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        AnalyticsMgr.f2031a.saveCacheDataToLocal();
                    } catch (RemoteException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }

    @Deprecated
    public String selfCheck(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e26f193", new Object[]{this, str});
        }
        if (!checkInit()) {
            return "local not init";
        }
        if (AnalyticsMgr.f2031a == null) {
            return "not bind remote service，waitting 10 second";
        }
        try {
            return AnalyticsMgr.f2031a.selfCheck(str);
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void transferLog(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8801825", new Object[]{this, map});
        } else if (!checkInit()) {
        } else {
            AnalyticsMgr.g.a(createTransferLogTask(map));
        }
    }

    private boolean checkInit() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9fdaa2c3", new Object[]{this})).booleanValue() : AnalyticsMgr.c;
    }

    public void registerWindvane() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("154bcf74", new Object[]{this});
        } else {
            rqe.registerWindvane(mInit);
        }
    }

    private void setRequestAuthentication(rpw rpwVar) {
        String appkey;
        String appSecret;
        boolean isEncode;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3842ff83", new Object[]{this, rpwVar});
            return;
        }
        apr.d(TAG, "[setRequestAuthentication] start...", aqj.a().b(), Boolean.valueOf(AnalyticsMgr.c));
        if (rpwVar == null) {
            throw new NullPointerException("签名不能为空!");
        }
        if (rpwVar instanceof rqa) {
            rqa rqaVar = (rqa) rpwVar;
            appkey = rqaVar.getAppkey();
            appSecret = rqaVar.getAuthcode();
            isEncode = false;
        } else if (rpwVar instanceof rpy) {
            rpy rpyVar = (rpy) rpwVar;
            appkey = rpyVar.getAppkey();
            appSecret = rpyVar.getAppSecret();
            isEncode = rpyVar.isEncode();
            z = false;
        } else {
            throw new IllegalArgumentException("此签名方式暂不支持!请使用 UTSecuritySDKRequestAuthentication 或 UTBaseRequestAuthentication 设置签名!");
        }
        any.d().a(appkey);
        AnalyticsMgr.a(z, isEncode, appkey, appSecret);
    }

    private void initialize(Application application, a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cdb33326", new Object[]{this, application, aVar, new Boolean(z)});
            return;
        }
        setAppVersion(aVar.getUTAppVersion());
        setChannel(aVar.getUTChannel());
        if (aVar.isAliyunOsSystem()) {
            getInstance().setToAliyunOsPlatform();
        }
        if (aVar.isUTCrashHandlerDisable()) {
            com.ut.mini.crashhandler.d.getInstance().turnOff();
        } else {
            com.ut.mini.crashhandler.d.getInstance().turnOn(application.getApplicationContext());
            if (aVar.getUTCrashCraughtListener() != null) {
                com.ut.mini.crashhandler.d.getInstance().setCrashCaughtListener(aVar.getUTCrashCraughtListener());
            }
        }
        if (aVar.isUTLogEnable()) {
            turnOnDebug();
        }
        if (!mInit || z) {
            setRequestAuthentication(aVar.getUTRequestAuthInstance());
        }
        mIsMainProcess = apg.e(application.getApplicationContext());
        if (mInit) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 14 && mIsMainProcess) {
            rqm multiProcessAdapter = rqn.getMultiProcessAdapter();
            if (multiProcessAdapter != null) {
                try {
                    multiProcessAdapter.registerActivityLifecycleCallbacks();
                } catch (Exception e) {
                    rql.registeActivityLifecycleCallbacks(application);
                    e.printStackTrace();
                }
            } else {
                rql.registeActivityLifecycleCallbacks(application);
            }
            rql.registerAppStatusCallbacks(rqh.getInstance());
            rql.registerAppStatusCallbacks(k.a());
            rql.registerAppStatusCallbacks(com.ut.mini.internal.e.getInstance());
            rql.registerAppStatusCallbacks(f.getInstance());
            com.ut.mini.exposure.e.getInstance().init(application);
            com.alibaba.analytics.core.config.r.a();
        }
        if (!mIsMainProcess) {
            return;
        }
        com.ut.mini.mtop.a.init();
        c.b().a();
        rqp.init();
        com.ut.mini.behavior.a.init();
        if (rqd.bUTDataCollector) {
            try {
                rpk.init(application, rpi.getInstance());
            } catch (Throwable unused) {
            }
        }
        n.a();
        AnalyticsMgr.h();
    }

    private void setAppVersion(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cefab34a", new Object[]{this, str});
        } else {
            AnalyticsMgr.b(str);
        }
    }

    private void setChannel(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40d4aa12", new Object[]{this, str});
            return;
        }
        AnalyticsMgr.a(str);
        try {
            AnalyticsMgr.g.a(new Runnable() { // from class: com.ut.mini.UTAnalytics.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        aqb.a(any.d().e(), "channel", str);
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    private void turnOffCrashHandler() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ceee947c", new Object[]{this});
        } else {
            com.ut.mini.crashhandler.d.getInstance().turnOff();
        }
    }

    private void turnOnDebug() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc27dd7e", new Object[]{this});
        } else {
            AnalyticsMgr.d();
        }
    }

    private Runnable createTransferLogTask(final Map<String, String> map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Runnable) ipChange.ipc$dispatch("976af18", new Object[]{this, map}) : new Runnable() { // from class: com.ut.mini.UTAnalytics.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    AnalyticsMgr.f2031a.transferLog(map);
                } catch (Throwable unused) {
                }
            }
        };
    }
}
