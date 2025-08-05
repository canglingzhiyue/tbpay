package com.taobao.android.job.core.graph;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class Node<T, R> implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int STATUS_FAIL = 0;
    public static final int STATUS_SKIP = 1;
    public static final int STATUS_SUCCESS = 2;
    public static final int STATUS_UNSET = -1;
    private Object data;
    private R result;
    private T value;
    private int status = -1;
    private Set<Node<T, R>> inComingEdges = new LinkedHashSet();
    private Set<Node<T, R>> outGoingEdges = new LinkedHashSet();

    public Node(T t) {
        this.value = t;
    }

    public void addInComingNode(Node<T, R> node) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c75e08f1", new Object[]{this, node});
        } else {
            this.inComingEdges.add(node);
        }
    }

    public void addOutGoingNode(Node<T, R> node) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39bb03f7", new Object[]{this, node});
        } else {
            this.outGoingEdges.add(node);
        }
    }

    public Set<Node<T, R>> getInComingNodes() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Set) ipChange.ipc$dispatch("1dad134b", new Object[]{this}) : this.inComingEdges;
    }

    public Set<Node<T, R>> getOutGoingNodes() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Set) ipChange.ipc$dispatch("5a1e2d85", new Object[]{this}) : this.outGoingEdges;
    }

    public T getValue() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("6045ccb0", new Object[]{this}) : this.value;
    }

    public R getResult() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (R) ipChange.ipc$dispatch("5be12058", new Object[]{this}) : this.result;
    }

    public void setResult(R r) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8046e82", new Object[]{this, r});
        } else {
            this.result = r;
        }
    }

    public boolean isNotProcessed() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("815a2a10", new Object[]{this})).booleanValue() : !isProcessed();
    }

    public boolean isProcessed() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("edc1cfcf", new Object[]{this})).booleanValue() : this.status != -1;
    }

    public boolean isSuccess() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6049a784", new Object[]{this})).booleanValue() : this.status == 2;
    }

    public boolean isFailed() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a308af12", new Object[]{this})).booleanValue() : this.status == 0;
    }

    public boolean isSkipped() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c2a27031", new Object[]{this})).booleanValue() : this.status == 1;
    }

    public void setSuccess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2490c548", new Object[]{this});
        } else {
            this.status = 2;
        }
    }

    public void setErrored() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48bd0fec", new Object[]{this});
        } else {
            this.status = 0;
        }
    }

    public void setSkipped() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86e98df5", new Object[]{this});
        } else {
            this.status = 1;
        }
    }

    public Object getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("4ca84d6b", new Object[]{this}) : this.data;
    }

    public void setData(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4f836cf", new Object[]{this, obj});
        } else {
            this.data = obj;
        }
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        T t = this.value;
        if (t != null) {
            i = t.hashCode();
        }
        return 31 + i;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == getClass()) {
            return this.value.equals(((Node) obj).value);
        }
        return false;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this}) : String.valueOf(this.value);
    }
}
