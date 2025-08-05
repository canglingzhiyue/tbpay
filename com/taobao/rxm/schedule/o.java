package com.taobao.rxm.schedule;

import android.os.Handler;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.PriorityQueue;
import java.util.concurrent.ExecutorService;

/* loaded from: classes7.dex */
public class o implements j, Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final PriorityQueue<g> f19015a = new PriorityQueue<>(200);
    private Handler b;
    private ExecutorService c;

    @Override // com.taobao.rxm.schedule.j
    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public o(ExecutorService executorService) {
        this.c = executorService;
    }

    public o(Handler handler) {
        this.b = handler;
    }

    @Override // com.taobao.rxm.schedule.j
    public synchronized void a(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b5e8cf", new Object[]{this, gVar});
            return;
        }
        this.f19015a.add(gVar);
        if (this.b != null) {
            this.b.post(this);
            return;
        }
        if (this.c != null) {
            this.c.submit(gVar);
        }
    }

    @Override // com.taobao.rxm.schedule.j
    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        return "CustomScheduler:\nqueue size:" + c();
    }

    @Override // com.taobao.rxm.schedule.j
    public int c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue() : this.f19015a.size();
    }

    @Override // java.lang.Runnable
    public void run() {
        g poll;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        synchronized (this) {
            poll = this.f19015a.poll();
        }
        if (poll == null) {
            return;
        }
        poll.run();
        run();
    }
}
