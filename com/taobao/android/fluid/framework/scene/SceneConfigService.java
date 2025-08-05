package com.taobao.android.fluid.framework.scene;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.core.FluidInstanceConfig;
import com.taobao.android.fluid.framework.data.IDataService;
import java.util.HashMap;
import java.util.Map;
import tb.ihj;
import tb.ipi;
import tb.jbj;
import tb.jqa;
import tb.kge;
import tb.oec;
import tb.sni;
import tb.spo;
import tb.spp;
import tb.spr;
import tb.sps;
import tb.spz;

/* loaded from: classes5.dex */
public class SceneConfigService implements ISceneConfigService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "SceneConfigService";
    private IDataService mDataService;
    private final FluidContext mFluidContext;
    private spo mGlobalState;
    private boolean mIsItemRecognizeShowing;
    private sni mLockListListener;
    private final jbj mSceneConfigListenerManager;
    private final jqa mSceneParamsManager;
    private final spp mSlidePageLockConfigure = new spp();

    static {
        kge.a(-796339309);
        kge.a(-762886652);
    }

    @Override // com.taobao.android.fluid.core.FluidService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
        }
    }

    public SceneConfigService(FluidContext fluidContext) {
        this.mFluidContext = fluidContext;
        this.mSceneConfigListenerManager = new jbj(fluidContext);
        this.mSceneParamsManager = new jqa(this.mSceneConfigListenerManager);
    }

    @Override // tb.spm
    public void addInstanceConfigChangedListener(ihj ihjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("357261c", new Object[]{this, ihjVar});
        } else {
            this.mSceneConfigListenerManager.addInstanceConfigChangedListener(ihjVar);
        }
    }

    public void addSessionParamsChangedListener(ipi ipiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3439a82", new Object[]{this, ipiVar});
        } else {
            this.mSceneConfigListenerManager.a(ipiVar);
        }
    }

    public void removeInstanceConfigChangedListener(ihj ihjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2546a199", new Object[]{this, ihjVar});
        } else {
            this.mSceneConfigListenerManager.a(ihjVar);
        }
    }

    public void removeSessionParamsChangedListener(ipi ipiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35e83b65", new Object[]{this, ipiVar});
        } else {
            this.mSceneConfigListenerManager.b(ipiVar);
        }
    }

    @Override // com.taobao.android.fluid.framework.scene.ISceneConfigService
    public spo getGlobalState() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (spo) ipChange.ipc$dispatch("376a7435", new Object[]{this}) : this.mGlobalState;
    }

    @Override // com.taobao.android.fluid.framework.scene.ISceneConfigService
    public void refreshInstanceConfig(FluidInstanceConfig fluidInstanceConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ad4b47f", new Object[]{this, fluidInstanceConfig});
        } else {
            this.mSceneParamsManager.a(this.mFluidContext, fluidInstanceConfig);
        }
    }

    @Override // com.taobao.android.fluid.framework.scene.ISceneConfigService
    public void refreshSessionParams(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27e1b1dd", new Object[]{this, map});
        } else {
            this.mSceneParamsManager.a(map);
        }
    }

    @Override // com.taobao.android.fluid.framework.scene.ISceneConfigService
    public sni getLockListListener() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (sni) ipChange.ipc$dispatch("142c3ade", new Object[]{this}) : this.mLockListListener;
    }

    @Override // com.taobao.android.fluid.framework.scene.ISceneConfigService
    public void setLockListListener(sni sniVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("990d7e08", new Object[]{this, sniVar});
        } else {
            this.mLockListListener = sniVar;
        }
    }

    @Override // com.taobao.android.fluid.framework.scene.ISceneConfigService
    public sps getSessionParams() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (sps) ipChange.ipc$dispatch("d375f963", new Object[]{this}) : this.mSceneParamsManager.a();
    }

    @Override // com.taobao.android.fluid.framework.scene.ISceneConfigService
    public spr getSessionExtParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (spr) ipChange.ipc$dispatch("19310a23", new Object[]{this});
        }
        if (this.mSceneParamsManager.a() == null) {
            return null;
        }
        return this.mSceneParamsManager.a().a();
    }

    @Override // com.taobao.android.fluid.framework.scene.ISceneConfigService
    public spp getSlidePageLockConfigure() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (spp) ipChange.ipc$dispatch("4579a73b", new Object[]{this}) : this.mSlidePageLockConfigure;
    }

    @Override // com.taobao.android.fluid.framework.scene.ISceneConfigService
    public boolean isItemRecognizeShowing() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a3742f5f", new Object[]{this})).booleanValue() : this.mIsItemRecognizeShowing;
    }

    @Override // com.taobao.android.fluid.framework.scene.ISceneConfigService
    public void setItemRecognizeShowing(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("158dcea1", new Object[]{this, new Boolean(z)});
        } else {
            this.mIsItemRecognizeShowing = z;
        }
    }

    @Override // com.taobao.android.fluid.framework.scene.ISceneConfigService
    public void mergeTab3ExtParams(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cae3286d", new Object[]{this, map});
        } else {
            this.mSceneParamsManager.a(this.mFluidContext, map);
        }
    }

    @Override // com.taobao.android.fluid.framework.scene.ISceneConfigService
    public void updateGlobalParams(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b87046c", new Object[]{this, map});
            return;
        }
        spz.c(TAG, "updateGlobalParams " + map);
        sps sessionParams = getSessionParams();
        HashMap<String, String> b = oec.b(map);
        if (sessionParams == null) {
            return;
        }
        sessionParams.c(b);
    }

    @Override // com.taobao.android.fluid.core.FluidService
    public void onCreateService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("486f8601", new Object[]{this});
            return;
        }
        this.mDataService = (IDataService) this.mFluidContext.getService(IDataService.class);
        this.mSlidePageLockConfigure.a(true, false);
        this.mGlobalState = new spo();
    }
}
