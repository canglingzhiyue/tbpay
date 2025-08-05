package tb;

import android.os.Handler;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public class ayq {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "address.ThreadUtils";

    /* renamed from: a  reason: collision with root package name */
    private static final Handler f25700a = new Handler(Looper.getMainLooper());
    private static final ScheduledExecutorService b = new ScheduledThreadPoolExecutor(4, new xmb("AddressDelayThread"));
    private static final ExecutorService c = Executors.newCachedThreadPool(new xmb("AddressThread"));

    public static ExecutorService a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ExecutorService) ipChange.ipc$dispatch("13131fb3", new Object[0]) : c;
    }

    public static void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39112e6", new Object[]{runnable});
        } else {
            c.execute(runnable);
        }
    }

    public static void a(Runnable runnable, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e91c09e", new Object[]{runnable, new Long(j)});
        } else {
            b.schedule(runnable, j, TimeUnit.MILLISECONDS);
        }
    }
}
