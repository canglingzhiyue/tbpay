package com.ali.user.mobile.login;

import android.content.Context;
import android.text.TextUtils;
import com.ali.user.mobile.app.constant.UTConstant;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.mobile.base.helper.LoginDataHelper;
import com.ali.user.mobile.callback.CommonDataCallback;
import com.ali.user.mobile.callback.LoginTasksCallback;
import com.ali.user.mobile.callback.RpcRequestCallback;
import com.ali.user.mobile.exception.LoginException;
import com.ali.user.mobile.log.ApiReferer;
import com.ali.user.mobile.login.action.LoginResActions;
import com.ali.user.mobile.model.CommonCallback;
import com.ali.user.mobile.model.LoginParam;
import com.ali.user.mobile.model.LoginType;
import com.ali.user.mobile.model.NumAuthTokenCallback;
import com.ali.user.mobile.model.TokenType;
import com.ali.user.mobile.model.TrackingModel;
import com.ali.user.mobile.model.UrlParam;
import com.ali.user.mobile.rpc.ApiConstants;
import com.ali.user.mobile.rpc.RpcResponse;
import com.ali.user.mobile.rpc.login.model.DefaultLoginResponseData;
import com.ali.user.mobile.rpc.login.model.LoginReturnData;
import com.ali.user.mobile.service.LoginService;
import com.ali.user.mobile.service.NumberAuthService;
import com.ali.user.mobile.service.ServiceFactory;
import com.ali.user.mobile.url.service.impl.UrlUtil;
import com.ali.user.mobile.utils.ResourceUtil;
import com.ali.user.open.ucc.util.UccConstants;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.config.LoginSwitch;
import com.taobao.login4android.constants.LoginStatus;
import java.util.Map;
import tb.kge;

/* loaded from: classes2.dex */
public class LoginServiceImpl implements LoginService {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final int ONEKEY_LOGIN_FAIL_CODE_LOGIN_DATA_NULL = -1;
    private final int ONEKEY_LOGIN_FAIL_CODE_RESPONSE_NULL = -2;
    private final int ONEKEY_LOGIN_FAIL_CODE_NEED_IV = -3;
    private final int ONEKEY_LOGIN_FAIL_CANCEL = -4;
    private final int ONEKEY_LOGIN_FAIL_SERVICE_NULL = -5;

    static {
        kge.a(-1612374918);
        kge.a(1619635566);
    }

