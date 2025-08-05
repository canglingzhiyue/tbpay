package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.event.params.f;

/* loaded from: classes4.dex */
public class eef extends enn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public f f27230a;

    static {
        kge.a(30801029);
    }

    public eef(f fVar) {
        this.f27230a = fVar;
        emu.a("com.taobao.android.detail.core.event.remind.RemindEvent");
    }

    @Override // com.taobao.android.trade.event.Event
    public Object getParam() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("a5850f14", new Object[]{this}) : this.f27230a;
    }
}
