package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class gsn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static long a(long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a8219750", new Object[]{new Long(j)})).longValue() : a(j, System.currentTimeMillis());
    }

    public static long a(long j, long j2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5c11cadc", new Object[]{new Long(j), new Long(j2)})).longValue() : TimeUnit.MILLISECONDS.toMillis(j2 - j);
    }
}
