package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.bootimage.data.SplashInteractData;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import java.util.List;

/* loaded from: classes7.dex */
public class lso {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final float f30898a = 1.0f;
    private float b = 1.0f;
    private ljs c;

    static {
        kge.a(31155623);
    }

    public lso(ljs ljsVar) {
        this.c = ljsVar;
    }

    public JSONObject a(IContainerInnerDataModel iContainerInnerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("27067895", new Object[]{this, iContainerInnerDataModel});
        }
        ldf.d(lsk.SPLASH_BUSINESS_TAG, "parseSplashData->  begin ----- ");
        if (iContainerInnerDataModel == null) {
            ldf.d(lsk.SPLASH_BUSINESS_TAG, "parseSplashData->  baseData is null, end just return null.");
            return null;
        }
        JSONObject topViewSplashSection = iContainerInnerDataModel.getTopViewSplashSection();
        if (topViewSplashSection == null) {
            ldf.d(lsk.SPLASH_BUSINESS_TAG, "parseSplashData->  end jsonObject not available.");
            return null;
        }
        ldf.d(lsk.SPLASH_BUSINESS_TAG, "parseSplashData->  end with success");
        return topViewSplashSection;
    }

    public boolean b(IContainerInnerDataModel iContainerInnerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("edf4efa", new Object[]{this, iContainerInnerDataModel})).booleanValue();
        }
        if (iContainerInnerDataModel == null || iContainerInnerDataModel.getExt() == null) {
            ldf.d(lsk.SPLASH_BUSINESS_TAG, "isNeedUpdateSplashData->   baseData == null");
            lsj.b("0", "baseData == null", "");
            return false;
        }
        boolean booleanValue = iContainerInnerDataModel.getExt().getBooleanValue("updateTopview");
        if (!booleanValue) {
            ldf.d(lsk.SPLASH_BUSINESS_TAG, "isNeedUpdateSplashData, updateTopview is false, no need update splash data.");
            lsj.b("0", "!isNeedUpdateSplashData", "");
        } else {
            ldf.d(lsk.SPLASH_BUSINESS_TAG, "isNeedUpdateSplashData, updateTopview is true, need update splash data.");
        }
        return booleanValue;
    }

    public float a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c58", new Object[]{this})).floatValue() : this.b;
    }

    public boolean a(SplashInteractData splashInteractData, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cfc74703", new Object[]{this, splashInteractData, new Integer(i)})).booleanValue();
        }
        ldf.d(lsk.SPLASH_BUSINESS_TAG, "start - updateSliderData()");
        if (splashInteractData == null || splashInteractData.banner == null || splashInteractData.banner.isEmpty()) {
            ldf.d(lsk.SPLASH_BUSINESS_TAG, "splashAnimationBegin -> data == null || data.banner == null || data.banner.isEmpty()");
            lsj.a("0", "data == null || data.banner == null || data.banner.isEmpty()", "");
            return false;
        }
        try {
            if (i == -1) {
                ldf.d(lsk.SPLASH_BUSINESS_TAG, "updateSliderData->   sliderDataPosition == RecyclerView.NO_POSITION");
                lsj.a("0", "sliderDataPosition == RecyclerView.NO_POSITION", splashInteractData.traceId);
                return false;
            }
            List<SectionModel> b = b();
            if (b != null && !b.isEmpty()) {
                SectionModel sectionModel = b.get(i);
                if (sectionModel == null) {
                    ldf.d(lsk.SPLASH_BUSINESS_TAG, "updateSliderData->   oldData == null");
                    lsj.a("0", "oldData == null", splashInteractData.traceId);
                    return false;
                }
                SectionModel sectionModel2 = new SectionModel(JSON.parseObject(sectionModel.toJSONString()));
                JSONObject jSONObject = sectionModel2.getJSONObject("subSection");
                if (jSONObject == null) {
                    ldf.d(lsk.SPLASH_BUSINESS_TAG, "updateSliderData->   subSection == null");
                    lsj.a("0", "subSection == null", splashInteractData.traceId);
                    return false;
                }
                jSONObject.put("0", (Object) JSON.parseObject(splashInteractData.banner.toJSONString()));
                ldf.d(lsk.SPLASH_BUSINESS_TAG, "updateSliderData->    oldData=" + Integer.toHexString(sectionModel.hashCode()) + ",   newData=" + Integer.toHexString(sectionModel2.hashCode()));
                b.set(i, sectionModel2);
                lsj.a("1", "", splashInteractData.traceId);
                return true;
            }
            return false;
        } catch (Throwable th) {
            ldf.a(lsk.SPLASH_BUSINESS_TAG, "updateSliderData:", th);
            lsj.a("0", lsj.a(th), splashInteractData.traceId);
            return false;
        }
    }

    public List<SectionModel> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("4a17df3e", new Object[]{this});
        }
        IContainerDataService iContainerDataService = (IContainerDataService) this.c.a(IContainerDataService.class);
        if (iContainerDataService != null) {
            return iContainerDataService.getContainerData().getTotalData();
        }
        return null;
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        IContainerDataService iContainerDataService = (IContainerDataService) this.c.a(IContainerDataService.class);
        return iContainerDataService != null && !iContainerDataService.getContainerData().getBase().isAbandoned();
    }
}
