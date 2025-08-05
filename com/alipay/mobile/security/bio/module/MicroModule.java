package com.alipay.mobile.security.bio.module;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class MicroModule {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f5789a;

    public MicroModule() {
    }

    public MicroModule(String str) {
        this.f5789a = str;
    }

    public String getZimId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("30e5dbb6", new Object[]{this}) : this.f5789a;
    }

    public void setZimId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98ae30e8", new Object[]{this, str});
        } else {
            this.f5789a = str;
        }
    }
}
