package com.alipay.mobile.security.zim.api;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class ZIMMetaInfo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f5841a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;
    private String h;

    public String getZimVer() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6ed90f3e", new Object[]{this}) : this.h;
    }

    public void setZimVer(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf2c5f8", new Object[]{this, str});
        } else {
            this.h = str;
        }
    }

    public String getApdidToken() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e63dfe7a", new Object[]{this}) : this.f5841a;
    }

    public void setApdidToken(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("586b583c", new Object[]{this, str});
        } else {
            this.f5841a = str;
        }
    }

    public String getDeviceType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("37b43413", new Object[]{this}) : this.b;
    }

    public void setDeviceType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35bbd5c3", new Object[]{this, str});
        } else {
            this.b = str;
        }
    }

    public String getDeviceModel() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("fd868ddc", new Object[]{this}) : this.c;
    }

    public void setDeviceModel(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb025c82", new Object[]{this, str});
        } else {
            this.c = str;
        }
    }

    public String getAppName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("92150ca3", new Object[]{this}) : this.d;
    }

    public void setAppName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b790109b", new Object[]{this, str});
        } else {
            this.d = str;
        }
    }

    public String getAppVersion() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("65f009ac", new Object[]{this}) : this.e;
    }

    public void setAppVersion(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cefab34a", new Object[]{this, str});
        } else {
            this.e = str;
        }
    }

    public String getOsVersion() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5f114e1b", new Object[]{this}) : this.f;
    }

    public void setOsVersion(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5563123", new Object[]{this, str});
        } else {
            this.f = str;
        }
    }

    public String getBioMetaInfo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3056f7d4", new Object[]{this}) : this.g;
    }

    public void setBioMetaInfo(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f23f318a", new Object[]{this, str});
        } else {
            this.g = str;
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "ZIMMetaInfo{apdidToken='" + this.f5841a + "', deviceType='" + this.b + "', deviceModel='" + this.c + "', appName='" + this.d + "', appVersion='" + this.e + "', osVersion='" + this.f + "', bioMetaInfo='" + this.g + "', zimVer='" + this.h + "'}";
    }
}
