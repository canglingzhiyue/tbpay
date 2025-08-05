package com.taobao.analysis.v3;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes4.dex */
public interface FalcoSpanStatus {
    public static final String CANCEL = "cancel";
    public static final String FAILED = "failed";
    public static final String SUCCEED = "succeed";
    public static final String UNFINISHED = "unfinished";

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes4.dex */
    public @interface Definition {
    }
}
