package com.ali.user.mobile.login.tasks;

import com.ali.user.mobile.app.constant.UTConstant;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.mobile.callback.CommonDataCallback;
import com.ali.user.mobile.callback.RpcRequestCallback;
import com.ali.user.mobile.log.ApiReferer;
import com.ali.user.mobile.log.UserTrackAdapter;
import com.ali.user.mobile.login.LoginDataRepository;
import com.ali.user.mobile.model.LoginBaseParam;
import com.ali.user.mobile.model.LoginType;
import com.ali.user.mobile.rpc.RpcResponse;
import com.ali.user.mobile.rpc.login.model.LoginReturnData;
import com.ali.user.mobile.utils.BackgroundExecutor;
import com.ali.user.mobile.utils.MainThreadExecutor;
import com.ali.user.mobile.utils.NetworkUtil;
import com.alibaba.fastjson.JSON;
import com.alibaba.security.realidentity.ui.webview.jsbridge.BaseJsExecutor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.log.LoginTLogAdapter;
import com.taobao.vessel.utils.c;
import java.util.HashMap;
import java.util.Properties;
import tb.kge;

/* loaded from: classes2.dex */
public class OverseaSimLoginTask extends BaseLoginTask {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "OverseaSimLogin";
    private String mSessionPayload;

    static {
        kge.a(362471075);
    }

