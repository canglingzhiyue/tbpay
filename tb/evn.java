package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.sdk.model.node.NodeBundle;

/* loaded from: classes4.dex */
public class evn extends evl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public NodeBundle f27601a;

    static {
        kge.a(-93096827);
    }

    @Override // com.taobao.android.trade.event.Event
    public int getEventId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ce275619", new Object[]{this})).intValue();
        }
        return 20801;
    }

    public evn() {
        tpc.a("com.taobao.android.detail.sdk.event.sku.OpenInterSizingChartEvent");
    }

    public evn(NodeBundle nodeBundle) {
        this.f27601a = nodeBundle;
        tpc.a("com.taobao.android.detail.sdk.event.sku.OpenInterSizingChartEvent");
    }
}
