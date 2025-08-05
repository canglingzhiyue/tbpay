package com.ali.user.mobile.login;

import android.os.Build;
import com.ali.user.mobile.callback.RpcRequestCallback;
import com.ali.user.mobile.login.service.impl.UserLoginServiceImpl;
import com.ali.user.mobile.model.LoginBaseParam;
import com.ali.user.mobile.model.LoginParam;
import com.ali.user.mobile.rpc.ApiConstants;
import com.ali.user.mobile.rpc.RpcRequest;
import com.ali.user.mobile.rpc.RpcResponse;
import com.ali.user.mobile.rpc.filter.IAfterFilter;
import com.ali.user.mobile.rpc.login.model.DefaultLoginResponseData;
import com.ali.user.mobile.rpc.login.model.OverseaSimLoginRequest;
import com.ali.user.mobile.rpc.login.model.TokenLoginRequest;
import com.ali.user.mobile.security.SecurityGuardManagerWraper;
import com.ali.user.mobile.service.RpcService;
import com.ali.user.mobile.service.ServiceFactory;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes2.dex */
public class LoginDataRepository {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static LoginDataRepository instance;

    static {
        kge.a(-1708409233);
        instance = null;
    }

    private LoginDataRepository() {
    }

    public static LoginDataRepository getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LoginDataRepository) ipChange.ipc$dispatch("ad51dab4", new Object[0]);
        }
        if (instance == null) {
            synchronized (LoginDataRepository.class) {
                if (instance == null) {
                    instance = new LoginDataRepository();
                }
            }
        }
        return instance;
    }

    public void simLogin(final LoginParam loginParam, Map<String, String> map, RpcRequestCallback rpcRequestCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84d2ef21", new Object[]{this, loginParam, map, rpcRequestCallback});
            return;
        }
        RpcRequest buildSimLoginRequestInner = UserLoginServiceImpl.getInstance().buildSimLoginRequestInner(loginParam, ApiConstants.ApiName.API_SIM_LOGIN, "", map);
        buildSimLoginRequestInner.addAfter(new IAfterFilter() { // from class: com.ali.user.mobile.login.LoginDataRepository.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.ali.user.mobile.rpc.filter.IAfterFilter
            public String doAfter(RpcResponse rpcResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (String) ipChange2.ipc$dispatch("81f37d6b", new Object[]{this, rpcResponse});
                }
                UserLoginServiceImpl.getInstance().tokenLoginUT(rpcResponse, loginParam, false);
                return "STOP";
            }
        });
        ((RpcService) ServiceFactory.getService(RpcService.class)).remoteBusiness(buildSimLoginRequestInner, DefaultLoginResponseData.class, String.valueOf(loginParam.hid), rpcRequestCallback);
    }

    public void unifyLoginWithTaobaoGW(final LoginBaseParam loginBaseParam, RpcRequestCallback rpcRequestCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bfa7cdd1", new Object[]{this, loginBaseParam, rpcRequestCallback});
            return;
        }
        RpcRequest buildPwdLoginRequest = UserLoginServiceImpl.getInstance().buildPwdLoginRequest(loginBaseParam);
        buildPwdLoginRequest.addAfter(new IAfterFilter() { // from class: com.ali.user.mobile.login.LoginDataRepository.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.ali.user.mobile.rpc.filter.IAfterFilter
            public String doAfter(RpcResponse rpcResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (String) ipChange2.ipc$dispatch("81f37d6b", new Object[]{this, rpcResponse});
                }
                UserLoginServiceImpl.getInstance().pwdLoginUT(loginBaseParam, rpcResponse);
                return "STOP";
            }
        });
        ((RpcService) ServiceFactory.getService(RpcService.class)).remoteBusiness(buildPwdLoginRequest, DefaultLoginResponseData.class, String.valueOf(loginBaseParam.hid), rpcRequestCallback);
    }

    public void loginByToken(final LoginBaseParam loginBaseParam, RpcRequestCallback rpcRequestCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87af0fc2", new Object[]{this, loginBaseParam, rpcRequestCallback});
            return;
        }
        RpcRequest buildLoginByTokenRequest = UserLoginServiceImpl.getInstance().buildLoginByTokenRequest(loginBaseParam);
        buildLoginByTokenRequest.addAfter(new IAfterFilter() { // from class: com.ali.user.mobile.login.LoginDataRepository.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.ali.user.mobile.rpc.filter.IAfterFilter
            public String doAfter(RpcResponse rpcResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (String) ipChange2.ipc$dispatch("81f37d6b", new Object[]{this, rpcResponse});
                }
                UserLoginServiceImpl.getInstance().tokenLoginUT(rpcResponse, loginBaseParam, true);
                return "STOP";
            }
        });
        ((RpcService) ServiceFactory.getService(RpcService.class)).remoteBusiness(buildLoginByTokenRequest, DefaultLoginResponseData.class, String.valueOf(loginBaseParam.hid), rpcRequestCallback);
    }

    public void simLoginWithUserInput(final LoginBaseParam loginBaseParam, RpcRequestCallback rpcRequestCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd260154", new Object[]{this, loginBaseParam, rpcRequestCallback});
            return;
        }
        RpcRequest buildSimLoginWithUserInputRequest = UserLoginServiceImpl.getInstance().buildSimLoginWithUserInputRequest(loginBaseParam);
        buildSimLoginWithUserInputRequest.addAfter(new IAfterFilter() { // from class: com.ali.user.mobile.login.LoginDataRepository.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.ali.user.mobile.rpc.filter.IAfterFilter
            public String doAfter(RpcResponse rpcResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (String) ipChange2.ipc$dispatch("81f37d6b", new Object[]{this, rpcResponse});
                }
                UserLoginServiceImpl.getInstance().tokenLoginUT(rpcResponse, loginBaseParam, false);
                return "STOP";
            }
        });
        ((RpcService) ServiceFactory.getService(RpcService.class)).remoteBusiness(buildSimLoginWithUserInputRequest, DefaultLoginResponseData.class, String.valueOf(loginBaseParam.hid), rpcRequestCallback);
    }

    public void uninstallRelogin(LoginBaseParam loginBaseParam, RpcRequestCallback rpcRequestCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ac12ac7", new Object[]{this, loginBaseParam, rpcRequestCallback});
        } else {
            ((RpcService) ServiceFactory.getService(RpcService.class)).remoteBusiness(UserLoginServiceImpl.getInstance().buildUninstallReloginRequest(loginBaseParam), DefaultLoginResponseData.class, String.valueOf(loginBaseParam.hid), rpcRequestCallback);
        }
    }

    public void umidLogin(final LoginBaseParam loginBaseParam, RpcRequestCallback rpcRequestCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b745ae5", new Object[]{this, loginBaseParam, rpcRequestCallback});
            return;
        }
        RpcRequest buildUmidTokenLoginRequest = UserLoginServiceImpl.getInstance().buildUmidTokenLoginRequest(loginBaseParam);
        buildUmidTokenLoginRequest.addAfter(new IAfterFilter() { // from class: com.ali.user.mobile.login.LoginDataRepository.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.ali.user.mobile.rpc.filter.IAfterFilter
            public String doAfter(RpcResponse rpcResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (String) ipChange2.ipc$dispatch("81f37d6b", new Object[]{this, rpcResponse});
                }
                UserLoginServiceImpl.getInstance().tokenLoginUT(rpcResponse, loginBaseParam, false);
                return "STOP";
            }
        });
        ((RpcService) ServiceFactory.getService(RpcService.class)).remoteBusiness(buildUmidTokenLoginRequest, DefaultLoginResponseData.class, String.valueOf(loginBaseParam.hid), rpcRequestCallback);
    }

    public void uninstallGenToken(LoginBaseParam loginBaseParam, RpcRequestCallback rpcRequestCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75f9ea30", new Object[]{this, loginBaseParam, rpcRequestCallback});
        } else {
            ((RpcService) ServiceFactory.getService(RpcService.class)).remoteBusiness(UserLoginServiceImpl.getInstance().buildUninstallGenToken(loginBaseParam), DefaultLoginResponseData.class, String.valueOf(loginBaseParam.hid), rpcRequestCallback);
        }
    }

    public void simLogin(final LoginBaseParam loginBaseParam, RpcRequestCallback rpcRequestCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24f66009", new Object[]{this, loginBaseParam, rpcRequestCallback});
            return;
        }
        RpcRequest buildSimLoginRequest = UserLoginServiceImpl.getInstance().buildSimLoginRequest(loginBaseParam);
        buildSimLoginRequest.addAfter(new IAfterFilter() { // from class: com.ali.user.mobile.login.LoginDataRepository.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.ali.user.mobile.rpc.filter.IAfterFilter
            public String doAfter(RpcResponse rpcResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (String) ipChange2.ipc$dispatch("81f37d6b", new Object[]{this, rpcResponse});
                }
                UserLoginServiceImpl.getInstance().tokenLoginUT(rpcResponse, loginBaseParam, false);
                return "STOP";
            }
        });
        ((RpcService) ServiceFactory.getService(RpcService.class)).remoteBusiness(buildSimLoginRequest, DefaultLoginResponseData.class, String.valueOf(loginBaseParam.hid), rpcRequestCallback);
    }

    public void finger(final LoginBaseParam loginBaseParam, RpcRequestCallback rpcRequestCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc683292", new Object[]{this, loginBaseParam, rpcRequestCallback});
            return;
        }
        UserLoginServiceImpl.loginRpcEntranceTracker(loginBaseParam);
        RpcRequest rpcRequest = new RpcRequest();
        rpcRequest.API_NAME = ApiConstants.ApiName.BIOMETRIC_LOGIN;
        TokenLoginRequest tokenLoginRequest = new TokenLoginRequest();
        UserLoginServiceImpl.getInstance();
        UserLoginServiceImpl.buildBaseRequest(loginBaseParam, tokenLoginRequest);
        tokenLoginRequest.token = loginBaseParam.token;
        tokenLoginRequest.biometricId = loginBaseParam.biometricId;
        rpcRequest.addParam(ApiConstants.ApiField.TOKEN_INFO, JSON.toJSONString(tokenLoginRequest));
        rpcRequest.addParam("riskControlInfo", JSON.toJSONString(SecurityGuardManagerWraper.buildWSecurityData()));
        rpcRequest.addAfter(new IAfterFilter() { // from class: com.ali.user.mobile.login.LoginDataRepository.7
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.ali.user.mobile.rpc.filter.IAfterFilter
            public String doAfter(RpcResponse rpcResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (String) ipChange2.ipc$dispatch("81f37d6b", new Object[]{this, rpcResponse});
                }
                UserLoginServiceImpl.getInstance().tokenLoginUT(rpcResponse, loginBaseParam, false);
                return "STOP";
            }
        });
        ((RpcService) ServiceFactory.getService(RpcService.class)).remoteBusiness(rpcRequest, DefaultLoginResponseData.class, rpcRequestCallback);
    }

    public void dynamicCodePopup(LoginBaseParam loginBaseParam, RpcRequestCallback rpcRequestCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64dd5ddb", new Object[]{this, loginBaseParam, rpcRequestCallback});
            return;
        }
        RpcRequest rpcRequest = new RpcRequest();
        Map map = loginBaseParam.ext;
        if (map == null) {
            map = new HashMap();
        }
        map.put("apiVersion", "1.0");
        map.put("deviceName", Build.MODEL);
        map.put("sdkTraceId", loginBaseParam.sdkTraceId);
        rpcRequest.API_NAME = ApiConstants.ApiName.API_DYNAMIC_CODE_VERIFY;
        rpcRequest.VERSION = "1.0";
        rpcRequest.NEED_ECODE = true;
        rpcRequest.NEED_SESSION = true;
        rpcRequest.requestSite = loginBaseParam.site;
        TokenLoginRequest tokenLoginRequest = new TokenLoginRequest();
        tokenLoginRequest.token = loginBaseParam.token;
        UserLoginServiceImpl.buildBaseRequest(loginBaseParam, tokenLoginRequest);
        rpcRequest.addParam("ext", JSON.toJSONString(map));
        rpcRequest.addParam("request", JSON.toJSONString(tokenLoginRequest));
        rpcRequest.addParam("riskControlInfo", JSON.toJSONString(SecurityGuardManagerWraper.buildWSecurityData()));
        ((RpcService) ServiceFactory.getService(RpcService.class)).remoteBusiness(rpcRequest, DefaultLoginResponseData.class, String.valueOf(loginBaseParam.hid), rpcRequestCallback);
    }

    public void getOverseaSimVerifyUrl(LoginBaseParam loginBaseParam, RpcRequestCallback rpcRequestCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59705017", new Object[]{this, loginBaseParam, rpcRequestCallback});
        } else {
            requestOverseaSimLogin(ApiConstants.ApiName.API_OVERSEA_GETSIMVERIFYURL, loginBaseParam, null, null, rpcRequestCallback);
        }
    }

    public void overseaSimLogin(LoginBaseParam loginBaseParam, String str, String str2, RpcRequestCallback rpcRequestCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ce5bafa", new Object[]{this, loginBaseParam, str, str2, rpcRequestCallback});
        } else {
            requestOverseaSimLogin(ApiConstants.ApiName.API_OVERSEA_SIM_LOGIN, loginBaseParam, str, str2, rpcRequestCallback);
        }
    }

    private void requestOverseaSimLogin(String str, LoginBaseParam loginBaseParam, String str2, String str3, RpcRequestCallback rpcRequestCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9eee01f", new Object[]{this, str, loginBaseParam, str2, str3, rpcRequestCallback});
            return;
        }
        RpcRequest rpcRequest = new RpcRequest();
        Map map = loginBaseParam.ext;
        if (map == null) {
            map = new HashMap();
        }
        map.put("apiVersion", "1.0");
        map.put("deviceName", Build.MODEL);
        map.put("sdkTraceId", loginBaseParam.sdkTraceId);
        rpcRequest.API_NAME = str;
        rpcRequest.VERSION = "1.0";
        rpcRequest.requestSite = loginBaseParam.site;
        OverseaSimLoginRequest overseaSimLoginRequest = new OverseaSimLoginRequest();
        overseaSimLoginRequest.loginId = loginBaseParam.loginId;
        overseaSimLoginRequest.countryCode = loginBaseParam.countryCode;
        overseaSimLoginRequest.phoneCode = loginBaseParam.phoneCode;
        overseaSimLoginRequest.token = str2;
        overseaSimLoginRequest.payload = str3;
        UserLoginServiceImpl.buildBaseRequest(loginBaseParam, overseaSimLoginRequest);
        UserLoginServiceImpl.addOuterExt(loginBaseParam, map);
        rpcRequest.addParam("ext", JSON.toJSONString(map));
        rpcRequest.addParam(ApiConstants.ApiField.LOGIN_INFO, JSON.toJSONString(overseaSimLoginRequest));
        rpcRequest.addParam("riskControlInfo", JSON.toJSONString(SecurityGuardManagerWraper.buildWSecurityData()));
        ((RpcService) ServiceFactory.getService(RpcService.class)).remoteBusiness(rpcRequest, DefaultLoginResponseData.class, String.valueOf(loginBaseParam.hid), rpcRequestCallback);
    }
}
