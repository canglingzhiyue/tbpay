package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.event.params.e;

/* loaded from: classes4.dex */
public class edx extends enn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private e f27221a;

    static {
        kge.a(1826585000);
    }

    public edx(e eVar) {
        this.f27221a = eVar;
        emu.a("com.taobao.android.detail.core.event.msoa.CloseFloatWeexFragmentEvent");
    }

    @Override // com.taobao.android.trade.event.Event
    public Object getParam() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("a5850f14", new Object[]{this}) : this.f27221a;
    }
}
