package com.taobao.android.litecreator.sdk.editor;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes5.dex */
public final class aq implements dagger.internal.b<ar> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final g f13427a;

    static {
        kge.a(-1951806902);
        kge.a(-1220739);
    }

    @Override // javax.inject.a
    public /* synthetic */ Object get() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("6352d3f5", new Object[]{this}) : a();
    }

    public ar a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ar) ipChange.ipc$dispatch("573c6f63", new Object[]{this}) : a(this.f13427a);
    }

    public static ar a(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ar) ipChange.ipc$dispatch("b3d26f90", new Object[]{gVar}) : (ar) dagger.internal.e.a(gVar.k(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
