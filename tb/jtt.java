package tb;

import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.IAURAInputField;
import com.alibaba.android.aura.IAURAPluginCenter;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.q;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.waitpay.f;
import java.util.List;

@AURAExtensionImpl(code = "tbwaitpay.impl.popupWindow.ext")
/* loaded from: classes6.dex */
public final class jtt implements azr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ boolean f29766a;
    private q b;

    @Override // tb.azr
    public List<IAURAInputField> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("4a17df3e", new Object[]{this});
        }
        return null;
    }

    @Override // tb.azr
    public String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : "aura/aura_waitpay_detail_float_config.json";
    }

    @Override // tb.azr
    public String d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[]{this}) : "aura.workflow.float";
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
        kge.a(-1493404814);
        kge.a(-901122665);
        f29766a = !jtt.class.desiredAssertionStatus();
    }

    @Override // tb.azr
    public q a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (q) ipChange.ipc$dispatch("3c3eac17", new Object[]{this}) : new q(this.b.e(), this.b.a());
    }

    @Override // tb.azr
    public IAURAPluginCenter[] e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IAURAPluginCenter[]) ipChange.ipc$dispatch("2a74b277", new Object[]{this});
        }
        f fVar = (f) this.b.a("userContextPageAuraConfig", f.class, null);
        if (!f29766a && fVar == null) {
            throw new AssertionError();
        }
        IAURAPluginCenter[] d = fVar.d();
        if (!f29766a && d == null) {
            throw new AssertionError();
        }
        return d;
    }

    @Override // tb.arl
    public void onCreate(q qVar, com.alibaba.android.aura.f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b74b967f", new Object[]{this, qVar, fVar});
        } else {
            this.b = qVar;
        }
    }
}
