package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.component.d;
import com.taobao.android.remoteso.component.l;
import com.taobao.android.remoteso.log.RSoLog;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes6.dex */
public class iid implements iiv<l, Void> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Set<d> f29042a;
    private final AtomicBoolean b = new AtomicBoolean(false);

    public static /* synthetic */ Set a(iid iidVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Set) ipChange.ipc$dispatch("74b34a03", new Object[]{iidVar}) : iidVar.f29042a;
    }

    public iid(Set<d> set) {
        this.f29042a = set;
    }

    @Override // tb.iiv
    public Void a(final l lVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Void) ipChange.ipc$dispatch("d801ca44", new Object[]{this, lVar});
        }
        if (lVar.c() != 1001 && lVar.c() != 1003) {
            RSoLog.c("remo,RemoUIResultDelegate, updateResult, skip trigger, result = " + lVar);
            return null;
        }
        if (this.b.compareAndSet(false, true)) {
            RSoLog.c("remo,RemoUIResultDelegate,consume, trigger,  result = " + lVar + ",  callbacks=" + this.f29042a);
            ikq.a("RemoUIResultDelegate.consume", new Runnable() { // from class: tb.iid.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    for (d dVar : iid.a(iid.this)) {
                        dVar.a(lVar);
                    }
                }
            });
        }
        return null;
    }
}
