package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.external.UCPManager;
import com.taobao.android.home.component.utils.m;
import com.taobao.homepage.pop.utils.c;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;

/* loaded from: classes7.dex */
public class sgf implements IContainerDataService.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1636565544);
        kge.a(616420927);
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.b
    public void a(lli lliVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("552c8b59", new Object[]{this, lliVar, str});
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.b
    public void a(lli lliVar, IContainerDataModel<?> iContainerDataModel, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d905f556", new Object[]{this, lliVar, iContainerDataModel, str});
        } else if (iContainerDataModel == null) {
        } else {
            IContainerInnerDataModel<?> base = iContainerDataModel.getBase();
            if (base == null) {
                c.a("PopUcpController", "base data is null, requestType: " + str);
                return;
            }
            JSONObject ext = base.getExt();
            if (ext == null) {
                c.a("PopUcpController", "ext data is null");
                return;
            }
            JSONObject jSONObject = ext.getJSONObject("lTVHPopPlan");
            if (jSONObject == null) {
                c.a("PopUcpController", "ltv pop plans is null");
                return;
            }
            UCPManager.b(jSONObject);
            c.a("PopUcpController", "register ltv pop plans: " + jSONObject.toJSONString());
            if (!StringUtils.equals(str, "coldStart")) {
                return;
            }
            a();
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.b
    public void a(lli lliVar, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74bec7ed", new Object[]{this, lliVar, str, str2, str3});
        } else if (!StringUtils.equals(str3, "coldStart")) {
        } else {
            a();
        }
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        Boolean bool = (Boolean) m.a().a("homeNetLowOptimization", Boolean.class);
        if (bool != null && bool.booleanValue() && StringUtils.equals(ldc.a(), "l")) {
            return;
        }
        UCPManager.a(JSONObject.parseObject("{\"Page_Home_Cold_Start_Ready\": {\"data\": \"true\"}}"), "Page_Home_Cold_Start");
        c.a("PopUcpController", "notify cold start finished");
    }
}
