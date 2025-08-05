package tb;

import android.app.Activity;
import com.alibaba.android.aura.b;
import com.alibaba.android.aura.c;
import com.alibaba.android.aura.datamodel.nextrpc.a;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.purchase.aura.utils.d;
import mtopsdk.mtop.domain.MtopResponse;

/* loaded from: classes6.dex */
public abstract class idd extends idc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(890341942);
    }

    public static /* synthetic */ Object ipc$super(idd iddVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public abstract void a(boolean z, JSONObject jSONObject, String str, String str2, String str3);

    @Override // tb.aro
    public void a(b bVar) {
        c e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c671180", new Object[]{this, bVar});
            return;
        }
        String a2 = bVar.a();
        if ("-3003_PROTOCOL_DEGRADE".equals(a2)) {
            if (!(b().e() instanceof Activity)) {
                return;
            }
            igd.a((Activity) b().e(), igd.d);
            return;
        }
        if ("AURANextRPCServiceDomain".equals(bVar.f())) {
            a aVar = (a) bbc.a(bVar.c(), "NextRPCRemoteResponse", a.class, null);
            if (aVar == null) {
                a().a(new b(1, idc.ERROR_DOMAIN, "emptyRemoteResponse", "RemoteResponse为空"));
                return;
            }
            String a3 = aVar.a();
            MtopResponse g = aVar.g();
            if (g == null) {
                a().a(new b(1, idc.ERROR_DOMAIN, "emptyMtopResponse", "MtopResponse为空"));
                return;
            } else if (!"F-10000-00-15-002".equals(a3) || (e = bVar.e()) == null) {
                return;
            } else {
                String d = e.d();
                if ("aura.workflow.adjust".equals(d) || com.taobao.android.buy.internal.a.DEFAULT_AURA_BUY_MAIN_FLOW.equals(d) || "aura.workflow.request".equals(d)) {
                    a(true, null, "serviceError", a3, d.a(g));
                    return;
                }
            }
        }
        if ("-3000_EMPTY_PROTOCOL_VERSION_BELOW_4".equals(a2) || "-3001_BUY2_DOWNGRADE".equals(a2)) {
            a(true, b(bVar), "protocolDegrade", a2, null);
            return;
        }
        String f = bVar.f();
        if (bVar.d() != 0 || "AURANextRPCServiceDomain".equals(f)) {
            return;
        }
        if ("confirmOrder".equals(b().d()) && "-1000_EMPTY_RENDER_TREE".equals(a2)) {
            return;
        }
        a(false, null, "auraError", a2, null);
    }

    private JSONObject b(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("55bf34a1", new Object[]{this, bVar}) : (JSONObject) bbc.a(bVar.c(), "NextRPCRemoteResponseJson", JSONObject.class, null);
    }
}
