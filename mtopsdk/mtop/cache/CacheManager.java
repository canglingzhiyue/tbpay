package mtopsdk.mtop.cache;

import anetwork.network.cache.RpcCache;
import java.util.List;
import java.util.Map;
import mtopsdk.framework.domain.a;
import mtopsdk.mtop.common.MtopListener;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.network.domain.Request;

/* loaded from: classes.dex */
public interface CacheManager {
    String getBlockName(String str);

    @Deprecated
    String getBlockName(String str, String str2);

    RpcCache getCache(String str, String str2, String str3);

    String getCacheKey(a aVar);

    boolean isNeedReadCache(Request request, MtopListener mtopListener);

    boolean isNeedWriteCache(Request request, Map<String, List<String>> map);

    boolean putCache(String str, String str2, MtopResponse mtopResponse);
}
