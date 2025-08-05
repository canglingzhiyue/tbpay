package com.ut.share.business.utils;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.kge;

/* loaded from: classes9.dex */
public class ShareMemoryCache {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final Map<String, CacheData> cache;

    static {
        kge.a(-547884611);
        cache = new ConcurrentHashMap();
    }

    public static void put(String str, Object obj, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85ed3e08", new Object[]{str, obj, new Long(j)});
        } else {
            cache.put(str, new CacheData(obj, System.currentTimeMillis(), j));
        }
    }

    public static <T> T getValidData(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("8dd357b1", new Object[]{str});
        }
        CacheData cacheData = cache.get(str);
        if (cacheData != null && !cacheData.isExpired()) {
            return cacheData.value;
        }
        return null;
    }

    public static <T> T remove(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("da166bbd", new Object[]{str}) : (T) cache.remove(str);
    }

    /* loaded from: classes9.dex */
    public static class CacheData<T> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private long cacheTimeMillis;
        private long expiredTimeMillis;
        public T value;

        static {
            kge.a(-931777531);
        }

        public CacheData(T t, long j, long j2) {
            this.value = t;
            this.cacheTimeMillis = j;
            this.expiredTimeMillis = j2;
        }

        public boolean isExpired() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a65eada6", new Object[]{this})).booleanValue() : System.currentTimeMillis() > this.cacheTimeMillis + this.expiredTimeMillis;
        }
    }
}
