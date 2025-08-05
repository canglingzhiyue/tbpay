package com.taobao.android.detail.sdk.vmodel.main;

import android.util.Pair;
import anetwork.channel.Response;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.sdk.model.network.market.MarketHotActivity;
import com.taobao.android.detail.sdk.model.node.NodeBundle;
import com.taobao.android.detail.sdk.model.template.ComponentModel;
import tb.ewy;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class p extends MainViewModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Pair<String, MarketHotActivity> f10437a;
    public com.taobao.android.trade.boost.request.mtop.c<MarketHotActivity, Response> b;
    public com.taobao.android.trade.boost.request.mtop.c<MarketHotActivity, Response> c;
    private String d;

    static {
        kge.a(-31804194);
        kge.a(1837888225);
    }

    @Override // com.taobao.android.detail.sdk.vmodel.main.MainViewModel
    public int getViewModelType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7e14bda2", new Object[]{this})).intValue() : ewy.T_MARKET_HOT_ACTIVITY;
    }

    public static /* synthetic */ String a(p pVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e73151d", new Object[]{pVar}) : pVar.d;
    }

    public p(ComponentModel componentModel, NodeBundle nodeBundle) {
        super(componentModel, nodeBundle);
        tpc.a("com.taobao.android.detail.sdk.vmodel.main.MarketHotActivityViewModel");
        this.d = nodeBundle.shippingNode.areaId == null ? "" : nodeBundle.shippingNode.areaId;
        this.c = new com.taobao.android.trade.boost.request.mtop.c<MarketHotActivity, Response>() { // from class: com.taobao.android.detail.sdk.vmodel.main.p.1
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
            public /* synthetic */ void onSuccess(MarketHotActivity marketHotActivity) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("ea580ec7", new Object[]{this, marketHotActivity});
                } else {
                    a(marketHotActivity);
                }
            }

            public void a(MarketHotActivity marketHotActivity) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("4e883d83", new Object[]{this, marketHotActivity});
                } else if (p.this.f10437a != null) {
                } else {
                    p pVar = p.this;
                    pVar.f10437a = new Pair<>(p.a(pVar), marketHotActivity);
                    if (p.this.b == null) {
                        return;
                    }
                    p.this.b.onSuccess(marketHotActivity);
                }
            }

            public void a(Response response) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("b24c63aa", new Object[]{this, response});
                } else if (p.this.b == null) {
                } else {
                    p.this.b.onFailure(response);
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
            com.taobao.android.detail.sdk.request.b.a().a("sm_promotion", this.mNodeBundle, this.c);
        }
    }
}
