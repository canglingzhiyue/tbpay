package com.taobao.infoflow.taobao.subservice.biz.clickbackservice;

import android.content.Intent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.biz.IClickBackRefreshService;
import com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService;
import com.taobao.infoflow.protocol.subservice.framework.IMainLifecycleService;
import tb.bxp;
import tb.kge;
import tb.ljs;
import tb.llb;
import tb.lne;
import tb.lnf;

/* loaded from: classes.dex */
public class ClickBackRefreshServiceImpl implements IClickBackRefreshService {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private lne mClickBackRefreshTrigger;
    private ljs mInfoFlowContext;

    static {
        kge.a(-2001875787);
        kge.a(454393247);
    }

    public static /* synthetic */ lne access$000(ClickBackRefreshServiceImpl clickBackRefreshServiceImpl) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (lne) ipChange.ipc$dispatch("394c2b52", new Object[]{clickBackRefreshServiceImpl}) : clickBackRefreshServiceImpl.mClickBackRefreshTrigger;
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onCreateService(ljs ljsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ceabc49c", new Object[]{this, ljsVar});
            return;
        }
        this.mInfoFlowContext = ljsVar;
        lnf lnfVar = new lnf(ljsVar);
        this.mClickBackRefreshTrigger = new lne(this.mInfoFlowContext, lnfVar);
        IMainLifecycleService iMainLifecycleService = (IMainLifecycleService) this.mInfoFlowContext.a(IMainLifecycleService.class);
        if (iMainLifecycleService == null) {
            return;
        }
        iMainLifecycleService.getPageLifeCycleRegister().a(createPageLifeCycle());
        IMainFeedsViewService iMainFeedsViewService = (IMainFeedsViewService) this.mInfoFlowContext.a(IMainFeedsViewService.class);
        if (iMainFeedsViewService == null) {
            return;
        }
        iMainFeedsViewService.mo1084getLifeCycleRegister().a(lnfVar);
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
            return;
        }
        lne lneVar = this.mClickBackRefreshTrigger;
        if (lneVar != null) {
            lneVar.a();
        }
        this.mInfoFlowContext = null;
    }

    private llb createPageLifeCycle() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (llb) ipChange.ipc$dispatch("414e763e", new Object[]{this}) : new bxp() { // from class: com.taobao.infoflow.taobao.subservice.biz.clickbackservice.ClickBackRefreshServiceImpl.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.bxp, tb.llb
            public void onDestroy() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a6532022", new Object[]{this});
                }
            }

            @Override // tb.bxp, tb.llb
            public void onDestroyView() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("1b8f9ee7", new Object[]{this});
                }
            }

            @Override // tb.bxp, tb.llb
            public void onNewIntent(Intent intent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4b57eb01", new Object[]{this, intent});
                }
            }

            @Override // tb.bxp, tb.llb
            public void onPause() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("2f87fc5e", new Object[]{this});
                }
            }

            @Override // tb.bxp, tb.llb
            public void onRestart() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4c630bb7", new Object[]{this});
                }
            }

            @Override // tb.bxp, tb.llb
            public void onResume() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a5d6cd73", new Object[]{this});
                }
            }

            @Override // tb.bxp, tb.llb
            public void onStart() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7f2d84ca", new Object[]{this});
                }
            }

            @Override // tb.bxp, tb.llb
            public void onStop() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b3dde88", new Object[]{this});
                }
            }

            @Override // tb.bxp, tb.llb
            public void onWillExit() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3bc02c16", new Object[]{this});
                } else {
                    ClickBackRefreshServiceImpl.access$000(ClickBackRefreshServiceImpl.this).b();
                }
            }
        };
    }
}
