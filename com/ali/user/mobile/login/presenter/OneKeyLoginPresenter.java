package com.ali.user.mobile.login.presenter;

import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.mobile.callback.LoginTasksCallback;
import com.ali.user.mobile.exception.LoginException;
import com.ali.user.mobile.log.ApiReferer;
import com.ali.user.mobile.login.LoginApi;
import com.ali.user.mobile.login.ui.BaseLoginView;
import com.ali.user.mobile.login.ui.OneKeyLoginFragment;
import com.ali.user.mobile.model.LoginParam;
import com.ali.user.mobile.model.LoginType;
import com.ali.user.mobile.model.TrackingModel;
import com.ali.user.mobile.rpc.RpcResponse;
import com.ali.user.mobile.rpc.login.model.LoginReturnData;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.kge;

/* loaded from: classes2.dex */
public class OneKeyLoginPresenter extends BaseLoginPresenter {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String TAG;

    public static /* synthetic */ Object ipc$super(OneKeyLoginPresenter oneKeyLoginPresenter, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.ali.user.mobile.login.presenter.BaseLoginPresenter
    public String getLocalLoginType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c11b97ab", new Object[]{this}) : LoginType.LocalLoginType.SIM_LOGIN;
    }

    static {
        kge.a(-1107904147);
        TAG = "login." + OneKeyLoginPresenter.class.getSimpleName();
    }

    public OneKeyLoginPresenter(BaseLoginView baseLoginView, LoginParam loginParam) {
        super(baseLoginView, loginParam);
    }

    @Override // com.ali.user.mobile.login.presenter.BaseLoginPresenter
    public void login() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99739770", new Object[]{this});
        } else if (this.mViewer == null || !this.mViewer.isActive()) {
        } else {
            LoginApi.simLogin(this.mLoginParam, buildTrackingModel(), this.mViewer, new LoginTasksCallback<LoginReturnData>() { // from class: com.ali.user.mobile.login.presenter.OneKeyLoginPresenter.1
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
                    } else if (OneKeyLoginPresenter.this.mViewer == null || !OneKeyLoginPresenter.this.mViewer.isActive()) {
                    } else {
                        if (loginException.getCode() == 3010 || loginException.getCode() == 14076) {
                            OneKeyLoginPresenter.this.mViewer.toast(DataProviderFactory.getApplicationContext().getString(R.string.aliuser_onekey_login_fail_tip), 0);
                            if (!(OneKeyLoginPresenter.this.mViewer instanceof OneKeyLoginFragment)) {
                                return;
                            }
                            ((OneKeyLoginFragment) OneKeyLoginPresenter.this.mViewer).switchToRecommendLogin();
                        } else if (loginException.getCode() == 14044 && loginException.getOrinResponse() != null && loginException.getOrinResponse().returnValue != null) {
                            if (!(OneKeyLoginPresenter.this.mViewer instanceof OneKeyLoginFragment)) {
                                return;
                            }
                            ((OneKeyLoginFragment) OneKeyLoginPresenter.this.mViewer).onNeedVerifyMobile(loginException.getMsg(), loginException.getOrinResponse().returnValue.mobile);
                        } else if (loginException.getCode() == 800 || loginException.getCode() == 700) {
                            OneKeyLoginPresenter oneKeyLoginPresenter = OneKeyLoginPresenter.this;
                            oneKeyLoginPresenter.onReceiveToast(oneKeyLoginPresenter.mLoginParam, loginException.getOrinResponse());
                        } else {
                            OneKeyLoginPresenter.this.mViewer.toast(loginException.getMsg(), 0);
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
