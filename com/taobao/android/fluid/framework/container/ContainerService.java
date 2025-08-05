package com.taobao.android.fluid.framework.container;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.RotateAnimation;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.core.FluidInstance;
import com.taobao.android.fluid.core.FluidInstanceConfig;
import com.taobao.android.fluid.core.exception.FluidException;
import com.taobao.android.fluid.framework.analysis.IAnalysisService;
import com.taobao.android.fluid.framework.analysis.analysis.FluidInstanceAnalysis;
import com.taobao.android.fluid.framework.analysis.analysis.a;
import com.taobao.android.fluid.framework.card.cards.video.layer.seekbar.view.SeekBarScrollInterceptView;
import com.taobao.android.fluid.framework.hostcontainer.tnode.IHostTNodeService;
import com.taobao.android.fluid.framework.lifecycle.ILifecycleService;
import com.taobao.android.fluid.framework.scene.ISceneConfigService;
import com.taobao.tbmobilesmartapi.collector.DefaultGestureCollectorDelegateLayout;
import java.util.List;
import java.util.Map;
import tb.hjj;
import tb.iys;
import tb.kge;
import tb.oeb;
import tb.psw;
import tb.sjv;
import tb.sjw;
import tb.sjz;
import tb.ska;
import tb.skb;
import tb.skc;
import tb.skd;
import tb.ske;
import tb.skf;
import tb.skg;
import tb.sln;
import tb.slt;
import tb.spj;
import tb.spz;

