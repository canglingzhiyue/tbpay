package com.alipay.mobile.common.rpc;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public abstract class RpcMgwEnvConfig {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public String getAppId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("94038553", new Object[]{this}) : "";
    }

    public String getAppKey() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("49079005", new Object[]{this}) : "";
    }

    public String getMgwUrl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4d4c6af1", new Object[]{this}) : "";
    }
}
