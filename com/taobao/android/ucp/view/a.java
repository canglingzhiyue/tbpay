package com.taobao.android.ucp.view;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes6.dex */
public abstract class a implements b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final long f15715a = System.currentTimeMillis();

    static {
        kge.a(-337901844);
        kge.a(650305256);
    }

    @Override // com.taobao.android.ucp.view.b
    public long a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5c", new Object[]{this})).longValue() : this.f15715a;
    }
}
