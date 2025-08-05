package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.model.datamodel.node.FeatureNode;
import com.taobao.android.detail.datasdk.model.datamodel.node.TradeNode;
import com.taobao.android.detail.datasdk.model.datamodel.node.VerticalNode;
import com.taobao.android.detail.datasdk.model.viewmodel.main.b;
import com.taobao.android.ultron.common.model.IDMComponent;

/* loaded from: classes4.dex */
public class egg implements eor {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static String f27291a;
    public static String b;
    public static String c;

    @Override // tb.eov
    public /* synthetic */ b b(IDMComponent iDMComponent, com.taobao.android.detail.datasdk.model.datamodel.node.b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("be501f9", new Object[]{this, iDMComponent, bVar}) : a(iDMComponent, bVar);
    }

    static {
        kge.a(-575143676);
        kge.a(1187135403);
        f27291a = ecd.V_EFFECT_ACTION_SECKILL;
        b = "waitForStartSM";
        c = "waitForStart";
    }

    public egg() {
        emu.a("com.taobao.android.detail.core.factory.ultron.impl.BottomBarUltronViewModelFactory");
    }

    public egq a(IDMComponent iDMComponent, com.taobao.android.detail.datasdk.model.datamodel.node.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (egq) ipChange.ipc$dispatch("1cbffc11", new Object[]{this, iDMComponent, bVar});
        }
        if (bVar == null) {
            return null;
        }
        FeatureNode f = eqb.f(bVar);
        if (f != null && f.secKill) {
            return new egt(iDMComponent, bVar);
        }
        VerticalNode g = eqb.g(bVar);
        TradeNode e = eqb.e(bVar);
        if (e != null && e.isWaitForStart && g != null && g.superMarketNode != null) {
            return new egt(iDMComponent, bVar);
        }
        if (e != null && e.isWaitForStart) {
            return new egt(iDMComponent, bVar);
        }
        return new egt(iDMComponent, bVar);
    }
}
