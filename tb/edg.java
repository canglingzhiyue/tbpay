package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes4.dex */
public class edg extends enn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(274396979);
    }

    @Override // com.taobao.android.trade.event.Event
    public Object getParam() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("a5850f14", new Object[]{this});
        }
        return null;
    }

    public edg() {
        emu.a("com.taobao.android.detail.core.event.definition.CloseMiniVideoCompleteEvent");
    }
}
