package com.taobao.rxm.schedule;

import android.os.Handler;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.PriorityQueue;

/* loaded from: classes7.dex */
public class m implements j, Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final PriorityQueue<g> f19013a = new PriorityQueue<>(200);
    private final Handler b = new Handler(Looper.getMainLooper());
    private boolean c;
    private int d;
    private long e;

    @Override // com.taobao.rxm.schedule.j
    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // java.lang.Runnable
    public void run() {
        g poll;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        int i = this.d + 1;
        this.d = i;
        if (i > 10 || this.e > 8) {
            this.d = 0;
            this.e = 0L;
            synchronized (this) {
                if (this.f19013a.size() > 0) {
                    this.b.post(this);
                } else {
                    this.c = false;
                }
            }
            return;
        }
        synchronized (this) {
            poll = this.f19013a.poll();
        }
        if (poll != null) {
            long currentTimeMillis = System.currentTimeMillis();
            poll.run();
            this.e += System.currentTimeMillis() - currentTimeMillis;
            run();
            return;
        }
        synchronized (this) {
            this.c = false;
        }
    }

    @Override // com.taobao.rxm.schedule.j
    public synchronized void a(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b5e8cf", new Object[]{this, gVar});
            return;
        }
        this.f19013a.add(gVar);
        if (!this.c && !this.f19013a.isEmpty()) {
            this.c = true;
            this.b.post(this);
        }
    }

    @Override // com.taobao.rxm.schedule.j
    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        return "ui thread scheduler status:\nqueue size:" + c() + "\nexecuting:" + this.c;
    }

    @Override // com.taobao.rxm.schedule.j
    public int c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue() : this.f19013a.size();
    }
}
