package tb;

import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.f;
import com.alibaba.android.aura.q;
import com.alibaba.android.umf.datamodel.protocol.ultron.Global;
import com.alibaba.android.umf.datamodel.protocol.ultron.UltronProtocol;
import com.alibaba.android.umf.node.service.parse.state.tree.MultiTreeNode;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.security.wukong.bx.CcrcBHService;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.buy.toggle.a;
import java.util.HashMap;

@AURAExtensionImpl(code = "alibuy.impl.parse.stateTree.ccrc")
/* loaded from: classes4.dex */
public final class hip extends aso {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private CcrcBHService e;

    static {
        kge.a(-1988854406);
    }

    public static /* synthetic */ Object ipc$super(hip hipVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.aso, tb.ark
    public void onDataChanged(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, aqs aqsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21929b2a", new Object[]{this, aURAFlowData, aURAGlobalData, aqsVar});
        }
    }

    @Override // tb.aso, tb.arl
    public void onCreate(q qVar, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b74b967f", new Object[]{this, qVar, fVar});
        } else if (!a.f()) {
        } else {
            this.e = CcrcBHService.getBHService("ccrc_taobao_swindle_risk");
            this.e.activate();
        }
    }

    @Override // tb.aso, tb.asq
    public void b(MultiTreeNode multiTreeNode, UltronProtocol ultronProtocol) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45d9383e", new Object[]{this, multiTreeNode, ultronProtocol});
            return;
        }
        try {
            a(ultronProtocol);
        } catch (Throwable th) {
            arc.a().b(th.toString());
        }
    }

    private void a(UltronProtocol ultronProtocol) {
        JSONObject detect;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4252155", new Object[]{this, ultronProtocol});
            return;
        }
        Global global = ultronProtocol.getGlobal();
        if (global == null || (detect = global.getDetect()) == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        for (String str : detect.keySet()) {
            hashMap.put(str, detect.getString(str));
        }
        CcrcBHService ccrcBHService = this.e;
        if (ccrcBHService == null) {
            return;
        }
        ccrcBHService.detect(hashMap);
    }

    @Override // tb.aso, tb.arl
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        CcrcBHService ccrcBHService = this.e;
        if (ccrcBHService == null) {
            return;
        }
        ccrcBHService.deActivate();
    }
}
