package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.event.params.h;

/* loaded from: classes4.dex */
public class edz extends enn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private h f27223a;

    static {
        kge.a(-642584589);
    }

    public edz(h hVar) {
        this.f27223a = hVar;
        emu.a("com.taobao.android.detail.core.event.msoa.ShowServiceBannerEvent");
    }

    @Override // com.taobao.android.trade.event.Event
    public Object getParam() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("a5850f14", new Object[]{this}) : this.f27223a;
    }
}
