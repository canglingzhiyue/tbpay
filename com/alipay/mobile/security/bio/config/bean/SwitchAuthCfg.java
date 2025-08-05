package com.alipay.mobile.security.bio.config.bean;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class SwitchAuthCfg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f5783a;
    private String b;
    private int c;

    public boolean getEnable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5f06e884", new Object[]{this})).booleanValue() : "TRUE".equalsIgnoreCase(this.f5783a);
    }

    public void setEnable(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4fc5556", new Object[]{this, str});
        } else {
            this.f5783a = str;
        }
    }

    public int getReturnCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7439b22d", new Object[]{this})).intValue() : this.c;
    }

    public void setReturnCode(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49d3a17d", new Object[]{this, new Integer(i)});
        } else {
            this.c = i;
        }
    }

    public String getMessage() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c8c32fc8", new Object[]{this}) : this.b;
    }

    public void setMessage(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56a65216", new Object[]{this, str});
        } else {
            this.b = str;
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "SwitchAuthCfg{enable='" + this.f5783a + "', message='" + this.b + "', returnCode=" + this.c + '}';
    }
}
