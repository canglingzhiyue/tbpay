package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.core.detail.kit.fragment.ShopPromotionFragment;
import com.taobao.android.trade.event.ThreadMode;
import com.taobao.android.trade.event.i;
import com.taobao.android.trade.event.j;

/* loaded from: classes5.dex */
public class fdk implements j<ent> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private DetailCoreActivity f27833a;

    static {
        kge.a(123166319);
        kge.a(-1453870097);
    }

    @Override // com.taobao.android.trade.event.j
    public /* synthetic */ i handleEvent(ent entVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (i) ipChange.ipc$dispatch("caa7474e", new Object[]{this, entVar}) : a(entVar);
    }

    public i a(ent entVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i) ipChange.ipc$dispatch("1d22b8c2", new Object[]{this, entVar});
        }
        this.f27833a.y();
        ecf.h(this.f27833a);
        ShopPromotionFragment.startFragment(this.f27833a, entVar.a(), entVar.f27477a);
        return i.SUCCESS;
    }

    public fdk(DetailCoreActivity detailCoreActivity) {
        this.f27833a = detailCoreActivity;
        emu.a("com.taobao.android.detail.wrapper.ext.event.subscriber.entrance.OpenShopPromotionSubscriber");
    }

    @Override // com.taobao.android.trade.event.j
    public ThreadMode getThreadMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ThreadMode) ipChange.ipc$dispatch("6de50c9b", new Object[]{this}) : ThreadMode.MainThread;
    }
}
