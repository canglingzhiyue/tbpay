package com.alipay.bis.core.protocol;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class BisMetaInfo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String fmt = "1";
    private String evVer = "EYE";
    private String feVer = "5.2";
    private String hwVer = "1.0";
    private String bEva = "0";

    public String getFmt() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("dbad7e02", new Object[]{this}) : this.fmt;
    }

    public void setFmt(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("888f251c", new Object[]{this, str});
        } else {
            this.fmt = str;
        }
    }

    public String getEvVer() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("951f14fd", new Object[]{this}) : this.evVer;
    }

    public void setEvVer(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb9c2081", new Object[]{this, str});
        } else {
            this.evVer = str;
        }
    }

    public String getbEva() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c14bc315", new Object[]{this}) : this.bEva;
    }

    public void setbEva(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fcabe001", new Object[]{this, str});
        } else {
            this.bEva = str;
        }
    }

    public String getFeVer() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("cfc34b0b", new Object[]{this}) : this.feVer;
    }

    public void setFeVer(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d57eac33", new Object[]{this, str});
        } else {
            this.feVer = str;
        }
    }

    public String getHwVer() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1edb5b5b", new Object[]{this}) : this.hwVer;
    }

    public void setHwVer(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6968a5e3", new Object[]{this, str});
        } else {
            this.hwVer = str;
        }
    }
}
