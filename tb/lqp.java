package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import tb.lqq;
import tb.lqt;

/* loaded from: classes.dex */
public class lqp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1650203409);
    }

    public static void a(DinamicXEngine dinamicXEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37589d99", new Object[]{dinamicXEngine});
            return;
        }
        kyw.a(dinamicXEngine);
        b(dinamicXEngine);
        c(dinamicXEngine);
        d(dinamicXEngine);
    }

    private static void b(DinamicXEngine dinamicXEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36e2379a", new Object[]{dinamicXEngine});
            return;
        }
        dinamicXEngine.a(lqs.DX_EVENT_ICONHORIZONTALSCROLL, new ley(new lqs()));
        dinamicXEngine.a(lqr.DX_EVENT_GATEWAYREQUEST, new ley(new lqr()));
    }

    private static void c(DinamicXEngine dinamicXEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("366bd19b", new Object[]{dinamicXEngine});
        } else {
            dinamicXEngine.a(lqu.DX_PARSER_FETCHICONLINE, new lfo(new lqu()));
        }
    }

    private static void d(DinamicXEngine dinamicXEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35f56b9c", new Object[]{dinamicXEngine});
            return;
        }
        dinamicXEngine.a(lqt.DELETEHOSTCARD, new lqt.a());
        dinamicXEngine.a(3196545303523394880L, new lqq.a());
    }
}
