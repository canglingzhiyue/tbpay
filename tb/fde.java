package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.core.event.a;
import com.taobao.android.detail.datasdk.event.params.SkuBottomBarStyleDTO;
import com.taobao.android.detail.datasdk.event.sku.OpenSkuEvent;
import com.taobao.android.trade.event.ThreadMode;
import com.taobao.android.trade.event.f;
import com.taobao.android.trade.event.i;
import com.taobao.android.trade.event.j;

/* loaded from: classes5.dex */
public class fde implements j<fcv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private DetailCoreActivity f27823a;

    static {
        kge.a(608841849);
        kge.a(-1453870097);
    }

    @Override // com.taobao.android.trade.event.j
    public /* synthetic */ i handleEvent(fcv fcvVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (i) ipChange.ipc$dispatch("caa7474e", new Object[]{this, fcvVar}) : a(fcvVar);
    }

    public fde(DetailCoreActivity detailCoreActivity) {
        this.f27823a = detailCoreActivity;
        emu.a("com.taobao.android.detail.wrapper.ext.event.subscriber.bottom.DonateClickedSubscriber");
    }

    public i a(fcv fcvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i) ipChange.ipc$dispatch("dee69c30", new Object[]{this, fcvVar});
        }
        DetailCoreActivity detailCoreActivity = this.f27823a;
        if (detailCoreActivity == null || detailCoreActivity.y() == null) {
            return a.FAILURE;
        }
        f.a(this.f27823a).a(new OpenSkuEvent(SkuBottomBarStyleDTO.DONATE));
        return i.SUCCESS;
    }

    @Override // com.taobao.android.trade.event.j
    public ThreadMode getThreadMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ThreadMode) ipChange.ipc$dispatch("6de50c9b", new Object[]{this}) : ThreadMode.MainThread;
    }
}
