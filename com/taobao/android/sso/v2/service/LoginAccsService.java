package com.taobao.android.sso.v2.service;

import android.app.NotificationManager;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.RemoteException;
import android.support.v4.app.NotificationCompat;
import mtopsdk.common.util.StringUtils;
import com.ali.user.mobile.app.LoginContext;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.mobile.callback.RpcRequestCallback;
import com.ali.user.mobile.log.UserTrackAdapter;
import com.ali.user.mobile.login.LoginDataRepository;
import com.ali.user.mobile.model.LoginParam;
import com.ali.user.mobile.model.UrlParam;
import com.ali.user.mobile.rpc.RpcResponse;
import com.ali.user.mobile.rpc.login.model.DefaultLoginResponseData;
import com.ali.user.mobile.rpc.login.model.LoginReturnData;
import com.ali.user.mobile.service.NavigatorService;
import com.ali.user.mobile.service.ServiceFactory;
import com.ali.user.mobile.ui.WebConstant;
import com.ali.user.mobile.utils.ResourceUtil;
import com.ali.user.mobile.utils.SharedPreferencesUtil;
import com.ali.user.mobile.webview.WebViewActivity;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.taobao.aop.a;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.taobao.accs.base.TaoBaseService;
import com.taobao.login4android.Login;
import com.taobao.login4android.biz.autologin.AutoLoginBusiness;
import com.taobao.login4android.log.LoginTLogAdapter;
import com.taobao.login4android.login.LoginController;
import com.taobao.login4android.thread.LoginAsyncTask;
import com.uc.webview.export.extension.UCCore;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes6.dex */
public class LoginAccsService extends TaoBaseService {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final AtomicInteger NOTIFICATION_ID = new AtomicInteger(1);
    public String TAG = "loginsdk.accs";
    private AccsLoginReceiver mAccsLoginReceiver;

