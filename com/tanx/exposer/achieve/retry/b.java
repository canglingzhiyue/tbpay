package com.tanx.exposer.achieve.retry;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.tanx.exposer.achieve.AdMonitorType;
import com.tanx.exposer.d;
import com.tanx.exposer.framework.connectivity.a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;
import tb.dgj;
import tb.dgk;
import tb.dgl;
import tb.dgn;
import tb.dgp;
import tb.dgr;
import tb.dgv;
import tb.dgy;
import tb.dha;
import tb.dhc;
import tb.kge;

/* loaded from: classes4.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public d f8154a;
    public com.tanx.exposer.achieve.retry.a b;
    public boolean c;
    public final a.InterfaceC0311a d;
    public int e;
    private Context f;
    private a g;
    private AtomicInteger h;
    private ConcurrentLinkedQueue<com.tanx.exposer.achieve.b> i;

    /* loaded from: classes4.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f8158a = 500;
        public int b = 5;

        static {
            kge.a(-751174654);
        }
    }

    /* renamed from: com.tanx.exposer.achieve.retry.b$b  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0310b {
        public static final b tanxc_do;

        static {
            kge.a(-751174508);
            tanxc_do = new b((byte) 0);
        }
    }

    static {
        kge.a(1613816704);
    }

    public /* synthetic */ b(byte b) {
        this();
    }

    public static /* synthetic */ void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7a4e345", new Object[]{bVar});
        } else {
            bVar.e();
        }
    }

    private b() {
        this.g = new a();
        this.h = new AtomicInteger(0);
        this.c = true;
        this.d = new a.InterfaceC0311a() { // from class: com.tanx.exposer.achieve.retry.b.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.tanx.exposer.framework.connectivity.a.InterfaceC0311a
            public void a(int i) {
                IpChange ipChange = $ipChange;
                boolean z = true;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
                    return;
                }
                b bVar = b.this;
                if (i == -1) {
                    z = false;
                }
                bVar.c = z;
                if (!b.this.c || b.this.f8154a.d() == null || !b.this.f8154a.d().a()) {
                    return;
                }
                b.this.a();
            }
        };
        this.e = 3;
        this.i = new ConcurrentLinkedQueue<>();
    }

    public void a(Context context, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e57dbf6", new Object[]{this, context, dVar});
            return;
        }
        this.f = context;
        this.f8154a = dVar;
        if (dVar.d() != null) {
            this.e = dVar.d().c();
        }
        d();
        c();
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            dgv.a(new Runnable() { // from class: com.tanx.exposer.achieve.retry.b.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        a.b.tanxc_do.a(b.this.d);
                    }
                }
            }, 10000L);
        }
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else {
            dgv.a(new Runnable() { // from class: com.tanx.exposer.achieve.retry.b.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    b.this.b();
                    String a2 = dhc.a(System.currentTimeMillis(), "yyyy-MM-dd");
                    dha.a("AdRetryExposeManager", "currentDate=" + a2);
                    b.this.b.a(a2, b.this.e);
                    b.a(b.this);
                }
            }, 0L);
        }
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        b();
        List<com.tanx.exposer.achieve.b> a2 = this.b.a(dhc.a(System.currentTimeMillis(), "yyyy-MM-dd"));
        if (a2.isEmpty()) {
            if (!dha.f26745a) {
                return;
            }
            dha.a("AdRetryExposeManager", "sendRetryMonitor return because no retry monitor info.");
            return;
        }
        int size = a2.size();
        if (dha.f26745a) {
            dha.a("AdRetryExposeManager", "sendRetryMonitor: count = " + size);
        }
        for (int i = 0; i < size; i++) {
            com.tanx.exposer.achieve.b bVar = a2.get(i);
            bVar.a(AdMonitorRetryType.DB);
            if (b(bVar)) {
                if (!this.i.contains(bVar)) {
                    f();
                    this.i.add(bVar);
                } else {
                    this.b.a(bVar.a());
                }
            } else {
                this.b.a(bVar.a());
            }
        }
        if (!a.b.tanxc_do.a()) {
            if (!dha.f26745a) {
                return;
            }
            dha.a("AdRetryExposeManager", "sendRetryMonitor return because no net.");
            return;
        }
        a();
    }

    public void a(com.tanx.exposer.achieve.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e962fe3e", new Object[]{this, bVar});
        } else if (bVar == null || !this.i.contains(bVar) || !this.i.remove(bVar)) {
        } else {
            b(bVar, false);
        }
    }

    public synchronized void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        int i = this.g.b - this.h.get();
        dha.a("AdRetryExposeManager", "availableRetryCount=" + i);
        if (i <= 0) {
            return;
        }
        if (this.i.size() <= 0) {
            return;
        }
        dha.a("AdRetryExposeManager", "failedRequestQueue.size=" + this.i.size());
        ArrayList<com.tanx.exposer.achieve.b> arrayList = new ArrayList();
        while (true) {
            int i2 = i - 1;
            if (i <= 0) {
                break;
            }
            com.tanx.exposer.achieve.b poll = this.i.poll();
            if (poll != null) {
                arrayList.add(poll);
                b();
                this.b.a(poll.a());
            }
            i = i2;
        }
        for (com.tanx.exposer.achieve.b bVar : arrayList) {
            b(bVar, true);
        }
    }

    private void b(com.tanx.exposer.achieve.b bVar, boolean z) {
        dgr aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("801d4075", new Object[]{this, bVar, new Boolean(z)});
        } else if (bVar == null) {
        } else {
            if (z) {
                bVar.j().incrementAndGet();
                this.h.incrementAndGet();
            }
            dgp dgpVar = new dgp(this.f8154a.d().d());
            if (bVar.d() == AdMonitorType.EXPOSE) {
                aVar = new dgl.a(bVar, z);
            } else {
                aVar = new dgk.a(bVar, z);
            }
            dgpVar.a(bVar.d(), bVar.b(), aVar);
        }
    }

    public boolean b(com.tanx.exposer.achieve.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("673aba43", new Object[]{this, bVar})).booleanValue();
        }
        com.tanx.exposer.b d = this.f8154a.d();
        return d != null && d.b() && d.g().contains(bVar.d()) && bVar.i() > 0 && bVar.j().get() < bVar.i();
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else if (this.i.size() >= this.g.f8158a) {
            ArrayList<com.tanx.exposer.achieve.b> arrayList = new ArrayList(this.i.size() - this.g.f8158a);
            while (this.i.size() >= this.g.f8158a) {
                com.tanx.exposer.achieve.b poll = this.i.poll();
                if (poll != null) {
                    arrayList.add(poll);
                    b();
                    this.b.a(poll.a());
                }
            }
            for (com.tanx.exposer.achieve.b bVar : arrayList) {
                b(bVar, -2, "retry fail,exceed max retry count", false);
            }
        }
    }

    public synchronized void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        if (this.b == null) {
            this.b = new com.tanx.exposer.achieve.retry.a(this.f);
        }
    }

    public void a(com.tanx.exposer.achieve.b bVar, int i, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("751665a5", new Object[]{this, bVar, new Integer(i), str, new Boolean(z)});
        } else if (bVar == null) {
        } else {
            if (z) {
                this.h.decrementAndGet();
            } else {
                bVar.a(AdMonitorRetryType.NONE);
                dgn.a().a("TanxExposer", "EXPOSER_SUCCESS_POINT", String.valueOf(i), str, bVar.k() == null ? "" : bVar.k().toString());
            }
            dgy.a(bVar, i, str, z, bVar.l().name());
            b();
            if (b(bVar)) {
                if (this.i.contains(bVar)) {
                    return;
                }
                f();
                this.i.add(bVar);
                this.b.a(bVar);
                b(bVar, i, str, true);
                return;
            }
            b(bVar, i, str, false);
        }
    }

    public void a(com.tanx.exposer.achieve.b bVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42fd7c56", new Object[]{this, bVar, new Boolean(z)});
            return;
        }
        if (z) {
            this.h.decrementAndGet();
        }
        if (bVar == null) {
            return;
        }
        if (!z) {
            bVar.a(AdMonitorRetryType.NONE);
            dgn.a().a("TanxExposer", "EXPOSER_SUCCESS_POINT", bVar.k() == null ? "" : bVar.k().toString());
        }
        dgy.a(bVar, z, bVar.l().name());
        dgj b = d.a().b();
        if (b != null && bVar.l() != AdMonitorRetryType.DB) {
            b.a(bVar.c(), bVar.d(), bVar.k());
        }
        a();
    }

    private void b(com.tanx.exposer.achieve.b bVar, int i, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2511726", new Object[]{this, bVar, new Integer(i), str, new Boolean(z)});
            return;
        }
        dgj b = d.a().b();
        if (b == null || bVar.l() == AdMonitorRetryType.DB) {
            return;
        }
        if (z) {
            b.b(i, str, bVar.c(), bVar.d(), bVar.k());
        } else {
            b.a(i, str, bVar.c(), bVar.d(), bVar.k());
        }
    }
}
