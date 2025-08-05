package com.taobao.login4android.aidl;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.ali.user.mobile.app.constant.UTConstant;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.mobile.callback.DataCallback;
import com.ali.user.mobile.log.UserTrackAdapter;
import com.ali.user.open.core.AliMemberSDK;
import com.ali.user.open.ucc.UccCallback;
import com.ali.user.open.ucc.UccService;
import com.alipay.mobile.common.logging.api.LogContext;
import com.alipay.mobile.common.transportext.amnet.Baggage;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.login4android.TaoBaoLoginInitializer;
import com.taobao.login4android.activity.LoginProxyActivity;
import com.taobao.login4android.api.Login;
import com.taobao.login4android.api.aidl.ICheckResultCallback;
import com.taobao.login4android.api.aidl.ICommonCallback;
import com.taobao.login4android.api.aidl.ILogin;
import com.taobao.login4android.api.aidl.ITokenCallback;
import com.taobao.login4android.api.aidl.IUccCallback;
import com.taobao.login4android.login.CheckResultCallback;
import com.taobao.login4android.login.InternalTokenCallback;
import com.taobao.login4android.login.LoginController;
import com.taobao.login4android.membercenter.account.AccountListComponent;
import com.taobao.login4android.membercenter.account.OnAccountChangedListener;
import com.taobao.tao.Globals;
import com.ut.mini.UTHitBuilders;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes7.dex */
public class LoginService extends Service {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "login.LoginService";
    private final LoginBinder binder = new LoginBinder();

    static {
        kge.a(998334573);
    }

