package com.taobao.infoflow.taobao.subservice.biz.resetpagingnumber;

import android.text.TextUtils;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSubItemModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel;
import com.taobao.infoflow.protocol.subservice.biz.IDxItemClickService;
import com.taobao.infoflow.protocol.subservice.biz.IResetPagingNumberService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService;
import java.util.HashMap;
import java.util.Map;
import tb.kge;
import tb.ldf;
import tb.ldl;
import tb.liy;
import tb.ljs;
import tb.lli;

/* loaded from: classes7.dex */
public class ResetPagingNumberServiceImpl implements IResetPagingNumberService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "ResetPagingNumberServiceImpl";
    private boolean hasClickInfoFlowCard = false;
    private ljs mInfoFlowContext;
    private IDxItemClickService.a mOnDxItemClickListener;
    private IContainerDataService.c mRequestBizParamsCreator;

    static {
        kge.a(940563409);
        kge.a(200895003);
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IResetPagingNumberService
    public boolean hasClickInfoFlowCard() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2429ade5", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IResetPagingNumberService
    public void resetStatus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b50ee28", new Object[]{this});
        }
    }

    public static /* synthetic */ boolean access$000(ResetPagingNumberServiceImpl resetPagingNumberServiceImpl) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a252ab39", new Object[]{resetPagingNumberServiceImpl})).booleanValue() : resetPagingNumberServiceImpl.hasClickInfoFlowCard;
    }

    public static /* synthetic */ boolean access$002(ResetPagingNumberServiceImpl resetPagingNumberServiceImpl, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6906fe01", new Object[]{resetPagingNumberServiceImpl, new Boolean(z)})).booleanValue();
        }
        resetPagingNumberServiceImpl.hasClickInfoFlowCard = z;
        return z;
    }

    public static /* synthetic */ boolean access$100(ResetPagingNumberServiceImpl resetPagingNumberServiceImpl) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d209df3a", new Object[]{resetPagingNumberServiceImpl})).booleanValue() : resetPagingNumberServiceImpl.enableResetPagingNumber();
    }

    public static /* synthetic */ ljs access$200(ResetPagingNumberServiceImpl resetPagingNumberServiceImpl) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ljs) ipChange.ipc$dispatch("4e5f3b5a", new Object[]{resetPagingNumberServiceImpl}) : resetPagingNumberServiceImpl.mInfoFlowContext;
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onCreateService(ljs ljsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ceabc49c", new Object[]{this, ljsVar});
            return;
        }
        this.mInfoFlowContext = ljsVar;
        addDxCardClickListener();
        registerRequestBizParamsCreator();
    }

    private void addDxCardClickListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d46f059e", new Object[]{this});
        } else if (this.mInfoFlowContext == null) {
        } else {
            this.mOnDxItemClickListener = createOnDxItemClickListener();
            IDxItemClickService iDxItemClickService = (IDxItemClickService) this.mInfoFlowContext.a(IDxItemClickService.class);
            if (iDxItemClickService == null) {
                return;
            }
            iDxItemClickService.addDxItemClickListener(this.mOnDxItemClickListener);
        }
    }

    private void removeDxCardClickListener() {
        IDxItemClickService iDxItemClickService;
        IDxItemClickService.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("548565b", new Object[]{this});
            return;
        }
        ljs ljsVar = this.mInfoFlowContext;
        if (ljsVar == null || (iDxItemClickService = (IDxItemClickService) ljsVar.a(IDxItemClickService.class)) == null || (aVar = this.mOnDxItemClickListener) == null) {
            return;
        }
        iDxItemClickService.removeDxItemClickListener(aVar);
    }

    private void registerRequestBizParamsCreator() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8acd06", new Object[]{this});
            return;
        }
        IContainerDataService iContainerDataService = (IContainerDataService) this.mInfoFlowContext.a(IContainerDataService.class);
        if (iContainerDataService == null) {
            return;
        }
        this.mRequestBizParamsCreator = createRequestBizParamsCreator();
        iContainerDataService.addRequestBizParamsCreator(this.mRequestBizParamsCreator);
    }

    private void unRegisterRequestBizParamsCreator() {
        IContainerDataService.c cVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e50b7ad", new Object[]{this});
            return;
        }
        IContainerDataService iContainerDataService = (IContainerDataService) this.mInfoFlowContext.a(IContainerDataService.class);
        if (iContainerDataService == null || (cVar = this.mRequestBizParamsCreator) == null) {
            return;
        }
        iContainerDataService.removeRequestBizParamsCreator(cVar);
        this.mRequestBizParamsCreator = null;
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
            return;
        }
        removeDxCardClickListener();
        unRegisterRequestBizParamsCreator();
    }

    private IContainerDataService.c createRequestBizParamsCreator() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IContainerDataService.c) ipChange.ipc$dispatch("70453300", new Object[]{this}) : new IContainerDataService.c() { // from class: com.taobao.infoflow.taobao.subservice.biz.resetpagingnumber.ResetPagingNumberServiceImpl.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.c
            public Map<String, String> a(lli lliVar, String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (Map) ipChange2.ipc$dispatch("add74dce", new Object[]{this, lliVar, str});
                }
                if (!ResetPagingNumberServiceImpl.access$000(ResetPagingNumberServiceImpl.this) || !TextUtils.equals(str, "scrollNextPage") || !ResetPagingNumberServiceImpl.access$100(ResetPagingNumberServiceImpl.this)) {
                    return null;
                }
                ResetPagingNumberServiceImpl.access$002(ResetPagingNumberServiceImpl.this, false);
                HashMap hashMap = new HashMap();
                hashMap.put("lastPageHasClicked", "true");
                return hashMap;
            }
        };
    }

    private IDxItemClickService.a createOnDxItemClickListener() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IDxItemClickService.a) ipChange.ipc$dispatch("16cf4817", new Object[]{this}) : new IDxItemClickService.a() { // from class: com.taobao.infoflow.taobao.subservice.biz.resetpagingnumber.ResetPagingNumberServiceImpl.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.infoflow.protocol.subservice.biz.IDxItemClickService.a
            public void a(BaseSectionModel<?> baseSectionModel, BaseSubItemModel baseSubItemModel, View view) {
                IpChange ipChange2 = $ipChange;
                boolean z = false;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b6a38c", new Object[]{this, baseSectionModel, baseSubItemModel, view});
                    return;
                }
                IMainFeedsViewService iMainFeedsViewService = (IMainFeedsViewService) ResetPagingNumberServiceImpl.access$200(ResetPagingNumberServiceImpl.this).a(IMainFeedsViewService.class);
                if (iMainFeedsViewService == null) {
                    return;
                }
                int positionBySectionBizCode = iMainFeedsViewService.getPositionBySectionBizCode(liy.b(ResetPagingNumberServiceImpl.access$200(ResetPagingNumberServiceImpl.this)));
                int positionBySectionBizCode2 = iMainFeedsViewService.getPositionBySectionBizCode(baseSectionModel.getSectionBizCode());
                if (positionBySectionBizCode2 >= positionBySectionBizCode && positionBySectionBizCode != -1) {
                    ResetPagingNumberServiceImpl.access$002(ResetPagingNumberServiceImpl.this, true);
                }
                if (positionBySectionBizCode != -1) {
                    return;
                }
                ldl.a("Page_Home", 19999, "PageDivergencyDefaultIndex", "", "", "");
                ResetPagingNumberServiceImpl resetPagingNumberServiceImpl = ResetPagingNumberServiceImpl.this;
                if (positionBySectionBizCode2 >= 3) {
                    z = true;
                }
                ResetPagingNumberServiceImpl.access$002(resetPagingNumberServiceImpl, z);
            }
        };
    }

    private boolean enableResetPagingNumber() {
        IContainerDataModel containerData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("144635ac", new Object[]{this})).booleanValue();
        }
        IContainerDataService iContainerDataService = (IContainerDataService) this.mInfoFlowContext.a(IContainerDataService.class);
        if (iContainerDataService == null || (containerData = iContainerDataService.getContainerData()) == null) {
            return false;
        }
        IContainerInnerDataModel base = containerData.getBase();
        if (base == null) {
            ldf.d(TAG, "baseData == null");
            return false;
        }
        JSONObject ext = base.getExt();
        if (ext != null) {
            return ext.getBooleanValue("isConvergenceEnable");
        }
        return false;
    }
}
