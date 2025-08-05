package tb;

import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.umf.datamodel.protocol.ultron.UltronProtocol;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

@AURAExtensionImpl(code = "aura.impl.protocolCropper.ultron.adjust")
/* loaded from: classes2.dex */
public final class azs extends ayt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1163389872);
    }

    @Override // tb.ayt
    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else {
            azu.a((UltronProtocol) c().get(ayj.GLOBAL_DATA_PROTOCOL, UltronProtocol.class), jSONObject);
        }
    }
}
