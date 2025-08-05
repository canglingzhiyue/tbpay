package mtopsdk.mtop.domain;

import anetwork.network.cache.RpcCache;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import mtopsdk.common.util.StringUtils;
import mtopsdk.framework.domain.a;
import mtopsdk.mtop.cache.CacheManager;
import tb.kge;

/* loaded from: classes9.dex */
public class ResponseSource implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String cacheBlock;
    private String cacheKey;
    public CacheManager cacheManager;
    public MtopResponse cacheResponse;
    public a mtopContext;
    public String seqNo;
    public RpcCache rpcCache = null;
    public boolean requireConnection = true;

    static {
        kge.a(-1399629251);
        kge.a(1028243835);
    }

    public ResponseSource(a aVar, CacheManager cacheManager) {
        this.mtopContext = aVar;
        this.cacheManager = cacheManager;
        this.seqNo = aVar.h;
    }

    public String getCacheKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e0d367e6", new Object[]{this});
        }
        if (StringUtils.isNotBlank(this.cacheKey)) {
            return this.cacheKey;
        }
        this.cacheKey = this.cacheManager.getCacheKey(this.mtopContext);
        return this.cacheKey;
    }

    public String getCacheBlock() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3f5abf78", new Object[]{this});
        }
        if (StringUtils.isNotBlank(this.cacheBlock)) {
            return this.cacheBlock;
        }
        this.cacheBlock = this.cacheManager.getBlockName(this.mtopContext.b.getKey());
        return this.cacheBlock;
    }
}
