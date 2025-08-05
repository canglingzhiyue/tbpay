package com.alipay.android.msp.framework.cache;

/* loaded from: classes3.dex */
public interface ICache<K, V> {
    void clear();

    V get(String str);

    void put(K k, V v);

    V remove(K k);
}
