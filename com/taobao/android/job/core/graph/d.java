package com.taobao.android.job.core.graph;

import java.util.Collection;
import java.util.Set;

/* loaded from: classes.dex */
public interface d<T, R> extends c<T> {
    Collection<Node<T, R>> allNodes();

    Node<T, R> get(T t);

    Set<Node<T, R>> getInitialNodes();

    int size();
}
