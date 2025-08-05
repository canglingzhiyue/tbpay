package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.utils.e;
import com.taobao.android.trade.event.Event;
import com.taobao.android.trade.event.ThreadMode;
import com.taobao.android.trade.event.i;
import com.taobao.android.trade.event.j;
import com.taobao.homepage.request.SettingGetResult;

/* loaded from: classes7.dex */
public class kyg implements j<Event> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final lbo e;

    static {
        kge.a(-2111057876);
        kge.a(-1453870097);
    }

    public kyg(lbo lboVar) {
        this.e = lboVar;
    }

    @Override // com.taobao.android.trade.event.j
    public i handleEvent(Event event) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i) ipChange.ipc$dispatch("caa7474e", new Object[]{this, event});
        }
        StringBuilder sb = new StringBuilder();
        sb.append("requestType: ");
        kxn kxnVar = (kxn) event;
        sb.append(kxnVar.b());
        e.e("SecondFloorProcessSubscriber", sb.toString());
        SettingGetResult a2 = kxnVar.a();
        if (a2 == null) {
            e.e("SecondFloorProcessSubscriber", "result == null");
            return null;
        }
        mjx i = this.e.i();
        if (i != null) {
            i.a(a2.settingNewConfigResult);
        }
        return i.SUCCESS;
    }

    @Override // com.taobao.android.trade.event.j
    public ThreadMode getThreadMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ThreadMode) ipChange.ipc$dispatch("6de50c9b", new Object[]{this}) : ThreadMode.MainThread;
    }
}
