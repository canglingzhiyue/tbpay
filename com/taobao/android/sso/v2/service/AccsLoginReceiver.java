package com.taobao.android.sso.v2.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.RemoteException;
import mtopsdk.common.util.StringUtils;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.mobile.ui.WebConstant;
import com.ali.user.mobile.webview.WebViewActivity;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.Login;
import com.taobao.login4android.biz.autologin.AutoLoginBusiness;
import com.taobao.login4android.log.LoginTLogAdapter;
import com.taobao.login4android.thread.LoginAsyncTask;

/* loaded from: classes6.dex */
public class AccsLoginReceiver extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String NOTIFICATION_ACTION = "com.ali.user.sdk.login.notification";

    public static /* synthetic */ Object ipc$super(AccsLoginReceiver accsLoginReceiver, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void access$000(AccsLoginReceiver accsLoginReceiver, Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59e0efb4", new Object[]{accsLoginReceiver, context, str});
        } else {
            accsLoginReceiver.showWebViewPage(context, str);
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [com.taobao.android.sso.v2.service.AccsLoginReceiver$1] */
    @Override // android.content.BroadcastReceiver
    public void onReceive(final Context context, final Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
        } else if (intent == null) {
        } else {
            try {
                if (StringUtils.isEmpty(intent.getStringExtra(WebConstant.WEBURL))) {
                    return;
                }
                deleteAccsLoginInfo();
                new LoginAsyncTask<Void, Void, Void>() { // from class: com.taobao.android.sso.v2.service.AccsLoginReceiver.1
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
                            new AutoLoginBusiness().autoLogin(Login.getLoginToken(), Login.getUserId(), DataProviderFactory.getDataProvider().getSite(), true, "auto login for accs");
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
                            AccsLoginReceiver.access$000(AccsLoginReceiver.this, context, intent.getStringExtra(WebConstant.WEBURL));
                        }
                    }
                }.execute(new Void[0]);
            } catch (Exception unused) {
            }
        }
    }

    private void showWebViewPage(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c352640", new Object[]{this, context, str});
            return;
        }
        try {
            Intent intent = new Intent(context, WebViewActivity.class);
            intent.putExtra(WebConstant.WEBURL, str);
            intent.addFlags(805306368);
            context.startActivity(intent);
        } catch (Throwable unused) {
        }
    }

    private void deleteAccsLoginInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7026e761", new Object[]{this});
            return;
        }
        SharedPreferences.Editor edit = DataProviderFactory.getApplicationContext().getSharedPreferences("userinfo", 4).edit();
        edit.remove("accs_login");
        edit.apply();
    }
}
