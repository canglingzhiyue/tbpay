package com.alipay.literpc.android.phone.mrpc.core;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public abstract class RpcClient {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public abstract <T> T getRpcProxy(Class<T> cls, RpcParams rpcParams);
}
