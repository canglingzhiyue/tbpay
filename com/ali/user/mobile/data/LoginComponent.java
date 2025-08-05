package com.ali.user.mobile.data;

import android.os.Build;
import android.text.TextUtils;
import com.ali.user.mobile.app.constant.UTConstant;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.mobile.callback.RpcRequestCallback;
import com.ali.user.mobile.info.AppInfo;
import com.ali.user.mobile.log.AppMonitorAdapter;
import com.ali.user.mobile.log.UserTrackAdapter;
import com.ali.user.mobile.login.AccountType;
import com.ali.user.mobile.login.service.impl.UserLoginServiceImpl;
import com.ali.user.mobile.model.LoginBaseParam;
import com.ali.user.mobile.model.LoginType;
import com.ali.user.mobile.register.model.MtopRegisterInitcontextResponseData;
import com.ali.user.mobile.rpc.ApiConstants;
import com.ali.user.mobile.rpc.RpcRequest;
import com.ali.user.mobile.rpc.RpcResponse;
import com.ali.user.mobile.rpc.filter.IAfterFilter;
import com.ali.user.mobile.rpc.login.model.DefaultLoginResponseData;
import com.ali.user.mobile.rpc.login.model.LoginRequestBase;
import com.ali.user.mobile.rpc.login.model.SMSLoginRequest;
import com.ali.user.mobile.security.SecurityGuardManagerWraper;
import com.ali.user.mobile.service.RpcService;
import com.ali.user.mobile.service.ServiceFactory;
import com.ali.user.mobile.utils.ResourceUtil;
import com.ali.user.mobile.utils.UTConstans;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import tb.kge;

/* loaded from: classes2.dex */
public class LoginComponent {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static LoginComponent mRegisterComponent;
    private final String TAG = "login.RegisterComponent";

    static {
        kge.a(1162869393);
    }

