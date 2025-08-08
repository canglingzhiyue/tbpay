package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.sdk.model.node.NodeBundle;
import com.taobao.android.detail.sdk.model.template.ComponentModel;

/* loaded from: classes4.dex */
public class exe extends exk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f27622a;
    public long b;
    public long c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public boolean i;
    public boolean j;
    public String k;
    public String l;
    public final int m;

    static {
        kge.a(-1397865537);
    }

    @Override // com.taobao.android.detail.sdk.vmodel.widget.WidgetViewModel
    public int getMiniWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("13b808f3", new Object[]{this})).intValue();
        }
        return 0;
    }

    @Override // com.taobao.android.detail.sdk.vmodel.main.MainViewModel
    public int getViewModelType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7e14bda2", new Object[]{this})).intValue() : ewy.T_BOTTOM_BAR_PRE_SALE;
    }

    public exe(ComponentModel componentModel, NodeBundle nodeBundle) {
        super(componentModel, nodeBundle);
        this.m = 10019;
        tpc.a("com.taobao.android.detail.sdk.vmodel.bottombar.BottomBarPresaleViewModel");
        this.i = nodeBundle.tradeNode.isBuyEnable;
        this.j = nodeBundle.tradeNode.isCartEnable;
        this.k = StringUtils.isEmpty(nodeBundle.tradeNode.buyText) ? "立即购买" : nodeBundle.tradeNode.buyText;
        this.l = StringUtils.isEmpty(nodeBundle.tradeNode.cartText) ? "加入购物车" : nodeBundle.tradeNode.cartText;
        this.g = nodeBundle.itemNode.title;
        this.h = nodeBundle.itemNode.itemUrl;
        if (nodeBundle.verticalNode == null || nodeBundle.verticalNode.presaleNode == null) {
            this.f27622a = 2;
            return;
        }
        this.f27622a = nodeBundle.verticalNode.presaleNode.status;
        if (this.f27622a == 2 && !this.i) {
            this.f27622a = 3;
        }
        this.b = nodeBundle.verticalNode.presaleNode.startTime;
        this.c = nodeBundle.verticalNode.presaleNode.endTime;
        this.d = nodeBundle.verticalNode.presaleNode.prefixText;
        this.e = nodeBundle.verticalNode.presaleNode.extraText;
        this.f = nodeBundle.verticalNode.presaleNode.depositText;
    }

    @Override // com.taobao.android.detail.sdk.vmodel.widget.WidgetViewModel
    public double getWeight() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("975182e3", new Object[]{this})).doubleValue() : this.A;
    }
}
