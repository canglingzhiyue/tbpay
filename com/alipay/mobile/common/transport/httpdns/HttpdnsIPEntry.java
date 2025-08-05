package com.alipay.mobile.common.transport.httpdns;

import com.android.alibaba.ip.runtime.IpChange;
import tb.riy;

/* loaded from: classes3.dex */
public class HttpdnsIPEntry {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String ip;
    public int ipType;
    public int port;

    public HttpdnsIPEntry() {
        this.ipType = HttpDns.IP_TYPE_V4;
    }

    public HttpdnsIPEntry(String str, int i, int i2) {
        this.ip = str;
        this.ipType = i;
        this.port = i2;
    }

    public String getIpWithPort() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("85540d5", new Object[]{this});
        }
        if (this.ipType == HttpDns.IP_TYPE_V4) {
            return this.ip + ":" + this.port;
        }
        return riy.ARRAY_START_STR + this.ip + "]:" + this.port;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "HttpdnsIPEntry{ip='" + this.ip + "', port=" + this.port + ", ipType=" + this.ipType + '}';
    }
}
