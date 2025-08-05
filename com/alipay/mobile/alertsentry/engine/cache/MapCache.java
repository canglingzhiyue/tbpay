package com.alipay.mobile.alertsentry.engine.cache;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public class MapCache<K, V> implements MemoryCache<K, V> {

    /* renamed from: a  reason: collision with root package name */
    private final ConcurrentHashMap<K, V> f5334a = new ConcurrentHashMap<>(16);
}
