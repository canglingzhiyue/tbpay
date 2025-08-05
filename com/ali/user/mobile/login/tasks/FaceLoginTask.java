package com.ali.user.mobile.login.tasks;

import com.ali.user.mobile.app.constant.UTConstant;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.mobile.callback.CommonDataCallback;
import com.ali.user.mobile.callback.RpcRequestCallback;
import com.ali.user.mobile.data.LoginComponent;
import com.ali.user.mobile.log.ApiReferer;
import com.ali.user.mobile.log.UserTrackAdapter;
import com.ali.user.mobile.login.LoginDataRepository;
import com.ali.user.mobile.login.model.GetVerifyTokenResponseData;
import com.ali.user.mobile.login.model.GetVerifyTokenResult;
import com.ali.user.mobile.login.service.impl.UserLoginServiceImpl;
import com.ali.user.mobile.model.FaceVerifyCallback;
import com.ali.user.mobile.model.LoginBaseParam;
import com.ali.user.mobile.model.LoginType;
import com.ali.user.mobile.model.TokenType;
import com.ali.user.mobile.rpc.RpcResponse;
import com.ali.user.mobile.rpc.login.model.LoginReturnData;
import com.ali.user.mobile.service.FaceService;
import com.ali.user.mobile.service.ServiceFactory;
import com.ali.user.mobile.utils.BackgroundExecutor;
import com.ali.user.mobile.utils.MainThreadExecutor;
import com.ali.user.mobile.utils.ResourceUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Properties;
import tb.kge;

