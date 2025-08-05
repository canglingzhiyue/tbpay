package com.ali.user.mobile.login;

import android.app.Activity;
import com.ali.user.mobile.base.BaseView;
import com.ali.user.mobile.callback.LoginTasksCallback;
import com.ali.user.mobile.login.tasks.EmailLoginTask;
import com.ali.user.mobile.login.tasks.EmailSendTask;
import com.ali.user.mobile.login.tasks.FaceLoginTask;
import com.ali.user.mobile.login.tasks.FingerTask;
import com.ali.user.mobile.login.tasks.MobileVerifyLoginTask;
import com.ali.user.mobile.login.tasks.NickSmsLoginTask;
import com.ali.user.mobile.login.tasks.NickSmsSendTask;
import com.ali.user.mobile.login.tasks.OverseaSimLoginTask;
import com.ali.user.mobile.login.tasks.PwdLoginTask;
import com.ali.user.mobile.login.tasks.SNSLoginTask;
import com.ali.user.mobile.login.tasks.SimLoginTask;
import com.ali.user.mobile.login.tasks.SmsLoginTask;
import com.ali.user.mobile.login.tasks.SmsSendTask;
import com.ali.user.mobile.login.tasks.TokenLoginTask;
import com.ali.user.mobile.model.LoginBaseParam;
import com.ali.user.mobile.model.LoginParam;
import com.ali.user.mobile.model.LoginType;
import com.ali.user.mobile.model.TrackingModel;
import com.ali.user.mobile.rpc.login.model.LoginReturnData;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.sns4android.SNSPlatform;
import org.json.JSONObject;
import tb.kge;

/* loaded from: classes2.dex */
public class LoginApi {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "LoginManager";
    private static LoginApi instance;

    static {
        kge.a(-1657982689);
        instance = null;
    }

    private LoginApi() {
    }

