package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.component.d;
import com.taobao.android.remoteso.component.l;
import com.taobao.android.remoteso.log.RSoLog;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes6.dex */
public class iie implements iiv<l, Void> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Set<d> f29044a;
    private final AtomicBoolean b = new AtomicBoolean(false);

    public static /* synthetic */ Set a(iie iieVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Set) ipChange.ipc$dispatch("39452c22", new Object[]{iieVar}) : iieVar.f29044a;
    }

    public iie(Set<d> set) {
        this.f29044a = set;
    }

    @Override // tb.iiv
    public Void a(final l lVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Void) ipChange.ipc$dispatch("d801ca44", new Object[]{this, lVar});
        }
        if (!this.b.compareAndSet(false, true)) {
            return null;
        }
        RSoLog.c("remo,SilentResultDelegate,consume, trigger,  result = " + lVar + ",  callbacks=" + this.f29044a);
        ikq.a("SilentResultDelegate.consume", new Runnable() { // from class: tb.iie.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                for (d dVar : iie.a(iie.this)) {
                    dVar.a(lVar);
                }
            }
        });
        return null;
    }
}
