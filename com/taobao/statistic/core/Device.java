package com.taobao.statistic.core;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

@Deprecated
/* loaded from: classes8.dex */
public class Device {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String udid = "";
    private String imei = "";
    private String imsi = "";

    static {
        kge.a(-271109036);
    }

    public void setUdid(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8fc84fd", new Object[]{this, str});
        } else {
            this.udid = str;
        }
    }

    public void setImei(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b71175b", new Object[]{this, str});
        } else {
            this.imei = str;
        }
    }

    public void setImsi(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d386e78d", new Object[]{this, str});
        } else {
            this.imsi = str;
        }
    }

    public String getUdid() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5e148e99", new Object[]{this}) : this.udid;
    }

    public String getImei() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7fb5387b", new Object[]{this}) : this.imei;
    }

    public String getImsi() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8e6b9a09", new Object[]{this}) : this.imsi;
    }
}
