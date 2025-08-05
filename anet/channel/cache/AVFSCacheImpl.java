package anet.channel.cache;

import android.taobao.windvane.jsbridge.api.WVFile;
import android.text.TextUtils;
import anet.channel.util.ALog;
import anet.channel.util.StringUtils;
import anetwork.channel.cache.Cache;
import anetwork.channel.cache.CacheConfig;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alivfssdk.cache.AVFSCacheManager;
import com.taobao.alivfssdk.cache.b;
import com.taobao.alivfssdk.cache.c;
import com.taobao.alivfssdk.cache.h;
import tb.kge;

/* loaded from: classes.dex */
public class AVFSCacheImpl implements Cache {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "anet.AVFSCacheImpl";
    private static boolean isAvfsCacheExist;
    private static Object nullAllObjectRemoveCallback;
    private static Object nullObjectRemoveCallback;
    private static Object nullObjectSetCallback;
    private h avfsCacheOperator;
    private final CacheConfig cacheConfig;
    private final String moduleName;

    static {
        kge.a(135090772);
        kge.a(118625575);
        isAvfsCacheExist = true;
        nullObjectSetCallback = null;
        nullObjectRemoveCallback = null;
        nullAllObjectRemoveCallback = null;
        try {
            Class.forName("com.taobao.alivfssdk.cache.AVFSCacheManager");
            nullObjectSetCallback = new h.f() { // from class: anet.channel.cache.AVFSCacheImpl.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.alivfssdk.cache.h.f
                public void onObjectSetCallback(String str, boolean z) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("1c2b525a", new Object[]{this, str, new Boolean(z)});
                    } else {
                        ALog.i(AVFSCacheImpl.TAG, "[onObjectSetCallback]", null, "key", str, "result", Boolean.valueOf(z));
                    }
                }
            };
            nullObjectRemoveCallback = new h.d() { // from class: anet.channel.cache.AVFSCacheImpl.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.alivfssdk.cache.h.d
                public void onObjectRemoveCallback(String str, boolean z) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("dbe537fc", new Object[]{this, str, new Boolean(z)});
                    } else {
                        ALog.i(AVFSCacheImpl.TAG, "[onObjectRemoveCallback]", null, "key", str, "result", Boolean.valueOf(z));
                    }
                }
            };
            nullAllObjectRemoveCallback = new h.a() { // from class: anet.channel.cache.AVFSCacheImpl.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.alivfssdk.cache.h.a
                public void onAllObjectRemoveCallback(boolean z) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("a8993103", new Object[]{this, new Boolean(z)});
                    } else {
                        ALog.i(AVFSCacheImpl.TAG, "[onAllObjectRemoveCallback]", null, "result", Boolean.valueOf(z));
                    }
                }
            };
        } catch (ClassNotFoundException unused) {
            isAvfsCacheExist = false;
            ALog.w(TAG, "no alivfs sdk!", null, new Object[0]);
        }
    }

    public AVFSCacheImpl() {
        this(null);
    }

    public AVFSCacheImpl(CacheConfig cacheConfig) {
        this.cacheConfig = cacheConfig == null ? CacheConfig.create("", WVFile.FILE_MAX_SIZE) : cacheConfig;
        String str = "networksdk.httpcache";
        this.moduleName = !TextUtils.isEmpty(this.cacheConfig.getBizName()) ? StringUtils.concatString(str, ".", this.cacheConfig.getBizName()) : str;
    }

    public void initialize() {
        b cacheForModule;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b110817", new Object[]{this});
        } else if (!isAvfsCacheExist || (cacheForModule = AVFSCacheManager.getInstance().cacheForModule(this.moduleName)) == null) {
        } else {
            long j = WVFile.FILE_MAX_SIZE;
            if (this.cacheConfig.getCacheSize() > 0 && this.cacheConfig.getCacheSize() < 104857600) {
                j = this.cacheConfig.getCacheSize();
            }
            c cVar = new c();
            cVar.f8483a = Long.valueOf(j);
            cVar.b = 1048576L;
            cacheForModule.a(cVar);
            this.avfsCacheOperator = cacheForModule.a();
        }
    }

    @Override // anetwork.channel.cache.Cache
    public Cache.Entry get(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Cache.Entry) ipChange.ipc$dispatch("9b1dbdc9", new Object[]{this, str});
        }
        if (!isAvfsCacheExist) {
            return null;
        }
        try {
            h fileCache = getFileCache();
            if (fileCache != null) {
                return (Cache.Entry) fileCache.b(StringUtils.md5ToHex(str));
            }
        } catch (Exception e) {
            ALog.e(TAG, "get cache failed", null, e, new Object[0]);
        }
        return null;
    }

    @Override // anetwork.channel.cache.Cache
    public void put(String str, Cache.Entry entry) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f226c8da", new Object[]{this, str, entry});
        } else if (!isAvfsCacheExist) {
        } else {
            try {
                h fileCache = getFileCache();
                if (fileCache == null) {
                    return;
                }
                fileCache.a(StringUtils.md5ToHex(str), entry, (h.f) nullObjectSetCallback);
            } catch (Exception e) {
                ALog.e(TAG, "put cache failed", null, e, new Object[0]);
            }
        }
    }

    @Override // anetwork.channel.cache.Cache
    public void remove(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39af3815", new Object[]{this, str});
        } else if (!isAvfsCacheExist) {
        } else {
            try {
                h fileCache = getFileCache();
                if (fileCache == null) {
                    return;
                }
                fileCache.a(StringUtils.md5ToHex(str), (h.d) nullObjectRemoveCallback);
            } catch (Exception e) {
                ALog.e(TAG, "remove cache failed", null, e, new Object[0]);
            }
        }
    }

    @Override // anetwork.channel.cache.Cache
    public void clear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
        } else if (!isAvfsCacheExist) {
        } else {
            try {
                h fileCache = getFileCache();
                if (fileCache == null) {
                    return;
                }
                fileCache.a((h.a) nullAllObjectRemoveCallback);
            } catch (Exception e) {
                ALog.e(TAG, "clear cache failed", null, e, new Object[0]);
            }
        }
    }

    private h getFileCache() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (h) ipChange.ipc$dispatch("8c4b4000", new Object[]{this}) : this.avfsCacheOperator;
    }
}
