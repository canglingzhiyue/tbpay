package com.taobao.android.litecreator.sdk.editor;

import com.android.alibaba.ip.runtime.IpChange;
import tb.hen;
import tb.kge;

/* loaded from: classes5.dex */
public final class n implements dagger.internal.b<hen> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final g f13439a;

    static {
        kge.a(-437743992);
        kge.a(-1220739);
    }

    @Override // javax.inject.a
    public /* synthetic */ Object get() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("6352d3f5", new Object[]{this}) : a();
    }

    public n(g gVar) {
        this.f13439a = gVar;
    }

    public hen a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (hen) ipChange.ipc$dispatch("f05742d", new Object[]{this}) : b(this.f13439a);
    }

    public static n a(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (n) ipChange.ipc$dispatch("7127d367", new Object[]{gVar}) : new n(gVar);
    }

    public static hen b(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (hen) ipChange.ipc$dispatch("85f5571b", new Object[]{gVar}) : (hen) dagger.internal.e.a(gVar.i(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
