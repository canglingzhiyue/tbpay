package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* loaded from: classes9.dex */
public class rtz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static volatile ScheduledThreadPoolExecutor f33381a;
    public static volatile ScheduledThreadPoolExecutor b;
    public static volatile ScheduledThreadPoolExecutor c;

    static {
        kge.a(528536394);
    }

    public static ScheduledThreadPoolExecutor a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScheduledThreadPoolExecutor) ipChange.ipc$dispatch("f6ff4fcf", new Object[0]);
        }
        if (c == null) {
            c = kao.a(1, "alive-main");
        }
        return c;
    }

    public static ScheduledThreadPoolExecutor b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScheduledThreadPoolExecutor) ipChange.ipc$dispatch("111ace6e", new Object[0]);
        }
        if (f33381a == null) {
            f33381a = kao.a(3, "alive-schedule");
        }
        return f33381a;
    }
}
