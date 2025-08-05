package tb;

import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.f;
import com.alibaba.android.aura.q;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXEngineConfig;
import com.taobao.android.dinamicx.bd;

@AURAExtensionImpl(code = "aura.impl.lifecycle.dxEngine.config.autoTrack")
/* loaded from: classes2.dex */
public final class awe implements avp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-255489744);
        kge.a(-1918346948);
    }

    @Override // tb.avp
    public DXEngineConfig a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXEngineConfig) ipChange.ipc$dispatch("3edbcd12", new Object[]{this});
        }
        return null;
    }

    @Override // tb.arl
    public void onCreate(q qVar, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b74b967f", new Object[]{this, qVar, fVar});
        }
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

    @Override // tb.avp
    public void a(bd bdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("156633a2", new Object[]{this, bdVar});
        } else {
            bdVar.a(awf.DX_EVENT_AURA_EXPOSURE, new awf());
        }
    }
}
