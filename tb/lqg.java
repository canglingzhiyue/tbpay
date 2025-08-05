package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.framework.IContainerService;

/* loaded from: classes.dex */
public class lqg implements lqm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final IContainerService<?> f30824a;
    private lqh b;

    static {
        kge.a(211039528);
        kge.a(819756510);
    }

    public lqg(ljs ljsVar) {
        this.f30824a = (IContainerService) ljsVar.a(IContainerService.class);
    }

    @Override // tb.lqm
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        IContainerService<?> iContainerService = this.f30824a;
        if (iContainerService == null) {
            ldf.d("ContainerUiRefreshPerformanceTrace", "startTrace mContainerService is null");
        } else {
            a(iContainerService);
        }
    }

    @Override // tb.lqm
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        IContainerService<?> iContainerService = this.f30824a;
        if (iContainerService == null) {
            ldf.d("ContainerUiRefreshPerformanceTrace", "stopTrace mContainerService is null");
        } else {
            b(iContainerService);
        }
    }

    private void a(IContainerService<?> iContainerService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1dc8ef0", new Object[]{this, iContainerService});
            return;
        }
        if (this.b == null) {
            this.b = new lqh();
        }
        iContainerService.addUiRefreshListener(this.b);
    }

    private void b(IContainerService<?> iContainerService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc4d880f", new Object[]{this, iContainerService});
            return;
        }
        lqh lqhVar = this.b;
        if (lqhVar == null) {
            return;
        }
        iContainerService.removeUiRefreshListener(lqhVar);
    }
}
