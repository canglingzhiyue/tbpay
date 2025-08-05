package com.taobao.android.live.plugin.atype.flexalocal.proxy;

import android.content.Context;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.alilive.aliliveframework.frame.a;
import com.taobao.android.live.plugin.proxy.recommendpop.IRecommendPopProxy;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import tb.hka;
import tb.kge;

/* loaded from: classes6.dex */
public class RecommendPopProxyX implements IRecommendPopProxy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1823324684);
        kge.a(-1656074563);
    }

    @Override // com.taobao.android.live.plugin.proxy.recommendpop.IRecommendPopProxy
    public String getDXBizType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6db0c1b6", new Object[]{this}) : "live_flexalocal";
    }

    @Override // com.taobao.android.live.plugin.proxy.recommendpop.IRecommendPopProxy
    public IRecommendPopProxy.a createRecommendPop(Context context, ViewGroup viewGroup, a aVar, TBLiveDataModel tBLiveDataModel, BaseFrame baseFrame, IRecommendPopProxy.b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IRecommendPopProxy.a) ipChange.ipc$dispatch("57b16a9c", new Object[]{this, context, viewGroup, aVar, tBLiveDataModel, baseFrame, bVar}) : new hka(context, viewGroup, aVar, tBLiveDataModel, baseFrame, bVar);
    }
}
