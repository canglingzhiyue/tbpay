package com.taobao.android.fluid.business.globalinteraction;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.business.globalinteraction.render.a;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.core.exception.FluidException;
import com.taobao.android.fluid.framework.lifecycle.ILifecycleService;
import tb.iqw;
import tb.kge;

/* loaded from: classes5.dex */
public class InteractionService implements IInteractionService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "InteractionService";
    private final FluidContext mFluidContext;
    private final a mGlobalInteractManager;
    private final iqw mInteractionServiceConfig = new iqw();
    private ILifecycleService mLifecycleService;

    static {
        kge.a(1361378202);
        kge.a(877081621);
    }

    @Override // com.taobao.android.fluid.core.FluidService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
        }
    }

    public InteractionService(FluidContext fluidContext) {
        this.mFluidContext = fluidContext;
        this.mGlobalInteractManager = new a(this.mFluidContext);
    }

    @Override // com.taobao.android.fluid.business.globalinteraction.IInteractionService
    public iqw getConfig() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (iqw) ipChange.ipc$dispatch("feb83478", new Object[]{this}) : this.mInteractionServiceConfig;
    }

    @Override // com.taobao.android.fluid.business.globalinteraction.IInteractionService
    public void setGlobalLayerVisibility(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ead7b80f", new Object[]{this, new Boolean(z)});
        } else {
            this.mGlobalInteractManager.b(z);
        }
    }

    @Override // com.taobao.android.fluid.business.globalinteraction.IInteractionService
    public String getGlobalVCH5Url() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1f8a7e7d", new Object[]{this}) : this.mGlobalInteractManager.d();
    }

    @Override // com.taobao.android.fluid.business.globalinteraction.IInteractionService
    public void initCollectionPoplayer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60cf8d15", new Object[]{this});
        } else {
            this.mGlobalInteractManager.n();
        }
    }

    @Override // com.taobao.android.fluid.business.globalinteraction.IInteractionService
    public void initGlobalH5MessageHandler(com.taobao.android.fluid.framework.data.datamodel.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b8f52a2", new Object[]{this, aVar});
        } else {
            this.mGlobalInteractManager.a(aVar);
        }
    }

    @Override // com.taobao.android.fluid.business.globalinteraction.IInteractionService
    public void initGlobalInteractHandler() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e588ae8", new Object[]{this});
        } else {
            this.mGlobalInteractManager.g();
        }
    }

    @Override // com.taobao.android.fluid.business.globalinteraction.IInteractionService
    public boolean isEnableGlobalWeexDSLV2() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e3518ab3", new Object[]{this})).booleanValue() : this.mGlobalInteractManager.h();
    }

    @Override // com.taobao.android.fluid.core.FluidService
    public void onCreateService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("486f8601", new Object[]{this});
            return;
        }
        this.mLifecycleService = (ILifecycleService) this.mFluidContext.getService(ILifecycleService.class);
        ILifecycleService iLifecycleService = this.mLifecycleService;
        if (iLifecycleService == null) {
            FluidException.throwServiceNotFoundException(this.mFluidContext, ILifecycleService.class);
        } else {
            iLifecycleService.addPageLifecycleListener(this.mGlobalInteractManager);
        }
    }
}
