package com.taobao.android.live.plugin.proxy.recommendpop;

import android.content.Context;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.live.plugin.proxy.e;
import com.taobao.android.live.plugin.proxy.g;
import com.taobao.android.live.plugin.proxy.recommendpop.IRecommendPopProxy;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import tb.kge;

/* loaded from: classes6.dex */
public class RecommendPopProxy extends g<IRecommendPopProxy> implements IRecommendPopProxy {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "RecommendPopProxy";

    /* loaded from: classes6.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final RecommendPopProxy f14125a;

        static {
            kge.a(-240293820);
            f14125a = new RecommendPopProxy();
        }

        public static /* synthetic */ RecommendPopProxy a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (RecommendPopProxy) ipChange.ipc$dispatch("b90d05ed", new Object[0]) : f14125a;
        }
    }

    static {
        kge.a(89373996);
        kge.a(-1656074563);
    }

    @Override // com.taobao.android.live.plugin.proxy.g
    public String getIProxyKey() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c6fa8b95", new Object[]{this}) : IRecommendPopProxy.KEY;
    }

    @Override // com.taobao.android.live.plugin.proxy.g
    public String getLocalClassName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("48c0fdcb", new Object[]{this}) : "com.taobao.android.live.plugin.atype.flexalocal.proxy.RecommendPopProxyX";
    }

    @Override // com.taobao.android.live.plugin.proxy.g
    public String getOrangeKey() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9d3bd33e", new Object[]{this}) : "installLiveRecommendPopPlugin";
    }

    @Override // com.taobao.android.live.plugin.proxy.g
    public String getTrackName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c86a5339", new Object[]{this}) : "外投承接面板";
    }

    public static RecommendPopProxy getInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RecommendPopProxy) ipChange.ipc$dispatch("cb7c3d97", new Object[0]) : a.a();
    }

    private RecommendPopProxy() {
        try {
            initAType();
        } catch (Throwable th) {
            e.c("[RecommendPopProxy<init>] error: " + th.getMessage());
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.recommendpop.IRecommendPopProxy
    public IRecommendPopProxy.a createRecommendPop(Context context, ViewGroup viewGroup, com.taobao.alilive.aliliveframework.frame.a aVar, TBLiveDataModel tBLiveDataModel, BaseFrame baseFrame, IRecommendPopProxy.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IRecommendPopProxy.a) ipChange.ipc$dispatch("57b16a9c", new Object[]{this, context, viewGroup, aVar, tBLiveDataModel, baseFrame, bVar});
        }
        IRecommendPopProxy real = getReal();
        IRecommendPopProxy.a createRecommendPop = real != null ? real.createRecommendPop(context, viewGroup, aVar, tBLiveDataModel, baseFrame, bVar) : null;
        e.c("[RecommendPopProxy#createRecommendPop]  value: " + createRecommendPop);
        return createRecommendPop;
    }

    @Override // com.taobao.android.live.plugin.proxy.recommendpop.IRecommendPopProxy
    public String getDXBizType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6db0c1b6", new Object[]{this});
        }
        IRecommendPopProxy real = getReal();
        String dXBizType = real != null ? real.getDXBizType() : null;
        e.c("[RecommendPopProxy#getDXBizType]  value: " + dXBizType);
        return dXBizType;
    }
}
