package tb;

import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.b;
import com.alibaba.android.aura.datamodel.c;
import com.alibaba.android.aura.datamodel.parse.AURAParseIO;
import com.alibaba.android.aura.f;
import com.alibaba.android.aura.q;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;

@AURAExtensionImpl(code = "alibuy.impl.event.submit.business.default")
/* loaded from: classes4.dex */
public final class duf implements ayl {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String USER_CONTEXT_KEY_SUBMIT_CALLBACK = "submit_callback";
    public static final String USER_CONTEXT_KEY_SUBMIT_RPC_PARAMS = "submit_rpc_params";

    /* renamed from: a  reason: collision with root package name */
    private AURAGlobalData f26986a;
    private q b;
    private final aqq c = new aqq() { // from class: tb.duf.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.aqq, tb.aqs
        public void a(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2c671180", new Object[]{this, bVar});
            }
        }

        @Override // tb.aqq
        public void a(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6b8a7af", new Object[]{this, cVar});
            } else if (cVar == null) {
            } else {
                Serializable b = cVar.b();
                if (!(b instanceof AURAParseIO)) {
                    return;
                }
                AURAParseIO aURAParseIO = (AURAParseIO) b;
                if (aURAParseIO.getData().isEmpty() || aURAParseIO.getData().get(0) == null) {
                    return;
                }
                JSONObject a2 = aURAParseIO.getData().get(0).a();
                dux.a(duf.a(duf.this).e(), duf.a(duf.this, a2));
                dug dugVar = (dug) duf.a(duf.this).a("submit_callback", dug.class);
                if (dugVar == null) {
                    return;
                }
                dugVar.a(duf.a(duf.this), duf.b(duf.this));
                dugVar.a(a2);
            }
        }
    };

    static {
        kge.a(-994232594);
        kge.a(504819653);
    }

    @Override // tb.arl
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        }
    }

    public static /* synthetic */ q a(duf dufVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (q) ipChange.ipc$dispatch("17b98edc", new Object[]{dufVar}) : dufVar.b;
    }

    public static /* synthetic */ String a(duf dufVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3e6249b3", new Object[]{dufVar, jSONObject}) : dufVar.a(jSONObject);
    }

    public static /* synthetic */ AURAGlobalData b(duf dufVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AURAGlobalData) ipChange.ipc$dispatch("4bc3505a", new Object[]{dufVar}) : dufVar.f26986a;
    }

    private String a(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("15c87a18", new Object[]{this, jSONObject});
        }
        if (jSONObject != null && (jSONObject2 = jSONObject.getJSONObject("feature")) != null) {
            return jSONObject2.getString("needRemoveCartIds");
        }
        return null;
    }

    @Override // tb.ayl
    public aqq a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (aqq) ipChange.ipc$dispatch("f0272fd", new Object[]{this}) : this.c;
    }

    @Override // tb.ark
    public void onDataChanged(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, aqs aqsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21929b2a", new Object[]{this, aURAFlowData, aURAGlobalData, aqsVar});
        } else {
            this.f26986a = aURAGlobalData;
        }
    }

    @Override // tb.arl
    public void onCreate(q qVar, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b74b967f", new Object[]{this, qVar, fVar});
        } else {
            this.b = qVar;
        }
    }
}
