package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes5.dex */
public class fcs extends enn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-997115506);
    }

    @Override // com.taobao.android.trade.event.Event
    public Object getParam() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("a5850f14", new Object[]{this});
        }
        return null;
    }

    public fcs() {
        emu.a("com.taobao.android.detail.wrapper.ext.event.basic.ShowAddressEvent");
    }
}
