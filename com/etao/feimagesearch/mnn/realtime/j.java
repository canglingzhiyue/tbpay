package com.etao.feimagesearch.mnn.realtime;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes3.dex */
public final class j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final g f6797a;
    private final a b;
    private final d c;

    static {
        kge.a(-1044614740);
    }

    public j(g gVar, a aVar, d dVar) {
        this.f6797a = gVar;
        this.b = aVar;
        this.c = dVar;
    }

    public final g a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (g) ipChange.ipc$dispatch("522d9005", new Object[]{this}) : this.f6797a;
    }

    public final a b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("376efe0c", new Object[]{this}) : this.b;
    }

    public final d c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("1cb06d2a", new Object[]{this}) : this.c;
    }
}
