package com.taobao.login4android;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v4.content.LocalBroadcastManager;
import android.taobao.mulitenv.EnvironmentSwitcher;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.q;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.ali.user.mobile.app.constant.UTConstant;
import com.ali.user.mobile.callback.DataCallback;
import com.ali.user.mobile.common.api.AliUserLogin;
import com.ali.user.mobile.common.api.LoginApprearanceExtensions;
import com.ali.user.mobile.coordinator.CoordinatorWrapper;
import com.ali.user.mobile.log.UserTrackAdapter;
import com.ali.user.mobile.login.model.LoginConstant;
import com.ali.user.mobile.model.CommonCallback;
import com.ali.user.mobile.utils.MainThreadExecutor;
import com.ali.user.mobile.utils.SharedPreferencesUtil;
import com.ali.user.open.core.AliMemberSDK;
import com.ali.user.open.core.callback.InitResultCallback;
import com.ali.user.open.core.config.ConfigManager;
import com.ali.user.open.core.config.Environment;
import com.ali.user.open.jsbridge.UccJsBridge;
import com.ali.user.open.jsbridge.UserTrackBridge;
import com.ali.user.open.ucc.webview.UccSystemJSBridge;
import com.alibaba.ability.localization.b;
import com.alibaba.ability.localization.constants.Language;
import com.alibaba.security.rp.RPSDK;
import com.alipay.mobile.verifyidentity.alipay.H5Plugin.WindVaneInit;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.address.b;
import com.taobao.android.address.f;
import com.taobao.android.sns4android.SNSPlatform;
import com.taobao.android.sns4android.c;
import com.taobao.android.sns4android.jsbridge.SNSJsbridge;
import com.taobao.login4android.activity.LoginProxyActivity;
import com.taobao.login4android.api.LoginApiContext;
import com.taobao.login4android.broadcast.LoginBroadcastHelper;
import com.taobao.login4android.config.LoginSwitch;
import com.taobao.login4android.constants.LoginEnvType;
import com.taobao.login4android.init.loginbar.LoginBarController;
import com.taobao.login4android.jsbridge.AuthBridge;
import com.taobao.login4android.jsbridge.PopJSBridge;
import com.taobao.login4android.jsbridge.TBLoginJSBridge;
import com.taobao.login4android.log.LoginTLogAdapter;
import com.taobao.login4android.membercenter.security.AccountSecurityJSbridge;
import com.taobao.login4android.monitor.MonitorLifecycle;
import com.taobao.login4android.receiver.TBLoginReceiver;
import com.taobao.login4android.thread.LoginThreadHelper;
import com.taobao.login4android.video.VerifyJsbridge;
import com.taobao.login4android.weex.WVIntentModule;
import com.taobao.login4android.weex.WVUserModule;
import com.taobao.orange.OrangeConfig;
import com.taobao.orange.d;
import com.taobao.tao.Globals;
import com.taobao.tao.TaoApplication;
import com.taobao.taobao.R;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.kge;

/* loaded from: classes7.dex */
public class TaoBaoLoginInitializer {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String INIT_TAG = "init.login-tag";
    private static final AtomicBoolean LOCK;
    public static final String TAG = "login.LoginApplication";
    public static long endTime;
    public static volatile boolean isInited;
    public static Application mApplication;
    public static Context mContext;
    public static long startTime;
    public static long stepTime1;
    public static volatile Map<String, String> tbTimes;

