package com.taobao.android.litecreator.sdk.editor;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes5.dex */
public final class m implements dagger.internal.b<aa> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final g f13438a;

    static {
        kge.a(354210428);
        kge.a(-1220739);
    }

    @Override // javax.inject.a
    public /* synthetic */ Object get() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("6352d3f5", new Object[]{this}) : a();
    }

    public m(g gVar) {
        this.f13438a = gVar;
    }

    public aa a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (aa) ipChange.ipc$dispatch("573c6d54", new Object[]{this}) : b(this.f13438a);
    }

    public static m a(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (m) ipChange.ipc$dispatch("7127d348", new Object[]{gVar}) : new m(gVar);
    }

    public static aa b(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (aa) ipChange.ipc$dispatch("dc18adc2", new Object[]{gVar}) : (aa) dagger.internal.e.a(gVar.g(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
