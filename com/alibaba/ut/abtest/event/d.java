package com.alibaba.ut.abtest.event;

import com.alibaba.ut.abtest.internal.util.p;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.kge;

/* loaded from: classes.dex */
public class d implements c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static ConcurrentLinkedQueue<a> f4177a;
    private static AtomicBoolean c;
    private Map<EventType, Set<b>> b = new HashMap();

    public static /* synthetic */ ConcurrentLinkedQueue a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ConcurrentLinkedQueue) ipChange.ipc$dispatch("b9de5e34", new Object[0]) : f4177a;
    }

    public static /* synthetic */ void a(d dVar, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e3a096b", new Object[]{dVar, aVar});
        } else {
            dVar.b(aVar);
        }
    }

    public static /* synthetic */ AtomicBoolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicBoolean) ipChange.ipc$dispatch("bf6c05e9", new Object[0]) : c;
    }

    static {
        kge.a(68346237);
        kge.a(864629181);
        f4177a = new ConcurrentLinkedQueue<>();
        c = new AtomicBoolean(false);
    }

    @Override // com.alibaba.ut.abtest.event.c
    public void a(EventType eventType, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c7edd3a", new Object[]{this, eventType, bVar});
        } else if (eventType == null || bVar == null) {
        } else {
            synchronized (this) {
                Set<b> set = this.b.get(eventType);
                if (set == null) {
                    set = new HashSet<>();
                    this.b.put(eventType, set);
                }
                set.add(bVar);
            }
        }
    }

    @Override // com.alibaba.ut.abtest.event.c
    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1377757a", new Object[]{this, aVar});
        } else if (aVar == null) {
        } else {
            f4177a.offer(aVar);
            if (!c.compareAndSet(false, true)) {
                return;
            }
            p.a(new Runnable() { // from class: com.alibaba.ut.abtest.event.d.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    while (!d.a().isEmpty()) {
                        try {
                            a aVar2 = (a) d.a().poll();
                            if (aVar2 != null) {
                                d.a(d.this, aVar2);
                            }
                        } catch (Throwable th) {
                            com.alibaba.ut.abtest.internal.util.b.a("EventServiceImpl.publishEvent", th);
                        }
                    }
                    d.b().set(false);
                }
            });
        }
    }

    private synchronized void b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87b6add9", new Object[]{this, aVar});
            return;
        }
        Set<b> set = this.b.get(aVar.a());
        if (set != null) {
            for (b bVar : set) {
                bVar.onEvent(aVar);
            }
        }
    }
}
