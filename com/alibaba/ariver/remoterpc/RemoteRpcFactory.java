package com.alibaba.ariver.remoterpc;

import com.alipay.mobile.common.rpc.Config;
import com.alipay.mobile.common.rpc.RpcFactory;
import tb.kge;

/* loaded from: classes2.dex */
public class RemoteRpcFactory extends RpcFactory {
    static {
        kge.a(-1273528866);
    }

    public RemoteRpcFactory(Config config) {
        super(config);
        this.mRpcInvoker = new RemoteRpcCallClientInvoker(this);
    }
}
