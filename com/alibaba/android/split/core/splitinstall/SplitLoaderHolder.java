package com.alibaba.android.split.core.splitinstall;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public enum SplitLoaderHolder implements q {
    INSTANCE;
    
    private static final AtomicReference atomicReference = new AtomicReference(null);

    public static void set(p pVar) {
        atomicReference.compareAndSet(null, pVar);
    }

    @Override // com.alibaba.android.split.core.splitinstall.q
    public final p get() {
        return (p) atomicReference.get();
    }
}
