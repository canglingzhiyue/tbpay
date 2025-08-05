package tb;

import android.app.Activity;
import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.event.basic.g;
import com.taobao.android.trade.event.ThreadMode;
import com.taobao.android.trade.event.i;
import com.taobao.android.trade.event.j;

/* loaded from: classes4.dex */
public class eem implements j<g> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Context f27237a;

    static {
        kge.a(2019701381);
        kge.a(-1453870097);
    }

    @Override // com.taobao.android.trade.event.j
    public /* synthetic */ i handleEvent(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (i) ipChange.ipc$dispatch("caa7474e", new Object[]{this, gVar}) : a(gVar);
    }

    public eem(Activity activity) {
        this.f27237a = activity.getBaseContext();
        emu.a("com.taobao.android.detail.core.event.subscriber.basic.GrantPermissionSubscriber");
    }

    public i a(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i) ipChange.ipc$dispatch("57572624", new Object[]{this, gVar});
        }
        ehm a2 = ehk.a();
        if (a2 != null) {
            a2.a(this.f27237a, gVar.f9702a.c, gVar.f9702a.d, gVar.f9702a.f9703a, gVar.f9702a.b);
            return i.SUCCESS;
        }
        throw new IllegalArgumentException("IDependAdapter is null");
    }

    @Override // com.taobao.android.trade.event.j
    public ThreadMode getThreadMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ThreadMode) ipChange.ipc$dispatch("6de50c9b", new Object[]{this}) : ThreadMode.MainThread;
    }
}
