package com.ali.user.mobile.login.tasks;

import com.ali.user.mobile.app.constant.UTConstant;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.mobile.callback.CommonDataCallback;
import com.ali.user.mobile.callback.LoginTasksCallback;
import com.ali.user.mobile.callback.RpcRequestCallback;
import com.ali.user.mobile.data.LoginComponent;
import com.ali.user.mobile.exception.ErrorCode;
import com.ali.user.mobile.exception.LoginException;
import com.ali.user.mobile.log.ApiReferer;
import com.ali.user.mobile.log.UserTrackAdapter;
import com.ali.user.mobile.login.LoginDataRepository;
import com.ali.user.mobile.model.LoginBaseParam;
import com.ali.user.mobile.model.LoginType;
import com.ali.user.mobile.model.NumAuthTokenCallback;
import com.ali.user.mobile.model.TokenType;
import com.ali.user.mobile.rpc.RpcResponse;
import com.ali.user.mobile.rpc.login.model.LoginReturnData;
import com.ali.user.mobile.service.NumberAuthService;
import com.ali.user.mobile.service.ServiceFactory;
import com.ali.user.mobile.utils.BackgroundExecutor;
import com.ali.user.mobile.utils.MainThreadExecutor;
import com.ali.user.mobile.utils.ResourceUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Properties;
import tb.kge;

/* loaded from: classes2.dex */
public class SimLoginTask extends BaseLoginTask {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(69191686);
    }

    @Override // com.ali.user.mobile.login.tasks.BaseLoginTask
    public String getLocalLoginType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c11b97ab", new Object[]{this}) : LoginType.LocalLoginType.SIM_LOGIN;
    }

    @Override // com.ali.user.mobile.login.tasks.BaseLoginTask
    public void buildLoginParam(final CommonDataCallback commonDataCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f4e1e8c", new Object[]{this, commonDataCallback});
        } else {
            BackgroundExecutor.execute(new Runnable() { // from class: com.ali.user.mobile.login.tasks.SimLoginTask.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    SimLoginTask.this.matchHistoryAccount();
                    MainThreadExecutor.execute(new Runnable() { // from class: com.ali.user.mobile.login.tasks.SimLoginTask.1.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                SimLoginTask.this.fetchSimLoginToken(commonDataCallback);
                            }
                        }
                    });
                }
            });
        }
    }

    public void fetchSimLoginToken(final CommonDataCallback commonDataCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("909fd571", new Object[]{this, commonDataCallback});
            return;
        }
        if (this.loginParam == null) {
            this.loginParam = new LoginBaseParam();
            this.loginParam.site = DataProviderFactory.getDataProvider().getSite();
        }
        final String str = this.trackingModel == null ? UTConstant.PageName.UT_PAGE_EXTEND : this.trackingModel.pageName;
        this.loginParam.sdkTraceId = this.trackingModel != null ? this.trackingModel.traceId : ApiReferer.generateTraceId(getLocalLoginType(), str);
        this.loginParam.loginSourceType = getLocalLoginType();
        this.loginParam.utPageName = str;
        this.loginParam.nativeLoginType = getLoginType();
        HashMap hashMap = new HashMap();
        hashMap.put("sdkTraceId", this.loginParam.sdkTraceId + "");
        UserTrackAdapter.control(str, UTConstant.CustomEvent.UT_LOGIN_ACTION, "", getLocalLoginType(), hashMap);
        if (ServiceFactory.getService(NumberAuthService.class) == null) {
            return;
        }
        showLoading();
        final Properties properties = new Properties();
        properties.setProperty("monitor", "T");
        UserTrackAdapter.sendUT(str, "get_onekey_login_token_commit", "", getLocalLoginType(), properties);
        ((NumberAuthService) ServiceFactory.getService(NumberAuthService.class)).getLoginToken("openLoginView", new NumAuthTokenCallback() { // from class: com.ali.user.mobile.login.tasks.SimLoginTask.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.ali.user.mobile.model.NumAuthTokenCallback
            public void onGetAuthTokenSuccess(String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("20cbbe7a", new Object[]{this, str2});
                    return;
                }
                UserTrackAdapter.sendUT(str, "get_login_token_success");
                UserTrackAdapter.sendUT(str, "get_onekey_login_token_success", "", SimLoginTask.this.getLocalLoginType(), properties);
                UserTrackAdapter.sendUT(str, UTConstant.CustomEvent.UT_SINGLE_LOGIN_COMMIT, "", SimLoginTask.this.getLocalLoginType(), LoginComponent.getProperties(SimLoginTask.this.loginParam));
                SimLoginTask simLoginTask = SimLoginTask.this;
                simLoginTask.buildTokenParam(simLoginTask.loginParam, str2, TokenType.NUMBER, "");
                CommonDataCallback commonDataCallback2 = commonDataCallback;
                if (commonDataCallback2 == null) {
                    return;
                }
                commonDataCallback2.onSuccess(null);
            }

            @Override // com.ali.user.mobile.model.NumAuthTokenCallback
            public void onGetAuthTokenFail(int i, String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("27f95aee", new Object[]{this, new Integer(i), str2});
                    return;
                }
                SimLoginTask.this.dismissLoading();
                Properties properties2 = new Properties();
                properties2.setProperty("code", i + "");
                properties2.setProperty("cause", str2 + "");
                UserTrackAdapter.sendUT(str, "get_login_token_fail", properties2);
                String str3 = str;
                UserTrackAdapter.sendUT(str3, "get_onekey_login_token_failure", i + "", SimLoginTask.this.getLocalLoginType(), properties);
                CommonDataCallback commonDataCallback2 = commonDataCallback;
                if (commonDataCallback2 == null) {
                    return;
                }
                commonDataCallback2.onFail(3010, str2);
            }
        });
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
            LoginDataRepository.getInstance().simLogin(loginBaseParam, rpcRequestCallback);
        }
    }

    @Override // com.ali.user.mobile.login.tasks.BaseLoginTask
    public String getLoginType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e149d18c", new Object[]{this}) : LoginType.ServerLoginType.SimLogin.getType();
    }

    @Override // com.ali.user.mobile.login.tasks.BaseLoginTask
    public void onReceiverOtherError(RpcResponse<LoginReturnData> rpcResponse, LoginTasksCallback<LoginReturnData> loginTasksCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8574615", new Object[]{this, rpcResponse, loginTasksCallback});
        } else if (loginTasksCallback == null) {
        } else {
            if (rpcResponse != null && rpcResponse.code == 14076) {
                loginTasksCallback.onFail(new LoginException<>(ErrorCode.SIM_LOGIN_14076_FAIL, rpcResponse.message, rpcResponse));
            } else {
                loginTasksCallback.onFail(new LoginException<>(rpcResponse == null ? 1100 : rpcResponse.code, rpcResponse == null ? ResourceUtil.getNetworkError() : rpcResponse.message, rpcResponse));
            }
        }
    }
}
