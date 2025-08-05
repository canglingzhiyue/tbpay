package tb;

import android.text.TextUtils;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.bootimage.linked.FeedsData;
import com.taobao.bootimage.linked.LinkedSplashData;
import com.taobao.bootimage.linked.b;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.subservice.base.IDxItemRenderService;
import com.taobao.infoflow.protocol.subservice.biz.IFirstScreenDataService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import com.taobao.tao.Globals;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes7.dex */
public class kql {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String USER_ID = "topShowVideo";

    /* renamed from: a  reason: collision with root package name */
    private final ljs f30236a;
    private int b = -1;
    private boolean c;
    private int d;
    private int e;
    private JSONObject f;

    static {
        kge.a(-2124868143);
    }

    public kql(ljs ljsVar) {
        this.f30236a = ljsVar;
    }

    public void a(LinkedSplashData linkedSplashData) {
        JSONObject linkedData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee262b0", new Object[]{this, linkedSplashData});
            return;
        }
        IDxItemRenderService iDxItemRenderService = (IDxItemRenderService) this.f30236a.a(IDxItemRenderService.class);
        if (iDxItemRenderService == null || (linkedData = linkedSplashData.getLinkedData("feeds")) == null) {
            return;
        }
        SectionModel sectionModel = new SectionModel(linkedData);
        ArrayList arrayList = new ArrayList();
        arrayList.add(sectionModel);
        iDxItemRenderService.downloadTemplate(arrayList, new IDxItemRenderService.b() { // from class: tb.kql.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.infoflow.protocol.subservice.base.IDxItemRenderService.b
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                } else {
                    ldf.d(lsk.SPLASH_BUSINESS_TAG, "TopShowInsert#downloadTemplate onSuccess");
                }
            }
        });
    }

    public void a(SectionModel sectionModel, boolean z, boolean z2, int i) {
        IContainerDataModel containerData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1525bde", new Object[]{this, sectionModel, new Boolean(z), new Boolean(z2), new Integer(i)});
            return;
        }
        ldf.d(lsk.SPLASH_BUSINESS_TAG, "TopShowInsert#insertCard isNeedTrigger: " + z);
        IContainerDataService iContainerDataService = (IContainerDataService) this.f30236a.a(IContainerDataService.class);
        if (iContainerDataService == null || (containerData = iContainerDataService.getContainerData()) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList(containerData.getTotalData());
        int a2 = a(arrayList, i);
        ldf.d(lsk.SPLASH_BUSINESS_TAG, "TopShowInsert#findInsertPosition: " + a2);
        if (z && !a(a2, z2)) {
            ldf.d(lsk.SPLASH_BUSINESS_TAG, "TopShowInsert#enableInsertExposeRatio false");
        } else if (a2 < 0 || a2 > arrayList.size() - 1) {
        } else {
            this.f = arrayList.get(a2);
            a(arrayList, sectionModel, a2);
            arrayList.remove(a2);
            arrayList.add(a2, sectionModel);
            containerData.updateBaseSections(arrayList);
            if (!z) {
                return;
            }
            this.c = true;
            ldf.d(lsk.SPLASH_BUSINESS_TAG, "TopShowInsert#triggerUiRefresh ");
            iContainerDataService.triggerEvent("OnlyUiRefresh", null);
        }
    }

    private int a(List<SectionModel> list, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f121c007", new Object[]{this, list, new Integer(i), str})).intValue();
        }
        SectionModel sectionModel = list.get(i);
        if (sectionModel == null) {
            return 0;
        }
        return sectionModel.getExt().getIntValue(str);
    }

    private void a(List<SectionModel> list, SectionModel sectionModel, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6441528f", new Object[]{this, list, sectionModel, new Integer(i)});
            return;
        }
        this.d = a(list, i, "marginSide");
        this.e = a(list, i, "marginTop");
        if (this.d == 0) {
            int i2 = i + 1;
            this.d = a(list, i2, "marginSide");
            this.e = a(list, i2, "marginTop");
        }
        JSONObject jSONObject = sectionModel.getJSONObject("ext");
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        jSONObject.put("marginSide", (Object) Integer.valueOf(this.d));
        jSONObject.put("marginTop", (Object) Integer.valueOf(this.e));
        ldf.d(lsk.SPLASH_BUSINESS_TAG, "TopShowInsert#setTopShowMargin: " + jSONObject);
    }

    public void a(b.a aVar) {
        View findItemViewByPosition;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b396a97", new Object[]{this, aVar});
            return;
        }
        IMainFeedsViewService iMainFeedsViewService = (IMainFeedsViewService) this.f30236a.a(IMainFeedsViewService.class);
        if (iMainFeedsViewService == null || (findItemViewByPosition = iMainFeedsViewService.findItemViewByPosition(this.b)) == null) {
            return;
        }
        int[] iArr = new int[2];
        findItemViewByPosition.getLocationInWindow(iArr);
        aVar.b = findItemViewByPosition.getWidth() - this.d;
        int height = findItemViewByPosition.getHeight();
        int i = this.e;
        aVar.c = height - i;
        aVar.d = iArr[0] + this.d;
        aVar.e = iArr[1] + i;
        aVar.f = gbg.b(Globals.getApplication(), 6.0f);
        ldf.d(lsk.SPLASH_BUSINESS_TAG, "TopShowInsert#calLocationData width: " + aVar.b + "，height:" + aVar.c + ",positionX:" + aVar.d + ",positionY:" + aVar.e + ",topShowView width:" + findItemViewByPosition.getWidth() + ",mMarginSide:" + this.d + ",mTargetPosition:" + this.b);
    }

    public int b(LinkedSplashData linkedSplashData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("526d8064", new Object[]{this, linkedSplashData})).intValue();
        }
        SectionModel c = c(linkedSplashData);
        int i = -1;
        if (c == null) {
            ldf.d(lsk.SPLASH_BUSINESS_TAG, "TopShowInsert#getSeekTime Section is null ");
            return -1;
        }
        JSONObject jSONObject = c.getJSONObject("ext");
        if (jSONObject == null) {
            ldf.d(lsk.SPLASH_BUSINESS_TAG, "TopShowInsert#getSeekTime ext is null");
            return -1;
        }
        String string = jSONObject.getString(FeedsData.KEY_VIDEO_CURRENT_POSITION);
        if (TextUtils.isEmpty(string)) {
            ldf.d(lsk.SPLASH_BUSINESS_TAG, "TopShowInsert#getSeekTime splashVideoCurrentPosition is null ");
            return -1;
        }
        try {
            i = Integer.parseInt(string);
        } catch (Exception e) {
            ldf.a(lsk.SPLASH_BUSINESS_TAG, "TopShowInsert#getSeekTime error ", e);
        }
        ldf.d(lsk.SPLASH_BUSINESS_TAG, "TopShowInsert#getSeekTime videoPosition " + i);
        return i;
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        IMainFeedsViewService iMainFeedsViewService = (IMainFeedsViewService) this.f30236a.a(IMainFeedsViewService.class);
        if (iMainFeedsViewService == null) {
            return false;
        }
        BaseSectionModel<?> findItemDataByPosition = iMainFeedsViewService.findItemDataByPosition(this.b);
        if (findItemDataByPosition == null) {
            ldf.d(lsk.SPLASH_BUSINESS_TAG, "TopShowInsert#isInsertSuccess sectionModel null");
            return false;
        }
        JSONObject jSONObject = findItemDataByPosition.getJSONObject("ext");
        if (jSONObject == null) {
            ldf.d(lsk.SPLASH_BUSINESS_TAG, "TopShowInsert#isInsertSuccess ext null");
            return false;
        }
        boolean booleanValue = jSONObject.getBooleanValue("isTopShowCard");
        ldf.d(lsk.SPLASH_BUSINESS_TAG, "TopShowInsert#isInsertSuccess isTopShowCard " + booleanValue);
        return booleanValue;
    }

    public SectionModel c(LinkedSplashData linkedSplashData) {
        JSONObject linkedData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SectionModel) ipChange.ipc$dispatch("4a3d78cf", new Object[]{this, linkedSplashData});
        }
        if (linkedSplashData != null && (linkedData = linkedSplashData.getLinkedData("feeds")) != null) {
            return new SectionModel(linkedData);
        }
        return null;
    }

    private boolean a(int i, boolean z) {
        View findItemViewByPosition;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c11929d", new Object[]{this, new Integer(i), new Boolean(z)})).booleanValue();
        }
        ldf.d(lsk.SPLASH_BUSINESS_TAG, "TopShowInsert#isColdStart:" + z);
        if (z) {
            return true;
        }
        IMainFeedsViewService iMainFeedsViewService = (IMainFeedsViewService) this.f30236a.a(IMainFeedsViewService.class);
        if (iMainFeedsViewService == null || (findItemViewByPosition = iMainFeedsViewService.findItemViewByPosition(i)) == null) {
            return false;
        }
        int top = findItemViewByPosition.getTop();
        int c = gbg.c(lcz.a());
        int bottom = findItemViewByPosition.getBottom();
        double b = gbg.b(lcz.a(), 171.0f) / 0.701d;
        ldf.d(lsk.SPLASH_BUSINESS_TAG, "TopShowInsert#enableInsertExposeRatio bottom " + bottom + ",Top:" + top + ",cardHeight:" + b);
        return top >= 0 && bottom <= c && b <= ((double) (c - top));
    }

    private int a(List<SectionModel> list, int i) {
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("19a074bd", new Object[]{this, list, new Integer(i)})).intValue();
        }
        if (i != -1) {
            return a(list, i, false);
        }
        String b = b();
        if (TextUtils.equals(b, "dynamic")) {
            this.b = a(list, false);
        } else if (TextUtils.equals(b, "lock1")) {
            b(list, false);
        } else {
            int size = list.size();
            boolean z = false;
            int i3 = 0;
            while (true) {
                if (i2 >= size) {
                    break;
                }
                SectionModel sectionModel = list.get(i2);
                if (sectionModel != null) {
                    String sectionBizCode = sectionModel.getSectionBizCode();
                    if (TextUtils.equals("mainAndSubSeparator", sectionBizCode) || z) {
                        if (TextUtils.equals("mainAndSubSeparator", sectionBizCode)) {
                            this.b = i2 + 1;
                            z = true;
                        } else {
                            i3++;
                            if (i3 > 2) {
                                break;
                            } else if (a(sectionModel)) {
                                this.b = i2;
                                break;
                            }
                        }
                    }
                }
                i2++;
            }
        }
        return this.b;
    }

    private int a(List<SectionModel> list, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("19a0b48e", new Object[]{this, list, new Boolean(z)})).intValue();
        }
        int size = list.size();
        int i = 0;
        int i2 = -1;
        for (int i3 = 0; i3 < size; i3++) {
            SectionModel sectionModel = list.get(i3);
            if (sectionModel != null) {
                String sectionBizCode = sectionModel.getSectionBizCode();
                if (TextUtils.equals("mainAndSubSeparator", sectionBizCode) || z) {
                    if (TextUtils.equals("mainAndSubSeparator", sectionBizCode)) {
                        i2 = i3 + 1;
                        z = true;
                    } else {
                        i++;
                        if (i > 2 || b(sectionModel)) {
                            return i3 - 1;
                        }
                    }
                }
            }
        }
        return i2;
    }

    private void b(List<SectionModel> list, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0266f3a", new Object[]{this, list, new Boolean(z)});
            return;
        }
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            SectionModel sectionModel = list.get(i2);
            if (sectionModel != null) {
                String sectionBizCode = sectionModel.getSectionBizCode();
                if (TextUtils.equals("mainAndSubSeparator", sectionBizCode) || z) {
                    if (TextUtils.equals("mainAndSubSeparator", sectionBizCode)) {
                        this.b = i2 + 1;
                        z = true;
                    } else {
                        i++;
                        if (i > 2) {
                            return;
                        }
                        if (a(sectionModel)) {
                            if (i == 2) {
                                int i3 = i2 - 1;
                                list.set(i2, list.get(i3));
                                list.set(i3, list.get(i2));
                                this.b = i3;
                                return;
                            } else if (i == 1) {
                                this.b = i2;
                                return;
                            } else {
                                this.b = i2;
                                return;
                            }
                        }
                    }
                }
            }
        }
    }

    private boolean a(BaseSectionModel<?> baseSectionModel) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bc98adb4", new Object[]{this, baseSectionModel})).booleanValue();
        }
        if (baseSectionModel.getExt().getBooleanValue("isTopShowCard")) {
            return true;
        }
        JSONObject jSONObject2 = baseSectionModel.getJSONObject("bizData");
        if (jSONObject2 == null || (jSONObject = jSONObject2.getJSONObject("itemPassParam")) == null) {
            return false;
        }
        String string = jSONObject.getString("x_object_type");
        return !TextUtils.isEmpty(string) && string.startsWith("k2brand");
    }

    private String b() {
        JSONObject topViewSplashData;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this});
        }
        IFirstScreenDataService iFirstScreenDataService = (IFirstScreenDataService) this.f30236a.a(IFirstScreenDataService.class);
        if (iFirstScreenDataService != null && (topViewSplashData = iFirstScreenDataService.getTopViewSplashData()) != null && (jSONObject = topViewSplashData.getJSONObject("ext")) != null) {
            return jSONObject.getString("topShowRule");
        }
        return null;
    }

    private boolean b(BaseSectionModel<?> baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("83a494b5", new Object[]{this, baseSectionModel})).booleanValue();
        }
        JSONObject ext = baseSectionModel.getExt();
        if (ext != null) {
            return TextUtils.equals(ext.getString("sectionCardType"), "activity_algo");
        }
        return false;
    }

    private int a(List<SectionModel> list, int i, boolean z) {
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1a6ed73d", new Object[]{this, list, new Integer(i), new Boolean(z)})).intValue();
        }
        while (true) {
            if (i2 >= list.size()) {
                break;
            }
            SectionModel sectionModel = list.get(i2);
            if (sectionModel != null) {
                String sectionBizCode = sectionModel.getSectionBizCode();
                if (TextUtils.equals("mainAndSubSeparator", sectionBizCode) || z) {
                    if (!TextUtils.equals("mainAndSubSeparator", sectionBizCode)) {
                        this.b = i + i2;
                        break;
                    }
                    z = true;
                }
            }
            i2++;
        }
        return this.b;
    }
}
