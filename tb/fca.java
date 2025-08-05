package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.model.datamodel.node.PriceNode;
import com.taobao.android.detail.datasdk.model.datamodel.node.VerticalNode;
import com.taobao.android.detail.datasdk.model.datamodel.template.ComponentModel;
import com.taobao.android.detail.datasdk.model.viewmodel.main.b;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.ArrayList;

/* loaded from: classes5.dex */
public class fca extends b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public long f27778a;
    public long b;
    public int c;
    public int d;
    public String e;
    public PriceNode.PriceData f;
    public ArrayList<PriceNode.PriceData> g;

    static {
        kge.a(305210532);
    }

    @Override // com.taobao.android.detail.datasdk.model.viewmodel.main.b
    public String getFullClassName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7324d71b", new Object[]{this}) : "com.taobao.android.detail.wrapper.ext.component.main.viewmodel.CtPackTradeViewModel";
    }

    public fca(ComponentModel componentModel, com.taobao.android.detail.datasdk.model.datamodel.node.b bVar) {
        super(componentModel, bVar);
        emu.a("com.taobao.android.detail.wrapper.ext.component.main.viewmodel.CtPackTradeViewModel");
        PriceNode m = eqb.m(bVar);
        VerticalNode g = eqb.g(bVar);
        this.f = m.price;
        this.g = m.extraPrices;
        this.f27778a = g.packTradeNode.endTime;
        this.b = g.packTradeNode.startTime;
        this.c = g.packTradeNode.currentAmount;
        this.d = g.packTradeNode.targetAmount;
        this.e = g.packTradeNode.amountText;
    }

    public fca(IDMComponent iDMComponent, com.taobao.android.detail.datasdk.model.datamodel.node.b bVar) {
        super(iDMComponent, bVar);
        emu.a("com.taobao.android.detail.wrapper.ext.component.main.viewmodel.CtPackTradeViewModel");
        PriceNode m = eqb.m(bVar);
        VerticalNode g = eqb.g(bVar);
        this.f = m.price;
        this.g = m.extraPrices;
        this.f27778a = g.packTradeNode.endTime;
        this.b = g.packTradeNode.startTime;
        this.c = g.packTradeNode.currentAmount;
        this.d = g.packTradeNode.targetAmount;
        this.e = g.packTradeNode.amountText;
    }
}
