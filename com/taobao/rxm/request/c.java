package com.taobao.rxm.request;

import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.ParameterizedType;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import tb.nnb;

/* loaded from: classes7.dex */
public abstract class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final AtomicInteger f19003a = new AtomicInteger(1);
    private final int b;
    private int c;
    private volatile boolean d;
    private volatile boolean e;
    private volatile int f;
    private a g;
    private Set<b> h;
    private nnb i;
    private final boolean j;

    public abstract void a(c cVar);

    public abstract String o();

    public c(boolean z) {
        this.c = 2;
        synchronized (f19003a) {
            if (f19003a.get() < 0) {
                f19003a.set(1);
            }
            this.b = f19003a.getAndIncrement();
        }
        this.j = z;
    }

    public c() {
        this(true);
    }

    public int H() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("40c20c2", new Object[]{this})).intValue() : this.b;
    }

    public int I() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("41a3843", new Object[]{this})).intValue() : this.c;
    }

    public void f(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0a9ceb6", new Object[]{this, new Integer(i)});
        } else {
            this.c = i;
        }
    }

    public void J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4284fd1", new Object[]{this});
            return;
        }
        this.e = true;
        a aVar = this.g;
        if (aVar != null) {
            aVar.a(this);
        }
        if (M()) {
            return;
        }
        f(true);
    }

    public boolean K() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4366756", new Object[]{this})).booleanValue() : this.d;
    }

    public void f(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0aa0e87", new Object[]{this, new Boolean(z)});
            return;
        }
        this.d = z;
        if (!z) {
            return;
        }
        a();
    }

    private void a() {
        int size;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        HashSet<b> hashSet = null;
        synchronized (this) {
            if (this.h != null && (size = this.h.size()) > 0) {
                hashSet = new HashSet(size);
                hashSet.addAll(this.h);
            }
        }
        if (hashSet == null) {
            return;
        }
        for (b bVar : hashSet) {
            bVar.a(this);
        }
        hashSet.clear();
    }

    public boolean L() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4447ed7", new Object[]{this})).booleanValue() : this.e;
    }

    public boolean M() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4529658", new Object[]{this})).booleanValue() : this.f == this.b;
    }

    public int N() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("460adc8", new Object[]{this})).intValue() : this.f;
    }

    public synchronized void O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46ec556", new Object[]{this});
            return;
        }
        this.f = 0;
        if (this.h != null) {
            this.h.clear();
        }
    }

    public void g(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b25ea755", new Object[]{this, new Integer(i)});
        } else {
            this.f = i;
        }
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eae831", new Object[]{this, aVar});
        } else {
            this.g = aVar;
        }
    }

    public boolean a(b bVar) {
        boolean add;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5eb5c94", new Object[]{this, bVar})).booleanValue();
        }
        if (this.j) {
            Class cls = (Class) ((ParameterizedType) bVar.getClass().getGenericInterfaces()[0]).getActualTypeArguments()[0];
            if (!cls.isInstance(this)) {
                throw new RuntimeException("this[" + getClass() + "] CANNOT be assigned to generic[" + cls + "] of RequestCancelListener");
            }
        }
        synchronized (this) {
            if (this.h == null) {
                this.h = new HashSet();
            }
            add = this.h.add(bVar);
        }
        return add;
    }

    public synchronized boolean b(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1ad424d5", new Object[]{this, bVar})).booleanValue();
        }
        return this.h != null && this.h.remove(bVar);
    }

    public nnb P() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (nnb) ipChange.ipc$dispatch("8c3c536d", new Object[]{this}) : this.i;
    }

    public void a(nnb nnbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f685a8f6", new Object[]{this, nnbVar});
        } else {
            this.i = nnbVar;
        }
    }
}
