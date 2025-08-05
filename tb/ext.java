package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.sdk.model.node.NodeBundle;
import com.taobao.android.detail.sdk.model.template.ComponentModel;
import com.taobao.android.detail.sdk.request.o2o.QueryO2OData;
import com.taobao.android.trade.boost.request.mtop.a;
import java.lang.ref.WeakReference;
import mtopsdk.mtop.domain.MtopResponse;

/* loaded from: classes4.dex */
public class ext extends exu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public QueryO2OData f27634a;
    public a<QueryO2OData> b;
    public WeakReference<a<QueryO2OData>> c;

    static {
        kge.a(1427326923);
    }

    @Override // tb.exu, com.taobao.android.detail.sdk.vmodel.main.MainViewModel
    public int getViewModelType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7e14bda2", new Object[]{this})).intValue() : ewy.T_DINAMIC_O2O;
    }

    public ext(ComponentModel componentModel, NodeBundle nodeBundle) {
        super(componentModel, nodeBundle);
        tpc.a("com.taobao.android.detail.sdk.vmodel.dinamic.DinamicO2OViewModel");
        this.b = new a<QueryO2OData>() { // from class: tb.ext.1
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
                a<QueryO2OData> aVar;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("14328666", new Object[]{this, queryO2OData});
                } else if (ext.this.f27634a != null) {
                } else {
                    ext extVar = ext.this;
                    extVar.f27634a = queryO2OData;
                    if (extVar.c == null || (aVar = ext.this.c.get()) == null) {
                        return;
                    }
                    aVar.onSuccess(queryO2OData);
                }
            }

            public void a(MtopResponse mtopResponse) {
                a<QueryO2OData> aVar;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("ab3bce2d", new Object[]{this, mtopResponse});
                } else if (ext.this.c == null || (aVar = ext.this.c.get()) == null) {
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
}
