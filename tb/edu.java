package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.event.params.JoinJhsParams;

/* loaded from: classes4.dex */
public class edu extends enn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public JoinJhsParams f27220a;

    static {
        kge.a(1623705987);
    }

    public edu(JoinJhsParams joinJhsParams) {
        this.f27220a = joinJhsParams;
        emu.a("com.taobao.android.detail.core.event.jhs.JoinJhsEvent");
    }

    @Override // com.taobao.android.trade.event.Event
    public Object getParam() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("a5850f14", new Object[]{this}) : this.f27220a;
    }
}
