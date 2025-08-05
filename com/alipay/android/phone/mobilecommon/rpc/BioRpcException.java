package com.alipay.android.phone.mobilecommon.rpc;

import com.alipay.mobile.security.bio.service.local.rpc.IRpcException;
import com.alipay.vi.mobile.common.rpc.RpcException;

/* loaded from: classes3.dex */
public class BioRpcException extends RpcException implements IRpcException {
    public BioRpcException(RpcException rpcException) {
        super(Integer.valueOf(rpcException.getCode()), rpcException.getMsg());
    }
}
