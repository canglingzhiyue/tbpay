package anetwork.channel.cache;

import anet.channel.util.ALog;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import tb.kge;

/* loaded from: classes.dex */
public class CacheManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static List<CacheItem> cacheList;
    private static final ReentrantReadWriteLock lock;
    private static final ReentrantReadWriteLock.ReadLock readLock;
    private static final ReentrantReadWriteLock.WriteLock writeLock;

    /* loaded from: classes.dex */
    public static class CacheItem implements Comparable<CacheItem> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final Cache cache;
        public final CachePrediction prediction;
        public final int priority;

        static {
            kge.a(-1811321097);
            kge.a(415966670);
        }

        public CacheItem(Cache cache, CachePrediction cachePrediction, int i) {
            this.cache = cache;
            this.prediction = cachePrediction;
            this.priority = i;
        }

        @Override // java.lang.Comparable
        public int compareTo(CacheItem cacheItem) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5e4fb7f6", new Object[]{this, cacheItem})).intValue() : this.priority - cacheItem.priority;
        }
    }

    static {
        kge.a(564906118);
        cacheList = new ArrayList();
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        lock = reentrantReadWriteLock;
        readLock = reentrantReadWriteLock.readLock();
        writeLock = lock.writeLock();
    }

    public static void addCache(Cache cache, CachePrediction cachePrediction, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1b0c1fa", new Object[]{cache, cachePrediction, new Integer(i)});
            return;
        }
        try {
            if (cache == null) {
                throw new IllegalArgumentException("cache is null");
            }
            if (cachePrediction == null) {
                throw new IllegalArgumentException("prediction is null");
            }
            writeLock.lock();
            cacheList.add(new CacheItem(cache, cachePrediction, i));
            Collections.sort(cacheList);
        } finally {
            writeLock.unlock();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002d, code lost:
        r0.remove();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void removeCache(anetwork.channel.cache.Cache r3) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = anetwork.channel.cache.CacheManager.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L12
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r3
            java.lang.String r3 = "8cef9e0d"
            r0.ipc$dispatch(r3, r1)
            return
        L12:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = anetwork.channel.cache.CacheManager.writeLock     // Catch: java.lang.Throwable -> L36
            r0.lock()     // Catch: java.lang.Throwable -> L36
            java.util.List<anetwork.channel.cache.CacheManager$CacheItem> r0 = anetwork.channel.cache.CacheManager.cacheList     // Catch: java.lang.Throwable -> L36
            java.util.ListIterator r0 = r0.listIterator()     // Catch: java.lang.Throwable -> L36
        L1d:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L36
            if (r1 == 0) goto L30
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L36
            anetwork.channel.cache.CacheManager$CacheItem r1 = (anetwork.channel.cache.CacheManager.CacheItem) r1     // Catch: java.lang.Throwable -> L36
            anetwork.channel.cache.Cache r1 = r1.cache     // Catch: java.lang.Throwable -> L36
            if (r1 != r3) goto L1d
            r0.remove()     // Catch: java.lang.Throwable -> L36
        L30:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r3 = anetwork.channel.cache.CacheManager.writeLock
            r3.unlock()
            return
        L36:
            r3 = move-exception
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = anetwork.channel.cache.CacheManager.writeLock
            r0.unlock()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: anetwork.channel.cache.CacheManager.removeCache(anetwork.channel.cache.Cache):void");
    }

    public static Cache getCache(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Cache) ipChange.ipc$dispatch("fec52236", new Object[]{str, map});
        }
        try {
            readLock.lock();
            for (CacheItem cacheItem : cacheList) {
                if (cacheItem.prediction.handleCache(str, map)) {
                    return cacheItem.cache;
                }
            }
            return null;
        } finally {
            readLock.unlock();
        }
    }

    public static void clearAllCache() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4208d55", new Object[0]);
            return;
        }
        ALog.w("anet.CacheManager", "clearAllCache", null, new Object[0]);
        for (CacheItem cacheItem : cacheList) {
            try {
                cacheItem.cache.clear();
            } catch (Exception unused) {
            }
        }
    }
}
