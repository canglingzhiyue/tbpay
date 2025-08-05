package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.event.params.g;

/* loaded from: classes4.dex */
public class ede extends enn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public g f27206a;

    static {
        kge.a(-1713471312);
    }

    @Override // com.taobao.android.trade.event.Event
    public Object getParam() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("a5850f14", new Object[]{this}) : this.f27206a;
    }
}
