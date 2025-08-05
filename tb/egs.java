package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.model.datamodel.node.ItemNode;
import com.taobao.android.detail.datasdk.model.datamodel.node.TradeNode;
import com.taobao.android.detail.datasdk.model.datamodel.node.VerticalNode;
import com.taobao.android.detail.datasdk.model.datamodel.node.b;
import com.taobao.android.detail.datasdk.model.datamodel.template.ComponentModel;
import com.taobao.android.ultron.common.model.IDMComponent;

/* loaded from: classes4.dex */
public class egs extends egv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final int f27298a;
    public int b;
    public long c;
    public long d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public boolean j;
    public boolean k;
    public String l;
    public String m;

    static {
        kge.a(2127085797);
    }

    @Override // tb.epi
    public int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue();
        }
        return 0;
    }

    @Override // tb.egv, tb.epi, com.taobao.android.detail.datasdk.model.viewmodel.main.b
    public String getFullClassName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7324d71b", new Object[]{this}) : "com.taobao.android.detail.core.model.viewmodel.bottombar.BottomBarPresaleViewModel";
    }

    public egs(ComponentModel componentModel, b bVar) {
        super(componentModel, bVar);
        this.f27298a = 10019;
        TradeNode e = eqb.e(bVar);
        VerticalNode g = eqb.g(bVar);
        ItemNode c = eqb.c(bVar);
        this.j = e.isBuyEnable;
        this.k = e.isCartEnable;
        this.l = TextUtils.isEmpty(e.buyText) ? "立即购买" : e.buyText;
        this.m = TextUtils.isEmpty(e.cartText) ? "加入购物车" : e.cartText;
        this.h = c.title;
        this.i = c.itemUrl;
        if (g == null || g.presaleNode == null) {
            this.b = 2;
            return;
        }
        this.b = g.presaleNode.status;
        if (this.b == 2 && !this.j) {
            this.b = 3;
        }
        this.c = g.presaleNode.startTime;
        this.d = g.presaleNode.endTime;
        this.e = g.presaleNode.prefixText;
        this.f = g.presaleNode.extraText;
        this.g = g.presaleNode.depositText;
    }

    @Override // tb.epi
    public double b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83d7", new Object[]{this})).doubleValue() : this.A;
    }

    public egs(IDMComponent iDMComponent, b bVar) {
        super(iDMComponent, bVar);
        this.f27298a = 10019;
        TradeNode e = eqb.e(bVar);
        VerticalNode g = eqb.g(bVar);
        ItemNode c = eqb.c(bVar);
        this.j = e.isBuyEnable;
        this.k = e.isCartEnable;
        this.l = TextUtils.isEmpty(e.buyText) ? "立即购买" : e.buyText;
        this.m = TextUtils.isEmpty(e.cartText) ? "加入购物车" : e.cartText;
        this.h = c.title;
        this.i = c.itemUrl;
        if (g == null || g.presaleNode == null) {
            this.b = 2;
            return;
        }
        this.b = g.presaleNode.status;
        if (this.b == 2 && !this.j) {
            this.b = 3;
        }
        this.c = g.presaleNode.startTime;
        this.d = g.presaleNode.endTime;
        this.e = g.presaleNode.prefixText;
        this.f = g.presaleNode.extraText;
        this.g = g.presaleNode.depositText;
    }
}
