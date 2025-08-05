package com.taobao.themis.kernel.metaInfo.appinfo.cacheConfig;

import java.io.Serializable;
import tb.kge;

/* loaded from: classes9.dex */
public class AppInfoCacheConfig {

    /* loaded from: classes9.dex */
    public static class CacheTime implements Serializable {
        public long maxSyncTime = 86400;
        public long maxAsyncTime = a.DEF_MAX_ASYNC_SECONDS;

        static {
            kge.a(135724427);
            kge.a(1028243835);
        }
    }

    /* loaded from: classes9.dex */
    public static class ExpireConfig implements Serializable {
        public String appId;
        public boolean expired = true;
        public String strategy;
        public long timeStamp;

        static {
            kge.a(1616673701);
            kge.a(1028243835);
        }
    }

    static {
        kge.a(88631264);
    }
}
