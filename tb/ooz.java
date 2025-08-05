package tb;

import android.os.Handler;
import android.os.Looper;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.gateway.exception.GatewayException;
import com.taobao.android.home.component.utils.e;
import com.taobao.tao.homepage.d;
import com.taobao.tao.linklog.a;
import com.taobao.tao.recommend3.gateway.msgcenter.RecmdContainerMsg;

/* loaded from: classes8.dex */
public class ooz implements gke {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ope f32247a;
    private Handler b = new Handler(Looper.getMainLooper());

    static {
        kge.a(-180056788);
        kge.a(1464465151);
    }

    public static /* synthetic */ void a(ooz oozVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b41370b2", new Object[]{oozVar, jSONObject});
        } else {
            oozVar.a(jSONObject);
        }
    }

    public ooz(ope opeVar) throws GatewayException {
        if (opeVar == null) {
            throw new GatewayException("RecmdDataSource should not be null");
        }
        this.f32247a = opeVar;
    }

    @Override // tb.gke
    public void a(final JSONObject jSONObject, gkc gkcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff35999", new Object[]{this, jSONObject, gkcVar});
        } else if (jSONObject == null) {
        } else {
            a.a("umbrella.component.render", "gateway2.uiRefresh", "start action");
            if (opb.b()) {
                a(jSONObject);
            } else {
                this.b.post(new Runnable() { // from class: tb.ooz.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            ooz.a(ooz.this, jSONObject);
                        }
                    }
                });
            }
        }
    }

    private void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        jSONObject.put("_msgType", "uiRefresh");
        if (!d.c(this.f32247a.a()).a(RecmdContainerMsg.getMessage(jSONObject))) {
            kxf.a().a(kxv.a(jSONObject, false));
        }
        e.c("gateway2.uiRefresh", "end action");
        a.a("umbrella.component.render", "gateway2.uiRefresh", "end action");
    }
}
