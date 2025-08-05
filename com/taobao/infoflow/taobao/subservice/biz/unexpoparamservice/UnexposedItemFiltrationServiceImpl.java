package com.taobao.infoflow.taobao.subservice.biz.unexpoparamservice;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.biz.IUnexposedItemFiltrationService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import tb.kge;
import tb.ljs;
import tb.lsu;
import tb.lsv;
import tb.lsw;

/* loaded from: classes7.dex */
public class UnexposedItemFiltrationServiceImpl implements IUnexposedItemFiltrationService {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private lsu mConfig;
    private lsw mDataProcessor;
    private ljs mInfoFlowContext;
    private lsv mParamCreator;

    static {
        kge.a(-1843612588);
        kge.a(801996855);
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onCreateService(ljs ljsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ceabc49c", new Object[]{this, ljsVar});
            return;
        }
        this.mInfoFlowContext = ljsVar;
        this.mConfig = new lsu();
        registerDataListeners();
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
        } else {
            unRegisterDataListeners();
        }
    }

    private void registerDataListeners() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22516f59", new Object[]{this});
            return;
        }
        IContainerDataService iContainerDataService = (IContainerDataService) this.mInfoFlowContext.a(IContainerDataService.class);
        if (iContainerDataService == null) {
            return;
        }
        this.mParamCreator = new lsv(this.mInfoFlowContext, this.mConfig);
        iContainerDataService.addRequestBizParamsCreator(this.mParamCreator);
        this.mDataProcessor = new lsw(this.mConfig);
        iContainerDataService.addDataProcessListener(this.mDataProcessor);
    }

    private void unRegisterDataListeners() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99b62ec0", new Object[]{this});
            return;
        }
        IContainerDataService iContainerDataService = (IContainerDataService) this.mInfoFlowContext.a(IContainerDataService.class);
        if (iContainerDataService == null) {
            return;
        }
        lsv lsvVar = this.mParamCreator;
        if (lsvVar != null) {
            iContainerDataService.removeRequestBizParamsCreator(lsvVar);
        }
        lsw lswVar = this.mDataProcessor;
        if (lswVar == null) {
            return;
        }
        iContainerDataService.removeDataProcessListener(lswVar);
    }
}
