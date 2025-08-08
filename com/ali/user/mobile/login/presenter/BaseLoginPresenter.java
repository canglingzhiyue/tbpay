package com.ali.user.mobile.login.presenter;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import com.ali.user.mobile.ability.excutor.ExecutorCenter;
import com.ali.user.mobile.ability.excutor.ExecutorContext;
import com.ali.user.mobile.ability.excutor.ExecutorResult;
import com.ali.user.mobile.ability.excutor.login.LoginExecutorParams;
import com.ali.user.mobile.app.constant.UTConstant;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.mobile.base.BasePresenter;
import com.ali.user.mobile.base.helper.SDKExceptionHelper;
import com.ali.user.mobile.callback.DataCallback;
import com.ali.user.mobile.callback.LoginTasksCallback;
import com.ali.user.mobile.callback.RpcRequestCallback;
import com.ali.user.mobile.exception.LoginException;
import com.ali.user.mobile.exception.RpcException;
import com.ali.user.mobile.log.ApiReferer;
import com.ali.user.mobile.log.UserTrackAdapter;
import com.ali.user.mobile.login.CommonUICallback;
import com.ali.user.mobile.login.LoginApi;
import com.ali.user.mobile.login.model.LoginConstant;
import com.ali.user.mobile.login.ui.BaseLoginFragment;
import com.ali.user.mobile.login.ui.BaseLoginView;
import com.ali.user.mobile.login.ui.UserLoginActivity;
import com.ali.user.mobile.model.LoginParam;
import com.ali.user.mobile.model.LoginType;
import com.ali.user.mobile.model.TokenType;
import com.ali.user.mobile.navigation.NavigatorManager;
import com.ali.user.mobile.rpc.ApiConstants;
import com.ali.user.mobile.rpc.RpcResponse;
import com.ali.user.mobile.rpc.h5.MtopAccountCenterUrlResponseData;
import com.ali.user.mobile.rpc.login.model.DefaultLoginResponseData;
import com.ali.user.mobile.rpc.login.model.LoginReturnData;
import com.ali.user.mobile.service.FaceService;
import com.ali.user.mobile.service.ServiceFactory;
import com.ali.user.mobile.ui.widget.AliUserDialog;
import com.ali.user.mobile.url.model.AccountCenterParam;
import com.ali.user.mobile.url.service.impl.UrlFetchServiceImpl;
import com.ali.user.mobile.utils.ResourceUtil;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.config.LoginSwitch;
import com.taobao.taobao.R;
import java.util.HashMap;
import tb.kge;

/* loaded from: classes2.dex */
public class BaseLoginPresenter implements BasePresenter {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int FACE_LOGIN_REQUEST = 1004;
    public static final int SEND_SMS_NICK_REQUEST = 1003;
    public static final int SEND_SMS_REQUEST = 1001;
    public static final String TAG;
    public AliUserDialog mAliUserDialog;
    public LoginParam mLoginParam;
    public BaseLoginView mViewer;

