package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.sdk.model.node.NodeBundle;
import com.taobao.android.trade.event.Event;

/* loaded from: classes4.dex */
public class evi implements Event {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f27597a;

    static {
        kge.a(-889128594);
        kge.a(-1834561497);
    }

    @Override // com.taobao.android.trade.event.Event
    public int getEventId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ce275619", new Object[]{this})).intValue();
        }
        return 29914;
    }

    public evi(NodeBundle nodeBundle) {
        tpc.a("com.taobao.android.detail.sdk.event.jhs.JhsCouponEvent");
        if (nodeBundle == null || nodeBundle.itemNode == null) {
            return;
        }
        this.f27597a = nodeBundle.itemNode.itemId;
    }

    @Override // com.taobao.android.trade.event.Event
    public Object getParam() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("a5850f14", new Object[]{this}) : this.f27597a;
    }
}
