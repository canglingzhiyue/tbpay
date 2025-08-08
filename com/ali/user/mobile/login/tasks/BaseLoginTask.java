package com.ali.user.mobile.login.tasks;

import mtopsdk.common.util.StringUtils;
import android.widget.Toast;
import com.ali.user.mobile.app.constant.UTConstant;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.mobile.base.BaseView;
import com.ali.user.mobile.base.UIBaseConstants;
import com.ali.user.mobile.base.helper.LoginDataHelper;
import com.ali.user.mobile.callback.CommonDataCallback;
import com.ali.user.mobile.callback.DataCallback;
import com.ali.user.mobile.callback.LoginTasksCallback;
import com.ali.user.mobile.callback.RpcRequestCallback;
import com.ali.user.mobile.data.LoginComponent;
import com.ali.user.mobile.eventbus.Event;
import com.ali.user.mobile.eventbus.EventBus;
import com.ali.user.mobile.eventbus.EventBusEnum;
import com.ali.user.mobile.eventbus.EventListener;
import com.ali.user.mobile.exception.ErrorCode;
import com.ali.user.mobile.exception.LoginException;
import com.ali.user.mobile.filter.LoginFilterCallback;
import com.ali.user.mobile.log.ApiReferer;
import com.ali.user.mobile.log.AppMonitorAdapter;
import com.ali.user.mobile.log.UserTrackAdapter;
import com.ali.user.mobile.login.LoginDataRepository;
import com.ali.user.mobile.model.LoginBaseParam;
import com.ali.user.mobile.model.TrackingModel;
import com.ali.user.mobile.model.UrlParam;
import com.ali.user.mobile.rpc.ApiConstants;
import com.ali.user.mobile.rpc.HistoryAccount;
import com.ali.user.mobile.rpc.RpcResponse;
import com.ali.user.mobile.rpc.login.model.LoginReturnData;
import com.ali.user.mobile.rpc.login.model.WSecurityData;
import com.ali.user.mobile.security.SecurityGuardManagerWraper;
import com.ali.user.mobile.service.NavigatorService;
import com.ali.user.mobile.service.ServiceFactory;
import com.ali.user.mobile.url.service.impl.UrlUtil;
import com.ali.user.mobile.utils.BackgroundExecutor;
import com.ali.user.mobile.utils.MainThreadExecutor;
import com.ali.user.mobile.utils.ResourceUtil;
import com.ali.user.open.ucc.util.UccConstants;
import com.alibaba.fastjson.JSON;
import com.alibaba.triver.triver_shop.newShop.ext.g;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.sns4android.util.b;
import com.taobao.login4android.constants.LoginConstants;
import com.taobao.login4android.log.LoginTLogAdapter;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes2.dex */
public abstract class BaseLoginTask {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String TAG;
    public WeakReference<BaseView> baseView;
    public LoginBaseParam loginParam;
    public TrackingModel trackingModel;

    public abstract String getLocalLoginType();

    public abstract String getLoginType();

    public abstract void invokeLoginRpc(LoginBaseParam loginBaseParam, RpcRequestCallback<LoginReturnData> rpcRequestCallback);

