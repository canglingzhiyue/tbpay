package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.gateway.util.a;

/* loaded from: classes.dex */
public class gkd implements gke {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private gjz c;
    private final String b = "BizContextRecordAction";

    /* renamed from: a  reason: collision with root package name */
    public final String f28361a = "_bizId";

    static {
        kge.a(-206250658);
        kge.a(1464465151);
    }

    public gkd(gjz gjzVar) {
        this.c = gjzVar;
    }

    @Override // tb.gke
    public void a(JSONObject jSONObject, gkc gkcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff35999", new Object[]{this, jSONObject, gkcVar});
        } else if (this.c == null || jSONObject == null) {
            a.b("BizContextRecordAction", "gatewayPageContext == null");
        } else {
            String string = jSONObject.getString("_bizId");
            if (TextUtils.isEmpty(string)) {
                a.b("BizContextRecordAction", "bizId isEmpty");
                return;
            }
            JSONObject a2 = this.c.a(string);
            if (a2 == null) {
                return;
            }
            jSONObject.remove("_bizId");
            a2.putAll(jSONObject);
        }
    }
}
