package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel;
import com.taobao.infoflow.protocol.subservice.base.IConfigService;

/* loaded from: classes.dex */
public class lrz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ljs f30882a;

    static {
        kge.a(-220236811);
    }

    public lrz(ljs ljsVar) {
        this.f30882a = ljsVar;
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        IConfigService iConfigService = (IConfigService) this.f30882a.a(IConfigService.class);
        if (iConfigService != null) {
            return iConfigService.getBooleanValue("smartLoadingEnable", true);
        }
        return false;
    }

    public boolean a(IContainerDataModel<?> iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2453afd7", new Object[]{this, iContainerDataModel})).booleanValue();
        }
        JSONObject b = b(iContainerDataModel);
        if (b == null) {
            ldf.d("SmartLoadingEnable", "homeGlobalAbTest == null");
            return false;
        }
        return b.getBooleanValue("aiRequestV2");
    }

    private JSONObject b(IContainerDataModel<?> iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("50f278d2", new Object[]{this, iContainerDataModel});
        }
        if (iContainerDataModel == null) {
            ldf.d("SmartLoadingEnable", "containerDataModel == null");
            return null;
        }
        IContainerInnerDataModel<?> base = iContainerDataModel.getBase();
        if (base == null) {
            ldf.d("SmartLoadingEnable", "baseData == null");
            return null;
        }
        JSONObject ext = base.getExt();
        if (ext == null) {
            ldf.d("SmartLoadingEnable", "ext == null");
            return null;
        }
        return ext.getJSONObject("homeGlobalABTest");
    }
}
