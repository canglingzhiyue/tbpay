package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.a;
import com.taobao.android.trade.event.f;
import com.taobao.android.trade.event.j;

/* loaded from: classes5.dex */
public class fim {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-505743257);
    }

    public static void a(a aVar, String str, int i, j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45caf739", new Object[]{aVar, str, new Integer(i), jVar});
            return;
        }
        f.a(aVar).a(i, jVar);
        if (aVar != null) {
            f.a(aVar.getNewDetailContext()).a(i, jVar);
        }
        f.a(str).a(i, jVar);
    }

    public static void b(a aVar, String str, int i, j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8931667a", new Object[]{aVar, str, new Integer(i), jVar});
            return;
        }
        f.a(aVar).b(i, jVar);
        if (aVar != null) {
            f.a(aVar.getNewDetailContext()).b(i, jVar);
        }
        f.a(str).a(i);
    }

    public static void a(a aVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7917d8c2", new Object[]{aVar, str});
            return;
        }
        f.a(aVar).c();
        if (aVar != null) {
            f.a(aVar.getNewDetailContext()).c();
        }
        f.a(str).c();
    }
}
