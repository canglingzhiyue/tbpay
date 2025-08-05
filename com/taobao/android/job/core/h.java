package com.taobao.android.job.core;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.job.core.graph.Node;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;
import tb.gsl;

/* loaded from: classes.dex */
public class h<T, R> implements g<T, R> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final com.taobao.android.job.core.graph.d<T, R> b = com.taobao.android.job.core.graph.e.a();

    /* renamed from: a  reason: collision with root package name */
    private int f12991a = 0;
    private final AtomicInteger c = new AtomicInteger(0);
    private final Collection<Node<T, R>> d = new CopyOnWriteArrayList();
    private final Collection<Node<T, R>> e = new CopyOnWriteArrayList();
    private final Collection<com.taobao.android.job.core.task.b<T, R>> f = new CopyOnWriteArraySet();

    @Override // com.taobao.android.job.core.graph.c
    public void addIndependent(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6089ffc", new Object[]{this, t});
        } else {
            this.b.addIndependent(t);
        }
    }

    @Override // com.taobao.android.job.core.graph.c
    public void addDependency(T t, T t2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1763048b", new Object[]{this, t, t2});
        } else {
            this.b.addDependency(t, t2);
        }
    }

    @Override // com.taobao.android.job.core.graph.c
    public void addAsDependentOnAllLeafNodes(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2dc98860", new Object[]{this, t});
        } else {
            this.b.addAsDependentOnAllLeafNodes(t);
        }
    }

    @Override // com.taobao.android.job.core.graph.c
    public void addAsDependencyToAllInitialNodes(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d19e8038", new Object[]{this, t});
        } else {
            this.b.addAsDependencyToAllInitialNodes(t);
        }
    }

    @Override // com.taobao.android.job.core.g
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.f12991a = i;
        }
    }

    @Override // com.taobao.android.job.core.g
    public Set<Node<T, R>> b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Set) ipChange.ipc$dispatch("6dc1d418", new Object[]{this}) : this.b.getInitialNodes();
    }

    @Override // com.taobao.android.job.core.g
    public int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : this.b.size();
    }

    @Override // com.taobao.android.job.core.g
    public Node<T, R> a(T t) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Node) ipChange.ipc$dispatch("c0eb23d3", new Object[]{this, t}) : this.b.get(t);
    }

    @Override // com.taobao.android.job.core.g
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else {
            gsl.a("DAGStageStateImpl", "incrementUnProcessedNodesCount, total nodes unprocessed count: %d", Integer.valueOf(this.c.incrementAndGet()));
        }
    }

    @Override // com.taobao.android.job.core.g
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else {
            gsl.a("DAGStageStateImpl", "decrementUnProcessedNodesCount, total nodes unprocessed count: %d", Integer.valueOf(this.c.decrementAndGet()));
        }
    }

    @Override // com.taobao.android.job.core.g
    public int d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue() : this.c.get();
    }

    @Override // com.taobao.android.job.core.g
    public boolean a(Node<T, R> node) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4235fead", new Object[]{this, node})).booleanValue() : !c(node) && d(node);
    }

    private boolean c(Node<T, R> node) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("777783af", new Object[]{this, node})).booleanValue() : this.d.contains(node);
    }

    private boolean d(Node<T, R> node) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("12184630", new Object[]{this, node})).booleanValue() : node.getInComingNodes().isEmpty() || a((Set) node.getInComingNodes());
    }

    private boolean a(Set<Node<T, R>> set) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("64b9555b", new Object[]{this, set})).booleanValue() : this.d.containsAll(set);
    }

    @Override // com.taobao.android.job.core.g
    public void b(Node<T, R> node) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcd6c12a", new Object[]{this, node});
        } else {
            this.d.add(node);
        }
    }

    @Override // com.taobao.android.job.core.g
    public Collection<Node<T, R>> g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Collection) ipChange.ipc$dispatch("11851419", new Object[]{this}) : new ArrayList(this.d);
    }

    @Override // com.taobao.android.job.core.g
    public boolean h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue() : !this.e.isEmpty();
    }

    @Override // com.taobao.android.job.core.g
    public Collection<Node<T, R>> i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Collection) ipChange.ipc$dispatch("1537ba57", new Object[]{this}) : new ArrayList(this.e);
    }

    @Override // com.taobao.android.job.core.g
    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
        } else {
            this.e.clear();
        }
    }

    @Override // com.taobao.android.job.core.g
    public void a(Collection<Node<T, R>> collection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2847c19", new Object[]{this, collection});
        } else {
            this.e.addAll(collection);
        }
    }

    @Override // com.taobao.android.job.core.g
    public void a(com.taobao.android.job.core.graph.i<T, R> iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56f9d35c", new Object[]{this, iVar});
        } else {
            com.taobao.android.job.core.graph.h.a(this.b).a(iVar);
        }
    }

    @Override // com.taobao.android.job.core.g
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            com.taobao.android.job.core.graph.e.a(this.b);
        }
    }

    @Override // com.taobao.android.job.core.g
    public void a(com.taobao.android.job.core.task.b<T, R> bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8abd9074", new Object[]{this, bVar});
        } else {
            this.f.add(bVar);
        }
    }

    @Override // com.taobao.android.job.core.g
    public void b(com.taobao.android.job.core.task.b<T, R> bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("175dbb75", new Object[]{this, bVar});
        } else {
            this.f.remove(bVar);
        }
    }

    @Override // com.taobao.android.job.core.g
    public int k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5f95765", new Object[]{this})).intValue() : this.f.size();
    }

    @Override // com.taobao.android.job.core.g
    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
        } else {
            this.f12991a = 2;
        }
    }
}
