package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.trade.event.Event;

/* loaded from: classes4.dex */
public class evd implements Event {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1625285);
        kge.a(-1834561497);
    }

    @Override // com.taobao.android.trade.event.Event
    public int getEventId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ce275619", new Object[]{this})).intValue();
        }
        return 20604;
    }

    @Override // com.taobao.android.trade.event.Event
    public Object getParam() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("a5850f14", new Object[]{this});
        }
        return null;
    }

    public evd() {
        tpc.a("com.taobao.android.detail.sdk.event.bottom.AddCartClickedEvent");
    }
}
