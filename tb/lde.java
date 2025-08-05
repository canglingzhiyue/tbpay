package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.core.engine.env.protocol.e;

/* loaded from: classes.dex */
public class lde {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static e f30493a;

    static {
        kge.a(1666099204);
    }

    public static void a(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9a8ffea", new Object[]{eVar});
        } else {
            f30493a = eVar;
        }
    }
}
