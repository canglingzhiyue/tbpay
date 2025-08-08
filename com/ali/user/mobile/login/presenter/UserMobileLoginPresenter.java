package com.ali.user.mobile.login.presenter;

import android.app.Activity;
import android.content.DialogInterface;
import mtopsdk.common.util.StringUtils;
import com.ali.user.mobile.ability.excutor.ExecutorCenter;
import com.ali.user.mobile.ability.excutor.ExecutorContext;
import com.ali.user.mobile.ability.excutor.ExecutorResult;
import com.ali.user.mobile.ability.excutor.login.LoginExecutorParams;
import com.ali.user.mobile.app.constant.UTConstant;
import com.ali.user.mobile.callback.DataCallback;
import com.ali.user.mobile.callback.LoginTasksCallback;
import com.ali.user.mobile.data.model.SmsApplyResult;
import com.ali.user.mobile.exception.LoginException;
import com.ali.user.mobile.log.ApiReferer;
import com.ali.user.mobile.log.UserTrackAdapter;
import com.ali.user.mobile.login.CommonUICallback;
import com.ali.user.mobile.login.LoginApi;
import com.ali.user.mobile.login.ui.BaseLoginView;
import com.ali.user.mobile.login.ui.UserLoginActivity;
import com.ali.user.mobile.login.ui.UserMobileLoginView;
import com.ali.user.mobile.model.LoginParam;
import com.ali.user.mobile.model.LoginType;
import com.ali.user.mobile.model.TrackingModel;
import com.ali.user.mobile.register.RegistConstants;
import com.ali.user.mobile.rpc.RpcResponse;
import com.ali.user.mobile.rpc.login.model.LoginReturnData;
import com.ali.user.mobile.utils.ResourceUtil;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.log.LoginTLogAdapter;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes2.dex */
public class UserMobileLoginPresenter extends BaseLoginPresenter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(521927201);
    }

    public static /* synthetic */ Object ipc$super(UserMobileLoginPresenter userMobileLoginPresenter, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.ali.user.mobile.login.presenter.BaseLoginPresenter
    public String getLocalLoginType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c11b97ab", new Object[]{this}) : LoginType.LocalLoginType.SMS_LOGIN;
    }

    public static /* synthetic */ void access$000(UserMobileLoginPresenter userMobileLoginPresenter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c7103e5", new Object[]{userMobileLoginPresenter});
        } else {
            userMobileLoginPresenter.dismissLoading();
        }
    }

    public static /* synthetic */ void access$100(UserMobileLoginPresenter userMobileLoginPresenter, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c0befb0", new Object[]{userMobileLoginPresenter, str});
        } else {
            userMobileLoginPresenter.newSendSms(str);
        }
    }

    public UserMobileLoginPresenter(BaseLoginView baseLoginView, LoginParam loginParam) {
        super(baseLoginView, loginParam);
    }

    @Override // com.ali.user.mobile.login.presenter.BaseLoginPresenter
    public void login() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99739770", new Object[]{this});
        } else if (this.mViewer == null || !this.mViewer.isActive()) {
        } else {
            LoginApi.smsLogin(this.mLoginParam.m102clone(), buildTrackingModel(), this.mViewer, new LoginTasksCallback<LoginReturnData>() { // from class: com.ali.user.mobile.login.presenter.UserMobileLoginPresenter.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.ali.user.mobile.callback.LoginTasksCallback
                public void onSuccess(RpcResponse<LoginReturnData> rpcResponse) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("2811f422", new Object[]{this, rpcResponse});
                    } else {
                        UserMobileLoginPresenter.access$000(UserMobileLoginPresenter.this);
                    }
                }

                @Override // com.ali.user.mobile.callback.LoginTasksCallback
                public void onFail(LoginException<LoginReturnData> loginException) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("77abaa65", new Object[]{this, loginException});
                    } else if (UserMobileLoginPresenter.this.mViewer == null || !UserMobileLoginPresenter.this.mViewer.isActive()) {
                    } else {
                        UserMobileLoginPresenter.access$000(UserMobileLoginPresenter.this);
                        if (loginException.getCode() == 700) {
                            UserMobileLoginPresenter userMobileLoginPresenter = UserMobileLoginPresenter.this;
                            userMobileLoginPresenter.onReceiveAlert(userMobileLoginPresenter.mLoginParam, loginException.getOrinResponse());
                            return;
                        }
                        UserMobileLoginPresenter.this.mViewer.toast(loginException.getMsg(), 0);
                    }
                }

                @Override // com.ali.user.mobile.callback.LoginTasksCallback
                public void onCancel() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("379d4540", new Object[]{this});
                    } else {
                        UserMobileLoginPresenter.access$000(UserMobileLoginPresenter.this);
                    }
                }
            });
        }
    }

    private void dismissLoading() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c142d9", new Object[]{this});
        } else if (this.mViewer == null || !this.mViewer.isActive()) {
        } else {
            this.mViewer.dismissLoading();
        }
    }

    @Override // com.ali.user.mobile.login.presenter.BaseLoginPresenter
    public void onReceiveAlert(LoginParam loginParam, RpcResponse<LoginReturnData> rpcResponse) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d3ecfd1", new Object[]{this, loginParam, rpcResponse});
        } else if (this.mViewer == null) {
        } else {
            String str2 = rpcResponse.message;
            if (rpcResponse == null || rpcResponse.returnValue == null || rpcResponse.returnValue.extMap == null) {
                str = "";
            } else {
                str = rpcResponse.returnValue.extMap.get("dialogTitle");
                str2 = rpcResponse.returnValue.extMap.get("dialogContent");
            }
            if (StringUtils.isEmpty(str2)) {
                str2 = ResourceUtil.getNetworkError();
            }
            this.mViewer.alert(str, str2, this.mViewer.getBaseActivity().getResources().getString(R.string.aliuser_common_ok), new DialogInterface.OnClickListener() { // from class: com.ali.user.mobile.login.presenter.UserMobileLoginPresenter.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                    } else if (UserMobileLoginPresenter.this.mViewer == null || !UserMobileLoginPresenter.this.mViewer.isActive()) {
                    } else {
                        UserMobileLoginPresenter.this.mViewer.dismissAlertDialog();
                        ((UserMobileLoginView) UserMobileLoginPresenter.this.mViewer).onCheckCodeError();
                    }
                }
            }, null, null);
        }
    }

    public void buildSMSLoginParam(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60f637ea", new Object[]{this, str, str2, new Boolean(z)});
        } else if (this.mViewer instanceof UserMobileLoginView) {
            buildSMSLoginParam(str, str2, z, ((UserMobileLoginView) this.mViewer).getCountryCode(), ((UserMobileLoginView) this.mViewer).getPhoneCode());
        } else {
            buildSMSLoginParam(str, str2, z, "CN", "86");
        }
    }

    public void buildSMSLoginParam(String str, String str2, boolean z, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4313ffe", new Object[]{this, str, str2, new Boolean(z), str3, str4});
            return;
        }
        if (this.mLoginParam == null) {
            this.mLoginParam = new LoginParam();
        }
        this.mLoginParam.nativeLoginType = LoginType.ServerLoginType.SMSLogin.getType();
        this.mLoginParam.isFromAccount = this.mViewer.isHistoryMode();
        this.mLoginParam.site = this.mViewer.getLoginSite();
        this.mLoginParam.loginId = str;
        this.mLoginParam.smsCode = str2;
        if (this.mLoginParam.ext == null) {
            this.mLoginParam.ext = new HashMap();
        }
        this.mLoginParam.ext.put("apiReferer", ApiReferer.generateApiReferer());
        this.mLoginParam.ext.put("showReigsterPolicy", "true");
        this.mLoginParam.countryCode = str3;
        this.mLoginParam.phoneCode = str4;
        if (!this.mLoginParam.isFromAccount) {
            this.mLoginParam.deviceTokenKey = "";
        }
        this.mLoginParam.hid = 0L;
        this.mLoginParam.sendAudio = z;
    }

    private TrackingModel buildTrackingModel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TrackingModel) ipChange.ipc$dispatch("5f618518", new Object[]{this});
        }
        TrackingModel trackingModel = new TrackingModel();
        trackingModel.pageName = this.mViewer.getPageName();
        trackingModel.loginType = LoginType.LocalLoginType.SMS_LOGIN;
        trackingModel.traceId = ApiReferer.generateTraceId(trackingModel.loginType, trackingModel.pageName);
        return trackingModel;
    }

    public void getOverseaSimVerifyUrl(final LoginTasksCallback<LoginReturnData> loginTasksCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9ed8b8a", new Object[]{this, loginTasksCallback});
            return;
        }
        this.mViewer.showLoading();
        LoginApi.overseaSimLogin(this.mLoginParam, buildTrackingModel(), this.mViewer, new LoginTasksCallback<LoginReturnData>() { // from class: com.ali.user.mobile.login.presenter.UserMobileLoginPresenter.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.ali.user.mobile.callback.LoginTasksCallback
            public void onSuccess(RpcResponse<LoginReturnData> rpcResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("2811f422", new Object[]{this, rpcResponse});
                    return;
                }
                LoginTLogAdapter.e(BaseLoginPresenter.TAG, "OverseaSimLogin onSuccess");
                UserMobileLoginPresenter.this.mViewer.dismissLoading();
                UserTrackAdapter.sendUT(UserMobileLoginPresenter.this.mViewer.getPageName(), UTConstant.CustomEvent.UT_SINGLE_LOGIN_SUCCESS, "", LoginType.LocalLoginType.OVERSEA_SIM_LOGIN, null);
                LoginTasksCallback loginTasksCallback2 = loginTasksCallback;
                if (loginTasksCallback2 == null) {
                    return;
                }
                loginTasksCallback2.onSuccess(rpcResponse);
            }

            @Override // com.ali.user.mobile.callback.LoginTasksCallback
            public void onFail(LoginException<LoginReturnData> loginException) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("77abaa65", new Object[]{this, loginException});
                    return;
                }
                LoginTLogAdapter.e(BaseLoginPresenter.TAG, "OverseaSimLogin onFail");
                UserMobileLoginPresenter.this.mViewer.dismissLoading();
                UserTrackAdapter.sendUT(UserMobileLoginPresenter.this.mViewer.getPageName(), UTConstant.CustomEvent.UT_SINGLE_LOGIN_FAILURE, "", LoginType.LocalLoginType.OVERSEA_SIM_LOGIN, null);
                LoginTasksCallback loginTasksCallback2 = loginTasksCallback;
                if (loginTasksCallback2 == null) {
                    return;
                }
                loginTasksCallback2.onFail(loginException);
            }

            @Override // com.ali.user.mobile.callback.LoginTasksCallback
            public void onCancel() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("379d4540", new Object[]{this});
                    return;
                }
                LoginTLogAdapter.e(BaseLoginPresenter.TAG, "OverseaSimLogin onCancel");
                UserMobileLoginPresenter.this.mViewer.dismissLoading();
                UserTrackAdapter.sendUT(UserMobileLoginPresenter.this.mViewer.getPageName(), UTConstant.CustomEvent.UT_SINGLE_LOGIN_CANCEL, "", LoginType.LocalLoginType.OVERSEA_SIM_LOGIN, null);
                LoginTasksCallback loginTasksCallback2 = loginTasksCallback;
                if (loginTasksCallback2 == null) {
                    return;
                }
                loginTasksCallback2.onCancel();
            }
        });
    }

    public void sendSMS() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bc4a8b8", new Object[]{this});
        } else {
            sendSMS("");
        }
    }

    public void sendSMS(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78261482", new Object[]{this, str});
        } else {
            newSendSms(str);
        }
    }

    private void newSendSms(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2964c2c2", new Object[]{this, str});
            return;
        }
        this.mViewer.showLoading();
        newSendSMSAction(this.mLoginParam, str, new LoginTasksCallback<LoginReturnData>() { // from class: com.ali.user.mobile.login.presenter.UserMobileLoginPresenter.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.ali.user.mobile.callback.LoginTasksCallback
            public void onSuccess(RpcResponse<LoginReturnData> rpcResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("2811f422", new Object[]{this, rpcResponse});
                } else if (UserMobileLoginPresenter.this.mViewer == null || !UserMobileLoginPresenter.this.mViewer.isActive()) {
                } else {
                    UserMobileLoginPresenter.access$000(UserMobileLoginPresenter.this);
                    LoginReturnData loginReturnData = rpcResponse.returnValue;
                    if (loginReturnData == null) {
                        return;
                    }
                    UserMobileLoginPresenter.this.mLoginParam.smsSid = loginReturnData.extMap.get("smsSid");
                    UserMobileLoginPresenter.this.mLoginParam.codeLength = loginReturnData.extMap.get(RegistConstants.REGISTER_CODE_LENGTH);
                    if (!StringUtils.isEmpty(loginReturnData.extMap.get("helpVideoUrl"))) {
                        UserMobileLoginPresenter.this.mLoginParam.helpUrl = loginReturnData.extMap.get("helpVideoUrl");
                    }
                    if (!StringUtils.equals(rpcResponse.actionType, "SUCCESS")) {
                        return;
                    }
                    if (rpcResponse.code == 14050) {
                        UserMobileLoginPresenter.this.mViewer.alert("", rpcResponse.message, UserMobileLoginPresenter.this.mViewer.getBaseActivity().getResources().getString(R.string.aliuser_common_ok), new DialogInterface.OnClickListener() { // from class: com.ali.user.mobile.login.presenter.UserMobileLoginPresenter.4.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // android.content.DialogInterface.OnClickListener
                            public void onClick(DialogInterface dialogInterface, int i) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                                } else if (UserMobileLoginPresenter.this.mViewer == null || !UserMobileLoginPresenter.this.mViewer.isActive()) {
                                } else {
                                    UserMobileLoginPresenter.this.mViewer.dismissAlertDialog();
                                }
                            }
                        }, null, null);
                        ((UserMobileLoginView) UserMobileLoginPresenter.this.mViewer).onSendSMSSuccess(60000L, false);
                    } else if (rpcResponse.code == 14142) {
                        if (UserMobileLoginPresenter.this.mViewer.getBaseActivity() instanceof UserLoginActivity) {
                            ((UserLoginActivity) UserMobileLoginPresenter.this.mViewer.getBaseActivity()).setNeedSMSCheck(false);
                        }
                        if (rpcResponse.returnValue == null || rpcResponse.returnValue.extMap == null) {
                            return;
                        }
                        UserMobileLoginPresenter.this.mViewer.alert(rpcResponse.returnValue.extMap.get("dialogTitle"), rpcResponse.returnValue.extMap.get("dialogContent"), rpcResponse.returnValue.extMap.get("dialogRightBtn"), new DialogInterface.OnClickListener() { // from class: com.ali.user.mobile.login.presenter.UserMobileLoginPresenter.4.2
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // android.content.DialogInterface.OnClickListener
                            public void onClick(DialogInterface dialogInterface, int i) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                                    return;
                                }
                                if (UserMobileLoginPresenter.this.mViewer != null && UserMobileLoginPresenter.this.mViewer.isActive()) {
                                    UserMobileLoginPresenter.this.mViewer.dismissAlertDialog();
                                    UserTrackAdapter.sendUT(UserMobileLoginPresenter.this.mViewer.getPageName(), "resend_alert_input_code");
                                }
                                if (UserMobileLoginPresenter.this.mViewer == null || !(UserMobileLoginPresenter.this.mViewer instanceof UserMobileLoginView)) {
                                    return;
                                }
                                ((UserMobileLoginView) UserMobileLoginPresenter.this.mViewer).onSendSMSSuccess(60000L, true);
                            }
                        }, rpcResponse.returnValue.extMap.get("dialogLeftBtn"), new DialogInterface.OnClickListener() { // from class: com.ali.user.mobile.login.presenter.UserMobileLoginPresenter.4.3
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // android.content.DialogInterface.OnClickListener
                            public void onClick(DialogInterface dialogInterface, int i) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                                    return;
                                }
                                if (UserMobileLoginPresenter.this.mViewer != null && UserMobileLoginPresenter.this.mViewer.isActive()) {
                                    UserMobileLoginPresenter.this.mViewer.dismissAlertDialog();
                                    UserTrackAdapter.sendUT(UserMobileLoginPresenter.this.mViewer.getPageName(), "resend_alert_resend");
                                }
                                UserMobileLoginPresenter.this.mLoginParam.resendAlert = false;
                                UserMobileLoginPresenter.access$100(UserMobileLoginPresenter.this, str);
                            }
                        });
                        UserTrackAdapter.UIShown(UserMobileLoginPresenter.this.mViewer.getPageName(), "resend_alert");
                    } else if (UserMobileLoginPresenter.this.mViewer == null || !(UserMobileLoginPresenter.this.mViewer instanceof UserMobileLoginView)) {
                    } else {
                        ((UserMobileLoginView) UserMobileLoginPresenter.this.mViewer).onSendSMSSuccess(60000L, true);
                    }
                }
            }

            @Override // com.ali.user.mobile.callback.LoginTasksCallback
            public void onFail(LoginException<LoginReturnData> loginException) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("77abaa65", new Object[]{this, loginException});
                } else if (UserMobileLoginPresenter.this.mViewer == null || !UserMobileLoginPresenter.this.mViewer.isActive()) {
                } else {
                    UserMobileLoginPresenter.access$000(UserMobileLoginPresenter.this);
                    if (loginException.getCode() == 800) {
                        if (UserMobileLoginPresenter.this.mViewer == null) {
                            return;
                        }
                        if (loginException.getOrinResponse().code == 14100 && UserMobileLoginPresenter.this.mLoginParam != null && !StringUtils.isEmpty(UserMobileLoginPresenter.this.mLoginParam.smsSid) && !StringUtils.isEmpty(UserMobileLoginPresenter.this.mLoginParam.codeLength)) {
                            ((UserMobileLoginView) UserMobileLoginPresenter.this.mViewer).onSMSOverLimit(loginException.getOrinResponse());
                            return;
                        }
                        String str2 = loginException.getOrinResponse().message;
                        if (StringUtils.isEmpty(str2)) {
                            str2 = ResourceUtil.getNetworkError();
                        }
                        UserMobileLoginPresenter.this.mViewer.alert(str2, "", UserMobileLoginPresenter.this.mViewer.getBaseActivity().getResources().getString(R.string.aliuser_common_ok), new DialogInterface.OnClickListener() { // from class: com.ali.user.mobile.login.presenter.UserMobileLoginPresenter.4.4
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // android.content.DialogInterface.OnClickListener
                            public void onClick(DialogInterface dialogInterface, int i) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                                } else if (UserMobileLoginPresenter.this.mViewer == null || !UserMobileLoginPresenter.this.mViewer.isActive()) {
                                } else {
                                    UserMobileLoginPresenter.this.mViewer.dismissAlertDialog();
                                }
                            }
                        }, null, null);
                        return;
                    }
                    String msg = loginException.getMsg();
                    if (StringUtils.isEmpty(msg)) {
                        msg = ResourceUtil.getNetworkError();
                    }
                    UserMobileLoginPresenter.this.mViewer.toast(msg, 0);
                }
            }

            @Override // com.ali.user.mobile.callback.LoginTasksCallback
            public void onCancel() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("379d4540", new Object[]{this});
                } else {
                    UserMobileLoginPresenter.access$000(UserMobileLoginPresenter.this);
                }
            }
        });
    }

    private void newSendSMSAction(LoginParam loginParam, String str, LoginTasksCallback<LoginReturnData> loginTasksCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7707c420", new Object[]{this, loginParam, str, loginTasksCallback});
        } else if (StringUtils.isEmpty(str)) {
            LoginApi.smsSend(loginParam, buildTrackingModel(), this.mViewer, loginTasksCallback);
        } else {
            loginParam.loginId = str;
            LoginApi.nickSmsSend(loginParam, buildTrackingModel(), this.mViewer, loginTasksCallback);
        }
    }

    public void sendSMS(final Activity activity, final LoginParam loginParam, final CommonUICallback commonUICallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b398f044", new Object[]{this, activity, loginParam, commonUICallback});
            return;
        }
        LoginExecutorParams loginExecutorParams = new LoginExecutorParams();
        loginExecutorParams.type = getLocalLoginType();
        loginExecutorParams.params = loginParam;
        ExecutorCenter.execute("sendlogincode", new ExecutorContext.ExcutorContextBuilder().context(activity).params(loginExecutorParams).build(), new DataCallback<ExecutorResult>() { // from class: com.ali.user.mobile.login.presenter.UserMobileLoginPresenter.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.ali.user.mobile.callback.DataCallback
            public void result(ExecutorResult executorResult) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("aeab9d99", new Object[]{this, executorResult});
                } else if (executorResult.success) {
                    final RpcResponse rpcResponse = (RpcResponse) executorResult.bizInfo.get("data");
                    final LoginReturnData loginReturnData = (LoginReturnData) rpcResponse.returnValue;
                    if (executorResult == null) {
                        return;
                    }
                    UserMobileLoginPresenter.this.mLoginParam.smsSid = loginReturnData.extMap.get("smsSid");
                    UserMobileLoginPresenter.this.mLoginParam.codeLength = loginReturnData.extMap.get(RegistConstants.REGISTER_CODE_LENGTH);
                    if (!StringUtils.isEmpty(loginReturnData.extMap.get("helpVideoUrl"))) {
                        UserMobileLoginPresenter.this.mLoginParam.helpUrl = loginReturnData.extMap.get("helpVideoUrl");
                    }
                    if (!StringUtils.equals(rpcResponse.actionType, "SUCCESS")) {
                        return;
                    }
                    if (rpcResponse.code == 14050) {
                        UserMobileLoginPresenter.this.mViewer.alert("", rpcResponse.message, UserMobileLoginPresenter.this.mViewer.getBaseActivity().getResources().getString(R.string.aliuser_common_ok), new DialogInterface.OnClickListener() { // from class: com.ali.user.mobile.login.presenter.UserMobileLoginPresenter.5.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // android.content.DialogInterface.OnClickListener
                            public void onClick(DialogInterface dialogInterface, int i) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                                    return;
                                }
                                if (UserMobileLoginPresenter.this.mViewer != null && UserMobileLoginPresenter.this.mViewer.isActive()) {
                                    UserMobileLoginPresenter.this.mViewer.dismissAlertDialog();
                                }
                                UserMobileLoginPresenter.this.sendSuccess(false, rpcResponse.code, loginReturnData.extMap, commonUICallback);
                            }
                        }, null, null);
                    } else if (rpcResponse.code == 14142) {
                        if (UserMobileLoginPresenter.this.mViewer.getBaseActivity() instanceof UserLoginActivity) {
                            ((UserLoginActivity) UserMobileLoginPresenter.this.mViewer.getBaseActivity()).setNeedSMSCheck(false);
                        }
                        if (rpcResponse.returnValue == 0 || ((LoginReturnData) rpcResponse.returnValue).extMap == null) {
                            return;
                        }
                        String str = ((LoginReturnData) rpcResponse.returnValue).extMap.get("dialogTitle");
                        String str2 = ((LoginReturnData) rpcResponse.returnValue).extMap.get("dialogContent");
                        String str3 = ((LoginReturnData) rpcResponse.returnValue).extMap.get("dialogLeftBtn");
                        String str4 = ((LoginReturnData) rpcResponse.returnValue).extMap.get("dialogRightBtn");
                        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: com.ali.user.mobile.login.presenter.UserMobileLoginPresenter.5.2
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // android.content.DialogInterface.OnClickListener
                            public void onClick(DialogInterface dialogInterface, int i) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                                    return;
                                }
                                if (UserMobileLoginPresenter.this.mViewer != null && UserMobileLoginPresenter.this.mViewer.isActive()) {
                                    UserMobileLoginPresenter.this.mViewer.dismissAlertDialog();
                                    UserTrackAdapter.sendUT(UserMobileLoginPresenter.this.mViewer.getPageName(), "resend_alert_input_code");
                                }
                                UserMobileLoginPresenter.this.sendSuccess(false, rpcResponse.code, loginReturnData.extMap, commonUICallback);
                            }
                        };
                        DialogInterface.OnClickListener onClickListener2 = new DialogInterface.OnClickListener() { // from class: com.ali.user.mobile.login.presenter.UserMobileLoginPresenter.5.3
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // android.content.DialogInterface.OnClickListener
                            public void onClick(DialogInterface dialogInterface, int i) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                                    return;
                                }
                                if (UserMobileLoginPresenter.this.mViewer != null && UserMobileLoginPresenter.this.mViewer.isActive()) {
                                    UserMobileLoginPresenter.this.mViewer.dismissAlertDialog();
                                    UserTrackAdapter.sendUT(UserMobileLoginPresenter.this.mViewer.getPageName(), "resend_alert_resend");
                                }
                                loginParam.resendAlert = false;
                                UserMobileLoginPresenter.this.sendSMS(activity, loginParam, commonUICallback);
                            }
                        };
                        UserTrackAdapter.UIShown(UserMobileLoginPresenter.this.mViewer.getPageName(), "resend_alert");
                        UserMobileLoginPresenter.this.mViewer.alert(str, str2, str4, onClickListener, str3, onClickListener2);
                    } else {
                        UserMobileLoginPresenter.this.sendSuccess(true, rpcResponse.code, loginReturnData.extMap, commonUICallback);
                    }
                } else if (executorResult.bizInfo != null && (executorResult.bizInfo.get("data") instanceof RpcResponse)) {
                    RpcResponse rpcResponse2 = (RpcResponse) executorResult.bizInfo.get("data");
                    if (rpcResponse2.code == 14120) {
                        String str5 = null;
                        if (rpcResponse2.returnValue != 0 && ((LoginReturnData) rpcResponse2.returnValue).extMap != null) {
                            str5 = ((LoginReturnData) rpcResponse2.returnValue).extMap.get("dialogContent");
                        }
                        UserTrackAdapter.sendUT(UserMobileLoginPresenter.this.mViewer.getPageName(), "CheckSimilarity");
                        UserMobileLoginPresenter.this.mViewer.alert(str5, "", UserMobileLoginPresenter.this.mViewer.getBaseActivity().getResources().getString(R.string.aliuser_re_enter), new DialogInterface.OnClickListener() { // from class: com.ali.user.mobile.login.presenter.UserMobileLoginPresenter.5.4
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // android.content.DialogInterface.OnClickListener
                            public void onClick(DialogInterface dialogInterface, int i) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                                } else {
                                    UserTrackAdapter.control(UserMobileLoginPresenter.this.mViewer.getPageName(), "Button-Alert-CheckSimilarity-no");
                                }
                            }
                        }, UserMobileLoginPresenter.this.mViewer.getBaseActivity().getResources().getString(R.string.aliuser_common_ok), new DialogInterface.OnClickListener() { // from class: com.ali.user.mobile.login.presenter.UserMobileLoginPresenter.5.5
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // android.content.DialogInterface.OnClickListener
                            public void onClick(DialogInterface dialogInterface, int i) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                                    return;
                                }
                                UserTrackAdapter.control(UserMobileLoginPresenter.this.mViewer.getPageName(), "Button-Alert-CheckSimilarity-yes");
                                commonUICallback.onResult(6002, null);
                            }
                        });
                        return;
                    }
                    UserMobileLoginPresenter.this.sendToast(executorResult);
                } else {
                    UserMobileLoginPresenter.this.sendToast(executorResult);
                }
            }
        });
    }

    public void sendSuccess(boolean z, int i, Map<String, String> map, CommonUICallback commonUICallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("744aef71", new Object[]{this, new Boolean(z), new Integer(i), map, commonUICallback});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("millSecond", 60000L);
        hashMap.put("needToast", String.valueOf(z));
        hashMap.put("errorCode", Integer.valueOf(i));
        if (map != null) {
            hashMap.put("result", JSON.parseObject(JSON.toJSONString(map), SmsApplyResult.class));
        }
        if (commonUICallback == null) {
            return;
        }
        commonUICallback.onResult(CommonUICallback.ACTION_HANDLE_SEND_SMS_SUCCESS, hashMap);
    }
}
