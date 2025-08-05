package com.taobao.android.job.core;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
/* loaded from: classes5.dex */
public @interface DefferReason {
    public static final String TIMEOUT_POLLING_INITIAL = "pollingInitial";
    public static final String TIMEOUT_POLLING_PERIOD = "periodPollingTimeout";
    public static final String TIMEOUT_POLLING_SINGLE_TASK = "singlePollingTimeout";
}
