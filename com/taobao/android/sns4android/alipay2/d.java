package com.taobao.android.sns4android.alipay2;

import android.app.Activity;
import android.content.Intent;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.ali.user.mobile.app.LoginContext;
import com.ali.user.mobile.app.constant.UTConstant;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.mobile.base.helper.BroadCastHelper;
import com.ali.user.mobile.base.helper.LoginDataHelper;
import com.ali.user.mobile.base.helper.LoginResultHelper;
import com.ali.user.mobile.base.helper.SDKExceptionHelper;
import com.ali.user.mobile.coordinator.CoordinatorWrapper;
import com.ali.user.mobile.exception.RpcException;
import com.ali.user.mobile.info.AlipayInfo;
import com.ali.user.mobile.log.AppMonitorAdapter;
import com.ali.user.mobile.log.UserTrackAdapter;
import com.ali.user.mobile.login.action.LoginResActions;
import com.ali.user.mobile.login.service.impl.UserLoginServiceImpl;
import com.ali.user.mobile.model.LoginParam;
import com.ali.user.mobile.model.LoginType;
import com.ali.user.mobile.model.TokenType;
import com.ali.user.mobile.rpc.RpcResponse;
import com.ali.user.mobile.rpc.login.model.LoginReturnData;
import com.ali.user.mobile.utils.MainThreadExecutor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.biz.alipaysso.AlipayConstant;
import com.taobao.login4android.broadcast.LoginAction;
import com.taobao.login4android.constants.LoginConstants;
import com.taobao.login4android.constants.LoginStatus;
import com.taobao.login4android.utils.ToastUtil;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.Properties;

