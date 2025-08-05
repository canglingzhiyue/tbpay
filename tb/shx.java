package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.data.datamodel.a;

/* loaded from: classes5.dex */
public class shx implements shv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static int f33591a;
    private final FluidContext c;
    private final String b = "SessionManager";
    private final shw d = new shw();

    static {
        kge.a(1286273038);
        kge.a(-1318468599);
        f33591a = 0;
    }

    public shx(FluidContext fluidContext) {
        this.c = fluidContext;
    }

    @Override // tb.shv
    public shw getSessionIdRecorder() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (shw) ipChange.ipc$dispatch("d727084", new Object[]{this}) : this.d;
    }

    @Override // tb.shv
    public void incrementSessionId(a aVar, boolean z) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df1778f1", new Object[]{this, aVar, new Boolean(z)});
            return;
        }
        a.c a2 = aVar.a();
        if (a2.c != null) {
            this.d.c(a2.c);
        }
        if (z) {
            i = f33591a;
            f33591a = i + 1;
        } else {
            i = f33591a;
        }
        a2.c = String.valueOf(i);
        spz.c("SessionManager", "incrementSessionId: " + a2.c);
        this.d.a(a2.c, aVar);
    }
}
