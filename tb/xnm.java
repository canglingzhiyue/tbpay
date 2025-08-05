package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes7.dex */
public class xnm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1291097396);
    }

    public static void a(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c194ce8", new Object[]{new Boolean(z), new Boolean(z2)});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("isRealSmartRefreshFlag", (Object) Boolean.valueOf(z2));
        jSONObject.put("enableSearchBackRefresh", (Object) Boolean.valueOf(z));
        ldl.a("Page_Home", 19997, "smart_refresh_scroll_rate", "page_back_number", "", jSONObject.toString());
    }

    public static void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{new Boolean(z)});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("isRealSmartRefreshFlag", (Object) Boolean.valueOf(z));
        ldl.a("Page_Home", 19997, "smart_refresh_scroll_rate", "slide_downward_number", null, jSONObject.toString());
    }
}
