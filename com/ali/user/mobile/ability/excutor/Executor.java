package com.ali.user.mobile.ability.excutor;

import com.ali.user.mobile.callback.DataCallback;

/* loaded from: classes2.dex */
public interface Executor {
    ExecutorResult execute(ExecutorContext executorContext, DataCallback<ExecutorResult> dataCallback);

    String executorName();

    Class paramClass();

    boolean supportSync();
}
