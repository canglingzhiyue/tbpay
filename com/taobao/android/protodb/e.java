package com.taobao.android.protodb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public final class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f14706a;

    public e(String str) {
        if (str != null) {
            this.f14706a = str;
        } else {
            this.f14706a = "";
        }
    }

    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f14706a;
    }
}
