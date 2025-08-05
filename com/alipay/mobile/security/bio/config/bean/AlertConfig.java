package com.alipay.mobile.security.bio.config.bean;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class AlertConfig {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f5777a;
    private String b;
    private String c;
    private String d;
    private int e;

    public String getTitle() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b5267f97", new Object[]{this}) : this.f5777a;
    }

    public void setTitle(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c820927", new Object[]{this, str});
        } else {
            this.f5777a = str;
        }
    }

    public String getLeftButtonText() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("84c74c9d", new Object[]{this}) : this.c;
    }

    public void setLeftButtonText(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24ee6879", new Object[]{this, str});
        } else {
            this.c = str;
        }
    }

    public String getRightButtonText() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("74722f94", new Object[]{this}) : this.d;
    }

    public void setRightButtonText(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3fb97ca", new Object[]{this, str});
        } else {
            this.d = str;
        }
    }

    public int getReturnCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7439b22d", new Object[]{this})).intValue() : this.e;
    }

    public void setReturnCode(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49d3a17d", new Object[]{this, new Integer(i)});
        } else {
            this.e = i;
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
        return "AlertConfig{title='" + this.f5777a + "', message='" + this.b + "', leftButtonText='" + this.c + "', rightButtonText='" + this.d + "', returnCode=" + this.e + '}';
    }
}
