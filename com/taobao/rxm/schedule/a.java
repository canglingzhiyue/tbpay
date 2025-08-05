package com.taobao.rxm.schedule;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.LinkedList;
import java.util.Queue;

/* loaded from: classes7.dex */
public class a implements h, l {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final j f19004a;
    private final Queue<g> b = new LinkedList();
    private int c;
    private int d;

    public a(j jVar, int i) {
        this.f19004a = jVar;
        this.c = i;
    }

    @Override // com.taobao.rxm.schedule.j
    public void a(g gVar) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b5e8cf", new Object[]{this, gVar});
            return;
        }
        gVar.b(this);
        synchronized (this) {
            if (this.d < this.c || !this.b.offer(gVar)) {
                z = true;
            }
            if (z) {
                this.d++;
            }
        }
        if (!z) {
            return;
        }
        this.f19004a.a(gVar);
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
        d();
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        g gVar = g.b.get();
        while (true) {
            g gVar2 = null;
            synchronized (this) {
                if (this.d < this.c) {
                    gVar2 = this.b.poll();
                }
                if (gVar2 != null) {
                    this.d++;
                }
            }
            if (gVar2 == null) {
                return;
            }
            this.f19004a.a(gVar2);
            g.b.set(gVar);
        }
    }

    @Override // com.taobao.rxm.schedule.j
    public synchronized String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        return this.f19004a.a();
    }

    @Override // com.taobao.rxm.schedule.j
    public synchronized boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        return this.f19004a.b();
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
        d();
    }
}
