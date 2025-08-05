package com.ali.user.mobile.base.helper;

import android.os.AsyncTask;
import android.text.TextUtils;
import android.webkit.CookieManager;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.mobile.log.UserTrackAdapter;
import com.ali.user.mobile.model.LoginBaseParam;
import com.ali.user.mobile.rpc.login.model.AliUserResponseData;
import com.ali.user.mobile.rpc.login.model.LoginReturnData;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.config.LoginSwitch;
import com.taobao.login4android.constants.LoginConstants;
import com.taobao.login4android.log.LoginTLogAdapter;
import com.taobao.login4android.session.SessionManager;
import com.taobao.login4android.thread.LoginThreadHelper;
import java.util.Map;
import tb.kge;

/* loaded from: classes2.dex */
public class LoginDataHelperTask extends AsyncTask {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private AliUserResponseData data;
    public Map<String, String> ext;
    public LoginReturnData loginData;
    public LoginBaseParam loginParam;
    private String nick;
    public boolean sendBroadcast;
    private SessionManager session;
    private String userId;
    public String loginType = "";
    public String loginAccount = "";

    static {
        kge.a(-454332101);
    }

    public static /* synthetic */ Object ipc$super(LoginDataHelperTask loginDataHelperTask, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public LoginDataHelperTask(boolean z, LoginReturnData loginReturnData, LoginBaseParam loginBaseParam, Map<String, String> map) {
        this.sendBroadcast = z;
        this.loginData = loginReturnData;
        this.loginParam = loginBaseParam;
        this.ext = map;
        try {
            this.data = (AliUserResponseData) JSON.parseObject(loginReturnData.data, AliUserResponseData.class);
            this.session = SessionManager.getInstance(DataProviderFactory.getApplicationContext());
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // android.os.AsyncTask
    public void onPreExecute() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("873a6298", new Object[]{this});
        } else {
            LoginDataHelper.beforeProcessLoginData(this.sendBroadcast, this.data);
        }
    }

    @Override // android.os.AsyncTask
    public Void doInBackground(Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Void) ipChange.ipc$dispatch("6d120651", new Object[]{this, objArr});
        }
        try {
            if (this.ext != null && !TextUtils.isEmpty(this.ext.get(LoginConstants.LOGIN_TYPE))) {
                this.loginType = this.ext.get(LoginConstants.LOGIN_TYPE);
            }
            if (this.ext != null && !TextUtils.isEmpty(this.ext.get(LoginConstants.LOGIN_ACCOUNT))) {
                this.loginAccount = this.ext.get(LoginConstants.LOGIN_ACCOUNT);
            }
            if (this.data == null) {
                this.data = (AliUserResponseData) JSON.parseObject(this.loginData.data, AliUserResponseData.class);
            }
            if (this.session == null) {
                this.session = SessionManager.getInstance(DataProviderFactory.getApplicationContext());
            }
            if (this.session != null) {
                if (LoginSwitch.getSwitch(LoginSwitch.CLEAR_COOKIE_WHEN_AUTOLOGIN, "true")) {
                    LoginTLogAdapter.e(LoginThreadHelper.TAG, "start clear cookie in LoginDataHelperTask");
                    this.session.injectCookie(null, null, false, com.taobao.login4android.utils.LoginSwitch.getSwitch(com.taobao.login4android.utils.LoginSwitch.SGCOOKIE, "true"));
                    LoginTLogAdapter.e(LoginThreadHelper.TAG, "end clear cookie in LoginDataHelperTask");
                } else {
                    LoginTLogAdapter.e(LoginThreadHelper.TAG, "start clear session in LoginDataHelperTask");
                    this.session.clearSessionInfo();
                    if (LoginSwitch.getSwitch(LoginSwitch.clearAutoLoginWhenClearSession, "true")) {
                        this.session.clearAutoLoginInfo();
                    }
                    LoginTLogAdapter.e(LoginThreadHelper.TAG, "end clear session in LoginDataHelperTask");
                }
                Thread.sleep(200L);
            }
            LoginDataHelper.onLoginSuccess(this.loginData, this.data, this.session);
            addCookie2SidCompare();
            LoginDataHelper.handleHistory(this.loginData, this.session, this.data, this.ext);
            this.nick = this.data.nick;
            this.userId = this.data.userId;
            if (LoginSwitch.getSwitch("sleepForMulProcessCookie", "true")) {
                Thread.sleep(100L);
            }
            LoginTLogAdapter.e(LoginThreadHelper.TAG, "get taobao cookie:" + CookieManager.getInstance().getCookie(".taobao.com"));
            return null;
        } catch (Throwable th) {
            LoginTLogAdapter.e("LoginDataHelperTask", th.getMessage());
            return null;
        }
    }

    private void addCookie2SidCompare() {
        String str;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1123690b", new Object[]{this});
            return;
        }
        CookieManager cookieManager = CookieManager.getInstance();
        cookieManager.setAcceptCookie(true);
        String cookie = cookieManager.getCookie(".taobao.com");
        try {
            LoginTLogAdapter.e(LoginThreadHelper.TAG, ".taobao.com, cookieStr=" + cookie);
            LoginTLogAdapter.e(LoginThreadHelper.TAG, "https://.taobao.com , cookieStr=" + cookieManager.getCookie("https://.taobao.com"));
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if (!TextUtils.isEmpty(cookie)) {
            String[] split = cookie.split(";");
            int length = split.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    str = "";
                    break;
                }
                String str2 = split[i];
                if (!TextUtils.isEmpty(str2) && str2.trim().startsWith("cookie2=")) {
                    str = str2.split("=")[1];
                    break;
                }
                i++;
            }
            if (TextUtils.equals(this.session.getSid(), str)) {
                z = true;
            }
        }
        if (z) {
            LoginTLogAdapter.e("addCookie2SidCompare", "checkCookieSucceed");
            UserTrackAdapter.sendUT("checkCookieSucceed");
            return;
        }
        LoginTLogAdapter.e("addCookie2SidCompare", "checkCookieFailed");
        UserTrackAdapter.sendUT("checkCookieFailed");
    }

    @Override // android.os.AsyncTask
    public void onPostExecute(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b105c779", new Object[]{this, obj});
        } else {
            LoginDataHelper.sendLoginResultBroadcast(this.sendBroadcast, this.userId, this.nick, this.loginParam, this.loginData, this.data, this.loginType, this.loginAccount);
        }
    }
}
