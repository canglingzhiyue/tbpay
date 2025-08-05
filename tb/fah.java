package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.request.market.MarketBagPrice;
import com.taobao.android.detail.core.request.market.MarketBagPriceRequestClient;
import com.taobao.android.detail.datasdk.model.datamodel.node.FeatureNode;
import com.taobao.android.detail.datasdk.model.datamodel.node.ShippingNode;
import com.taobao.android.detail.datasdk.model.datamodel.node.VerticalNode;
import com.taobao.android.detail.datasdk.model.datamodel.node.b;
import com.taobao.android.detail.datasdk.model.datamodel.template.ComponentModel;
import com.taobao.android.trade.boost.request.mtop.a;
import com.taobao.android.ultron.common.model.IDMComponent;

/* loaded from: classes5.dex */
public class fah extends egv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f27714a;
    public String b;
    public String c;

    static {
        kge.a(629124667);
    }

    @Override // tb.epi
    public int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue();
        }
        return 44;
    }

    public fah(ComponentModel componentModel, b bVar) {
        super(componentModel, bVar);
        VerticalNode g = eqb.g(bVar);
        ShippingNode h = eqb.h(bVar);
        FeatureNode f = eqb.f(bVar);
        if (g.superMarketNode != null) {
            this.b = g.superMarketNode.tpId;
            this.c = h.areaId;
            this.f27714a = f.hasAddTmallCartCoudan;
        }
        emu.a("com.taobao.android.detail.wrapper.ext.component.bottombar.viewmodel.BottomBarSMCartViewModel");
    }

    public void a(String str, a<MarketBagPrice> aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef67fceb", new Object[]{this, str, aVar});
        } else {
            new MarketBagPriceRequestClient().execute(new com.taobao.android.detail.core.request.market.a(this.c, eqb.d(this.mNodeBundle).userId), aVar, str);
        }
    }

    @Override // tb.epi
    public double b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83d7", new Object[]{this})).doubleValue() : this.A;
    }

    public fah(IDMComponent iDMComponent, b bVar) {
        super(iDMComponent, bVar);
        VerticalNode g = eqb.g(bVar);
        ShippingNode h = eqb.h(bVar);
        FeatureNode f = eqb.f(bVar);
        if (g.superMarketNode != null) {
            this.b = g.superMarketNode.tpId;
            this.c = h.areaId;
            this.f27714a = f.hasAddTmallCartCoudan;
        }
    }
}
