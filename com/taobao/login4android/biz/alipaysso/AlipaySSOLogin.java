package com.taobao.login4android.biz.alipaysso;

import com.ali.user.mobile.app.constant.UTConstant;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.mobile.base.helper.BroadCastHelper;
import com.ali.user.mobile.base.helper.LoginDataHelper;
import com.ali.user.mobile.base.helper.LoginResultHelper;
import com.ali.user.mobile.callback.DataCallback;
import com.ali.user.mobile.common.api.LoginApprearanceExtensions;
import com.ali.user.mobile.data.LoginComponent;
import com.ali.user.mobile.log.UserTrackAdapter;
import com.ali.user.mobile.login.service.impl.UserLoginServiceImpl;
import com.ali.user.mobile.model.LoginParam;
import com.ali.user.mobile.model.LoginType;
import com.ali.user.mobile.model.TokenType;
import com.ali.user.mobile.rpc.ApiConstants;
import com.ali.user.mobile.rpc.RpcResponse;
import com.ali.user.mobile.rpc.login.model.LoginReturnData;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.constants.LoginConstants;
import com.taobao.login4android.constants.LoginStatus;
import com.taobao.login4android.log.LoginTLogAdapter;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import tb.kge;

/* loaded from: classes7.dex */
public class AlipaySSOLogin {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "Login.AlipaySSOLogin";

    static {
        kge.a(-465013016);
    }

    public static void alipayLogin(String str, Map<String, String> map, LoginParam loginParam) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfbdc6d2", new Object[]{str, map, loginParam});
            return;
        }
        try {
            alipayLoginData(str, map, UserLoginServiceImpl.getInstance().loginByAlipaySSOToken(str, map, loginParam), loginParam);
        } catch (Throwable th) {
            BroadCastHelper.sendLoginFailBroadcast(712, "");
            LoginStatus.resetLoginFlag();
            th.printStackTrace();
        }
    }

    private static void alipayLoginData(final String str, final Map<String, String> map, RpcResponse<LoginReturnData> rpcResponse, final LoginParam loginParam) {
        String str2;
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23bd8ff", new Object[]{str, map, rpcResponse, loginParam});
        } else if (rpcResponse != null && rpcResponse.returnValue != null && rpcResponse.code == 3000) {
            onReceiveSuccess(rpcResponse, loginParam);
        } else if (rpcResponse != null && "H5".equals(rpcResponse.actionType) && rpcResponse.returnValue != null) {
            LoginReturnData loginReturnData = rpcResponse.returnValue;
            LoginParam loginParam2 = new LoginParam();
            if (loginParam != null) {
                loginParam2.sdkTraceId = loginParam.sdkTraceId;
                loginParam2.utPageName = loginParam.utPageName;
                loginParam2.loginSourceType = loginParam.loginSourceType;
            }
            loginParam2.tokenType = TokenType.ALIPAY_SSO;
            LoginResultHelper.gotoH5PlaceHolder(DataProviderFactory.getApplicationContext(), loginReturnData, loginParam2);
        } else if (rpcResponse != null && ApiConstants.ResultActionType.ALERT.equals(rpcResponse.actionType) && rpcResponse.code == 14077) {
            if (LoginApprearanceExtensions.AsoLoginFlow.getAsoLoginCallback() != null) {
                LoginApprearanceExtensions.AsoLoginFlow.getAsoLoginCallback().onNeedSwitch(rpcResponse.message, new DataCallback<Boolean>() { // from class: com.taobao.login4android.biz.alipaysso.AlipaySSOLogin.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.ali.user.mobile.callback.DataCallback
                    public /* synthetic */ void result(Boolean bool) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("91402500", new Object[]{this, bool});
                        } else {
                            a(bool);
                        }
                    }

                    public void a(Boolean bool) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("ba62f9e5", new Object[]{this, bool});
                        } else if (bool != null && bool.booleanValue()) {
                            Map map2 = map;
                            if (map2 != null) {
                                map2.remove(AlipayConstant.LOGIN_ALIPAY_ACCOUNT_CHECK_KEY);
                                map.remove(AlipayConstant.LOGIN_ALIPAY_HAVANA_ID_KEY);
                            }
                            AlipaySSOLogin.alipayLogin(str, map, loginParam);
                        } else {
                            BroadCastHelper.sendLoginFailBroadcast(712, "");
                        }
                    }
                });
            }
            LoginStatus.resetLoginFlag();
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("alipayLoginFail : code!= 3000 && actionType!= h5");
            if (rpcResponse != null) {
                str2 = rpcResponse.code + "," + rpcResponse.message;
            } else {
                str2 = "";
            }
            sb.append(str2);
            LoginTLogAdapter.e(TAG, sb.toString());
            BroadCastHelper.sendLoginFailBroadcast(712, "");
            LoginStatus.resetLoginFlag();
            if (loginParam == null) {
                return;
            }
            if (rpcResponse == null) {
                str3 = "-1";
            } else {
                str3 = rpcResponse.code + "";
            }
            Properties properties = LoginComponent.getProperties(loginParam);
            properties.setProperty("continueLogin", UTConstant.Args.UT_SUCCESS_F);
            UserTrackAdapter.sendUT(loginParam.utPageName, UTConstant.CustomEvent.UT_LOGIN_FAIL, str3, LoginType.LocalLoginType.ALIPAY_TRUST_LOGIN, properties);
            UserTrackAdapter.sendUT(loginParam.utPageName, UTConstant.CustomEvent.UT_SINGLE_LOGIN_FAILURE, str3, LoginType.LocalLoginType.ALIPAY_TRUST_LOGIN, LoginComponent.getProperties(loginParam));
        }
    }

    private static void onReceiveSuccess(RpcResponse<LoginReturnData> rpcResponse, LoginParam loginParam) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd0550a4", new Object[]{rpcResponse, loginParam});
            return;
        }
        if (loginParam != null) {
            Properties properties = LoginComponent.getProperties(loginParam);
            properties.setProperty("continueLogin", UTConstant.Args.UT_SUCCESS_F);
            UserTrackAdapter.sendUT(loginParam.utPageName, UTConstant.CustomEvent.UT_LOGIN_SUCCESS, "", LoginType.LocalLoginType.ALIPAY_TRUST_LOGIN, properties);
            UserTrackAdapter.sendUT(loginParam.utPageName, UTConstant.CustomEvent.UT_SINGLE_LOGIN_SUCCESS, "", LoginType.LocalLoginType.ALIPAY_TRUST_LOGIN, LoginComponent.getProperties(loginParam));
        }
        HashMap hashMap = new HashMap();
        hashMap.put(LoginConstants.LOGIN_TYPE, LoginType.LocalLoginType.ASO_LOGIN);
        LoginDataHelper.processLoginReturnData(true, rpcResponse.returnValue, hashMap);
    }
}
