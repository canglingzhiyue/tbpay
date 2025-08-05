package tb;

import com.alibaba.android.aura.datamodel.parse.AURAParseIO;
import com.alibaba.android.aura.s;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes2.dex */
public class avj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1416557591);
    }

    @Deprecated
    public static void a(s sVar, AURAParseIO aURAParseIO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccc95ff", new Object[]{sVar, aURAParseIO});
        } else if (sVar == null || aURAParseIO == null) {
            arc.a().c("AURAEventDispatcher", "dispatch", "dispatch update workflow error");
        } else {
            sVar.a("aura.workflow.update", aURAParseIO, null);
        }
    }
}
