package com.taobao.android.fluid.framework.lifecycle;

import android.app.Activity;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.core.exception.FluidException;
import com.taobao.android.fluid.core.f;
import com.taobao.android.fluid.framework.hostcontainer.pageinterface.IHostPageInterfaceService;
import com.taobao.android.fluid.framework.hostcontainer.tnode.IHostTNodeService;
import com.taobao.search.common.util.i;
import com.taobao.tao.flexbox.layoutmanager.adapter.a;
import com.uc.webview.export.media.MessageID;
import tb.kge;
import tb.smz;
import tb.snd;
import tb.sne;
import tb.spz;

/* loaded from: classes5.dex */
public final class LifecycleService implements ILifecycleService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "LifecycleService";
    private final FluidContext mFluidContext;
    private final f<snd> mPageObserverList = new f<>();
    private final f<sne> mTabObserverList = new f<>();
    private int mPageState = -1;
    private final smz mLifecycleServiceConfig = new smz();

    static {
        kge.a(148750073);
        kge.a(2025671974);
    }

    @Override // com.taobao.android.fluid.core.FluidService
    public void onCreateService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("486f8601", new Object[]{this});
        }
    }

    @Override // com.taobao.android.fluid.core.FluidService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
        }
    }

    public LifecycleService(FluidContext fluidContext) {
        this.mFluidContext = fluidContext;
    }

    @Override // tb.snc
    public void addPageLifecycleListener(snd sndVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ae37a3c", new Object[]{this, sndVar});
        } else if (sndVar == null) {
        } else {
            this.mPageObserverList.a(sndVar);
            spz.c(TAG, "IPageLifecycle 监听器注册成功： " + sndVar);
        }
    }

    @Override // tb.snc
    public void addPageLifecycleListener(snd.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ec2d35f", new Object[]{this, aVar});
        } else if (aVar == null) {
        } else {
            this.mPageObserverList.a(aVar);
            spz.c(TAG, "IPageLifecycle 监听器注册成功： " + aVar);
        }
    }

    @Override // tb.snc
    public void addTabLifecycleListener(sne sneVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a55210b7", new Object[]{this, sneVar});
        } else if (sneVar == null) {
        } else {
            this.mTabObserverList.a(sneVar);
            spz.c(TAG, "ITabLifecycle 监听器注册成功： " + sneVar);
        }
    }

    public void removePageLifecycleListener(snd.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adff09c", new Object[]{this, aVar});
        } else if (aVar == null) {
        } else {
            this.mPageObserverList.c(aVar);
            spz.c(TAG, "IPageLifecycle 监听器移除成功： " + aVar);
        }
    }

    @Override // tb.snc
    public void removePageLifecycleListener(snd sndVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9530c2b9", new Object[]{this, sndVar});
        } else if (sndVar == null) {
        } else {
            this.mPageObserverList.c(sndVar);
            spz.c(TAG, "IPageLifecycle 监听器移除成功： " + sndVar);
        }
    }

    public void removeTabLifecycleListener(sne sneVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a62b449a", new Object[]{this, sneVar});
        } else if (sneVar == null) {
        } else {
            this.mTabObserverList.c(sneVar);
            spz.c(TAG, "ITabLifecycle 监听器移除成功： " + sneVar);
        }
    }

    @Override // com.taobao.android.fluid.framework.lifecycle.ILifecycleService
    public smz getConfig() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (smz) ipChange.ipc$dispatch("febcb187", new Object[]{this}) : this.mLifecycleServiceConfig;
    }

    @Override // com.taobao.android.fluid.framework.lifecycle.ILifecycleService
    public int getPageState() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("450b8306", new Object[]{this})).intValue() : this.mPageState;
    }

    @Override // com.taobao.android.fluid.framework.lifecycle.ILifecycleService
    public boolean isFinish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c5fb8c68", new Object[]{this})).booleanValue();
        }
        return (((IHostPageInterfaceService) this.mFluidContext.getService(IHostPageInterfaceService.class)).getPageInterface() != null && ((IHostPageInterfaceService) this.mFluidContext.getService(IHostPageInterfaceService.class)).getPageInterface().isFinishing()) || ((((IHostTNodeService) this.mFluidContext.getService(IHostTNodeService.class)).getTNode() == null || ((IHostTNodeService) this.mFluidContext.getService(IHostTNodeService.class)).getTNode().k() == null || !(((IHostTNodeService) this.mFluidContext.getService(IHostTNodeService.class)).getTNode().k().g() instanceof com.taobao.tao.flexbox.layoutmanager.container.f)) ? false : ((com.taobao.tao.flexbox.layoutmanager.container.f) ((IHostTNodeService) this.mFluidContext.getService(IHostTNodeService.class)).getTNode().k().g()).isFinishing()) || ((this.mFluidContext.getContext() instanceof Activity) && ((Activity) this.mFluidContext.getContext()).isFinishing());
    }

    @Override // com.taobao.android.fluid.framework.lifecycle.ILifecycleService
    public boolean isNavigationBarVisible() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a835468", new Object[]{this})).booleanValue() : a.a().b().g();
    }

    @Override // tb.snd
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
            return;
        }
        spz.c(TAG, "IPageLifecycle 回调方法 onCreate 被执行, 监听者数量：" + this.mPageObserverList.b());
        this.mPageState = 0;
        for (snd sndVar : this.mPageObserverList.a()) {
            try {
                sndVar.onCreate();
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.mFluidContext, sndVar, i.b.MEASURE_ONCREATE, e);
            }
        }
    }

    @Override // tb.snd
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        spz.c(TAG, "IPageLifecycle 回调方法 onStart 被执行 监听者数量：" + this.mPageObserverList.b());
        this.mPageState = 1;
        for (snd sndVar : this.mPageObserverList.a()) {
            try {
                sndVar.onStart();
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.mFluidContext, sndVar, "onStart", e);
            }
        }
    }

    @Override // tb.snd
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        spz.c(TAG, "IPageLifecycle 回调方法 onResume 被执行 监听者数量：" + this.mPageObserverList.b());
        this.mPageState = 2;
        for (snd sndVar : this.mPageObserverList.a()) {
            try {
                sndVar.onResume();
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.mFluidContext, sndVar, "onResume", e);
            }
        }
    }

    @Override // tb.snd
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        spz.c(TAG, "IPageLifecycle 回调方法 onPause 被执行 监听者数量：" + this.mPageObserverList.b());
        this.mPageState = 3;
        for (snd sndVar : this.mPageObserverList.a()) {
            try {
                sndVar.onPause();
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.mFluidContext, sndVar, "onPause", e);
            }
        }
    }

    @Override // tb.snd
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        spz.c(TAG, "IPageLifecycle 回调方法 onStop 被执行 监听者数量：" + this.mPageObserverList.b());
        this.mPageState = 4;
        for (snd sndVar : this.mPageObserverList.a()) {
            try {
                sndVar.onStop();
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.mFluidContext, sndVar, MessageID.onStop, e);
            }
        }
    }

    @Override // tb.snd
    public void cI_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6eaece0", new Object[]{this});
            return;
        }
        spz.c(TAG, "IPageLifecycle 回调方法 onDestroy 被执行 监听者数量：" + this.mPageObserverList.b());
        this.mPageState = 5;
        for (snd sndVar : this.mPageObserverList.a()) {
            try {
                sndVar.cI_();
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.mFluidContext, sndVar, MessageID.onDestroy, e);
            }
        }
        com.taobao.android.fluid.framework.deprecated.message.module.notify.a.a().a(this.mFluidContext.getContext());
    }

    @Override // tb.sne
    public void onTabSelected() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6ab5df8", new Object[]{this});
            return;
        }
        spz.c(TAG, "ITabLifecycle 回调方法 onTabSelected 被执行");
        for (sne sneVar : this.mTabObserverList.a()) {
            try {
                sneVar.onTabSelected();
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.mFluidContext, sneVar, "onTabSelected", e);
            }
        }
    }

    @Override // tb.sne
    public void onTabUnSelected() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15a6e5b1", new Object[]{this});
            return;
        }
        spz.c(TAG, "ITabLifecycle 回调方法 onTabUnSelected 被执行");
        for (sne sneVar : this.mTabObserverList.a()) {
            try {
                sneVar.onTabUnSelected();
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.mFluidContext, sneVar, "onTabUnSelected", e);
            }
        }
    }
}
