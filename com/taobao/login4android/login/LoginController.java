package com.taobao.login4android.login;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.content.LocalBroadcastManager;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.q;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.CookieManager;
import com.ali.user.mobile.ability.ExecutorJSBridge;
import com.ali.user.mobile.app.LoginContext;
import com.ali.user.mobile.app.constant.UTConstant;
import com.ali.user.mobile.app.dataprovider.DataProvider;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.mobile.app.init.AliUserInit;
import com.ali.user.mobile.base.helper.AliuserActionReceiver;
import com.ali.user.mobile.base.helper.BroadCastHelper;
import com.ali.user.mobile.base.helper.CPHelper;
import com.ali.user.mobile.base.helper.LoginDataHelper;
import com.ali.user.mobile.callback.DataCallback;
import com.ali.user.mobile.callback.RpcRequestCallback;
import com.ali.user.mobile.common.api.LoginApprearanceExtensions;
import com.ali.user.mobile.coordinator.CoordinatorWrapper;
import com.ali.user.mobile.data.LoginComponent;
import com.ali.user.mobile.exception.RpcException;
import com.ali.user.mobile.filter.LoginFilterCallback;
import com.ali.user.mobile.harmony.HarmonyLoginBackupImpl;
import com.ali.user.mobile.info.AppInfo;
import com.ali.user.mobile.log.ApiReferer;
import com.ali.user.mobile.log.AppMonitorAdapter;
import com.ali.user.mobile.log.UserTrackAdapter;
import com.ali.user.mobile.login.action.LoginResActions;
import com.ali.user.mobile.login.model.LoginConstant;
import com.ali.user.mobile.login.service.impl.UserLoginServiceImpl;
import com.ali.user.mobile.model.AutoLoginCallback;
import com.ali.user.mobile.model.CommonCallback;
import com.ali.user.mobile.model.DeviceTokenSignParam;
import com.ali.user.mobile.model.LoginBaseParam;
import com.ali.user.mobile.model.LoginParam;
import com.ali.user.mobile.model.LoginType;
import com.ali.user.mobile.model.RegistParam;
import com.ali.user.mobile.model.SSOMasterParam;
import com.ali.user.mobile.model.TokenType;
import com.ali.user.mobile.model.UrlParam;
import com.ali.user.mobile.rpc.ApiConstants;
import com.ali.user.mobile.rpc.HistoryAccount;
import com.ali.user.mobile.rpc.RpcRequest;
import com.ali.user.mobile.rpc.RpcResponse;
import com.ali.user.mobile.rpc.h5.MtopAccountCenterUrlResponseData;
import com.ali.user.mobile.rpc.h5.MtopCanChangeNickResponseData;
import com.ali.user.mobile.rpc.login.model.ApplyTokenRequest;
import com.ali.user.mobile.rpc.login.model.DefaultLoginResponseData;
import com.ali.user.mobile.rpc.login.model.LoginReturnData;
import com.ali.user.mobile.rpc.login.model.LoginTokenResponseData;
import com.ali.user.mobile.rpc.login.model.MLoginTokenReturnValue;
import com.ali.user.mobile.security.AlibabaSecurityTokenService;
import com.ali.user.mobile.security.SSOSecurityService;
import com.ali.user.mobile.security.SecurityGuardManagerWraper;
import com.ali.user.mobile.service.LoginService;
import com.ali.user.mobile.service.NavigatorService;
import com.ali.user.mobile.service.RpcService;
import com.ali.user.mobile.service.ServiceFactory;
import com.ali.user.mobile.url.model.AccountCenterParam;
import com.ali.user.mobile.url.service.impl.UrlFetchServiceImpl;
import com.ali.user.mobile.utils.BackgroundExecutor;
import com.ali.user.mobile.utils.Constants;
import com.ali.user.mobile.utils.MainThreadExecutor;
import com.ali.user.mobile.utils.SiteUtil;
import com.ali.user.mobile.verify.impl.VerifyServiceImpl;
import com.ali.user.mobile.verify.model.GetVerifyUrlResponse;
import com.ali.user.mobile.verify.model.GetVerifyUrlReturnData;
import com.ali.user.mobile.verify.model.VerifyParam;
import com.alibaba.fastjson.JSON;
import com.alibaba.triver.triver_shop.newShop.ext.g;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.scancode.common.jsbridge.ScancodeCallback;
import com.taobao.android.sso.v2.model.ApplySsoTokenRequest;
import com.taobao.android.sso.v2.model.SSOIPCConstants;
import com.taobao.android.sso.v2.model.SSOV2ApplySsoTokenResponseData;
import com.taobao.login4android.Login;
import com.taobao.login4android.biz.alipaysso.AlipayConstant;
import com.taobao.login4android.biz.alipaysso.AlipaySSOLogin;
import com.taobao.login4android.biz.autologin.AutoLoginBusiness;
import com.taobao.login4android.biz.autologin.AutoLoginParam;
import com.taobao.login4android.biz.getWapCookies.GetWapLoginCookiesBusiness;
import com.taobao.login4android.biz.logout.LogoutBusiness;
import com.taobao.login4android.biz.logout.LogoutParam;
import com.taobao.login4android.biz.unifysso.UnifySsoLogin;
import com.taobao.login4android.biz.uninstall.UninstallManager;
import com.taobao.login4android.broadcast.LoginAction;
import com.taobao.login4android.config.LoginSwitch;
import com.taobao.login4android.constants.LoginConstants;
import com.taobao.login4android.constants.LoginStatus;
import com.taobao.login4android.jsbridge.JSBridgeService;
import com.taobao.login4android.jsbridge.SDKJSBridgeService;
import com.taobao.login4android.log.LoginTLogAdapter;
import com.taobao.login4android.receiver.LoginTestBroadcastReceiver;
import com.taobao.login4android.receiver.StatusReceiver;
import com.taobao.login4android.session.SessionManager;
import com.taobao.login4android.thread.LoginTask;
import com.taobao.login4android.thread.LoginThreadHelper;
import com.taobao.login4android.utils.ToastUtil;
import com.taobao.mytaobao.basement.BasementConstants;
import com.taobao.search.sf.util.tlog.TLogTracker;
import com.uc.webview.base.cyclone.BSError;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTHitBuilders;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
import tb.riy;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* loaded from: classes7.dex */
public class LoginController {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int E_APPLY_TOKEN_FAIL = 1100;
    public static final String INIT_TAG = "init.login-tag";
    private static final String TAG = "login.LoginController";
    private static LoginController controller;
    public String browserRefUrl;
    private boolean isNotifyLogout = false;
    private AtomicBoolean isAliuserSDKInited = new AtomicBoolean(false);
    private boolean autoLoginRateLimit = false;
    private long autoLoginLimitExpireTime = 0;
    private int autoLoginLeftToLimitCount = 0;

