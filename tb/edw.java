package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes4.dex */
public class edw extends enn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(230092476);
    }

    @Override // com.taobao.android.trade.event.Event
    public Object getParam() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("a5850f14", new Object[]{this});
        }
        return null;
    }

    public edw() {
        emu.a("com.taobao.android.detail.core.event.market.QueryMarketCartPriceEvent");
    }
}
