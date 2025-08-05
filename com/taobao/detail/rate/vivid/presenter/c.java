package com.taobao.detail.rate.vivid.presenter;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.layoutmanager.setup.WindvanePluginRegister;
import com.taobao.detail.rate.mtop.RateListDetailRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.xkk;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0004¨\u0006\f"}, d2 = {"Lcom/taobao/detail/rate/vivid/presenter/RateListCachePresenter;", "", "()V", WindvanePluginRegister.WVTNodeCachePlugin.ACTION_GET_CACHE, "Lcom/alibaba/fastjson/JSONObject;", "request", "Lcom/taobao/detail/rate/mtop/RateListDetailRequest;", "getCacheKey", "", "setCache", "", "data", "tb_rate_display_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes7.dex */
public final class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public final void a(RateListDetailRequest request, JSONObject data) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b6d9d14", new Object[]{this, request, data});
            return;
        }
        q.d(request, "request");
        q.d(data, "data");
        xkk.INSTANCE.a(b(request), data);
    }

    public final JSONObject a(RateListDetailRequest request) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("2ab8747c", new Object[]{this, request});
        }
        q.d(request, "request");
        return xkk.INSTANCE.a(b(request));
    }

    private final String b(RateListDetailRequest rateListDetailRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d6b605c5", new Object[]{this, rateListDetailRequest});
        }
        String str = "rateType=" + rateListDetailRequest.rateType + ", searchImpr=" + rateListDetailRequest.searchImpr + ", expression=" + rateListDetailRequest.expression + ", fromImpr=" + rateListDetailRequest.fromImpr + ", rateSrc=" + rateListDetailRequest.rateSrc + ", storeId=" + rateListDetailRequest.storeId + ", invokeSource=" + rateListDetailRequest.invokeSource + ", feedId=" + rateListDetailRequest.feedId + ", skuVids=" + rateListDetailRequest.skuVids + ", auctionNumId=" + rateListDetailRequest.auctionNumId + ", feature=" + rateListDetailRequest.feature + ", foldFlag=" + rateListDetailRequest.foldFlag;
        q.b(str, "result.toString()");
        return str;
    }
}
