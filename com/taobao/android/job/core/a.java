package com.taobao.android.job.core;

/* loaded from: classes.dex */
public interface a<T, R> {
    e<T, R> a(String str, com.taobao.android.job.core.task.g<T, R> gVar, com.taobao.android.job.core.task.f<T, R> fVar);

    e<T, R> a(String str, com.taobao.android.job.core.task.g<T, R> gVar, com.taobao.android.job.core.task.f<T, R> fVar, TaskDeffer<T, R> taskDeffer);

    com.taobao.android.job.core.task.d a(l lVar, e<T, R> eVar);
}