    public static /* synthetic */ boolean access$000(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("38fae185", new Object[]{str})).booleanValue() : isLoginSDKInited(str);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IBinder) ipChange.ipc$dispatch("30c27bd", new Object[]{this, intent});
        }
        Log.e(TAG, "LoginService onBind,isMainProcess: " + Login.isMainProcess());
        isLoginSDKInited("onBind");
        return this.binder;
    }

    private static boolean isLoginSDKInited(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d712cbff", new Object[]{str})).booleanValue();
        }
        if (TaoBaoLoginInitializer.isInited || !Login.isMainProcess()) {
            return true;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("method", str);
        hashMap.put(UTHitBuilders.a.FIELD_ARG2, "2");
        UserTrackAdapter.sendUserTrack(UTConstant.PageName.UT_PAGE_EXTEND, "LoginAPI_login_sdk_not_init_2", hashMap);
        TaoBaoLoginInitializer.init(Globals.getApplication());
        return false;
    }

    /* loaded from: classes7.dex */
    class LoginBinder extends ILogin.Stub {
        private final int UCC_TRUST_LOGIN = 1;
        private final int UCC_BIND = 2;
        private final int UCC_UNBIND = 3;

        static {
            kge.a(1533021340);
        }

        @Override // com.taobao.login4android.api.aidl.ILogin
        public void clearHistoryNames() throws RemoteException {
        }

        @Override // com.taobao.login4android.api.aidl.ILogin
        public void goTmall(boolean z, String str, ICommonCallback iCommonCallback) throws RemoteException {
        }

        @Override // com.taobao.login4android.api.aidl.ILogin
        public void initInjectVst() throws RemoteException {
        }

        @Override // com.taobao.login4android.api.aidl.ILogin
        public void loginByKey(String str, int i) throws RemoteException {
        }

        public LoginBinder() {
            Log.e(LoginService.TAG, "LoginBinder: init");
            LoginService.access$000("LoginBinder init");
        }

        @Override // com.taobao.login4android.api.aidl.ILogin
        public void logout(boolean z) throws RemoteException {
            if (!LoginService.access$000(Baggage.Amnet.USER_O)) {
                return;
            }
            com.taobao.login4android.Login.logout(DataProviderFactory.getApplicationContext());
        }

        @Override // com.taobao.login4android.api.aidl.ILogin
        public void loginWithBundle(boolean z, Bundle bundle) throws RemoteException {
            if (!LoginService.access$000("loginWithBundle")) {
                return;
            }
            LoginController.getInstance().autoLogin(z, bundle);
        }

        @Override // com.taobao.login4android.api.aidl.ILogin
        public void navByScene(String str) throws RemoteException {
            if (!LoginService.access$000("navByScene-" + str)) {
                return;
            }
            LoginController.getInstance().navToWebViewByScene(Globals.getApplication(), str, 0);
        }

        @Override // com.taobao.login4android.api.aidl.ILogin
        public boolean refreshCookies() throws RemoteException {
            if (!LoginService.access$000("refreshCookies")) {
                return false;
            }
            return LoginController.getInstance().refreshCookies(true, false);
        }

        @Override // com.taobao.login4android.api.aidl.ILogin
        public void bindAlipay(String str, String str2) throws RemoteException {
            if (!LoginService.access$000("bindAlipay")) {
                return;
            }
            com.taobao.login4android.Login.bindAlipay(str, str2);
        }

        @Override // com.taobao.login4android.api.aidl.ILogin
        public void userLogin() throws RemoteException {
            if (!LoginService.access$000(LogContext.ENVENT_USERLOGIN)) {
                return;
            }
            LoginController.getInstance().userLogin(true);
        }

        @Override // com.taobao.login4android.api.aidl.ILogin
        public void alipayAuth(String str) throws RemoteException {
            if (!LoginService.access$000("alipayAuth-" + str)) {
                return;
            }
            Intent intent = new Intent(DataProviderFactory.getApplicationContext(), LoginProxyActivity.class);
            intent.putExtra("action", LoginProxyActivity.ACTION_ALIPAY_AUTH);
            intent.addFlags(268435456);
            DataProviderFactory.getApplicationContext().startActivity(intent);
        }

        @Override // com.taobao.login4android.api.aidl.ILogin
        public void uccTrustLogin(String str, Map map, IUccCallback iUccCallback) throws RemoteException {
            handleUccCall(1, str, map, iUccCallback);
        }

        @Override // com.taobao.login4android.api.aidl.ILogin
        public void uccBind(String str, Map map, IUccCallback iUccCallback) throws RemoteException {
            handleUccCall(2, str, map, iUccCallback);
        }

        @Override // com.taobao.login4android.api.aidl.ILogin
        public void uccUnbind(String str, IUccCallback iUccCallback) throws RemoteException {
            handleUccCall(3, str, null, iUccCallback);
        }

        private void handleUccCall(int i, String str, Map map, final IUccCallback iUccCallback) {
            if (!LoginService.access$000("handleUccCall-" + i)) {
                return;
            }
            UccCallback uccCallback = new UccCallback() { // from class: com.taobao.login4android.aidl.LoginService.LoginBinder.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.ali.user.open.ucc.UccCallback
                public void onSuccess(String str2, Map map2) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("b5e17230", new Object[]{this, str2, map2});
                        return;
                    }
                    IUccCallback iUccCallback2 = iUccCallback;
                    if (iUccCallback2 == null) {
                        return;
                    }
                    try {
                        iUccCallback2.onSuccess(str2, map2);
                    } catch (RemoteException e) {
                        e.printStackTrace();
                    }
                }

                @Override // com.ali.user.open.ucc.UccCallback
                public void onFail(String str2, int i2, String str3) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("b9656df", new Object[]{this, str2, new Integer(i2), str3});
                        return;
                    }
                    IUccCallback iUccCallback2 = iUccCallback;
                    if (iUccCallback2 == null) {
                        return;
                    }
                    try {
                        iUccCallback2.onFail(str2, i2, str3);
                    } catch (RemoteException e) {
                        e.printStackTrace();
                    }
                }
            };
            if (i == 1) {
                ((UccService) AliMemberSDK.getService(UccService.class)).trustLogin(str, map, uccCallback);
            } else if (i == 2) {
                ((UccService) AliMemberSDK.getService(UccService.class)).bind(str, map, uccCallback);
            } else if (i != 3) {
            } else {
                ((UccService) AliMemberSDK.getService(UccService.class)).unbind(str, uccCallback);
            }
        }

        @Override // com.taobao.login4android.api.aidl.ILogin
        public void triggerLoginBundle() throws RemoteException {
            Log.e(LoginService.TAG, "triggerLoginBundle: ");
            TaoBaoLoginInitializer.init(Globals.getApplication());
        }

        @Override // com.taobao.login4android.api.aidl.ILogin
        public void checkMultiAccountPageEnable(final ICheckResultCallback iCheckResultCallback) throws RemoteException {
            if (!LoginService.access$000("checkMultiAccountPageEnable")) {
                return;
            }
            AccountListComponent.isMultiAccountPageEnable(new DataCallback<Boolean>() { // from class: com.taobao.login4android.aidl.LoginService.LoginBinder.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.ali.user.mobile.callback.DataCallback
                public void result(Boolean bool) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("32aa3ea9", new Object[]{this, bool});
                        return;
                    }
                    try {
                        iCheckResultCallback.onSucess(bool.booleanValue());
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        }

        @Override // com.taobao.login4android.api.aidl.ILogin
        public void checkLogoutPanelEnable(final ICheckResultCallback iCheckResultCallback) throws RemoteException {
            if (!LoginService.access$000("checkLogoutPanelEnable")) {
                return;
            }
            AccountListComponent.isLogoutPanelEnable(new DataCallback<Boolean>() { // from class: com.taobao.login4android.aidl.LoginService.LoginBinder.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.ali.user.mobile.callback.DataCallback
                public void result(Boolean bool) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("32aa3ea9", new Object[]{this, bool});
                        return;
                    }
                    try {
                        iCheckResultCallback.onSucess(bool.booleanValue());
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        }

        @Override // com.taobao.login4android.api.aidl.ILogin
        public void openMultiAccountPage() throws RemoteException {
            if (!LoginService.access$000("openMultiAccountPage")) {
                return;
            }
            AccountListComponent.setOnAccountChangedListener(new OnAccountChangedListener() { // from class: com.taobao.login4android.aidl.LoginService.LoginBinder.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.login4android.membercenter.account.OnAccountChangedListener
                public void OnAccountChanged() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("5a89412d", new Object[]{this});
                        return;
                    }
                    Nav.from(DataProviderFactory.getApplicationContext()).toUri("http://m.taobao.com/index.htm");
                    new Handler().postDelayed(new Runnable() { // from class: com.taobao.login4android.aidl.LoginService.LoginBinder.4.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                Nav.from(DataProviderFactory.getApplicationContext()).toUri("http://m.taobao.com/index.htm");
                            }
                        }
                    }, 100L);
                    new Handler().postDelayed(new Runnable() { // from class: com.taobao.login4android.aidl.LoginService.LoginBinder.4.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                Nav.from(DataProviderFactory.getApplicationContext()).toUri("http://m.taobao.com/index.htm");
                            }
                        }
                    }, 200L);
                }
            });
            AccountListComponent.openMultiAccountPage(DataProviderFactory.getApplicationContext());
        }

        @Override // com.taobao.login4android.api.aidl.ILogin
        public void showLogoutPanel() throws RemoteException {
            if (!LoginService.access$000("showLogoutPanel")) {
                return;
            }
            AccountListComponent.newLogoutPanel(DataProviderFactory.getApplicationContext());
        }

        @Override // com.taobao.login4android.api.aidl.ILogin
        public void applyToken(final ITokenCallback iTokenCallback) {
            if (!LoginService.access$000("applyToken")) {
                return;
            }
            LoginController.getInstance().applyToken(new InternalTokenCallback() { // from class: com.taobao.login4android.aidl.LoginService.LoginBinder.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.login4android.login.InternalTokenCallback
                public void onSucess(String str) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("8ef46cb4", new Object[]{this, str});
                        return;
                    }
                    try {
                        iTokenCallback.onSucess(str);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }

                @Override // com.taobao.login4android.login.InternalTokenCallback
                public void onFail(String str, String str2) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("f2f5f2b8", new Object[]{this, str, str2});
                        return;
                    }
                    try {
                        iTokenCallback.onFail(str, str2);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        }

        @Override // com.taobao.login4android.api.aidl.ILogin
        public void checkNickModifiable(final ICheckResultCallback iCheckResultCallback) throws RemoteException {
            if (!LoginService.access$000("checkNickModifiable")) {
                return;
            }
            com.taobao.login4android.Login.checkNickModifiable(new CheckResultCallback() { // from class: com.taobao.login4android.aidl.LoginService.LoginBinder.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.login4android.login.CheckResultCallback
                public void result(boolean z) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("dd278130", new Object[]{this, new Boolean(z)});
                        return;
                    }
                    try {
                        iCheckResultCallback.onSucess(z);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }
}
