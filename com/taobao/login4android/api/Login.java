package com.taobao.login4android.api;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import android.webkit.CookieManager;
import com.ali.user.mobile.app.constant.UTConstant;
import com.ali.user.mobile.base.helper.BroadCastHelper;
import com.ali.user.open.core.AliMemberSDK;
import com.ali.user.open.core.callback.InitResultCallback;
import com.ali.user.open.ucc.UccCallback;
import com.ali.user.open.ucc.UccService;
import com.ali.user.open.ucc.data.DefaultDataProvider;
import com.alibaba.wireless.security.SecExceptionCode;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.artc.api.ArtcStats;
import com.taobao.login4android.api.aidl.ICheckResultCallback;
import com.taobao.login4android.api.aidl.ILogin;
import com.taobao.login4android.api.aidl.ITokenCallback;
import com.taobao.login4android.api.aidl.IUccCallback;
import com.taobao.login4android.broadcast.LoginAction;
import com.taobao.login4android.broadcast.LoginBroadcastHelper;
import com.taobao.login4android.constants.LoginConstants;
import com.taobao.login4android.constants.LoginStatus;
import com.taobao.login4android.constants.LoginUrlConstants;
import com.taobao.login4android.log.LoginTLogAdapter;
import com.taobao.login4android.session.ISession;
import com.taobao.login4android.session.SessionManager;
import com.taobao.login4android.session.constants.SessionConstants;
import com.taobao.login4android.thread.LoginThreadHelper;
import com.taobao.login4android.utils.LoginSwitch;
import com.taobao.monitor.adapter.b;
import com.taobao.tao.Globals;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTHitBuilders;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;
import mtopsdk.mtop.intf.Mtop;
import tb.apt;
import tb.kge;

/* loaded from: classes.dex */
public class Login {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final long COOKIES_REFRESH_INTERVAL = 1800000;
    private static final long COOKIES_REFRESH_SHRINK = 1680000;
    private static final long LOGIN_TIMEOUT = 20000;
    @Deprecated
    public static final int NOTIFY_BINDALIPAYFAILED = 911110;
    @Deprecated
    public static final int NOTIFY_BINDALIPAYSUCCESS = 911109;
    @Deprecated
    public static final int NOTIFY_LOGINBYSECURITY = 911104;
    @Deprecated
    public static final int NOTIFY_LOGINCANCEL = 911103;
    @Deprecated
    public static final int NOTIFY_LOGINFAILED = 911102;
    @Deprecated
    public static final int NOTIFY_LOGINSUCCESS = 911101;
    @Deprecated
    public static final int NOTIFY_SSOLOGIN = 911107;
    @Deprecated
    public static final int NOTIFY_SSOLOGOUT = 911108;
    @Deprecated
    public static final int NOTIFY_USER_LOGIN = 911105;
    @Deprecated
    public static final int NOTIFY_WEEDOUT = 911106;
    private static final int OPEN_MULTI_ACCOUNT_PAGE = 102;
    private static final String REFRESH_RESULT = "refreshResult";
    private static final int SHOW_LOGOUT_PANEL = 101;
    public static final String TAG = "api.Login";
    private static final int UCC_BIND = 2;
    private static final int UCC_TRUST_LOGIN = 1;
    private static final int UCC_UNBIND = 3;
    @Deprecated
    private static Handler currentHandler;
    @Deprecated
    private static ConcurrentHashMap<String, WeakReference<Handler>> handlerPool;
    public static Bundle launchBundle;
    private static LoginServiceTask loginTask;
    public static Context mContext;
    private static Object mLock;
    private static transient Pattern[] mLoginPatterns;
    private static transient Pattern[] mLogoutPatterns;
    private static BroadcastReceiver mReceiver;
    @Deprecated
    private static Handler oAuthHandler;
    private static Handler sHandler;
    private static String sProcessName;
    private static ISession session;

