package tb;

import android.os.SystemClock;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes4.dex */
public class tcp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f34028a;
    public final String b;
    public final String c;
    public final AtomicBoolean d = new AtomicBoolean(true);

    /* loaded from: classes4.dex */
    public interface b {
        void run() throws Exception;
    }

    /* loaded from: classes4.dex */
    public interface c<T> {
        T call();
    }

    static {
        kge.a(-784172786);
    }

    public tcp(String str, String str2, String str3) {
        this.f34028a = str;
        this.b = str2;
        this.c = str3;
    }

    public <T> T a(c<T> cVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("d84ba930", new Object[]{this, cVar, str});
        }
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        T call = cVar.call();
        long elapsedRealtimeNanos2 = SystemClock.elapsedRealtimeNanos();
        if (this.d.compareAndSet(true, false)) {
            tcr.a().a(this.f34028a, this.b, this.c, "true", str, elapsedRealtimeNanos2 - elapsedRealtimeNanos);
        }
        return call;
    }

    public <T> T b(c<T> cVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("c9f54f4f", new Object[]{this, cVar, str});
        }
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        T call = cVar.call();
        tcr.a().a(this.f34028a, this.b, this.c, "false", str, SystemClock.elapsedRealtimeNanos() - elapsedRealtimeNanos);
        return call;
    }

    public void a(b bVar, String str, String str2) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e464e6ad", new Object[]{this, bVar, str, str2});
            return;
        }
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        bVar.run();
        tcr.a().a(this.f34028a, str2, this.c, "false", str, SystemClock.elapsedRealtimeNanos() - elapsedRealtimeNanos);
    }

    public void a(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123b0d2", new Object[]{this, str, new Long(j)});
        } else {
            tcr.a().a(this.f34028a, this.b, "fileSize", "false", str, j);
        }
    }

    public <T> T a(Callable<T> callable, String str, String str2) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("981b2995", new Object[]{this, callable, str, str2});
        }
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        T call = callable.call();
        tcr.a().a(this.f34028a, str2, this.c, "false", str, SystemClock.elapsedRealtimeNanos() - elapsedRealtimeNanos);
        return call;
    }
}
