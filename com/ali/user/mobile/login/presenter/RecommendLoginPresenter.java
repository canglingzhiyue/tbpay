package com.ali.user.mobile.login.presenter;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.mobile.callback.RpcRequestCallback;
import com.ali.user.mobile.info.AppInfo;
import com.ali.user.mobile.log.UserTrackAdapter;
import com.ali.user.mobile.login.model.AppLaunchInfoResponseData;
import com.ali.user.mobile.login.service.impl.UserLoginServiceImpl;
import com.ali.user.mobile.login.ui.BaseLoginView;
import com.ali.user.mobile.login.ui.LoginModeState;
import com.ali.user.mobile.login.ui.RecommendLoginView;
import com.ali.user.mobile.login.ui.UserLoginActivity;
import com.ali.user.mobile.model.DeviceTokenSignParam;
import com.ali.user.mobile.model.LoginParam;
import com.ali.user.mobile.model.LoginType;
import com.ali.user.mobile.register.ui.oversea.AliEmailFragment;
import com.ali.user.mobile.rpc.ApiConstants;
import com.ali.user.mobile.rpc.HistoryAccount;
import com.ali.user.mobile.rpc.RpcRequest;
import com.ali.user.mobile.rpc.RpcResponse;
import com.ali.user.mobile.security.AlibabaSecurityTokenService;
import com.ali.user.mobile.service.NumberAuthService;
import com.ali.user.mobile.service.RpcService;
import com.ali.user.mobile.service.ServiceFactory;
import com.ali.user.mobile.utils.NetworkUtil;
import com.ali.user.mobile.utils.ResourceUtil;
import com.ali.user.mobile.utils.ScreenUtil;
import com.ali.user.mobile.utils.SharedPreferencesUtil;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.config.LoginSwitch;
import com.taobao.login4android.session.SessionManager;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes2.dex */
public class RecommendLoginPresenter extends BaseLoginPresenter {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String TAG;

    public static /* synthetic */ Object ipc$super(RecommendLoginPresenter recommendLoginPresenter, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void access$000(RecommendLoginPresenter recommendLoginPresenter, RpcResponse rpcResponse, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e00d9d3", new Object[]{recommendLoginPresenter, rpcResponse, str});
        } else {
            recommendLoginPresenter.onGetLoginFlowError(rpcResponse, str);
        }
    }

    static {
        kge.a(-1759541434);
        TAG = "login." + RecommendLoginPresenter.class.getSimpleName();
    }

    public RecommendLoginPresenter(BaseLoginView baseLoginView, LoginParam loginParam) {
        super(baseLoginView, loginParam);
    }

