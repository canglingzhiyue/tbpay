package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.model.viewmodel.main.c;
import com.taobao.android.detail.datasdk.model.datamodel.node.ItemNode;
import com.taobao.android.detail.datasdk.model.datamodel.node.SellerNode;
import com.taobao.android.detail.datasdk.model.datamodel.node.b;
import com.taobao.android.detail.datasdk.model.datamodel.template.ComponentModel;
import com.taobao.android.detail.datasdk.protocol.adapter.optional.c;
import com.taobao.android.detail.wrapper.ext.request.o2o.QueryO2OData;
import com.taobao.android.detail.wrapper.ext.request.o2o.QueryO2ORequestClient;
import com.taobao.android.trade.boost.request.mtop.a;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.lang.ref.WeakReference;
import mtopsdk.mtop.domain.MtopResponse;

/* loaded from: classes5.dex */
public class fcb extends c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public QueryO2OData f27779a;
    public a<QueryO2OData> b;
    public WeakReference<a<QueryO2OData>> m;

    static {
        kge.a(110359853);
    }

    public static /* synthetic */ Object ipc$super(fcb fcbVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public fcb(ComponentModel componentModel, b bVar) {
        super(componentModel, bVar);
        emu.a("com.taobao.android.detail.wrapper.ext.component.main.viewmodel.DinamicO2OViewModel");
        this.b = new a<QueryO2OData>() { // from class: tb.fcb.1
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
                    ipChange.ipc$dispatch("e373d251", new Object[]{this, queryO2OData});
                } else if (fcb.this.f27779a != null) {
                } else {
                    fcb fcbVar = fcb.this;
                    fcbVar.f27779a = queryO2OData;
                    if (fcbVar.m == null || (aVar = fcb.this.m.get()) == null) {
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
                } else if (fcb.this.m == null || (aVar = fcb.this.m.get()) == null) {
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

    public void a(Context context, a<QueryO2OData> aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5a6fafd", new Object[]{this, context, aVar});
            return;
        }
        this.m = new WeakReference<>(aVar);
        QueryO2OData queryO2OData = this.f27779a;
        if (queryO2OData == null) {
            a(this.mNodeBundle, this.b);
        } else if (aVar == null) {
        } else {
            aVar.onSuccess(queryO2OData);
        }
    }

    private void a(b bVar, com.taobao.android.trade.boost.request.mtop.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f7694d9", new Object[]{this, bVar, cVar});
        } else if (bVar == null) {
        } else {
            ItemNode c = eqb.c(bVar);
            SellerNode d = eqb.d(bVar);
            String str = c.itemId;
            String str2 = d.shopId;
            com.taobao.android.detail.datasdk.protocol.adapter.optional.c k = epj.k();
            c.a aVar = new c.a();
            if (k == null) {
                aVar.b = "0";
                aVar.f10067a = "0";
            } else {
                c.a a2 = k.a(epo.a());
                aVar.b = a2.b;
                aVar.f10067a = a2.f10067a;
            }
            new QueryO2ORequestClient().execute(new com.taobao.android.detail.wrapper.ext.request.o2o.a(str, aVar.f10067a, aVar.b, str2), (a) cVar, epj.a().getTTID());
        }
    }

    public fcb(IDMComponent iDMComponent, b bVar) {
        super(iDMComponent, bVar);
        emu.a("com.taobao.android.detail.wrapper.ext.component.main.viewmodel.DinamicO2OViewModel");
        this.b = new a<QueryO2OData>() { // from class: tb.fcb.2
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
                    ipChange.ipc$dispatch("e373d251", new Object[]{this, queryO2OData});
                } else if (fcb.this.f27779a != null) {
                } else {
                    fcb fcbVar = fcb.this;
                    fcbVar.f27779a = queryO2OData;
                    if (fcbVar.m == null || (aVar = fcb.this.m.get()) == null) {
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
                } else if (fcb.this.m == null || (aVar = fcb.this.m.get()) == null) {
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
