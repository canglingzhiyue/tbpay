package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.gateway.exception.GatewayException;
import com.taobao.android.gateway.msgcenter.b;

/* loaded from: classes7.dex */
public class lxd implements lxi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f30966a = oqc.GATEWAY_DEFAULT_CONFIG_JSON;
    private gjv b;
    private lxj c;
    private b d;
    private lxk e;

    static {
        kge.a(-931403028);
        kge.a(904939542);
    }

    public lxd(lwz lwzVar, lxk lxkVar) {
        gjv.a(lwzVar.e(), lwzVar.f());
        this.e = lxkVar;
        try {
            this.b = a(lwzVar);
            this.d = new b();
            this.b.a(this.d);
            a(this.b, lwzVar);
        } catch (GatewayException e) {
            e.printStackTrace();
        }
        this.c = new lxe(lwzVar, this.d);
    }

    private boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.e.a();
    }

    private gjv a(lwz lwzVar) throws GatewayException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gjv) ipChange.ipc$dispatch("22e0c0aa", new Object[]{this, lwzVar});
        }
        if (a()) {
            this.b = new gjv(lwzVar.b().a(), new gkj(lwzVar.b().a(), "gateway2/info_flow_gateway2.json", oqc.GATEWAY_DEFAULT_CONFIG_JSON, true).a());
        } else {
            this.b = new gjv(lwzVar.b().a(), "gateway2/info_flow_gateway2.json", oqc.GATEWAY_DEFAULT_CONFIG_JSON);
        }
        return this.b;
    }

    private void a(gjv gjvVar, lwz lwzVar) throws GatewayException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b67cd0c6", new Object[]{this, gjvVar, lwzVar});
            return;
        }
        gjvVar.a(new lwl(lwzVar), "newface.loadCache");
        gjvVar.a(new lwn(lwzVar), "newface.request");
        gjvVar.a(new lwk(lwzVar), "newface.dataProcess");
        gjvVar.a(new lwp(lwzVar), "newface.uiRefresh");
        gjvVar.a(new lwo(lwzVar), "newface.scrollToTop");
        gjvVar.a(new lwj(lwzVar), "newface.dataDelete");
        gjvVar.a(new lwm(lwzVar), "newface.playerQueue");
        gjvVar.a(new lwq(lwzVar), "newface.widgetPostMsg");
    }

    @Override // tb.lxi
    public boolean a(String str, String[] strArr, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a5a34ce7", new Object[]{this, str, strArr, jSONObject})).booleanValue();
        }
        lxl.c("ControlGateway", "state : " + str + ", containers : " + strArr + ", stateParams : " + jSONObject);
        return this.c.a(str, strArr, jSONObject);
    }
}
