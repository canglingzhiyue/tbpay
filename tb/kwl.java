package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;

/* loaded from: classes.dex */
public class kwl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(907342898);
    }

    public static void a(DinamicXEngine dinamicXEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37589d99", new Object[]{dinamicXEngine});
            return;
        }
        lcf a2 = lby.a("guess").a();
        kwm.a(dinamicXEngine, a2.a());
        kwm.b(dinamicXEngine, a2.b());
        kwm.c(dinamicXEngine, a2.c());
        kwm.d(dinamicXEngine, a2.d());
    }
}
