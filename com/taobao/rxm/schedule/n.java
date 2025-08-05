package com.taobao.rxm.schedule;

import android.os.Handler;
import android.os.Looper;
import com.alipay.mobile.common.logging.util.perf.Constants;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.PriorityQueue;
import tb.nmr;

/* loaded from: classes7.dex */
public class n implements j, Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final long f19014a = System.currentTimeMillis();
    private final PriorityQueue<g> b = new PriorityQueue<>(200);
    private final Handler c = new Handler(Looper.getMainLooper());
    private boolean d;
    private int e;
    private long f;

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
        int e = e() ? nmr.e() : 10;
        int i = this.e + 1;
        this.e = i;
        if (i > e || this.f > 8) {
            this.e = 0;
            this.f = 0L;
            synchronized (this) {
                if (this.b.size() > 0) {
                    if (d()) {
                        this.c.postAtFrontOfQueue(this);
                    } else {
                        this.c.post(this);
                    }
                } else {
                    this.d = false;
                }
            }
            return;
        }
        synchronized (this) {
            poll = this.b.poll();
        }
        if (poll != null) {
            long currentTimeMillis = System.currentTimeMillis();
            poll.run();
            this.f += System.currentTimeMillis() - currentTimeMillis;
            run();
            return;
        }
        synchronized (this) {
            this.d = false;
        }
    }

    @Override // com.taobao.rxm.schedule.j
    public synchronized void a(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b5e8cf", new Object[]{this, gVar});
        } else if (nmr.d()) {
            b(gVar);
        } else {
            this.b.add(gVar);
            if (!this.d && !this.b.isEmpty()) {
                this.d = true;
                if (d()) {
                    this.c.postAtFrontOfQueue(this);
                } else {
                    this.c.post(this);
                }
            }
        }
    }

    private void b(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8be628ae", new Object[]{this, gVar});
            return;
        }
        if (d()) {
            this.c.postAtFrontOfQueue(gVar);
        } else {
            this.c.post(gVar);
        }
        if (this.b.isEmpty() || this.d) {
            return;
        }
        if (d()) {
            this.c.postAtFrontOfQueue(this);
        } else {
            this.c.post(this);
        }
    }

    private boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
        }
        if (nmr.f()) {
            return nmr.b();
        }
        return nmr.b() && System.currentTimeMillis() - f19014a < Constants.STARTUP_TIME_LEVEL_1;
    }

    private boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue() : nmr.c();
    }

    @Override // com.taobao.rxm.schedule.j
    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        return "ui thread scheduler status:\nqueue size:" + c() + "\nexecuting:" + this.d;
    }

    @Override // com.taobao.rxm.schedule.j
    public int c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue() : this.b.size();
    }
}
