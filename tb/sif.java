package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.framework.lifecycle.ILifecycleService;
import tb.shm;

/* loaded from: classes5.dex */
public class sif extends shm.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final sic f33601a;

    static {
        kge.a(-1118499975);
    }

    @Override // tb.shm.a, tb.shm
    public void onDisAppear(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("733d6747", new Object[]{this, pswVar});
        }
    }

    public sif(sic sicVar) {
        this.f33601a = sicVar;
        b();
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            sie.a(this.f33601a.z(), this.f33601a.g().a(), z);
        }
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            this.f33601a.t().addCardLifecycleListener(this);
        }
    }

    @Override // tb.shm.a, tb.shm
    public void onAppear(psw pswVar) {
        int pageState;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b1baaf7", new Object[]{this, pswVar});
            return;
        }
        this.f33601a.X();
        if (this.f33601a.z().getService(ILifecycleService.class) != null && (pageState = ((ILifecycleService) this.f33601a.z().getService(ILifecycleService.class)).getPageState()) != 1 && pageState != 2) {
            z = false;
        }
        sie.a(this.f33601a.z(), this.f33601a, z);
        a(z);
        this.f33601a.W();
    }
}
