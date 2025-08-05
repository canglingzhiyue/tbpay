package com.alibaba.security.ccrc.service;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class BaseCcrcDetectResult {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String dataID;
    public String errorMsg;
    public boolean isRisk;
    public String sampleID;
    public boolean success;

    public String getDataID() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9b05f89e", new Object[]{this}) : this.dataID;
    }

    public String getErrorMsg() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e1cc388a", new Object[]{this}) : this.errorMsg;
    }

    public String getSampleID() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("25281e", new Object[]{this}) : this.sampleID;
    }

    public boolean isRisk() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8fa29724", new Object[]{this})).booleanValue() : this.isRisk;
    }

    public boolean isSuccess() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6049a784", new Object[]{this})).booleanValue() : this.success;
    }
}
