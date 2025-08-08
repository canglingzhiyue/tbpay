package com.taobao.login4android.jsbridge;

import android.app.Activity;
import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.q;
import android.taobao.windvane.jsbridge.r;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.ali.user.mobile.app.LoginContext;
import com.ali.user.mobile.app.constant.UTConstant;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.mobile.base.UIBaseConstants;
import com.ali.user.mobile.callback.CommonDataCallback;
import com.ali.user.mobile.callback.DataCallback;
import com.ali.user.mobile.callback.LoginTasksCallback;
import com.ali.user.mobile.coordinator.CoordinatorWrapper;
import com.ali.user.mobile.exception.LoginException;
import com.ali.user.mobile.info.AppInfo;
import com.ali.user.mobile.log.ApiReferer;
import com.ali.user.mobile.log.UserTrackAdapter;
import com.ali.user.mobile.login.LoginApi;
import com.ali.user.mobile.login.model.AppLaunchInfo;
import com.ali.user.mobile.login.model.AppLaunchInfoResponseData;
import com.ali.user.mobile.login.model.LoginConstant;
import com.ali.user.mobile.login.model.LoginPopInfo;
import com.ali.user.mobile.login.presenter.RecommendLoginPresenter;
import com.ali.user.mobile.login.ui.UserLoginActivity;
import com.ali.user.mobile.model.LoginParam;
import com.ali.user.mobile.model.LoginType;
import com.ali.user.mobile.rpc.HistoryAccount;
import com.ali.user.mobile.rpc.RpcResponse;
import com.ali.user.mobile.rpc.login.model.LoginReturnData;
import com.ali.user.mobile.security.SecurityGuardManagerWraper;
import com.ali.user.mobile.service.NavigatorService;
import com.ali.user.mobile.service.NumberAuthService;
import com.ali.user.mobile.service.ServiceFactory;
import com.ali.user.mobile.ui.widget.AUProgressDialog;
import com.ali.user.mobile.utils.CollectionUtils;
import com.ali.user.mobile.utils.MainThreadExecutor;
import com.ali.user.mobile.utils.ResourceUtil;
import com.ali.user.mobile.utils.StringUtil;
import com.ali.user.open.core.AliMemberSDK;
import com.ali.user.open.oauth.OauthService;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.wireless.security.SecExceptionCode;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.android.sns4android.SNSPlatform;
import com.taobao.android.sns4android.c;
import com.taobao.login4android.Login;
import com.taobao.login4android.broadcast.LoginAction;
import com.taobao.login4android.broadcast.LoginBroadcastHelper;
import com.taobao.login4android.constants.LoginStatus;
import com.taobao.login4android.init.loginbar.LoginBarController;
import com.taobao.login4android.log.LoginTLogAdapter;
import com.taobao.login4android.login.ReloginDelegate;
import com.taobao.login4android.utils.LoginSwitch;
import com.taobao.login4android.utils.ToastUtil;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.kge;
import tb.riy;

