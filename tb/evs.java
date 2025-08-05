package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.sdk.request.cart.AddBagRequestParams;
import com.taobao.android.trade.event.Event;

/* loaded from: classes4.dex */
public class evs implements Event {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public AddBagRequestParams f27605a;

    static {
        kge.a(-2063809448);
        kge.a(-1834561497);
    }

    @Override // com.taobao.android.trade.event.Event
    public int getEventId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ce275619", new Object[]{this})).intValue();
        }
        return 20011;
    }

    @Override // com.taobao.android.trade.event.Event
    public Object getParam() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("a5850f14", new Object[]{this});
        }
        return null;
    }
}
