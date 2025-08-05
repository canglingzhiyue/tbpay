package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.trade.event.ThreadMode;
import com.taobao.android.trade.event.i;
import com.taobao.android.trade.event.j;
import com.taobao.homepage.utils.HomePageUtility;
import com.taobao.tao.homepage.d;

/* loaded from: classes7.dex */
public class kxu implements j<kwy> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public lbo f30384a;

    static {
        kge.a(-2076368159);
        kge.a(-1453870097);
    }

    @Override // com.taobao.android.trade.event.j
    public /* synthetic */ i handleEvent(kwy kwyVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (i) ipChange.ipc$dispatch("caa7474e", new Object[]{this, kwyVar}) : a(kwyVar);
    }

    public kxu(lbo lboVar) {
        this.f30384a = lboVar;
    }

    public i a(kwy kwyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i) ipChange.ipc$dispatch("a1572764", new Object[]{this, kwyVar});
        }
        if (!kwyVar.b()) {
            return i.FAILURE;
        }
        d.a(kwyVar.c);
        HomePageUtility.a(this.f30384a.a().getCurActivity());
        return i.SUCCESS;
    }

    @Override // com.taobao.android.trade.event.j
    public ThreadMode getThreadMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ThreadMode) ipChange.ipc$dispatch("6de50c9b", new Object[]{this}) : ThreadMode.MainThread;
    }
}
