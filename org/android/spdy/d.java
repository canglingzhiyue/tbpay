package org.android.spdy;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public a f25076a;
    private AtomicLong b = new AtomicLong(1);
    private Object c;

    /* loaded from: classes.dex */
    interface a {
        void a(Object obj);
    }

    public d(Object obj) {
        this.c = obj;
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2a3f3c8", new Object[]{this, aVar});
        } else {
            this.f25076a = aVar;
        }
    }

    public boolean a() {
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        do {
            j = this.b.get();
            if (j == 3) {
                return false;
            }
        } while (!this.b.compareAndSet(j, 16 + j));
        return true;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.b.addAndGet(-16L);
        if (!this.b.compareAndSet(2L, 3L)) {
            return;
        }
        a aVar = this.f25076a;
        if (aVar != null) {
            aVar.a(this.c);
        }
        this.c = null;
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        this.b.incrementAndGet();
        if (!this.b.compareAndSet(2L, 3L)) {
            return;
        }
        a aVar = this.f25076a;
        if (aVar != null) {
            aVar.a(this.c);
        }
        this.c = null;
    }
}
