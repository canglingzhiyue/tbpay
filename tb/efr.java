package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.event.params.c;

/* loaded from: classes4.dex */
public class efr extends eoj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1752807614);
    }

    public efr() {
        emu.a("com.taobao.android.detail.core.event.trade.AddCartEvent");
    }

    public efr(c cVar) {
        super(cVar);
        emu.a("com.taobao.android.detail.core.event.trade.AddCartEvent");
    }

    @Override // com.taobao.android.trade.event.Event
    public Object getParam() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("a5850f14", new Object[]{this}) : this.c;
    }
}
