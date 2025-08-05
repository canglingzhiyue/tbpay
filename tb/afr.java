package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import tb.fpd;

/* loaded from: classes5.dex */
public class afr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1821707513);
    }

    public static boolean a(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e66567f0", new Object[]{iDMComponent})).booleanValue();
        }
        JSONObject jSONObject = iDMComponent.getData().getJSONObject("fields");
        if (jSONObject != null && jSONObject.containsKey("dependency")) {
            return fqr.a(fnk.a(jSONObject.getString("dependency"), "", new fpd.a().b(iDMComponent.getData()).a()));
        }
        return true;
    }
}
