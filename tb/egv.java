package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.model.datamodel.node.FeatureNode;
import com.taobao.android.detail.datasdk.model.datamodel.node.ItemNode;
import com.taobao.android.detail.datasdk.model.datamodel.node.SellerNode;
import com.taobao.android.detail.datasdk.model.datamodel.node.TradeNode;
import com.taobao.android.detail.datasdk.model.datamodel.node.VerticalNode;
import com.taobao.android.detail.datasdk.model.datamodel.node.b;
import com.taobao.android.detail.datasdk.model.datamodel.template.ComponentModel;
import com.taobao.android.ultron.common.model.IDMComponent;

/* loaded from: classes4.dex */
public abstract class egv extends epi {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public double A;
    public String n;
    public String o;
    public String p;
    public String q;
    public boolean r;
    public boolean s;
    public boolean t;
    public String u;
    public String v;
    public TradeNode.HintBanner w;
    public Long x;
    public int y;
    public boolean z;

    static {
        kge.a(-972894869);
    }

    @Override // tb.epi, com.taobao.android.detail.datasdk.model.viewmodel.main.b
    public String getFullClassName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7324d71b", new Object[]{this}) : "com.taobao.android.detail.core.model.viewmodel.bottombar.BottomBarWgtViewModel";
    }

    public egv() {
        super((ComponentModel) null, (b) null);
    }

    public egv(ComponentModel componentModel, b bVar) {
        super(componentModel, bVar);
        ItemNode c = eqb.c(bVar);
        SellerNode d = eqb.d(bVar);
        TradeNode e = eqb.e(bVar);
        FeatureNode f = eqb.f(bVar);
        VerticalNode g = eqb.g(bVar);
        this.n = c.itemId;
        this.o = d.shopId;
        this.p = d.userId;
        this.q = d.sellerNick;
        this.r = f.hideWangwang;
        this.s = e.isBuyEnable;
        this.t = e.isCartEnable;
        this.w = e.hintBanner;
        this.u = StringUtils.isEmpty(e.buyText) ? "立即购买" : e.buyText;
        this.v = StringUtils.isEmpty(e.cartText) ? "加入购物车" : e.cartText;
        if (g != null && g.jhsNode != null) {
            this.x = Long.valueOf(g.jhsNode.verticalBiz);
        }
        if (!StringUtils.isEmpty(c.sellCount)) {
            try {
                this.y = Integer.parseInt(c.sellCount);
            } catch (Exception unused) {
                this.y = -1;
            }
        }
        if (componentModel == null || componentModel.mapping == null) {
            return;
        }
        this.z = Boolean.parseBoolean(componentModel.mapping.getString("drawLine"));
        String string = componentModel.mapping.getString("widthRatio");
        if (StringUtils.isEmpty(string)) {
            return;
        }
        this.A = Double.parseDouble(string);
    }

    public egv(IDMComponent iDMComponent, b bVar) {
        super(iDMComponent, bVar);
        ItemNode c = eqb.c(bVar);
        SellerNode d = eqb.d(bVar);
        TradeNode e = eqb.e(bVar);
        FeatureNode f = eqb.f(bVar);
        VerticalNode g = eqb.g(bVar);
        this.n = c.itemId;
        this.o = d.shopId;
        this.p = d.userId;
        this.q = d.sellerNick;
        this.r = f.hideWangwang;
        this.s = e.isBuyEnable;
        this.t = e.isCartEnable;
        this.w = e.hintBanner;
        this.u = StringUtils.isEmpty(e.buyText) ? "立即购买" : e.buyText;
        this.v = StringUtils.isEmpty(e.cartText) ? "加入购物车" : e.cartText;
        if (g != null && g.jhsNode != null) {
            this.x = Long.valueOf(g.jhsNode.verticalBiz);
        }
        if (!StringUtils.isEmpty(c.sellCount)) {
            try {
                this.y = Integer.parseInt(c.sellCount);
            } catch (Exception unused) {
                this.y = -1;
            }
        }
        if (iDMComponent == null || iDMComponent.getFields() == null) {
            return;
        }
        this.z = Boolean.parseBoolean(iDMComponent.getFields().getString("drawLine"));
        String string = iDMComponent.getFields().getString("widthRatio");
        if (StringUtils.isEmpty(string)) {
            return;
        }
        this.A = Double.parseDouble(string);
    }
}
