package tb;

import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.linkage.UMFLinkageTrigger;
import com.alibaba.android.aura.nodemodel.branch.c;
import com.alibaba.android.umf.datamodel.protocol.ultron.UltronProtocol;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

@AURAExtensionImpl(code = "aura.impl.protocolCropper.ultron.submit")
/* loaded from: classes2.dex */
public final class azt extends ayu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(479207033);
    }

    public static /* synthetic */ Object ipc$super(azt aztVar, String str, Object... objArr) throws InstantReloadException {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.ayu
    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        b(jSONObject);
        azu.a((UltronProtocol) c().get(ayj.GLOBAL_DATA_PROTOCOL, UltronProtocol.class), jSONObject);
    }

    private void b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b99827", new Object[]{this, jSONObject});
            return;
        }
        UMFLinkageTrigger d = d();
        if (d == null) {
            return;
        }
        if (!jSONObject.containsKey("operator")) {
            jSONObject.put("operator", (Object) d.getTriggerComponentKey());
        }
        if (jSONObject.containsKey("operatorEvent")) {
            return;
        }
        jSONObject.put("operatorEvent", (Object) d.getEventKey());
    }

    private UMFLinkageTrigger d() {
        AURAFlowData b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UMFLinkageTrigger) ipChange.ipc$dispatch("882e31fe", new Object[]{this});
        }
        if (!a().b().a(new c(ayk.BRANCH_CODE_ENABLE_SUBMIT_UPLOAD_TRIGGER, true, "default")) || (b = b()) == null) {
            return null;
        }
        return (UMFLinkageTrigger) b.get(ays.FLOW_DATA_KEY_LINKAGE_TRIGGER, UMFLinkageTrigger.class);
    }
}
