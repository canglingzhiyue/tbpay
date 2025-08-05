package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.infoflow.core.engine.env.protocol.n;

/* loaded from: classes8.dex */
public class tdz implements n {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1343244038);
        kge.a(825584489);
    }

    @Override // com.taobao.infoflow.core.engine.env.protocol.n
    public void a(DinamicXEngine dinamicXEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37589d99", new Object[]{this, dinamicXEngine});
            return;
        }
        dinamicXEngine.a(rhp.DX_PARSER_MAPTOARRAY, new lfo(new rhp()));
        dinamicXEngine.a(9422011105736515L, new lfo(new rho()));
        dinamicXEngine.a(rhm.DX_PARSER_FESTIVAL, new lfo(new rhm()));
        dinamicXEngine.a(rhq.DX_PARSER_HGETFROMCURRENTMODEL, new lfo(new rhq()));
        dinamicXEngine.a(rhn.DX_PARSER_HGETDATA, new lfo(new rhn()));
    }

    @Override // com.taobao.infoflow.core.engine.env.protocol.n
    public void b(DinamicXEngine dinamicXEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36e2379a", new Object[]{this, dinamicXEngine});
            return;
        }
        dinamicXEngine.a(rhl.DX_EVENT_HSAVEDATA, new ley(new rhl()));
        dinamicXEngine.a(rhk.DX_EVENT_HSETTOCURRENTMODEL, new ley(new rhk()));
    }
}
