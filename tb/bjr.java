package tb;

import com.alibaba.android.ultron.engine.protocol.Container;
import com.alibaba.android.ultron.engine.protocol.Data;
import com.alibaba.android.ultron.engine.protocol.EndPoint;
import com.alibaba.android.ultron.engine.protocol.Global;
import com.alibaba.android.ultron.engine.protocol.Hierarchy;
import com.alibaba.android.ultron.engine.protocol.Linkage;
import com.alibaba.android.ultron.engine.protocol.UltronProtocol;
import com.alibaba.android.ultron.engine.template.b;
import com.alibaba.android.ultron.engine.utils.e;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;
import com.taobao.android.ultron.common.utils.UnifyLog;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public class bjr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(35556163);
    }

    public b a(bjs bjsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("e06249f8", new Object[]{this, bjsVar});
        }
        if (!bjsVar.c().isEmpty()) {
            Iterator<Map.Entry<String, bjg>> it = bjsVar.c().entrySet().iterator();
            while (it.hasNext()) {
                UnifyLog.c("ProtocolRenderState", "renderDeltaProtocol: " + it.next().getValue().toString());
            }
        }
        bjp bjpVar = new bjp(bjsVar);
        EndPoint a2 = bjl.a();
        Hierarchy a3 = bjn.a(bjpVar);
        Data a4 = bjk.a(bjpVar);
        Container a5 = bjj.a(bjpVar);
        Global a6 = bjm.a(bjpVar);
        Linkage a7 = bjo.a();
        UltronProtocol ultronProtocol = new UltronProtocol();
        ultronProtocol.container = a5;
        ultronProtocol.hierarchy = a3;
        ultronProtocol.data = a4.components;
        ultronProtocol.global = a6;
        ultronProtocol.endpoint = a2;
        ultronProtocol.linkage = a7;
        final b a8 = b.a((JSONObject) JSON.toJSON(ultronProtocol));
        Coordinator.postTask(new Coordinator.TaggedRunnable("ultron_printInfo") { // from class: tb.bjr.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    UnifyLog.c(e.a(a8.c), new String[0]);
                }
            }
        });
        return a8;
    }
}
