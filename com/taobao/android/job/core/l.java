package com.taobao.android.job.core;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class l {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final l IMMEDIATE_NON_TERMINATING = new l().c();

    /* renamed from: a  reason: collision with root package name */
    private int f13000a;

    private l c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (l) ipChange.ipc$dispatch("61f43c1a", new Object[]{this});
        }
        this.f13000a = 1;
        return this;
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : 1 == this.f13000a;
    }
}
