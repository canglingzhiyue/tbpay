package com.alipay.bis.common.service.facade.gw.model.common.BisJson;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class BisBehavCommon {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String invtp;
    public String retry;
    public String tm;

    public String getInvtp() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("47105ae2", new Object[]{this}) : this.invtp;
    }

    public void setInvtp(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47d3973c", new Object[]{this, str});
        } else {
            this.invtp = str;
        }
    }

    public String getTm() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6cb57dea", new Object[]{this}) : this.tm;
    }

    public void setTm(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e8792cc", new Object[]{this, str});
        } else {
            this.tm = str;
        }
    }

    public String getRetry() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e04ed147", new Object[]{this}) : this.retry;
    }

    public void setRetry(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d663ed77", new Object[]{this, str});
        } else {
            this.retry = str;
        }
    }
}
