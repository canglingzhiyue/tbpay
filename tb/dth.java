package tb;

import com.alibaba.android.aura.AURAAliBuyCorePluginCenter;
import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.IAURAInputField;
import com.alibaba.android.aura.IAURAPluginCenter;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.f;
import com.alibaba.android.aura.q;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@AURAExtensionImpl(code = "alibuy.impl.popupWindow.ext")
/* loaded from: classes4.dex */
public final class dth implements azr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private q f26961a;

    static {
        kge.a(-1031218522);
        kge.a(-901122665);
    }

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
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this});
        }
        return null;
    }

    @Override // tb.azr
    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("43881515", new Object[]{this});
        }
        return null;
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

    @Override // tb.azr
    public q a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (q) ipChange.ipc$dispatch("3c3eac17", new Object[]{this}) : new q(this.f26961a.e(), this.f26961a.a());
    }

    @Override // tb.azr
    public IAURAPluginCenter[] e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IAURAPluginCenter[]) ipChange.ipc$dispatch("2a74b277", new Object[]{this});
        }
        IAURAPluginCenter[] c = ((dsx) this.f26961a.a("aliBuyWorkFlowConfig", dsx.class, new dsx() { // from class: tb.dth.1
        })).c();
        if (c == null || c.length == 0) {
            return new IAURAPluginCenter[]{new AURAAliBuyCorePluginCenter()};
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new AURAAliBuyCorePluginCenter());
        arrayList.addAll(Arrays.asList(c));
        IAURAPluginCenter[] iAURAPluginCenterArr = new IAURAPluginCenter[arrayList.size()];
        arrayList.toArray(iAURAPluginCenterArr);
        return iAURAPluginCenterArr;
    }

    @Override // tb.arl
    public void onCreate(q qVar, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b74b967f", new Object[]{this, qVar, fVar});
        } else {
            this.f26961a = qVar;
        }
    }
}
