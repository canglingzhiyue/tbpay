package com.ali.user.open.ucc.data;

import com.ali.user.open.core.AliMemberSDK;
import com.ali.user.open.core.callback.MemberCallback;
import com.ali.user.open.core.model.RpcRequest;
import com.ali.user.open.core.model.RpcRequestCallbackWithCode;
import com.ali.user.open.core.model.RpcResponse;
import com.ali.user.open.core.service.RpcService;
import com.ali.user.open.ucc.UccDataProvider;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class DefaultDataProvider implements UccDataProvider {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1883554577);
        kge.a(-2073391594);
    }

    @Override // com.ali.user.open.ucc.UccDataProvider
    public void getUserToken(String str, final MemberCallback<String> memberCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6abf9df", new Object[]{this, str, memberCallback});
            return;
        }
        RpcRequest rpcRequest = new RpcRequest();
        rpcRequest.target = "mtop.alibaba.ucc.taobao.apply.usertoken";
        rpcRequest.version = "1.0";
        rpcRequest.NEED_ECODE = true;
        rpcRequest.NEED_SESSION = true;
        ((RpcService) AliMemberSDK.getService(RpcService.class)).remoteBusiness(rpcRequest, UserTokenModel.class, new RpcRequestCallbackWithCode() { // from class: com.ali.user.open.ucc.data.DefaultDataProvider.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.ali.user.open.core.model.RpcRequestCallbackWithCode
            public void onSuccess(RpcResponse rpcResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("88061ca", new Object[]{this, rpcResponse});
                    return;
                }
                UserTokenModel userTokenModel = (UserTokenModel) rpcResponse.returnValue;
                if (rpcResponse != null && rpcResponse.returnValue != 0) {
                    String str2 = userTokenModel.userToken;
                    MemberCallback memberCallback2 = memberCallback;
                    if (memberCallback2 == null) {
                        return;
                    }
                    memberCallback2.onSuccess(str2);
                    return;
                }
                MemberCallback memberCallback3 = memberCallback;
                if (memberCallback3 == null) {
                    return;
                }
                memberCallback3.onFailure(1004, rpcResponse == null ? "" : rpcResponse.message);
            }

            @Override // com.ali.user.open.core.model.RpcRequestCallbackWithCode
            public void onSystemError(String str2, RpcResponse rpcResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("96a636ea", new Object[]{this, str2, rpcResponse});
                    return;
                }
                MemberCallback memberCallback2 = memberCallback;
                if (memberCallback2 == null) {
                    return;
                }
                memberCallback2.onFailure(1004, rpcResponse == null ? "" : rpcResponse.message);
            }

            @Override // com.ali.user.open.core.model.RpcRequestCallbackWithCode
            public void onError(String str2, RpcResponse rpcResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3aace899", new Object[]{this, str2, rpcResponse});
                    return;
                }
                MemberCallback memberCallback2 = memberCallback;
                if (memberCallback2 == null) {
                    return;
                }
                memberCallback2.onFailure(1004, rpcResponse == null ? "" : rpcResponse.message);
            }
        });
    }
}
