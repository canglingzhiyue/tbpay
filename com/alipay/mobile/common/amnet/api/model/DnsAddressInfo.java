package com.alipay.mobile.common.amnet.api.model;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class DnsAddressInfo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String ip;
    public int port;

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "DnsAddressInfo{ip='" + this.ip + "', port=" + this.port + '}';
    }
}
