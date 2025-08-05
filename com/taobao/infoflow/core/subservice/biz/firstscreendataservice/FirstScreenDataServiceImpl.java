package com.taobao.infoflow.core.subservice.biz.firstscreendataservice;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.subservice.biz.IFirstScreenDataService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import tb.kge;
import tb.lix;
import tb.liy;
import tb.ljs;
import tb.lli;

/* loaded from: classes.dex */
public class FirstScreenDataServiceImpl implements IFirstScreenDataService {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private JSONObject mFirstScreenExt;
    private JSONObject mFirstScreenSplash;
    private ljs mInfoFlowContext;
    private IContainerDataService.a mOnDataProcessListener;
    private int mRecommendFirstCardIndex = -1;

    static {
        kge.a(254212329);
        kge.a(936208953);
    }

    public static /* synthetic */ boolean access$000(FirstScreenDataServiceImpl firstScreenDataServiceImpl, IContainerDataModel iContainerDataModel) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("488a177e", new Object[]{firstScreenDataServiceImpl, iContainerDataModel})).booleanValue() : firstScreenDataServiceImpl.isFirstScreenRequest(iContainerDataModel);
    }

    public static /* synthetic */ void access$100(FirstScreenDataServiceImpl firstScreenDataServiceImpl, IContainerDataModel iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5841c9fb", new Object[]{firstScreenDataServiceImpl, iContainerDataModel});
        } else {
            firstScreenDataServiceImpl.recordFirstScreenBaseExt(iContainerDataModel);
        }
    }

    public static /* synthetic */ void access$200(FirstScreenDataServiceImpl firstScreenDataServiceImpl, IContainerDataModel iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67f97c7c", new Object[]{firstScreenDataServiceImpl, iContainerDataModel});
        } else {
            firstScreenDataServiceImpl.recordFirstScreenBaseTopView(iContainerDataModel);
        }
    }

    public static /* synthetic */ void access$300(FirstScreenDataServiceImpl firstScreenDataServiceImpl, IContainerDataModel iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77b12efd", new Object[]{firstScreenDataServiceImpl, iContainerDataModel});
        } else {
            firstScreenDataServiceImpl.recordRecommendFirstCardIndex(iContainerDataModel);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onCreateService(ljs ljsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ceabc49c", new Object[]{this, ljsVar});
            return;
        }
        this.mInfoFlowContext = ljsVar;
        initRegisterDataListener();
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
        } else {
            unRegisterDataListener();
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IFirstScreenDataService
    public JSONObject getFirstScreenExt() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("15f29c62", new Object[]{this}) : this.mFirstScreenExt;
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IFirstScreenDataService
    public JSONObject getTopViewSplashData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("f850085c", new Object[]{this}) : this.mFirstScreenSplash;
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IFirstScreenDataService
    public int getRecStartIndex() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7c33ee04", new Object[]{this})).intValue() : this.mRecommendFirstCardIndex;
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

    private IContainerDataService.a createDataProcessListener() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IContainerDataService.a) ipChange.ipc$dispatch("a962c199", new Object[]{this}) : new IContainerDataService.a() { // from class: com.taobao.infoflow.core.subservice.biz.firstscreendataservice.FirstScreenDataServiceImpl.1
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
                } else if (!FirstScreenDataServiceImpl.access$000(FirstScreenDataServiceImpl.this, iContainerDataModel)) {
                } else {
                    FirstScreenDataServiceImpl.access$100(FirstScreenDataServiceImpl.this, iContainerDataModel);
                    FirstScreenDataServiceImpl.access$200(FirstScreenDataServiceImpl.this, iContainerDataModel);
                    FirstScreenDataServiceImpl.access$300(FirstScreenDataServiceImpl.this, iContainerDataModel);
                }
            }
        };
    }

    private boolean isFirstScreenRequest(IContainerDataModel<?> iContainerDataModel) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1c9e8e3b", new Object[]{this, iContainerDataModel})).booleanValue() : (iContainerDataModel == null || iContainerDataModel.getBase() == null || iContainerDataModel.getBase().mo1280getPageParams() == null || iContainerDataModel.getBase().mo1280getPageParams().getPageNum() != 0) ? false : true;
    }

    private void recordFirstScreenBaseExt(IContainerDataModel<?> iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("753952cf", new Object[]{this, iContainerDataModel});
        } else if (iContainerDataModel == null || iContainerDataModel.getBase() == null || iContainerDataModel.getBase().getExt() == null) {
        } else {
            this.mFirstScreenExt = iContainerDataModel.getBase().getExt();
        }
    }

    private void recordFirstScreenBaseTopView(IContainerDataModel<?> iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45892836", new Object[]{this, iContainerDataModel});
        } else if (iContainerDataModel == null || iContainerDataModel.getBase() == null || iContainerDataModel.getBase().getTopViewSplashSection() == null) {
        } else {
            this.mFirstScreenSplash = iContainerDataModel.getBase().getTopViewSplashSection();
        }
    }

    private void recordRecommendFirstCardIndex(IContainerDataModel<BaseSectionModel> iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d6f4197", new Object[]{this, iContainerDataModel});
            return;
        }
        String b = liy.b(this.mInfoFlowContext);
        if (iContainerDataModel == null || iContainerDataModel.getBase() == null) {
            return;
        }
        this.mRecommendFirstCardIndex = lix.a(b, iContainerDataModel.getTotalData());
    }
}