    public static /* synthetic */ void access$000(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fe40831", new Object[]{context});
        } else {
            doInitSDK(context);
        }
    }

    public static /* synthetic */ void access$100(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18144810", new Object[]{context});
        } else {
            initUcc(context);
        }
    }

    static {
        kge.a(765171205);
        isInited = false;
        LOCK = new AtomicBoolean(false);
        startTime = -1L;
        stepTime1 = -1L;
        endTime = -1L;
        tbTimes = Collections.synchronizedMap(new HashMap());
    }

    public static synchronized void init(Context context) {
        synchronized (TaoBaoLoginInitializer.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("609fd211", new Object[]{context});
            } else {
                init(context, false);
            }
        }
    }

    public static synchronized void init(Context context, boolean z) {
        synchronized (TaoBaoLoginInitializer.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b35b22e3", new Object[]{context, new Boolean(z)});
            } else if (context == null) {
            } else {
                String curProcessName = LoginThreadHelper.getCurProcessName(context);
                LoginTLogAdapter.trace(TAG, "init() called with: context = [" + context + "],isInited=" + isInited + ",thread=" + Thread.currentThread().getName() + ",process=" + curProcessName);
                if (isInited) {
                    LoginTLogAdapter.trace(TAG, "init() already inited,return");
                } else if (!StringUtils.equals("com.taobao.taobao", curProcessName)) {
                } else {
                    if (LOCK.compareAndSet(false, true)) {
                        LoginTLogAdapter.trace(TAG, "init() LOCK=false, enter flow 0");
                        mContext = context;
                        mApplication = (Application) context.getApplicationContext();
                        startInit(context.getApplicationContext(), z);
                        return;
                    }
                    LoginTLogAdapter.trace(TAG, "init() LOCK=true,exit");
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.taobao.login4android.TaoBaoLoginInitializer$2] */
    private static void startInit(final Context context, final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4535cae5", new Object[]{context, new Boolean(z)});
        } else if (isInited) {
        } else {
            isInited = true;
            LoginTLogAdapter.trace(TAG, "startInit() LOCK=false, enter flow 1 ,startInit,");
            com.ali.user.mobile.app.LoginContext.callback = new CommonCallback() { // from class: com.taobao.login4android.TaoBaoLoginInitializer.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.ali.user.mobile.model.CommonCallback
                public void onFail(int i, String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("efca37e9", new Object[]{this, new Integer(i), str});
                    }
                }

                @Override // com.ali.user.mobile.model.CommonCallback
                public void onSuccess() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d0e393ab", new Object[]{this});
                    } else {
                        LoginApiContext.isLoginSDKInited = true;
                    }
                }
            };
            startTime = System.currentTimeMillis();
            if (LoginThreadHelper.isMainThread() || z) {
                new Thread("initLoginSDK") { // from class: com.taobao.login4android.TaoBaoLoginInitializer.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Thread, java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        Log.e(TaoBaoLoginInitializer.TAG, "run: startInit on Thread initLoginSDK,:" + Thread.currentThread().getName() + ",forceNewThread=" + z);
                        TaoBaoLoginInitializer.access$000(context);
                    }
                }.start();
                return;
            }
            Log.e(TAG, "run: startInit on Thread:" + Thread.currentThread().getName());
            doInitSDK(context);
        }
    }

    private static void doInitSDK(final Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dbc8782", new Object[]{context});
            return;
        }
        LoginTLogAdapter.trace("init.login-tag", "doInitSDK: init task real start");
        stepTime1 = System.currentTimeMillis();
        Map<String, String> map = tbTimes;
        map.put("init_start", stepTime1 + "");
        LoginEnvType loginEnvType = LoginEnvType.ONLINE;
        int a2 = EnvironmentSwitcher.a();
        if (a2 == EnvironmentSwitcher.EnvType.PRE.getValue()) {
            loginEnvType = LoginEnvType.PRE;
        } else if (a2 == EnvironmentSwitcher.EnvType.TEST.getValue() || a2 == EnvironmentSwitcher.EnvType.TEST_2.getValue()) {
            loginEnvType = LoginEnvType.DEV;
        }
        TaobaoAppProvider taobaoAppProvider = new TaobaoAppProvider();
        AliUserLogin.setLoginAppreanceExtions(new TaoBaoLoginAppearanceExtensions());
        Login.init(context, TaoApplication.getTTID(), Globals.getVersionName(), loginEnvType, taobaoAppProvider);
        PopJSBridge.register();
        VerifyJsbridge.register();
        try {
            q.a(UccSystemJSBridge.ALU_SYSTEM_JSBRIDGE, (Class<? extends e>) UccJsBridge.class);
            if (q.a("VITaoBaoJSAPIAdapter") == null) {
                LoginTLogAdapter.trace(TAG, "call WindVaneInit.init,register VITaoBaoJSAPIAdapter");
                WindVaneInit.getInstance().init();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        CoordinatorWrapper.executeSafely(new Runnable() { // from class: com.taobao.login4android.TaoBaoLoginInitializer.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    TaoBaoLoginInitializer.access$100(context);
                }
            }
        });
        LoginTLogAdapter.e(TAG, "find new prefech time");
        LoginApprearanceExtensions.AsoLoginFlow.setAsoLoginCallback(new LoginApprearanceExtensions.AsoLoginCallback() { // from class: com.taobao.login4android.TaoBaoLoginInitializer.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.ali.user.mobile.common.api.LoginApprearanceExtensions.AsoLoginCallback
            public void onNeedSwitch(String str, DataCallback<Boolean> dataCallback) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("c8fbca96", new Object[]{this, str, dataCallback});
                    return;
                }
                LoginContext.mDataCallback = dataCallback;
                Intent intent = new Intent(TaoBaoLoginInitializer.mContext, LoginProxyActivity.class);
                intent.putExtra("action", LoginProxyActivity.ACTION_TYPE_ACCOUNT_SWITCH);
                intent.putExtra("message", str);
                intent.addFlags(268435456);
                TaoBaoLoginInitializer.mContext.startActivity(intent);
            }
        });
        MonitorLifecycle.listen(mApplication);
        LoginBroadcastHelper.registerLoginReceiver(mContext, new TBLoginReceiver());
        try {
            OrangeConfig.getInstance().registerListener(new String[]{"login4android"}, new d() { // from class: com.taobao.login4android.TaoBaoLoginInitializer.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.orange.d
                public void onConfigUpdate(String str, Map<String, String> map2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map2});
                        return;
                    }
                    OrangeConfig.getInstance().unregisterListener(new String[]{"login4android"}, this);
                    Log.e(TaoBaoLoginInitializer.TAG, "login onConfigUpdate: for refreshAddressByLaunchV2");
                    if (LoginSwitch.getSwitch("refreshAddressByLaunchV2", "false")) {
                        MainThreadExecutor.postDelayed(new Runnable() { // from class: com.taobao.login4android.TaoBaoLoginInitializer.5.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                } else if (TaoBaoLoginInitializer.mContext == null) {
                                } else {
                                    b.a(TaoBaoLoginInitializer.mContext, "", "", "appLaunch");
                                }
                            }
                        }, 1000L);
                    }
                    boolean z = LoginSwitch.getSwitch("alipay_security_inject_enabled", "true");
                    if (TaoBaoLoginInitializer.mContext == null) {
                        return;
                    }
                    TaoBaoLoginInitializer.mContext.getSharedPreferences("login_alipay_security", 0).edit().putBoolean("alipay_security_inject_enabled", z).apply();
                    SharedPreferencesUtil.saveData(TaoBaoLoginInitializer.mContext, LoginBroadcastHelper.USE_LOCAL_BROADCAST, Boolean.valueOf(LoginSwitch.getSwitch(LoginBroadcastHelper.USE_LOCAL_BROADCAST, "false")));
                }
            }, true);
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        clearPreAppInfo(mContext);
        Map<String, String> map2 = tbTimes;
        map2.put("init_end", System.currentTimeMillis() + "");
    }

    private static void clearPreAppInfo(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a49e1348", new Object[]{context});
        } else if (context == null) {
        } else {
            try {
                com.alibaba.ability.localization.b.a(new b.a() { // from class: com.taobao.login4android.TaoBaoLoginInitializer.6
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.alibaba.ability.localization.b.a
                    public void a(Language language, String str) {
                        Activity activity;
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("246661b", new Object[]{this, language, str});
                            return;
                        }
                        AliUserLogin.clearCacheData(LoginConstant.FILE_NAME);
                        try {
                            if (LoginBarController.sWeakReference == null || (activity = LoginBarController.sWeakReference.get()) == null || activity.isFinishing()) {
                                return;
                            }
                            LoginBarController.removeLoginBar(R.id.tbTabFragment, activity, false);
                            LoginBarController.addLoginBar(R.id.tbTabFragment, activity, null);
                        } catch (Exception e) {
                            LoginTLogAdapter.e(TaoBaoLoginInitializer.TAG, "refresh login bar fail", e);
                        }
                    }
                });
                LocalBroadcastManager.getInstance(context).registerReceiver(new BroadcastReceiver() { // from class: com.taobao.login4android.TaoBaoLoginInitializer.7
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.content.BroadcastReceiver
                    public void onReceive(Context context2, Intent intent) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context2, intent});
                        } else {
                            AliUserLogin.clearCacheData(LoginConstant.FILE_NAME);
                        }
                    }
                }, new IntentFilter("EDITON_SWITCHER_EDITTION_CODE_CHANGED"));
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    private static void initUcc(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e45a86dc", new Object[]{context});
            return;
        }
        Log.e("init.login-tag", "initUcc: start");
        Map<String, String> map = tbTimes;
        map.put("init_ucc_start", System.currentTimeMillis() + "");
        try {
            f.a(context);
            q.a("TBLoginJSBridge", (Class<? extends e>) TBLoginJSBridge.class);
            q.a("aluAuth", (Class<? extends e>) WVIntentModule.class);
            q.a("aluAccount", (Class<? extends e>) WVUserModule.class);
            q.a("aluSSOLoginJSBridge", (Class<? extends e>) AuthBridge.class);
            q.a("ALBBUserTrackJSBridge", (Class<? extends e>) UserTrackBridge.class);
            AccountSecurityJSbridge.register();
            int a2 = EnvironmentSwitcher.a();
            if (a2 == EnvironmentSwitcher.EnvType.PRE.getValue()) {
                RPSDK.initialize(RPSDK.RPSDKEnv.RPSDKEnv_PRE, mContext);
                AliMemberSDK.setEnvironment(Environment.PRE);
            } else {
                if (a2 != EnvironmentSwitcher.EnvType.TEST.getValue() && a2 != EnvironmentSwitcher.EnvType.TEST_2.getValue()) {
                    RPSDK.initialize(RPSDK.RPSDKEnv.RPSDKEnv_ONLINE, mContext);
                    AliMemberSDK.setEnvironment(Environment.ONLINE);
                }
                RPSDK.initialize(RPSDK.RPSDKEnv.RPSDKEnv_DAILY, mContext);
                AliMemberSDK.setEnvironment(Environment.TEST);
            }
            ConfigManager.setAppKeyIndex(0, 2);
            ConfigManager.getInstance().setRegisterSidToMtopDefault(false);
            ConfigManager.getInstance().isMultiProcessEnable = true;
            OrangeConfig.getInstance().registerListener(new String[]{"login4android"}, new d() { // from class: com.taobao.login4android.TaoBaoLoginInitializer.8
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.orange.d
                public void onConfigUpdate(String str, Map<String, String> map2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map2});
                        return;
                    }
                    if (LoginSwitch.getSwitch("close_ucc_multi_process", "false") && TaoBaoLoginInitializer.mContext != null) {
                        ConfigManager.getInstance().isMultiProcessEnable = false;
                    }
                    OrangeConfig.getInstance().unregisterListener(new String[]{"login4android"}, this);
                }
            }, true);
            AliMemberSDK.init(context.getApplicationContext(), "taobao", new InitResultCallback() { // from class: com.taobao.login4android.TaoBaoLoginInitializer.10
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.ali.user.open.core.callback.InitResultCallback
                public void onSuccess() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d0e393ab", new Object[]{this});
                        return;
                    }
                    Map<String, String> map2 = TaoBaoLoginInitializer.tbTimes;
                    map2.put("init_ucc_end", System.currentTimeMillis() + "");
                    TaoBaoLoginInitializer.endTime = System.currentTimeMillis();
                    LoginTLogAdapter.trace("init.login-tag", "initUcc: onSuccess");
                    com.taobao.android.sns4android.d dVar = new com.taobao.android.sns4android.d();
                    dVar.f15262a = SNSPlatform.PLATFORM_ALIPAY;
                    dVar.b = "2021003109674454";
                    c.a(dVar);
                    com.taobao.android.sns4android.d dVar2 = new com.taobao.android.sns4android.d();
                    dVar2.f15262a = SNSPlatform.PLATFORM_ALIPAYHK;
                    c.a(dVar2);
                    UccJsBridge.getInstance().setUccDataProvider();
                    q.a("aluAuthJSBridge", (Class<? extends e>) SNSJsbridge.class);
                }

                @Override // com.ali.user.open.core.callback.FailureCallback
                public void onFailure(int i, String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9a2a071b", new Object[]{this, new Integer(i), str});
                        return;
                    }
                    UserTrackAdapter.sendUT("UccInitFail_" + str);
                }
            });
            MainThreadExecutor.postDelayed(new Runnable() { // from class: com.taobao.login4android.TaoBaoLoginInitializer.9
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        HashMap hashMap = new HashMap(TaoBaoLoginInitializer.tbTimes);
                        hashMap.putAll(com.ali.user.mobile.app.LoginContext.times);
                        UserTrackAdapter.sendUserTrack(UTConstant.PageName.UT_PAGE_EXTEND, "login_sdk_init_time_cost", hashMap);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    try {
                        if (TaoBaoLoginInitializer.endTime == -1) {
                            return;
                        }
                        com.taobao.monitor.adapter.b.a("login_sdk_init_cost", Long.valueOf(TaoBaoLoginInitializer.endTime - TaoBaoLoginInitializer.startTime));
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
            }, 1000L);
        }
    }
}
