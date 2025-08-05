package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.event.params.b;

/* loaded from: classes5.dex */
public class fcx extends enn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public b f27812a;

    static {
        kge.a(-306983288);
    }

    public fcx(b bVar) {
        this.f27812a = bVar;
        emu.a("com.taobao.android.detail.wrapper.ext.event.fav.DoFavEvent");
    }

    @Override // com.taobao.android.trade.event.Event
    public Object getParam() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("a5850f14", new Object[]{this}) : this.f27812a;
    }
}
