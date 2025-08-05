package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.core.event.a;
import com.taobao.android.trade.event.Event;
import com.taobao.android.trade.event.ThreadMode;
import com.taobao.android.trade.event.i;

/* loaded from: classes4.dex */
public class eev extends eei<edo> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public DetailCoreActivity f27253a;

    static {
        kge.a(1852659644);
    }

    @Override // tb.eei
    public String getFullClassName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7324d71b", new Object[]{this}) : "com.taobao.android.detail.core.event.subscriber.desc.CheckSkuEventSubscriber";
    }

    @Override // tb.eei, com.taobao.android.trade.event.j
    public /* synthetic */ i handleEvent(Event event) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (i) ipChange.ipc$dispatch("caa7474e", new Object[]{this, event}) : a((edo) event);
    }

    public eev(DetailCoreActivity detailCoreActivity) {
        this.f27253a = detailCoreActivity;
    }

    public i a(edo edoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i) ipChange.ipc$dispatch("eda17907", new Object[]{this, edoVar});
        }
        com.taobao.android.detail.core.event.params.i iVar = edoVar.f27213a;
        DetailCoreActivity detailCoreActivity = this.f27253a;
        if (detailCoreActivity != null && detailCoreActivity.y() != null && this.f27253a.y().h() != null && !this.f27253a.y().h().changePropValueId(iVar.b, iVar.f9723a) && iVar.f9723a) {
            epo.a("当前属性已卖完～");
        }
        return a.SUCCESS;
    }

    @Override // com.taobao.android.trade.event.j
    public ThreadMode getThreadMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ThreadMode) ipChange.ipc$dispatch("6de50c9b", new Object[]{this}) : ThreadMode.MainThread;
    }
}
