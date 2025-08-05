package com.ali.user.mobile.login.presenter;

import com.ali.user.mobile.callback.LoginTasksCallback;
import com.ali.user.mobile.exception.LoginException;
import com.ali.user.mobile.log.ApiReferer;
import com.ali.user.mobile.login.LoginApi;
import com.ali.user.mobile.login.ui.BaseLoginView;
import com.ali.user.mobile.login.ui.OneKeyLoginView;
import com.ali.user.mobile.model.LoginParam;
import com.ali.user.mobile.model.LoginType;
import com.ali.user.mobile.model.TrackingModel;
import com.ali.user.mobile.rpc.RpcResponse;
import com.ali.user.mobile.rpc.login.model.LoginReturnData;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class SimVerifyPresenter extends BaseLoginPresenter {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String TAG;

    public static /* synthetic */ Object ipc$super(SimVerifyPresenter simVerifyPresenter, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.ali.user.mobile.login.presenter.BaseLoginPresenter
    public String getLocalLoginType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c11b97ab", new Object[]{this}) : LoginType.LocalLoginType.MOBILE_VERIFY_LOGIN;
    }

    static {
        kge.a(1363364685);
        TAG = "login." + SimVerifyPresenter.class.getSimpleName();
    }

    public SimVerifyPresenter(BaseLoginView baseLoginView, LoginParam loginParam) {
        super(baseLoginView, loginParam);
    }

    public void simLoginWithUserInput(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39c058c", new Object[]{this, str, new Long(j)});
            return;
        }
        if (this.mLoginParam == null) {
            this.mLoginParam = new LoginParam();
        }
        this.mLoginParam.loginId = str;
        if (j != 0) {
            this.mLoginParam.hid = j;
            this.mLoginParam.isFromAccount = true;
        }
        login(this.mLoginParam);
    }

    public void login(LoginParam loginParam) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecd2a50d", new Object[]{this, loginParam});
        } else if (this.mViewer == null || !this.mViewer.isActive()) {
        } else {
            LoginApi.mobileVerifyLogin(loginParam, buildTrackingModel(), this.mViewer, new LoginTasksCallback<LoginReturnData>() { // from class: com.ali.user.mobile.login.presenter.SimVerifyPresenter.1
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
                    } else if (SimVerifyPresenter.this.mViewer == null || !SimVerifyPresenter.this.mViewer.isActive()) {
                    } else {
                        RpcResponse<LoginReturnData> orinResponse = loginException.getOrinResponse();
                        if (orinResponse == null) {
                            SimVerifyPresenter.this.mViewer.toast(loginException.getMsg(), 0);
                        } else if (loginException.getCode() == 3013 || loginException.getCode() == 14076 || orinResponse.code == 3013 || orinResponse.code == 14076) {
                            if (!(SimVerifyPresenter.this.mViewer instanceof OneKeyLoginView)) {
                                return;
                            }
                            ((OneKeyLoginView) SimVerifyPresenter.this.mViewer).onGetAccessTokenFail();
                        } else if ((loginException.getCode() == 14044 || loginException.getCode() == 14163 || orinResponse.code == 14044 || orinResponse.code == 14163) && orinResponse.returnValue != null) {
                            if (!(SimVerifyPresenter.this.mViewer instanceof OneKeyLoginView)) {
                                return;
                            }
                            ((OneKeyLoginView) SimVerifyPresenter.this.mViewer).onNeedVerifyMobile(loginException.getMsg(), orinResponse.returnValue.mobile);
                        } else if (loginException.getCode() == 800 || loginException.getCode() == 700) {
                            SimVerifyPresenter simVerifyPresenter = SimVerifyPresenter.this;
                            simVerifyPresenter.onReceiveToast(simVerifyPresenter.mLoginParam, orinResponse);
                        } else {
                            SimVerifyPresenter.this.mViewer.toast(loginException.getMsg(), 0);
                        }
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
}
