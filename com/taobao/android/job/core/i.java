package com.taobao.android.job.core;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.job.core.graph.Node;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class i<T, R> implements com.taobao.android.job.core.graph.i<T, R> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final StringBuilder f12992a;
    private final Map<T, com.taobao.android.job.core.task.d> b;

    public i(StringBuilder sb, Map<T, com.taobao.android.job.core.task.d> map) {
        this.f12992a = sb;
        this.b = map;
    }

    @Override // com.taobao.android.job.core.graph.i
    public void a(Node<T, R> node) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4235fea9", new Object[]{this, node});
        } else if (node.isSkipped()) {
        } else {
            Set a2 = a(node.getInComingNodes());
            StringBuilder sb = this.f12992a;
            sb.append(node);
            sb.append("#");
            sb.append(this.b.get(node.getValue()));
            sb.append(a2);
            sb.append("|");
        }
    }

    private static <T, R> Set<Node<T, R>> a(Set<Node<T, R>> set) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("6868d06", new Object[]{set});
        }
        HashSet hashSet = new HashSet(set.size());
        for (Node<T, R> node : set) {
            if (!node.isSkipped()) {
                hashSet.add(node);
            }
        }
        return hashSet;
    }

    @Override // com.taobao.android.job.core.graph.i
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        StringBuilder sb = this.f12992a;
        sb.append("\n");
        sb.append("Path #");
        sb.append(i);
    }

    @Override // com.taobao.android.job.core.graph.i
    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
        } else {
            this.f12992a.append("\n");
        }
    }
}
