package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.gateway.exception.GatewayException;
import com.taobao.android.home.component.utils.e;
import java.util.List;

/* loaded from: classes8.dex */
public class oou implements gke {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ope f32237a;

    static {
        kge.a(491318628);
        kge.a(1464465151);
    }

    public oou(ope opeVar) throws GatewayException {
        if (opeVar == null) {
            throw new GatewayException("RecmdDataSource should not be null");
        }
        this.f32237a = opeVar;
    }

    @Override // tb.gke
    public void a(JSONObject jSONObject, gkc gkcVar) {
        List list;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff35999", new Object[]{this, jSONObject, gkcVar});
            return;
        }
        e.c("gateway2.expireTabs", "start action:", jSONObject.toJSONString());
        try {
            list = (List) jSONObject.get("containerIds");
            str = (String) jSONObject.get("expireType");
        } catch (Throwable th) {
            e.a("gateway2.expireTabs", th, new String[0]);
        }
        if (list == null || list.isEmpty() || TextUtils.isEmpty(str)) {
            return;
        }
        for (Object obj : list) {
            if (obj != null) {
                this.f32237a.a(obj.toString(), str);
            }
        }
        e.c("gateway2.expireTabs", "end action");
    }
}
