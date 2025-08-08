package com.taobao.infoflow.taobao.subservice.biz.feedbackservice;

import android.content.Intent;
import android.os.Bundle;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.utils.o;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseItemModel;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSubItemModel;
import com.taobao.infoflow.protocol.subservice.biz.ICardOverlayService;
import com.taobao.infoflow.protocol.subservice.biz.IDxItemClickService;
import com.taobao.infoflow.protocol.subservice.biz.IFeedbackService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService;
import com.taobao.infoflow.protocol.subservice.framework.IMainLifecycleService;
import java.util.HashMap;
import java.util.Map;
import tb.bxp;
import tb.kge;
import tb.lcz;
import tb.ldf;
import tb.lds;
import tb.ljs;
import tb.llb;
import tb.llc;
import tb.lli;
import tb.lpi;
import tb.tdk;

/* loaded from: classes7.dex */
public class FeedbackServiceImpl implements IFeedbackService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String KEY_CARD_FEATURE_ID = "cardFeatureId";
    private static final String KEY_HAS_SHOW_GRID_FEEDBACK_GUIDE = "hasShowGridFeedbackPop";
    private static final String KEY_SECTION_BIZ_CODE = "sectionBizCode";
    private static final String KEY_SECTION_UNIQUE_KEY = "sectionUniqueKey";
    private static final String KEY_TARGET_TYPE = "targetType";
    private static final String ND_FEEDBACK_PASS_PARAM = "passParam";
    private static final int ND_FEEDBACK_REQUEST_CODE = 4353;
    private static final String TAG = "FeedbackServiceImpl";
    private static final String TARGET_TYPE_LITE_DETAIL = "liteDetail";
    private static final String TARGET_TYPE_NEW_DETAIL = "newDetail";
    private IContainerDataService.c mBizParamCreator;
    private ICardOverlayService<?> mCardOverlayService;
    private IContainerDataService<?> mDataService;
    private lpi mDeleteHostCardHelper;
    private IDxItemClickService mItemClickService;
    private IMainFeedsViewService<?> mMainFeedService;
    private IMainLifecycleService mMainLifecycleService;
    private IDxItemClickService.OnDxClickNavListener mOnDxClickNavListener;
    private llb mPageLifecycle;

    static {
        kge.a(-835153796);
        kge.a(1101285190);
    }

    public static /* synthetic */ String access$000(FeedbackServiceImpl feedbackServiceImpl, BaseSectionModel baseSectionModel) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a0af36a", new Object[]{feedbackServiceImpl, baseSectionModel}) : feedbackServiceImpl.getTargetType(baseSectionModel);
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onCreateService(ljs ljsVar) {
        llc pageLifeCycleRegister;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ceabc49c", new Object[]{this, ljsVar});
            return;
        }
        this.mCardOverlayService = (ICardOverlayService) ljsVar.a(ICardOverlayService.class);
        this.mDataService = (IContainerDataService) ljsVar.a(IContainerDataService.class);
        this.mMainFeedService = (IMainFeedsViewService) ljsVar.a(IMainFeedsViewService.class);
        this.mMainLifecycleService = (IMainLifecycleService) ljsVar.a(IMainLifecycleService.class);
        IMainLifecycleService iMainLifecycleService = this.mMainLifecycleService;
        if (iMainLifecycleService != null && (pageLifeCycleRegister = iMainLifecycleService.getPageLifeCycleRegister()) != null) {
            this.mPageLifecycle = createPageLifecycle();
            pageLifeCycleRegister.a(this.mPageLifecycle);
        }
        this.mItemClickService = (IDxItemClickService) ljsVar.a(IDxItemClickService.class);
        addNavListener();
        this.mDeleteHostCardHelper = new lpi(ljsVar);
        registerRequestBizParamCreator();
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
            return;
        }
        this.mCardOverlayService = null;
        this.mDataService = null;
        this.mMainFeedService = null;
        IMainLifecycleService iMainLifecycleService = this.mMainLifecycleService;
        if (iMainLifecycleService != null) {
            iMainLifecycleService.getPageLifeCycleRegister().b(this.mPageLifecycle);
            this.mMainLifecycleService = null;
        }
        this.mDeleteHostCardHelper = null;
        removeNavListener();
        unRegisterBizParamCreator();
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IFeedbackService
    public void showFeedbackOverlay(View view, BaseSectionModel<?> baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b3dba5", new Object[]{this, view, baseSectionModel});
            return;
        }
        tdk.d(baseSectionModel);
        showDefaultCardOverlay(view, baseSectionModel);
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IFeedbackService
    public void showFeedbackOverlayWithData(View view, BaseSectionModel<?> baseSectionModel, BaseSectionModel<?> baseSectionModel2, View view2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9e49cf5", new Object[]{this, view, baseSectionModel, baseSectionModel2, view2});
            return;
        }
        ICardOverlayService<?> iCardOverlayService = this.mCardOverlayService;
        if (iCardOverlayService == null) {
            return;
        }
        iCardOverlayService.showOverlayWithOverlayData("overlay", view, baseSectionModel, baseSectionModel2, view2);
        ldf.d(TAG, "show feedback overlay with custom overlay data");
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IFeedbackService
    public void deleteHostCardByBizCode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("613f3af7", new Object[]{this, str});
        } else if (this.mDeleteHostCardHelper == null || this.mMainFeedService == null || StringUtils.isEmpty(str)) {
        } else {
            int positionBySectionBizCode = this.mMainFeedService.getPositionBySectionBizCode(str);
            if (positionBySectionBizCode < 0) {
                ldf.d(TAG, "delete host card pos not found");
                return;
            }
            BaseSectionModel<?> findItemDataByPosition = this.mMainFeedService.findItemDataByPosition(positionBySectionBizCode);
            if (findItemDataByPosition == null) {
                ldf.d(TAG, "delete host card data not found");
                return;
            }
            this.mDeleteHostCardHelper.a(findItemDataByPosition);
            ldf.d(TAG, "feedback delete host card");
        }
    }

    public void deleteHostCardByBizCodeWithUniqueKey(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bc8677d", new Object[]{this, str, str2});
        } else if (this.mDeleteHostCardHelper == null || this.mMainFeedService == null || StringUtils.isEmpty(str)) {
        } else {
            int positionBySectionBizCode = this.mMainFeedService.getPositionBySectionBizCode(str);
            if (positionBySectionBizCode < 0) {
                ldf.d(TAG, "delete host card pos not found");
                return;
            }
            BaseSectionModel<?> findItemDataByPosition = this.mMainFeedService.findItemDataByPosition(positionBySectionBizCode);
            if (findItemDataByPosition == null) {
                ldf.d(TAG, "delete host card data not found");
                return;
            }
            String string = findItemDataByPosition.getExt() == null ? "" : findItemDataByPosition.getExt().getString(KEY_CARD_FEATURE_ID);
            if (!StringUtils.isEmpty(str2) && !StringUtils.equals(string, str2)) {
                ldf.d(TAG, "feedback delete host card failed, card unique not match");
                return;
            }
            this.mDeleteHostCardHelper.a(findItemDataByPosition);
            ldf.d(TAG, "feedback delete host card");
        }
    }

    private void showDefaultCardOverlay(View view, BaseSectionModel<?> baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48cba337", new Object[]{this, view, baseSectionModel});
            return;
        }
        ICardOverlayService<?> iCardOverlayService = this.mCardOverlayService;
        if (iCardOverlayService == null) {
            return;
        }
        iCardOverlayService.showOverlay("overlay", view, baseSectionModel);
        ldf.d(TAG, "show feedback overlay");
    }

    private llb createPageLifecycle() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (llb) ipChange.ipc$dispatch("738a321e", new Object[]{this}) : new bxp() { // from class: com.taobao.infoflow.taobao.subservice.biz.feedbackservice.FeedbackServiceImpl.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.bxp, tb.llb
            public void onActivityResult(int i, int i2, Intent intent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
                } else if (i != FeedbackServiceImpl.ND_FEEDBACK_REQUEST_CODE || i2 != -1 || intent == null) {
                } else {
                    ldf.d(FeedbackServiceImpl.TAG, "receive activityResult");
                    String stringExtra = intent.getStringExtra(FeedbackServiceImpl.ND_FEEDBACK_PASS_PARAM);
                    JSONObject jSONObject = null;
                    try {
                        jSONObject = JSON.parseObject(stringExtra);
                    } catch (Exception e) {
                        ldf.a(FeedbackServiceImpl.TAG, "parse passParam error", e);
                    }
                    if (jSONObject == null) {
                        ldf.d(FeedbackServiceImpl.TAG, "passParam is null");
                        return;
                    }
                    String string = jSONObject.getString("sectionBizCode");
                    String string2 = jSONObject.getString(FeedbackServiceImpl.KEY_SECTION_UNIQUE_KEY);
                    if (StringUtils.isEmpty(string)) {
                        ldf.d(FeedbackServiceImpl.TAG, "delete card sectionBizCode is null");
                    } else {
                        FeedbackServiceImpl.this.deleteHostCardByBizCodeWithUniqueKey(string, string2);
                    }
                }
            }
        };
    }

    private void addNavListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0e8f91d", new Object[]{this});
        } else if (this.mItemClickService == null) {
        } else {
            this.mOnDxClickNavListener = new IDxItemClickService.OnDxClickNavListener() { // from class: com.taobao.infoflow.taobao.subservice.biz.feedbackservice.FeedbackServiceImpl.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.infoflow.protocol.subservice.biz.IDxItemClickService.OnDxClickNavListener
                public void a(BaseSectionModel<?> baseSectionModel, BaseSubItemModel baseSubItemModel, Bundle bundle, String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("71ccf1d8", new Object[]{this, baseSectionModel, baseSubItemModel, bundle, str});
                        return;
                    }
                    String access$000 = FeedbackServiceImpl.access$000(FeedbackServiceImpl.this, baseSectionModel);
                    if (!StringUtils.equals("liteDetail", access$000) && !StringUtils.equals("newDetail", access$000)) {
                        return;
                    }
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("sectionBizCode", (Object) baseSectionModel.getSectionBizCode());
                    jSONObject.put(FeedbackServiceImpl.KEY_SECTION_UNIQUE_KEY, (Object) baseSectionModel.getExt().getString(FeedbackServiceImpl.KEY_CARD_FEATURE_ID));
                    bundle.putString(FeedbackServiceImpl.ND_FEEDBACK_PASS_PARAM, jSONObject.toJSONString());
                    bundle.putInt(lds.KEY_NAV_REQUEST_CODE, FeedbackServiceImpl.ND_FEEDBACK_REQUEST_CODE);
                    ldf.d(FeedbackServiceImpl.TAG, "add feedback param for newDetail or liteDetail");
                }

                @Override // com.taobao.infoflow.protocol.subservice.biz.IDxItemClickService.OnDxClickNavListener
                public /* synthetic */ void onNavFinished(boolean z) {
                    IDxItemClickService.OnDxClickNavListener.CC.$default$onNavFinished(this, z);
                }
            };
            this.mItemClickService.addDxClickNavListener(this.mOnDxClickNavListener);
        }
    }

    private String getTargetType(BaseSectionModel<?> baseSectionModel) {
        BaseSubItemModel mo1094getBaseItemModel;
        JSONObject ext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("194de0f0", new Object[]{this, baseSectionModel});
        }
        BaseItemModel mo1097getItem = baseSectionModel.mo1097getItem();
        if (mo1097getItem != null && (mo1094getBaseItemModel = mo1097getItem.mo1094getBaseItemModel(0)) != null && (ext = mo1094getBaseItemModel.getExt()) != null) {
            return ext.getString("targetType");
        }
        return null;
    }

    private void removeNavListener() {
        IDxItemClickService.OnDxClickNavListener onDxClickNavListener;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ee956da", new Object[]{this});
            return;
        }
        IDxItemClickService iDxItemClickService = this.mItemClickService;
        if (iDxItemClickService == null || (onDxClickNavListener = this.mOnDxClickNavListener) == null) {
            return;
        }
        iDxItemClickService.removeDxClickNavListener(onDxClickNavListener);
    }

    private void registerRequestBizParamCreator() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93c6390d", new Object[]{this});
        } else if (this.mDataService == null) {
        } else {
            this.mBizParamCreator = new IContainerDataService.c() { // from class: com.taobao.infoflow.taobao.subservice.biz.feedbackservice.FeedbackServiceImpl.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.c
                public Map<String, String> a(lli lliVar, String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (Map) ipChange2.ipc$dispatch("add74dce", new Object[]{this, lliVar, str});
                    }
                    if (!Boolean.TRUE.toString().equalsIgnoreCase(o.b(lcz.a(), FeedbackServiceImpl.KEY_HAS_SHOW_GRID_FEEDBACK_GUIDE))) {
                        return null;
                    }
                    HashMap hashMap = new HashMap(1);
                    hashMap.put(FeedbackServiceImpl.KEY_HAS_SHOW_GRID_FEEDBACK_GUIDE, "true");
                    return hashMap;
                }
            };
            this.mDataService.addRequestBizParamsCreator(this.mBizParamCreator);
        }
    }

    private void unRegisterBizParamCreator() {
        IContainerDataService.c cVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98dcc91d", new Object[]{this});
            return;
        }
        IContainerDataService<?> iContainerDataService = this.mDataService;
        if (iContainerDataService == null || (cVar = this.mBizParamCreator) == null) {
            return;
        }
        iContainerDataService.removeRequestBizParamsCreator(cVar);
    }
}
