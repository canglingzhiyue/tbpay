package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.core.FluidInstanceConfig;
import com.taobao.android.fluid.core.exception.FluidException;
import com.taobao.android.fluid.core.f;
import java.util.List;

/* loaded from: classes5.dex */
public class jbj implements ihj, ipi, spm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final FluidContext f29448a;
    private final f<ihj> b = new f<>();
    private final f<ipi> c = new f<>();

    static {
        kge.a(-1897286694);
        kge.a(-113581693);
        kge.a(-235994313);
        kge.a(-1601863034);
    }

    public jbj(FluidContext fluidContext) {
        this.f29448a = fluidContext;
    }

    @Override // tb.spm
    public void addInstanceConfigChangedListener(ihj ihjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("357261c", new Object[]{this, ihjVar});
        } else if (ihjVar == null) {
        } else {
            this.b.a(ihjVar);
        }
    }

    public void a(ipi ipiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee1ccb76", new Object[]{this, ipiVar});
        } else if (ipiVar == null) {
        } else {
            this.c.a(ipiVar);
        }
    }

    public void a(ihj ihjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edac83cd", new Object[]{this, ihjVar});
        } else if (ihjVar == null) {
        } else {
            this.b.c(ihjVar);
        }
    }

    public void b(ipi ipiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc9fd1f7", new Object[]{this, ipiVar});
        } else if (ipiVar == null) {
        } else {
            this.c.c(ipiVar);
        }
    }

    @Override // tb.ihj
    public void a(FluidInstanceConfig fluidInstanceConfig, sps spsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1183802a", new Object[]{this, fluidInstanceConfig, spsVar});
            return;
        }
        spz.c("SceneConfigChangedManager", "场景配置 FluidInstanceConfig 发生变化：\n视频流原始链接：" + fluidInstanceConfig.getFluidOriginUrl() + "\n视频流唤端链接：" + fluidInstanceConfig.getFluidUrl() + "\n视频流父容器 TNode：" + fluidInstanceConfig.getHostTNodeComponent() + "\n视频流父容器 PageInterface: " + fluidInstanceConfig.getHostPageInterface());
        List<ihj> a2 = this.b.a();
        if (a2 == null || a2.isEmpty()) {
            return;
        }
        for (ihj ihjVar : a2) {
            try {
                ihjVar.a(fluidInstanceConfig, spsVar);
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f29448a, ihjVar, "onInstanceConfigChanged", e);
            }
        }
    }

    @Override // tb.ipi
    public void a(sps spsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff31cd62", new Object[]{this, spsVar});
            return;
        }
        spz.c("SceneConfigChangedManager", "场景配置 SessionParams 发生变化");
        List<ipi> a2 = this.c.a();
        if (a2 == null || a2.isEmpty()) {
            return;
        }
        for (ipi ipiVar : a2) {
            try {
                ipiVar.a(spsVar);
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f29448a, ipiVar, "onSessionParamsChanged", e);
            }
        }
    }
}
