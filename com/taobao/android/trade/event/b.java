package com.taobao.android.trade.event;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes6.dex */
public final class b implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final n f15616a = new n();
    private final d b;
    private volatile boolean c;

    static {
        kge.a(-846939026);
        kge.a(-1390502639);
    }

    public b(d dVar) {
        this.b = dVar;
    }

    public void a(p pVar, Event event, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecf6cfe1", new Object[]{this, pVar, event, cVar});
            return;
        }
        m a2 = m.a(pVar, event, cVar);
        synchronized (this) {
            this.f15616a.a(a2);
            if (!this.c) {
                this.c = true;
                this.b.d().execute(this);
            }
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        while (true) {
            try {
                m a2 = this.f15616a.a(1000);
                if (a2 == null) {
                    synchronized (this) {
                        a2 = this.f15616a.a();
                        if (a2 == null) {
                            return;
                        }
                    }
                }
                this.b.a(a2);
            } catch (InterruptedException unused) {
                String str = Thread.currentThread().getName() + " was interruppted";
                return;
            } finally {
                this.c = false;
            }
        }
    }
}
