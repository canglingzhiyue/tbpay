package com.taobao.tao.infoflow.commonsubservice.tabappearservice;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.utils.j;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import com.taobao.infoflow.protocol.subservice.framework.IMainLifecycleService;
import com.taobao.tao.topmultitab.c;
import tb.kge;
import tb.ljs;
import tb.lld;

/* loaded from: classes.dex */
public class TabAppearServiceImpl implements ITabAppearService {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private ljs infoFlowContext;
    private boolean isLeave;
    private lld tabLifeCycle;

    static {
        kge.a(-160796397);
        kge.a(1619335884);
    }

    public static /* synthetic */ boolean access$000(TabAppearServiceImpl tabAppearServiceImpl) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f0d31437", new Object[]{tabAppearServiceImpl})).booleanValue() : tabAppearServiceImpl.isLeave;
    }

    public static /* synthetic */ boolean access$002(TabAppearServiceImpl tabAppearServiceImpl, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b4d2aa43", new Object[]{tabAppearServiceImpl, new Boolean(z)})).booleanValue();
        }
        tabAppearServiceImpl.isLeave = z;
        return z;
    }

    public static /* synthetic */ ljs access$100(TabAppearServiceImpl tabAppearServiceImpl) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ljs) ipChange.ipc$dispatch("b8759a7d", new Object[]{tabAppearServiceImpl}) : tabAppearServiceImpl.infoFlowContext;
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onCreateService(ljs ljsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ceabc49c", new Object[]{this, ljsVar});
            return;
        }
        this.infoFlowContext = ljsVar;
        IMainLifecycleService iMainLifecycleService = (IMainLifecycleService) ljsVar.a(IMainLifecycleService.class);
        if (iMainLifecycleService == null) {
            return;
        }
        this.tabLifeCycle = createTabLifeCycle();
        iMainLifecycleService.getTabLifeCycleRegister().a(this.tabLifeCycle);
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
            return;
        }
        IMainLifecycleService iMainLifecycleService = (IMainLifecycleService) this.infoFlowContext.a(IMainLifecycleService.class);
        if (iMainLifecycleService == null) {
            return;
        }
        iMainLifecycleService.getTabLifeCycleRegister().b(this.tabLifeCycle);
    }

    private lld createTabLifeCycle() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (lld) ipChange.ipc$dispatch("e91d5eca", new Object[]{this}) : new lld() { // from class: com.taobao.tao.infoflow.commonsubservice.tabappearservice.TabAppearServiceImpl.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.lld
            public void onPageScrolled(float f, int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7e3dde4", new Object[]{this, new Float(f), new Integer(i)});
                }
            }

            @Override // tb.lld
            public void onPageSelected() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("90abdd0", new Object[]{this});
                    return;
                }
                boolean equals = "true".equals(j.a("homeTabAppearRequestEnable", "true"));
                if (!TabAppearServiceImpl.access$000(TabAppearServiceImpl.this) || !equals || !c.a().ab()) {
                    return;
                }
                IContainerDataService iContainerDataService = (IContainerDataService) TabAppearServiceImpl.access$100(TabAppearServiceImpl.this).a(IContainerDataService.class);
                if (iContainerDataService != null) {
                    iContainerDataService.triggerEvent("HomeTabAppear", null);
                }
                TabAppearServiceImpl.access$002(TabAppearServiceImpl.this, false);
            }

            @Override // tb.lld
            public void onPageUnSelected() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("1dadaf89", new Object[]{this});
                } else {
                    TabAppearServiceImpl.access$002(TabAppearServiceImpl.this, true);
                }
            }
        };
    }
}
