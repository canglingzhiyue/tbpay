package com.taobao.android.fluid.framework.back;

import android.app.Activity;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.hostcontainer.pageinterface.IHostPageInterfaceService;
import com.taobao.android.fluid.framework.lifecycle.ILifecycleService;
import com.taobao.android.layoutmanager.container.a;
import com.taobao.android.layoutmanager.container.containerlifecycle.GestureLayout;
import tb.kge;
import tb.pld;
import tb.ple;
import tb.pln;
import tb.shs;
import tb.spy;
import tb.spz;

/* loaded from: classes5.dex */
public class BackEventService implements IBackEventService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "BackEventService";
    private final pln mBackEventManager;
    private pld mBackInterceptHelper;
    private ple mBackKeyEventDetector;
    private final FluidContext mFluidContext;
    private IHostPageInterfaceService mHostPageInterfaceService;
    private ILifecycleService mLifecycleService;

    static {
        kge.a(1144818945);
        kge.a(-1147994132);
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

    @Override // tb.snd
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
        }
    }

    @Override // tb.snd
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
        }
    }

    @Override // tb.snd
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
        }
    }

    @Override // tb.snd
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
        }
    }

    public static /* synthetic */ pld access$000(BackEventService backEventService) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (pld) ipChange.ipc$dispatch("cfe11df9", new Object[]{backEventService}) : backEventService.mBackInterceptHelper;
    }

    public static /* synthetic */ FluidContext access$100(BackEventService backEventService) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FluidContext) ipChange.ipc$dispatch("7fcd282", new Object[]{backEventService}) : backEventService.mFluidContext;
    }

    public BackEventService(FluidContext fluidContext) {
        this.mFluidContext = fluidContext;
        this.mBackEventManager = new pln(fluidContext);
    }

    @Override // com.taobao.android.fluid.framework.back.IBackEventService
    public void acceptEnableInterceptBackMsg(spy spyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("226498fe", new Object[]{this, spyVar});
            return;
        }
        pld pldVar = this.mBackInterceptHelper;
        if (pldVar == null) {
            return;
        }
        pldVar.a(spyVar);
    }

    @Override // com.taobao.android.fluid.framework.back.IBackEventService
    public ple getBackKeyEventDetector() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ple) ipChange.ipc$dispatch("9b3560b8", new Object[]{this}) : this.mBackKeyEventDetector;
    }

    @Override // com.taobao.android.fluid.framework.back.IBackEventService
    public void handleExitFullPage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a76841cb", new Object[]{this});
        } else if (this.mHostPageInterfaceService.getPageInterface() != null) {
            this.mHostPageInterfaceService.getPageInterface().onBackButtonClick();
        } else if (!(this.mFluidContext.getContext() instanceof Activity)) {
        } else {
            ((Activity) this.mFluidContext.getContext()).finish();
        }
    }

    @Override // com.taobao.android.fluid.framework.back.IBackEventService
    public void setBackInterceptListener(GestureLayout gestureLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f29ec833", new Object[]{this, gestureLayout});
        } else {
            gestureLayout.setBackInterceptListener(new a() { // from class: com.taobao.android.fluid.framework.back.BackEventService.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.layoutmanager.container.a
                public boolean a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
                    }
                    if (BackEventService.access$000(BackEventService.this) == null) {
                        return false;
                    }
                    boolean a2 = BackEventService.access$000(BackEventService.this).a("swipe");
                    spz.c(BackEventService.TAG, "滑动拦截判断 enableInterceptBack=" + a2);
                    return a2;
                }

                @Override // com.taobao.android.layoutmanager.container.a
                public void b() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("57a83e9", new Object[]{this});
                    } else if (BackEventService.access$000(BackEventService.this) == null) {
                    } else {
                        spz.c(BackEventService.TAG, "滑动拦截 sendBackClickMsg");
                        BackEventService.access$000(BackEventService.this).a(BackEventService.access$100(BackEventService.this), "swipe");
                    }
                }
            });
        }
    }

    @Override // com.taobao.android.fluid.framework.back.IBackEventService
    public boolean tryToInterceptBack() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("404f5de", new Object[]{this})).booleanValue();
        }
        pld pldVar = this.mBackInterceptHelper;
        if (pldVar == null || !pldVar.a("click")) {
            return false;
        }
        spz.c(TAG, "点击/系统返回拦截 sendBackClickMsg");
        this.mBackInterceptHelper.a(this.mFluidContext, "click");
        return true;
    }

    @Override // tb.psv
    public void addBackEventListener(shs shsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6f10a9f", new Object[]{this, shsVar});
        } else {
            this.mBackEventManager.addBackEventListener(shsVar);
        }
    }

    public void removeBackEventListener(shs shsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6188199c", new Object[]{this, shsVar});
        } else {
            this.mBackEventManager.a(shsVar);
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
        this.mHostPageInterfaceService = (IHostPageInterfaceService) this.mFluidContext.getService(IHostPageInterfaceService.class);
        this.mLifecycleService.addPageLifecycleListener(this);
        this.mBackInterceptHelper = new pld();
        this.mBackKeyEventDetector = new ple();
    }

    @Override // tb.shs
    public void onBackClick() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ce9d949", new Object[]{this});
        } else {
            this.mBackEventManager.onBackClick();
        }
    }

    @Override // tb.snd
    public void cI_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6eaece0", new Object[]{this});
        } else {
            this.mBackKeyEventDetector.a();
        }
    }
}
