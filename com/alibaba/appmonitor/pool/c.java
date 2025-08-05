package com.alibaba.appmonitor.pool;

import com.alibaba.appmonitor.pool.b;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicLong;
import tb.kge;

/* loaded from: classes.dex */
public class c<T extends b> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static AtomicLong c;
    private static AtomicLong d;
    private final int e = 20;

    /* renamed from: a  reason: collision with root package name */
    private AtomicLong f2891a = new AtomicLong(0);
    private AtomicLong b = new AtomicLong(0);
    private ConcurrentLinkedQueue<T> f = new ConcurrentLinkedQueue<>();
    private Set<Integer> g = new HashSet();

    static {
        kge.a(-276926523);
        c = new AtomicLong(0L);
        d = new AtomicLong(0L);
    }

    public T a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("1abf79b5", new Object[]{this});
        }
        c.getAndIncrement();
        this.f2891a.getAndIncrement();
        T poll = this.f.poll();
        if (poll != null) {
            this.g.remove(Integer.valueOf(System.identityHashCode(poll)));
            this.b.getAndIncrement();
            d.getAndIncrement();
        }
        return poll;
    }

    public void a(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4abdb735", new Object[]{this, t});
            return;
        }
        t.clean();
        if (this.f.size() >= 20) {
            return;
        }
        synchronized (this.g) {
            int identityHashCode = System.identityHashCode(t);
            if (!this.g.contains(Integer.valueOf(identityHashCode))) {
                this.g.add(Integer.valueOf(identityHashCode));
                this.f.offer(t);
            }
        }
    }
}
