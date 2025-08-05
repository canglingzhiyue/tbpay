package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.core.event.a;
import com.taobao.android.trade.event.ThreadMode;
import com.taobao.android.trade.event.d;
import com.taobao.android.trade.event.f;
import com.taobao.android.trade.event.i;
import com.taobao.android.trade.event.j;

/* loaded from: classes4.dex */
public class eew implements j<edp> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private DetailCoreActivity f27254a;

    static {
        kge.a(-1644186749);
        kge.a(-1453870097);
    }

    @Override // com.taobao.android.trade.event.j
    public /* synthetic */ i handleEvent(edp edpVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (i) ipChange.ipc$dispatch("caa7474e", new Object[]{this, edpVar}) : a(edpVar);
    }

    public eew(DetailCoreActivity detailCoreActivity) {
        this.f27254a = detailCoreActivity;
        emu.a("com.taobao.android.detail.core.event.subscriber.desc.OpenFullDescSubscriber");
    }

    public i a(edp edpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i) ipChange.ipc$dispatch("1494c88", new Object[]{this, edpVar});
        }
        DetailCoreActivity detailCoreActivity = this.f27254a;
        if (detailCoreActivity == null) {
            return a.FAILURE;
        }
        dya y = detailCoreActivity.y();
        if (y == null) {
            return a.FAILURE;
        }
        if (y.k == null) {
            return a.FAILURE;
        }
        try {
            if (y.m != null) {
                y.m.getActivity().getSupportFragmentManager().popBackStack();
            }
        } catch (Exception unused) {
        }
        d a2 = f.a(this.f27254a);
        com.taobao.android.detail.core.event.basic.a aVar = new com.taobao.android.detail.core.event.basic.a(null);
        aVar.f9694a = "divisionDesc";
        a2.a(aVar);
        return a.SUCCESS;
    }

    @Override // com.taobao.android.trade.event.j
    public ThreadMode getThreadMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ThreadMode) ipChange.ipc$dispatch("6de50c9b", new Object[]{this}) : ThreadMode.MainThread;
    }
}
