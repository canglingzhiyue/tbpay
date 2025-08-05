package tb;

import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.nextrpc.AURANextRPCEndpoint;
import com.alibaba.android.aura.f;
import com.alibaba.android.aura.q;
import com.android.alibaba.ip.runtime.IpChange;

@AURAExtensionImpl(code = "alibuy.impl.linkage.adjust.config")
/* loaded from: classes4.dex */
public final class dtx implements ayv {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String USERDATA_KEY_REQUEST_ADJUST = "userdata.request.adjust";

    /* renamed from: a  reason: collision with root package name */
    private q f26980a;

    static {
        kge.a(-1753258201);
        kge.a(-803216099);
    }

    @Override // tb.ayv
    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : duk.KEY_SERVICE_NAME;
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

    @Override // tb.ayv
    public AURANextRPCEndpoint a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AURANextRPCEndpoint) ipChange.ipc$dispatch("3f200d1", new Object[]{this}) : (AURANextRPCEndpoint) this.f26980a.a(USERDATA_KEY_REQUEST_ADJUST, AURANextRPCEndpoint.class);
    }

    @Override // tb.arl
    public void onCreate(q qVar, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b74b967f", new Object[]{this, qVar, fVar});
        } else {
            this.f26980a = qVar;
        }
    }
}
