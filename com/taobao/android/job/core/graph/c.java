package com.taobao.android.job.core.graph;

/* loaded from: classes.dex */
public interface c<T> {
    void addAsDependencyToAllInitialNodes(T t);

    void addAsDependentOnAllLeafNodes(T t);

    void addDependency(T t, T t2);

    void addIndependent(T t);
}
