package mtopsdk.mtop.cache;

import anetwork.network.cache.RpcCache;
import anetwork.network.cache.b;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;
import mtopsdk.common.util.HeaderHandlerUtil;
import mtopsdk.common.util.HttpHeaderConstant;
import mtopsdk.common.util.MtopUtils;
import mtopsdk.common.util.StringUtils;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.cache.domain.ApiCacheDo;
import mtopsdk.mtop.common.MtopListener;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.global.SDKUtils;
import mtopsdk.mtop.global.SwitchConfig;
import mtopsdk.network.domain.Request;
import mtopsdk.xstate.a;
import tb.kge;
import tb.rxf;

/* loaded from: classes.dex */
public class CacheManagerImpl implements CacheManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String METHOD_GET = "GET";
    private static final String QUERY_KEY_DATA = "data";
    private static final String QUERY_KEY_WUA = "wua";
    private static final String TAG = "mtopsdk.CacheManagerImpl";
    private b cache;

    static {
        kge.a(1060212386);
        kge.a(2104375650);
    }

    public CacheManagerImpl(b bVar) {
        this.cache = null;
        this.cache = bVar;
    }

    @Override // mtopsdk.mtop.cache.CacheManager
    public boolean isNeedReadCache(Request request, MtopListener mtopListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("60d5ebd", new Object[]{this, request, mtopListener})).booleanValue();
        }
        if (SwitchConfig.getInstance().isGlobalCacheSwitchOpen()) {
            return request != null && "GET".equalsIgnoreCase(request.b) && !HttpHeaderConstant.NO_CACHE.equalsIgnoreCase(request.a("cache-control"));
        }
        TBSdkLog.i(TAG, request.e, "[isNeedReadCache]GlobalCacheSwitch=false,Don't read local cache.");
        return false;
    }

    @Override // mtopsdk.mtop.cache.CacheManager
    public boolean isNeedWriteCache(Request request, Map<String, List<String>> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("652c67b2", new Object[]{this, request, map})).booleanValue();
        }
        if (!SwitchConfig.getInstance().isGlobalCacheSwitchOpen()) {
            TBSdkLog.i(TAG, request.e, "[isNeedWriteCache]GlobalCacheSwitch=false,Don't write local cache.");
            return false;
        } else if (!"GET".equalsIgnoreCase(request.b) || map == null) {
            return false;
        } else {
            String singleHeaderFieldByKey = HeaderHandlerUtil.getSingleHeaderFieldByKey(map, "cache-control");
            if (singleHeaderFieldByKey != null && singleHeaderFieldByKey.contains(HttpHeaderConstant.NO_CACHE)) {
                return false;
            }
            String singleHeaderFieldByKey2 = HeaderHandlerUtil.getSingleHeaderFieldByKey(map, "last-modified");
            String singleHeaderFieldByKey3 = HeaderHandlerUtil.getSingleHeaderFieldByKey(map, HttpHeaderConstant.MTOP_X_ETAG);
            if (singleHeaderFieldByKey3 == null) {
                singleHeaderFieldByKey3 = HeaderHandlerUtil.getSingleHeaderFieldByKey(map, "etag");
            }
            return (singleHeaderFieldByKey == null && singleHeaderFieldByKey2 == null && singleHeaderFieldByKey3 == null) ? false : true;
        }
    }

    @Override // mtopsdk.mtop.cache.CacheManager
    public RpcCache getCache(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RpcCache) ipChange.ipc$dispatch("87775", new Object[]{this, str, str2, str3});
        }
        b bVar = this.cache;
        if (bVar == null) {
            return null;
        }
        RpcCache a2 = bVar.a(str, str2);
        return a2 != null ? handleCacheValidation(str3, a2) : a2;
    }

    @Override // mtopsdk.mtop.cache.CacheManager
    public boolean putCache(String str, String str2, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ae7bb917", new Object[]{this, str, str2, mtopResponse})).booleanValue();
        }
        if (this.cache == null) {
            return false;
        }
        RpcCache rpcCache = new RpcCache();
        rpcCache.header = mtopResponse.getHeaderFields();
        rpcCache.body = mtopResponse.getBytedata();
        return this.cache.a(str, str2, handleResponseCacheFlag(mtopResponse.getMtopStat() != null ? mtopResponse.getMtopStat().seqNo : "", rpcCache));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0076, code lost:
        if (r12.equals("ALL") != false) goto L22;
     */
    @Override // mtopsdk.mtop.cache.CacheManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String getCacheKey(mtopsdk.framework.domain.a r17) {
        /*
            Method dump skipped, instructions count: 396
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: mtopsdk.mtop.cache.CacheManagerImpl.getCacheKey(mtopsdk.framework.domain.a):java.lang.String");
    }

    @Override // mtopsdk.mtop.cache.CacheManager
    public String getBlockName(String str) {
        ApiCacheDo a2;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("62bf19ed", new Object[]{this, str}) : (StringUtils.isBlank(str) || (a2 = rxf.a().a(str)) == null || a2.blockName == null) ? "" : a2.blockName;
    }

    @Override // mtopsdk.mtop.cache.CacheManager
    @Deprecated
    public String getBlockName(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a00da423", new Object[]{this, str, str2}) : getBlockName(StringUtils.concatStr2LowerCase(str, str2));
    }

    private RpcCache handleResponseCacheFlag(String str, RpcCache rpcCache) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RpcCache) ipChange.ipc$dispatch("5d58de42", new Object[]{this, str, rpcCache});
        }
        if (rpcCache != null && rpcCache.header != null) {
            Map<String, List<String>> map = rpcCache.header;
            String singleHeaderFieldByKey = HeaderHandlerUtil.getSingleHeaderFieldByKey(map, "last-modified");
            String singleHeaderFieldByKey2 = HeaderHandlerUtil.getSingleHeaderFieldByKey(map, "cache-control");
            String singleHeaderFieldByKey3 = HeaderHandlerUtil.getSingleHeaderFieldByKey(map, HttpHeaderConstant.MTOP_X_ETAG);
            if (singleHeaderFieldByKey3 == null) {
                singleHeaderFieldByKey3 = HeaderHandlerUtil.getSingleHeaderFieldByKey(map, "etag");
            }
            if (singleHeaderFieldByKey2 == null && singleHeaderFieldByKey == null && singleHeaderFieldByKey3 == null) {
                return rpcCache;
            }
            if (StringUtils.isNotBlank(singleHeaderFieldByKey2) && StringUtils.isNotBlank(singleHeaderFieldByKey)) {
                rpcCache.lastModified = singleHeaderFieldByKey;
                rpcCache.cacheCreateTime = MtopUtils.convertTimeFormatGMT2Long(singleHeaderFieldByKey);
                String[] split = singleHeaderFieldByKey2.split(",");
                if (split != null) {
                    for (String str2 : split) {
                        try {
                            if (str2.contains("max-age=")) {
                                rpcCache.maxAge = Long.parseLong(str2.substring(8));
                            } else if (HttpHeaderConstant.OFFLINE_FLAG_ON.equalsIgnoreCase(str2)) {
                                rpcCache.offline = true;
                            }
                        } catch (Exception unused) {
                            TBSdkLog.w(TAG, str, "[handleResponseCacheFlag] parse cacheControlStr error." + singleHeaderFieldByKey2);
                        }
                    }
                }
            }
            if (StringUtils.isNotBlank(singleHeaderFieldByKey3)) {
                rpcCache.etag = singleHeaderFieldByKey3;
            }
        }
        return rpcCache;
    }

    private RpcCache handleCacheValidation(String str, RpcCache rpcCache) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RpcCache) ipChange.ipc$dispatch("7174f5b4", new Object[]{this, str, rpcCache});
        }
        if (rpcCache == null) {
            return rpcCache;
        }
        if (rpcCache.body == null) {
            rpcCache.cacheStatus = RpcCache.CacheStatus.TIMEOUT;
            return rpcCache;
        } else if (rpcCache.lastModified == null && rpcCache.etag == null) {
            if (rpcCache.offline) {
                rpcCache.cacheStatus = RpcCache.CacheStatus.NEED_UPDATE;
            } else {
                rpcCache.cacheStatus = RpcCache.CacheStatus.TIMEOUT;
            }
            return rpcCache;
        } else {
            if (StringUtils.isNotBlank(rpcCache.lastModified)) {
                long j = rpcCache.cacheCreateTime;
                long j2 = rpcCache.maxAge;
                long correctionTime = SDKUtils.getCorrectionTime();
                if (correctionTime >= j && correctionTime <= j + j2) {
                    rpcCache.cacheStatus = RpcCache.CacheStatus.FRESH;
                } else if (rpcCache.offline) {
                    rpcCache.cacheStatus = RpcCache.CacheStatus.NEED_UPDATE;
                } else {
                    rpcCache.cacheStatus = RpcCache.CacheStatus.TIMEOUT;
                }
                if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                    StringBuilder sb = new StringBuilder(128);
                    sb.append("[handleCacheValidation]cacheStatus=");
                    sb.append(rpcCache.cacheStatus);
                    sb.append(";lastModifiedStr=");
                    sb.append(rpcCache.lastModified);
                    sb.append(";lastModified=");
                    sb.append(j);
                    sb.append(";maxAge=");
                    sb.append(j2);
                    sb.append(";currentTime=");
                    sb.append(correctionTime);
                    sb.append(";t_offset=");
                    sb.append(a.a());
                    TBSdkLog.i(TAG, str, sb.toString());
                }
            } else if (StringUtils.isNotBlank(rpcCache.etag)) {
                rpcCache.cacheStatus = RpcCache.CacheStatus.NEED_UPDATE;
            }
            return rpcCache;
        }
    }
}
