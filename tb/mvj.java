package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.intf.event.FailPhenixEvent;
import com.taobao.phenix.intf.event.a;

/* loaded from: classes4.dex */
public class mvj implements a<FailPhenixEvent> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ lpe f31282a;

    public boolean a(FailPhenixEvent failPhenixEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("64c1ef50", new Object[]{this, failPhenixEvent})).booleanValue();
        }
        return false;
    }

    public mvj(lpe lpeVar) {
        this.f31282a = lpeVar;
    }

    @Override // com.taobao.phenix.intf.event.a
    public /* synthetic */ boolean onHappen(FailPhenixEvent failPhenixEvent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d1090e38", new Object[]{this, failPhenixEvent})).booleanValue() : a(failPhenixEvent);
    }
}
