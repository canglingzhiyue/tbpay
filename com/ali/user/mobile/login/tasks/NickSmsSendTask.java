package com.ali.user.mobile.login.tasks;

import com.ali.user.mobile.callback.RpcRequestCallback;
import com.ali.user.mobile.data.LoginComponent;
import com.ali.user.mobile.model.LoginBaseParam;
import com.ali.user.mobile.model.LoginType;
import com.ali.user.mobile.rpc.login.model.LoginReturnData;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class NickSmsSendTask extends SmsSendTask {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1446515372);
    }

    @Override // com.ali.user.mobile.login.tasks.SmsSendTask, com.ali.user.mobile.login.tasks.BaseLoginTask
    public String getLocalLoginType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c11b97ab", new Object[]{this}) : LoginType.LocalLoginType.NICK_SMS_LOGIN;
    }

    @Override // com.ali.user.mobile.login.tasks.SmsSendTask, com.ali.user.mobile.login.tasks.BaseLoginTask
    public void invokeLoginRpc(LoginBaseParam loginBaseParam, RpcRequestCallback<LoginReturnData> rpcRequestCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75fb9247", new Object[]{this, loginBaseParam, rpcRequestCallback});
        } else {
            LoginComponent.getInstance().sendSmsByLoginWithNick(loginBaseParam, rpcRequestCallback);
        }
    }

    @Override // com.ali.user.mobile.login.tasks.SmsSendTask, com.ali.user.mobile.login.tasks.BaseLoginTask
    public String getLoginType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e149d18c", new Object[]{this}) : LoginType.ServerLoginType.SMSLogin.getType();
    }
}
