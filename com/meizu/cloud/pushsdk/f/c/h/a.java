package com.meizu.cloud.pushsdk.f.c.h;

import com.meizu.cloud.pushsdk.e.d.i;
import com.meizu.cloud.pushsdk.f.c.a;
import com.meizu.cloud.pushsdk.f.c.e;
import com.meizu.cloud.pushsdk.f.c.f;
import com.meizu.cloud.pushsdk.f.c.g;
import com.meizu.cloud.pushsdk.f.e.d;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes4.dex */
public class a extends com.meizu.cloud.pushsdk.f.c.a {
    private final String s;
    private d t;
    private int u;

    /* renamed from: com.meizu.cloud.pushsdk.f.c.h.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    class RunnableC0282a implements Runnable {
        RunnableC0282a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (((com.meizu.cloud.pushsdk.f.c.a) a.this).r.compareAndSet(false, true)) {
                a.this.d();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b implements Callable<Integer> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f7959a;

        b(i iVar) {
            this.f7959a = iVar;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Integer call() {
            return Integer.valueOf(a.this.a(this.f7959a));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c implements Callable<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Long f7960a;

        c(Long l) {
            this.f7960a = l;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Boolean call() {
            return Boolean.valueOf(a.this.t.a(this.f7960a.longValue()));
        }
    }

    public a(a.C0281a c0281a) {
        super(c0281a);
        String simpleName = a.class.getSimpleName();
        this.s = simpleName;
        com.meizu.cloud.pushsdk.f.e.a aVar = new com.meizu.cloud.pushsdk.f.e.a(this.c, this.m);
        this.t = aVar;
        if (!aVar.a()) {
            this.t = new com.meizu.cloud.pushsdk.f.e.c(this.m);
            com.meizu.cloud.pushsdk.f.g.c.b(simpleName, "init memory store", new Object[0]);
        }
    }

    private LinkedList<g> a(LinkedList<e> linkedList) {
        LinkedList<g> linkedList2 = new LinkedList<>();
        LinkedList linkedList3 = new LinkedList();
        Iterator<e> it = linkedList.iterator();
        while (it.hasNext()) {
            linkedList3.add(com.meizu.cloud.pushsdk.f.c.h.b.a(b(it.next().b())));
        }
        com.meizu.cloud.pushsdk.f.g.c.a(this.s, "Request Futures: %s", Integer.valueOf(linkedList3.size()));
        for (int i = 0; i < linkedList3.size(); i++) {
            int i2 = -1;
            try {
                i2 = ((Integer) ((Future) linkedList3.get(i)).get(5L, TimeUnit.SECONDS)).intValue();
            } catch (InterruptedException e) {
                com.meizu.cloud.pushsdk.f.g.c.b(this.s, "Request Future was interrupted: %s", e.getMessage());
            } catch (ExecutionException e2) {
                com.meizu.cloud.pushsdk.f.g.c.b(this.s, "Request Future failed: %s", e2.getMessage());
            } catch (TimeoutException e3) {
                com.meizu.cloud.pushsdk.f.g.c.b(this.s, "Request Future had a timeout: %s", e3.getMessage());
            }
            if (linkedList.get(i).c()) {
                linkedList2.add(new g(true, linkedList.get(i).a()));
            } else {
                linkedList2.add(new g(a(i2), linkedList.get(i).a()));
            }
        }
        return linkedList2;
    }

    private Callable<Boolean> a(Long l) {
        return new c(l);
    }

    private LinkedList<Boolean> b(LinkedList<Long> linkedList) {
        boolean z;
        LinkedList<Boolean> linkedList2 = new LinkedList<>();
        LinkedList linkedList3 = new LinkedList();
        Iterator<Long> it = linkedList.iterator();
        while (it.hasNext()) {
            linkedList3.add(com.meizu.cloud.pushsdk.f.c.h.b.a(a(it.next())));
        }
        com.meizu.cloud.pushsdk.f.g.c.a(this.s, "Removal Futures: %s", Integer.valueOf(linkedList3.size()));
        for (int i = 0; i < linkedList3.size(); i++) {
            try {
                z = ((Boolean) ((Future) linkedList3.get(i)).get(5L, TimeUnit.SECONDS)).booleanValue();
            } catch (InterruptedException e) {
                com.meizu.cloud.pushsdk.f.g.c.b(this.s, "Removal Future was interrupted: %s", e.getMessage());
                z = false;
                linkedList2.add(Boolean.valueOf(z));
            } catch (ExecutionException e2) {
                com.meizu.cloud.pushsdk.f.g.c.b(this.s, "Removal Future failed: %s", e2.getMessage());
                z = false;
                linkedList2.add(Boolean.valueOf(z));
            } catch (TimeoutException e3) {
                com.meizu.cloud.pushsdk.f.g.c.b(this.s, "Removal Future had a timeout: %s", e3.getMessage());
                z = false;
                linkedList2.add(Boolean.valueOf(z));
            }
            linkedList2.add(Boolean.valueOf(z));
        }
        return linkedList2;
    }

    private Callable<Integer> b(i iVar) {
        return new b(iVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        if (!com.meizu.cloud.pushsdk.f.g.e.d(this.c)) {
            com.meizu.cloud.pushsdk.f.g.c.b(this.s, "Emitter loop stopping: emitter offline.", new Object[0]);
            this.r.compareAndSet(true, false);
            return;
        }
        if (this.t.b() > 0) {
            this.u = 0;
            LinkedList<g> a2 = a(a(this.t.c()));
            com.meizu.cloud.pushsdk.f.g.c.c(this.s, "Processing emitter results.", new Object[0]);
            LinkedList<Long> linkedList = new LinkedList<>();
            Iterator<g> it = a2.iterator();
            int i = 0;
            int i2 = 0;
            while (it.hasNext()) {
                g next = it.next();
                if (next.b()) {
                    linkedList.addAll(next.a());
                    i += next.a().size();
                } else {
                    i2 += next.a().size();
                    com.meizu.cloud.pushsdk.f.g.c.b(this.s, "Request sending failed but we will retry later.", new Object[0]);
                }
            }
            b(linkedList);
            com.meizu.cloud.pushsdk.f.g.c.a(this.s, "Success Count: %s", Integer.valueOf(i));
            com.meizu.cloud.pushsdk.f.g.c.a(this.s, "Failure Count: %s", Integer.valueOf(i2));
            f fVar = this.e;
            if (fVar != null) {
                if (i2 != 0) {
                    fVar.a(i, i2);
                } else {
                    fVar.a(i);
                }
            }
            if (i2 > 0 && i == 0) {
                if (com.meizu.cloud.pushsdk.f.g.e.d(this.c)) {
                    com.meizu.cloud.pushsdk.f.g.c.b(this.s, "Ensure collector path is valid: %s", c());
                }
                com.meizu.cloud.pushsdk.f.g.c.b(this.s, "Emitter loop stopping: failures.", new Object[0]);
                this.r.compareAndSet(true, false);
                return;
            }
        } else {
            int i3 = this.u;
            if (i3 >= this.l) {
                com.meizu.cloud.pushsdk.f.g.c.b(this.s, "Emitter loop stopping: empty limit reached.", new Object[0]);
                this.r.compareAndSet(true, false);
                f fVar2 = this.e;
                if (fVar2 == null) {
                    return;
                }
                fVar2.a(true);
                return;
            }
            this.u = i3 + 1;
            String str = this.s;
            com.meizu.cloud.pushsdk.f.g.c.b(str, "Emitter database empty: " + this.u, new Object[0]);
            try {
                this.p.sleep(this.k);
            } catch (InterruptedException e) {
                String str2 = this.s;
                com.meizu.cloud.pushsdk.f.g.c.b(str2, "Emitter thread sleep interrupted: " + e.toString(), new Object[0]);
            }
        }
        d();
    }

    @Override // com.meizu.cloud.pushsdk.f.c.a
    public void a(com.meizu.cloud.pushsdk.f.b.a aVar, boolean z) {
        this.t.a(aVar);
        String str = this.s;
        com.meizu.cloud.pushsdk.f.g.c.b(str, "isRunning " + this.r + " attemptEmit " + z, new Object[0]);
        if (!z) {
            try {
                this.p.sleep(1L);
            } catch (InterruptedException e) {
                String str2 = this.s;
                com.meizu.cloud.pushsdk.f.g.c.b(str2, "Emitter add thread sleep interrupted: " + e.toString(), new Object[0]);
            }
        }
        if (this.r.compareAndSet(false, true)) {
            d();
        }
    }

    @Override // com.meizu.cloud.pushsdk.f.c.a
    public void b() {
        com.meizu.cloud.pushsdk.f.c.h.b.a(new RunnableC0282a());
    }
}
