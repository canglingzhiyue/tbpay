package com.alipay.android.msp.model;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class H5PayResultModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f4914a;
    private String b;

    public String getReturnUrl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("78c16730", new Object[]{this}) : this.f4914a;
    }

    public void setReturnUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21a93aae", new Object[]{this, str});
        } else {
            this.f4914a = str;
        }
    }

    public String getResultCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("30496759", new Object[]{this}) : this.b;
    }

    public void setResultCode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4fcd0b3d", new Object[]{this, str});
        } else {
            this.b = str;
        }
    }
}
