package com.alipay.mobile.common.transport.httpdns.downloader;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class StrategyRequestItem {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f5594a;
    private String b;
    private String d;
    private String f;
    private String g;
    private int i;
    private String j;
    private String c = "Android";
    private int e = 4;
    private int h = 1;

    public String getUtdid() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3fdfad6f", new Object[]{this}) : this.b;
    }

    public void setUtdid(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68ee964f", new Object[]{this, str});
        } else {
            this.b = str;
        }
    }

    public String getOsType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f1b0b545", new Object[]{this}) : this.c;
    }

    public String getClientVersion() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("589c7882", new Object[]{this}) : this.d;
    }

    public void setClientVersion(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef92799c", new Object[]{this, str});
        } else {
            this.d = str;
        }
    }

    public String getUid() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ea2ce1f", new Object[]{this}) : this.f5594a;
    }

    public void setUid(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b443d89f", new Object[]{this, str});
        } else {
            this.f5594a = str;
        }
    }

    public int getVer() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("52a1fe67", new Object[]{this})).intValue() : this.e;
    }

    public void setVer(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc56a41b", new Object[]{this, new Integer(i)});
        } else {
            this.e = i;
        }
    }

    public String getWsid() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2a8c87ac", new Object[]{this}) : this.f;
    }

    public void setWsid(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb83ae4a", new Object[]{this, str});
        } else {
            this.f = str;
        }
    }

    public String getConfigVersion() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("738fbf79", new Object[]{this}) : this.g;
    }

    public void setConfigVersion(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33081185", new Object[]{this, str});
        } else {
            this.g = str;
        }
    }

    public int getSdkVersion() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("541225ae", new Object[]{this})).intValue() : this.h;
    }

    public void setSdkVersion(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65099e1c", new Object[]{this, new Integer(i)});
        } else {
            this.h = i;
        }
    }

    public int getNetType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3f8f4e3b", new Object[]{this})).intValue() : this.i;
    }

    public void setNetType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8a3e8c7", new Object[]{this, new Integer(i)});
        } else {
            this.i = i;
        }
    }

    public String getTradeNo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("59e3704a", new Object[]{this}) : this.j;
    }

    public void setTradeNo(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e98e21d4", new Object[]{this, str});
        } else {
            this.j = str;
        }
    }
}
