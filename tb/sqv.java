package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.utils.e;

/* loaded from: classes7.dex */
public class sqv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f33848a;

    static {
        kge.a(1487023088);
        f33848a = true;
    }

    public static boolean a(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("266fb8c", new Object[]{jSONObject})).booleanValue();
        }
        if (jSONObject == null) {
            jSONObject2 = null;
        } else {
            try {
                jSONObject2 = jSONObject.getJSONObject("ext");
            } catch (Exception e) {
                e.e("SearchBarEnableUtil", "isExpandNaviBarSwitchEnable, parse data error" + e);
            }
        }
        if (jSONObject2 != null && jSONObject2.getBooleanValue("isExpandNaviBar")) {
            return f33848a;
        }
        return true;
    }
}
