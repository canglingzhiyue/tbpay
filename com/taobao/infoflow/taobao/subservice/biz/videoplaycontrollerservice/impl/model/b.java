package com.taobao.infoflow.taobao.subservice.biz.videoplaycontrollerservice.impl.model;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.biz.IVideoPlayControllerService;
import tb.kge;

/* loaded from: classes7.dex */
public class b implements Comparable<b> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final int f17564a;
    private final IVideoPlayControllerService.b b;
    private final c c;
    private int d;

    static {
        kge.a(746273625);
        kge.a(415966670);
    }

    @Override // java.lang.Comparable
    public /* synthetic */ int compareTo(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6a4672d6", new Object[]{this, bVar})).intValue() : a(bVar);
    }

    public b(IVideoPlayControllerService.b bVar, c cVar) {
        this.b = bVar;
        this.c = cVar;
        this.f17564a = System.identityHashCode(this.b);
    }

    public IVideoPlayControllerService.b a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IVideoPlayControllerService.b) ipChange.ipc$dispatch("c608aa47", new Object[]{this}) : this.b;
    }

    public c b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("649fbcfc", new Object[]{this}) : this.c;
    }

    public int c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue() : this.d;
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.d = i;
        }
    }

    public int a(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("705947cf", new Object[]{this, bVar})).intValue() : this.d - bVar.c();
    }
}
