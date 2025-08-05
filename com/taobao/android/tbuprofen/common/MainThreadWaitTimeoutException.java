package com.taobao.android.tbuprofen.common;

import tb.kge;

/* loaded from: classes6.dex */
public class MainThreadWaitTimeoutException extends Throwable {
    static {
        kge.a(-2187887);
    }

    public MainThreadWaitTimeoutException(StackTraceElement[] stackTraceElementArr, String str, long j) {
        super(String.format("main thread wait on %s (%dms)", str, Long.valueOf(j)));
        setStackTrace(stackTraceElementArr);
    }
}
