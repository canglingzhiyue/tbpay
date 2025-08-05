package tb;

import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.b;
import com.alibaba.android.aura.f;
import com.alibaba.android.aura.q;
import com.alibaba.android.aura.service.event.AURAEventIO;
import com.alibaba.android.aura.service.event.d;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.adam.common.Util;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.log.TLog;
import java.util.HashMap;

@AURAExtensionImpl(code = "adam.impl.aspect.error.eventChain")
/* loaded from: classes4.dex */
public final class dnf implements aro {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public f f26866a;
    public AURAFlowData b;
    public aqs c;
    private dnh d = new dnh();
    private dna e;
    private AURAGlobalData f;

    static {
        kge.a(1588990115);
        kge.a(389606329);
    }

    @Override // tb.arl
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        }
    }

    @Override // tb.aro
    public void a(b bVar) {
        AURAEventIO aURAEventIO;
        DXRuntimeContext dXRuntimeContext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c671180", new Object[]{this, bVar});
        } else if ("true".equals(OrangeConfig.getInstance().getConfig("adam_android", "isDegradeAuraExt", "false")) || bVar.c() == null) {
        } else {
            try {
                aURAEventIO = (AURAEventIO) bVar.c().get("event");
            } catch (ClassCastException unused) {
                aURAEventIO = null;
            }
            if (aURAEventIO == null || (dXRuntimeContext = (DXRuntimeContext) aURAEventIO.getEventModel().c(d.EXT_KEY_DX_RUNTIME_CONTEXT)) == null) {
                return;
            }
            Object a2 = dXRuntimeContext.a();
            if (a2 instanceof art) {
                art artVar = (art) a2;
                if (artVar.f() == null) {
                    artVar.a(new HashMap());
                }
                artVar.f().put("adamAuraErrCb", this.c);
                artVar.f().put("adamAuraExtManager", this.f26866a);
                artVar.f().put("adamAuraFlowData", this.b);
                artVar.f().put("adamAuraGlobalData", this.f);
                artVar.f().put("adamAuraEventIo", aURAEventIO);
            }
            HashMap hashMap = new HashMap();
            HashMap<String, String> a3 = Util.a("aura", aURAEventIO.getEventType(), dXRuntimeContext);
            hashMap.put("utParams", a3);
            JSONObject jSONObject = new JSONObject();
            Util.a(aURAEventIO.getEventModel().e(), jSONObject);
            hashMap.put("event_adam_config", jSONObject);
            hashMap.put("auraTemplates", this.f.get("templates", JSONArray.class));
            hashMap.put("global_adam_config", this.f.get("adamConfig", JSONObject.class));
            if (this.e == null) {
                this.e = new dna();
            }
            dmz dmzVar = new dmz();
            dmzVar.a(hashMap);
            dmzVar.a(dXRuntimeContext);
            try {
                this.e.a(this.d, aURAEventIO.getEventModel().g(), new Object[]{aURAEventIO.getEventType(), aURAEventIO.getEventModel().c()}, dmzVar);
                Util.a("exposure_transAuraToEvChain", a3);
            } catch (Throwable th) {
                AppMonitor.Counter.commit("ADAM_MONITOR", "HandleEventByAura-ERROR", "msg = " + th.toString(), 1.0d);
                TLog.logi(null, "LOG_ADAM", "execute evChain from aura error: " + th.getMessage());
            }
        }
    }

    @Override // tb.ark
    public void onDataChanged(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, aqs aqsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21929b2a", new Object[]{this, aURAFlowData, aURAGlobalData, aqsVar});
            return;
        }
        this.f = aURAGlobalData;
        this.b = aURAFlowData;
        this.c = aqsVar;
    }

    @Override // tb.arl
    public void onCreate(q qVar, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b74b967f", new Object[]{this, qVar, fVar});
        } else {
            this.f26866a = fVar;
        }
    }
}