/* loaded from: classes6.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static LoginParam f15252a;

    public static /* synthetic */ void a(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20f12ca5", new Object[]{new Integer(i), str});
        } else {
            b(i, str);
        }
    }

    public static /* synthetic */ void a(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ad11", new Object[]{str, new Integer(i)});
        } else {
            b(str, i);
        }
    }

    public static void b(LoginParam loginParam) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bd6ec6", new Object[]{loginParam});
        } else {
            f15252a = loginParam;
        }
    }

    public static void a(final Activity activity, final String str, final String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e36e85ce", new Object[]{activity, str, str2});
            return;
        }
        UserTrackAdapter.sendUT("Alipay_AuthCode_Login");
        new CoordinatorWrapper().execute(new AsyncTask<Object, Void, RpcResponse<LoginReturnData>>() { // from class: com.taobao.android.sns4android.alipay2.d.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, com.ali.user.mobile.rpc.RpcResponse<com.ali.user.mobile.rpc.login.model.LoginReturnData>] */
            @Override // android.os.AsyncTask
            public /* synthetic */ RpcResponse<LoginReturnData> doInBackground(Object[] objArr) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("e83e4786", new Object[]{this, objArr}) : a(objArr);
            }

            @Override // android.os.AsyncTask
            public /* synthetic */ void onPostExecute(RpcResponse<LoginReturnData> rpcResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b105c779", new Object[]{this, rpcResponse});
                } else {
                    a(rpcResponse);
                }
            }

            public RpcResponse<LoginReturnData> a(Object... objArr) {
                String str3;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (RpcResponse) ipChange2.ipc$dispatch("181ff326", new Object[]{this, objArr});
                }
                try {
                    if (d.f15252a != null) {
                        LoginContext.sSingleLoginStartTime = System.currentTimeMillis();
                        Properties properties = new Properties();
                        properties.setProperty("monitor", "T");
                        if (d.f15252a == null) {
                            str3 = "";
                        } else {
                            str3 = d.f15252a.sdkTraceId + "";
                        }
                        properties.setProperty("sdkTraceId", str3);
                        UserTrackAdapter.sendUT(d.f15252a.utPageName, UTConstant.CustomEvent.UT_SINGLE_LOGIN_COMMIT, "", LoginType.LocalLoginType.ASO_LOGIN, properties);
                    }
                    HashMap hashMap = new HashMap();
                    hashMap.put(AlipayConstant.LOGIN_ALIPAY_AUTH_CODE_KEY, str);
                    hashMap.put(AlipayConstant.SSO_ALIPAY_DES_KEY, str2);
                    hashMap.put(AlipayConstant.SSO_ALIPAY_ENABLE_KEY, "true");
                    hashMap.put("uuid", AlipayInfo.getInstance().getApdidToken());
                    return UserLoginServiceImpl.getInstance().loginByAlipaySSOToken(null, hashMap, d.f15252a);
                } catch (Exception unused) {
                    return null;
                }
            }

            public void a(RpcResponse<LoginReturnData> rpcResponse) {
                String str3;
                String str4;
                String str5;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("36adbd85", new Object[]{this, rpcResponse});
                    return;
                }
                if (rpcResponse != null) {
                    try {
                        if (rpcResponse.returnValue != null && rpcResponse.code == 3000) {
                            if (d.f15252a != null) {
                                Properties properties = new Properties();
                                properties.setProperty("sdkTraceId", d.f15252a.sdkTraceId + "");
                                properties.setProperty("continueLogin", UTConstant.Args.UT_SUCCESS_F);
                                properties.setProperty("loginId", d.f15252a.loginId + "");
                                properties.setProperty("duration", (System.currentTimeMillis() - LoginContext.sLoginRpcStartTime) + "");
                                LoginContext.sLoginRpcStartTime = 0L;
                                UserTrackAdapter.sendUT(d.f15252a.utPageName, UTConstant.CustomEvent.UT_LOGIN_SUCCESS, "", LoginType.LocalLoginType.ASO_LOGIN, properties);
                                Properties properties2 = new Properties();
                                if (d.f15252a == null) {
                                    str3 = "";
                                } else {
                                    str3 = d.f15252a.sdkTraceId + "";
                                }
                                properties2.setProperty("sdkTraceId", str3);
                                properties2.setProperty("monitor", "T");
                                properties2.setProperty("duration", (System.currentTimeMillis() - LoginContext.sSingleLoginStartTime) + "");
                                LoginContext.sSingleLoginStartTime = 0L;
                                UserTrackAdapter.sendUT(d.f15252a.utPageName, UTConstant.CustomEvent.UT_SINGLE_LOGIN_SUCCESS, "", LoginType.LocalLoginType.ASO_LOGIN, properties2);
                            }
                            d.f15252a = null;
                            HashMap hashMap = new HashMap();
                            hashMap.put(LoginConstants.LOGIN_TYPE, LoginType.LocalLoginType.ASO_LOGIN);
                            LoginDataHelper.processLoginReturnData(true, rpcResponse.returnValue, hashMap);
                            AppMonitorAdapter.commitSuccess("Page_Member_SSO", "AlipaySSO_Login");
                            return;
                        }
                    } catch (RpcException e) {
                        e.printStackTrace();
                        SDKExceptionHelper.getInstance().rpcExceptionHandler(e);
                        BroadCastHelper.sendLocalBroadCast(new Intent(LoginResActions.LOGIN_NETWORK_ERROR));
                        BroadCastHelper.sendBroadcast(LoginAction.NOTIFY_ALIPAY_SSO_FAIL);
                        return;
                    }
                }
                if (rpcResponse != null && "H5".equals(rpcResponse.actionType) && rpcResponse.returnValue != null) {
                    LoginReturnData loginReturnData = rpcResponse.returnValue;
                    LoginParam loginParam = new LoginParam();
                    loginParam.tokenType = TokenType.ALIPAY_SSO;
                    if (d.f15252a != null) {
                        loginParam.loginSourceType = d.f15252a.loginSourceType;
                        loginParam.utPageName = d.f15252a.utPageName;
                        loginParam.sdkTraceId = d.f15252a.sdkTraceId;
                        loginParam.source = d.f15252a.source;
                    }
                    loginParam.errorCode = rpcResponse.code + "";
                    loginParam.sendLoginFailWhenWebviewCancel = true;
                    LoginResultHelper.gotoH5PlaceHolder(activity, loginReturnData, loginParam);
                    UserTrackAdapter.sendUT("Alipay_AuthCode_Login_H5");
                } else if (rpcResponse != null && rpcResponse.actionType != null && !TextUtils.isEmpty(rpcResponse.message)) {
                    Properties properties3 = new Properties();
                    properties3.setProperty("code", String.valueOf(rpcResponse.code));
                    properties3.setProperty("message", rpcResponse.message);
                    if (rpcResponse == null) {
                        str4 = "-1";
                    } else {
                        str4 = rpcResponse.code + "";
                    }
                    if (d.f15252a != null) {
                        Properties properties4 = new Properties();
                        properties4.setProperty("sdkTraceId", d.f15252a.sdkTraceId + "");
                        properties4.setProperty("continueLogin", UTConstant.Args.UT_SUCCESS_F);
                        properties4.setProperty("duration", (System.currentTimeMillis() - LoginContext.sLoginRpcStartTime) + "");
                        LoginContext.sLoginRpcStartTime = 0L;
                        UserTrackAdapter.sendUT(d.f15252a.utPageName, UTConstant.CustomEvent.UT_LOGIN_FAIL, str4, properties4);
                    }
                    Properties properties5 = new Properties();
                    if (d.f15252a == null) {
                        str5 = "";
                    } else {
                        str5 = d.f15252a.sdkTraceId + "";
                    }
                    properties5.setProperty("sdkTraceId", str5);
                    properties5.setProperty("monitor", "T");
                    properties5.setProperty("duration", (System.currentTimeMillis() - LoginContext.sSingleLoginStartTime) + "");
                    LoginContext.sSingleLoginStartTime = 0L;
                    UserTrackAdapter.sendUT(UTConstant.PageName.UT_PAGE_EXTEND, UTConstant.CustomEvent.UT_SINGLE_LOGIN_FAILURE, str4, LoginType.LocalLoginType.ASO_LOGIN, properties5);
                    d.f15252a = null;
                    d.a(rpcResponse.message, 0);
                    BroadCastHelper.sendBroadcast(LoginAction.NOTIFY_ALIPAY_SSO_FAIL);
                } else {
                    int i = -1;
                    if (rpcResponse != null) {
                        i = rpcResponse.code;
                    }
                    d.a(i, DataProviderFactory.getApplicationContext().getString(R.string.aliuser_network_error));
                    BroadCastHelper.sendBroadcast(LoginAction.NOTIFY_ALIPAY_SSO_FAIL);
                }
            }
        }, new Object[0]);
    }

    private static void b(final String str, final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d253bf0", new Object[]{str, new Integer(i)});
        } else {
            MainThreadExecutor.execute(new Runnable() { // from class: com.taobao.android.sns4android.alipay2.d.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (TextUtils.isEmpty(str)) {
                    } else {
                        try {
                            ToastUtil.showToast(DataProviderFactory.getApplicationContext(), str, i);
                        } catch (Throwable th) {
                            th.printStackTrace();
                        }
                    }
                }
            });
        }
    }

    private static void b(int i, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cf2bb84", new Object[]{new Integer(i), str});
        } else {
            MainThreadExecutor.execute(new Runnable() { // from class: com.taobao.android.sns4android.alipay2.d.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    LoginStatus.setLastRefreshCookieTime(0L);
                    Intent intent = new Intent(LoginResActions.LOGIN_NETWORK_ERROR);
                    if (!TextUtils.isEmpty(str)) {
                        intent.putExtra("message", str);
                    }
                    BroadCastHelper.sendLocalBroadCast(intent);
                }
            });
        }
    }

    public static void a(final Activity activity, final LoginParam loginParam) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cd62bd7", new Object[]{activity, loginParam});
        } else {
            new CoordinatorWrapper().execute(new AsyncTask<Object, Void, RpcResponse<LoginReturnData>>() { // from class: com.taobao.android.sns4android.alipay2.d.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, com.ali.user.mobile.rpc.RpcResponse<com.ali.user.mobile.rpc.login.model.LoginReturnData>] */
                @Override // android.os.AsyncTask
                public /* synthetic */ RpcResponse<LoginReturnData> doInBackground(Object[] objArr) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("e83e4786", new Object[]{this, objArr}) : a(objArr);
                }

                @Override // android.os.AsyncTask
                public /* synthetic */ void onPostExecute(RpcResponse<LoginReturnData> rpcResponse) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b105c779", new Object[]{this, rpcResponse});
                    } else {
                        a(rpcResponse);
                    }
                }

                public RpcResponse<LoginReturnData> a(Object... objArr) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (RpcResponse) ipChange2.ipc$dispatch("181ff326", new Object[]{this, objArr});
                    }
                    try {
                        if (LoginParam.this.ext == null) {
                            LoginParam.this.ext = new HashMap();
                        }
                        LoginParam.this.ext.put("apiReferer", "SSOV2_H5_tokenLogin");
                        return d.a(LoginParam.this);
                    } catch (RpcException e) {
                        try {
                            Properties properties = new Properties();
                            properties.setProperty("username", LoginParam.this.loginId + "");
                            properties.setProperty("errorCode", String.valueOf(e.getCode()));
                            properties.setProperty("target", "RPCException");
                            if (!TextUtils.isEmpty(DataProviderFactory.getDataProvider().getAppkey())) {
                                properties.setProperty("appName", DataProviderFactory.getDataProvider().getAppkey());
                            }
                            UserTrackAdapter.sendUT("Event_LoginFail", properties);
                            return null;
                        } catch (Exception e2) {
                            e2.printStackTrace();
                            return null;
                        }
                    } catch (Exception unused) {
                        return null;
                    }
                }

                public void a(RpcResponse<LoginReturnData> rpcResponse) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("36adbd85", new Object[]{this, rpcResponse});
                        return;
                    }
                    try {
                        if (rpcResponse == null) {
                            d.a(-1, DataProviderFactory.getApplicationContext().getString(R.string.aliuser_network_error));
                            return;
                        }
                        LoginReturnData loginReturnData = rpcResponse.returnValue;
                        if ("SUCCESS".equals(rpcResponse.actionType) && loginReturnData != null) {
                            if (rpcResponse.returnValue.extMap == null) {
                                rpcResponse.returnValue.extMap = new HashMap();
                            }
                            rpcResponse.returnValue.extMap.put("login_type", "auth");
                            HashMap hashMap = new HashMap();
                            hashMap.put(LoginConstants.LOGIN_TYPE, LoginType.LocalLoginType.TOKEN_LOGIN);
                            LoginDataHelper.processLoginReturnData(true, rpcResponse.returnValue, hashMap);
                        } else if ("H5".equals(rpcResponse.actionType)) {
                            LoginParam loginParam2 = new LoginParam();
                            loginParam2.tokenType = TokenType.TAOBAO_SSO;
                            loginParam2.errorCode = rpcResponse.code + "";
                            loginParam2.sendLoginFailWhenWebviewCancel = true;
                            LoginResultHelper.gotoH5PlaceHolder(activity, loginReturnData, loginParam2);
                        } else {
                            String string = DataProviderFactory.getApplicationContext().getString(R.string.aliuser_network_error);
                            if (!TextUtils.isEmpty(rpcResponse.message)) {
                                string = rpcResponse.message;
                            }
                            d.a(-2, string);
                        }
                    } catch (RpcException unused) {
                        d.a(-1, DataProviderFactory.getApplicationContext().getString(R.string.aliuser_network_error));
                    }
                }
            }, new Object[0]);
        }
    }

    public static RpcResponse a(LoginParam loginParam) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RpcResponse) ipChange.ipc$dispatch("b1a34f62", new Object[]{loginParam});
        }
        if (loginParam.token == null) {
            return null;
        }
        return UserLoginServiceImpl.getInstance().loginByToken(loginParam);
    }
}
