package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.utils.h;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;

/* loaded from: classes7.dex */
public class lpy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(738494820);
    }

    public void a(BaseSectionModel<?> baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc98adb0", new Object[]{this, baseSectionModel});
        } else if (baseSectionModel == null || baseSectionModel.getJSONObject(h.TRACK_EXPOSURE_PARAM) == null) {
        } else {
            ljh.a(baseSectionModel, (JSONObject) null);
        }
    }

    public void a(BaseSectionModel<?> baseSectionModel, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22760340", new Object[]{this, baseSectionModel, jSONObject});
        } else if (baseSectionModel == null || jSONObject == null || jSONObject.getJSONObject("clickParam") == null) {
        } else {
            ljh.a(baseSectionModel, jSONObject, (JSONObject) null);
        }
    }
}
