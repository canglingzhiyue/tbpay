package com.ali.user.mobile.login.presenter;

import android.content.Context;
import android.content.DialogInterface;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.ali.user.mobile.app.constant.UTConstant;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.mobile.base.helper.SDKExceptionHelper;
import com.ali.user.mobile.callback.LoginTasksCallback;
import com.ali.user.mobile.coordinator.CoordinatorWrapper;
import com.ali.user.mobile.exception.LoginException;
import com.ali.user.mobile.exception.RpcException;
import com.ali.user.mobile.log.ApiReferer;
import com.ali.user.mobile.log.UserTrackAdapter;
import com.ali.user.mobile.login.LoginApi;
import com.ali.user.mobile.login.ui.BaseLoginFragment;
import com.ali.user.mobile.login.ui.BaseLoginView;
import com.ali.user.mobile.login.ui.UserLoginView;
import com.ali.user.mobile.model.LoginParam;
import com.ali.user.mobile.model.LoginType;
import com.ali.user.mobile.model.TokenType;
import com.ali.user.mobile.model.TrackingModel;
import com.ali.user.mobile.navigation.NavigatorManager;
import com.ali.user.mobile.rpc.HistoryAccount;
import com.ali.user.mobile.rpc.RpcResponse;
import com.ali.user.mobile.rpc.h5.MtopFoundPasswordResponseData;
import com.ali.user.mobile.rpc.login.model.LoginReturnData;
import com.ali.user.mobile.security.SecurityGuardManagerWraper;
import com.ali.user.mobile.url.model.AccountCenterParam;
import com.ali.user.mobile.url.service.impl.UrlFetchServiceImpl;
import com.ali.user.mobile.utils.StringUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.config.LoginSwitch;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.HashMap;
import tb.kge;

