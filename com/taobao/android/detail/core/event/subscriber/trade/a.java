package com.taobao.android.detail.core.event.subscriber.trade;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.core.event.params.e;
import com.taobao.android.detail.core.event.params.h;
import com.taobao.android.detail.core.request.cart.RecommendBuyMoreRequestClient;
import com.taobao.android.detail.core.request.recommend.RecommendBuyMoreModel;
import com.taobao.android.detail.datasdk.model.datamodel.node.c;
import com.taobao.android.detail.datasdk.model.datamodel.sku.SkuPageModel;
import com.taobao.android.trade.event.ThreadMode;
import com.taobao.android.trade.event.f;
import com.taobao.android.trade.event.i;
import com.taobao.android.trade.event.j;
import mtopsdk.mtop.domain.MtopResponse;
import org.json.JSONException;
import org.json.JSONObject;
import tb.edy;
import tb.edz;
import tb.eft;
import tb.emu;
import tb.ens;
import tb.epo;
import tb.kge;
import tb.nom;

/* loaded from: classes4.dex */
public class a implements com.taobao.android.trade.boost.request.mtop.a<RecommendBuyMoreModel>, j<eft> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f9734a = "AddCartSuccessSubscriber";
    private DetailCoreActivity b;

    static {
        kge.a(-79740670);
        kge.a(-1453870097);
        kge.a(1595456606);
    }

    public static /* synthetic */ DetailCoreActivity a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DetailCoreActivity) ipChange.ipc$dispatch("1f227adb", new Object[]{aVar}) : aVar.b;
    }

    @Override // com.taobao.android.trade.event.j
    public /* synthetic */ i handleEvent(eft eftVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (i) ipChange.ipc$dispatch("caa7474e", new Object[]{this, eftVar}) : a(eftVar);
    }

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
            a((RecommendBuyMoreModel) obj);
        }
    }

    public a(DetailCoreActivity detailCoreActivity) {
        this.b = detailCoreActivity;
        emu.a("com.taobao.android.detail.core.event.subscriber.trade.AddCartSuccessSubscriber");
    }

    public void a(final RecommendBuyMoreModel recommendBuyMoreModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9406fee5", new Object[]{this, recommendBuyMoreModel});
        } else if (recommendBuyMoreModel == null || recommendBuyMoreModel.result == null || recommendBuyMoreModel.result.isEmpty() || !"1".equals(recommendBuyMoreModel.result.get(0)) || recommendBuyMoreModel.msg == null) {
        } else {
            f.a(this.b, new edz(new h.a().a(recommendBuyMoreModel.msg.msg).b(recommendBuyMoreModel.button_msg).c(recommendBuyMoreModel.URL).d(recommendBuyMoreModel.msg.logoURL).a(new View.OnClickListener() { // from class: com.taobao.android.detail.core.event.subscriber.trade.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    } else {
                        f.a(a.a(a.this), new edy(new e(recommendBuyMoreModel.URL, false)));
                    }
                }
            }).a()));
        }
    }

    public void a(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab3bce2d", new Object[]{this, mtopResponse});
            return;
        }
        String str = this.f9734a;
        com.taobao.android.detail.core.utils.i.d(str, "mtopResponse failure" + mtopResponse.toString());
        try {
            JSONObject dataJsonObject = mtopResponse.getDataJsonObject();
            if (!dataJsonObject.getBoolean(nom.KEY_IS_FULL)) {
                return;
            }
            f.a(this.b, new ens(dataJsonObject.getString("popLayerUrl")));
        } catch (JSONException unused) {
        }
    }

    @Override // com.taobao.android.trade.boost.request.mtop.a
    public void onSystemFailure(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8463ea48", new Object[]{this, mtopResponse});
            return;
        }
        String str = this.f9734a;
        com.taobao.android.detail.core.utils.i.d(str, "mtopResponse system failure" + mtopResponse.toString());
    }

    public i a(eft eftVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i) ipChange.ipc$dispatch("128dd3ca", new Object[]{this, eftVar});
        }
        DetailCoreActivity detailCoreActivity = this.b;
        if (detailCoreActivity == null || detailCoreActivity.y() == null) {
            return com.taobao.android.detail.core.event.a.FAILURE;
        }
        SkuPageModel h = this.b.y().h();
        c cVar = this.b.y().t;
        if (h.hasAddCartCoudan()) {
            new RecommendBuyMoreRequestClient().execute(new com.taobao.android.detail.core.request.cart.a(epo.g().e(), h.getSkuId() != null ? h.getSkuId() : "-1", cVar.i(), cVar.h()), this, epo.f());
        }
        return com.taobao.android.detail.core.event.a.SUCCESS;
    }

    @Override // com.taobao.android.trade.event.j
    public ThreadMode getThreadMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ThreadMode) ipChange.ipc$dispatch("6de50c9b", new Object[]{this}) : ThreadMode.MainThread;
    }
}
