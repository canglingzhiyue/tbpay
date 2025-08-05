package tb;

import android.os.SystemClock;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes2.dex */
public class aex {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1103456674);
    }

    public static long a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a8219750", new Object[]{new Long(j)})).longValue();
        }
        if (j <= 0) {
            return 0L;
        }
        return (SystemClock.uptimeMillis() - System.currentTimeMillis()) + j;
    }
}
