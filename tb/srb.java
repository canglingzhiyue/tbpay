package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.datamodel.imp.b;

/* loaded from: classes6.dex */
public final class srb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1379459725);
    }

    public static boolean a(jny jnyVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7db5835", new Object[]{jnyVar, new Boolean(z)})).booleanValue();
        }
        if (jnyVar instanceof b) {
            return a(((b) jnyVar).z(), z);
        }
        return false;
    }

    private static boolean a(JSONObject jSONObject, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4a792850", new Object[]{jSONObject, new Boolean(z)})).booleanValue();
        }
        if (jSONObject == null) {
            return false;
        }
        boolean booleanValue = jSONObject.getBooleanValue("onlyRefreshFooter");
        if (z) {
            jSONObject.remove("onlyRefreshFooter");
        }
        return booleanValue;
    }
}