    @Override // com.ali.user.mobile.login.tasks.BaseLoginTask
    public String getLocalLoginType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c11b97ab", new Object[]{this}) : LoginType.LocalLoginType.OVERSEA_SIM_LOGIN;
    }

    public static /* synthetic */ String access$002(OverseaSimLoginTask overseaSimLoginTask, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("23302711", new Object[]{overseaSimLoginTask, str});
        }
        overseaSimLoginTask.mSessionPayload = str;
        return str;
    }

    @Override // com.ali.user.mobile.login.tasks.BaseLoginTask
    public void buildLoginParam(final CommonDataCallback commonDataCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f4e1e8c", new Object[]{this, commonDataCallback});
        } else {
            BackgroundExecutor.execute(new Runnable() { // from class: com.ali.user.mobile.login.tasks.OverseaSimLoginTask.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    OverseaSimLoginTask.this.matchHistoryAccount();
                    if (OverseaSimLoginTask.this.loginParam == null) {
                        OverseaSimLoginTask.this.loginParam = new LoginBaseParam();
                        OverseaSimLoginTask.this.loginParam.site = DataProviderFactory.getDataProvider().getSite();
                    }
                    String str = OverseaSimLoginTask.this.trackingModel == null ? UTConstant.PageName.UT_PAGE_EXTEND : OverseaSimLoginTask.this.trackingModel.pageName;
                    OverseaSimLoginTask.this.loginParam.nativeLoginType = OverseaSimLoginTask.this.getLoginType();
                    OverseaSimLoginTask.this.loginParam.site = DataProviderFactory.getDataProvider().getSite();
                    if (OverseaSimLoginTask.this.loginParam.ext == null) {
                        OverseaSimLoginTask.this.loginParam.ext = new HashMap();
                    }
                    OverseaSimLoginTask.this.loginParam.ext.put("apiReferer", ApiReferer.generateApiReferer());
                    OverseaSimLoginTask.this.matchHistoryAccount();
                    OverseaSimLoginTask.this.loginParam.sdkTraceId = OverseaSimLoginTask.this.trackingModel != null ? OverseaSimLoginTask.this.trackingModel.traceId : ApiReferer.generateTraceId(LoginType.LocalLoginType.SMS_LOGIN, str);
                    OverseaSimLoginTask.this.loginParam.loginSourceType = LoginType.LocalLoginType.SMS_LOGIN;
                    OverseaSimLoginTask.this.loginParam.utPageName = str;
                    MainThreadExecutor.execute(new Runnable() { // from class: com.ali.user.mobile.login.tasks.OverseaSimLoginTask.1.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                OverseaSimLoginTask.this.getOverseaSimVerifyUrl(commonDataCallback);
                            }
                        }
                    });
                }
            });
        }
    }

    public void getOverseaSimVerifyUrl(final CommonDataCallback commonDataCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ef786fa", new Object[]{this, commonDataCallback});
            return;
        }
        LoginTLogAdapter.e(TAG, "OverseaSimLogin getOverseaSimVerifyUrl");
        boolean isWifiConnected = NetworkUtil.isWifiConnected(DataProviderFactory.getApplicationContext());
        if (isWifiConnected && commonDataCallback != null) {
            LoginTLogAdapter.e(TAG, "wifiConnected:" + isWifiConnected);
            commonDataCallback.onFail(-1, "wifiConnected return false");
            return;
        }
        LoginDataRepository.getInstance().getOverseaSimVerifyUrl(this.loginParam, new RpcRequestCallback() { // from class: com.ali.user.mobile.login.tasks.OverseaSimLoginTask.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.ali.user.mobile.callback.RpcRequestCallback
            public void onSuccess(RpcResponse rpcResponse) {
                String str;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("2811f422", new Object[]{this, rpcResponse});
                    return;
                }
                LoginReturnData loginReturnData = (LoginReturnData) rpcResponse.returnValue;
                if (loginReturnData == null) {
                    CommonDataCallback commonDataCallback2 = commonDataCallback;
                    if (commonDataCallback2 == null) {
                        return;
                    }
                    commonDataCallback2.onFail(-1, c.LOAD_DATA_NULL);
                    return;
                }
                LoginTLogAdapter.e(OverseaSimLoginTask.TAG, "OverseaSimLogin getOverseaSimVerifyUrl success");
                String str2 = null;
                if (loginReturnData.extMap != null) {
                    str2 = loginReturnData.extMap.get("verifyUrl");
                    str = loginReturnData.extMap.get(BaseJsExecutor.NAME_VERIFY_TOKEN);
                } else {
                    str = null;
                }
                OverseaSimLoginTask.this.loginParam.token = str;
                final long currentTimeMillis = System.currentTimeMillis();
                LoginTLogAdapter.e(OverseaSimLoginTask.TAG, "OverseaSimLogin requestBy4G request start:" + currentTimeMillis);
                UserTrackAdapter.sendUT(OverseaSimLoginTask.this.loginParam.utPageName, UTConstant.CustomEvent.UT_OVERSEA_LOGIN_REQUESTBY4G_START);
                NetworkUtil.requestBy4G(DataProviderFactory.getApplicationContext(), str2, new NetworkUtil.IRequestBy4GCallback() { // from class: com.ali.user.mobile.login.tasks.OverseaSimLoginTask.2.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.ali.user.mobile.utils.NetworkUtil.IRequestBy4GCallback
                    public void success(String str3) {
                        IpChange ipChange3 = $ipChange;
                        if (ipChange3 instanceof IpChange) {
                            ipChange3.ipc$dispatch("6b54654", new Object[]{this, str3});
                            return;
                        }
                        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                        LoginTLogAdapter.e(OverseaSimLoginTask.TAG, "OverseaSimLogin requestBy4G request success cost:" + currentTimeMillis2);
                        Properties properties = new Properties();
                        properties.put("duration", Long.valueOf(currentTimeMillis2));
                        UserTrackAdapter.sendUT(OverseaSimLoginTask.this.loginParam.utPageName, UTConstant.CustomEvent.UT_OVERSEA_LOGIN_REQUESTBY4G_SUCCESS, properties);
                        OverseaSimLoginTask.access$002(OverseaSimLoginTask.this, JSON.parseObject(str3).getString("session_payload"));
                        if (commonDataCallback == null) {
                            return;
                        }
                        commonDataCallback.onSuccess(null);
                    }

                    @Override // com.ali.user.mobile.utils.NetworkUtil.IRequestBy4GCallback
                    public void fail(String str3) {
                        IpChange ipChange3 = $ipChange;
                        if (ipChange3 instanceof IpChange) {
                            ipChange3.ipc$dispatch("534fc72f", new Object[]{this, str3});
                            return;
                        }
                        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                        LoginTLogAdapter.e(OverseaSimLoginTask.TAG, "OverseaSimLogin requestBy4G request fail cost:" + currentTimeMillis2 + " errorMsg:" + str3);
                        Properties properties = new Properties();
                        properties.put("duration", Long.valueOf(currentTimeMillis2));
                        UserTrackAdapter.sendUT(OverseaSimLoginTask.this.loginParam.utPageName, UTConstant.CustomEvent.UT_OVERSEA_LOGIN_REQUESTBY4G_FAIL, properties);
                        if (commonDataCallback == null) {
                            return;
                        }
                        commonDataCallback.onFail(-1, "get session_payload fail");
                    }
                });
            }

            @Override // com.ali.user.mobile.callback.RpcRequestCallback
            public void onError(RpcResponse rpcResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4b349f7d", new Object[]{this, rpcResponse});
                    return;
                }
                LoginTLogAdapter.e(OverseaSimLoginTask.TAG, "OverseaSimLogin getOverseaSimVerifyUrl fail");
                CommonDataCallback commonDataCallback2 = commonDataCallback;
                if (commonDataCallback2 == null) {
                    return;
                }
                commonDataCallback2.onFail(-1, "get verifyUrl fail");
            }
        });
    }

    @Override // com.ali.user.mobile.login.tasks.BaseLoginTask
    public void invokeLoginRpc(LoginBaseParam loginBaseParam, RpcRequestCallback<LoginReturnData> rpcRequestCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75fb9247", new Object[]{this, loginBaseParam, rpcRequestCallback});
            return;
        }
        UserTrackAdapter.sendUT(loginBaseParam.utPageName, UTConstant.CustomEvent.UT_SINGLE_LOGIN_COMMIT, "", getLocalLoginType(), null);
        LoginDataRepository.getInstance().overseaSimLogin(loginBaseParam, loginBaseParam.token, this.mSessionPayload, rpcRequestCallback);
    }

    @Override // com.ali.user.mobile.login.tasks.BaseLoginTask
    public String getLoginType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e149d18c", new Object[]{this}) : LoginType.ServerLoginType.OverseaSimLogin.getType();
    }
}