/* loaded from: classes7.dex */
public class PopJSBridge extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static int GET_BAR_INFO_CHECK_LOGIN_FAILED = 0;
    private static int GET_BAR_INFO_EMPTY = 0;
    private static int GET_BAR_INFO_EXCEPTION = 0;
    private static int GET_BAR_PARAM_ERROR = 0;
    private static final int LOGIN_ALIPAY = 77;
    private static final String TAG = "login.PopJSBridge";
    public static Boolean homepageFirstResumed;
    public static boolean markNotShow;
    private AppLaunchInfo appLaunchInfo;
    private HistoryAccount historyAccount;
    private LoginPopInfo loginPopInfo;
    private BroadcastReceiver mLoginReceiver;
    private String source;

    /* renamed from: com.taobao.login4android.jsbridge.PopJSBridge$7  reason: invalid class name */
    /* loaded from: classes7.dex */
    public static /* synthetic */ class AnonymousClass7 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f17881a = new int[LoginAction.values().length];

        static {
            try {
                f17881a[LoginAction.NOTIFY_LOGIN_SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17881a[LoginAction.NOTIFY_LOGIN_FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17881a[LoginAction.NOTIFY_LOGIN_CANCEL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17881a[LoginAction.NOTIFY_REGISTER_CANCEL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static /* synthetic */ Object ipc$super(PopJSBridge popJSBridge, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void access$000(PopJSBridge popJSBridge, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a838203", new Object[]{popJSBridge, wVCallBackContext});
        } else {
            popJSBridge.doWhenReceiveSuccess(wVCallBackContext);
        }
    }

    public static /* synthetic */ void access$100(PopJSBridge popJSBridge, String str, HashMap hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b984ea64", new Object[]{popJSBridge, str, hashMap});
        } else {
            popJSBridge.track(str, hashMap);
        }
    }

    public static /* synthetic */ void access$1000(PopJSBridge popJSBridge, WVCallBackContext wVCallBackContext, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7e2d188", new Object[]{popJSBridge, wVCallBackContext, str, str2});
        } else {
            popJSBridge.failCallback(wVCallBackContext, str, str2);
        }
    }

    public static /* synthetic */ int access$1100() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7ad12fda", new Object[0])).intValue() : GET_BAR_INFO_EXCEPTION;
    }

    public static /* synthetic */ void access$200(PopJSBridge popJSBridge, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("355cfc41", new Object[]{popJSBridge, wVCallBackContext});
        } else {
            popJSBridge.doWhenReceivedCancel(wVCallBackContext);
        }
    }

    public static /* synthetic */ void access$300(PopJSBridge popJSBridge, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d831741", new Object[]{popJSBridge, str, str2, str3});
        } else {
            popJSBridge.trackFailure(str, str2, str3);
        }
    }

    public static /* synthetic */ void access$400(PopJSBridge popJSBridge) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdf34c42", new Object[]{popJSBridge});
        } else {
            popJSBridge.handleLoginSuccess();
        }
    }

    public static /* synthetic */ String access$500(PopJSBridge popJSBridge) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6f9027df", new Object[]{popJSBridge}) : popJSBridge.source;
    }

    public static /* synthetic */ void access$600(PopJSBridge popJSBridge, JSONObject jSONObject, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf91b0ad", new Object[]{popJSBridge, jSONObject, wVCallBackContext});
        } else {
            popJSBridge.requestPopInfo(jSONObject, wVCallBackContext);
        }
    }

    public static /* synthetic */ boolean access$700(PopJSBridge popJSBridge) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4c45c823", new Object[]{popJSBridge})).booleanValue() : popJSBridge.iSupportAlipay();
    }

    public static /* synthetic */ Context access$800(PopJSBridge popJSBridge) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("c454cbb6", new Object[]{popJSBridge}) : popJSBridge.mContext;
    }

    public static /* synthetic */ int access$900() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("98ee1cb3", new Object[0])).intValue() : GET_BAR_INFO_EMPTY;
    }

    static {
        kge.a(102443876);
        GET_BAR_PARAM_ERROR = 1700;
        GET_BAR_INFO_EMPTY = SecExceptionCode.SEC_ERROR_AVMP_SAFETOKEN_INVALID_PARAM;
        GET_BAR_INFO_EXCEPTION = 1702;
        GET_BAR_INFO_CHECK_LOGIN_FAILED = 1703;
        homepageFirstResumed = null;
        markNotShow = false;
    }

    public static void register() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a23a9aa", new Object[0]);
            return;
        }
        try {
            q.a("aluPopJSBridge", (Class<? extends e>) PopJSBridge.class);
        } catch (Exception unused) {
        }
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        JSONObject jSONObject;
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        String str4 = "execute() called with: action = [" + str + "], jsonParams = [" + str2 + "], context = [" + getContext() + riy.ARRAY_END_STR;
        try {
            jSONObject = JSONObject.parseObject(str2);
        } catch (Exception e) {
            e.printStackTrace();
            jSONObject = null;
        }
        if ("getLoginBarData".equals(str)) {
            getBarData(jSONObject, wVCallBackContext);
            return true;
        } else if ("getLoginPopData".equals(str)) {
            try {
                handleGetPopData(str2, wVCallBackContext);
            } catch (Exception e2) {
                e2.printStackTrace();
                wVCallBackContext.error();
            }
            return true;
        } else if (LoginType.LocalLoginType.SIM_LOGIN.equals(str)) {
            handleSimLogin(jSONObject, wVCallBackContext);
            return true;
        } else if (LoginType.LocalLoginType.LOGIN_TYPE_ALIPAY.equals(str)) {
            handleAlipayLogin(jSONObject, wVCallBackContext);
            return true;
        } else if (!"sdkLogin".equals(str)) {
            return false;
        } else {
            try {
                str3 = jSONObject.getString("loginPage");
            } catch (Exception e3) {
                e3.printStackTrace();
                str3 = "";
            }
            registerBroadcast(wVCallBackContext, 0, null);
            LoginContext.mFrom = this.source;
            Bundle bundle = new Bundle();
            bundle.putString("source", this.source);
            if (StringUtils.equals(str3, "recommendloginpage")) {
                bundle.putBoolean(LoginConstant.LAUNCH_PASS_GUIDE_FRAGMENT, true);
                bundle.putBoolean(LoginConstant.FORCE_NORMAL_MODE, true);
                bundle.putString(UIBaseConstants.LoginPage.PAGE_LOGIN_TYPE, UIBaseConstants.LoginPage.PAGE_RECOMMEND_LOGIN);
                ((NavigatorService) ServiceFactory.getService(NavigatorService.class)).openLoginPage(getContext(), ApiReferer.generateApiReferer(), bundle);
            } else {
                Login.login(true, bundle);
            }
            LoginBarController.showLoginBar();
            track("login_pop_sdkLogin_call", null);
            return true;
        }
    }

    private void registerBroadcast(final WVCallBackContext wVCallBackContext, final int i, final Dialog dialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a604d7da", new Object[]{this, wVCallBackContext, new Integer(i), dialog});
            return;
        }
        this.mLoginReceiver = new BroadcastReceiver() { // from class: com.taobao.login4android.jsbridge.PopJSBridge.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                PopJSBridge popJSBridge;
                String str;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                } else if (intent == null) {
                } else {
                    Log.e(PopJSBridge.TAG, "onReceive: " + intent.getAction());
                    LoginAction valueOf = LoginAction.valueOf(intent.getAction());
                    if (valueOf == null) {
                        return;
                    }
                    int i2 = AnonymousClass7.f17881a[valueOf.ordinal()];
                    if (i2 == 1) {
                        PopJSBridge.access$000(PopJSBridge.this, wVCallBackContext);
                        if (i == 77) {
                            PopJSBridge.access$100(PopJSBridge.this, "login_pop_alipayLogin_success", null);
                        }
                    } else if (i2 == 2) {
                        if (i == 77) {
                            PopJSBridge.access$100(PopJSBridge.this, "login_pop_alipayLogin_error", null);
                        }
                        ToastUtil.showToast(context, intent.getStringExtra("message"), 0);
                    } else if (i2 == 3) {
                        PopJSBridge.access$200(PopJSBridge.this, wVCallBackContext);
                        if (i == 77) {
                            popJSBridge = PopJSBridge.this;
                            str = "login_cancel";
                            PopJSBridge.access$300(popJSBridge, "login_pop_alipayLogin_cancel", "-1113", str);
                        }
                    } else if (i2 == 4) {
                        PopJSBridge.access$200(PopJSBridge.this, wVCallBackContext);
                        if (i == 77) {
                            popJSBridge = PopJSBridge.this;
                            str = "register_cancel";
                            PopJSBridge.access$300(popJSBridge, "login_pop_alipayLogin_cancel", "-1113", str);
                        }
                    }
                    try {
                        if (dialog == null) {
                            return;
                        }
                        dialog.dismiss();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        LoginBroadcastHelper.registerLoginReceiver(DataProviderFactory.getApplicationContext(), this.mLoginReceiver);
    }

    private void doWhenReceiveSuccess(WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71be28a9", new Object[]{this, wVCallBackContext});
            return;
        }
        if (wVCallBackContext != null) {
            wVCallBackContext.success();
        }
        if (this.mLoginReceiver != null) {
            LoginBroadcastHelper.unregisterLoginReceiver(DataProviderFactory.getApplicationContext(), this.mLoginReceiver);
            this.mLoginReceiver = null;
        }
        handleLoginSuccess();
        LoginContext.mFrom = null;
    }

    private void doWhenReceivedCancel(WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99e383c4", new Object[]{this, wVCallBackContext});
            return;
        }
        if (wVCallBackContext != null) {
            wVCallBackContext.error();
        }
        if (this.mLoginReceiver != null) {
            LoginBroadcastHelper.unregisterLoginReceiver(DataProviderFactory.getApplicationContext(), this.mLoginReceiver);
            this.mLoginReceiver = null;
        }
        LoginContext.mFrom = null;
    }

    private void handleSimLogin(JSONObject jSONObject, final WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7efbee2c", new Object[]{this, jSONObject, wVCallBackContext});
            return;
        }
        try {
            track("login_pop_simLogin_commit", null);
            LoginParam loginParam = new LoginParam();
            loginParam.source = this.source;
            loginParam.sdkTraceId = ApiReferer.generateTraceId(this.source, UTConstant.PageName.UT_PAGE_EXTEND);
            LoginContext.mFrom = this.source;
            final AUProgressDialog createDialog = createDialog();
            if (createDialog != null) {
                createDialog.show();
            }
            LoginApi.simLogin(loginParam, null, null, new LoginTasksCallback<LoginReturnData>() { // from class: com.taobao.login4android.jsbridge.PopJSBridge.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.ali.user.mobile.callback.LoginTasksCallback
                public void onSuccess(RpcResponse<LoginReturnData> rpcResponse) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("2811f422", new Object[]{this, rpcResponse});
                        return;
                    }
                    PopJSBridge.access$100(PopJSBridge.this, "login_pop_simLogin_success", null);
                    wVCallBackContext.success();
                    PopJSBridge.access$400(PopJSBridge.this);
                    AUProgressDialog aUProgressDialog = createDialog;
                    if (aUProgressDialog == null) {
                        return;
                    }
                    aUProgressDialog.dismiss();
                }

                @Override // com.ali.user.mobile.callback.LoginTasksCallback
                public void onFail(LoginException<LoginReturnData> loginException) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("77abaa65", new Object[]{this, loginException});
                        return;
                    }
                    PopJSBridge popJSBridge = PopJSBridge.this;
                    PopJSBridge.access$300(popJSBridge, "login_pop_simLogin_error", "" + loginException.getCode(), loginException.getMsg());
                    AUProgressDialog aUProgressDialog = createDialog;
                    if (aUProgressDialog != null) {
                        aUProgressDialog.dismiss();
                    }
                    wVCallBackContext.error();
                    if (loginException.getCode() == 3010 || loginException.getCode() == 14076) {
                        ToastUtil.showToast(PopJSBridge.this.getContext(), PopJSBridge.this.getContext().getString(R.string.aliuser_onekey_login_fail_tip), 0);
                        Bundle bundle = new Bundle();
                        bundle.putBoolean(LoginConstant.LAUNCH_PASS_GUIDE_FRAGMENT, true);
                        bundle.putBoolean(LoginConstant.FORCE_NORMAL_MODE, true);
                        bundle.putString(UIBaseConstants.LoginPage.PAGE_LOGIN_TYPE, UIBaseConstants.LoginPage.PAGE_RECOMMEND_LOGIN);
                        bundle.putString("source", PopJSBridge.access$500(PopJSBridge.this));
                        ((NavigatorService) ServiceFactory.getService(NavigatorService.class)).openLoginPage(PopJSBridge.this.getContext(), ApiReferer.generateApiReferer(), bundle);
                        return;
                    }
                    ToastUtil.showToast(PopJSBridge.this.getContext(), loginException.getMsg(), 0);
                }

                @Override // com.ali.user.mobile.callback.LoginTasksCallback
                public void onCancel() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("379d4540", new Object[]{this});
                        return;
                    }
                    PopJSBridge.access$100(PopJSBridge.this, "login_pop_simLogin_cancel", null);
                    wVCallBackContext.error();
                    AUProgressDialog aUProgressDialog = createDialog;
                    if (aUProgressDialog == null) {
                        return;
                    }
                    aUProgressDialog.dismiss();
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void handleLoginSuccess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("126f9a29", new Object[]{this});
            return;
        }
        try {
            if (this.loginPopInfo == null || !LoginSwitch.getSwitch("login_pop_start_landing_page_enabled", "true")) {
                return;
            }
            String str = this.loginPopInfo.benefitLandingUrl;
            String str2 = "handleLoginSuccess: landingUrl=" + str + ",benefitType=" + this.loginPopInfo.benefitType;
            if (StringUtils.isEmpty(str) || !"channel".equals(this.loginPopInfo.benefitType)) {
                return;
            }
            Nav.from(getContext()).toUri(str);
            track("login_pop_start_landing_page_channel", null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private AUProgressDialog createDialog() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AUProgressDialog) ipChange.ipc$dispatch("9b18ae19", new Object[]{this});
        }
        if (getContext() instanceof Activity) {
            AUProgressDialog aUProgressDialog = new AUProgressDialog(getContext());
            aUProgressDialog.setProgressVisiable(true);
            return aUProgressDialog;
        } else if (LoginBarController.getMainActivity() == null) {
            return null;
        } else {
            AUProgressDialog aUProgressDialog2 = new AUProgressDialog(LoginBarController.getMainActivity());
            aUProgressDialog2.setProgressVisiable(true);
            return aUProgressDialog2;
        }
    }

    private void handleAlipayLogin(JSONObject jSONObject, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a98c2fef", new Object[]{this, jSONObject, wVCallBackContext});
            return;
        }
        try {
            Activity mainActivity = getContext() instanceof Activity ? (Activity) getContext() : LoginBarController.getMainActivity();
            if (mainActivity == null) {
                wVCallBackContext.error();
                return;
            }
            track("login_pop_alipayLogin_commit", null);
            AUProgressDialog createDialog = createDialog();
            if (createDialog != null) {
                createDialog.show();
            }
            LoginParam loginParam = new LoginParam();
            loginParam.source = this.source;
            loginParam.sdkTraceId = ApiReferer.generateTraceId(this.source, UTConstant.PageName.UT_PAGE_EXTEND);
            LoginContext.mFrom = this.source;
            registerBroadcast(wVCallBackContext, 77, createDialog);
            HashMap hashMap = new HashMap();
            hashMap.put("source", this.source);
            c.a(SNSPlatform.PLATFORM_ALIPAY, mainActivity, hashMap);
        } catch (Exception e) {
            e.printStackTrace();
            wVCallBackContext.error();
        }
    }

    private void handleGetPopData(String str, final WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d24248bb", new Object[]{this, str, wVCallBackContext});
            return;
        }
        try {
            if (!LoginSwitch.getSwitch("login_pop_enabled", "true")) {
                return;
            }
            track("login_pop_call", null);
            if (LoginSwitch.getSwitch("login_pop_new_check_enabled", "true")) {
                if (markNotShow || Login.canAutoLogin() || Login.checkSessionValid()) {
                    hasLoginCalback(wVCallBackContext);
                    return;
                }
            } else {
                if (!markNotShow) {
                    if (StringUtils.isEmpty(Login.getOldUserId())) {
                        if (Login.checkSessionValid()) {
                        }
                    }
                }
                track("login_pop_login_once", null);
                callbackNotShow(wVCallBackContext);
                return;
            }
            if (LoginStatus.isLogining()) {
                track("login_pop_exist_login_0", null);
                callbackNotShow(wVCallBackContext);
            } else if (isProcessRelogin()) {
                track("login_pop_relogin_processing", null);
                callbackNotShow(wVCallBackContext);
            } else {
                track("login_pop_not_login_once", null);
                final NumberAuthService numberAuthService = (NumberAuthService) ServiceFactory.getService(NumberAuthService.class);
                final boolean iSupportAlipay = iSupportAlipay();
                final JSONObject jSONObject = new JSONObject();
                final boolean z2 = homepageFirstResumed != null && homepageFirstResumed.booleanValue();
                final HashMap hashMap = new HashMap();
                if (StringUtils.isEmpty(Login.getOldUserId())) {
                    z = false;
                }
                hashMap.put("onceLogined", String.valueOf(z));
                hashMap.put("alipayInstalled", String.valueOf(iSupportAlipay));
                tryToGetLoginMaskPhone(new DataCallback<Map<String, String>>() { // from class: com.taobao.login4android.jsbridge.PopJSBridge.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.ali.user.mobile.callback.DataCallback
                    public /* synthetic */ void result(Map<String, String> map) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("91402500", new Object[]{this, map});
                        } else {
                            a(map);
                        }
                    }

                    public void a(Map<String, String> map) {
                        IpChange ipChange2 = $ipChange;
                        boolean z3 = true;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5a42121d", new Object[]{this, map});
                        } else if (CollectionUtils.isEmpty(map)) {
                            if (iSupportAlipay) {
                                if (z2) {
                                    PopJSBridge.access$100(PopJSBridge.this, "login_pop_first_time", hashMap);
                                    if (numberAuthService.isSupport4G()) {
                                        PopJSBridge.access$100(PopJSBridge.this, "login_pop_support4g", hashMap);
                                        if (LoginSwitch.getSwitch("login_pop_skip_alipay_first_time", "true")) {
                                            PopJSBridge.access$100(PopJSBridge.this, "login_pop_skip_this_time", hashMap);
                                            UserTrackAdapter.sendUserTrack(UTConstant.PageName.UT_PAGE_EXTEND, "login_pop_skip_alipay_first_time", null);
                                            wVCallBackContext.error();
                                            z3 = false;
                                        } else {
                                            PopJSBridge.access$600(PopJSBridge.this, jSONObject, wVCallBackContext);
                                        }
                                    } else {
                                        PopJSBridge.access$100(PopJSBridge.this, "login_pop_not_support4g", hashMap);
                                        PopJSBridge.access$600(PopJSBridge.this, jSONObject, wVCallBackContext);
                                    }
                                } else {
                                    PopJSBridge.access$100(PopJSBridge.this, "login_pop_not_first_time", hashMap);
                                    PopJSBridge.access$600(PopJSBridge.this, jSONObject, wVCallBackContext);
                                }
                            } else {
                                PopJSBridge.access$100(PopJSBridge.this, "login_pop_can_show_default", hashMap);
                                PopJSBridge.access$600(PopJSBridge.this, jSONObject, wVCallBackContext);
                            }
                            if (!z3) {
                                return;
                            }
                            PopJSBridge.access$100(PopJSBridge.this, "login_pop_can_show_pop", hashMap);
                        } else {
                            jSONObject.put("maskMobile", (Object) map.get("number"));
                            jSONObject.put("maskMobileProtocolName", (Object) map.get("protocolName"));
                            jSONObject.put("maskMobileProtocolUrl", (Object) map.get("protocolURL"));
                            PopJSBridge.access$600(PopJSBridge.this, jSONObject, wVCallBackContext);
                            PopJSBridge.access$100(PopJSBridge.this, "login_pop_get_mask_phone_success", hashMap);
                        }
                    }
                }, "loginPop");
            }
        } catch (Exception e) {
            e.printStackTrace();
            wVCallBackContext.error();
        }
    }

    private boolean isProcessRelogin() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ae17e37c", new Object[]{this})).booleanValue() : ReloginDelegate.isProcessing && LoginSwitch.getSwitch("login_pop_check_relogin_status_enabled2", "false");
    }

    private void hasLoginCalback(WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da086a0a", new Object[]{this, wVCallBackContext});
            return;
        }
        HashMap<String, String> hashMap = new HashMap<>();
        if (Login.canAutoLogin()) {
            track("login_pop_can_autologin", hashMap);
        } else {
            hashMap.put("onceLogined", String.valueOf(!StringUtils.isEmpty(Login.getOldUserId())));
            track("login_pop_not_can_autologin", hashMap);
        }
        callbackNotShow(wVCallBackContext);
    }

    private boolean iSupportAlipay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4f04dd9b", new Object[]{this})).booleanValue();
        }
        OauthService oauthService = (OauthService) AliMemberSDK.getService(OauthService.class);
        return oauthService != null && oauthService.isAppAuthSurpport(getContext(), "alipay");
    }

    private void requestPopInfo(JSONObject jSONObject, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("260288f6", new Object[]{this, jSONObject, wVCallBackContext});
            return;
        }
        try {
            track("login_pop_request_mtop_commit", null);
            LoginParam loginParam = new LoginParam();
            loginParam.alipayInstalled = iSupportAlipay();
            loginParam.scene = "loginPop";
            List<HistoryAccount> historyAccounts = SecurityGuardManagerWraper.getHistoryAccounts();
            if (!CollectionUtils.isEmpty(historyAccounts)) {
                this.historyAccount = historyAccounts.get(0);
            }
            AppLaunchInfoResponseData fireAppLaunchRequest = RecommendLoginPresenter.fireAppLaunchRequest(loginParam, this.historyAccount);
            LoginStatus.loginTrackInfo = ((AppLaunchInfo) fireAppLaunchRequest.returnValue).loginTrackInfo;
            this.appLaunchInfo = (AppLaunchInfo) fireAppLaunchRequest.returnValue;
            fireAppLaunchRequest.calTime = this.appLaunchInfo.expireTime + (System.currentTimeMillis() / 1000);
            fireAppLaunchRequest.appVersion = AppInfo.getInstance().getAppVersion();
            this.loginPopInfo = this.appLaunchInfo.popInfo;
            jSONObject.put("showPop", (Object) Boolean.valueOf(this.appLaunchInfo.showPop));
            if (this.historyAccount != null) {
                jSONObject.put("userHeadImageUrl", (Object) this.historyAccount.headImg);
                jSONObject.put("userNick", (Object) StringUtil.dataMasking(this.historyAccount.userInputName));
            }
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put("showPop", String.valueOf(this.appLaunchInfo.showPop));
            hashMap.put("popLoginType", String.valueOf(this.appLaunchInfo.popLoginType));
            if (this.loginPopInfo != null) {
                hashMap.put("benefitBrandText", this.loginPopInfo.benefitBrandText);
                hashMap.put("benefitLandingUrl", this.loginPopInfo.benefitLandingUrl);
                hashMap.put("benefitType", this.loginPopInfo.benefitType);
                hashMap.put("benefitNumberText", this.loginPopInfo.benefitNumberText);
                hashMap.put("benefitShowNumber", String.valueOf(this.loginPopInfo.benefitShowNumber));
            }
            track("login_pop_request_mtop_success", hashMap);
            if (this.appLaunchInfo.showPop) {
                jSONObject.put("popLoginType", (Object) this.appLaunchInfo.popLoginType);
                if (this.loginPopInfo != null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("benefitBrandText", (Object) this.loginPopInfo.benefitBrandText);
                    jSONObject2.put("benefitLandingUrl", (Object) this.loginPopInfo.benefitLandingUrl);
                    jSONObject2.put("benefitType", (Object) this.loginPopInfo.benefitType);
                    jSONObject2.put("benefitNumberText", (Object) this.loginPopInfo.benefitNumberText);
                    jSONObject2.put("benefitShowNumber", (Object) Boolean.valueOf(this.loginPopInfo.benefitShowNumber));
                    jSONObject2.put("content", (Object) this.loginPopInfo.content);
                    jSONObject.put("popInfo", (Object) jSONObject2);
                    if ("channel".equals(this.loginPopInfo.benefitType)) {
                        this.source = this.appLaunchInfo.popLoginType + "_" + this.loginPopInfo.benefitType + "_" + this.loginPopInfo.benefitShowNumber;
                    } else {
                        this.source = this.appLaunchInfo.popLoginType + "_" + this.loginPopInfo.benefitType;
                    }
                } else {
                    this.source = this.appLaunchInfo.popLoginType;
                }
                if (!Login.canAutoLogin() && !Login.checkSessionValid()) {
                    if (isProcessRelogin()) {
                        track("login_pop_relogin_processing", null);
                        callbackNotShow(wVCallBackContext);
                        return;
                    } else if (LoginStatus.isLogining()) {
                        track("login_pop_exist_login", null);
                        callbackNotShow(wVCallBackContext);
                        return;
                    } else {
                        LoginBarController.hideLoginBar();
                        if (LoginSwitch.getSwitch("login_pop_show_login_bar_after_pop", "true")) {
                            MainThreadExecutor.postDelayed(new Runnable() { // from class: com.taobao.login4android.jsbridge.PopJSBridge.4
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // java.lang.Runnable
                                public void run() {
                                    IpChange ipChange2 = $ipChange;
                                    if (ipChange2 instanceof IpChange) {
                                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                    } else {
                                        LoginBarController.showLoginBar();
                                    }
                                }
                            }, 5000L);
                        }
                        r0 = "requestPopInfo: 返回给 pop 的数据：" + jSONObject.toJSONString();
                        wVCallBackContext.success(jSONObject.toJSONString());
                        return;
                    }
                }
                hasLoginCalback(wVCallBackContext);
                return;
            }
            markNotShow = true;
            callbackNotShow(wVCallBackContext);
        } catch (Exception e) {
            LoginTLogAdapter.trace(TAG, "login_pop_request_mtop_error", e);
            wVCallBackContext.error();
            LoginBarController.hideLoginBar();
            trackFailure("login_pop_request_mtop_error", "-133", e.getMessage());
        }
    }

    private void callbackNotShow(WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a3131af", new Object[]{this, wVCallBackContext});
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("showPop", (Object) "false");
            wVCallBackContext.success(jSONObject.toJSONString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void trackFailure(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f919c24", new Object[]{this, str, str2, str3});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("code", str2);
        hashMap.put("msg", str3);
        Boolean bool = homepageFirstResumed;
        if (bool == null || !bool.booleanValue()) {
            z = false;
        }
        hashMap.put("isFirstTime", String.valueOf(z));
        UserTrackAdapter.sendUserTrack(UTConstant.PageName.UT_PAGE_EXTEND, str, hashMap);
    }

    private void track(String str, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e59b4297", new Object[]{this, str, hashMap});
            return;
        }
        if (hashMap == null) {
            hashMap = new HashMap<>();
        }
        Boolean bool = homepageFirstResumed;
        if (bool == null || !bool.booleanValue()) {
            z = false;
        }
        hashMap.put("isFirstTime", String.valueOf(z));
        UserTrackAdapter.sendUserTrack(UTConstant.PageName.UT_PAGE_EXTEND, str, hashMap);
    }

    private void tryToGetLoginMaskPhone(final DataCallback<Map<String, String>> dataCallback, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebe08e9a", new Object[]{this, dataCallback, str});
            return;
        }
        NumberAuthService numberAuthService = (NumberAuthService) ServiceFactory.getService(NumberAuthService.class);
        if (numberAuthService == null) {
            dataCallback.result(null);
            return;
        }
        final HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("scene", str);
        final long currentTimeMillis = System.currentTimeMillis();
        track("login_pop_get_mask_phone_commit", hashMap);
        if (numberAuthService.hasPreFecthMaskPhone() && !numberAuthService.needPrefetch()) {
            hashMap.put("cost", String.valueOf(System.currentTimeMillis() - currentTimeMillis));
            track("login_pop_prefetch_get_mask_phone_success", hashMap);
            dataCallback.result(numberAuthService.getAuthInfoMap());
            return;
        }
        numberAuthService.getLoginMaskPhone(3000, str, new CommonDataCallback() { // from class: com.taobao.login4android.jsbridge.PopJSBridge.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.ali.user.mobile.callback.CommonDataCallback
            public void onSuccess(Map<String, String> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("93e51c7a", new Object[]{this, map});
                    return;
                }
                hashMap.put("cost", String.valueOf(System.currentTimeMillis() - currentTimeMillis));
                PopJSBridge.access$100(PopJSBridge.this, "login_pop_get_mask_phone_success", hashMap);
                dataCallback.result(map);
            }

            @Override // com.ali.user.mobile.callback.CommonDataCallback
            public void onFail(int i, String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("efca37e9", new Object[]{this, new Integer(i), str2});
                    return;
                }
                dataCallback.result(null);
                PopJSBridge popJSBridge = PopJSBridge.this;
                PopJSBridge.access$300(popJSBridge, "login_pop_get_mask_phone_fail", i + "", str2);
                if (PopJSBridge.access$700(PopJSBridge.this)) {
                    PopJSBridge popJSBridge2 = PopJSBridge.this;
                    PopJSBridge.access$300(popJSBridge2, "login_pop_get_mask_phone_fail_alipay_installed", i + "", str2);
                    return;
                }
                PopJSBridge popJSBridge3 = PopJSBridge.this;
                PopJSBridge.access$300(popJSBridge3, "login_pop_get_mask_phone_fail_alipay_not_installed", i + "", str2);
            }
        });
    }

    private void getBarData(JSONObject jSONObject, final WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4237efbf", new Object[]{this, jSONObject, wVCallBackContext});
        } else if (jSONObject == null || !jSONObject.containsKey("checkLogin")) {
            failCallback(wVCallBackContext, ResourceUtil.getInvalidParam(), String.valueOf(GET_BAR_PARAM_ERROR));
        } else {
            try {
                if (jSONObject.containsKey("checkLogin") && "true".equals(jSONObject.getString("checkLogin")) && (LoginStatus.isLogining() || com.taobao.login4android.api.Login.checkSessionValid() || !StringUtils.isEmpty(com.taobao.login4android.api.Login.getLoginToken()))) {
                    failCallback(wVCallBackContext, ResourceUtil.getNetworkError(), String.valueOf(GET_BAR_INFO_CHECK_LOGIN_FAILED));
                } else {
                    CoordinatorWrapper.executeSafely(new AsyncTask<Object, Void, AppLaunchInfoResponseData>() { // from class: com.taobao.login4android.jsbridge.PopJSBridge.6
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        public static /* synthetic */ Object ipc$super(AnonymousClass6 anonymousClass6, String str, Object... objArr) {
                            if (str.hashCode() == -1325021319) {
                                super.onPostExecute(objArr[0]);
                                return null;
                            }
                            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                        }

                        /* JADX WARN: Type inference failed for: r4v3, types: [com.ali.user.mobile.login.model.AppLaunchInfoResponseData, java.lang.Object] */
                        @Override // android.os.AsyncTask
                        public /* synthetic */ AppLaunchInfoResponseData doInBackground(Object[] objArr) {
                            IpChange ipChange2 = $ipChange;
                            return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("e83e4786", new Object[]{this, objArr}) : a(objArr);
                        }

                        @Override // android.os.AsyncTask
                        public /* synthetic */ void onPostExecute(AppLaunchInfoResponseData appLaunchInfoResponseData) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("b105c779", new Object[]{this, appLaunchInfoResponseData});
                            } else {
                                a(appLaunchInfoResponseData);
                            }
                        }

                        public AppLaunchInfoResponseData a(Object... objArr) {
                            IpChange ipChange2 = $ipChange;
                            return ipChange2 instanceof IpChange ? (AppLaunchInfoResponseData) ipChange2.ipc$dispatch("56334a01", new Object[]{this, objArr}) : UserLoginActivity.getAppLaunchData(PopJSBridge.access$800(PopJSBridge.this));
                        }

                        public void a(AppLaunchInfoResponseData appLaunchInfoResponseData) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("db13b020", new Object[]{this, appLaunchInfoResponseData});
                                return;
                            }
                            super.onPostExecute(appLaunchInfoResponseData);
                            if (appLaunchInfoResponseData != null) {
                                try {
                                    if (appLaunchInfoResponseData.returnValue != 0 && ((AppLaunchInfo) appLaunchInfoResponseData.returnValue).bottomFloatingBarInfo != null) {
                                        JSONObject jSONObject2 = new JSONObject();
                                        Map<String, String> map = null;
                                        if (ServiceFactory.getService(NumberAuthService.class) != null) {
                                            map = ((NumberAuthService) ServiceFactory.getService(NumberAuthService.class)).getAuthInfoMap();
                                        }
                                        if (!CollectionUtils.isEmpty(map)) {
                                            jSONObject2.put("number", (Object) map.get("number"));
                                            jSONObject2.put("protocolName", (Object) map.get("protocolName"));
                                            jSONObject2.put("protocolURL", (Object) map.get("protocolURL"));
                                        }
                                        jSONObject2.put("alipayInstalled", (Object) String.valueOf(PopJSBridge.access$700(PopJSBridge.this)));
                                        jSONObject2.put("bottomFloatingBarInfo", (Object) ((AppLaunchInfo) appLaunchInfoResponseData.returnValue).bottomFloatingBarInfo);
                                        jSONObject2.put("locatedUmidAccount", (Object) Boolean.valueOf(((AppLaunchInfo) appLaunchInfoResponseData.returnValue).locatedUmidAccount));
                                        jSONObject2.put(LoginConstant.UMID_TOKEN, (Object) ((AppLaunchInfo) appLaunchInfoResponseData.returnValue).umidLoginToken);
                                        wVCallBackContext.success(jSONObject2.toJSONString());
                                        return;
                                    }
                                } catch (Throwable th) {
                                    th.printStackTrace();
                                    PopJSBridge.access$1000(PopJSBridge.this, wVCallBackContext, ResourceUtil.getNetworkError(), String.valueOf(PopJSBridge.access$1100()));
                                    return;
                                }
                            }
                            PopJSBridge.access$1000(PopJSBridge.this, wVCallBackContext, ResourceUtil.getNetworkError(), String.valueOf(PopJSBridge.access$900()));
                        }
                    }, new Object[0]);
                }
            } catch (Throwable th) {
                th.printStackTrace();
                failCallback(wVCallBackContext, ResourceUtil.getNetworkError(), String.valueOf(GET_BAR_INFO_EXCEPTION));
            }
        }
    }

    private void failCallback(WVCallBackContext wVCallBackContext, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34fa1c5b", new Object[]{this, wVCallBackContext, str, str2});
            return;
        }
        r rVar = new r();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("message", str);
            jSONObject.put("code", str2);
        } catch (Exception unused) {
        }
        rVar.a(jSONObject);
        rVar.a("HY_FAILED");
        wVCallBackContext.error(rVar);
    }
}
