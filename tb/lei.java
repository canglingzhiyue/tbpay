package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXEngineConfig;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.infoflow.protocol.subservice.base.IConfigService;
import com.taobao.infoflow.protocol.subservice.base.IDxItemRenderService;

/* loaded from: classes.dex */
public class lei {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(728694237);
    }

    public static DinamicXEngine a(ljs ljsVar, DXEngineConfig.a aVar, IDxItemRenderService.a aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DinamicXEngine) ipChange.ipc$dispatch("5c65d817", new Object[]{ljsVar, aVar, aVar2});
        }
        DinamicXEngine a2 = a(ljsVar, aVar);
        lfs.a(a2);
        if (aVar2 != null) {
            ldf.d("Dx3RegisterCenter", "dx3Register");
            aVar2.a(a2);
        }
        ldf.d("Dx3RegisterCenter", "dx3 引擎创建完成");
        return a2;
    }

    private static DinamicXEngine a(ljs ljsVar, DXEngineConfig.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DinamicXEngine) ipChange.ipc$dispatch("7575c8fd", new Object[]{ljsVar, aVar});
        }
        if (aVar == null) {
            aVar = new DXEngineConfig.a(lfq.DINAMIC_MODULE);
        }
        aVar.b(2).a(a(ljsVar));
        aVar.e(qnl.f());
        aVar.d(53).a("guess");
        if (xnh.a()) {
            aVar.j(true);
            aVar.c(xnh.b());
        }
        return new DinamicXEngine(aVar.a());
    }

    private static int a(ljs ljsVar) {
        int intValue;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f2eb53f6", new Object[]{ljsVar})).intValue();
        }
        IConfigService iConfigService = (IConfigService) ljsVar.a(IConfigService.class);
        if (iConfigService == null || (intValue = iConfigService.getIntValue("dinamicXCallbackInterval", 1000)) <= 0 || intValue >= 10000) {
            return 1000;
        }
        return intValue;
    }
}
