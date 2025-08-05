package com.taobao.infoflow.core.subservice.biz.outlinkservice;

import android.content.Intent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.subservice.biz.IIconBackGuideAnimeService;
import com.taobao.infoflow.protocol.subservice.biz.IOutLinkService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import tb.kge;
import tb.lgo;
import tb.ljs;
import tb.lli;

/* loaded from: classes.dex */
public class OutLinkServiceImpl implements IOutLinkService {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean isColdStartReq = false;
    private ljs mInfoFlowContext;
    private IContainerDataService.a mOnDataProcessListener;
    private lgo mOutLinkScheduler;

    static {
        kge.a(-787089079);
        kge.a(1519052439);
    }

    public static /* synthetic */ boolean access$000(OutLinkServiceImpl outLinkServiceImpl, IContainerDataModel iContainerDataModel) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("929f6bde", new Object[]{outLinkServiceImpl, iContainerDataModel})).booleanValue() : outLinkServiceImpl.isColdStart(iContainerDataModel);
    }

    public static /* synthetic */ boolean access$102(OutLinkServiceImpl outLinkServiceImpl, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("718d9fa", new Object[]{outLinkServiceImpl, new Boolean(z)})).booleanValue();
        }
        outLinkServiceImpl.isColdStartReq = z;
        return z;
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onCreateService(ljs ljsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ceabc49c", new Object[]{this, ljsVar});
            return;
        }
        this.mInfoFlowContext = ljsVar;
        this.mOutLinkScheduler = new lgo(this.mInfoFlowContext);
        initRegisterDataListener();
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
            return;
        }
        lgo lgoVar = this.mOutLinkScheduler;
        if (lgoVar != null) {
            lgoVar.a();
            this.mOutLinkScheduler = null;
        }
        unRegisterDataListener();
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
        this.mOnDataProcessListener = createDataProcessListener();
        iContainerDataService.addDataProcessListener(this.mOnDataProcessListener);
    }

    private void unRegisterDataListener() {
        IContainerDataService.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d5e881", new Object[]{this});
            return;
        }
        IContainerDataService iContainerDataService = (IContainerDataService) this.mInfoFlowContext.a(IContainerDataService.class);
        if (iContainerDataService == null || (aVar = this.mOnDataProcessListener) == null) {
            return;
        }
        iContainerDataService.removeDataProcessListener(aVar);
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IOutLinkService
    public void onOutLinkTrigger(String str, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a23a8fd", new Object[]{this, str, intent});
            return;
        }
        lgo lgoVar = this.mOutLinkScheduler;
        if (lgoVar != null) {
            lgoVar.a(this.isColdStartReq);
            this.mOutLinkScheduler.a(str, intent);
        }
        IIconBackGuideAnimeService iIconBackGuideAnimeService = (IIconBackGuideAnimeService) this.mInfoFlowContext.a(IIconBackGuideAnimeService.class);
        if (iIconBackGuideAnimeService == null) {
            return;
        }
        iIconBackGuideAnimeService.onOutLinkTrigger(str, intent);
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IOutLinkService
    public lli getScrolledToItemTraceInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lli) ipChange.ipc$dispatch("f7e0ed73", new Object[]{this});
        }
        lgo lgoVar = this.mOutLinkScheduler;
        if (lgoVar != null) {
            return lgoVar.b();
        }
        return null;
    }

    private IContainerDataService.a createDataProcessListener() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IContainerDataService.a) ipChange.ipc$dispatch("a962c199", new Object[]{this}) : new IContainerDataService.a() { // from class: com.taobao.infoflow.core.subservice.biz.outlinkservice.OutLinkServiceImpl.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.a
            public void a(lli lliVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f302f74f", new Object[]{this, lliVar});
                }
            }

            @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.a
            public void a(lli lliVar, IContainerDataModel<?> iContainerDataModel) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("ce5cd68c", new Object[]{this, lliVar, iContainerDataModel});
                }
            }

            @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.a
            public void b(lli lliVar, IContainerDataModel<?> iContainerDataModel) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("30b7ed6b", new Object[]{this, lliVar, iContainerDataModel});
                } else if (!OutLinkServiceImpl.access$000(OutLinkServiceImpl.this, iContainerDataModel)) {
                } else {
                    OutLinkServiceImpl.access$102(OutLinkServiceImpl.this, true);
                }
            }
        };
    }

    private boolean isColdStart(IContainerDataModel<?> iContainerDataModel) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3a1be04", new Object[]{this, iContainerDataModel})).booleanValue() : (iContainerDataModel.getBase() == null || iContainerDataModel.getBase().mo1280getPageParams() == null) ? false : true;
    }
}
