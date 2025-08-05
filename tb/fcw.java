package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes5.dex */
public class fcw extends enn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1656035104);
    }

    @Override // com.taobao.android.trade.event.Event
    public Object getParam() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("a5850f14", new Object[]{this});
        }
        return null;
    }

    public fcw() {
        emu.a("com.taobao.android.detail.wrapper.ext.event.dinamic.OpenEndorsementEvent");
    }
}
