package com.taobao.android.litecreator.sdk.editor;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes5.dex */
public final class q implements dagger.internal.b<ah> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final g f13442a;

    static {
        kge.a(655946911);
        kge.a(-1220739);
    }

    @Override // javax.inject.a
    public /* synthetic */ Object get() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("6352d3f5", new Object[]{this}) : a();
    }

    public q(g gVar) {
        this.f13442a = gVar;
    }

    public ah a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ah) ipChange.ipc$dispatch("573c6e2d", new Object[]{this}) : b(this.f13442a);
    }

    public static q a(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (q) ipChange.ipc$dispatch("7127d3c4", new Object[]{gVar}) : new q(gVar);
    }

    public static ah b(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ah) ipChange.ipc$dispatch("dc18ae9b", new Object[]{gVar}) : (ah) dagger.internal.e.a(gVar.h(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
