package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.address.b;
import com.taobao.android.address.model.AddressInfo;
import com.taobao.android.address.model.RecommendedAddress;
import com.taobao.tao.Globals;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class orc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1935691116);
    }

    @Deprecated
    public static void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{jSONObject});
            return;
        }
        RecommendedAddress a2 = b.a(Globals.getApplication(), "tb_homepage");
        if (a2 == null || a2.recommendedAddress == null) {
            return;
        }
        AddressInfo addressInfo = a2.recommendedAddress;
        jSONObject.put("globalProvinceCode", (Object) addressInfo.provinceDivisionCode);
        jSONObject.put("globalCityCode", (Object) addressInfo.cityDivisionCode);
        jSONObject.put("globalAreaCode", (Object) addressInfo.areaDivisionCode);
        jSONObject.put("globalTownCode", (Object) addressInfo.townDivisionCode);
        jSONObject.put("globalLng", (Object) addressInfo.lng);
        jSONObject.put("globalLat", (Object) addressInfo.lat);
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[0]);
        }
        RecommendedAddress a2 = b.a(Globals.getApplication(), "tb_homepage");
        if (a2 == null || a2.recommendedAddress == null) {
            return null;
        }
        try {
            return JSON.toJSONString(a(a2.recommendedAddress));
        } catch (Exception e) {
            lap.a("MTopRequest", "getGlobalLbs", "数据转换出现异常：" + e);
            return "";
        }
    }

    private static Map<String, String> a(AddressInfo addressInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("ef5bdc9e", new Object[]{addressInfo});
        }
        HashMap hashMap = new HashMap(10);
        hashMap.put("globalProvinceCode", addressInfo.provinceDivisionCode);
        hashMap.put("globalCityCode", addressInfo.cityDivisionCode);
        hashMap.put("globalAreaCode", addressInfo.areaDivisionCode);
        hashMap.put("globalTownCode", addressInfo.townDivisionCode);
        hashMap.put("globalLng", addressInfo.lng);
        hashMap.put("globalLat", addressInfo.lat);
        return hashMap;
    }
}
