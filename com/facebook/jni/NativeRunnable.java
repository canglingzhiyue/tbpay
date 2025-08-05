package com.facebook.jni;

import tb.kge;

/* loaded from: classes4.dex */
public class NativeRunnable implements Runnable {
    private final HybridData mHybridData;

    static {
        kge.a(647707257);
        kge.a(-1390502639);
    }

    private NativeRunnable(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    @Override // java.lang.Runnable
    public native void run();
}
