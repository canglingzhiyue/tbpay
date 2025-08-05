package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes5.dex */
public class fcv extends enn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-784606724);
    }

    @Override // com.taobao.android.trade.event.Event
    public Object getParam() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("a5850f14", new Object[]{this});
        }
        return null;
    }

    public fcv() {
        emu.a("com.taobao.android.detail.wrapper.ext.event.bottom.DonateClickedEvent");
    }
}
