package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.sdk.model.node.NodeBundle;
import com.taobao.android.detail.sdk.model.node.TradeNode;
import com.taobao.android.detail.sdk.model.template.ComponentModel;

/* loaded from: classes4.dex */
public class exh extends exk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public TradeNode.HintBanner f27625a;
    public long b;
    public long c;

    static {
        kge.a(1962603418);
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
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7e14bda2", new Object[]{this})).intValue();
        }
        return 20003;
    }

    @Override // com.taobao.android.detail.sdk.vmodel.widget.WidgetViewModel
    public double getWeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("975182e3", new Object[]{this})).doubleValue();
        }
        return 1.0d;
    }

    public exh(ComponentModel componentModel, NodeBundle nodeBundle) {
        super(componentModel, nodeBundle);
        tpc.a("com.taobao.android.detail.sdk.vmodel.bottombar.BottomBarSeckillViewModel");
        if (nodeBundle.tradeNode != null) {
            this.f27625a = nodeBundle.tradeNode.hintBanner;
            this.b = nodeBundle.tradeNode.startTime == null ? 0L : nodeBundle.tradeNode.startTime.longValue();
        }
        if (nodeBundle.skuCoreNode == null || nodeBundle.skuCoreNode.sku2info == null || nodeBundle.skuCoreNode.sku2info.get("0") == null) {
            return;
        }
        this.c = nodeBundle.skuCoreNode.sku2info.get("0").quantity;
    }
}
