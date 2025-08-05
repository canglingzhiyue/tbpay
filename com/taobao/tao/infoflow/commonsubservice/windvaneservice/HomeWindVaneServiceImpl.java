package com.taobao.tao.infoflow.commonsubservice.windvaneservice;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSubItemModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel;
import com.taobao.infoflow.protocol.subservice.biz.IWindVaneService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService;
import com.taobao.tao.recommend3.util.c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import tb.kge;
import tb.ldf;
import tb.ljs;

/* loaded from: classes.dex */
public class HomeWindVaneServiceImpl implements IWindVaneService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String BIZ_DATA = "bizData";
    private static final int DEAULT_NEARBY_ITEM_LIMITED_COUNT = 3;
    private static final String ENABLE_WIND_TAG_ONE_TO_THREE = "enableWindTagOneToThree";
    private static final String IS_WINDVANE_BIZ_OPT_ENABLE = "isWindvaneBizOptEnable";
    private static final String ITEM_PASS_PARAM = "itemPassParam";
    private static final String KEY_SECTION_TYPE = "sectionType";
    private static final String NEARBY_ITEM_LIMITED_COUNT = "nearbyItemLimitedCount";
    private static final String TAG;
    private static final String TYPE_WIND_VANE_CARD = "windvaneCard";
    private static final int WIND_VANE_CHECK_COUNT = 10;
    private static final int WIND_VANE_CHECK_CTR_NUMBER = 3;
    private double cardExposeRatioForRequestWindVane = 1.0d;
    private a cardOverLayResidentHelper = null;
    private HashSet<String> hasOverLay = new HashSet<>();
    private ljs infoFlowContext;

    static {
        kge.a(1717885548);
        kge.a(406457697);
        TAG = HomeWindVaneServiceImpl.class.getSimpleName();
    }

    private boolean getEnableWindTagOneToThree(IContainerDataModel<?> iContainerDataModel) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3a602462", new Object[]{this, iContainerDataModel})).booleanValue() : getValueFromContainer(iContainerDataModel, ENABLE_WIND_TAG_ONE_TO_THREE);
    }

    private boolean getValueFromContainer(IContainerDataModel<?> iContainerDataModel, String str) {
        IContainerInnerDataModel<?> base;
        JSONObject ext;
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f2242ea6", new Object[]{this, iContainerDataModel, str})).booleanValue();
        }
        if (iContainerDataModel != null && (base = iContainerDataModel.getBase()) != null && (ext = base.getExt()) != null && (string = ext.getString(str)) != null && !string.isEmpty()) {
            return string.equals("true");
        }
        return false;
    }

    private int getNearbyItemLimitedCount(IContainerDataModel<?> iContainerDataModel) {
        IContainerInnerDataModel<?> base;
        JSONObject ext;
        Integer integer;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2f551aca", new Object[]{this, iContainerDataModel})).intValue();
        }
        if (iContainerDataModel != null && (base = iContainerDataModel.getBase()) != null && (ext = base.getExt()) != null && (integer = ext.getInteger(NEARBY_ITEM_LIMITED_COUNT)) != null) {
            return integer.intValue();
        }
        return 3;
    }

    private boolean isWholeCardExpose(int i) {
        View findItemViewByPosition;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ac78227f", new Object[]{this, new Integer(i)})).booleanValue();
        }
        IMainFeedsViewService iMainFeedsViewService = (IMainFeedsViewService) this.infoFlowContext.a(IMainFeedsViewService.class);
        if (iMainFeedsViewService == null || (findItemViewByPosition = iMainFeedsViewService.findItemViewByPosition(i)) == null) {
            return false;
        }
        Rect rect = new Rect();
        return findItemViewByPosition.getGlobalVisibleRect(rect) && rect.bottom - rect.top == findItemViewByPosition.getHeight();
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onCreateService(ljs ljsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ceabc49c", new Object[]{this, ljsVar});
            return;
        }
        this.infoFlowContext = ljsVar;
        this.cardOverLayResidentHelper = new a(ljsVar);
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
            return;
        }
        this.cardOverLayResidentHelper.a();
        this.cardOverLayResidentHelper = null;
    }

    private boolean isExistWindVaneCardInNearByLimit(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("527417db", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
        }
        IMainFeedsViewService iMainFeedsViewService = (IMainFeedsViewService) this.infoFlowContext.a(IMainFeedsViewService.class);
        if (iMainFeedsViewService == null) {
            return false;
        }
        for (int i3 = 1; i3 <= i2; i3++) {
            BaseSectionModel<?> findItemDataByPosition = iMainFeedsViewService.findItemDataByPosition(i - i3);
            BaseSectionModel<?> findItemDataByPosition2 = iMainFeedsViewService.findItemDataByPosition(i + i3);
            if (isWindVaneCard(findItemDataByPosition) || isWindVaneCard(findItemDataByPosition2)) {
                return true;
            }
        }
        return false;
    }

    private void addWindVaneCTRParams(JSONObject jSONObject, int i, int i2) {
        int i3 = i;
        int i4 = i2;
        IpChange ipChange = $ipChange;
        int i5 = 3;
        int i6 = 1;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a16e902d", new Object[]{this, jSONObject, new Integer(i3), new Integer(i4)});
            return;
        }
        IMainFeedsViewService iMainFeedsViewService = (IMainFeedsViewService) this.infoFlowContext.a(IMainFeedsViewService.class);
        if (iMainFeedsViewService == null) {
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        ArrayList arrayList = new ArrayList();
        while (i6 <= i4) {
            int i7 = i3 - i6;
            BaseSectionModel<?> findItemDataByPosition = iMainFeedsViewService.findItemDataByPosition(i7);
            int i8 = i3 + i6;
            BaseSectionModel<?> findItemDataByPosition2 = iMainFeedsViewService.findItemDataByPosition(i8);
            if (i6 <= i5 && findItemDataByPosition != null) {
                JSONObject ext = findItemDataByPosition.getExt();
                String string = ext.getString("hybridCtr");
                if (string != null) {
                    jSONObject2.put(String.valueOf(-i6), (Object) string);
                }
                String string2 = ext.getString("hybridCvr");
                if (string2 != null) {
                    jSONObject3.put(String.valueOf(-i6), (Object) string2);
                }
            }
            if (i6 <= 3 && findItemDataByPosition2 != null) {
                JSONObject ext2 = findItemDataByPosition2.getExt();
                String string3 = ext2.getString("hybridCtr");
                if (string3 != null) {
                    jSONObject2.put(String.valueOf(i6), (Object) string3);
                }
                String string4 = ext2.getString("hybridCvr");
                if (string4 != null) {
                    jSONObject3.put(String.valueOf(i6), (Object) string4);
                }
            }
            if (isWindVaneCard(findItemDataByPosition)) {
                arrayList.add(String.valueOf(i7));
            }
            if (isWindVaneCard(findItemDataByPosition2)) {
                arrayList.add(String.valueOf(i8));
            }
            i6++;
            i3 = i;
            i4 = i2;
            i5 = 3;
        }
        jSONObject.put("targetItemIndex", (Object) Integer.valueOf(i));
        if (!arrayList.isEmpty()) {
            jSONObject.put("nearbyWindvaneItemIndexs", (Object) JSONObject.toJSONString(arrayList));
        }
        if (!jSONObject2.isEmpty()) {
            jSONObject.put("nearbyCtrs", (Object) jSONObject2);
        }
        if (jSONObject3.isEmpty()) {
            return;
        }
        jSONObject.put("nearbyCvrs", (Object) jSONObject3);
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IWindVaneService
    public void updateWindVaneClick(BaseSectionModel<?> baseSectionModel, BaseSubItemModel baseSubItemModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("711628ba", new Object[]{this, baseSectionModel, baseSubItemModel});
            return;
        }
        String a2 = this.infoFlowContext.a().a();
        IContainerDataService iContainerDataService = (IContainerDataService) this.infoFlowContext.a(IContainerDataService.class);
        if (iContainerDataService == null) {
            return;
        }
        IContainerDataModel<?> containerData = iContainerDataService.getContainerData();
        boolean enableWindTagOneToThree = getEnableWindTagOneToThree(containerData);
        boolean enableWindvaneBizOpt = enableWindvaneBizOpt(containerData);
        if (enableWindTagOneToThree) {
            checkAndPrepareWindvaneParams(baseSectionModel, baseSubItemModel, enableWindvaneBizOpt, containerData, enableWindTagOneToThree);
        }
        String itemId = baseSubItemModel.mo1100getClickParam().getItemId();
        String sectionBizCode = baseSectionModel.getSectionBizCode();
        JSONObject windParams = getWindParams(baseSectionModel);
        if (itemId == null) {
            itemId = "";
        }
        if (sectionBizCode == null) {
            sectionBizCode = "";
        }
        if (windParams != null) {
            windParams = (JSONObject) windParams.clone();
        }
        c.b(a2, itemId);
        c.a(a2, itemId, sectionBizCode, windParams);
        c.a(true);
    }

    private boolean enableWindvaneBizOpt(IContainerDataModel<?> iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8777f6b", new Object[]{this, iContainerDataModel})).booleanValue();
        }
        if (iContainerDataModel == null) {
            return false;
        }
        IContainerInnerDataModel<?> base = iContainerDataModel.getBase();
        if (base == null) {
            ldf.d(TAG, "baseData == null");
            return false;
        }
        JSONObject ext = base.getExt();
        if (ext != null) {
            return ext.getBooleanValue(IS_WINDVANE_BIZ_OPT_ENABLE);
        }
        return false;
    }

    private void checkAndPrepareWindvaneParams(BaseSectionModel<?> baseSectionModel, BaseSubItemModel baseSubItemModel, boolean z, IContainerDataModel<?> iContainerDataModel, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1400ae00", new Object[]{this, baseSectionModel, baseSubItemModel, new Boolean(z), iContainerDataModel, new Boolean(z2)});
            return;
        }
        JSONObject args = baseSectionModel.getArgs();
        boolean z3 = z2 && (args == null || !args.containsKey("realExposeIndex"));
        int intValue = args.getInteger("realExposeIndex").intValue();
        boolean isWholeCardExpose = isWholeCardExpose(intValue);
        boolean isExistWindVaneCardInNearByLimit = !z ? isExistWindVaneCardInNearByLimit(intValue, getNearbyItemLimitedCount(iContainerDataModel)) : false;
        String sectionBizCode = TextUtils.isEmpty(baseSectionModel.getSectionBizCode()) ? "" : baseSectionModel.getSectionBizCode();
        boolean z4 = z2 && (TextUtils.isEmpty(sectionBizCode) || this.hasOverLay.contains(sectionBizCode));
        boolean z5 = !isExistWindVaneCardInNearByLimit && isWholeCardExpose && !z4 && !z3;
        String str = TAG;
        ldf.d(str, "shouldRequestWindVane:" + z5 + "|exitWindVanceCardInNearByLimit:" + isExistWindVaneCardInNearByLimit + "|wholeCardExpose:" + isWholeCardExpose + "|hasOverLay:" + z4 + "|noExpose:" + z3);
        if (z5) {
            this.hasOverLay.add(sectionBizCode);
        }
        c.a(z5, true);
        JSONObject jSONObject = new JSONObject();
        if (z) {
            JSONObject jSONObject2 = new JSONObject();
            addWindVaneCTRParams(jSONObject2, intValue, 10);
            c.b(jSONObject2);
        }
        if (z2) {
            jSONObject.put(ENABLE_WIND_TAG_ONE_TO_THREE, (Object) "true");
        }
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("windTagParams", (Object) jSONObject);
        c.m(jSONObject3.toJSONString());
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IWindVaneService
    public List<String> getWindVaneExposedItemKeys() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("a929a1f9", new Object[]{this}) : c.f(this.infoFlowContext.a().a());
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IWindVaneService
    public long getLastInsertTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("347788cd", new Object[]{this})).longValue() : c.a();
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IWindVaneService
    public boolean isWindVaneCard(BaseSectionModel<?> baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("26f56c97", new Object[]{this, baseSectionModel})).booleanValue();
        }
        if (baseSectionModel == null) {
            return false;
        }
        JSONObject ext = baseSectionModel.getExt();
        return (ext != null && TextUtils.equals(ext.getString(KEY_SECTION_TYPE), TYPE_WIND_VANE_CARD)) || (baseSectionModel.mo1098getSubSection() != null && baseSectionModel.mo1098getSubSection().getWindvaneOverlay() != null);
    }

    private JSONObject getWindParams(BaseSectionModel<?> baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("c2bf6913", new Object[]{this, baseSectionModel});
        }
        if (baseSectionModel.getJSONObject("bizData") == null) {
            return null;
        }
        return baseSectionModel.getJSONObject("bizData").getJSONObject(ITEM_PASS_PARAM);
    }
}
