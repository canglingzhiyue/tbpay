package tb;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.b;
import com.alibaba.android.aura.datamodel.nextrpc.a;
import com.alibaba.android.aura.f;
import com.alibaba.android.aura.q;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;

@AURAExtensionImpl(code = "tbwaitpay.impl.aspect.error.submit")
/* loaded from: classes6.dex */
public final class jtq extends jte {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Context b;
    private q d;

    static {
        kge.a(-679286528);
    }

    public static /* synthetic */ Object ipc$super(jtq jtqVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.jte, tb.ark
    public void onDataChanged(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, aqs aqsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21929b2a", new Object[]{this, aURAFlowData, aURAGlobalData, aqsVar});
        }
    }

    @Override // tb.jte, tb.arl
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        }
    }

    @Override // tb.jte, tb.arl
    public void onCreate(q qVar, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b74b967f", new Object[]{this, qVar, fVar});
            return;
        }
        this.d = qVar;
        this.b = qVar.e();
    }

    @Override // tb.aro
    public void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c671180", new Object[]{this, bVar});
            return;
        }
        String a2 = bVar.a();
        Map<String, Object> c = bVar.c();
        if (TextUtils.isEmpty(a2) || c == null) {
            return;
        }
        if ("AURANextRPCServiceDomain".equals(bVar.f())) {
            Object obj = c.get("NextRPCRemoteResponse");
            if (!(obj instanceof a)) {
                return;
            }
            a aVar = (a) obj;
            if (a(this.d, aVar)) {
                a(this.b, aVar);
                return;
            }
            MtopResponse g = aVar.g();
            if (g == null) {
                return;
            }
            String retCode = g.getRetCode();
            int responseCode = g.getResponseCode();
            if ("FAIL_SYS_SESSION_EXPIRED".equals(retCode) || responseCode == 419) {
                c();
                a(bVar, true);
                return;
            }
            a(bVar, false);
            return;
        }
        a(bVar, false);
    }

    private void a(Context context, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f360a0c6", new Object[]{this, context, aVar});
        } else if (!(context instanceof Activity) || !a(aVar)) {
        } else {
            dux.c(context);
        }
    }

    private boolean a(a aVar) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6572dad2", new Object[]{this, aVar})).booleanValue();
        }
        JSONObject f = aVar.f();
        if (bau.a(f)) {
            return false;
        }
        JSONObject jSONObject3 = f.getJSONObject("data");
        if (!bau.a(jSONObject3) && (jSONObject = jSONObject3.getJSONObject("global")) != null && (jSONObject2 = jSONObject.getJSONObject("feature")) != null) {
            return Boolean.parseBoolean(jSONObject2.getString("tbRefreshCart"));
        }
        return false;
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        Context context = this.b;
        if (!(context instanceof Activity)) {
            return;
        }
        ((Activity) context).finish();
    }

    private void a(b bVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("607bd154", new Object[]{this, bVar, new Boolean(z)});
            return;
        }
        dug dugVar = (dug) this.d.a("submit_callback", dug.class);
        if (dugVar == null) {
            return;
        }
        dugVar.a(bVar, z);
    }
}
