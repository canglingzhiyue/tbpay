package com.taobao.phenix.cache.memory;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayDeque;
import java.util.concurrent.ConcurrentHashMap;
import tb.kge;

/* loaded from: classes7.dex */
public class LimitedConcurrentHashMap<K, V> extends ConcurrentHashMap<K, V> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final long serialVersionUID = 1;
    private final int maxSize;
    private final ArrayDeque<K> orderQueue;

    static {
        kge.a(2081868946);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object ipc$super(LimitedConcurrentHashMap limitedConcurrentHashMap, String str, Object... objArr) {
        if (str.hashCode() == 38061070) {
            return super.putIfAbsent(objArr[0], objArr[1]);
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public LimitedConcurrentHashMap(int i) {
        super(i);
        this.orderQueue = new ArrayDeque<>();
        this.maxSize = i;
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    public V put(K k, V v) {
        V v2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (V) ipChange.ipc$dispatch("dbe24724", new Object[]{this, k, v});
        }
        synchronized (this) {
            v2 = (V) super.putIfAbsent(k, v);
            if (v2 == null) {
                this.orderQueue.offer(k);
                while (this.orderQueue.size() > this.maxSize) {
                    K poll = this.orderQueue.poll();
                    if (poll != null) {
                        remove(poll);
                    }
                }
            }
        }
        return v2;
    }
}
