package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.core.exception.FluidException;
import com.taobao.android.fluid.core.f;
import com.taobao.android.layoutmanager.module.NavigationTabModule;

/* loaded from: classes5.dex */
public class smv implements NavigationTabModule.a, smy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final FluidContext f33723a;
    private final f<NavigationTabModule.a> b = new f<>();

    static {
        kge.a(901141611);
        kge.a(445564598);
        kge.a(632676500);
    }

    public smv(FluidContext fluidContext) {
        this.f33723a = fluidContext;
    }

    @Override // tb.smy
    public void addNavigationShowHideStatusListener(NavigationTabModule.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ce4711a", new Object[]{this, aVar});
        } else if (aVar == null) {
        } else {
            this.b.a(aVar);
        }
    }

    public void removeNavigationShowHideStatusListener(NavigationTabModule.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8392657", new Object[]{this, aVar});
        } else if (aVar == null) {
        } else {
            this.b.c(aVar);
        }
    }

    @Override // com.taobao.android.layoutmanager.module.NavigationTabModule.a
    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        spz.c("HostAppListenersManager", "onNavigationShowHideStatusChanged 被执行，isHideStatus：" + z + "，监听器数量：" + this.b.b());
        for (NavigationTabModule.a aVar : this.b.a()) {
            try {
                aVar.a(z);
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f33723a, aVar, "onNavigationShowHideStatusChanged", e);
            }
        }
    }
}