    public static LoginApi getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LoginApi) ipChange.ipc$dispatch("723bcf4", new Object[0]);
        }
        if (instance == null) {
            synchronized (LoginApi.class) {
                if (instance == null) {
                    instance = new LoginApi();
                }
            }
        }
        return instance;
    }

    public static void fingerLogin(LoginParam loginParam, TrackingModel trackingModel, BaseView baseView, LoginTasksCallback<LoginReturnData> loginTasksCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27d7ca39", new Object[]{loginParam, trackingModel, baseView, loginTasksCallback});
        } else {
            new FingerTask().login(loginParam, trackingModel, baseView, loginTasksCallback);
        }
    }

    public static void pwdLogin(LoginParam loginParam, TrackingModel trackingModel, BaseView baseView, LoginTasksCallback<LoginReturnData> loginTasksCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9db54c0d", new Object[]{loginParam, trackingModel, baseView, loginTasksCallback});
        } else {
            new PwdLoginTask().login(loginParam, trackingModel, baseView, loginTasksCallback);
        }
    }

    public static void smsSend(LoginParam loginParam, TrackingModel trackingModel, BaseView baseView, LoginTasksCallback<LoginReturnData> loginTasksCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adc87418", new Object[]{loginParam, trackingModel, baseView, loginTasksCallback});
        } else {
            new SmsSendTask().login(loginParam, trackingModel, baseView, loginTasksCallback);
        }
    }

    public static void nickSmsSend(LoginParam loginParam, TrackingModel trackingModel, BaseView baseView, LoginTasksCallback<LoginReturnData> loginTasksCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eafb25b", new Object[]{loginParam, trackingModel, baseView, loginTasksCallback});
        } else {
            new NickSmsSendTask().login(loginParam, trackingModel, baseView, loginTasksCallback);
        }
    }

    public static void smsLogin(LoginParam loginParam, TrackingModel trackingModel, BaseView baseView, LoginTasksCallback<LoginReturnData> loginTasksCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82c5dc29", new Object[]{loginParam, trackingModel, baseView, loginTasksCallback});
        } else {
            new SmsLoginTask().login(loginParam, trackingModel, baseView, loginTasksCallback);
        }
    }

    public static void nickSmsLogin(LoginParam loginParam, TrackingModel trackingModel, BaseView baseView, LoginTasksCallback<LoginReturnData> loginTasksCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eec66646", new Object[]{loginParam, trackingModel, baseView, loginTasksCallback});
        } else {
            new NickSmsLoginTask().login(loginParam, trackingModel, baseView, loginTasksCallback);
        }
    }

    public static void simLogin(LoginParam loginParam, TrackingModel trackingModel, BaseView baseView, LoginTasksCallback<LoginReturnData> loginTasksCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("877d36a7", new Object[]{loginParam, trackingModel, baseView, loginTasksCallback});
        } else {
            new SimLoginTask().login(loginParam, trackingModel, baseView, loginTasksCallback);
        }
    }

    public static void overseaSimLogin(LoginParam loginParam, TrackingModel trackingModel, BaseView baseView, LoginTasksCallback<LoginReturnData> loginTasksCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a23b62c", new Object[]{loginParam, trackingModel, baseView, loginTasksCallback});
        } else {
            new OverseaSimLoginTask().login(loginParam, trackingModel, baseView, loginTasksCallback);
        }
    }

    public static void mobileVerifyLogin(LoginParam loginParam, TrackingModel trackingModel, BaseView baseView, LoginTasksCallback<LoginReturnData> loginTasksCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eefaf78b", new Object[]{loginParam, trackingModel, baseView, loginTasksCallback});
        } else {
            new MobileVerifyLoginTask().login(loginParam, trackingModel, baseView, loginTasksCallback);
        }
    }

    public static void tokenLogin(LoginParam loginParam, TrackingModel trackingModel, BaseView baseView, LoginTasksCallback<LoginReturnData> loginTasksCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61e068c9", new Object[]{loginParam, trackingModel, baseView, loginTasksCallback});
        } else {
            new TokenLoginTask().login(loginParam, trackingModel, baseView, loginTasksCallback);
        }
    }

    public static void faceLogin(LoginParam loginParam, TrackingModel trackingModel, BaseView baseView, LoginTasksCallback<LoginReturnData> loginTasksCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5413f2d", new Object[]{loginParam, trackingModel, baseView, loginTasksCallback});
        } else {
            new FaceLoginTask().login(loginParam, trackingModel, baseView, loginTasksCallback);
        }
    }

    public static void commonLogin(String str, LoginBaseParam loginBaseParam, BaseView baseView, LoginTasksCallback<LoginReturnData> loginTasksCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec3279fd", new Object[]{str, loginBaseParam, baseView, loginTasksCallback});
            return;
        }
        TrackingModel trackingModel = new TrackingModel();
        trackingModel.pageName = loginBaseParam.utPageName;
        trackingModel.traceId = loginBaseParam.sdkTraceId;
        if (LoginType.LocalLoginType.SCAN_FACE_LOGIN.equals(str)) {
            trackingModel.loginType = LoginType.ServerLoginType.FaceLogin.getType();
            new FaceLoginTask().login(loginBaseParam, trackingModel, baseView, loginTasksCallback);
        } else if (LoginType.LocalLoginType.MOBILE_VERIFY_LOGIN.equals(str)) {
            trackingModel.loginType = str;
            new MobileVerifyLoginTask().login(loginBaseParam, trackingModel, baseView, loginTasksCallback);
        } else if (LoginType.LocalLoginType.SIM_LOGIN.equals(str)) {
            trackingModel.loginType = str;
            new SimLoginTask().login(loginBaseParam, trackingModel, baseView, loginTasksCallback);
        } else if (LoginType.LocalLoginType.NICK_SMS_LOGIN.equals(str)) {
            trackingModel.loginType = LoginType.ServerLoginType.SMSLogin.getType();
            new NickSmsLoginTask().login(loginBaseParam, trackingModel, baseView, loginTasksCallback);
        } else if (LoginType.LocalLoginType.SMS_LOGIN.equals(str)) {
            trackingModel.loginType = LoginType.ServerLoginType.SMSLogin.getType();
            new SmsLoginTask().login(loginBaseParam, trackingModel, baseView, loginTasksCallback);
        } else if (LoginType.LocalLoginType.PWD_LOGIN.equals(str)) {
            trackingModel.loginType = LoginType.ServerLoginType.PasswordLogin.getType();
            new PwdLoginTask().login(loginBaseParam, trackingModel, baseView, loginTasksCallback);
        } else if (LoginType.LocalLoginType.BIO_LOGIN.equals(str)) {
            trackingModel.loginType = LoginType.ServerLoginType.BIOLOGIN.getType();
            new FingerTask().login(loginBaseParam, trackingModel, baseView, loginTasksCallback);
        } else if (LoginType.LocalLoginType.OVERSEA_SIM_LOGIN.equals(str)) {
            trackingModel.loginType = LoginType.ServerLoginType.OverseaSimLogin.getType();
            new OverseaSimLoginTask().login(loginBaseParam, trackingModel, baseView, loginTasksCallback);
        } else if (!"emailLogin".equals(str)) {
        } else {
            trackingModel.loginType = LoginType.ServerLoginType.EmailLogin.getType();
            new EmailLoginTask().login(loginBaseParam, trackingModel, baseView, loginTasksCallback);
        }
    }

    public static void snsLogin(SNSPlatform sNSPlatform, LoginBaseParam loginBaseParam, Activity activity, JSONObject jSONObject, LoginTasksCallback<LoginReturnData> loginTasksCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e74a302", new Object[]{sNSPlatform, loginBaseParam, activity, jSONObject, loginTasksCallback});
            return;
        }
        TrackingModel trackingModel = new TrackingModel();
        trackingModel.pageName = loginBaseParam.utPageName;
        trackingModel.traceId = loginBaseParam.sdkTraceId;
        trackingModel.loginType = LoginType.convert(sNSPlatform.getPlatform());
        new SNSLoginTask(sNSPlatform, activity, jSONObject).login(loginBaseParam, trackingModel, null, loginTasksCallback);
    }

    public static void commonSend(String str, LoginBaseParam loginBaseParam, BaseView baseView, LoginTasksCallback<LoginReturnData> loginTasksCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8a01d52", new Object[]{str, loginBaseParam, baseView, loginTasksCallback});
            return;
        }
        TrackingModel trackingModel = new TrackingModel();
        trackingModel.pageName = loginBaseParam.utPageName;
        trackingModel.traceId = loginBaseParam.sdkTraceId;
        if (LoginType.LocalLoginType.NICK_SMS_LOGIN.equals(str)) {
            trackingModel.loginType = LoginType.ServerLoginType.SMSLogin.getType();
            new NickSmsSendTask().login(loginBaseParam, trackingModel, baseView, loginTasksCallback);
        } else if (LoginType.LocalLoginType.SMS_LOGIN.equals(str)) {
            trackingModel.loginType = LoginType.ServerLoginType.SMSLogin.getType();
            new SmsSendTask().login(loginBaseParam, trackingModel, baseView, loginTasksCallback);
        } else if (!"emailLogin".equals(str)) {
        } else {
            trackingModel.loginType = LoginType.ServerLoginType.EmailLogin.getType();
            new EmailSendTask().login(loginBaseParam, trackingModel, baseView, loginTasksCallback);
        }
    }
}
