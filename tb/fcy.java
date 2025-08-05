package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.event.params.CollectionParams;

/* loaded from: classes5.dex */
public class fcy extends enn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public CollectionParams f27813a;

    static {
        kge.a(-1681983371);
    }

    public fcy(CollectionParams collectionParams) {
        this.f27813a = collectionParams;
        emu.a("com.taobao.android.detail.wrapper.ext.event.fav.FavStatusChangedEvent");
    }

    @Override // com.taobao.android.trade.event.Event
    public Object getParam() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("a5850f14", new Object[]{this}) : this.f27813a;
    }
}
