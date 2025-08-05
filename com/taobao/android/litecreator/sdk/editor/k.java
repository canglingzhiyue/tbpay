package com.taobao.android.litecreator.sdk.editor;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes5.dex */
public final class k implements dagger.internal.b<w> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final g f13436a;

    static {
        kge.a(2027788545);
        kge.a(-1220739);
    }

    @Override // javax.inject.a
    public /* synthetic */ Object get() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("6352d3f5", new Object[]{this}) : a();
    }

    public w a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (w) ipChange.ipc$dispatch("55650e4b", new Object[]{this}) : a(this.f13436a);
    }

    public static w a(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (w) ipChange.ipc$dispatch("7127d47e", new Object[]{gVar}) : (w) dagger.internal.e.a(gVar.e(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
