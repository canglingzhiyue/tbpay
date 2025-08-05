package com.taobao.infoflow.taobao.subservice.biz.smartrtservice;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.util.UtUtils;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.subservice.biz.ISmartRtService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService;
import com.taobao.tao.homepage.d;
import tb.bxn;
import tb.kge;
import tb.ldf;
import tb.ldl;
import tb.ljs;
import tb.lli;
import tb.thd;

/* loaded from: classes7.dex */
public class SmartRtService implements ISmartRtService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "SmartRtService";
    private IContainerDataModel<?> mContainerDataModel;
    private ljs mInfoFlowContext;
    private IContainerDataService.a mOnDataProcessListener;
    private String willingScore;

    static {
        kge.a(-1512442694);
        kge.a(-465344588);
    }

    public static /* synthetic */ IContainerDataModel access$002(SmartRtService smartRtService, IContainerDataModel iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IContainerDataModel) ipChange.ipc$dispatch("3e6702b8", new Object[]{smartRtService, iContainerDataModel});
        }
        smartRtService.mContainerDataModel = iContainerDataModel;
        return iContainerDataModel;
    }

    public static /* synthetic */ boolean access$100(SmartRtService smartRtService, IContainerDataModel iContainerDataModel) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8f3aa5d0", new Object[]{smartRtService, iContainerDataModel})).booleanValue() : smartRtService.isNeedUploadScore(iContainerDataModel);
    }

    public static /* synthetic */ void access$200(SmartRtService smartRtService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ec795ee", new Object[]{smartRtService});
        } else {
            smartRtService.willingScoreStatistics();
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

    @Override // com.taobao.infoflow.protocol.subservice.biz.ISmartRtService
    public void smartPreloadPredictStatistics() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6794143", new Object[]{this});
        } else if (this.mInfoFlowContext == null || !bxn.a(this.mContainerDataModel) || this.willingScore == null || thd.a((IMainFeedsViewService) this.mInfoFlowContext.a(IMainFeedsViewService.class))) {
        } else {
            ldl.a("Page_Home", UtUtils.CHANGED_UPP_EVENT_ID, "page_home_show_second_request_trigger", "", "", generateArgs());
        }
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
        return ipChange instanceof IpChange ? (IContainerDataService.a) ipChange.ipc$dispatch("a962c199", new Object[]{this}) : new IContainerDataService.a() { // from class: com.taobao.infoflow.taobao.subservice.biz.smartrtservice.SmartRtService.1
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
                    return;
                }
                SmartRtService.access$002(SmartRtService.this, iContainerDataModel);
                if (!SmartRtService.access$100(SmartRtService.this, iContainerDataModel)) {
                    return;
                }
                SmartRtService.access$200(SmartRtService.this);
            }
        };
    }

    private boolean isNeedUploadScore(IContainerDataModel<?> iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("42628a27", new Object[]{this, iContainerDataModel})).booleanValue();
        }
        if (iContainerDataModel == null || iContainerDataModel.getBase() == null || !bxn.a(iContainerDataModel) || d.a() == null) {
            return false;
        }
        JSONObject c = d.a().c();
        if (c == null) {
            ldf.d(TAG, "isOpenRealTimeLog ext == null");
            return false;
        }
        this.willingScore = c.getString("willingness_score");
        ljs ljsVar = this.mInfoFlowContext;
        return (ljsVar == null || thd.a((IMainFeedsViewService) ljsVar.a(IMainFeedsViewService.class)) || this.willingScore == null) ? false : true;
    }

    private void willingScoreStatistics() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdd5466c", new Object[]{this});
        } else if (this.willingScore == null) {
        } else {
            ldl.a("Page_Home", UtUtils.CHANGED_UPP_EVENT_ID, "page_home_show_fistpage_request_end", "", "", generateArgs());
        }
    }

    private String generateArgs() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd846247", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("score", (Object) this.willingScore);
        jSONObject.put("timestamp", (Object) Long.valueOf(System.currentTimeMillis()));
        IMainFeedsViewService iMainFeedsViewService = (IMainFeedsViewService) this.mInfoFlowContext.a(IMainFeedsViewService.class);
        if (iMainFeedsViewService == null) {
            ldf.d(TAG, "mainFeedsViewService is null");
            return jSONObject.toString();
        }
        BaseSectionModel<?> findItemDataByPosition = iMainFeedsViewService.findItemDataByPosition(0);
        if (findItemDataByPosition == null) {
            ldf.d(TAG, "sectionModel is null");
            return jSONObject.toString();
        }
        JSONObject args = findItemDataByPosition.getArgs();
        if (args == null) {
            ldf.d(TAG, "args is null");
            return jSONObject.toString();
        }
        JSONObject jSONObject2 = args.getJSONObject("utLogMapEdge");
        if (jSONObject2 == null) {
            ldf.d(TAG, "utLogMapEdge is null");
            return jSONObject.toString();
        }
        jSONObject.put("sessionId", (Object) jSONObject2.getString("sessionId"));
        return jSONObject.toString();
    }
}
