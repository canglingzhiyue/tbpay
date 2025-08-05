package com.alibaba.android.split.core.internal;

import tb.kge;

/* loaded from: classes2.dex */
public class SplitLoadException extends RuntimeException {
    static {
        kge.a(1905708711);
    }

    public SplitLoadException() {
        super("Failed to bind to the service.");
    }

    public SplitLoadException(String str) {
        super(str);
    }

    public SplitLoadException(String str, Throwable th) {
        super(str, th);
    }
}