    private String getPageName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("707fddc9", new Object[]{this}) : UTConstant.PageName.UT_PAGE_EXTEND;
    }

    @Override // com.ali.user.mobile.service.LoginService
    public void touristLogin(String str, LoginParam loginParam) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3490b245", new Object[]{this, str, loginParam});
        }
    }

    public static /* synthetic */ void access$000(LoginServiceImpl loginServiceImpl, Context context, LoginParam loginParam, Map map, CommonCallback commonCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1470b8dd", new Object[]{loginServiceImpl, context, loginParam, map, commonCallback});
        } else {
            loginServiceImpl.simLogin(context, loginParam, map, commonCallback);
        }
    }

    public static /* synthetic */ void access$100(LoginServiceImpl loginServiceImpl, Context context, LoginParam loginParam, RpcResponse rpcResponse, CommonCallback commonCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("feb38506", new Object[]{loginServiceImpl, context, loginParam, rpcResponse, commonCallback});
        } else {
            loginServiceImpl.onReceiveUCCH5(context, loginParam, rpcResponse, commonCallback);
        }
    }

    @Override // com.ali.user.mobile.service.LoginService
    public void onekeyLogin(final Context context, final Map<String, String> map, final CommonCallback commonCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19acb8e5", new Object[]{this, context, map, commonCallback});
        } else if (commonCallback == null) {
        } else {
            if (LoginSwitch.getSwitch("rollback_onekeyLogin", "false")) {
                if (ServiceFactory.getService(NumberAuthService.class) != null) {
                    ((NumberAuthService) ServiceFactory.getService(NumberAuthService.class)).getLoginToken("openLoginView", new NumAuthTokenCallback() { // from class: com.ali.user.mobile.login.LoginServiceImpl.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.ali.user.mobile.model.NumAuthTokenCallback
                        public void onGetAuthTokenSuccess(String str) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("20cbbe7a", new Object[]{this, str});
                                return;
                            }
                            LoginParam loginParam = new LoginParam();
                            loginParam.token = str;
                            loginParam.tokenType = TokenType.NUMBER;
                            loginParam.site = DataProviderFactory.getDataProvider().getSite();
                            LoginServiceImpl.access$000(LoginServiceImpl.this, context, loginParam, map, commonCallback);
                        }

                        @Override // com.ali.user.mobile.model.NumAuthTokenCallback
                        public void onGetAuthTokenFail(int i, String str) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("27f95aee", new Object[]{this, new Integer(i), str});
                                return;
                            }
                            CommonCallback commonCallback2 = commonCallback;
                            if (commonCallback2 == null) {
                                return;
                            }
                            commonCallback2.onFail(i, str);
                        }
                    });
                    return;
                } else {
                    commonCallback.onFail(-5, ResourceUtil.getNetworkError());
                    return;
                }
            }
            LoginParam loginParam = new LoginParam();
            loginParam.sdkTraceId = ApiReferer.generateTraceId(LoginType.LocalLoginType.SIM_LOGIN, getPageName());
            loginParam.loginSourceType = LoginType.LocalLoginType.SIM_LOGIN;
            loginParam.utPageName = getPageName();
            TrackingModel trackingModel = new TrackingModel();
            trackingModel.pageName = getPageName();
            trackingModel.loginType = LoginType.LocalLoginType.SIM_LOGIN;
            trackingModel.traceId = ApiReferer.generateTraceId(trackingModel.loginType, trackingModel.pageName);
            LoginApi.simLogin(loginParam, trackingModel, null, new LoginTasksCallback<LoginReturnData>() { // from class: com.ali.user.mobile.login.LoginServiceImpl.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.ali.user.mobile.callback.LoginTasksCallback
                public void onSuccess(RpcResponse<LoginReturnData> rpcResponse) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("2811f422", new Object[]{this, rpcResponse});
                    } else {
                        commonCallback.onSuccess();
                    }
                }

                @Override // com.ali.user.mobile.callback.LoginTasksCallback
                public void onFail(LoginException<LoginReturnData> loginException) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("77abaa65", new Object[]{this, loginException});
                    } else {
                        commonCallback.onFail(-1, ResourceUtil.getNetworkError());
                    }
                }

                @Override // com.ali.user.mobile.callback.LoginTasksCallback
                public void onCancel() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("379d4540", new Object[]{this});
                    } else {
                        commonCallback.onFail(-4, ResourceUtil.getNetworkError());
                    }
                }
            });
        }
    }

    private void simLogin(final Context context, final LoginParam loginParam, Map<String, String> map, final CommonCallback commonCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a27eefca", new Object[]{this, context, loginParam, map, commonCallback});
        } else {
            LoginDataRepository.getInstance().simLogin(loginParam, map, new RpcRequestCallback() { // from class: com.ali.user.mobile.login.LoginServiceImpl.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.ali.user.mobile.callback.RpcRequestCallback
                public void onSuccess(RpcResponse rpcResponse) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("2811f422", new Object[]{this, rpcResponse});
                    } else if (rpcResponse != null) {
                        String str = rpcResponse.actionType;
                        if (!TextUtils.isEmpty(str)) {
                            if ("SUCCESS".equals(str)) {
                                LoginReturnData loginReturnData = (LoginReturnData) ((DefaultLoginResponseData) rpcResponse).returnValue;
                                if (loginReturnData != null) {
                                    LoginDataHelper.processLoginReturnData(true, loginReturnData);
                                    CommonCallback commonCallback2 = commonCallback;
                                    if (commonCallback2 == null) {
                                        return;
                                    }
                                    commonCallback2.onSuccess();
                                    return;
                                }
                                CommonCallback commonCallback3 = commonCallback;
                                if (commonCallback3 == null) {
                                    return;
                                }
                                commonCallback3.onFail(-1, "login data is null");
                                return;
                            }
                            CommonCallback commonCallback4 = commonCallback;
                            if (commonCallback4 == null) {
                                return;
                            }
                            commonCallback4.onFail(rpcResponse.code, rpcResponse.message);
                            return;
                        }
                        CommonCallback commonCallback5 = commonCallback;
                        if (commonCallback5 == null) {
                            return;
                        }
                        commonCallback5.onFail(rpcResponse.code, rpcResponse.message);
                    } else {
                        CommonCallback commonCallback6 = commonCallback;
                        if (commonCallback6 == null) {
                            return;
                        }
                        commonCallback6.onFail(-2, "response is null");
                    }
                }

                @Override // com.ali.user.mobile.callback.RpcRequestCallback
                public void onError(RpcResponse rpcResponse) {
                    CommonCallback commonCallback2;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("4b349f7d", new Object[]{this, rpcResponse});
                        return;
                    }
                    if (rpcResponse != null) {
                        String str = rpcResponse.actionType;
                        if (!TextUtils.isEmpty(str) && "H5".equals(str)) {
                            if (TextUtils.isEmpty(((LoginReturnData) ((DefaultLoginResponseData) rpcResponse).returnValue).h5Url) || (commonCallback2 = commonCallback) == null) {
                                return;
                            }
                            commonCallback2.onFail(-3, "need iv");
                            return;
                        } else if (ApiConstants.ResultActionType.UCC_H5.equals(str)) {
                            LoginServiceImpl.access$100(LoginServiceImpl.this, context, loginParam, rpcResponse, commonCallback);
                        }
                    }
                    CommonCallback commonCallback3 = commonCallback;
                    if (commonCallback3 == null) {
                        return;
                    }
                    commonCallback3.onFail(rpcResponse == null ? -2 : rpcResponse.code, rpcResponse == null ? "response is null" : rpcResponse.message);
                }
            });
        }
    }

    private void onReceiveUCCH5(Context context, LoginParam loginParam, RpcResponse<LoginReturnData> rpcResponse, final CommonCallback commonCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f60dddfe", new Object[]{this, context, loginParam, rpcResponse, commonCallback});
            return;
        }
        String str = rpcResponse.returnValue.h5Url;
        UrlParam urlParam = new UrlParam();
        urlParam.url = str;
        urlParam.loginType = loginParam.nativeLoginType;
        urlParam.loginParam = loginParam;
        UrlUtil.OpenUCC(context, urlParam, new CommonDataCallback() { // from class: com.ali.user.mobile.login.LoginServiceImpl.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r5v6, types: [com.ali.user.mobile.rpc.login.model.LoginReturnData, T] */
            @Override // com.ali.user.mobile.callback.CommonDataCallback
            public void onSuccess(Map<String, String> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("93e51c7a", new Object[]{this, map});
                    return;
                }
                LoginStatus.resetLoginFlag();
                if (map != null) {
                    String str2 = map.get(UccConstants.PARAM_LOGIN_DATA);
                    if (!TextUtils.isEmpty(str2)) {
                        ?? r5 = (LoginReturnData) JSON.parseObject(str2, LoginReturnData.class);
                        RpcResponse rpcResponse2 = new RpcResponse();
                        rpcResponse2.returnValue = r5;
                        rpcResponse2.actionType = "SUCCESS";
                        LoginDataHelper.processLoginReturnData(true, r5);
                        CommonCallback commonCallback2 = commonCallback;
                        if (commonCallback2 == null) {
                            return;
                        }
                        commonCallback2.onSuccess();
                        return;
                    }
                    CommonCallback commonCallback3 = commonCallback;
                    if (commonCallback3 == null) {
                        return;
                    }
                    commonCallback3.onFail(LoginResActions.LoginFailCode.UCC_LOGIN_EXCEPTION, "");
                    return;
                }
                CommonCallback commonCallback4 = commonCallback;
                if (commonCallback4 == null) {
                    return;
                }
                commonCallback4.onFail(LoginResActions.LoginFailCode.UCC_LOGIN_EXCEPTION, "");
            }

            @Override // com.ali.user.mobile.callback.CommonDataCallback
            public void onFail(int i, String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("efca37e9", new Object[]{this, new Integer(i), str2});
                    return;
                }
                LoginStatus.resetLoginFlag();
                CommonCallback commonCallback2 = commonCallback;
                if (commonCallback2 == null) {
                    return;
                }
                commonCallback2.onFail(i, str2);
            }
        });
    }
}
