package com.taobao.android.job.core;

import android.os.SystemClock;
import android.os.Trace;
import com.alibaba.security.realidentity.r3;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.job.core.task.TaskExecutionException;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletionService;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import tb.gsl;

/* loaded from: classes.dex */
public final class n<T, R> implements m<T, R> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final ExecutorService b;
    private final CompletionService<com.taobao.android.job.core.task.b<T, R>> c;
    private final p<T, R> d;

    /* renamed from: a  reason: collision with root package name */
    private final Collection<k<T, R>> f13001a = new CopyOnWriteArrayList();
    private final Set<T> e = new HashSet();

    public static /* synthetic */ Collection a(n nVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Collection) ipChange.ipc$dispatch("b6795071", new Object[]{nVar}) : nVar.f13001a;
    }

    public n(ExecutorService executorService, p<T, R> pVar) {
        this.b = executorService;
        this.c = new ExecutorCompletionService(executorService);
        this.d = pVar;
        p<T, R> pVar2 = this.d;
        if (pVar2 != null) {
            pVar2.a(500L);
        }
        a(DefferReason.TIMEOUT_POLLING_INITIAL);
    }

    @Override // com.taobao.android.job.core.m
    public void a(e<T, R> eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70789ebf", new Object[]{this, eVar});
            return;
        }
        p<T, R> pVar = this.d;
        if (pVar == null) {
            return;
        }
        pVar.a(eVar.a());
    }

    @Override // com.taobao.android.job.core.m
    public void b(e<T, R> eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4b7d71e", new Object[]{this, eVar});
            return;
        }
        p<T, R> pVar = this.d;
        if (pVar == null) {
            return;
        }
        pVar.b(eVar.a());
    }

    @Override // com.taobao.android.job.core.m
    public com.taobao.android.job.core.task.b<T, R> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.job.core.task.b) ipChange.ipc$dispatch("8603533a", new Object[]{this});
        }
        p<T, R> pVar = this.d;
        if (pVar == null || !pVar.a()) {
            try {
                return this.c.take().get();
            } catch (Exception e) {
                throw new TaskExecutionException("Task executed failed", e);
            }
        }
        gsl.a("TaskSchedulerImpl", r3.r);
        long uptimeMillis = SystemClock.uptimeMillis();
        try {
            try {
                Trace.beginSection("TaskScheduler#polling");
                com.taobao.android.job.core.task.b<T, R> b = b();
                this.e.remove(b.a());
                return b;
            } catch (Exception e2) {
                throw new TaskExecutionException("Task executed failed", e2);
            }
        } finally {
            gsl.a("TaskSchedulerImpl", "processResult cost %dms", Long.valueOf(SystemClock.uptimeMillis() - uptimeMillis));
            Trace.endSection();
        }
    }

    private com.taobao.android.job.core.task.b<T, R> b() throws ExecutionException, InterruptedException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.job.core.task.b) ipChange.ipc$dispatch("dd214419", new Object[]{this});
        }
        while (true) {
            Future<com.taobao.android.job.core.task.b<T, R>> poll = this.c.poll(100L, TimeUnit.MILLISECONDS);
            if (poll == null) {
                c();
            } else {
                return poll.get();
            }
        }
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (d()) {
        } else {
            a(DefferReason.TIMEOUT_POLLING_SINGLE_TASK);
        }
    }

    private boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
        }
        p<T, R> pVar = this.d;
        if (pVar == null || !pVar.b()) {
            return false;
        }
        gsl.b("TaskSchedulerImpl", "WARNING, pollingTimeout due to timeout reached, please check the summary below:", new Object[0]);
        this.d.a(this.b, this.e);
        a(DefferReason.TIMEOUT_POLLING_PERIOD);
        return true;
    }

    private void a(String str) {
        com.taobao.android.job.core.task.e<T, R> e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        p<T, R> pVar = this.d;
        if (pVar == null || (e = pVar.e()) == null) {
            return;
        }
        gsl.b("TaskSchedulerImpl", "executing deffer task due to { reason=%s }", str);
        if (e.intercept(null)) {
            Trace.beginSection("TaskScheduler#defferTask#" + str);
            e.execute();
            Trace.endSection();
        }
        this.d.b(e);
    }

    @Override // com.taobao.android.job.core.m
    public com.taobao.android.job.core.task.b<T, R> a(com.taobao.android.job.core.task.e<T, R> eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.job.core.task.b) ipChange.ipc$dispatch("68f93971", new Object[]{this, eVar});
        }
        T id = eVar.getId();
        gsl.a("TaskSchedulerImpl", "Received Task %s", id);
        Callable<com.taobao.android.job.core.task.b<T, R>> b = b(eVar);
        if (!eVar.shouldRunImmediately()) {
            this.c.submit(b);
            this.e.add(id);
            return null;
        }
        try {
            return b.call();
        } catch (Exception e) {
            return com.taobao.android.job.core.task.b.a(id, null, e.getMessage());
        }
    }

    private Callable<com.taobao.android.job.core.task.b<T, R>> b(final com.taobao.android.job.core.task.e<T, R> eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Callable) ipChange.ipc$dispatch("383470d3", new Object[]{this, eVar}) : new Callable<com.taobao.android.job.core.task.b<T, R>>() { // from class: com.taobao.android.job.core.n.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.util.concurrent.Callable
            public /* synthetic */ Object call() throws Exception {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("6d249ded", new Object[]{this}) : a();
            }

            public com.taobao.android.job.core.task.b<T, R> a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (com.taobao.android.job.core.task.b) ipChange2.ipc$dispatch("8603533a", new Object[]{this});
                }
                Object obj = null;
                try {
                    long currentTimeMillis = System.currentTimeMillis();
                    for (k kVar : n.a(n.this)) {
                        kVar.a(eVar, currentTimeMillis);
                    }
                    obj = eVar.execute();
                    com.taobao.android.job.core.task.b<T, R> a2 = com.taobao.android.job.core.task.b.a(eVar.getId(), obj, currentTimeMillis, System.currentTimeMillis());
                    a2.b().e = eVar.shouldRunImmediately();
                    for (k kVar2 : n.a(n.this)) {
                        kVar2.a(eVar, a2);
                    }
                    return a2;
                } catch (Throwable th) {
                    com.taobao.android.job.core.task.b<T, R> a3 = com.taobao.android.job.core.task.b.a(eVar.getId(), obj, th.getMessage());
                    for (k kVar3 : n.a(n.this)) {
                        kVar3.a(eVar, a3, th);
                    }
                    gsl.b("TaskSchedulerImpl", "Error Execution Task # %s", eVar.getId(), th);
                    return a3;
                }
            }
        };
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this}) : this.b.toString();
    }

    @Override // com.taobao.android.job.core.m
    public boolean a(k<T, R> kVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("707b58fd", new Object[]{this, kVar})).booleanValue();
        }
        if (kVar == null) {
            return false;
        }
        return this.f13001a.add(kVar);
    }

    @Override // com.taobao.android.job.core.m
    public boolean b(k<T, R> kVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e4ba915c", new Object[]{this, kVar})).booleanValue();
        }
        if (kVar == null) {
            return false;
        }
        return this.f13001a.remove(kVar);
    }
}
