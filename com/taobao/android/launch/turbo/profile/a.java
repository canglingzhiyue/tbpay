package com.taobao.android.launch.turbo.profile;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import tb.gsv;
import tb.gsx;
import tb.gtd;
import tb.kge;

/* loaded from: classes.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final AtomicReference<gsx> f13010a;
    private final c b;
    private final j c;
    private final Context d;
    private final AtomicInteger e;

    static {
        kge.a(55686524);
    }

    public a(Context context, c cVar) {
        this(context, new gtd(), cVar);
    }

    private a(Context context, gsx gsxVar, c cVar) {
        this.f13010a = new AtomicReference<>(null);
        this.e = new AtomicInteger(0);
        this.b = cVar;
        this.f13010a.compareAndSet(null, gsxVar);
        this.c = new k(context);
        this.d = context;
    }

    public a a(gsx gsxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("42d9211c", new Object[]{this, gsxVar});
        }
        gsv.a("CompileContext", "state machine " + this.f13010a.getAndSet(gsxVar).a() + " -> " + gsxVar.a());
        return this;
    }

    public int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue();
        }
        int i = this.e.get();
        if (i != 0 && i >= this.b.d) {
            gsv.a("CompileContext", "reached retry time limitation, discard");
            return -1;
        }
        return this.e.incrementAndGet();
    }

    public int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : this.e.get();
    }

    public c c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("849544f8", new Object[]{this}) : this.b;
    }

    public j d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (j) ipChange.ipc$dispatch("fa0f6c12", new Object[]{this}) : this.c;
    }

    public Context e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("1ad3a564", new Object[]{this}) : this.d;
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else {
            this.f13010a.get().a(this);
        }
    }
}
