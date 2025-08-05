package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.core.detail.kit.fragment.TaxDescFragment;
import com.taobao.android.detail.core.event.a;
import com.taobao.android.detail.core.event.basic.l;
import com.taobao.android.trade.event.ThreadMode;
import com.taobao.android.trade.event.i;
import com.taobao.android.trade.event.j;

/* loaded from: classes4.dex */
public class eex implements j<l> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private DetailCoreActivity f27255a;

    static {
        kge.a(-401600055);
        kge.a(-1453870097);
    }

    @Override // com.taobao.android.trade.event.j
    public /* synthetic */ i handleEvent(l lVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (i) ipChange.ipc$dispatch("caa7474e", new Object[]{this, lVar}) : a(lVar);
    }

    public eex(DetailCoreActivity detailCoreActivity) {
        this.f27255a = detailCoreActivity;
        emu.a("com.taobao.android.detail.core.event.subscriber.desc.OpenTaxDescSubscriber");
    }

    public i a(l lVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i) ipChange.ipc$dispatch("b99e47a9", new Object[]{this, lVar});
        }
        if (lVar == null || lVar.a() == null || lVar.a().isEmpty()) {
            return a.FAILURE;
        }
        try {
            TaxDescFragment.startFragment(this.f27255a, lVar.b(), lVar.a());
        } catch (Exception unused) {
        }
        return a.SUCCESS;
    }

    @Override // com.taobao.android.trade.event.j
    public ThreadMode getThreadMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ThreadMode) ipChange.ipc$dispatch("6de50c9b", new Object[]{this}) : ThreadMode.MainThread;
    }
}