    public static /* synthetic */ void access$000(LoginComponent loginComponent, LoginBaseParam loginBaseParam, RpcResponse rpcResponse, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c4f968e", new Object[]{loginComponent, loginBaseParam, rpcResponse, new Boolean(z)});
        } else {
            loginComponent.smsLoginUT(loginBaseParam, rpcResponse, z);
        }
    }

    private LoginComponent() {
    }

    public static LoginComponent getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LoginComponent) ipChange.ipc$dispatch("a58c08d2", new Object[0]);
        }
        if (mRegisterComponent == null) {
            synchronized (LoginComponent.class) {
                if (mRegisterComponent == null) {
                    mRegisterComponent = new LoginComponent();
                }
            }
        }
        return mRegisterComponent;
    }

    public void sendSmsByLogin(final LoginBaseParam loginBaseParam, RpcRequestCallback rpcRequestCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c74a2f9a", new Object[]{this, loginBaseParam, rpcRequestCallback});
            return;
        }
        RpcRequest buildSendSmsByLoginRequest = buildSendSmsByLoginRequest(loginBaseParam);
        buildSendSmsByLoginRequest.addAfter(new IAfterFilter() { // from class: com.ali.user.mobile.data.LoginComponent.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.ali.user.mobile.rpc.filter.IAfterFilter
            public String doAfter(RpcResponse rpcResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (String) ipChange2.ipc$dispatch("81f37d6b", new Object[]{this, rpcResponse});
                }
                LoginComponent.this.sendSMSUT(loginBaseParam, rpcResponse, false);
                return "STOP";
            }
        });
        ((RpcService) ServiceFactory.getService(RpcService.class)).remoteBusiness(buildSendSmsByLoginRequest, DefaultLoginResponseData.class, String.valueOf(loginBaseParam.hid), rpcRequestCallback);
    }

    public void sendSmsByLoginWithNick(final LoginBaseParam loginBaseParam, RpcRequestCallback rpcRequestCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dd4e11", new Object[]{this, loginBaseParam, rpcRequestCallback});
            return;
        }
        RpcRequest buildSendSmsByLoginRequest = buildSendSmsByLoginRequest(loginBaseParam, true);
        buildSendSmsByLoginRequest.addAfter(new IAfterFilter() { // from class: com.ali.user.mobile.data.LoginComponent.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.ali.user.mobile.rpc.filter.IAfterFilter
            public String doAfter(RpcResponse rpcResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (String) ipChange2.ipc$dispatch("81f37d6b", new Object[]{this, rpcResponse});
                }
                LoginComponent.this.sendSMSUT(loginBaseParam, rpcResponse, true);
                return "STOP";
            }
        });
        ((RpcService) ServiceFactory.getService(RpcService.class)).remoteBusiness(buildSendSmsByLoginRequest, DefaultLoginResponseData.class, String.valueOf(loginBaseParam.hid), rpcRequestCallback);
    }

    public RpcRequest buildSendSmsByLoginRequest(LoginBaseParam loginBaseParam) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RpcRequest) ipChange.ipc$dispatch("42f978d4", new Object[]{this, loginBaseParam}) : buildSendSmsByLoginRequest(loginBaseParam, false);
    }

    public RpcRequest buildSendSmsByLoginRequest(LoginBaseParam loginBaseParam, boolean z) {
        Map map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RpcRequest) ipChange.ipc$dispatch("f0fbf40a", new Object[]{this, loginBaseParam, new Boolean(z)});
        }
        if (loginBaseParam != null) {
            UserTrackAdapter.sendUT(loginBaseParam.utPageName, UTConstans.CustomEvent.UT_SMS_SEND, "", z ? LoginType.LocalLoginType.NICK_SMS_LOGIN : LoginType.LocalLoginType.SMS_LOGIN, getProperties(loginBaseParam));
        }
        RpcRequest rpcRequest = new RpcRequest();
        if (z) {
            rpcRequest.API_NAME = ApiConstants.ApiName.API_LOGIN_SEND_SMS_NICK;
            rpcRequest.VERSION = "1.0";
        } else {
            rpcRequest.API_NAME = ApiConstants.ApiName.API_LOGIN_SEND_SMS;
            rpcRequest.VERSION = "1.0";
        }
        SMSLoginRequest sMSLoginRequest = new SMSLoginRequest();
        if (loginBaseParam.ext == null) {
            map = new HashMap();
        } else {
            map = loginBaseParam.ext;
        }
        map.put("apiVersion", "2.0");
        try {
            map.put("deviceName", Build.MODEL);
            map.put("sdkTraceId", loginBaseParam.sdkTraceId);
        } catch (Exception e) {
            e.printStackTrace();
        }
        sMSLoginRequest.resendAlert = loginBaseParam.resendAlert;
        if (loginBaseParam.sendAudio) {
            map.put("sendAudio", "true");
        }
        if (loginBaseParam.h5QueryString != null) {
            map.put(ApiConstants.ApiField.H5_QUERY_STRING, loginBaseParam.h5QueryString);
        }
        map.put("whatsAppInstalled", String.valueOf(loginBaseParam.whatsAppInstalled));
        map.put("whatsAppBusinessInstalled", String.valueOf(loginBaseParam.whatsAppBusinessInstalled));
        sMSLoginRequest.loginType = AccountType.TAOBAO_ACCOUNT.getType();
        UserLoginServiceImpl.addOuterExt(loginBaseParam, map);
        rpcRequest.addParam("ext", JSON.toJSONString(map));
        rpcRequest.requestSite = loginBaseParam.site;
        sMSLoginRequest.site = loginBaseParam.site;
        if (z) {
            sMSLoginRequest.nick = loginBaseParam.loginId;
        } else {
            sMSLoginRequest.loginId = loginBaseParam.loginId;
        }
        sMSLoginRequest.countryCode = loginBaseParam.countryCode;
        sMSLoginRequest.phoneCode = loginBaseParam.phoneCode;
        sMSLoginRequest.smsSid = loginBaseParam.smsSid;
        sMSLoginRequest.codeLength = "4";
        UserLoginServiceImpl.getInstance();
        UserLoginServiceImpl.buildBaseRequest(loginBaseParam, sMSLoginRequest, true);
        sMSLoginRequest.hid = loginBaseParam.hid + "";
        rpcRequest.addParam(ApiConstants.ApiField.LOGIN_INFO, JSON.toJSONString(sMSLoginRequest));
        rpcRequest.addParam("riskControlInfo", JSON.toJSONString(SecurityGuardManagerWraper.buildWSecurityData()));
        return rpcRequest;
    }

    public void sendSMSUT(LoginBaseParam loginBaseParam, RpcResponse rpcResponse, boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1692452c", new Object[]{this, loginBaseParam, rpcResponse, new Boolean(z)});
            return;
        }
        if (loginBaseParam != null) {
            try {
                if (!TextUtils.isEmpty(loginBaseParam.utPageName)) {
                    str = loginBaseParam.utPageName;
                    if (rpcResponse == null && rpcResponse.actionType != null) {
                        if ("SUCCESS".equals(rpcResponse.actionType)) {
                            Properties properties = getProperties(loginBaseParam);
                            properties.setProperty("continueLogin", UTConstant.Args.UT_SUCCESS_F);
                            UserTrackAdapter.sendUT(str, UTConstans.CustomEvent.UT_SMS_SEND_SUCCESS, "", z ? LoginType.LocalLoginType.NICK_SMS_LOGIN : LoginType.LocalLoginType.SMS_LOGIN, properties);
                            return;
                        }
                        sendSMSFailUT(loginBaseParam, rpcResponse, z);
                        return;
                    }
                    sendSMSFailUT(loginBaseParam, rpcResponse, z);
                }
            } catch (Exception unused) {
                sendSMSFailUT(loginBaseParam, rpcResponse, z);
                return;
            }
        }
        str = (loginBaseParam == null || !loginBaseParam.isFromAccount) ? UTConstant.PageName.UT_PAGE_SMS_LOGIN1 : UTConstant.PageName.UT_PAGE_SMS_LOGIN2;
        if (rpcResponse == null) {
        }
        sendSMSFailUT(loginBaseParam, rpcResponse, z);
    }

    private void sendSMSFailUT(LoginBaseParam loginBaseParam, RpcResponse rpcResponse, boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c42b1d6a", new Object[]{this, loginBaseParam, rpcResponse, new Boolean(z)});
            return;
        }
        String valueOf = rpcResponse != null ? String.valueOf(rpcResponse.code) : UTConstant.CustomEvent.UT_NETWORK_FAIL;
        if (loginBaseParam != null && !TextUtils.isEmpty(loginBaseParam.utPageName)) {
            str = loginBaseParam.utPageName;
        } else {
            str = (loginBaseParam == null || !loginBaseParam.isFromAccount) ? UTConstant.PageName.UT_PAGE_SMS_LOGIN1 : UTConstant.PageName.UT_PAGE_SMS_LOGIN2;
        }
        Properties properties = new Properties();
        if (loginBaseParam != null) {
            properties.setProperty("sdkTraceId", loginBaseParam.sdkTraceId + "");
            if (loginBaseParam.ext != null && loginBaseParam.ext.containsKey(ApiConstants.ApiField.FROM_REGISTER_PAGE)) {
                properties.setProperty(ApiConstants.ApiField.FROM_REGISTER_PAGE, loginBaseParam.ext.get(ApiConstants.ApiField.FROM_REGISTER_PAGE));
            }
        }
        properties.setProperty("continueLogin", UTConstant.Args.UT_SUCCESS_F);
        UserTrackAdapter.sendUT(str, UTConstans.CustomEvent.UT_SMS_SEND_FAIL, valueOf, z ? LoginType.LocalLoginType.NICK_SMS_LOGIN : LoginType.LocalLoginType.SMS_LOGIN, properties);
        AppMonitorAdapter.commitFail("Page_Member_Login", "loginMonitorPoint", valueOf, "action=result;biz=smssend;page=" + str);
    }

    public RpcRequest buildSmsLoginRequest(LoginBaseParam loginBaseParam) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RpcRequest) ipChange.ipc$dispatch("b0a33083", new Object[]{this, loginBaseParam}) : buildSmsLoginRequest(loginBaseParam, false);
    }

    public RpcRequest buildSmsLoginRequest(LoginBaseParam loginBaseParam, boolean z) {
        Map map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RpcRequest) ipChange.ipc$dispatch("3889323b", new Object[]{this, loginBaseParam, new Boolean(z)});
        }
        if (loginBaseParam != null) {
            UserTrackAdapter.sendUT(loginBaseParam.utPageName, UTConstant.CustomEvent.UT_LOGIN_RPC, getProperties(loginBaseParam));
        }
        RpcRequest rpcRequest = new RpcRequest();
        if (z) {
            rpcRequest.API_NAME = ApiConstants.ApiName.API_SMS_LOGIN_NICK;
            rpcRequest.VERSION = "1.0";
        } else {
            rpcRequest.API_NAME = ApiConstants.ApiName.API_SMS_LOGIN;
            rpcRequest.VERSION = "1.0";
        }
        SMSLoginRequest sMSLoginRequest = new SMSLoginRequest();
        if (loginBaseParam.ext == null) {
            map = new HashMap();
        } else {
            map = loginBaseParam.ext;
        }
        map.put("apiVersion", "2.0");
        try {
            map.put("deviceName", Build.MODEL);
            map.put("sdkTraceId", loginBaseParam.sdkTraceId);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (loginBaseParam.h5QueryString != null) {
            map.put(ApiConstants.ApiField.H5_QUERY_STRING, loginBaseParam.h5QueryString);
        }
        if (loginBaseParam.sendAudio) {
            map.put("checkAudio", "true");
        }
        sMSLoginRequest.loginType = AccountType.TAOBAO_ACCOUNT.getType();
        UserLoginServiceImpl.addOuterExt(loginBaseParam, map);
        rpcRequest.addParam("ext", JSON.toJSONString(map));
        rpcRequest.requestSite = loginBaseParam.site;
        if (z) {
            sMSLoginRequest.nick = loginBaseParam.loginId;
        } else {
            sMSLoginRequest.loginId = loginBaseParam.loginId;
        }
        sMSLoginRequest.countryCode = loginBaseParam.countryCode;
        sMSLoginRequest.phoneCode = loginBaseParam.phoneCode;
        sMSLoginRequest.smsCode = loginBaseParam.smsCode;
        sMSLoginRequest.smsSid = loginBaseParam.smsSid;
        UserLoginServiceImpl.buildBaseRequest(loginBaseParam, sMSLoginRequest, true);
        sMSLoginRequest.hid = loginBaseParam.hid + "";
        rpcRequest.addParam(ApiConstants.ApiField.LOGIN_INFO, JSON.toJSONString(sMSLoginRequest));
        rpcRequest.addParam("riskControlInfo", JSON.toJSONString(UserLoginServiceImpl.getScanFaceWSecurityData()));
        return rpcRequest;
    }

    public void smsLogin(final LoginBaseParam loginBaseParam, RpcRequestCallback rpcRequestCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cb2b78b", new Object[]{this, loginBaseParam, rpcRequestCallback});
            return;
        }
        RpcRequest buildSmsLoginRequest = buildSmsLoginRequest(loginBaseParam);
        buildSmsLoginRequest.addAfter(new IAfterFilter() { // from class: com.ali.user.mobile.data.LoginComponent.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.ali.user.mobile.rpc.filter.IAfterFilter
            public String doAfter(RpcResponse rpcResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (String) ipChange2.ipc$dispatch("81f37d6b", new Object[]{this, rpcResponse});
                }
                LoginComponent.access$000(LoginComponent.this, loginBaseParam, rpcResponse, false);
                return "STOP";
            }
        });
        ((RpcService) ServiceFactory.getService(RpcService.class)).remoteBusiness(buildSmsLoginRequest, DefaultLoginResponseData.class, String.valueOf(loginBaseParam.hid), rpcRequestCallback);
    }

    public void smsLoginWithNick(final LoginBaseParam loginBaseParam, RpcRequestCallback rpcRequestCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d3b5502", new Object[]{this, loginBaseParam, rpcRequestCallback});
            return;
        }
        RpcRequest buildSmsLoginRequest = buildSmsLoginRequest(loginBaseParam, true);
        buildSmsLoginRequest.addAfter(new IAfterFilter() { // from class: com.ali.user.mobile.data.LoginComponent.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.ali.user.mobile.rpc.filter.IAfterFilter
            public String doAfter(RpcResponse rpcResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (String) ipChange2.ipc$dispatch("81f37d6b", new Object[]{this, rpcResponse});
                }
                LoginComponent.access$000(LoginComponent.this, loginBaseParam, rpcResponse, true);
                return "STOP";
            }
        });
        ((RpcService) ServiceFactory.getService(RpcService.class)).remoteBusiness(buildSmsLoginRequest, DefaultLoginResponseData.class, String.valueOf(loginBaseParam.hid), rpcRequestCallback);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void smsLoginUT(com.ali.user.mobile.model.LoginBaseParam r10, com.ali.user.mobile.rpc.RpcResponse r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ali.user.mobile.data.LoginComponent.smsLoginUT(com.ali.user.mobile.model.LoginBaseParam, com.ali.user.mobile.rpc.RpcResponse, boolean):void");
    }

    public static Properties getProperties(LoginBaseParam loginBaseParam) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Properties) ipChange.ipc$dispatch("f021e7d4", new Object[]{loginBaseParam});
        }
        Properties properties = new Properties();
        if (loginBaseParam != null) {
            properties.setProperty("sdkTraceId", loginBaseParam.sdkTraceId + "");
            properties.setProperty("loginId", loginBaseParam.loginId + "");
            properties.setProperty("source", String.valueOf(loginBaseParam.source));
            if (loginBaseParam.ext != null && loginBaseParam.ext.containsKey(ApiConstants.ApiField.FROM_REGISTER_PAGE)) {
                properties.setProperty(ApiConstants.ApiField.FROM_REGISTER_PAGE, loginBaseParam.ext.get(ApiConstants.ApiField.FROM_REGISTER_PAGE));
            }
        }
        properties.setProperty("monitor", "T");
        properties.setProperty("site", DataProviderFactory.getDataProvider().getSite() + "");
        return properties;
    }

    public static Properties getProperties() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Properties) ipChange.ipc$dispatch("c96041a2", new Object[0]) : getProperties(null);
    }

    private void smsLoginFailureUT(LoginBaseParam loginBaseParam, RpcResponse rpcResponse, boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcfc9995", new Object[]{this, loginBaseParam, rpcResponse, new Boolean(z)});
            return;
        }
        try {
            Properties properties = getProperties(loginBaseParam);
            properties.setProperty(UTConstant.Args.UT_PROPERTY_SUCCESS, UTConstant.Args.UT_SUCCESS_F);
            properties.setProperty("continueLogin", UTConstant.Args.UT_SUCCESS_F);
            String str2 = UTConstant.CustomEvent.UT_NETWORK_FAIL;
            if (rpcResponse != null) {
                str2 = String.valueOf(rpcResponse.code);
            }
            if (!TextUtils.isEmpty(loginBaseParam.utPageName)) {
                str = loginBaseParam.utPageName;
            } else {
                str = loginBaseParam.isFromAccount ? UTConstant.PageName.UT_PAGE_SMS_LOGIN2 : UTConstant.PageName.UT_PAGE_SMS_LOGIN1;
            }
            String str3 = LoginType.LocalLoginType.SMS_LOGIN;
            if (z) {
                str3 = LoginType.LocalLoginType.NICK_SMS_LOGIN;
            }
            UserTrackAdapter.sendUT(str, UTConstant.CustomEvent.UT_LOGIN_FAIL, str2, str3, properties);
            UserTrackAdapter.sendUT(str, UTConstant.CustomEvent.UT_SINGLE_LOGIN_FAILURE, str2, str3, getProperties(loginBaseParam));
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public RpcResponse getCountryList() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RpcResponse) ipChange.ipc$dispatch("e6f14d02", new Object[]{this}) : getCountryList(ResourceUtil.getLocaleStr());
    }

    public RpcResponse getCountryList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RpcResponse) ipChange.ipc$dispatch("e7b93a8c", new Object[]{this, str});
        }
        RpcRequest rpcRequest = new RpcRequest();
        rpcRequest.API_NAME = ApiConstants.ApiName.API_LOGIN_COUNTRY;
        rpcRequest.VERSION = "1.0";
        LoginRequestBase loginRequestBase = new LoginRequestBase();
        HashMap hashMap = new HashMap();
        hashMap.put("apiVersion", "2.0");
        try {
            hashMap.put("deviceName", Build.MODEL);
        } catch (Exception e) {
            e.printStackTrace();
        }
        rpcRequest.addParam("ext", JSON.toJSONString(hashMap));
        loginRequestBase.locale = str;
        loginRequestBase.appName = DataProviderFactory.getDataProvider().getAppkey();
        loginRequestBase.deviceId = DataProviderFactory.getDataProvider().getDeviceId();
        loginRequestBase.site = DataProviderFactory.getDataProvider().getSite();
        loginRequestBase.sdkVersion = AppInfo.getInstance().getSdkVersion();
        loginRequestBase.ttid = DataProviderFactory.getDataProvider().getTTID();
        loginRequestBase.utdid = AppInfo.getInstance().getUtdid();
        rpcRequest.addParam("info", JSON.toJSONString(loginRequestBase));
        rpcRequest.addParam("riskControlInfo", JSON.toJSONString(SecurityGuardManagerWraper.buildWSecurityData()));
        return ((RpcService) ServiceFactory.getService(RpcService.class)).post(rpcRequest, MtopRegisterInitcontextResponseData.class);
    }
}
