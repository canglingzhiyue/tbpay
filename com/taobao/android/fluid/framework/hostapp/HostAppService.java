package com.taobao.android.fluid.framework.hostapp;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.core.exception.FluidException;
import com.taobao.android.fluid.framework.container.IContainerService;
import com.taobao.android.fluid.framework.lifecycle.ILifecycleService;
import com.taobao.android.layoutmanager.module.NavigationTabModule;
import com.taobao.tao.flexbox.layoutmanager.adapter.a;
import tb.kge;
import tb.smv;
import tb.snd;
import tb.spj;
import tb.spz;

/* loaded from: classes5.dex */
public final class HostAppService implements IHostAppService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "HostAppService";
    private IContainerService mContainerService;
    private int mCurrentTabIndex;
    private final FluidContext mFluidContext;
    private final smv mHostAppListenersManager;
    private boolean mIsNavigationStatusListenerRegistered;
    private boolean mIsTabBarHide;
    private ILifecycleService mLifecycleService;
    private NavigationTabModule.a mNavigationStatusListener;
    private int mTabIndex;

    static {
        kge.a(1080174075);
        kge.a(-1053101850);
    }

    @Override // com.taobao.android.fluid.core.FluidService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
        }
    }

    public static /* synthetic */ boolean access$002(HostAppService hostAppService, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f2043eb", new Object[]{hostAppService, new Boolean(z)})).booleanValue();
        }
        hostAppService.mIsTabBarHide = z;
        return z;
    }

    public static /* synthetic */ smv access$100(HostAppService hostAppService) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (smv) ipChange.ipc$dispatch("34c7fbfc", new Object[]{hostAppService}) : hostAppService.mHostAppListenersManager;
    }

    public static /* synthetic */ void access$200(HostAppService hostAppService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("568d890d", new Object[]{hostAppService});
        } else {
            hostAppService.addNavigationShowHideStatusListener();
        }
    }

    public static /* synthetic */ void access$300(HostAppService hostAppService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0bd112c", new Object[]{hostAppService});
        } else {
            hostAppService.removeNavigationShowHideStatusListener();
        }
    }

    public HostAppService(FluidContext fluidContext) {
        this.mFluidContext = fluidContext;
        this.mHostAppListenersManager = new smv(fluidContext);
    }

    @Override // tb.smy
    public void addNavigationShowHideStatusListener(NavigationTabModule.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ce4711a", new Object[]{this, aVar});
        } else {
            this.mHostAppListenersManager.addNavigationShowHideStatusListener(aVar);
        }
    }

    public void removeNavigationShowHideStatusListener(NavigationTabModule.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8392657", new Object[]{this, aVar});
        } else {
            this.mHostAppListenersManager.removeNavigationShowHideStatusListener(aVar);
        }
    }

    @Override // com.taobao.android.fluid.framework.hostapp.IHostAppService
    public int getCurrentTabIndex() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("66e38d1a", new Object[]{this})).intValue() : this.mCurrentTabIndex;
    }

    @Override // com.taobao.android.fluid.framework.hostapp.IHostAppService
    public int getTabIndex() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("13749ead", new Object[]{this})).intValue() : this.mTabIndex;
    }

    @Override // com.taobao.android.fluid.framework.hostapp.IHostAppService
    public boolean isTBMainActivity(Context context) {
        ViewGroup f;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("526df805", new Object[]{this, context})).booleanValue() : (context instanceof Activity) && (f = a.a().b().f()) != null && f.getContext() == context;
    }

    @Override // com.taobao.android.fluid.framework.hostapp.IHostAppService
    public boolean isTabBarHide() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e4215ef5", new Object[]{this})).booleanValue() : this.mIsTabBarHide;
    }

    @Override // com.taobao.android.fluid.framework.hostapp.IHostAppService
    public boolean isTaoBaoApp(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6f9b619c", new Object[]{this, context})).booleanValue() : context.getPackageName().equals("com.taobao.taobao");
    }

    @Override // com.taobao.android.fluid.core.FluidService
    public void onCreateService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("486f8601", new Object[]{this});
            return;
        }
        this.mIsTabBarHide = !a.a().b().g();
        spz.c(TAG, "onCreateService 初始化底部状态 mIsTabBarHide=" + this.mIsTabBarHide);
        this.mTabIndex = 0;
        this.mCurrentTabIndex = 0;
        this.mLifecycleService = (ILifecycleService) this.mFluidContext.getService(ILifecycleService.class);
        if (this.mLifecycleService == null) {
            FluidException.throwServiceNotFoundException(this.mFluidContext, ILifecycleService.class);
        }
        this.mContainerService = (IContainerService) this.mFluidContext.getService(IContainerService.class);
        if (this.mContainerService == null) {
            FluidException.throwServiceNotFoundException(this.mFluidContext, IContainerService.class);
        }
        observePageLifecycle();
    }

    private void addNavigationShowHideStatusListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("419a8601", new Object[]{this});
        } else if (this.mIsNavigationStatusListenerRegistered) {
        } else {
            if (spj.d(this.mFluidContext) && isTBMainActivity(this.mFluidContext.getContext())) {
                this.mNavigationStatusListener = new NavigationTabModule.a() { // from class: com.taobao.android.fluid.framework.hostapp.HostAppService.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.android.layoutmanager.module.NavigationTabModule.a
                    public void a(boolean z) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
                            return;
                        }
                        spz.c(HostAppService.TAG, "onNavigationShowHideStatusChanged 底部状态变化 isHideStatus=" + z);
                        HostAppService.access$002(HostAppService.this, z);
                        HostAppService.access$100(HostAppService.this).a(z);
                    }
                };
                this.mIsTabBarHide = !a.a().b().g();
                spz.c(TAG, "addNavigationShowHideStatusListener 初始化底部状态 mIsTabBarHide=" + this.mIsTabBarHide);
                spz.c(TAG, "addNavigationShowHideStatusListener 添加底部状态监听");
                NavigationTabModule.registerNavigationShowHideStatusListener(this.mNavigationStatusListener);
            }
            this.mIsNavigationStatusListenerRegistered = true;
        }
    }

    private void observePageLifecycle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d11a9ee6", new Object[]{this});
        } else {
            this.mLifecycleService.addPageLifecycleListener(new snd.a() { // from class: com.taobao.android.fluid.framework.hostapp.HostAppService.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.snd.a, tb.snd
                public void onCreate() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("18a7a6c2", new Object[]{this});
                    } else {
                        HostAppService.access$200(HostAppService.this);
                    }
                }

                @Override // tb.snd.a, tb.snd
                public void cI_() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f6eaece0", new Object[]{this});
                    } else {
                        HostAppService.access$300(HostAppService.this);
                    }
                }
            });
        }
    }

    private void removeNavigationShowHideStatusListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9211064", new Object[]{this});
        } else if (!spj.d(this.mFluidContext) || !isTBMainActivity(this.mFluidContext.getContext())) {
        } else {
            NavigationTabModule.unregisterNavigationShowHideStatusListener(this.mNavigationStatusListener);
        }
    }
}
