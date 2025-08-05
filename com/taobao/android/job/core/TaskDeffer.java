package com.taobao.android.job.core;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public interface TaskDeffer<T, R> {
    public static final int OPTION_DEFFER_NORMAL = 0;
    public static final int OPTION_DEFFER_REPLY_ON_TASK = 1;
    public static final int OPTION_DEFFER_WHEN_WAITING = 2;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes5.dex */
    public @interface Option {
    }

    boolean a(com.taobao.android.job.core.task.e<T, R> eVar, int i);
}
