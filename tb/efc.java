package tb;

import android.os.Bundle;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.core.event.a;
import com.taobao.android.trade.event.Event;
import com.taobao.android.trade.event.ThreadMode;
import com.taobao.android.trade.event.i;
import com.taobao.android.trade.event.j;
import java.util.HashMap;

/* loaded from: classes4.dex */
public class efc implements j<Event> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private DetailCoreActivity f27260a;

    static {
        kge.a(-422852044);
        kge.a(-1453870097);
    }

    public efc(DetailCoreActivity detailCoreActivity) {
        this.f27260a = detailCoreActivity;
        emu.a("com.taobao.android.detail.core.event.subscriber.isv.PushParamsToPurchaseSubscriber");
    }

    @Override // com.taobao.android.trade.event.j
    public i handleEvent(Event event) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i) ipChange.ipc$dispatch("caa7474e", new Object[]{this, event});
        }
        HashMap hashMap = this.f27260a.y().u;
        Bundle bundle = new Bundle();
        bundle.putSerializable("buildOrderParams", hashMap);
        bundle.putInt("purchase_from", 2);
        a.SUCCESS.b = bundle;
        return a.SUCCESS;
    }

    @Override // com.taobao.android.trade.event.j
    public ThreadMode getThreadMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ThreadMode) ipChange.ipc$dispatch("6de50c9b", new Object[]{this}) : ThreadMode.MainThread;
    }
}
