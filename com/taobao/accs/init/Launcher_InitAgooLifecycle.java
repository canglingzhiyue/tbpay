package com.taobao.accs.init;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.os.SystemClock;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ACCSManager;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.common.Constants;
import com.taobao.accs.common.a;
import com.taobao.accs.connection.ConnectionServiceManager;
import com.taobao.accs.connection.state.StateMachine;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.UtilityImpl;
import com.taobao.accs.utl.d;
import com.taobao.accs.utl.f;
import com.taobao.accs.utl.m;
import com.taobao.aranger.utils.c;
import com.taobao.orange.OConstant;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import tb.jzv;
import tb.kaq;
import tb.kge;

/* loaded from: classes.dex */
public class Launcher_InitAgooLifecycle implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "Launcher_InitAgooLifecycle";
    public static Class<?> adaemonClazz;
    private static Method aliveInitMethod;
    public static long coldLaunchTimeInMill;
    public static boolean hasConnected;
    public static boolean mADaemonValid;
    private String mAppKey;
    private int mMode = 0;
    private String mProcess;

    static {
        kge.a(1292552842);
        kge.a(1028243835);
        try {
            adaemonClazz = Class.forName("com.taobao.adaemon.ADaemon");
            mADaemonValid = true;
        } catch (Exception unused) {
            mADaemonValid = false;
        }
        try {
            aliveInitMethod = Class.forName("com.taobao.keepalive.KeepAliveManager").getDeclaredMethod("initInMainProcess", Context.class);
        } catch (Exception unused2) {
        }
        hasConnected = false;
    }

    public void init(final Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{this, application, hashMap});
            return;
        }
        kaq.a(application);
        Context applicationContext = application.getApplicationContext();
        if (applicationContext != null) {
            GlobalClientInfo.mContext = applicationContext;
        }
        UtilityImpl.debug(GlobalClientInfo.getContext());
        ALog.i(TAG, "init", new Object[0]);
        parseMap(hashMap);
        jzv.a(application);
        coldLaunch(application);
        final boolean isMainProcess = UtilityImpl.isMainProcess(application);
        if (isMainProcess) {
            launchInMain(application, hashMap);
        }
        a.f().execute(new Runnable() { // from class: com.taobao.accs.init.-$$Lambda$Launcher_InitAgooLifecycle$5jqTZhskvNuLPeoAG1pIliyYurk
            {
                Launcher_InitAgooLifecycle.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Launcher_InitAgooLifecycle.this.lambda$init$2$Launcher_InitAgooLifecycle(isMainProcess, application);
            }
        });
    }

    public /* synthetic */ void lambda$init$2$Launcher_InitAgooLifecycle(boolean z, Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e509c2d", new Object[]{this, new Boolean(z), application});
        } else if (z) {
            if (UtilityImpl.isChannelProcessAlive(application)) {
                com.taobao.accs.connection.state.a.a().b(StateMachine.Event.obtain(104));
            } else {
                com.taobao.accs.connection.state.a.a().b(StateMachine.Event.obtain(100));
            }
            checkAndInitPush(application);
        } else {
            ALog.e(TAG, "Launcher_InitAgooLifecycle in " + this.mProcess, new Object[0]);
            if (UtilityImpl.isMainProcessAlive(application)) {
                com.taobao.accs.connection.state.a.a().b(StateMachine.Event.obtain(104));
            } else {
                com.taobao.accs.connection.state.a.a().b(StateMachine.Event.obtain(102));
            }
        }
    }

    private void checkAndInitPush(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("733ee5bf", new Object[]{this, application});
            return;
        }
        ALog.e(TAG, "checkAndInitPush", new Object[0]);
        if (!UtilityImpl.needPeriodicReport(application.getApplicationContext(), Constants.SP_KEY_REPORT_TOKEN_TIME)) {
            return;
        }
        a.a().schedule(initPushRunnable(application), 15L, TimeUnit.SECONDS);
    }

    private Runnable initPushRunnable(final Application application) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Runnable) ipChange.ipc$dispatch("5dfb25e3", new Object[]{this, application}) : new Runnable() { // from class: com.taobao.accs.init.Launcher_InitAgooLifecycle.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    ALog.e(Launcher_InitAgooLifecycle.TAG, "reportToken by report_token_time", new Object[0]);
                    Launcher_InitPush.manuMonitor.hasInitialized = true;
                    Launcher_InitPush.init(application, null);
                } catch (Throwable th) {
                    ALog.e(Launcher_InitAgooLifecycle.TAG, "initPushRunnable err", th, new Object[0]);
                }
            }
        };
    }

    private void parseMap(HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65e89a03", new Object[]{this, hashMap});
            return;
        }
        try {
            int intValue = ((Integer) hashMap.get(OConstant.LAUNCH_ENVINDEX)).intValue();
            this.mProcess = (String) hashMap.get("process");
            this.mAppKey = (String) hashMap.get(OConstant.LAUNCH_ONLINEAPPKEY);
            if (intValue == 1) {
                this.mAppKey = (String) hashMap.get(OConstant.LAUNCH_PREAPPKEY);
                this.mMode = 1;
            } else {
                boolean z2 = intValue == 2;
                if (intValue != 3) {
                    z = false;
                }
                if (z2 | z) {
                    this.mAppKey = (String) hashMap.get(OConstant.LAUNCH_TESTAPPKEY);
                    this.mMode = 2;
                }
            }
        } catch (Throwable th) {
            ALog.e(TAG, "init get param error", th, new Object[0]);
        }
        if (!StringUtils.isEmpty(this.mAppKey)) {
            return;
        }
        this.mAppKey = "21646297";
        this.mMode = 0;
    }

    private void coldLaunch(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1442e8ca", new Object[]{this, context});
            return;
        }
        boolean isMainProcess = UtilityImpl.isMainProcess(context);
        if (!c.a(context, 3)) {
            return;
        }
        m.a();
        ConnectionServiceManager.getInstance().coldLaunch();
        if (!isMainProcess) {
            return;
        }
        coldLaunchTimeInMill = SystemClock.elapsedRealtime();
    }

    private void launchInMain(Application application, HashMap<String, Object> hashMap) {
        ALog.e(TAG, "Launcher_InitAgooLifecycle in main", new Object[0]);
        f.a().a(application);
        GlobalClientInfo.getInstance(application).setRemoteAppReceiver("default", Launcher_InitAccs.mAppReceiver);
        ACCSManager.setAppkey(application, this.mAppKey, this.mMode);
        try {
            jzv.a(new ComponentName(application, "com.taobao.accs.AccsIPCProvider"), UtilityImpl.getChannelProcessName(application));
        } catch (Throwable th) {
            ALog.e(TAG, "addComponentAuthority error", th, new Object[0]);
        }
        new Launcher_InitAccs().initImpl(application, hashMap, 10);
        if (mADaemonValid) {
            try {
                adaemonClazz.getMethod("initializeLifecycle", Context.class).invoke(null, application);
            } catch (Exception e) {
                ALog.e(TAG, "adaemon initializeLifecycle error", e, new Object[0]);
            }
        }
        Method method = aliveInitMethod;
        if (method != null) {
            try {
                method.invoke(null, application);
            } catch (Exception e2) {
                ALog.e(TAG, "alive initializeLifecycle error", e2, new Object[0]);
            }
        }
    }

    public static synchronized void monitorConnected() {
        synchronized (Launcher_InitAgooLifecycle.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("239f3fd6", new Object[0]);
            } else if (hasConnected) {
            } else {
                hasConnected = true;
                if (coldLaunchTimeInMill > 0) {
                    final long elapsedRealtime = SystemClock.elapsedRealtime() - coldLaunchTimeInMill;
                    ALog.e(TAG, "accs connected, spent " + elapsedRealtime, new Object[0]);
                    if (elapsedRealtime > 10000) {
                        d.a("accs", "cold_launch_time", "", elapsedRealtime);
                        return;
                    }
                    a.a().schedule(new Runnable() { // from class: com.taobao.accs.init.Launcher_InitAgooLifecycle.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                d.a("accs", "cold_launch_time", "", elapsedRealtime);
                            }
                        }
                    }, 10L, TimeUnit.SECONDS);
                }
            }
        }
    }
}
