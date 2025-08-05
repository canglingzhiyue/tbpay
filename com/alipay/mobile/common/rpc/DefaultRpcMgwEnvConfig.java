package com.alipay.mobile.common.rpc;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class DefaultRpcMgwEnvConfig extends RpcMgwEnvConfig {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public String getUserMgwUrl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("58ceeb26", new Object[]{this}) : "";
    }

    @Override // com.alipay.mobile.common.rpc.RpcMgwEnvConfig
    public String getMgwUrl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4d4c6af1", new Object[]{this}) : getUserMgwUrl();
    }
}
