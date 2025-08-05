package com.taobao.android.litecreator.sdk.editor;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes5.dex */
public final class h implements dagger.internal.b<r> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final g f13433a;

    static {
        kge.a(261250058);
        kge.a(-1220739);
    }

    @Override // javax.inject.a
    public /* synthetic */ Object get() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("6352d3f5", new Object[]{this}) : a();
    }

    public r a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (r) ipChange.ipc$dispatch("55650db0", new Object[]{this}) : a(this.f13433a);
    }

    public static r a(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (r) ipChange.ipc$dispatch("7127d3e3", new Object[]{gVar}) : (r) dagger.internal.e.a(gVar.f(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
