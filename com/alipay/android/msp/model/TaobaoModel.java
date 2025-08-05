package com.alipay.android.msp.model;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class TaobaoModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String c = "";

    /* renamed from: a  reason: collision with root package name */
    private String f4915a = "";
    private String b = "";
    private String d = "";

    public String getReturnUrl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("78c16730", new Object[]{this}) : this.c;
    }

    public void setReturnUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21a93aae", new Object[]{this, str});
        } else {
            this.c = str;
        }
    }

    public String getPayOrderId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9f9ca022", new Object[]{this}) : this.b;
    }

    public void setPayOrderId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cae0eb94", new Object[]{this, str});
        } else {
            this.b = str;
        }
    }

    public String getShowUrl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("30af737d", new Object[]{this}) : this.f4915a;
    }

    public void setShowUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec428501", new Object[]{this, str});
        } else {
            this.f4915a = str;
        }
    }

    public String getTradeNo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("59e3704a", new Object[]{this}) : this.d;
    }

    public void setTradeNo(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e98e21d4", new Object[]{this, str});
        } else {
            this.d = str;
        }
    }
}
