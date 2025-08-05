package com.taobao.alivfssdk.cache;

/* loaded from: classes.dex */
public interface j<K, V> {
    public static final int HIGH_PRIORITY = 34;
    public static final int MEDIUM_PRIORITY = 17;

    void a();

    boolean a(K k, V v);

    V b(K k);

    V c(K k);
}
