package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.framework.IHostService;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.response.AwesomeGetContainerData;

/* loaded from: classes7.dex */
public class ltw extends ltp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1114543437);
    }

    public static /* synthetic */ Object ipc$super(ltw ltwVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public ltw(ljs ljsVar) {
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
        IHostService iHostService = (IHostService) a().a(IHostService.class);
        if (iHostService == null) {
            ldf.d("HostPassParams2BizParamsGenerator", "bizParamsAddMainContainerParams hostService == null");
            return;
        }
        lkb c = iHostService.getInvokeCallback().c();
        if (c == null) {
            ldf.d("HostPassParams2BizParamsGenerator", "bizParamsAddMainContainerParams naviBarCallback == null");
            return;
        }
        JSONObject b = c.b();
        if (b == null) {
            return;
        }
        jSONObject.putAll(b);
    }
}
