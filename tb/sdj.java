package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXEngineConfig;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.home.component.utils.e;
import com.taobao.android.trade.event.ThreadMode;
import com.taobao.android.trade.event.i;
import com.taobao.android.trade.event.j;
import com.taobao.homepage.utils.b;
import com.taobao.tao.homepage.f;

/* loaded from: classes7.dex */
public class sdj implements j<kwy> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private boolean f33493a = f.a().d();
    private final boolean b;

    static {
        kge.a(660245640);
        kge.a(-1453870097);
    }

    public sdj() {
        this.b = b.c() || b.b();
    }

    @Override // com.taobao.android.trade.event.j
    public /* synthetic */ i handleEvent(kwy kwyVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (i) ipChange.ipc$dispatch("caa7474e", new Object[]{this, kwyVar}) : a(kwyVar);
    }

    public i a(kwy kwyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i) ipChange.ipc$dispatch("a1572764", new Object[]{this, kwyVar});
        }
        if (!this.b) {
            return i.SUCCESS;
        }
        DinamicXEngine b = f.a().b();
        DXEngineConfig b2 = b.b();
        boolean a2 = b.a();
        b2.a(a2, a2 && b.d());
        e.e("HudScreenSubscriber", "isEnableDesignScale: " + a2);
        if (this.f33493a != a2) {
            e.e("HudScreenSubscriber", "hud screen state change");
            DinamicXEngine.a(true);
            b.k();
        }
        this.f33493a = a2;
        return i.SUCCESS;
    }

    @Override // com.taobao.android.trade.event.j
    public ThreadMode getThreadMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ThreadMode) ipChange.ipc$dispatch("6de50c9b", new Object[]{this}) : ThreadMode.MainThread;
    }
}