    public static /* synthetic */ Object ipc$super(LoginAccsService loginAccsService, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode != 413640386) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onCreate();
            return null;
        }
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onBind(String str, int i, TaoBaseService.ExtraInfo extraInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fa398db", new Object[]{this, str, new Integer(i), extraInfo});
        }
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onResponse(String str, String str2, int i, byte[] bArr, TaoBaseService.ExtraInfo extraInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5239c42", new Object[]{this, str, str2, new Integer(i), bArr, extraInfo});
        }
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onSendData(String str, String str2, int i, TaoBaseService.ExtraInfo extraInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f29e89fa", new Object[]{this, str, str2, new Integer(i), extraInfo});
        }
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onUnbind(String str, int i, TaoBaseService.ExtraInfo extraInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b4e074", new Object[]{this, str, new Integer(i), extraInfo});
        }
    }

    public static /* synthetic */ void access$000(LoginAccsService loginAccsService, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d69959c", new Object[]{loginAccsService, str});
        } else {
            loginAccsService.showWebViewPage(str);
        }
    }

    @Override // com.taobao.accs.base.TaoBaseService, android.app.Service
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
            return;
        }
        super.onCreate();
        this.mAccsLoginReceiver = new AccsLoginReceiver();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(AccsLoginReceiver.NOTIFICATION_ACTION);
        registerReceiver(this.mAccsLoginReceiver, intentFilter);
    }

    @Override // com.taobao.accs.base.TaoBaseService, android.app.Service
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        AccsLoginReceiver accsLoginReceiver = this.mAccsLoginReceiver;
        if (accsLoginReceiver != null) {
            unregisterReceiver(accsLoginReceiver);
        }
        super.onDestroy();
    }

    /* JADX WARN: Type inference failed for: r5v11, types: [com.taobao.android.sso.v2.service.LoginAccsService$1] */
    @Override // com.taobao.accs.base.AccsDataListener
    public void onData(String str, String str2, String str3, byte[] bArr, TaoBaseService.ExtraInfo extraInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("694255fc", new Object[]{this, str, str2, str3, bArr, extraInfo});
        } else if (bArr == null || !DataProviderFactory.getDataProvider().needAccsLogin()) {
        } else {
            try {
                final AccsLoginMessageModel2 accsLoginMessageModel2 = (AccsLoginMessageModel2) JSON.parseObject(new String(bArr, "utf-8"), AccsLoginMessageModel2.class);
                if (accsLoginMessageModel2 != null && StringUtils.equals(accsLoginMessageModel2.type, "logoutEventType")) {
                    LoginTLogAdapter.e(this.TAG, "received logoutEventType");
                    SharedPreferencesUtil.saveData(DataProviderFactory.getApplicationContext(), "pushLogoutContent", accsLoginMessageModel2.content);
                    SharedPreferencesUtil.saveData(DataProviderFactory.getApplicationContext(), "pushLogoutTime", Long.valueOf(System.currentTimeMillis()));
                    LoginTLogAdapter.e(this.TAG, "local session valid, call logout");
                    Login.logout();
                } else if (accsLoginMessageModel2 != null && !StringUtils.isEmpty(accsLoginMessageModel2.url)) {
                    UserTrackAdapter.sendUT("Event_onekeylogin_receive_token");
                    if (isForground()) {
                        new LoginAsyncTask<Void, Void, Void>() { // from class: com.taobao.android.sso.v2.service.LoginAccsService.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Void, java.lang.Object] */
                            @Override // com.taobao.login4android.thread.LoginAsyncTask
                            public /* synthetic */ Void excuteTask(Void[] voidArr) throws Exception {
                                IpChange ipChange2 = $ipChange;
                                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("d0eda63", new Object[]{this, voidArr}) : a(voidArr);
                            }

                            @Override // android.os.AsyncTask
                            public /* synthetic */ void onPostExecute(Object obj) {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("b105c779", new Object[]{this, obj});
                                } else {
                                    a((Void) obj);
                                }
                            }

                            public Void a(Void... voidArr) throws RemoteException {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    return (Void) ipChange2.ipc$dispatch("54f0ab29", new Object[]{this, voidArr});
                                }
                                if (Login.checkSessionValid() || StringUtils.isEmpty(Login.getLoginToken()) || StringUtils.isEmpty(Login.getUserId())) {
                                    return null;
                                }
                                LoginTLogAdapter.e(LoginAsyncTask.TAG, "checkSessionValid, do autoLogin");
                                try {
                                    LoginController.getInstance().processAutoLoginResponse(new AutoLoginBusiness().autoLogin(Login.getLoginToken(), Login.getUserId(), DataProviderFactory.getDataProvider().getSite(), true, "auto login for accs"), false);
                                    return null;
                                } catch (Throwable th) {
                                    th.printStackTrace();
                                    return null;
                                }
                            }

                            public void a(Void r4) {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("6f8d528f", new Object[]{this, r4});
                                } else {
                                    LoginAccsService.access$000(LoginAccsService.this, accsLoginMessageModel2.url);
                                }
                            }
                        }.execute(new Void[0]);
                        return;
                    }
                    showLoginNotification(accsLoginMessageModel2.title, accsLoginMessageModel2.content, accsLoginMessageModel2.url);
                    saveLoginMessage(accsLoginMessageModel2);
                } else if (accsLoginMessageModel2 == null || !StringUtils.equals(accsLoginMessageModel2.type, "dynamicCodeVerify")) {
                } else {
                    LoginParam loginParam = new LoginParam();
                    loginParam.hid = Long.parseLong(Login.getUserId());
                    loginParam.token = accsLoginMessageModel2.body;
                    LoginDataRepository.getInstance().dynamicCodePopup(loginParam, new RpcRequestCallback() { // from class: com.taobao.android.sso.v2.service.LoginAccsService.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.ali.user.mobile.callback.RpcRequestCallback
                        public void onSuccess(RpcResponse rpcResponse) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("2811f422", new Object[]{this, rpcResponse});
                            } else if (rpcResponse == null) {
                                LoginTLogAdapter.e("dynamicCodeVerify", "response is null");
                            } else if (!StringUtils.equals("SUCCESS", rpcResponse.actionType)) {
                            } else {
                                LoginReturnData loginReturnData = (LoginReturnData) ((DefaultLoginResponseData) rpcResponse).returnValue;
                                LoginTLogAdapter.e("dynamicCodeVerify", "response suc h5url:" + loginReturnData.h5Url);
                                if (loginReturnData == null || StringUtils.isEmpty(loginReturnData.h5Url)) {
                                    return;
                                }
                                UrlParam urlParam = new UrlParam();
                                urlParam.url = loginReturnData.h5Url;
                                urlParam.site = DataProviderFactory.getDataProvider().getSite();
                                urlParam.flags = UCCore.VERIFY_POLICY_PAK_QUICK;
                                ((NavigatorService) ServiceFactory.getService(NavigatorService.class)).openWebViewPage(DataProviderFactory.getApplicationContext(), urlParam);
                            }
                        }

                        @Override // com.ali.user.mobile.callback.RpcRequestCallback
                        public void onError(RpcResponse rpcResponse) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("4b349f7d", new Object[]{this, rpcResponse});
                                return;
                            }
                            LoginTLogAdapter.e("dynamicCodeVerify", "response is error :" + rpcResponse);
                        }
                    });
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private void showLoginNotification(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("686b3ddc", new Object[]{this, str, str2, str3});
            return;
        }
        try {
            int incrementAndGet = NOTIFICATION_ID.incrementAndGet();
            NotificationManager notificationManager = (NotificationManager) getSystemService(RemoteMessageConst.NOTIFICATION);
            NotificationCompat.Builder builder = new NotificationCompat.Builder(this);
            Intent intent = new Intent();
            intent.setAction(AccsLoginReceiver.NOTIFICATION_ACTION);
            intent.putExtra(WebConstant.WEBURL, str3);
            builder.setContentTitle(str).setSmallIcon(ResourceUtil.getDrawableId("tao_mag_icon_white")).setLargeIcon(BitmapFactory.decodeResource(getResources(), ResourceUtil.getDrawableId("tao_mag_icon"))).setAutoCancel(true).setContentText(str2).setTicker(str2).setContentIntent(a.b(this, incrementAndGet, intent, 201326592));
            if (Build.VERSION.SDK_INT >= 16) {
                notificationManager.notify(incrementAndGet, builder.build());
            } else {
                notificationManager.notify(incrementAndGet, builder.getNotification());
            }
        } catch (Throwable th) {
            th.printStackTrace();
            LoginTLogAdapter.trace(this.TAG, "showLoginNotification error", th);
        }
    }

    private boolean isForground() {
        try {
            Class<?> cls = Class.forName("com.taobao.taobaocompat.lifecycle.AppForgroundObserver");
            return cls.getField("isForeground").getBoolean(cls);
        } catch (Throwable th) {
            th.printStackTrace();
            return true;
        }
    }

    private void saveLoginMessage(AccsLoginMessageModel2 accsLoginMessageModel2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c48da7e", new Object[]{this, accsLoginMessageModel2});
        } else if (accsLoginMessageModel2 == null) {
        } else {
            SharedPreferences.Editor edit = getSharedPreferences("userinfo", 4).edit();
            edit.putString("accs_login", accsLoginMessageModel2.url + (char) 5 + System.currentTimeMillis());
            edit.apply();
            LoginContext.NEED_ACCS_LOGIN = true;
        }
    }

    private void showWebViewPage(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e7a5f5c", new Object[]{this, str});
            return;
        }
        try {
            UserTrackAdapter.sendUT("Event_onekeylogin_showWebView");
            Intent intent = new Intent(this, WebViewActivity.class);
            intent.putExtra(WebConstant.WEBURL, str);
            intent.addFlags(805306368);
            startActivity(intent);
        } catch (Throwable unused) {
        }
    }
}
