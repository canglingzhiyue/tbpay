package com.taobao.tao.flexbox.layoutmanager.container.dx;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.ogq;
import tb.ruk;

@Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 1})
/* loaded from: classes8.dex */
public final class b implements ogq.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ ruk f20244a;

    public b(ruk rukVar) {
        this.f20244a = rukVar;
    }

    @Override // tb.ogq.a
    public final /* synthetic */ void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            q.b(this.f20244a.mo2427invoke(), "invoke(...)");
        }
    }
}
