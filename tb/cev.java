package tb;

import com.alibaba.ut.abtest.UTABMethod;
import com.alibaba.ut.abtest.event.a;
import com.alibaba.ut.abtest.event.b;
import com.alibaba.ut.abtest.event.e;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class cev implements b<e> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(810556371);
        kge.a(1000651436);
    }

    @Override // com.alibaba.ut.abtest.event.b
    public void onEvent(a<e> aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f15b7a0", new Object[]{this, aVar});
            return;
        }
        cex.a().i().a(true, "user");
        if (cex.a().f() != UTABMethod.Push) {
            return;
        }
        cex.a().m().a(true, "user");
    }
}
