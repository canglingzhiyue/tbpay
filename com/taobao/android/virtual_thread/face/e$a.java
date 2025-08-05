package com.taobao.android.virtual_thread.face;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.virtual_thread.VirtualThread;
import com.taobao.android.virtual_thread.e;
import tb.kge;

/* loaded from: classes6.dex */
public final class e$a extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final h f15813a;

    static {
        kge.a(-1446479519);
    }

    public e$a(h hVar) {
        this.f15813a = hVar;
    }

    @Override // com.taobao.android.virtual_thread.e
    public VirtualThread a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (VirtualThread) ipChange.ipc$dispatch("ac603360", new Object[]{this, runnable}) : new VirtualThread(runnable, this.f15813a.newThreadName());
    }
}
