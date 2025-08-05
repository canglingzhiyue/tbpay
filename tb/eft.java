package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.request.cart.AddBagRequestParams;

/* loaded from: classes4.dex */
public class eft extends enn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public AddBagRequestParams f27285a;

    static {
        kge.a(-1013901901);
    }

    @Override // com.taobao.android.trade.event.Event
    public Object getParam() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("a5850f14", new Object[]{this});
        }
        return null;
    }

    public eft(AddBagRequestParams addBagRequestParams) {
        this.f27285a = addBagRequestParams;
        emu.a("com.taobao.android.detail.core.event.trade.AddCartSuccessEvent");
    }
}
