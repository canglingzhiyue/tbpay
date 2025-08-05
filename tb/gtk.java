package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.job.core.a;
import com.taobao.android.job.core.b;
import com.taobao.android.job.core.d;
import com.taobao.android.job.core.l;
import com.taobao.android.job.core.o;
import com.taobao.android.job.core.p;
import com.taobao.android.launcher.common.LauncherRuntime;
import com.taobao.android.launcher.common.e;
import com.taobao.android.launcher.common.f;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public abstract class gtk implements o {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final gub<String> f28443a;
    private final gua b;
    private final a<String, Void> c;
    private final a<String, Void> d;
    private final a<String, Void> e;
    private final a<String, Void> i;
    public final p<String, Void> l;
    private final AtomicReference<ScheduledExecutorService> f = new AtomicReference<>(null);
    private final AtomicReference<ScheduledExecutorService> g = new AtomicReference<>(null);
    private final AtomicReference<ScheduledExecutorService> h = new AtomicReference<>(null);
    private final List<o> j = new CopyOnWriteArrayList();
    private final List<String> k = new CopyOnWriteArrayList();

    public abstract void e();

    public abstract f f();

    public e g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("7ede009a", new Object[]{this});
        }
        return null;
    }

    public abstract b<String, Void> h();

    public abstract b<String, Void> i();

    public b<String, Void> j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("31e1792b", new Object[]{this});
        }
        return null;
    }

    public b<String, Void> t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("3658f6b5", new Object[]{this});
        }
        return null;
    }

    public o u() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (o) ipChange.ipc$dispatch("9d31b809", new Object[]{this}) : this;
    }

    public boolean v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6945a01", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public gtk(gua guaVar) {
        this.b = guaVar;
        this.f28443a = guaVar.d;
        this.l = guaVar.f;
        b<String, Void> h = h();
        if (h != null) {
            this.c = d.a(h);
        } else {
            this.c = null;
        }
        b<String, Void> i = i();
        if (i != null) {
            this.d = d.a(i);
        } else {
            this.d = null;
        }
        b<String, Void> j = j();
        if (j != null) {
            this.e = d.a(j);
        } else {
            this.e = null;
        }
        b<String, Void> t = t();
        if (t != null) {
            this.i = d.a(t);
        } else {
            this.i = null;
        }
    }

    public static gtk a(String str, gua guaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gtk) ipChange.ipc$dispatch("a69e57b9", new Object[]{str, guaVar});
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("processName invalid");
        }
        if ("com.taobao.taobao".equals(str)) {
            return new guv(guaVar);
        }
        if ("com.taobao.taobao:channel".equals(str)) {
            return new gus(guaVar);
        }
        if (LauncherRuntime.PROCESS_SAFEMODE.equals(str)) {
            return new guw(guaVar);
        }
        if (str.contains(LauncherRuntime.PROCESS_UC_SUFFIX)) {
            return new guy(guaVar);
        }
        if (LauncherRuntime.PROCESS_SUPPORT.equals(str) || LauncherRuntime.PROCESS_TOOL.equals(str)) {
            return new gux(guaVar);
        }
        if (str.contains(LauncherRuntime.PROCESS_WIDGET)) {
            return new guz(guaVar);
        }
        return new gut(guaVar);
    }

    @Override // com.taobao.android.job.core.o
    public void b(StringBuilder sb) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53269c62", new Object[]{this, sb});
        } else if (v()) {
            sb.append("scheduler=");
            sb.append(this.c);
            sb.append("|");
            sb.append("executingSummaries=");
            for (o oVar : this.j) {
                oVar.b(sb);
            }
            sb.append("executedSummaries=");
            sb.append(this.k);
        }
    }

    public Future<com.taobao.android.job.core.task.d> a(com.taobao.android.job.core.e<String, Void> eVar, long j, TimeUnit timeUnit, gtl<String, Void> gtlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Future) ipChange.ipc$dispatch("2088df3a", new Object[]{this, eVar, new Long(j), timeUnit, gtlVar});
        }
        if (this.d == null) {
            return null;
        }
        this.g.compareAndSet(null, gtg.a("launcher-onDemand"));
        return a(this.g.get(), this.d, eVar, j, timeUnit, gtlVar);
    }

    public com.taobao.android.job.core.task.d a(com.taobao.android.job.core.e<String, Void> eVar, gtl<String, Void> gtlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.job.core.task.d) ipChange.ipc$dispatch("df4e5a30", new Object[]{this, eVar, gtlVar});
        }
        if (this.i == null) {
            return null;
        }
        gvt.a(eVar.a());
        com.taobao.android.job.core.task.d a2 = this.i.a(l.IMMEDIATE_NON_TERMINATING, eVar);
        if (gtlVar != null) {
            gtlVar.a(eVar, a2);
        }
        gvt.a();
        return a2;
    }

    public Future<com.taobao.android.job.core.task.d> b(com.taobao.android.job.core.e<String, Void> eVar, long j, TimeUnit timeUnit, gtl<String, Void> gtlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Future) ipChange.ipc$dispatch("49f05819", new Object[]{this, eVar, new Long(j), timeUnit, gtlVar});
        }
        if (this.e == null) {
            return null;
        }
        this.h.compareAndSet(null, gtg.a("launcher-idle"));
        return a(this.h.get(), this.e, eVar, j, timeUnit, gtlVar);
    }

    private Future<com.taobao.android.job.core.task.d> a(ScheduledExecutorService scheduledExecutorService, final a<String, Void> aVar, final com.taobao.android.job.core.e<String, Void> eVar, long j, TimeUnit timeUnit, final gtl<String, Void> gtlVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Future) ipChange.ipc$dispatch("3f218563", new Object[]{this, scheduledExecutorService, aVar, eVar, new Long(j), timeUnit, gtlVar}) : scheduledExecutorService.schedule(new Callable<com.taobao.android.job.core.task.d>() { // from class: tb.gtk.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, com.taobao.android.job.core.task.d] */
            @Override // java.util.concurrent.Callable
            public /* synthetic */ com.taobao.android.job.core.task.d call() throws Exception {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("6d249ded", new Object[]{this}) : a();
            }

            public com.taobao.android.job.core.task.d a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (com.taobao.android.job.core.task.d) ipChange2.ipc$dispatch("86035378", new Object[]{this});
                }
                com.taobao.android.job.core.task.d a2 = aVar.a(l.IMMEDIATE_NON_TERMINATING, eVar);
                gtl gtlVar2 = gtlVar;
                if (gtlVar2 != null) {
                    gtlVar2.a(eVar, a2);
                }
                return a2;
            }
        }, j, timeUnit);
    }

    public com.taobao.android.job.core.task.d b(com.taobao.android.job.core.e<String, Void> eVar, gtl<String, Void> gtlVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.job.core.task.d) ipChange.ipc$dispatch("e6773c71", new Object[]{this, eVar, gtlVar}) : a(eVar, l.IMMEDIATE_NON_TERMINATING, gtlVar);
    }

    public com.taobao.android.job.core.task.d a(com.taobao.android.job.core.e<String, Void> eVar, l lVar, gtl<String, Void> gtlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.job.core.task.d) ipChange.ipc$dispatch("563b9f8e", new Object[]{this, eVar, lVar, gtlVar});
        }
        if (this.c == null) {
            return null;
        }
        gvt.a(eVar.a());
        if (v()) {
            this.j.add(eVar);
        }
        com.taobao.android.job.core.task.d a2 = this.c.a(lVar, eVar);
        if (gtlVar != null) {
            gtlVar.a(eVar, a2);
        }
        if (v()) {
            this.j.remove(eVar);
            StringBuilder sb = new StringBuilder();
            eVar.b(sb);
            this.k.add(sb.toString());
        }
        gvt.a();
        return a2;
    }

    public com.taobao.android.job.core.e<String, Void> b_(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.job.core.e) ipChange.ipc$dispatch("c2eb73e5", new Object[]{this, str});
        }
        a<String, Void> aVar = this.c;
        if (aVar != null) {
            return aVar.a(str, this.b.b, this.b.f28457a, this.b.c);
        }
        return null;
    }

    public com.taobao.android.job.core.e<String, Void> d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.job.core.e) ipChange.ipc$dispatch("868a728c", new Object[]{this, str});
        }
        a<String, Void> aVar = this.i;
        if (aVar != null) {
            return aVar.a(str, this.b.b, this.b.f28457a, this.b.c);
        }
        return null;
    }

    public com.taobao.android.job.core.e<String, Void> b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.job.core.e) ipChange.ipc$dispatch("6c150f8a", new Object[]{this, str});
        }
        a<String, Void> aVar = this.d;
        if (aVar != null) {
            return aVar.a(str, this.b.b, this.b.f28457a);
        }
        return null;
    }

    public com.taobao.android.job.core.e<String, Void> c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.job.core.e) ipChange.ipc$dispatch("f94fc10b", new Object[]{this, str});
        }
        a<String, Void> aVar = this.e;
        if (aVar != null) {
            return aVar.a(str, this.b.b, this.b.f28457a);
        }
        return null;
    }
}
