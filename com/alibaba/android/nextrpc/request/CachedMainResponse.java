package com.alibaba.android.nextrpc.request;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.common.MtopCacheEvent;
import mtopsdk.mtop.domain.BaseOutDo;

/* loaded from: classes2.dex */
public class CachedMainResponse extends AbsResponse {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final BaseOutDo mtopBaseOutDo;
    private final MtopCacheEvent mtopCacheEvent;
    private final Object mtopRequestContext;

    public CachedMainResponse(String str, String str2, Map<String, List<String>> map, MtopCacheEvent mtopCacheEvent, BaseOutDo baseOutDo, Object obj) {
        super(str, str2, map);
        this.mtopCacheEvent = mtopCacheEvent;
        this.mtopBaseOutDo = baseOutDo;
        this.mtopRequestContext = obj;
    }

    public MtopCacheEvent getMtopCacheEvent() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopCacheEvent) ipChange.ipc$dispatch("3a25556e", new Object[]{this}) : this.mtopCacheEvent;
    }

    public BaseOutDo getMtopBaseOutDo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BaseOutDo) ipChange.ipc$dispatch("36c3ccdb", new Object[]{this}) : this.mtopBaseOutDo;
    }

    public Object getMtopRequestContext() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("7c97b24d", new Object[]{this}) : this.mtopRequestContext;
    }
}
