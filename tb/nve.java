package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.log.RSoLog;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes6.dex */
public class nve {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f31781a;
    private final AtomicInteger b;
    private final iiv<a, Void> c;
    private final long d;

    /* loaded from: classes6.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f31784a;
        public final Runnable b;

        public a(int i, Runnable runnable) {
            this.f31784a = i;
            this.b = runnable;
        }
    }

    public static /* synthetic */ AtomicInteger a(nve nveVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicInteger) ipChange.ipc$dispatch("ceabf345", new Object[]{nveVar}) : nveVar.b;
    }

    public static /* synthetic */ String b(nve nveVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("888df784", new Object[]{nveVar}) : nveVar.f31781a;
    }

    public static /* synthetic */ iiv c(nve nveVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (iiv) ipChange.ipc$dispatch("90b71033", new Object[]{nveVar}) : nveVar.c;
    }

    public static /* synthetic */ long d(nve nveVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c280d592", new Object[]{nveVar})).longValue() : nveVar.d;
    }

    public nve(String str, int i, long j, iiv<a, Void> iivVar) {
        this.f31781a = str;
        this.b = new AtomicInteger(i);
        this.c = iivVar;
        this.d = j;
    }

    public void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
        } else {
            ika.a(new Runnable() { // from class: tb.nve.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    int decrementAndGet = nve.a(nve.this).decrementAndGet();
                    if (decrementAndGet <= 0) {
                        RSoLog.c(nve.b(nve.this) + " retryable, finish, count <= 0");
                        return;
                    }
                    RSoLog.c(nve.b(nve.this) + " retryable, call consumer enter, count = " + decrementAndGet);
                    nve.c(nve.this).a(new a(nve.a(nve.this).get(), new Runnable() { // from class: tb.nve.1.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                nve.a(nve.this).set(0);
                            }
                        }
                    }));
                    nve nveVar = nve.this;
                    nveVar.a(nve.d(nveVar));
                }
            }, j);
        }
    }
}
