package tb;

import android.text.TextUtils;
import com.taobao.android.detail.sdk.model.node.NodeBundle;
import com.taobao.android.detail.sdk.model.node.TradeNode;
import com.taobao.android.detail.sdk.model.template.ComponentModel;
import com.taobao.android.detail.sdk.vmodel.widget.WidgetViewModel;

/* loaded from: classes4.dex */
public abstract class exk extends WidgetViewModel {
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
        kge.a(2088750405);
    }

    public exk(ComponentModel componentModel, NodeBundle nodeBundle) {
        super(componentModel, nodeBundle);
        tpc.a("com.taobao.android.detail.sdk.vmodel.bottombar.BottomBarWgtViewModel");
        this.n = nodeBundle.itemNode.itemId;
        this.o = nodeBundle.sellerNode.shopId;
        this.p = nodeBundle.sellerNode.userId;
        this.q = nodeBundle.sellerNode.sellerNick;
        this.r = nodeBundle.featureNode.hideWangwang;
        this.s = nodeBundle.tradeNode.isBuyEnable;
        this.t = nodeBundle.tradeNode.isCartEnable;
        this.w = nodeBundle.tradeNode.hintBanner;
        this.u = TextUtils.isEmpty(nodeBundle.tradeNode.buyText) ? "立即购买" : nodeBundle.tradeNode.buyText;
        this.v = TextUtils.isEmpty(nodeBundle.tradeNode.cartText) ? "加入购物车" : nodeBundle.tradeNode.cartText;
        if (nodeBundle.verticalNode != null && nodeBundle.verticalNode.jhsNode != null) {
            this.x = Long.valueOf(nodeBundle.verticalNode.jhsNode.verticalBiz);
        }
        if (!TextUtils.isEmpty(nodeBundle.itemNode.sellCount)) {
            try {
                this.y = Integer.parseInt(nodeBundle.itemNode.sellCount);
            } catch (Exception unused) {
                this.y = -1;
            }
        }
        if (componentModel == null || componentModel.mapping == null) {
            return;
        }
        this.z = Boolean.parseBoolean(componentModel.mapping.getString("drawLine"));
        String string = componentModel.mapping.getString("widthRatio");
        if (TextUtils.isEmpty(string)) {
            return;
        }
        this.A = Double.parseDouble(string);
    }
}
