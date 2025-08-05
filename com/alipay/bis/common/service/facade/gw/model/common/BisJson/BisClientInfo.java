package com.alipay.bis.common.service.facade.gw.model.common.BisJson;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class BisClientInfo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String clientVer;
    public String model;
    public String os;
    public String osVer;

    public String getModel() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a78b0366", new Object[]{this}) : this.model;
    }

    public void setModel(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6adff38", new Object[]{this, str});
        } else {
            this.model = str;
        }
    }

    public String getOs() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("20dfdf5f", new Object[]{this}) : this.os;
    }

    public void setOs(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4fa95ff7", new Object[]{this, str});
        } else {
            this.os = str;
        }
    }

    public String getOsVer() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1b0b6d30", new Object[]{this}) : this.osVer;
    }

    public void setOsVer(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f33aceae", new Object[]{this, str});
        } else {
            this.osVer = str;
        }
    }

    public String getClientVer() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1221e317", new Object[]{this}) : this.clientVer;
    }

    public void setClientVer(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4583ba7", new Object[]{this, str});
        } else {
            this.clientVer = str;
        }
    }
}
