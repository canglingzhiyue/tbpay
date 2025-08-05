package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.sdk.event.params.c;

/* loaded from: classes4.dex */
public class evk extends evq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1015213517);
    }

    @Override // tb.evq, com.taobao.android.trade.event.Event
    public int getEventId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ce275619", new Object[]{this})).intValue();
        }
        return 20010;
    }

    public evk(c cVar) {
        super(cVar);
        tpc.a("com.taobao.android.detail.sdk.event.market.MarketAddCartEvent");
    }
}
