package tb;

import com.alibaba.appmonitor.event.e;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ScheduledFuture;

/* loaded from: classes.dex */
public class bsy implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f26117a;
    private static bsy b;
    private static ScheduledFuture c;

    static {
        kge.a(2123225977);
        kge.a(-1390502639);
        f26117a = false;
    }

    private bsy() {
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else if (f26117a) {
        } else {
            apr.b("CleanTask", "init TimeoutEventManager");
            b = new bsy();
            c = aqe.a().b(c, b, 300000L);
            f26117a = true;
        }
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
            return;
        }
        ScheduledFuture scheduledFuture = c;
        if (scheduledFuture != null && !scheduledFuture.isDone()) {
            c.cancel(true);
        }
        f26117a = false;
        b = null;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        apr.b("CleanTask", "clean TimeoutEvent");
        e.a().b();
    }
}
