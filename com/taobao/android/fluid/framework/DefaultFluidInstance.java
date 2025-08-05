package com.taobao.android.fluid.framework;

import android.app.Activity;
import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.fluid.business.usertrack.ITrackService;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.core.FluidInstance;
import com.taobao.android.fluid.core.FluidInstanceConfig;
import com.taobao.android.fluid.core.FluidService;
import com.taobao.android.fluid.core.exception.FluidException;
import com.taobao.android.fluid.core.g;
import com.taobao.android.fluid.framework.analysis.IAnalysisService;
import com.taobao.android.fluid.framework.analysis.analysis.FluidInstanceAnalysis;
import com.taobao.android.fluid.framework.analysis.analysis.a;
import com.taobao.android.fluid.framework.lifecycle.ILifecycleService;
import com.taobao.android.fluid.framework.scene.ISceneConfigService;
import tb.kge;
import tb.pio;
import tb.riy;
import tb.spz;

/* loaded from: classes5.dex */
public final class DefaultFluidInstance implements FluidInstance {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String INSTANCE_PREFIX = "FluidInstance@";
    private static final String TAG = "DefaultFluidInstance";
    private final FluidInstanceConfig mFluidInstanceConfig;
    private ILifecycleService mILifecycleService;
    private boolean mIsDestroyed = false;
    private final FluidContext mFluidContext = this;
    private final g mFluidServiceManager = new g(this);

    static {
        kge.a(1245764999);
        kge.a(778020903);
    }

    public DefaultFluidInstance(FluidInstanceConfig fluidInstanceConfig) {
        this.mFluidInstanceConfig = fluidInstanceConfig;
        try {
            createServices();
        } catch (Exception e) {
            FluidException.throwException(this, FluidInstance.INSTANCE_NEW_INSTANCE_ERROR, e);
        }
    }

    @Override // com.taobao.android.fluid.core.FluidContext
    public Context getContext() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this}) : this.mFluidInstanceConfig.getContext();
    }

    @Override // com.taobao.android.fluid.core.FluidContext
    public FluidInstanceConfig getInstanceConfig() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FluidInstanceConfig) ipChange.ipc$dispatch("23103fbc", new Object[]{this}) : this.mFluidInstanceConfig;
    }

    @Override // com.taobao.android.fluid.core.FluidContext
    public String getInstanceId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5c00da33", new Object[]{this});
        }
        return INSTANCE_PREFIX + hashCode();
    }

    @Override // com.taobao.android.fluid.core.FluidContext
    public <T extends FluidService> T getService(Class<T> cls) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("90661d2b", new Object[]{this, cls}) : (T) this.mFluidServiceManager.a(cls);
    }

    @Override // com.taobao.android.fluid.core.FluidContext
    public void updateInstanceConfig(FluidInstanceConfig fluidInstanceConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c880351", new Object[]{this, fluidInstanceConfig});
            return;
        }
        this.mFluidInstanceConfig.append(fluidInstanceConfig);
        ISceneConfigService iSceneConfigService = (ISceneConfigService) getService(ISceneConfigService.class);
        if (iSceneConfigService == null) {
            return;
        }
        iSceneConfigService.refreshInstanceConfig(this.mFluidInstanceConfig);
    }

    @Override // tb.snd
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
        } else {
            this.mILifecycleService.onCreate();
        }
    }

    @Override // tb.snd
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
        } else {
            this.mILifecycleService.onStart();
        }
    }

    @Override // tb.snd
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
        } else {
            this.mILifecycleService.onResume();
        }
    }

    @Override // tb.snd
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
        } else {
            this.mILifecycleService.onPause();
        }
    }

    @Override // tb.snd
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
        } else {
            this.mILifecycleService.onStop();
        }
    }

    @Override // tb.snd
    public void cI_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6eaece0", new Object[]{this});
        } else if (isDestroyed()) {
            spz.c(TAG, "实例已销毁，无需重复执行 onDestroy");
        } else {
            this.mILifecycleService.cI_();
            destroyServices(this.mFluidServiceManager);
            FluidSDK.removeFluidInstance(this.mFluidInstanceConfig.getBizName());
            this.mIsDestroyed = true;
        }
    }

    @Override // com.taobao.android.fluid.core.FluidInstance
    public boolean isDestroyed() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d65bd1a", new Object[]{this})).booleanValue() : this.mIsDestroyed;
    }

    public void tryCreateRemoteService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2165abf", new Object[]{this});
            return;
        }
        spz.c(TAG, "tryCreateRemoteService");
        if (this.mFluidInstanceConfig.getFluidServiceRegistry() == null) {
            this.mFluidInstanceConfig.setFluidServiceRegistry(new c());
        }
        this.mFluidServiceManager.c(this, this.mFluidInstanceConfig.getFluidServiceRegistry());
    }

    private void createServices() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d2a9101", new Object[]{this});
            return;
        }
        spz.c(TAG, "创建服务开始");
        if (this.mFluidInstanceConfig.getFluidServiceRegistry() == null) {
            this.mFluidInstanceConfig.setFluidServiceRegistry(new c());
        }
        this.mFluidServiceManager.a(this, this.mFluidInstanceConfig.getFluidServiceRegistry());
        a fluidInstanceAnalysis = ((IAnalysisService) getService(IAnalysisService.class)).getFluidInstanceAnalysis();
        fluidInstanceAnalysis.a();
        fluidInstanceAnalysis.c(FluidInstanceAnalysis.Stage.CREATE_SERVICE.name());
        this.mILifecycleService = (ILifecycleService) getService(ILifecycleService.class);
        ((ISceneConfigService) getService(ISceneConfigService.class)).refreshInstanceConfig(this.mFluidInstanceConfig);
        ((ITrackService) getService(ITrackService.class)).setPageStartTime(this.mFluidContext);
        if (this.mFluidContext.getContext() instanceof Activity) {
            FluidContext fluidContext = this.mFluidContext;
            pio.a(fluidContext, (Activity) fluidContext.getContext());
        }
        this.mFluidServiceManager.a();
        fluidInstanceAnalysis.b(FluidInstanceAnalysis.Stage.CREATE_SERVICE.name());
        spz.c(TAG, "创建服务成功");
    }

    private void destroyServices(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d2b9213", new Object[]{this, gVar});
            return;
        }
        spz.c(TAG, "销毁服务开始");
        a fluidInstanceAnalysis = ((IAnalysisService) getService(IAnalysisService.class)).getFluidInstanceAnalysis();
        fluidInstanceAnalysis.c(FluidInstanceAnalysis.Stage.FIST_CARD.name());
        gVar.b();
        fluidInstanceAnalysis.b(FluidInstanceAnalysis.Stage.FIST_CARD.name());
        fluidInstanceAnalysis.a("succeed");
        spz.c(TAG, "销毁服务成功");
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        String bizName = getInstanceConfig() == null ? "" : getInstanceConfig().getBizName();
        return riy.ARRAY_START_STR + bizName + "_" + getInstanceId() + riy.ARRAY_END_STR;
    }
}
