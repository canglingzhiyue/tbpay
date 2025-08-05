package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.sdk.model.node.NodeBundle;
import com.taobao.android.detail.sdk.model.template.ComponentModel;
import com.taobao.android.detail.sdk.vmodel.main.MainViewModel;

/* loaded from: classes4.dex */
public class ewc implements evv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static String f27607a;
    public static String b;
    public static String c;
    public static String d;

    /* JADX WARN: Type inference failed for: r4v5, types: [tb.exb, com.taobao.android.detail.sdk.vmodel.main.MainViewModel] */
    @Override // tb.ewa
    public /* synthetic */ exb a(ComponentModel componentModel, NodeBundle nodeBundle) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MainViewModel) ipChange.ipc$dispatch("ac99d18", new Object[]{this, componentModel, nodeBundle}) : b(componentModel, nodeBundle);
    }

    static {
        kge.a(-1237480764);
        kge.a(-616273378);
        f27607a = ecd.V_EFFECT_ACTION_SECKILL;
        b = "hotSpot";
        c = "waitForStartSM";
        d = "waitForStart";
    }

    public ewc() {
        tpc.a("com.taobao.android.detail.sdk.factory.impl.BottomBarViewModelFactory");
    }

    public exb b(ComponentModel componentModel, NodeBundle nodeBundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (exb) ipChange.ipc$dispatch("c23cd4be", new Object[]{this, componentModel, nodeBundle});
        }
        if (nodeBundle != null && nodeBundle.featureNode != null && nodeBundle.featureNode.secKill) {
            componentModel.refreshRule(f27607a);
            return new exi(componentModel, nodeBundle);
        } else if (nodeBundle != null && nodeBundle.verticalNode != null && nodeBundle.verticalNode.hotNode != null) {
            componentModel.refreshRule(b);
            return new exi(componentModel, nodeBundle);
        } else if (nodeBundle != null && nodeBundle.tradeNode != null && nodeBundle.tradeNode.isWaitForStart && nodeBundle.verticalNode != null && nodeBundle.verticalNode.superMarketNode != null) {
            componentModel.refreshRule(c);
            return new exi(componentModel, nodeBundle);
        } else if (nodeBundle != null && nodeBundle.tradeNode != null && nodeBundle.tradeNode.isWaitForStart) {
            componentModel.refreshRule(d);
            return new exi(componentModel, nodeBundle);
        } else {
            return new exi(componentModel, nodeBundle);
        }
    }
}
