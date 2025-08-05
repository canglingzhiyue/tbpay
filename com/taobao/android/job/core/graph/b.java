package com.taobao.android.job.core.graph;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Collection;

/* loaded from: classes.dex */
public class b<T, R> implements a<T, R> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Collection<Node<T, R>> f12989a = new ArrayList();
    private final Collection<Node<T, R>> b = new ArrayList();

    @Override // com.taobao.android.job.core.graph.a
    public void a(d<T, R> dVar) throws GraphCycleDetectedException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56f78d81", new Object[]{this, dVar});
            return;
        }
        try {
            a(dVar.allNodes());
        } finally {
            this.f12989a.clear();
            this.b.clear();
        }
    }

    private void a(Collection<Node<T, R>> collection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2847c19", new Object[]{this, collection});
            return;
        }
        for (Node<T, R> node : collection) {
            a(node);
        }
    }

    private void a(Node<T, R> node) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4235fea9", new Object[]{this, node});
            return;
        }
        this.f12989a.add(node);
        this.b.add(node);
        b(node);
        this.b.remove(node);
    }

    private void b(Node<T, R> node) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcd6c12a", new Object[]{this, node});
            return;
        }
        for (Node<T, R> node2 : node.getOutGoingNodes()) {
            if (!c(node2)) {
                a(node2);
            } else if (d(node2)) {
                throw new GraphCycleDetectedException("Cycle Detected " + node + " With " + node2);
            }
        }
    }

    private boolean c(Node<T, R> node) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("777783af", new Object[]{this, node})).booleanValue() : this.f12989a.contains(node);
    }

    private boolean d(Node<T, R> node) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("12184630", new Object[]{this, node})).booleanValue() : this.b.contains(node);
    }
}
