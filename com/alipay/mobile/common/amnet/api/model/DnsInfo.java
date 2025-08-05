package com.alipay.mobile.common.amnet.api.model;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* loaded from: classes3.dex */
public class DnsInfo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public List<DnsAddressInfo> dnsAddressInfoList;
    public String domain;
    public long ttl;

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        sb.append("DnsInfo{domain='");
        sb.append(this.domain);
        sb.append('\'');
        sb.append(", dnsAddressInfoList=");
        List<DnsAddressInfo> list = this.dnsAddressInfoList;
        sb.append(list != null ? list.toString() : "is null");
        sb.append(", ttl=");
        sb.append(this.ttl);
        sb.append('}');
        return sb.toString();
    }
}