/* loaded from: classes2.dex */
public class UserLoginPresenter extends BaseLoginPresenter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(510367967);
    }

    public static /* synthetic */ Object ipc$super(UserLoginPresenter userLoginPresenter, String str, Object... objArr) {
        if (str.hashCode() == 970333494) {
            super.cleanDataHodler();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.ali.user.mobile.login.presenter.BaseLoginPresenter
    public String getLocalLoginType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c11b97ab", new Object[]{this}) : LoginType.LocalLoginType.PWD_LOGIN;
    }

    public static /* synthetic */ void access$000(UserLoginPresenter userLoginPresenter, MtopFoundPasswordResponseData mtopFoundPasswordResponseData, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b448727a", new Object[]{userLoginPresenter, mtopFoundPasswordResponseData, str, str2});
        } else {
            userLoginPresenter.handlePhoneLoginFindPwd(mtopFoundPasswordResponseData, str, str2);
        }
    }

    public UserLoginPresenter(BaseLoginView baseLoginView, LoginParam loginParam) {
        super(baseLoginView, loginParam);
    }

    @Override // com.ali.user.mobile.login.presenter.BaseLoginPresenter
    public void login() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99739770", new Object[]{this});
        } else if (this.mViewer == null || !this.mViewer.isActive()) {
        } else {
            LoginApi.pwdLogin(this.mLoginParam.m102clone(), buildTrackingModel(), this.mViewer, new LoginTasksCallback<LoginReturnData>() { // from class: com.ali.user.mobile.login.presenter.UserLoginPresenter.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.ali.user.mobile.callback.LoginTasksCallback
                public void onCancel() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("379d4540", new Object[]{this});
                    }
                }

                @Override // com.ali.user.mobile.callback.LoginTasksCallback
                public void onSuccess(RpcResponse<LoginReturnData> rpcResponse) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("2811f422", new Object[]{this, rpcResponse});
                    }
                }

                @Override // com.ali.user.mobile.callback.LoginTasksCallback
                public void onFail(LoginException<LoginReturnData> loginException) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("77abaa65", new Object[]{this, loginException});
                    } else if (UserLoginPresenter.this.mViewer == null || !UserLoginPresenter.this.mViewer.isActive()) {
                    } else {
                        if (loginException.getCode() == 800 || loginException.getCode() == 700) {
                            UserLoginPresenter userLoginPresenter = UserLoginPresenter.this;
                            userLoginPresenter.onReceiveToast(userLoginPresenter.mLoginParam, loginException.getOrinResponse());
                            return;
                        }
                        UserLoginPresenter.this.mViewer.toast(loginException.getMsg(), 0);
                    }
                }
            });
        }
    }

    @Override // com.ali.user.mobile.login.presenter.BaseLoginPresenter
    public void onReceiveToast(LoginParam loginParam, RpcResponse<LoginReturnData> rpcResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b15a0ba6", new Object[]{this, loginParam, rpcResponse});
        } else if (this.mViewer == null || !(this.mViewer instanceof UserLoginView)) {
        } else {
            ((UserLoginView) this.mViewer).showFindPasswordAlert(loginParam, rpcResponse);
        }
    }

    public void fetchUrlAndToWebViewWithUserId(Context context, String str, final long j, final String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27fb48cb", new Object[]{this, context, str, new Long(j), str2});
        } else if (this.mViewer == null || !this.mViewer.isActive()) {
        } else {
            this.mViewer.showLoading();
            String pageName = this.mViewer instanceof BaseLoginFragment ? ((BaseLoginFragment) this.mViewer).getPageName() : UTConstant.PageName.UT_PAGE_HISTORY_LOGIN;
            final String generateTraceId = ApiReferer.generateTraceId(LoginType.LocalLoginType.RETRIVE_PWD_LOGIN, pageName);
            HashMap hashMap = new HashMap();
            hashMap.put("sdkTraceId", generateTraceId);
            UserTrackAdapter.control(pageName, UTConstant.CustomEvent.UT_LOGIN_ACTION, "", LoginType.LocalLoginType.RETRIVE_PWD_LOGIN, hashMap);
            new CoordinatorWrapper().execute(new AsyncTask<Object, Void, MtopFoundPasswordResponseData>() { // from class: com.ali.user.mobile.login.presenter.UserLoginPresenter.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.AsyncTask
                /* renamed from: doInBackground */
                public MtopFoundPasswordResponseData mo100doInBackground(Object... objArr) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (MtopFoundPasswordResponseData) ipChange2.ipc$dispatch("f4c05a9", new Object[]{this, objArr});
                    }
                    try {
                        AccountCenterParam accountCenterParam = new AccountCenterParam();
                        accountCenterParam.havanaId = j;
                        HistoryAccount findHistoryAccount = SecurityGuardManagerWraper.findHistoryAccount(j);
                        if (findHistoryAccount != null) {
                            accountCenterParam.deviceTokenKey = findHistoryAccount.tokenKey;
                        }
                        accountCenterParam.fromSite = UserLoginPresenter.this.mViewer.getLoginSite();
                        accountCenterParam.sdkTraceId = generateTraceId;
                        return UrlFetchServiceImpl.getInstance().foundPassword(accountCenterParam);
                    } catch (RpcException | Exception unused) {
                        return null;
                    }
                }

                @Override // android.os.AsyncTask
                public void onPostExecute(MtopFoundPasswordResponseData mtopFoundPasswordResponseData) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9fceeadc", new Object[]{this, mtopFoundPasswordResponseData});
                    } else if (UserLoginPresenter.this.mViewer == null) {
                    } else {
                        try {
                            if (!UserLoginPresenter.this.mViewer.isActive()) {
                                return;
                            }
                            try {
                                UserLoginPresenter.access$000(UserLoginPresenter.this, mtopFoundPasswordResponseData, generateTraceId, str2);
                                if (UserLoginPresenter.this.mViewer != null) {
                                    UserLoginPresenter.this.mViewer.dismissLoading();
                                }
                            } catch (RpcException e) {
                                SDKExceptionHelper.getInstance().rpcExceptionHandler(e);
                                if (UserLoginPresenter.this.mViewer != null) {
                                    UserLoginPresenter.this.mViewer.dismissLoading();
                                }
                            } catch (Exception unused) {
                                if (UserLoginPresenter.this.mViewer == null) {
                                    return;
                                }
                                UserLoginPresenter.this.mViewer.dismissLoading();
                            }
                        } catch (Throwable th) {
                            if (UserLoginPresenter.this.mViewer != null) {
                                UserLoginPresenter.this.mViewer.dismissLoading();
                            }
                            throw th;
                        }
                    }
                }
            }, new Object[0]);
        }
    }

    private void handlePhoneLoginFindPwd(MtopFoundPasswordResponseData mtopFoundPasswordResponseData, final String str, final String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68202e3b", new Object[]{this, mtopFoundPasswordResponseData, str, str2});
        } else if (mtopFoundPasswordResponseData == null) {
            this.mViewer.toast(DataProviderFactory.getApplicationContext().getString(R.string.aliuser_network_error), 0);
        } else {
            final HashMap hashMap = new HashMap();
            ArrayList arrayList = new ArrayList();
            if (!TextUtils.isEmpty(mtopFoundPasswordResponseData.mobileLoginUrl)) {
                String string = this.mViewer.getBaseActivity().getResources().getString(R.string.aliuser_find_pwd_phone_hint, StringUtil.dataMasking(mtopFoundPasswordResponseData.secMobile));
                hashMap.put(string, mtopFoundPasswordResponseData.mobileLoginUrl);
                arrayList.add(string);
            }
            if (!TextUtils.isEmpty(mtopFoundPasswordResponseData.passwordFindUrl)) {
                String string2 = this.mViewer.getBaseActivity().getResources().getString(R.string.aliuser_alert_findpwd);
                hashMap.put(string2, mtopFoundPasswordResponseData.passwordFindUrl);
                arrayList.add(string2);
            }
            if (arrayList.size() > 1) {
                if (!LoginSwitch.isInABTestRegion("alertListToBottom", 10000)) {
                    arrayList.add(this.mViewer.getBaseActivity().getResources().getString(R.string.aliuser_cancel));
                }
                final String[] strArr = (String[]) arrayList.toArray(new String[arrayList.size()]);
                this.mViewer.alertList(strArr, new DialogInterface.OnClickListener() { // from class: com.ali.user.mobile.login.presenter.UserLoginPresenter.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i) {
                        String str3;
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                        } else if (UserLoginPresenter.this.mViewer == null || !UserLoginPresenter.this.mViewer.isActive()) {
                        } else {
                            boolean equals = TextUtils.equals(UserLoginPresenter.this.mViewer.getBaseActivity().getResources().getString(R.string.aliuser_cancel), strArr[i]);
                            String str4 = UTConstant.PageName.UT_PAGE_HISTORY_LOGIN;
                            if (equals) {
                                UserTrackAdapter.control(str4, "Button-ForgetPwd-Cancel");
                                UserLoginPresenter.this.mViewer.dismissAlertDialog();
                                return;
                            }
                            LoginParam loginParam = new LoginParam();
                            loginParam.tokenType = TokenType.FIND_PWD;
                            loginParam.isFromAccount = true;
                            loginParam.source = str2;
                            if (UserLoginPresenter.this.mViewer instanceof BaseLoginFragment) {
                                str4 = ((BaseLoginFragment) UserLoginPresenter.this.mViewer).getPageName();
                            }
                            loginParam.utPageName = str4;
                            LoginReturnData loginReturnData = new LoginReturnData();
                            loginReturnData.site = UserLoginPresenter.this.mViewer.getLoginSite();
                            if (i == 0) {
                                loginParam.sdkTraceId = ApiReferer.generateTraceId("h5MobileLogin", loginParam.utPageName);
                                loginParam.loginSourceType = "h5MobileLogin";
                                HashMap hashMap2 = new HashMap();
                                hashMap2.put("sdkTraceId", loginParam.sdkTraceId + "");
                                UserTrackAdapter.control(loginParam.utPageName, "Button-LoginByPhone", "", hashMap2);
                                str3 = "1016";
                            } else {
                                loginParam.sdkTraceId = str;
                                loginParam.loginSourceType = LoginType.LocalLoginType.RETRIVE_PWD_LOGIN;
                                HashMap hashMap3 = new HashMap();
                                hashMap3.put("sdkTraceId", loginParam.sdkTraceId + "");
                                UserTrackAdapter.control(loginParam.utPageName, "Button-ResetPwd", "", hashMap3);
                                str3 = "1014";
                            }
                            loginReturnData.scene = str3;
                            HistoryAccount historyAccount = UserLoginPresenter.this.mViewer.getHistoryAccount();
                            if (historyAccount != null) {
                                loginReturnData.showLoginId = historyAccount.userInputName;
                            }
                            loginParam.errorCode = "0";
                            NavigatorManager.getInstance().navToWebViewPage(UserLoginPresenter.this.mViewer.getBaseActivity(), (String) hashMap.get(strArr[i]), loginParam, loginReturnData);
                        }
                    }
                }, true);
            } else if (arrayList.size() == 1) {
                LoginParam loginParam = new LoginParam();
                loginParam.tokenType = TokenType.FIND_PWD;
                loginParam.isFromAccount = true;
                LoginReturnData loginReturnData = new LoginReturnData();
                loginReturnData.site = this.mViewer.getLoginSite();
                loginReturnData.scene = "1014";
                loginParam.errorCode = "0";
                NavigatorManager.getInstance().navToWebViewPage(this.mViewer.getBaseActivity(), mtopFoundPasswordResponseData.passwordFindUrl, loginParam, loginReturnData);
            } else {
                this.mViewer.toast(DataProviderFactory.getApplicationContext().getString(R.string.aliuser_network_error), 0);
            }
        }
    }

    @Override // com.ali.user.mobile.login.presenter.BaseLoginPresenter
    public void cleanDataHodler() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39d61d36", new Object[]{this});
            return;
        }
        super.cleanDataHodler();
        if (!(this.mViewer instanceof UserLoginView)) {
            return;
        }
        ((UserLoginView) this.mViewer).clearPasswordInput();
    }

    private TrackingModel buildTrackingModel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TrackingModel) ipChange.ipc$dispatch("5f618518", new Object[]{this});
        }
        TrackingModel trackingModel = new TrackingModel();
        trackingModel.pageName = this.mViewer.getPageName();
        trackingModel.loginType = getLocalLoginType();
        trackingModel.traceId = ApiReferer.generateTraceId(trackingModel.loginType, trackingModel.pageName);
        return trackingModel;
    }
}
