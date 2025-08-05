package com.taobao.android.tbuprofen.common;

import tb.kge;

/* loaded from: classes6.dex */
public class BigMemoryAllocException extends Throwable {
    static {
        kge.a(1971982128);
    }

    public BigMemoryAllocException(StackTraceElement[] stackTraceElementArr, String str, long j) {
        super(String.format("allocated %s (%d byte)", str, Long.valueOf(j)));
        setStackTrace(stackTraceElementArr);
    }
}
