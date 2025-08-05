package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.address.b;
import com.taobao.android.address.model.AddressInfo;
import com.taobao.android.address.model.RecommendedAddress;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.response.AwesomeGetContainerData;
import com.taobao.tao.Globals;

/* loaded from: classes7.dex */
public class ltu extends ltp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(2025578836);
    }

    public static /* synthetic */ Object ipc$super(ltu ltuVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public ltu(ljs ljsVar) {
        super(ljsVar);
    }

    @Override // tb.ltp
    public JSONObject a(AwesomeGetContainerData awesomeGetContainerData, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("ee76f892", new Object[]{this, awesomeGetContainerData, jSONObject});
        }
        JSONObject jSONObject2 = new JSONObject();
        a(jSONObject2);
        return jSONObject2;
    }

    private void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
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
}
