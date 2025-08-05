package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.virtual_thread.VThread;

/* loaded from: classes6.dex */
public class sde implements jrc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final jrj f33490a;
    private final jqp b;

    static {
        kge.a(-1678013254);
        kge.a(1352893937);
    }

    public sde(jrj jrjVar, jqp jqpVar) {
        this.f33490a = jrjVar;
        this.b = jqpVar;
    }

    @Override // tb.jrc
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        boolean a2 = this.f33490a.a("useThreadLocal", this.b.a());
        VThread.sSupportThreadLocal = a2;
        jrk.b("ThreadLocalTask", Boolean.valueOf(a2));
    }
}
