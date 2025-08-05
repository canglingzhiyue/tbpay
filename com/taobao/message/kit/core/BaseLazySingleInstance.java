package com.taobao.message.kit.core;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.atomic.AtomicReference;
import tb.kge;

/* loaded from: classes7.dex */
public abstract class BaseLazySingleInstance<V> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public AtomicReference<V> fCachedValue = new AtomicReference<>();

    static {
        kge.a(-1337865346);
    }

    /* renamed from: costlyIdempotentOperation */
    public abstract V mo1136costlyIdempotentOperation();

    public V getLazy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (V) ipChange.ipc$dispatch("c7ddcbe1", new Object[]{this});
        }
        V v = this.fCachedValue.get();
        if (v == null) {
            synchronized (BaseLazySingleInstance.class) {
                v = this.fCachedValue.get();
                if (v == null) {
                    v = mo1136costlyIdempotentOperation();
                    if (!this.fCachedValue.compareAndSet(null, v)) {
                        return this.fCachedValue.get();
                    }
                }
            }
        }
        return v;
    }
}
