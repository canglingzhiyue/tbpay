package com.alibaba.security.realidentity;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public abstract class c0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public abstract int a();

    public abstract String b();

    public abstract byte[] c();

    public abstract int d();

    public abstract int e();

    public boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue() : a() > 0;
    }
}
