package com.taobao.login4android.biz.unifysso;

import com.ali.user.mobile.app.LoginContext;
import com.ali.user.mobile.app.constant.UTConstant;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.mobile.base.helper.BroadCastHelper;
import com.ali.user.mobile.base.helper.LoginDataHelper;
import com.ali.user.mobile.base.helper.LoginResultHelper;
import com.ali.user.mobile.callback.RpcRequestCallback;
import com.ali.user.mobile.data.LoginComponent;
import com.ali.user.mobile.log.UserTrackAdapter;
import com.ali.user.mobile.login.service.impl.UserLoginServiceImpl;
import com.ali.user.mobile.model.LoginParam;
import com.ali.user.mobile.model.LoginType;
import com.ali.user.mobile.rpc.RpcResponse;
import com.ali.user.mobile.rpc.login.model.LoginReturnData;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.constants.LoginConstants;
import com.taobao.login4android.constants.LoginStatus;
import com.taobao.login4android.log.LoginTLogAdapter;
import com.taobao.login4android.session.ISession;
import java.util.HashMap;
import java.util.Properties;
import tb.kge;

/* loaded from: classes7.dex */
public class UnifySsoLogin {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "Login.UnifySsoLogin";

    static {
        kge.a(2112177268);
    }

    public static /* synthetic */ void access$000(RpcResponse rpcResponse, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc767dbe", new Object[]{rpcResponse, new Boolean(z)});
        } else {
            onSuccess(rpcResponse, z);
        }
    }

    public static void tokenLogin(int i, String str, ISession iSession) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("925b2827", new Object[]{new Integer(i), str, iSession});
        } else {
            tokenLogin(i, str, false, iSession);
        }
    }

    public static void tokenLogin(int i, String str, final boolean z, ISession iSession) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0756bff", new Object[]{new Integer(i), str, new Boolean(z), iSession});
            return;
        }
        LoginParam loginParam = new LoginParam();
        loginParam.token = str;
        loginParam.site = i;
        if (LoginContext.sCurrentLoginParam != null) {
            UserTrackAdapter.sendUT(LoginContext.sCurrentLoginParam.utPageName, UTConstant.CustomEvent.UT_SINGLE_LOGIN_COMMIT, "", LoginContext.sCurrentLoginParam.loginSourceType, LoginComponent.getProperties(LoginContext.sCurrentLoginParam));
        }
        try {
            UserLoginServiceImpl.getInstance().unifySsoTokenLogin(loginParam, new RpcRequestCallback() { // from class: com.taobao.login4android.biz.unifysso.UnifySsoLogin.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.ali.user.mobile.callback.RpcRequestCallback
                public void onSuccess(RpcResponse rpcResponse) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("2811f422", new Object[]{this, rpcResponse});
                    } else {
                        UnifySsoLogin.access$000(rpcResponse, z);
                    }
                }

                @Override // com.ali.user.mobile.callback.RpcRequestCallback
                public void onError(RpcResponse rpcResponse) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("4b349f7d", new Object[]{this, rpcResponse});
                    } else {
                        onSuccess(rpcResponse);
                    }
                }
            });
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private static void onSuccess(RpcResponse<LoginReturnData> rpcResponse, boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da2d42f2", new Object[]{rpcResponse, new Boolean(z)});
            return;
        }
        if (rpcResponse != null) {
            try {
                if (rpcResponse.returnValue != null && rpcResponse.code == 3000) {
                    if (LoginContext.sCurrentLoginParam != null) {
                        UserTrackAdapter.sendUT(LoginContext.sCurrentLoginParam.utPageName, UTConstant.CustomEvent.UT_LOGIN_SUCCESS, "", LoginContext.sCurrentLoginParam.loginSourceType, LoginComponent.getProperties(LoginContext.sCurrentLoginParam));
                        UserTrackAdapter.sendUT(LoginContext.sCurrentLoginParam.utPageName, UTConstant.CustomEvent.UT_SINGLE_LOGIN_SUCCESS, "", LoginContext.sCurrentLoginParam.loginSourceType, LoginComponent.getProperties(LoginContext.sCurrentLoginParam));
                    }
                    HashMap hashMap = new HashMap();
                    hashMap.put(LoginConstants.LOGIN_TYPE, LoginType.ServerLoginType.UnifySsoLogin.getType());
                    LoginDataHelper.processLoginReturnData(true, rpcResponse.returnValue, hashMap);
                    return;
                }
            } catch (Throwable unused) {
                LoginStatus.resetLoginFlag();
                if (z) {
                    return;
                }
                BroadCastHelper.sendLoginFailBroadcast(714, "");
                return;
            }
        }
        if (rpcResponse != null && "H5".equals(rpcResponse.actionType) && rpcResponse.returnValue != null && rpcResponse.returnValue.token != null) {
            if (z) {
                LoginStatus.resetLoginFlag();
                return;
            }
            loginFailHit(rpcResponse);
            LoginResultHelper.gotoH5PlaceHolder(DataProviderFactory.getApplicationContext(), rpcResponse.returnValue, LoginContext.sCurrentLoginParam);
        } else if (z) {
            LoginStatus.resetLoginFlag();
        } else {
            if (LoginContext.sCurrentLoginParam != null) {
                loginFailHit(rpcResponse);
                String str2 = UTConstant.CustomEvent.UT_NETWORK_FAIL;
                if (rpcResponse != null) {
                    str2 = String.valueOf(rpcResponse.code);
                }
                UserTrackAdapter.sendUT(LoginContext.sCurrentLoginParam.utPageName, UTConstant.CustomEvent.UT_SINGLE_LOGIN_FAILURE, str2, LoginContext.sCurrentLoginParam.loginSourceType, LoginComponent.getProperties(LoginContext.sCurrentLoginParam));
            }
            StringBuilder sb = new StringBuilder();
            sb.append("unifySsoLoginFail : code!= 3000 && actionType!= h5");
            if (rpcResponse != null) {
                str = rpcResponse.code + "," + rpcResponse.message;
            } else {
                str = "";
            }
            sb.append(str);
            LoginTLogAdapter.e(TAG, sb.toString());
            LoginStatus.resetLoginFlag();
            BroadCastHelper.sendLoginFailBroadcast(714, "");
        }
    }

    private static void loginFailHit(RpcResponse<LoginReturnData> rpcResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca6cbe5a", new Object[]{rpcResponse});
        } else if (LoginContext.sCurrentLoginParam == null) {
        } else {
            Properties properties = new Properties();
            String valueOf = rpcResponse != null ? String.valueOf(rpcResponse.code) : UTConstant.CustomEvent.UT_NETWORK_FAIL;
            properties.setProperty(UTConstant.Args.UT_PROPERTY_SUCCESS, UTConstant.Args.UT_SUCCESS_F);
            properties.setProperty("sdkTraceId", LoginContext.sCurrentLoginParam.sdkTraceId + "");
            properties.setProperty("loginId", LoginContext.sCurrentLoginParam.loginId + "");
            properties.setProperty("site", LoginContext.sCurrentLoginParam.site + "");
            UserTrackAdapter.sendUT(LoginContext.sCurrentLoginParam.utPageName, UTConstant.CustomEvent.UT_LOGIN_FAIL, valueOf, LoginContext.sCurrentLoginParam.loginSourceType, properties);
        }
    }
}
