package com.ali.user.mobile.callback;

import com.ali.user.mobile.rpc.RpcResponse;

/* loaded from: classes2.dex */
public interface RpcRequestCallback<T> {
    void onError(RpcResponse<T> rpcResponse);

    void onSuccess(RpcResponse<T> rpcResponse);
}
