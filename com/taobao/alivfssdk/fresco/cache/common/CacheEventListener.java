package com.taobao.alivfssdk.fresco.cache.common;

/* loaded from: classes.dex */
public interface CacheEventListener {

    /* loaded from: classes4.dex */
    public enum EvictionReason {
        CACHE_FULL,
        CONTENT_STALE,
        USER_FORCED,
        CACHE_MANAGER_TRIMMED
    }

    boolean a(a aVar);

    void b(a aVar);

    void c(a aVar);

    void d(a aVar);
}
