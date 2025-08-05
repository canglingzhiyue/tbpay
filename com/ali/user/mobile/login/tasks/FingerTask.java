package com.ali.user.mobile.login.tasks;

import android.text.TextUtils;
import com.ali.user.mobile.app.constant.UTConstant;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.mobile.callback.CommonDataCallback;
import com.ali.user.mobile.callback.RpcRequestCallback;
import com.ali.user.mobile.data.LoginComponent;
import com.ali.user.mobile.log.ApiReferer;
import com.ali.user.mobile.log.UserTrackAdapter;
import com.ali.user.mobile.login.LoginDataRepository;
import com.ali.user.mobile.model.CommonCallback;
import com.ali.user.mobile.model.LoginBaseParam;
import com.ali.user.mobile.model.LoginType;
import com.ali.user.mobile.rpc.login.model.LoginReturnData;
import com.ali.user.mobile.security.SecurityGuardManagerWraper;
import com.ali.user.mobile.service.FingerprintService;
import com.ali.user.mobile.service.NavigatorService;
import com.ali.user.mobile.service.ServiceFactory;
import com.ali.user.mobile.utils.BackgroundExecutor;
import com.ali.user.mobile.utils.MainThreadExecutor;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Properties;
import tb.kge;

/* loaded from: classes2.dex */
public class FingerTask extends BaseLoginTask {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(778948317);
    }

    @Override // com.ali.user.mobile.login.tasks.BaseLoginTask
    public String getLocalLoginType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c11b97ab", new Object[]{this}) : LoginType.LocalLoginType.BIO_LOGIN;
    }

    @Override // com.ali.user.mobile.login.tasks.BaseLoginTask
    public void buildLoginParam(final CommonDataCallback commonDataCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f4e1e8c", new Object[]{this, commonDataCallback});
        } else if (commonDataCallback == null) {
        } else {
            BackgroundExecutor.execute(new Runnable() { // from class: com.ali.user.mobile.login.tasks.FingerTask.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (FingerTask.this.loginParam == null) {
                    } else {
                        final String str = FingerTask.this.trackingModel == null ? UTConstant.PageName.UT_PAGE_EXTEND : FingerTask.this.trackingModel.pageName;
                        if (FingerTask.this.loginParam.ext == null) {
                            FingerTask.this.loginParam.ext = new HashMap();
                        }
                        FingerTask.this.loginParam.ext.put("apiReferer", ApiReferer.getApiRefer());
                        FingerTask.this.matchHistoryAccount();
                        FingerTask.this.loginParam.site = DataProviderFactory.getDataProvider().getSite();
                        FingerTask.this.loginParam.nativeLoginType = FingerTask.this.getLoginType();
                        FingerTask.this.loginParam.sdkTraceId = FingerTask.this.trackingModel != null ? FingerTask.this.trackingModel.traceId : ApiReferer.generateTraceId(FingerTask.this.getLocalLoginType(), str);
                        FingerTask.this.loginParam.loginSourceType = FingerTask.this.getLocalLoginType();
                        FingerTask.this.loginParam.utPageName = str;
                        FingerTask.this.loginParam.nativeLoginType = FingerTask.this.getLoginType();
                        UserTrackAdapter.sendUT(str, UTConstant.CustomEvent.FINGER_TOKEN_COMMIT, "", FingerTask.this.getLocalLoginType(), LoginComponent.getProperties(FingerTask.this.loginParam));
                        if (TextUtils.isEmpty(SecurityGuardManagerWraper.getFingerValue(FingerTask.this.loginParam.biometricId))) {
                            FingerTask.this.fail(1601, "指纹登录失败，请换个方式登录", str, commonDataCallback);
                        } else if (ServiceFactory.getService(FingerprintService.class) != null) {
                            ((NavigatorService) ServiceFactory.getService(NavigatorService.class)).fingerLogin(DataProviderFactory.getApplicationContext(), new CommonCallback() { // from class: com.ali.user.mobile.login.tasks.FingerTask.1.1
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // com.ali.user.mobile.model.CommonCallback
                                public void onSuccess() {
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("d0e393ab", new Object[]{this});
                                        return;
                                    }
                                    String fingerValue = SecurityGuardManagerWraper.getFingerValue(FingerTask.this.loginParam.biometricId);
                                    if (TextUtils.isEmpty(fingerValue)) {
                                        FingerTask.this.fail(1601, "指纹登录失败，请换个方式登录", str, commonDataCallback);
                                        return;
                                    }
                                    FingerTask.this.loginParam.token = fingerValue;
                                    FingerTask.this.success(commonDataCallback);
                                    Properties properties = new Properties();
                                    properties.setProperty("monitor", "T");
                                    UserTrackAdapter.sendUT(FingerTask.this.loginParam.utPageName, UTConstant.CustomEvent.FINGER_TOKEN_SUCCESS, properties);
                                    UserTrackAdapter.sendUT(FingerTask.this.loginParam.utPageName, UTConstant.CustomEvent.UT_SINGLE_LOGIN_COMMIT, "", FingerTask.this.getLocalLoginType(), LoginComponent.getProperties(FingerTask.this.loginParam));
                                }

                                @Override // com.ali.user.mobile.model.CommonCallback
                                public void onFail(int i, String str2) {
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("efca37e9", new Object[]{this, new Integer(i), str2});
                                    } else {
                                        FingerTask.this.fail(i, str2, str, commonDataCallback);
                                    }
                                }
                            });
                        } else {
                            FingerTask.this.fail(1600, "缺少指纹SDK", str, commonDataCallback);
                        }
                    }
                }
            });
        }
    }

    public void success(final CommonDataCallback commonDataCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b149d2db", new Object[]{this, commonDataCallback});
        } else if (commonDataCallback == null) {
        } else {
            MainThreadExecutor.execute(new Runnable() { // from class: com.ali.user.mobile.login.tasks.FingerTask.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        commonDataCallback.onSuccess(null);
                    }
                }
            });
        }
    }

    public void fail(final int i, final String str, String str2, final CommonDataCallback commonDataCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("986855d3", new Object[]{this, new Integer(i), str, str2, commonDataCallback});
        } else if (commonDataCallback == null) {
        } else {
            Properties properties = new Properties();
            properties.setProperty("monitor", "T");
            String str3 = this.loginParam.utPageName;
            UserTrackAdapter.sendUT(str3, UTConstant.CustomEvent.FINGER_TOKEN_FAIL, i + "", properties);
            MainThreadExecutor.execute(new Runnable() { // from class: com.ali.user.mobile.login.tasks.FingerTask.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    CommonDataCallback commonDataCallback2 = commonDataCallback;
                    if (commonDataCallback2 == null) {
                        return;
                    }
                    commonDataCallback2.onFail(i, str);
                }
            });
        }
    }

    @Override // com.ali.user.mobile.login.tasks.BaseLoginTask
    public void invokeLoginRpc(LoginBaseParam loginBaseParam, RpcRequestCallback<LoginReturnData> rpcRequestCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75fb9247", new Object[]{this, loginBaseParam, rpcRequestCallback});
        } else {
            LoginDataRepository.getInstance().finger(loginBaseParam, rpcRequestCallback);
        }
    }

    @Override // com.ali.user.mobile.login.tasks.BaseLoginTask
    public String getLoginType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e149d18c", new Object[]{this}) : LoginType.ServerLoginType.BIOLOGIN.getType();
    }
}
