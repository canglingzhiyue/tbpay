package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import tb.aks;

/* loaded from: classes6.dex */
public class jkt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes6.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final jkt f29615a;

        static {
            kge.a(1159839566);
            f29615a = new jkt();
        }

        public static /* synthetic */ jkt a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (jkt) ipChange.ipc$dispatch("f06742b", new Object[0]) : f29615a;
        }
    }

    static {
        kge.a(658795643);
    }

    public static jkt a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jkt) ipChange.ipc$dispatch("f06742b", new Object[0]) : a.a();
    }

    private jkt() {
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        String a2 = jmh.a(jmg.TS_MEMORY_THRESHOLD, "");
        if (TextUtils.isEmpty(a2)) {
            jkq.a("TS.TScheduleMonitor", "isTaskCanPerform[true] >> tsMemoryThreshold is empty");
            return true;
        }
        long c = c();
        if (c > Long.parseLong(a2)) {
            jkq.a("TS.TScheduleMonitor", "isTaskCanPerform[true] >> available memory is " + c + ", tsMemoryThreshold is " + a2);
            return true;
        }
        jkq.a("TS.TScheduleMonitor", "isTaskCanPerform[false] >> available memory is " + c + ", tsMemoryThreshold is " + a2);
        return false;
    }

    private long c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5889b5e", new Object[]{this})).longValue();
        }
        aks.c f = aks.a().f();
        return f.c - f.d;
    }
}
