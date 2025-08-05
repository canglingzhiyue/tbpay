package com.alipay.security.mobile.auth;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class AuthInfo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String downloadUrl;
    public String phoneModle;
    public int protocolType;
    public int protocolVersion;
    public int type;
    public int vendor;

    public AuthInfo() {
    }

    public AuthInfo(int i, int i2, int i3, int i4, String str, String str2) {
        this.type = i;
        this.vendor = i2;
        this.protocolType = i3;
        this.protocolVersion = i4;
        this.phoneModle = str;
        this.downloadUrl = str2;
    }

    public AuthInfo(int i, int i2, int i3, int i4, String str) {
        this.type = i;
        this.vendor = i2;
        this.protocolType = i3;
        this.protocolVersion = i4;
        this.phoneModle = str;
    }

    public int getType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5378242a", new Object[]{this})).intValue() : this.type;
    }

    public void setType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77e09620", new Object[]{this, new Integer(i)});
        } else {
            this.type = i;
        }
    }

    public int getVendor() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("1790fdb8", new Object[]{this})).intValue() : this.vendor;
    }

    public void setVendor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70f4a152", new Object[]{this, new Integer(i)});
        } else {
            this.vendor = i;
        }
    }

    public int getProtocolType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("9c8f28e2", new Object[]{this})).intValue() : this.protocolType;
    }

    public void setProtocolType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0ec7468", new Object[]{this, new Integer(i)});
        } else {
            this.protocolType = i;
        }
    }

    public int getProtocolVersion() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("9084dc64", new Object[]{this})).intValue() : this.protocolVersion;
    }

    public void setProtocolVersion(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa6a53be", new Object[]{this, new Integer(i)});
        } else {
            this.protocolVersion = i;
        }
    }

    public String getPhoneModle() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("29fcd7b6", new Object[]{this}) : this.phoneModle;
    }

    public void setPhoneModle(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c87a680", new Object[]{this, str});
        } else {
            this.phoneModle = str;
        }
    }

    public String getDownloadUrl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c9b30508", new Object[]{this}) : this.downloadUrl;
    }

    public void setDownloadUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8464cad6", new Object[]{this, str});
        } else {
            this.downloadUrl = str;
        }
    }
}
