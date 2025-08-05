package tb;

import android.os.SystemClock;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes5.dex */
public class fkb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-351629112);
    }

    public static long a(long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a8219750", new Object[]{new Long(j)})).longValue() : j > 0 ? j - (System.currentTimeMillis() - SystemClock.uptimeMillis()) : j;
    }
}
