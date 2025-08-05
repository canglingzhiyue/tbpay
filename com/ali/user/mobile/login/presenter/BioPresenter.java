package com.ali.user.mobile.login.presenter;

import android.content.DialogInterface;
import android.text.TextUtils;
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
import com.ali.user.mobile.utils.ResourceUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.kge;

/* loaded from: classes2.dex */
public class BioPresenter extends BaseLoginPresenter {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public LoginParam mLoginParam;
    public BaseLoginView mViewer;

    static {
        kge.a(-1314270923);
    }

    public static /* synthetic */ Object ipc$super(BioPresenter bioPresenter, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.ali.user.mobile.login.presenter.BaseLoginPresenter
    public String getLocalLoginType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c11b97ab", new Object[]{this}) : LoginType.LocalLoginType.BIO_LOGIN;
    }

    public static /* synthetic */ void access$000(BioPresenter bioPresenter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4383c151", new Object[]{bioPresenter});
        } else {
            bioPresenter.dismissLoading();
        }
    }

    public BioPresenter(BaseLoginView baseLoginView, LoginParam loginParam) {
        super(baseLoginView, loginParam);
        this.mViewer = baseLoginView;
        this.mLoginParam = loginParam;
    }

    public void buildLoginParam() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7124bf39", new Object[]{this});
        } else if (this.mLoginParam != null) {
        } else {
            this.mLoginParam = new LoginParam();
        }
    }

    @Override // com.ali.user.mobile.login.presenter.BaseLoginPresenter
    public void login() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99739770", new Object[]{this});
            return;
        }
        BaseLoginView baseLoginView = this.mViewer;
        if (baseLoginView == null || !baseLoginView.isActive()) {
            return;
        }
        LoginParam m102clone = this.mLoginParam.m102clone();
        LoginApi.fingerLogin(m102clone, buildTrackingModel(m102clone), this.mViewer, new LoginTasksCallback<LoginReturnData>() { // from class: com.ali.user.mobile.login.presenter.BioPresenter.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.ali.user.mobile.callback.LoginTasksCallback
            public void onSuccess(RpcResponse<LoginReturnData> rpcResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("2811f422", new Object[]{this, rpcResponse});
                } else {
                    BioPresenter.access$000(BioPresenter.this);
                }
            }

            @Override // com.ali.user.mobile.callback.LoginTasksCallback
            public void onFail(LoginException<LoginReturnData> loginException) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("77abaa65", new Object[]{this, loginException});
                } else if (BioPresenter.this.mViewer == null || !BioPresenter.this.mViewer.isActive()) {
                } else {
                    BioPresenter.access$000(BioPresenter.this);
                    if (loginException.getCode() == 700) {
                        BioPresenter bioPresenter = BioPresenter.this;
                        bioPresenter.onReceiveAlert(bioPresenter.mLoginParam, loginException.getOrinResponse());
                        return;
                    }
                    BioPresenter.this.mViewer.toast(loginException.getMsg(), 0);
                }
            }

            @Override // com.ali.user.mobile.callback.LoginTasksCallback
            public void onCancel() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("379d4540", new Object[]{this});
                } else {
                    BioPresenter.access$000(BioPresenter.this);
                }
            }
        });
    }

    @Override // com.ali.user.mobile.login.presenter.BaseLoginPresenter
    public void onReceiveAlert(LoginParam loginParam, RpcResponse<LoginReturnData> rpcResponse) {
        String str;
        String str2;
        String str3;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d3ecfd1", new Object[]{this, loginParam, rpcResponse});
        } else if (this.mViewer == null) {
        } else {
            String str4 = rpcResponse.message;
            if (rpcResponse == null || rpcResponse.returnValue == null || rpcResponse.returnValue.extMap == null) {
                str = "";
                z = false;
            } else {
                String str5 = rpcResponse.returnValue.extMap.get("dialogContent");
                str = rpcResponse.returnValue.extMap.get("dialogTitle");
                str4 = str5;
            }
            if (TextUtils.isEmpty(str4)) {
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
            baseLoginView.alert(str3, str2, baseLoginView.getBaseActivity().getResources().getString(R.string.aliuser_common_ok), new DialogInterface.OnClickListener() { // from class: com.ali.user.mobile.login.presenter.BioPresenter.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                    } else if (BioPresenter.this.mViewer == null || !BioPresenter.this.mViewer.isActive()) {
                    } else {
                        BioPresenter.this.mViewer.dismissAlertDialog();
                    }
                }
            }, null, null);
        }
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

    private TrackingModel buildTrackingModel(LoginParam loginParam) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TrackingModel) ipChange.ipc$dispatch("5a6bdd75", new Object[]{this, loginParam});
        }
        TrackingModel trackingModel = new TrackingModel();
        trackingModel.pageName = loginParam.utPageName;
        trackingModel.loginType = getLocalLoginType();
        trackingModel.traceId = ApiReferer.generateTraceId(trackingModel.loginType, trackingModel.pageName);
        return trackingModel;
    }
}