    public void getLoginFlow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fef7d588", new Object[]{this});
        } else if (this.mViewer == null || !this.mViewer.isActive()) {
        } else {
            this.mViewer.showLoading();
            getLoginFlowRequest(this.mLoginParam, new RpcRequestCallback() { // from class: com.ali.user.mobile.login.presenter.RecommendLoginPresenter.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Can't wrap try/catch for region: R(12:17|(2:83|(1:88)(10:87|22|(3:26|(3:28|(2:30|31)(1:33)|32)|34)|(3:79|80|(1:82))|(1:39)|44|45|46|47|(2:49|50)(2:51|(2:53|54)(2:55|(2:57|58)(2:59|(2:61|62)(2:63|(2:65|66)(2:67|(2:69|70)(2:71|(2:73|74)(2:75|76)))))))))|21|22|(4:24|26|(0)|34)|(0)|(2:37|39)|44|45|46|47|(0)(0)) */
                /* JADX WARN: Removed duplicated region for block: B:36:0x00bd  */
                /* JADX WARN: Removed duplicated region for block: B:56:0x0136  */
                /* JADX WARN: Removed duplicated region for block: B:57:0x0141  */
                /* JADX WARN: Removed duplicated region for block: B:82:0x00cf A[EXC_TOP_SPLITTER, SYNTHETIC] */
                @Override // com.ali.user.mobile.callback.RpcRequestCallback
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public void onSuccess(com.ali.user.mobile.rpc.RpcResponse r11) {
                    /*
                        Method dump skipped, instructions count: 462
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.ali.user.mobile.login.presenter.RecommendLoginPresenter.AnonymousClass1.onSuccess(com.ali.user.mobile.rpc.RpcResponse):void");
                }

                @Override // com.ali.user.mobile.callback.RpcRequestCallback
                public void onError(RpcResponse rpcResponse) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("4b349f7d", new Object[]{this, rpcResponse});
                        return;
                    }
                    RecommendLoginPresenter.this.mViewer.dismissLoading();
                    if (rpcResponse != null && StringUtils.equals(rpcResponse.actionType, ApiConstants.ResultActionType.FORCE_TOAST)) {
                        RecommendLoginPresenter.this.mViewer.toast(rpcResponse.message, 1);
                    } else if (rpcResponse != null && "mobileNeedCheck".equals(rpcResponse.codeGroup) && ApiConstants.ResultActionType.TOAST.equals(rpcResponse.actionType)) {
                        ((RecommendLoginView) RecommendLoginPresenter.this.mViewer).onNeedAlert(RecommendLoginPresenter.this.mLoginParam, rpcResponse);
                    } else if (rpcResponse != null && "guideH5".equals(rpcResponse.codeGroup)) {
                        ((RecommendLoginView) RecommendLoginPresenter.this.mViewer).onGuideH5(RecommendLoginPresenter.this.mLoginParam, rpcResponse);
                    } else {
                        RecommendLoginPresenter recommendLoginPresenter = RecommendLoginPresenter.this;
                        RecommendLoginPresenter.access$000(recommendLoginPresenter, rpcResponse, recommendLoginPresenter.mLoginParam == null ? "" : RecommendLoginPresenter.this.mLoginParam.loginId);
                    }
                }
            });
        }
    }

    public boolean checkAvailable(LoginFlowReturnData loginFlowReturnData, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1ff475eb", new Object[]{this, loginFlowReturnData, str})).booleanValue();
        }
        if (StringUtils.isEmpty(str) || loginFlowReturnData == null) {
            return false;
        }
        if (!StringUtils.equals(str, LoginModeState.SIM_LOGIN.name())) {
            return true;
        }
        String maskMobile = UserLoginActivity.getMaskMobile();
        if (!StringUtils.isEmpty(maskMobile)) {
            if (StringUtils.isEmpty(loginFlowReturnData.countryCode)) {
                return true;
            }
            if ("CN".equals(loginFlowReturnData.countryCode) && UserLoginActivity.isCompareSuccess(loginFlowReturnData.loginId, maskMobile)) {
                return true;
            }
        }
        return false;
    }

    public void onFlowLimitLocked(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("117ae149", new Object[]{this, str});
        } else {
            ((RecommendLoginView) this.mViewer).onFlowLimitLocked(str);
        }
    }

    private void onGetLoginFlowError(RpcResponse rpcResponse, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4487b328", new Object[]{this, rpcResponse, str});
        } else if (this.mViewer == null || !this.mViewer.isActive()) {
        } else {
            this.mViewer.dismissLoading();
            if (rpcResponse != null && rpcResponse.code != 3004 && !(this.mViewer instanceof AliEmailFragment)) {
                onFlowLimitLocked(str);
                return;
            }
            String str2 = rpcResponse != null ? rpcResponse.message : "";
            if (StringUtils.isEmpty(str2)) {
                str2 = ResourceUtil.getNetworkError();
            }
            this.mViewer.toast(str2, 0);
        }
    }

    public static AppLaunchInfoResponseData fireAppLaunchRequest(LoginParam loginParam, HistoryAccount historyAccount) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AppLaunchInfoResponseData) ipChange.ipc$dispatch("f247f411", new Object[]{loginParam, historyAccount});
        }
        RpcRequest rpcRequest = new RpcRequest();
        rpcRequest.API_NAME = ApiConstants.ApiName.API_CALLED_BEFORE_LOGIN_PAGE;
        rpcRequest.VERSION = "1.0";
        rpcRequest.timeoutMilliSecond = 1000;
        AppLaunchRequest appLaunchRequest = new AppLaunchRequest();
        buildLoginFlowRequest(loginParam, appLaunchRequest);
        appLaunchRequest.deviceLevel = loginParam.deviceLevel;
        appLaunchRequest.token = loginParam.token;
        appLaunchRequest.pad = ScreenUtil.isPad(DataProviderFactory.getApplicationContext());
        UserTrackAdapter.sendExtendUT("client_pad", String.valueOf(appLaunchRequest.pad));
        appLaunchRequest.ext = new HashMap();
        appLaunchRequest.ext.put("lastLoginType", getLastLoginType());
        appLaunchRequest.ext.put("expandRecommendPage", "true");
        if (!StringUtils.isEmpty(loginParam.scene)) {
            appLaunchRequest.ext.put("scene", loginParam.scene);
        }
        if (historyAccount != null) {
            appLaunchRequest.deviceTokenKey = historyAccount.tokenKey;
            appLaunchRequest.hid = String.valueOf(historyAccount.userId);
            DeviceTokenSignParam deviceTokenSignParam = new DeviceTokenSignParam();
            if (!StringUtils.isEmpty(DataProviderFactory.getDataProvider().getAppkey())) {
                deviceTokenSignParam.addAppKey(DataProviderFactory.getDataProvider().getAppkey());
            }
            deviceTokenSignParam.addAppVersion(AppInfo.getInstance().getAndroidAppVersion());
            deviceTokenSignParam.addHavanaId(String.valueOf(historyAccount.userId));
            deviceTokenSignParam.addTimestamp(String.valueOf(appLaunchRequest.t));
            deviceTokenSignParam.addSDKVersion(AppInfo.getInstance().getSdkVersion());
            if (!StringUtils.isEmpty(historyAccount.tokenKey)) {
                appLaunchRequest.deviceTokenSign = AlibabaSecurityTokenService.sign(historyAccount.tokenKey, deviceTokenSignParam.build());
            }
        } else {
            appLaunchRequest.firstLogin = true;
        }
        appLaunchRequest.alipayInstalled = loginParam.alipayInstalled;
        appLaunchRequest.onceLogined = !StringUtils.isEmpty(SessionManager.getInstance(DataProviderFactory.getDataProvider().getContext()).getOldUserId());
        if (ServiceFactory.getService(NumberAuthService.class) != null && LoginSwitch.getSwitch("getloginflow_take_maskmobile", "true")) {
            appLaunchRequest.maskMobile = ((NumberAuthService) ServiceFactory.getService(NumberAuthService.class)).getAuthInfoMap().get("number");
        }
        rpcRequest.addParam(ApiConstants.ApiField.LOGIN_INFO, JSON.toJSONString(appLaunchRequest));
        rpcRequest.addParam("riskControlInfo", JSON.toJSONString(UserLoginServiceImpl.getScanFaceWSecurityData()));
        HashMap hashMap = new HashMap();
        hashMap.put("sdkTraceId", loginParam.sdkTraceId);
        rpcRequest.addParam("ext", JSON.toJSONString(hashMap));
        return (AppLaunchInfoResponseData) ((RpcService) ServiceFactory.getService(RpcService.class)).post(rpcRequest, AppLaunchInfoResponseData.class);
    }

    public static String getLastLoginType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e5fb5ac2", new Object[0]);
        }
        String str = (String) SharedPreferencesUtil.getData(DataProviderFactory.getApplicationContext(), "login_type", "");
        return (LoginType.ServerLoginType.AlipaySSOLogin.getType().equals(str) || LoginType.LocalLoginType.LOGIN_TYPE_ALIPAY.equals(str)) ? "alipay" : LoginType.ServerLoginType.PasswordLogin.getType().equals(str) ? "pwd" : LoginType.ServerLoginType.SMSLogin.getType().equals(str) ? "sms" : LoginType.ServerLoginType.FaceLogin.getType().equals(str) ? "face" : LoginType.ServerLoginType.SimLogin.getType().equals(str) ? "sim" : str;
    }

    public void getLoginFlowRequest(LoginParam loginParam, RpcRequestCallback rpcRequestCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18cd55de", new Object[]{this, loginParam, rpcRequestCallback});
            return;
        }
        RpcRequest rpcRequest = new RpcRequest();
        rpcRequest.API_NAME = ApiConstants.ApiName.GET_LOGIN_FLOW;
        rpcRequest.VERSION = "1.0";
        LoginFlowRequest loginFlowRequest = new LoginFlowRequest();
        buildLoginFlowRequest(loginParam, loginFlowRequest);
        loginFlowRequest.pageType = loginParam.pageType;
        UserLoginServiceImpl.addExt(loginFlowRequest);
        rpcRequest.addParam(ApiConstants.ApiField.LOGIN_INFO, JSON.toJSONString(loginFlowRequest));
        rpcRequest.addParam("riskControlInfo", JSON.toJSONString(UserLoginServiceImpl.getScanFaceWSecurityData()));
        Map hashMap = new HashMap();
        if (loginParam.ext != null) {
            hashMap = loginParam.ext;
        }
        hashMap.put("sdkTraceId", loginParam.sdkTraceId);
        if (ServiceFactory.getService(NumberAuthService.class) != null && LoginSwitch.getSwitch("getloginflow_take_maskmobile", "true")) {
            String str = ((NumberAuthService) ServiceFactory.getService(NumberAuthService.class)).getAuthInfoMap().get("number");
            if (!StringUtils.isEmpty(str)) {
                hashMap.put("maskMobile", str);
            }
        }
        if (LoginSwitch.getSwitch("isRecommendNotOpenFace", "true")) {
            hashMap.put("isRecommendNotOpenFace", "true");
        }
        rpcRequest.addParam("ext", JSON.toJSONString(hashMap));
        ((RpcService) ServiceFactory.getService(RpcService.class)).remoteBusiness(rpcRequest, LoginFlowResponseData.class, rpcRequestCallback);
    }

    public static void buildLoginFlowRequest(LoginParam loginParam, LoginFlowRequest loginFlowRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ffaa88c", new Object[]{loginParam, loginFlowRequest});
            return;
        }
        Context applicationContext = DataProviderFactory.getApplicationContext();
        UserLoginServiceImpl.buildBaseRequest(loginParam, loginFlowRequest);
        loginFlowRequest.mobileNetworkOn = NetworkUtil.checkEnv(applicationContext);
        loginFlowRequest.loginId = loginParam.loginId;
        loginFlowRequest.t = System.currentTimeMillis();
    }
}
