package com.taobao.analysis.v3;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes4.dex */
public interface FalcoExceptionReporter {
    public static final int SIGNAL_UNIFIED_ERROR_PAGE = 1;
    public static final int SIGNAL_UNKNOWN = 0;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes4.dex */
    public @interface Definition {
    }

    FalcoExceptionReporter a(int i);

    FalcoExceptionReporter a(String str);

    void a();

    FalcoExceptionReporter b(String str);

    FalcoExceptionReporter c(String str);
}
