package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes4.dex */
public class edi extends enn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1303947986);
    }

    @Override // com.taobao.android.trade.event.Event
    public Object getParam() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("a5850f14", new Object[]{this});
        }
        return null;
    }

    public edi() {
        emu.a("com.taobao.android.detail.core.event.definition.HideMainPageEvent");
    }
}
