package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.core.event.a;
import com.taobao.android.detail.wrapper.fragment.SizingChartFloatFragment;
import com.taobao.android.trade.event.Event;
import com.taobao.android.trade.event.ThreadMode;
import com.taobao.android.trade.event.i;

/* loaded from: classes5.dex */
public class fdr extends eei<fcn> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public DetailCoreActivity f27844a;

    static {
        kge.a(1806984135);
    }

    @Override // tb.eei
    public String getFullClassName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7324d71b", new Object[]{this}) : "com.taobao.android.detail.wrapper.ext.event.subscriber.size.OpenInterSizingChartSubscriber";
    }

    @Override // tb.eei, com.taobao.android.trade.event.j
    public /* synthetic */ i handleEvent(Event event) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (i) ipChange.ipc$dispatch("caa7474e", new Object[]{this, event}) : a((fcn) event);
    }

    public fdr(DetailCoreActivity detailCoreActivity) {
        this.f27844a = detailCoreActivity;
        emu.a("com.taobao.android.detail.wrapper.ext.event.subscriber.size.OpenInterSizingChartSubscriber");
    }

    public i a(fcn fcnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i) ipChange.ipc$dispatch("41a80028", new Object[]{this, fcnVar});
        }
        if (fcnVar == null) {
            return a.FAILURE;
        }
        String b = fcnVar.b();
        if (StringUtils.isEmpty(b)) {
            return a.FAILURE;
        }
        try {
            SizingChartFloatFragment.startFragment(this.f27844a, fcnVar.a(), b);
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