/* loaded from: classes2.dex */
public class FaceLoginTask extends BaseLoginTask {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1197241854);
    }

    public static /* synthetic */ Object ipc$super(FaceLoginTask faceLoginTask, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.ali.user.mobile.login.tasks.BaseLoginTask
    public String getLocalLoginType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c11b97ab", new Object[]{this}) : LoginType.LocalLoginType.SCAN_FACE_LOGIN;
    }

    public static /* synthetic */ void access$000(FaceLoginTask faceLoginTask, CommonDataCallback commonDataCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a80b373d", new Object[]{faceLoginTask, commonDataCallback});
        } else {
            faceLoginTask.fetchScanToken(commonDataCallback);
        }
    }

    public static /* synthetic */ void access$100(FaceLoginTask faceLoginTask, LoginBaseParam loginBaseParam, RpcResponse rpcResponse, CommonDataCallback commonDataCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("674a046d", new Object[]{faceLoginTask, loginBaseParam, rpcResponse, commonDataCallback});
        } else {
            faceLoginTask.onFaceLoginError(loginBaseParam, rpcResponse, commonDataCallback);
        }
    }

    @Override // com.ali.user.mobile.login.tasks.BaseLoginTask
    public void buildLoginParam(final CommonDataCallback commonDataCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f4e1e8c", new Object[]{this, commonDataCallback});
        } else {
            BackgroundExecutor.execute(new Runnable() { // from class: com.ali.user.mobile.login.tasks.FaceLoginTask.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    FaceLoginTask.this.matchHistoryAccount();
                    MainThreadExecutor.execute(new Runnable() { // from class: com.ali.user.mobile.login.tasks.FaceLoginTask.1.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                FaceLoginTask.access$000(FaceLoginTask.this, commonDataCallback);
                            }
                        }
                    });
                }
            });
        }
    }

    private void fetchScanToken(final CommonDataCallback commonDataCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f60ac5c", new Object[]{this, commonDataCallback});
            return;
        }
        showLoading();
        if (this.loginParam == null) {
            this.loginParam = new LoginBaseParam();
            this.loginParam.site = DataProviderFactory.getDataProvider().getSite();
        }
        Properties properties = new Properties();
        properties.setProperty("monitor", "T");
        properties.setProperty("sdkTraceId", this.loginParam.sdkTraceId + "");
        UserTrackAdapter.sendUT(this.loginParam.utPageName, UTConstant.CustomEvent.UT_GET_FACELOGIN_TOKEN_COMMIT, properties);
        UserLoginServiceImpl.getInstance().getScanToken(this.loginParam, new RpcRequestCallback<GetVerifyTokenResult>() { // from class: com.ali.user.mobile.login.tasks.FaceLoginTask.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.ali.user.mobile.callback.RpcRequestCallback
            public void onSuccess(RpcResponse<GetVerifyTokenResult> rpcResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("2811f422", new Object[]{this, rpcResponse});
                    return;
                }
                FaceLoginTask.this.dismissLoading();
                GetVerifyTokenResponseData getVerifyTokenResponseData = (GetVerifyTokenResponseData) rpcResponse;
                if (getVerifyTokenResponseData != null && getVerifyTokenResponseData.returnValue != 0 && ((GetVerifyTokenResult) getVerifyTokenResponseData.returnValue).extMap != null) {
                    Properties properties2 = new Properties();
                    properties2.setProperty("monitor", "T");
                    properties2.setProperty("sdkTraceId", FaceLoginTask.this.loginParam.sdkTraceId + "");
                    UserTrackAdapter.sendUT(FaceLoginTask.this.loginParam.utPageName, UTConstant.CustomEvent.UT_GET_FACELOGIN_TOKEN_SUCCESS, properties2);
                    String str = ((GetVerifyTokenResult) getVerifyTokenResponseData.returnValue).extMap.get("scanFaceLoginRPToken");
                    final String str2 = ((GetVerifyTokenResult) getVerifyTokenResponseData.returnValue).token;
                    final String str3 = ((GetVerifyTokenResult) getVerifyTokenResponseData.returnValue).scene;
                    if (ServiceFactory.getService(FaceService.class) == null) {
                        return;
                    }
                    Properties properties3 = new Properties();
                    properties3.setProperty("monitor", "T");
                    UserTrackAdapter.sendUT(FaceLoginTask.this.loginParam.utPageName, UTConstant.CustomEvent.UT_FACE_SDK_COMMIT, properties3);
                    ((FaceService) ServiceFactory.getService(FaceService.class)).nativeLogin(str, new FaceVerifyCallback() { // from class: com.ali.user.mobile.login.tasks.FaceLoginTask.2.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.ali.user.mobile.model.CommonCallback
                        public void onSuccess() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("d0e393ab", new Object[]{this});
                                return;
                            }
                            Properties properties4 = new Properties();
                            properties4.setProperty("monitor", "T");
                            UserTrackAdapter.sendUT(FaceLoginTask.this.loginParam.utPageName, UTConstant.CustomEvent.UT_FACE_SDK_SUCCESS, properties4);
                            UserTrackAdapter.sendUT(FaceLoginTask.this.loginParam.utPageName, UTConstant.CustomEvent.UT_SINGLE_LOGIN_COMMIT, "", FaceLoginTask.this.getLocalLoginType(), LoginComponent.getProperties(FaceLoginTask.this.loginParam));
                            FaceLoginTask.this.buildTokenParam(FaceLoginTask.this.loginParam, str2, TokenType.FACE_LOGIN, str3);
                            if (commonDataCallback == null) {
                                return;
                            }
                            commonDataCallback.onSuccess(null);
                        }

                        @Override // com.ali.user.mobile.model.CommonCallback
                        public void onFail(int i, String str4) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("efca37e9", new Object[]{this, new Integer(i), str4});
                                return;
                            }
                            Properties properties4 = new Properties();
                            properties4.setProperty("monitor", "T");
                            String str5 = FaceLoginTask.this.loginParam.utPageName;
                            UserTrackAdapter.sendUT(str5, UTConstant.CustomEvent.UT_FACE_SDK_FAIL, i + "", properties4);
                            if (commonDataCallback == null) {
                                return;
                            }
                            if (i == 3) {
                                commonDataCallback.onFail(3008, str4);
                            } else {
                                commonDataCallback.onFail(3009, ResourceUtil.getStringById("aliuser_scan_login_fail"));
                            }
                        }
                    });
                    return;
                }
                FaceLoginTask faceLoginTask = FaceLoginTask.this;
                FaceLoginTask.access$100(faceLoginTask, faceLoginTask.loginParam, rpcResponse, commonDataCallback);
            }

            @Override // com.ali.user.mobile.callback.RpcRequestCallback
            public void onError(RpcResponse<GetVerifyTokenResult> rpcResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4b349f7d", new Object[]{this, rpcResponse});
                    return;
                }
                FaceLoginTask faceLoginTask = FaceLoginTask.this;
                FaceLoginTask.access$100(faceLoginTask, faceLoginTask.loginParam, rpcResponse, commonDataCallback);
            }
        });
    }

    private void onFaceLoginError(LoginBaseParam loginBaseParam, RpcResponse<GetVerifyTokenResult> rpcResponse, CommonDataCallback commonDataCallback) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6fc488", new Object[]{this, loginBaseParam, rpcResponse, commonDataCallback});
            return;
        }
        Properties properties = new Properties();
        properties.setProperty("monitor", "T");
        StringBuilder sb = new StringBuilder();
        sb.append(loginBaseParam.sdkTraceId);
        String str2 = "";
        sb.append(str2);
        properties.setProperty("sdkTraceId", sb.toString());
        String str3 = loginBaseParam.utPageName;
        if (rpcResponse == null) {
            str = "-1";
        } else {
            str = rpcResponse.code + str2;
        }
        UserTrackAdapter.sendUT(str3, UTConstant.CustomEvent.UT_GET_FACELOGIN_TOKEN_FAIL, str, "preScanFaceLogin", properties);
        dismissLoading();
        if (commonDataCallback == null) {
            return;
        }
        int i = rpcResponse == null ? -1 : rpcResponse.code;
        if (rpcResponse != null) {
            str2 = rpcResponse.message;
        }
        commonDataCallback.onFail(i, str2);
    }

    public void buildTokenParam(LoginBaseParam loginBaseParam, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b14ad095", new Object[]{this, loginBaseParam, str, str2, str3});
            return;
        }
        if (this.loginParam == null) {
            this.loginParam = new LoginBaseParam();
        }
        this.loginParam.site = DataProviderFactory.getDataProvider().getSite();
        this.loginParam.token = str;
        this.loginParam.tokenType = str2;
        this.loginParam.scene = str3;
        if (this.loginParam.ext == null) {
            this.loginParam.ext = new HashMap();
        }
        this.loginParam.nativeLoginType = getLoginType();
        this.loginParam.ext.put("apiReferer", ApiReferer.generateApiReferer());
        if (loginBaseParam == null) {
            return;
        }
        this.loginParam.sdkTraceId = loginBaseParam.sdkTraceId;
        this.loginParam.utPageName = loginBaseParam.utPageName;
        this.loginParam.loginSourceType = loginBaseParam.loginSourceType;
    }

    @Override // com.ali.user.mobile.login.tasks.BaseLoginTask
    public void invokeLoginRpc(LoginBaseParam loginBaseParam, RpcRequestCallback<LoginReturnData> rpcRequestCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75fb9247", new Object[]{this, loginBaseParam, rpcRequestCallback});
        } else {
            LoginDataRepository.getInstance().loginByToken(loginBaseParam, rpcRequestCallback);
        }
    }

    @Override // com.ali.user.mobile.login.tasks.BaseLoginTask
    public String getLoginType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e149d18c", new Object[]{this}) : LoginType.ServerLoginType.FaceLogin.getType();
    }
}
