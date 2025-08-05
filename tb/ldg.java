package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.core.engine.env.protocol.f;
import java.util.Map;

/* loaded from: classes.dex */
public class ldg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static f f30496a;

    static {
        kge.a(1832725836);
    }

    public static void a(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9a97449", new Object[]{fVar});
        } else {
            f30496a = fVar;
        }
    }

    public static void a(String str, String str2, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84162689", new Object[]{str, str2, map});
            return;
        }
        f fVar = f30496a;
        if (fVar == null) {
            ldf.b("InfoFlowMessiah", "commitLog gMessiah == null");
            return;
        }
        try {
            fVar.a(str, str2, map);
        } catch (Throwable th) {
            ldf.a("InfoFlowMessiah", "commitLog error", th);
        }
    }

    public static void b(String str, String str2, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("854c7968", new Object[]{str, str2, map});
            return;
        }
        f fVar = f30496a;
        if (fVar == null) {
            ldf.b("InfoFlowMessiah", "commitMonitor gMessiah == null");
            return;
        }
        try {
            fVar.b(str, str2, map);
        } catch (Throwable th) {
            ldf.a("InfoFlowMessiah", "commitMonitor error", th);
        }
    }
}
