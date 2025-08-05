package com.taobao.android.trade.event;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes6.dex */
public class a implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final n f15615a = new n();
    private final d b;

    static {
        kge.a(231956150);
        kge.a(-1390502639);
    }

    public a(d dVar) {
        this.b = dVar;
    }

    public void a(p pVar, Event event, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecf6cfe1", new Object[]{this, pVar, event, cVar});
            return;
        }
        this.f15615a.a(m.a(pVar, event, cVar));
        this.b.d().execute(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        m a2 = this.f15615a.a();
        if (a2 == null) {
            throw new IllegalStateException("No pending post available");
        }
        this.b.a(a2);
    }
}
