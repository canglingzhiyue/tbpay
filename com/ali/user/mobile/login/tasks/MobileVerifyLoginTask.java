package com.ali.user.mobile.login.tasks;

import com.ali.user.mobile.app.constant.UTConstant;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.mobile.callback.CommonDataCallback;
import com.ali.user.mobile.callback.RpcRequestCallback;
import com.ali.user.mobile.data.LoginComponent;
import com.ali.user.mobile.exception.ErrorCode;
import com.ali.user.mobile.log.ApiReferer;
import com.ali.user.mobile.log.UserTrackAdapter;
import com.ali.user.mobile.login.LoginDataRepository;
import com.ali.user.mobile.model.LoginBaseParam;
import com.ali.user.mobile.model.LoginType;
import com.ali.user.mobile.model.NumAuthTokenCallback;
import com.ali.user.mobile.model.TokenType;
import com.ali.user.mobile.rpc.login.model.LoginReturnData;
import com.ali.user.mobile.service.NumberAuthService;
import com.ali.user.mobile.service.ServiceFactory;
import com.ali.user.mobile.utils.BackgroundExecutor;
import com.ali.user.mobile.utils.MainThreadExecutor;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Properties;
import tb.kge;

/* loaded from: classes2.dex */
public class MobileVerifyLoginTask extends BaseLoginTask {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1772870300);
    }

    @Override // com.ali.user.mobile.login.tasks.BaseLoginTask
    public String getLocalLoginType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c11b97ab", new Object[]{this}) : LoginType.LocalLoginType.MOBILE_VERIFY_LOGIN;
    }

    @Override // com.ali.user.mobile.login.tasks.BaseLoginTask
    public void buildLoginParam(final CommonDataCallback commonDataCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f4e1e8c", new Object[]{this, commonDataCallback});
        } else {
            BackgroundExecutor.execute(new Runnable() { // from class: com.ali.user.mobile.login.tasks.MobileVerifyLoginTask.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    MobileVerifyLoginTask.this.matchHistoryAccount();
                    MainThreadExecutor.execute(new Runnable() { // from class: com.ali.user.mobile.login.tasks.MobileVerifyLoginTask.1.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                MobileVerifyLoginTask.this.fetchVerificationToken(commonDataCallback);
                            }
                        }
                    });
                }
            });
        }
    }

    public void fetchVerificationToken(final CommonDataCallback commonDataCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e93a607a", new Object[]{this, commonDataCallback});
            return;
        }
        final String str = this.trackingModel == null ? UTConstant.PageName.UT_PAGE_EXTEND : this.trackingModel.pageName;
        if (this.loginParam == null) {
            this.loginParam = new LoginBaseParam();
            this.loginParam.site = DataProviderFactory.getDataProvider().getSite();
        }
        this.loginParam.sdkTraceId = this.trackingModel != null ? this.trackingModel.traceId : ApiReferer.generateTraceId(getLocalLoginType(), str);
        this.loginParam.loginSourceType = getLocalLoginType();
        this.loginParam.utPageName = str;
        this.loginParam.nativeLoginType = getLoginType();
        HashMap hashMap = new HashMap();
        hashMap.put("sdkTraceId", this.loginParam.sdkTraceId + "");
        UserTrackAdapter.control(str, UTConstant.CustomEvent.UT_LOGIN_ACTION, "", getLocalLoginType(), hashMap);
        if (ServiceFactory.getService(NumberAuthService.class) == null) {
            if (commonDataCallback == null) {
                return;
            }
            commonDataCallback.onFail(ErrorCode.MOBILE_VERIFY_LOGIN_GET_TOKEN_FAIL, "");
            return;
        }
        showLoading();
        Properties properties = new Properties();
        properties.setProperty("monitor", "T");
        UserTrackAdapter.sendUT(str, "sim_access_code_commit", "", getLocalLoginType(), properties);
        ((NumberAuthService) ServiceFactory.getService(NumberAuthService.class)).getToken(new NumAuthTokenCallback() { // from class: com.ali.user.mobile.login.tasks.MobileVerifyLoginTask.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.ali.user.mobile.model.NumAuthTokenCallback
            public void onGetAuthTokenSuccess(String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("20cbbe7a", new Object[]{this, str2});
                    return;
                }
                MobileVerifyLoginTask.this.dismissLoading();
                Properties properties2 = new Properties();
                properties2.setProperty("monitor", "T");
                UserTrackAdapter.sendUT(str, "sim_access_code_success", "", MobileVerifyLoginTask.this.getLocalLoginType(), properties2);
                UserTrackAdapter.sendUT(str, UTConstant.CustomEvent.UT_SINGLE_LOGIN_COMMIT, "", MobileVerifyLoginTask.this.getLocalLoginType(), LoginComponent.getProperties(MobileVerifyLoginTask.this.loginParam));
                MobileVerifyLoginTask.this.loginParam.token = str2;
                MobileVerifyLoginTask.this.loginParam.tokenType = TokenType.NUMBER;
                CommonDataCallback commonDataCallback2 = commonDataCallback;
                if (commonDataCallback2 == null) {
                    return;
                }
                commonDataCallback2.onSuccess(null);
            }

            @Override // com.ali.user.mobile.model.NumAuthTokenCallback
            public void onGetAuthTokenFail(int i, final String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("27f95aee", new Object[]{this, new Integer(i), str2});
                    return;
                }
                MobileVerifyLoginTask.this.dismissLoading();
                Properties properties2 = new Properties();
                properties2.setProperty("monitor", "T");
                String str3 = str;
                UserTrackAdapter.sendUT(str3, "sim_access_code_failure", i + "", MobileVerifyLoginTask.this.getLocalLoginType(), properties2);
                MainThreadExecutor.execute(new Runnable() { // from class: com.ali.user.mobile.login.tasks.MobileVerifyLoginTask.2.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange3 = $ipChange;
                        if (ipChange3 instanceof IpChange) {
                            ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                        } else if (commonDataCallback == null) {
                        } else {
                            commonDataCallback.onFail(ErrorCode.MOBILE_VERIFY_LOGIN_GET_TOKEN_FAIL, str2);
                        }
                    }
                });
            }
        });
    }

    @Override // com.ali.user.mobile.login.tasks.BaseLoginTask
    public void invokeLoginRpc(LoginBaseParam loginBaseParam, RpcRequestCallback<LoginReturnData> rpcRequestCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75fb9247", new Object[]{this, loginBaseParam, rpcRequestCallback});
        } else {
            LoginDataRepository.getInstance().simLoginWithUserInput(loginBaseParam, rpcRequestCallback);
        }
    }

    @Override // com.ali.user.mobile.login.tasks.BaseLoginTask
    public String getLoginType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e149d18c", new Object[]{this}) : LoginType.ServerLoginType.MobileVerifyLogin.getType();
    }
}
