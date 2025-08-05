package com.taobao.android.job.core;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.job.core.graph.Node;
import com.taobao.android.job.core.task.TaskNotFoundException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import tb.gsl;
import tb.gsn;

/* loaded from: classes.dex */
public class f<T, R> extends e<T, R> implements com.taobao.android.job.core.graph.c<T>, k<T, R> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final com.taobao.android.job.core.task.g<T, R> f12988a;
    private final com.taobao.android.job.core.task.f<T, R> b;
    private final m<T, R> c;
    private final String f;
    private final g<T, R> d = new h();
    private final Map<T, com.taobao.android.job.core.task.d> g = new ConcurrentHashMap();

    public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.job.core.e
    public com.taobao.android.job.core.graph.c<T> b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.job.core.graph.c) ipChange.ipc$dispatch("e58a5023", new Object[]{this}) : this;
    }

    public f(String str, m<T, R> mVar, com.taobao.android.job.core.task.g<T, R> gVar, com.taobao.android.job.core.task.f<T, R> fVar) {
        this.f = str;
        this.c = mVar;
        this.f12988a = gVar;
        this.b = fVar;
    }

    @Override // com.taobao.android.job.core.e
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f;
    }

    @Override // com.taobao.android.job.core.o
    public void b(StringBuilder sb) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53269c62", new Object[]{this, sb});
            return;
        }
        sb.append("stageName=");
        sb.append(this.f);
        for (Map.Entry<T, com.taobao.android.job.core.task.d> entry : this.g.entrySet()) {
            sb.append("|");
            sb.append(entry.getKey());
            sb.append("=");
            sb.append(entry.getValue().a());
        }
        sb.append("&");
    }

    @Override // com.taobao.android.job.core.e
    public com.taobao.android.job.core.task.d a(l lVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.job.core.task.d) ipChange.ipc$dispatch("38fccc88", new Object[]{this, lVar});
        }
        this.d.a(1);
        Set<Node<T, R>> b = this.d.b();
        this.g.clear();
        this.c.a((k) this);
        this.c.a((e) this);
        gsl.a("DAGStageImpl", "Start to process stage %s", this.f);
        long currentTimeMillis = System.currentTimeMillis();
        a(lVar, (Set) b);
        b(lVar);
        long currentTimeMillis2 = System.currentTimeMillis();
        long a2 = gsn.a(currentTimeMillis, currentTimeMillis2);
        this.c.b((k) this);
        this.c.b((e) this);
        this.d.a(2);
        this.d.n();
        int a3 = this.d.a();
        int size = this.d.g().size();
        gsl.a("DAGStageImpl", "Total Time taken to process %s jobs in %d ms of stage '%s'.", Integer.valueOf(a3), Long.valueOf(a2), this.f);
        gsl.a("DAGStageImpl", "Processed Nodes Ordering %s", this.d.g());
        return com.taobao.android.job.core.task.d.a(a3, size, currentTimeMillis, currentTimeMillis2);
    }

    public void a(com.taobao.android.job.core.graph.i<T, R> iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56f9d35c", new Object[]{this, iVar});
        } else {
            this.d.a((com.taobao.android.job.core.graph.i) iVar);
        }
    }

    @Override // com.taobao.android.job.core.e
    public Map<T, com.taobao.android.job.core.task.d> a(StringBuilder sb) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a629f1b8", new Object[]{this, sb});
        }
        a(new i(sb, this.g));
        return Collections.unmodifiableMap(this.g);
    }

    @Override // com.taobao.android.job.core.graph.c
    public void addIndependent(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6089ffc", new Object[]{this, t});
            return;
        }
        this.d.c();
        this.d.addIndependent(t);
    }

    @Override // com.taobao.android.job.core.graph.c
    public void addDependency(T t, T t2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1763048b", new Object[]{this, t, t2});
            return;
        }
        this.d.c();
        this.d.addDependency(t, t2);
    }

    @Override // com.taobao.android.job.core.graph.c
    public void addAsDependentOnAllLeafNodes(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2dc98860", new Object[]{this, t});
            return;
        }
        this.d.c();
        this.d.addAsDependentOnAllLeafNodes(t);
    }

    @Override // com.taobao.android.job.core.graph.c
    public void addAsDependencyToAllInitialNodes(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d19e8038", new Object[]{this, t});
            return;
        }
        this.d.c();
        this.d.addAsDependencyToAllInitialNodes(t);
    }

    private void a(l lVar, Set<Node<T, R>> set) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5bdf667", new Object[]{this, lVar, set});
        } else if (!set.isEmpty()) {
            for (Node<T, R> node : set) {
                if (!this.d.a((Node) node)) {
                    gsl.a("DAGStageImpl", "node %s depends on %s", node.getValue(), node.getInComingNodes());
                } else {
                    com.taobao.android.job.core.task.e<T, R> a2 = a(lVar, (Node) node);
                    if (!node.isProcessed()) {
                        if (!a2.intercept(null)) {
                            node.setSkipped();
                            gsl.a("DAGStageImpl", "Execution Skipped for node # %s ", node.getValue());
                            this.d.b(node);
                            b(lVar, node.getOutGoingNodes());
                        } else {
                            gsl.a("DAGStageImpl", "Submitting %s node for execution", node.getValue());
                            com.taobao.android.job.core.task.b<T, R> a3 = this.c.a(a2);
                            if (a3 != null) {
                                a(lVar, (com.taobao.android.job.core.task.b) a3, true);
                            } else {
                                this.d.e();
                                b(lVar, node.getOutGoingNodes());
                            }
                        }
                    }
                }
            }
        }
    }

    private void b(l lVar, Set<Node<T, R>> set) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9491428", new Object[]{this, lVar, set});
        } else if (set.isEmpty()) {
        } else {
            a(lVar, (Set) set);
        }
    }

    private void b(l lVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4bb05b7", new Object[]{this, lVar});
            return;
        }
        while (true) {
            int d = this.d.d();
            if (d <= 0) {
                return;
            }
            gsl.a("DAGStageImpl", "waitingDoneExecution, current unprocessed count: %d", Integer.valueOf(d));
            a(lVar, (com.taobao.android.job.core.task.b) this.c.a(), false);
        }
    }

    private void a(l lVar, com.taobao.android.job.core.task.b<T, R> bVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a774a5f0", new Object[]{this, lVar, bVar, new Boolean(z)});
            return;
        }
        gsl.a("DAGStageImpl", "doneExecution node %s with status %s", bVar.a(), Integer.valueOf(bVar.d()));
        Node<T, R> a2 = this.d.a((g<T, R>) bVar.a());
        if (a2 == null) {
            gsl.b("DAGStageImpl", "got a unexpected node with id '%s', it seems that it is not in graph of stage '%s'", bVar.a(), this.f);
            return;
        }
        if (!z) {
            this.d.f();
        }
        a(bVar, a2);
        if (bVar.e()) {
            this.d.b(a2);
        }
        if (bVar.e() && !e() && this.d.h()) {
            HashSet hashSet = new HashSet(this.d.i());
            this.d.j();
            a(lVar, (Set) hashSet);
        }
        if (lVar.b() || !e()) {
            b(lVar, a2.getOutGoingNodes());
        } else if (!e() || !bVar.e()) {
        } else {
            this.d.a((Collection) a2.getOutGoingNodes());
        }
    }

    private com.taobao.android.job.core.task.e<T, R> a(l lVar, Node<T, R> node) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.job.core.task.e) ipChange.ipc$dispatch("a31cfac6", new Object[]{this, lVar, node}) : a(lVar, (l) node.getValue());
    }

    private com.taobao.android.job.core.task.e<T, R> a(l lVar, T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.job.core.task.e) ipChange.ipc$dispatch("b988554b", new Object[]{this, lVar, t});
        }
        com.taobao.android.job.core.task.e<T, R> a2 = this.f12988a.a(t);
        if (a2 == null) {
            throw new TaskNotFoundException("task not found: " + t + " in " + this.f12988a);
        }
        a2.setId(t);
        return this.b.a(a2);
    }

    private void c(Node<T, R> node) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("777783ab", new Object[]{this, node});
        } else {
            node.setData(Integer.valueOf(a(node) + 1));
        }
    }

    private int a(Node<T, R> node) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4235fe9c", new Object[]{this, node})).intValue();
        }
        Integer num = (Integer) node.getData();
        if (num == null) {
            num = 0;
        }
        return num.intValue();
    }

    private void a(com.taobao.android.job.core.task.b<T, R> bVar, Node<T, R> node) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("801526b5", new Object[]{this, bVar, node});
            return;
        }
        c(node);
        node.setResult(bVar.c());
        if (bVar.f()) {
            node.setErrored();
        } else {
            node.setSuccess();
        }
    }

    private boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue() : this.d.k() > 0;
    }

    @Override // com.taobao.android.job.core.k
    public void a(com.taobao.android.job.core.task.e<T, R> eVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd1f3b53", new Object[]{this, eVar, new Long(j)});
        } else {
            this.g.put(eVar.getId(), com.taobao.android.job.core.task.d.a(j, -1L));
        }
    }

    @Override // com.taobao.android.job.core.k
    public void a(com.taobao.android.job.core.task.e<T, R> eVar, com.taobao.android.job.core.task.b<T, R> bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("684711d", new Object[]{this, eVar, bVar});
            return;
        }
        this.d.b(bVar);
        gsl.a("DAGStageImpl", "Executed: %s, %s", eVar.getId(), bVar.b());
        this.g.put(eVar.getId(), bVar.b());
    }

    @Override // com.taobao.android.job.core.k
    public void a(com.taobao.android.job.core.task.e<T, R> eVar, com.taobao.android.job.core.task.b<T, R> bVar, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4cfa46f8", new Object[]{this, eVar, bVar, th});
        } else {
            this.d.a((com.taobao.android.job.core.task.b) bVar);
        }
    }
}
