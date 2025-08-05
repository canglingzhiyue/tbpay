package tb;

import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.nextrpc.AURANextRPCEndpoint;
import com.alibaba.android.aura.f;
import com.alibaba.android.aura.q;
import com.android.alibaba.ip.runtime.IpChange;

@AURAExtensionImpl(code = "tbwaitpay.impl.submit.linkage.config")
/* loaded from: classes6.dex */
public final class jts implements ayw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ boolean f29765a;
    private q b;

    @Override // tb.ayw
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : duk.KEY_SERVICE_NAME;
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

    static {
        kge.a(-466961269);
        kge.a(-248416156);
        f29765a = !jts.class.desiredAssertionStatus();
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

    @Override // tb.ayw
    public AURANextRPCEndpoint b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURANextRPCEndpoint) ipChange.ipc$dispatch("a05ffd30", new Object[]{this});
        }
        com.taobao.android.waitpay.f fVar = (com.taobao.android.waitpay.f) this.b.a("userContextPageAuraConfig", com.taobao.android.waitpay.f.class, null);
        if (!f29765a && fVar == null) {
            throw new AssertionError();
        }
        return fVar.c();
    }
}
