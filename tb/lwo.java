package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.gateway.exception.GatewayException;

/* loaded from: classes7.dex */
public class lwo implements gke {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private lwd f30950a;
    private lwz b;

    static {
        kge.a(2064413555);
        kge.a(1464465151);
    }

    public lwo(lwz lwzVar) throws GatewayException {
        if (lwzVar == null) {
            throw new GatewayException("dataServiceEngineContext should not be null");
        }
        this.f30950a = lwzVar.b();
        this.b = lwzVar;
    }

    @Override // tb.gke
    public void a(JSONObject jSONObject, gkc gkcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff35999", new Object[]{this, jSONObject, gkcVar});
        } else if (jSONObject == null || TextUtils.equals("download", jSONObject.getString("dataSourceType"))) {
        } else {
            String string = jSONObject.getString("containerId");
            if (TextUtils.equals(this.b.g(), string)) {
                return;
            }
            jSONObject.put("_msgType", "scrollToTop");
            a(string, this.f30950a, jSONObject);
        }
    }

    private void a(String str, lwd lwdVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58422e47", new Object[]{this, str, lwdVar, jSONObject});
            return;
        }
        lxg a2 = this.b.a(str);
        if (a2 == null) {
            return;
        }
        a2.c(lwdVar.a(str), jSONObject);
    }
}
