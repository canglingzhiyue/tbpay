package com.taobao.rxm.schedule;

import android.os.Process;
import com.android.alibaba.ip.runtime.IpChange;
import tb.nmq;
import tb.nmv;
import tb.riy;

/* loaded from: classes7.dex */
public abstract class g implements Comparable<g>, Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static ThreadLocal<g> b = new ThreadLocal<>();

    /* renamed from: a  reason: collision with root package name */
    private nmv<?, ? extends com.taobao.rxm.request.c> f19011a;
    private f c;
    private long d;
    private int e = 1;
    private boolean f;
    private i g;
    private h h;
    private h i;
    private Integer j;
    private int k;
    private long l;
    private boolean m;

    public abstract void a(nmv nmvVar, f fVar);

    @Override // java.lang.Comparable
    public /* synthetic */ int compareTo(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6a4672d6", new Object[]{this, gVar})).intValue() : a(gVar);
    }

    public g(int i, nmv<?, ? extends com.taobao.rxm.request.c> nmvVar, f fVar) {
        a(i, nmvVar, fVar);
    }

    public g(int i, nmv<?, ? extends com.taobao.rxm.request.c> nmvVar, f fVar, boolean z) {
        a(i, nmvVar, fVar, z);
    }

    public g a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("b23c384f", new Object[]{this});
        }
        a(1, null, null);
        return this;
    }

    public g a(int i, nmv<?, ? extends com.taobao.rxm.request.c> nmvVar, f fVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (g) ipChange.ipc$dispatch("3b48592b", new Object[]{this, new Integer(i), nmvVar, fVar}) : a(i, nmvVar, fVar, true);
    }

    public synchronized g a(int i, nmv<?, ? extends com.taobao.rxm.request.c> nmvVar, f fVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("c82b1cf7", new Object[]{this, new Integer(i), nmvVar, fVar, new Boolean(z)});
        }
        this.d = System.nanoTime();
        this.e = i;
        this.f19011a = nmvVar;
        this.c = fVar;
        this.f = z;
        this.j = null;
        this.k = 1;
        this.l = 0L;
        this.h = null;
        this.i = null;
        this.m = false;
        return this;
    }

    public Integer b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Integer) ipChange.ipc$dispatch("50145ad0", new Object[]{this}) : this.j;
    }

    public int c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue() : this.k;
    }

    public long d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2df", new Object[]{this})).longValue() : this.l;
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue() : !com.taobao.tcommon.core.c.a() && !f() && this.f;
    }

    public boolean f() {
        g gVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue();
        }
        if (this.j == null) {
            if (!com.taobao.tcommon.core.c.a() && (gVar = b.get()) != null && gVar.c() == 2 && gVar.d() == Thread.currentThread().getId()) {
                this.j = gVar.b();
            } else {
                this.j = 0;
            }
        }
        Integer num = this.j;
        return num != null && num.intValue() >= 10;
    }

    public int g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5c0f961", new Object[]{this})).intValue() : this.e;
    }

    public long h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5cf10e3", new Object[]{this})).longValue() : this.d;
    }

    public int a(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3b5e8c2", new Object[]{this, gVar})).intValue();
        }
        int g = gVar.g() - g();
        return g == 0 ? (int) (this.d - gVar.h()) : g;
    }

    public void a(h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b65d2e", new Object[]{this, hVar});
        } else {
            this.h = hVar;
        }
    }

    public void b(h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8be69d0d", new Object[]{this, hVar});
        } else {
            this.i = hVar;
        }
    }

    public synchronized void a(i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b6d18d", new Object[]{this, iVar});
        } else {
            this.g = iVar;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        this.l = Thread.currentThread().getId();
        if (!com.taobao.tcommon.core.c.a()) {
            try {
                Process.setThreadPriority(10);
            } catch (Throwable unused) {
            }
            g gVar = b.get();
            if (gVar != null && gVar.c() == 2 && gVar.d() == Thread.currentThread().getId()) {
                Integer num = this.j;
                if (num != null) {
                    i = num.intValue();
                }
                this.j = Integer.valueOf(i + 1);
            } else {
                this.j = 0;
            }
            b.set(this);
        }
        this.k = 2;
        a(this.f19011a, this.c);
        if (!com.taobao.tcommon.core.c.a()) {
            b.set(this);
        }
        h hVar = this.h;
        if (hVar != null) {
            hVar.b(this);
        }
        h hVar2 = this.i;
        if (hVar2 != null) {
            hVar2.b(this);
        }
        this.k = 3;
        synchronized (this) {
            if (this.g != null) {
                this.g.a(this);
            }
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(hashCode()));
        sb.append("@(");
        Object obj = this.f19011a;
        if (obj == null) {
            obj = "NullConsumer";
        }
        sb.append(obj);
        sb.append(")[");
        sb.append(this.e);
        sb.append(", ");
        sb.append(this.d);
        sb.append(riy.ARRAY_END_STR);
        return sb.toString();
    }

    public boolean i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[]{this})).booleanValue() : this.c == null;
    }

    public boolean j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[]{this})).booleanValue() : !this.m || this.c != null;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.m = z;
        }
    }

    private synchronized com.taobao.rxm.request.c m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.rxm.request.c) ipChange.ipc$dispatch("8353bda9", new Object[]{this});
        } else if (this.f19011a == null || this.f19011a.e() == null) {
            return null;
        } else {
            return this.f19011a.e();
        }
    }

    public int k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5f95765", new Object[]{this})).intValue();
        }
        com.taobao.rxm.request.c m = m();
        if (m == null) {
            return -1;
        }
        return m.H();
    }

    public void a(com.taobao.rxm.request.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb5c90", new Object[]{this, bVar});
            return;
        }
        com.taobao.rxm.request.c m = m();
        if (m == null) {
            return;
        }
        m.a(bVar);
    }

    public synchronized void b(com.taobao.rxm.request.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ad424d1", new Object[]{this, bVar});
            return;
        }
        com.taobao.rxm.request.c m = m();
        if (m != null) {
            m.b(bVar);
        }
    }

    public synchronized void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
            return;
        }
        if (this.c != null && (this.c.c instanceof nmq)) {
            ((nmq) this.c.c).h();
        }
        if (this.f19011a != null) {
            this.f19011a.d();
            if (this.g != null) {
                this.g.a(this);
            }
        }
    }
}
