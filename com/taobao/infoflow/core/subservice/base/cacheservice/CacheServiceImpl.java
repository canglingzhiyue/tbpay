package com.taobao.infoflow.core.subservice.base.cacheservice;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.base.ICacheService;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.kge;
import tb.ljs;

/* loaded from: classes.dex */
public class CacheServiceImpl implements ICacheService {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final Map<String, Object> mCache = new ConcurrentHashMap();
    private ICacheService.a mClickCache;

    static {
        kge.a(751639035);
        kge.a(2118346657);
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onCreateService(ljs ljsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ceabc49c", new Object[]{this, ljsVar});
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.base.ICacheService
    public void putCacheObject(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("104b28ff", new Object[]{this, str, obj});
        } else {
            this.mCache.put(str, obj);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.base.ICacheService
    public <T> T getCacheObject(String str, Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("da27b711", new Object[]{this, str, cls});
        }
        T t = (T) this.mCache.get(str);
        if (t == null || !cls.isInstance(t)) {
            return null;
        }
        return t;
    }

    @Override // com.taobao.infoflow.protocol.subservice.base.ICacheService
    public ICacheService.a getClickCache() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ICacheService.a) ipChange.ipc$dispatch("1a5aebb0", new Object[]{this});
        }
        if (this.mClickCache == null) {
            this.mClickCache = new a();
        }
        return this.mClickCache;
    }
}
