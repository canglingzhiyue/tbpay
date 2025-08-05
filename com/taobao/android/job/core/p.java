package com.taobao.android.job.core;

import java.util.Collection;
import java.util.concurrent.ExecutorService;

/* loaded from: classes5.dex */
public interface p<T, R> {
    void a(long j);

    void a(String str);

    void a(ExecutorService executorService, Collection<T> collection);

    boolean a();

    boolean a(com.taobao.android.job.core.task.e<T, R> eVar);

    void b(com.taobao.android.job.core.task.e<T, R> eVar);

    void b(String str);

    boolean b();

    com.taobao.android.job.core.task.e<T, R> e();
}
