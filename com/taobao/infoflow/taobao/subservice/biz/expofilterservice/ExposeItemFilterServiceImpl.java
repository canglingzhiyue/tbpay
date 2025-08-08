package com.taobao.infoflow.taobao.subservice.biz.expofilterservice;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.action.IUiRefreshActionModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.subservice.biz.IExposeItemFilterService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerService;
import tb.kge;
import tb.ldf;
import tb.ljs;
import tb.lli;
import tb.sts;

/* loaded from: classes7.dex */
public class ExposeItemFilterServiceImpl implements IExposeItemFilterService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "ExposeItemFilterServiceImpl";
    private IContainerDataService<?> mContainerDataService;
    private IContainerService<?> mContainerService;
    private sts mExpoFilterManager;
    private ljs mInfoFlowContext;
    private IContainerDataService.b mRequestListener;
    private IContainerService.a mUiRefreshListener;

    static {
        kge.a(-1858863827);
        kge.a(-1677712836);
    }

    public static /* synthetic */ sts access$000(ExposeItemFilterServiceImpl exposeItemFilterServiceImpl) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (sts) ipChange.ipc$dispatch("3cbc9717", new Object[]{exposeItemFilterServiceImpl}) : exposeItemFilterServiceImpl.mExpoFilterManager;
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onCreateService(ljs ljsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ceabc49c", new Object[]{this, ljsVar});
            return;
        }
        ldf.a(TAG, "onCreateService:" + ljsVar.a().a());
        if (!StringUtils.equals(ljsVar.a().a(), "newface_home_sub")) {
            return;
        }
        this.mInfoFlowContext = ljsVar;
        addListener();
    }

    private void addListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21f8b27c", new Object[]{this});
            return;
        }
        this.mContainerDataService = (IContainerDataService) this.mInfoFlowContext.a(IContainerDataService.class);
        this.mContainerService = (IContainerService) this.mInfoFlowContext.a(IContainerService.class);
        this.mExpoFilterManager = new sts(this.mInfoFlowContext);
        this.mRequestListener = createRequestListener();
        this.mUiRefreshListener = createUiRefreshListener();
        IContainerDataService<?> iContainerDataService = this.mContainerDataService;
        if (iContainerDataService != null) {
            iContainerDataService.addRequestListener(this.mRequestListener);
        }
        IContainerService<?> iContainerService = this.mContainerService;
        if (iContainerService == null) {
            return;
        }
        iContainerService.addUiRefreshListener(this.mUiRefreshListener);
    }

    private IContainerDataService.b createRequestListener() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IContainerDataService.b) ipChange.ipc$dispatch("88e46762", new Object[]{this}) : new IContainerDataService.b() { // from class: com.taobao.infoflow.taobao.subservice.biz.expofilterservice.ExposeItemFilterServiceImpl.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.b
            public void a(lli lliVar, String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("552c8b59", new Object[]{this, lliVar, str});
                }
            }

            @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.b
            public void a(lli lliVar, String str, String str2, String str3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("74bec7ed", new Object[]{this, lliVar, str, str2, str3});
                }
            }

            @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.b
            public void a(lli lliVar, IContainerDataModel<?> iContainerDataModel, String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d905f556", new Object[]{this, lliVar, iContainerDataModel, str});
                } else {
                    ExposeItemFilterServiceImpl.access$000(ExposeItemFilterServiceImpl.this).a(iContainerDataModel, str);
                }
            }
        };
    }

    private IContainerService.a createUiRefreshListener() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IContainerService.a) ipChange.ipc$dispatch("56effc11", new Object[]{this}) : new IContainerService.a() { // from class: com.taobao.infoflow.taobao.subservice.biz.expofilterservice.ExposeItemFilterServiceImpl.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerService.a
            public void b(IUiRefreshActionModel iUiRefreshActionModel) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("2729410f", new Object[]{this, iUiRefreshActionModel});
                }
            }

            @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerService.a
            public void a(IUiRefreshActionModel iUiRefreshActionModel) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4935db30", new Object[]{this, iUiRefreshActionModel});
                } else {
                    ExposeItemFilterServiceImpl.access$000(ExposeItemFilterServiceImpl.this).e(iUiRefreshActionModel.getContainerModel());
                }
            }
        };
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IContainerService.a aVar;
        IContainerDataService.b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
            return;
        }
        IContainerDataService<?> iContainerDataService = this.mContainerDataService;
        if (iContainerDataService != null && (bVar = this.mRequestListener) != null) {
            iContainerDataService.removeRequestListener(bVar);
        }
        IContainerService<?> iContainerService = this.mContainerService;
        if (iContainerService == null || (aVar = this.mUiRefreshListener) == null) {
            return;
        }
        iContainerService.removeUiRefreshListener(aVar);
    }
}
