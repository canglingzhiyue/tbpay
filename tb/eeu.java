package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.core.event.a;
import com.taobao.android.detail.core.event.params.g;
import com.taobao.android.detail.core.utils.p;
import com.taobao.android.trade.event.ThreadMode;
import com.taobao.android.trade.event.i;
import com.taobao.android.trade.event.j;

/* loaded from: classes4.dex */
public class eeu implements j<ede> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public DetailCoreActivity f27252a;

    static {
        kge.a(1075121183);
        kge.a(-1453870097);
    }

    @Override // com.taobao.android.trade.event.j
    public /* synthetic */ i handleEvent(ede edeVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (i) ipChange.ipc$dispatch("caa7474e", new Object[]{this, edeVar}) : a(edeVar);
    }

    public eeu(DetailCoreActivity detailCoreActivity) {
        this.f27252a = detailCoreActivity;
        emu.a("com.taobao.android.detail.core.event.subscriber.bottom.OpenShopSubscriber");
    }

    public i a(ede edeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i) ipChange.ipc$dispatch("291335fd", new Object[]{this, edeVar});
        }
        g gVar = edeVar.f27206a;
        epq.a(this.f27252a, p.a(p.a("https://shop.m.taobao.com/shop/shop_index.htm", "shop_id", gVar.f9720a), "item_id", gVar.b));
        return a.SUCCESS;
    }

    @Override // com.taobao.android.trade.event.j
    public ThreadMode getThreadMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ThreadMode) ipChange.ipc$dispatch("6de50c9b", new Object[]{this}) : ThreadMode.MainThread;
    }
}
