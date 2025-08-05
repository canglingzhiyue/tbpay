package com.taobao.android.job.core.graph;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class h<T, R> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final d<T, R> f12990a;
    private List<Node<T, R>> b = new ArrayList();

    public abstract void a(i<T, R> iVar);

    public h(d<T, R> dVar) {
        this.f12990a = dVar;
    }

    public static <T, R> h<T, R> a(d<T, R> dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (h) ipChange.ipc$dispatch("8e9c6e56", new Object[]{dVar}) : new f(dVar);
    }

    public List<List<List<Node<T, R>>>> b(d<T, R> dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("63f77ba7", new Object[]{this, dVar});
        }
        ArrayList arrayList = new ArrayList();
        for (Node<T, R> node : dVar.getInitialNodes()) {
            ArrayList arrayList2 = new ArrayList();
            a(arrayList2, node);
            arrayList.add(arrayList2);
        }
        return arrayList;
    }

    private void a(List<List<Node<T, R>>> list, Node<T, R> node) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e2b369a", new Object[]{this, list, node});
            return;
        }
        LinkedList linkedList = new LinkedList();
        linkedList.offer(node);
        while (!linkedList.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            int size = linkedList.size();
            for (int i = 0; i < size; i++) {
                Node<T, R> node2 = (Node) linkedList.poll();
                if (!a(node2) && a(node2.getInComingNodes())) {
                    if (!arrayList.contains(node2) && !a(arrayList, node2.getInComingNodes())) {
                        arrayList.add(node2);
                        this.b.add(node2);
                    }
                    for (Node<T, R> node3 : node2.getOutGoingNodes()) {
                        if (node3 != null && !this.b.contains(node3)) {
                            linkedList.offer(node3);
                        }
                    }
                }
            }
            list.add(arrayList);
        }
    }

    private boolean a(List<Node<T, R>> list, Set<Node<T, R>> set) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b962f84a", new Object[]{this, list, set})).booleanValue();
        }
        for (Node<T, R> node : set) {
            if (list.contains(node)) {
                return true;
            }
        }
        return false;
    }

    private boolean a(Node<T, R> node) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4235fead", new Object[]{this, node})).booleanValue() : this.b.contains(node);
    }

    private boolean a(Set<Node<T, R>> set) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("64b9555b", new Object[]{this, set})).booleanValue() : this.b.containsAll(set);
    }

    public void a(List<List<Node<T, R>>> list, i<T, R> iVar) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e2c090b", new Object[]{this, list, iVar});
            return;
        }
        for (List<Node<T, R>> list2 : list) {
            iVar.b(i);
            for (Node<T, R> node : list2) {
                iVar.a(node);
            }
            i++;
        }
    }
}
