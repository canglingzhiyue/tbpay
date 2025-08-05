package com.taobao.tao.flexbox.layoutmanager.container.dx;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.ruk;

@Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 1})
/* loaded from: classes8.dex */
public final class e implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ ruk f20249a;

    public e(ruk rukVar) {
        this.f20249a = rukVar;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
        } else {
            q.b(this.f20249a.mo2427invoke(), "invoke(...)");
        }
    }
}
