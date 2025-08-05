package com.taobao.android.upp;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.upp.e;
import tb.kge;

/* loaded from: classes6.dex */
public class c implements a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final e.b f15795a;

    static {
        kge.a(518974950);
        kge.a(1583970229);
    }

    public c(e.b bVar) {
        this.f15795a = bVar;
    }

    @Override // com.taobao.android.upp.a
    public e.b a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e.b) ipChange.ipc$dispatch("bbeece07", new Object[]{this}) : this.f15795a;
    }
}
