package com.alipay.android.msp.core.model;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class PreposeCashierReqModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f4553a;
    private int b;
    private String c;
    private String d;
    private String e;
    private String f;

    public String getPa() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f5aa5972", new Object[]{this}) : this.f4553a;
    }

    public void setPa(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("142e2844", new Object[]{this, str});
        } else {
            this.f4553a = str;
        }
    }

    public int getHas_alipay() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4f0f857f", new Object[]{this})).intValue() : this.b;
    }

    public void setHas_alipay(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9b8386b", new Object[]{this, new Integer(i)});
        } else {
            this.b = i;
        }
    }

    public String getTid() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("12a13f40", new Object[]{this}) : this.c;
    }

    public void setTid(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30138b9e", new Object[]{this, str});
        } else {
            this.c = str;
        }
    }

    public String getUa() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("68a257b7", new Object[]{this}) : this.d;
    }

    public void setUa(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35f29f", new Object[]{this, str});
        } else {
            this.d = str;
        }
    }

    public String getUtdid() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3fdfad6f", new Object[]{this}) : this.e;
    }

    public void setUtdid(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68ee964f", new Object[]{this, str});
        } else {
            this.e = str;
        }
    }

    public String getExtinfo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1e517680", new Object[]{this}) : this.f;
    }

    public void setExtinfo(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2e0e25e", new Object[]{this, str});
        } else {
            this.f = str;
        }
    }
}
