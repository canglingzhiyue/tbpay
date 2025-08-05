package com.taobao.android.fluid.framework.hostcontainer.pageinterface;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.core.FluidInstanceConfig;
import com.taobao.android.fluid.framework.scene.ISceneConfigService;
import com.taobao.tao.flexbox.layoutmanager.container.f;
import tb.ihj;
import tb.kge;
import tb.sps;

/* loaded from: classes5.dex */
public class HostPageInterfaceService implements IHostPageInterfaceService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String SERVICE_NAME = "IHostPageInterfaceService";
    private final FluidContext mFluidContext;
    private f mPageInterface;
    private ISceneConfigService mSceneConfigService;

    static {
        kge.a(-877762217);
        kge.a(626278424);
    }

    @Override // com.taobao.android.fluid.core.FluidService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
        }
    }

    public static /* synthetic */ f access$002(HostPageInterfaceService hostPageInterfaceService, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("b4400b05", new Object[]{hostPageInterfaceService, fVar});
        }
        hostPageInterfaceService.mPageInterface = fVar;
        return fVar;
    }

    public HostPageInterfaceService(FluidContext fluidContext) {
        this.mFluidContext = fluidContext;
    }

    @Override // com.taobao.android.fluid.framework.hostcontainer.pageinterface.IHostPageInterfaceService
    public f getPageInterface() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("b3576e9b", new Object[]{this}) : this.mPageInterface;
    }

    @Override // com.taobao.android.fluid.core.FluidService
    public void onCreateService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("486f8601", new Object[]{this});
            return;
        }
        this.mSceneConfigService = (ISceneConfigService) this.mFluidContext.getService(ISceneConfigService.class);
        this.mPageInterface = this.mFluidContext.getInstanceConfig().getHostPageInterface();
        this.mSceneConfigService.addInstanceConfigChangedListener(new ihj() { // from class: com.taobao.android.fluid.framework.hostcontainer.pageinterface.HostPageInterfaceService.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.ihj
            public void a(FluidInstanceConfig fluidInstanceConfig, sps spsVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("1183802a", new Object[]{this, fluidInstanceConfig, spsVar});
                } else {
                    HostPageInterfaceService.access$002(HostPageInterfaceService.this, fluidInstanceConfig.getHostPageInterface());
                }
            }
        });
    }
}
