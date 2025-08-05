package tb;

import android.os.Handler;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Method;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes4.dex */
public class ieb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final ExecutorService f28958a;
    public static final ExecutorService b;
    public static final Handler c;
    public static final ScheduledExecutorService d;

    static {
        ExecutorService executorService;
        ExecutorService executorService2;
        ScheduledExecutorService scheduledExecutorService;
        ConcurrentHashMap<String, Method> concurrentHashMap = iea.f28957a;
        try {
            executorService = (ExecutorService) iea.f28957a.get("makeComputeExecutorService").invoke(null, 4, 4, 120, "FBPreThrd");
        } catch (Throwable th) {
            cun.a(th);
            executorService = null;
        }
        f28958a = executorService;
        try {
            iea.f28957a.get("makeNormalExecutorService").invoke(null, 4, 1024, 120, "FBNmThrd");
        } catch (Throwable th2) {
            cun.a(th2);
        }
        try {
            executorService2 = (ExecutorService) iea.f28957a.get("makeIOExecutorService").invoke(null, 4, 1024, 120, "FBIoThrd");
        } catch (Throwable th3) {
            cun.a(th3);
            executorService2 = null;
        }
        b = executorService2;
        c = new Handler(Looper.getMainLooper());
        try {
            scheduledExecutorService = (ScheduledExecutorService) iea.f28957a.get("makeScheduledExecutorService").invoke(null, 1, "FbLowThrd");
        } catch (Throwable th4) {
            cun.a(th4);
            scheduledExecutorService = null;
        }
        d = scheduledExecutorService;
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
        } else {
            cun.a("must NOT called on main thread");
        }
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : Thread.currentThread() == Looper.getMainLooper().getThread();
    }
}
