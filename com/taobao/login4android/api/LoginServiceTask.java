package com.taobao.login4android.api;

import android.os.AsyncTask;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.service.Services;
import com.taobao.login4android.api.aidl.ILogin;
import com.taobao.login4android.constants.LoginStatus;
import com.taobao.login4android.log.LoginTLogAdapter;
import tb.kge;

/* loaded from: classes7.dex */
public abstract class LoginServiceTask<Params, Progress, Result> extends AsyncTask<Params, Progress, Result> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "login.LoginServiceTask";
    private LoginTrackableServiceConnection connection;

    static {
        kge.a(-1543288156);
    }

    public static /* synthetic */ Object ipc$super(LoginServiceTask loginServiceTask, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public void doFinally() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bc23aff", new Object[]{this});
        }
    }

    /* renamed from: excuteTask */
    public abstract Result mo1127excuteTask(ILogin iLogin) throws Exception;

    public LoginServiceTask() {
        Login.sendUT("LoginAPI_LoginServiceTask");
    }

    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        try {
            ILogin loginService = getLoginService();
            if (loginService != null) {
                mo1127excuteTask(loginService);
            } else {
                LoginStatus.resetLoginFlag();
                Login.notifyLoginFailedOnServiceTimeout();
            }
            try {
                doFinally();
            } catch (Throwable th) {
                th.printStackTrace();
            }
            try {
                if (this.connection == null) {
                    return;
                }
                Services.unbind(Login.mContext, this.connection);
                this.connection = null;
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        } catch (Throwable th3) {
            try {
                reportError("LoginServiceTask_run_Error", "LoginServiceTask run excute failed", th3);
                LoginStatus.resetLoginFlag();
                Login.notifyLoginFailedOnServiceTimeout();
                try {
                    doFinally();
                } catch (Throwable th4) {
                    th4.printStackTrace();
                }
                try {
                    if (this.connection == null) {
                        return;
                    }
                    Services.unbind(Login.mContext, this.connection);
                    this.connection = null;
                } catch (Throwable th5) {
                    th5.printStackTrace();
                }
            } catch (Throwable th6) {
                try {
                    doFinally();
                } catch (Throwable th7) {
                    th7.printStackTrace();
                }
                try {
                    if (this.connection != null) {
                        Services.unbind(Login.mContext, this.connection);
                        this.connection = null;
                    }
                } catch (Throwable th8) {
                    th8.printStackTrace();
                }
                throw th6;
            }
        }
    }

    @Override // android.os.AsyncTask
    public Result doInBackground(Params... paramsArr) {
        Result result;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Result) ipChange.ipc$dispatch("e83e4786", new Object[]{this, paramsArr});
        }
        try {
            ILogin loginService = getLoginService();
            if (loginService != null) {
                result = mo1127excuteTask(loginService);
            } else {
                LoginStatus.resetLoginFlag();
                Login.notifyLoginFailedOnServiceTimeout();
                result = null;
            }
            try {
                doFinally();
            } catch (Throwable th) {
                th.printStackTrace();
            }
            try {
                if (this.connection != null) {
                    Services.unbind(Login.mContext, this.connection);
                    this.connection = null;
                }
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
            return result;
        } catch (Throwable th3) {
            try {
                reportError("LoginServiceTask_bg_Error", "LoginServiceTask bg excute faile", th3);
                LoginStatus.resetLoginFlag();
                Login.notifyLoginFailedOnServiceTimeout();
                try {
                    doFinally();
                } catch (Throwable th4) {
                    th4.printStackTrace();
                }
                try {
                    if (this.connection == null) {
                        return null;
                    }
                    Services.unbind(Login.mContext, this.connection);
                    this.connection = null;
                    return null;
                } catch (Throwable th5) {
                    th5.printStackTrace();
                    return null;
                }
            } catch (Throwable th6) {
                try {
                    doFinally();
                } catch (Throwable th7) {
                    th7.printStackTrace();
                }
                try {
                    if (this.connection != null) {
                        Services.unbind(Login.mContext, this.connection);
                        this.connection = null;
                    }
                } catch (Throwable th8) {
                    th8.printStackTrace();
                }
                throw th6;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.taobao.login4android.api.aidl.ILogin getLoginService() {
        /*
            r4 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.login4android.api.LoginServiceTask.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L15
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r4
            java.lang.String r2 = "150fa670"
            java.lang.Object r0 = r0.ipc$dispatch(r2, r1)
            com.taobao.login4android.api.aidl.ILogin r0 = (com.taobao.login4android.api.aidl.ILogin) r0
            return r0
        L15:
            r0 = 0
            java.lang.String r1 = "Login_bindService"
            com.taobao.statistic.TBS.Ext.commitEvent(r1, r0)
            com.taobao.login4android.api.LoginTrackableServiceConnection r1 = new com.taobao.login4android.api.LoginTrackableServiceConnection     // Catch: java.lang.Throwable -> L4d
            r1.<init>()     // Catch: java.lang.Throwable -> L4d
            r4.connection = r1     // Catch: java.lang.Throwable -> L4d
            android.content.Context r1 = com.taobao.login4android.api.Login.mContext     // Catch: java.lang.Throwable -> L4d
            java.lang.Class<com.taobao.login4android.api.aidl.ILogin> r2 = com.taobao.login4android.api.aidl.ILogin.class
            com.taobao.login4android.api.LoginTrackableServiceConnection r3 = r4.connection     // Catch: java.lang.Throwable -> L4d
            com.taobao.android.service.Services.bind(r1, r2, r3)     // Catch: java.lang.Throwable -> L4d
            com.taobao.login4android.api.LoginTrackableServiceConnection r1 = r4.connection     // Catch: java.lang.InterruptedException -> L34 java.util.concurrent.TimeoutException -> L3d java.lang.Throwable -> L4d
            r2 = 10000(0x2710, double:4.9407E-320)
            android.os.IBinder r1 = r1.waitUntilConnected(r2)     // Catch: java.lang.InterruptedException -> L34 java.util.concurrent.TimeoutException -> L3d java.lang.Throwable -> L4d
            goto L46
        L34:
            r1 = move-exception
            java.lang.String r2 = "LoginServiceTask_Interrupt"
            java.lang.String r3 = "ILogin Service connection Interrupt"
            reportError(r2, r3, r1)     // Catch: java.lang.Throwable -> L4d
            return r0
        L3d:
            r1 = move-exception
            java.lang.String r2 = "LoginServiceTask_Timeout"
            java.lang.String r3 = "ILogin Service connection timeout"
            reportError(r2, r3, r1)     // Catch: java.lang.Throwable -> L4d
            r1 = r0
        L46:
            if (r1 == 0) goto L55
            com.taobao.login4android.api.aidl.ILogin r1 = com.taobao.login4android.api.aidl.ILogin.Stub.asInterface(r1)     // Catch: java.lang.Throwable -> L4d
            goto L56
        L4d:
            r1 = move-exception
            java.lang.String r2 = "LoginServiceTask_Error"
            java.lang.String r3 = "ILogin Service connection Error"
            reportError(r2, r3, r1)
        L55:
            r1 = r0
        L56:
            if (r1 != 0) goto L5d
            java.lang.String r2 = "Login_bindServiceFailed"
            com.taobao.statistic.TBS.Ext.commitEvent(r2, r0)
        L5d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.login4android.api.LoginServiceTask.getLoginService():com.taobao.login4android.api.aidl.ILogin");
    }

    private static void reportError(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2387c006", new Object[]{str, str2, th});
            return;
        }
        Login.sendUT(str);
        LoginTLogAdapter.e(TAG, str2, th);
    }
}
