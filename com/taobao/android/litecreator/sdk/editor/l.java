package com.taobao.android.litecreator.sdk.editor;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes5.dex */
public final class l implements dagger.internal.b<y> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final g f13437a;

    static {
        kge.a(-1846261235);
        kge.a(-1220739);
    }

    @Override // javax.inject.a
    public /* synthetic */ Object get() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("6352d3f5", new Object[]{this}) : a();
    }

    public y a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (y) ipChange.ipc$dispatch("55650e89", new Object[]{this}) : a(this.f13437a);
    }

    public static y a(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (y) ipChange.ipc$dispatch("7127d4bc", new Object[]{gVar}) : (y) dagger.internal.e.a(gVar.a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
