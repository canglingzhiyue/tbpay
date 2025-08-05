package com.taobao.android.litecreator.sdk.editor;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes5.dex */
public final class p implements dagger.internal.b<ae> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final g f13441a;

    static {
        kge.a(195038271);
        kge.a(-1220739);
    }

    @Override // javax.inject.a
    public /* synthetic */ Object get() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("6352d3f5", new Object[]{this}) : a();
    }

    public ae a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ae) ipChange.ipc$dispatch("573c6dd0", new Object[]{this}) : a(this.f13441a);
    }

    public static ae a(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ae) ipChange.ipc$dispatch("b3d26dfd", new Object[]{gVar}) : (ae) dagger.internal.e.a(gVar.j(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
