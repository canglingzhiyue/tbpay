package com.taobao.infoflow.taobao.subservice.biz.smartloadingservice;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.subservice.biz.ISmartLoadingService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService;
import tb.jqm;
import tb.kge;
import tb.ldf;
import tb.ljs;
import tb.lkz;
import tb.lli;
import tb.lql;
import tb.lrs;
import tb.lrz;

/* loaded from: classes.dex */
public class SmartLoadingServiceImpl implements ISmartLoadingService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "SmartLoadingService";
    private IContainerDataService.a mDataProcessListener;
    private ljs mInfoFlowContext;
    private lrs mInsertCardListenerManager;
    private lrz mSmartLoadingEnable;
    private lkz.a onItemRenderListener;

    static {
        kge.a(-531162368);
        kge.a(-694355752);
    }

    public static /* synthetic */ boolean access$000(SmartLoadingServiceImpl smartLoadingServiceImpl, IContainerDataModel iContainerDataModel) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3d5c2c55", new Object[]{smartLoadingServiceImpl, iContainerDataModel})).booleanValue() : smartLoadingServiceImpl.isEnableSmartLoadingFeature(iContainerDataModel);
    }

    public static /* synthetic */ lrs access$100(SmartLoadingServiceImpl smartLoadingServiceImpl) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (lrs) ipChange.ipc$dispatch("dd741e10", new Object[]{smartLoadingServiceImpl}) : smartLoadingServiceImpl.mInsertCardListenerManager;
    }

    public static /* synthetic */ lrs access$102(SmartLoadingServiceImpl smartLoadingServiceImpl, lrs lrsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lrs) ipChange.ipc$dispatch("1d110b8f", new Object[]{smartLoadingServiceImpl, lrsVar});
        }
        smartLoadingServiceImpl.mInsertCardListenerManager = lrsVar;
        return lrsVar;
    }

    public static /* synthetic */ ljs access$200(SmartLoadingServiceImpl smartLoadingServiceImpl) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ljs) ipChange.ipc$dispatch("367f4b89", new Object[]{smartLoadingServiceImpl}) : smartLoadingServiceImpl.mInfoFlowContext;
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onCreateService(ljs ljsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ceabc49c", new Object[]{this, ljsVar});
            return;
        }
        this.mInfoFlowContext = ljsVar;
        this.mSmartLoadingEnable = new lrz(this.mInfoFlowContext);
        initRegisterDataProcessListener();
        initRegisterCardLifecycleListener();
        ldf.d("SmartLoadingService", "SmartLoadingService create");
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
            return;
        }
        unRegisterDataProcessListener();
        unregisterCardLifecycleListener();
        ldf.d("SmartLoadingService", "SmartLoadingService onDestroy");
    }

    private void initRegisterDataProcessListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecb9ed", new Object[]{this});
            return;
        }
        IContainerDataService iContainerDataService = (IContainerDataService) this.mInfoFlowContext.a(IContainerDataService.class);
        if (iContainerDataService == null) {
            return;
        }
        this.mDataProcessListener = createDataProcessListener();
        iContainerDataService.addDataProcessListener(this.mDataProcessListener);
    }

    private void initRegisterCardLifecycleListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48d47602", new Object[]{this});
            return;
        }
        IMainFeedsViewService iMainFeedsViewService = (IMainFeedsViewService) this.mInfoFlowContext.a(IMainFeedsViewService.class);
        if (iMainFeedsViewService == null) {
            return;
        }
        this.onItemRenderListener = createItemLifeCycleListener();
        iMainFeedsViewService.mo1084getLifeCycleRegister().a(this.onItemRenderListener);
    }

    private void unregisterCardLifecycleListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("643661b9", new Object[]{this});
            return;
        }
        IMainFeedsViewService iMainFeedsViewService = (IMainFeedsViewService) this.mInfoFlowContext.a(IMainFeedsViewService.class);
        if (iMainFeedsViewService == null) {
            return;
        }
        iMainFeedsViewService.mo1084getLifeCycleRegister().b(this.onItemRenderListener);
    }

    private void unRegisterDataProcessListener() {
        IContainerDataService.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("435b1f44", new Object[]{this});
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
        return ipChange instanceof IpChange ? (IContainerDataService.a) ipChange.ipc$dispatch("a962c199", new Object[]{this}) : new IContainerDataService.a() { // from class: com.taobao.infoflow.taobao.subservice.biz.smartloadingservice.SmartLoadingServiceImpl.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.a
            public void a(lli lliVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f302f74f", new Object[]{this, lliVar});
                }
            }

            @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.a
            public void b(lli lliVar, IContainerDataModel<?> iContainerDataModel) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("30b7ed6b", new Object[]{this, lliVar, iContainerDataModel});
                }
            }

            @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.a
            public void a(lli lliVar, IContainerDataModel<?> iContainerDataModel) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("ce5cd68c", new Object[]{this, lliVar, iContainerDataModel});
                } else if (SmartLoadingServiceImpl.access$000(SmartLoadingServiceImpl.this, iContainerDataModel)) {
                    if (SmartLoadingServiceImpl.access$100(SmartLoadingServiceImpl.this) != null) {
                        return;
                    }
                    SmartLoadingServiceImpl smartLoadingServiceImpl = SmartLoadingServiceImpl.this;
                    SmartLoadingServiceImpl.access$102(smartLoadingServiceImpl, new lrs(SmartLoadingServiceImpl.access$200(smartLoadingServiceImpl)));
                } else if (SmartLoadingServiceImpl.access$100(SmartLoadingServiceImpl.this) == null) {
                } else {
                    SmartLoadingServiceImpl.access$100(SmartLoadingServiceImpl.this).a();
                    SmartLoadingServiceImpl.access$102(SmartLoadingServiceImpl.this, null);
                }
            }
        };
    }

    private lkz.a createItemLifeCycleListener() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (lkz.a) ipChange.ipc$dispatch("b3ad7df8", new Object[]{this}) : new lkz.a() { // from class: com.taobao.infoflow.taobao.subservice.biz.smartloadingservice.SmartLoadingServiceImpl.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.lkz.a
            public void a(boolean z, int i, BaseSectionModel baseSectionModel, View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5ac4f93", new Object[]{this, new Boolean(z), new Integer(i), baseSectionModel, view});
                }
            }

            @Override // tb.lkz.a
            public void a_(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b34bf30d", new Object[]{this, view});
                }
            }

            @Override // tb.lkz.a
            public void b(int i, View view, BaseSectionModel baseSectionModel) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("c5fda7a0", new Object[]{this, new Integer(i), view, baseSectionModel});
                }
            }

            @Override // tb.lkz.a
            public void a(int i, View view, BaseSectionModel baseSectionModel) {
                IpChange ipChange2 = $ipChange;
                boolean z = false;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("e0524b1f", new Object[]{this, new Integer(i), view, baseSectionModel});
                } else if (baseSectionModel == null || baseSectionModel.getArgs() == null) {
                } else {
                    try {
                        z = baseSectionModel.getArgs().getBooleanValue("isSmartLoading");
                    } catch (Exception e) {
                        if (jqm.a()) {
                            e.printStackTrace();
                        }
                    }
                    if (!z) {
                        return;
                    }
                    lql.b(i, baseSectionModel.getIndex());
                }
            }
        };
    }

    private boolean isEnableSmartLoadingFeature(IContainerDataModel<?> iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c2133e2", new Object[]{this, iContainerDataModel})).booleanValue();
        }
        return this.mSmartLoadingEnable.a() && this.mSmartLoadingEnable.a(iContainerDataModel);
    }
}