    public void clearHistoryNames() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5225a08", new Object[]{this});
        }
    }

    public static /* synthetic */ void access$000(LoginController loginController, String str, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f43387c5", new Object[]{loginController, str, bundle});
        } else {
            loginController.umidTokenLogin(str, bundle);
        }
    }

    public static /* synthetic */ void access$100(LoginController loginController, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4818fbae", new Object[]{loginController, bundle});
        } else {
            loginController.simLogin(bundle);
        }
    }

    public static /* synthetic */ void access$400(LoginController loginController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11bff329", new Object[]{loginController});
        } else {
            loginController.addLoginPlugin();
        }
    }

    private LoginController() {
    }

    public static synchronized LoginController getInstance() {
        synchronized (LoginController.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (LoginController) ipChange.ipc$dispatch("f24dadf2", new Object[0]);
            }
            if (controller == null) {
                controller = new LoginController();
            }
            return controller;
        }
    }

    private void processNetworkError(RpcResponse<LoginReturnData> rpcResponse, boolean z, boolean z2, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea27f417", new Object[]{this, rpcResponse, new Boolean(z), new Boolean(z2), bundle});
        } else if (RpcException.isSystemError(rpcResponse.code)) {
            if (LoginStatus.isFromChangeAccount()) {
                if (Login.session == null) {
                    Login.session = SessionManager.getInstance(DataProviderFactory.getApplicationContext());
                }
                Login.session.recoverCookie();
            }
            if (!z2) {
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("clearSession", "false");
            hashMap.put(LoginConstants.LOGIN_TYPE, LoginType.LocalLoginType.AUTO_LOGIN);
            BroadCastHelper.sendBroadcast(LoginAction.NOTIFY_LOGIN_FAILED, false, rpcResponse.code, rpcResponse.message, (Map<String, String>) hashMap, this.browserRefUrl);
        } else {
            userLogin(z, z2, bundle);
        }
    }

    public void autoLogin(boolean z, final Bundle bundle) {
        int i;
        String str;
        String str2;
        String str3;
        boolean z2 = z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e0c7d81", new Object[]{this, new Boolean(z2), bundle});
            return;
        }
        String str4 = "autoLogin() called with: showUI = [" + z2 + "], data = [" + bundle + riy.ARRAY_END_STR;
        if (Login.session == null) {
            Login.session = SessionManager.getInstance(DataProviderFactory.getApplicationContext());
        }
        String userId = Login.getUserId();
        String loginToken = Login.getLoginToken();
        int defaultLoginSite = SiteUtil.getDefaultLoginSite();
        if (bundle != null) {
            boolean z3 = bundle.getBoolean(LoginConstant.FORCE_OPEN_LOGIN, false);
            String string = bundle.getString(AlipayConstant.LOGIN_ALIPAY_TOKEN_KEY, "");
            String string2 = bundle.getString(LoginConstant.LOGIN_BUNDLE_UNIFY_SSO_TOKEN, "");
            boolean z4 = bundle.getBoolean(LoginConstant.CHANGE_ACCOUNT_FLAG);
            String string3 = bundle.getString(LoginConstant.OUTTER_LOGIN_TOKEN, "");
            String string4 = bundle.getString(LoginConstant.OUTTER_LOGIN_TOKEN_TYPE, "");
            final String string5 = bundle.getString(LoginConstant.UMID_TOKEN, "");
            String string6 = bundle.getString("login_type", "");
            Context applicationContext = DataProviderFactory.getApplicationContext();
            i = defaultLoginSite;
            if ("umidIv".equals(string6) && !TextUtils.isEmpty(string5)) {
                LoginTLogAdapter.e(TAG, "umidTokenLogin start");
                if (LoginSwitch.getSwitch("loginBarAgreement", "false")) {
                    ((NavigatorService) ServiceFactory.getService(NavigatorService.class)).navToAgreement(applicationContext, new LoginFilterCallback() { // from class: com.taobao.login4android.login.LoginController.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.ali.user.mobile.filter.LoginFilterCallback
                        public void onSuccess() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("d0e393ab", new Object[]{this});
                            } else {
                                LoginController.access$000(LoginController.this, string5, bundle);
                            }
                        }

                        @Override // com.ali.user.mobile.filter.LoginFilterCallback
                        public void onFail(int i2, Map<String, String> map) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("d66999c6", new Object[]{this, new Integer(i2), map});
                                return;
                            }
                            LoginTLogAdapter.e(LoginController.TAG, "umidTokenLogin failed,agreement disagree");
                            LoginStatus.resetLoginFlag();
                        }
                    });
                    return;
                } else {
                    umidTokenLogin(string5, bundle);
                    return;
                }
            } else if ("sim".equals(string6)) {
                LoginTLogAdapter.e(TAG, "simLogin start");
                if (LoginSwitch.getSwitch("loginBarAgreement", "false")) {
                    ((NavigatorService) ServiceFactory.getService(NavigatorService.class)).navToAgreement(applicationContext, new LoginFilterCallback() { // from class: com.taobao.login4android.login.LoginController.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.ali.user.mobile.filter.LoginFilterCallback
                        public void onSuccess() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("d0e393ab", new Object[]{this});
                            } else {
                                LoginController.access$100(LoginController.this, bundle);
                            }
                        }

                        @Override // com.ali.user.mobile.filter.LoginFilterCallback
                        public void onFail(int i2, Map<String, String> map) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("d66999c6", new Object[]{this, new Integer(i2), map});
                                return;
                            }
                            LoginStatus.resetLoginFlag();
                            LoginTLogAdapter.e(LoginController.TAG, "simLogin failed,agreement disagree");
                        }
                    });
                    return;
                } else {
                    simLogin(bundle);
                    return;
                }
            } else if (!TextUtils.isEmpty(string2)) {
                LoginTLogAdapter.e(TAG, "autoLogin tokenLogin");
                UnifySsoLogin.tokenLogin(bundle.getInt(LoginConstant.ALIUSER_LOGIN_SITE, 0), string2, bundle.getBoolean("isSilent"), Login.session);
                return;
            } else if (!TextUtils.isEmpty(string) && DataProviderFactory.getDataProvider().enableAlipaySSO()) {
                alipaySsoLogin(bundle);
                LoginTLogAdapter.e(TAG, "autoLogin alipaySsoLogin");
                return;
            } else {
                if (z4) {
                    str3 = bundle.getString(LoginConstant.CHANGE_ACCOUNT_USER_ID, "");
                    str2 = bundle.getString(LoginConstant.CHANGE_ACCOUNT_AUTOLOGIN_TOKEN, "");
                    int i2 = bundle.getInt(LoginConstant.ALIUSER_LOGIN_SITE, 0);
                    LoginStatus.compareAndSetFromChangeAccount(false, true);
                    ApiReferer.Refer refer = new ApiReferer.Refer();
                    refer.eventName = BasementConstants.BEHAVIOR_CHANGE_ACCOUNT;
                    refer.userId = str3;
                    refer.site = String.valueOf(i2);
                    Login.session.appendEventTrace(JSON.toJSONString(refer));
                    z2 = z;
                    i = i2;
                } else if (!TextUtils.isEmpty(string3)) {
                    old2NewAutoLogin(string3, string4, DataProviderFactory.getDataProvider().getSite(), z, bundle);
                    return;
                } else if (z3) {
                    LoginTLogAdapter.e(TAG, "forceOpenLoginView,don't do autologin");
                    userLogin(z, true, bundle);
                    return;
                } else {
                    z2 = z;
                    str3 = userId;
                    str2 = loginToken;
                }
                this.browserRefUrl = bundle.getString(LoginConstants.BROWSER_REF_URL);
                LoginTLogAdapter.e(TAG, "autologin with bundle. browserRefUrl = " + this.browserRefUrl);
                String string7 = bundle.getString("apiReferer");
                apiReferUT(string7);
                if (!TextUtils.isEmpty(string7)) {
                    try {
                        Login.session.appendEventTrace(string7);
                    } catch (Throwable unused) {
                        ApiReferer.Refer refer2 = new ApiReferer.Refer();
                        refer2.eventName = string7;
                        Login.session.appendEventTrace(JSON.toJSONString(refer2));
                    }
                }
                UserTrackAdapter.sendUT("apiReferer", string7);
                if (!TextUtils.isEmpty(this.browserRefUrl)) {
                    ApiReferer.Refer refer3 = new ApiReferer.Refer();
                    refer3.eventName = this.browserRefUrl;
                    Login.session.appendEventTrace(JSON.toJSONString(refer3));
                }
                str = str3;
            }
        } else {
            i = defaultLoginSite;
            str = userId;
            str2 = loginToken;
        }
        int i3 = i;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            ApiReferer.Refer refer4 = new ApiReferer.Refer();
            refer4.eventName = "autoLoginToken=null|trySdkLogin";
            Login.session.appendEventTrace(JSON.toJSONString(refer4));
            try {
                Properties properties = new Properties();
                properties.put("action", "autologin token null trySdkLogin");
                properties.put("logintoken", TextUtils.isEmpty(str2) + "");
                properties.put("userid", TextUtils.isEmpty(str) + "");
                UserTrackAdapter.sendUT("NullAutoLoginToken", properties);
            } catch (Exception unused2) {
            }
            if (!TextUtils.isEmpty(str2) && LoginSwitch.getSwitch("autologin_only", "false")) {
                LoginTLogAdapter.e(TAG, "autoLogin autoLoginTargetAccount 1");
                autoLoginTargetAccount(str, str2, i3, z, bundle);
                return;
            }
            LoginTLogAdapter.e(TAG, "autoLogin userLogin");
            userLogin(z2, true, bundle);
            return;
        }
        LoginTLogAdapter.e(TAG, "autoLogin autoLoginTargetAccount 2");
        autoLoginTargetAccount(str, str2, i3, z, bundle);
    }

    public void doAutoLoginWithCallback(String str, String str2, int i, String str3, boolean z, AutoLoginCallback autoLoginCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c980af4", new Object[]{this, str, str2, new Integer(i), str3, new Boolean(z), autoLoginCallback});
        } else if (autoLoginCallback == null) {
        } else {
            AutoLoginParam autoLoginParam = new AutoLoginParam();
            autoLoginParam.token = str;
            autoLoginParam.userId = str2;
            autoLoginParam.site = i;
            autoLoginParam.apiRefer = str3;
            autoLoginParam.needBroadcast = z;
            doAutoLoginWithCallback(autoLoginParam, autoLoginCallback);
        }
    }

    public void doAutoLoginWithCallback(final AutoLoginParam autoLoginParam, final AutoLoginCallback autoLoginCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2d0972", new Object[]{this, autoLoginParam, autoLoginCallback});
        } else if (autoLoginCallback == null) {
        } else {
            if (!autoLoginParam.restoreSession) {
                LoginStatus.compareAndSetLogining(false, true);
            }
            CoordinatorWrapper.executeSafely(new AsyncTask<Object, Void, RpcResponse<LoginReturnData>>() { // from class: com.taobao.login4android.login.LoginController.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.AsyncTask
                /* renamed from: doInBackground */
                public RpcResponse<LoginReturnData> mo1129doInBackground(Object... objArr) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (RpcResponse) ipChange2.ipc$dispatch("85055509", new Object[]{this, objArr});
                    }
                    try {
                        return new AutoLoginBusiness().autoLogin(autoLoginParam);
                    } catch (Exception e) {
                        e.printStackTrace();
                        return null;
                    }
                }

                @Override // android.os.AsyncTask
                public void onPostExecute(RpcResponse<LoginReturnData> rpcResponse) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("e0e04a30", new Object[]{this, rpcResponse});
                    } else if (rpcResponse == null) {
                        autoLoginCallback.onBizFail(-2, "Null Response");
                        LoginStatus.resetLoginFlag(!autoLoginParam.isFromChangeAccount);
                    } else if (RpcException.isSystemError(rpcResponse.code)) {
                        autoLoginCallback.onNetworkError();
                        LoginStatus.resetLoginFlag(!autoLoginParam.isFromChangeAccount);
                    } else if ("SUCCESS".equals(rpcResponse.actionType)) {
                        if (autoLoginParam.restoreSession && LoginStatus.isLogining()) {
                            LoginContext.uninstallResponse = rpcResponse;
                            LoginContext.uninstallType = 1;
                            autoLoginCallback.onBizFail(-339393, "call_autologin_but_user_is_logining");
                            return;
                        }
                        LoginController.this.processAutoLoginResponse(rpcResponse, false, autoLoginParam.needBroadcast, null);
                        autoLoginCallback.onSuccess();
                    } else {
                        LoginStatus.resetLoginFlag(!autoLoginParam.isFromChangeAccount);
                        autoLoginCallback.onBizFail(rpcResponse.code, rpcResponse.message);
                    }
                }
            }, new Object[0]);
        }
    }

    public void doReloginWithCallback(final boolean z, String str, String str2, final boolean z2, final AutoLoginCallback autoLoginCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2b26307", new Object[]{this, new Boolean(z), str, str2, new Boolean(z2), autoLoginCallback});
            return;
        }
        final Properties properties = LoginComponent.getProperties();
        UserTrackAdapter.sendExtendUT(UTConstant.CustomEvent.UT_SINGLE_LOGIN_COMMIT, "", LoginType.LocalLoginType.LOGIN_TYPE_UMID, properties);
        AutoLoginBusiness.uninstallRelogin(str, str2, new RpcRequestCallback() { // from class: com.taobao.login4android.login.LoginController.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.ali.user.mobile.callback.RpcRequestCallback
            public void onSuccess(RpcResponse rpcResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("2811f422", new Object[]{this, rpcResponse});
                } else if (rpcResponse == null) {
                    UserTrackAdapter.sendExtendUT(UTConstant.CustomEvent.UT_SINGLE_LOGIN_FAILURE, "empty response", LoginType.LocalLoginType.LOGIN_TYPE_UMID, properties);
                    autoLoginCallback.onBizFail(-2, "Null Response");
                } else if (RpcException.isSystemError(rpcResponse.code)) {
                    UserTrackAdapter.sendExtendUT(UTConstant.CustomEvent.UT_SINGLE_LOGIN_FAILURE, String.valueOf(rpcResponse.code), LoginType.LocalLoginType.LOGIN_TYPE_UMID, properties);
                    autoLoginCallback.onNetworkError();
                } else if ("SUCCESS".equals(rpcResponse.actionType)) {
                    if (!z && UninstallManager.checkIsLoggingIn()) {
                        LoginContext.uninstallResponse = rpcResponse;
                        LoginContext.uninstallType = 2;
                        UserTrackAdapter.sendExtendUT(UTConstant.CustomEvent.UT_SINGLE_LOGIN_FAILURE, "isLogining", LoginType.LocalLoginType.LOGIN_TYPE_UMID, properties);
                        autoLoginCallback.onBizFail(BSError.BSDIFF_NEW_FILE_MD5_MISMATCH, "user trigger login");
                        return;
                    }
                    LoginController.this.processAutoLoginResponse(rpcResponse, false, z2, null);
                    autoLoginCallback.onSuccess();
                    UserTrackAdapter.sendExtendUT(UTConstant.CustomEvent.UT_SINGLE_LOGIN_SUCCESS, "", LoginType.LocalLoginType.LOGIN_TYPE_UMID, properties);
                } else {
                    if (LoginSwitch.getSwitch("uninstallTagCaseReloginBizFail", "true")) {
                        ReloginDelegate.setReloginOnce();
                    }
                    UserTrackAdapter.sendExtendUT(UTConstant.CustomEvent.UT_SINGLE_LOGIN_FAILURE, "BizError", LoginType.LocalLoginType.LOGIN_TYPE_UMID, properties);
                    autoLoginCallback.onBizFail(rpcResponse.code, rpcResponse.message);
                }
            }

            @Override // com.ali.user.mobile.callback.RpcRequestCallback
            public void onError(RpcResponse rpcResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4b349f7d", new Object[]{this, rpcResponse});
                } else {
                    onSuccess(rpcResponse);
                }
            }
        });
    }

    private void umidTokenLogin(String str, final Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e75dcf00", new Object[]{this, str, bundle});
            return;
        }
        final Properties properties = LoginComponent.getProperties();
        UserTrackAdapter.sendUT(UTConstant.PageName.UT_PAGE_LOGIN_BAR, UTConstant.CustomEvent.UT_SINGLE_LOGIN_COMMIT, "", LoginType.LocalLoginType.UMID_LOGIN, properties);
        final LoginBaseParam loginBaseParam = new LoginBaseParam();
        loginBaseParam.token = str;
        loginBaseParam.ext = new HashMap();
        loginBaseParam.site = DataProviderFactory.getDataProvider().getSite();
        loginBaseParam.sdkTraceId = ApiReferer.generateTraceId(LoginType.LocalLoginType.UMID_LOGIN, UTConstant.PageName.UT_PAGE_LOGIN_BAR);
        AutoLoginBusiness.umidLogin(loginBaseParam, new RpcRequestCallback() { // from class: com.taobao.login4android.login.LoginController.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ void access$200(AnonymousClass5 anonymousClass5) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5528b2b6", new Object[]{anonymousClass5});
                } else {
                    anonymousClass5.failed();
                }
            }

            @Override // com.ali.user.mobile.callback.RpcRequestCallback
            public void onSuccess(RpcResponse rpcResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("2811f422", new Object[]{this, rpcResponse});
                    return;
                }
                LoginController.this.processAutoLoginResponse(rpcResponse, false, true, null);
                UserTrackAdapter.sendUT(UTConstant.PageName.UT_PAGE_LOGIN_BAR, UTConstant.CustomEvent.UT_SINGLE_LOGIN_SUCCESS, "", LoginType.LocalLoginType.UMID_LOGIN, properties);
            }

            @Override // com.ali.user.mobile.callback.RpcRequestCallback
            public void onError(RpcResponse rpcResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4b349f7d", new Object[]{this, rpcResponse});
                } else if (rpcResponse != null && rpcResponse.returnValue != 0 && (rpcResponse instanceof DefaultLoginResponseData) && TextUtils.equals(rpcResponse.actionType, "H5")) {
                    DefaultLoginResponseData defaultLoginResponseData = (DefaultLoginResponseData) rpcResponse;
                    boolean equals = "true".equals(((LoginReturnData) defaultLoginResponseData.returnValue).extMap.get(g.KEY_IS_TRANSPARENT));
                    String str2 = ((LoginReturnData) defaultLoginResponseData.returnValue).h5Url;
                    String str3 = ((LoginReturnData) defaultLoginResponseData.returnValue).token;
                    String str4 = ((LoginReturnData) defaultLoginResponseData.returnValue).scene;
                    UrlParam urlParam = new UrlParam();
                    urlParam.url = str2;
                    urlParam.token = str3;
                    urlParam.scene = str4;
                    urlParam.loginParam = loginBaseParam;
                    ((NavigatorService) ServiceFactory.getService(NavigatorService.class)).navToLoginUrlPage(DataProviderFactory.getApplicationContext(), urlParam, equals, new LoginFilterCallback() { // from class: com.taobao.login4android.login.LoginController.5.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.ali.user.mobile.filter.LoginFilterCallback
                        public void onSuccess() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("d0e393ab", new Object[]{this});
                            } else {
                                AnonymousClass5.access$200(AnonymousClass5.this);
                            }
                        }

                        @Override // com.ali.user.mobile.filter.LoginFilterCallback
                        public void onFail(int i, Map<String, String> map) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("d66999c6", new Object[]{this, new Integer(i), map});
                            } else {
                                AnonymousClass5.access$200(AnonymousClass5.this);
                            }
                        }
                    });
                } else {
                    failed();
                }
            }

            private void failed() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("219db244", new Object[]{this});
                    return;
                }
                UserTrackAdapter.sendUT(UTConstant.PageName.UT_PAGE_LOGIN_BAR, UTConstant.CustomEvent.UT_SINGLE_LOGIN_FAILURE, "", LoginType.LocalLoginType.UMID_LOGIN, properties);
                LoginController.this.userLogin(true, true, bundle);
            }
        });
    }

    private void simLogin(final Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a857efdb", new Object[]{this, bundle});
            return;
        }
        final Properties properties = LoginComponent.getProperties();
        UserTrackAdapter.sendUT(UTConstant.PageName.UT_PAGE_LOGIN_BAR, UTConstant.CustomEvent.UT_SINGLE_LOGIN_COMMIT, "", LoginType.LocalLoginType.SIM_LOGIN, properties);
        HashMap hashMap = new HashMap();
        if (bundle != null) {
            String string = bundle.getString(LoginConstant.UMID_TOKEN, "");
            if (!TextUtils.isEmpty(string)) {
                hashMap.put(LoginConstant.UMID_TOKEN, string);
            }
        }
        ((LoginService) ServiceFactory.getService(LoginService.class)).onekeyLogin(DataProviderFactory.getApplicationContext(), hashMap, new CommonCallback() { // from class: com.taobao.login4android.login.LoginController.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.ali.user.mobile.model.CommonCallback
            public void onSuccess() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d0e393ab", new Object[]{this});
                    return;
                }
                LoginStatus.resetLoginFlag();
                UserTrackAdapter.sendUT(UTConstant.PageName.UT_PAGE_LOGIN_BAR, UTConstant.CustomEvent.UT_SINGLE_LOGIN_SUCCESS, "", LoginType.LocalLoginType.SIM_LOGIN, properties);
            }

            @Override // com.ali.user.mobile.model.CommonCallback
            public void onFail(int i, String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("efca37e9", new Object[]{this, new Integer(i), str});
                    return;
                }
                UserTrackAdapter.sendUT(UTConstant.PageName.UT_PAGE_LOGIN_BAR, UTConstant.CustomEvent.UT_SINGLE_LOGIN_FAILURE, "", LoginType.LocalLoginType.SIM_LOGIN, properties);
                LoginController.this.userLogin(true, true, bundle);
            }
        });
    }

    private void apiReferUT(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f340476", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            try {
                JSONObject jSONObject = new JSONObject(str);
                String optString = jSONObject.optString("apiName");
                UTHitBuilders.UTCustomHitBuilder uTCustomHitBuilder = new UTHitBuilders.UTCustomHitBuilder(jSONObject.optString("eventName", "NO_SESSION"));
                uTCustomHitBuilder.setEventPage(UTConstant.PageName.UT_PAGE_EXTEND);
                if (!TextUtils.isEmpty(optString)) {
                    uTCustomHitBuilder.setProperty("apiName", optString);
                }
                String optString2 = jSONObject.optString("msgCode");
                if (!TextUtils.isEmpty(optString2)) {
                    uTCustomHitBuilder.setProperty(UTHitBuilders.a.FIELD_ARG2, optString2);
                }
                UTAnalytics.getInstance().getDefaultTracker().send(uTCustomHitBuilder.build());
            } catch (JSONException unused) {
            }
        }
    }

    public void autoLoginTargetAccount(final String str, final String str2, final int i, final boolean z, final Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1360ee86", new Object[]{this, str, str2, new Integer(i), new Boolean(z), bundle});
            return;
        }
        try {
            String str3 = "autoLoginTargetAccount() called with: userid = [" + str + "], loginToken = [" + str2 + "], targetSite = [" + i + "], showUI = [" + z + "], data = [" + bundle + riy.ARRAY_END_STR;
            if (TextUtils.isEmpty(AppInfo.getInstance().getUmidToken())) {
                AppInfo.getInstance().getUmidToken(new DataCallback<String>() { // from class: com.taobao.login4android.login.LoginController.7
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.ali.user.mobile.callback.DataCallback
                    public void result(String str4) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("dec15eee", new Object[]{this, str4});
                        } else if (!TextUtils.isEmpty(str4)) {
                            LoginController.this.autoLoginTargetAccount(str, str2, i, z, bundle);
                        } else {
                            boolean z2 = z;
                            if (z2) {
                                LoginController.this.userLogin(z2, true, bundle);
                                return;
                            }
                            HashMap hashMap = new HashMap();
                            hashMap.put("clearSession", "false");
                            BroadCastHelper.sendBroadcast(LoginAction.NOTIFY_LOGIN_FAILED, false, (int) IMediaPlayer.MEDIA_INFO_VIDEO_SWITCH_SIZE, "umidtoken is null", (Map<String, String>) hashMap, LoginController.this.browserRefUrl);
                        }
                    }
                });
                return;
            }
            if (this.autoLoginRateLimit && System.currentTimeMillis() < this.autoLoginLimitExpireTime) {
                if (this.autoLoginLeftToLimitCount <= 0) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("clearSession", "false");
                    BroadCastHelper.sendBroadcast(LoginAction.NOTIFY_LOGIN_FAILED, false, 728, "limit", (Map<String, String>) hashMap, this.browserRefUrl);
                    return;
                }
                this.autoLoginLeftToLimitCount--;
            }
            processAutoLoginResponse(new AutoLoginBusiness().autoLogin(str2, str, i, z, ApiReferer.generateApiReferer()), z, true, bundle);
        } catch (Throwable th) {
            if (TextUtils.equals(Login.getUserId(), str)) {
                ApiReferer.Refer refer = new ApiReferer.Refer();
                refer.eventName = "autoLoginFailed";
                refer.errorMessage = th.getMessage();
                if (Login.session == null) {
                    Login.session = SessionManager.getInstance(DataProviderFactory.getApplicationContext());
                }
                Login.session.appendEventTrace(JSON.toJSONString(refer));
            }
            userLogin(z, true, bundle);
        }
    }

    public void old2NewAutoLogin(String str, String str2, int i, boolean z, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29043c23", new Object[]{this, str, str2, new Integer(i), new Boolean(z), bundle});
            return;
        }
        try {
            processAutoLoginResponse(new AutoLoginBusiness().oldLogin(str, str2, i, ApiReferer.generateApiReferer()), z, true, bundle);
        } catch (Throwable unused) {
            userLogin(z, true, bundle);
        }
    }

    private void alipaySsoLogin(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc393169", new Object[]{this, bundle});
            return;
        }
        LoginTLogAdapter.e(TAG, "alipay login");
        String generateTraceId = ApiReferer.generateTraceId(LoginType.LocalLoginType.ALIPAY_TRUST_LOGIN, UTConstant.PageName.UT_PAGE_ALIPAY_TRUST_LOGIN);
        HashMap hashMap = new HashMap();
        hashMap.put("sdkTraceId", generateTraceId);
        UserTrackAdapter.control(UTConstant.PageName.UT_PAGE_ALIPAY_TRUST_LOGIN, UTConstant.CustomEvent.UT_LOGIN_ACTION, "", LoginType.LocalLoginType.ASO_LOGIN, hashMap);
        Properties properties = LoginComponent.getProperties();
        properties.setProperty("sdkTraceId", generateTraceId + "");
        UserTrackAdapter.sendExtendUT(UTConstant.CustomEvent.UT_SINGLE_LOGIN_COMMIT, "", LoginType.LocalLoginType.ALIPAY_TRUST_LOGIN, properties);
        String string = bundle.getString(AlipayConstant.LOGIN_ALIPAY_TOKEN_KEY, "");
        HashMap hashMap2 = new HashMap();
        hashMap2.put("source", bundle.getString("source", ""));
        hashMap2.put("version", bundle.getString("version", ""));
        hashMap2.put("app_id", bundle.getString("app_id", ""));
        hashMap2.put(AlipayConstant.LOGIN_ALIPAY_AUTH_CODE_KEY, bundle.getString(AlipayConstant.LOGIN_ALIPAY_AUTH_CODE_KEY, ""));
        hashMap2.put(AlipayConstant.LOGIN_ALIPAY_CLIENT_VERSION_KEY, bundle.getString(AlipayConstant.LOGIN_ALIPAY_CLIENT_VERSION_KEY, ""));
        hashMap2.put(AlipayConstant.LOGIN_ALIPAY_USER_ID_KEY, bundle.getString(AlipayConstant.LOGIN_ALIPAY_USER_ID_KEY, ""));
        if ((Login.checkSessionValid() || !TextUtils.isEmpty(Login.getLoginToken())) && LoginApprearanceExtensions.AsoLoginFlow.getAsoLoginCallback() != null) {
            hashMap2.put(AlipayConstant.LOGIN_ALIPAY_ACCOUNT_CHECK_KEY, String.valueOf(true));
            hashMap2.put(AlipayConstant.LOGIN_ALIPAY_HAVANA_ID_KEY, Login.getUserId());
        }
        LoginParam loginParam = new LoginParam();
        loginParam.sdkTraceId = generateTraceId;
        loginParam.loginSourceType = LoginType.LocalLoginType.ALIPAY_TRUST_LOGIN;
        loginParam.utPageName = UTConstant.PageName.UT_PAGE_ALIPAY_TRUST_LOGIN;
        loginParam.tokenType = TokenType.ALIPAY_TRUST_LOGIN;
        AlipaySSOLogin.alipayLogin(string, hashMap2, loginParam);
    }

    public void userLogin(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1f8cf8f", new Object[]{this, new Boolean(z)});
        } else {
            userLogin(z, true, null);
        }
    }

    public void userLogin(boolean z, final boolean z2, final Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7236b8f", new Object[]{this, new Boolean(z), new Boolean(z2), bundle});
        } else if (!z) {
            if (!z2) {
                return;
            }
            BroadCastHelper.sendBroadcast(LoginAction.NOTIFY_LOGIN_FAILED, false, IMediaPlayer.MEDIA_INFO_VIDEO_SWITCH_DONE, "showUI=false", this.browserRefUrl);
        } else {
            if (Login.session == null) {
                Login.session = SessionManager.getInstance(DataProviderFactory.getApplicationContext());
            }
            LoginTLogAdapter.e(TAG, "try sdkLogin");
            LoginThreadHelper.runOnUIThread(new LoginTask() { // from class: com.taobao.login4android.login.LoginController.8
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.login4android.thread.LoginTask
                public void excuteTask() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("bc11f42", new Object[]{this});
                    } else if (DataProviderFactory.getApplicationContext() == null) {
                        if (!z2) {
                            return;
                        }
                        BroadCastHelper.sendBroadcast(LoginAction.NOTIFY_LOGIN_FAILED, false, IMediaPlayer.MEDIA_INFO_VIDEO_RENDERING_NORMAL, "ContextNull", LoginController.this.browserRefUrl);
                    } else {
                        try {
                            Login.session.clearSessionOnlyCookie();
                            LoginTLogAdapter.e(LoginController.TAG, "start openLoginPage");
                            UserTrackAdapter.sendUT("login_api_show_page");
                            ((NavigatorService) ServiceFactory.getService(NavigatorService.class)).openLoginPage(DataProviderFactory.getApplicationContext(), ApiReferer.generateApiReferer(), bundle);
                        } catch (Exception e) {
                            UserTrackAdapter.sendUT("openLoginPageFail");
                            LoginTLogAdapter.e(LoginController.TAG, e.getMessage());
                            e.printStackTrace();
                            if (!z2) {
                                return;
                            }
                            BroadCastHelper.sendBroadcast(LoginAction.NOTIFY_LOGIN_FAILED, false, 721, TLogTracker.SCENE_EXCEPTION, LoginController.this.browserRefUrl);
                        }
                    }
                }
            });
        }
    }

    public boolean refreshCookies(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f2a50d7f", new Object[]{this, new Boolean(z), new Boolean(z2)})).booleanValue();
        }
        if (z) {
            if ((DataProviderFactory.getDataProvider() instanceof DataProvider) && DataProviderFactory.getDataProvider().isRefreshCookiesDegrade()) {
                return refreshCookies(z2);
            }
            if (Login.session != null) {
                return Login.session.recoverCookie();
            }
        }
        return false;
    }

    private boolean refreshCookies(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("41a2347d", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        try {
            String[] wapCookies = new GetWapLoginCookiesBusiness().getWapCookies(ApiReferer.generateApiReferer(), z);
            if (wapCookies == null || wapCookies.length <= 0) {
                return false;
            }
            if (Login.session == null) {
                Login.session = SessionManager.getInstance(DataProviderFactory.getApplicationContext());
            }
            Login.session.injectCookie(wapCookies, null);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void openLoginPage(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12a28573", new Object[]{this, context});
            return;
        }
        try {
            ((NavigatorService) ServiceFactory.getService(NavigatorService.class)).openLoginPage(context, ApiReferer.generateApiReferer(), null);
        } catch (Exception e) {
            e.printStackTrace();
            BroadCastHelper.sendBroadcast(LoginAction.NOTIFY_LOGIN_FAILED, false, IMediaPlayer.MEDIA_INFO_VIDEO_SWITCH_FAILED, TLogTracker.SCENE_EXCEPTION, this.browserRefUrl);
        }
    }

    public void openLoginPage(Context context, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18540c81", new Object[]{this, context, bundle});
            return;
        }
        try {
            ((NavigatorService) ServiceFactory.getService(NavigatorService.class)).openLoginPage(context, ApiReferer.generateApiReferer(), bundle);
        } catch (Exception e) {
            e.printStackTrace();
            BroadCastHelper.sendBroadcast(LoginAction.NOTIFY_LOGIN_FAILED, false, IMediaPlayer.MEDIA_INFO_VIDEO_SWITCH_FAILED, TLogTracker.SCENE_EXCEPTION, this.browserRefUrl);
        }
    }

    public void openRegisterPage(Context context, RegistParam registParam) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e173cd3", new Object[]{this, context, registParam});
            return;
        }
        try {
            ((NavigatorService) ServiceFactory.getService(NavigatorService.class)).openRegisterPage(context, registParam);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void openRegisterPage(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cb19f65", new Object[]{this, context});
        } else {
            openRegisterPage(context, null);
        }
    }

    public void sendBroadcast(LoginAction loginAction) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("920b6c1c", new Object[]{this, loginAction});
        } else {
            BroadCastHelper.sendBroadcast(loginAction, false, this.browserRefUrl);
        }
    }

    public synchronized void logout(int i, String str, String str2, String str3, boolean z, CommonCallback commonCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6968055", new Object[]{this, new Integer(i), str, str2, str3, new Boolean(z), commonCallback});
            return;
        }
        LogoutParam logoutParam = new LogoutParam();
        logoutParam.site = i;
        logoutParam.sid = str;
        logoutParam.autologinToken = str2;
        logoutParam.userid = str3;
        logoutParam.emptyAll = z;
        logout(logoutParam, commonCallback);
    }

    public synchronized void logout(LogoutParam logoutParam, CommonCallback commonCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78b5dd49", new Object[]{this, logoutParam, commonCallback});
        } else if (logoutParam == null) {
        } else {
            this.isNotifyLogout = false;
            Login.session.clearAutoLoginInfo();
            doSimpleLogoutRpc(logoutParam, commonCallback);
        }
    }

    public void doSimpleLogoutRpc(LogoutParam logoutParam, CommonCallback commonCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2193d5f5", new Object[]{this, logoutParam, commonCallback});
            return;
        }
        new LogoutBusiness().logout(logoutParam);
        callAfterLogoutRpc(logoutParam.userid, logoutParam.emptyAll, commonCallback);
    }

    public void callAfterLogoutRpc(String str, boolean z, CommonCallback commonCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4acdffb7", new Object[]{this, str, new Boolean(z), commonCallback});
            return;
        }
        if (z) {
            emptySessionList();
        }
        logoutClean(str);
        if (commonCallback == null) {
            return;
        }
        commonCallback.onSuccess();
    }

    public synchronized void logout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e233c511", new Object[]{this});
        } else {
            logout(Login.getLoginSite(), Login.getSid(), Login.getLoginToken(), Login.getUserId(), false, null);
        }
    }

    public void emptySessionList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe79f5ce", new Object[]{this});
        } else if (DataProviderFactory.getDataProvider().isRemoveSessionWhenLogout()) {
            SecurityGuardManagerWraper.emptySessionListFromFile();
        } else {
            SecurityGuardManagerWraper.emptyAllSessionAutoLoginTokenFromFile();
        }
    }

    public void clearLoginInfo(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0c2afb", new Object[]{this, str});
            return;
        }
        try {
            if (DataProviderFactory.getDataProvider().isRemoveSessionWhenLogout()) {
                SecurityGuardManagerWraper.removeSessionModelFromFile(str);
            } else {
                SecurityGuardManagerWraper.removeSessionAutoLoginTokenFromFile(str);
            }
            Login.session.setSsoToken(null);
            Login.session.setOneTimeToken(null);
            try {
                Login.session.clearAutoLoginInfo();
            } catch (Throwable unused) {
            }
            try {
                Login.session.clearSessionInfo();
            } catch (Throwable unused2) {
            }
            LoginTLogAdapter.e(TAG, "clear sessionInfo in LoginController.clearLoginInfo");
            CPHelper.delete(DataProviderFactory.getApplicationContext(), LoginConstant.ACCOUNT);
            UninstallManager.getInstance().clearSessionData();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void logoutClean(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc67d030", new Object[]{this, str});
        } else if (this.isNotifyLogout) {
        } else {
            clearLoginInfo(str);
            ApiReferer.Refer refer = new ApiReferer.Refer();
            refer.eventName = "USER_LOGOUT";
            if (Login.session == null) {
                Login.session = SessionManager.getInstance(DataProviderFactory.getApplicationContext());
            }
            Login.session.appendEventTrace(JSON.toJSONString(refer));
            LoginStatus.setLastRefreshCookieTime(0L);
            LoginStatus.resetLoginFlag();
            HashMap hashMap = new HashMap();
            hashMap.put(LoginConstants.LOGOUT_TYPE, LoginConstants.LogoutType.NORMAL_LOGOUT.getType());
            hashMap.put("nick", Login.session.getOldNick());
            hashMap.put("uid", Login.getOldUserId());
            UserTrackAdapter.sendUT("SEND_LOGOUT_BROADCAST");
            BroadCastHelper.sendBroadcast(LoginAction.NOTIFY_LOGOUT, false, 0, "", (Map<String, String>) hashMap, this.browserRefUrl);
            LoginTLogAdapter.e(TAG, "logout finish");
            this.isNotifyLogout = true;
        }
    }

    public void navToWebViewByScene(Context context, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("730bbe72", new Object[]{this, context, str, new Integer(i)});
        } else {
            navToWebViewByScene(context, str, i, null);
        }
    }

    public void navToWebViewByScene(final Context context, final String str, int i, final Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3872ad3", new Object[]{this, context, str, new Integer(i), map});
            return;
        }
        AccountCenterParam accountCenterParam = new AccountCenterParam();
        accountCenterParam.scene = str;
        accountCenterParam.fromSite = i;
        UrlFetchServiceImpl.getInstance().navBySceneRemote(accountCenterParam, new RpcRequestCallback() { // from class: com.taobao.login4android.login.LoginController.9
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.ali.user.mobile.callback.RpcRequestCallback
            public void onSuccess(RpcResponse rpcResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("2811f422", new Object[]{this, rpcResponse});
                } else if (!(rpcResponse instanceof MtopAccountCenterUrlResponseData)) {
                    AppMonitorAdapter.commitFail("Page_Member_Account", "Account_" + str + "_URL", "0", "");
                } else {
                    Context context2 = context;
                    if (context2 == null) {
                        context2 = DataProviderFactory.getApplicationContext();
                    }
                    MtopAccountCenterUrlResponseData mtopAccountCenterUrlResponseData = (MtopAccountCenterUrlResponseData) rpcResponse;
                    if (!TextUtils.isEmpty(mtopAccountCenterUrlResponseData.h5Url)) {
                        AppMonitorAdapter.commitSuccess("Page_Member_Account", "Account_" + str + "_URL");
                        UrlParam urlParam = new UrlParam();
                        urlParam.scene = str;
                        urlParam.url = mtopAccountCenterUrlResponseData.h5Url;
                        urlParam.site = DataProviderFactory.getDataProvider().getSite();
                        urlParam.ext = map;
                        ((NavigatorService) ServiceFactory.getService(NavigatorService.class)).openWebViewPage(context2, urlParam);
                        return;
                    }
                    AppMonitorAdapter.commitFail("Page_Member_Account", "Account_" + str + "_URL", "0", String.valueOf(mtopAccountCenterUrlResponseData.code));
                    ToastUtil.showToast(context2, mtopAccountCenterUrlResponseData.errorMessage, 0);
                }
            }

            @Override // com.ali.user.mobile.callback.RpcRequestCallback
            public void onError(RpcResponse rpcResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4b349f7d", new Object[]{this, rpcResponse});
                    return;
                }
                AppMonitorAdapter.commitFail("Page_Member_Account", "Account_" + str + "_URL", "0", "");
            }
        });
    }

    public void navToIVByScene(Context context, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a897bf02", new Object[]{this, context, str, new Integer(i)});
        } else {
            navToIVByScene(context, str, i, null);
        }
    }

    public void navToIVByScene(final Context context, final String str, int i, final Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f860f292", new Object[]{this, context, str, new Integer(i), bundle});
            return;
        }
        final VerifyParam verifyParam = new VerifyParam();
        verifyParam.fromSite = i;
        verifyParam.actionType = str;
        verifyParam.userId = Login.getUserId();
        new CoordinatorWrapper().execute(new AsyncTask<Object, Void, String>() { // from class: com.taobao.login4android.login.LoginController.10
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass10 anonymousClass10, String str2, Object... objArr) {
                str2.hashCode();
                throw new InstantReloadException(String.format("String switch could not find '%s'", str2));
            }

            public static /* synthetic */ void access$300(AnonymousClass10 anonymousClass10, RpcResponse rpcResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("eb39ac88", new Object[]{anonymousClass10, rpcResponse});
                } else {
                    anonymousClass10.errorBroadcast(rpcResponse);
                }
            }

            @Override // android.os.AsyncTask
            public String doInBackground(Object[] objArr) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("db0124f4", new Object[]{this, objArr}) : Login.getDeviceTokenKey(Login.getUserId());
            }

            @Override // android.os.AsyncTask
            public void onPostExecute(String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("fe870167", new Object[]{this, str2});
                    return;
                }
                verifyParam.deviceTokenKey = str2;
                VerifyServiceImpl.getInstance().getIdentityVerificationUrl(verifyParam, new RpcRequestCallback() { // from class: com.taobao.login4android.login.LoginController.10.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.ali.user.mobile.callback.RpcRequestCallback
                    public void onSuccess(RpcResponse rpcResponse) {
                        IpChange ipChange3 = $ipChange;
                        if (ipChange3 instanceof IpChange) {
                            ipChange3.ipc$dispatch("2811f422", new Object[]{this, rpcResponse});
                            return;
                        }
                        GetVerifyUrlResponse getVerifyUrlResponse = (GetVerifyUrlResponse) rpcResponse;
                        if (getVerifyUrlResponse.returnValue == 0) {
                            return;
                        }
                        String str3 = ((GetVerifyUrlReturnData) getVerifyUrlResponse.returnValue).token;
                        if (!TextUtils.isEmpty(str3)) {
                            HashMap hashMap = new HashMap();
                            hashMap.put("token", str3);
                            hashMap.put("scene", str);
                            BroadCastHelper.sendBroadcast(LoginAction.NOTIFY_IV_SUCCESS, false, 0, "", (Map<String, String>) hashMap, "");
                            return;
                        }
                        String str4 = ((GetVerifyUrlReturnData) getVerifyUrlResponse.returnValue).url;
                        UrlParam urlParam = new UrlParam();
                        urlParam.ivScene = str;
                        urlParam.url = str4;
                        if (bundle != null) {
                            urlParam.showSkipButton = bundle.getBoolean(LoginConstant.ICBU_IV_SKIP, false);
                        }
                        LoginController.this.openUrl(context, urlParam);
                    }

                    @Override // com.ali.user.mobile.callback.RpcRequestCallback
                    public void onError(RpcResponse rpcResponse) {
                        IpChange ipChange3 = $ipChange;
                        if (ipChange3 instanceof IpChange) {
                            ipChange3.ipc$dispatch("4b349f7d", new Object[]{this, rpcResponse});
                        } else {
                            AnonymousClass10.access$300(AnonymousClass10.this, rpcResponse);
                        }
                    }
                });
            }

            private void errorBroadcast(RpcResponse rpcResponse) {
                String str2;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4cb53d4d", new Object[]{this, rpcResponse});
                    return;
                }
                int i2 = 1100;
                if (rpcResponse != null) {
                    i2 = rpcResponse.code;
                    str2 = rpcResponse.message;
                } else {
                    str2 = "";
                }
                BroadCastHelper.sendBroadcast(LoginAction.NOTIFY_IV_FAIL, false, i2, str2, "");
            }
        }, new Object[0]);
    }

    public void checkNickModifiable(final CheckResultCallback checkResultCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a259443f", new Object[]{this, checkResultCallback});
        } else if (checkResultCallback == null) {
        } else {
            new CoordinatorWrapper().execute(new AsyncTask<Object, Void, String>() { // from class: com.taobao.login4android.login.LoginController.11
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.os.AsyncTask
                public String doInBackground(Object[] objArr) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("db0124f4", new Object[]{this, objArr}) : Login.getDeviceTokenKey(Login.getUserId());
                }

                @Override // android.os.AsyncTask
                public void onPostExecute(String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("fe870167", new Object[]{this, str});
                    } else {
                        UrlFetchServiceImpl.getInstance().checkNickModifiable(new RpcRequestCallback() { // from class: com.taobao.login4android.login.LoginController.11.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // com.ali.user.mobile.callback.RpcRequestCallback
                            public void onSuccess(RpcResponse rpcResponse) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("2811f422", new Object[]{this, rpcResponse});
                                    return;
                                }
                                MtopCanChangeNickResponseData mtopCanChangeNickResponseData = (MtopCanChangeNickResponseData) rpcResponse;
                                if (mtopCanChangeNickResponseData == null) {
                                    return;
                                }
                                checkResultCallback.result(mtopCanChangeNickResponseData.success);
                            }

                            @Override // com.ali.user.mobile.callback.RpcRequestCallback
                            public void onError(RpcResponse rpcResponse) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("4b349f7d", new Object[]{this, rpcResponse});
                                } else {
                                    checkResultCallback.result(false);
                                }
                            }
                        });
                    }
                }
            }, new Object[0]);
        }
    }

    public void navToIVWithUserId(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2711aade", new Object[]{this, context, str, str2});
        } else {
            navToIVWithUserId(context, str, DataProviderFactory.getDataProvider().getSite(), str2);
        }
    }

    public void navToIVWithUserId(final Context context, final String str, final int i, final String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5af1a379", new Object[]{this, context, str, new Integer(i), str2});
        } else if (TextUtils.isEmpty(str)) {
            BroadCastHelper.sendBroadcast(LoginAction.NOTIFY_IV_FAIL, false, -3, LoginConstant.FETCH_IV_FAIL_INVALID_SCENE, "");
        } else if (TextUtils.isEmpty(str2)) {
            BroadCastHelper.sendBroadcast(LoginAction.NOTIFY_IV_FAIL, false, -2, LoginConstant.FETCH_IV_FAIL_INVALID_USERID, "");
        } else {
            new CoordinatorWrapper().execute(new AsyncTask<Object, Void, GetVerifyUrlResponse>() { // from class: com.taobao.login4android.login.LoginController.12
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.AsyncTask
                /* renamed from: doInBackground */
                public GetVerifyUrlResponse mo1128doInBackground(Object[] objArr) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (GetVerifyUrlResponse) ipChange2.ipc$dispatch("d9d8ec28", new Object[]{this, objArr});
                    }
                    VerifyParam verifyParam = new VerifyParam();
                    verifyParam.fromSite = i;
                    String str3 = str2;
                    verifyParam.userId = str3;
                    verifyParam.actionType = str;
                    verifyParam.deviceTokenKey = Login.getDeviceTokenKey(str3);
                    try {
                        return VerifyServiceImpl.getInstance().getNonLoginVerfiyUrl(verifyParam);
                    } catch (Exception e) {
                        e.printStackTrace();
                        return null;
                    }
                }

                @Override // android.os.AsyncTask
                public void onPostExecute(GetVerifyUrlResponse getVerifyUrlResponse) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("c4d1030f", new Object[]{this, getVerifyUrlResponse});
                    } else if (getVerifyUrlResponse == null) {
                        BroadCastHelper.sendBroadcast(LoginAction.NOTIFY_IV_FAIL, false, -1, "RET_NULL", "");
                    } else if (getVerifyUrlResponse.code != 3000) {
                        BroadCastHelper.sendBroadcast(LoginAction.NOTIFY_IV_FAIL, false, getVerifyUrlResponse.code, getVerifyUrlResponse.message, "");
                    } else if (getVerifyUrlResponse.returnValue != 0) {
                        if (TextUtils.isEmpty(((GetVerifyUrlReturnData) getVerifyUrlResponse.returnValue).url)) {
                            return;
                        }
                        UrlParam urlParam = new UrlParam();
                        urlParam.ivScene = str;
                        urlParam.url = ((GetVerifyUrlReturnData) getVerifyUrlResponse.returnValue).url;
                        urlParam.userid = str2;
                        LoginController.this.openUrl(context, urlParam);
                    } else {
                        BroadCastHelper.sendBroadcast(LoginAction.NOTIFY_IV_FAIL, false, -4, LoginConstant.FETCH_IV_FAIL_INVALID_RETURNVALUE, "");
                    }
                }
            }, new Object[0]);
        }
    }

    public void openUrl(Context context, UrlParam urlParam) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bddf525f", new Object[]{this, context, urlParam});
            return;
        }
        if (context == null) {
            context = DataProviderFactory.getApplicationContext();
        }
        if (urlParam != null && !TextUtils.isEmpty(urlParam.url)) {
            ((NavigatorService) ServiceFactory.getService(NavigatorService.class)).openWebViewPage(context, urlParam);
            return;
        }
        LoginTLogAdapter.e(TAG, "openUrl fail ,url=" + urlParam.url);
    }

    public void openScheme(Context context, UrlParam urlParam) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c667dd5", new Object[]{this, context, urlParam});
            return;
        }
        if (context == null) {
            context = DataProviderFactory.getApplicationContext();
        }
        if (urlParam != null && !TextUtils.isEmpty(urlParam.url)) {
            Intent intent = new Intent();
            intent.setData(Uri.parse(urlParam.url));
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            try {
                context.startActivity(intent);
                return;
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }
        }
        LoginTLogAdapter.e(TAG, "openScheme fail ,url=" + urlParam.url);
    }

    public boolean isLoginSDKInited() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("67f7c75", new Object[]{this})).booleanValue() : this.isAliuserSDKInited.get();
    }

    public void initAliuserSDK(DataProvider dataProvider) {
        boolean z;
        String[] strArr;
        int i;
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70939a60", new Object[]{this, dataProvider});
        } else if (this.isAliuserSDKInited.compareAndSet(false, true) || DataProviderFactory.getApplicationContext() == null) {
            LoginTLogAdapter.e(TAG, "start init AliuserSDK | isAliuserSDKInited:" + this.isAliuserSDKInited.get());
            LoginTLogAdapter.trace("init.login-tag", "initAliuserSDK: init start");
            registerAliuserActionReceiver();
            AliUserInit.init(dataProvider, new DataCallback<String>() { // from class: com.taobao.login4android.login.LoginController.13
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.ali.user.mobile.callback.DataCallback
                public void result(String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("dec15eee", new Object[]{this, str});
                        return;
                    }
                    if (LoginSwitch.isInABTestRegion("HarmonyLoginBackupDeleteAll", -1)) {
                        HarmonyLoginBackupImpl.deleteAllFileSync(DataProviderFactory.getApplicationContext());
                    }
                    LoginTLogAdapter.trace("init.login-tag", "initAliuserSDK: init end");
                    if (DataProviderFactory.getDataProvider().supportUninstallRelogin()) {
                        LoginTLogAdapter.trace(LoginController.TAG, "relogin: supportUninstallRelogin");
                        ReloginDelegate.handle();
                    } else if (!DataProviderFactory.getDataProvider().initWithAutoLogin()) {
                    } else {
                        String loginToken = Login.getLoginToken();
                        String userId = Login.getUserId();
                        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(loginToken) || TextUtils.isEmpty(userId)) {
                            return;
                        }
                        LoginController.getInstance().doAutoLoginWithCallback(loginToken, userId, SiteUtil.getDefaultLoginSite(), "", true, new AutoLoginCallback() { // from class: com.taobao.login4android.login.LoginController.13.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // com.ali.user.mobile.model.AutoLoginCallback
                            public void onBizFail(int i3, String str2) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("772d31f4", new Object[]{this, new Integer(i3), str2});
                                }
                            }

                            @Override // com.ali.user.mobile.model.AutoLoginCallback
                            public void onNetworkError() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("933d2000", new Object[]{this});
                                }
                            }

                            @Override // com.ali.user.mobile.model.AutoLoginCallback
                            public void onSuccess() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("d0e393ab", new Object[]{this});
                                }
                            }
                        });
                    }
                }
            });
            MainThreadExecutor.execute(new Runnable() { // from class: com.taobao.login4android.login.LoginController.14
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        LoginController.access$400(LoginController.this);
                    }
                }
            });
            try {
                SessionManager sessionManager = SessionManager.getInstance(DataProviderFactory.getApplicationContext());
                if (!LoginSwitch.getSwitch("checkHttpsCookie", "true")) {
                    return;
                }
                CookieManager cookieManager = CookieManager.getInstance();
                cookieManager.setAcceptCookie(true);
                String cookie = cookieManager.getCookie("https://.taobao.com");
                LoginTLogAdapter.e(TAG, "https.Cookie=" + cookie);
                Log.e(TAG, "https.Cookie=" + cookie);
                if (TextUtils.isEmpty(cookie)) {
                    z = false;
                } else {
                    String[] split = cookie.split(";");
                    String str = "";
                    String str2 = str;
                    for (int length = split.length; i2 < length; length = i) {
                        String str3 = split[i2];
                        if (!TextUtils.isEmpty(str3)) {
                            strArr = split;
                            i = length;
                            if (str3.trim().startsWith("unb")) {
                                str = str3.split("=")[1];
                                i2++;
                                split = strArr;
                            }
                        } else {
                            strArr = split;
                            i = length;
                        }
                        if (!TextUtils.isEmpty(str3) && str3.trim().startsWith("munb")) {
                            str2 = str3.split("=")[1];
                            i2++;
                            split = strArr;
                        }
                        i2++;
                        split = strArr;
                    }
                    z = true;
                    LoginTLogAdapter.e(TAG, "https.unb=" + str);
                    Log.e(TAG, "https.unb=" + str);
                    LoginTLogAdapter.e(TAG, "https.munb=" + str2);
                    Log.e(TAG, "https.munb=" + str2);
                    if (!TextUtils.equals(sessionManager.getUserId(), str) && (!TextUtils.isEmpty(str) || !TextUtils.equals(sessionManager.getUserId(), str2))) {
                        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
                            if (!sessionManager.recoverCookie()) {
                                sessionManager.setSessionExpiredTime(1L);
                            }
                            UserTrackAdapter.sendUT("https_unbIsNull");
                        } else {
                            sessionManager.setSessionExpiredTime(1L);
                            LoginTLogAdapter.e(TAG, "HttpsCookieSessionNotEqual:  cookie:" + cookie);
                            Log.e(TAG, "HttpsCookieSessionNotEqual:  cookie:" + cookie);
                            UserTrackAdapter.sendUT("https_SessionNotEqual");
                            sessionManager.clearSessionOnlyCookie();
                            String cookie2 = cookieManager.getCookie("https://.taobao.com");
                            LoginTLogAdapter.e(TAG, "HttpsSessionNotEqual, afterClear, cookieStr= " + cookie2);
                            Log.e(TAG, "HttpsSessionNotEqual, afterClear, cookieStr= " + cookie2);
                        }
                    }
                }
                LoginTLogAdapter.e(TAG, "https.check isSessionValid = " + z);
            } catch (Throwable th) {
                th.printStackTrace();
                LoginTLogAdapter.e(TAG, "CheckHttpsCookieException");
            }
        }
    }

    private void addLoginPlugin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f7147a2", new Object[]{this});
            return;
        }
        SDKJSBridgeService.register();
        try {
            q.a("Scancode", (Class<? extends e>) ScancodeCallback.class, true);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        JSBridgeService.register();
        ExecutorJSBridge.register();
    }

    public boolean processAutoLoginResponse(RpcResponse<LoginReturnData> rpcResponse, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("aa6aba7e", new Object[]{this, rpcResponse, new Boolean(z)})).booleanValue() : processAutoLoginResponse(rpcResponse, z, true, null);
    }

    public boolean processAutoLoginResponse(RpcResponse<LoginReturnData> rpcResponse, boolean z, boolean z2, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6de5b2fe", new Object[]{this, rpcResponse, new Boolean(z), new Boolean(z2), bundle})).booleanValue();
        }
        if (rpcResponse == null || !"SUCCESS".equals(rpcResponse.actionType)) {
            processNetworkError(rpcResponse, z, z2, bundle);
            return false;
        }
        try {
            LoginReturnData loginReturnData = rpcResponse.returnValue;
            HashMap hashMap = new HashMap();
            hashMap.put(LoginConstants.LOGIN_TYPE, LoginType.ServerLoginType.AutoLogin.getType());
            LoginDataHelper.processLoginReturnData(z2, loginReturnData, hashMap);
            if (loginReturnData.extMap != null && "true".equals(loginReturnData.extMap.get("autoLoginRateLimit")) && System.currentTimeMillis() > this.autoLoginLimitExpireTime) {
                this.autoLoginRateLimit = true;
                this.autoLoginLimitExpireTime = System.currentTimeMillis() + (Long.parseLong(loginReturnData.extMap.get("autoLoginLimitPeriod")) * 1000);
                this.autoLoginLeftToLimitCount = Integer.parseInt(loginReturnData.extMap.get("autoLoginLimitCount"));
            }
            return true;
        } catch (Exception unused) {
            if (z) {
                userLogin(z, z2, bundle);
            } else if (z2) {
                BroadCastHelper.sendBroadcast(LoginAction.NOTIFY_LOGIN_FAILED, false, 726, "process response exception", this.browserRefUrl);
            }
            return false;
        }
    }

    private void registerAliuserActionReceiver() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72c6a932", new Object[]{this});
            return;
        }
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(LoginResActions.LOGIN_CANCEL_ACTION);
            intentFilter.addAction(LoginResActions.LOGIN_FAIL_ACTION);
            intentFilter.addAction(LoginResActions.LOGIN_SUCCESS_ACTION);
            intentFilter.addAction(LoginResActions.LOGIN_OPEN_ACTION);
            intentFilter.addAction(LoginResActions.LOGIN_NETWORK_ERROR);
            intentFilter.addAction(LoginResActions.WEB_ACTIVITY_CANCEL);
            intentFilter.addAction(LoginResActions.WEB_ACTIVITY_RESULT);
            intentFilter.addAction(LoginResActions.REG_CANCEL);
            intentFilter.addAction(AppInfo.INITED_ACTION);
            intentFilter.addAction(Constants.RESET_LOGIN_STATUS);
            intentFilter.setPriority(1000);
            LocalBroadcastManager.getInstance(DataProviderFactory.getApplicationContext()).registerReceiver(new AliuserActionReceiver(), intentFilter);
            IntentFilter intentFilter2 = new IntentFilter();
            intentFilter2.addAction("com.ali.user.sdk.login.TEST_ACCOUNT_SSO");
            DataProviderFactory.getApplicationContext().registerReceiver(new LoginTestBroadcastReceiver(), intentFilter2);
            LoginTLogAdapter.e("AliuserActionReceiver", "register receiver");
        } catch (Throwable th) {
            th.printStackTrace();
        }
        try {
            IntentFilter intentFilter3 = new IntentFilter();
            intentFilter3.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            DataProviderFactory.getApplicationContext().registerReceiver(new StatusReceiver(), intentFilter3);
        } catch (Exception e) {
            LoginTLogAdapter.w("register status receiver error", e);
        }
    }

    public void applyToken(InternalTokenCallback internalTokenCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eaad9e4", new Object[]{this, internalTokenCallback});
        } else {
            applyToken(DataProviderFactory.getDataProvider().getSite(), internalTokenCallback);
        }
    }

    public void applyToken(final int i, final InternalTokenCallback internalTokenCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52967183", new Object[]{this, new Integer(i), internalTokenCallback});
        } else if (internalTokenCallback == null) {
        } else {
            try {
                if (Login.session != null) {
                    BackgroundExecutor.execute(new Runnable() { // from class: com.taobao.login4android.login.LoginController.15
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            Runnable runnable;
                            long currentTimeMillis;
                            long j;
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            final String oneTimeToken = Login.getOneTimeToken();
                            if (oneTimeToken != null) {
                                MainThreadExecutor.execute(new Runnable() { // from class: com.taobao.login4android.login.LoginController.15.1
                                    public static volatile transient /* synthetic */ IpChange $ipChange;

                                    @Override // java.lang.Runnable
                                    public void run() {
                                        IpChange ipChange3 = $ipChange;
                                        if (ipChange3 instanceof IpChange) {
                                            ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                        } else {
                                            internalTokenCallback.onSucess(oneTimeToken);
                                        }
                                    }
                                });
                            } else if (TextUtils.isEmpty(Login.session.getUserId())) {
                                MainThreadExecutor.execute(new Runnable() { // from class: com.taobao.login4android.login.LoginController.15.2
                                    public static volatile transient /* synthetic */ IpChange $ipChange;

                                    @Override // java.lang.Runnable
                                    public void run() {
                                        IpChange ipChange3 = $ipChange;
                                        if (ipChange3 instanceof IpChange) {
                                            ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                        } else {
                                            internalTokenCallback.onFail(LoginConstant.FETCH_TOKEN_FAIL_SESSION_INVALID, "Session is null or Session is invalid.");
                                        }
                                    }
                                });
                            } else {
                                try {
                                    final RpcResponse<MLoginTokenReturnValue> applyToken = UserLoginServiceImpl.getInstance().applyToken(i, Login.session.getUserId(), null);
                                    if (applyToken == null) {
                                        AppMonitorAdapter.commitFail("Page_Member_Other", "GetHavanaSSOtoken", "0", "");
                                        MainThreadExecutor.execute(new Runnable() { // from class: com.taobao.login4android.login.LoginController.15.3
                                            public static volatile transient /* synthetic */ IpChange $ipChange;

                                            @Override // java.lang.Runnable
                                            public void run() {
                                                IpChange ipChange3 = $ipChange;
                                                if (ipChange3 instanceof IpChange) {
                                                    ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                                } else {
                                                    internalTokenCallback.onFail("RET_NULL", "apply token return null.");
                                                }
                                            }
                                        });
                                        return;
                                    }
                                    if (applyToken.code != 3000 || applyToken.returnValue == null) {
                                        AppMonitorAdapter.commitFail("Page_Member_Other", "GetHavanaSSOtoken", "0", String.valueOf(applyToken.code));
                                        if (applyToken.code != 13032) {
                                            MainThreadExecutor.execute(new Runnable() { // from class: com.taobao.login4android.login.LoginController.15.5
                                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                                @Override // java.lang.Runnable
                                                public void run() {
                                                    IpChange ipChange3 = $ipChange;
                                                    if (ipChange3 instanceof IpChange) {
                                                        ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                                    } else {
                                                        internalTokenCallback.onFail(LoginConstant.FETCH_TOKEN_FAIL_NOT_SESSION_INVALID, "网络获取旺信token失败，非session失效");
                                                    }
                                                }
                                            });
                                            Login.setHavanaSsoTokenExpiredTime(0L);
                                            Login.setOneTimeToken(null);
                                            return;
                                        }
                                        RpcResponse<LoginReturnData> autoLogin = new AutoLoginBusiness().autoLogin(Login.getLoginToken(), Login.getUserId(), SiteUtil.getDefaultLoginSite(), ApiReferer.generateApiReferer());
                                        if (autoLogin != null && "SUCCESS".equals(autoLogin.actionType)) {
                                            LoginController.this.processAutoLoginResponse(autoLogin, false);
                                            final String oneTimeToken2 = Login.getOneTimeToken();
                                            MainThreadExecutor.execute(new Runnable() { // from class: com.taobao.login4android.login.LoginController.15.7
                                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                                @Override // java.lang.Runnable
                                                public void run() {
                                                    IpChange ipChange3 = $ipChange;
                                                    if (ipChange3 instanceof IpChange) {
                                                        ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                                    } else {
                                                        internalTokenCallback.onSucess(oneTimeToken2);
                                                    }
                                                }
                                            });
                                            return;
                                        }
                                        runnable = new Runnable() { // from class: com.taobao.login4android.login.LoginController.15.6
                                            public static volatile transient /* synthetic */ IpChange $ipChange;

                                            @Override // java.lang.Runnable
                                            public void run() {
                                                IpChange ipChange3 = $ipChange;
                                                if (ipChange3 instanceof IpChange) {
                                                    ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                                    return;
                                                }
                                                InternalTokenCallback internalTokenCallback2 = internalTokenCallback;
                                                internalTokenCallback2.onFail(LoginConstant.FETCH_TOKEN_FAIL_AUTO_LOGIN_FAIL, applyToken.message + ", mtop autoLoginFail");
                                            }
                                        };
                                    } else {
                                        AppMonitorAdapter.commitSuccess("Page_Member_Other", "GetHavanaSSOtoken");
                                        int i2 = applyToken.returnValue.expireTime;
                                        if (i2 == 0) {
                                            currentTimeMillis = System.currentTimeMillis() / 1000;
                                            j = 900;
                                        } else {
                                            currentTimeMillis = System.currentTimeMillis() / 1000;
                                            j = i2;
                                        }
                                        Login.setHavanaSsoTokenExpiredTime(currentTimeMillis + j);
                                        Login.setOneTimeToken(applyToken.returnValue.token);
                                        runnable = new Runnable() { // from class: com.taobao.login4android.login.LoginController.15.4
                                            public static volatile transient /* synthetic */ IpChange $ipChange;

                                            @Override // java.lang.Runnable
                                            public void run() {
                                                IpChange ipChange3 = $ipChange;
                                                if (ipChange3 instanceof IpChange) {
                                                    ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                                } else {
                                                    internalTokenCallback.onSucess(((MLoginTokenReturnValue) applyToken.returnValue).token);
                                                }
                                            }
                                        };
                                    }
                                    MainThreadExecutor.execute(runnable);
                                } catch (RpcException e) {
                                    e.printStackTrace();
                                    LoginTLogAdapter.e(LoginController.TAG, e);
                                    MainThreadExecutor.execute(new Runnable() { // from class: com.taobao.login4android.login.LoginController.15.8
                                        public static volatile transient /* synthetic */ IpChange $ipChange;

                                        @Override // java.lang.Runnable
                                        public void run() {
                                            IpChange ipChange3 = $ipChange;
                                            if (ipChange3 instanceof IpChange) {
                                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                                return;
                                            }
                                            InternalTokenCallback internalTokenCallback2 = internalTokenCallback;
                                            internalTokenCallback2.onFail(LoginConstant.FETCH_TOKEN_FAIL_EXCEPTION, e.getMessage() + "|" + e.getExtCode());
                                        }
                                    });
                                } catch (Exception e2) {
                                    e2.printStackTrace();
                                    LoginTLogAdapter.e(LoginController.TAG, e2);
                                    MainThreadExecutor.execute(new Runnable() { // from class: com.taobao.login4android.login.LoginController.15.9
                                        public static volatile transient /* synthetic */ IpChange $ipChange;

                                        @Override // java.lang.Runnable
                                        public void run() {
                                            IpChange ipChange3 = $ipChange;
                                            if (ipChange3 instanceof IpChange) {
                                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                            } else {
                                                internalTokenCallback.onFail(LoginConstant.FETCH_TOKEN_FAIL_EXCEPTION, e2.getMessage());
                                            }
                                        }
                                    });
                                }
                            }
                        }
                    });
                } else {
                    internalTokenCallback.onFail(LoginConstant.FETCH_TOKEN_FAIL_SESSION_INVALID, "Session is null or Session is invalid.");
                }
            } catch (Exception e) {
                e.printStackTrace();
                LoginTLogAdapter.e(TAG, e);
                internalTokenCallback.onFail(LoginConstant.FETCH_TOKEN_FAIL_EXCEPTION, e.getMessage());
            }
        }
    }

    public void applyTokenWithRemoteBiz(int i, String str, InternalTokenCallback internalTokenCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a87fe8fc", new Object[]{this, new Integer(i), str, internalTokenCallback});
        } else {
            applyTokenWithRemoteBiz(i, str, null, true, internalTokenCallback);
        }
    }

    public void applyTokenWithRemoteBiz(int i, String str, Map<String, String> map, boolean z, final InternalTokenCallback internalTokenCallback) {
        HistoryAccount findHistoryAccount;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eca5b3ab", new Object[]{this, new Integer(i), str, map, new Boolean(z), internalTokenCallback});
        } else if (internalTokenCallback == null) {
        } else {
            RpcRequest rpcRequest = new RpcRequest();
            rpcRequest.API_NAME = "com.taobao.mtop.mLoginTokenService.applySsoToken";
            rpcRequest.VERSION = "1.1";
            rpcRequest.addParam("ext", JSON.toJSONString(new HashMap()));
            rpcRequest.NEED_ECODE = true;
            rpcRequest.NEED_SESSION = true;
            if (map != null) {
                rpcRequest.addParam("ext", JSON.toJSONString(map));
            }
            ApplyTokenRequest applyTokenRequest = new ApplyTokenRequest();
            applyTokenRequest.appName = DataProviderFactory.getDataProvider().getAppkey();
            applyTokenRequest.t = System.currentTimeMillis();
            applyTokenRequest.appVersion = AppInfo.getInstance().getAndroidAppVersion();
            applyTokenRequest.sdkVersion = AppInfo.getInstance().getSdkVersion();
            applyTokenRequest.site = i;
            rpcRequest.requestSite = i;
            if (!TextUtils.isEmpty(str) && (findHistoryAccount = SecurityGuardManagerWraper.findHistoryAccount(Long.parseLong(str))) != null) {
                applyTokenRequest.deviceTokenKey = findHistoryAccount.tokenKey;
                DeviceTokenSignParam deviceTokenSignParam = new DeviceTokenSignParam();
                if (!TextUtils.isEmpty(DataProviderFactory.getDataProvider().getAppkey())) {
                    deviceTokenSignParam.addAppKey(DataProviderFactory.getDataProvider().getAppkey());
                }
                deviceTokenSignParam.addAppVersion(AppInfo.getInstance().getAndroidAppVersion());
                deviceTokenSignParam.addHavanaId(str);
                deviceTokenSignParam.addTimestamp(String.valueOf(applyTokenRequest.t));
                deviceTokenSignParam.addSDKVersion(AppInfo.getInstance().getSdkVersion());
                if (!TextUtils.isEmpty(findHistoryAccount.tokenKey)) {
                    applyTokenRequest.deviceTokenSign = AlibabaSecurityTokenService.sign(findHistoryAccount.tokenKey, deviceTokenSignParam.build());
                }
            }
            rpcRequest.addParam("request", JSON.toJSONString(applyTokenRequest));
            rpcRequest.SHOW_LOGIN_UI = z;
            ((RpcService) ServiceFactory.getService(RpcService.class)).remoteBusiness(rpcRequest, LoginTokenResponseData.class, new RpcRequestCallback() { // from class: com.taobao.login4android.login.LoginController.16
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.ali.user.mobile.callback.RpcRequestCallback
                public void onSuccess(RpcResponse rpcResponse) {
                    long currentTimeMillis;
                    long j;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("2811f422", new Object[]{this, rpcResponse});
                    } else if (rpcResponse instanceof LoginTokenResponseData) {
                        final LoginTokenResponseData loginTokenResponseData = (LoginTokenResponseData) rpcResponse;
                        AppMonitorAdapter.commitSuccess("Page_Member_Other", "GetHavanaSSOtoken");
                        int i2 = ((MLoginTokenReturnValue) loginTokenResponseData.returnValue).expireTime;
                        if (i2 == 0) {
                            currentTimeMillis = System.currentTimeMillis() / 1000;
                            j = 900;
                        } else {
                            currentTimeMillis = System.currentTimeMillis() / 1000;
                            j = i2;
                        }
                        Login.setHavanaSsoTokenExpiredTime(currentTimeMillis + j);
                        Login.setOneTimeToken(((MLoginTokenReturnValue) loginTokenResponseData.returnValue).token);
                        MainThreadExecutor.execute(new Runnable() { // from class: com.taobao.login4android.login.LoginController.16.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                } else {
                                    internalTokenCallback.onSucess(((MLoginTokenReturnValue) loginTokenResponseData.returnValue).token);
                                }
                            }
                        });
                    } else {
                        internalTokenCallback.onFail("RET_NULL", rpcResponse.message);
                    }
                }

                @Override // com.ali.user.mobile.callback.RpcRequestCallback
                public void onError(RpcResponse rpcResponse) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("4b349f7d", new Object[]{this, rpcResponse});
                    } else {
                        internalTokenCallback.onFail("RET_NULL", rpcResponse.message);
                    }
                }
            });
        }
    }

    public void navByScheme(String str, String str2, final String str3, final String str4, final CommonCallback commonCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("470edbf", new Object[]{this, str, str2, str3, str4, commonCallback});
            return;
        }
        RpcRequest rpcRequest = new RpcRequest();
        rpcRequest.API_NAME = ApiConstants.ApiName.APPLY_SSO_TOKEN_V2;
        rpcRequest.VERSION = "1.0";
        rpcRequest.NEED_ECODE = true;
        rpcRequest.NEED_SESSION = true;
        rpcRequest.requestSite = DataProviderFactory.getDataProvider().getSite();
        final ApplySsoTokenRequest applySsoTokenRequest = new ApplySsoTokenRequest();
        applySsoTokenRequest.slaveAppKey = str;
        applySsoTokenRequest.masterAppKey = DataProviderFactory.getDataProvider().getAppkey();
        applySsoTokenRequest.ssoVersion = SSOIPCConstants.CURRENT_SSO_MINI_PROGRAM;
        applySsoTokenRequest.targetUrl = "hap://app/" + str2 + "/SsoLoginMid?visa=8617ab96f88d12c0";
        applySsoTokenRequest.slaveBundleId = applySsoTokenRequest.targetUrl;
        applySsoTokenRequest.hid = Login.getUserId();
        rpcRequest.addParam(ApiConstants.ApiField.SSO_TOKEN_APPLY_REQUEST, JSON.toJSONString(applySsoTokenRequest));
        rpcRequest.addParam("riskControlInfo", JSON.toJSONString(SecurityGuardManagerWraper.buildWSecurityData()));
        rpcRequest.addParam("ext", JSON.toJSONString(new HashMap()));
        ((RpcService) ServiceFactory.getService(RpcService.class)).remoteBusiness(rpcRequest, SSOV2ApplySsoTokenResponseData.class, new RpcRequestCallback() { // from class: com.taobao.login4android.login.LoginController.17
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.ali.user.mobile.callback.RpcRequestCallback
            public void onSuccess(RpcResponse rpcResponse) {
                SSOV2ApplySsoTokenResponseData sSOV2ApplySsoTokenResponseData;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("2811f422", new Object[]{this, rpcResponse});
                } else if (rpcResponse != null) {
                    Intent intent = new Intent();
                    String str5 = applySsoTokenRequest.targetUrl;
                    SSOMasterParam sSOMasterParam = new SSOMasterParam();
                    sSOMasterParam.appKey = DataProviderFactory.getDataProvider().getAppkey();
                    sSOMasterParam.ssoToken = (String) ((SSOV2ApplySsoTokenResponseData) rpcResponse).returnValue;
                    sSOMasterParam.t = System.currentTimeMillis();
                    sSOMasterParam.userId = Login.getUserId();
                    sSOMasterParam.ssoVersion = SSOIPCConstants.CURRENT_SSO_MINI_PROGRAM;
                    try {
                        sSOMasterParam.sign = SSOSecurityService.getInstace(DataProviderFactory.getApplicationContext()).sign(sSOMasterParam.appKey, sSOMasterParam.toMap());
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    intent.setData(Uri.parse(((str5 + "&resultCode=500") + "&ssoToken=" + ((String) sSOV2ApplySsoTokenResponseData.returnValue)) + "&sourceAppKey=" + sSOMasterParam.appKey + "&ssoVersion=" + sSOMasterParam.ssoVersion + "&" + SSOIPCConstants.IPC_MASTER_T + "=" + sSOMasterParam.t + "&userId=" + sSOMasterParam.userId + "&sign=" + sSOMasterParam.sign + "&" + SSOIPCConstants.IPC_JUMP_URL + "=" + Uri.encode(str3)));
                    if (!TextUtils.isEmpty(str4)) {
                        intent.setAction(str4);
                    } else {
                        intent.setAction("android.intent.action.VIEW");
                    }
                    List<ResolveInfo> queryIntentActivities = DataProviderFactory.getApplicationContext().getPackageManager().queryIntentActivities(intent, 0);
                    ResolveInfo resolveInfo = null;
                    if (queryIntentActivities != null) {
                        for (ResolveInfo resolveInfo2 : queryIntentActivities) {
                            String str6 = resolveInfo2.activityInfo.packageName;
                            String config = LoginSwitch.getConfig(LoginSwitch.SUPPORT_MINI_PROGRAME, "");
                            if (!TextUtils.isEmpty(config)) {
                                try {
                                } catch (JSONException e2) {
                                    e2.printStackTrace();
                                }
                                if (new JSONObject(config).optBoolean(str6)) {
                                }
                            }
                            resolveInfo = resolveInfo2;
                        }
                    }
                    if (resolveInfo != null) {
                        intent.setFlags(268435456);
                        intent.setPackage(resolveInfo.activityInfo.packageName);
                        try {
                            DataProviderFactory.getApplicationContext().startActivity(intent);
                            if (commonCallback == null) {
                                return;
                            }
                            commonCallback.onSuccess();
                            return;
                        } catch (Throwable th) {
                            th.printStackTrace();
                            CommonCallback commonCallback2 = commonCallback;
                            if (commonCallback2 == null) {
                                return;
                            }
                            commonCallback2.onFail(1001, "start activity failed");
                            return;
                        }
                    }
                    CommonCallback commonCallback3 = commonCallback;
                    if (commonCallback3 == null) {
                        return;
                    }
                    commonCallback3.onFail(1002, "can't find packageName");
                }
            }

            @Override // com.ali.user.mobile.callback.RpcRequestCallback
            public void onError(RpcResponse rpcResponse) {
                String str5;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4b349f7d", new Object[]{this, rpcResponse});
                } else if (commonCallback == null) {
                } else {
                    int i = 1001;
                    if (rpcResponse != null) {
                        i = rpcResponse.code;
                        str5 = rpcResponse.message;
                    } else {
                        str5 = "unknown error";
                    }
                    commonCallback.onFail(i, str5);
                }
            }
        });
    }
}
