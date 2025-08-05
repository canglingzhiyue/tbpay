package com.taobao.android.detail.sdk.vmodel.main;

import android.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.sdk.model.node.GlobalNode;
import com.taobao.android.detail.sdk.model.node.NodeBundle;
import com.taobao.android.detail.sdk.model.template.ComponentModel;
import com.taobao.android.detail.sdk.request.market.MarketRecommendData;
import mtopsdk.mtop.domain.MtopResponse;
import tb.ewy;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class q extends MainViewModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f10439a;
    public String b;
    public String c;
    public String d;
    public Pair<String, MarketRecommendData> e;
    public com.taobao.android.trade.boost.request.mtop.c<MarketRecommendData, MtopResponse> f;
    public com.taobao.android.trade.boost.request.mtop.a<MarketRecommendData> g;
    private final String h;
    private String i;

    static {
        kge.a(1069555742);
        kge.a(1837888225);
    }

    @Override // com.taobao.android.detail.sdk.vmodel.main.MainViewModel
    public int getViewModelType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7e14bda2", new Object[]{this})).intValue() : ewy.T_MARKET_RECOMMEND;
    }

    public static /* synthetic */ String a(q qVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1b0c0a9e", new Object[]{qVar}) : qVar.i;
    }

    public q(ComponentModel componentModel, NodeBundle nodeBundle) {
        super(componentModel, nodeBundle);
        tpc.a("com.taobao.android.detail.sdk.vmodel.main.MarketRecommendViewModel");
        String str = "";
        this.b = nodeBundle.itemNode != null ? nodeBundle.itemNode.itemId : str;
        this.d = nodeBundle.sellerNode != null ? nodeBundle.sellerNode.userId : str;
        this.h = GlobalNode.ttid;
        this.i = nodeBundle.shippingNode.areaId != null ? nodeBundle.shippingNode.areaId : str;
        if (nodeBundle.verticalNode.superMarketNode != null) {
            this.f10439a = nodeBundle.verticalNode.superMarketNode.tpId;
            this.c = nodeBundle.verticalNode.superMarketNode.logicArea;
        }
        this.g = new com.taobao.android.trade.boost.request.mtop.a<MarketRecommendData>() { // from class: com.taobao.android.detail.sdk.vmodel.main.q.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.trade.boost.request.mtop.c
            public /* synthetic */ void onFailure(MtopResponse mtopResponse) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("a1cc110e", new Object[]{this, mtopResponse});
                } else {
                    a(mtopResponse);
                }
            }

            @Override // com.taobao.android.trade.boost.request.mtop.c
            public /* synthetic */ void onSuccess(Object obj) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("ea580ec7", new Object[]{this, obj});
                } else {
                    a((MarketRecommendData) obj);
                }
            }

            public void a(MarketRecommendData marketRecommendData) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("1b5db9c0", new Object[]{this, marketRecommendData});
                } else if (q.this.e != null) {
                } else {
                    q qVar = q.this;
                    qVar.e = new Pair<>(q.a(qVar), marketRecommendData);
                    if (q.this.f == null) {
                        return;
                    }
                    q.this.f.onSuccess(marketRecommendData);
                }
            }

            public void a(MtopResponse mtopResponse) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("ab3bce2d", new Object[]{this, mtopResponse});
                } else if (q.this.f == null) {
                } else {
                    q.this.f.onFailure(mtopResponse);
                }
            }

            @Override // com.taobao.android.trade.boost.request.mtop.a
            public void onSystemFailure(MtopResponse mtopResponse) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8463ea48", new Object[]{this, mtopResponse});
                } else if (q.this.f == null) {
                } else {
                    q.this.f.onFailure(mtopResponse);
                }
            }
        };
        a();
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            com.taobao.android.detail.sdk.request.b.a().a("sm_recommend", this.mNodeBundle, this.g);
        }
    }
}
