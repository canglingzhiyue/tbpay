package com.taobao.android.fluid.framework.performance;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.container.IContainerService;
import tb.hjj;
import tb.kge;
import tb.pik;
import tb.psw;
import tb.son;

/* loaded from: classes5.dex */
public class PerformanceService implements IPerformanceService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String SERVICE_NAME = "IPerformanceService";
    private final String TAG = "PerformanceService";
    private final FluidContext mFluidContext;

    static {
        kge.a(-683221203);
        kge.a(1224949478);
    }

    @Override // com.taobao.android.fluid.core.FluidService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
        }
    }

    public PerformanceService(FluidContext fluidContext) {
        this.mFluidContext = fluidContext;
    }

    @Override // com.taobao.android.fluid.core.FluidService
    public void onCreateService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("486f8601", new Object[]{this});
            return;
        }
        new pik(this.mFluidContext);
        ((IContainerService) this.mFluidContext.getService(IContainerService.class)).addCardRenderListener(new hjj() { // from class: com.taobao.android.fluid.framework.performance.PerformanceService.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.hjj
            public void onCardRenderFailed(psw pswVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8f332645", new Object[]{this, pswVar});
                }
            }

            @Override // tb.hjj
            public void onCardRenderSuccess(psw pswVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("94f433e1", new Object[]{this, pswVar});
                } else if (!son.q()) {
                } else {
                    a(pswVar, 1002, pswVar.r());
                }
            }

            private void a(psw pswVar, int i, int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("67e4eae4", new Object[]{this, pswVar, new Integer(i), new Integer(i2)});
                } else if (!son.q() || i2 < 0 || pswVar.G().b() == null) {
                } else {
                    pswVar.G().b().a(i2, i);
                }
            }
        });
    }
}
