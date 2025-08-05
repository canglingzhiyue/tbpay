package com.taobao.android.job.core;

import com.taobao.android.job.core.task.TaskExecutionException;

/* loaded from: classes.dex */
public interface m<T, R> {
    com.taobao.android.job.core.task.b<T, R> a() throws TaskExecutionException;

    com.taobao.android.job.core.task.b<T, R> a(com.taobao.android.job.core.task.e<T, R> eVar);

    void a(e<T, R> eVar);

    boolean a(k<T, R> kVar);

    void b(e<T, R> eVar);

    boolean b(k<T, R> kVar);
}