    public String getLocalLoginType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c11b97ab", new Object[]{this}) : LoginType.LocalLoginType.PWD_LOGIN;
    }

    public static /* synthetic */ void access$000(BaseLoginPresenter baseLoginPresenter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81f594a1", new Object[]{baseLoginPresenter});
        } else {
            baseLoginPresenter.dismissLoading();
        }
    }

    static {
        kge.a(-1585712795);
        kge.a(-866860255);
        TAG = "login." + BaseLoginPresenter.class.getSimpleName();
    }

    public BaseLoginPresenter(BaseLoginView baseLoginView, LoginParam loginParam) {
        this.mViewer = baseLoginView;
        this.mLoginParam = loginParam;
        LoginParam loginParam2 = this.mLoginParam;
        if (loginParam2 == null || !StringUtils.isEmpty(loginParam2.token)) {
            return;
        }
        this.mLoginParam.site = this.mViewer.getLoginSite();
    }

    @Override // com.ali.user.mobile.base.BasePresenter
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        LoginParam loginParam = this.mLoginParam;
        if (loginParam == null) {
            return;
        }
        if (!StringUtils.isEmpty(loginParam.token)) {
            callApi();
        } else if (StringUtils.isEmpty(this.mLoginParam.loginId)) {
        } else {
            this.mViewer.setLoginAccountInfo(this.mLoginParam.loginId);
        }
    }

    public void callApi() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b793b963", new Object[]{this});
        } else {
            LoginApi.tokenLogin(this.mLoginParam, null, null, new LoginTasksCallback<LoginReturnData>() { // from class: com.ali.user.mobile.login.presenter.BaseLoginPresenter.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.ali.user.mobile.callback.LoginTasksCallback
                public void onCancel() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("379d4540", new Object[]{this});
                    }
                }

                @Override // com.ali.user.mobile.callback.LoginTasksCallback
                public void onFail(LoginException<LoginReturnData> loginException) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("77abaa65", new Object[]{this, loginException});
                    }
                }

                @Override // com.ali.user.mobile.callback.LoginTasksCallback
                public void onSuccess(RpcResponse<LoginReturnData> rpcResponse) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("2811f422", new Object[]{this, rpcResponse});
                    }
                }
            });
        }
    }

    public void login() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99739770", new Object[]{this});
            return;
        }
        UserTrackAdapter.sendUT("BaseLoginPresenterLogin");
        BaseLoginView baseLoginView = this.mViewer;
        if (baseLoginView == null || !baseLoginView.isActive()) {
            return;
        }
        LoginApi.tokenLogin(this.mLoginParam.m102clone(), null, this.mViewer, new LoginTasksCallback<LoginReturnData>() { // from class: com.ali.user.mobile.login.presenter.BaseLoginPresenter.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.ali.user.mobile.callback.LoginTasksCallback
            public void onSuccess(RpcResponse<LoginReturnData> rpcResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("2811f422", new Object[]{this, rpcResponse});
                } else {
                    BaseLoginPresenter.access$000(BaseLoginPresenter.this);
                }
            }

            @Override // com.ali.user.mobile.callback.LoginTasksCallback
            public void onFail(LoginException<LoginReturnData> loginException) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("77abaa65", new Object[]{this, loginException});
                } else if (BaseLoginPresenter.this.mViewer == null || !BaseLoginPresenter.this.mViewer.isActive()) {
                } else {
                    BaseLoginPresenter.access$000(BaseLoginPresenter.this);
                    if (loginException.getCode() == 700) {
                        BaseLoginPresenter baseLoginPresenter = BaseLoginPresenter.this;
                        baseLoginPresenter.onReceiveAlert(baseLoginPresenter.mLoginParam, loginException.getOrinResponse());
                        return;
                    }
                    BaseLoginPresenter.this.mViewer.toast(loginException.getMsg(), 0);
                }
            }

            @Override // com.ali.user.mobile.callback.LoginTasksCallback
            public void onCancel() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("379d4540", new Object[]{this});
                } else {
                    BaseLoginPresenter.access$000(BaseLoginPresenter.this);
                }
            }
        });
    }

    private void dismissLoading() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c142d9", new Object[]{this});
            return;
        }
        BaseLoginView baseLoginView = this.mViewer;
        if (baseLoginView == null || !baseLoginView.isActive()) {
            return;
        }
        this.mViewer.dismissLoading();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        UserTrackAdapter.sendUT("onActivityResult");
        if (i != 257) {
            return;
        }
        if (i2 != 258 && i2 != 0) {
            return;
        }
        onActivityResultForWebView(i2, intent);
        UserTrackAdapter.sendUT("onActivityResultForWebView");
    }

    public void onActivityResultForWebView(int i, Intent intent) {
        LoginParam loginParam;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e29b07be", new Object[]{this, new Integer(i), intent});
        } else if ((intent != null && "quit".equals(intent.getStringExtra("action"))) || i == 0) {
            cleanDataHodler();
        } else if (intent == null) {
        } else {
            LoginParam loginParam2 = null;
            try {
                loginParam2 = (LoginParam) intent.getSerializableExtra("loginParam");
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (loginParam2 != null && loginParam2.ext != null && "continueLogin".equals(loginParam2.ext.get(LoginConstant.EXT_ACTION))) {
                this.mLoginParam.h5QueryString = intent.getStringExtra(ApiConstants.ApiField.H5_QUERY_STRING);
                this.mLoginParam.scene = loginParam2.scene;
                this.mLoginParam.token = loginParam2.token;
                login();
                return;
            }
            LoginParam loginParam3 = this.mLoginParam;
            if (loginParam3 != null && loginParam3.ext != null && "continueLogin".equals(this.mLoginParam.ext.get(LoginConstant.EXT_ACTION))) {
                this.mLoginParam.h5QueryString = intent.getStringExtra(ApiConstants.ApiField.H5_QUERY_STRING);
                login();
            } else if (this.mViewer == null || (loginParam = this.mLoginParam) == null) {
            } else {
                loginParam.h5QueryString = intent.getStringExtra(ApiConstants.ApiField.H5_QUERY_STRING);
                login();
            }
        }
    }

    public void buildLoginParam(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96b28bcd", new Object[]{this, str, str2});
        } else {
            buildLoginParam(str, str2, false);
        }
    }

    public void buildLoginParam(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f9fa0a7", new Object[]{this, str, str2, new Boolean(z)});
            return;
        }
        if (this.mLoginParam == null) {
            this.mLoginParam = new LoginParam();
        }
        this.mLoginParam.isFromAccount = this.mViewer.isHistoryMode();
        this.mLoginParam.site = this.mViewer.getLoginSite();
        this.mLoginParam.utPageName = this.mViewer.getPageName();
        LoginParam loginParam = this.mLoginParam;
        loginParam.loginId = str;
        loginParam.password = str2;
        if (loginParam.ext == null) {
            this.mLoginParam.ext = new HashMap();
        }
        this.mLoginParam.ext.put("apiReferer", ApiReferer.generateApiReferer());
        if (z) {
            this.mLoginParam.ext.put(ApiConstants.ApiField.MOBILE_CHECK_SIMILARITY, "true");
        } else {
            this.mLoginParam.ext.put(ApiConstants.ApiField.MOBILE_CHECK_SIMILARITY, "false");
        }
        LoginParam loginParam2 = this.mLoginParam;
        loginParam2.deviceTokenKey = "";
        loginParam2.hid = 0L;
        addNativeLoginType(loginParam2);
    }

    public void addNativeLoginType(LoginParam loginParam) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29b9642f", new Object[]{this, loginParam});
        } else if (this instanceof UserMobileLoginPresenter) {
            loginParam.nativeLoginType = LoginType.ServerLoginType.SMSLogin.getType();
        } else if (this instanceof UserLoginPresenter) {
            loginParam.nativeLoginType = LoginType.ServerLoginType.PasswordLogin.getType();
        } else if (!(this instanceof EmailLoginPresenter)) {
        } else {
            loginParam.nativeLoginType = LoginType.ServerLoginType.EmailLogin.getType();
        }
    }

    public void login(final Activity activity, final LoginParam loginParam, final CommonUICallback commonUICallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e4f06fc", new Object[]{this, activity, loginParam, commonUICallback});
            return;
        }
        LoginExecutorParams loginExecutorParams = new LoginExecutorParams();
        loginExecutorParams.type = getLocalLoginType();
        loginExecutorParams.params = loginParam;
        ExecutorCenter.execute("login", new ExecutorContext.ExcutorContextBuilder().context(activity).baseView(this.mViewer).params(loginExecutorParams).build(), new DataCallback<ExecutorResult>() { // from class: com.ali.user.mobile.login.presenter.BaseLoginPresenter.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.ali.user.mobile.callback.DataCallback
            public void result(ExecutorResult executorResult) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("aeab9d99", new Object[]{this, executorResult});
                } else if (executorResult.success) {
                } else {
                    if (executorResult.code == 3002) {
                        if (BaseLoginPresenter.this.mViewer == null) {
                            return;
                        }
                        BaseLoginPresenter.this.mViewer.toast(executorResult.msg, 0);
                    } else if (executorResult.code == 3007) {
                    } else {
                        if (executorResult.code == 3013) {
                            BaseLoginPresenter.this.onGetAccessTokenFail(commonUICallback);
                        } else if (executorResult.code == 3010) {
                            BaseLoginPresenter.this.onGetOneKeyLoginTokenFail(commonUICallback);
                        } else if (executorResult.code == 3008) {
                            BaseLoginPresenter.this.onFaceFailed(commonUICallback);
                        } else if (executorResult.bizInfo != null && (executorResult.bizInfo.get("data") instanceof RpcResponse)) {
                            RpcResponse rpcResponse = (RpcResponse) executorResult.bizInfo.get("data");
                            if (rpcResponse.code == 14044 || rpcResponse.code == 14163) {
                                BaseLoginPresenter.this.onNeedVerifyMobileForReg(commonUICallback, ((LoginReturnData) ((DefaultLoginResponseData) rpcResponse).returnValue).mobile);
                            } else if (rpcResponse.code == 14047 || rpcResponse.code == 14076) {
                                BaseLoginPresenter.this.onGetOneKeyLoginTokenFail(commonUICallback);
                            } else if (ApiConstants.isAlertType(rpcResponse)) {
                                BaseLoginPresenter.this.onGetToastAlert(activity, loginParam, rpcResponse, commonUICallback);
                            } else if (BaseLoginPresenter.this.mViewer == null) {
                            } else {
                                BaseLoginPresenter.this.mViewer.toast(executorResult.msg, 0);
                            }
                        } else if (BaseLoginPresenter.this.mViewer == null) {
                        } else {
                            BaseLoginPresenter.this.mViewer.toast(executorResult.msg, 0);
                        }
                    }
                }
            }
        });
    }

    public void sendToast(ExecutorResult executorResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("169e92fb", new Object[]{this, executorResult});
            return;
        }
        String str = executorResult.msg;
        if (StringUtils.isEmpty(str)) {
            str = ResourceUtil.getNetworkError();
        }
        BaseLoginView baseLoginView = this.mViewer;
        if (baseLoginView == null) {
            return;
        }
        baseLoginView.toast(str, 0);
    }

    public void onGetAccessTokenFail(CommonUICallback commonUICallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49100a60", new Object[]{this, commonUICallback});
        } else if (commonUICallback == null) {
        } else {
            commonUICallback.onResult(5006, null);
        }
    }

    public void onGetOneKeyLoginTokenFail(CommonUICallback commonUICallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c365602", new Object[]{this, commonUICallback});
        } else if (commonUICallback == null) {
        } else {
            commonUICallback.onResult(5006, null);
        }
    }

    public void onFaceFailed(CommonUICallback commonUICallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75b9dadd", new Object[]{this, commonUICallback});
        } else if (commonUICallback == null) {
        } else {
            commonUICallback.onResult(5004, null);
        }
    }

    public void onGetToastAlert(Activity activity, LoginParam loginParam, RpcResponse rpcResponse, CommonUICallback commonUICallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac35e108", new Object[]{this, activity, loginParam, rpcResponse, commonUICallback});
        } else if (LoginType.LocalLoginType.PWD_LOGIN.equals(getLocalLoginType())) {
            onReceivePwdError(activity, loginParam, rpcResponse, commonUICallback);
        } else {
            onReceiveAlert(loginParam, rpcResponse);
        }
    }

    public void onNeedVerifyMobileForReg(CommonUICallback commonUICallback, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29eedc09", new Object[]{this, commonUICallback, str});
        } else if (commonUICallback == null) {
        } else {
            HashMap hashMap = new HashMap();
            if (!StringUtils.isEmpty(str)) {
                hashMap.put("mobile", str);
            }
            commonUICallback.onResult(CommonUICallback.ACTION_ONEKEY_SEND_SMS, hashMap);
        }
    }

    public void onReceiveToast(LoginParam loginParam, RpcResponse<LoginReturnData> rpcResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b15a0ba6", new Object[]{this, loginParam, rpcResponse});
        } else {
            onReceiveAlert(loginParam, rpcResponse);
        }
    }

    public void onReceiveAlert(LoginParam loginParam, RpcResponse<LoginReturnData> rpcResponse) {
        String str;
        String str2;
        String str3;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d3ecfd1", new Object[]{this, loginParam, rpcResponse});
        } else if (this.mViewer == null) {
        } else {
            String str4 = rpcResponse.message;
            if (rpcResponse == null || rpcResponse.returnValue == null || rpcResponse.returnValue.extMap == null) {
                str = "";
            } else {
                str = rpcResponse.returnValue.extMap.containsKey("dialogTitle") ? rpcResponse.returnValue.extMap.get("dialogTitle") : "";
                if (rpcResponse.returnValue.extMap.containsKey("dialogContent")) {
                    str4 = rpcResponse.returnValue.extMap.get("dialogContent");
                    z = true;
                }
            }
            if (StringUtils.isEmpty(str4)) {
                str4 = ResourceUtil.getNetworkError();
            }
            if (!z) {
                str3 = str4;
                str2 = "";
            } else {
                str2 = str4;
                str3 = str;
            }
            BaseLoginView baseLoginView = this.mViewer;
            baseLoginView.alert(str3, str2, baseLoginView.getBaseActivity().getResources().getString(R.string.aliuser_common_ok), new DialogInterface.OnClickListener() { // from class: com.ali.user.mobile.login.presenter.BaseLoginPresenter.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                    } else if (BaseLoginPresenter.this.mViewer == null || !BaseLoginPresenter.this.mViewer.isActive()) {
                    } else {
                        BaseLoginPresenter.this.mViewer.dismissAlertDialog();
                    }
                }
            }, null, null);
        }
    }

    public void onReceivePwdError(final Activity activity, final LoginParam loginParam, RpcResponse rpcResponse, final CommonUICallback commonUICallback) {
        AliUserDialog.PositiveClickListener positiveClickListener;
        String str;
        String str2;
        String str3;
        String str4;
        IpChange ipChange = $ipChange;
        final boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f9f3a45", new Object[]{this, activity, loginParam, rpcResponse, commonUICallback});
        } else if (activity == null || activity.isFinishing()) {
        } else {
            DefaultLoginResponseData defaultLoginResponseData = (DefaultLoginResponseData) rpcResponse;
            UserLoginActivity userLoginActivity = (UserLoginActivity) activity;
            String string = activity.getResources().getString(R.string.aliuser_common_ok);
            if (defaultLoginResponseData != null && !StringUtils.isEmpty(defaultLoginResponseData.codeGroup) && loginParam != null && StringUtils.equals(ApiConstants.CodeGroup.PWD_CAN_SMS_ERROR, defaultLoginResponseData.codeGroup)) {
                if (defaultLoginResponseData.returnValue == 0 || ((LoginReturnData) defaultLoginResponseData.returnValue).extMap == null) {
                    str = "";
                    str4 = str;
                } else {
                    str = ((LoginReturnData) defaultLoginResponseData.returnValue).extMap.get("dialogTitle");
                    str4 = ((LoginReturnData) defaultLoginResponseData.returnValue).extMap.get("dialogContent");
                }
                str2 = activity.getResources().getString(R.string.aliuser_login_sms_login2);
                str3 = activity.getResources().getString(R.string.aliuser_cancel);
                positiveClickListener = new AliUserDialog.PositiveClickListener() { // from class: com.ali.user.mobile.login.presenter.BaseLoginPresenter.5
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.ali.user.mobile.ui.widget.AliUserDialog.PositiveClickListener
                    public void onClick(View view) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                            return;
                        }
                        if (BaseLoginPresenter.this.mAliUserDialog != null) {
                            BaseLoginPresenter.this.mAliUserDialog.dismiss();
                        }
                        BaseLoginPresenter.this.addControl(loginParam.utPageName, "Button-Nick-Sms-Login");
                        CommonUICallback commonUICallback2 = commonUICallback;
                        if (commonUICallback2 == null) {
                            return;
                        }
                        commonUICallback2.onResult(5001, null);
                    }
                };
            } else if (defaultLoginResponseData != null && !StringUtils.isEmpty(defaultLoginResponseData.codeGroup) && loginParam != null && StringUtils.equals(ApiConstants.CodeGroup.PWD_CAN_FACE_ERROR, defaultLoginResponseData.codeGroup) && ServiceFactory.getService(FaceService.class) != null) {
                if (defaultLoginResponseData.returnValue == 0 || ((LoginReturnData) defaultLoginResponseData.returnValue).extMap == null) {
                    str = "";
                    str4 = str;
                } else {
                    str = ((LoginReturnData) defaultLoginResponseData.returnValue).extMap.get("dialogTitle");
                    str4 = ((LoginReturnData) defaultLoginResponseData.returnValue).extMap.get("dialogContent");
                }
                str2 = activity.getResources().getString(R.string.aliuser_scan_login_text);
                str3 = activity.getResources().getString(R.string.aliuser_cancel);
                positiveClickListener = new AliUserDialog.PositiveClickListener() { // from class: com.ali.user.mobile.login.presenter.BaseLoginPresenter.6
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.ali.user.mobile.ui.widget.AliUserDialog.PositiveClickListener
                    public void onClick(View view) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                            return;
                        }
                        Activity activity2 = activity;
                        if (activity2 == null || activity2.isFinishing()) {
                            return;
                        }
                        if (BaseLoginPresenter.this.mAliUserDialog != null) {
                            BaseLoginPresenter.this.mAliUserDialog.dismiss();
                        }
                        BaseLoginPresenter.this.addControl(loginParam.utPageName, "Button-Nick-Face-Login");
                        CommonUICallback commonUICallback2 = commonUICallback;
                        if (commonUICallback2 == null) {
                            return;
                        }
                        commonUICallback2.onResult(5002, null);
                    }
                };
            } else if (defaultLoginResponseData != null && !StringUtils.isEmpty(defaultLoginResponseData.codeGroup) && loginParam != null && userLoginActivity != null && userLoginActivity.mAlipayInstall && StringUtils.equals(ApiConstants.CodeGroup.PWD_CAN_ALIPAY, defaultLoginResponseData.codeGroup) && LoginSwitch.isInABTestRegion(LoginSwitch.PWD_ERROR_TO_ALIPAY, 10000)) {
                if (defaultLoginResponseData.returnValue == 0 || ((LoginReturnData) defaultLoginResponseData.returnValue).extMap == null) {
                    str = "";
                    str4 = str;
                } else {
                    str = ((LoginReturnData) defaultLoginResponseData.returnValue).extMap.get("dialogTitle");
                    str4 = ((LoginReturnData) defaultLoginResponseData.returnValue).extMap.get("dialogContent");
                }
                String string2 = activity.getResources().getString(R.string.ali_user_alipay_quick_login);
                str3 = activity.getResources().getString(R.string.aliuser_re_enter);
                positiveClickListener = new AliUserDialog.PositiveClickListener() { // from class: com.ali.user.mobile.login.presenter.BaseLoginPresenter.7
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.ali.user.mobile.ui.widget.AliUserDialog.PositiveClickListener
                    public void onClick(View view) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                            return;
                        }
                        Activity activity2 = activity;
                        if (activity2 == null || activity2.isFinishing()) {
                            return;
                        }
                        if (BaseLoginPresenter.this.mAliUserDialog != null) {
                            BaseLoginPresenter.this.mAliUserDialog.dismiss();
                        }
                        BaseLoginPresenter.this.addControl(loginParam.utPageName, "Button-Nick-Alipay-Login");
                        CommonUICallback commonUICallback2 = commonUICallback;
                        if (commonUICallback2 == null) {
                            return;
                        }
                        commonUICallback2.onResult(5003, null);
                    }
                };
                str2 = string2;
                z = false;
            } else if (defaultLoginResponseData == null || StringUtils.isEmpty(defaultLoginResponseData.codeGroup) || loginParam == null || (!StringUtils.equals(ApiConstants.CodeGroup.PWD_ERROR, defaultLoginResponseData.codeGroup) && !StringUtils.equals("noRecord", defaultLoginResponseData.codeGroup))) {
                positiveClickListener = null;
                str = "";
                str2 = str;
                z = false;
                str3 = string;
                str4 = str2;
            } else {
                str2 = activity.getResources().getString(R.string.aliuser_alert_findpwd);
                positiveClickListener = new AliUserDialog.PositiveClickListener() { // from class: com.ali.user.mobile.login.presenter.BaseLoginPresenter.8
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.ali.user.mobile.ui.widget.AliUserDialog.PositiveClickListener
                    public void onClick(View view) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                            return;
                        }
                        Activity activity2 = activity;
                        if (activity2 == null || activity2.isFinishing()) {
                            return;
                        }
                        BaseLoginPresenter.this.addControl(loginParam.utPageName, "Button-Alert-ResetPwd");
                        BaseLoginPresenter.this.fetchUrlAndToWebView(activity, loginParam.loginId, LoginType.LocalLoginType.RETRIVE_PWD_LOGIN, loginParam.source);
                        if (BaseLoginPresenter.this.mAliUserDialog == null) {
                            return;
                        }
                        BaseLoginPresenter.this.mAliUserDialog.dismiss();
                    }
                };
                str = "";
                str3 = string;
                str4 = str;
            }
            if (StringUtils.isEmpty(str4)) {
                str4 = defaultLoginResponseData == null ? "" : defaultLoginResponseData.message;
            }
            if (StringUtils.isEmpty(str)) {
                str = str4;
                str4 = "";
            }
            AliUserDialog.Builder onNegativeClickListener = AliUserDialog.Builder(activity).setTitle(str).setMessage(str4).setOnNegativeClickListener(str3, new AliUserDialog.NegativeClickListener() { // from class: com.ali.user.mobile.login.presenter.BaseLoginPresenter.9
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.ali.user.mobile.ui.widget.AliUserDialog.NegativeClickListener
                public void onClick(View view) {
                    Activity activity2;
                    CommonUICallback commonUICallback2;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        return;
                    }
                    if (BaseLoginPresenter.this.mAliUserDialog != null) {
                        BaseLoginPresenter.this.mAliUserDialog.dismiss();
                    }
                    if (!z || (activity2 = activity) == null || activity2.isFinishing() || (commonUICallback2 = commonUICallback) == null) {
                        return;
                    }
                    commonUICallback2.onResult(CommonUICallback.ACTION_PWD_ERROR_SHOW_EYE, null);
                }
            });
            if (!StringUtils.isEmpty(str2)) {
                onNegativeClickListener.setOnPositiveClickListener(str2, positiveClickListener);
            }
            this.mAliUserDialog = onNegativeClickListener.build().shown();
            HashMap hashMap = new HashMap();
            if (defaultLoginResponseData != null) {
                hashMap.put("code", String.valueOf(defaultLoginResponseData.code));
            }
            if (defaultLoginResponseData != null && !StringUtils.isEmpty(defaultLoginResponseData.codeGroup)) {
                hashMap.put("codeGroup", defaultLoginResponseData.codeGroup);
            }
            UserTrackAdapter.sendUserTrack(loginParam.utPageName, "ShowPwdError", hashMap);
        }
    }

    public void addControl(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("144fd397", new Object[]{this, str, str2});
        } else {
            UserTrackAdapter.control(str, str2);
        }
    }

    public void cleanDataHodler() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39d61d36", new Object[]{this});
            return;
        }
        LoginParam loginParam = this.mLoginParam;
        if (loginParam == null || loginParam.isFromRegister || this.mLoginParam.isFoundPassword) {
            return;
        }
        LoginParam loginParam2 = this.mLoginParam;
        loginParam2.scene = null;
        loginParam2.token = null;
        if (loginParam2.ext == null) {
            return;
        }
        this.mLoginParam.ext.remove(LoginConstant.EXT_ACTION);
    }

    public LoginParam getLoginParam() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LoginParam) ipChange.ipc$dispatch("ee2f1432", new Object[]{this}) : this.mLoginParam;
    }

    @Override // com.ali.user.mobile.base.BasePresenter
    public void onDestory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbef83c", new Object[]{this});
        } else {
            this.mViewer = null;
        }
    }

    public void fetchUrlAndToWebView(Context context, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("486d40c3", new Object[]{this, context, str, str2, str3});
        } else {
            fetchUrlAndToWebView(context, str, str2, this.mViewer.getLoginSite(), str3);
        }
    }

    public void fetchUrlAndToWebView(Context context, String str, String str2, int i, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6508ca34", new Object[]{this, context, str, str2, new Integer(i), str3});
            return;
        }
        BaseLoginView baseLoginView = this.mViewer;
        if (baseLoginView == null || !baseLoginView.isActive()) {
            return;
        }
        this.mViewer.showLoading();
        BaseLoginView baseLoginView2 = this.mViewer;
        String pageName = baseLoginView2 instanceof BaseLoginFragment ? ((BaseLoginFragment) baseLoginView2).getPageName() : UTConstant.PageName.UT_PAGE_FIRST_LOGIN;
        String generateTraceId = ApiReferer.generateTraceId(str2, pageName);
        HashMap hashMap = new HashMap();
        hashMap.put("sdkTraceId", generateTraceId);
        UserTrackAdapter.control(pageName, UTConstant.CustomEvent.UT_LOGIN_ACTION, "", LoginType.LocalLoginType.RETRIVE_PWD_LOGIN, hashMap);
        try {
            final AccountCenterParam accountCenterParam = new AccountCenterParam();
            if (23 != i) {
                accountCenterParam.userInputName = str;
            }
            accountCenterParam.scene = "foundpassword";
            accountCenterParam.sdkTraceId = generateTraceId;
            accountCenterParam.fromSite = i;
            UrlFetchServiceImpl.getInstance().foundH5urls(accountCenterParam, new RpcRequestCallback() { // from class: com.ali.user.mobile.login.presenter.BaseLoginPresenter.10
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.ali.user.mobile.callback.RpcRequestCallback
                public void onSuccess(RpcResponse rpcResponse) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("2811f422", new Object[]{this, rpcResponse});
                    } else {
                        BaseLoginPresenter.this.handleData(accountCenterParam, (MtopAccountCenterUrlResponseData) rpcResponse);
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
        } catch (RpcException | Exception unused) {
        }
    }

    public void handleData(AccountCenterParam accountCenterParam, MtopAccountCenterUrlResponseData mtopAccountCenterUrlResponseData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("839ebb62", new Object[]{this, accountCenterParam, mtopAccountCenterUrlResponseData});
            return;
        }
        BaseLoginView baseLoginView = this.mViewer;
        if (baseLoginView == null || !baseLoginView.isActive()) {
            return;
        }
        try {
            try {
                if (mtopAccountCenterUrlResponseData == null) {
                    this.mViewer.toast(DataProviderFactory.getApplicationContext().getString(R.string.aliuser_network_error), 0);
                    BaseLoginView baseLoginView2 = this.mViewer;
                    if (baseLoginView2 == null) {
                        return;
                    }
                    baseLoginView2.dismissLoading();
                    return;
                }
                if (mtopAccountCenterUrlResponseData.h5Url != null) {
                    LoginParam loginParam = new LoginParam();
                    loginParam.tokenType = TokenType.FIND_PWD;
                    loginParam.sdkTraceId = accountCenterParam.sdkTraceId;
                    loginParam.loginSourceType = accountCenterParam.from;
                    if (this.mViewer instanceof BaseLoginFragment) {
                        loginParam.utPageName = ((BaseLoginFragment) this.mViewer).getPageName();
                    } else {
                        loginParam.utPageName = UTConstant.PageName.UT_PAGE_FIRST_LOGIN;
                    }
                    LoginReturnData loginReturnData = new LoginReturnData();
                    loginReturnData.site = this.mViewer.getLoginSite();
                    loginParam.errorCode = "0";
                    NavigatorManager.getInstance().navToWebViewPage(this.mViewer.getBaseActivity(), mtopAccountCenterUrlResponseData.h5Url, loginParam, loginReturnData);
                } else {
                    this.mViewer.toast(mtopAccountCenterUrlResponseData.errorMessage, 0);
                }
                BaseLoginView baseLoginView3 = this.mViewer;
                if (baseLoginView3 == null) {
                    return;
                }
                baseLoginView3.dismissLoading();
            } catch (RpcException e) {
                SDKExceptionHelper.getInstance().rpcExceptionHandler(e);
                BaseLoginView baseLoginView4 = this.mViewer;
                if (baseLoginView4 == null) {
                    return;
                }
                baseLoginView4.dismissLoading();
            } catch (Exception unused) {
                BaseLoginView baseLoginView5 = this.mViewer;
                if (baseLoginView5 == null) {
                    return;
                }
                baseLoginView5.dismissLoading();
            }
        } catch (Throwable th) {
            BaseLoginView baseLoginView6 = this.mViewer;
            if (baseLoginView6 != null) {
                baseLoginView6.dismissLoading();
            }
            throw th;
        }
    }
}
