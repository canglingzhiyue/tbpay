package com.taobao.rxm.schedule;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes7.dex */
public class d implements c, h, l {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final j f19008a;
    private final CentralSchedulerQueue b;
    private int c;
    private int d;

    public d(j jVar, int i, int i2, int i3) {
        this.f19008a = jVar;
        this.c = i;
        this.b = new CentralSchedulerQueue(this, i2, i3);
    }

    @Override // com.taobao.rxm.schedule.c
    public synchronized boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
        }
        return this.d < this.c;
    }

    private void c(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1416688d", new Object[]{this, gVar});
        } else {
            gVar.run();
        }
    }

    private void a(g gVar, boolean z) {
        int moveIn;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7307e3e5", new Object[]{this, gVar, new Boolean(z)});
            return;
        }
        synchronized (this) {
            moveIn = this.b.moveIn(gVar, z);
            if (moveIn != 3) {
                this.d++;
            }
        }
        if (moveIn == 1) {
            this.f19008a.a(gVar);
        } else if (moveIn != 2) {
        } else {
            c(gVar);
        }
    }

    @Override // com.taobao.rxm.schedule.j
    public void a(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b5e8cf", new Object[]{this, gVar});
            return;
        }
        gVar.a(this);
        a(gVar, true);
    }

    @Override // com.taobao.rxm.schedule.l
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        synchronized (this) {
            this.c = i;
        }
        e();
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        g gVar = g.b.get();
        while (true) {
            g gVar2 = null;
            synchronized (this) {
                if (this.d < this.c || this.b.reachPatienceCapacity()) {
                    gVar2 = (g) this.b.poll();
                }
            }
            if (gVar2 == null) {
                return;
            }
            a(gVar2, false);
            g.b.set(gVar);
        }
    }

    @Override // com.taobao.rxm.schedule.c, com.taobao.rxm.schedule.j
    public synchronized String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        return "MasterThrottling[running=" + this.d + ", max=" + this.c + "]," + this.f19008a.a();
    }

    @Override // com.taobao.rxm.schedule.j
    public synchronized boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        return this.f19008a.b();
    }

    @Override // com.taobao.rxm.schedule.j
    public int c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue() : this.b.size();
    }

    @Override // com.taobao.rxm.schedule.h
    public void b(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8be628ae", new Object[]{this, gVar});
            return;
        }
        synchronized (this) {
            this.d--;
        }
        e();
    }
}
