package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.model.datamodel.node.FeatureNode;
import com.taobao.android.detail.datasdk.model.datamodel.node.TradeNode;
import com.taobao.android.detail.datasdk.model.datamodel.node.VerticalNode;
import com.taobao.android.detail.datasdk.model.datamodel.template.ComponentModel;
import com.taobao.android.detail.datasdk.model.viewmodel.main.b;

/* loaded from: classes4.dex */
public class efy implements eok {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static String f27290a;
    public static String b;
    public static String c;

    @Override // tb.eop
    public /* synthetic */ b b(ComponentModel componentModel, com.taobao.android.detail.datasdk.model.datamodel.node.b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("a3661b0d", new Object[]{this, componentModel, bVar}) : a(componentModel, bVar);
    }

    static {
        kge.a(-714666743);
        kge.a(-1765383756);
        f27290a = ecd.V_EFFECT_ACTION_SECKILL;
        b = "waitForStartSM";
        c = "waitForStart";
    }

    public efy() {
        emu.a("com.taobao.android.detail.core.factory.impl.BottomBarViewModelFactory");
    }

    public egq a(ComponentModel componentModel, com.taobao.android.detail.datasdk.model.datamodel.node.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (egq) ipChange.ipc$dispatch("e466b8e5", new Object[]{this, componentModel, bVar});
        }
        if (bVar == null) {
            return null;
        }
        FeatureNode f = eqb.f(bVar);
        if (f != null && f.secKill) {
            componentModel.refreshRule(f27290a);
            return new egt(componentModel, bVar);
        }
        VerticalNode g = eqb.g(bVar);
        TradeNode e = eqb.e(bVar);
        if (e != null && e.isWaitForStart && g != null && g.superMarketNode != null) {
            componentModel.refreshRule(b);
            return new egt(componentModel, bVar);
        } else if (e != null && e.isWaitForStart) {
            componentModel.refreshRule(c);
            return new egt(componentModel, bVar);
        } else {
            return new egt(componentModel, bVar);
        }
    }
}
