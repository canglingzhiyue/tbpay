package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.response.AwesomeGetContainerData;
import com.taobao.themis.kernel.i;

/* loaded from: classes7.dex */
public class ltq extends ltp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-721296181);
    }

    public static /* synthetic */ Object ipc$super(ltq ltqVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public ltq(ljs ljsVar) {
        super(ljsVar);
    }

    @Override // tb.ltp
    public JSONObject a(AwesomeGetContainerData awesomeGetContainerData, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("ee76f892", new Object[]{this, awesomeGetContainerData, jSONObject});
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("currentRequestType", (Object) a(jSONObject));
        a(jSONObject2, jSONObject);
        a(jSONObject2, awesomeGetContainerData);
        return jSONObject2;
    }

    private String a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("15c87a18", new Object[]{this, jSONObject}) : jSONObject.getString(i.CDN_REQUEST_TYPE);
    }

    private void a(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f32d068", new Object[]{this, jSONObject, jSONObject2});
            return;
        }
        JSONObject jSONObject3 = (JSONObject) jSONObject2.get("bizParam");
        if (jSONObject3 == null) {
            return;
        }
        jSONObject.putAll(jSONObject3);
    }

    private void a(JSONObject jSONObject, AwesomeGetContainerData awesomeGetContainerData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("556e6c5e", new Object[]{this, jSONObject, awesomeGetContainerData});
        } else if (awesomeGetContainerData.getBase() == null || TextUtils.isEmpty(awesomeGetContainerData.getBase().getExpireType())) {
        } else {
            jSONObject.put("expireAction", (Object) awesomeGetContainerData.getBase().getExpireType());
        }
    }
}
