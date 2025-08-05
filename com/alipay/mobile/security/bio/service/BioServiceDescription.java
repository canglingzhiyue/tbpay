package com.alipay.mobile.security.bio.service;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class BioServiceDescription {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Class<?> f5805a = null;
    public String b = "";
    public boolean c = false;
    public boolean d = false;
    public Map<String, String> e = new HashMap();

    public Class<?> getClazz() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Class) ipChange.ipc$dispatch("11d5d2d6", new Object[]{this}) : this.f5805a;
    }

    public void setClazz(Class<?> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e69c1040", new Object[]{this, cls});
        } else {
            this.f5805a = cls;
        }
    }

    public String getInterfaceName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e1a3140b", new Object[]{this}) : this.b;
    }

    public void setInterfaceName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("875f4f33", new Object[]{this, str});
        } else {
            this.b = str;
        }
    }

    public boolean isLazy() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("85e0e549", new Object[]{this})).booleanValue() : this.c;
    }

    public void setLazy(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bc065f7", new Object[]{this, new Boolean(z)});
        } else {
            this.c = z;
        }
    }

    public boolean isAutoDownloadRes() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c000404a", new Object[]{this})).booleanValue() : this.d;
    }

    public void setAutoDownloadRes(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86d25e86", new Object[]{this, new Boolean(z)});
        } else {
            this.d = z;
        }
    }

    public Map<String, String> getExtMetaInfo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("49676b5a", new Object[]{this}) : this.e;
    }

    public void setExtMetaInfo(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c164770c", new Object[]{this, map});
        } else {
            this.e = map;
        }
    }
}
