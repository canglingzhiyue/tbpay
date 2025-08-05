package com.taobao.rxm.schedule;

import android.util.SparseArray;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import tb.qol;

/* loaded from: classes.dex */
public class e implements com.taobao.rxm.request.b<com.taobao.rxm.request.c>, h, l {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final j f19009a;
    private final Queue<g> b = new LinkedList();
    private final SparseArray<Long> c = new SparseArray<>();
    private final List<Integer> d = new ArrayList();
    private final long e;
    private int f;
    private int g;
    private int h;
    private long i;
    private a j;
    private boolean k;

    /* loaded from: classes.dex */
    public interface a {
        void g();
    }

    public e(j jVar, int i, int i2, boolean z) {
        this.f19009a = jVar;
        this.g = i;
        this.e = i2 * 1000000;
        this.k = z;
    }

    @Override // com.taobao.rxm.request.b
    public void a(com.taobao.rxm.request.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ebd0ef", new Object[]{this, cVar});
        } else if (cVar == null) {
        } else {
            int H = cVar.H();
            g gVar = null;
            synchronized (this) {
                Iterator<g> it = this.b.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    g next = it.next();
                    if (H == next.k()) {
                        gVar = next;
                        break;
                    }
                }
                if (gVar != null) {
                    this.b.remove(gVar);
                }
            }
            if (gVar == null) {
                return;
            }
            gVar.l();
            gVar.b((com.taobao.rxm.request.b) this);
            qol.f("RxSysLog", "[PairingThrottling] ID=%d cancelled before scheduling the action in queue", Integer.valueOf(H));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x003a, code lost:
        d(r5);
     */
    @Override // com.taobao.rxm.schedule.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(com.taobao.rxm.schedule.g r5) {
        /*
            r4 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.rxm.schedule.e.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L15
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r4
            r1[r2] = r5
            java.lang.String r5 = "3b5e8cf"
            r0.ipc$dispatch(r5, r1)
            return
        L15:
            r5.b(r4)
            boolean r0 = r4.c(r5)
            monitor-enter(r4)
            boolean r1 = r5.i()     // Catch: java.lang.Throwable -> L4a
            if (r1 == 0) goto L26
            r4.d()     // Catch: java.lang.Throwable -> L4a
        L26:
            if (r0 != 0) goto L38
            int r0 = r4.h     // Catch: java.lang.Throwable -> L4a
            int r1 = r4.g     // Catch: java.lang.Throwable -> L4a
            if (r0 < r1) goto L38
            java.util.Queue<com.taobao.rxm.schedule.g> r0 = r4.b     // Catch: java.lang.Throwable -> L4a
            boolean r0 = r0.offer(r5)     // Catch: java.lang.Throwable -> L4a
            if (r0 != 0) goto L37
            goto L38
        L37:
            r2 = 0
        L38:
            if (r2 == 0) goto L3e
            r4.d(r5)     // Catch: java.lang.Throwable -> L4a
            goto L41
        L3e:
            r5.a(r4)     // Catch: java.lang.Throwable -> L4a
        L41:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L4a
            if (r2 == 0) goto L49
            com.taobao.rxm.schedule.j r0 = r4.f19009a
            r0.a(r5)
        L49:
            return
        L4a:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L4a
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.rxm.schedule.e.a(com.taobao.rxm.schedule.g):void");
    }

    private boolean c(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("14166891", new Object[]{this, gVar})).booleanValue() : gVar.k() > 0 && !gVar.i() && gVar.j();
    }

    private synchronized void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        long nanoTime = System.nanoTime();
        if (nanoTime - this.i < 30000000) {
            return;
        }
        this.i = nanoTime;
        this.d.clear();
        int size = this.c.size();
        long nanoTime2 = System.nanoTime();
        for (int i = 0; i < size; i++) {
            Long valueAt = this.c.valueAt(i);
            if (valueAt != null && nanoTime2 - valueAt.longValue() >= this.e) {
                this.d.add(Integer.valueOf(this.c.keyAt(i)));
            }
        }
        int size2 = this.d.size();
        boolean z = false;
        for (int i2 = 0; i2 < size2; i2++) {
            int intValue = this.d.get(i2).intValue();
            qol.f("RxSysLog", "[PairingThrottling] remove expired pair, id=%d", Integer.valueOf(intValue));
            if (!c(intValue) && !z) {
                z = false;
            }
            z = true;
        }
        if (this.f < 3) {
            this.f += size2;
            if (this.f >= 3) {
                this.g = Integer.MAX_VALUE;
                qol.g("RxSysLog", "[PairingThrottling] auto degrade to unlimited scheduler, expired total=%d", Integer.valueOf(this.f));
                if (this.j != null) {
                    this.j.g();
                }
            }
        }
        if (z) {
            e();
        }
    }

    @Override // com.taobao.rxm.schedule.l
    public synchronized void a(int i) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        synchronized (this) {
            if (this.f >= 3 || i == this.g) {
                z = false;
            }
            if (z) {
                this.g = i;
            }
            if (z) {
                e();
            }
        }
    }

    private synchronized void d(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c46a86c", new Object[]{this, gVar});
            return;
        }
        int k = gVar.k();
        if (k <= 0) {
            this.h++;
            return;
        }
        if (gVar.i() && this.c.get(k) == null) {
            this.c.put(k, Long.valueOf(System.nanoTime()));
            this.h++;
        }
    }

    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
        } else if (!c(i)) {
        } else {
            e();
        }
    }

    private boolean c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab8b44dd", new Object[]{this, new Integer(i)})).booleanValue();
        }
        synchronized (this) {
            if (i <= 0) {
                this.h--;
                return true;
            } else if (this.c.get(i) == null) {
                return false;
            } else {
                this.c.remove(i);
                this.h--;
                return true;
            }
        }
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
                d();
                if (this.h < this.g) {
                    gVar2 = this.b.poll();
                }
                if (gVar2 != null) {
                    d(gVar2);
                }
            }
            if (gVar2 == null) {
                return;
            }
            gVar2.b((com.taobao.rxm.request.b) this);
            this.f19009a.a(gVar2);
            g.b.set(gVar);
        }
    }

    @Override // com.taobao.rxm.schedule.j
    public synchronized String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        return this.f19009a.a();
    }

    @Override // com.taobao.rxm.schedule.j
    public synchronized boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        return this.f19009a.b();
    }

    @Override // com.taobao.rxm.schedule.j
    public synchronized int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue();
        }
        return this.b.size();
    }

    @Override // com.taobao.rxm.schedule.h
    public void b(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8be628ae", new Object[]{this, gVar});
            return;
        }
        int k = gVar.k();
        if ((k > 0 && !this.k && !gVar.j()) || !c(k)) {
            return;
        }
        e();
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e94a37f4", new Object[]{this, aVar});
        } else {
            this.j = aVar;
        }
    }
}
