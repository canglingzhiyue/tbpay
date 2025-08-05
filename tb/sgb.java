package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;

/* loaded from: classes7.dex */
public class sgb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1345929673);
    }

    public void a(IContainerDataModel<?> iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2453afd3", new Object[]{this, iContainerDataModel});
        } else {
            sgd.a(b(iContainerDataModel));
        }
    }

    private JSONObject b(IContainerDataModel<?> iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("50f278d2", new Object[]{this, iContainerDataModel});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("enablePreLoadNewDetail", (Object) (sgc.a(iContainerDataModel) + ""));
        jSONObject.put("bucket", (Object) sgc.b(iContainerDataModel));
        return jSONObject;
    }
}
