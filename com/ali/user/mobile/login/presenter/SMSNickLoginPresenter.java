package com.ali.user.mobile.login.presenter;

import com.ali.user.mobile.callback.LoginTasksCallback;
import com.ali.user.mobile.exception.LoginException;
import com.ali.user.mobile.log.ApiReferer;
import com.ali.user.mobile.login.LoginApi;
import com.ali.user.mobile.login.ui.BaseLoginView;
import com.ali.user.mobile.model.LoginParam;
import com.ali.user.mobile.model.LoginType;
import com.ali.user.mobile.model.TrackingModel;
import com.ali.user.mobile.rpc.RpcResponse;
import com.ali.user.mobile.rpc.login.model.LoginReturnData;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import tb.kge;

/* loaded from: classes2.dex */
public class SMSNickLoginPresenter extends UserMobileLoginPresenter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-193159770);
    }

    public static /* synthetic */ Object ipc$super(SMSNickLoginPresenter sMSNickLoginPresenter, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.ali.user.mobile.login.presenter.UserMobileLoginPresenter, com.ali.user.mobile.login.presenter.BaseLoginPresenter
    public String getLocalLoginType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c11b97ab", new Object[]{this}) : LoginType.LocalLoginType.NICK_SMS_LOGIN;
    }

    public SMSNickLoginPresenter(BaseLoginView baseLoginView, LoginParam loginParam) {
        super(baseLoginView, loginParam);
    }

    @Override // com.ali.user.mobile.login.presenter.UserMobileLoginPresenter, com.ali.user.mobile.login.presenter.BaseLoginPresenter
    public void login() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99739770", new Object[]{this});
        } else if (this.mViewer == null || !this.mViewer.isActive()) {
        } else {
            LoginApi.nickSmsLogin(this.mLoginParam.m102clone(), buildTrackingModel(), this.mViewer, new LoginTasksCallback<LoginReturnData>() { // from class: com.ali.user.mobile.login.presenter.SMSNickLoginPresenter.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.ali.user.mobile.callback.LoginTasksCallback
                public void onCancel() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("379d4540", new Object[]{this});
                    }
                }

                @Override // com.ali.user.mobile.callback.LoginTasksCallback
                public void onSuccess(RpcResponse<LoginReturnData> rpcResponse) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("2811f422", new Object[]{this, rpcResponse});
                    }
                }

                @Override // com.ali.user.mobile.callback.LoginTasksCallback
                public void onFail(LoginException<LoginReturnData> loginException) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("77abaa65", new Object[]{this, loginException});
                    } else if (SMSNickLoginPresenter.this.mViewer == null || !SMSNickLoginPresenter.this.mViewer.isActive()) {
                    } else {
                        if (loginException.getCode() == 700) {
                            SMSNickLoginPresenter sMSNickLoginPresenter = SMSNickLoginPresenter.this;
                            sMSNickLoginPresenter.onReceiveAlert(sMSNickLoginPresenter.mLoginParam, loginException.getOrinResponse());
                            return;
                        }
                        SMSNickLoginPresenter.this.mViewer.toast(loginException.getMsg(), 0);
                    }
                }
            });
        }
    }

    private TrackingModel buildTrackingModel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TrackingModel) ipChange.ipc$dispatch("5f618518", new Object[]{this});
        }
        TrackingModel trackingModel = new TrackingModel();
        trackingModel.pageName = this.mViewer.getPageName();
        trackingModel.loginType = getLocalLoginType();
        trackingModel.traceId = ApiReferer.generateTraceId(trackingModel.loginType, trackingModel.pageName);
        return trackingModel;
    }

    @Override // com.ali.user.mobile.login.presenter.UserMobileLoginPresenter
    public void buildSMSLoginParam(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60f637ea", new Object[]{this, str, str2, new Boolean(z)});
            return;
        }
        if (this.mLoginParam == null) {
            this.mLoginParam = new LoginParam();
        }
        this.mLoginParam.isFromAccount = this.mViewer.isHistoryMode();
        this.mLoginParam.site = this.mViewer.getLoginSite();
        this.mLoginParam.loginId = str;
        this.mLoginParam.smsCode = str2;
        if (this.mLoginParam.ext == null) {
            this.mLoginParam.ext = new HashMap();
        }
        this.mLoginParam.ext.put("apiReferer", ApiReferer.generateApiReferer());
        this.mLoginParam.deviceTokenKey = "";
        this.mLoginParam.hid = 0L;
        this.mLoginParam.sendAudio = z;
    }
}
