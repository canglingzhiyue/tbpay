package com.taobao.infoflow.protocol.subservice.base;

import com.taobao.infoflow.protocol.subservice.ISubService;
import java.util.List;

/* loaded from: classes.dex */
public interface ICacheService extends ISubService {
    public static final String SERVICE_NAME = "CacheService";

    /* loaded from: classes7.dex */
    public interface a {
        List<String> a(int i);

        void a(String str);
    }

    <T> T getCacheObject(String str, Class<T> cls);

    a getClickCache();

    void putCacheObject(String str, Object obj);
}
