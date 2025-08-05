package com.facebook.jni;

import tb.kge;

/* loaded from: classes4.dex */
public class HybridData {
    private long mNativePointer = 0;

    static {
        kge.a(1522793579);
    }

    protected void finalize() throws Throwable {
        resetNative();
        super.finalize();
    }

    public boolean isValid() {
        return this.mNativePointer != 0;
    }

    public native void resetNative();
}
