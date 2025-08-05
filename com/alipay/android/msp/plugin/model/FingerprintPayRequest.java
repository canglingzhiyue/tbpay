package com.alipay.android.msp.plugin.model;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class FingerprintPayRequest {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String mData;
    public boolean mIsSamsung = false;
    public int mScanType;
    public String mTipsMsg;
    public String mUserId;

    public FingerprintPayRequest() {
    }

    public FingerprintPayRequest(String str) {
        this.mData = str;
    }

    public static FingerprintPayRequest build(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FingerprintPayRequest) ipChange.ipc$dispatch("701f350b", new Object[]{str}) : new FingerprintPayRequest(str);
    }

    public static FingerprintPayRequest build() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FingerprintPayRequest) ipChange.ipc$dispatch("3efc5f01", new Object[0]) : new FingerprintPayRequest();
    }
}
