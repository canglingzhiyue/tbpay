package mtopsdk.mtop.cache.handler;

import anetwork.network.cache.RpcCache;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes9.dex */
public class CacheParserFactory {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: mtopsdk.mtop.cache.handler.CacheParserFactory$1  reason: invalid class name */
    /* loaded from: classes9.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$anetwork$network$cache$RpcCache$CacheStatus = new int[RpcCache.CacheStatus.values().length];

        static {
            try {
                $SwitchMap$anetwork$network$cache$RpcCache$CacheStatus[RpcCache.CacheStatus.FRESH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$anetwork$network$cache$RpcCache$CacheStatus[RpcCache.CacheStatus.NEED_UPDATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    static {
        kge.a(-2125408827);
    }

    public static ICacheParser createCacheParser(RpcCache.CacheStatus cacheStatus) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ICacheParser) ipChange.ipc$dispatch("3a4dae35", new Object[]{cacheStatus});
        }
        if (cacheStatus == null) {
            return new EmptyCacheParser();
        }
        int i = AnonymousClass1.$SwitchMap$anetwork$network$cache$RpcCache$CacheStatus[cacheStatus.ordinal()];
        if (i == 1) {
            return new FreshCacheParser();
        }
        if (i == 2) {
            return new ExpiredCacheParser();
        }
        return new EmptyCacheParser();
    }
}