    public static /* synthetic */ void access$000() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcd60777", new Object[0]);
        } else {
            checkReceiver();
        }
    }

    public static /* synthetic */ LoginServiceTask access$100() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LoginServiceTask) ipChange.ipc$dispatch("7c04cc45", new Object[0]) : loginTask;
    }

    public static /* synthetic */ void access$200(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adadf3fb", new Object[]{new Boolean(z)});
        } else {
            notifyRefreshResult(z);
        }
    }

    static {
        kge.a(167860566);
        mLock = new Object();
        sProcessName = "";
        sHandler = new Handler(Looper.getMainLooper());
        handlerPool = new ConcurrentHashMap<>();
    }

    public static void setLaunchBundle(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b825776", new Object[]{bundle});
            return;
        }
        launchBundle = bundle;
        sendUT("LoginAPI_setLaunchBundle");
    }

    public static synchronized void init(Context context) {
        synchronized (Login.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("609fd211", new Object[]{context});
                return;
            }
            mContext = context.getApplicationContext();
            if (session == null) {
                session = SessionManager.getInstance(mContext);
            }
            sendUT("LoginAPI_init", false);
        }
    }

    public static synchronized void sessionInitCheck(Context context) {
        synchronized (Login.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8e1fe07f", new Object[]{context});
            } else if (session == null) {
                init(context);
                sendUT("LoginAPI_sessionInitCheck", false);
            } else {
                sendUT("LoginAPI_sessionInitCheckNoNeed", false);
            }
        }
    }

    private static void checkReceiver() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ec4cc1e", new Object[0]);
        } else if (mReceiver != null) {
        } else {
            mReceiver = new LoginBroadcastReceiver();
            LoginBroadcastHelper.registerLoginReceiver(mContext, mReceiver);
        }
    }

    public static void login(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95000964", new Object[]{new Boolean(z)});
        } else {
            login(z, (Bundle) null);
        }
    }

    public static void login(final boolean z, final Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16e478f0", new Object[]{new Boolean(z), bundle});
            return;
        }
        if (LoginSwitch.getSwitch("checkSessionInitWhenLogin", "true") && session == null) {
            sendUT("sessionNullWhenLogin", true);
            try {
                session = SessionManager.getInstance(Globals.getApplication());
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        try {
            String stackTraceString = Log.getStackTraceString(new Throwable());
            LoginStatus.dumpTrace = stackTraceString;
            LoginTLogAdapter.e(TAG, "start login: showUI:" + z + ",trace:" + stackTraceString);
            if (bundle != null) {
                LoginTLogAdapter.e(TAG, "start login: extraData=" + bundle + ",apiReferer=" + bundle.getString("apiReferer"));
                LoginStatus.browserRefUrl = bundle.getString(LoginConstants.BROWSER_REF_URL);
                LoginStatus.mtopApiReferer = bundle.getString("apiReferer");
            } else {
                LoginStatus.browserRefUrl = "";
                LoginStatus.mtopApiReferer = "";
            }
            if (StringUtils.isEmpty(sProcessName)) {
                sProcessName = LoginThreadHelper.getCurProcessName(mContext);
            }
            if (bundle == null) {
                bundle = new Bundle();
            }
            Properties properties = new Properties();
            properties.put("showLoginUI", Boolean.valueOf(z));
            properties.put("processName", sProcessName);
            if (!bundle.isEmpty()) {
                for (String str : bundle.keySet()) {
                    properties.put(str, bundle.get(str));
                }
            }
            sendUT("LoginAPI_Login", properties, true);
            bundle.putString("process_name", sProcessName);
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        if (LoginSwitch.getSwitch("checkInitAll", "true")) {
            if (!checkInit()) {
                notifyLoginFailedOnServiceTimeout();
                triggerLoginBundle();
                return;
            }
        } else if (bundle != null && !z && bundle.containsKey("apiReferer") && !checkInit()) {
            notifyLoginFailedOnServiceTimeout();
            triggerLoginBundle();
            return;
        }
        if (!LoginStatus.compareAndSetLogining(false, true)) {
            LoginTLogAdapter.e(TAG, "login: return because is logining right now. isLogining=true, userLogin=" + LoginStatus.isUserLogin() + ", lastLoginTime=" + LoginStatus.getLastLoginTime());
            if (!z) {
                return;
            }
            if (System.currentTimeMillis() - LoginStatus.getLastLoginTime() < 20000 && !LoginStatus.isUserLogin()) {
                return;
            }
            LoginServiceTask loginServiceTask = loginTask;
            if (loginServiceTask != null && !loginServiceTask.isCancelled() && loginTask.getStatus() != AsyncTask.Status.FINISHED) {
                try {
                    loginTask.cancel(true);
                } catch (Throwable th3) {
                    th3.printStackTrace();
                }
            }
            loginTask = new LoginServiceTask<Void, Void, Void>() { // from class: com.taobao.login4android.api.Login.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.login4android.api.LoginServiceTask
                /* renamed from: excuteTask  reason: avoid collision after fix types in other method */
                public Void mo1127excuteTask(ILogin iLogin) throws RemoteException {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (Void) ipChange2.ipc$dispatch("2b4e7058", new Object[]{this, iLogin});
                    }
                    Login.access$000();
                    iLogin.userLogin();
                    LoginTLogAdapter.e(LoginServiceTask.TAG, "loginWithBundle finish");
                    Login.sendUT("OPEN_LOGIN_PAGE_WHEN_TIMEOUT");
                    return null;
                }
            };
            Coordinator.execute(new Runnable() { // from class: com.taobao.login4android.api.Login.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        Login.access$100().run();
                    }
                }
            });
            return;
        }
        loginTask = new LoginServiceTask<Void, Void, Void>() { // from class: com.taobao.login4android.api.Login.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.login4android.api.LoginServiceTask
            /* renamed from: excuteTask  reason: collision with other method in class */
            public Void mo1127excuteTask(ILogin iLogin) throws RemoteException {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (Void) ipChange2.ipc$dispatch("2b4e7058", new Object[]{this, iLogin});
                }
                LoginTLogAdapter.e(LoginServiceTask.TAG, "run: LoginServiceTask 2 loginWithBundle");
                Login.access$000();
                iLogin.loginWithBundle(z, bundle);
                LoginTLogAdapter.e(LoginServiceTask.TAG, "loginWithBundle finish");
                return null;
            }
        };
        Coordinator.execute(new Runnable() { // from class: com.taobao.login4android.api.Login.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    Login.access$100().run();
                }
            }
        });
    }

    public static synchronized boolean checkInit() {
        synchronized (Login.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("9fdaa2c3", new Object[0])).booleanValue();
            }
            return LoginApiContext.isLoginSDKInited && isMainProcess();
        }
    }

    public static void preInit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f8aa55a", new Object[0]);
        } else if (checkInit()) {
        } else {
            LoginTLogAdapter.e(TAG, "preInitWithCallback: start init");
            triggerLoginBundle();
            b.a("login_sdk_init_by_splash", "true");
        }
    }

    public static void triggerLoginBundle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c4d3b7a", new Object[0]);
            return;
        }
        sendUT("LoginAPI_triggerLoginBundle");
        final LoginServiceTask<Void, Void, Void> loginServiceTask = new LoginServiceTask<Void, Void, Void>() { // from class: com.taobao.login4android.api.Login.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.login4android.api.LoginServiceTask
            /* renamed from: excuteTask  reason: collision with other method in class */
            public Void mo1127excuteTask(ILogin iLogin) throws RemoteException {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (Void) ipChange2.ipc$dispatch("2b4e7058", new Object[]{this, iLogin});
                }
                iLogin.triggerLoginBundle();
                return null;
            }
        };
        Coordinator.execute(new Runnable() { // from class: com.taobao.login4android.api.Login.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    LoginServiceTask.this.run();
                }
            }
        });
    }

    public static void bindAlipay(final String str, final String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7383a802", new Object[]{str, str2});
            return;
        }
        Properties properties = new Properties();
        properties.setProperty("scene", str);
        sendUT("LoginAPI_BindAlipay", properties, true);
        final LoginServiceTask<Void, Void, Void> loginServiceTask = new LoginServiceTask<Void, Void, Void>() { // from class: com.taobao.login4android.api.Login.7
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.login4android.api.LoginServiceTask
            /* renamed from: excuteTask  reason: collision with other method in class */
            public Void mo1127excuteTask(ILogin iLogin) throws RemoteException {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (Void) ipChange2.ipc$dispatch("2b4e7058", new Object[]{this, iLogin});
                }
                Login.access$000();
                iLogin.bindAlipay(str, str2);
                return null;
            }
        };
        Coordinator.execute(new Runnable() { // from class: com.taobao.login4android.api.Login.8
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    LoginServiceTask.this.run();
                }
            }
        });
    }

    @Deprecated
    public static void initInjectVst() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87c1885d", new Object[0]);
            return;
        }
        sendUT("LoginAPI_initInjectVst");
        final LoginServiceTask<Void, Void, Void> loginServiceTask = new LoginServiceTask<Void, Void, Void>() { // from class: com.taobao.login4android.api.Login.9
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.login4android.api.LoginServiceTask
            /* renamed from: excuteTask  reason: collision with other method in class */
            public Void mo1127excuteTask(ILogin iLogin) throws RemoteException {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (Void) ipChange2.ipc$dispatch("2b4e7058", new Object[]{this, iLogin});
                }
                iLogin.initInjectVst();
                return null;
            }
        };
        Coordinator.execute(new Runnable() { // from class: com.taobao.login4android.api.Login.10
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    LoginServiceTask.this.run();
                }
            }
        });
    }

    public static void logout(final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64458fe3", new Object[]{new Boolean(z)});
            return;
        }
        sendUT("LoginAPI_Logout");
        final LoginServiceTask<Void, Void, Void> loginServiceTask = new LoginServiceTask<Void, Void, Void>() { // from class: com.taobao.login4android.api.Login.11
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.login4android.api.LoginServiceTask
            /* renamed from: excuteTask  reason: avoid collision after fix types in other method */
            public Void mo1127excuteTask(ILogin iLogin) throws RemoteException {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (Void) ipChange2.ipc$dispatch("2b4e7058", new Object[]{this, iLogin});
                }
                Login.access$000();
                iLogin.logout(z);
                return null;
            }
        };
        Coordinator.execute(new Runnable() { // from class: com.taobao.login4android.api.Login.12
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    LoginServiceTask.this.run();
                }
            }
        });
    }

    public static void alipayAuth(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2abf4823", new Object[]{str});
            return;
        }
        sendUT("LoginAPI_alipayAuth");
        final LoginServiceTask<Void, Void, Void> loginServiceTask = new LoginServiceTask<Void, Void, Void>() { // from class: com.taobao.login4android.api.Login.13
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.login4android.api.LoginServiceTask
            /* renamed from: excuteTask  reason: avoid collision after fix types in other method */
            public Void mo1127excuteTask(ILogin iLogin) throws RemoteException {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (Void) ipChange2.ipc$dispatch("2b4e7058", new Object[]{this, iLogin});
                }
                Login.access$000();
                iLogin.alipayAuth(str);
                return null;
            }
        };
        Coordinator.execute(new Runnable() { // from class: com.taobao.login4android.api.Login.14
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    LoginServiceTask.this.run();
                }
            }
        });
    }

    @Deprecated
    public static void loginByKey(final String str, final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94f5c713", new Object[]{str, new Integer(i)});
            return;
        }
        Properties properties = new Properties();
        properties.setProperty("type", i + "");
        sendUT("LoginAPI_LoginByKey", properties, true);
        loginTask = new LoginServiceTask<Void, Void, Void>() { // from class: com.taobao.login4android.api.Login.15
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.login4android.api.LoginServiceTask
            /* renamed from: excuteTask  reason: avoid collision after fix types in other method */
            public Void mo1127excuteTask(ILogin iLogin) throws RemoteException {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (Void) ipChange2.ipc$dispatch("2b4e7058", new Object[]{this, iLogin});
                }
                Login.access$000();
                iLogin.loginByKey(str, i);
                return null;
            }
        };
        Coordinator.execute(new Runnable() { // from class: com.taobao.login4android.api.Login.16
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    Login.access$100().run();
                }
            }
        });
    }

    public static void navByScene(Context context, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ddb1e99", new Object[]{context, str});
            return;
        }
        Properties properties = new Properties();
        if (!StringUtils.isEmpty(str)) {
            properties.setProperty("scene", str);
        }
        sendUT("LoginAPI_NavByScene");
        final LoginServiceTask<Void, Void, Void> loginServiceTask = new LoginServiceTask<Void, Void, Void>() { // from class: com.taobao.login4android.api.Login.17
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.login4android.api.LoginServiceTask
            /* renamed from: excuteTask  reason: avoid collision after fix types in other method */
            public Void mo1127excuteTask(ILogin iLogin) throws RemoteException {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (Void) ipChange2.ipc$dispatch("2b4e7058", new Object[]{this, iLogin});
                }
                Login.access$000();
                iLogin.navByScene(str);
                return null;
            }
        };
        Coordinator.execute(new Runnable() { // from class: com.taobao.login4android.api.Login.18
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    LoginServiceTask.this.run();
                }
            }
        });
    }

    public static void refreshCookies() {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f0535bb", new Object[0]);
            return;
        }
        sendUT("LoginAPI_RefreshCookies");
        if (!checkSessionValid()) {
            notifyRefreshResult(false);
            return;
        }
        synchronized (mLock) {
            if (System.currentTimeMillis() - LoginStatus.getLastRefreshCookieTime() > 1800000) {
                z = true;
                LoginStatus.setLastRefreshCookieTime(System.currentTimeMillis());
            } else {
                z = false;
            }
        }
        if (z) {
            final LoginServiceTask<Void, Void, Boolean> loginServiceTask = new LoginServiceTask<Void, Void, Boolean>() { // from class: com.taobao.login4android.api.Login.19
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.taobao.login4android.api.LoginServiceTask
                /* renamed from: excuteTask */
                public Boolean mo1127excuteTask(ILogin iLogin) throws RemoteException {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (Boolean) ipChange2.ipc$dispatch("8a2e7042", new Object[]{this, iLogin});
                    }
                    Login.access$000();
                    return Boolean.valueOf(iLogin.refreshCookies());
                }

                @Override // android.os.AsyncTask
                public void onPostExecute(Boolean bool) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b98eb50", new Object[]{this, bool});
                        return;
                    }
                    if (bool == null) {
                        bool = Boolean.FALSE;
                    }
                    if (!bool.booleanValue()) {
                        LoginStatus.setLastRefreshCookieTime(System.currentTimeMillis() - Login.COOKIES_REFRESH_SHRINK);
                    }
                    Login.access$200(bool.booleanValue());
                }
            };
            Coordinator.execute(new Runnable() { // from class: com.taobao.login4android.api.Login.20
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        LoginServiceTask.this.run();
                    }
                }
            });
            return;
        }
        notifyRefreshResult(false);
    }

    private static void notifyRefreshResult(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6331427e", new Object[]{new Boolean(z)});
            return;
        }
        try {
            sendUT("notifyRefreshResult");
            Intent intent = new Intent(LoginAction.NOTIFY_REFRESH_COOKIES.name());
            intent.putExtra(REFRESH_RESULT, z);
            BroadCastHelper.doSendBroadcast(intent);
            LoginTLogAdapter.e(TAG, "sendBroadcast:" + LoginAction.NOTIFY_REFRESH_COOKIES.name());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void notifyLoginFailedOnServiceTimeout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e664a14f", new Object[0]);
        } else if (mContext == null) {
        } else {
            Intent intent = new Intent(LoginAction.NOTIFY_LOGIN_FAILED.name());
            intent.putExtra("errorCode", SecExceptionCode.SEC_ERROR_STA_KEY_ENC_UNKNOWN_ERROR);
            BroadCastHelper.doSendBroadcast(intent);
            LoginTLogAdapter.e(TAG, " notifyLoginFailedOnServiceTimeout sendBroadcast:" + LoginAction.NOTIFY_LOGIN_FAILED.name());
        }
    }

    public static boolean checkSessionValid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("edaaf5b9", new Object[0])).booleanValue();
        }
        checkSessionInit();
        ISession iSession = session;
        if (iSession != null) {
            boolean checkSessionValid = iSession.checkSessionValid();
            LoginTLogAdapter.e(TAG, " checkSessionValid sessionValid=:" + checkSessionValid + ",sProcessName=" + sProcessName);
            if (checkSessionValid && isMainProcess()) {
                try {
                    if (mContext != null) {
                        Mtop.instance(Mtop.Id.INNER, mContext).registerSessionInfo(getSid(), getUserId());
                        LoginTLogAdapter.e(TAG, "registerSessionInfo:" + getSid());
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            } else {
                LoginTLogAdapter.e(TAG, "checkSessionValid false: sid=" + getSid() + "  ;userid is empty?=" + StringUtils.isEmpty(getUserId()));
            }
            return checkSessionValid;
        }
        sendUT("sessionNull", false);
        return false;
    }

    private static void checkSessionInit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c726f425", new Object[0]);
        } else if (!LoginSwitch.getSwitch("checkSessionInit", "false") || session != null) {
        } else {
            try {
                session = SessionManager.getInstance(Globals.getApplication());
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public static String getSid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("169fb061", new Object[0]);
        }
        ISession iSession = session;
        return iSession != null ? iSession.getSid() : "";
    }

    public static String getExtJson() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1db89666", new Object[0]);
        }
        ISession iSession = session;
        return iSession != null ? iSession.getExtJson() : "";
    }

    public static String getOldSid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("31a81efc", new Object[0]);
        }
        ISession iSession = session;
        return iSession != null ? iSession.getOldSid() : "";
    }

    public static String getNick() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9d48c0c0", new Object[0]);
        }
        ISession iSession = session;
        return iSession != null ? iSession.getNick() : "";
    }

    public static String getOldNick() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e34e2585", new Object[0]);
        }
        ISession iSession = session;
        return iSession != null ? iSession.getOldNick() : "";
    }

    public static String getEcode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("42b43e5d", new Object[0]);
        }
        ISession iSession = session;
        return iSession != null ? iSession.getEcode() : "";
    }

    @Deprecated
    public static String getUserName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d328f00d", new Object[0]);
        }
        ISession iSession = session;
        return iSession != null ? iSession.getUserName() : "";
    }

    public static String getUserId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("58ad3b3d", new Object[0]);
        }
        ISession iSession = session;
        return iSession != null ? iSession.getUserId() : "";
    }

    public static String getOldUserId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("32ec82c2", new Object[0]);
        }
        ISession iSession = session;
        return iSession != null ? iSession.getOldUserId() : "";
    }

    public static String getOldEncryptedUserId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bebdeaa0", new Object[0]);
        }
        ISession iSession = session;
        return iSession != null ? iSession.getOldEncryptedUserId() : "";
    }

    public static String getHeadPicLink() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5ea1ca4b", new Object[0]);
        }
        ISession iSession = session;
        return iSession != null ? iSession.getHeadPicLink() : "";
    }

    public static String getLoginToken() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("84ac42b3", new Object[0]);
        }
        ISession iSession = session;
        return iSession != null ? iSession.getLoginToken() : "";
    }

    public static String getEncryptLoginToken(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9968efe", new Object[]{context}) : context == null ? "" : context.getSharedPreferences("userinfo", 0).getString(SessionConstants.AUTO_LOGIN_STR, "");
    }

    public static String getSsoToken() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d1ac5859", new Object[0]);
        }
        ISession iSession = session;
        return iSession != null ? iSession.getSsoToken() : "";
    }

    public static boolean getCommentUsed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fbf9f11", new Object[0])).booleanValue();
        }
        ISession iSession = session;
        if (iSession == null) {
            return true;
        }
        return iSession.isCommentTokenUsed();
    }

    public static void setCommentUsed(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c318a73", new Object[]{new Boolean(z)});
            return;
        }
        ISession iSession = session;
        if (iSession == null) {
            return;
        }
        iSession.setCommentTokenUsed(z);
    }

    public static String getHavanaSsoToken() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fd720e02", new Object[0]);
        }
        ISession iSession = session;
        return iSession != null ? iSession.getOneTimeToken() : "";
    }

    @Deprecated
    public static void clearHistoryNames() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5225a08", new Object[0]);
            return;
        }
        sendUT("LoginAPI_clearHistoryNames");
        final LoginServiceTask<Void, Void, Void> loginServiceTask = new LoginServiceTask<Void, Void, Void>() { // from class: com.taobao.login4android.api.Login.21
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.login4android.api.LoginServiceTask
            /* renamed from: excuteTask  reason: collision with other method in class */
            public Void mo1127excuteTask(ILogin iLogin) throws RemoteException {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (Void) ipChange2.ipc$dispatch("2b4e7058", new Object[]{this, iLogin});
                }
                Login.access$000();
                iLogin.clearHistoryNames();
                return null;
            }
        };
        Coordinator.execute(new Runnable() { // from class: com.taobao.login4android.api.Login.22
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    LoginServiceTask.this.run();
                }
            }
        });
    }

    public static void applyToken(final ITokenCallback iTokenCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a08c0e0", new Object[]{iTokenCallback});
            return;
        }
        sendUT("LoginAPI_ApplyToken");
        final LoginServiceTask<Void, Void, Void> loginServiceTask = new LoginServiceTask<Void, Void, Void>() { // from class: com.taobao.login4android.api.Login.23
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.login4android.api.LoginServiceTask
            /* renamed from: excuteTask  reason: collision with other method in class */
            public Void mo1127excuteTask(ILogin iLogin) throws RemoteException {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (Void) ipChange2.ipc$dispatch("2b4e7058", new Object[]{this, iLogin});
                }
                iLogin.applyToken(ITokenCallback.this);
                return null;
            }
        };
        Coordinator.execute(new Runnable() { // from class: com.taobao.login4android.api.Login.24
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    LoginServiceTask.this.run();
                }
            }
        });
    }

    public static void checkNickModifiable(final ICheckResultCallback iCheckResultCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af0e2658", new Object[]{iCheckResultCallback});
            return;
        }
        sendUT("LoginAPI_checkNickModifiable");
        final LoginServiceTask<Void, Void, Void> loginServiceTask = new LoginServiceTask<Void, Void, Void>() { // from class: com.taobao.login4android.api.Login.25
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.login4android.api.LoginServiceTask
            /* renamed from: excuteTask  reason: collision with other method in class */
            public Void mo1127excuteTask(ILogin iLogin) throws RemoteException {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (Void) ipChange2.ipc$dispatch("2b4e7058", new Object[]{this, iLogin});
                }
                iLogin.checkNickModifiable(ICheckResultCallback.this);
                return null;
            }
        };
        Coordinator.execute(new Runnable() { // from class: com.taobao.login4android.api.Login.26
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    LoginServiceTask.this.run();
                }
            }
        });
    }

    public static void checkMultiAccountPageEnable(final ICheckResultCallback iCheckResultCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("434123d7", new Object[]{iCheckResultCallback});
            return;
        }
        sendUT("LoginAPI_checkMultiAccountPageEnable");
        final LoginServiceTask<Void, Void, Void> loginServiceTask = new LoginServiceTask<Void, Void, Void>() { // from class: com.taobao.login4android.api.Login.27
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.login4android.api.LoginServiceTask
            /* renamed from: excuteTask  reason: collision with other method in class */
            public Void mo1127excuteTask(ILogin iLogin) throws RemoteException {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (Void) ipChange2.ipc$dispatch("2b4e7058", new Object[]{this, iLogin});
                }
                iLogin.checkMultiAccountPageEnable(ICheckResultCallback.this);
                return null;
            }
        };
        Coordinator.execute(new Runnable() { // from class: com.taobao.login4android.api.Login.28
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    LoginServiceTask.this.run();
                }
            }
        });
    }

    public static void checkLogoutPanelEnable(final ICheckResultCallback iCheckResultCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f431a5fe", new Object[]{iCheckResultCallback});
            return;
        }
        sendUT("LoginAPI_checkLogoutPanelEnable");
        final LoginServiceTask<Void, Void, Void> loginServiceTask = new LoginServiceTask<Void, Void, Void>() { // from class: com.taobao.login4android.api.Login.29
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.login4android.api.LoginServiceTask
            /* renamed from: excuteTask  reason: collision with other method in class */
            public Void mo1127excuteTask(ILogin iLogin) throws RemoteException {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (Void) ipChange2.ipc$dispatch("2b4e7058", new Object[]{this, iLogin});
                }
                iLogin.checkLogoutPanelEnable(ICheckResultCallback.this);
                return null;
            }
        };
        Coordinator.execute(new Runnable() { // from class: com.taobao.login4android.api.Login.30
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    LoginServiceTask.this.run();
                }
            }
        });
    }

    public static void openMultiAccountPage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70673d4", new Object[0]);
            return;
        }
        sendUT("LoginAPI_openMultiAccountPage");
        remoteMethodCall(102);
    }

    public static void showLogoutPanel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d91f7564", new Object[0]);
            return;
        }
        sendUT("LoginAPI_checkNickModifiable");
        remoteMethodCall(101);
    }

    private static void remoteMethodCall(final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e06ef6b7", new Object[]{new Integer(i)});
            return;
        }
        sendUT("LoginAPI_remoteMethodCall");
        final LoginServiceTask<Void, Void, Void> loginServiceTask = new LoginServiceTask<Void, Void, Void>() { // from class: com.taobao.login4android.api.Login.31
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.login4android.api.LoginServiceTask
            /* renamed from: excuteTask  reason: collision with other method in class */
            public Void mo1127excuteTask(ILogin iLogin) throws RemoteException {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (Void) ipChange2.ipc$dispatch("2b4e7058", new Object[]{this, iLogin});
                }
                int i2 = i;
                if (i2 == 101) {
                    iLogin.showLogoutPanel();
                    return null;
                } else if (i2 != 102) {
                    return null;
                } else {
                    iLogin.openMultiAccountPage();
                    return null;
                }
            }
        };
        Coordinator.execute(new Runnable() { // from class: com.taobao.login4android.api.Login.32
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    LoginServiceTask.this.run();
                }
            }
        });
    }

    public static void uccTrustLogin(String str, Map<String, String> map, IUccCallback iUccCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2a30c40", new Object[]{str, map, iUccCallback});
        } else {
            uccMethod(1, str, map, iUccCallback);
        }
    }

    public static void uccBind(String str, Map<String, String> map, IUccCallback iUccCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecd383b4", new Object[]{str, map, iUccCallback});
        } else {
            uccMethod(2, str, map, iUccCallback);
        }
    }

    public static void uccUnbind(String str, IUccCallback iUccCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ca3cfae", new Object[]{str, iUccCallback});
        } else {
            uccMethod(3, str, null, iUccCallback);
        }
    }

    private static void uccMethod(final int i, final String str, final Map<String, String> map, final IUccCallback iUccCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf347c07", new Object[]{new Integer(i), str, map, iUccCallback});
            return;
        }
        sendUT("LoginAPI_uccMethod");
        if (LoginSwitch.getSwitch("newUccInterface", "true")) {
            try {
                AliMemberSDK.init(mContext, new InitResultCallback() { // from class: com.taobao.login4android.api.Login.33
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.ali.user.open.core.callback.FailureCallback
                    public void onFailure(int i2, String str2) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("9a2a071b", new Object[]{this, new Integer(i2), str2});
                        }
                    }

                    @Override // com.ali.user.open.core.callback.InitResultCallback
                    public void onSuccess() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("d0e393ab", new Object[]{this});
                            return;
                        }
                        if (((UccService) AliMemberSDK.getService(UccService.class)).getUccDataProvider() == null) {
                            ((UccService) AliMemberSDK.getService(UccService.class)).setUccDataProvider(new DefaultDataProvider());
                        }
                        UccCallback uccCallback = new UccCallback() { // from class: com.taobao.login4android.api.Login.33.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // com.ali.user.open.ucc.UccCallback
                            public void onSuccess(String str2, Map map2) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("b5e17230", new Object[]{this, str2, map2});
                                } else if (IUccCallback.this == null) {
                                } else {
                                    try {
                                        IUccCallback.this.onSuccess(str2, map2);
                                    } catch (Throwable th) {
                                        th.printStackTrace();
                                    }
                                }
                            }

                            @Override // com.ali.user.open.ucc.UccCallback
                            public void onFail(String str2, int i2, String str3) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("b9656df", new Object[]{this, str2, new Integer(i2), str3});
                                } else if (IUccCallback.this == null) {
                                } else {
                                    try {
                                        IUccCallback.this.onFail(str2, i2, str3);
                                    } catch (Throwable th) {
                                        th.printStackTrace();
                                    }
                                }
                            }
                        };
                        int i2 = i;
                        if (i2 == 1) {
                            ((UccService) AliMemberSDK.getService(UccService.class)).trustLogin(str, map, uccCallback);
                        } else if (i2 == 2) {
                            ((UccService) AliMemberSDK.getService(UccService.class)).bind(str, map, uccCallback);
                        } else if (i2 != 3) {
                        } else {
                            ((UccService) AliMemberSDK.getService(UccService.class)).unbind(str, uccCallback);
                        }
                    }
                });
                return;
            } catch (Throwable th) {
                th.printStackTrace();
                return;
            }
        }
        final LoginServiceTask<Void, Void, Void> loginServiceTask = new LoginServiceTask<Void, Void, Void>() { // from class: com.taobao.login4android.api.Login.34
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.login4android.api.LoginServiceTask
            /* renamed from: excuteTask  reason: collision with other method in class */
            public Void mo1127excuteTask(ILogin iLogin) throws RemoteException {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (Void) ipChange2.ipc$dispatch("2b4e7058", new Object[]{this, iLogin});
                }
                int i2 = i;
                if (i2 == 1) {
                    iLogin.uccTrustLogin(str, map, iUccCallback);
                    return null;
                } else if (i2 == 2) {
                    iLogin.uccBind(str, map, iUccCallback);
                    return null;
                } else if (i2 != 3) {
                    return null;
                } else {
                    iLogin.uccUnbind(str, iUccCallback);
                    return null;
                }
            }
        };
        Coordinator.execute(new Runnable() { // from class: com.taobao.login4android.api.Login.35
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    LoginServiceTask.this.run();
                }
            }
        });
    }

    private static boolean isLoginUrlInner(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ca65fbc5", new Object[]{str, str2})).booleanValue();
        }
        if (StringUtils.isEmpty(str2)) {
            return false;
        }
        if (mLoginPatterns == null && !StringUtils.isEmpty(str)) {
            String[] split = str.split("[;]");
            mLoginPatterns = new Pattern[split.length];
            int length = mLoginPatterns.length;
            for (int i = 0; i < length; i++) {
                mLoginPatterns[i] = Pattern.compile(split[i]);
            }
        }
        for (Pattern pattern : mLoginPatterns) {
            if (pattern.matcher(str2).matches()) {
                return true;
            }
        }
        return false;
    }

    public static boolean isLoginUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cf81cf25", new Object[]{str})).booleanValue();
        }
        try {
            return isLoginUrlInner(LoginUrlConstants.getLoginUrls(), str);
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean isLoginUrl(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1c07d2af", new Object[]{str, str2})).booleanValue();
        }
        try {
            return isLoginUrlInner(str, str2);
        } catch (Throwable unused) {
            return false;
        }
    }

    private static boolean isLogoutUrlInner(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2ec7c1f0", new Object[]{str})).booleanValue();
        }
        if (StringUtils.isEmpty(str)) {
            return false;
        }
        if (mLogoutPatterns == null && !StringUtils.isEmpty(LoginUrlConstants.getLogoutUrls())) {
            String[] split = LoginUrlConstants.getLogoutUrls().split("[;]");
            mLogoutPatterns = new Pattern[split.length];
            int length = mLogoutPatterns.length;
            for (int i = 0; i < length; i++) {
                mLogoutPatterns[i] = Pattern.compile(split[i]);
            }
        }
        for (Pattern pattern : mLogoutPatterns) {
            if (pattern.matcher(str).matches()) {
                return true;
            }
        }
        return false;
    }

    public static boolean isLogoutUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9df331d0", new Object[]{str})).booleanValue();
        }
        try {
            return isLogoutUrlInner(str);
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean isMainProcess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("97b74977", new Object[0])).booleanValue();
        }
        if (StringUtils.isEmpty(sProcessName)) {
            sProcessName = LoginThreadHelper.getCurProcessName(mContext);
        }
        return StringUtils.equals(sProcessName, "com.taobao.taobao");
    }

    public static void sendUT(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14c7ab78", new Object[]{str});
        } else {
            sendUT(str, null, true);
        }
    }

    public static void sendUT(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("842e765c", new Object[]{str, new Boolean(z)});
        } else {
            sendUT(str, null, z);
        }
    }

    public static void sendUT(String str, Properties properties, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c83f14e0", new Object[]{str, properties, new Boolean(z)});
        } else {
            sendUT(str, properties, 0, z);
        }
    }

    public static void sendUT(final String str, final Properties properties, final int i, final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f9c7fa5", new Object[]{str, properties, new Integer(i), new Boolean(z)});
            return;
        }
        try {
            boolean isMainProcess = isMainProcess();
            if (properties == null) {
                properties = new Properties();
            }
            if (i == 0) {
                properties.put(ArtcStats.STAT_RETRYCOUNT, Integer.valueOf(i));
                properties.put("processName", sProcessName);
                properties.put("time1", Long.valueOf(System.currentTimeMillis()));
                properties.setProperty(UTHitBuilders.a.FIELD_ARG2, isMainProcess ? "1" : "0");
                if (!isMainProcess || LoginSwitch.getSwitch("reportTrace", "true")) {
                    properties.setProperty(UTHitBuilders.a.FIELD_ARG3, Log.getStackTraceString(new Throwable()));
                }
            }
            boolean isInit = UTAnalytics.getInstance().isInit();
            if (z) {
                LoginTLogAdapter.e(TAG, "sendUT lable:" + str + " mainProcess:" + isMainProcess + " processName:" + sProcessName + " retryCount:" + i + " utInit：" + isInit + "  dump:" + Log.getStackTraceString(new Throwable()));
            } else {
                LoginTLogAdapter.e(TAG, "sendUT label:" + str + " mainProcess:" + isMainProcess + " processName:" + sProcessName + " retryCount:" + i + " utInit：" + isInit);
            }
            if (!isInit) {
                if (Build.VERSION.SDK_INT < 23) {
                    return;
                }
                sHandler.postDelayed(new Runnable() { // from class: com.taobao.login4android.api.Login.36
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            Login.sendUT(str, properties, i + 1, z);
                        }
                    }
                }, 2000L);
                return;
            }
            UTHitBuilders.UTCustomHitBuilder uTCustomHitBuilder = new UTHitBuilders.UTCustomHitBuilder(str);
            uTCustomHitBuilder.setEventPage(UTConstant.PageName.UT_PAGE_EXTEND);
            uTCustomHitBuilder.setProperties(apt.a(properties));
            UTAnalytics.getInstance().getDefaultTracker().send(uTCustomHitBuilder.build());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static boolean checkLoginCookieValid() {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d6206b02", new Object[0])).booleanValue();
        }
        try {
            if (checkSessionValid()) {
                CookieManager cookieManager = CookieManager.getInstance();
                cookieManager.setAcceptCookie(true);
                boolean z = false;
                boolean z2 = false;
                for (String str : cookieManager.getCookie("https://.taobao.com").split(";")) {
                    if (!StringUtils.isEmpty(str) && str.trim().startsWith("unb") && !str.trim().endsWith("=")) {
                        z2 = true;
                    } else if (!StringUtils.isEmpty(str) && str.trim().startsWith("cookie2") && !str.trim().endsWith("=")) {
                        z = true;
                    }
                }
                if (z && z2) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    @Deprecated
    public static void login(Handler handler, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("278e9834", new Object[]{handler, new Boolean(z)});
        } else {
            login(handler, z, null);
        }
    }

    @Deprecated
    public static void login(Handler handler, boolean z, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25fd5820", new Object[]{handler, new Boolean(z), bundle});
            return;
        }
        addLoadedListener(handler);
        login(z, bundle);
    }

    @Deprecated
    public static void bindAlipay(String str, String str2, Handler handler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97140232", new Object[]{str, str2, handler});
            return;
        }
        addLoadedListener(handler);
        bindAlipay(str, str2);
    }

    @Deprecated
    public static void logout(boolean z, Handler handler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b54c2f93", new Object[]{new Boolean(z), handler});
            return;
        }
        addLoadedListener(handler);
        logout(true);
    }

    @Deprecated
    public static void loginByKey(String str, int i, Handler handler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e768eec3", new Object[]{str, new Integer(i), handler});
            return;
        }
        addLoadedListener(handler);
        loginByKey(str, i);
    }

    @Deprecated
    public static void addLoadedListener(Handler handler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30319711", new Object[]{handler});
        } else if (handler == null) {
        } else {
            handlerPool.put(handler.toString(), new WeakReference<>(handler));
            currentHandler = handler;
        }
    }

    @Deprecated
    public static void deleteLoadedListener(Handler handler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("536e8c9b", new Object[]{handler});
        } else if (handler == null) {
        } else {
            handlerPool.remove(handler.toString());
            if (currentHandler == handler) {
                currentHandler = null;
            } else if (oAuthHandler != handler) {
            } else {
                oAuthHandler = null;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0070, code lost:
        r0.add(r2.getKey());
     */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void sendToHander(int r5, android.os.Bundle r6) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.login4android.api.Login.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L1b
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            java.lang.Integer r3 = new java.lang.Integer
            r3.<init>(r5)
            r1[r2] = r3
            r5 = 1
            r1[r5] = r6
            java.lang.String r5 = "f755ae57"
            r0.ipc$dispatch(r5, r1)
            return
        L1b:
            android.os.Handler r0 = com.taobao.login4android.api.Login.currentHandler
            if (r0 == 0) goto L22
            sendMessage(r0, r6, r5)
        L22:
            android.os.Handler r0 = com.taobao.login4android.api.Login.oAuthHandler
            if (r0 == 0) goto L2d
            android.os.Handler r1 = com.taobao.login4android.api.Login.currentHandler
            if (r1 == r0) goto L2d
            sendMessage(r0, r6, r5)
        L2d:
            if (r5 <= 0) goto L8e
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.ref.WeakReference<android.os.Handler>> r0 = com.taobao.login4android.api.Login.handlerPool
            if (r0 == 0) goto L8e
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L8e
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.ref.WeakReference<android.os.Handler>> r1 = com.taobao.login4android.api.Login.handlerPool
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L48:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L78
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getValue()
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3
            java.lang.Object r3 = r3.get()
            android.os.Handler r3 = (android.os.Handler) r3
            if (r3 == 0) goto L6e
            android.os.Handler r4 = com.taobao.login4android.api.Login.currentHandler
            if (r3 == r4) goto L6e
            android.os.Handler r4 = com.taobao.login4android.api.Login.oAuthHandler
            if (r3 == r4) goto L6e
            sendMessage(r3, r6, r5)
            goto L48
        L6e:
            if (r3 != 0) goto L48
            java.lang.Object r2 = r2.getKey()
            r0.add(r2)
            goto L48
        L78:
            java.util.Iterator r5 = r0.iterator()
        L7c:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L8e
            java.lang.Object r6 = r5.next()
            java.lang.String r6 = (java.lang.String) r6
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.ref.WeakReference<android.os.Handler>> r0 = com.taobao.login4android.api.Login.handlerPool
            r0.remove(r6)
            goto L7c
        L8e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.login4android.api.Login.sendToHander(int, android.os.Bundle):void");
    }

    @Deprecated
    private static void sendMessage(Handler handler, Bundle bundle, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efe13e45", new Object[]{handler, bundle, new Integer(i)});
        } else if (bundle != null) {
            Message obtainMessage = handler.obtainMessage(i);
            obtainMessage.obj = bundle;
            obtainMessage.sendToTarget();
        } else {
            handler.sendEmptyMessage(i);
        }
    }
}
