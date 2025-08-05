package com.ali.user.mobile.login.presenter;

import android.app.Activity;
import android.text.TextUtils;
import com.ali.user.mobile.ability.excutor.ExecutorCenter;
import com.ali.user.mobile.ability.excutor.ExecutorContext;
import com.ali.user.mobile.ability.excutor.ExecutorResult;
import com.ali.user.mobile.ability.excutor.login.LoginExecutorParams;
import com.ali.user.mobile.callback.DataCallback;
import com.ali.user.mobile.data.model.SmsApplyResult;
import com.ali.user.mobile.log.ApiReferer;
import com.ali.user.mobile.login.CommonUICallback;
import com.ali.user.mobile.login.ui.BaseLoginView;
import com.ali.user.mobile.model.LoginParam;
import com.ali.user.mobile.model.LoginType;
import com.ali.user.mobile.model.TrackingModel;
import com.ali.user.mobile.rpc.RpcResponse;
import com.ali.user.mobile.rpc.login.model.LoginReturnData;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes2.dex */
public class EmailLoginPresenter extends BaseLoginPresenter {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String emailSid;

    static {
        kge.a(1195706278);
    }

    @Override // com.ali.user.mobile.login.presenter.BaseLoginPresenter
    public String getLocalLoginType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c11b97ab", new Object[]{this}) : "emailLogin";
    }

    public EmailLoginPresenter(BaseLoginView baseLoginView, LoginParam loginParam) {
        super(baseLoginView, loginParam);
    }

    public void buildEmailLoginParam(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51b7972d", new Object[]{this, str, str2});
            return;
        }
        if (this.mLoginParam == null) {
            this.mLoginParam = new LoginParam();
        }
        this.mLoginParam.nativeLoginType = LoginType.ServerLoginType.EmailLogin.getType();
        this.mLoginParam.isFromAccount = this.mViewer.isHistoryMode();
        this.mLoginParam.site = this.mViewer.getLoginSite();
        this.mLoginParam.loginId = str;
        this.mLoginParam.smsCode = str2;
        if (this.mLoginParam.ext == null) {
            this.mLoginParam.ext = new HashMap();
        }
        this.mLoginParam.ext.put("apiReferer", ApiReferer.generateApiReferer());
        this.mLoginParam.ext.put("showReigsterPolicy", "true");
        if (!this.mLoginParam.isFromAccount) {
            this.mLoginParam.deviceTokenKey = "";
        }
        this.mLoginParam.hid = 0L;
    }

    public void sendEmailCode(Activity activity, LoginParam loginParam, final CommonUICallback commonUICallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6416dc94", new Object[]{this, activity, loginParam, commonUICallback});
            return;
        }
        LoginExecutorParams loginExecutorParams = new LoginExecutorParams();
        loginExecutorParams.type = getLocalLoginType();
        loginExecutorParams.params = loginParam;
        ExecutorCenter.execute("sendlogincode", new ExecutorContext.ExcutorContextBuilder().context(activity).params(loginExecutorParams).build(), new DataCallback<ExecutorResult>() { // from class: com.ali.user.mobile.login.presenter.EmailLoginPresenter.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.ali.user.mobile.callback.DataCallback
            public void result(ExecutorResult executorResult) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("aeab9d99", new Object[]{this, executorResult});
                    return;
                }
                if (executorResult.success) {
                    RpcResponse rpcResponse = (RpcResponse) executorResult.bizInfo.get("data");
                    LoginReturnData loginReturnData = (LoginReturnData) rpcResponse.returnValue;
                    if (executorResult != null) {
                        EmailLoginPresenter.this.emailSid = ((LoginReturnData) rpcResponse.returnValue).extMap.get("emailSid");
                        if (TextUtils.equals(rpcResponse.actionType, "SUCCESS")) {
                            EmailLoginPresenter.this.sendSuccess(true, rpcResponse.code, loginReturnData.extMap, commonUICallback);
                            return;
                        }
                    }
                }
                EmailLoginPresenter.this.sendToast(executorResult);
            }
        });
    }

    public void sendSuccess(boolean z, int i, Map<String, String> map, CommonUICallback commonUICallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("744aef71", new Object[]{this, new Boolean(z), new Integer(i), map, commonUICallback});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("millSecond", 60000L);
        hashMap.put("needToast", String.valueOf(z));
        hashMap.put("errorCode", Integer.valueOf(i));
        if (map != null) {
            hashMap.put("result", JSON.parseObject(JSON.toJSONString(map), SmsApplyResult.class));
        }
        if (commonUICallback == null) {
            return;
        }
        commonUICallback.onResult(CommonUICallback.ACTION_HANDLE_SEND_EMAIL_SUCCESS, hashMap);
    }

    public String getEmailSid() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a9a362f1", new Object[]{this}) : this.emailSid;
    }

    private TrackingModel buildTrackingModel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TrackingModel) ipChange.ipc$dispatch("5f618518", new Object[]{this});
        }
        TrackingModel trackingModel = new TrackingModel();
        trackingModel.pageName = this.mViewer.getPageName();
        trackingModel.loginType = LoginType.ServerLoginType.EmailLogin.getType();
        trackingModel.traceId = ApiReferer.generateTraceId(trackingModel.loginType, trackingModel.pageName);
        return trackingModel;
    }
}
