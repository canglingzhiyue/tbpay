package com.alibaba.security.ccrc.service.build;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class Q implements com.taobao.mrt.service.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ T f3269a;

    public Q(T t) {
        this.f3269a = t;
    }

    @Override // com.taobao.mrt.service.b
    public String getDeviceLevel() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("89e64461", new Object[]{this}) : "high";
    }
}
