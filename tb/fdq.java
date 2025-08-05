package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.event.a;
import com.taobao.android.detail.wrapper.activity.DetailActivity;
import com.taobao.android.trade.event.ThreadMode;
import com.taobao.android.trade.event.i;
import com.taobao.android.trade.event.j;

/* loaded from: classes5.dex */
public class fdq implements j<eeg> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "TBSizeChartFragment";

    /* renamed from: a  reason: collision with root package name */
    private DetailActivity f27843a;

    static {
        kge.a(-636747856);
        kge.a(-1453870097);
    }

    @Override // com.taobao.android.trade.event.j
    public /* synthetic */ i handleEvent(eeg eegVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (i) ipChange.ipc$dispatch("caa7474e", new Object[]{this, eegVar}) : a(eegVar);
    }

    public fdq(DetailActivity detailActivity) {
        this.f27843a = detailActivity;
        emu.a("com.taobao.android.detail.wrapper.ext.event.subscriber.size.CloseTBSizeChartSubscriber");
    }

    public i a(eeg eegVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i) ipChange.ipc$dispatch("b1b5799e", new Object[]{this, eegVar});
        }
        DetailActivity detailActivity = this.f27843a;
        if (detailActivity == null || detailActivity.isFinishing()) {
            return a.FAILURE;
        }
        if (this.f27843a.y() == null) {
            return a.FAILURE;
        }
        if (this.f27843a.s == null) {
            return a.FAILURE;
        }
        if (fgy.a(this.f27843a.s)) {
            this.f27843a.s.dismiss();
        }
        return a.SUCCESS;
    }

    @Override // com.taobao.android.trade.event.j
    public ThreadMode getThreadMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ThreadMode) ipChange.ipc$dispatch("6de50c9b", new Object[]{this}) : ThreadMode.MainThread;
    }
}
