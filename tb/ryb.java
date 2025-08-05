package tb;

import android.content.Context;
import anetwork.network.cache.b;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import mtopsdk.common.util.HeaderHandlerUtil;
import mtopsdk.common.util.StringUtils;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.framework.domain.FilterResult;
import mtopsdk.framework.domain.a;
import mtopsdk.mtop.cache.CacheManager;
import mtopsdk.mtop.cache.CacheManagerImpl;
import mtopsdk.mtop.cache.domain.ApiCacheDo;
import mtopsdk.mtop.cache.handler.CacheStatusHandler;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.domain.ResponseSource;
import mtopsdk.mtop.global.SwitchConfig;

/* loaded from: classes.dex */
public class ryb implements rxm, rxn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final Map<b, CacheManager> f33415a;

    @Override // tb.rxo
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "mtopsdk.CacheDuplexFilter";
    }

    static {
        kge.a(-1202599532);
        kge.a(178679831);
        kge.a(-2079716300);
        f33415a = new ConcurrentHashMap(2);
    }

    @Override // tb.rxn
    public String b(a aVar) {
        ResponseSource responseSource;
        Exception e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1d3d918c", new Object[]{this, aVar});
        }
        if (SwitchConfig.getInstance().degradeApiCacheSet != null) {
            String key = aVar.b.getKey();
            if (SwitchConfig.getInstance().degradeApiCacheSet.contains(key)) {
                if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                    TBSdkLog.i("mtopsdk.CacheDuplexFilter", aVar.h, "apiKey in degradeApiCacheList,apiKey=" + key);
                }
                return FilterResult.CONTINUE;
            }
        }
        if (aVar.d.streamMode) {
            return FilterResult.CONTINUE;
        }
        aVar.g.cacheSwitch = 1;
        b bVar = aVar.f25000a.getMtopConfig().cacheImpl;
        if (bVar == null) {
            if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.DebugEnable)) {
                TBSdkLog.d("mtopsdk.CacheDuplexFilter", aVar.h, " CacheImpl is null. instanceId=" + aVar.f25000a.getInstanceId());
            }
            return FilterResult.CONTINUE;
        }
        CacheManager cacheManager = f33415a.get(bVar);
        if (cacheManager == null) {
            synchronized (f33415a) {
                cacheManager = f33415a.get(bVar);
                if (cacheManager == null) {
                    cacheManager = new CacheManagerImpl(bVar);
                    f33415a.put(bVar, cacheManager);
                }
            }
        }
        ResponseSource responseSource2 = null;
        try {
        } catch (Exception e2) {
            responseSource = null;
            e = e2;
        }
        if (cacheManager.isNeedReadCache(aVar.k, aVar.e)) {
            responseSource = new ResponseSource(aVar, cacheManager);
            try {
                aVar.j = responseSource;
                responseSource.rpcCache = cacheManager.getCache(responseSource.getCacheKey(), responseSource.getCacheBlock(), aVar.h);
                CacheStatusHandler.handleCacheStatus(responseSource, aVar.d.handler);
            } catch (Exception e3) {
                e = e3;
                TBSdkLog.e("mtopsdk.CacheDuplexFilter", aVar.h, "[initResponseSource] initResponseSource error,apiKey=" + aVar.b.getKey(), e);
                responseSource2 = responseSource;
                if (responseSource2 != null) {
                }
                return FilterResult.CONTINUE;
            }
            responseSource2 = responseSource;
        }
        if (responseSource2 != null || responseSource2.requireConnection) {
            return FilterResult.CONTINUE;
        }
        aVar.c = responseSource2.cacheResponse;
        ryl.a(aVar);
        return "STOP";
    }

    @Override // tb.rxm
    public String a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2b93eb6d", new Object[]{this, aVar});
        }
        if (SwitchConfig.getInstance().degradeApiCacheSet != null) {
            String key = aVar.b.getKey();
            if (SwitchConfig.getInstance().degradeApiCacheSet.contains(key)) {
                if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                    String str = aVar.h;
                    TBSdkLog.i("mtopsdk.CacheDuplexFilter", str, "apiKey in degradeApiCacheList,apiKey=" + key);
                }
                return FilterResult.CONTINUE;
            }
        }
        if (aVar.d.streamMode) {
            return FilterResult.CONTINUE;
        }
        MtopResponse mtopResponse = aVar.c;
        ResponseSource responseSource = aVar.j;
        if (mtopResponse.isApiSuccess() && responseSource != null) {
            Map<String, List<String>> headerFields = mtopResponse.getHeaderFields();
            CacheManager cacheManager = responseSource.cacheManager;
            if (cacheManager.isNeedWriteCache(aVar.k, headerFields)) {
                cacheManager.putCache(responseSource.getCacheKey(), responseSource.getCacheBlock(), mtopResponse);
                a(aVar, mtopResponse, responseSource.getCacheBlock(), headerFields);
            }
        }
        return FilterResult.CONTINUE;
    }

    private void a(a aVar, MtopResponse mtopResponse, String str, Map<String, List<String>> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbf6bee3", new Object[]{this, aVar, mtopResponse, str, map});
            return;
        }
        String singleHeaderFieldByKey = HeaderHandlerUtil.getSingleHeaderFieldByKey(map, "cache-control");
        if (StringUtils.isBlank(singleHeaderFieldByKey)) {
            return;
        }
        rxf a2 = rxf.a();
        String api = mtopResponse.getApi();
        String v = mtopResponse.getV();
        String concatStr2LowerCase = StringUtils.concatStr2LowerCase(api, v);
        ApiCacheDo a3 = a2.a(concatStr2LowerCase);
        Context context = aVar.f25000a.getMtopConfig().context;
        if (a3 != null) {
            if (singleHeaderFieldByKey.equals(a3.cacheControlHeader)) {
                return;
            }
            a2.b(singleHeaderFieldByKey, a3);
            a2.a(context, aVar.h);
            return;
        }
        ApiCacheDo apiCacheDo = new ApiCacheDo(api, v, str);
        a2.b(singleHeaderFieldByKey, apiCacheDo);
        a2.a(concatStr2LowerCase, apiCacheDo);
        a2.a(context, aVar.h);
    }
}
