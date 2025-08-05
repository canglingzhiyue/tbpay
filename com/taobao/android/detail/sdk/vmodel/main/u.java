package com.taobao.android.detail.sdk.vmodel.main;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.sdk.model.node.NodeBundle;
import com.taobao.android.detail.sdk.model.template.ComponentModel;
import com.taobao.android.detail.sdk.request.o2o.QueryO2OData;
import java.lang.ref.WeakReference;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.global.SDKConfig;
import tb.ewy;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class u extends MainViewModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f10445a;
    public String b;
    public QueryO2OData c;
    public com.taobao.android.trade.boost.request.mtop.a<QueryO2OData> d;
    public WeakReference<com.taobao.android.trade.boost.request.mtop.a<QueryO2OData>> e;
    private final String f;

    static {
        kge.a(1021641074);
    }

    @Override // com.taobao.android.detail.sdk.vmodel.main.MainViewModel
    public int getViewModelType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7e14bda2", new Object[]{this})).intValue() : ewy.T_O2O;
    }

    public u(ComponentModel componentModel, NodeBundle nodeBundle) {
        super(componentModel, nodeBundle);
        tpc.a("com.taobao.android.detail.sdk.vmodel.main.O2OViewModel");
        this.f = SDKConfig.getInstance().getGlobalTtid();
        this.f10445a = nodeBundle.itemNode.itemId;
        this.b = nodeBundle.sellerNode.shopId;
        this.d = new com.taobao.android.trade.boost.request.mtop.a<QueryO2OData>() { // from class: com.taobao.android.detail.sdk.vmodel.main.u.1
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
                    a((QueryO2OData) obj);
                }
            }

            public void a(QueryO2OData queryO2OData) {
                com.taobao.android.trade.boost.request.mtop.a<QueryO2OData> aVar;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("14328666", new Object[]{this, queryO2OData});
                } else if (u.this.c != null) {
                } else {
                    u uVar = u.this;
                    uVar.c = queryO2OData;
                    if (uVar.e == null || (aVar = u.this.e.get()) == null) {
                        return;
                    }
                    aVar.onSuccess(queryO2OData);
                }
            }

            public void a(MtopResponse mtopResponse) {
                com.taobao.android.trade.boost.request.mtop.a<QueryO2OData> aVar;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("ab3bce2d", new Object[]{this, mtopResponse});
                } else if (u.this.e == null || (aVar = u.this.e.get()) == null) {
                } else {
                    aVar.onFailure(mtopResponse);
                }
            }

            @Override // com.taobao.android.trade.boost.request.mtop.a
            public void onSystemFailure(MtopResponse mtopResponse) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8463ea48", new Object[]{this, mtopResponse});
                } else {
                    a(mtopResponse);
                }
            }
        };
    }

    @Override // com.taobao.android.detail.sdk.vmodel.main.MainViewModel
    public boolean isValid() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3fef87d", new Object[]{this})).booleanValue() : (this.mNodeBundle == null || this.mNodeBundle.weappNode == null || this.mNodeBundle.weappNode.weappList == null || this.mNodeBundle.weappNode.weappList.get("wapO2O01") == null) ? false : true;
    }
}
