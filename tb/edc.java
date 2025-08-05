package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.event.params.a;

/* loaded from: classes4.dex */
public class edc extends enn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public a f27205a;

    static {
        kge.a(1024972236);
    }

    @Override // com.taobao.android.trade.event.Event
    public Object getParam() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("a5850f14", new Object[]{this});
        }
        return null;
    }

    public edc() {
        emu.a("com.taobao.android.detail.core.event.addon.AchieveCouponAfterCartEvent");
    }
}
