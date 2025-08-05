package com.taobao.android.litecreator.sdk.editor;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes5.dex */
public final class j implements dagger.internal.b<t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final g f13435a;

    static {
        kge.a(1255370729);
        kge.a(-1220739);
    }

    @Override // javax.inject.a
    public /* synthetic */ Object get() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("6352d3f5", new Object[]{this}) : a();
    }

    public t a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (t) ipChange.ipc$dispatch("55650dee", new Object[]{this}) : a(this.f13435a);
    }

    public static t a(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (t) ipChange.ipc$dispatch("7127d421", new Object[]{gVar}) : (t) dagger.internal.e.a(gVar.b(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
