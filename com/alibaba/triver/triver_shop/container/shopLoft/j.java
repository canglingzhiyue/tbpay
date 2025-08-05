package com.alibaba.triver.triver_shop.container.shopLoft;

import com.alibaba.triver.triver_shop.container.shopLoft.b;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.t;
import tb.kge;
import tb.ruk;

/* loaded from: classes3.dex */
public final class j implements b.a.InterfaceC0126a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ruk<t> f3732a;
    private ruk<t> b;

    static {
        kge.a(-1066596456);
        kge.a(-747960664);
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b.a.InterfaceC0126a
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        }
    }

    public final void a(ruk<t> rukVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdbfc750", new Object[]{this, rukVar});
        } else {
            this.f3732a = rukVar;
        }
    }

    public final ruk<t> b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ruk) ipChange.ipc$dispatch("16bbe0f5", new Object[]{this}) : this.f3732a;
    }

    public final void b(ruk<t> rukVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec42cdd1", new Object[]{this, rukVar});
        } else {
            this.b = rukVar;
        }
    }

    public final ruk<t> c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ruk) ipChange.ipc$dispatch("1e6d8654", new Object[]{this}) : this.b;
    }
}
