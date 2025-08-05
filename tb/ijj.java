package tb;

import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.log.RSoLog;

/* loaded from: classes.dex */
public class ijj implements ijk {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final RSoLog.a c = RSoLog.e("dev-puller");

    /* renamed from: a  reason: collision with root package name */
    private final ijk f29083a;
    private final ijd b;
    private volatile long d = -1;

    public ijj(ijk ijkVar, ijd ijdVar) {
        this.f29083a = ijkVar;
        this.b = ijdVar;
    }

    @Override // tb.ijk
    public ijo a(String str) throws Throwable {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ijo) ipChange.ipc$dispatch("7c70a466", new Object[]{this, str});
        }
        a(str, 0);
        return this.f29083a.a(str);
    }

    @Override // tb.ijk
    public ijo b(String str) throws Throwable {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ijo) ipChange.ipc$dispatch("7d1d5005", new Object[]{this, str});
        }
        a(str, 1);
        c(str);
        return this.f29083a.b(str);
    }

    @Override // tb.ijk
    public void a(String str, ijm ijmVar) throws Throwable {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2db485b6", new Object[]{this, str, ijmVar});
            return;
        }
        a(str, 2);
        this.f29083a.a(str, ijmVar);
    }

    private long a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56c6c5c", new Object[]{this})).longValue();
        }
        if (this.d == -1) {
            this.d = Looper.getMainLooper().getThread().getId();
            RSoLog.a aVar = c;
            aVar.a("lazyGetMainThreadId, id = " + this.d);
        }
        return this.d;
    }

    private void a(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ad11", new Object[]{this, str, new Integer(i)});
            return;
        }
        String b = this.b.b("key_dev_track_call_stack_libs", "");
        if (ikw.a((CharSequence) b)) {
            return;
        }
        if (!b.contains(str + "_" + i)) {
            if (!b.contains(str + "_all")) {
                return;
            }
        }
        Thread a2 = ika.a();
        String a3 = iky.a(a2.getStackTrace());
        RSoLog.a aVar = c;
        aVar.a("trackCallStack_" + str + "," + a2.getName() + "=" + a3);
    }

    private void c(String str) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
            return;
        }
        Thread a2 = ika.a();
        if (a2.getId() != a()) {
            return;
        }
        String b = this.b.b("key_dev_main_sync_monitor_libs", "");
        if (ikw.a((CharSequence) b)) {
            return;
        }
        if (!ikw.b(b, str) && !ikw.b(b, "all")) {
            z = false;
        }
        if (!z) {
            return;
        }
        ikq.a("trackMainThreadCall_" + str, a2.getName() + "=" + (this.b.a("key_dev_main_sync_stacktrace_enabled", false) ? iky.a(a2.getStackTrace()) : "release_skipped"));
    }
}
