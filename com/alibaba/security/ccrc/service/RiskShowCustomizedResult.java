package com.alibaba.security.ccrc.service;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class RiskShowCustomizedResult extends BaseCcrcDetectResult {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String url;

    public RiskShowCustomizedResult(String str, String str2, boolean z, boolean z2, String str3, String str4) {
        this.sampleID = str;
        this.dataID = str2;
        this.isRisk = z;
        this.success = z2;
        this.errorMsg = str3;
        this.url = str4;
    }

    public String getUrl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("de8f0660", new Object[]{this}) : this.url;
    }

    public RiskShowCustomizedResult(String str, String str2, boolean z, boolean z2, String str3) {
        this.sampleID = str;
        this.dataID = str2;
        this.isRisk = z;
        this.success = z2;
        this.errorMsg = str3;
    }

    public RiskShowCustomizedResult(boolean z, boolean z2, String str) {
        this.isRisk = z;
        this.success = z2;
        this.errorMsg = str;
    }
}
