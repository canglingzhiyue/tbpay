package com.alipay.literpc.android.phone.mrpc.core.gwprotocol;

import com.alipay.literpc.android.phone.mrpc.core.RpcException;

/* loaded from: classes3.dex */
public interface Serializer {
    byte[] packet() throws RpcException;

    void setExtParam(Object obj) throws RpcException;
}
