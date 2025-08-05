package com.etao.feimagesearch.mnn.realtime;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes3.dex */
public final class m {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final h f6800a;
    private final b b;
    private final f c;

    static {
        kge.a(-2139931809);
    }

    public m(h hVar, b bVar, f fVar) {
        this.f6800a = hVar;
        this.b = bVar;
        this.c = fVar;
    }

    public final h a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (h) ipChange.ipc$dispatch("522d9024", new Object[]{this}) : this.f6800a;
    }

    public final b b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("376efe2b", new Object[]{this}) : this.b;
    }
}
