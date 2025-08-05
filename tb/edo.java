package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.event.params.i;

/* loaded from: classes4.dex */
public class edo extends enn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public i f27213a;

    static {
        kge.a(1594559393);
    }

    public edo(i iVar) {
        this.f27213a = iVar;
        emu.a("com.taobao.android.detail.core.event.desc.CheckSkuEvent");
    }

    @Override // com.taobao.android.trade.event.Event
    public Object getParam() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("a5850f14", new Object[]{this}) : this.f27213a;
    }
}
