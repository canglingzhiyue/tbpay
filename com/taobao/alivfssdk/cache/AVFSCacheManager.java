package com.taobao.alivfssdk.cache;

import android.app.Application;
import android.content.Context;
import android.support.v4.util.LruCache;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.dio;
import tb.dip;
import tb.kge;

/* loaded from: classes.dex */
public class AVFSCacheManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int AVFS_MAX_CACHE_NUMBER = 5;
    private static final String TAG = "AVFSCacheManager";
    private static volatile AVFSCacheManager sInstance;
    private final LruCache<String, b> mCaches;
    private final ConcurrentHashMap<String, c> mConfigs = new ConcurrentHashMap<>();
    private final Context mContext;

    static {
        kge.a(-1351046553);
    }

    public static AVFSCacheManager getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AVFSCacheManager) ipChange.ipc$dispatch("71298fbc", new Object[0]);
        }
        if (sInstance == null) {
            synchronized (AVFSCacheManager.class) {
                if (sInstance == null) {
                    sInstance = new AVFSCacheManager();
                }
            }
        }
        return sInstance;
    }

    public AVFSCacheManager() {
        Application e = com.taobao.alivfsadapter.b.a().e();
        Context applicationContext = e.getApplicationContext();
        if (applicationContext == null) {
            this.mContext = e;
        } else {
            this.mContext = applicationContext;
        }
        this.mCaches = new LruCache<String, b>(5) { // from class: com.taobao.alivfssdk.cache.AVFSCacheManager.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.support.v4.util.LruCache
            public /* bridge */ /* synthetic */ void entryRemoved(boolean z, String str, b bVar, b bVar2) {
            }
        };
    }

    public b defaultCache() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("59120455", new Object[]{this}) : cacheForModule("AVFSDefaultModule");
    }

    public b cacheForModule(String str) {
        File file;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("f0816a19", new Object[]{this, str});
        }
        if (str == null) {
            throw new IllegalArgumentException("moduleName cannot be null");
        }
        try {
            file = getRootDir();
        } catch (IOException e) {
            dio.a(TAG, e, new Object[0]);
            file = null;
        }
        return createCache(file, str);
    }

    public void removeCacheForModule(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c685e428", new Object[]{this, str});
        } else if (str == null) {
            throw new IllegalArgumentException("moduleName cannot be null");
        } else {
            synchronized (this.mCaches) {
                b remove = this.mCaches.remove(str);
                if (remove == null) {
                    return;
                }
                remove.f();
            }
        }
    }

    public long approximateRemovableSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bd4a2943", new Object[]{this})).longValue();
        }
        b defaultCache = defaultCache();
        if (defaultCache != null) {
            return defaultCache.f8482a.b + defaultCache.f8482a.f8483a.longValue() + defaultCache.f8482a.c;
        }
        return 0L;
    }

    public b cacheForModule(String str, boolean z) {
        File file;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("bca4d4d", new Object[]{this, str, new Boolean(z)});
        }
        if (str == null) {
            throw new IllegalArgumentException("moduleName cannot be null");
        }
        try {
            file = getRootDir();
        } catch (IOException e) {
            dio.a(TAG, e, new Object[0]);
            file = null;
        }
        return createCache(file, str);
    }

    private b createCache(File file, String str) {
        b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("475956ef", new Object[]{this, file, str});
        }
        synchronized (this.mCaches) {
            bVar = this.mCaches.get(str);
            if (bVar == null) {
                bVar = new b(str, file == null ? null : new File(file, str));
                c cVar = this.mConfigs.get(str);
                if (cVar != null) {
                    bVar.a(cVar);
                }
                this.mCaches.put(str, bVar);
            }
        }
        return bVar;
    }

    public LruCache<String, b> getCaches() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LruCache) ipChange.ipc$dispatch("3f9174c8", new Object[]{this}) : this.mCaches;
    }

    public void putConfigs(Map<? extends String, ? extends c> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a27ffd7c", new Object[]{this, map});
        } else {
            this.mConfigs.putAll(map);
        }
    }

    public File getRootDir() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("2d7a9c71", new Object[]{this});
        }
        File a2 = e.a(this.mContext);
        dip.a(a2);
        return a2;
    }

    public Context getContext() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this}) : this.mContext;
    }
}
