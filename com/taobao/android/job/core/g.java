package com.taobao.android.job.core;

import com.taobao.android.job.core.graph.Node;
import java.util.Collection;
import java.util.Set;

/* loaded from: classes.dex */
public interface g<T, R> extends com.taobao.android.job.core.graph.c<T> {
    int a();

    Node<T, R> a(T t);

    void a(int i);

    void a(com.taobao.android.job.core.graph.i<T, R> iVar);

    void a(com.taobao.android.job.core.task.b<T, R> bVar);

    void a(Collection<Node<T, R>> collection);

    boolean a(Node<T, R> node);

    Set<Node<T, R>> b();

    void b(Node<T, R> node);

    void b(com.taobao.android.job.core.task.b<T, R> bVar);

    void c();

    int d();

    void e();

    void f();

    Collection<Node<T, R>> g();

    boolean h();

    Collection<Node<T, R>> i();

    void j();

    int k();

    void n();
}
