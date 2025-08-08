package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.common.model.b;
import com.taobao.android.ultron.datamodel.imp.DMEvent;
import java.util.List;

/* loaded from: classes7.dex */
public class mww {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1919488515);
    }

    public static b a(List<IDMComponent> list, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("4a3644ce", new Object[]{list, jSONObject});
        }
        if (jSONObject == null || jSONObject.isEmpty()) {
            return null;
        }
        String string = jSONObject.getString("type");
        JSONObject jSONObject2 = jSONObject.getJSONObject("fields");
        if (StringUtils.isEmpty(jSONObject2 == null ? "" : jSONObject2.getString("nextRenderRoot"))) {
            list = null;
        }
        return new DMEvent(string, jSONObject2, list);
    }
}
