package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes4.dex */
public class eee extends enn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private egv f27229a;

    static {
        kge.a(236625382);
    }

    public eee(egv egvVar) {
        this.f27229a = egvVar;
        emu.a("com.taobao.android.detail.core.event.remind.NotifyCheckRemindEvent");
    }

    @Override // com.taobao.android.trade.event.Event
    public Object getParam() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("a5850f14", new Object[]{this}) : this.f27229a;
    }
}
