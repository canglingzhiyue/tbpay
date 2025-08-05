package tb;

import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.b;
import com.alibaba.android.aura.datamodel.c;
import com.alibaba.android.aura.datamodel.parse.AURAParseIO;
import com.alibaba.android.aura.f;
import com.alibaba.android.aura.q;
import com.android.alibaba.ip.runtime.IpChange;

@AURAExtensionImpl(code = "tbwaitpay.impl.event.submit.business.default")
/* loaded from: classes6.dex */
public final class jtr implements ayl {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String USER_CONTEXT_KEY_SUBMIT_CALLBACK = "submit_callback";
    public static final String USER_CONTEXT_KEY_SUBMIT_RPC_PARAMS = "submit_rpc_params";

    /* renamed from: a  reason: collision with root package name */
    private q f29763a;
    private final aqq<AURAParseIO> b = new aqq<AURAParseIO>() { // from class: tb.jtr.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.aqq, tb.aqs
        public void a(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2c671180", new Object[]{this, bVar});
            }
        }

        @Override // tb.aqq
        public void a(c<AURAParseIO> cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6b8a7af", new Object[]{this, cVar});
            } else if (cVar == null) {
            } else {
                AURAParseIO b = cVar.b();
                if (!(b instanceof AURAParseIO)) {
                    return;
                }
                AURAParseIO aURAParseIO = b;
                if (aURAParseIO.getData().isEmpty() || aURAParseIO.getData().get(0) == null || jtr.a(jtr.this) == null) {
                    return;
                }
                dux.a(jtr.a(jtr.this).e());
                dug dugVar = (dug) jtr.a(jtr.this).a("submit_callback", dug.class);
                if (dugVar == null) {
                    return;
                }
                dugVar.a(aURAParseIO.getData().get(0).a());
            }
        }
    };

    static {
        kge.a(-1504468848);
        kge.a(504819653);
    }

    @Override // tb.ark
    public void onDataChanged(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, aqs aqsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21929b2a", new Object[]{this, aURAFlowData, aURAGlobalData, aqsVar});
        }
    }

    @Override // tb.arl
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        }
    }

    public static /* synthetic */ q a(jtr jtrVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (q) ipChange.ipc$dispatch("7d811a0f", new Object[]{jtrVar}) : jtrVar.f29763a;
    }

    @Override // tb.arl
    public void onCreate(q qVar, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b74b967f", new Object[]{this, qVar, fVar});
        } else {
            this.f29763a = qVar;
        }
    }

    @Override // tb.ayl
    public aqq<AURAParseIO> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (aqq) ipChange.ipc$dispatch("f0272fd", new Object[]{this}) : this.b;
    }
}
