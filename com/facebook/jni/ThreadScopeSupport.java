package com.facebook.jni;

import tb.kge;

/* loaded from: classes4.dex */
public class ThreadScopeSupport {
    static {
        kge.a(193172906);
    }

    private static void runStdFunction(long j) {
        runStdFunctionImpl(j);
    }

    private static native void runStdFunctionImpl(long j);
}
