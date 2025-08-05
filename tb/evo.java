package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.sdk.model.node.NodeBundle;

/* loaded from: classes4.dex */
public class evo extends evl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public NodeBundle f27602a;

    static {
        kge.a(149424139);
    }

    @Override // com.taobao.android.trade.event.Event
    public int getEventId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ce275619", new Object[]{this})).intValue();
        }
        return 29903;
    }

    public evo() {
        tpc.a("com.taobao.android.detail.sdk.event.sku.OpenSizingChartEvent");
    }

    public evo(NodeBundle nodeBundle) {
        this.f27602a = nodeBundle;
        tpc.a("com.taobao.android.detail.sdk.event.sku.OpenSizingChartEvent");
    }
}
