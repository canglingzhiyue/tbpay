package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.infoflow.core.engine.env.protocol.n;

/* loaded from: classes7.dex */
public class ssn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static n f33888a;

    static {
        kge.a(619400136);
    }

    public static void a(n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9ad1741", new Object[]{nVar});
        } else {
            f33888a = nVar;
        }
    }

    public static void a(DinamicXEngine dinamicXEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37589d99", new Object[]{dinamicXEngine});
            return;
        }
        n nVar = f33888a;
        if (nVar == null) {
            return;
        }
        nVar.a(dinamicXEngine);
    }

    public static void b(DinamicXEngine dinamicXEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36e2379a", new Object[]{dinamicXEngine});
            return;
        }
        n nVar = f33888a;
        if (nVar == null) {
            return;
        }
        nVar.b(dinamicXEngine);
    }
}
