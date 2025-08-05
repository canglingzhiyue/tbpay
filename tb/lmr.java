package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;

/* loaded from: classes.dex */
public class lmr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1667322990);
    }

    public static void a(DinamicXEngine dinamicXEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37589d99", new Object[]{dinamicXEngine});
            return;
        }
        lcf a2 = lby.a("guess").a();
        lms.a(dinamicXEngine, a2.a());
        lms.b(dinamicXEngine, a2.b());
        lms.c(dinamicXEngine, a2.c());
        lms.d(dinamicXEngine, a2.d());
    }
}
