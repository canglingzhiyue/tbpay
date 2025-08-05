package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.gateway.exception.GatewayException;
import com.taobao.android.home.component.utils.e;
import com.taobao.tao.linklog.a;
import com.taobao.tao.recommend3.gateway.request.b;
import com.taobao.tao.recommend3.gateway.request.c;

/* loaded from: classes8.dex */
public class oox implements gke {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private b f32244a;

    static {
        kge.a(-1899208780);
        kge.a(1464465151);
    }

    public oox(ope opeVar, c cVar) throws GatewayException {
        if (cVar != null) {
            if (opeVar == null) {
                throw new GatewayException("RecmdDataSource should not be null");
            }
            this.f32244a = new b(opeVar, cVar);
            return;
        }
        throw new GatewayException("RecmdRequestService should not be null");
    }

    @Override // tb.gke
    public void a(final JSONObject jSONObject, final gkc gkcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff35999", new Object[]{this, jSONObject, gkcVar});
            return;
        }
        e.c("gateway2.request", "start action:", jSONObject.toJSONString());
        a.a("netRequest", "gateway2.request", "start action");
        this.f32244a.a(jSONObject, new b.a() { // from class: tb.oox.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.recommend3.gateway.request.b.a
            public void a(JSONObject jSONObject2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("266fb88", new Object[]{this, jSONObject2});
                    return;
                }
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("dataModel", jSONObject2.get("dataModel"));
                jSONObject3.put("bizParam", jSONObject.get("bizParam"));
                gkcVar.a("success", jSONObject3, null);
            }

            @Override // com.taobao.tao.recommend3.gateway.request.b.a
            public void b(JSONObject jSONObject2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("63b99827", new Object[]{this, jSONObject2});
                    return;
                }
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("errorMsg", (Object) jSONObject2.getString("errorMsg"));
                jSONObject3.put("errorCode", (Object) jSONObject2.getString("errorCode"));
                jSONObject3.put("bizParam", jSONObject.get("bizParam"));
                gkcVar.a("fail", jSONObject3, null);
            }
        });
    }
}
