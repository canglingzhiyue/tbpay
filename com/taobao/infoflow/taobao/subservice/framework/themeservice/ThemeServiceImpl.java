package com.taobao.infoflow.taobao.subservice.framework.themeservice;

import android.content.Context;
import android.content.res.Configuration;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.subservice.biz.IFoldDeviceAndPadService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import com.taobao.infoflow.protocol.subservice.framework.IHostService;
import com.taobao.infoflow.protocol.subservice.framework.IMainLifecycleService;
import com.taobao.infoflow.protocol.subservice.framework.IThemeService;
import com.taobao.infoflow.taobao.subservice.framework.themeservice.impl.listener.a;
import tb.kge;
import tb.ljd;
import tb.ljs;
import tb.lkq;
import tb.lld;
import tb.lle;
import tb.lli;
import tb.lup;
import tb.lur;

/* loaded from: classes.dex */
public class ThemeServiceImpl implements IThemeService<FrameLayout> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean isCreateContainerFinish;
    private IContainerDataService.a mDataProcessListener;
    public ljs mInfoFlowContext;
    private volatile boolean mIsPreLoading;
    private IFoldDeviceAndPadService.a mScreenChangeListener;
    private lld mTabLifeCycle;
    private a mTbGlobalThemeSubscriber;
    private lup mThemeWaiter;
    private final a.InterfaceC0672a mThemeListener = new a.InterfaceC0672a() { // from class: com.taobao.infoflow.taobao.subservice.framework.themeservice.ThemeServiceImpl.4
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.infoflow.taobao.subservice.framework.themeservice.impl.listener.a.InterfaceC0672a
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else if (ThemeServiceImpl.access$000(ThemeServiceImpl.this) == null) {
            } else {
                ThemeServiceImpl.access$000(ThemeServiceImpl.this).b();
            }
        }
    };
    private final com.taobao.infoflow.core.subservice.framework.container.containerservice.a containerLifecycleRegister = new com.taobao.infoflow.core.subservice.framework.container.containerservice.a();

    static {
        kge.a(-1551609211);
        kge.a(1987488897);
    }

    public static /* synthetic */ lup access$000(ThemeServiceImpl themeServiceImpl) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (lup) ipChange.ipc$dispatch("bb55f0ba", new Object[]{themeServiceImpl}) : themeServiceImpl.mThemeWaiter;
    }

    public static /* synthetic */ boolean access$100(ThemeServiceImpl themeServiceImpl) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ca4b05a8", new Object[]{themeServiceImpl})).booleanValue() : themeServiceImpl.isCreateContainerFinish;
    }

    public static /* synthetic */ boolean access$200(ThemeServiceImpl themeServiceImpl) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("fec4847", new Object[]{themeServiceImpl})).booleanValue() : themeServiceImpl.mIsPreLoading;
    }

    public static /* synthetic */ int access$300(ThemeServiceImpl themeServiceImpl) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("558d8ad5", new Object[]{themeServiceImpl})).intValue() : themeServiceImpl.getMainContainerContainerBgViewId();
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onCreateService(ljs ljsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ceabc49c", new Object[]{this, ljsVar});
            return;
        }
        this.mInfoFlowContext = ljsVar;
        this.mThemeWaiter = new lup(ljsVar);
        initRegisterDataListener();
        initRegisterTabSelectListener();
        initRegisterScreenChangeListener();
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
            return;
        }
        this.mThemeWaiter.d();
        this.containerLifecycleRegister.a();
        unRegisterDataListener();
        unRegisterTabSelectListener();
        unRegisterScreenChangeListener();
    }

    @Override // tb.lkq
    /* renamed from: createContainer  reason: collision with other method in class */
    public FrameLayout mo1092createContainer(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("3756b2fd", new Object[]{this, context});
        }
        this.containerLifecycleRegister.a(context);
        FrameLayout a2 = this.mThemeWaiter.a(context);
        this.containerLifecycleRegister.c();
        a aVar = this.mTbGlobalThemeSubscriber;
        if (aVar != null) {
            aVar.a();
        }
        this.mTbGlobalThemeSubscriber = new a(this.mThemeListener);
        if (!this.mIsPreLoading) {
            this.mThemeWaiter.a();
        }
        this.isCreateContainerFinish = true;
        return a2;
    }

    @Override // tb.lkq
    public void destroyContainer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49a77eae", new Object[]{this});
            return;
        }
        a aVar = this.mTbGlobalThemeSubscriber;
        if (aVar != null) {
            aVar.a();
            this.mTbGlobalThemeSubscriber = null;
        }
        this.mThemeWaiter.c();
    }

    @Override // tb.lkq
    public void addOnContainerListener(lkq.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f3597dd", new Object[]{this, aVar});
        } else {
            this.containerLifecycleRegister.a(aVar);
        }
    }

    @Override // tb.lkq
    public void removeOnContainerListener(lkq.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8982e05a", new Object[]{this, aVar});
        } else {
            this.containerLifecycleRegister.b(aVar);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IThemeService
    public void setEnableCreateGlobalTheme(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0e32816", new Object[]{this, str});
            return;
        }
        lup lupVar = this.mThemeWaiter;
        if (lupVar == null) {
            return;
        }
        lupVar.a(str, new lur() { // from class: com.taobao.infoflow.taobao.subservice.framework.themeservice.ThemeServiceImpl.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.lur
            public JSONObject a() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (JSONObject) ipChange2.ipc$dispatch("709f7788", new Object[]{this}) : ThemeServiceImpl.this.getGlobalThemeConfig();
            }
        });
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IThemeService
    public void setGlobalThemeVisible(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a748e3f", new Object[]{this, new Boolean(z)});
            return;
        }
        lup lupVar = this.mThemeWaiter;
        if (lupVar == null) {
            return;
        }
        lupVar.a(z);
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IThemeService
    public void onFestivalRefresh() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0e05ceb", new Object[]{this});
            return;
        }
        lup lupVar = this.mThemeWaiter;
        if (lupVar == null) {
            return;
        }
        lupVar.f();
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IThemeService
    public void preCreateTheme() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5839d311", new Object[]{this});
            return;
        }
        this.mIsPreLoading = true;
        lup lupVar = this.mThemeWaiter;
        if (lupVar != null) {
            lupVar.a();
        }
        this.mIsPreLoading = false;
    }

    public JSONObject getGlobalThemeConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("ba4e74b9", new Object[]{this});
        }
        IHostService iHostService = (IHostService) this.mInfoFlowContext.a(IHostService.class);
        if (iHostService != null) {
            return iHostService.getInvokeCallback().e().a();
        }
        return null;
    }

    private void initRegisterDataListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e5909f8", new Object[]{this});
            return;
        }
        IContainerDataService iContainerDataService = (IContainerDataService) this.mInfoFlowContext.a(IContainerDataService.class);
        if (iContainerDataService == null) {
            return;
        }
        this.mDataProcessListener = createDataProcessListener();
        iContainerDataService.addDataProcessListener(this.mDataProcessListener);
    }

    private void unRegisterDataListener() {
        IContainerDataService.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d5e881", new Object[]{this});
            return;
        }
        IContainerDataService iContainerDataService = (IContainerDataService) this.mInfoFlowContext.a(IContainerDataService.class);
        if (iContainerDataService == null || (aVar = this.mDataProcessListener) == null) {
            return;
        }
        iContainerDataService.removeDataProcessListener(aVar);
    }

    private IContainerDataService.a createDataProcessListener() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IContainerDataService.a) ipChange.ipc$dispatch("a962c199", new Object[]{this}) : new IContainerDataService.a() { // from class: com.taobao.infoflow.taobao.subservice.framework.themeservice.ThemeServiceImpl.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.a
            public void a(lli lliVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f302f74f", new Object[]{this, lliVar});
                }
            }

            @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.a
            public void a(lli lliVar, IContainerDataModel iContainerDataModel) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("ce5cd68c", new Object[]{this, lliVar, iContainerDataModel});
                }
            }

            @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.a
            public void b(lli lliVar, IContainerDataModel iContainerDataModel) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("30b7ed6b", new Object[]{this, lliVar, iContainerDataModel});
                } else if (ThemeServiceImpl.access$000(ThemeServiceImpl.this) == null || !ThemeServiceImpl.access$100(ThemeServiceImpl.this)) {
                } else {
                    ljd.a().b(new Runnable() { // from class: com.taobao.infoflow.taobao.subservice.framework.themeservice.ThemeServiceImpl.2.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                            } else if (ThemeServiceImpl.access$200(ThemeServiceImpl.this)) {
                            } else {
                                ThemeServiceImpl.access$000(ThemeServiceImpl.this).a();
                            }
                        }
                    });
                }
            }
        };
    }

    private void initRegisterTabSelectListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc94f8b9", new Object[]{this});
            return;
        }
        IMainLifecycleService iMainLifecycleService = (IMainLifecycleService) this.mInfoFlowContext.a(IMainLifecycleService.class);
        if (iMainLifecycleService == null) {
            return;
        }
        lle tabLifeCycleRegister = iMainLifecycleService.getTabLifeCycleRegister();
        this.mTabLifeCycle = createTabLifeCycle();
        tabLifeCycleRegister.a(this.mTabLifeCycle);
    }

    private void unRegisterTabSelectListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("913ac7d0", new Object[]{this});
            return;
        }
        IMainLifecycleService iMainLifecycleService = (IMainLifecycleService) this.mInfoFlowContext.a(IMainLifecycleService.class);
        if (iMainLifecycleService == null) {
            return;
        }
        iMainLifecycleService.getTabLifeCycleRegister().b(this.mTabLifeCycle);
    }

    private lld createTabLifeCycle() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (lld) ipChange.ipc$dispatch("e91d5eca", new Object[]{this}) : new lld() { // from class: com.taobao.infoflow.taobao.subservice.framework.themeservice.ThemeServiceImpl.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.lld
            public void onPageScrolled(float f, int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7e3dde4", new Object[]{this, new Float(f), new Integer(i)});
                }
            }

            @Override // tb.lld
            public void onPageUnSelected() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("1dadaf89", new Object[]{this});
                }
            }

            @Override // tb.lld
            public void onPageSelected() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("90abdd0", new Object[]{this});
                } else if (ThemeServiceImpl.access$300(ThemeServiceImpl.this) == ThemeServiceImpl.access$000(ThemeServiceImpl.this).e()) {
                } else {
                    ljd.a().b(new Runnable() { // from class: com.taobao.infoflow.taobao.subservice.framework.themeservice.ThemeServiceImpl.3.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                ThemeServiceImpl.access$000(ThemeServiceImpl.this).a();
                            }
                        }
                    });
                }
            }
        };
    }

    private int getMainContainerContainerBgViewId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3d882c6e", new Object[]{this})).intValue();
        }
        IHostService iHostService = (IHostService) this.mInfoFlowContext.a(IHostService.class);
        if (iHostService != null) {
            return iHostService.getInvokeCallback().e().c();
        }
        return -1;
    }

    private void initRegisterScreenChangeListener() {
        IFoldDeviceAndPadService iFoldDeviceAndPadService;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9986b8a", new Object[]{this});
            return;
        }
        ljs ljsVar = this.mInfoFlowContext;
        if (ljsVar == null || (iFoldDeviceAndPadService = (IFoldDeviceAndPadService) ljsVar.a(IFoldDeviceAndPadService.class)) == null) {
            return;
        }
        this.mScreenChangeListener = new IFoldDeviceAndPadService.a() { // from class: com.taobao.infoflow.taobao.subservice.framework.themeservice.ThemeServiceImpl.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.infoflow.protocol.subservice.biz.IFoldDeviceAndPadService.a
            public void onScreenChanged(boolean z, boolean z2, Configuration configuration) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a5c77460", new Object[]{this, new Boolean(z), new Boolean(z2), configuration});
                } else if (ThemeServiceImpl.access$000(ThemeServiceImpl.this) == null) {
                } else {
                    ThemeServiceImpl.access$000(ThemeServiceImpl.this).g();
                }
            }
        };
        iFoldDeviceAndPadService.addOnScreenChangeListener(this.mScreenChangeListener);
    }

    private void unRegisterScreenChangeListener() {
        IFoldDeviceAndPadService iFoldDeviceAndPadService;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4f6b113", new Object[]{this});
            return;
        }
        ljs ljsVar = this.mInfoFlowContext;
        if (ljsVar == null || this.mScreenChangeListener == null || (iFoldDeviceAndPadService = (IFoldDeviceAndPadService) ljsVar.a(IFoldDeviceAndPadService.class)) == null) {
            return;
        }
        iFoldDeviceAndPadService.removeOnScreenChangeListener(this.mScreenChangeListener);
    }
}
