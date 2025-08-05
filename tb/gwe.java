package tb;

import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.utils.UserLocation;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.layoutmanager.module.LBSModule;
import com.taobao.location.client.TBLocationClient;
import com.taobao.location.common.TBLocationDTO;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public class gwe {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-648267951);
    }

    public static Map<String, Object> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a014a89d", new Object[0]);
        }
        try {
            TBLocationDTO b = b();
            HashMap hashMap = new HashMap(10);
            if (b != null) {
                hashMap.put("latitude", b.latitude);
                hashMap.put("longitude", b.longitude);
                hashMap.put("provinceCode", b.provinceCode);
                hashMap.put(noa.KEY_CITY_CODE, b.cityCode);
                hashMap.put("altitude", b.altitude);
                hashMap.put("areaCode", b.areaCode);
                hashMap.put(UserLocation.KEY_DOUBLE_ACCURACY, b.accuracy);
                hashMap.put("type", b.locationType);
            }
            return hashMap;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public static TBLocationDTO b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBLocationDTO) ipChange.ipc$dispatch("d17750dd", new Object[0]);
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("cachemode", (Object) LBSModule.a.LOCATION_MODE_ONLY_CACHE);
            jSONObject.put("timeLimit", (Object) "1d");
            jSONObject.put(UserLocation.KEY_DOUBLE_ACCURACY, (Object) "hundredMeters");
            return TBLocationClient.a(LBSModule.a.a(jSONObject));
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }
}
