package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import tb.qii;

/* loaded from: classes8.dex */
public class qig {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes8.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final ScheduledExecutorService f32936a = Executors.newSingleThreadScheduledExecutor(new qii.a("ShortcutsThreadPool"));
    }

    /* loaded from: classes8.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public static final ThreadPoolExecutor f32937a = new ThreadPoolExecutor(1, 1, 3, TimeUnit.SECONDS, new LinkedBlockingDeque(), new qii.a("WVCalendarSingleThreadPool"));
    }

    public static ExecutorService a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecutorService) ipChange.ipc$dispatch("13131fb3", new Object[0]);
        }
        b.f32937a.allowCoreThreadTimeOut(true);
        return b.f32937a;
    }

    public static ScheduledExecutorService b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ScheduledExecutorService) ipChange.ipc$dispatch("bdd68a4d", new Object[0]) : a.f32936a;
    }
}
