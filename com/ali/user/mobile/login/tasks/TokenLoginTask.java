package com.ali.user.mobile.login.tasks;

import mtopsdk.common.util.StringUtils;
import com.ali.user.mobile.callback.RpcRequestCallback;
import com.ali.user.mobile.login.LoginDataRepository;
import com.ali.user.mobile.model.LoginBaseParam;
import com.ali.user.mobile.model.LoginType;
import com.ali.user.mobile.rpc.login.model.LoginReturnData;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class TokenLoginTask extends BaseLoginTask {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-114751132);
    }

    @Override // com.ali.user.mobile.login.tasks.BaseLoginTask
    public String getLocalLoginType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c11b97ab", new Object[]{this}) : LoginType.LocalLoginType.TOKEN_LOGIN;
    }

    @Override // com.ali.user.mobile.login.tasks.BaseLoginTask
    public void invokeLoginRpc(LoginBaseParam loginBaseParam, RpcRequestCallback<LoginReturnData> rpcRequestCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75fb9247", new Object[]{this, loginBaseParam, rpcRequestCallback});
        } else {
            LoginDataRepository.getInstance().loginByToken(loginBaseParam, rpcRequestCallback);
        }
    }

    @Override // com.ali.user.mobile.login.tasks.BaseLoginTask
    public String getLoginType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e149d18c", new Object[]{this});
        }
        if (this.loginParam != null && !StringUtils.isEmpty(this.loginParam.nativeLoginType)) {
            return this.loginParam.nativeLoginType;
        }
        return LoginType.ServerLoginType.TokenLogin.getType();
    }
}