    public static /* synthetic */ RpcRequestCallback access$000(BaseLoginTask baseLoginTask, LoginBaseParam loginBaseParam, LoginTasksCallback loginTasksCallback) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RpcRequestCallback) ipChange.ipc$dispatch("544c830b", new Object[]{baseLoginTask, loginBaseParam, loginTasksCallback}) : baseLoginTask.createLoginRpcCallback(loginBaseParam, loginTasksCallback);
    }

    static {
        kge.a(1289919502);
        TAG = BaseLoginTask.class.getSimpleName();
    }

    public void login(LoginBaseParam loginBaseParam, TrackingModel trackingModel, BaseView baseView, final LoginTasksCallback<LoginReturnData> loginTasksCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("600518df", new Object[]{this, loginBaseParam, trackingModel, baseView, loginTasksCallback});
            return;
        }
        this.loginParam = loginBaseParam;
        this.trackingModel = trackingModel;
        this.baseView = new WeakReference<>(baseView);
        buildLoginParam(new CommonDataCallback() { // from class: com.ali.user.mobile.login.tasks.BaseLoginTask.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.ali.user.mobile.callback.CommonDataCallback
            public void onSuccess(Map<String, String> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("93e51c7a", new Object[]{this, map});
                    return;
                }
                BaseLoginTask baseLoginTask = BaseLoginTask.this;
                baseLoginTask.startLogin(baseLoginTask.loginParam, loginTasksCallback);
            }

            @Override // com.ali.user.mobile.callback.CommonDataCallback
            public void onFail(int i, String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("efca37e9", new Object[]{this, new Integer(i), str});
                    return;
                }
                LoginTasksCallback loginTasksCallback2 = loginTasksCallback;
                if (loginTasksCallback2 == null) {
                    return;
                }
                if (i == 3007) {
                    loginTasksCallback2.onCancel();
                } else {
                    loginTasksCallback2.onFail(new LoginException(i, str));
                }
            }
        });
    }

    public void buildLoginParam(final CommonDataCallback commonDataCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f4e1e8c", new Object[]{this, commonDataCallback});
        } else {
            MainThreadExecutor.execute(new Runnable() { // from class: com.ali.user.mobile.login.tasks.BaseLoginTask.2
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

    public void buildLoginParamWithCommit(CommonDataCallback commonDataCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9fcab6f", new Object[]{this, commonDataCallback});
        } else {
            buildLoginParamWithCommit(commonDataCallback, true);
        }
    }

    public void buildLoginParamWithCommit(final CommonDataCallback commonDataCallback, final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85997545", new Object[]{this, commonDataCallback, new Boolean(z)});
        } else {
            BackgroundExecutor.execute(new Runnable() { // from class: com.ali.user.mobile.login.tasks.BaseLoginTask.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    if (BaseLoginTask.this.loginParam == null) {
                        BaseLoginTask.this.loginParam = new LoginBaseParam();
                        BaseLoginTask.this.loginParam.site = DataProviderFactory.getDataProvider().getSite();
                    }
                    String str = BaseLoginTask.this.trackingModel == null ? UTConstant.PageName.UT_PAGE_EXTEND : BaseLoginTask.this.trackingModel.pageName;
                    if (BaseLoginTask.this.loginParam.ext == null) {
                        BaseLoginTask.this.loginParam.ext = new HashMap();
                    }
                    BaseLoginTask.this.loginParam.ext.put("apiReferer", ApiReferer.generateApiReferer());
                    BaseLoginTask.this.matchHistoryAccount();
                    BaseLoginTask.this.loginParam.sdkTraceId = BaseLoginTask.this.trackingModel != null ? BaseLoginTask.this.trackingModel.traceId : ApiReferer.generateTraceId(BaseLoginTask.this.getLocalLoginType(), str);
                    BaseLoginTask.this.loginParam.loginSourceType = BaseLoginTask.this.getLocalLoginType();
                    BaseLoginTask.this.loginParam.utPageName = str;
                    BaseLoginTask.this.loginParam.nativeLoginType = BaseLoginTask.this.getLoginType();
                    if (z) {
                        UserTrackAdapter.sendUT(str, UTConstant.CustomEvent.UT_SINGLE_LOGIN_COMMIT, "", BaseLoginTask.this.getLocalLoginType(), LoginComponent.getProperties(BaseLoginTask.this.loginParam));
                    }
                    MainThreadExecutor.execute(new Runnable() { // from class: com.ali.user.mobile.login.tasks.BaseLoginTask.3.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                commonDataCallback.onSuccess(null);
                            }
                        }
                    });
                }
            });
        }
    }

    public void showLoading() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73936486", new Object[]{this});
        } else {
            MainThreadExecutor.execute(new Runnable() { // from class: com.ali.user.mobile.login.tasks.BaseLoginTask.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (BaseLoginTask.this.baseView == null || BaseLoginTask.this.baseView.get() == null) {
                    } else {
                        BaseLoginTask.this.baseView.get().showLoading();
                    }
                }
            });
        }
    }

    public void dismissLoading() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c142d9", new Object[]{this});
        } else {
            MainThreadExecutor.execute(new Runnable() { // from class: com.ali.user.mobile.login.tasks.BaseLoginTask.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (BaseLoginTask.this.baseView == null || BaseLoginTask.this.baseView.get() == null) {
                    } else {
                        BaseLoginTask.this.baseView.get().dismissLoading();
                    }
                }
            });
        }
    }

    public void startLogin(final LoginBaseParam loginBaseParam, final LoginTasksCallback<LoginReturnData> loginTasksCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("964b279", new Object[]{this, loginBaseParam, loginTasksCallback});
            return;
        }
        showLoading();
        SecurityGuardManagerWraper.getWSecurityData(new DataCallback<WSecurityData>() { // from class: com.ali.user.mobile.login.tasks.BaseLoginTask.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.ali.user.mobile.callback.DataCallback
            public void result(WSecurityData wSecurityData) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("50beb2da", new Object[]{this, wSecurityData});
                    return;
                }
                LoginBaseParam loginBaseParam2 = loginBaseParam;
                if (loginBaseParam2 != null) {
                    loginBaseParam2.wua = wSecurityData;
                }
                BaseLoginTask baseLoginTask = BaseLoginTask.this;
                LoginBaseParam loginBaseParam3 = loginBaseParam;
                baseLoginTask.invokeLoginRpc(loginBaseParam3, BaseLoginTask.access$000(baseLoginTask, loginBaseParam3, loginTasksCallback));
                LoginBaseParam loginBaseParam4 = loginBaseParam;
                if (loginBaseParam4 == null) {
                    return;
                }
                loginBaseParam4.wua = null;
            }
        });
    }

    public void invokeTokenLoginRpc(LoginBaseParam loginBaseParam, LoginTasksCallback<LoginReturnData> loginTasksCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db65b6a3", new Object[]{this, loginBaseParam, loginTasksCallback});
            return;
        }
        showLoading();
        LoginDataRepository.getInstance().loginByToken(loginBaseParam, createLoginRpcCallback(loginBaseParam, loginTasksCallback));
    }

    /* loaded from: classes2.dex */
    public class LoginRpcRequestCallback implements RpcRequestCallback<LoginReturnData> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final LoginBaseParam loginParam;
        private final LoginTasksCallback<LoginReturnData> loginResultCallback;

        static {
            kge.a(-23686174);
            kge.a(-862036143);
        }

        public LoginRpcRequestCallback(LoginBaseParam loginBaseParam, LoginTasksCallback<LoginReturnData> loginTasksCallback) {
            this.loginParam = loginBaseParam;
            this.loginResultCallback = loginTasksCallback;
        }

        @Override // com.ali.user.mobile.callback.RpcRequestCallback
        public void onSuccess(RpcResponse<LoginReturnData> rpcResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2811f422", new Object[]{this, rpcResponse});
                return;
            }
            BaseLoginTask.this.dismissLoading();
            BaseLoginTask.this.processLoginResult(this.loginParam, rpcResponse, this.loginResultCallback);
        }

        @Override // com.ali.user.mobile.callback.RpcRequestCallback
        public void onError(RpcResponse<LoginReturnData> rpcResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4b349f7d", new Object[]{this, rpcResponse});
                return;
            }
            BaseLoginTask.this.dismissLoading();
            BaseLoginTask.this.processLoginResult(this.loginParam, rpcResponse, this.loginResultCallback);
        }
    }

    private RpcRequestCallback<LoginReturnData> createLoginRpcCallback(LoginBaseParam loginBaseParam, LoginTasksCallback<LoginReturnData> loginTasksCallback) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RpcRequestCallback) ipChange.ipc$dispatch("cf4899a3", new Object[]{this, loginBaseParam, loginTasksCallback}) : new LoginRpcRequestCallback(loginBaseParam, loginTasksCallback);
    }

    public void processLoginResult(LoginBaseParam loginBaseParam, RpcResponse<LoginReturnData> rpcResponse, LoginTasksCallback<LoginReturnData> loginTasksCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3a173f4", new Object[]{this, loginBaseParam, rpcResponse, loginTasksCallback});
        } else if (rpcResponse != null) {
            String str = rpcResponse.actionType;
            String str2 = TAG;
            LoginTLogAdapter.e(str2, "loginType=" + calLoginType(loginBaseParam) + ", actionType=" + str + ", msg=" + rpcResponse.message);
            if (!StringUtils.isEmpty(str)) {
                if ("SUCCESS".equals(str)) {
                    onReceiveSuccess(loginBaseParam, rpcResponse, loginTasksCallback);
                    return;
                }
                onReceiveNotSuccessActionType(loginBaseParam, rpcResponse);
                if ("H5".equals(str)) {
                    onReceiveH5(loginBaseParam, rpcResponse, loginTasksCallback);
                    return;
                } else if (ApiConstants.ResultActionType.TOAST.equals(str)) {
                    onReceiveToast(loginBaseParam, rpcResponse, loginTasksCallback);
                    return;
                } else if (ApiConstants.ResultActionType.ALERT.equals(str)) {
                    onReceiveAlert(loginBaseParam, rpcResponse, loginTasksCallback);
                    return;
                } else if (ApiConstants.ResultActionType.NOTIFY.equals(str)) {
                    onReceiveNotify(loginBaseParam, rpcResponse, loginTasksCallback);
                    return;
                } else if (ApiConstants.ResultActionType.UCC_H5.equals(str)) {
                    onReceiveUCCH5(loginBaseParam, rpcResponse, loginTasksCallback);
                    return;
                } else if (ApiConstants.ResultActionType.ALERT_WITH_H5.equals(str)) {
                    onReceiveAlertWithH5(loginBaseParam, rpcResponse, loginTasksCallback);
                    return;
                } else if (ApiConstants.ResultActionType.TOKENLOGIN.equals(str)) {
                    onReceiveTokenLogin(loginBaseParam, rpcResponse, loginTasksCallback);
                    return;
                } else {
                    onReceiverOtherError(rpcResponse, loginTasksCallback);
                    return;
                }
            }
            onReceiveNotSuccessActionType(loginBaseParam, rpcResponse);
            onReceiverOtherError(rpcResponse, loginTasksCallback);
        } else {
            onReceiveNotSuccessActionType(loginBaseParam, null);
            onReceiverOtherError(null, loginTasksCallback);
        }
    }

    public void onReceiveSuccess(final LoginBaseParam loginBaseParam, final RpcResponse<LoginReturnData> rpcResponse, final LoginTasksCallback<LoginReturnData> loginTasksCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b5be85c", new Object[]{this, loginBaseParam, rpcResponse, loginTasksCallback});
            return;
        }
        AppMonitorAdapter.commitSuccess("Page_Login", "login");
        if (rpcResponse != null && rpcResponse.returnValue != null && rpcResponse.returnValue.extMap != null && !StringUtils.isEmpty(rpcResponse.returnValue.extMap.get("loginPostUrl"))) {
            ((NavigatorService) ServiceFactory.getService(NavigatorService.class)).navToLoginPostPage(DataProviderFactory.getApplicationContext(), rpcResponse.returnValue.extMap.get("loginPostUrl"), "true".equals(rpcResponse.returnValue.extMap.get(g.KEY_IS_TRANSPARENT)), new LoginFilterCallback() { // from class: com.ali.user.mobile.login.tasks.BaseLoginTask.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.ali.user.mobile.filter.LoginFilterCallback
                public void onSuccess() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d0e393ab", new Object[]{this});
                    } else {
                        BaseLoginTask.this.onSuccessCall(loginBaseParam, rpcResponse, loginTasksCallback);
                    }
                }

                @Override // com.ali.user.mobile.filter.LoginFilterCallback
                public void onFail(int i, Map<String, String> map) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d66999c6", new Object[]{this, new Integer(i), map});
                    } else {
                        BaseLoginTask.this.onSuccessCall(loginBaseParam, rpcResponse, loginTasksCallback);
                    }
                }
            });
        } else {
            onSuccessCall(loginBaseParam, rpcResponse, loginTasksCallback);
        }
    }

    public void onSuccessCall(LoginBaseParam loginBaseParam, RpcResponse<LoginReturnData> rpcResponse, LoginTasksCallback<LoginReturnData> loginTasksCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd68451f", new Object[]{this, loginBaseParam, rpcResponse, loginTasksCallback});
            return;
        }
        processLoginSessionData(loginBaseParam, rpcResponse);
        if (loginTasksCallback == null) {
            return;
        }
        showToast(rpcResponse, ApiConstants.ApiField.SMS_LOGIN_REMIND_TIPS);
        loginTasksCallback.onSuccess(rpcResponse);
    }

    public void processLoginSessionData(LoginBaseParam loginBaseParam, RpcResponse<LoginReturnData> rpcResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a33ec532", new Object[]{this, loginBaseParam, rpcResponse});
            return;
        }
        LoginReturnData loginReturnData = rpcResponse.returnValue;
        if (loginReturnData == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(LoginConstants.LOGIN_TYPE, calLoginType(loginBaseParam));
        LoginDataHelper.processLoginReturnData(true, loginReturnData, loginBaseParam, hashMap);
    }

    private String calLoginType(LoginBaseParam loginBaseParam) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4619b636", new Object[]{this, loginBaseParam});
        }
        String loginType = getLoginType();
        if (StringUtils.isEmpty(loginType) && loginBaseParam != null && !StringUtils.isEmpty(loginBaseParam.snsType)) {
            loginType = b.a(loginBaseParam.snsType);
        }
        return (!StringUtils.isEmpty(loginType) || loginBaseParam == null || StringUtils.isEmpty(loginBaseParam.nativeLoginType)) ? loginType : loginBaseParam.nativeLoginType;
    }

    public void onReceiveNotSuccessActionType(LoginBaseParam loginBaseParam, RpcResponse<LoginReturnData> rpcResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9fd4eb4", new Object[]{this, loginBaseParam, rpcResponse});
        } else if (rpcResponse == null) {
        } else {
            AppMonitorAdapter.commitFail("Page_Login", "login", String.valueOf(rpcResponse.code), rpcResponse.message == null ? "" : rpcResponse.message);
        }
    }

    public void onReceiveH5(LoginBaseParam loginBaseParam, RpcResponse<LoginReturnData> rpcResponse, LoginTasksCallback<LoginReturnData> loginTasksCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7bc23ee", new Object[]{this, loginBaseParam, rpcResponse, loginTasksCallback});
            return;
        }
        LoginReturnData loginReturnData = rpcResponse.returnValue;
        if (loginReturnData != null && !StringUtils.isEmpty(loginReturnData.h5Url)) {
            showToast(rpcResponse, ApiConstants.ApiField.SMS_LOGIN_REMIND_TIPS);
            navToWebViewPage(loginBaseParam, rpcResponse, loginTasksCallback);
        } else if (loginTasksCallback == null) {
        } else {
            loginTasksCallback.onFail(new LoginException<>(ErrorCode.SERVER_DATA_ERROR, rpcResponse.message == null ? ResourceUtil.getNetworkError() : rpcResponse.message, rpcResponse));
        }
    }

    public void onReceiveTokenLogin(final LoginBaseParam loginBaseParam, RpcResponse<LoginReturnData> rpcResponse, final LoginTasksCallback<LoginReturnData> loginTasksCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53375291", new Object[]{this, loginBaseParam, rpcResponse, loginTasksCallback});
            return;
        }
        LoginReturnData loginReturnData = rpcResponse.returnValue;
        long j = 1000;
        if (loginReturnData.extMap == null || StringUtils.isEmpty(loginReturnData.extMap.get("syncWaitTime"))) {
            return;
        }
        try {
            j = Long.parseLong(loginReturnData.extMap.get("syncWaitTime"));
        } catch (Throwable th) {
            th.printStackTrace();
        }
        loginBaseParam.token = loginReturnData.token;
        loginBaseParam.scene = loginReturnData.scene;
        MainThreadExecutor.postDelayed(new Runnable() { // from class: com.ali.user.mobile.login.tasks.BaseLoginTask.8
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    BaseLoginTask.this.invokeTokenLoginRpc(loginBaseParam, loginTasksCallback);
                }
            }
        }, j);
    }

    public void navToWebViewPage(LoginBaseParam loginBaseParam, final RpcResponse<LoginReturnData> rpcResponse, final LoginTasksCallback<LoginReturnData> loginTasksCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e5ffbe7", new Object[]{this, loginBaseParam, rpcResponse, loginTasksCallback});
            return;
        }
        LoginReturnData loginReturnData = rpcResponse.returnValue;
        EventBus.getDefault().registerEventListener(EventBusEnum.EventName.ACTION_H5, new EventListener() { // from class: com.ali.user.mobile.login.tasks.BaseLoginTask.9
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.ali.user.mobile.eventbus.EventListener
            public void onEvent(Event event) {
                LoginTasksCallback loginTasksCallback2;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("91b32698", new Object[]{this, event});
                    return;
                }
                EventBus.getDefault().unregisterEventListener(EventBusEnum.EventName.ACTION_H5, this);
                if (event == null || event.params == null) {
                    LoginTasksCallback loginTasksCallback3 = loginTasksCallback;
                    if (loginTasksCallback3 == null) {
                        return;
                    }
                    loginTasksCallback3.onFail(new LoginException(605, rpcResponse.message == null ? ResourceUtil.getNetworkError() : rpcResponse.message, rpcResponse));
                    return;
                }
                String str = (String) event.params.get(UIBaseConstants.IntentExtrasNamesConstants.PARAM_LOGIN_PARAM);
                String str2 = (String) event.params.get("result");
                if (!StringUtils.isEmpty(str) && StringUtils.equals(str2, "success")) {
                    LoginBaseParam loginBaseParam2 = (LoginBaseParam) JSON.parseObject(str, LoginBaseParam.class);
                    if (loginBaseParam2 == null) {
                        loginBaseParam2 = new LoginBaseParam();
                    }
                    BaseLoginTask.this.invokeTokenLoginRpc(loginBaseParam2, loginTasksCallback);
                } else if (StringUtils.equals(str2, "cancel") && (loginTasksCallback2 = loginTasksCallback) != null) {
                    loginTasksCallback2.onCancel();
                } else {
                    LoginTasksCallback loginTasksCallback4 = loginTasksCallback;
                    if (loginTasksCallback4 == null) {
                        return;
                    }
                    loginTasksCallback4.onFail(new LoginException(604, rpcResponse.message == null ? ResourceUtil.getNetworkError() : rpcResponse.message, rpcResponse));
                }
            }
        });
        if (loginBaseParam == null) {
            loginBaseParam = new LoginBaseParam();
        }
        loginBaseParam.scene = loginReturnData.scene;
        loginBaseParam.token = loginReturnData.token;
        loginBaseParam.site = loginReturnData.site;
        loginBaseParam.h5QueryString = null;
        if (loginReturnData.extMap != null) {
            if (loginBaseParam.ext == null) {
                loginBaseParam.ext = loginReturnData.extMap;
            } else {
                loginBaseParam.ext = new HashMap();
                for (Map.Entry<String, String> entry : loginReturnData.extMap.entrySet()) {
                    loginBaseParam.ext.put(entry.getKey(), entry.getValue());
                }
            }
        }
        UrlParam urlParam = new UrlParam();
        urlParam.url = loginReturnData.h5Url;
        urlParam.token = loginReturnData.token;
        urlParam.scene = loginReturnData.scene;
        urlParam.loginId = loginReturnData.showLoginId;
        urlParam.loginParam = loginBaseParam;
        ((NavigatorService) ServiceFactory.getService(NavigatorService.class)).navToWebViewPage(EventBusEnum.EventName.ACTION_H5, urlParam);
    }

    public void onReceiveUCCH5(final LoginBaseParam loginBaseParam, RpcResponse<LoginReturnData> rpcResponse, final LoginTasksCallback<LoginReturnData> loginTasksCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc2adf1b", new Object[]{this, loginBaseParam, rpcResponse, loginTasksCallback});
            return;
        }
        String str = rpcResponse.returnValue.h5Url;
        UrlParam urlParam = new UrlParam();
        urlParam.url = str;
        urlParam.loginType = calLoginType(loginBaseParam);
        if (rpcResponse != null && rpcResponse.returnValue != null) {
            urlParam.token = rpcResponse.returnValue.token;
            urlParam.scene = rpcResponse.returnValue.scene;
        }
        urlParam.loginParam = loginBaseParam;
        UrlUtil.OpenUCC(DataProviderFactory.getApplicationContext(), urlParam, new CommonDataCallback() { // from class: com.ali.user.mobile.login.tasks.BaseLoginTask.10
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v5, types: [com.ali.user.mobile.rpc.login.model.LoginReturnData, T] */
            @Override // com.ali.user.mobile.callback.CommonDataCallback
            public void onSuccess(Map<String, String> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("93e51c7a", new Object[]{this, map});
                } else if (map != null && !StringUtils.isEmpty(map.get(UccConstants.PARAM_LOGIN_DATA))) {
                    RpcResponse<LoginReturnData> rpcResponse2 = new RpcResponse<>();
                    rpcResponse2.returnValue = (LoginReturnData) JSON.parseObject(map.get(UccConstants.PARAM_LOGIN_DATA), LoginReturnData.class);
                    rpcResponse2.actionType = "SUCCESS";
                    BaseLoginTask.this.onReceiveSuccess(loginBaseParam, rpcResponse2, loginTasksCallback);
                } else {
                    LoginTasksCallback loginTasksCallback2 = loginTasksCallback;
                    if (loginTasksCallback2 == null) {
                        return;
                    }
                    loginTasksCallback2.onCancel();
                }
            }

            @Override // com.ali.user.mobile.callback.CommonDataCallback
            public void onFail(int i, String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("efca37e9", new Object[]{this, new Integer(i), str2});
                    return;
                }
                LoginTasksCallback loginTasksCallback2 = loginTasksCallback;
                if (loginTasksCallback2 == null) {
                    return;
                }
                loginTasksCallback2.onCancel();
            }
        });
    }

    public void onReceiverOtherError(RpcResponse<LoginReturnData> rpcResponse, LoginTasksCallback<LoginReturnData> loginTasksCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8574615", new Object[]{this, rpcResponse, loginTasksCallback});
        } else if (loginTasksCallback == null) {
        } else {
            loginTasksCallback.onFail(new LoginException<>(rpcResponse == null ? 1100 : rpcResponse.code, rpcResponse == null ? ResourceUtil.getNetworkError() : rpcResponse.message, rpcResponse));
        }
    }

    public void onReceiveAlertWithH5(LoginBaseParam loginBaseParam, RpcResponse<LoginReturnData> rpcResponse, LoginTasksCallback<LoginReturnData> loginTasksCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a6b4508", new Object[]{this, loginBaseParam, rpcResponse, loginTasksCallback});
        } else if (loginTasksCallback == null) {
        } else {
            loginTasksCallback.onFail(new LoginException<>(1000, rpcResponse == null ? ResourceUtil.getNetworkError() : rpcResponse.message, rpcResponse));
        }
    }

    public void onReceiveNotify(LoginBaseParam loginBaseParam, RpcResponse<LoginReturnData> rpcResponse, LoginTasksCallback<LoginReturnData> loginTasksCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c02b1e6a", new Object[]{this, loginBaseParam, rpcResponse, loginTasksCallback});
        } else if (loginTasksCallback == null) {
        } else {
            loginTasksCallback.onFail(new LoginException<>(900, rpcResponse == null ? ResourceUtil.getNetworkError() : rpcResponse.message, rpcResponse));
        }
    }

    public void onReceiveToast(LoginBaseParam loginBaseParam, RpcResponse<LoginReturnData> rpcResponse, LoginTasksCallback<LoginReturnData> loginTasksCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1281f380", new Object[]{this, loginBaseParam, rpcResponse, loginTasksCallback});
        } else if (loginTasksCallback == null) {
        } else {
            loginTasksCallback.onFail(new LoginException<>(800, rpcResponse == null ? ResourceUtil.getNetworkError() : rpcResponse.message, rpcResponse));
        }
    }

    public void onReceiveAlert(LoginBaseParam loginBaseParam, RpcResponse<LoginReturnData> rpcResponse, LoginTasksCallback<LoginReturnData> loginTasksCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cadf435", new Object[]{this, loginBaseParam, rpcResponse, loginTasksCallback});
        } else if (loginTasksCallback == null) {
        } else {
            loginTasksCallback.onFail(new LoginException<>(700, rpcResponse == null ? ResourceUtil.getNetworkError() : rpcResponse.message, rpcResponse));
        }
    }

    public void matchHistoryAccount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fff9da5", new Object[]{this});
            return;
        }
        LoginBaseParam loginBaseParam = this.loginParam;
        if (loginBaseParam == null || !loginBaseParam.isFromAccount) {
            return;
        }
        HistoryAccount historyAccount = null;
        if (this.loginParam.hid != 0) {
            historyAccount = SecurityGuardManagerWraper.findHistoryAccount(this.loginParam.hid);
        }
        if (historyAccount == null) {
            return;
        }
        this.loginParam.deviceTokenKey = historyAccount.tokenKey;
        this.loginParam.hid = historyAccount.userId;
        this.loginParam.isFromAccount = true;
    }

    private void showToast(RpcResponse<LoginReturnData> rpcResponse, String str) {
        LoginReturnData loginReturnData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a58fda6", new Object[]{this, rpcResponse, str});
        } else if (rpcResponse == null || (loginReturnData = rpcResponse.returnValue) == null || loginReturnData.extMap == null || !loginReturnData.extMap.containsKey(str)) {
        } else {
            Toast.makeText(DataProviderFactory.getApplicationContext(), loginReturnData.extMap.get(str), 0).show();
        }
    }
}
