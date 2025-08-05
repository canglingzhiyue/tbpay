package com.facebook.jni;

import tb.kge;

/* loaded from: classes4.dex */
public class Countable {
    private long mInstance = 0;

    static {
        kge.a(-589133404);
    }

    public native void dispose();

    protected void finalize() throws Throwable {
        dispose();
        super.finalize();
    }
}
