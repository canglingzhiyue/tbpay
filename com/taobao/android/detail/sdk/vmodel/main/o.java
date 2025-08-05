package com.taobao.android.detail.sdk.vmodel.main;

import android.util.Pair;
import anetwork.channel.Response;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.sdk.model.network.market.MarketFlashActivity;
import com.taobao.android.detail.sdk.model.node.NodeBundle;
import com.taobao.android.detail.sdk.model.template.ComponentModel;
import java.lang.ref.WeakReference;
import tb.ewy;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class o extends MainViewModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Pair<String, MarketFlashActivity> f10435a;
    public WeakReference<com.taobao.android.trade.boost.request.mtop.c<MarketFlashActivity, Response>> b;
    public com.taobao.android.trade.boost.request.mtop.c<MarketFlashActivity, Response> c;
    private String d;

    static {
        kge.a(780693019);
        kge.a(1837888225);
    }

    @Override // com.taobao.android.detail.sdk.vmodel.main.MainViewModel
    public int getViewModelType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7e14bda2", new Object[]{this})).intValue() : ewy.T_MARKET_TIME_LIMIT;
    }

    public static /* synthetic */ String a(o oVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1da1f9c", new Object[]{oVar}) : oVar.d;
    }

    public o(ComponentModel componentModel, NodeBundle nodeBundle) {
        super(componentModel, nodeBundle);
        tpc.a("com.taobao.android.detail.sdk.vmodel.main.MarketFlashActivityViewModel");
        this.d = nodeBundle.shippingNode.areaId == null ? "" : nodeBundle.shippingNode.areaId;
        this.c = new com.taobao.android.trade.boost.request.mtop.c<MarketFlashActivity, Response>() { // from class: com.taobao.android.detail.sdk.vmodel.main.o.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.trade.boost.request.mtop.c
            public /* synthetic */ void onFailure(Response response) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("a1cc110e", new Object[]{this, response});
                } else {
                    a(response);
                }
            }

            @Override // com.taobao.android.trade.boost.request.mtop.c
            public /* synthetic */ void onSuccess(MarketFlashActivity marketFlashActivity) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("ea580ec7", new Object[]{this, marketFlashActivity});
                } else {
                    a(marketFlashActivity);
                }
            }

            public void a(MarketFlashActivity marketFlashActivity) {
                com.taobao.android.trade.boost.request.mtop.c<MarketFlashActivity, Response> cVar;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("bb477c40", new Object[]{this, marketFlashActivity});
                } else if (o.this.f10435a != null) {
                } else {
                    o oVar = o.this;
                    oVar.f10435a = new Pair<>(o.a(oVar), marketFlashActivity);
                    if (o.this.b == null || (cVar = o.this.b.get()) == null) {
                        return;
                    }
                    cVar.onSuccess(marketFlashActivity);
                }
            }

            public void a(Response response) {
                com.taobao.android.trade.boost.request.mtop.c<MarketFlashActivity, Response> cVar;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("b24c63aa", new Object[]{this, response});
                } else if (o.this.b == null || o.this.b.get() == null || (cVar = o.this.b.get()) == null) {
                } else {
                    cVar.onFailure(response);
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
            com.taobao.android.detail.sdk.request.b.a().a("sm_best_selling", this.mNodeBundle, this.c);
        }
    }
}