/* loaded from: classes5.dex */
public final class ContainerService implements IContainerService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "ContainerService";
    private final sjw mContainerListenerManager;
    private skg mContainerRenderManager;
    private final sjv mContainerServiceConfig;
    private final FluidContext mFluidContext;
    private ILifecycleService mLifecycleService;
    private iys mSeekBarScrollInterceptManager;

    static {
        kge.a(1393708491);
        kge.a(-1622393466);
    }

    @Override // tb.snd
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
        }
    }

    @Override // com.taobao.android.fluid.core.FluidService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
        }
    }

    public ContainerService(FluidContext fluidContext) {
        this.mFluidContext = fluidContext;
        this.mContainerListenerManager = new sjw(this.mFluidContext);
        this.mContainerServiceConfig = new sjv(this.mFluidContext);
    }

    @Override // tb.sjy
    public void addCardRenderListener(hjj hjjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6dce0ea", new Object[]{this, hjjVar});
        } else {
            this.mContainerListenerManager.addCardRenderListener(hjjVar);
        }
    }

    @Override // tb.sjy
    public void addFirstCardRenderListener(ska skaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8639c957", new Object[]{this, skaVar});
        } else {
            this.mContainerListenerManager.addFirstCardRenderListener(skaVar);
        }
    }

    public void addHorizontalSlideListener(sjz sjzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ffc05f4", new Object[]{this, sjzVar});
        } else {
            this.mContainerListenerManager.a(sjzVar);
        }
    }

    @Override // tb.sjy
    public void addRenderLifecycleListener(skc skcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e0095f3", new Object[]{this, skcVar});
        } else {
            this.mContainerListenerManager.addRenderLifecycleListener(skcVar);
        }
    }

    @Override // tb.sjy
    public void addSizedChangeListener(ske skeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4926450", new Object[]{this, skeVar});
        } else {
            this.mContainerListenerManager.addSizedChangeListener(skeVar);
        }
    }

    @Override // tb.hjj
    public void onCardRenderFailed(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f332645", new Object[]{this, pswVar});
        } else {
            this.mContainerListenerManager.onCardRenderFailed(pswVar);
        }
    }

    @Override // tb.hjj
    public void onCardRenderSuccess(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94f433e1", new Object[]{this, pswVar});
        } else {
            this.mContainerListenerManager.onCardRenderSuccess(pswVar);
        }
    }

    public void removeCardRenderListener(hjj hjjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f27b18d", new Object[]{this, hjjVar});
        } else {
            this.mContainerListenerManager.a(hjjVar);
        }
    }

    public void removeFirstCardRenderListener(ska skaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4256e694", new Object[]{this, skaVar});
        } else {
            this.mContainerListenerManager.a(skaVar);
        }
    }

    public void removeHorizontalSlideListener(sjz sjzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c192331", new Object[]{this, sjzVar});
        } else {
            this.mContainerListenerManager.b(sjzVar);
        }
    }

    public void removeRenderLifecycleListener(skc skcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a1db330", new Object[]{this, skcVar});
        } else {
            this.mContainerListenerManager.a(skcVar);
        }
    }

    public void removeSizedChangeListener(ske skeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5a1a80d", new Object[]{this, skeVar});
        } else {
            this.mContainerListenerManager.a(skeVar);
        }
    }

    public void addPageBackListener(skb skbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("169707d8", new Object[]{this, skbVar});
        } else {
            this.mContainerListenerManager.a(skbVar);
        }
    }

    public void removePageBackListener(skb skbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b93a53b", new Object[]{this, skbVar});
        } else {
            this.mContainerListenerManager.b(skbVar);
        }
    }

    public void attachSeekBarScrollInterceptView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f6ee2eb", new Object[]{this});
        } else {
            this.mSeekBarScrollInterceptManager.b();
        }
    }

    public void detachSeekBarScrollInterceptView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5794fb9", new Object[]{this});
        } else {
            this.mSeekBarScrollInterceptManager.c();
        }
    }

    @Override // tb.iyr
    public SeekBarScrollInterceptView getScrollInterceptView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SeekBarScrollInterceptView) ipChange.ipc$dispatch("fbca515b", new Object[]{this}) : this.mSeekBarScrollInterceptManager.getScrollInterceptView();
    }

    public void initSeekBarInterceptView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("971e0383", new Object[]{this});
        } else {
            this.mSeekBarScrollInterceptManager.a();
        }
    }

    @Override // tb.skh
    public int getActionBarHeight() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e4e99cc8", new Object[]{this})).intValue() : this.mContainerRenderManager.b();
    }

    @Override // tb.skh
    public int getOldActionBarHeight() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("60f7394d", new Object[]{this})).intValue() : this.mContainerRenderManager.t();
    }

    @Override // tb.skh
    public ViewStub getAlbumDetailStub() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewStub) ipChange.ipc$dispatch("d0fd0b33", new Object[]{this}) : this.mContainerRenderManager.c();
    }

    @Override // tb.skh
    public int getAndSetTopLayoutVisibility(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a869bbf", new Object[]{this, new Integer(i)})).intValue() : this.mContainerRenderManager.a(i);
    }

    @Override // tb.skh
    public ViewGroup getAnimLayout() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("ac1ca7d", new Object[]{this}) : this.mContainerRenderManager.d();
    }

    @Override // tb.skh
    public skf getContainer() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (skf) ipChange.ipc$dispatch("7e022626", new Object[]{this}) : this.mContainerRenderManager.e();
    }

    @Override // tb.skh
    public ViewGroup getContentView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("5180f326", new Object[]{this}) : this.mContainerRenderManager.f();
    }

    @Override // tb.skh
    public ViewStub getGoodListStub() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewStub) ipChange.ipc$dispatch("5c6546fa", new Object[]{this}) : this.mContainerRenderManager.g();
    }

    public View getLoading() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("cf789d8f", new Object[]{this}) : this.mContainerRenderManager.h();
    }

    @Override // tb.skh
    public DefaultGestureCollectorDelegateLayout getMainContentView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DefaultGestureCollectorDelegateLayout) ipChange.ipc$dispatch("c86db4d0", new Object[]{this}) : this.mContainerRenderManager.i();
    }

    @Override // tb.skh
    public View getMoreButton() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("4c38e826", new Object[]{this}) : this.mContainerRenderManager.j();
    }

    @Override // tb.skh
    public String getRawId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d8a86f6c", new Object[]{this}) : this.mContainerRenderManager.k();
    }

    @Override // tb.skh
    public int getWindowHeight() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f20b1da7", new Object[]{this})).intValue() : this.mContainerRenderManager.l();
    }

    @Override // tb.skh
    public int getWindowWidth() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5ca3e2fa", new Object[]{this})).intValue() : this.mContainerRenderManager.m();
    }

    @Override // tb.skh
    public void hideCacheLoading() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c28d5843", new Object[]{this});
        } else {
            this.mContainerRenderManager.n();
        }
    }

    @Override // tb.skh
    public void hideErrorView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1b100b2", new Object[]{this});
        } else {
            this.mContainerRenderManager.o();
        }
    }

    @Override // tb.skh
    public void hideExposedLoadingLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d32bd72f", new Object[]{this});
        } else {
            this.mContainerRenderManager.p();
        }
    }

    @Override // tb.skh
    public void hideLoading() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aee4b521", new Object[]{this});
        } else {
            this.mContainerRenderManager.q();
        }
    }

    @Override // tb.skh
    public void initErrorAndRefresh() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f904bc83", new Object[]{this});
        } else {
            this.mContainerRenderManager.r();
        }
    }

    @Override // tb.skh
    public boolean isHasPreRender() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4223cef4", new Object[]{this})).booleanValue() : this.mContainerRenderManager.u();
    }

    @Override // tb.skh
    public boolean isHighActionbar() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d190ed9c", new Object[]{this})).booleanValue() : this.mContainerRenderManager.v();
    }

    @Override // tb.skh
    public boolean isLoading() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9e10043d", new Object[]{this})).booleanValue() : this.mContainerRenderManager.w();
    }

    @Override // tb.skh
    public boolean isTab3GuideShoppingVersion() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2d8229e7", new Object[]{this})).booleanValue() : this.mContainerRenderManager.x();
    }

    @Override // tb.skh
    public void preRender() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4294ea20", new Object[]{this});
        } else {
            this.mContainerRenderManager.y();
        }
    }

    @Override // tb.skh
    public void refresh() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad3d31e2", new Object[]{this});
        } else {
            this.mContainerRenderManager.z();
        }
    }

    @Override // tb.skh
    public void refresh(Map map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e9b75d1", new Object[]{this, map, new Boolean(z)});
        } else {
            this.mContainerRenderManager.a(map, z);
        }
    }

    @Override // tb.skh
    public void refresh(Map map, boolean z, boolean z2, boolean z3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5aba011", new Object[]{this, map, new Boolean(z), new Boolean(z2), new Boolean(z3)});
        } else {
            this.mContainerRenderManager.a(map, z, z2, z3);
        }
    }

    @Override // tb.skh
    public void refreshWithCallback(skd skdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("226b4c11", new Object[]{this, skdVar});
        } else {
            this.mContainerRenderManager.a(skdVar);
        }
    }

    @Override // tb.skh
    public void renderContainer(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdd4d976", new Object[]{this, context});
            return;
        }
        spz.c("ContainerService", "开始渲染容器");
        boolean z = context instanceof Activity;
        if (!z) {
            FluidException.throwException(this.mFluidContext, FluidInstance.INSTANCE_ANDROID_CONTEXT_NOT_ACTIVITY);
            return;
        }
        a fluidInstanceAnalysis = ((IAnalysisService) this.mFluidContext.getService(IAnalysisService.class)).getFluidInstanceAnalysis();
        fluidInstanceAnalysis.c(FluidInstanceAnalysis.Stage.CREATE_CONTAINER.name());
        this.mContainerListenerManager.c();
        ((IHostTNodeService) this.mFluidContext.getService(IHostTNodeService.class)).createSharedTNodeEngine();
        spz.c("ContainerService", "FluidContext 中的 Context: " + this.mFluidContext.getContext() + "渲染传入的 Context: " + context);
        if (!(this.mFluidContext.getContext() instanceof Activity) && z) {
            spz.c("ContainerService", "FluidContext 中的 Context 为 Application，更新为 Activity");
            this.mFluidContext.updateInstanceConfig(FluidInstanceConfig.a.a().a(context).b());
        }
        this.mContainerRenderManager.a(context);
        fluidInstanceAnalysis.b(FluidInstanceAnalysis.Stage.CREATE_CONTAINER.name());
    }

    @Override // tb.skh
    public void setContainerSize(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81dfd207", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            this.mContainerRenderManager.a(i, i2);
        }
    }

    @Override // tb.skh
    public void setLockedTouchEvent(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf9e29c6", new Object[]{this, new Boolean(z)});
        } else {
            this.mContainerRenderManager.b(z);
        }
    }

    @Override // tb.skh
    public void setPendingRunnable(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0e1f497", new Object[]{this, runnable});
        } else if (runnable == null) {
        } else {
            this.mContainerRenderManager.a(runnable);
        }
    }

    @Override // tb.skh
    public void setRotateAnimation(RotateAnimation rotateAnimation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32339d69", new Object[]{this, rotateAnimation});
        } else {
            this.mContainerRenderManager.a(rotateAnimation);
        }
    }

    @Override // tb.skh
    public void showExposedLoadingLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("529213ea", new Object[]{this});
        } else {
            this.mContainerRenderManager.B();
        }
    }

    @Override // tb.skh
    public void showNoPermissionError(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90aed65e", new Object[]{this, obj});
        } else {
            this.mContainerRenderManager.a(obj);
        }
    }

    @Override // tb.skh
    public void updateView(boolean z, List<com.taobao.android.fluid.framework.data.datamodel.a> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84720bd0", new Object[]{this, new Boolean(z), list});
        } else {
            this.mContainerRenderManager.a(z, list);
        }
    }

    @Override // tb.skh
    public boolean isFirstCardFromRefresh() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("408dd926", new Object[]{this})).booleanValue() : this.mContainerRenderManager.Q();
    }

    @Override // tb.skh
    public void setFirstCardFromRefresh(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ba95dba", new Object[]{this, new Boolean(z)});
        } else {
            this.mContainerRenderManager.c(z);
        }
    }

    @Override // com.taobao.android.fluid.framework.container.IContainerService
    public sjv getConfig() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (sjv) ipChange.ipc$dispatch("febca5c8", new Object[]{this}) : this.mContainerServiceConfig;
    }

    @Override // com.taobao.android.fluid.framework.container.IContainerService
    public boolean isFirstCardRenderSuccess() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("79973262", new Object[]{this})).booleanValue() : this.mContainerListenerManager.a();
    }

    @Override // com.taobao.android.fluid.framework.container.IContainerService
    public void renderContainerOnCreate(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f258a7b", new Object[]{this, context});
            return;
        }
        boolean enableTab3PreBuildController = enableTab3PreBuildController(((ISceneConfigService) this.mFluidContext.getService(ISceneConfigService.class)).getSessionExtParams().f());
        if (spj.d(this.mFluidContext) && enableTab3PreBuildController) {
            return;
        }
        renderContainer(context);
    }

    @Override // com.taobao.android.fluid.framework.container.IContainerService
    public void showTab3CacheHadExposedLoading(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abd316d", new Object[]{this, new Boolean(z)});
        } else if (z) {
            sentinelAnim();
        } else if (this.mFluidContext.getService(IContainerService.class) == null) {
        } else {
            ((IContainerService) this.mFluidContext.getService(IContainerService.class)).hideExposedLoadingLayout();
        }
    }

    @Override // tb.snd
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
        } else {
            this.mSeekBarScrollInterceptManager.b();
        }
    }

    @Override // tb.snd
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        this.mContainerRenderManager.a();
        this.mContainerRenderManager.S();
    }

    @Override // tb.snd
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
        } else if (this.mContainerServiceConfig.d() || !this.mContainerRenderManager.s()) {
        } else {
            this.mContainerServiceConfig.a(true);
            slt.a(this.mFluidContext);
        }
    }

    @Override // tb.snd
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
        } else {
            this.mSeekBarScrollInterceptManager.c();
        }
    }

    @Override // tb.snd
    public void cI_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6eaece0", new Object[]{this});
        } else {
            sln.a(this.mFluidContext, this.mContainerRenderManager.k());
        }
    }

    @Override // com.taobao.android.fluid.core.FluidService
    public void onCreateService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("486f8601", new Object[]{this});
            return;
        }
        this.mLifecycleService = (ILifecycleService) this.mFluidContext.getService(ILifecycleService.class);
        if (this.mLifecycleService == null) {
            FluidException.throwServiceNotFoundException(this.mFluidContext, ILifecycleService.class);
        }
        this.mLifecycleService.addPageLifecycleListener(this);
        this.mSeekBarScrollInterceptManager = new iys(this.mFluidContext);
        this.mContainerRenderManager = new skg(this.mFluidContext, this.mSeekBarScrollInterceptManager, this.mContainerListenerManager);
    }

    @Override // tb.ska
    public void onFirstCardRenderFailed(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9d76177", new Object[]{this, pswVar});
            return;
        }
        this.mContainerListenerManager.onFirstCardRenderFailed(pswVar);
        a fluidInstanceAnalysis = ((IAnalysisService) this.mFluidContext.getService(IAnalysisService.class)).getFluidInstanceAnalysis();
        fluidInstanceAnalysis.a(FluidInstanceAnalysis.Stage.FIST_CARD.name(), IContainerService.ERROR_CARD_FIRST_CARD_RENDER_FAILED);
        fluidInstanceAnalysis.a("failed");
        FluidException.throwException(this.mFluidContext, IContainerService.ERROR_CARD_FIRST_CARD_RENDER_FAILED);
    }

    @Override // tb.ska
    public void onFirstCardRenderSuccess(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ed75eef", new Object[]{this, pswVar});
            return;
        }
        this.mContainerListenerManager.onFirstCardRenderSuccess(pswVar);
        a fluidInstanceAnalysis = ((IAnalysisService) this.mFluidContext.getService(IAnalysisService.class)).getFluidInstanceAnalysis();
        fluidInstanceAnalysis.b(FluidInstanceAnalysis.Stage.FIST_CARD.name());
        fluidInstanceAnalysis.a("succeed");
    }

    private boolean enableTab3PreBuildController(boolean z) {
        IpChange ipChange = $ipChange;
        boolean z2 = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4e734369", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        if (z && oeb.a("ShortVideo.enableTab3PreBuildController", true)) {
            z2 = true;
        }
        spz.c("ContainerService", "PickPreloadControllerNew,enableTab3PreBuildController:" + z2 + ",isDefalutTab3:" + z);
        return z2;
    }

    private void sentinelAnim() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd197e5c", new Object[]{this});
            return;
        }
        spz.c("ContainerService", "PickPreloadControllerNew,sentinelAnim");
        if (!spj.b(this.mFluidContext) || !spj.d(this.mFluidContext) || this.mFluidContext.getService(IContainerService.class) == null) {
            return;
        }
        ((IContainerService) this.mFluidContext.getService(IContainerService.class)).showExposedLoadingLayout();
    }
}
