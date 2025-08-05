package tb;

import com.airbnb.lottie.o;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.virtual_thread.VirtualExecutors;
import com.taobao.android.virtual_thread.VirtualThread;

/* loaded from: classes6.dex */
public class sdf implements jrc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final jrj f33491a;
    private final jqp b;

    static {
        kge.a(2090972014);
        kge.a(1352893937);
    }

    public sdf(jrj jrjVar, jqp jqpVar) {
        this.f33491a = jrjVar;
        this.b = jqpVar;
    }

    @Override // tb.jrc
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (!this.f33491a.a("useLottieVirtualThread", this.b.a())) {
            jrk.b("MonitorTask", "failed");
        } else {
            o.f1784a = VirtualExecutors.newCachedVirtualThreadPool($$Lambda$sdf$PeWuus06BQNQIS1UFz2c7EYr4.INSTANCE);
            jrk.b("MonitorTask", "succ");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Thread a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Thread) ipChange.ipc$dispatch("b72a5ba1", new Object[]{runnable}) : new VirtualThread(runnable, "lottie");
    }
}
