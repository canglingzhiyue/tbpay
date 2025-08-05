package com.alibaba.triver.triver_shop.container.shopLoft.newStyle;

import com.alibaba.triver.triver_shop.container.shopLoft.b;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes3.dex */
public final class b implements b.a.InterfaceC0126a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final a f3754a;

    static {
        kge.a(383039008);
        kge.a(-747960664);
    }

    public b(a shopLoftDXEngine) {
        q.d(shopLoftDXEngine, "shopLoftDXEngine");
        this.f3754a = shopLoftDXEngine;
    }

    public final a b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("2b9f6ca7", new Object[]{this}) : this.f3754a;
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b.a.InterfaceC0126a
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.f3754a.a().o();
        }
    }
}
